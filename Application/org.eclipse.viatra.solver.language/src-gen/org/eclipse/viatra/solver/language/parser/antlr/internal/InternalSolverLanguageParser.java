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
import org.eclipse.viatra.solver.language.services.SolverLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSolverLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GREATER_EQ", "Functional", "Abstract", "Contains", "Maximize", "Minimize", "Opposite", "GREATER", "LESS_EQ", "Current", "Default", "Extends", "Unknown", "NOT_EQ", "Extern", "Class", "Count", "Empty", "Error", "False", "Scope", "LESS", "Else", "Must", "Only", "Prod", "Real", "Then", "True", "ADD", "DIV", "MUL", "POW", "SUB", "Avg", "Inf", "Int", "Max", "May", "Min", "Sum", "ExclamationMarkEqualsSign", "HyphenMinusGreaterThanSign", "FullStopFullStop", "ColonHyphenMinus", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "GreaterThanSignEqualsSign", "EQ", "IN", "If", "In", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "RULE_STRING", "RULE_QUOTED_ID", "RULE_SL_COMMENT", "RULE_TRANSITIVE_CLOSURE", "RULE_REFLEXIVE_TRANSITIVE_CLOSURE", "RULE_FULL_STOP", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int ADD=33;
    public static final int True=32;
    public static final int GREATER_EQ=4;
    public static final int Count=20;
    public static final int False=23;
    public static final int Must=27;
    public static final int LessThanSign=67;
    public static final int LeftParenthesis=57;
    public static final int Unknown=16;
    public static final int RULE_REFLEXIVE_TRANSITIVE_CLOSURE=80;
    public static final int FullStopFullStop=47;
    public static final int Real=30;
    public static final int Then=31;
    public static final int Extends=15;
    public static final int RightSquareBracket=71;
    public static final int ExclamationMark=56;
    public static final int Opposite=10;
    public static final int SUB=37;
    public static final int GreaterThanSign=69;
    public static final int NOT_EQ=17;
    public static final int RULE_ID=82;
    public static final int MUL=35;
    public static final int IN=53;
    public static final int RULE_QUOTED_ID=77;
    public static final int RightParenthesis=58;
    public static final int Sum=44;
    public static final int EQ=52;
    public static final int GreaterThanSignEqualsSign=51;
    public static final int Functional=5;
    public static final int EqualsSignEqualsSign=50;
    public static final int Avg=38;
    public static final int Min=43;
    public static final int VerticalLine=74;
    public static final int PlusSign=60;
    public static final int RULE_INT=83;
    public static final int Contains=7;
    public static final int RULE_ML_COMMENT=84;
    public static final int POW=36;
    public static final int RULE_TRANSITIVE_CLOSURE=79;
    public static final int Class=19;
    public static final int LESS=25;
    public static final int LeftSquareBracket=70;
    public static final int RULE_FULL_STOP=81;
    public static final int Current=13;
    public static final int If=54;
    public static final int Inf=39;
    public static final int LESS_EQ=12;
    public static final int May=42;
    public static final int Max=41;
    public static final int In=55;
    public static final int RULE_STRING=76;
    public static final int Int=40;
    public static final int Extern=18;
    public static final int RULE_SL_COMMENT=78;
    public static final int Prod=29;
    public static final int Comma=61;
    public static final int EqualsSign=68;
    public static final int Empty=21;
    public static final int HyphenMinus=62;
    public static final int Maximize=8;
    public static final int LessThanSignEqualsSign=49;
    public static final int Solidus=64;
    public static final int Colon=65;
    public static final int RightCurlyBracket=75;
    public static final int EOF=-1;
    public static final int Asterisk=59;
    public static final int FullStop=63;
    public static final int RULE_WS=85;
    public static final int Abstract=6;
    public static final int Minimize=9;
    public static final int GREATER=11;
    public static final int LeftCurlyBracket=73;
    public static final int Error=22;
    public static final int Only=28;
    public static final int RULE_ANY_OTHER=86;
    public static final int Default=14;
    public static final int ColonHyphenMinus=48;
    public static final int CircumflexAccent=72;
    public static final int DIV=34;
    public static final int Semicolon=66;
    public static final int Scope=24;
    public static final int Else=26;
    public static final int ExclamationMarkEqualsSign=45;
    public static final int HyphenMinusGreaterThanSign=46;

    // delegates
    // delegators


        public InternalSolverLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSolverLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSolverLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSolverLanguageParser.g"; }



     	private SolverLanguageGrammarAccess grammarAccess;

        public InternalSolverLanguageParser(TokenStream input, SolverLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Problem";
       	}

       	@Override
       	protected SolverLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProblem"
    // InternalSolverLanguageParser.g:58:1: entryRuleProblem returns [EObject current=null] : iv_ruleProblem= ruleProblem EOF ;
    public final EObject entryRuleProblem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblem = null;


        try {
            // InternalSolverLanguageParser.g:58:48: (iv_ruleProblem= ruleProblem EOF )
            // InternalSolverLanguageParser.g:59:2: iv_ruleProblem= ruleProblem EOF
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
    // InternalSolverLanguageParser.g:65:1: ruleProblem returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleProblem() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:71:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalSolverLanguageParser.g:72:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalSolverLanguageParser.g:72:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=Functional && LA1_0<=Abstract)||(LA1_0>=Maximize && LA1_0<=Minimize)||(LA1_0>=Current && LA1_0<=Default)||LA1_0==Unknown||(LA1_0>=Extern && LA1_0<=False)||LA1_0==Scope||(LA1_0>=Must && LA1_0<=Real)||LA1_0==True||(LA1_0>=Avg && LA1_0<=Sum)||LA1_0==If||(LA1_0>=ExclamationMark && LA1_0<=LeftParenthesis)||LA1_0==PlusSign||LA1_0==HyphenMinus||LA1_0==LeftSquareBracket||(LA1_0>=RULE_STRING && LA1_0<=RULE_QUOTED_ID)||(LA1_0>=RULE_ID && LA1_0<=RULE_INT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:73:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalSolverLanguageParser.g:73:3: (lv_statements_0_0= ruleStatement )
            	    // InternalSolverLanguageParser.g:74:4: lv_statements_0_0= ruleStatement
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
            	    					"org.eclipse.viatra.solver.language.SolverLanguage.Statement");
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
    // InternalSolverLanguageParser.g:94:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalSolverLanguageParser.g:94:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalSolverLanguageParser.g:95:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalSolverLanguageParser.g:101:1: ruleStatement returns [EObject current=null] : ( (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_ExternPredicateDefinition_4= ruleExternPredicateDefinition | this_MetricDefinition_5= ruleMetricDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ClassDefinition_7= ruleClassDefinition | this_ScopeDefinition_8= ruleScopeDefinition | this_ObjectiveDefinition_9= ruleObjectiveDefinition ) this_FULL_STOP_10= RULE_FULL_STOP ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token this_FULL_STOP_10=null;
        EObject this_AssertionOrDefinition_0 = null;

        EObject this_PredicateDefinition_1 = null;

        EObject this_UnnamedErrorPrediateDefinition_2 = null;

        EObject this_DefaultDefinition_3 = null;

        EObject this_ExternPredicateDefinition_4 = null;

        EObject this_MetricDefinition_5 = null;

        EObject this_ExternMetricDefinition_6 = null;

        EObject this_ClassDefinition_7 = null;

        EObject this_ScopeDefinition_8 = null;

        EObject this_ObjectiveDefinition_9 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:107:2: ( ( (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_ExternPredicateDefinition_4= ruleExternPredicateDefinition | this_MetricDefinition_5= ruleMetricDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ClassDefinition_7= ruleClassDefinition | this_ScopeDefinition_8= ruleScopeDefinition | this_ObjectiveDefinition_9= ruleObjectiveDefinition ) this_FULL_STOP_10= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:108:2: ( (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_ExternPredicateDefinition_4= ruleExternPredicateDefinition | this_MetricDefinition_5= ruleMetricDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ClassDefinition_7= ruleClassDefinition | this_ScopeDefinition_8= ruleScopeDefinition | this_ObjectiveDefinition_9= ruleObjectiveDefinition ) this_FULL_STOP_10= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:108:2: ( (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_ExternPredicateDefinition_4= ruleExternPredicateDefinition | this_MetricDefinition_5= ruleMetricDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ClassDefinition_7= ruleClassDefinition | this_ScopeDefinition_8= ruleScopeDefinition | this_ObjectiveDefinition_9= ruleObjectiveDefinition ) this_FULL_STOP_10= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:109:3: (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_ExternPredicateDefinition_4= ruleExternPredicateDefinition | this_MetricDefinition_5= ruleMetricDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ClassDefinition_7= ruleClassDefinition | this_ScopeDefinition_8= ruleScopeDefinition | this_ObjectiveDefinition_9= ruleObjectiveDefinition ) this_FULL_STOP_10= RULE_FULL_STOP
            {
            // InternalSolverLanguageParser.g:109:3: (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_ExternPredicateDefinition_4= ruleExternPredicateDefinition | this_MetricDefinition_5= ruleMetricDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ClassDefinition_7= ruleClassDefinition | this_ScopeDefinition_8= ruleScopeDefinition | this_ObjectiveDefinition_9= ruleObjectiveDefinition )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSolverLanguageParser.g:110:4: this_AssertionOrDefinition_0= ruleAssertionOrDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getAssertionOrDefinitionParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_AssertionOrDefinition_0=ruleAssertionOrDefinition();

                    state._fsp--;


                    				current = this_AssertionOrDefinition_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:119:4: this_PredicateDefinition_1= rulePredicateDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getPredicateDefinitionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_PredicateDefinition_1=rulePredicateDefinition();

                    state._fsp--;


                    				current = this_PredicateDefinition_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:128:4: this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getUnnamedErrorPrediateDefinitionParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_4);
                    this_UnnamedErrorPrediateDefinition_2=ruleUnnamedErrorPrediateDefinition();

                    state._fsp--;


                    				current = this_UnnamedErrorPrediateDefinition_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:137:4: this_DefaultDefinition_3= ruleDefaultDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getDefaultDefinitionParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_4);
                    this_DefaultDefinition_3=ruleDefaultDefinition();

                    state._fsp--;


                    				current = this_DefaultDefinition_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalSolverLanguageParser.g:146:4: this_ExternPredicateDefinition_4= ruleExternPredicateDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getExternPredicateDefinitionParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_4);
                    this_ExternPredicateDefinition_4=ruleExternPredicateDefinition();

                    state._fsp--;


                    				current = this_ExternPredicateDefinition_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalSolverLanguageParser.g:155:4: this_MetricDefinition_5= ruleMetricDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getMetricDefinitionParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_4);
                    this_MetricDefinition_5=ruleMetricDefinition();

                    state._fsp--;


                    				current = this_MetricDefinition_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalSolverLanguageParser.g:164:4: this_ExternMetricDefinition_6= ruleExternMetricDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getExternMetricDefinitionParserRuleCall_0_6());
                    			
                    pushFollow(FOLLOW_4);
                    this_ExternMetricDefinition_6=ruleExternMetricDefinition();

                    state._fsp--;


                    				current = this_ExternMetricDefinition_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalSolverLanguageParser.g:173:4: this_ClassDefinition_7= ruleClassDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getClassDefinitionParserRuleCall_0_7());
                    			
                    pushFollow(FOLLOW_4);
                    this_ClassDefinition_7=ruleClassDefinition();

                    state._fsp--;


                    				current = this_ClassDefinition_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 9 :
                    // InternalSolverLanguageParser.g:182:4: this_ScopeDefinition_8= ruleScopeDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getScopeDefinitionParserRuleCall_0_8());
                    			
                    pushFollow(FOLLOW_4);
                    this_ScopeDefinition_8=ruleScopeDefinition();

                    state._fsp--;


                    				current = this_ScopeDefinition_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 10 :
                    // InternalSolverLanguageParser.g:191:4: this_ObjectiveDefinition_9= ruleObjectiveDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getObjectiveDefinitionParserRuleCall_0_9());
                    			
                    pushFollow(FOLLOW_4);
                    this_ObjectiveDefinition_9=ruleObjectiveDefinition();

                    state._fsp--;


                    				current = this_ObjectiveDefinition_9;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            this_FULL_STOP_10=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_10, grammarAccess.getStatementAccess().getFULL_STOPTerminalRuleCall_1());
            		

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


    // $ANTLR start "entryRuleAssertionOrDefinition"
    // InternalSolverLanguageParser.g:208:1: entryRuleAssertionOrDefinition returns [EObject current=null] : iv_ruleAssertionOrDefinition= ruleAssertionOrDefinition EOF ;
    public final EObject entryRuleAssertionOrDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionOrDefinition = null;


        try {
            // InternalSolverLanguageParser.g:208:62: (iv_ruleAssertionOrDefinition= ruleAssertionOrDefinition EOF )
            // InternalSolverLanguageParser.g:209:2: iv_ruleAssertionOrDefinition= ruleAssertionOrDefinition EOF
            {
             newCompositeNode(grammarAccess.getAssertionOrDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertionOrDefinition=ruleAssertionOrDefinition();

            state._fsp--;

             current =iv_ruleAssertionOrDefinition; 
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
    // $ANTLR end "entryRuleAssertionOrDefinition"


    // $ANTLR start "ruleAssertionOrDefinition"
    // InternalSolverLanguageParser.g:215:1: ruleAssertionOrDefinition returns [EObject current=null] : (this_Expression_0= ruleExpression ( ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) ) ) ) ;
    public final EObject ruleAssertionOrDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_Expression_0 = null;

        EObject lv_range_3_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:221:2: ( (this_Expression_0= ruleExpression ( ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) ) ) ) )
            // InternalSolverLanguageParser.g:222:2: (this_Expression_0= ruleExpression ( ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) ) ) )
            {
            // InternalSolverLanguageParser.g:222:2: (this_Expression_0= ruleExpression ( ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) ) ) )
            // InternalSolverLanguageParser.g:223:3: this_Expression_0= ruleExpression ( ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) ) )
            {

            			newCompositeNode(grammarAccess.getAssertionOrDefinitionAccess().getExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Expression_0=ruleExpression();

            state._fsp--;


            			current = this_Expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:231:3: ( ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case EOF:
            case Colon:
            case RULE_FULL_STOP:
                {
                alt4=1;
                }
                break;
            case ColonHyphenMinus:
                {
                alt4=2;
                }
                break;
            case EqualsSign:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSolverLanguageParser.g:232:4: ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? )
                    {
                    // InternalSolverLanguageParser.g:232:4: ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? )
                    // InternalSolverLanguageParser.g:233:5: () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )?
                    {
                    // InternalSolverLanguageParser.g:233:5: ()
                    // InternalSolverLanguageParser.g:234:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getAssertionOrDefinitionAccess().getAssertionBodyAction_1_0_0(),
                    							current);
                    					

                    }

                    // InternalSolverLanguageParser.g:240:5: (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==Colon) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalSolverLanguageParser.g:241:6: otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) )
                            {
                            otherlv_2=(Token)match(input,Colon,FOLLOW_6); 

                            						newLeafNode(otherlv_2, grammarAccess.getAssertionOrDefinitionAccess().getColonKeyword_1_0_1_0());
                            					
                            // InternalSolverLanguageParser.g:245:6: ( (lv_range_3_0= ruleExpression ) )
                            // InternalSolverLanguageParser.g:246:7: (lv_range_3_0= ruleExpression )
                            {
                            // InternalSolverLanguageParser.g:246:7: (lv_range_3_0= ruleExpression )
                            // InternalSolverLanguageParser.g:247:8: lv_range_3_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getAssertionOrDefinitionAccess().getRangeExpressionParserRuleCall_1_0_1_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_range_3_0=ruleExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getAssertionOrDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"range",
                            									lv_range_3_0,
                            									"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:267:4: ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) )
                    {
                    // InternalSolverLanguageParser.g:267:4: ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) )
                    // InternalSolverLanguageParser.g:268:5: () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) )
                    {
                    // InternalSolverLanguageParser.g:268:5: ()
                    // InternalSolverLanguageParser.g:269:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getAssertionOrDefinitionAccess().getPredicateDefinitionHeadAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_5=(Token)match(input,ColonHyphenMinus,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssertionOrDefinitionAccess().getColonHyphenMinusKeyword_1_1_1());
                    				
                    // InternalSolverLanguageParser.g:279:5: ( (lv_body_6_0= ruleExpression ) )
                    // InternalSolverLanguageParser.g:280:6: (lv_body_6_0= ruleExpression )
                    {
                    // InternalSolverLanguageParser.g:280:6: (lv_body_6_0= ruleExpression )
                    // InternalSolverLanguageParser.g:281:7: lv_body_6_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getAssertionOrDefinitionAccess().getBodyExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_body_6_0=ruleExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssertionOrDefinitionRule());
                    							}
                    							set(
                    								current,
                    								"body",
                    								lv_body_6_0,
                    								"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:300:4: ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) )
                    {
                    // InternalSolverLanguageParser.g:300:4: ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) )
                    // InternalSolverLanguageParser.g:301:5: () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) )
                    {
                    // InternalSolverLanguageParser.g:301:5: ()
                    // InternalSolverLanguageParser.g:302:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getAssertionOrDefinitionAccess().getMetricDefinitionHeadAction_1_2_0(),
                    							current);
                    					

                    }

                    otherlv_8=(Token)match(input,EqualsSign,FOLLOW_6); 

                    					newLeafNode(otherlv_8, grammarAccess.getAssertionOrDefinitionAccess().getEqualsSignKeyword_1_2_1());
                    				
                    // InternalSolverLanguageParser.g:312:5: ( (lv_body_9_0= ruleExpression ) )
                    // InternalSolverLanguageParser.g:313:6: (lv_body_9_0= ruleExpression )
                    {
                    // InternalSolverLanguageParser.g:313:6: (lv_body_9_0= ruleExpression )
                    // InternalSolverLanguageParser.g:314:7: lv_body_9_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getAssertionOrDefinitionAccess().getBodyExpressionParserRuleCall_1_2_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_body_9_0=ruleExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssertionOrDefinitionRule());
                    							}
                    							set(
                    								current,
                    								"body",
                    								lv_body_9_0,
                    								"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


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
    // $ANTLR end "ruleAssertionOrDefinition"


    // $ANTLR start "entryRulePredicateDefinition"
    // InternalSolverLanguageParser.g:337:1: entryRulePredicateDefinition returns [EObject current=null] : iv_rulePredicateDefinition= rulePredicateDefinition EOF ;
    public final EObject entryRulePredicateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateDefinition = null;


        try {
            // InternalSolverLanguageParser.g:337:60: (iv_rulePredicateDefinition= rulePredicateDefinition EOF )
            // InternalSolverLanguageParser.g:338:2: iv_rulePredicateDefinition= rulePredicateDefinition EOF
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
    // InternalSolverLanguageParser.g:344:1: rulePredicateDefinition returns [EObject current=null] : ( ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) ;
    public final EObject rulePredicateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_functional_0_0=null;
        Token lv_error_1_0=null;
        Token lv_error_2_0=null;
        Token lv_functional_3_0=null;
        Token otherlv_5=null;
        EObject lv_head_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:350:2: ( ( ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:351:2: ( ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:351:2: ( ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:352:3: ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) )
            {
            // InternalSolverLanguageParser.g:352:3: ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Functional) ) {
                alt7=1;
            }
            else if ( (LA7_0==Error) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSolverLanguageParser.g:353:4: ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? )
                    {
                    // InternalSolverLanguageParser.g:353:4: ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? )
                    // InternalSolverLanguageParser.g:354:5: ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )?
                    {
                    // InternalSolverLanguageParser.g:354:5: ( (lv_functional_0_0= Functional ) )
                    // InternalSolverLanguageParser.g:355:6: (lv_functional_0_0= Functional )
                    {
                    // InternalSolverLanguageParser.g:355:6: (lv_functional_0_0= Functional )
                    // InternalSolverLanguageParser.g:356:7: lv_functional_0_0= Functional
                    {
                    lv_functional_0_0=(Token)match(input,Functional,FOLLOW_7); 

                    							newLeafNode(lv_functional_0_0, grammarAccess.getPredicateDefinitionAccess().getFunctionalFunctionalKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                    							}
                    							setWithLastConsumed(current, "functional", true, "functional");
                    						

                    }


                    }

                    // InternalSolverLanguageParser.g:368:5: ( (lv_error_1_0= Error ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==Error) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSolverLanguageParser.g:369:6: (lv_error_1_0= Error )
                            {
                            // InternalSolverLanguageParser.g:369:6: (lv_error_1_0= Error )
                            // InternalSolverLanguageParser.g:370:7: lv_error_1_0= Error
                            {
                            lv_error_1_0=(Token)match(input,Error,FOLLOW_8); 

                            							newLeafNode(lv_error_1_0, grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                            							}
                            							setWithLastConsumed(current, "error", true, "error");
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:384:4: ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? )
                    {
                    // InternalSolverLanguageParser.g:384:4: ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? )
                    // InternalSolverLanguageParser.g:385:5: ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )?
                    {
                    // InternalSolverLanguageParser.g:385:5: ( (lv_error_2_0= Error ) )
                    // InternalSolverLanguageParser.g:386:6: (lv_error_2_0= Error )
                    {
                    // InternalSolverLanguageParser.g:386:6: (lv_error_2_0= Error )
                    // InternalSolverLanguageParser.g:387:7: lv_error_2_0= Error
                    {
                    lv_error_2_0=(Token)match(input,Error,FOLLOW_9); 

                    							newLeafNode(lv_error_2_0, grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                    							}
                    							setWithLastConsumed(current, "error", true, "error");
                    						

                    }


                    }

                    // InternalSolverLanguageParser.g:399:5: ( (lv_functional_3_0= Functional ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==Functional) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalSolverLanguageParser.g:400:6: (lv_functional_3_0= Functional )
                            {
                            // InternalSolverLanguageParser.g:400:6: (lv_functional_3_0= Functional )
                            // InternalSolverLanguageParser.g:401:7: lv_functional_3_0= Functional
                            {
                            lv_functional_3_0=(Token)match(input,Functional,FOLLOW_8); 

                            							newLeafNode(lv_functional_3_0, grammarAccess.getPredicateDefinitionAccess().getFunctionalFunctionalKeyword_0_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                            							}
                            							setWithLastConsumed(current, "functional", true, "functional");
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalSolverLanguageParser.g:415:3: ( (lv_head_4_0= ruleCall ) )
            // InternalSolverLanguageParser.g:416:4: (lv_head_4_0= ruleCall )
            {
            // InternalSolverLanguageParser.g:416:4: (lv_head_4_0= ruleCall )
            // InternalSolverLanguageParser.g:417:5: lv_head_4_0= ruleCall
            {

            					newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getHeadCallParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_head_4_0=ruleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateDefinitionRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_4_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Call");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,ColonHyphenMinus,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getPredicateDefinitionAccess().getColonHyphenMinusKeyword_2());
            		
            // InternalSolverLanguageParser.g:438:3: ( (lv_body_6_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:439:4: (lv_body_6_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:439:4: (lv_body_6_0= ruleExpression )
            // InternalSolverLanguageParser.g:440:5: lv_body_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getBodyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateDefinitionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
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
    // $ANTLR end "rulePredicateDefinition"


    // $ANTLR start "entryRuleUnnamedErrorPrediateDefinition"
    // InternalSolverLanguageParser.g:461:1: entryRuleUnnamedErrorPrediateDefinition returns [EObject current=null] : iv_ruleUnnamedErrorPrediateDefinition= ruleUnnamedErrorPrediateDefinition EOF ;
    public final EObject entryRuleUnnamedErrorPrediateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedErrorPrediateDefinition = null;


        try {
            // InternalSolverLanguageParser.g:461:71: (iv_ruleUnnamedErrorPrediateDefinition= ruleUnnamedErrorPrediateDefinition EOF )
            // InternalSolverLanguageParser.g:462:2: iv_ruleUnnamedErrorPrediateDefinition= ruleUnnamedErrorPrediateDefinition EOF
            {
             newCompositeNode(grammarAccess.getUnnamedErrorPrediateDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnnamedErrorPrediateDefinition=ruleUnnamedErrorPrediateDefinition();

            state._fsp--;

             current =iv_ruleUnnamedErrorPrediateDefinition; 
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
    // $ANTLR end "entryRuleUnnamedErrorPrediateDefinition"


    // $ANTLR start "ruleUnnamedErrorPrediateDefinition"
    // InternalSolverLanguageParser.g:468:1: ruleUnnamedErrorPrediateDefinition returns [EObject current=null] : (otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) ) ) ;
    public final EObject ruleUnnamedErrorPrediateDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_argumentList_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:474:2: ( (otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:475:2: (otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:475:2: (otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:476:3: otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Error,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getUnnamedErrorPrediateDefinitionAccess().getErrorKeyword_0());
            		
            // InternalSolverLanguageParser.g:480:3: ( (lv_argumentList_1_0= ruleArgumentList ) )
            // InternalSolverLanguageParser.g:481:4: (lv_argumentList_1_0= ruleArgumentList )
            {
            // InternalSolverLanguageParser.g:481:4: (lv_argumentList_1_0= ruleArgumentList )
            // InternalSolverLanguageParser.g:482:5: lv_argumentList_1_0= ruleArgumentList
            {

            					newCompositeNode(grammarAccess.getUnnamedErrorPrediateDefinitionAccess().getArgumentListArgumentListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_argumentList_1_0=ruleArgumentList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnnamedErrorPrediateDefinitionRule());
            					}
            					set(
            						current,
            						"argumentList",
            						lv_argumentList_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ArgumentList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,ColonHyphenMinus,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUnnamedErrorPrediateDefinitionAccess().getColonHyphenMinusKeyword_2());
            		
            // InternalSolverLanguageParser.g:503:3: ( (lv_body_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:504:4: (lv_body_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:504:4: (lv_body_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:505:5: lv_body_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getUnnamedErrorPrediateDefinitionAccess().getBodyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnnamedErrorPrediateDefinitionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
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
    // $ANTLR end "ruleUnnamedErrorPrediateDefinition"


    // $ANTLR start "entryRuleDefaultDefinition"
    // InternalSolverLanguageParser.g:526:1: entryRuleDefaultDefinition returns [EObject current=null] : iv_ruleDefaultDefinition= ruleDefaultDefinition EOF ;
    public final EObject entryRuleDefaultDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultDefinition = null;


        try {
            // InternalSolverLanguageParser.g:526:58: (iv_ruleDefaultDefinition= ruleDefaultDefinition EOF )
            // InternalSolverLanguageParser.g:527:2: iv_ruleDefaultDefinition= ruleDefaultDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefaultDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultDefinition=ruleDefaultDefinition();

            state._fsp--;

             current =iv_ruleDefaultDefinition; 
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
    // $ANTLR end "entryRuleDefaultDefinition"


    // $ANTLR start "ruleDefaultDefinition"
    // InternalSolverLanguageParser.g:533:1: ruleDefaultDefinition returns [EObject current=null] : (otherlv_0= Default ( (lv_head_1_0= ruleCall ) ) otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) ) ;
    public final EObject ruleDefaultDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_head_1_0 = null;

        EObject lv_range_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:539:2: ( (otherlv_0= Default ( (lv_head_1_0= ruleCall ) ) otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:540:2: (otherlv_0= Default ( (lv_head_1_0= ruleCall ) ) otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:540:2: (otherlv_0= Default ( (lv_head_1_0= ruleCall ) ) otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:541:3: otherlv_0= Default ( (lv_head_1_0= ruleCall ) ) otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Default,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultDefinitionAccess().getDefaultKeyword_0());
            		
            // InternalSolverLanguageParser.g:545:3: ( (lv_head_1_0= ruleCall ) )
            // InternalSolverLanguageParser.g:546:4: (lv_head_1_0= ruleCall )
            {
            // InternalSolverLanguageParser.g:546:4: (lv_head_1_0= ruleCall )
            // InternalSolverLanguageParser.g:547:5: lv_head_1_0= ruleCall
            {

            					newCompositeNode(grammarAccess.getDefaultDefinitionAccess().getHeadCallParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_head_1_0=ruleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefaultDefinitionRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Call");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDefaultDefinitionAccess().getColonKeyword_2());
            		
            // InternalSolverLanguageParser.g:568:3: ( (lv_range_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:569:4: (lv_range_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:569:4: (lv_range_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:570:5: lv_range_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDefaultDefinitionAccess().getRangeExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_range_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefaultDefinitionRule());
            					}
            					set(
            						current,
            						"range",
            						lv_range_3_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
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
    // $ANTLR end "ruleDefaultDefinition"


    // $ANTLR start "entryRuleExternPredicateDefinition"
    // InternalSolverLanguageParser.g:591:1: entryRuleExternPredicateDefinition returns [EObject current=null] : iv_ruleExternPredicateDefinition= ruleExternPredicateDefinition EOF ;
    public final EObject entryRuleExternPredicateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternPredicateDefinition = null;


        try {
            // InternalSolverLanguageParser.g:591:66: (iv_ruleExternPredicateDefinition= ruleExternPredicateDefinition EOF )
            // InternalSolverLanguageParser.g:592:2: iv_ruleExternPredicateDefinition= ruleExternPredicateDefinition EOF
            {
             newCompositeNode(grammarAccess.getExternPredicateDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternPredicateDefinition=ruleExternPredicateDefinition();

            state._fsp--;

             current =iv_ruleExternPredicateDefinition; 
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
    // $ANTLR end "entryRuleExternPredicateDefinition"


    // $ANTLR start "ruleExternPredicateDefinition"
    // InternalSolverLanguageParser.g:598:1: ruleExternPredicateDefinition returns [EObject current=null] : (otherlv_0= Extern ( (lv_head_1_0= ruleCall ) ) ) ;
    public final EObject ruleExternPredicateDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_head_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:604:2: ( (otherlv_0= Extern ( (lv_head_1_0= ruleCall ) ) ) )
            // InternalSolverLanguageParser.g:605:2: (otherlv_0= Extern ( (lv_head_1_0= ruleCall ) ) )
            {
            // InternalSolverLanguageParser.g:605:2: (otherlv_0= Extern ( (lv_head_1_0= ruleCall ) ) )
            // InternalSolverLanguageParser.g:606:3: otherlv_0= Extern ( (lv_head_1_0= ruleCall ) )
            {
            otherlv_0=(Token)match(input,Extern,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExternPredicateDefinitionAccess().getExternKeyword_0());
            		
            // InternalSolverLanguageParser.g:610:3: ( (lv_head_1_0= ruleCall ) )
            // InternalSolverLanguageParser.g:611:4: (lv_head_1_0= ruleCall )
            {
            // InternalSolverLanguageParser.g:611:4: (lv_head_1_0= ruleCall )
            // InternalSolverLanguageParser.g:612:5: lv_head_1_0= ruleCall
            {

            					newCompositeNode(grammarAccess.getExternPredicateDefinitionAccess().getHeadCallParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_head_1_0=ruleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternPredicateDefinitionRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Call");
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
    // $ANTLR end "ruleExternPredicateDefinition"


    // $ANTLR start "entryRuleMetricDefinition"
    // InternalSolverLanguageParser.g:633:1: entryRuleMetricDefinition returns [EObject current=null] : iv_ruleMetricDefinition= ruleMetricDefinition EOF ;
    public final EObject entryRuleMetricDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricDefinition = null;


        try {
            // InternalSolverLanguageParser.g:633:57: (iv_ruleMetricDefinition= ruleMetricDefinition EOF )
            // InternalSolverLanguageParser.g:634:2: iv_ruleMetricDefinition= ruleMetricDefinition EOF
            {
             newCompositeNode(grammarAccess.getMetricDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetricDefinition=ruleMetricDefinition();

            state._fsp--;

             current =iv_ruleMetricDefinition; 
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
    // $ANTLR end "entryRuleMetricDefinition"


    // $ANTLR start "ruleMetricDefinition"
    // InternalSolverLanguageParser.g:640:1: ruleMetricDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleMetricType ) ) ( (lv_head_1_0= ruleExpression ) ) otherlv_2= EqualsSign ( (lv_body_3_0= ruleExpression ) ) ) ;
    public final EObject ruleMetricDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_head_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:646:2: ( ( ( (lv_type_0_0= ruleMetricType ) ) ( (lv_head_1_0= ruleExpression ) ) otherlv_2= EqualsSign ( (lv_body_3_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:647:2: ( ( (lv_type_0_0= ruleMetricType ) ) ( (lv_head_1_0= ruleExpression ) ) otherlv_2= EqualsSign ( (lv_body_3_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:647:2: ( ( (lv_type_0_0= ruleMetricType ) ) ( (lv_head_1_0= ruleExpression ) ) otherlv_2= EqualsSign ( (lv_body_3_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:648:3: ( (lv_type_0_0= ruleMetricType ) ) ( (lv_head_1_0= ruleExpression ) ) otherlv_2= EqualsSign ( (lv_body_3_0= ruleExpression ) )
            {
            // InternalSolverLanguageParser.g:648:3: ( (lv_type_0_0= ruleMetricType ) )
            // InternalSolverLanguageParser.g:649:4: (lv_type_0_0= ruleMetricType )
            {
            // InternalSolverLanguageParser.g:649:4: (lv_type_0_0= ruleMetricType )
            // InternalSolverLanguageParser.g:650:5: lv_type_0_0= ruleMetricType
            {

            					newCompositeNode(grammarAccess.getMetricDefinitionAccess().getTypeMetricTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_type_0_0=ruleMetricType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.MetricType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:667:3: ( (lv_head_1_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:668:4: (lv_head_1_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:668:4: (lv_head_1_0= ruleExpression )
            // InternalSolverLanguageParser.g:669:5: lv_head_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMetricDefinitionAccess().getHeadExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_head_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricDefinitionRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMetricDefinitionAccess().getEqualsSignKeyword_2());
            		
            // InternalSolverLanguageParser.g:690:3: ( (lv_body_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:691:4: (lv_body_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:691:4: (lv_body_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:692:5: lv_body_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMetricDefinitionAccess().getBodyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricDefinitionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
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
    // $ANTLR end "ruleMetricDefinition"


    // $ANTLR start "entryRuleExternMetricDefinition"
    // InternalSolverLanguageParser.g:713:1: entryRuleExternMetricDefinition returns [EObject current=null] : iv_ruleExternMetricDefinition= ruleExternMetricDefinition EOF ;
    public final EObject entryRuleExternMetricDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternMetricDefinition = null;


        try {
            // InternalSolverLanguageParser.g:713:63: (iv_ruleExternMetricDefinition= ruleExternMetricDefinition EOF )
            // InternalSolverLanguageParser.g:714:2: iv_ruleExternMetricDefinition= ruleExternMetricDefinition EOF
            {
             newCompositeNode(grammarAccess.getExternMetricDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternMetricDefinition=ruleExternMetricDefinition();

            state._fsp--;

             current =iv_ruleExternMetricDefinition; 
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
    // $ANTLR end "entryRuleExternMetricDefinition"


    // $ANTLR start "ruleExternMetricDefinition"
    // InternalSolverLanguageParser.g:720:1: ruleExternMetricDefinition returns [EObject current=null] : (otherlv_0= Extern ( (lv_type_1_0= ruleMetricType ) ) ( (lv_head_2_0= ruleCall ) ) ) ;
    public final EObject ruleExternMetricDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_head_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:726:2: ( (otherlv_0= Extern ( (lv_type_1_0= ruleMetricType ) ) ( (lv_head_2_0= ruleCall ) ) ) )
            // InternalSolverLanguageParser.g:727:2: (otherlv_0= Extern ( (lv_type_1_0= ruleMetricType ) ) ( (lv_head_2_0= ruleCall ) ) )
            {
            // InternalSolverLanguageParser.g:727:2: (otherlv_0= Extern ( (lv_type_1_0= ruleMetricType ) ) ( (lv_head_2_0= ruleCall ) ) )
            // InternalSolverLanguageParser.g:728:3: otherlv_0= Extern ( (lv_type_1_0= ruleMetricType ) ) ( (lv_head_2_0= ruleCall ) )
            {
            otherlv_0=(Token)match(input,Extern,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getExternMetricDefinitionAccess().getExternKeyword_0());
            		
            // InternalSolverLanguageParser.g:732:3: ( (lv_type_1_0= ruleMetricType ) )
            // InternalSolverLanguageParser.g:733:4: (lv_type_1_0= ruleMetricType )
            {
            // InternalSolverLanguageParser.g:733:4: (lv_type_1_0= ruleMetricType )
            // InternalSolverLanguageParser.g:734:5: lv_type_1_0= ruleMetricType
            {

            					newCompositeNode(grammarAccess.getExternMetricDefinitionAccess().getTypeMetricTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_1_0=ruleMetricType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternMetricDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.MetricType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:751:3: ( (lv_head_2_0= ruleCall ) )
            // InternalSolverLanguageParser.g:752:4: (lv_head_2_0= ruleCall )
            {
            // InternalSolverLanguageParser.g:752:4: (lv_head_2_0= ruleCall )
            // InternalSolverLanguageParser.g:753:5: lv_head_2_0= ruleCall
            {

            					newCompositeNode(grammarAccess.getExternMetricDefinitionAccess().getHeadCallParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_head_2_0=ruleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternMetricDefinitionRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_2_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Call");
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
    // $ANTLR end "ruleExternMetricDefinition"


    // $ANTLR start "entryRuleExpression"
    // InternalSolverLanguageParser.g:774:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSolverLanguageParser.g:774:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSolverLanguageParser.g:775:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSolverLanguageParser.g:781:1: ruleExpression returns [EObject current=null] : (this_IfElse_0= ruleIfElse | this_DisjunctiveExpression_1= ruleDisjunctiveExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfElse_0 = null;

        EObject this_DisjunctiveExpression_1 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:787:2: ( (this_IfElse_0= ruleIfElse | this_DisjunctiveExpression_1= ruleDisjunctiveExpression ) )
            // InternalSolverLanguageParser.g:788:2: (this_IfElse_0= ruleIfElse | this_DisjunctiveExpression_1= ruleDisjunctiveExpression )
            {
            // InternalSolverLanguageParser.g:788:2: (this_IfElse_0= ruleIfElse | this_DisjunctiveExpression_1= ruleDisjunctiveExpression )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==If) ) {
                alt8=1;
            }
            else if ( (LA8_0==Current||LA8_0==Unknown||(LA8_0>=Count && LA8_0<=False)||(LA8_0>=Must && LA8_0<=Prod)||LA8_0==True||(LA8_0>=Avg && LA8_0<=Inf)||(LA8_0>=Max && LA8_0<=Sum)||(LA8_0>=ExclamationMark && LA8_0<=LeftParenthesis)||LA8_0==PlusSign||LA8_0==HyphenMinus||LA8_0==LeftSquareBracket||(LA8_0>=RULE_STRING && LA8_0<=RULE_QUOTED_ID)||(LA8_0>=RULE_ID && LA8_0<=RULE_INT)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSolverLanguageParser.g:789:3: this_IfElse_0= ruleIfElse
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getIfElseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfElse_0=ruleIfElse();

                    state._fsp--;


                    			current = this_IfElse_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:798:3: this_DisjunctiveExpression_1= ruleDisjunctiveExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getDisjunctiveExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DisjunctiveExpression_1=ruleDisjunctiveExpression();

                    state._fsp--;


                    			current = this_DisjunctiveExpression_1;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIfElse"
    // InternalSolverLanguageParser.g:810:1: entryRuleIfElse returns [EObject current=null] : iv_ruleIfElse= ruleIfElse EOF ;
    public final EObject entryRuleIfElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElse = null;


        try {
            // InternalSolverLanguageParser.g:810:47: (iv_ruleIfElse= ruleIfElse EOF )
            // InternalSolverLanguageParser.g:811:2: iv_ruleIfElse= ruleIfElse EOF
            {
             newCompositeNode(grammarAccess.getIfElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfElse=ruleIfElse();

            state._fsp--;

             current =iv_ruleIfElse; 
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
    // $ANTLR end "entryRuleIfElse"


    // $ANTLR start "ruleIfElse"
    // InternalSolverLanguageParser.g:817:1: ruleIfElse returns [EObject current=null] : (otherlv_0= If ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) ) ) ;
    public final EObject ruleIfElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_5_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:823:2: ( (otherlv_0= If ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:824:2: (otherlv_0= If ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:824:2: (otherlv_0= If ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:825:3: otherlv_0= If ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,If,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIfElseAccess().getIfKeyword_0());
            		
            // InternalSolverLanguageParser.g:829:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:830:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:830:4: (lv_condition_1_0= ruleExpression )
            // InternalSolverLanguageParser.g:831:5: lv_condition_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfElseAccess().getConditionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_condition_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfElseRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Then,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getIfElseAccess().getThenKeyword_2());
            		
            // InternalSolverLanguageParser.g:852:3: ( (lv_then_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:853:4: (lv_then_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:853:4: (lv_then_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:854:5: lv_then_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfElseAccess().getThenExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_then_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfElseRule());
            					}
            					set(
            						current,
            						"then",
            						lv_then_3_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,Else,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getIfElseAccess().getElseKeyword_4());
            		
            // InternalSolverLanguageParser.g:875:3: ( (lv_else_5_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:876:4: (lv_else_5_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:876:4: (lv_else_5_0= ruleExpression )
            // InternalSolverLanguageParser.g:877:5: lv_else_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfElseAccess().getElseExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_else_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfElseRule());
            					}
            					set(
            						current,
            						"else",
            						lv_else_5_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
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
    // $ANTLR end "ruleIfElse"


    // $ANTLR start "entryRuleDisjunctiveExpression"
    // InternalSolverLanguageParser.g:898:1: entryRuleDisjunctiveExpression returns [EObject current=null] : iv_ruleDisjunctiveExpression= ruleDisjunctiveExpression EOF ;
    public final EObject entryRuleDisjunctiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctiveExpression = null;


        try {
            // InternalSolverLanguageParser.g:898:62: (iv_ruleDisjunctiveExpression= ruleDisjunctiveExpression EOF )
            // InternalSolverLanguageParser.g:899:2: iv_ruleDisjunctiveExpression= ruleDisjunctiveExpression EOF
            {
             newCompositeNode(grammarAccess.getDisjunctiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisjunctiveExpression=ruleDisjunctiveExpression();

            state._fsp--;

             current =iv_ruleDisjunctiveExpression; 
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
    // $ANTLR end "entryRuleDisjunctiveExpression"


    // $ANTLR start "ruleDisjunctiveExpression"
    // InternalSolverLanguageParser.g:905:1: ruleDisjunctiveExpression returns [EObject current=null] : (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )? ) ;
    public final EObject ruleDisjunctiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_ConjunctiveExpression_0 = null;

        EObject lv_children_3_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_cases_9_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:911:2: ( (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )? ) )
            // InternalSolverLanguageParser.g:912:2: (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )? )
            {
            // InternalSolverLanguageParser.g:912:2: (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )? )
            // InternalSolverLanguageParser.g:913:3: this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )?
            {

            			newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getConjunctiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_ConjunctiveExpression_0=ruleConjunctiveExpression();

            state._fsp--;


            			current = this_ConjunctiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:921:3: ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Semicolon) ) {
                alt11=1;
            }
            else if ( (LA11_0==HyphenMinusGreaterThanSign) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // InternalSolverLanguageParser.g:922:4: ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ )
                    {
                    // InternalSolverLanguageParser.g:922:4: ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ )
                    // InternalSolverLanguageParser.g:923:5: () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+
                    {
                    // InternalSolverLanguageParser.g:923:5: ()
                    // InternalSolverLanguageParser.g:924:6: 
                    {

                    						current = forceCreateModelElementAndAdd(
                    							grammarAccess.getDisjunctiveExpressionAccess().getDisjunctionChildrenAction_1_0_0(),
                    							current);
                    					

                    }

                    // InternalSolverLanguageParser.g:930:5: (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==Semicolon) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:931:6: otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_6); 

                    	    						newLeafNode(otherlv_2, grammarAccess.getDisjunctiveExpressionAccess().getSemicolonKeyword_1_0_1_0());
                    	    					
                    	    // InternalSolverLanguageParser.g:935:6: ( (lv_children_3_0= ruleConjunctiveExpression ) )
                    	    // InternalSolverLanguageParser.g:936:7: (lv_children_3_0= ruleConjunctiveExpression )
                    	    {
                    	    // InternalSolverLanguageParser.g:936:7: (lv_children_3_0= ruleConjunctiveExpression )
                    	    // InternalSolverLanguageParser.g:937:8: lv_children_3_0= ruleConjunctiveExpression
                    	    {

                    	    								newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getChildrenConjunctiveExpressionParserRuleCall_1_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_18);
                    	    lv_children_3_0=ruleConjunctiveExpression();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getDisjunctiveExpressionRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"children",
                    	    									lv_children_3_0,
                    	    									"org.eclipse.viatra.solver.language.SolverLanguage.ConjunctiveExpression");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:957:4: ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* )
                    {
                    // InternalSolverLanguageParser.g:957:4: ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* )
                    // InternalSolverLanguageParser.g:958:5: () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )*
                    {
                    // InternalSolverLanguageParser.g:958:5: ()
                    // InternalSolverLanguageParser.g:959:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getDisjunctiveExpressionAccess().getCaseConditionAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_5=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getDisjunctiveExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_1_1());
                    				
                    // InternalSolverLanguageParser.g:969:5: ( (lv_body_6_0= ruleConjunctiveExpression ) )
                    // InternalSolverLanguageParser.g:970:6: (lv_body_6_0= ruleConjunctiveExpression )
                    {
                    // InternalSolverLanguageParser.g:970:6: (lv_body_6_0= ruleConjunctiveExpression )
                    // InternalSolverLanguageParser.g:971:7: lv_body_6_0= ruleConjunctiveExpression
                    {

                    							newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getBodyConjunctiveExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_18);
                    lv_body_6_0=ruleConjunctiveExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDisjunctiveExpressionRule());
                    							}
                    							set(
                    								current,
                    								"body",
                    								lv_body_6_0,
                    								"org.eclipse.viatra.solver.language.SolverLanguage.ConjunctiveExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSolverLanguageParser.g:988:5: ()
                    // InternalSolverLanguageParser.g:989:6: 
                    {

                    						current = forceCreateModelElementAndAdd(
                    							grammarAccess.getDisjunctiveExpressionAccess().getSwitchCasesAction_1_1_3(),
                    							current);
                    					

                    }

                    // InternalSolverLanguageParser.g:995:5: (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Semicolon) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:996:6: otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Semicolon,FOLLOW_6); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getDisjunctiveExpressionAccess().getSemicolonKeyword_1_1_4_0());
                    	    					
                    	    // InternalSolverLanguageParser.g:1000:6: ( (lv_cases_9_0= ruleCase ) )
                    	    // InternalSolverLanguageParser.g:1001:7: (lv_cases_9_0= ruleCase )
                    	    {
                    	    // InternalSolverLanguageParser.g:1001:7: (lv_cases_9_0= ruleCase )
                    	    // InternalSolverLanguageParser.g:1002:8: lv_cases_9_0= ruleCase
                    	    {

                    	    								newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getCasesCaseParserRuleCall_1_1_4_1_0());
                    	    							
                    	    pushFollow(FOLLOW_18);
                    	    lv_cases_9_0=ruleCase();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getDisjunctiveExpressionRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"cases",
                    	    									lv_cases_9_0,
                    	    									"org.eclipse.viatra.solver.language.SolverLanguage.Case");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


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
    // $ANTLR end "ruleDisjunctiveExpression"


    // $ANTLR start "entryRuleCase"
    // InternalSolverLanguageParser.g:1026:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalSolverLanguageParser.g:1026:45: (iv_ruleCase= ruleCase EOF )
            // InternalSolverLanguageParser.g:1027:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalSolverLanguageParser.g:1033:1: ruleCase returns [EObject current=null] : ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_0_0 = null;

        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1039:2: ( ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) ) ) )
            // InternalSolverLanguageParser.g:1040:2: ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) ) )
            {
            // InternalSolverLanguageParser.g:1040:2: ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) ) )
            // InternalSolverLanguageParser.g:1041:3: ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) )
            {
            // InternalSolverLanguageParser.g:1041:3: ( (lv_condition_0_0= ruleConjunctiveExpression ) )
            // InternalSolverLanguageParser.g:1042:4: (lv_condition_0_0= ruleConjunctiveExpression )
            {
            // InternalSolverLanguageParser.g:1042:4: (lv_condition_0_0= ruleConjunctiveExpression )
            // InternalSolverLanguageParser.g:1043:5: lv_condition_0_0= ruleConjunctiveExpression
            {

            					newCompositeNode(grammarAccess.getCaseAccess().getConditionConjunctiveExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_condition_0_0=ruleConjunctiveExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_0_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ConjunctiveExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalSolverLanguageParser.g:1064:3: ( (lv_body_2_0= ruleConjunctiveExpression ) )
            // InternalSolverLanguageParser.g:1065:4: (lv_body_2_0= ruleConjunctiveExpression )
            {
            // InternalSolverLanguageParser.g:1065:4: (lv_body_2_0= ruleConjunctiveExpression )
            // InternalSolverLanguageParser.g:1066:5: lv_body_2_0= ruleConjunctiveExpression
            {

            					newCompositeNode(grammarAccess.getCaseAccess().getBodyConjunctiveExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_2_0=ruleConjunctiveExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_2_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ConjunctiveExpression");
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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleConjunctiveExpression"
    // InternalSolverLanguageParser.g:1087:1: entryRuleConjunctiveExpression returns [EObject current=null] : iv_ruleConjunctiveExpression= ruleConjunctiveExpression EOF ;
    public final EObject entryRuleConjunctiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctiveExpression = null;


        try {
            // InternalSolverLanguageParser.g:1087:62: (iv_ruleConjunctiveExpression= ruleConjunctiveExpression EOF )
            // InternalSolverLanguageParser.g:1088:2: iv_ruleConjunctiveExpression= ruleConjunctiveExpression EOF
            {
             newCompositeNode(grammarAccess.getConjunctiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConjunctiveExpression=ruleConjunctiveExpression();

            state._fsp--;

             current =iv_ruleConjunctiveExpression; 
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
    // $ANTLR end "entryRuleConjunctiveExpression"


    // $ANTLR start "ruleConjunctiveExpression"
    // InternalSolverLanguageParser.g:1094:1: ruleConjunctiveExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? ) ;
    public final EObject ruleConjunctiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_children_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1100:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? ) )
            // InternalSolverLanguageParser.g:1101:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? )
            {
            // InternalSolverLanguageParser.g:1101:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? )
            // InternalSolverLanguageParser.g:1102:3: this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getConjunctiveExpressionAccess().getComparisonExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;


            			current = this_ComparisonExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1110:3: ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Comma) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSolverLanguageParser.g:1111:4: () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+
                    {
                    // InternalSolverLanguageParser.g:1111:4: ()
                    // InternalSolverLanguageParser.g:1112:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getConjunctiveExpressionAccess().getConjunctionChildrenAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSolverLanguageParser.g:1118:4: (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Comma) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:1119:5: otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_6); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getConjunctiveExpressionAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalSolverLanguageParser.g:1123:5: ( (lv_children_3_0= ruleComparisonExpression ) )
                    	    // InternalSolverLanguageParser.g:1124:6: (lv_children_3_0= ruleComparisonExpression )
                    	    {
                    	    // InternalSolverLanguageParser.g:1124:6: (lv_children_3_0= ruleComparisonExpression )
                    	    // InternalSolverLanguageParser.g:1125:7: lv_children_3_0= ruleComparisonExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getConjunctiveExpressionAccess().getChildrenComparisonExpressionParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_children_3_0=ruleComparisonExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConjunctiveExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_3_0,
                    	    								"org.eclipse.viatra.solver.language.SolverLanguage.ComparisonExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
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
    // $ANTLR end "ruleConjunctiveExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalSolverLanguageParser.g:1148:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalSolverLanguageParser.g:1148:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalSolverLanguageParser.g:1149:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalSolverLanguageParser.g:1155:1: ruleComparisonExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1161:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) )
            // InternalSolverLanguageParser.g:1162:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            {
            // InternalSolverLanguageParser.g:1162:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            // InternalSolverLanguageParser.g:1163:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1171:3: ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ExclamationMarkEqualsSign||(LA14_0>=LessThanSignEqualsSign && LA14_0<=GreaterThanSignEqualsSign)||LA14_0==In||LA14_0==LessThanSign||LA14_0==GreaterThanSign) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSolverLanguageParser.g:1172:4: () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
                    {
                    // InternalSolverLanguageParser.g:1172:4: ()
                    // InternalSolverLanguageParser.g:1173:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getComparisonExpressionAccess().getComparisonLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSolverLanguageParser.g:1179:4: ( (lv_op_2_0= ruleComparisonOperator ) )
                    // InternalSolverLanguageParser.g:1180:5: (lv_op_2_0= ruleComparisonOperator )
                    {
                    // InternalSolverLanguageParser.g:1180:5: (lv_op_2_0= ruleComparisonOperator )
                    // InternalSolverLanguageParser.g:1181:6: lv_op_2_0= ruleComparisonOperator
                    {

                    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOpComparisonOperatorEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_op_2_0=ruleComparisonOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.ComparisonOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSolverLanguageParser.g:1198:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
                    // InternalSolverLanguageParser.g:1199:5: (lv_right_3_0= ruleAdditiveExpression )
                    {
                    // InternalSolverLanguageParser.g:1199:5: (lv_right_3_0= ruleAdditiveExpression )
                    // InternalSolverLanguageParser.g:1200:6: lv_right_3_0= ruleAdditiveExpression
                    {

                    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleAdditiveExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.AdditiveExpression");
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalSolverLanguageParser.g:1222:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalSolverLanguageParser.g:1222:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalSolverLanguageParser.g:1223:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalSolverLanguageParser.g:1229:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1235:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalSolverLanguageParser.g:1236:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalSolverLanguageParser.g:1236:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalSolverLanguageParser.g:1237:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1245:3: ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==PlusSign||LA15_0==HyphenMinus) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:1246:4: () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalSolverLanguageParser.g:1246:4: ()
            	    // InternalSolverLanguageParser.g:1247:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSolverLanguageParser.g:1253:4: ( (lv_op_2_0= ruleAdditiveBinaryOperator ) )
            	    // InternalSolverLanguageParser.g:1254:5: (lv_op_2_0= ruleAdditiveBinaryOperator )
            	    {
            	    // InternalSolverLanguageParser.g:1254:5: (lv_op_2_0= ruleAdditiveBinaryOperator )
            	    // InternalSolverLanguageParser.g:1255:6: lv_op_2_0= ruleAdditiveBinaryOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpAdditiveBinaryOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_op_2_0=ruleAdditiveBinaryOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"org.eclipse.viatra.solver.language.SolverLanguage.AdditiveBinaryOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalSolverLanguageParser.g:1272:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalSolverLanguageParser.g:1273:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalSolverLanguageParser.g:1273:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalSolverLanguageParser.g:1274:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.eclipse.viatra.solver.language.SolverLanguage.MultiplicativeExpression");
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalSolverLanguageParser.g:1296:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalSolverLanguageParser.g:1296:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalSolverLanguageParser.g:1297:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalSolverLanguageParser.g:1303:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentialExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1309:2: ( (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* ) )
            // InternalSolverLanguageParser.g:1310:2: (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* )
            {
            // InternalSolverLanguageParser.g:1310:2: (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* )
            // InternalSolverLanguageParser.g:1311:3: this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExponentialExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_ExponentialExpression_0=ruleExponentialExpression();

            state._fsp--;


            			current = this_ExponentialExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1319:3: ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Asterisk||LA16_0==Solidus) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:1320:4: () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) )
            	    {
            	    // InternalSolverLanguageParser.g:1320:4: ()
            	    // InternalSolverLanguageParser.g:1321:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSolverLanguageParser.g:1327:4: ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) )
            	    // InternalSolverLanguageParser.g:1328:5: (lv_op_2_0= ruleMultiplicativeBinaryOperator )
            	    {
            	    // InternalSolverLanguageParser.g:1328:5: (lv_op_2_0= ruleMultiplicativeBinaryOperator )
            	    // InternalSolverLanguageParser.g:1329:6: lv_op_2_0= ruleMultiplicativeBinaryOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpMultiplicativeBinaryOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_op_2_0=ruleMultiplicativeBinaryOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"org.eclipse.viatra.solver.language.SolverLanguage.MultiplicativeBinaryOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalSolverLanguageParser.g:1346:4: ( (lv_right_3_0= ruleExponentialExpression ) )
            	    // InternalSolverLanguageParser.g:1347:5: (lv_right_3_0= ruleExponentialExpression )
            	    {
            	    // InternalSolverLanguageParser.g:1347:5: (lv_right_3_0= ruleExponentialExpression )
            	    // InternalSolverLanguageParser.g:1348:6: lv_right_3_0= ruleExponentialExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightExponentialExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleExponentialExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.eclipse.viatra.solver.language.SolverLanguage.ExponentialExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleExponentialExpression"
    // InternalSolverLanguageParser.g:1370:1: entryRuleExponentialExpression returns [EObject current=null] : iv_ruleExponentialExpression= ruleExponentialExpression EOF ;
    public final EObject entryRuleExponentialExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialExpression = null;


        try {
            // InternalSolverLanguageParser.g:1370:62: (iv_ruleExponentialExpression= ruleExponentialExpression EOF )
            // InternalSolverLanguageParser.g:1371:2: iv_ruleExponentialExpression= ruleExponentialExpression EOF
            {
             newCompositeNode(grammarAccess.getExponentialExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponentialExpression=ruleExponentialExpression();

            state._fsp--;

             current =iv_ruleExponentialExpression; 
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
    // $ANTLR end "entryRuleExponentialExpression"


    // $ANTLR start "ruleExponentialExpression"
    // InternalSolverLanguageParser.g:1377:1: ruleExponentialExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )? ) ;
    public final EObject ruleExponentialExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1383:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )? ) )
            // InternalSolverLanguageParser.g:1384:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )? )
            {
            // InternalSolverLanguageParser.g:1384:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )? )
            // InternalSolverLanguageParser.g:1385:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getExponentialExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1393:3: ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==CircumflexAccent) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSolverLanguageParser.g:1394:4: () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleExponentialExpression ) )
                    {
                    // InternalSolverLanguageParser.g:1394:4: ()
                    // InternalSolverLanguageParser.g:1395:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExponentialExpressionAccess().getBinaryExpressionLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSolverLanguageParser.g:1401:4: ( (lv_op_2_0= ruleExponentialOp ) )
                    // InternalSolverLanguageParser.g:1402:5: (lv_op_2_0= ruleExponentialOp )
                    {
                    // InternalSolverLanguageParser.g:1402:5: (lv_op_2_0= ruleExponentialOp )
                    // InternalSolverLanguageParser.g:1403:6: lv_op_2_0= ruleExponentialOp
                    {

                    						newCompositeNode(grammarAccess.getExponentialExpressionAccess().getOpExponentialOpEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_op_2_0=ruleExponentialOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExponentialExpressionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.ExponentialOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSolverLanguageParser.g:1420:4: ( (lv_right_3_0= ruleExponentialExpression ) )
                    // InternalSolverLanguageParser.g:1421:5: (lv_right_3_0= ruleExponentialExpression )
                    {
                    // InternalSolverLanguageParser.g:1421:5: (lv_right_3_0= ruleExponentialExpression )
                    // InternalSolverLanguageParser.g:1422:6: lv_right_3_0= ruleExponentialExpression
                    {

                    						newCompositeNode(grammarAccess.getExponentialExpressionAccess().getRightExponentialExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExponentialExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExponentialExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.ExponentialExpression");
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
    // $ANTLR end "ruleExponentialExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalSolverLanguageParser.g:1444:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalSolverLanguageParser.g:1444:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalSolverLanguageParser.g:1445:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalSolverLanguageParser.g:1451:1: ruleUnaryExpression returns [EObject current=null] : (this_AggregationExpression_0= ruleAggregationExpression | ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AggregationExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1457:2: ( (this_AggregationExpression_0= ruleAggregationExpression | ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) ) ) )
            // InternalSolverLanguageParser.g:1458:2: (this_AggregationExpression_0= ruleAggregationExpression | ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) ) )
            {
            // InternalSolverLanguageParser.g:1458:2: (this_AggregationExpression_0= ruleAggregationExpression | ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Unknown||(LA18_0>=Count && LA18_0<=False)||(LA18_0>=Only && LA18_0<=Prod)||LA18_0==True||(LA18_0>=Avg && LA18_0<=Inf)||LA18_0==Max||(LA18_0>=Min && LA18_0<=Sum)||LA18_0==LeftParenthesis||LA18_0==LeftSquareBracket||(LA18_0>=RULE_STRING && LA18_0<=RULE_QUOTED_ID)||(LA18_0>=RULE_ID && LA18_0<=RULE_INT)) ) {
                alt18=1;
            }
            else if ( (LA18_0==Current||LA18_0==Must||LA18_0==May||LA18_0==ExclamationMark||LA18_0==PlusSign||LA18_0==HyphenMinus) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSolverLanguageParser.g:1459:3: this_AggregationExpression_0= ruleAggregationExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getAggregationExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AggregationExpression_0=ruleAggregationExpression();

                    state._fsp--;


                    			current = this_AggregationExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:1468:3: ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) )
                    {
                    // InternalSolverLanguageParser.g:1468:3: ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) )
                    // InternalSolverLanguageParser.g:1469:4: () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) )
                    {
                    // InternalSolverLanguageParser.g:1469:4: ()
                    // InternalSolverLanguageParser.g:1470:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSolverLanguageParser.g:1476:4: ( (lv_op_2_0= ruleUnaryOp ) )
                    // InternalSolverLanguageParser.g:1477:5: (lv_op_2_0= ruleUnaryOp )
                    {
                    // InternalSolverLanguageParser.g:1477:5: (lv_op_2_0= ruleUnaryOp )
                    // InternalSolverLanguageParser.g:1478:6: lv_op_2_0= ruleUnaryOp
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOpEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_op_2_0=ruleUnaryOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.UnaryOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSolverLanguageParser.g:1495:4: ( (lv_body_3_0= ruleAggregationExpression ) )
                    // InternalSolverLanguageParser.g:1496:5: (lv_body_3_0= ruleAggregationExpression )
                    {
                    // InternalSolverLanguageParser.g:1496:5: (lv_body_3_0= ruleAggregationExpression )
                    // InternalSolverLanguageParser.g:1497:6: lv_body_3_0= ruleAggregationExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getBodyAggregationExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_3_0=ruleAggregationExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_3_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.AggregationExpression");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleAggregationExpression"
    // InternalSolverLanguageParser.g:1519:1: entryRuleAggregationExpression returns [EObject current=null] : iv_ruleAggregationExpression= ruleAggregationExpression EOF ;
    public final EObject entryRuleAggregationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregationExpression = null;


        try {
            // InternalSolverLanguageParser.g:1519:62: (iv_ruleAggregationExpression= ruleAggregationExpression EOF )
            // InternalSolverLanguageParser.g:1520:2: iv_ruleAggregationExpression= ruleAggregationExpression EOF
            {
             newCompositeNode(grammarAccess.getAggregationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAggregationExpression=ruleAggregationExpression();

            state._fsp--;

             current =iv_ruleAggregationExpression; 
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
    // $ANTLR end "entryRuleAggregationExpression"


    // $ANTLR start "ruleAggregationExpression"
    // InternalSolverLanguageParser.g:1526:1: ruleAggregationExpression returns [EObject current=null] : (this_AtomicExpression_0= ruleAtomicExpression | this_Count_1= ruleCount | this_Aggregation_2= ruleAggregation ) ;
    public final EObject ruleAggregationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExpression_0 = null;

        EObject this_Count_1 = null;

        EObject this_Aggregation_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1532:2: ( (this_AtomicExpression_0= ruleAtomicExpression | this_Count_1= ruleCount | this_Aggregation_2= ruleAggregation ) )
            // InternalSolverLanguageParser.g:1533:2: (this_AtomicExpression_0= ruleAtomicExpression | this_Count_1= ruleCount | this_Aggregation_2= ruleAggregation )
            {
            // InternalSolverLanguageParser.g:1533:2: (this_AtomicExpression_0= ruleAtomicExpression | this_Count_1= ruleCount | this_Aggregation_2= ruleAggregation )
            int alt19=3;
            switch ( input.LA(1) ) {
            case Unknown:
            case Empty:
            case Error:
            case False:
            case True:
            case Inf:
            case LeftParenthesis:
            case LeftSquareBracket:
            case RULE_STRING:
            case RULE_QUOTED_ID:
            case RULE_ID:
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case Count:
                {
                alt19=2;
                }
                break;
            case Only:
            case Prod:
            case Avg:
            case Max:
            case Min:
            case Sum:
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
                    // InternalSolverLanguageParser.g:1534:3: this_AtomicExpression_0= ruleAtomicExpression
                    {

                    			newCompositeNode(grammarAccess.getAggregationExpressionAccess().getAtomicExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicExpression_0=ruleAtomicExpression();

                    state._fsp--;


                    			current = this_AtomicExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:1543:3: this_Count_1= ruleCount
                    {

                    			newCompositeNode(grammarAccess.getAggregationExpressionAccess().getCountParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Count_1=ruleCount();

                    state._fsp--;


                    			current = this_Count_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:1552:3: this_Aggregation_2= ruleAggregation
                    {

                    			newCompositeNode(grammarAccess.getAggregationExpressionAccess().getAggregationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Aggregation_2=ruleAggregation();

                    state._fsp--;


                    			current = this_Aggregation_2;
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
    // $ANTLR end "ruleAggregationExpression"


    // $ANTLR start "entryRuleCount"
    // InternalSolverLanguageParser.g:1564:1: entryRuleCount returns [EObject current=null] : iv_ruleCount= ruleCount EOF ;
    public final EObject entryRuleCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCount = null;


        try {
            // InternalSolverLanguageParser.g:1564:46: (iv_ruleCount= ruleCount EOF )
            // InternalSolverLanguageParser.g:1565:2: iv_ruleCount= ruleCount EOF
            {
             newCompositeNode(grammarAccess.getCountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCount=ruleCount();

            state._fsp--;

             current =iv_ruleCount; 
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
    // $ANTLR end "entryRuleCount"


    // $ANTLR start "ruleCount"
    // InternalSolverLanguageParser.g:1571:1: ruleCount returns [EObject current=null] : (otherlv_0= Count otherlv_1= LeftCurlyBracket ( (lv_body_2_0= ruleExpression ) ) otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleCount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1577:2: ( (otherlv_0= Count otherlv_1= LeftCurlyBracket ( (lv_body_2_0= ruleExpression ) ) otherlv_3= RightCurlyBracket ) )
            // InternalSolverLanguageParser.g:1578:2: (otherlv_0= Count otherlv_1= LeftCurlyBracket ( (lv_body_2_0= ruleExpression ) ) otherlv_3= RightCurlyBracket )
            {
            // InternalSolverLanguageParser.g:1578:2: (otherlv_0= Count otherlv_1= LeftCurlyBracket ( (lv_body_2_0= ruleExpression ) ) otherlv_3= RightCurlyBracket )
            // InternalSolverLanguageParser.g:1579:3: otherlv_0= Count otherlv_1= LeftCurlyBracket ( (lv_body_2_0= ruleExpression ) ) otherlv_3= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Count,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getCountAccess().getCountKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCountAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSolverLanguageParser.g:1587:3: ( (lv_body_2_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:1588:4: (lv_body_2_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:1588:4: (lv_body_2_0= ruleExpression )
            // InternalSolverLanguageParser.g:1589:5: lv_body_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCountAccess().getBodyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_body_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_2_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCountAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleCount"


    // $ANTLR start "entryRuleAggregation"
    // InternalSolverLanguageParser.g:1614:1: entryRuleAggregation returns [EObject current=null] : iv_ruleAggregation= ruleAggregation EOF ;
    public final EObject entryRuleAggregation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregation = null;


        try {
            // InternalSolverLanguageParser.g:1614:52: (iv_ruleAggregation= ruleAggregation EOF )
            // InternalSolverLanguageParser.g:1615:2: iv_ruleAggregation= ruleAggregation EOF
            {
             newCompositeNode(grammarAccess.getAggregationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAggregation=ruleAggregation();

            state._fsp--;

             current =iv_ruleAggregation; 
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
    // $ANTLR end "entryRuleAggregation"


    // $ANTLR start "ruleAggregation"
    // InternalSolverLanguageParser.g:1621:1: ruleAggregation returns [EObject current=null] : ( ( (lv_op_0_0= ruleAggregationOp ) ) otherlv_1= LeftCurlyBracket ( (lv_body_2_0= ruleExpression ) ) otherlv_3= VerticalLine ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleAggregation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_op_0_0 = null;

        EObject lv_body_2_0 = null;

        EObject lv_condition_4_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1627:2: ( ( ( (lv_op_0_0= ruleAggregationOp ) ) otherlv_1= LeftCurlyBracket ( (lv_body_2_0= ruleExpression ) ) otherlv_3= VerticalLine ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= RightCurlyBracket ) )
            // InternalSolverLanguageParser.g:1628:2: ( ( (lv_op_0_0= ruleAggregationOp ) ) otherlv_1= LeftCurlyBracket ( (lv_body_2_0= ruleExpression ) ) otherlv_3= VerticalLine ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= RightCurlyBracket )
            {
            // InternalSolverLanguageParser.g:1628:2: ( ( (lv_op_0_0= ruleAggregationOp ) ) otherlv_1= LeftCurlyBracket ( (lv_body_2_0= ruleExpression ) ) otherlv_3= VerticalLine ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= RightCurlyBracket )
            // InternalSolverLanguageParser.g:1629:3: ( (lv_op_0_0= ruleAggregationOp ) ) otherlv_1= LeftCurlyBracket ( (lv_body_2_0= ruleExpression ) ) otherlv_3= VerticalLine ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= RightCurlyBracket
            {
            // InternalSolverLanguageParser.g:1629:3: ( (lv_op_0_0= ruleAggregationOp ) )
            // InternalSolverLanguageParser.g:1630:4: (lv_op_0_0= ruleAggregationOp )
            {
            // InternalSolverLanguageParser.g:1630:4: (lv_op_0_0= ruleAggregationOp )
            // InternalSolverLanguageParser.g:1631:5: lv_op_0_0= ruleAggregationOp
            {

            					newCompositeNode(grammarAccess.getAggregationAccess().getOpAggregationOpEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_op_0_0=ruleAggregationOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregationRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_0_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.AggregationOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAggregationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSolverLanguageParser.g:1652:3: ( (lv_body_2_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:1653:4: (lv_body_2_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:1653:4: (lv_body_2_0= ruleExpression )
            // InternalSolverLanguageParser.g:1654:5: lv_body_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAggregationAccess().getBodyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_body_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregationRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_2_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,VerticalLine,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAggregationAccess().getVerticalLineKeyword_3());
            		
            // InternalSolverLanguageParser.g:1675:3: ( (lv_condition_4_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:1676:4: (lv_condition_4_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:1676:4: (lv_condition_4_0= ruleExpression )
            // InternalSolverLanguageParser.g:1677:5: lv_condition_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAggregationAccess().getConditionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_condition_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregationRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_4_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAggregationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAggregation"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalSolverLanguageParser.g:1702:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalSolverLanguageParser.g:1702:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalSolverLanguageParser.g:1703:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;

             current =iv_ruleAtomicExpression; 
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
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalSolverLanguageParser.g:1709:1: ruleAtomicExpression returns [EObject current=null] : (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Reference_0 = null;

        EObject this_Call_1 = null;

        EObject this_Interval_2 = null;

        EObject this_Literal_3 = null;

        EObject this_Expression_5 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1715:2: ( (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) ) )
            // InternalSolverLanguageParser.g:1716:2: (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) )
            {
            // InternalSolverLanguageParser.g:1716:2: (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) )
            int alt20=5;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalSolverLanguageParser.g:1717:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:1726:3: this_Call_1= ruleCall
                    {

                    			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Call_1=ruleCall();

                    state._fsp--;


                    			current = this_Call_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:1735:3: this_Interval_2= ruleInterval
                    {

                    			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getIntervalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interval_2=ruleInterval();

                    state._fsp--;


                    			current = this_Interval_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:1744:3: this_Literal_3= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSolverLanguageParser.g:1753:3: (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis )
                    {
                    // InternalSolverLanguageParser.g:1753:3: (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis )
                    // InternalSolverLanguageParser.g:1754:4: otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis
                    {
                    otherlv_4=(Token)match(input,LeftParenthesis,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomicExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_29);
                    this_Expression_5=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_4_2());
                    			

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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleCall"
    // InternalSolverLanguageParser.g:1775:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalSolverLanguageParser.g:1775:45: (iv_ruleCall= ruleCall EOF )
            // InternalSolverLanguageParser.g:1776:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalSolverLanguageParser.g:1782:1: ruleCall returns [EObject current=null] : ( ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) ) ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token lv_transitiveClosure_1_0=null;
        Token lv_reflexiveTransitiveClosure_2_0=null;
        EObject lv_functor_0_0 = null;

        EObject lv_argumentList_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1788:2: ( ( ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) ) ) )
            // InternalSolverLanguageParser.g:1789:2: ( ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) ) )
            {
            // InternalSolverLanguageParser.g:1789:2: ( ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) ) )
            // InternalSolverLanguageParser.g:1790:3: ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) )
            {
            // InternalSolverLanguageParser.g:1790:3: ( (lv_functor_0_0= ruleReference ) )
            // InternalSolverLanguageParser.g:1791:4: (lv_functor_0_0= ruleReference )
            {
            // InternalSolverLanguageParser.g:1791:4: (lv_functor_0_0= ruleReference )
            // InternalSolverLanguageParser.g:1792:5: lv_functor_0_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getCallAccess().getFunctorReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_functor_0_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCallRule());
            					}
            					set(
            						current,
            						"functor",
            						lv_functor_0_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:1809:3: ( ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_TRANSITIVE_CLOSURE) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_REFLEXIVE_TRANSITIVE_CLOSURE) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalSolverLanguageParser.g:1810:4: ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) )
                    {
                    // InternalSolverLanguageParser.g:1810:4: ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) )
                    // InternalSolverLanguageParser.g:1811:5: (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE )
                    {
                    // InternalSolverLanguageParser.g:1811:5: (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE )
                    // InternalSolverLanguageParser.g:1812:6: lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE
                    {
                    lv_transitiveClosure_1_0=(Token)match(input,RULE_TRANSITIVE_CLOSURE,FOLLOW_11); 

                    						newLeafNode(lv_transitiveClosure_1_0, grammarAccess.getCallAccess().getTransitiveClosureTRANSITIVE_CLOSURETerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCallRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"transitiveClosure",
                    							true,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.TRANSITIVE_CLOSURE");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:1829:4: ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) )
                    {
                    // InternalSolverLanguageParser.g:1829:4: ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) )
                    // InternalSolverLanguageParser.g:1830:5: (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE )
                    {
                    // InternalSolverLanguageParser.g:1830:5: (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE )
                    // InternalSolverLanguageParser.g:1831:6: lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE
                    {
                    lv_reflexiveTransitiveClosure_2_0=(Token)match(input,RULE_REFLEXIVE_TRANSITIVE_CLOSURE,FOLLOW_11); 

                    						newLeafNode(lv_reflexiveTransitiveClosure_2_0, grammarAccess.getCallAccess().getReflexiveTransitiveClosureREFLEXIVE_TRANSITIVE_CLOSURETerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCallRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"reflexiveTransitiveClosure",
                    							true,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.REFLEXIVE_TRANSITIVE_CLOSURE");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSolverLanguageParser.g:1848:3: ( (lv_argumentList_3_0= ruleArgumentList ) )
            // InternalSolverLanguageParser.g:1849:4: (lv_argumentList_3_0= ruleArgumentList )
            {
            // InternalSolverLanguageParser.g:1849:4: (lv_argumentList_3_0= ruleArgumentList )
            // InternalSolverLanguageParser.g:1850:5: lv_argumentList_3_0= ruleArgumentList
            {

            					newCompositeNode(grammarAccess.getCallAccess().getArgumentListArgumentListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_argumentList_3_0=ruleArgumentList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCallRule());
            					}
            					set(
            						current,
            						"argumentList",
            						lv_argumentList_3_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ArgumentList");
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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleArgumentList"
    // InternalSolverLanguageParser.g:1871:1: entryRuleArgumentList returns [EObject current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final EObject entryRuleArgumentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentList = null;


        try {
            // InternalSolverLanguageParser.g:1871:53: (iv_ruleArgumentList= ruleArgumentList EOF )
            // InternalSolverLanguageParser.g:1872:2: iv_ruleArgumentList= ruleArgumentList EOF
            {
             newCompositeNode(grammarAccess.getArgumentListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgumentList=ruleArgumentList();

            state._fsp--;

             current =iv_ruleArgumentList; 
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
    // $ANTLR end "entryRuleArgumentList"


    // $ANTLR start "ruleArgumentList"
    // InternalSolverLanguageParser.g:1878:1: ruleArgumentList returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleArgumentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1884:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalSolverLanguageParser.g:1885:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalSolverLanguageParser.g:1885:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis )
            // InternalSolverLanguageParser.g:1886:3: () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalSolverLanguageParser.g:1886:3: ()
            // InternalSolverLanguageParser.g:1887:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArgumentListAccess().getArgumentListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentListAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSolverLanguageParser.g:1897:3: ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Current||LA23_0==Unknown||(LA23_0>=Count && LA23_0<=False)||(LA23_0>=Must && LA23_0<=Prod)||LA23_0==True||(LA23_0>=Avg && LA23_0<=Inf)||(LA23_0>=Max && LA23_0<=Sum)||(LA23_0>=ExclamationMark && LA23_0<=LeftParenthesis)||(LA23_0>=Asterisk && LA23_0<=PlusSign)||LA23_0==HyphenMinus||LA23_0==LeftSquareBracket||(LA23_0>=RULE_STRING && LA23_0<=RULE_QUOTED_ID)||(LA23_0>=RULE_ID && LA23_0<=RULE_INT)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSolverLanguageParser.g:1898:4: ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )*
                    {
                    // InternalSolverLanguageParser.g:1898:4: ( (lv_arguments_2_0= ruleArgument ) )
                    // InternalSolverLanguageParser.g:1899:5: (lv_arguments_2_0= ruleArgument )
                    {
                    // InternalSolverLanguageParser.g:1899:5: (lv_arguments_2_0= ruleArgument )
                    // InternalSolverLanguageParser.g:1900:6: lv_arguments_2_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_arguments_2_0=ruleArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArgumentListRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.Argument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSolverLanguageParser.g:1917:4: (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Comma) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:1918:5: otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_33); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArgumentListAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSolverLanguageParser.g:1922:5: ( (lv_arguments_4_0= ruleArgument ) )
                    	    // InternalSolverLanguageParser.g:1923:6: (lv_arguments_4_0= ruleArgument )
                    	    {
                    	    // InternalSolverLanguageParser.g:1923:6: (lv_arguments_4_0= ruleArgument )
                    	    // InternalSolverLanguageParser.g:1924:7: lv_arguments_4_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_arguments_4_0=ruleArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArgumentListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_4_0,
                    	    								"org.eclipse.viatra.solver.language.SolverLanguage.Argument");
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

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArgumentListAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleArgumentList"


    // $ANTLR start "entryRuleArgument"
    // InternalSolverLanguageParser.g:1951:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalSolverLanguageParser.g:1951:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalSolverLanguageParser.g:1952:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalSolverLanguageParser.g:1958:1: ruleArgument returns [EObject current=null] : (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionArgument_0 = null;

        EObject this_StarArgument_1 = null;

        EObject this_TypedArgument_2 = null;

        EObject this_TypedStarArgument_3 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1964:2: ( (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument ) )
            // InternalSolverLanguageParser.g:1965:2: (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument )
            {
            // InternalSolverLanguageParser.g:1965:2: (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument )
            int alt24=4;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalSolverLanguageParser.g:1966:3: this_ExpressionArgument_0= ruleExpressionArgument
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getExpressionArgumentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionArgument_0=ruleExpressionArgument();

                    state._fsp--;


                    			current = this_ExpressionArgument_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:1975:3: this_StarArgument_1= ruleStarArgument
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getStarArgumentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StarArgument_1=ruleStarArgument();

                    state._fsp--;


                    			current = this_StarArgument_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:1984:3: this_TypedArgument_2= ruleTypedArgument
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getTypedArgumentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypedArgument_2=ruleTypedArgument();

                    state._fsp--;


                    			current = this_TypedArgument_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:1993:3: this_TypedStarArgument_3= ruleTypedStarArgument
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getTypedStarArgumentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypedStarArgument_3=ruleTypedStarArgument();

                    state._fsp--;


                    			current = this_TypedStarArgument_3;
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


    // $ANTLR start "entryRuleExpressionArgument"
    // InternalSolverLanguageParser.g:2005:1: entryRuleExpressionArgument returns [EObject current=null] : iv_ruleExpressionArgument= ruleExpressionArgument EOF ;
    public final EObject entryRuleExpressionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionArgument = null;


        try {
            // InternalSolverLanguageParser.g:2005:59: (iv_ruleExpressionArgument= ruleExpressionArgument EOF )
            // InternalSolverLanguageParser.g:2006:2: iv_ruleExpressionArgument= ruleExpressionArgument EOF
            {
             newCompositeNode(grammarAccess.getExpressionArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionArgument=ruleExpressionArgument();

            state._fsp--;

             current =iv_ruleExpressionArgument; 
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
    // $ANTLR end "entryRuleExpressionArgument"


    // $ANTLR start "ruleExpressionArgument"
    // InternalSolverLanguageParser.g:2012:1: ruleExpressionArgument returns [EObject current=null] : ( (lv_body_0_0= ruleComparisonExpression ) ) ;
    public final EObject ruleExpressionArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_body_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2018:2: ( ( (lv_body_0_0= ruleComparisonExpression ) ) )
            // InternalSolverLanguageParser.g:2019:2: ( (lv_body_0_0= ruleComparisonExpression ) )
            {
            // InternalSolverLanguageParser.g:2019:2: ( (lv_body_0_0= ruleComparisonExpression ) )
            // InternalSolverLanguageParser.g:2020:3: (lv_body_0_0= ruleComparisonExpression )
            {
            // InternalSolverLanguageParser.g:2020:3: (lv_body_0_0= ruleComparisonExpression )
            // InternalSolverLanguageParser.g:2021:4: lv_body_0_0= ruleComparisonExpression
            {

            				newCompositeNode(grammarAccess.getExpressionArgumentAccess().getBodyComparisonExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_body_0_0=ruleComparisonExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExpressionArgumentRule());
            				}
            				set(
            					current,
            					"body",
            					lv_body_0_0,
            					"org.eclipse.viatra.solver.language.SolverLanguage.ComparisonExpression");
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
    // $ANTLR end "ruleExpressionArgument"


    // $ANTLR start "entryRuleStarArgument"
    // InternalSolverLanguageParser.g:2041:1: entryRuleStarArgument returns [EObject current=null] : iv_ruleStarArgument= ruleStarArgument EOF ;
    public final EObject entryRuleStarArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStarArgument = null;


        try {
            // InternalSolverLanguageParser.g:2041:53: (iv_ruleStarArgument= ruleStarArgument EOF )
            // InternalSolverLanguageParser.g:2042:2: iv_ruleStarArgument= ruleStarArgument EOF
            {
             newCompositeNode(grammarAccess.getStarArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStarArgument=ruleStarArgument();

            state._fsp--;

             current =iv_ruleStarArgument; 
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
    // $ANTLR end "entryRuleStarArgument"


    // $ANTLR start "ruleStarArgument"
    // InternalSolverLanguageParser.g:2048:1: ruleStarArgument returns [EObject current=null] : ( () otherlv_1= Asterisk ) ;
    public final EObject ruleStarArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2054:2: ( ( () otherlv_1= Asterisk ) )
            // InternalSolverLanguageParser.g:2055:2: ( () otherlv_1= Asterisk )
            {
            // InternalSolverLanguageParser.g:2055:2: ( () otherlv_1= Asterisk )
            // InternalSolverLanguageParser.g:2056:3: () otherlv_1= Asterisk
            {
            // InternalSolverLanguageParser.g:2056:3: ()
            // InternalSolverLanguageParser.g:2057:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStarArgumentAccess().getStarArgumentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Asterisk,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStarArgumentAccess().getAsteriskKeyword_1());
            		

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
    // $ANTLR end "ruleStarArgument"


    // $ANTLR start "entryRuleTypedArgument"
    // InternalSolverLanguageParser.g:2071:1: entryRuleTypedArgument returns [EObject current=null] : iv_ruleTypedArgument= ruleTypedArgument EOF ;
    public final EObject entryRuleTypedArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedArgument = null;


        try {
            // InternalSolverLanguageParser.g:2071:54: (iv_ruleTypedArgument= ruleTypedArgument EOF )
            // InternalSolverLanguageParser.g:2072:2: iv_ruleTypedArgument= ruleTypedArgument EOF
            {
             newCompositeNode(grammarAccess.getTypedArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedArgument=ruleTypedArgument();

            state._fsp--;

             current =iv_ruleTypedArgument; 
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
    // $ANTLR end "entryRuleTypedArgument"


    // $ANTLR start "ruleTypedArgument"
    // InternalSolverLanguageParser.g:2078:1: ruleTypedArgument returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTypedArgument() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2084:2: ( ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalSolverLanguageParser.g:2085:2: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalSolverLanguageParser.g:2085:2: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) )
            // InternalSolverLanguageParser.g:2086:3: ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) )
            {
            // InternalSolverLanguageParser.g:2086:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:2087:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:2087:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:2088:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedArgumentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTypedArgumentAccess().getTypeNamedElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_8);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:2102:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:2103:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:2103:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:2104:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedArgumentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTypedArgumentAccess().getVariableNamedElementCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleTypedArgument"


    // $ANTLR start "entryRuleTypedStarArgument"
    // InternalSolverLanguageParser.g:2122:1: entryRuleTypedStarArgument returns [EObject current=null] : iv_ruleTypedStarArgument= ruleTypedStarArgument EOF ;
    public final EObject entryRuleTypedStarArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedStarArgument = null;


        try {
            // InternalSolverLanguageParser.g:2122:58: (iv_ruleTypedStarArgument= ruleTypedStarArgument EOF )
            // InternalSolverLanguageParser.g:2123:2: iv_ruleTypedStarArgument= ruleTypedStarArgument EOF
            {
             newCompositeNode(grammarAccess.getTypedStarArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedStarArgument=ruleTypedStarArgument();

            state._fsp--;

             current =iv_ruleTypedStarArgument; 
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
    // $ANTLR end "entryRuleTypedStarArgument"


    // $ANTLR start "ruleTypedStarArgument"
    // InternalSolverLanguageParser.g:2129:1: ruleTypedStarArgument returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= Asterisk ) ;
    public final EObject ruleTypedStarArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2135:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= Asterisk ) )
            // InternalSolverLanguageParser.g:2136:2: ( ( ( ruleQualifiedName ) ) otherlv_1= Asterisk )
            {
            // InternalSolverLanguageParser.g:2136:2: ( ( ( ruleQualifiedName ) ) otherlv_1= Asterisk )
            // InternalSolverLanguageParser.g:2137:3: ( ( ruleQualifiedName ) ) otherlv_1= Asterisk
            {
            // InternalSolverLanguageParser.g:2137:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:2138:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:2138:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:2139:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedStarArgumentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTypedStarArgumentAccess().getTypeNamedElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_34);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Asterisk,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTypedStarArgumentAccess().getAsteriskKeyword_1());
            		

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
    // $ANTLR end "ruleTypedStarArgument"


    // $ANTLR start "entryRuleReference"
    // InternalSolverLanguageParser.g:2161:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalSolverLanguageParser.g:2161:50: (iv_ruleReference= ruleReference EOF )
            // InternalSolverLanguageParser.g:2162:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalSolverLanguageParser.g:2168:1: ruleReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2174:2: ( ( ( ruleQualifiedName ) ) )
            // InternalSolverLanguageParser.g:2175:2: ( ( ruleQualifiedName ) )
            {
            // InternalSolverLanguageParser.g:2175:2: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:2176:3: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:2176:3: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:2177:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getReferenceRule());
            				}
            			

            				newCompositeNode(grammarAccess.getReferenceAccess().getReferredNamedElementCrossReference_0());
            			
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleInterval"
    // InternalSolverLanguageParser.g:2194:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalSolverLanguageParser.g:2194:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalSolverLanguageParser.g:2195:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
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
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // InternalSolverLanguageParser.g:2201:1: ruleInterval returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= RightSquareBracket ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lowerBound_1_0 = null;

        EObject lv_upperBound_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2207:2: ( (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= RightSquareBracket ) )
            // InternalSolverLanguageParser.g:2208:2: (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= RightSquareBracket )
            {
            // InternalSolverLanguageParser.g:2208:2: (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= RightSquareBracket )
            // InternalSolverLanguageParser.g:2209:3: otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSolverLanguageParser.g:2213:3: ( (lv_lowerBound_1_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:2214:4: (lv_lowerBound_1_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:2214:4: (lv_lowerBound_1_0= ruleExpression )
            // InternalSolverLanguageParser.g:2215:5: lv_lowerBound_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getLowerBoundExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_lowerBound_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervalRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,FullStopFullStop,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_2());
            		
            // InternalSolverLanguageParser.g:2236:3: ( (lv_upperBound_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:2237:4: (lv_upperBound_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:2237:4: (lv_upperBound_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:2238:5: lv_upperBound_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getUpperBoundExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_upperBound_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervalRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_3_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIntervalAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleLiteral"
    // InternalSolverLanguageParser.g:2263:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalSolverLanguageParser.g:2263:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalSolverLanguageParser.g:2264:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalSolverLanguageParser.g:2270:1: ruleLiteral returns [EObject current=null] : (this_LogicLiteral_0= ruleLogicLiteral | this_NumericLiteral_1= ruleNumericLiteral | this_InfinityLiteral_2= ruleInfinityLiteral | this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_LogicLiteral_0 = null;

        EObject this_NumericLiteral_1 = null;

        EObject this_InfinityLiteral_2 = null;

        EObject this_EmptyIntervalLiteral_3 = null;

        EObject this_StringLiteral_4 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2276:2: ( (this_LogicLiteral_0= ruleLogicLiteral | this_NumericLiteral_1= ruleNumericLiteral | this_InfinityLiteral_2= ruleInfinityLiteral | this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // InternalSolverLanguageParser.g:2277:2: (this_LogicLiteral_0= ruleLogicLiteral | this_NumericLiteral_1= ruleNumericLiteral | this_InfinityLiteral_2= ruleInfinityLiteral | this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // InternalSolverLanguageParser.g:2277:2: (this_LogicLiteral_0= ruleLogicLiteral | this_NumericLiteral_1= ruleNumericLiteral | this_InfinityLiteral_2= ruleInfinityLiteral | this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt25=5;
            switch ( input.LA(1) ) {
            case Unknown:
            case Error:
            case False:
            case True:
                {
                alt25=1;
                }
                break;
            case RULE_INT:
                {
                alt25=2;
                }
                break;
            case Inf:
                {
                alt25=3;
                }
                break;
            case Empty:
                {
                alt25=4;
                }
                break;
            case RULE_STRING:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalSolverLanguageParser.g:2278:3: this_LogicLiteral_0= ruleLogicLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getLogicLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicLiteral_0=ruleLogicLiteral();

                    state._fsp--;


                    			current = this_LogicLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:2287:3: this_NumericLiteral_1= ruleNumericLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getNumericLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericLiteral_1=ruleNumericLiteral();

                    state._fsp--;


                    			current = this_NumericLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:2296:3: this_InfinityLiteral_2= ruleInfinityLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getInfinityLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InfinityLiteral_2=ruleInfinityLiteral();

                    state._fsp--;


                    			current = this_InfinityLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:2305:3: this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getEmptyIntervalLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EmptyIntervalLiteral_3=ruleEmptyIntervalLiteral();

                    state._fsp--;


                    			current = this_EmptyIntervalLiteral_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSolverLanguageParser.g:2314:3: this_StringLiteral_4= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_4=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_4;
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


    // $ANTLR start "entryRuleLogicLiteral"
    // InternalSolverLanguageParser.g:2326:1: entryRuleLogicLiteral returns [EObject current=null] : iv_ruleLogicLiteral= ruleLogicLiteral EOF ;
    public final EObject entryRuleLogicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicLiteral = null;


        try {
            // InternalSolverLanguageParser.g:2326:53: (iv_ruleLogicLiteral= ruleLogicLiteral EOF )
            // InternalSolverLanguageParser.g:2327:2: iv_ruleLogicLiteral= ruleLogicLiteral EOF
            {
             newCompositeNode(grammarAccess.getLogicLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicLiteral=ruleLogicLiteral();

            state._fsp--;

             current =iv_ruleLogicLiteral; 
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
    // $ANTLR end "entryRuleLogicLiteral"


    // $ANTLR start "ruleLogicLiteral"
    // InternalSolverLanguageParser.g:2333:1: ruleLogicLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleLogicValue ) ) ;
    public final EObject ruleLogicLiteral() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2339:2: ( ( (lv_value_0_0= ruleLogicValue ) ) )
            // InternalSolverLanguageParser.g:2340:2: ( (lv_value_0_0= ruleLogicValue ) )
            {
            // InternalSolverLanguageParser.g:2340:2: ( (lv_value_0_0= ruleLogicValue ) )
            // InternalSolverLanguageParser.g:2341:3: (lv_value_0_0= ruleLogicValue )
            {
            // InternalSolverLanguageParser.g:2341:3: (lv_value_0_0= ruleLogicValue )
            // InternalSolverLanguageParser.g:2342:4: lv_value_0_0= ruleLogicValue
            {

            				newCompositeNode(grammarAccess.getLogicLiteralAccess().getValueLogicValueEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleLogicValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLogicLiteralRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.viatra.solver.language.SolverLanguage.LogicValue");
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
    // $ANTLR end "ruleLogicLiteral"


    // $ANTLR start "entryRuleNumericLiteral"
    // InternalSolverLanguageParser.g:2362:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalSolverLanguageParser.g:2362:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalSolverLanguageParser.g:2363:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumericLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericLiteral=ruleNumericLiteral();

            state._fsp--;

             current =iv_ruleNumericLiteral; 
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
    // $ANTLR end "entryRuleNumericLiteral"


    // $ANTLR start "ruleNumericLiteral"
    // InternalSolverLanguageParser.g:2369:1: ruleNumericLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleReal ) ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2375:2: ( ( (lv_value_0_0= ruleReal ) ) )
            // InternalSolverLanguageParser.g:2376:2: ( (lv_value_0_0= ruleReal ) )
            {
            // InternalSolverLanguageParser.g:2376:2: ( (lv_value_0_0= ruleReal ) )
            // InternalSolverLanguageParser.g:2377:3: (lv_value_0_0= ruleReal )
            {
            // InternalSolverLanguageParser.g:2377:3: (lv_value_0_0= ruleReal )
            // InternalSolverLanguageParser.g:2378:4: lv_value_0_0= ruleReal
            {

            				newCompositeNode(grammarAccess.getNumericLiteralAccess().getValueRealParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleReal();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumericLiteralRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.viatra.solver.language.SolverLanguage.Real");
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
    // $ANTLR end "ruleNumericLiteral"


    // $ANTLR start "entryRuleInfinityLiteral"
    // InternalSolverLanguageParser.g:2398:1: entryRuleInfinityLiteral returns [EObject current=null] : iv_ruleInfinityLiteral= ruleInfinityLiteral EOF ;
    public final EObject entryRuleInfinityLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfinityLiteral = null;


        try {
            // InternalSolverLanguageParser.g:2398:56: (iv_ruleInfinityLiteral= ruleInfinityLiteral EOF )
            // InternalSolverLanguageParser.g:2399:2: iv_ruleInfinityLiteral= ruleInfinityLiteral EOF
            {
             newCompositeNode(grammarAccess.getInfinityLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfinityLiteral=ruleInfinityLiteral();

            state._fsp--;

             current =iv_ruleInfinityLiteral; 
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
    // $ANTLR end "entryRuleInfinityLiteral"


    // $ANTLR start "ruleInfinityLiteral"
    // InternalSolverLanguageParser.g:2405:1: ruleInfinityLiteral returns [EObject current=null] : ( () otherlv_1= Inf ) ;
    public final EObject ruleInfinityLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2411:2: ( ( () otherlv_1= Inf ) )
            // InternalSolverLanguageParser.g:2412:2: ( () otherlv_1= Inf )
            {
            // InternalSolverLanguageParser.g:2412:2: ( () otherlv_1= Inf )
            // InternalSolverLanguageParser.g:2413:3: () otherlv_1= Inf
            {
            // InternalSolverLanguageParser.g:2413:3: ()
            // InternalSolverLanguageParser.g:2414:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfinityLiteralAccess().getInfinityLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Inf,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInfinityLiteralAccess().getInfKeyword_1());
            		

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
    // $ANTLR end "ruleInfinityLiteral"


    // $ANTLR start "entryRuleEmptyIntervalLiteral"
    // InternalSolverLanguageParser.g:2428:1: entryRuleEmptyIntervalLiteral returns [EObject current=null] : iv_ruleEmptyIntervalLiteral= ruleEmptyIntervalLiteral EOF ;
    public final EObject entryRuleEmptyIntervalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyIntervalLiteral = null;


        try {
            // InternalSolverLanguageParser.g:2428:61: (iv_ruleEmptyIntervalLiteral= ruleEmptyIntervalLiteral EOF )
            // InternalSolverLanguageParser.g:2429:2: iv_ruleEmptyIntervalLiteral= ruleEmptyIntervalLiteral EOF
            {
             newCompositeNode(grammarAccess.getEmptyIntervalLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmptyIntervalLiteral=ruleEmptyIntervalLiteral();

            state._fsp--;

             current =iv_ruleEmptyIntervalLiteral; 
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
    // $ANTLR end "entryRuleEmptyIntervalLiteral"


    // $ANTLR start "ruleEmptyIntervalLiteral"
    // InternalSolverLanguageParser.g:2435:1: ruleEmptyIntervalLiteral returns [EObject current=null] : ( () otherlv_1= Empty ) ;
    public final EObject ruleEmptyIntervalLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2441:2: ( ( () otherlv_1= Empty ) )
            // InternalSolverLanguageParser.g:2442:2: ( () otherlv_1= Empty )
            {
            // InternalSolverLanguageParser.g:2442:2: ( () otherlv_1= Empty )
            // InternalSolverLanguageParser.g:2443:3: () otherlv_1= Empty
            {
            // InternalSolverLanguageParser.g:2443:3: ()
            // InternalSolverLanguageParser.g:2444:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyIntervalLiteralAccess().getEmptyIntervalLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Empty,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEmptyIntervalLiteralAccess().getEmptyKeyword_1());
            		

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
    // $ANTLR end "ruleEmptyIntervalLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalSolverLanguageParser.g:2458:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalSolverLanguageParser.g:2458:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalSolverLanguageParser.g:2459:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalSolverLanguageParser.g:2465:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2471:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSolverLanguageParser.g:2472:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSolverLanguageParser.g:2472:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSolverLanguageParser.g:2473:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSolverLanguageParser.g:2473:3: (lv_value_0_0= RULE_STRING )
            // InternalSolverLanguageParser.g:2474:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.viatra.solver.language.SolverLanguage.STRING");
            			

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleClassDefinition"
    // InternalSolverLanguageParser.g:2493:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalSolverLanguageParser.g:2493:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalSolverLanguageParser.g:2494:2: iv_ruleClassDefinition= ruleClassDefinition EOF
            {
             newCompositeNode(grammarAccess.getClassDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDefinition=ruleClassDefinition();

            state._fsp--;

             current =iv_ruleClassDefinition; 
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
    // $ANTLR end "entryRuleClassDefinition"


    // $ANTLR start "ruleClassDefinition"
    // InternalSolverLanguageParser.g:2500:1: ruleClassDefinition returns [EObject current=null] : ( ( (lv_abstract_0_0= Abstract ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_7= LeftCurlyBracket ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= RightCurlyBracket ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_members_8_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2506:2: ( ( ( (lv_abstract_0_0= Abstract ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_7= LeftCurlyBracket ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= RightCurlyBracket ) )
            // InternalSolverLanguageParser.g:2507:2: ( ( (lv_abstract_0_0= Abstract ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_7= LeftCurlyBracket ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= RightCurlyBracket )
            {
            // InternalSolverLanguageParser.g:2507:2: ( ( (lv_abstract_0_0= Abstract ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_7= LeftCurlyBracket ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= RightCurlyBracket )
            // InternalSolverLanguageParser.g:2508:3: ( (lv_abstract_0_0= Abstract ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_7= LeftCurlyBracket ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= RightCurlyBracket
            {
            // InternalSolverLanguageParser.g:2508:3: ( (lv_abstract_0_0= Abstract ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Abstract) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSolverLanguageParser.g:2509:4: (lv_abstract_0_0= Abstract )
                    {
                    // InternalSolverLanguageParser.g:2509:4: (lv_abstract_0_0= Abstract )
                    // InternalSolverLanguageParser.g:2510:5: lv_abstract_0_0= Abstract
                    {
                    lv_abstract_0_0=(Token)match(input,Abstract,FOLLOW_37); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getClassDefinitionAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,Class,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getClassKeyword_1());
            		
            // InternalSolverLanguageParser.g:2526:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSolverLanguageParser.g:2527:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSolverLanguageParser.g:2527:4: (lv_name_2_0= RULE_ID )
            // InternalSolverLanguageParser.g:2528:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClassDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSolverLanguageParser.g:2544:3: (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Extends) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSolverLanguageParser.g:2545:4: otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,Extends,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassDefinitionAccess().getExtendsKeyword_3_0());
                    			
                    // InternalSolverLanguageParser.g:2549:4: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:2550:5: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:2550:5: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:2551:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassDefinitionAccess().getSuperclassesNamedElementCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSolverLanguageParser.g:2565:4: (otherlv_5= Comma ( ( ruleQualifiedName ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==Comma) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:2566:5: otherlv_5= Comma ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getClassDefinitionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalSolverLanguageParser.g:2570:5: ( ( ruleQualifiedName ) )
                    	    // InternalSolverLanguageParser.g:2571:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalSolverLanguageParser.g:2571:6: ( ruleQualifiedName )
                    	    // InternalSolverLanguageParser.g:2572:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClassDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getClassDefinitionAccess().getSuperclassesNamedElementCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
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

            otherlv_7=(Token)match(input,LeftCurlyBracket,FOLLOW_41); 

            			newLeafNode(otherlv_7, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSolverLanguageParser.g:2592:3: ( (lv_members_8_0= ruleMemberDefinition ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Contains||LA29_0==RULE_QUOTED_ID||LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:2593:4: (lv_members_8_0= ruleMemberDefinition )
            	    {
            	    // InternalSolverLanguageParser.g:2593:4: (lv_members_8_0= ruleMemberDefinition )
            	    // InternalSolverLanguageParser.g:2594:5: lv_members_8_0= ruleMemberDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getMembersMemberDefinitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_members_8_0=ruleMemberDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_8_0,
            	    						"org.eclipse.viatra.solver.language.SolverLanguage.MemberDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_9=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleClassDefinition"


    // $ANTLR start "entryRuleMemberDefinition"
    // InternalSolverLanguageParser.g:2619:1: entryRuleMemberDefinition returns [EObject current=null] : iv_ruleMemberDefinition= ruleMemberDefinition EOF ;
    public final EObject entryRuleMemberDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDefinition = null;


        try {
            // InternalSolverLanguageParser.g:2619:57: (iv_ruleMemberDefinition= ruleMemberDefinition EOF )
            // InternalSolverLanguageParser.g:2620:2: iv_ruleMemberDefinition= ruleMemberDefinition EOF
            {
             newCompositeNode(grammarAccess.getMemberDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemberDefinition=ruleMemberDefinition();

            state._fsp--;

             current =iv_ruleMemberDefinition; 
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
    // $ANTLR end "entryRuleMemberDefinition"


    // $ANTLR start "ruleMemberDefinition"
    // InternalSolverLanguageParser.g:2626:1: ruleMemberDefinition returns [EObject current=null] : ( ( (lv_containment_0_0= Contains ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_6= Semicolon )? ) ;
    public final EObject ruleMemberDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_containment_0_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_multiplicity_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2632:2: ( ( ( (lv_containment_0_0= Contains ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_6= Semicolon )? ) )
            // InternalSolverLanguageParser.g:2633:2: ( ( (lv_containment_0_0= Contains ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_6= Semicolon )? )
            {
            // InternalSolverLanguageParser.g:2633:2: ( ( (lv_containment_0_0= Contains ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_6= Semicolon )? )
            // InternalSolverLanguageParser.g:2634:3: ( (lv_containment_0_0= Contains ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_6= Semicolon )?
            {
            // InternalSolverLanguageParser.g:2634:3: ( (lv_containment_0_0= Contains ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Contains) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSolverLanguageParser.g:2635:4: (lv_containment_0_0= Contains )
                    {
                    // InternalSolverLanguageParser.g:2635:4: (lv_containment_0_0= Contains )
                    // InternalSolverLanguageParser.g:2636:5: lv_containment_0_0= Contains
                    {
                    lv_containment_0_0=(Token)match(input,Contains,FOLLOW_8); 

                    					newLeafNode(lv_containment_0_0, grammarAccess.getMemberDefinitionAccess().getContainmentContainsKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMemberDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "containment", true, "contains");
                    				

                    }


                    }
                    break;

            }

            // InternalSolverLanguageParser.g:2648:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:2649:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:2649:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:2650:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMemberDefinitionAccess().getTypeNamedElementCrossReference_1_0());
            				
            pushFollow(FOLLOW_42);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:2664:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LeftSquareBracket) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSolverLanguageParser.g:2665:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    {
                    // InternalSolverLanguageParser.g:2665:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    // InternalSolverLanguageParser.g:2666:5: lv_multiplicity_2_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getMemberDefinitionAccess().getMultiplicityMultiplicityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_multiplicity_2_0=ruleMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMemberDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"multiplicity",
                    						lv_multiplicity_2_0,
                    						"org.eclipse.viatra.solver.language.SolverLanguage.Multiplicity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSolverLanguageParser.g:2683:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSolverLanguageParser.g:2684:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSolverLanguageParser.g:2684:4: (lv_name_3_0= RULE_ID )
            // InternalSolverLanguageParser.g:2685:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(lv_name_3_0, grammarAccess.getMemberDefinitionAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSolverLanguageParser.g:2701:3: (otherlv_4= Opposite ( ( ruleQualifiedName ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Opposite) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSolverLanguageParser.g:2702:4: otherlv_4= Opposite ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,Opposite,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getMemberDefinitionAccess().getOppositeKeyword_4_0());
                    			
                    // InternalSolverLanguageParser.g:2706:4: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:2707:5: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:2707:5: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:2708:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMemberDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMemberDefinitionAccess().getOppositeNamedElementCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSolverLanguageParser.g:2723:3: (otherlv_6= Semicolon )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Semicolon) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSolverLanguageParser.g:2724:4: otherlv_6= Semicolon
                    {
                    otherlv_6=(Token)match(input,Semicolon,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getMemberDefinitionAccess().getSemicolonKeyword_5());
                    			

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
    // $ANTLR end "ruleMemberDefinition"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalSolverLanguageParser.g:2733:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalSolverLanguageParser.g:2733:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalSolverLanguageParser.g:2734:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalSolverLanguageParser.g:2740:1: ruleMultiplicity returns [EObject current=null] : (this_ManyMultiplicity_0= ruleManyMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject this_ManyMultiplicity_0 = null;

        EObject this_ExactMultiplicity_1 = null;

        EObject this_BoundedMultiplicity_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2746:2: ( (this_ManyMultiplicity_0= ruleManyMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity ) )
            // InternalSolverLanguageParser.g:2747:2: (this_ManyMultiplicity_0= ruleManyMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity )
            {
            // InternalSolverLanguageParser.g:2747:2: (this_ManyMultiplicity_0= ruleManyMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LeftSquareBracket) ) {
                switch ( input.LA(2) ) {
                case RULE_INT:
                    {
                    int LA34_2 = input.LA(3);

                    if ( (LA34_2==FullStopFullStop) ) {
                        alt34=3;
                    }
                    else if ( (LA34_2==RightSquareBracket) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case Asterisk:
                    {
                    alt34=2;
                    }
                    break;
                case RightSquareBracket:
                    {
                    alt34=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalSolverLanguageParser.g:2748:3: this_ManyMultiplicity_0= ruleManyMultiplicity
                    {

                    			newCompositeNode(grammarAccess.getMultiplicityAccess().getManyMultiplicityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManyMultiplicity_0=ruleManyMultiplicity();

                    state._fsp--;


                    			current = this_ManyMultiplicity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:2757:3: this_ExactMultiplicity_1= ruleExactMultiplicity
                    {

                    			newCompositeNode(grammarAccess.getMultiplicityAccess().getExactMultiplicityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExactMultiplicity_1=ruleExactMultiplicity();

                    state._fsp--;


                    			current = this_ExactMultiplicity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:2766:3: this_BoundedMultiplicity_2= ruleBoundedMultiplicity
                    {

                    			newCompositeNode(grammarAccess.getMultiplicityAccess().getBoundedMultiplicityParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoundedMultiplicity_2=ruleBoundedMultiplicity();

                    state._fsp--;


                    			current = this_BoundedMultiplicity_2;
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


    // $ANTLR start "entryRuleManyMultiplicity"
    // InternalSolverLanguageParser.g:2778:1: entryRuleManyMultiplicity returns [EObject current=null] : iv_ruleManyMultiplicity= ruleManyMultiplicity EOF ;
    public final EObject entryRuleManyMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyMultiplicity = null;


        try {
            // InternalSolverLanguageParser.g:2778:57: (iv_ruleManyMultiplicity= ruleManyMultiplicity EOF )
            // InternalSolverLanguageParser.g:2779:2: iv_ruleManyMultiplicity= ruleManyMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getManyMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManyMultiplicity=ruleManyMultiplicity();

            state._fsp--;

             current =iv_ruleManyMultiplicity; 
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
    // $ANTLR end "entryRuleManyMultiplicity"


    // $ANTLR start "ruleManyMultiplicity"
    // InternalSolverLanguageParser.g:2785:1: ruleManyMultiplicity returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket ) ;
    public final EObject ruleManyMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2791:2: ( ( () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket ) )
            // InternalSolverLanguageParser.g:2792:2: ( () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket )
            {
            // InternalSolverLanguageParser.g:2792:2: ( () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket )
            // InternalSolverLanguageParser.g:2793:3: () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket
            {
            // InternalSolverLanguageParser.g:2793:3: ()
            // InternalSolverLanguageParser.g:2794:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getManyMultiplicityAccess().getManyMultiplicityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getManyMultiplicityAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getManyMultiplicityAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleManyMultiplicity"


    // $ANTLR start "entryRuleExactMultiplicity"
    // InternalSolverLanguageParser.g:2812:1: entryRuleExactMultiplicity returns [EObject current=null] : iv_ruleExactMultiplicity= ruleExactMultiplicity EOF ;
    public final EObject entryRuleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactMultiplicity = null;


        try {
            // InternalSolverLanguageParser.g:2812:58: (iv_ruleExactMultiplicity= ruleExactMultiplicity EOF )
            // InternalSolverLanguageParser.g:2813:2: iv_ruleExactMultiplicity= ruleExactMultiplicity EOF
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
    // InternalSolverLanguageParser.g:2819:1: ruleExactMultiplicity returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket ) ;
    public final EObject ruleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_multiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2825:2: ( (otherlv_0= LeftSquareBracket ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket ) )
            // InternalSolverLanguageParser.g:2826:2: (otherlv_0= LeftSquareBracket ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket )
            {
            // InternalSolverLanguageParser.g:2826:2: (otherlv_0= LeftSquareBracket ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket )
            // InternalSolverLanguageParser.g:2827:3: otherlv_0= LeftSquareBracket ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getExactMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSolverLanguageParser.g:2831:3: ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) )
            // InternalSolverLanguageParser.g:2832:4: (lv_multiplicity_1_0= ruleUpperMultiplicty )
            {
            // InternalSolverLanguageParser.g:2832:4: (lv_multiplicity_1_0= ruleUpperMultiplicty )
            // InternalSolverLanguageParser.g:2833:5: lv_multiplicity_1_0= ruleUpperMultiplicty
            {

            					newCompositeNode(grammarAccess.getExactMultiplicityAccess().getMultiplicityUpperMultiplictyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
            lv_multiplicity_1_0=ruleUpperMultiplicty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExactMultiplicityRule());
            					}
            					set(
            						current,
            						"multiplicity",
            						lv_multiplicity_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.UpperMultiplicty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExactMultiplicityAccess().getRightSquareBracketKeyword_2());
            		

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


    // $ANTLR start "entryRuleBoundedMultiplicity"
    // InternalSolverLanguageParser.g:2858:1: entryRuleBoundedMultiplicity returns [EObject current=null] : iv_ruleBoundedMultiplicity= ruleBoundedMultiplicity EOF ;
    public final EObject entryRuleBoundedMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundedMultiplicity = null;


        try {
            // InternalSolverLanguageParser.g:2858:60: (iv_ruleBoundedMultiplicity= ruleBoundedMultiplicity EOF )
            // InternalSolverLanguageParser.g:2859:2: iv_ruleBoundedMultiplicity= ruleBoundedMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getBoundedMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundedMultiplicity=ruleBoundedMultiplicity();

            state._fsp--;

             current =iv_ruleBoundedMultiplicity; 
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
    // $ANTLR end "entryRuleBoundedMultiplicity"


    // $ANTLR start "ruleBoundedMultiplicity"
    // InternalSolverLanguageParser.g:2865:1: ruleBoundedMultiplicity returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket ) ;
    public final EObject ruleBoundedMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerBound_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2871:2: ( (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket ) )
            // InternalSolverLanguageParser.g:2872:2: (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket )
            {
            // InternalSolverLanguageParser.g:2872:2: (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket )
            // InternalSolverLanguageParser.g:2873:3: otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getBoundedMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSolverLanguageParser.g:2877:3: ( (lv_lowerBound_1_0= RULE_INT ) )
            // InternalSolverLanguageParser.g:2878:4: (lv_lowerBound_1_0= RULE_INT )
            {
            // InternalSolverLanguageParser.g:2878:4: (lv_lowerBound_1_0= RULE_INT )
            // InternalSolverLanguageParser.g:2879:5: lv_lowerBound_1_0= RULE_INT
            {
            lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_35); 

            					newLeafNode(lv_lowerBound_1_0, grammarAccess.getBoundedMultiplicityAccess().getLowerBoundINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundedMultiplicityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lowerBound",
            						lv_lowerBound_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,FullStopFullStop,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getBoundedMultiplicityAccess().getFullStopFullStopKeyword_2());
            		
            // InternalSolverLanguageParser.g:2899:3: ( (lv_upperBound_3_0= ruleUpperMultiplicty ) )
            // InternalSolverLanguageParser.g:2900:4: (lv_upperBound_3_0= ruleUpperMultiplicty )
            {
            // InternalSolverLanguageParser.g:2900:4: (lv_upperBound_3_0= ruleUpperMultiplicty )
            // InternalSolverLanguageParser.g:2901:5: lv_upperBound_3_0= ruleUpperMultiplicty
            {

            					newCompositeNode(grammarAccess.getBoundedMultiplicityAccess().getUpperBoundUpperMultiplictyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_upperBound_3_0=ruleUpperMultiplicty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoundedMultiplicityRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_3_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.UpperMultiplicty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBoundedMultiplicityAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBoundedMultiplicity"


    // $ANTLR start "entryRuleScopeDefinition"
    // InternalSolverLanguageParser.g:2926:1: entryRuleScopeDefinition returns [EObject current=null] : iv_ruleScopeDefinition= ruleScopeDefinition EOF ;
    public final EObject entryRuleScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDefinition = null;


        try {
            // InternalSolverLanguageParser.g:2926:56: (iv_ruleScopeDefinition= ruleScopeDefinition EOF )
            // InternalSolverLanguageParser.g:2927:2: iv_ruleScopeDefinition= ruleScopeDefinition EOF
            {
             newCompositeNode(grammarAccess.getScopeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScopeDefinition=ruleScopeDefinition();

            state._fsp--;

             current =iv_ruleScopeDefinition; 
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
    // $ANTLR end "entryRuleScopeDefinition"


    // $ANTLR start "ruleScopeDefinition"
    // InternalSolverLanguageParser.g:2933:1: ruleScopeDefinition returns [EObject current=null] : (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition ) ;
    public final EObject ruleScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ExactScopeDefinition_0 = null;

        EObject this_BoundedScopeDefinition_1 = null;

        EObject this_LowerBoundedScopeDefinition_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2939:2: ( (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition ) )
            // InternalSolverLanguageParser.g:2940:2: (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition )
            {
            // InternalSolverLanguageParser.g:2940:2: (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition )
            int alt35=3;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalSolverLanguageParser.g:2941:3: this_ExactScopeDefinition_0= ruleExactScopeDefinition
                    {

                    			newCompositeNode(grammarAccess.getScopeDefinitionAccess().getExactScopeDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExactScopeDefinition_0=ruleExactScopeDefinition();

                    state._fsp--;


                    			current = this_ExactScopeDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:2950:3: this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition
                    {

                    			newCompositeNode(grammarAccess.getScopeDefinitionAccess().getBoundedScopeDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoundedScopeDefinition_1=ruleBoundedScopeDefinition();

                    state._fsp--;


                    			current = this_BoundedScopeDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:2959:3: this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition
                    {

                    			newCompositeNode(grammarAccess.getScopeDefinitionAccess().getLowerBoundedScopeDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LowerBoundedScopeDefinition_2=ruleLowerBoundedScopeDefinition();

                    state._fsp--;


                    			current = this_LowerBoundedScopeDefinition_2;
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
    // $ANTLR end "ruleScopeDefinition"


    // $ANTLR start "entryRuleExactScopeDefinition"
    // InternalSolverLanguageParser.g:2971:1: entryRuleExactScopeDefinition returns [EObject current=null] : iv_ruleExactScopeDefinition= ruleExactScopeDefinition EOF ;
    public final EObject entryRuleExactScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactScopeDefinition = null;


        try {
            // InternalSolverLanguageParser.g:2971:61: (iv_ruleExactScopeDefinition= ruleExactScopeDefinition EOF )
            // InternalSolverLanguageParser.g:2972:2: iv_ruleExactScopeDefinition= ruleExactScopeDefinition EOF
            {
             newCompositeNode(grammarAccess.getExactScopeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExactScopeDefinition=ruleExactScopeDefinition();

            state._fsp--;

             current =iv_ruleExactScopeDefinition; 
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
    // $ANTLR end "entryRuleExactScopeDefinition"


    // $ANTLR start "ruleExactScopeDefinition"
    // InternalSolverLanguageParser.g:2978:1: ruleExactScopeDefinition returns [EObject current=null] : (otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_exactScope_3_0= RULE_INT ) ) ) ;
    public final EObject ruleExactScopeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_exactScope_3_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2984:2: ( (otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_exactScope_3_0= RULE_INT ) ) ) )
            // InternalSolverLanguageParser.g:2985:2: (otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_exactScope_3_0= RULE_INT ) ) )
            {
            // InternalSolverLanguageParser.g:2985:2: (otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_exactScope_3_0= RULE_INT ) ) )
            // InternalSolverLanguageParser.g:2986:3: otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_exactScope_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,Scope,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExactScopeDefinitionAccess().getScopeKeyword_0());
            		
            // InternalSolverLanguageParser.g:2990:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:2991:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:2991:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:2992:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExactScopeDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExactScopeDefinitionAccess().getTypeNamedElementCrossReference_1_0());
            				
            pushFollow(FOLLOW_46);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSignEqualsSign,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getExactScopeDefinitionAccess().getEqualsSignEqualsSignKeyword_2());
            		
            // InternalSolverLanguageParser.g:3010:3: ( (lv_exactScope_3_0= RULE_INT ) )
            // InternalSolverLanguageParser.g:3011:4: (lv_exactScope_3_0= RULE_INT )
            {
            // InternalSolverLanguageParser.g:3011:4: (lv_exactScope_3_0= RULE_INT )
            // InternalSolverLanguageParser.g:3012:5: lv_exactScope_3_0= RULE_INT
            {
            lv_exactScope_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_exactScope_3_0, grammarAccess.getExactScopeDefinitionAccess().getExactScopeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExactScopeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"exactScope",
            						lv_exactScope_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleExactScopeDefinition"


    // $ANTLR start "entryRuleBoundedScopeDefinition"
    // InternalSolverLanguageParser.g:3032:1: entryRuleBoundedScopeDefinition returns [EObject current=null] : iv_ruleBoundedScopeDefinition= ruleBoundedScopeDefinition EOF ;
    public final EObject entryRuleBoundedScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundedScopeDefinition = null;


        try {
            // InternalSolverLanguageParser.g:3032:63: (iv_ruleBoundedScopeDefinition= ruleBoundedScopeDefinition EOF )
            // InternalSolverLanguageParser.g:3033:2: iv_ruleBoundedScopeDefinition= ruleBoundedScopeDefinition EOF
            {
             newCompositeNode(grammarAccess.getBoundedScopeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundedScopeDefinition=ruleBoundedScopeDefinition();

            state._fsp--;

             current =iv_ruleBoundedScopeDefinition; 
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
    // $ANTLR end "entryRuleBoundedScopeDefinition"


    // $ANTLR start "ruleBoundedScopeDefinition"
    // InternalSolverLanguageParser.g:3039:1: ruleBoundedScopeDefinition returns [EObject current=null] : (otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) ) ;
    public final EObject ruleBoundedScopeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerBound_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_upperBound_5_0=null;
        Token lv_upperBound_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_lowerBound_10_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3045:2: ( (otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) ) )
            // InternalSolverLanguageParser.g:3046:2: (otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) )
            {
            // InternalSolverLanguageParser.g:3046:2: (otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) )
            // InternalSolverLanguageParser.g:3047:3: otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) )
            {
            otherlv_0=(Token)match(input,Scope,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getBoundedScopeDefinitionAccess().getScopeKeyword_0());
            		
            // InternalSolverLanguageParser.g:3051:3: ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==GreaterThanSignEqualsSign) ) {
                    alt38=2;
                }
                else if ( (LA38_1==LessThanSignEqualsSign) ) {
                    alt38=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA38_0==RULE_QUOTED_ID||LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalSolverLanguageParser.g:3052:4: ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) )
                    {
                    // InternalSolverLanguageParser.g:3052:4: ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) )
                    // InternalSolverLanguageParser.g:3053:5: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) )
                    {
                    // InternalSolverLanguageParser.g:3053:5: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_INT) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalSolverLanguageParser.g:3054:6: ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign
                            {
                            // InternalSolverLanguageParser.g:3054:6: ( (lv_lowerBound_1_0= RULE_INT ) )
                            // InternalSolverLanguageParser.g:3055:7: (lv_lowerBound_1_0= RULE_INT )
                            {
                            // InternalSolverLanguageParser.g:3055:7: (lv_lowerBound_1_0= RULE_INT )
                            // InternalSolverLanguageParser.g:3056:8: lv_lowerBound_1_0= RULE_INT
                            {
                            lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_48); 

                            								newLeafNode(lv_lowerBound_1_0, grammarAccess.getBoundedScopeDefinitionAccess().getLowerBoundINTTerminalRuleCall_1_0_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBoundedScopeDefinitionRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"lowerBound",
                            									lv_lowerBound_1_0,
                            									"org.eclipse.xtext.common.Terminals.INT");
                            							

                            }


                            }

                            otherlv_2=(Token)match(input,LessThanSignEqualsSign,FOLLOW_8); 

                            						newLeafNode(otherlv_2, grammarAccess.getBoundedScopeDefinitionAccess().getLessThanSignEqualsSignKeyword_1_0_0_1());
                            					

                            }
                            break;

                    }

                    // InternalSolverLanguageParser.g:3077:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:3078:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:3078:6: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:3079:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBoundedScopeDefinitionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getBoundedScopeDefinitionAccess().getTypeNamedElementCrossReference_1_0_1_0());
                    						
                    pushFollow(FOLLOW_48);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,LessThanSignEqualsSign,FOLLOW_45); 

                    					newLeafNode(otherlv_4, grammarAccess.getBoundedScopeDefinitionAccess().getLessThanSignEqualsSignKeyword_1_0_2());
                    				
                    // InternalSolverLanguageParser.g:3097:5: ( (lv_upperBound_5_0= RULE_INT ) )
                    // InternalSolverLanguageParser.g:3098:6: (lv_upperBound_5_0= RULE_INT )
                    {
                    // InternalSolverLanguageParser.g:3098:6: (lv_upperBound_5_0= RULE_INT )
                    // InternalSolverLanguageParser.g:3099:7: lv_upperBound_5_0= RULE_INT
                    {
                    lv_upperBound_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    							newLeafNode(lv_upperBound_5_0, grammarAccess.getBoundedScopeDefinitionAccess().getUpperBoundINTTerminalRuleCall_1_0_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBoundedScopeDefinitionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"upperBound",
                    								lv_upperBound_5_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:3117:4: ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? )
                    {
                    // InternalSolverLanguageParser.g:3117:4: ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? )
                    // InternalSolverLanguageParser.g:3118:5: ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )?
                    {
                    // InternalSolverLanguageParser.g:3118:5: ( (lv_upperBound_6_0= RULE_INT ) )
                    // InternalSolverLanguageParser.g:3119:6: (lv_upperBound_6_0= RULE_INT )
                    {
                    // InternalSolverLanguageParser.g:3119:6: (lv_upperBound_6_0= RULE_INT )
                    // InternalSolverLanguageParser.g:3120:7: lv_upperBound_6_0= RULE_INT
                    {
                    lv_upperBound_6_0=(Token)match(input,RULE_INT,FOLLOW_49); 

                    							newLeafNode(lv_upperBound_6_0, grammarAccess.getBoundedScopeDefinitionAccess().getUpperBoundINTTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBoundedScopeDefinitionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"upperBound",
                    								lv_upperBound_6_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_8); 

                    					newLeafNode(otherlv_7, grammarAccess.getBoundedScopeDefinitionAccess().getGreaterThanSignEqualsSignKeyword_1_1_1());
                    				
                    // InternalSolverLanguageParser.g:3140:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:3141:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:3141:6: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:3142:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBoundedScopeDefinitionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getBoundedScopeDefinitionAccess().getTypeNamedElementCrossReference_1_1_2_0());
                    						
                    pushFollow(FOLLOW_50);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSolverLanguageParser.g:3156:5: (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==GreaterThanSignEqualsSign) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalSolverLanguageParser.g:3157:6: otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) )
                            {
                            otherlv_9=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_45); 

                            						newLeafNode(otherlv_9, grammarAccess.getBoundedScopeDefinitionAccess().getGreaterThanSignEqualsSignKeyword_1_1_3_0());
                            					
                            // InternalSolverLanguageParser.g:3161:6: ( (lv_lowerBound_10_0= RULE_INT ) )
                            // InternalSolverLanguageParser.g:3162:7: (lv_lowerBound_10_0= RULE_INT )
                            {
                            // InternalSolverLanguageParser.g:3162:7: (lv_lowerBound_10_0= RULE_INT )
                            // InternalSolverLanguageParser.g:3163:8: lv_lowerBound_10_0= RULE_INT
                            {
                            lv_lowerBound_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                            								newLeafNode(lv_lowerBound_10_0, grammarAccess.getBoundedScopeDefinitionAccess().getLowerBoundINTTerminalRuleCall_1_1_3_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBoundedScopeDefinitionRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"lowerBound",
                            									lv_lowerBound_10_0,
                            									"org.eclipse.xtext.common.Terminals.INT");
                            							

                            }


                            }


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
    // $ANTLR end "ruleBoundedScopeDefinition"


    // $ANTLR start "entryRuleLowerBoundedScopeDefinition"
    // InternalSolverLanguageParser.g:3186:1: entryRuleLowerBoundedScopeDefinition returns [EObject current=null] : iv_ruleLowerBoundedScopeDefinition= ruleLowerBoundedScopeDefinition EOF ;
    public final EObject entryRuleLowerBoundedScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerBoundedScopeDefinition = null;


        try {
            // InternalSolverLanguageParser.g:3186:68: (iv_ruleLowerBoundedScopeDefinition= ruleLowerBoundedScopeDefinition EOF )
            // InternalSolverLanguageParser.g:3187:2: iv_ruleLowerBoundedScopeDefinition= ruleLowerBoundedScopeDefinition EOF
            {
             newCompositeNode(grammarAccess.getLowerBoundedScopeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLowerBoundedScopeDefinition=ruleLowerBoundedScopeDefinition();

            state._fsp--;

             current =iv_ruleLowerBoundedScopeDefinition; 
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
    // $ANTLR end "entryRuleLowerBoundedScopeDefinition"


    // $ANTLR start "ruleLowerBoundedScopeDefinition"
    // InternalSolverLanguageParser.g:3193:1: ruleLowerBoundedScopeDefinition returns [EObject current=null] : (otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) ) ;
    public final EObject ruleLowerBoundedScopeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerBound_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_lowerBound_6_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3199:2: ( (otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) ) )
            // InternalSolverLanguageParser.g:3200:2: (otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) )
            {
            // InternalSolverLanguageParser.g:3200:2: (otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) )
            // InternalSolverLanguageParser.g:3201:3: otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) )
            {
            otherlv_0=(Token)match(input,Scope,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerBoundedScopeDefinitionAccess().getScopeKeyword_0());
            		
            // InternalSolverLanguageParser.g:3205:3: ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_QUOTED_ID||LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalSolverLanguageParser.g:3206:4: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) )
                    {
                    // InternalSolverLanguageParser.g:3206:4: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) )
                    // InternalSolverLanguageParser.g:3207:5: ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) )
                    {
                    // InternalSolverLanguageParser.g:3207:5: ( (lv_lowerBound_1_0= RULE_INT ) )
                    // InternalSolverLanguageParser.g:3208:6: (lv_lowerBound_1_0= RULE_INT )
                    {
                    // InternalSolverLanguageParser.g:3208:6: (lv_lowerBound_1_0= RULE_INT )
                    // InternalSolverLanguageParser.g:3209:7: lv_lowerBound_1_0= RULE_INT
                    {
                    lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_48); 

                    							newLeafNode(lv_lowerBound_1_0, grammarAccess.getLowerBoundedScopeDefinitionAccess().getLowerBoundINTTerminalRuleCall_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLowerBoundedScopeDefinitionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"lowerBound",
                    								lv_lowerBound_1_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,LessThanSignEqualsSign,FOLLOW_8); 

                    					newLeafNode(otherlv_2, grammarAccess.getLowerBoundedScopeDefinitionAccess().getLessThanSignEqualsSignKeyword_1_0_1());
                    				
                    // InternalSolverLanguageParser.g:3229:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:3230:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:3230:6: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:3231:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLowerBoundedScopeDefinitionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLowerBoundedScopeDefinitionAccess().getTypeNamedElementCrossReference_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:3247:4: ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) )
                    {
                    // InternalSolverLanguageParser.g:3247:4: ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) )
                    // InternalSolverLanguageParser.g:3248:5: ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) )
                    {
                    // InternalSolverLanguageParser.g:3248:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:3249:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:3249:6: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:3250:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLowerBoundedScopeDefinitionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLowerBoundedScopeDefinitionAccess().getTypeNamedElementCrossReference_1_1_0_0());
                    						
                    pushFollow(FOLLOW_49);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_45); 

                    					newLeafNode(otherlv_5, grammarAccess.getLowerBoundedScopeDefinitionAccess().getGreaterThanSignEqualsSignKeyword_1_1_1());
                    				
                    // InternalSolverLanguageParser.g:3268:5: ( (lv_lowerBound_6_0= RULE_INT ) )
                    // InternalSolverLanguageParser.g:3269:6: (lv_lowerBound_6_0= RULE_INT )
                    {
                    // InternalSolverLanguageParser.g:3269:6: (lv_lowerBound_6_0= RULE_INT )
                    // InternalSolverLanguageParser.g:3270:7: lv_lowerBound_6_0= RULE_INT
                    {
                    lv_lowerBound_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    							newLeafNode(lv_lowerBound_6_0, grammarAccess.getLowerBoundedScopeDefinitionAccess().getLowerBoundINTTerminalRuleCall_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLowerBoundedScopeDefinitionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"lowerBound",
                    								lv_lowerBound_6_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


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
    // $ANTLR end "ruleLowerBoundedScopeDefinition"


    // $ANTLR start "entryRuleObjectiveDefinition"
    // InternalSolverLanguageParser.g:3292:1: entryRuleObjectiveDefinition returns [EObject current=null] : iv_ruleObjectiveDefinition= ruleObjectiveDefinition EOF ;
    public final EObject entryRuleObjectiveDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectiveDefinition = null;


        try {
            // InternalSolverLanguageParser.g:3292:60: (iv_ruleObjectiveDefinition= ruleObjectiveDefinition EOF )
            // InternalSolverLanguageParser.g:3293:2: iv_ruleObjectiveDefinition= ruleObjectiveDefinition EOF
            {
             newCompositeNode(grammarAccess.getObjectiveDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectiveDefinition=ruleObjectiveDefinition();

            state._fsp--;

             current =iv_ruleObjectiveDefinition; 
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
    // $ANTLR end "entryRuleObjectiveDefinition"


    // $ANTLR start "ruleObjectiveDefinition"
    // InternalSolverLanguageParser.g:3299:1: ruleObjectiveDefinition returns [EObject current=null] : ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) ) ;
    public final EObject ruleObjectiveDefinition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        EObject lv_objective_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3305:2: ( ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:3306:2: ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:3306:2: ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:3307:3: ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) )
            {
            // InternalSolverLanguageParser.g:3307:3: ( (lv_kind_0_0= ruleObjectiveKind ) )
            // InternalSolverLanguageParser.g:3308:4: (lv_kind_0_0= ruleObjectiveKind )
            {
            // InternalSolverLanguageParser.g:3308:4: (lv_kind_0_0= ruleObjectiveKind )
            // InternalSolverLanguageParser.g:3309:5: lv_kind_0_0= ruleObjectiveKind
            {

            					newCompositeNode(grammarAccess.getObjectiveDefinitionAccess().getKindObjectiveKindEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_kind_0_0=ruleObjectiveKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectiveDefinitionRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_0_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ObjectiveKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:3326:3: ( (lv_objective_1_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:3327:4: (lv_objective_1_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:3327:4: (lv_objective_1_0= ruleExpression )
            // InternalSolverLanguageParser.g:3328:5: lv_objective_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getObjectiveDefinitionAccess().getObjectiveExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_objective_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectiveDefinitionRule());
            					}
            					set(
            						current,
            						"objective",
            						lv_objective_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
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
    // $ANTLR end "ruleObjectiveDefinition"


    // $ANTLR start "entryRuleUpperMultiplicty"
    // InternalSolverLanguageParser.g:3349:1: entryRuleUpperMultiplicty returns [String current=null] : iv_ruleUpperMultiplicty= ruleUpperMultiplicty EOF ;
    public final String entryRuleUpperMultiplicty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUpperMultiplicty = null;


        try {
            // InternalSolverLanguageParser.g:3349:56: (iv_ruleUpperMultiplicty= ruleUpperMultiplicty EOF )
            // InternalSolverLanguageParser.g:3350:2: iv_ruleUpperMultiplicty= ruleUpperMultiplicty EOF
            {
             newCompositeNode(grammarAccess.getUpperMultiplictyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpperMultiplicty=ruleUpperMultiplicty();

            state._fsp--;

             current =iv_ruleUpperMultiplicty.getText(); 
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
    // $ANTLR end "entryRuleUpperMultiplicty"


    // $ANTLR start "ruleUpperMultiplicty"
    // InternalSolverLanguageParser.g:3356:1: ruleUpperMultiplicty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= Asterisk ) ;
    public final AntlrDatatypeRuleToken ruleUpperMultiplicty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3362:2: ( (this_INT_0= RULE_INT | kw= Asterisk ) )
            // InternalSolverLanguageParser.g:3363:2: (this_INT_0= RULE_INT | kw= Asterisk )
            {
            // InternalSolverLanguageParser.g:3363:2: (this_INT_0= RULE_INT | kw= Asterisk )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT) ) {
                alt40=1;
            }
            else if ( (LA40_0==Asterisk) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalSolverLanguageParser.g:3364:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getUpperMultiplictyAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:3372:3: kw= Asterisk
                    {
                    kw=(Token)match(input,Asterisk,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUpperMultiplictyAccess().getAsteriskKeyword_1());
                    		

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
    // $ANTLR end "ruleUpperMultiplicty"


    // $ANTLR start "entryRuleReal"
    // InternalSolverLanguageParser.g:3381:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguageParser.g:3383:2: (iv_ruleReal= ruleReal EOF )
            // InternalSolverLanguageParser.g:3384:2: iv_ruleReal= ruleReal EOF
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalSolverLanguageParser.g:3393:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguageParser.g:3400:2: ( (this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )? ) )
            // InternalSolverLanguageParser.g:3401:2: (this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )? )
            {
            // InternalSolverLanguageParser.g:3401:2: (this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )? )
            // InternalSolverLanguageParser.g:3402:3: this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_51); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getRealAccess().getINTTerminalRuleCall_0());
            		
            // InternalSolverLanguageParser.g:3409:3: (kw= FullStop this_INT_2= RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==FullStop) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSolverLanguageParser.g:3410:4: kw= FullStop this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,FullStop,FOLLOW_45); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getRealAccess().getINTTerminalRuleCall_1_1());
                    			

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSolverLanguageParser.g:3430:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguageParser.g:3432:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSolverLanguageParser.g:3433:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSolverLanguageParser.g:3442:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) | this_QUOTED_ID_3= RULE_QUOTED_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_QUOTED_ID_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguageParser.g:3449:2: ( ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) | this_QUOTED_ID_3= RULE_QUOTED_ID ) )
            // InternalSolverLanguageParser.g:3450:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) | this_QUOTED_ID_3= RULE_QUOTED_ID )
            {
            // InternalSolverLanguageParser.g:3450:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) | this_QUOTED_ID_3= RULE_QUOTED_ID )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_QUOTED_ID) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalSolverLanguageParser.g:3451:3: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
                    {
                    // InternalSolverLanguageParser.g:3451:3: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
                    // InternalSolverLanguageParser.g:3452:4: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_51); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0());
                    			
                    // InternalSolverLanguageParser.g:3459:4: (kw= FullStop this_ID_2= RULE_ID )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==FullStop) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:3460:5: kw= FullStop this_ID_2= RULE_ID
                    	    {
                    	    kw=(Token)match(input,FullStop,FOLLOW_38); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1_0());
                    	    				
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_51); 

                    	    					current.merge(this_ID_2);
                    	    				

                    	    					newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:3475:3: this_QUOTED_ID_3= RULE_QUOTED_ID
                    {
                    this_QUOTED_ID_3=(Token)match(input,RULE_QUOTED_ID,FOLLOW_2); 

                    			current.merge(this_QUOTED_ID_3);
                    		

                    			newLeafNode(this_QUOTED_ID_3, grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_1());
                    		

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


    // $ANTLR start "ruleMetricType"
    // InternalSolverLanguageParser.g:3489:1: ruleMetricType returns [Enumerator current=null] : ( (enumLiteral_0= Int ) | (enumLiteral_1= Real ) ) ;
    public final Enumerator ruleMetricType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3495:2: ( ( (enumLiteral_0= Int ) | (enumLiteral_1= Real ) ) )
            // InternalSolverLanguageParser.g:3496:2: ( (enumLiteral_0= Int ) | (enumLiteral_1= Real ) )
            {
            // InternalSolverLanguageParser.g:3496:2: ( (enumLiteral_0= Int ) | (enumLiteral_1= Real ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Int) ) {
                alt44=1;
            }
            else if ( (LA44_0==Real) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalSolverLanguageParser.g:3497:3: (enumLiteral_0= Int )
                    {
                    // InternalSolverLanguageParser.g:3497:3: (enumLiteral_0= Int )
                    // InternalSolverLanguageParser.g:3498:4: enumLiteral_0= Int
                    {
                    enumLiteral_0=(Token)match(input,Int,FOLLOW_2); 

                    				current = grammarAccess.getMetricTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMetricTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:3505:3: (enumLiteral_1= Real )
                    {
                    // InternalSolverLanguageParser.g:3505:3: (enumLiteral_1= Real )
                    // InternalSolverLanguageParser.g:3506:4: enumLiteral_1= Real
                    {
                    enumLiteral_1=(Token)match(input,Real,FOLLOW_2); 

                    				current = grammarAccess.getMetricTypeAccess().getREALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMetricTypeAccess().getREALEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleMetricType"


    // $ANTLR start "ruleComparisonOperator"
    // InternalSolverLanguageParser.g:3516:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) | (enumLiteral_6= In ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3522:2: ( ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) | (enumLiteral_6= In ) ) )
            // InternalSolverLanguageParser.g:3523:2: ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) | (enumLiteral_6= In ) )
            {
            // InternalSolverLanguageParser.g:3523:2: ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) | (enumLiteral_6= In ) )
            int alt45=7;
            switch ( input.LA(1) ) {
            case EqualsSignEqualsSign:
                {
                alt45=1;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt45=2;
                }
                break;
            case LessThanSign:
                {
                alt45=3;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt45=4;
                }
                break;
            case GreaterThanSign:
                {
                alt45=5;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt45=6;
                }
                break;
            case In:
                {
                alt45=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalSolverLanguageParser.g:3524:3: (enumLiteral_0= EqualsSignEqualsSign )
                    {
                    // InternalSolverLanguageParser.g:3524:3: (enumLiteral_0= EqualsSignEqualsSign )
                    // InternalSolverLanguageParser.g:3525:4: enumLiteral_0= EqualsSignEqualsSign
                    {
                    enumLiteral_0=(Token)match(input,EqualsSignEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:3532:3: (enumLiteral_1= ExclamationMarkEqualsSign )
                    {
                    // InternalSolverLanguageParser.g:3532:3: (enumLiteral_1= ExclamationMarkEqualsSign )
                    // InternalSolverLanguageParser.g:3533:4: enumLiteral_1= ExclamationMarkEqualsSign
                    {
                    enumLiteral_1=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getNOT_EQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getNOT_EQEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:3540:3: (enumLiteral_2= LessThanSign )
                    {
                    // InternalSolverLanguageParser.g:3540:3: (enumLiteral_2= LessThanSign )
                    // InternalSolverLanguageParser.g:3541:4: enumLiteral_2= LessThanSign
                    {
                    enumLiteral_2=(Token)match(input,LessThanSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:3548:3: (enumLiteral_3= LessThanSignEqualsSign )
                    {
                    // InternalSolverLanguageParser.g:3548:3: (enumLiteral_3= LessThanSignEqualsSign )
                    // InternalSolverLanguageParser.g:3549:4: enumLiteral_3= LessThanSignEqualsSign
                    {
                    enumLiteral_3=(Token)match(input,LessThanSignEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESS_EQEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getLESS_EQEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSolverLanguageParser.g:3556:3: (enumLiteral_4= GreaterThanSign )
                    {
                    // InternalSolverLanguageParser.g:3556:3: (enumLiteral_4= GreaterThanSign )
                    // InternalSolverLanguageParser.g:3557:4: enumLiteral_4= GreaterThanSign
                    {
                    enumLiteral_4=(Token)match(input,GreaterThanSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSolverLanguageParser.g:3564:3: (enumLiteral_5= GreaterThanSignEqualsSign )
                    {
                    // InternalSolverLanguageParser.g:3564:3: (enumLiteral_5= GreaterThanSignEqualsSign )
                    // InternalSolverLanguageParser.g:3565:4: enumLiteral_5= GreaterThanSignEqualsSign
                    {
                    enumLiteral_5=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATER_EQEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getGREATER_EQEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSolverLanguageParser.g:3572:3: (enumLiteral_6= In )
                    {
                    // InternalSolverLanguageParser.g:3572:3: (enumLiteral_6= In )
                    // InternalSolverLanguageParser.g:3573:4: enumLiteral_6= In
                    {
                    enumLiteral_6=(Token)match(input,In,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getINEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getComparisonOperatorAccess().getINEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleAdditiveBinaryOperator"
    // InternalSolverLanguageParser.g:3583:1: ruleAdditiveBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) ) ;
    public final Enumerator ruleAdditiveBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3589:2: ( ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) ) )
            // InternalSolverLanguageParser.g:3590:2: ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) )
            {
            // InternalSolverLanguageParser.g:3590:2: ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==PlusSign) ) {
                alt46=1;
            }
            else if ( (LA46_0==HyphenMinus) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalSolverLanguageParser.g:3591:3: (enumLiteral_0= PlusSign )
                    {
                    // InternalSolverLanguageParser.g:3591:3: (enumLiteral_0= PlusSign )
                    // InternalSolverLanguageParser.g:3592:4: enumLiteral_0= PlusSign
                    {
                    enumLiteral_0=(Token)match(input,PlusSign,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveBinaryOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveBinaryOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:3599:3: (enumLiteral_1= HyphenMinus )
                    {
                    // InternalSolverLanguageParser.g:3599:3: (enumLiteral_1= HyphenMinus )
                    // InternalSolverLanguageParser.g:3600:4: enumLiteral_1= HyphenMinus
                    {
                    enumLiteral_1=(Token)match(input,HyphenMinus,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveBinaryOperatorAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAdditiveBinaryOperatorAccess().getSUBEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAdditiveBinaryOperator"


    // $ANTLR start "ruleMultiplicativeBinaryOperator"
    // InternalSolverLanguageParser.g:3610:1: ruleMultiplicativeBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) ) ;
    public final Enumerator ruleMultiplicativeBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3616:2: ( ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) ) )
            // InternalSolverLanguageParser.g:3617:2: ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) )
            {
            // InternalSolverLanguageParser.g:3617:2: ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Asterisk) ) {
                alt47=1;
            }
            else if ( (LA47_0==Solidus) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalSolverLanguageParser.g:3618:3: (enumLiteral_0= Asterisk )
                    {
                    // InternalSolverLanguageParser.g:3618:3: (enumLiteral_0= Asterisk )
                    // InternalSolverLanguageParser.g:3619:4: enumLiteral_0= Asterisk
                    {
                    enumLiteral_0=(Token)match(input,Asterisk,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeBinaryOperatorAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeBinaryOperatorAccess().getMULEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:3626:3: (enumLiteral_1= Solidus )
                    {
                    // InternalSolverLanguageParser.g:3626:3: (enumLiteral_1= Solidus )
                    // InternalSolverLanguageParser.g:3627:4: enumLiteral_1= Solidus
                    {
                    enumLiteral_1=(Token)match(input,Solidus,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeBinaryOperatorAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeBinaryOperatorAccess().getDIVEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleMultiplicativeBinaryOperator"


    // $ANTLR start "ruleExponentialOp"
    // InternalSolverLanguageParser.g:3637:1: ruleExponentialOp returns [Enumerator current=null] : (enumLiteral_0= CircumflexAccent ) ;
    public final Enumerator ruleExponentialOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3643:2: ( (enumLiteral_0= CircumflexAccent ) )
            // InternalSolverLanguageParser.g:3644:2: (enumLiteral_0= CircumflexAccent )
            {
            // InternalSolverLanguageParser.g:3644:2: (enumLiteral_0= CircumflexAccent )
            // InternalSolverLanguageParser.g:3645:3: enumLiteral_0= CircumflexAccent
            {
            enumLiteral_0=(Token)match(input,CircumflexAccent,FOLLOW_2); 

            			current = grammarAccess.getExponentialOpAccess().getPOWEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getExponentialOpAccess().getPOWEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleExponentialOp"


    // $ANTLR start "ruleUnaryOp"
    // InternalSolverLanguageParser.g:3654:1: ruleUnaryOp returns [Enumerator current=null] : ( (enumLiteral_0= ExclamationMark ) | (enumLiteral_1= PlusSign ) | (enumLiteral_2= HyphenMinus ) | (enumLiteral_3= May ) | (enumLiteral_4= Must ) | (enumLiteral_5= Current ) ) ;
    public final Enumerator ruleUnaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3660:2: ( ( (enumLiteral_0= ExclamationMark ) | (enumLiteral_1= PlusSign ) | (enumLiteral_2= HyphenMinus ) | (enumLiteral_3= May ) | (enumLiteral_4= Must ) | (enumLiteral_5= Current ) ) )
            // InternalSolverLanguageParser.g:3661:2: ( (enumLiteral_0= ExclamationMark ) | (enumLiteral_1= PlusSign ) | (enumLiteral_2= HyphenMinus ) | (enumLiteral_3= May ) | (enumLiteral_4= Must ) | (enumLiteral_5= Current ) )
            {
            // InternalSolverLanguageParser.g:3661:2: ( (enumLiteral_0= ExclamationMark ) | (enumLiteral_1= PlusSign ) | (enumLiteral_2= HyphenMinus ) | (enumLiteral_3= May ) | (enumLiteral_4= Must ) | (enumLiteral_5= Current ) )
            int alt48=6;
            switch ( input.LA(1) ) {
            case ExclamationMark:
                {
                alt48=1;
                }
                break;
            case PlusSign:
                {
                alt48=2;
                }
                break;
            case HyphenMinus:
                {
                alt48=3;
                }
                break;
            case May:
                {
                alt48=4;
                }
                break;
            case Must:
                {
                alt48=5;
                }
                break;
            case Current:
                {
                alt48=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalSolverLanguageParser.g:3662:3: (enumLiteral_0= ExclamationMark )
                    {
                    // InternalSolverLanguageParser.g:3662:3: (enumLiteral_0= ExclamationMark )
                    // InternalSolverLanguageParser.g:3663:4: enumLiteral_0= ExclamationMark
                    {
                    enumLiteral_0=(Token)match(input,ExclamationMark,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOpAccess().getNEGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOpAccess().getNEGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:3670:3: (enumLiteral_1= PlusSign )
                    {
                    // InternalSolverLanguageParser.g:3670:3: (enumLiteral_1= PlusSign )
                    // InternalSolverLanguageParser.g:3671:4: enumLiteral_1= PlusSign
                    {
                    enumLiteral_1=(Token)match(input,PlusSign,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOpAccess().getPLUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnaryOpAccess().getPLUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:3678:3: (enumLiteral_2= HyphenMinus )
                    {
                    // InternalSolverLanguageParser.g:3678:3: (enumLiteral_2= HyphenMinus )
                    // InternalSolverLanguageParser.g:3679:4: enumLiteral_2= HyphenMinus
                    {
                    enumLiteral_2=(Token)match(input,HyphenMinus,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOpAccess().getMINUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnaryOpAccess().getMINUSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:3686:3: (enumLiteral_3= May )
                    {
                    // InternalSolverLanguageParser.g:3686:3: (enumLiteral_3= May )
                    // InternalSolverLanguageParser.g:3687:4: enumLiteral_3= May
                    {
                    enumLiteral_3=(Token)match(input,May,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOpAccess().getMAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnaryOpAccess().getMAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSolverLanguageParser.g:3694:3: (enumLiteral_4= Must )
                    {
                    // InternalSolverLanguageParser.g:3694:3: (enumLiteral_4= Must )
                    // InternalSolverLanguageParser.g:3695:4: enumLiteral_4= Must
                    {
                    enumLiteral_4=(Token)match(input,Must,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOpAccess().getMUSTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getUnaryOpAccess().getMUSTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSolverLanguageParser.g:3702:3: (enumLiteral_5= Current )
                    {
                    // InternalSolverLanguageParser.g:3702:3: (enumLiteral_5= Current )
                    // InternalSolverLanguageParser.g:3703:4: enumLiteral_5= Current
                    {
                    enumLiteral_5=(Token)match(input,Current,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOpAccess().getCURRENTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getUnaryOpAccess().getCURRENTEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleUnaryOp"


    // $ANTLR start "ruleAggregationOp"
    // InternalSolverLanguageParser.g:3713:1: ruleAggregationOp returns [Enumerator current=null] : ( (enumLiteral_0= Only ) | (enumLiteral_1= Sum ) | (enumLiteral_2= Prod ) | (enumLiteral_3= Avg ) | (enumLiteral_4= Min ) | (enumLiteral_5= Max ) ) ;
    public final Enumerator ruleAggregationOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3719:2: ( ( (enumLiteral_0= Only ) | (enumLiteral_1= Sum ) | (enumLiteral_2= Prod ) | (enumLiteral_3= Avg ) | (enumLiteral_4= Min ) | (enumLiteral_5= Max ) ) )
            // InternalSolverLanguageParser.g:3720:2: ( (enumLiteral_0= Only ) | (enumLiteral_1= Sum ) | (enumLiteral_2= Prod ) | (enumLiteral_3= Avg ) | (enumLiteral_4= Min ) | (enumLiteral_5= Max ) )
            {
            // InternalSolverLanguageParser.g:3720:2: ( (enumLiteral_0= Only ) | (enumLiteral_1= Sum ) | (enumLiteral_2= Prod ) | (enumLiteral_3= Avg ) | (enumLiteral_4= Min ) | (enumLiteral_5= Max ) )
            int alt49=6;
            switch ( input.LA(1) ) {
            case Only:
                {
                alt49=1;
                }
                break;
            case Sum:
                {
                alt49=2;
                }
                break;
            case Prod:
                {
                alt49=3;
                }
                break;
            case Avg:
                {
                alt49=4;
                }
                break;
            case Min:
                {
                alt49=5;
                }
                break;
            case Max:
                {
                alt49=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalSolverLanguageParser.g:3721:3: (enumLiteral_0= Only )
                    {
                    // InternalSolverLanguageParser.g:3721:3: (enumLiteral_0= Only )
                    // InternalSolverLanguageParser.g:3722:4: enumLiteral_0= Only
                    {
                    enumLiteral_0=(Token)match(input,Only,FOLLOW_2); 

                    				current = grammarAccess.getAggregationOpAccess().getONLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAggregationOpAccess().getONLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:3729:3: (enumLiteral_1= Sum )
                    {
                    // InternalSolverLanguageParser.g:3729:3: (enumLiteral_1= Sum )
                    // InternalSolverLanguageParser.g:3730:4: enumLiteral_1= Sum
                    {
                    enumLiteral_1=(Token)match(input,Sum,FOLLOW_2); 

                    				current = grammarAccess.getAggregationOpAccess().getSUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAggregationOpAccess().getSUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:3737:3: (enumLiteral_2= Prod )
                    {
                    // InternalSolverLanguageParser.g:3737:3: (enumLiteral_2= Prod )
                    // InternalSolverLanguageParser.g:3738:4: enumLiteral_2= Prod
                    {
                    enumLiteral_2=(Token)match(input,Prod,FOLLOW_2); 

                    				current = grammarAccess.getAggregationOpAccess().getPRODEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAggregationOpAccess().getPRODEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:3745:3: (enumLiteral_3= Avg )
                    {
                    // InternalSolverLanguageParser.g:3745:3: (enumLiteral_3= Avg )
                    // InternalSolverLanguageParser.g:3746:4: enumLiteral_3= Avg
                    {
                    enumLiteral_3=(Token)match(input,Avg,FOLLOW_2); 

                    				current = grammarAccess.getAggregationOpAccess().getAVGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAggregationOpAccess().getAVGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSolverLanguageParser.g:3753:3: (enumLiteral_4= Min )
                    {
                    // InternalSolverLanguageParser.g:3753:3: (enumLiteral_4= Min )
                    // InternalSolverLanguageParser.g:3754:4: enumLiteral_4= Min
                    {
                    enumLiteral_4=(Token)match(input,Min,FOLLOW_2); 

                    				current = grammarAccess.getAggregationOpAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getAggregationOpAccess().getMINEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSolverLanguageParser.g:3761:3: (enumLiteral_5= Max )
                    {
                    // InternalSolverLanguageParser.g:3761:3: (enumLiteral_5= Max )
                    // InternalSolverLanguageParser.g:3762:4: enumLiteral_5= Max
                    {
                    enumLiteral_5=(Token)match(input,Max,FOLLOW_2); 

                    				current = grammarAccess.getAggregationOpAccess().getMAXEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getAggregationOpAccess().getMAXEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleAggregationOp"


    // $ANTLR start "ruleLogicValue"
    // InternalSolverLanguageParser.g:3772:1: ruleLogicValue returns [Enumerator current=null] : ( (enumLiteral_0= True ) | (enumLiteral_1= False ) | (enumLiteral_2= Unknown ) | (enumLiteral_3= Error ) ) ;
    public final Enumerator ruleLogicValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3778:2: ( ( (enumLiteral_0= True ) | (enumLiteral_1= False ) | (enumLiteral_2= Unknown ) | (enumLiteral_3= Error ) ) )
            // InternalSolverLanguageParser.g:3779:2: ( (enumLiteral_0= True ) | (enumLiteral_1= False ) | (enumLiteral_2= Unknown ) | (enumLiteral_3= Error ) )
            {
            // InternalSolverLanguageParser.g:3779:2: ( (enumLiteral_0= True ) | (enumLiteral_1= False ) | (enumLiteral_2= Unknown ) | (enumLiteral_3= Error ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case True:
                {
                alt50=1;
                }
                break;
            case False:
                {
                alt50=2;
                }
                break;
            case Unknown:
                {
                alt50=3;
                }
                break;
            case Error:
                {
                alt50=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalSolverLanguageParser.g:3780:3: (enumLiteral_0= True )
                    {
                    // InternalSolverLanguageParser.g:3780:3: (enumLiteral_0= True )
                    // InternalSolverLanguageParser.g:3781:4: enumLiteral_0= True
                    {
                    enumLiteral_0=(Token)match(input,True,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:3788:3: (enumLiteral_1= False )
                    {
                    // InternalSolverLanguageParser.g:3788:3: (enumLiteral_1= False )
                    // InternalSolverLanguageParser.g:3789:4: enumLiteral_1= False
                    {
                    enumLiteral_1=(Token)match(input,False,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:3796:3: (enumLiteral_2= Unknown )
                    {
                    // InternalSolverLanguageParser.g:3796:3: (enumLiteral_2= Unknown )
                    // InternalSolverLanguageParser.g:3797:4: enumLiteral_2= Unknown
                    {
                    enumLiteral_2=(Token)match(input,Unknown,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:3804:3: (enumLiteral_3= Error )
                    {
                    // InternalSolverLanguageParser.g:3804:3: (enumLiteral_3= Error )
                    // InternalSolverLanguageParser.g:3805:4: enumLiteral_3= Error
                    {
                    enumLiteral_3=(Token)match(input,Error,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getERROREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLogicValueAccess().getERROREnumLiteralDeclaration_3());
                    			

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


    // $ANTLR start "ruleObjectiveKind"
    // InternalSolverLanguageParser.g:3815:1: ruleObjectiveKind returns [Enumerator current=null] : ( (enumLiteral_0= Minimize ) | (enumLiteral_1= Maximize ) ) ;
    public final Enumerator ruleObjectiveKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3821:2: ( ( (enumLiteral_0= Minimize ) | (enumLiteral_1= Maximize ) ) )
            // InternalSolverLanguageParser.g:3822:2: ( (enumLiteral_0= Minimize ) | (enumLiteral_1= Maximize ) )
            {
            // InternalSolverLanguageParser.g:3822:2: ( (enumLiteral_0= Minimize ) | (enumLiteral_1= Maximize ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Minimize) ) {
                alt51=1;
            }
            else if ( (LA51_0==Maximize) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalSolverLanguageParser.g:3823:3: (enumLiteral_0= Minimize )
                    {
                    // InternalSolverLanguageParser.g:3823:3: (enumLiteral_0= Minimize )
                    // InternalSolverLanguageParser.g:3824:4: enumLiteral_0= Minimize
                    {
                    enumLiteral_0=(Token)match(input,Minimize,FOLLOW_2); 

                    				current = grammarAccess.getObjectiveKindAccess().getMINIMIZEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getObjectiveKindAccess().getMINIMIZEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:3831:3: (enumLiteral_1= Maximize )
                    {
                    // InternalSolverLanguageParser.g:3831:3: (enumLiteral_1= Maximize )
                    // InternalSolverLanguageParser.g:3832:4: enumLiteral_1= Maximize
                    {
                    enumLiteral_1=(Token)match(input,Maximize,FOLLOW_2); 

                    				current = grammarAccess.getObjectiveKindAccess().getMAXIMIZEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getObjectiveKindAccess().getMAXIMIZEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleObjectiveKind"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\5\1\uffff\1\5\2\uffff\1\36\7\uffff";
    static final String dfa_3s = "\1\123\1\uffff\1\122\2\uffff\1\122\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\4\1\uffff\1\6\1\10\1\11\1\12\1\3\1\5\1\7";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\7\1\uffff\2\11\3\uffff\1\1\1\4\1\uffff\1\1\1\uffff\1\5\1\7\2\1\1\2\1\1\1\10\2\uffff\3\1\1\6\1\uffff\1\1\5\uffff\2\1\1\6\4\1\11\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff\1\1\7\uffff\1\1\5\uffff\2\1\4\uffff\2\1",
            "",
            "\1\3\47\uffff\2\1\1\uffff\4\1\3\uffff\1\1\1\uffff\1\12\1\uffff\4\1\1\uffff\6\1\2\uffff\1\1\4\uffff\1\3\3\uffff\1\1\1\3",
            "",
            "",
            "\1\14\11\uffff\1\14\44\uffff\1\13\4\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "109:3: (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_ExternPredicateDefinition_4= ruleExternPredicateDefinition | this_MetricDefinition_5= ruleMetricDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ClassDefinition_7= ruleClassDefinition | this_ScopeDefinition_8= ruleScopeDefinition | this_ObjectiveDefinition_9= ruleObjectiveDefinition )";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\uffff\2\10\6\uffff\1\10";
    static final String dfa_9s = "\1\20\2\32\3\uffff\1\122\2\uffff\1\32";
    static final String dfa_10s = "\1\123\2\121\3\uffff\1\122\2\uffff\1\121";
    static final String dfa_11s = "\3\uffff\1\3\1\4\1\5\1\uffff\1\2\1\1\1\uffff";
    static final String dfa_12s = "\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\4\4\uffff\3\4\10\uffff\1\4\6\uffff\1\4\21\uffff\1\5\14\uffff\1\3\5\uffff\1\4\1\2\4\uffff\1\1\1\4",
            "\1\10\4\uffff\1\10\15\uffff\7\10\3\uffff\1\10\1\uffff\1\7\5\10\1\6\6\10\1\uffff\2\10\1\uffff\2\10\3\uffff\2\7\1\10",
            "\1\10\4\uffff\1\10\15\uffff\7\10\3\uffff\1\10\1\uffff\1\7\5\10\1\uffff\6\10\1\uffff\2\10\1\uffff\2\10\3\uffff\2\7\1\10",
            "",
            "",
            "",
            "\1\11",
            "",
            "",
            "\1\10\4\uffff\1\10\15\uffff\7\10\3\uffff\1\10\1\uffff\1\7\5\10\1\6\6\10\1\uffff\2\10\1\uffff\2\10\3\uffff\2\7\1\10"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1716:2: (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) )";
        }
    }
    static final String dfa_14s = "\1\uffff\2\3\3\uffff\1\11\1\uffff\1\3\1\uffff";
    static final String dfa_15s = "\1\15\2\55\2\uffff\1\122\1\15\1\uffff\1\55\1\uffff";
    static final String dfa_16s = "\1\123\2\122\2\uffff\1\122\1\123\1\uffff\1\122\1\uffff";
    static final String dfa_17s = "\3\uffff\1\1\1\2\2\uffff\1\3\1\uffff\1\4";
    static final String[] dfa_18s = {
            "\1\3\2\uffff\1\3\3\uffff\4\3\3\uffff\3\3\2\uffff\1\3\5\uffff\2\3\1\uffff\4\3\13\uffff\2\3\1\uffff\1\4\1\3\1\uffff\1\3\7\uffff\1\3\5\uffff\1\3\1\2\4\uffff\1\1\1\3",
            "\1\3\3\uffff\3\3\3\uffff\1\3\1\uffff\2\3\1\6\3\3\1\5\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\4\uffff\1\7\1\uffff\2\3\1\uffff\1\7",
            "\1\3\3\uffff\3\3\3\uffff\1\3\1\uffff\2\3\1\6\3\3\1\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\4\uffff\1\7\1\uffff\2\3\1\uffff\1\7",
            "",
            "",
            "\1\10",
            "\1\3\2\uffff\1\3\3\uffff\4\3\3\uffff\3\3\2\uffff\1\3\5\uffff\2\3\1\uffff\4\3\13\uffff\2\3\1\11\1\uffff\1\3\1\11\1\3\7\uffff\1\3\5\uffff\2\3\4\uffff\2\3",
            "",
            "\1\3\3\uffff\3\3\3\uffff\1\3\1\uffff\2\3\1\6\3\3\1\5\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\4\uffff\1\7\1\uffff\2\3\1\uffff\1\7",
            ""
    };
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_7;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_12;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1965:2: (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument )";
        }
    }
    static final String dfa_19s = "\17\uffff";
    static final String dfa_20s = "\12\uffff\2\10\2\uffff\1\10";
    static final String dfa_21s = "\1\30\1\115\3\61\1\115\1\uffff\1\122\2\uffff\3\61\1\122\1\61";
    static final String dfa_22s = "\1\30\1\123\1\63\1\77\1\63\1\122\1\uffff\1\122\2\uffff\2\121\1\77\1\122\1\121";
    static final String dfa_23s = "\6\uffff\1\2\1\uffff\1\3\1\1\5\uffff";
    static final String dfa_24s = "\17\uffff}>";
    static final String[] dfa_25s = {
            "\1\1",
            "\1\4\4\uffff\1\3\1\2",
            "\1\5\1\uffff\1\6",
            "\1\6\1\11\1\10\13\uffff\1\7",
            "\1\6\1\11\1\10",
            "\1\13\4\uffff\1\12",
            "",
            "\1\14",
            "",
            "",
            "\1\6\15\uffff\1\15\21\uffff\1\10",
            "\1\6\37\uffff\1\10",
            "\1\6\1\11\1\10\13\uffff\1\7",
            "\1\16",
            "\1\6\15\uffff\1\15\21\uffff\1\10"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2940:2: (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x53401FC179FD6362L,0x00000000000C3040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x53401EC138F12000L,0x00000000000C3040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L,0x0000000000042000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000042000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L,0x0000000000042000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x008E200000000002L,0x0000000000000028L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x5000000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x02001AC130F10000L,0x00000000000C3040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0200000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x5F401EC138F12000L,0x00000000000C3040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x2400000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x5B401EC138F12000L,0x00000000000C3040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000080L,0x0000000000042800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000402L,0x0000000000000004L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C2000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000000000000002L});

}