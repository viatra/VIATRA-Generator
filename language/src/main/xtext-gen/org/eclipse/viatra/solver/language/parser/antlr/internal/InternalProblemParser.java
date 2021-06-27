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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_QUOTED_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'problem'", "'.'", "'abstract'", "'class'", "'extends'", "','", "'{'", "';'", "'}'", "'enum'", "'contains'", "'refers'", "'['", "']'", "'opposite'", "'error'", "'pred'", "'('", "')'", "':-'", "'!'", "'+'", "':'", "'scope'", "'+='", "'='", "'..'", "'*'", "'::'", "'true'", "'false'", "'unknown'", "'?'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int RULE_QUOTED_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
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

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalProblem.g:81:4: otherlv_0= 'problem' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_3); 

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

                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getProblemAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalProblem.g:109:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==RULE_QUOTED_ID||(LA2_0>=14 && LA2_0<=15)||LA2_0==21||(LA2_0>=27 && LA2_0<=28)||LA2_0==32||LA2_0==35||(LA2_0>=41 && LA2_0<=42)||LA2_0==44) ) {
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
    // InternalProblem.g:139:1: ruleStatement returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration | this_EnumDeclaration_1= ruleEnumDeclaration | this_PredicateDefinition_2= rulePredicateDefinition | this_Assertion_3= ruleAssertion | this_ScopeDeclaration_4= ruleScopeDeclaration ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDeclaration_0 = null;

        EObject this_EnumDeclaration_1 = null;

        EObject this_PredicateDefinition_2 = null;

        EObject this_Assertion_3 = null;

        EObject this_ScopeDeclaration_4 = null;



        	enterRule();

        try {
            // InternalProblem.g:145:2: ( (this_ClassDeclaration_0= ruleClassDeclaration | this_EnumDeclaration_1= ruleEnumDeclaration | this_PredicateDefinition_2= rulePredicateDefinition | this_Assertion_3= ruleAssertion | this_ScopeDeclaration_4= ruleScopeDeclaration ) )
            // InternalProblem.g:146:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_EnumDeclaration_1= ruleEnumDeclaration | this_PredicateDefinition_2= rulePredicateDefinition | this_Assertion_3= ruleAssertion | this_ScopeDeclaration_4= ruleScopeDeclaration )
            {
            // InternalProblem.g:146:2: (this_ClassDeclaration_0= ruleClassDeclaration | this_EnumDeclaration_1= ruleEnumDeclaration | this_PredicateDefinition_2= rulePredicateDefinition | this_Assertion_3= ruleAssertion | this_ScopeDeclaration_4= ruleScopeDeclaration )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 27:
            case 28:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
            case RULE_QUOTED_ID:
            case 32:
            case 41:
            case 42:
            case 44:
                {
                alt3=4;
                }
                break;
            case 35:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

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
                    // InternalProblem.g:183:3: this_ScopeDeclaration_4= ruleScopeDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getScopeDeclarationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScopeDeclaration_4=ruleScopeDeclaration();

                    state._fsp--;


                    			current = this_ScopeDeclaration_4;
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
    // InternalProblem.g:195:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalProblem.g:195:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalProblem.g:196:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
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
    // InternalProblem.g:202:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' ) ) ;
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
            // InternalProblem.g:208:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' ) ) )
            // InternalProblem.g:209:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' ) )
            {
            // InternalProblem.g:209:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' ) )
            // InternalProblem.g:210:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' )
            {
            // InternalProblem.g:210:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProblem.g:211:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalProblem.g:211:4: (lv_abstract_0_0= 'abstract' )
                    // InternalProblem.g:212:5: lv_abstract_0_0= 'abstract'
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
            		
            // InternalProblem.g:228:3: ( (lv_name_2_0= ruleIdentifier ) )
            // InternalProblem.g:229:4: (lv_name_2_0= ruleIdentifier )
            {
            // InternalProblem.g:229:4: (lv_name_2_0= ruleIdentifier )
            // InternalProblem.g:230:5: lv_name_2_0= ruleIdentifier
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

            // InternalProblem.g:247:3: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProblem.g:248:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getExtendsKeyword_3_0());
                    			
                    // InternalProblem.g:252:4: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:253:5: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:253:5: ( ruleQualifiedName )
                    // InternalProblem.g:254:6: ruleQualifiedName
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

                    // InternalProblem.g:268:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalProblem.g:269:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProblem.g:273:5: ( ( ruleQualifiedName ) )
                    	    // InternalProblem.g:274:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalProblem.g:274:6: ( ruleQualifiedName )
                    	    // InternalProblem.g:275:7: ruleQualifiedName
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

            // InternalProblem.g:291:3: ( (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) | otherlv_11= '.' )
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
                    // InternalProblem.g:292:4: (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' )
                    {
                    // InternalProblem.g:292:4: (otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}' )
                    // InternalProblem.g:293:5: otherlv_7= '{' ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_10); 

                    					newLeafNode(otherlv_7, grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_4_0_0());
                    				
                    // InternalProblem.g:297:5: ( ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )? )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID||LA8_0==RULE_QUOTED_ID||(LA8_0>=22 && LA8_0<=23)||(LA8_0>=41 && LA8_0<=42)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalProblem.g:298:6: ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) ) (otherlv_9= ';' )?
                    	    {
                    	    // InternalProblem.g:298:6: ( (lv_referenceDeclarations_8_0= ruleReferenceDeclaration ) )
                    	    // InternalProblem.g:299:7: (lv_referenceDeclarations_8_0= ruleReferenceDeclaration )
                    	    {
                    	    // InternalProblem.g:299:7: (lv_referenceDeclarations_8_0= ruleReferenceDeclaration )
                    	    // InternalProblem.g:300:8: lv_referenceDeclarations_8_0= ruleReferenceDeclaration
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

                    	    // InternalProblem.g:317:6: (otherlv_9= ';' )?
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==19) ) {
                    	        alt7=1;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // InternalProblem.g:318:7: otherlv_9= ';'
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
                    // InternalProblem.g:330:4: otherlv_11= '.'
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


    // $ANTLR start "entryRuleEnumDeclaration"
    // InternalProblem.g:339:1: entryRuleEnumDeclaration returns [EObject current=null] : iv_ruleEnumDeclaration= ruleEnumDeclaration EOF ;
    public final EObject entryRuleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDeclaration = null;


        try {
            // InternalProblem.g:339:56: (iv_ruleEnumDeclaration= ruleEnumDeclaration EOF )
            // InternalProblem.g:340:2: iv_ruleEnumDeclaration= ruleEnumDeclaration EOF
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
    // InternalProblem.g:346:1: ruleEnumDeclaration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= ruleIdentifier ) ) ( (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' ) | otherlv_9= '.' ) ) ;
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
            // InternalProblem.g:352:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= ruleIdentifier ) ) ( (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' ) | otherlv_9= '.' ) ) )
            // InternalProblem.g:353:2: (otherlv_0= 'enum' ( (lv_name_1_0= ruleIdentifier ) ) ( (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' ) | otherlv_9= '.' ) )
            {
            // InternalProblem.g:353:2: (otherlv_0= 'enum' ( (lv_name_1_0= ruleIdentifier ) ) ( (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' ) | otherlv_9= '.' ) )
            // InternalProblem.g:354:3: otherlv_0= 'enum' ( (lv_name_1_0= ruleIdentifier ) ) ( (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' ) | otherlv_9= '.' )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumDeclarationAccess().getEnumKeyword_0());
            		
            // InternalProblem.g:358:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalProblem.g:359:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalProblem.g:359:4: (lv_name_1_0= ruleIdentifier )
            // InternalProblem.g:360:5: lv_name_1_0= ruleIdentifier
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

            // InternalProblem.g:377:3: ( (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' ) | otherlv_9= '.' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            else if ( (LA13_0==13) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalProblem.g:378:4: (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' )
                    {
                    // InternalProblem.g:378:4: (otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' )
                    // InternalProblem.g:379:5: otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_13); 

                    					newLeafNode(otherlv_2, grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2_0_0());
                    				
                    // InternalProblem.g:383:5: ( ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID||LA12_0==RULE_QUOTED_ID||(LA12_0>=41 && LA12_0<=42)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalProblem.g:384:6: ( (lv_literals_3_0= ruleEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )* (otherlv_6= ',' | otherlv_7= ';' )?
                            {
                            // InternalProblem.g:384:6: ( (lv_literals_3_0= ruleEnumLiteral ) )
                            // InternalProblem.g:385:7: (lv_literals_3_0= ruleEnumLiteral )
                            {
                            // InternalProblem.g:385:7: (lv_literals_3_0= ruleEnumLiteral )
                            // InternalProblem.g:386:8: lv_literals_3_0= ruleEnumLiteral
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

                            // InternalProblem.g:403:6: (otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==17) ) {
                                    int LA10_1 = input.LA(2);

                                    if ( (LA10_1==RULE_ID||LA10_1==RULE_QUOTED_ID||(LA10_1>=41 && LA10_1<=42)) ) {
                                        alt10=1;
                                    }


                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalProblem.g:404:7: otherlv_4= ',' ( (lv_literals_5_0= ruleEnumLiteral ) )
                            	    {
                            	    otherlv_4=(Token)match(input,17,FOLLOW_8); 

                            	    							newLeafNode(otherlv_4, grammarAccess.getEnumDeclarationAccess().getCommaKeyword_2_0_1_1_0());
                            	    						
                            	    // InternalProblem.g:408:7: ( (lv_literals_5_0= ruleEnumLiteral ) )
                            	    // InternalProblem.g:409:8: (lv_literals_5_0= ruleEnumLiteral )
                            	    {
                            	    // InternalProblem.g:409:8: (lv_literals_5_0= ruleEnumLiteral )
                            	    // InternalProblem.g:410:9: lv_literals_5_0= ruleEnumLiteral
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

                            // InternalProblem.g:428:6: (otherlv_6= ',' | otherlv_7= ';' )?
                            int alt11=3;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==17) ) {
                                alt11=1;
                            }
                            else if ( (LA11_0==19) ) {
                                alt11=2;
                            }
                            switch (alt11) {
                                case 1 :
                                    // InternalProblem.g:429:7: otherlv_6= ','
                                    {
                                    otherlv_6=(Token)match(input,17,FOLLOW_15); 

                                    							newLeafNode(otherlv_6, grammarAccess.getEnumDeclarationAccess().getCommaKeyword_2_0_1_2_0());
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalProblem.g:434:7: otherlv_7= ';'
                                    {
                                    otherlv_7=(Token)match(input,19,FOLLOW_15); 

                                    							newLeafNode(otherlv_7, grammarAccess.getEnumDeclarationAccess().getSemicolonKeyword_2_0_1_2_1());
                                    						

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:446:4: otherlv_9= '.'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_2); 

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
    // InternalProblem.g:455:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // InternalProblem.g:455:52: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // InternalProblem.g:456:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
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
    // InternalProblem.g:462:1: ruleEnumLiteral returns [EObject current=null] : ( (lv_name_0_0= ruleQuotedOrUnquotedId ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:468:2: ( ( (lv_name_0_0= ruleQuotedOrUnquotedId ) ) )
            // InternalProblem.g:469:2: ( (lv_name_0_0= ruleQuotedOrUnquotedId ) )
            {
            // InternalProblem.g:469:2: ( (lv_name_0_0= ruleQuotedOrUnquotedId ) )
            // InternalProblem.g:470:3: (lv_name_0_0= ruleQuotedOrUnquotedId )
            {
            // InternalProblem.g:470:3: (lv_name_0_0= ruleQuotedOrUnquotedId )
            // InternalProblem.g:471:4: lv_name_0_0= ruleQuotedOrUnquotedId
            {

            				newCompositeNode(grammarAccess.getEnumLiteralAccess().getNameQuotedOrUnquotedIdParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleQuotedOrUnquotedId();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEnumLiteralRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.viatra.solver.language.Problem.QuotedOrUnquotedId");
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
    // InternalProblem.g:491:1: entryRuleReferenceDeclaration returns [EObject current=null] : iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF ;
    public final EObject entryRuleReferenceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceDeclaration = null;


        try {
            // InternalProblem.g:491:61: (iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF )
            // InternalProblem.g:492:2: iv_ruleReferenceDeclaration= ruleReferenceDeclaration EOF
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
    // InternalProblem.g:498:1: ruleReferenceDeclaration returns [EObject current=null] : ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' )? ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= ruleIdentifier ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? ) ;
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
            // InternalProblem.g:504:2: ( ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' )? ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= ruleIdentifier ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? ) )
            // InternalProblem.g:505:2: ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' )? ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= ruleIdentifier ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? )
            {
            // InternalProblem.g:505:2: ( ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' )? ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= ruleIdentifier ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )? )
            // InternalProblem.g:506:3: ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' )? ( ( ruleQualifiedName ) ) (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )? ( (lv_name_6_0= ruleIdentifier ) ) (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )?
            {
            // InternalProblem.g:506:3: ( ( (lv_containment_0_0= 'contains' ) ) | otherlv_1= 'refers' )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            else if ( (LA14_0==23) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // InternalProblem.g:507:4: ( (lv_containment_0_0= 'contains' ) )
                    {
                    // InternalProblem.g:507:4: ( (lv_containment_0_0= 'contains' ) )
                    // InternalProblem.g:508:5: (lv_containment_0_0= 'contains' )
                    {
                    // InternalProblem.g:508:5: (lv_containment_0_0= 'contains' )
                    // InternalProblem.g:509:6: lv_containment_0_0= 'contains'
                    {
                    lv_containment_0_0=(Token)match(input,22,FOLLOW_8); 

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
                    // InternalProblem.g:522:4: otherlv_1= 'refers'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getReferenceDeclarationAccess().getRefersKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalProblem.g:527:3: ( ( ruleQualifiedName ) )
            // InternalProblem.g:528:4: ( ruleQualifiedName )
            {
            // InternalProblem.g:528:4: ( ruleQualifiedName )
            // InternalProblem.g:529:5: ruleQualifiedName
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

            // InternalProblem.g:543:3: (otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProblem.g:544:4: otherlv_3= '[' ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getReferenceDeclarationAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalProblem.g:548:4: ( (lv_multiplicity_4_0= ruleMultiplicity ) )
                    // InternalProblem.g:549:5: (lv_multiplicity_4_0= ruleMultiplicity )
                    {
                    // InternalProblem.g:549:5: (lv_multiplicity_4_0= ruleMultiplicity )
                    // InternalProblem.g:550:6: lv_multiplicity_4_0= ruleMultiplicity
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

                    otherlv_5=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getReferenceDeclarationAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalProblem.g:572:3: ( (lv_name_6_0= ruleIdentifier ) )
            // InternalProblem.g:573:4: (lv_name_6_0= ruleIdentifier )
            {
            // InternalProblem.g:573:4: (lv_name_6_0= ruleIdentifier )
            // InternalProblem.g:574:5: lv_name_6_0= ruleIdentifier
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

            // InternalProblem.g:591:3: (otherlv_7= 'opposite' ( ( ruleQualifiedName ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProblem.g:592:4: otherlv_7= 'opposite' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getReferenceDeclarationAccess().getOppositeKeyword_4_0());
                    			
                    // InternalProblem.g:596:4: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:597:5: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:597:5: ( ruleQualifiedName )
                    // InternalProblem.g:598:6: ruleQualifiedName
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
    // InternalProblem.g:617:1: entryRulePredicateDefinition returns [EObject current=null] : iv_rulePredicateDefinition= rulePredicateDefinition EOF ;
    public final EObject entryRulePredicateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateDefinition = null;


        try {
            // InternalProblem.g:617:60: (iv_rulePredicateDefinition= rulePredicateDefinition EOF )
            // InternalProblem.g:618:2: iv_rulePredicateDefinition= rulePredicateDefinition EOF
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
    // InternalProblem.g:624:1: rulePredicateDefinition returns [EObject current=null] : ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' ) ;
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
            // InternalProblem.g:630:2: ( ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' ) )
            // InternalProblem.g:631:2: ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' )
            {
            // InternalProblem.g:631:2: ( ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.' )
            // InternalProblem.g:632:3: ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' ) ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )? otherlv_13= '.'
            {
            // InternalProblem.g:632:3: ( ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? ) | otherlv_2= 'pred' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            else if ( (LA18_0==28) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalProblem.g:633:4: ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? )
                    {
                    // InternalProblem.g:633:4: ( ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )? )
                    // InternalProblem.g:634:5: ( (lv_error_0_0= 'error' ) ) (otherlv_1= 'pred' )?
                    {
                    // InternalProblem.g:634:5: ( (lv_error_0_0= 'error' ) )
                    // InternalProblem.g:635:6: (lv_error_0_0= 'error' )
                    {
                    // InternalProblem.g:635:6: (lv_error_0_0= 'error' )
                    // InternalProblem.g:636:7: lv_error_0_0= 'error'
                    {
                    lv_error_0_0=(Token)match(input,27,FOLLOW_20); 

                    							newLeafNode(lv_error_0_0, grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                    							}
                    							setWithLastConsumed(current, "error", lv_error_0_0 != null, "error");
                    						

                    }


                    }

                    // InternalProblem.g:648:5: (otherlv_1= 'pred' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==28) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalProblem.g:649:6: otherlv_1= 'pred'
                            {
                            otherlv_1=(Token)match(input,28,FOLLOW_3); 

                            						newLeafNode(otherlv_1, grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_0_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:656:4: otherlv_2= 'pred'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPredicateDefinitionAccess().getPredKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalProblem.g:661:3: ( (lv_name_3_0= ruleIdentifier ) )
            // InternalProblem.g:662:4: (lv_name_3_0= ruleIdentifier )
            {
            // InternalProblem.g:662:4: (lv_name_3_0= ruleIdentifier )
            // InternalProblem.g:663:5: lv_name_3_0= ruleIdentifier
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

            otherlv_4=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getPredicateDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalProblem.g:684:3: ( ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==RULE_QUOTED_ID||(LA20_0>=41 && LA20_0<=42)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProblem.g:685:4: ( (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    {
                    // InternalProblem.g:685:4: ( (lv_parameters_5_0= ruleParameter ) )
                    // InternalProblem.g:686:5: (lv_parameters_5_0= ruleParameter )
                    {
                    // InternalProblem.g:686:5: (lv_parameters_5_0= ruleParameter )
                    // InternalProblem.g:687:6: lv_parameters_5_0= ruleParameter
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

                    // InternalProblem.g:704:4: (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==17) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalProblem.g:705:5: otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPredicateDefinitionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalProblem.g:709:5: ( (lv_parameters_7_0= ruleParameter ) )
                    	    // InternalProblem.g:710:6: (lv_parameters_7_0= ruleParameter )
                    	    {
                    	    // InternalProblem.g:710:6: (lv_parameters_7_0= ruleParameter )
                    	    // InternalProblem.g:711:7: lv_parameters_7_0= ruleParameter
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

            otherlv_8=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getPredicateDefinitionAccess().getRightParenthesisKeyword_4());
            		
            // InternalProblem.g:734:3: (otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProblem.g:735:4: otherlv_9= ':-' ( (lv_bodies_10_0= ruleConjunction ) ) (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )*
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getPredicateDefinitionAccess().getColonHyphenMinusKeyword_5_0());
                    			
                    // InternalProblem.g:739:4: ( (lv_bodies_10_0= ruleConjunction ) )
                    // InternalProblem.g:740:5: (lv_bodies_10_0= ruleConjunction )
                    {
                    // InternalProblem.g:740:5: (lv_bodies_10_0= ruleConjunction )
                    // InternalProblem.g:741:6: lv_bodies_10_0= ruleConjunction
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

                    // InternalProblem.g:758:4: (otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==19) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalProblem.g:759:5: otherlv_11= ';' ( (lv_bodies_12_0= ruleConjunction ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_25); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPredicateDefinitionAccess().getSemicolonKeyword_5_2_0());
                    	    				
                    	    // InternalProblem.g:763:5: ( (lv_bodies_12_0= ruleConjunction ) )
                    	    // InternalProblem.g:764:6: (lv_bodies_12_0= ruleConjunction )
                    	    {
                    	    // InternalProblem.g:764:6: (lv_bodies_12_0= ruleConjunction )
                    	    // InternalProblem.g:765:7: lv_bodies_12_0= ruleConjunction
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
    // InternalProblem.g:792:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalProblem.g:792:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalProblem.g:793:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalProblem.g:799:1: ruleParameter returns [EObject current=null] : ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:805:2: ( ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= ruleIdentifier ) ) ) )
            // InternalProblem.g:806:2: ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= ruleIdentifier ) ) )
            {
            // InternalProblem.g:806:2: ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= ruleIdentifier ) ) )
            // InternalProblem.g:807:3: ( ( ruleQualifiedName ) )? ( (lv_name_1_0= ruleIdentifier ) )
            {
            // InternalProblem.g:807:3: ( ( ruleQualifiedName ) )?
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

                    if ( (LA23_2==RULE_ID||(LA23_2>=40 && LA23_2<=42)) ) {
                        alt23=1;
                    }
                    }
                    break;
                case 41:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (LA23_3==RULE_ID||(LA23_3>=40 && LA23_3<=42)) ) {
                        alt23=1;
                    }
                    }
                    break;
                case 42:
                    {
                    int LA23_4 = input.LA(2);

                    if ( (LA23_4==RULE_ID||(LA23_4>=40 && LA23_4<=42)) ) {
                        alt23=1;
                    }
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // InternalProblem.g:808:4: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:808:4: ( ruleQualifiedName )
                    // InternalProblem.g:809:5: ruleQualifiedName
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

            // InternalProblem.g:823:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalProblem.g:824:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalProblem.g:824:4: (lv_name_1_0= ruleIdentifier )
            // InternalProblem.g:825:5: lv_name_1_0= ruleIdentifier
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
    // InternalProblem.g:846:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // InternalProblem.g:846:52: (iv_ruleConjunction= ruleConjunction EOF )
            // InternalProblem.g:847:2: iv_ruleConjunction= ruleConjunction EOF
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
    // InternalProblem.g:853:1: ruleConjunction returns [EObject current=null] : ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_literals_0_0 = null;

        EObject lv_literals_2_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:859:2: ( ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* ) )
            // InternalProblem.g:860:2: ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* )
            {
            // InternalProblem.g:860:2: ( ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )* )
            // InternalProblem.g:861:3: ( (lv_literals_0_0= ruleLiteral ) ) (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )*
            {
            // InternalProblem.g:861:3: ( (lv_literals_0_0= ruleLiteral ) )
            // InternalProblem.g:862:4: (lv_literals_0_0= ruleLiteral )
            {
            // InternalProblem.g:862:4: (lv_literals_0_0= ruleLiteral )
            // InternalProblem.g:863:5: lv_literals_0_0= ruleLiteral
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

            // InternalProblem.g:880:3: (otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==17) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalProblem.g:881:4: otherlv_1= ',' ( (lv_literals_2_0= ruleLiteral ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_25); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConjunctionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalProblem.g:885:4: ( (lv_literals_2_0= ruleLiteral ) )
            	    // InternalProblem.g:886:5: (lv_literals_2_0= ruleLiteral )
            	    {
            	    // InternalProblem.g:886:5: (lv_literals_2_0= ruleLiteral )
            	    // InternalProblem.g:887:6: lv_literals_2_0= ruleLiteral
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
    // InternalProblem.g:909:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalProblem.g:909:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalProblem.g:910:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalProblem.g:916:1: ruleLiteral returns [EObject current=null] : (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject this_NegativeLiteral_1 = null;



        	enterRule();

        try {
            // InternalProblem.g:922:2: ( (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral ) )
            // InternalProblem.g:923:2: (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral )
            {
            // InternalProblem.g:923:2: (this_Atom_0= ruleAtom | this_NegativeLiteral_1= ruleNegativeLiteral )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||LA25_0==RULE_QUOTED_ID||(LA25_0>=41 && LA25_0<=42)) ) {
                alt25=1;
            }
            else if ( (LA25_0==32) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalProblem.g:924:3: this_Atom_0= ruleAtom
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
                    // InternalProblem.g:933:3: this_NegativeLiteral_1= ruleNegativeLiteral
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
    // InternalProblem.g:945:1: entryRuleNegativeLiteral returns [EObject current=null] : iv_ruleNegativeLiteral= ruleNegativeLiteral EOF ;
    public final EObject entryRuleNegativeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegativeLiteral = null;


        try {
            // InternalProblem.g:945:56: (iv_ruleNegativeLiteral= ruleNegativeLiteral EOF )
            // InternalProblem.g:946:2: iv_ruleNegativeLiteral= ruleNegativeLiteral EOF
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
    // InternalProblem.g:952:1: ruleNegativeLiteral returns [EObject current=null] : (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) ) ;
    public final EObject ruleNegativeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_atom_1_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:958:2: ( (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) ) )
            // InternalProblem.g:959:2: (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) )
            {
            // InternalProblem.g:959:2: (otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) ) )
            // InternalProblem.g:960:3: otherlv_0= '!' ( (lv_atom_1_0= ruleAtom ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNegativeLiteralAccess().getExclamationMarkKeyword_0());
            		
            // InternalProblem.g:964:3: ( (lv_atom_1_0= ruleAtom ) )
            // InternalProblem.g:965:4: (lv_atom_1_0= ruleAtom )
            {
            // InternalProblem.g:965:4: (lv_atom_1_0= ruleAtom )
            // InternalProblem.g:966:5: lv_atom_1_0= ruleAtom
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
    // InternalProblem.g:987:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalProblem.g:987:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalProblem.g:988:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalProblem.g:994:1: ruleAtom returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalProblem.g:1000:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' ) )
            // InternalProblem.g:1001:2: ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            {
            // InternalProblem.g:1001:2: ( ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')' )
            // InternalProblem.g:1002:3: ( ( ruleQualifiedName ) ) ( (lv_transitiveClosure_1_0= '+' ) )? otherlv_2= '(' ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )? otherlv_6= ')'
            {
            // InternalProblem.g:1002:3: ( ( ruleQualifiedName ) )
            // InternalProblem.g:1003:4: ( ruleQualifiedName )
            {
            // InternalProblem.g:1003:4: ( ruleQualifiedName )
            // InternalProblem.g:1004:5: ruleQualifiedName
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

            // InternalProblem.g:1018:3: ( (lv_transitiveClosure_1_0= '+' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProblem.g:1019:4: (lv_transitiveClosure_1_0= '+' )
                    {
                    // InternalProblem.g:1019:4: (lv_transitiveClosure_1_0= '+' )
                    // InternalProblem.g:1020:5: lv_transitiveClosure_1_0= '+'
                    {
                    lv_transitiveClosure_1_0=(Token)match(input,33,FOLLOW_21); 

                    					newLeafNode(lv_transitiveClosure_1_0, grammarAccess.getAtomAccess().getTransitiveClosurePlusSignKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    					setWithLastConsumed(current, "transitiveClosure", lv_transitiveClosure_1_0 != null, "+");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2());
            		
            // InternalProblem.g:1036:3: ( ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||LA28_0==RULE_QUOTED_ID||(LA28_0>=41 && LA28_0<=42)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalProblem.g:1037:4: ( (lv_arguments_3_0= ruleArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
                    {
                    // InternalProblem.g:1037:4: ( (lv_arguments_3_0= ruleArgument ) )
                    // InternalProblem.g:1038:5: (lv_arguments_3_0= ruleArgument )
                    {
                    // InternalProblem.g:1038:5: (lv_arguments_3_0= ruleArgument )
                    // InternalProblem.g:1039:6: lv_arguments_3_0= ruleArgument
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

                    // InternalProblem.g:1056:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==17) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalProblem.g:1057:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAtomAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalProblem.g:1061:5: ( (lv_arguments_5_0= ruleArgument ) )
                    	    // InternalProblem.g:1062:6: (lv_arguments_5_0= ruleArgument )
                    	    {
                    	    // InternalProblem.g:1062:6: (lv_arguments_5_0= ruleArgument )
                    	    // InternalProblem.g:1063:7: lv_arguments_5_0= ruleArgument
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

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

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
    // InternalProblem.g:1090:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalProblem.g:1090:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalProblem.g:1091:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalProblem.g:1097:1: ruleArgument returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalProblem.g:1103:2: ( ( ( ruleQualifiedName ) ) )
            // InternalProblem.g:1104:2: ( ( ruleQualifiedName ) )
            {
            // InternalProblem.g:1104:2: ( ( ruleQualifiedName ) )
            // InternalProblem.g:1105:3: ( ruleQualifiedName )
            {
            // InternalProblem.g:1105:3: ( ruleQualifiedName )
            // InternalProblem.g:1106:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getArgumentRule());
            				}
            			

            				newCompositeNode(grammarAccess.getArgumentAccess().getVariableOrNodeVariableOrNodeCrossReference_0());
            			
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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleAssertion"
    // InternalProblem.g:1123:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalProblem.g:1123:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalProblem.g:1124:2: iv_ruleAssertion= ruleAssertion EOF
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
    // InternalProblem.g:1130:1: ruleAssertion returns [EObject current=null] : ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' ) ;
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
            // InternalProblem.g:1136:2: ( ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' ) )
            // InternalProblem.g:1137:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' )
            {
            // InternalProblem.g:1137:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.' )
            // InternalProblem.g:1138:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) ) otherlv_15= '.'
            {
            // InternalProblem.g:1138:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalProblem.g:1139:4: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) )
                    {
                    // InternalProblem.g:1139:4: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) )
                    // InternalProblem.g:1140:5: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) )
                    {
                    // InternalProblem.g:1140:5: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:1141:6: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:1141:6: ( ruleQualifiedName )
                    // InternalProblem.g:1142:7: ruleQualifiedName
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

                    otherlv_1=(Token)match(input,29,FOLLOW_22); 

                    					newLeafNode(otherlv_1, grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_0_1());
                    				
                    // InternalProblem.g:1160:5: ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_ID||LA30_0==RULE_QUOTED_ID||(LA30_0>=41 && LA30_0<=42)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalProblem.g:1161:6: ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalProblem.g:1161:6: ( ( ruleQualifiedName ) )
                            // InternalProblem.g:1162:7: ( ruleQualifiedName )
                            {
                            // InternalProblem.g:1162:7: ( ruleQualifiedName )
                            // InternalProblem.g:1163:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssertionRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_0_2_0_0());
                            							
                            pushFollow(FOLLOW_23);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalProblem.g:1177:6: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==17) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalProblem.g:1178:7: otherlv_3= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                            	    							newLeafNode(otherlv_3, grammarAccess.getAssertionAccess().getCommaKeyword_0_0_2_1_0());
                            	    						
                            	    // InternalProblem.g:1182:7: ( ( ruleQualifiedName ) )
                            	    // InternalProblem.g:1183:8: ( ruleQualifiedName )
                            	    {
                            	    // InternalProblem.g:1183:8: ( ruleQualifiedName )
                            	    // InternalProblem.g:1184:9: ruleQualifiedName
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getAssertionRule());
                            	    									}
                            	    								

                            	    									newCompositeNode(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_0_2_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_23);
                            	    ruleQualifiedName();

                            	    state._fsp--;


                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop29;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_29); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssertionAccess().getRightParenthesisKeyword_0_0_3());
                    				
                    otherlv_6=(Token)match(input,34,FOLLOW_30); 

                    					newLeafNode(otherlv_6, grammarAccess.getAssertionAccess().getColonKeyword_0_0_4());
                    				
                    // InternalProblem.g:1208:5: ( (lv_value_7_0= ruleLogicValue ) )
                    // InternalProblem.g:1209:6: (lv_value_7_0= ruleLogicValue )
                    {
                    // InternalProblem.g:1209:6: (lv_value_7_0= ruleLogicValue )
                    // InternalProblem.g:1210:7: lv_value_7_0= ruleLogicValue
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
                    // InternalProblem.g:1229:4: ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' )
                    {
                    // InternalProblem.g:1229:4: ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' )
                    // InternalProblem.g:1230:5: ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')'
                    {
                    // InternalProblem.g:1230:5: ( (lv_value_8_0= ruleShortLogicValue ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==32||LA31_0==44) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalProblem.g:1231:6: (lv_value_8_0= ruleShortLogicValue )
                            {
                            // InternalProblem.g:1231:6: (lv_value_8_0= ruleShortLogicValue )
                            // InternalProblem.g:1232:7: lv_value_8_0= ruleShortLogicValue
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

                    // InternalProblem.g:1249:5: ( ( ruleQualifiedName ) )
                    // InternalProblem.g:1250:6: ( ruleQualifiedName )
                    {
                    // InternalProblem.g:1250:6: ( ruleQualifiedName )
                    // InternalProblem.g:1251:7: ruleQualifiedName
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

                    otherlv_10=(Token)match(input,29,FOLLOW_22); 

                    					newLeafNode(otherlv_10, grammarAccess.getAssertionAccess().getLeftParenthesisKeyword_0_1_2());
                    				
                    // InternalProblem.g:1269:5: ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID||LA33_0==RULE_QUOTED_ID||(LA33_0>=41 && LA33_0<=42)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalProblem.g:1270:6: ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalProblem.g:1270:6: ( ( ruleQualifiedName ) )
                            // InternalProblem.g:1271:7: ( ruleQualifiedName )
                            {
                            // InternalProblem.g:1271:7: ( ruleQualifiedName )
                            // InternalProblem.g:1272:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssertionRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_1_3_0_0());
                            							
                            pushFollow(FOLLOW_23);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalProblem.g:1286:6: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==17) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // InternalProblem.g:1287:7: otherlv_12= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_12=(Token)match(input,17,FOLLOW_8); 

                            	    							newLeafNode(otherlv_12, grammarAccess.getAssertionAccess().getCommaKeyword_0_1_3_1_0());
                            	    						
                            	    // InternalProblem.g:1291:7: ( ( ruleQualifiedName ) )
                            	    // InternalProblem.g:1292:8: ( ruleQualifiedName )
                            	    {
                            	    // InternalProblem.g:1292:8: ( ruleQualifiedName )
                            	    // InternalProblem.g:1293:9: ruleQualifiedName
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getAssertionRule());
                            	    									}
                            	    								

                            	    									newCompositeNode(grammarAccess.getAssertionAccess().getArgumentsNodeCrossReference_0_1_3_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_23);
                            	    ruleQualifiedName();

                            	    state._fsp--;


                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,30,FOLLOW_4); 

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
    // InternalProblem.g:1323:1: entryRuleScopeDeclaration returns [EObject current=null] : iv_ruleScopeDeclaration= ruleScopeDeclaration EOF ;
    public final EObject entryRuleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDeclaration = null;


        try {
            // InternalProblem.g:1323:57: (iv_ruleScopeDeclaration= ruleScopeDeclaration EOF )
            // InternalProblem.g:1324:2: iv_ruleScopeDeclaration= ruleScopeDeclaration EOF
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
    // InternalProblem.g:1330:1: ruleScopeDeclaration returns [EObject current=null] : (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' ) ;
    public final EObject ruleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_typeScopes_1_0 = null;

        EObject lv_typeScopes_3_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1336:2: ( (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' ) )
            // InternalProblem.g:1337:2: (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' )
            {
            // InternalProblem.g:1337:2: (otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.' )
            // InternalProblem.g:1338:3: otherlv_0= 'scope' ( (lv_typeScopes_1_0= ruleTypeScope ) ) (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )* otherlv_4= '.'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getScopeDeclarationAccess().getScopeKeyword_0());
            		
            // InternalProblem.g:1342:3: ( (lv_typeScopes_1_0= ruleTypeScope ) )
            // InternalProblem.g:1343:4: (lv_typeScopes_1_0= ruleTypeScope )
            {
            // InternalProblem.g:1343:4: (lv_typeScopes_1_0= ruleTypeScope )
            // InternalProblem.g:1344:5: lv_typeScopes_1_0= ruleTypeScope
            {

            					newCompositeNode(grammarAccess.getScopeDeclarationAccess().getTypeScopesTypeScopeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalProblem.g:1361:3: (otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==17) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalProblem.g:1362:4: otherlv_2= ',' ( (lv_typeScopes_3_0= ruleTypeScope ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_31); 

            	    				newLeafNode(otherlv_2, grammarAccess.getScopeDeclarationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalProblem.g:1366:4: ( (lv_typeScopes_3_0= ruleTypeScope ) )
            	    // InternalProblem.g:1367:5: (lv_typeScopes_3_0= ruleTypeScope )
            	    {
            	    // InternalProblem.g:1367:5: (lv_typeScopes_3_0= ruleTypeScope )
            	    // InternalProblem.g:1368:6: lv_typeScopes_3_0= ruleTypeScope
            	    {

            	    						newCompositeNode(grammarAccess.getScopeDeclarationAccess().getTypeScopesTypeScopeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop35;
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
    // InternalProblem.g:1394:1: entryRuleTypeScope returns [EObject current=null] : iv_ruleTypeScope= ruleTypeScope EOF ;
    public final EObject entryRuleTypeScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeScope = null;


        try {
            // InternalProblem.g:1394:50: (iv_ruleTypeScope= ruleTypeScope EOF )
            // InternalProblem.g:1395:2: iv_ruleTypeScope= ruleTypeScope EOF
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
    // InternalProblem.g:1401:1: ruleTypeScope returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) ) ) ;
    public final EObject ruleTypeScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_increment_1_0=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1407:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) ) ) )
            // InternalProblem.g:1408:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) ) )
            {
            // InternalProblem.g:1408:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) ) )
            // InternalProblem.g:1409:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) )
            {
            // InternalProblem.g:1409:3: ( (otherlv_0= RULE_ID ) )
            // InternalProblem.g:1410:4: (otherlv_0= RULE_ID )
            {
            // InternalProblem.g:1410:4: (otherlv_0= RULE_ID )
            // InternalProblem.g:1411:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeScopeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_0, grammarAccess.getTypeScopeAccess().getTargetTypeClassDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalProblem.g:1422:3: ( ( (lv_increment_1_0= '+=' ) ) | otherlv_2= '=' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            else if ( (LA36_0==37) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalProblem.g:1423:4: ( (lv_increment_1_0= '+=' ) )
                    {
                    // InternalProblem.g:1423:4: ( (lv_increment_1_0= '+=' ) )
                    // InternalProblem.g:1424:5: (lv_increment_1_0= '+=' )
                    {
                    // InternalProblem.g:1424:5: (lv_increment_1_0= '+=' )
                    // InternalProblem.g:1425:6: lv_increment_1_0= '+='
                    {
                    lv_increment_1_0=(Token)match(input,36,FOLLOW_17); 

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
                    // InternalProblem.g:1438:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeScopeAccess().getEqualsSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalProblem.g:1443:3: ( (lv_multiplicity_3_0= ruleDefiniteMultiplicity ) )
            // InternalProblem.g:1444:4: (lv_multiplicity_3_0= ruleDefiniteMultiplicity )
            {
            // InternalProblem.g:1444:4: (lv_multiplicity_3_0= ruleDefiniteMultiplicity )
            // InternalProblem.g:1445:5: lv_multiplicity_3_0= ruleDefiniteMultiplicity
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
    // InternalProblem.g:1466:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalProblem.g:1466:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalProblem.g:1467:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalProblem.g:1473:1: ruleMultiplicity returns [EObject current=null] : (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject this_UnboundedMultiplicity_0 = null;

        EObject this_DefiniteMultiplicity_1 = null;



        	enterRule();

        try {
            // InternalProblem.g:1479:2: ( (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity ) )
            // InternalProblem.g:1480:2: (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity )
            {
            // InternalProblem.g:1480:2: (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==EOF||LA37_0==25) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_INT) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalProblem.g:1481:3: this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity
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
                    // InternalProblem.g:1490:3: this_DefiniteMultiplicity_1= ruleDefiniteMultiplicity
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
    // InternalProblem.g:1502:1: entryRuleDefiniteMultiplicity returns [EObject current=null] : iv_ruleDefiniteMultiplicity= ruleDefiniteMultiplicity EOF ;
    public final EObject entryRuleDefiniteMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefiniteMultiplicity = null;


        try {
            // InternalProblem.g:1502:61: (iv_ruleDefiniteMultiplicity= ruleDefiniteMultiplicity EOF )
            // InternalProblem.g:1503:2: iv_ruleDefiniteMultiplicity= ruleDefiniteMultiplicity EOF
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
    // InternalProblem.g:1509:1: ruleDefiniteMultiplicity returns [EObject current=null] : (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity ) ;
    public final EObject ruleDefiniteMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject this_RangeMultiplicity_0 = null;

        EObject this_ExactMultiplicity_1 = null;



        	enterRule();

        try {
            // InternalProblem.g:1515:2: ( (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity ) )
            // InternalProblem.g:1516:2: (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity )
            {
            // InternalProblem.g:1516:2: (this_RangeMultiplicity_0= ruleRangeMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==38) ) {
                    alt38=1;
                }
                else if ( (LA38_1==EOF||LA38_1==13||LA38_1==17||LA38_1==25) ) {
                    alt38=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalProblem.g:1517:3: this_RangeMultiplicity_0= ruleRangeMultiplicity
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
                    // InternalProblem.g:1526:3: this_ExactMultiplicity_1= ruleExactMultiplicity
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
    // InternalProblem.g:1538:1: entryRuleUnboundedMultiplicity returns [EObject current=null] : iv_ruleUnboundedMultiplicity= ruleUnboundedMultiplicity EOF ;
    public final EObject entryRuleUnboundedMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnboundedMultiplicity = null;


        try {
            // InternalProblem.g:1538:62: (iv_ruleUnboundedMultiplicity= ruleUnboundedMultiplicity EOF )
            // InternalProblem.g:1539:2: iv_ruleUnboundedMultiplicity= ruleUnboundedMultiplicity EOF
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
    // InternalProblem.g:1545:1: ruleUnboundedMultiplicity returns [EObject current=null] : () ;
    public final EObject ruleUnboundedMultiplicity() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalProblem.g:1551:2: ( () )
            // InternalProblem.g:1552:2: ()
            {
            // InternalProblem.g:1552:2: ()
            // InternalProblem.g:1553:3: 
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
    // InternalProblem.g:1562:1: entryRuleRangeMultiplicity returns [EObject current=null] : iv_ruleRangeMultiplicity= ruleRangeMultiplicity EOF ;
    public final EObject entryRuleRangeMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeMultiplicity = null;


        try {
            // InternalProblem.g:1562:58: (iv_ruleRangeMultiplicity= ruleRangeMultiplicity EOF )
            // InternalProblem.g:1563:2: iv_ruleRangeMultiplicity= ruleRangeMultiplicity EOF
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
    // InternalProblem.g:1569:1: ruleRangeMultiplicity returns [EObject current=null] : ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) ) ;
    public final EObject ruleRangeMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_lowerBound_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalProblem.g:1575:2: ( ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) ) )
            // InternalProblem.g:1576:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) )
            {
            // InternalProblem.g:1576:2: ( ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) ) )
            // InternalProblem.g:1577:3: ( (lv_lowerBound_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upperBound_2_0= ruleUpperBound ) )
            {
            // InternalProblem.g:1577:3: ( (lv_lowerBound_0_0= RULE_INT ) )
            // InternalProblem.g:1578:4: (lv_lowerBound_0_0= RULE_INT )
            {
            // InternalProblem.g:1578:4: (lv_lowerBound_0_0= RULE_INT )
            // InternalProblem.g:1579:5: lv_lowerBound_0_0= RULE_INT
            {
            lv_lowerBound_0_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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

            otherlv_1=(Token)match(input,38,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeMultiplicityAccess().getFullStopFullStopKeyword_1());
            		
            // InternalProblem.g:1599:3: ( (lv_upperBound_2_0= ruleUpperBound ) )
            // InternalProblem.g:1600:4: (lv_upperBound_2_0= ruleUpperBound )
            {
            // InternalProblem.g:1600:4: (lv_upperBound_2_0= ruleUpperBound )
            // InternalProblem.g:1601:5: lv_upperBound_2_0= ruleUpperBound
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
    // InternalProblem.g:1622:1: entryRuleExactMultiplicity returns [EObject current=null] : iv_ruleExactMultiplicity= ruleExactMultiplicity EOF ;
    public final EObject entryRuleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactMultiplicity = null;


        try {
            // InternalProblem.g:1622:58: (iv_ruleExactMultiplicity= ruleExactMultiplicity EOF )
            // InternalProblem.g:1623:2: iv_ruleExactMultiplicity= ruleExactMultiplicity EOF
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
    // InternalProblem.g:1629:1: ruleExactMultiplicity returns [EObject current=null] : ( (lv_exactValue_0_0= RULE_INT ) ) ;
    public final EObject ruleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        Token lv_exactValue_0_0=null;


        	enterRule();

        try {
            // InternalProblem.g:1635:2: ( ( (lv_exactValue_0_0= RULE_INT ) ) )
            // InternalProblem.g:1636:2: ( (lv_exactValue_0_0= RULE_INT ) )
            {
            // InternalProblem.g:1636:2: ( (lv_exactValue_0_0= RULE_INT ) )
            // InternalProblem.g:1637:3: (lv_exactValue_0_0= RULE_INT )
            {
            // InternalProblem.g:1637:3: (lv_exactValue_0_0= RULE_INT )
            // InternalProblem.g:1638:4: lv_exactValue_0_0= RULE_INT
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
    // InternalProblem.g:1657:1: entryRuleUpperBound returns [String current=null] : iv_ruleUpperBound= ruleUpperBound EOF ;
    public final String entryRuleUpperBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUpperBound = null;


        try {
            // InternalProblem.g:1657:50: (iv_ruleUpperBound= ruleUpperBound EOF )
            // InternalProblem.g:1658:2: iv_ruleUpperBound= ruleUpperBound EOF
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
    // InternalProblem.g:1664:1: ruleUpperBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUpperBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalProblem.g:1670:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalProblem.g:1671:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalProblem.g:1671:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            else if ( (LA39_0==39) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalProblem.g:1672:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getUpperBoundAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:1680:3: kw= '*'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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


    // $ANTLR start "entryRuleQuotedOrUnquotedId"
    // InternalProblem.g:1689:1: entryRuleQuotedOrUnquotedId returns [String current=null] : iv_ruleQuotedOrUnquotedId= ruleQuotedOrUnquotedId EOF ;
    public final String entryRuleQuotedOrUnquotedId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuotedOrUnquotedId = null;


        try {
            // InternalProblem.g:1689:58: (iv_ruleQuotedOrUnquotedId= ruleQuotedOrUnquotedId EOF )
            // InternalProblem.g:1690:2: iv_ruleQuotedOrUnquotedId= ruleQuotedOrUnquotedId EOF
            {
             newCompositeNode(grammarAccess.getQuotedOrUnquotedIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuotedOrUnquotedId=ruleQuotedOrUnquotedId();

            state._fsp--;

             current =iv_ruleQuotedOrUnquotedId.getText(); 
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
    // $ANTLR end "entryRuleQuotedOrUnquotedId"


    // $ANTLR start "ruleQuotedOrUnquotedId"
    // InternalProblem.g:1696:1: ruleQuotedOrUnquotedId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QUOTED_ID_0= RULE_QUOTED_ID | this_Identifier_1= ruleIdentifier ) ;
    public final AntlrDatatypeRuleToken ruleQuotedOrUnquotedId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUOTED_ID_0=null;
        AntlrDatatypeRuleToken this_Identifier_1 = null;



        	enterRule();

        try {
            // InternalProblem.g:1702:2: ( (this_QUOTED_ID_0= RULE_QUOTED_ID | this_Identifier_1= ruleIdentifier ) )
            // InternalProblem.g:1703:2: (this_QUOTED_ID_0= RULE_QUOTED_ID | this_Identifier_1= ruleIdentifier )
            {
            // InternalProblem.g:1703:2: (this_QUOTED_ID_0= RULE_QUOTED_ID | this_Identifier_1= ruleIdentifier )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_QUOTED_ID) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID||(LA40_0>=41 && LA40_0<=42)) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalProblem.g:1704:3: this_QUOTED_ID_0= RULE_QUOTED_ID
                    {
                    this_QUOTED_ID_0=(Token)match(input,RULE_QUOTED_ID,FOLLOW_2); 

                    			current.merge(this_QUOTED_ID_0);
                    		

                    			newLeafNode(this_QUOTED_ID_0, grammarAccess.getQuotedOrUnquotedIdAccess().getQUOTED_IDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:1712:3: this_Identifier_1= ruleIdentifier
                    {

                    			newCompositeNode(grammarAccess.getQuotedOrUnquotedIdAccess().getIdentifierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Identifier_1=ruleIdentifier();

                    state._fsp--;


                    			current.merge(this_Identifier_1);
                    		

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
    // $ANTLR end "ruleQuotedOrUnquotedId"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalProblem.g:1726:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalProblem.g:1726:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalProblem.g:1727:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalProblem.g:1733:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QUOTED_ID_0= RULE_QUOTED_ID | (this_Identifier_1= ruleIdentifier (kw= '::' this_Identifier_3= ruleIdentifier )* (kw= '::' this_QUOTED_ID_5= RULE_QUOTED_ID )? ) ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUOTED_ID_0=null;
        Token kw=null;
        Token this_QUOTED_ID_5=null;
        AntlrDatatypeRuleToken this_Identifier_1 = null;

        AntlrDatatypeRuleToken this_Identifier_3 = null;



        	enterRule();

        try {
            // InternalProblem.g:1739:2: ( (this_QUOTED_ID_0= RULE_QUOTED_ID | (this_Identifier_1= ruleIdentifier (kw= '::' this_Identifier_3= ruleIdentifier )* (kw= '::' this_QUOTED_ID_5= RULE_QUOTED_ID )? ) ) )
            // InternalProblem.g:1740:2: (this_QUOTED_ID_0= RULE_QUOTED_ID | (this_Identifier_1= ruleIdentifier (kw= '::' this_Identifier_3= ruleIdentifier )* (kw= '::' this_QUOTED_ID_5= RULE_QUOTED_ID )? ) )
            {
            // InternalProblem.g:1740:2: (this_QUOTED_ID_0= RULE_QUOTED_ID | (this_Identifier_1= ruleIdentifier (kw= '::' this_Identifier_3= ruleIdentifier )* (kw= '::' this_QUOTED_ID_5= RULE_QUOTED_ID )? ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_QUOTED_ID) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID||(LA43_0>=41 && LA43_0<=42)) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalProblem.g:1741:3: this_QUOTED_ID_0= RULE_QUOTED_ID
                    {
                    this_QUOTED_ID_0=(Token)match(input,RULE_QUOTED_ID,FOLLOW_2); 

                    			current.merge(this_QUOTED_ID_0);
                    		

                    			newLeafNode(this_QUOTED_ID_0, grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:1749:3: (this_Identifier_1= ruleIdentifier (kw= '::' this_Identifier_3= ruleIdentifier )* (kw= '::' this_QUOTED_ID_5= RULE_QUOTED_ID )? )
                    {
                    // InternalProblem.g:1749:3: (this_Identifier_1= ruleIdentifier (kw= '::' this_Identifier_3= ruleIdentifier )* (kw= '::' this_QUOTED_ID_5= RULE_QUOTED_ID )? )
                    // InternalProblem.g:1750:4: this_Identifier_1= ruleIdentifier (kw= '::' this_Identifier_3= ruleIdentifier )* (kw= '::' this_QUOTED_ID_5= RULE_QUOTED_ID )?
                    {

                    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getIdentifierParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_36);
                    this_Identifier_1=ruleIdentifier();

                    state._fsp--;


                    				current.merge(this_Identifier_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalProblem.g:1760:4: (kw= '::' this_Identifier_3= ruleIdentifier )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==40) ) {
                            int LA41_1 = input.LA(2);

                            if ( (LA41_1==RULE_ID||(LA41_1>=41 && LA41_1<=42)) ) {
                                alt41=1;
                            }


                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalProblem.g:1761:5: kw= '::' this_Identifier_3= ruleIdentifier
                    	    {
                    	    kw=(Token)match(input,40,FOLLOW_3); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_1_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getQualifiedNameAccess().getIdentifierParserRuleCall_1_1_1());
                    	    				
                    	    pushFollow(FOLLOW_36);
                    	    this_Identifier_3=ruleIdentifier();

                    	    state._fsp--;


                    	    					current.merge(this_Identifier_3);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    // InternalProblem.g:1777:4: (kw= '::' this_QUOTED_ID_5= RULE_QUOTED_ID )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==40) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalProblem.g:1778:5: kw= '::' this_QUOTED_ID_5= RULE_QUOTED_ID
                            {
                            kw=(Token)match(input,40,FOLLOW_37); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_2_0());
                            				
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


    // $ANTLR start "entryRuleIdentifier"
    // InternalProblem.g:1796:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalProblem.g:1796:50: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalProblem.g:1797:2: iv_ruleIdentifier= ruleIdentifier EOF
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
    // InternalProblem.g:1803:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalProblem.g:1809:2: ( (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' ) )
            // InternalProblem.g:1810:2: (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' )
            {
            // InternalProblem.g:1810:2: (this_ID_0= RULE_ID | kw= 'true' | kw= 'false' )
            int alt44=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt44=1;
                }
                break;
            case 41:
                {
                alt44=2;
                }
                break;
            case 42:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalProblem.g:1811:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProblem.g:1819:3: kw= 'true'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIdentifierAccess().getTrueKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalProblem.g:1825:3: kw= 'false'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

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


    // $ANTLR start "ruleLogicValue"
    // InternalProblem.g:1834:1: ruleLogicValue returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) ) ;
    public final Enumerator ruleLogicValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalProblem.g:1840:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) ) )
            // InternalProblem.g:1841:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) )
            {
            // InternalProblem.g:1841:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 41:
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
                    // InternalProblem.g:1842:3: (enumLiteral_0= 'true' )
                    {
                    // InternalProblem.g:1842:3: (enumLiteral_0= 'true' )
                    // InternalProblem.g:1843:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1850:3: (enumLiteral_1= 'false' )
                    {
                    // InternalProblem.g:1850:3: (enumLiteral_1= 'false' )
                    // InternalProblem.g:1851:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:1858:3: (enumLiteral_2= 'unknown' )
                    {
                    // InternalProblem.g:1858:3: (enumLiteral_2= 'unknown' )
                    // InternalProblem.g:1859:4: enumLiteral_2= 'unknown'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

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
    // InternalProblem.g:1869:1: ruleShortLogicValue returns [Enumerator current=null] : ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) ) ;
    public final Enumerator ruleShortLogicValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProblem.g:1875:2: ( ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) ) )
            // InternalProblem.g:1876:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) )
            {
            // InternalProblem.g:1876:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '?' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==32) ) {
                alt46=1;
            }
            else if ( (LA46_0==44) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalProblem.g:1877:3: (enumLiteral_0= '!' )
                    {
                    // InternalProblem.g:1877:3: (enumLiteral_0= '!' )
                    // InternalProblem.g:1878:4: enumLiteral_0= '!'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getShortLogicValueAccess().getFALSEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:1885:3: (enumLiteral_1= '?' )
                    {
                    // InternalProblem.g:1885:3: (enumLiteral_1= '?' )
                    // InternalProblem.g:1886:4: enumLiteral_1= '?'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

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


    protected DFA34 dfa34 = new DFA34(this);
    static final String dfa_1s = "\41\uffff";
    static final String dfa_2s = "\1\4\4\35\1\uffff\2\4\4\21\1\15\4\35\2\4\1\uffff\10\21\1\4\4\21";
    static final String dfa_3s = "\1\54\1\35\3\50\1\uffff\2\52\1\36\3\50\1\42\3\50\1\35\2\52\1\uffff\1\36\6\50\1\36\1\52\3\50\1\36";
    static final String dfa_4s = "\5\uffff\1\2\15\uffff\1\1\15\uffff";
    static final String dfa_5s = "\41\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\1\1\31\uffff\1\5\10\uffff\1\3\1\4\1\uffff\1\5",
            "\1\6",
            "\1\6\12\uffff\1\7",
            "\1\6\12\uffff\1\7",
            "\1\6\12\uffff\1\7",
            "",
            "\1\11\1\uffff\1\10\27\uffff\1\14\12\uffff\1\12\1\13",
            "\1\15\1\uffff\1\20\42\uffff\1\16\1\17",
            "\1\21\14\uffff\1\14",
            "\1\21\14\uffff\1\14\11\uffff\1\22",
            "\1\21\14\uffff\1\14\11\uffff\1\22",
            "\1\21\14\uffff\1\14\11\uffff\1\22",
            "\1\5\24\uffff\1\23",
            "\1\6\12\uffff\1\7",
            "\1\6\12\uffff\1\7",
            "\1\6\12\uffff\1\7",
            "\1\6",
            "\1\25\1\uffff\1\24\42\uffff\1\26\1\27",
            "\1\30\1\uffff\1\33\42\uffff\1\31\1\32",
            "",
            "\1\21\14\uffff\1\14",
            "\1\21\14\uffff\1\14\11\uffff\1\34",
            "\1\21\14\uffff\1\14\11\uffff\1\34",
            "\1\21\14\uffff\1\14\11\uffff\1\34",
            "\1\21\14\uffff\1\14\11\uffff\1\22",
            "\1\21\14\uffff\1\14\11\uffff\1\22",
            "\1\21\14\uffff\1\14\11\uffff\1\22",
            "\1\21\14\uffff\1\14",
            "\1\35\1\uffff\1\40\42\uffff\1\36\1\37",
            "\1\21\14\uffff\1\14\11\uffff\1\34",
            "\1\21\14\uffff\1\14\11\uffff\1\34",
            "\1\21\14\uffff\1\14\11\uffff\1\34",
            "\1\21\14\uffff\1\14"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1138:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_value_7_0= ruleLogicValue ) ) ) | ( ( (lv_value_8_0= ruleShortLogicValue ) )? ( ( ruleQualifiedName ) ) otherlv_10= '(' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000060000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000016091820C052L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000052000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000060000000050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000060000D00050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000060000D80050L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000060000100050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000060001000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000060010000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000060040000050L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000060100000050L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});

}