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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Functional", "Abstract", "Contains", "Datatype", "Maximize", "Minimize", "Opposite", "Current", "Default", "Extends", "Unknown", "Exists", "Extern", "Forall", "Class", "Count", "Empty", "Error", "False", "Scope", "Else", "Must", "Then", "True", "FullStopFullStopFullStop", "Inf", "Let", "May", "ExclamationMarkEqualsSign", "HyphenMinusGreaterThanSign", "FullStopFullStop", "ColonHyphenMinus", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "EqualsSignGreaterThanSign", "GreaterThanSignEqualsSign", "As", "If", "In", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "RULE_STRING", "RULE_QUOTED_ID", "RULE_SL_COMMENT", "RULE_TRANSITIVE_CLOSURE", "RULE_REFLEXIVE_TRANSITIVE_CLOSURE", "RULE_FULL_STOP", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int EqualsSignGreaterThanSign=38;
    public static final int True=27;
    public static final int Count=19;
    public static final int False=22;
    public static final int Must=25;
    public static final int FullStopFullStopFullStop=28;
    public static final int LessThanSign=54;
    public static final int Datatype=7;
    public static final int LeftParenthesis=44;
    public static final int Unknown=14;
    public static final int RULE_REFLEXIVE_TRANSITIVE_CLOSURE=67;
    public static final int FullStopFullStop=34;
    public static final int Then=26;
    public static final int Extends=13;
    public static final int Forall=17;
    public static final int RightSquareBracket=58;
    public static final int ExclamationMark=43;
    public static final int Opposite=10;
    public static final int GreaterThanSign=56;
    public static final int RULE_ID=69;
    public static final int RULE_QUOTED_ID=64;
    public static final int RightParenthesis=45;
    public static final int GreaterThanSignEqualsSign=39;
    public static final int Functional=4;
    public static final int EqualsSignEqualsSign=37;
    public static final int VerticalLine=61;
    public static final int PlusSign=47;
    public static final int RULE_INT=70;
    public static final int Contains=6;
    public static final int RULE_ML_COMMENT=71;
    public static final int RULE_TRANSITIVE_CLOSURE=66;
    public static final int Class=18;
    public static final int LeftSquareBracket=57;
    public static final int RULE_FULL_STOP=68;
    public static final int Current=11;
    public static final int If=41;
    public static final int Inf=29;
    public static final int May=31;
    public static final int In=42;
    public static final int RULE_STRING=63;
    public static final int Extern=16;
    public static final int RULE_SL_COMMENT=65;
    public static final int Comma=48;
    public static final int EqualsSign=55;
    public static final int Empty=20;
    public static final int As=40;
    public static final int HyphenMinus=49;
    public static final int Maximize=8;
    public static final int LessThanSignEqualsSign=36;
    public static final int Solidus=51;
    public static final int Colon=52;
    public static final int RightCurlyBracket=62;
    public static final int EOF=-1;
    public static final int Asterisk=46;
    public static final int FullStop=50;
    public static final int RULE_WS=72;
    public static final int Abstract=5;
    public static final int Minimize=9;
    public static final int LeftCurlyBracket=60;
    public static final int Error=21;
    public static final int RULE_ANY_OTHER=73;
    public static final int Default=12;
    public static final int ColonHyphenMinus=35;
    public static final int CircumflexAccent=59;
    public static final int Semicolon=53;
    public static final int Scope=23;
    public static final int Exists=15;
    public static final int Else=24;
    public static final int Let=30;
    public static final int ExclamationMarkEqualsSign=32;
    public static final int HyphenMinusGreaterThanSign=33;

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

                if ( ((LA1_0>=Functional && LA1_0<=Abstract)||(LA1_0>=Maximize && LA1_0<=Minimize)||(LA1_0>=Current && LA1_0<=Default)||(LA1_0>=Unknown && LA1_0<=False)||LA1_0==Scope||LA1_0==Must||LA1_0==True||(LA1_0>=Inf && LA1_0<=May)||LA1_0==If||(LA1_0>=ExclamationMark && LA1_0<=LeftParenthesis)||LA1_0==PlusSign||LA1_0==HyphenMinus||LA1_0==LeftSquareBracket||(LA1_0>=RULE_STRING && LA1_0<=RULE_QUOTED_ID)||(LA1_0>=RULE_ID && LA1_0<=RULE_INT)) ) {
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
    // InternalSolverLanguageParser.g:101:1: ruleStatement returns [EObject current=null] : ( (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_MetricDefinition_4= ruleMetricDefinition | this_ExternPredicateDefinition_5= ruleExternPredicateDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ExternAggregatorDefinition_7= ruleExternAggregatorDefinition | this_ExternDatatypeDefinition_8= ruleExternDatatypeDefinition | this_ClassDefinition_9= ruleClassDefinition | this_ScopeDefinition_10= ruleScopeDefinition | this_ObjectiveDefinition_11= ruleObjectiveDefinition ) this_FULL_STOP_12= RULE_FULL_STOP ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token this_FULL_STOP_12=null;
        EObject this_AssertionOrDefinition_0 = null;

        EObject this_PredicateDefinition_1 = null;

        EObject this_UnnamedErrorPrediateDefinition_2 = null;

        EObject this_DefaultDefinition_3 = null;

        EObject this_MetricDefinition_4 = null;

        EObject this_ExternPredicateDefinition_5 = null;

        EObject this_ExternMetricDefinition_6 = null;

        EObject this_ExternAggregatorDefinition_7 = null;

        EObject this_ExternDatatypeDefinition_8 = null;

        EObject this_ClassDefinition_9 = null;

        EObject this_ScopeDefinition_10 = null;

        EObject this_ObjectiveDefinition_11 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:107:2: ( ( (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_MetricDefinition_4= ruleMetricDefinition | this_ExternPredicateDefinition_5= ruleExternPredicateDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ExternAggregatorDefinition_7= ruleExternAggregatorDefinition | this_ExternDatatypeDefinition_8= ruleExternDatatypeDefinition | this_ClassDefinition_9= ruleClassDefinition | this_ScopeDefinition_10= ruleScopeDefinition | this_ObjectiveDefinition_11= ruleObjectiveDefinition ) this_FULL_STOP_12= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:108:2: ( (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_MetricDefinition_4= ruleMetricDefinition | this_ExternPredicateDefinition_5= ruleExternPredicateDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ExternAggregatorDefinition_7= ruleExternAggregatorDefinition | this_ExternDatatypeDefinition_8= ruleExternDatatypeDefinition | this_ClassDefinition_9= ruleClassDefinition | this_ScopeDefinition_10= ruleScopeDefinition | this_ObjectiveDefinition_11= ruleObjectiveDefinition ) this_FULL_STOP_12= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:108:2: ( (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_MetricDefinition_4= ruleMetricDefinition | this_ExternPredicateDefinition_5= ruleExternPredicateDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ExternAggregatorDefinition_7= ruleExternAggregatorDefinition | this_ExternDatatypeDefinition_8= ruleExternDatatypeDefinition | this_ClassDefinition_9= ruleClassDefinition | this_ScopeDefinition_10= ruleScopeDefinition | this_ObjectiveDefinition_11= ruleObjectiveDefinition ) this_FULL_STOP_12= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:109:3: (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_MetricDefinition_4= ruleMetricDefinition | this_ExternPredicateDefinition_5= ruleExternPredicateDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ExternAggregatorDefinition_7= ruleExternAggregatorDefinition | this_ExternDatatypeDefinition_8= ruleExternDatatypeDefinition | this_ClassDefinition_9= ruleClassDefinition | this_ScopeDefinition_10= ruleScopeDefinition | this_ObjectiveDefinition_11= ruleObjectiveDefinition ) this_FULL_STOP_12= RULE_FULL_STOP
            {
            // InternalSolverLanguageParser.g:109:3: (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_MetricDefinition_4= ruleMetricDefinition | this_ExternPredicateDefinition_5= ruleExternPredicateDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ExternAggregatorDefinition_7= ruleExternAggregatorDefinition | this_ExternDatatypeDefinition_8= ruleExternDatatypeDefinition | this_ClassDefinition_9= ruleClassDefinition | this_ScopeDefinition_10= ruleScopeDefinition | this_ObjectiveDefinition_11= ruleObjectiveDefinition )
            int alt2=12;
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
                    // InternalSolverLanguageParser.g:146:4: this_MetricDefinition_4= ruleMetricDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getMetricDefinitionParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_4);
                    this_MetricDefinition_4=ruleMetricDefinition();

                    state._fsp--;


                    				current = this_MetricDefinition_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalSolverLanguageParser.g:155:4: this_ExternPredicateDefinition_5= ruleExternPredicateDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getExternPredicateDefinitionParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_4);
                    this_ExternPredicateDefinition_5=ruleExternPredicateDefinition();

                    state._fsp--;


                    				current = this_ExternPredicateDefinition_5;
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
                    // InternalSolverLanguageParser.g:173:4: this_ExternAggregatorDefinition_7= ruleExternAggregatorDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getExternAggregatorDefinitionParserRuleCall_0_7());
                    			
                    pushFollow(FOLLOW_4);
                    this_ExternAggregatorDefinition_7=ruleExternAggregatorDefinition();

                    state._fsp--;


                    				current = this_ExternAggregatorDefinition_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 9 :
                    // InternalSolverLanguageParser.g:182:4: this_ExternDatatypeDefinition_8= ruleExternDatatypeDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getExternDatatypeDefinitionParserRuleCall_0_8());
                    			
                    pushFollow(FOLLOW_4);
                    this_ExternDatatypeDefinition_8=ruleExternDatatypeDefinition();

                    state._fsp--;


                    				current = this_ExternDatatypeDefinition_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 10 :
                    // InternalSolverLanguageParser.g:191:4: this_ClassDefinition_9= ruleClassDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getClassDefinitionParserRuleCall_0_9());
                    			
                    pushFollow(FOLLOW_4);
                    this_ClassDefinition_9=ruleClassDefinition();

                    state._fsp--;


                    				current = this_ClassDefinition_9;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 11 :
                    // InternalSolverLanguageParser.g:200:4: this_ScopeDefinition_10= ruleScopeDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getScopeDefinitionParserRuleCall_0_10());
                    			
                    pushFollow(FOLLOW_4);
                    this_ScopeDefinition_10=ruleScopeDefinition();

                    state._fsp--;


                    				current = this_ScopeDefinition_10;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 12 :
                    // InternalSolverLanguageParser.g:209:4: this_ObjectiveDefinition_11= ruleObjectiveDefinition
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getObjectiveDefinitionParserRuleCall_0_11());
                    			
                    pushFollow(FOLLOW_4);
                    this_ObjectiveDefinition_11=ruleObjectiveDefinition();

                    state._fsp--;


                    				current = this_ObjectiveDefinition_11;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            this_FULL_STOP_12=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_12, grammarAccess.getStatementAccess().getFULL_STOPTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

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
    // InternalSolverLanguageParser.g:226:1: entryRuleAssertionOrDefinition returns [EObject current=null] : iv_ruleAssertionOrDefinition= ruleAssertionOrDefinition EOF ;
    public final EObject entryRuleAssertionOrDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionOrDefinition = null;


        try {
            // InternalSolverLanguageParser.g:226:62: (iv_ruleAssertionOrDefinition= ruleAssertionOrDefinition EOF )
            // InternalSolverLanguageParser.g:227:2: iv_ruleAssertionOrDefinition= ruleAssertionOrDefinition EOF
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
    // InternalSolverLanguageParser.g:233:1: ruleAssertionOrDefinition returns [EObject current=null] : (this_Expression_0= ruleExpression ( ( () otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) ) )? ) ;
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
            // InternalSolverLanguageParser.g:239:2: ( (this_Expression_0= ruleExpression ( ( () otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) ) )? ) )
            // InternalSolverLanguageParser.g:240:2: (this_Expression_0= ruleExpression ( ( () otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) ) )? )
            {
            // InternalSolverLanguageParser.g:240:2: (this_Expression_0= ruleExpression ( ( () otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) ) )? )
            // InternalSolverLanguageParser.g:241:3: this_Expression_0= ruleExpression ( ( () otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) ) )?
            {

            			newCompositeNode(grammarAccess.getAssertionOrDefinitionAccess().getExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Expression_0=ruleExpression();

            state._fsp--;


            			current = this_Expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:249:3: ( ( () otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) ) )?
            int alt3=4;
            switch ( input.LA(1) ) {
                case Colon:
                    {
                    alt3=1;
                    }
                    break;
                case ColonHyphenMinus:
                    {
                    alt3=2;
                    }
                    break;
                case EqualsSign:
                    {
                    alt3=3;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // InternalSolverLanguageParser.g:250:4: ( () otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )
                    {
                    // InternalSolverLanguageParser.g:250:4: ( () otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )
                    // InternalSolverLanguageParser.g:251:5: () otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) )
                    {
                    // InternalSolverLanguageParser.g:251:5: ()
                    // InternalSolverLanguageParser.g:252:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getAssertionOrDefinitionAccess().getInterpretationBodyAction_1_0_0(),
                    							current);
                    					

                    }

                    otherlv_2=(Token)match(input,Colon,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getAssertionOrDefinitionAccess().getColonKeyword_1_0_1());
                    				
                    // InternalSolverLanguageParser.g:262:5: ( (lv_range_3_0= ruleExpression ) )
                    // InternalSolverLanguageParser.g:263:6: (lv_range_3_0= ruleExpression )
                    {
                    // InternalSolverLanguageParser.g:263:6: (lv_range_3_0= ruleExpression )
                    // InternalSolverLanguageParser.g:264:7: lv_range_3_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getAssertionOrDefinitionAccess().getRangeExpressionParserRuleCall_1_0_2_0());
                    						
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


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:283:4: ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) )
                    {
                    // InternalSolverLanguageParser.g:283:4: ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) )
                    // InternalSolverLanguageParser.g:284:5: () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) )
                    {
                    // InternalSolverLanguageParser.g:284:5: ()
                    // InternalSolverLanguageParser.g:285:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getAssertionOrDefinitionAccess().getPredicateDefinitionHeadAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_5=(Token)match(input,ColonHyphenMinus,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssertionOrDefinitionAccess().getColonHyphenMinusKeyword_1_1_1());
                    				
                    // InternalSolverLanguageParser.g:295:5: ( (lv_body_6_0= ruleExpression ) )
                    // InternalSolverLanguageParser.g:296:6: (lv_body_6_0= ruleExpression )
                    {
                    // InternalSolverLanguageParser.g:296:6: (lv_body_6_0= ruleExpression )
                    // InternalSolverLanguageParser.g:297:7: lv_body_6_0= ruleExpression
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
                    // InternalSolverLanguageParser.g:316:4: ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) )
                    {
                    // InternalSolverLanguageParser.g:316:4: ( () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) ) )
                    // InternalSolverLanguageParser.g:317:5: () otherlv_8= EqualsSign ( (lv_body_9_0= ruleExpression ) )
                    {
                    // InternalSolverLanguageParser.g:317:5: ()
                    // InternalSolverLanguageParser.g:318:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getAssertionOrDefinitionAccess().getMetricDefinitionHeadAction_1_2_0(),
                    							current);
                    					

                    }

                    otherlv_8=(Token)match(input,EqualsSign,FOLLOW_6); 

                    					newLeafNode(otherlv_8, grammarAccess.getAssertionOrDefinitionAccess().getEqualsSignKeyword_1_2_1());
                    				
                    // InternalSolverLanguageParser.g:328:5: ( (lv_body_9_0= ruleExpression ) )
                    // InternalSolverLanguageParser.g:329:6: (lv_body_9_0= ruleExpression )
                    {
                    // InternalSolverLanguageParser.g:329:6: (lv_body_9_0= ruleExpression )
                    // InternalSolverLanguageParser.g:330:7: lv_body_9_0= ruleExpression
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
    // InternalSolverLanguageParser.g:353:1: entryRulePredicateDefinition returns [EObject current=null] : iv_rulePredicateDefinition= rulePredicateDefinition EOF ;
    public final EObject entryRulePredicateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateDefinition = null;


        try {
            // InternalSolverLanguageParser.g:353:60: (iv_rulePredicateDefinition= rulePredicateDefinition EOF )
            // InternalSolverLanguageParser.g:354:2: iv_rulePredicateDefinition= rulePredicateDefinition EOF
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
    // InternalSolverLanguageParser.g:360:1: rulePredicateDefinition returns [EObject current=null] : ( ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) ;
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
            // InternalSolverLanguageParser.g:366:2: ( ( ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:367:2: ( ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:367:2: ( ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:368:3: ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) )
            {
            // InternalSolverLanguageParser.g:368:3: ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Functional) ) {
                alt6=1;
            }
            else if ( (LA6_0==Error) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSolverLanguageParser.g:369:4: ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? )
                    {
                    // InternalSolverLanguageParser.g:369:4: ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? )
                    // InternalSolverLanguageParser.g:370:5: ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )?
                    {
                    // InternalSolverLanguageParser.g:370:5: ( (lv_functional_0_0= Functional ) )
                    // InternalSolverLanguageParser.g:371:6: (lv_functional_0_0= Functional )
                    {
                    // InternalSolverLanguageParser.g:371:6: (lv_functional_0_0= Functional )
                    // InternalSolverLanguageParser.g:372:7: lv_functional_0_0= Functional
                    {
                    lv_functional_0_0=(Token)match(input,Functional,FOLLOW_7); 

                    							newLeafNode(lv_functional_0_0, grammarAccess.getPredicateDefinitionAccess().getFunctionalFunctionalKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                    							}
                    							setWithLastConsumed(current, "functional", true, "functional");
                    						

                    }


                    }

                    // InternalSolverLanguageParser.g:384:5: ( (lv_error_1_0= Error ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==Error) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalSolverLanguageParser.g:385:6: (lv_error_1_0= Error )
                            {
                            // InternalSolverLanguageParser.g:385:6: (lv_error_1_0= Error )
                            // InternalSolverLanguageParser.g:386:7: lv_error_1_0= Error
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
                    // InternalSolverLanguageParser.g:400:4: ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? )
                    {
                    // InternalSolverLanguageParser.g:400:4: ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? )
                    // InternalSolverLanguageParser.g:401:5: ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )?
                    {
                    // InternalSolverLanguageParser.g:401:5: ( (lv_error_2_0= Error ) )
                    // InternalSolverLanguageParser.g:402:6: (lv_error_2_0= Error )
                    {
                    // InternalSolverLanguageParser.g:402:6: (lv_error_2_0= Error )
                    // InternalSolverLanguageParser.g:403:7: lv_error_2_0= Error
                    {
                    lv_error_2_0=(Token)match(input,Error,FOLLOW_9); 

                    							newLeafNode(lv_error_2_0, grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                    							}
                    							setWithLastConsumed(current, "error", true, "error");
                    						

                    }


                    }

                    // InternalSolverLanguageParser.g:415:5: ( (lv_functional_3_0= Functional ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==Functional) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSolverLanguageParser.g:416:6: (lv_functional_3_0= Functional )
                            {
                            // InternalSolverLanguageParser.g:416:6: (lv_functional_3_0= Functional )
                            // InternalSolverLanguageParser.g:417:7: lv_functional_3_0= Functional
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

            // InternalSolverLanguageParser.g:431:3: ( (lv_head_4_0= ruleCall ) )
            // InternalSolverLanguageParser.g:432:4: (lv_head_4_0= ruleCall )
            {
            // InternalSolverLanguageParser.g:432:4: (lv_head_4_0= ruleCall )
            // InternalSolverLanguageParser.g:433:5: lv_head_4_0= ruleCall
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
            		
            // InternalSolverLanguageParser.g:454:3: ( (lv_body_6_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:455:4: (lv_body_6_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:455:4: (lv_body_6_0= ruleExpression )
            // InternalSolverLanguageParser.g:456:5: lv_body_6_0= ruleExpression
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
    // InternalSolverLanguageParser.g:477:1: entryRuleUnnamedErrorPrediateDefinition returns [EObject current=null] : iv_ruleUnnamedErrorPrediateDefinition= ruleUnnamedErrorPrediateDefinition EOF ;
    public final EObject entryRuleUnnamedErrorPrediateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedErrorPrediateDefinition = null;


        try {
            // InternalSolverLanguageParser.g:477:71: (iv_ruleUnnamedErrorPrediateDefinition= ruleUnnamedErrorPrediateDefinition EOF )
            // InternalSolverLanguageParser.g:478:2: iv_ruleUnnamedErrorPrediateDefinition= ruleUnnamedErrorPrediateDefinition EOF
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
    // InternalSolverLanguageParser.g:484:1: ruleUnnamedErrorPrediateDefinition returns [EObject current=null] : (otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) ) ) ;
    public final EObject ruleUnnamedErrorPrediateDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_argumentList_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:490:2: ( (otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:491:2: (otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:491:2: (otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:492:3: otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Error,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getUnnamedErrorPrediateDefinitionAccess().getErrorKeyword_0());
            		
            // InternalSolverLanguageParser.g:496:3: ( (lv_argumentList_1_0= ruleArgumentList ) )
            // InternalSolverLanguageParser.g:497:4: (lv_argumentList_1_0= ruleArgumentList )
            {
            // InternalSolverLanguageParser.g:497:4: (lv_argumentList_1_0= ruleArgumentList )
            // InternalSolverLanguageParser.g:498:5: lv_argumentList_1_0= ruleArgumentList
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
            		
            // InternalSolverLanguageParser.g:519:3: ( (lv_body_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:520:4: (lv_body_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:520:4: (lv_body_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:521:5: lv_body_3_0= ruleExpression
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
    // InternalSolverLanguageParser.g:542:1: entryRuleDefaultDefinition returns [EObject current=null] : iv_ruleDefaultDefinition= ruleDefaultDefinition EOF ;
    public final EObject entryRuleDefaultDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultDefinition = null;


        try {
            // InternalSolverLanguageParser.g:542:58: (iv_ruleDefaultDefinition= ruleDefaultDefinition EOF )
            // InternalSolverLanguageParser.g:543:2: iv_ruleDefaultDefinition= ruleDefaultDefinition EOF
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
    // InternalSolverLanguageParser.g:549:1: ruleDefaultDefinition returns [EObject current=null] : (otherlv_0= Default ( (lv_head_1_0= ruleCall ) ) otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) ) ;
    public final EObject ruleDefaultDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_head_1_0 = null;

        EObject lv_range_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:555:2: ( (otherlv_0= Default ( (lv_head_1_0= ruleCall ) ) otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:556:2: (otherlv_0= Default ( (lv_head_1_0= ruleCall ) ) otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:556:2: (otherlv_0= Default ( (lv_head_1_0= ruleCall ) ) otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:557:3: otherlv_0= Default ( (lv_head_1_0= ruleCall ) ) otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Default,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultDefinitionAccess().getDefaultKeyword_0());
            		
            // InternalSolverLanguageParser.g:561:3: ( (lv_head_1_0= ruleCall ) )
            // InternalSolverLanguageParser.g:562:4: (lv_head_1_0= ruleCall )
            {
            // InternalSolverLanguageParser.g:562:4: (lv_head_1_0= ruleCall )
            // InternalSolverLanguageParser.g:563:5: lv_head_1_0= ruleCall
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
            		
            // InternalSolverLanguageParser.g:584:3: ( (lv_range_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:585:4: (lv_range_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:585:4: (lv_range_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:586:5: lv_range_3_0= ruleExpression
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


    // $ANTLR start "entryRuleMetricDefinition"
    // InternalSolverLanguageParser.g:607:1: entryRuleMetricDefinition returns [EObject current=null] : iv_ruleMetricDefinition= ruleMetricDefinition EOF ;
    public final EObject entryRuleMetricDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricDefinition = null;


        try {
            // InternalSolverLanguageParser.g:607:57: (iv_ruleMetricDefinition= ruleMetricDefinition EOF )
            // InternalSolverLanguageParser.g:608:2: iv_ruleMetricDefinition= ruleMetricDefinition EOF
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
    // InternalSolverLanguageParser.g:614:1: ruleMetricDefinition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_head_1_0= ruleCall ) ) otherlv_2= EqualsSign ( (lv_body_3_0= ruleExpression ) ) ) ;
    public final EObject ruleMetricDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_head_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:620:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_head_1_0= ruleCall ) ) otherlv_2= EqualsSign ( (lv_body_3_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:621:2: ( ( ( ruleQualifiedName ) ) ( (lv_head_1_0= ruleCall ) ) otherlv_2= EqualsSign ( (lv_body_3_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:621:2: ( ( ( ruleQualifiedName ) ) ( (lv_head_1_0= ruleCall ) ) otherlv_2= EqualsSign ( (lv_body_3_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:622:3: ( ( ruleQualifiedName ) ) ( (lv_head_1_0= ruleCall ) ) otherlv_2= EqualsSign ( (lv_body_3_0= ruleExpression ) )
            {
            // InternalSolverLanguageParser.g:622:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:623:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:623:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:624:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetricDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMetricDefinitionAccess().getTypeNamedElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_8);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:638:3: ( (lv_head_1_0= ruleCall ) )
            // InternalSolverLanguageParser.g:639:4: (lv_head_1_0= ruleCall )
            {
            // InternalSolverLanguageParser.g:639:4: (lv_head_1_0= ruleCall )
            // InternalSolverLanguageParser.g:640:5: lv_head_1_0= ruleCall
            {

            					newCompositeNode(grammarAccess.getMetricDefinitionAccess().getHeadCallParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_head_1_0=ruleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricDefinitionRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Call");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMetricDefinitionAccess().getEqualsSignKeyword_2());
            		
            // InternalSolverLanguageParser.g:661:3: ( (lv_body_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:662:4: (lv_body_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:662:4: (lv_body_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:663:5: lv_body_3_0= ruleExpression
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


    // $ANTLR start "entryRuleExternPredicateDefinition"
    // InternalSolverLanguageParser.g:684:1: entryRuleExternPredicateDefinition returns [EObject current=null] : iv_ruleExternPredicateDefinition= ruleExternPredicateDefinition EOF ;
    public final EObject entryRuleExternPredicateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternPredicateDefinition = null;


        try {
            // InternalSolverLanguageParser.g:684:66: (iv_ruleExternPredicateDefinition= ruleExternPredicateDefinition EOF )
            // InternalSolverLanguageParser.g:685:2: iv_ruleExternPredicateDefinition= ruleExternPredicateDefinition EOF
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
    // InternalSolverLanguageParser.g:691:1: ruleExternPredicateDefinition returns [EObject current=null] : (otherlv_0= Extern ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_argumentList_2_0= ruleArgumentList ) ) ) ;
    public final EObject ruleExternPredicateDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_argumentList_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:697:2: ( (otherlv_0= Extern ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_argumentList_2_0= ruleArgumentList ) ) ) )
            // InternalSolverLanguageParser.g:698:2: (otherlv_0= Extern ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_argumentList_2_0= ruleArgumentList ) ) )
            {
            // InternalSolverLanguageParser.g:698:2: (otherlv_0= Extern ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_argumentList_2_0= ruleArgumentList ) ) )
            // InternalSolverLanguageParser.g:699:3: otherlv_0= Extern ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_argumentList_2_0= ruleArgumentList ) )
            {
            otherlv_0=(Token)match(input,Extern,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExternPredicateDefinitionAccess().getExternKeyword_0());
            		
            // InternalSolverLanguageParser.g:703:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:704:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:704:4: (lv_name_1_0= ruleQualifiedName )
            // InternalSolverLanguageParser.g:705:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getExternPredicateDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternPredicateDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:722:3: ( (lv_argumentList_2_0= ruleArgumentList ) )
            // InternalSolverLanguageParser.g:723:4: (lv_argumentList_2_0= ruleArgumentList )
            {
            // InternalSolverLanguageParser.g:723:4: (lv_argumentList_2_0= ruleArgumentList )
            // InternalSolverLanguageParser.g:724:5: lv_argumentList_2_0= ruleArgumentList
            {

            					newCompositeNode(grammarAccess.getExternPredicateDefinitionAccess().getArgumentListArgumentListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_argumentList_2_0=ruleArgumentList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternPredicateDefinitionRule());
            					}
            					set(
            						current,
            						"argumentList",
            						lv_argumentList_2_0,
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
    // $ANTLR end "ruleExternPredicateDefinition"


    // $ANTLR start "entryRuleExternMetricDefinition"
    // InternalSolverLanguageParser.g:745:1: entryRuleExternMetricDefinition returns [EObject current=null] : iv_ruleExternMetricDefinition= ruleExternMetricDefinition EOF ;
    public final EObject entryRuleExternMetricDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternMetricDefinition = null;


        try {
            // InternalSolverLanguageParser.g:745:63: (iv_ruleExternMetricDefinition= ruleExternMetricDefinition EOF )
            // InternalSolverLanguageParser.g:746:2: iv_ruleExternMetricDefinition= ruleExternMetricDefinition EOF
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
    // InternalSolverLanguageParser.g:752:1: ruleExternMetricDefinition returns [EObject current=null] : (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_argumentList_3_0= ruleArgumentList ) ) ) ;
    public final EObject ruleExternMetricDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_argumentList_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:758:2: ( (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_argumentList_3_0= ruleArgumentList ) ) ) )
            // InternalSolverLanguageParser.g:759:2: (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_argumentList_3_0= ruleArgumentList ) ) )
            {
            // InternalSolverLanguageParser.g:759:2: (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_argumentList_3_0= ruleArgumentList ) ) )
            // InternalSolverLanguageParser.g:760:3: otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_argumentList_3_0= ruleArgumentList ) )
            {
            otherlv_0=(Token)match(input,Extern,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExternMetricDefinitionAccess().getExternKeyword_0());
            		
            // InternalSolverLanguageParser.g:764:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:765:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:765:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:766:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternMetricDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternMetricDefinitionAccess().getTypeNamedElementCrossReference_1_0());
            				
            pushFollow(FOLLOW_8);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:780:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:781:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:781:4: (lv_name_2_0= ruleQualifiedName )
            // InternalSolverLanguageParser.g:782:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getExternMetricDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternMetricDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:799:3: ( (lv_argumentList_3_0= ruleArgumentList ) )
            // InternalSolverLanguageParser.g:800:4: (lv_argumentList_3_0= ruleArgumentList )
            {
            // InternalSolverLanguageParser.g:800:4: (lv_argumentList_3_0= ruleArgumentList )
            // InternalSolverLanguageParser.g:801:5: lv_argumentList_3_0= ruleArgumentList
            {

            					newCompositeNode(grammarAccess.getExternMetricDefinitionAccess().getArgumentListArgumentListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_argumentList_3_0=ruleArgumentList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternMetricDefinitionRule());
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
    // $ANTLR end "ruleExternMetricDefinition"


    // $ANTLR start "entryRuleExternAggregatorDefinition"
    // InternalSolverLanguageParser.g:822:1: entryRuleExternAggregatorDefinition returns [EObject current=null] : iv_ruleExternAggregatorDefinition= ruleExternAggregatorDefinition EOF ;
    public final EObject entryRuleExternAggregatorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternAggregatorDefinition = null;


        try {
            // InternalSolverLanguageParser.g:822:67: (iv_ruleExternAggregatorDefinition= ruleExternAggregatorDefinition EOF )
            // InternalSolverLanguageParser.g:823:2: iv_ruleExternAggregatorDefinition= ruleExternAggregatorDefinition EOF
            {
             newCompositeNode(grammarAccess.getExternAggregatorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternAggregatorDefinition=ruleExternAggregatorDefinition();

            state._fsp--;

             current =iv_ruleExternAggregatorDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternAggregatorDefinition"


    // $ANTLR start "ruleExternAggregatorDefinition"
    // InternalSolverLanguageParser.g:829:1: ruleExternAggregatorDefinition returns [EObject current=null] : (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= LeftCurlyBracket ( ( ruleQualifiedName ) ) otherlv_5= FullStopFullStopFullStop otherlv_6= RightCurlyBracket ) ;
    public final EObject ruleExternAggregatorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:835:2: ( (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= LeftCurlyBracket ( ( ruleQualifiedName ) ) otherlv_5= FullStopFullStopFullStop otherlv_6= RightCurlyBracket ) )
            // InternalSolverLanguageParser.g:836:2: (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= LeftCurlyBracket ( ( ruleQualifiedName ) ) otherlv_5= FullStopFullStopFullStop otherlv_6= RightCurlyBracket )
            {
            // InternalSolverLanguageParser.g:836:2: (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= LeftCurlyBracket ( ( ruleQualifiedName ) ) otherlv_5= FullStopFullStopFullStop otherlv_6= RightCurlyBracket )
            // InternalSolverLanguageParser.g:837:3: otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= LeftCurlyBracket ( ( ruleQualifiedName ) ) otherlv_5= FullStopFullStopFullStop otherlv_6= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Extern,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExternAggregatorDefinitionAccess().getExternKeyword_0());
            		
            // InternalSolverLanguageParser.g:841:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:842:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:842:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:843:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternAggregatorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternAggregatorDefinitionAccess().getTypeNamedElementCrossReference_1_0());
            				
            pushFollow(FOLLOW_8);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:857:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:858:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:858:4: (lv_name_2_0= ruleQualifiedName )
            // InternalSolverLanguageParser.g:859:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getExternAggregatorDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternAggregatorDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getExternAggregatorDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSolverLanguageParser.g:880:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:881:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:881:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:882:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternAggregatorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternAggregatorDefinitionAccess().getInputTypeNamedElementCrossReference_4_0());
            				
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,FullStopFullStopFullStop,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getExternAggregatorDefinitionAccess().getFullStopFullStopFullStopKeyword_5());
            		
            otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternAggregatorDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternAggregatorDefinition"


    // $ANTLR start "entryRuleExternDatatypeDefinition"
    // InternalSolverLanguageParser.g:908:1: entryRuleExternDatatypeDefinition returns [EObject current=null] : iv_ruleExternDatatypeDefinition= ruleExternDatatypeDefinition EOF ;
    public final EObject entryRuleExternDatatypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternDatatypeDefinition = null;


        try {
            // InternalSolverLanguageParser.g:908:65: (iv_ruleExternDatatypeDefinition= ruleExternDatatypeDefinition EOF )
            // InternalSolverLanguageParser.g:909:2: iv_ruleExternDatatypeDefinition= ruleExternDatatypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getExternDatatypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternDatatypeDefinition=ruleExternDatatypeDefinition();

            state._fsp--;

             current =iv_ruleExternDatatypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternDatatypeDefinition"


    // $ANTLR start "ruleExternDatatypeDefinition"
    // InternalSolverLanguageParser.g:915:1: ruleExternDatatypeDefinition returns [EObject current=null] : (otherlv_0= Extern otherlv_1= Datatype ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* ) ) ;
    public final EObject ruleExternDatatypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:921:2: ( (otherlv_0= Extern otherlv_1= Datatype ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* ) ) )
            // InternalSolverLanguageParser.g:922:2: (otherlv_0= Extern otherlv_1= Datatype ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* ) )
            {
            // InternalSolverLanguageParser.g:922:2: (otherlv_0= Extern otherlv_1= Datatype ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* ) )
            // InternalSolverLanguageParser.g:923:3: otherlv_0= Extern otherlv_1= Datatype ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* )
            {
            otherlv_0=(Token)match(input,Extern,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getExternDatatypeDefinitionAccess().getExternKeyword_0());
            		
            otherlv_1=(Token)match(input,Datatype,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getExternDatatypeDefinitionAccess().getDatatypeKeyword_1());
            		
            // InternalSolverLanguageParser.g:931:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:932:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:932:4: (lv_name_2_0= ruleQualifiedName )
            // InternalSolverLanguageParser.g:933:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getExternDatatypeDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternDatatypeDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:950:3: (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* )
            // InternalSolverLanguageParser.g:951:4: otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )*
            {
            otherlv_3=(Token)match(input,Extends,FOLLOW_8); 

            				newLeafNode(otherlv_3, grammarAccess.getExternDatatypeDefinitionAccess().getExtendsKeyword_3_0());
            			
            // InternalSolverLanguageParser.g:955:4: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:956:5: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:956:5: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:957:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getExternDatatypeDefinitionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getExternDatatypeDefinitionAccess().getSupertypesNamedElementCrossReference_3_1_0());
            					
            pushFollow(FOLLOW_19);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalSolverLanguageParser.g:971:4: (otherlv_5= Comma ( ( ruleQualifiedName ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Comma) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:972:5: otherlv_5= Comma ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExternDatatypeDefinitionAccess().getCommaKeyword_3_2_0());
            	    				
            	    // InternalSolverLanguageParser.g:976:5: ( ( ruleQualifiedName ) )
            	    // InternalSolverLanguageParser.g:977:6: ( ruleQualifiedName )
            	    {
            	    // InternalSolverLanguageParser.g:977:6: ( ruleQualifiedName )
            	    // InternalSolverLanguageParser.g:978:7: ruleQualifiedName
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getExternDatatypeDefinitionRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getExternDatatypeDefinitionAccess().getSupertypesNamedElementCrossReference_3_2_1_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleExternDatatypeDefinition"


    // $ANTLR start "entryRuleVariable"
    // InternalSolverLanguageParser.g:998:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSolverLanguageParser.g:998:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSolverLanguageParser.g:999:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalSolverLanguageParser.g:1005:1: ruleVariable returns [EObject current=null] : ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1011:2: ( ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSolverLanguageParser.g:1012:2: ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSolverLanguageParser.g:1012:2: ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSolverLanguageParser.g:1013:3: ( ( ruleQualifiedName ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalSolverLanguageParser.g:1013:3: ( ( ruleQualifiedName ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==FullStop||LA8_1==RULE_ID) ) {
                    alt8=1;
                }
            }
            else if ( (LA8_0==RULE_QUOTED_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSolverLanguageParser.g:1014:4: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:1014:4: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:1015:5: ruleQualifiedName
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getVariableAccess().getTypeNamedElementCrossReference_0_0());
                    				
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSolverLanguageParser.g:1029:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolverLanguageParser.g:1030:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolverLanguageParser.g:1030:4: (lv_name_1_0= RULE_ID )
            // InternalSolverLanguageParser.g:1031:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // InternalSolverLanguageParser.g:1051:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSolverLanguageParser.g:1051:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSolverLanguageParser.g:1052:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSolverLanguageParser.g:1058:1: ruleExpression returns [EObject current=null] : (this_IfElse_0= ruleIfElse | this_Let_1= ruleLet | this_ImplicationExpression_2= ruleImplicationExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfElse_0 = null;

        EObject this_Let_1 = null;

        EObject this_ImplicationExpression_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1064:2: ( (this_IfElse_0= ruleIfElse | this_Let_1= ruleLet | this_ImplicationExpression_2= ruleImplicationExpression ) )
            // InternalSolverLanguageParser.g:1065:2: (this_IfElse_0= ruleIfElse | this_Let_1= ruleLet | this_ImplicationExpression_2= ruleImplicationExpression )
            {
            // InternalSolverLanguageParser.g:1065:2: (this_IfElse_0= ruleIfElse | this_Let_1= ruleLet | this_ImplicationExpression_2= ruleImplicationExpression )
            int alt9=3;
            switch ( input.LA(1) ) {
            case If:
                {
                alt9=1;
                }
                break;
            case Let:
                {
                alt9=2;
                }
                break;
            case Current:
            case Unknown:
            case Exists:
            case Forall:
            case Count:
            case Empty:
            case Error:
            case False:
            case Must:
            case True:
            case Inf:
            case May:
            case ExclamationMark:
            case LeftParenthesis:
            case PlusSign:
            case HyphenMinus:
            case LeftSquareBracket:
            case RULE_STRING:
            case RULE_QUOTED_ID:
            case RULE_ID:
            case RULE_INT:
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
                    // InternalSolverLanguageParser.g:1066:3: this_IfElse_0= ruleIfElse
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
                    // InternalSolverLanguageParser.g:1075:3: this_Let_1= ruleLet
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Let_1=ruleLet();

                    state._fsp--;


                    			current = this_Let_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:1084:3: this_ImplicationExpression_2= ruleImplicationExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getImplicationExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplicationExpression_2=ruleImplicationExpression();

                    state._fsp--;


                    			current = this_ImplicationExpression_2;
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
    // InternalSolverLanguageParser.g:1096:1: entryRuleIfElse returns [EObject current=null] : iv_ruleIfElse= ruleIfElse EOF ;
    public final EObject entryRuleIfElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElse = null;


        try {
            // InternalSolverLanguageParser.g:1096:47: (iv_ruleIfElse= ruleIfElse EOF )
            // InternalSolverLanguageParser.g:1097:2: iv_ruleIfElse= ruleIfElse EOF
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
    // InternalSolverLanguageParser.g:1103:1: ruleIfElse returns [EObject current=null] : (otherlv_0= If ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) ) ) ;
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
            // InternalSolverLanguageParser.g:1109:2: ( (otherlv_0= If ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:1110:2: (otherlv_0= If ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:1110:2: (otherlv_0= If ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:1111:3: otherlv_0= If ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,If,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIfElseAccess().getIfKeyword_0());
            		
            // InternalSolverLanguageParser.g:1115:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:1116:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:1116:4: (lv_condition_1_0= ruleExpression )
            // InternalSolverLanguageParser.g:1117:5: lv_condition_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfElseAccess().getConditionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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
            		
            // InternalSolverLanguageParser.g:1138:3: ( (lv_then_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:1139:4: (lv_then_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:1139:4: (lv_then_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:1140:5: lv_then_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfElseAccess().getThenExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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
            		
            // InternalSolverLanguageParser.g:1161:3: ( (lv_else_5_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:1162:4: (lv_else_5_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:1162:4: (lv_else_5_0= ruleExpression )
            // InternalSolverLanguageParser.g:1163:5: lv_else_5_0= ruleExpression
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


    // $ANTLR start "entryRuleLet"
    // InternalSolverLanguageParser.g:1184:1: entryRuleLet returns [EObject current=null] : iv_ruleLet= ruleLet EOF ;
    public final EObject entryRuleLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLet = null;


        try {
            // InternalSolverLanguageParser.g:1184:44: (iv_ruleLet= ruleLet EOF )
            // InternalSolverLanguageParser.g:1185:2: iv_ruleLet= ruleLet EOF
            {
             newCompositeNode(grammarAccess.getLetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLet=ruleLet();

            state._fsp--;

             current =iv_ruleLet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // InternalSolverLanguageParser.g:1191:1: ruleLet returns [EObject current=null] : (otherlv_0= Let ( (lv_bindings_1_0= ruleLetBinding ) ) (otherlv_2= Comma ( (lv_bindings_3_0= ruleLetBinding ) ) )* otherlv_4= In ( (lv_body_5_0= ruleExpression ) ) ) ;
    public final EObject ruleLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_bindings_1_0 = null;

        EObject lv_bindings_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1197:2: ( (otherlv_0= Let ( (lv_bindings_1_0= ruleLetBinding ) ) (otherlv_2= Comma ( (lv_bindings_3_0= ruleLetBinding ) ) )* otherlv_4= In ( (lv_body_5_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:1198:2: (otherlv_0= Let ( (lv_bindings_1_0= ruleLetBinding ) ) (otherlv_2= Comma ( (lv_bindings_3_0= ruleLetBinding ) ) )* otherlv_4= In ( (lv_body_5_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:1198:2: (otherlv_0= Let ( (lv_bindings_1_0= ruleLetBinding ) ) (otherlv_2= Comma ( (lv_bindings_3_0= ruleLetBinding ) ) )* otherlv_4= In ( (lv_body_5_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:1199:3: otherlv_0= Let ( (lv_bindings_1_0= ruleLetBinding ) ) (otherlv_2= Comma ( (lv_bindings_3_0= ruleLetBinding ) ) )* otherlv_4= In ( (lv_body_5_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Let,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLetAccess().getLetKeyword_0());
            		
            // InternalSolverLanguageParser.g:1203:3: ( (lv_bindings_1_0= ruleLetBinding ) )
            // InternalSolverLanguageParser.g:1204:4: (lv_bindings_1_0= ruleLetBinding )
            {
            // InternalSolverLanguageParser.g:1204:4: (lv_bindings_1_0= ruleLetBinding )
            // InternalSolverLanguageParser.g:1205:5: lv_bindings_1_0= ruleLetBinding
            {

            					newCompositeNode(grammarAccess.getLetAccess().getBindingsLetBindingParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_bindings_1_0=ruleLetBinding();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetRule());
            					}
            					add(
            						current,
            						"bindings",
            						lv_bindings_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.LetBinding");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:1222:3: (otherlv_2= Comma ( (lv_bindings_3_0= ruleLetBinding ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:1223:4: otherlv_2= Comma ( (lv_bindings_3_0= ruleLetBinding ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLetAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSolverLanguageParser.g:1227:4: ( (lv_bindings_3_0= ruleLetBinding ) )
            	    // InternalSolverLanguageParser.g:1228:5: (lv_bindings_3_0= ruleLetBinding )
            	    {
            	    // InternalSolverLanguageParser.g:1228:5: (lv_bindings_3_0= ruleLetBinding )
            	    // InternalSolverLanguageParser.g:1229:6: lv_bindings_3_0= ruleLetBinding
            	    {

            	    						newCompositeNode(grammarAccess.getLetAccess().getBindingsLetBindingParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_bindings_3_0=ruleLetBinding();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bindings",
            	    							lv_bindings_3_0,
            	    							"org.eclipse.viatra.solver.language.SolverLanguage.LetBinding");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,In,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLetAccess().getInKeyword_3());
            		
            // InternalSolverLanguageParser.g:1251:3: ( (lv_body_5_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:1252:4: (lv_body_5_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:1252:4: (lv_body_5_0= ruleExpression )
            // InternalSolverLanguageParser.g:1253:5: lv_body_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLetAccess().getBodyExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
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
    // $ANTLR end "ruleLet"


    // $ANTLR start "entryRuleLetBinding"
    // InternalSolverLanguageParser.g:1274:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalSolverLanguageParser.g:1274:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalSolverLanguageParser.g:1275:2: iv_ruleLetBinding= ruleLetBinding EOF
            {
             newCompositeNode(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetBinding=ruleLetBinding();

            state._fsp--;

             current =iv_ruleLetBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalSolverLanguageParser.g:1281:1: ruleLetBinding returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleAdditiveExpression ) ) ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1287:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleAdditiveExpression ) ) ) )
            // InternalSolverLanguageParser.g:1288:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleAdditiveExpression ) ) )
            {
            // InternalSolverLanguageParser.g:1288:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleAdditiveExpression ) ) )
            // InternalSolverLanguageParser.g:1289:3: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleAdditiveExpression ) )
            {
            // InternalSolverLanguageParser.g:1289:3: ( (lv_variable_0_0= ruleVariable ) )
            // InternalSolverLanguageParser.g:1290:4: (lv_variable_0_0= ruleVariable )
            {
            // InternalSolverLanguageParser.g:1290:4: (lv_variable_0_0= ruleVariable )
            // InternalSolverLanguageParser.g:1291:5: lv_variable_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_variable_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_1());
            		
            // InternalSolverLanguageParser.g:1312:3: ( (lv_value_2_0= ruleAdditiveExpression ) )
            // InternalSolverLanguageParser.g:1313:4: (lv_value_2_0= ruleAdditiveExpression )
            {
            // InternalSolverLanguageParser.g:1313:4: (lv_value_2_0= ruleAdditiveExpression )
            // InternalSolverLanguageParser.g:1314:5: lv_value_2_0= ruleAdditiveExpression
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getValueAdditiveExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleAdditiveExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.AdditiveExpression");
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
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleImplicationExpression"
    // InternalSolverLanguageParser.g:1335:1: entryRuleImplicationExpression returns [EObject current=null] : iv_ruleImplicationExpression= ruleImplicationExpression EOF ;
    public final EObject entryRuleImplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationExpression = null;


        try {
            // InternalSolverLanguageParser.g:1335:62: (iv_ruleImplicationExpression= ruleImplicationExpression EOF )
            // InternalSolverLanguageParser.g:1336:2: iv_ruleImplicationExpression= ruleImplicationExpression EOF
            {
             newCompositeNode(grammarAccess.getImplicationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplicationExpression=ruleImplicationExpression();

            state._fsp--;

             current =iv_ruleImplicationExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplicationExpression"


    // $ANTLR start "ruleImplicationExpression"
    // InternalSolverLanguageParser.g:1342:1: ruleImplicationExpression returns [EObject current=null] : (this_DisjunctiveExpression_0= ruleDisjunctiveExpression ( () ( (lv_op_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleImplicationExpression ) ) )? ) ;
    public final EObject ruleImplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DisjunctiveExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1348:2: ( (this_DisjunctiveExpression_0= ruleDisjunctiveExpression ( () ( (lv_op_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleImplicationExpression ) ) )? ) )
            // InternalSolverLanguageParser.g:1349:2: (this_DisjunctiveExpression_0= ruleDisjunctiveExpression ( () ( (lv_op_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleImplicationExpression ) ) )? )
            {
            // InternalSolverLanguageParser.g:1349:2: (this_DisjunctiveExpression_0= ruleDisjunctiveExpression ( () ( (lv_op_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleImplicationExpression ) ) )? )
            // InternalSolverLanguageParser.g:1350:3: this_DisjunctiveExpression_0= ruleDisjunctiveExpression ( () ( (lv_op_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleImplicationExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getImplicationExpressionAccess().getDisjunctiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_DisjunctiveExpression_0=ruleDisjunctiveExpression();

            state._fsp--;


            			current = this_DisjunctiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1358:3: ( () ( (lv_op_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleImplicationExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EqualsSignGreaterThanSign) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSolverLanguageParser.g:1359:4: () ( (lv_op_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleImplicationExpression ) )
                    {
                    // InternalSolverLanguageParser.g:1359:4: ()
                    // InternalSolverLanguageParser.g:1360:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getImplicationExpressionAccess().getBinaryExpressionLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSolverLanguageParser.g:1366:4: ( (lv_op_2_0= ruleImplicationOperator ) )
                    // InternalSolverLanguageParser.g:1367:5: (lv_op_2_0= ruleImplicationOperator )
                    {
                    // InternalSolverLanguageParser.g:1367:5: (lv_op_2_0= ruleImplicationOperator )
                    // InternalSolverLanguageParser.g:1368:6: lv_op_2_0= ruleImplicationOperator
                    {

                    						newCompositeNode(grammarAccess.getImplicationExpressionAccess().getOpImplicationOperatorEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_op_2_0=ruleImplicationOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplicationExpressionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.ImplicationOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSolverLanguageParser.g:1385:4: ( (lv_right_3_0= ruleImplicationExpression ) )
                    // InternalSolverLanguageParser.g:1386:5: (lv_right_3_0= ruleImplicationExpression )
                    {
                    // InternalSolverLanguageParser.g:1386:5: (lv_right_3_0= ruleImplicationExpression )
                    // InternalSolverLanguageParser.g:1387:6: lv_right_3_0= ruleImplicationExpression
                    {

                    						newCompositeNode(grammarAccess.getImplicationExpressionAccess().getRightImplicationExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleImplicationExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplicationExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.ImplicationExpression");
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
    // $ANTLR end "ruleImplicationExpression"


    // $ANTLR start "entryRuleDisjunctiveExpression"
    // InternalSolverLanguageParser.g:1409:1: entryRuleDisjunctiveExpression returns [EObject current=null] : iv_ruleDisjunctiveExpression= ruleDisjunctiveExpression EOF ;
    public final EObject entryRuleDisjunctiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctiveExpression = null;


        try {
            // InternalSolverLanguageParser.g:1409:62: (iv_ruleDisjunctiveExpression= ruleDisjunctiveExpression EOF )
            // InternalSolverLanguageParser.g:1410:2: iv_ruleDisjunctiveExpression= ruleDisjunctiveExpression EOF
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
    // InternalSolverLanguageParser.g:1416:1: ruleDisjunctiveExpression returns [EObject current=null] : (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )? ) ;
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
            // InternalSolverLanguageParser.g:1422:2: ( (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )? ) )
            // InternalSolverLanguageParser.g:1423:2: (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )? )
            {
            // InternalSolverLanguageParser.g:1423:2: (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )? )
            // InternalSolverLanguageParser.g:1424:3: this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )?
            {

            			newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getConjunctiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_ConjunctiveExpression_0=ruleConjunctiveExpression();

            state._fsp--;


            			current = this_ConjunctiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1432:3: ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Semicolon) ) {
                alt14=1;
            }
            else if ( (LA14_0==HyphenMinusGreaterThanSign) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // InternalSolverLanguageParser.g:1433:4: ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ )
                    {
                    // InternalSolverLanguageParser.g:1433:4: ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ )
                    // InternalSolverLanguageParser.g:1434:5: () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+
                    {
                    // InternalSolverLanguageParser.g:1434:5: ()
                    // InternalSolverLanguageParser.g:1435:6: 
                    {

                    						current = forceCreateModelElementAndAdd(
                    							grammarAccess.getDisjunctiveExpressionAccess().getDisjunctionChildrenAction_1_0_0(),
                    							current);
                    					

                    }

                    // InternalSolverLanguageParser.g:1441:5: (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Semicolon) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:1442:6: otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_6); 

                    	    						newLeafNode(otherlv_2, grammarAccess.getDisjunctiveExpressionAccess().getSemicolonKeyword_1_0_1_0());
                    	    					
                    	    // InternalSolverLanguageParser.g:1446:6: ( (lv_children_3_0= ruleConjunctiveExpression ) )
                    	    // InternalSolverLanguageParser.g:1447:7: (lv_children_3_0= ruleConjunctiveExpression )
                    	    {
                    	    // InternalSolverLanguageParser.g:1447:7: (lv_children_3_0= ruleConjunctiveExpression )
                    	    // InternalSolverLanguageParser.g:1448:8: lv_children_3_0= ruleConjunctiveExpression
                    	    {

                    	    								newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getChildrenConjunctiveExpressionParserRuleCall_1_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_26);
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
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:1468:4: ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* )
                    {
                    // InternalSolverLanguageParser.g:1468:4: ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* )
                    // InternalSolverLanguageParser.g:1469:5: () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )*
                    {
                    // InternalSolverLanguageParser.g:1469:5: ()
                    // InternalSolverLanguageParser.g:1470:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getDisjunctiveExpressionAccess().getCaseConditionAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_5=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getDisjunctiveExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_1_1());
                    				
                    // InternalSolverLanguageParser.g:1480:5: ( (lv_body_6_0= ruleConjunctiveExpression ) )
                    // InternalSolverLanguageParser.g:1481:6: (lv_body_6_0= ruleConjunctiveExpression )
                    {
                    // InternalSolverLanguageParser.g:1481:6: (lv_body_6_0= ruleConjunctiveExpression )
                    // InternalSolverLanguageParser.g:1482:7: lv_body_6_0= ruleConjunctiveExpression
                    {

                    							newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getBodyConjunctiveExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_26);
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

                    // InternalSolverLanguageParser.g:1499:5: ()
                    // InternalSolverLanguageParser.g:1500:6: 
                    {

                    						current = forceCreateModelElementAndAdd(
                    							grammarAccess.getDisjunctiveExpressionAccess().getSwitchCasesAction_1_1_3(),
                    							current);
                    					

                    }

                    // InternalSolverLanguageParser.g:1506:5: (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Semicolon) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:1507:6: otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Semicolon,FOLLOW_6); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getDisjunctiveExpressionAccess().getSemicolonKeyword_1_1_4_0());
                    	    					
                    	    // InternalSolverLanguageParser.g:1511:6: ( (lv_cases_9_0= ruleCase ) )
                    	    // InternalSolverLanguageParser.g:1512:7: (lv_cases_9_0= ruleCase )
                    	    {
                    	    // InternalSolverLanguageParser.g:1512:7: (lv_cases_9_0= ruleCase )
                    	    // InternalSolverLanguageParser.g:1513:8: lv_cases_9_0= ruleCase
                    	    {

                    	    								newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getCasesCaseParserRuleCall_1_1_4_1_0());
                    	    							
                    	    pushFollow(FOLLOW_26);
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
                    	    break loop13;
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
    // InternalSolverLanguageParser.g:1537:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalSolverLanguageParser.g:1537:45: (iv_ruleCase= ruleCase EOF )
            // InternalSolverLanguageParser.g:1538:2: iv_ruleCase= ruleCase EOF
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
    // InternalSolverLanguageParser.g:1544:1: ruleCase returns [EObject current=null] : ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_0_0 = null;

        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1550:2: ( ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) ) ) )
            // InternalSolverLanguageParser.g:1551:2: ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) ) )
            {
            // InternalSolverLanguageParser.g:1551:2: ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) ) )
            // InternalSolverLanguageParser.g:1552:3: ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) )
            {
            // InternalSolverLanguageParser.g:1552:3: ( (lv_condition_0_0= ruleConjunctiveExpression ) )
            // InternalSolverLanguageParser.g:1553:4: (lv_condition_0_0= ruleConjunctiveExpression )
            {
            // InternalSolverLanguageParser.g:1553:4: (lv_condition_0_0= ruleConjunctiveExpression )
            // InternalSolverLanguageParser.g:1554:5: lv_condition_0_0= ruleConjunctiveExpression
            {

            					newCompositeNode(grammarAccess.getCaseAccess().getConditionConjunctiveExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
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
            		
            // InternalSolverLanguageParser.g:1575:3: ( (lv_body_2_0= ruleConjunctiveExpression ) )
            // InternalSolverLanguageParser.g:1576:4: (lv_body_2_0= ruleConjunctiveExpression )
            {
            // InternalSolverLanguageParser.g:1576:4: (lv_body_2_0= ruleConjunctiveExpression )
            // InternalSolverLanguageParser.g:1577:5: lv_body_2_0= ruleConjunctiveExpression
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
    // InternalSolverLanguageParser.g:1598:1: entryRuleConjunctiveExpression returns [EObject current=null] : iv_ruleConjunctiveExpression= ruleConjunctiveExpression EOF ;
    public final EObject entryRuleConjunctiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctiveExpression = null;


        try {
            // InternalSolverLanguageParser.g:1598:62: (iv_ruleConjunctiveExpression= ruleConjunctiveExpression EOF )
            // InternalSolverLanguageParser.g:1599:2: iv_ruleConjunctiveExpression= ruleConjunctiveExpression EOF
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
    // InternalSolverLanguageParser.g:1605:1: ruleConjunctiveExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? ) ;
    public final EObject ruleConjunctiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_children_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1611:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? ) )
            // InternalSolverLanguageParser.g:1612:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? )
            {
            // InternalSolverLanguageParser.g:1612:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? )
            // InternalSolverLanguageParser.g:1613:3: this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getConjunctiveExpressionAccess().getComparisonExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;


            			current = this_ComparisonExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1621:3: ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Comma) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSolverLanguageParser.g:1622:4: () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+
                    {
                    // InternalSolverLanguageParser.g:1622:4: ()
                    // InternalSolverLanguageParser.g:1623:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getConjunctiveExpressionAccess().getConjunctionChildrenAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSolverLanguageParser.g:1629:4: (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==Comma) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:1630:5: otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_6); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getConjunctiveExpressionAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalSolverLanguageParser.g:1634:5: ( (lv_children_3_0= ruleComparisonExpression ) )
                    	    // InternalSolverLanguageParser.g:1635:6: (lv_children_3_0= ruleComparisonExpression )
                    	    {
                    	    // InternalSolverLanguageParser.g:1635:6: (lv_children_3_0= ruleComparisonExpression )
                    	    // InternalSolverLanguageParser.g:1636:7: lv_children_3_0= ruleComparisonExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getConjunctiveExpressionAccess().getChildrenComparisonExpressionParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
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
    // InternalSolverLanguageParser.g:1659:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalSolverLanguageParser.g:1659:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalSolverLanguageParser.g:1660:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
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
    // InternalSolverLanguageParser.g:1666:1: ruleComparisonExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1672:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) )
            // InternalSolverLanguageParser.g:1673:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            {
            // InternalSolverLanguageParser.g:1673:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            // InternalSolverLanguageParser.g:1674:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1682:3: ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ExclamationMarkEqualsSign||(LA17_0>=LessThanSignEqualsSign && LA17_0<=EqualsSignEqualsSign)||LA17_0==GreaterThanSignEqualsSign||LA17_0==In||LA17_0==LessThanSign||LA17_0==GreaterThanSign) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSolverLanguageParser.g:1683:4: () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
                    {
                    // InternalSolverLanguageParser.g:1683:4: ()
                    // InternalSolverLanguageParser.g:1684:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getComparisonExpressionAccess().getComparisonLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSolverLanguageParser.g:1690:4: ( (lv_op_2_0= ruleComparisonOperator ) )
                    // InternalSolverLanguageParser.g:1691:5: (lv_op_2_0= ruleComparisonOperator )
                    {
                    // InternalSolverLanguageParser.g:1691:5: (lv_op_2_0= ruleComparisonOperator )
                    // InternalSolverLanguageParser.g:1692:6: lv_op_2_0= ruleComparisonOperator
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

                    // InternalSolverLanguageParser.g:1709:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
                    // InternalSolverLanguageParser.g:1710:5: (lv_right_3_0= ruleAdditiveExpression )
                    {
                    // InternalSolverLanguageParser.g:1710:5: (lv_right_3_0= ruleAdditiveExpression )
                    // InternalSolverLanguageParser.g:1711:6: lv_right_3_0= ruleAdditiveExpression
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
    // InternalSolverLanguageParser.g:1733:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalSolverLanguageParser.g:1733:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalSolverLanguageParser.g:1734:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalSolverLanguageParser.g:1740:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1746:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalSolverLanguageParser.g:1747:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalSolverLanguageParser.g:1747:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalSolverLanguageParser.g:1748:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1756:3: ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==PlusSign||LA18_0==HyphenMinus) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:1757:4: () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalSolverLanguageParser.g:1757:4: ()
            	    // InternalSolverLanguageParser.g:1758:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSolverLanguageParser.g:1764:4: ( (lv_op_2_0= ruleAdditiveBinaryOperator ) )
            	    // InternalSolverLanguageParser.g:1765:5: (lv_op_2_0= ruleAdditiveBinaryOperator )
            	    {
            	    // InternalSolverLanguageParser.g:1765:5: (lv_op_2_0= ruleAdditiveBinaryOperator )
            	    // InternalSolverLanguageParser.g:1766:6: lv_op_2_0= ruleAdditiveBinaryOperator
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

            	    // InternalSolverLanguageParser.g:1783:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalSolverLanguageParser.g:1784:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalSolverLanguageParser.g:1784:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalSolverLanguageParser.g:1785:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalSolverLanguageParser.g:1807:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalSolverLanguageParser.g:1807:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalSolverLanguageParser.g:1808:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalSolverLanguageParser.g:1814:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentialExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1820:2: ( (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* ) )
            // InternalSolverLanguageParser.g:1821:2: (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* )
            {
            // InternalSolverLanguageParser.g:1821:2: (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* )
            // InternalSolverLanguageParser.g:1822:3: this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExponentialExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_ExponentialExpression_0=ruleExponentialExpression();

            state._fsp--;


            			current = this_ExponentialExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1830:3: ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Asterisk||LA19_0==Solidus) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:1831:4: () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) )
            	    {
            	    // InternalSolverLanguageParser.g:1831:4: ()
            	    // InternalSolverLanguageParser.g:1832:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSolverLanguageParser.g:1838:4: ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) )
            	    // InternalSolverLanguageParser.g:1839:5: (lv_op_2_0= ruleMultiplicativeBinaryOperator )
            	    {
            	    // InternalSolverLanguageParser.g:1839:5: (lv_op_2_0= ruleMultiplicativeBinaryOperator )
            	    // InternalSolverLanguageParser.g:1840:6: lv_op_2_0= ruleMultiplicativeBinaryOperator
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

            	    // InternalSolverLanguageParser.g:1857:4: ( (lv_right_3_0= ruleExponentialExpression ) )
            	    // InternalSolverLanguageParser.g:1858:5: (lv_right_3_0= ruleExponentialExpression )
            	    {
            	    // InternalSolverLanguageParser.g:1858:5: (lv_right_3_0= ruleExponentialExpression )
            	    // InternalSolverLanguageParser.g:1859:6: lv_right_3_0= ruleExponentialExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightExponentialExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleExponentialExpression"
    // InternalSolverLanguageParser.g:1881:1: entryRuleExponentialExpression returns [EObject current=null] : iv_ruleExponentialExpression= ruleExponentialExpression EOF ;
    public final EObject entryRuleExponentialExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialExpression = null;


        try {
            // InternalSolverLanguageParser.g:1881:62: (iv_ruleExponentialExpression= ruleExponentialExpression EOF )
            // InternalSolverLanguageParser.g:1882:2: iv_ruleExponentialExpression= ruleExponentialExpression EOF
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
    // InternalSolverLanguageParser.g:1888:1: ruleExponentialExpression returns [EObject current=null] : (this_CastExpression_0= ruleCastExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )? ) ;
    public final EObject ruleExponentialExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CastExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1894:2: ( (this_CastExpression_0= ruleCastExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )? ) )
            // InternalSolverLanguageParser.g:1895:2: (this_CastExpression_0= ruleCastExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )? )
            {
            // InternalSolverLanguageParser.g:1895:2: (this_CastExpression_0= ruleCastExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )? )
            // InternalSolverLanguageParser.g:1896:3: this_CastExpression_0= ruleCastExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getExponentialExpressionAccess().getCastExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_CastExpression_0=ruleCastExpression();

            state._fsp--;


            			current = this_CastExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1904:3: ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==CircumflexAccent) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSolverLanguageParser.g:1905:4: () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleCastExpression ) )
                    {
                    // InternalSolverLanguageParser.g:1905:4: ()
                    // InternalSolverLanguageParser.g:1906:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExponentialExpressionAccess().getBinaryExpressionLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSolverLanguageParser.g:1912:4: ( (lv_op_2_0= ruleExponentialOp ) )
                    // InternalSolverLanguageParser.g:1913:5: (lv_op_2_0= ruleExponentialOp )
                    {
                    // InternalSolverLanguageParser.g:1913:5: (lv_op_2_0= ruleExponentialOp )
                    // InternalSolverLanguageParser.g:1914:6: lv_op_2_0= ruleExponentialOp
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

                    // InternalSolverLanguageParser.g:1931:4: ( (lv_right_3_0= ruleCastExpression ) )
                    // InternalSolverLanguageParser.g:1932:5: (lv_right_3_0= ruleCastExpression )
                    {
                    // InternalSolverLanguageParser.g:1932:5: (lv_right_3_0= ruleCastExpression )
                    // InternalSolverLanguageParser.g:1933:6: lv_right_3_0= ruleCastExpression
                    {

                    						newCompositeNode(grammarAccess.getExponentialExpressionAccess().getRightCastExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleCastExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExponentialExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.CastExpression");
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


    // $ANTLR start "entryRuleCastExpression"
    // InternalSolverLanguageParser.g:1955:1: entryRuleCastExpression returns [EObject current=null] : iv_ruleCastExpression= ruleCastExpression EOF ;
    public final EObject entryRuleCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpression = null;


        try {
            // InternalSolverLanguageParser.g:1955:55: (iv_ruleCastExpression= ruleCastExpression EOF )
            // InternalSolverLanguageParser.g:1956:2: iv_ruleCastExpression= ruleCastExpression EOF
            {
             newCompositeNode(grammarAccess.getCastExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCastExpression=ruleCastExpression();

            state._fsp--;

             current =iv_ruleCastExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCastExpression"


    // $ANTLR start "ruleCastExpression"
    // InternalSolverLanguageParser.g:1962:1: ruleCastExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= As ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryExpression_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1968:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= As ( ( ruleQualifiedName ) ) )? ) )
            // InternalSolverLanguageParser.g:1969:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= As ( ( ruleQualifiedName ) ) )? )
            {
            // InternalSolverLanguageParser.g:1969:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= As ( ( ruleQualifiedName ) ) )? )
            // InternalSolverLanguageParser.g:1970:3: this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= As ( ( ruleQualifiedName ) ) )?
            {

            			newCompositeNode(grammarAccess.getCastExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1978:3: ( () otherlv_2= As ( ( ruleQualifiedName ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==As) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSolverLanguageParser.g:1979:4: () otherlv_2= As ( ( ruleQualifiedName ) )
                    {
                    // InternalSolverLanguageParser.g:1979:4: ()
                    // InternalSolverLanguageParser.g:1980:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getCastExpressionAccess().getCastExpressionBodyAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,As,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getCastExpressionAccess().getAsKeyword_1_1());
                    			
                    // InternalSolverLanguageParser.g:1990:4: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:1991:5: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:1991:5: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:1992:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCastExpressionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCastExpressionAccess().getTypeNamedElementCrossReference_1_2_0());
                    					
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
    // $ANTLR end "ruleCastExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalSolverLanguageParser.g:2011:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalSolverLanguageParser.g:2011:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalSolverLanguageParser.g:2012:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalSolverLanguageParser.g:2018:1: ruleUnaryExpression returns [EObject current=null] : (this_AggregationExpression_0= ruleAggregationExpression | ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AggregationExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2024:2: ( (this_AggregationExpression_0= ruleAggregationExpression | ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) ) ) )
            // InternalSolverLanguageParser.g:2025:2: (this_AggregationExpression_0= ruleAggregationExpression | ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) ) )
            {
            // InternalSolverLanguageParser.g:2025:2: (this_AggregationExpression_0= ruleAggregationExpression | ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=Unknown && LA22_0<=Exists)||LA22_0==Forall||(LA22_0>=Count && LA22_0<=False)||LA22_0==True||LA22_0==Inf||LA22_0==LeftParenthesis||LA22_0==LeftSquareBracket||(LA22_0>=RULE_STRING && LA22_0<=RULE_QUOTED_ID)||(LA22_0>=RULE_ID && LA22_0<=RULE_INT)) ) {
                alt22=1;
            }
            else if ( (LA22_0==Current||LA22_0==Must||LA22_0==May||LA22_0==ExclamationMark||LA22_0==PlusSign||LA22_0==HyphenMinus) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSolverLanguageParser.g:2026:3: this_AggregationExpression_0= ruleAggregationExpression
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
                    // InternalSolverLanguageParser.g:2035:3: ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) )
                    {
                    // InternalSolverLanguageParser.g:2035:3: ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) )
                    // InternalSolverLanguageParser.g:2036:4: () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) )
                    {
                    // InternalSolverLanguageParser.g:2036:4: ()
                    // InternalSolverLanguageParser.g:2037:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSolverLanguageParser.g:2043:4: ( (lv_op_2_0= ruleUnaryOp ) )
                    // InternalSolverLanguageParser.g:2044:5: (lv_op_2_0= ruleUnaryOp )
                    {
                    // InternalSolverLanguageParser.g:2044:5: (lv_op_2_0= ruleUnaryOp )
                    // InternalSolverLanguageParser.g:2045:6: lv_op_2_0= ruleUnaryOp
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOpEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalSolverLanguageParser.g:2062:4: ( (lv_body_3_0= ruleAggregationExpression ) )
                    // InternalSolverLanguageParser.g:2063:5: (lv_body_3_0= ruleAggregationExpression )
                    {
                    // InternalSolverLanguageParser.g:2063:5: (lv_body_3_0= ruleAggregationExpression )
                    // InternalSolverLanguageParser.g:2064:6: lv_body_3_0= ruleAggregationExpression
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
    // InternalSolverLanguageParser.g:2086:1: entryRuleAggregationExpression returns [EObject current=null] : iv_ruleAggregationExpression= ruleAggregationExpression EOF ;
    public final EObject entryRuleAggregationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregationExpression = null;


        try {
            // InternalSolverLanguageParser.g:2086:62: (iv_ruleAggregationExpression= ruleAggregationExpression EOF )
            // InternalSolverLanguageParser.g:2087:2: iv_ruleAggregationExpression= ruleAggregationExpression EOF
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
    // InternalSolverLanguageParser.g:2093:1: ruleAggregationExpression returns [EObject current=null] : (this_AtomicExpression_0= ruleAtomicExpression | this_QuantifiedExpression_1= ruleQuantifiedExpression | this_Aggregation_2= ruleAggregation ) ;
    public final EObject ruleAggregationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExpression_0 = null;

        EObject this_QuantifiedExpression_1 = null;

        EObject this_Aggregation_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2099:2: ( (this_AtomicExpression_0= ruleAtomicExpression | this_QuantifiedExpression_1= ruleQuantifiedExpression | this_Aggregation_2= ruleAggregation ) )
            // InternalSolverLanguageParser.g:2100:2: (this_AtomicExpression_0= ruleAtomicExpression | this_QuantifiedExpression_1= ruleQuantifiedExpression | this_Aggregation_2= ruleAggregation )
            {
            // InternalSolverLanguageParser.g:2100:2: (this_AtomicExpression_0= ruleAtomicExpression | this_QuantifiedExpression_1= ruleQuantifiedExpression | this_Aggregation_2= ruleAggregation )
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalSolverLanguageParser.g:2101:3: this_AtomicExpression_0= ruleAtomicExpression
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
                    // InternalSolverLanguageParser.g:2110:3: this_QuantifiedExpression_1= ruleQuantifiedExpression
                    {

                    			newCompositeNode(grammarAccess.getAggregationExpressionAccess().getQuantifiedExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QuantifiedExpression_1=ruleQuantifiedExpression();

                    state._fsp--;


                    			current = this_QuantifiedExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:2119:3: this_Aggregation_2= ruleAggregation
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


    // $ANTLR start "entryRuleLocalVariables"
    // InternalSolverLanguageParser.g:2131:1: entryRuleLocalVariables returns [EObject current=null] : iv_ruleLocalVariables= ruleLocalVariables EOF ;
    public final EObject entryRuleLocalVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariables = null;


        try {
            // InternalSolverLanguageParser.g:2131:55: (iv_ruleLocalVariables= ruleLocalVariables EOF )
            // InternalSolverLanguageParser.g:2132:2: iv_ruleLocalVariables= ruleLocalVariables EOF
            {
             newCompositeNode(grammarAccess.getLocalVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalVariables=ruleLocalVariables();

            state._fsp--;

             current =iv_ruleLocalVariables; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVariables"


    // $ANTLR start "ruleLocalVariables"
    // InternalSolverLanguageParser.g:2138:1: ruleLocalVariables returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_variables_4_0= ruleVariable ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleLocalVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_variables_2_0 = null;

        EObject lv_variables_4_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2144:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_variables_4_0= ruleVariable ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalSolverLanguageParser.g:2145:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_variables_4_0= ruleVariable ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalSolverLanguageParser.g:2145:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_variables_4_0= ruleVariable ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalSolverLanguageParser.g:2146:3: () otherlv_1= LeftSquareBracket ( ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_variables_4_0= ruleVariable ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalSolverLanguageParser.g:2146:3: ()
            // InternalSolverLanguageParser.g:2147:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocalVariablesAccess().getLocalVariablesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalVariablesAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSolverLanguageParser.g:2157:3: ( ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_variables_4_0= ruleVariable ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_QUOTED_ID||LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSolverLanguageParser.g:2158:4: ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= Comma ( (lv_variables_4_0= ruleVariable ) ) )*
                    {
                    // InternalSolverLanguageParser.g:2158:4: ( (lv_variables_2_0= ruleVariable ) )
                    // InternalSolverLanguageParser.g:2159:5: (lv_variables_2_0= ruleVariable )
                    {
                    // InternalSolverLanguageParser.g:2159:5: (lv_variables_2_0= ruleVariable )
                    // InternalSolverLanguageParser.g:2160:6: lv_variables_2_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getLocalVariablesAccess().getVariablesVariableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_variables_2_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalVariablesRule());
                    						}
                    						add(
                    							current,
                    							"variables",
                    							lv_variables_2_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSolverLanguageParser.g:2177:4: (otherlv_3= Comma ( (lv_variables_4_0= ruleVariable ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:2178:5: otherlv_3= Comma ( (lv_variables_4_0= ruleVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getLocalVariablesAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSolverLanguageParser.g:2182:5: ( (lv_variables_4_0= ruleVariable ) )
                    	    // InternalSolverLanguageParser.g:2183:6: (lv_variables_4_0= ruleVariable )
                    	    {
                    	    // InternalSolverLanguageParser.g:2183:6: (lv_variables_4_0= ruleVariable )
                    	    // InternalSolverLanguageParser.g:2184:7: lv_variables_4_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getLocalVariablesAccess().getVariablesVariableParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_variables_4_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLocalVariablesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variables",
                    	    								lv_variables_4_0,
                    	    								"org.eclipse.viatra.solver.language.SolverLanguage.Variable");
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

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLocalVariablesAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalVariables"


    // $ANTLR start "entryRuleQuantifiedExpression"
    // InternalSolverLanguageParser.g:2211:1: entryRuleQuantifiedExpression returns [EObject current=null] : iv_ruleQuantifiedExpression= ruleQuantifiedExpression EOF ;
    public final EObject entryRuleQuantifiedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiedExpression = null;


        try {
            // InternalSolverLanguageParser.g:2211:61: (iv_ruleQuantifiedExpression= ruleQuantifiedExpression EOF )
            // InternalSolverLanguageParser.g:2212:2: iv_ruleQuantifiedExpression= ruleQuantifiedExpression EOF
            {
             newCompositeNode(grammarAccess.getQuantifiedExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantifiedExpression=ruleQuantifiedExpression();

            state._fsp--;

             current =iv_ruleQuantifiedExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantifiedExpression"


    // $ANTLR start "ruleQuantifiedExpression"
    // InternalSolverLanguageParser.g:2218:1: ruleQuantifiedExpression returns [EObject current=null] : ( ( (lv_quantifier_0_0= ruleQuantifier ) ) ( (lv_localVariables_1_0= ruleLocalVariables ) )? otherlv_2= LeftCurlyBracket ( (lv_body_3_0= ruleExpression ) ) otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleQuantifiedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_quantifier_0_0 = null;

        EObject lv_localVariables_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2224:2: ( ( ( (lv_quantifier_0_0= ruleQuantifier ) ) ( (lv_localVariables_1_0= ruleLocalVariables ) )? otherlv_2= LeftCurlyBracket ( (lv_body_3_0= ruleExpression ) ) otherlv_4= RightCurlyBracket ) )
            // InternalSolverLanguageParser.g:2225:2: ( ( (lv_quantifier_0_0= ruleQuantifier ) ) ( (lv_localVariables_1_0= ruleLocalVariables ) )? otherlv_2= LeftCurlyBracket ( (lv_body_3_0= ruleExpression ) ) otherlv_4= RightCurlyBracket )
            {
            // InternalSolverLanguageParser.g:2225:2: ( ( (lv_quantifier_0_0= ruleQuantifier ) ) ( (lv_localVariables_1_0= ruleLocalVariables ) )? otherlv_2= LeftCurlyBracket ( (lv_body_3_0= ruleExpression ) ) otherlv_4= RightCurlyBracket )
            // InternalSolverLanguageParser.g:2226:3: ( (lv_quantifier_0_0= ruleQuantifier ) ) ( (lv_localVariables_1_0= ruleLocalVariables ) )? otherlv_2= LeftCurlyBracket ( (lv_body_3_0= ruleExpression ) ) otherlv_4= RightCurlyBracket
            {
            // InternalSolverLanguageParser.g:2226:3: ( (lv_quantifier_0_0= ruleQuantifier ) )
            // InternalSolverLanguageParser.g:2227:4: (lv_quantifier_0_0= ruleQuantifier )
            {
            // InternalSolverLanguageParser.g:2227:4: (lv_quantifier_0_0= ruleQuantifier )
            // InternalSolverLanguageParser.g:2228:5: lv_quantifier_0_0= ruleQuantifier
            {

            					newCompositeNode(grammarAccess.getQuantifiedExpressionAccess().getQuantifierQuantifierEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_quantifier_0_0=ruleQuantifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantifiedExpressionRule());
            					}
            					set(
            						current,
            						"quantifier",
            						lv_quantifier_0_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Quantifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:2245:3: ( (lv_localVariables_1_0= ruleLocalVariables ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LeftSquareBracket) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSolverLanguageParser.g:2246:4: (lv_localVariables_1_0= ruleLocalVariables )
                    {
                    // InternalSolverLanguageParser.g:2246:4: (lv_localVariables_1_0= ruleLocalVariables )
                    // InternalSolverLanguageParser.g:2247:5: lv_localVariables_1_0= ruleLocalVariables
                    {

                    					newCompositeNode(grammarAccess.getQuantifiedExpressionAccess().getLocalVariablesLocalVariablesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_localVariables_1_0=ruleLocalVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuantifiedExpressionRule());
                    					}
                    					set(
                    						current,
                    						"localVariables",
                    						lv_localVariables_1_0,
                    						"org.eclipse.viatra.solver.language.SolverLanguage.LocalVariables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getQuantifiedExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSolverLanguageParser.g:2268:3: ( (lv_body_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:2269:4: (lv_body_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:2269:4: (lv_body_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:2270:5: lv_body_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getQuantifiedExpressionAccess().getBodyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_body_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantifiedExpressionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getQuantifiedExpressionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantifiedExpression"


    // $ANTLR start "entryRuleAggregation"
    // InternalSolverLanguageParser.g:2295:1: entryRuleAggregation returns [EObject current=null] : iv_ruleAggregation= ruleAggregation EOF ;
    public final EObject entryRuleAggregation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregation = null;


        try {
            // InternalSolverLanguageParser.g:2295:52: (iv_ruleAggregation= ruleAggregation EOF )
            // InternalSolverLanguageParser.g:2296:2: iv_ruleAggregation= ruleAggregation EOF
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
    // InternalSolverLanguageParser.g:2302:1: ruleAggregation returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_localVariables_1_0= ruleLocalVariables ) )? otherlv_2= LeftCurlyBracket ( (lv_body_3_0= ruleExpression ) ) (otherlv_4= VerticalLine ( (lv_condition_5_0= ruleExpression ) ) )? otherlv_6= RightCurlyBracket ) ;
    public final EObject ruleAggregation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_localVariables_1_0 = null;

        EObject lv_body_3_0 = null;

        EObject lv_condition_5_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2308:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_localVariables_1_0= ruleLocalVariables ) )? otherlv_2= LeftCurlyBracket ( (lv_body_3_0= ruleExpression ) ) (otherlv_4= VerticalLine ( (lv_condition_5_0= ruleExpression ) ) )? otherlv_6= RightCurlyBracket ) )
            // InternalSolverLanguageParser.g:2309:2: ( ( ( ruleQualifiedName ) ) ( (lv_localVariables_1_0= ruleLocalVariables ) )? otherlv_2= LeftCurlyBracket ( (lv_body_3_0= ruleExpression ) ) (otherlv_4= VerticalLine ( (lv_condition_5_0= ruleExpression ) ) )? otherlv_6= RightCurlyBracket )
            {
            // InternalSolverLanguageParser.g:2309:2: ( ( ( ruleQualifiedName ) ) ( (lv_localVariables_1_0= ruleLocalVariables ) )? otherlv_2= LeftCurlyBracket ( (lv_body_3_0= ruleExpression ) ) (otherlv_4= VerticalLine ( (lv_condition_5_0= ruleExpression ) ) )? otherlv_6= RightCurlyBracket )
            // InternalSolverLanguageParser.g:2310:3: ( ( ruleQualifiedName ) ) ( (lv_localVariables_1_0= ruleLocalVariables ) )? otherlv_2= LeftCurlyBracket ( (lv_body_3_0= ruleExpression ) ) (otherlv_4= VerticalLine ( (lv_condition_5_0= ruleExpression ) ) )? otherlv_6= RightCurlyBracket
            {
            // InternalSolverLanguageParser.g:2310:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:2311:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:2311:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:2312:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAggregationAccess().getOpNamedElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_36);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:2326:3: ( (lv_localVariables_1_0= ruleLocalVariables ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LeftSquareBracket) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSolverLanguageParser.g:2327:4: (lv_localVariables_1_0= ruleLocalVariables )
                    {
                    // InternalSolverLanguageParser.g:2327:4: (lv_localVariables_1_0= ruleLocalVariables )
                    // InternalSolverLanguageParser.g:2328:5: lv_localVariables_1_0= ruleLocalVariables
                    {

                    					newCompositeNode(grammarAccess.getAggregationAccess().getLocalVariablesLocalVariablesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_localVariables_1_0=ruleLocalVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAggregationRule());
                    					}
                    					set(
                    						current,
                    						"localVariables",
                    						lv_localVariables_1_0,
                    						"org.eclipse.viatra.solver.language.SolverLanguage.LocalVariables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAggregationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSolverLanguageParser.g:2349:3: ( (lv_body_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:2350:4: (lv_body_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:2350:4: (lv_body_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:2351:5: lv_body_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAggregationAccess().getBodyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_37);
            lv_body_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregationRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:2368:3: (otherlv_4= VerticalLine ( (lv_condition_5_0= ruleExpression ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==VerticalLine) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSolverLanguageParser.g:2369:4: otherlv_4= VerticalLine ( (lv_condition_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,VerticalLine,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAggregationAccess().getVerticalLineKeyword_4_0());
                    			
                    // InternalSolverLanguageParser.g:2373:4: ( (lv_condition_5_0= ruleExpression ) )
                    // InternalSolverLanguageParser.g:2374:5: (lv_condition_5_0= ruleExpression )
                    {
                    // InternalSolverLanguageParser.g:2374:5: (lv_condition_5_0= ruleExpression )
                    // InternalSolverLanguageParser.g:2375:6: lv_condition_5_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getAggregationAccess().getConditionExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_condition_5_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAggregationRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_5_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAggregationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalSolverLanguageParser.g:2401:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalSolverLanguageParser.g:2401:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalSolverLanguageParser.g:2402:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalSolverLanguageParser.g:2408:1: ruleAtomicExpression returns [EObject current=null] : (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) ) ;
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
            // InternalSolverLanguageParser.g:2414:2: ( (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) ) )
            // InternalSolverLanguageParser.g:2415:2: (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) )
            {
            // InternalSolverLanguageParser.g:2415:2: (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) )
            int alt29=5;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalSolverLanguageParser.g:2416:3: this_Reference_0= ruleReference
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
                    // InternalSolverLanguageParser.g:2425:3: this_Call_1= ruleCall
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
                    // InternalSolverLanguageParser.g:2434:3: this_Interval_2= ruleInterval
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
                    // InternalSolverLanguageParser.g:2443:3: this_Literal_3= ruleLiteral
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
                    // InternalSolverLanguageParser.g:2452:3: (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis )
                    {
                    // InternalSolverLanguageParser.g:2452:3: (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis )
                    // InternalSolverLanguageParser.g:2453:4: otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis
                    {
                    otherlv_4=(Token)match(input,LeftParenthesis,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomicExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_38);
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
    // InternalSolverLanguageParser.g:2474:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalSolverLanguageParser.g:2474:45: (iv_ruleCall= ruleCall EOF )
            // InternalSolverLanguageParser.g:2475:2: iv_ruleCall= ruleCall EOF
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
    // InternalSolverLanguageParser.g:2481:1: ruleCall returns [EObject current=null] : ( ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) ) ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token lv_transitiveClosure_1_0=null;
        Token lv_reflexiveTransitiveClosure_2_0=null;
        EObject lv_functor_0_0 = null;

        EObject lv_argumentList_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2487:2: ( ( ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) ) ) )
            // InternalSolverLanguageParser.g:2488:2: ( ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) ) )
            {
            // InternalSolverLanguageParser.g:2488:2: ( ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) ) )
            // InternalSolverLanguageParser.g:2489:3: ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) )
            {
            // InternalSolverLanguageParser.g:2489:3: ( (lv_functor_0_0= ruleReference ) )
            // InternalSolverLanguageParser.g:2490:4: (lv_functor_0_0= ruleReference )
            {
            // InternalSolverLanguageParser.g:2490:4: (lv_functor_0_0= ruleReference )
            // InternalSolverLanguageParser.g:2491:5: lv_functor_0_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getCallAccess().getFunctorReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_39);
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

            // InternalSolverLanguageParser.g:2508:3: ( ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_TRANSITIVE_CLOSURE) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_REFLEXIVE_TRANSITIVE_CLOSURE) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // InternalSolverLanguageParser.g:2509:4: ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) )
                    {
                    // InternalSolverLanguageParser.g:2509:4: ( (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE ) )
                    // InternalSolverLanguageParser.g:2510:5: (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE )
                    {
                    // InternalSolverLanguageParser.g:2510:5: (lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE )
                    // InternalSolverLanguageParser.g:2511:6: lv_transitiveClosure_1_0= RULE_TRANSITIVE_CLOSURE
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
                    // InternalSolverLanguageParser.g:2528:4: ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) )
                    {
                    // InternalSolverLanguageParser.g:2528:4: ( (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) )
                    // InternalSolverLanguageParser.g:2529:5: (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE )
                    {
                    // InternalSolverLanguageParser.g:2529:5: (lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE )
                    // InternalSolverLanguageParser.g:2530:6: lv_reflexiveTransitiveClosure_2_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE
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

            // InternalSolverLanguageParser.g:2547:3: ( (lv_argumentList_3_0= ruleArgumentList ) )
            // InternalSolverLanguageParser.g:2548:4: (lv_argumentList_3_0= ruleArgumentList )
            {
            // InternalSolverLanguageParser.g:2548:4: (lv_argumentList_3_0= ruleArgumentList )
            // InternalSolverLanguageParser.g:2549:5: lv_argumentList_3_0= ruleArgumentList
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
    // InternalSolverLanguageParser.g:2570:1: entryRuleArgumentList returns [EObject current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final EObject entryRuleArgumentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentList = null;


        try {
            // InternalSolverLanguageParser.g:2570:53: (iv_ruleArgumentList= ruleArgumentList EOF )
            // InternalSolverLanguageParser.g:2571:2: iv_ruleArgumentList= ruleArgumentList EOF
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
    // InternalSolverLanguageParser.g:2577:1: ruleArgumentList returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleArgumentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2583:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalSolverLanguageParser.g:2584:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalSolverLanguageParser.g:2584:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis )
            // InternalSolverLanguageParser.g:2585:3: () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalSolverLanguageParser.g:2585:3: ()
            // InternalSolverLanguageParser.g:2586:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArgumentListAccess().getArgumentListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentListAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSolverLanguageParser.g:2596:3: ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Current||(LA32_0>=Unknown && LA32_0<=Exists)||LA32_0==Forall||(LA32_0>=Count && LA32_0<=False)||LA32_0==Must||LA32_0==True||LA32_0==Inf||LA32_0==May||(LA32_0>=ExclamationMark && LA32_0<=LeftParenthesis)||(LA32_0>=Asterisk && LA32_0<=PlusSign)||LA32_0==HyphenMinus||LA32_0==LeftSquareBracket||(LA32_0>=RULE_STRING && LA32_0<=RULE_QUOTED_ID)||(LA32_0>=RULE_ID && LA32_0<=RULE_INT)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSolverLanguageParser.g:2597:4: ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )*
                    {
                    // InternalSolverLanguageParser.g:2597:4: ( (lv_arguments_2_0= ruleArgument ) )
                    // InternalSolverLanguageParser.g:2598:5: (lv_arguments_2_0= ruleArgument )
                    {
                    // InternalSolverLanguageParser.g:2598:5: (lv_arguments_2_0= ruleArgument )
                    // InternalSolverLanguageParser.g:2599:6: lv_arguments_2_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalSolverLanguageParser.g:2616:4: (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==Comma) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:2617:5: otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_42); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArgumentListAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSolverLanguageParser.g:2621:5: ( (lv_arguments_4_0= ruleArgument ) )
                    	    // InternalSolverLanguageParser.g:2622:6: (lv_arguments_4_0= ruleArgument )
                    	    {
                    	    // InternalSolverLanguageParser.g:2622:6: (lv_arguments_4_0= ruleArgument )
                    	    // InternalSolverLanguageParser.g:2623:7: lv_arguments_4_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop31;
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
    // InternalSolverLanguageParser.g:2650:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalSolverLanguageParser.g:2650:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalSolverLanguageParser.g:2651:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalSolverLanguageParser.g:2657:1: ruleArgument returns [EObject current=null] : (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionArgument_0 = null;

        EObject this_StarArgument_1 = null;

        EObject this_TypedArgument_2 = null;

        EObject this_TypedStarArgument_3 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2663:2: ( (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument ) )
            // InternalSolverLanguageParser.g:2664:2: (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument )
            {
            // InternalSolverLanguageParser.g:2664:2: (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument )
            int alt33=4;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalSolverLanguageParser.g:2665:3: this_ExpressionArgument_0= ruleExpressionArgument
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
                    // InternalSolverLanguageParser.g:2674:3: this_StarArgument_1= ruleStarArgument
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
                    // InternalSolverLanguageParser.g:2683:3: this_TypedArgument_2= ruleTypedArgument
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
                    // InternalSolverLanguageParser.g:2692:3: this_TypedStarArgument_3= ruleTypedStarArgument
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
    // InternalSolverLanguageParser.g:2704:1: entryRuleExpressionArgument returns [EObject current=null] : iv_ruleExpressionArgument= ruleExpressionArgument EOF ;
    public final EObject entryRuleExpressionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionArgument = null;


        try {
            // InternalSolverLanguageParser.g:2704:59: (iv_ruleExpressionArgument= ruleExpressionArgument EOF )
            // InternalSolverLanguageParser.g:2705:2: iv_ruleExpressionArgument= ruleExpressionArgument EOF
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
    // InternalSolverLanguageParser.g:2711:1: ruleExpressionArgument returns [EObject current=null] : ( (lv_body_0_0= ruleComparisonExpression ) ) ;
    public final EObject ruleExpressionArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_body_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2717:2: ( ( (lv_body_0_0= ruleComparisonExpression ) ) )
            // InternalSolverLanguageParser.g:2718:2: ( (lv_body_0_0= ruleComparisonExpression ) )
            {
            // InternalSolverLanguageParser.g:2718:2: ( (lv_body_0_0= ruleComparisonExpression ) )
            // InternalSolverLanguageParser.g:2719:3: (lv_body_0_0= ruleComparisonExpression )
            {
            // InternalSolverLanguageParser.g:2719:3: (lv_body_0_0= ruleComparisonExpression )
            // InternalSolverLanguageParser.g:2720:4: lv_body_0_0= ruleComparisonExpression
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
    // InternalSolverLanguageParser.g:2740:1: entryRuleStarArgument returns [EObject current=null] : iv_ruleStarArgument= ruleStarArgument EOF ;
    public final EObject entryRuleStarArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStarArgument = null;


        try {
            // InternalSolverLanguageParser.g:2740:53: (iv_ruleStarArgument= ruleStarArgument EOF )
            // InternalSolverLanguageParser.g:2741:2: iv_ruleStarArgument= ruleStarArgument EOF
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
    // InternalSolverLanguageParser.g:2747:1: ruleStarArgument returns [EObject current=null] : ( () otherlv_1= Asterisk ) ;
    public final EObject ruleStarArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2753:2: ( ( () otherlv_1= Asterisk ) )
            // InternalSolverLanguageParser.g:2754:2: ( () otherlv_1= Asterisk )
            {
            // InternalSolverLanguageParser.g:2754:2: ( () otherlv_1= Asterisk )
            // InternalSolverLanguageParser.g:2755:3: () otherlv_1= Asterisk
            {
            // InternalSolverLanguageParser.g:2755:3: ()
            // InternalSolverLanguageParser.g:2756:4: 
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
    // InternalSolverLanguageParser.g:2770:1: entryRuleTypedArgument returns [EObject current=null] : iv_ruleTypedArgument= ruleTypedArgument EOF ;
    public final EObject entryRuleTypedArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedArgument = null;


        try {
            // InternalSolverLanguageParser.g:2770:54: (iv_ruleTypedArgument= ruleTypedArgument EOF )
            // InternalSolverLanguageParser.g:2771:2: iv_ruleTypedArgument= ruleTypedArgument EOF
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
    // InternalSolverLanguageParser.g:2777:1: ruleTypedArgument returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTypedArgument() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2783:2: ( ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalSolverLanguageParser.g:2784:2: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalSolverLanguageParser.g:2784:2: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) )
            // InternalSolverLanguageParser.g:2785:3: ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) )
            {
            // InternalSolverLanguageParser.g:2785:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:2786:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:2786:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:2787:5: ruleQualifiedName
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

            // InternalSolverLanguageParser.g:2801:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:2802:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:2802:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:2803:5: ruleQualifiedName
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
    // InternalSolverLanguageParser.g:2821:1: entryRuleTypedStarArgument returns [EObject current=null] : iv_ruleTypedStarArgument= ruleTypedStarArgument EOF ;
    public final EObject entryRuleTypedStarArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedStarArgument = null;


        try {
            // InternalSolverLanguageParser.g:2821:58: (iv_ruleTypedStarArgument= ruleTypedStarArgument EOF )
            // InternalSolverLanguageParser.g:2822:2: iv_ruleTypedStarArgument= ruleTypedStarArgument EOF
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
    // InternalSolverLanguageParser.g:2828:1: ruleTypedStarArgument returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= Asterisk ) ;
    public final EObject ruleTypedStarArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2834:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= Asterisk ) )
            // InternalSolverLanguageParser.g:2835:2: ( ( ( ruleQualifiedName ) ) otherlv_1= Asterisk )
            {
            // InternalSolverLanguageParser.g:2835:2: ( ( ( ruleQualifiedName ) ) otherlv_1= Asterisk )
            // InternalSolverLanguageParser.g:2836:3: ( ( ruleQualifiedName ) ) otherlv_1= Asterisk
            {
            // InternalSolverLanguageParser.g:2836:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:2837:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:2837:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:2838:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedStarArgumentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTypedStarArgumentAccess().getTypeNamedElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_43);
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
    // InternalSolverLanguageParser.g:2860:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalSolverLanguageParser.g:2860:50: (iv_ruleReference= ruleReference EOF )
            // InternalSolverLanguageParser.g:2861:2: iv_ruleReference= ruleReference EOF
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
    // InternalSolverLanguageParser.g:2867:1: ruleReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2873:2: ( ( ( ruleQualifiedName ) ) )
            // InternalSolverLanguageParser.g:2874:2: ( ( ruleQualifiedName ) )
            {
            // InternalSolverLanguageParser.g:2874:2: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:2875:3: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:2875:3: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:2876:4: ruleQualifiedName
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
    // InternalSolverLanguageParser.g:2893:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalSolverLanguageParser.g:2893:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalSolverLanguageParser.g:2894:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalSolverLanguageParser.g:2900:1: ruleInterval returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= RightSquareBracket ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lowerBound_1_0 = null;

        EObject lv_upperBound_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2906:2: ( (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= RightSquareBracket ) )
            // InternalSolverLanguageParser.g:2907:2: (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= RightSquareBracket )
            {
            // InternalSolverLanguageParser.g:2907:2: (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= RightSquareBracket )
            // InternalSolverLanguageParser.g:2908:3: otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSolverLanguageParser.g:2912:3: ( (lv_lowerBound_1_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:2913:4: (lv_lowerBound_1_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:2913:4: (lv_lowerBound_1_0= ruleExpression )
            // InternalSolverLanguageParser.g:2914:5: lv_lowerBound_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getLowerBoundExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_44);
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
            		
            // InternalSolverLanguageParser.g:2935:3: ( (lv_upperBound_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:2936:4: (lv_upperBound_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:2936:4: (lv_upperBound_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:2937:5: lv_upperBound_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getUpperBoundExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
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
    // InternalSolverLanguageParser.g:2962:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalSolverLanguageParser.g:2962:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalSolverLanguageParser.g:2963:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalSolverLanguageParser.g:2969:1: ruleLiteral returns [EObject current=null] : (this_LogicLiteral_0= ruleLogicLiteral | this_NumericLiteral_1= ruleNumericLiteral | this_InfinityLiteral_2= ruleInfinityLiteral | this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_LogicLiteral_0 = null;

        EObject this_NumericLiteral_1 = null;

        EObject this_InfinityLiteral_2 = null;

        EObject this_EmptyIntervalLiteral_3 = null;

        EObject this_StringLiteral_4 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2975:2: ( (this_LogicLiteral_0= ruleLogicLiteral | this_NumericLiteral_1= ruleNumericLiteral | this_InfinityLiteral_2= ruleInfinityLiteral | this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // InternalSolverLanguageParser.g:2976:2: (this_LogicLiteral_0= ruleLogicLiteral | this_NumericLiteral_1= ruleNumericLiteral | this_InfinityLiteral_2= ruleInfinityLiteral | this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // InternalSolverLanguageParser.g:2976:2: (this_LogicLiteral_0= ruleLogicLiteral | this_NumericLiteral_1= ruleNumericLiteral | this_InfinityLiteral_2= ruleInfinityLiteral | this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt34=5;
            switch ( input.LA(1) ) {
            case Unknown:
            case Error:
            case False:
            case True:
                {
                alt34=1;
                }
                break;
            case RULE_INT:
                {
                alt34=2;
                }
                break;
            case Inf:
                {
                alt34=3;
                }
                break;
            case Empty:
                {
                alt34=4;
                }
                break;
            case RULE_STRING:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalSolverLanguageParser.g:2977:3: this_LogicLiteral_0= ruleLogicLiteral
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
                    // InternalSolverLanguageParser.g:2986:3: this_NumericLiteral_1= ruleNumericLiteral
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
                    // InternalSolverLanguageParser.g:2995:3: this_InfinityLiteral_2= ruleInfinityLiteral
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
                    // InternalSolverLanguageParser.g:3004:3: this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral
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
                    // InternalSolverLanguageParser.g:3013:3: this_StringLiteral_4= ruleStringLiteral
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
    // InternalSolverLanguageParser.g:3025:1: entryRuleLogicLiteral returns [EObject current=null] : iv_ruleLogicLiteral= ruleLogicLiteral EOF ;
    public final EObject entryRuleLogicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicLiteral = null;


        try {
            // InternalSolverLanguageParser.g:3025:53: (iv_ruleLogicLiteral= ruleLogicLiteral EOF )
            // InternalSolverLanguageParser.g:3026:2: iv_ruleLogicLiteral= ruleLogicLiteral EOF
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
    // InternalSolverLanguageParser.g:3032:1: ruleLogicLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleLogicValue ) ) ;
    public final EObject ruleLogicLiteral() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3038:2: ( ( (lv_value_0_0= ruleLogicValue ) ) )
            // InternalSolverLanguageParser.g:3039:2: ( (lv_value_0_0= ruleLogicValue ) )
            {
            // InternalSolverLanguageParser.g:3039:2: ( (lv_value_0_0= ruleLogicValue ) )
            // InternalSolverLanguageParser.g:3040:3: (lv_value_0_0= ruleLogicValue )
            {
            // InternalSolverLanguageParser.g:3040:3: (lv_value_0_0= ruleLogicValue )
            // InternalSolverLanguageParser.g:3041:4: lv_value_0_0= ruleLogicValue
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
    // InternalSolverLanguageParser.g:3061:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalSolverLanguageParser.g:3061:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalSolverLanguageParser.g:3062:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
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
    // InternalSolverLanguageParser.g:3068:1: ruleNumericLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleReal ) ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3074:2: ( ( (lv_value_0_0= ruleReal ) ) )
            // InternalSolverLanguageParser.g:3075:2: ( (lv_value_0_0= ruleReal ) )
            {
            // InternalSolverLanguageParser.g:3075:2: ( (lv_value_0_0= ruleReal ) )
            // InternalSolverLanguageParser.g:3076:3: (lv_value_0_0= ruleReal )
            {
            // InternalSolverLanguageParser.g:3076:3: (lv_value_0_0= ruleReal )
            // InternalSolverLanguageParser.g:3077:4: lv_value_0_0= ruleReal
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
    // InternalSolverLanguageParser.g:3097:1: entryRuleInfinityLiteral returns [EObject current=null] : iv_ruleInfinityLiteral= ruleInfinityLiteral EOF ;
    public final EObject entryRuleInfinityLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfinityLiteral = null;


        try {
            // InternalSolverLanguageParser.g:3097:56: (iv_ruleInfinityLiteral= ruleInfinityLiteral EOF )
            // InternalSolverLanguageParser.g:3098:2: iv_ruleInfinityLiteral= ruleInfinityLiteral EOF
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
    // InternalSolverLanguageParser.g:3104:1: ruleInfinityLiteral returns [EObject current=null] : ( () otherlv_1= Inf ) ;
    public final EObject ruleInfinityLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3110:2: ( ( () otherlv_1= Inf ) )
            // InternalSolverLanguageParser.g:3111:2: ( () otherlv_1= Inf )
            {
            // InternalSolverLanguageParser.g:3111:2: ( () otherlv_1= Inf )
            // InternalSolverLanguageParser.g:3112:3: () otherlv_1= Inf
            {
            // InternalSolverLanguageParser.g:3112:3: ()
            // InternalSolverLanguageParser.g:3113:4: 
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
    // InternalSolverLanguageParser.g:3127:1: entryRuleEmptyIntervalLiteral returns [EObject current=null] : iv_ruleEmptyIntervalLiteral= ruleEmptyIntervalLiteral EOF ;
    public final EObject entryRuleEmptyIntervalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyIntervalLiteral = null;


        try {
            // InternalSolverLanguageParser.g:3127:61: (iv_ruleEmptyIntervalLiteral= ruleEmptyIntervalLiteral EOF )
            // InternalSolverLanguageParser.g:3128:2: iv_ruleEmptyIntervalLiteral= ruleEmptyIntervalLiteral EOF
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
    // InternalSolverLanguageParser.g:3134:1: ruleEmptyIntervalLiteral returns [EObject current=null] : ( () otherlv_1= Empty ) ;
    public final EObject ruleEmptyIntervalLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3140:2: ( ( () otherlv_1= Empty ) )
            // InternalSolverLanguageParser.g:3141:2: ( () otherlv_1= Empty )
            {
            // InternalSolverLanguageParser.g:3141:2: ( () otherlv_1= Empty )
            // InternalSolverLanguageParser.g:3142:3: () otherlv_1= Empty
            {
            // InternalSolverLanguageParser.g:3142:3: ()
            // InternalSolverLanguageParser.g:3143:4: 
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
    // InternalSolverLanguageParser.g:3157:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalSolverLanguageParser.g:3157:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalSolverLanguageParser.g:3158:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalSolverLanguageParser.g:3164:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3170:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSolverLanguageParser.g:3171:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSolverLanguageParser.g:3171:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSolverLanguageParser.g:3172:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSolverLanguageParser.g:3172:3: (lv_value_0_0= RULE_STRING )
            // InternalSolverLanguageParser.g:3173:4: lv_value_0_0= RULE_STRING
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
    // InternalSolverLanguageParser.g:3192:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalSolverLanguageParser.g:3192:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalSolverLanguageParser.g:3193:2: iv_ruleClassDefinition= ruleClassDefinition EOF
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
    // InternalSolverLanguageParser.g:3199:1: ruleClassDefinition returns [EObject current=null] : ( ( (lv_abstract_0_0= Abstract ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_7= LeftCurlyBracket ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= RightCurlyBracket ) ;
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
            // InternalSolverLanguageParser.g:3205:2: ( ( ( (lv_abstract_0_0= Abstract ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_7= LeftCurlyBracket ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= RightCurlyBracket ) )
            // InternalSolverLanguageParser.g:3206:2: ( ( (lv_abstract_0_0= Abstract ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_7= LeftCurlyBracket ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= RightCurlyBracket )
            {
            // InternalSolverLanguageParser.g:3206:2: ( ( (lv_abstract_0_0= Abstract ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_7= LeftCurlyBracket ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= RightCurlyBracket )
            // InternalSolverLanguageParser.g:3207:3: ( (lv_abstract_0_0= Abstract ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_7= LeftCurlyBracket ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= RightCurlyBracket
            {
            // InternalSolverLanguageParser.g:3207:3: ( (lv_abstract_0_0= Abstract ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Abstract) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSolverLanguageParser.g:3208:4: (lv_abstract_0_0= Abstract )
                    {
                    // InternalSolverLanguageParser.g:3208:4: (lv_abstract_0_0= Abstract )
                    // InternalSolverLanguageParser.g:3209:5: lv_abstract_0_0= Abstract
                    {
                    lv_abstract_0_0=(Token)match(input,Abstract,FOLLOW_46); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getClassDefinitionAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,Class,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getClassKeyword_1());
            		
            // InternalSolverLanguageParser.g:3225:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSolverLanguageParser.g:3226:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSolverLanguageParser.g:3226:4: (lv_name_2_0= RULE_ID )
            // InternalSolverLanguageParser.g:3227:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_47); 

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

            // InternalSolverLanguageParser.g:3243:3: (otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Extends) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSolverLanguageParser.g:3244:4: otherlv_3= Extends ( ( ruleQualifiedName ) ) (otherlv_5= Comma ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,Extends,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassDefinitionAccess().getExtendsKeyword_3_0());
                    			
                    // InternalSolverLanguageParser.g:3248:4: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:3249:5: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:3249:5: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:3250:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassDefinitionAccess().getSuperclassesNamedElementCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSolverLanguageParser.g:3264:4: (otherlv_5= Comma ( ( ruleQualifiedName ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==Comma) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:3265:5: otherlv_5= Comma ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getClassDefinitionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalSolverLanguageParser.g:3269:5: ( ( ruleQualifiedName ) )
                    	    // InternalSolverLanguageParser.g:3270:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalSolverLanguageParser.g:3270:6: ( ruleQualifiedName )
                    	    // InternalSolverLanguageParser.g:3271:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClassDefinitionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getClassDefinitionAccess().getSuperclassesNamedElementCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_48);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,LeftCurlyBracket,FOLLOW_49); 

            			newLeafNode(otherlv_7, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSolverLanguageParser.g:3291:3: ( (lv_members_8_0= ruleMemberDefinition ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==Contains||LA38_0==RULE_QUOTED_ID||LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:3292:4: (lv_members_8_0= ruleMemberDefinition )
            	    {
            	    // InternalSolverLanguageParser.g:3292:4: (lv_members_8_0= ruleMemberDefinition )
            	    // InternalSolverLanguageParser.g:3293:5: lv_members_8_0= ruleMemberDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getMembersMemberDefinitionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_49);
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
            	    break loop38;
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
    // InternalSolverLanguageParser.g:3318:1: entryRuleMemberDefinition returns [EObject current=null] : iv_ruleMemberDefinition= ruleMemberDefinition EOF ;
    public final EObject entryRuleMemberDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDefinition = null;


        try {
            // InternalSolverLanguageParser.g:3318:57: (iv_ruleMemberDefinition= ruleMemberDefinition EOF )
            // InternalSolverLanguageParser.g:3319:2: iv_ruleMemberDefinition= ruleMemberDefinition EOF
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
    // InternalSolverLanguageParser.g:3325:1: ruleMemberDefinition returns [EObject current=null] : ( ( (lv_containment_0_0= Contains ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_6= Semicolon )? ) ;
    public final EObject ruleMemberDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_containment_0_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_multiplicity_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3331:2: ( ( ( (lv_containment_0_0= Contains ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_6= Semicolon )? ) )
            // InternalSolverLanguageParser.g:3332:2: ( ( (lv_containment_0_0= Contains ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_6= Semicolon )? )
            {
            // InternalSolverLanguageParser.g:3332:2: ( ( (lv_containment_0_0= Contains ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_6= Semicolon )? )
            // InternalSolverLanguageParser.g:3333:3: ( (lv_containment_0_0= Contains ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_6= Semicolon )?
            {
            // InternalSolverLanguageParser.g:3333:3: ( (lv_containment_0_0= Contains ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Contains) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSolverLanguageParser.g:3334:4: (lv_containment_0_0= Contains )
                    {
                    // InternalSolverLanguageParser.g:3334:4: (lv_containment_0_0= Contains )
                    // InternalSolverLanguageParser.g:3335:5: lv_containment_0_0= Contains
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

            // InternalSolverLanguageParser.g:3347:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:3348:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:3348:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:3349:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMemberDefinitionAccess().getTypeNamedElementCrossReference_1_0());
            				
            pushFollow(FOLLOW_50);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:3363:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==LeftSquareBracket) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSolverLanguageParser.g:3364:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    {
                    // InternalSolverLanguageParser.g:3364:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    // InternalSolverLanguageParser.g:3365:5: lv_multiplicity_2_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getMemberDefinitionAccess().getMultiplicityMultiplicityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_20);
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

            // InternalSolverLanguageParser.g:3382:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSolverLanguageParser.g:3383:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSolverLanguageParser.g:3383:4: (lv_name_3_0= RULE_ID )
            // InternalSolverLanguageParser.g:3384:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_51); 

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

            // InternalSolverLanguageParser.g:3400:3: (otherlv_4= Opposite ( ( ruleQualifiedName ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Opposite) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSolverLanguageParser.g:3401:4: otherlv_4= Opposite ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,Opposite,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getMemberDefinitionAccess().getOppositeKeyword_4_0());
                    			
                    // InternalSolverLanguageParser.g:3405:4: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:3406:5: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:3406:5: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:3407:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMemberDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMemberDefinitionAccess().getOppositeNamedElementCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSolverLanguageParser.g:3422:3: (otherlv_6= Semicolon )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Semicolon) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSolverLanguageParser.g:3423:4: otherlv_6= Semicolon
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
    // InternalSolverLanguageParser.g:3432:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalSolverLanguageParser.g:3432:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalSolverLanguageParser.g:3433:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalSolverLanguageParser.g:3439:1: ruleMultiplicity returns [EObject current=null] : (this_ManyMultiplicity_0= ruleManyMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject this_ManyMultiplicity_0 = null;

        EObject this_ExactMultiplicity_1 = null;

        EObject this_BoundedMultiplicity_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3445:2: ( (this_ManyMultiplicity_0= ruleManyMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity ) )
            // InternalSolverLanguageParser.g:3446:2: (this_ManyMultiplicity_0= ruleManyMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity )
            {
            // InternalSolverLanguageParser.g:3446:2: (this_ManyMultiplicity_0= ruleManyMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==LeftSquareBracket) ) {
                switch ( input.LA(2) ) {
                case RULE_INT:
                    {
                    int LA43_2 = input.LA(3);

                    if ( (LA43_2==FullStopFullStop) ) {
                        alt43=3;
                    }
                    else if ( (LA43_2==RightSquareBracket) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case Asterisk:
                    {
                    alt43=2;
                    }
                    break;
                case RightSquareBracket:
                    {
                    alt43=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalSolverLanguageParser.g:3447:3: this_ManyMultiplicity_0= ruleManyMultiplicity
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
                    // InternalSolverLanguageParser.g:3456:3: this_ExactMultiplicity_1= ruleExactMultiplicity
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
                    // InternalSolverLanguageParser.g:3465:3: this_BoundedMultiplicity_2= ruleBoundedMultiplicity
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
    // InternalSolverLanguageParser.g:3477:1: entryRuleManyMultiplicity returns [EObject current=null] : iv_ruleManyMultiplicity= ruleManyMultiplicity EOF ;
    public final EObject entryRuleManyMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyMultiplicity = null;


        try {
            // InternalSolverLanguageParser.g:3477:57: (iv_ruleManyMultiplicity= ruleManyMultiplicity EOF )
            // InternalSolverLanguageParser.g:3478:2: iv_ruleManyMultiplicity= ruleManyMultiplicity EOF
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
    // InternalSolverLanguageParser.g:3484:1: ruleManyMultiplicity returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket ) ;
    public final EObject ruleManyMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3490:2: ( ( () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket ) )
            // InternalSolverLanguageParser.g:3491:2: ( () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket )
            {
            // InternalSolverLanguageParser.g:3491:2: ( () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket )
            // InternalSolverLanguageParser.g:3492:3: () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket
            {
            // InternalSolverLanguageParser.g:3492:3: ()
            // InternalSolverLanguageParser.g:3493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getManyMultiplicityAccess().getManyMultiplicityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_45); 

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
    // InternalSolverLanguageParser.g:3511:1: entryRuleExactMultiplicity returns [EObject current=null] : iv_ruleExactMultiplicity= ruleExactMultiplicity EOF ;
    public final EObject entryRuleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactMultiplicity = null;


        try {
            // InternalSolverLanguageParser.g:3511:58: (iv_ruleExactMultiplicity= ruleExactMultiplicity EOF )
            // InternalSolverLanguageParser.g:3512:2: iv_ruleExactMultiplicity= ruleExactMultiplicity EOF
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
    // InternalSolverLanguageParser.g:3518:1: ruleExactMultiplicity returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket ) ;
    public final EObject ruleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_multiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3524:2: ( (otherlv_0= LeftSquareBracket ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket ) )
            // InternalSolverLanguageParser.g:3525:2: (otherlv_0= LeftSquareBracket ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket )
            {
            // InternalSolverLanguageParser.g:3525:2: (otherlv_0= LeftSquareBracket ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket )
            // InternalSolverLanguageParser.g:3526:3: otherlv_0= LeftSquareBracket ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getExactMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSolverLanguageParser.g:3530:3: ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) )
            // InternalSolverLanguageParser.g:3531:4: (lv_multiplicity_1_0= ruleUpperMultiplicty )
            {
            // InternalSolverLanguageParser.g:3531:4: (lv_multiplicity_1_0= ruleUpperMultiplicty )
            // InternalSolverLanguageParser.g:3532:5: lv_multiplicity_1_0= ruleUpperMultiplicty
            {

            					newCompositeNode(grammarAccess.getExactMultiplicityAccess().getMultiplicityUpperMultiplictyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_45);
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
    // InternalSolverLanguageParser.g:3557:1: entryRuleBoundedMultiplicity returns [EObject current=null] : iv_ruleBoundedMultiplicity= ruleBoundedMultiplicity EOF ;
    public final EObject entryRuleBoundedMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundedMultiplicity = null;


        try {
            // InternalSolverLanguageParser.g:3557:60: (iv_ruleBoundedMultiplicity= ruleBoundedMultiplicity EOF )
            // InternalSolverLanguageParser.g:3558:2: iv_ruleBoundedMultiplicity= ruleBoundedMultiplicity EOF
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
    // InternalSolverLanguageParser.g:3564:1: ruleBoundedMultiplicity returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket ) ;
    public final EObject ruleBoundedMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerBound_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3570:2: ( (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket ) )
            // InternalSolverLanguageParser.g:3571:2: (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket )
            {
            // InternalSolverLanguageParser.g:3571:2: (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket )
            // InternalSolverLanguageParser.g:3572:3: otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= FullStopFullStop ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getBoundedMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSolverLanguageParser.g:3576:3: ( (lv_lowerBound_1_0= RULE_INT ) )
            // InternalSolverLanguageParser.g:3577:4: (lv_lowerBound_1_0= RULE_INT )
            {
            // InternalSolverLanguageParser.g:3577:4: (lv_lowerBound_1_0= RULE_INT )
            // InternalSolverLanguageParser.g:3578:5: lv_lowerBound_1_0= RULE_INT
            {
            lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_44); 

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

            otherlv_2=(Token)match(input,FullStopFullStop,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getBoundedMultiplicityAccess().getFullStopFullStopKeyword_2());
            		
            // InternalSolverLanguageParser.g:3598:3: ( (lv_upperBound_3_0= ruleUpperMultiplicty ) )
            // InternalSolverLanguageParser.g:3599:4: (lv_upperBound_3_0= ruleUpperMultiplicty )
            {
            // InternalSolverLanguageParser.g:3599:4: (lv_upperBound_3_0= ruleUpperMultiplicty )
            // InternalSolverLanguageParser.g:3600:5: lv_upperBound_3_0= ruleUpperMultiplicty
            {

            					newCompositeNode(grammarAccess.getBoundedMultiplicityAccess().getUpperBoundUpperMultiplictyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
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
    // InternalSolverLanguageParser.g:3625:1: entryRuleScopeDefinition returns [EObject current=null] : iv_ruleScopeDefinition= ruleScopeDefinition EOF ;
    public final EObject entryRuleScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDefinition = null;


        try {
            // InternalSolverLanguageParser.g:3625:56: (iv_ruleScopeDefinition= ruleScopeDefinition EOF )
            // InternalSolverLanguageParser.g:3626:2: iv_ruleScopeDefinition= ruleScopeDefinition EOF
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
    // InternalSolverLanguageParser.g:3632:1: ruleScopeDefinition returns [EObject current=null] : (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition ) ;
    public final EObject ruleScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ExactScopeDefinition_0 = null;

        EObject this_BoundedScopeDefinition_1 = null;

        EObject this_LowerBoundedScopeDefinition_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3638:2: ( (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition ) )
            // InternalSolverLanguageParser.g:3639:2: (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition )
            {
            // InternalSolverLanguageParser.g:3639:2: (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition )
            int alt44=3;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // InternalSolverLanguageParser.g:3640:3: this_ExactScopeDefinition_0= ruleExactScopeDefinition
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
                    // InternalSolverLanguageParser.g:3649:3: this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition
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
                    // InternalSolverLanguageParser.g:3658:3: this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition
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
    // InternalSolverLanguageParser.g:3670:1: entryRuleExactScopeDefinition returns [EObject current=null] : iv_ruleExactScopeDefinition= ruleExactScopeDefinition EOF ;
    public final EObject entryRuleExactScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactScopeDefinition = null;


        try {
            // InternalSolverLanguageParser.g:3670:61: (iv_ruleExactScopeDefinition= ruleExactScopeDefinition EOF )
            // InternalSolverLanguageParser.g:3671:2: iv_ruleExactScopeDefinition= ruleExactScopeDefinition EOF
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
    // InternalSolverLanguageParser.g:3677:1: ruleExactScopeDefinition returns [EObject current=null] : (otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_exactScope_3_0= RULE_INT ) ) ) ;
    public final EObject ruleExactScopeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_exactScope_3_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3683:2: ( (otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_exactScope_3_0= RULE_INT ) ) ) )
            // InternalSolverLanguageParser.g:3684:2: (otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_exactScope_3_0= RULE_INT ) ) )
            {
            // InternalSolverLanguageParser.g:3684:2: (otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_exactScope_3_0= RULE_INT ) ) )
            // InternalSolverLanguageParser.g:3685:3: otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_exactScope_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,Scope,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getExactScopeDefinitionAccess().getScopeKeyword_0());
            		
            // InternalSolverLanguageParser.g:3689:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:3690:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:3690:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:3691:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExactScopeDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExactScopeDefinitionAccess().getTypeNamedElementCrossReference_1_0());
            				
            pushFollow(FOLLOW_54);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSignEqualsSign,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getExactScopeDefinitionAccess().getEqualsSignEqualsSignKeyword_2());
            		
            // InternalSolverLanguageParser.g:3709:3: ( (lv_exactScope_3_0= RULE_INT ) )
            // InternalSolverLanguageParser.g:3710:4: (lv_exactScope_3_0= RULE_INT )
            {
            // InternalSolverLanguageParser.g:3710:4: (lv_exactScope_3_0= RULE_INT )
            // InternalSolverLanguageParser.g:3711:5: lv_exactScope_3_0= RULE_INT
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
    // InternalSolverLanguageParser.g:3731:1: entryRuleBoundedScopeDefinition returns [EObject current=null] : iv_ruleBoundedScopeDefinition= ruleBoundedScopeDefinition EOF ;
    public final EObject entryRuleBoundedScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundedScopeDefinition = null;


        try {
            // InternalSolverLanguageParser.g:3731:63: (iv_ruleBoundedScopeDefinition= ruleBoundedScopeDefinition EOF )
            // InternalSolverLanguageParser.g:3732:2: iv_ruleBoundedScopeDefinition= ruleBoundedScopeDefinition EOF
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
    // InternalSolverLanguageParser.g:3738:1: ruleBoundedScopeDefinition returns [EObject current=null] : (otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) ) ;
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
            // InternalSolverLanguageParser.g:3744:2: ( (otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) ) )
            // InternalSolverLanguageParser.g:3745:2: (otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) )
            {
            // InternalSolverLanguageParser.g:3745:2: (otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) )
            // InternalSolverLanguageParser.g:3746:3: otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) )
            {
            otherlv_0=(Token)match(input,Scope,FOLLOW_55); 

            			newLeafNode(otherlv_0, grammarAccess.getBoundedScopeDefinitionAccess().getScopeKeyword_0());
            		
            // InternalSolverLanguageParser.g:3750:3: ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==GreaterThanSignEqualsSign) ) {
                    alt47=2;
                }
                else if ( (LA47_1==LessThanSignEqualsSign) ) {
                    alt47=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA47_0==RULE_QUOTED_ID||LA47_0==RULE_ID) ) {
                alt47=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalSolverLanguageParser.g:3751:4: ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) )
                    {
                    // InternalSolverLanguageParser.g:3751:4: ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) )
                    // InternalSolverLanguageParser.g:3752:5: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) )
                    {
                    // InternalSolverLanguageParser.g:3752:5: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_INT) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalSolverLanguageParser.g:3753:6: ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign
                            {
                            // InternalSolverLanguageParser.g:3753:6: ( (lv_lowerBound_1_0= RULE_INT ) )
                            // InternalSolverLanguageParser.g:3754:7: (lv_lowerBound_1_0= RULE_INT )
                            {
                            // InternalSolverLanguageParser.g:3754:7: (lv_lowerBound_1_0= RULE_INT )
                            // InternalSolverLanguageParser.g:3755:8: lv_lowerBound_1_0= RULE_INT
                            {
                            lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_56); 

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

                    // InternalSolverLanguageParser.g:3776:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:3777:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:3777:6: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:3778:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBoundedScopeDefinitionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getBoundedScopeDefinitionAccess().getTypeNamedElementCrossReference_1_0_1_0());
                    						
                    pushFollow(FOLLOW_56);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,LessThanSignEqualsSign,FOLLOW_53); 

                    					newLeafNode(otherlv_4, grammarAccess.getBoundedScopeDefinitionAccess().getLessThanSignEqualsSignKeyword_1_0_2());
                    				
                    // InternalSolverLanguageParser.g:3796:5: ( (lv_upperBound_5_0= RULE_INT ) )
                    // InternalSolverLanguageParser.g:3797:6: (lv_upperBound_5_0= RULE_INT )
                    {
                    // InternalSolverLanguageParser.g:3797:6: (lv_upperBound_5_0= RULE_INT )
                    // InternalSolverLanguageParser.g:3798:7: lv_upperBound_5_0= RULE_INT
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
                    // InternalSolverLanguageParser.g:3816:4: ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? )
                    {
                    // InternalSolverLanguageParser.g:3816:4: ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? )
                    // InternalSolverLanguageParser.g:3817:5: ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )?
                    {
                    // InternalSolverLanguageParser.g:3817:5: ( (lv_upperBound_6_0= RULE_INT ) )
                    // InternalSolverLanguageParser.g:3818:6: (lv_upperBound_6_0= RULE_INT )
                    {
                    // InternalSolverLanguageParser.g:3818:6: (lv_upperBound_6_0= RULE_INT )
                    // InternalSolverLanguageParser.g:3819:7: lv_upperBound_6_0= RULE_INT
                    {
                    lv_upperBound_6_0=(Token)match(input,RULE_INT,FOLLOW_57); 

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
                    				
                    // InternalSolverLanguageParser.g:3839:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:3840:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:3840:6: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:3841:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBoundedScopeDefinitionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getBoundedScopeDefinitionAccess().getTypeNamedElementCrossReference_1_1_2_0());
                    						
                    pushFollow(FOLLOW_58);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSolverLanguageParser.g:3855:5: (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==GreaterThanSignEqualsSign) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalSolverLanguageParser.g:3856:6: otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) )
                            {
                            otherlv_9=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_53); 

                            						newLeafNode(otherlv_9, grammarAccess.getBoundedScopeDefinitionAccess().getGreaterThanSignEqualsSignKeyword_1_1_3_0());
                            					
                            // InternalSolverLanguageParser.g:3860:6: ( (lv_lowerBound_10_0= RULE_INT ) )
                            // InternalSolverLanguageParser.g:3861:7: (lv_lowerBound_10_0= RULE_INT )
                            {
                            // InternalSolverLanguageParser.g:3861:7: (lv_lowerBound_10_0= RULE_INT )
                            // InternalSolverLanguageParser.g:3862:8: lv_lowerBound_10_0= RULE_INT
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
    // InternalSolverLanguageParser.g:3885:1: entryRuleLowerBoundedScopeDefinition returns [EObject current=null] : iv_ruleLowerBoundedScopeDefinition= ruleLowerBoundedScopeDefinition EOF ;
    public final EObject entryRuleLowerBoundedScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerBoundedScopeDefinition = null;


        try {
            // InternalSolverLanguageParser.g:3885:68: (iv_ruleLowerBoundedScopeDefinition= ruleLowerBoundedScopeDefinition EOF )
            // InternalSolverLanguageParser.g:3886:2: iv_ruleLowerBoundedScopeDefinition= ruleLowerBoundedScopeDefinition EOF
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
    // InternalSolverLanguageParser.g:3892:1: ruleLowerBoundedScopeDefinition returns [EObject current=null] : (otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) ) ;
    public final EObject ruleLowerBoundedScopeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerBound_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_lowerBound_6_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3898:2: ( (otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) ) )
            // InternalSolverLanguageParser.g:3899:2: (otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) )
            {
            // InternalSolverLanguageParser.g:3899:2: (otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) )
            // InternalSolverLanguageParser.g:3900:3: otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) )
            {
            otherlv_0=(Token)match(input,Scope,FOLLOW_55); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerBoundedScopeDefinitionAccess().getScopeKeyword_0());
            		
            // InternalSolverLanguageParser.g:3904:3: ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_INT) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_QUOTED_ID||LA48_0==RULE_ID) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalSolverLanguageParser.g:3905:4: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) )
                    {
                    // InternalSolverLanguageParser.g:3905:4: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) )
                    // InternalSolverLanguageParser.g:3906:5: ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) )
                    {
                    // InternalSolverLanguageParser.g:3906:5: ( (lv_lowerBound_1_0= RULE_INT ) )
                    // InternalSolverLanguageParser.g:3907:6: (lv_lowerBound_1_0= RULE_INT )
                    {
                    // InternalSolverLanguageParser.g:3907:6: (lv_lowerBound_1_0= RULE_INT )
                    // InternalSolverLanguageParser.g:3908:7: lv_lowerBound_1_0= RULE_INT
                    {
                    lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_56); 

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
                    				
                    // InternalSolverLanguageParser.g:3928:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:3929:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:3929:6: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:3930:7: ruleQualifiedName
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
                    // InternalSolverLanguageParser.g:3946:4: ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) )
                    {
                    // InternalSolverLanguageParser.g:3946:4: ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) )
                    // InternalSolverLanguageParser.g:3947:5: ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) )
                    {
                    // InternalSolverLanguageParser.g:3947:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:3948:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:3948:6: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:3949:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLowerBoundedScopeDefinitionRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLowerBoundedScopeDefinitionAccess().getTypeNamedElementCrossReference_1_1_0_0());
                    						
                    pushFollow(FOLLOW_57);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_53); 

                    					newLeafNode(otherlv_5, grammarAccess.getLowerBoundedScopeDefinitionAccess().getGreaterThanSignEqualsSignKeyword_1_1_1());
                    				
                    // InternalSolverLanguageParser.g:3967:5: ( (lv_lowerBound_6_0= RULE_INT ) )
                    // InternalSolverLanguageParser.g:3968:6: (lv_lowerBound_6_0= RULE_INT )
                    {
                    // InternalSolverLanguageParser.g:3968:6: (lv_lowerBound_6_0= RULE_INT )
                    // InternalSolverLanguageParser.g:3969:7: lv_lowerBound_6_0= RULE_INT
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
    // InternalSolverLanguageParser.g:3991:1: entryRuleObjectiveDefinition returns [EObject current=null] : iv_ruleObjectiveDefinition= ruleObjectiveDefinition EOF ;
    public final EObject entryRuleObjectiveDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectiveDefinition = null;


        try {
            // InternalSolverLanguageParser.g:3991:60: (iv_ruleObjectiveDefinition= ruleObjectiveDefinition EOF )
            // InternalSolverLanguageParser.g:3992:2: iv_ruleObjectiveDefinition= ruleObjectiveDefinition EOF
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
    // InternalSolverLanguageParser.g:3998:1: ruleObjectiveDefinition returns [EObject current=null] : ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) ) ;
    public final EObject ruleObjectiveDefinition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        EObject lv_objective_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4004:2: ( ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:4005:2: ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:4005:2: ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:4006:3: ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) )
            {
            // InternalSolverLanguageParser.g:4006:3: ( (lv_kind_0_0= ruleObjectiveKind ) )
            // InternalSolverLanguageParser.g:4007:4: (lv_kind_0_0= ruleObjectiveKind )
            {
            // InternalSolverLanguageParser.g:4007:4: (lv_kind_0_0= ruleObjectiveKind )
            // InternalSolverLanguageParser.g:4008:5: lv_kind_0_0= ruleObjectiveKind
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

            // InternalSolverLanguageParser.g:4025:3: ( (lv_objective_1_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:4026:4: (lv_objective_1_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:4026:4: (lv_objective_1_0= ruleExpression )
            // InternalSolverLanguageParser.g:4027:5: lv_objective_1_0= ruleExpression
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
    // InternalSolverLanguageParser.g:4048:1: entryRuleUpperMultiplicty returns [String current=null] : iv_ruleUpperMultiplicty= ruleUpperMultiplicty EOF ;
    public final String entryRuleUpperMultiplicty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUpperMultiplicty = null;


        try {
            // InternalSolverLanguageParser.g:4048:56: (iv_ruleUpperMultiplicty= ruleUpperMultiplicty EOF )
            // InternalSolverLanguageParser.g:4049:2: iv_ruleUpperMultiplicty= ruleUpperMultiplicty EOF
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
    // InternalSolverLanguageParser.g:4055:1: ruleUpperMultiplicty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= Asterisk ) ;
    public final AntlrDatatypeRuleToken ruleUpperMultiplicty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4061:2: ( (this_INT_0= RULE_INT | kw= Asterisk ) )
            // InternalSolverLanguageParser.g:4062:2: (this_INT_0= RULE_INT | kw= Asterisk )
            {
            // InternalSolverLanguageParser.g:4062:2: (this_INT_0= RULE_INT | kw= Asterisk )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_INT) ) {
                alt49=1;
            }
            else if ( (LA49_0==Asterisk) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalSolverLanguageParser.g:4063:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getUpperMultiplictyAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4071:3: kw= Asterisk
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
    // InternalSolverLanguageParser.g:4080:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguageParser.g:4082:2: (iv_ruleReal= ruleReal EOF )
            // InternalSolverLanguageParser.g:4083:2: iv_ruleReal= ruleReal EOF
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
    // InternalSolverLanguageParser.g:4092:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguageParser.g:4099:2: ( (this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )? ) )
            // InternalSolverLanguageParser.g:4100:2: (this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )? )
            {
            // InternalSolverLanguageParser.g:4100:2: (this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )? )
            // InternalSolverLanguageParser.g:4101:3: this_INT_0= RULE_INT (kw= FullStop this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_59); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getRealAccess().getINTTerminalRuleCall_0());
            		
            // InternalSolverLanguageParser.g:4108:3: (kw= FullStop this_INT_2= RULE_INT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==FullStop) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSolverLanguageParser.g:4109:4: kw= FullStop this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,FullStop,FOLLOW_53); 

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
    // InternalSolverLanguageParser.g:4129:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguageParser.g:4131:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSolverLanguageParser.g:4132:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSolverLanguageParser.g:4141:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) | this_QUOTED_ID_3= RULE_QUOTED_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_QUOTED_ID_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguageParser.g:4148:2: ( ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) | this_QUOTED_ID_3= RULE_QUOTED_ID ) )
            // InternalSolverLanguageParser.g:4149:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) | this_QUOTED_ID_3= RULE_QUOTED_ID )
            {
            // InternalSolverLanguageParser.g:4149:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) | this_QUOTED_ID_3= RULE_QUOTED_ID )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_QUOTED_ID) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalSolverLanguageParser.g:4150:3: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
                    {
                    // InternalSolverLanguageParser.g:4150:3: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
                    // InternalSolverLanguageParser.g:4151:4: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_59); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0());
                    			
                    // InternalSolverLanguageParser.g:4158:4: (kw= FullStop this_ID_2= RULE_ID )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==FullStop) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:4159:5: kw= FullStop this_ID_2= RULE_ID
                    	    {
                    	    kw=(Token)match(input,FullStop,FOLLOW_20); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1_0());
                    	    				
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_59); 

                    	    					current.merge(this_ID_2);
                    	    				

                    	    					newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4174:3: this_QUOTED_ID_3= RULE_QUOTED_ID
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


    // $ANTLR start "ruleImplicationOperator"
    // InternalSolverLanguageParser.g:4188:1: ruleImplicationOperator returns [Enumerator current=null] : (enumLiteral_0= EqualsSignGreaterThanSign ) ;
    public final Enumerator ruleImplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4194:2: ( (enumLiteral_0= EqualsSignGreaterThanSign ) )
            // InternalSolverLanguageParser.g:4195:2: (enumLiteral_0= EqualsSignGreaterThanSign )
            {
            // InternalSolverLanguageParser.g:4195:2: (enumLiteral_0= EqualsSignGreaterThanSign )
            // InternalSolverLanguageParser.g:4196:3: enumLiteral_0= EqualsSignGreaterThanSign
            {
            enumLiteral_0=(Token)match(input,EqualsSignGreaterThanSign,FOLLOW_2); 

            			current = grammarAccess.getImplicationOperatorAccess().getIMPLIESEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getImplicationOperatorAccess().getIMPLIESEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplicationOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalSolverLanguageParser.g:4205:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) | (enumLiteral_6= In ) ) ;
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
            // InternalSolverLanguageParser.g:4211:2: ( ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) | (enumLiteral_6= In ) ) )
            // InternalSolverLanguageParser.g:4212:2: ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) | (enumLiteral_6= In ) )
            {
            // InternalSolverLanguageParser.g:4212:2: ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) | (enumLiteral_6= In ) )
            int alt53=7;
            switch ( input.LA(1) ) {
            case EqualsSignEqualsSign:
                {
                alt53=1;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt53=2;
                }
                break;
            case LessThanSign:
                {
                alt53=3;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt53=4;
                }
                break;
            case GreaterThanSign:
                {
                alt53=5;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt53=6;
                }
                break;
            case In:
                {
                alt53=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalSolverLanguageParser.g:4213:3: (enumLiteral_0= EqualsSignEqualsSign )
                    {
                    // InternalSolverLanguageParser.g:4213:3: (enumLiteral_0= EqualsSignEqualsSign )
                    // InternalSolverLanguageParser.g:4214:4: enumLiteral_0= EqualsSignEqualsSign
                    {
                    enumLiteral_0=(Token)match(input,EqualsSignEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4221:3: (enumLiteral_1= ExclamationMarkEqualsSign )
                    {
                    // InternalSolverLanguageParser.g:4221:3: (enumLiteral_1= ExclamationMarkEqualsSign )
                    // InternalSolverLanguageParser.g:4222:4: enumLiteral_1= ExclamationMarkEqualsSign
                    {
                    enumLiteral_1=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getNOT_EQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getNOT_EQEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:4229:3: (enumLiteral_2= LessThanSign )
                    {
                    // InternalSolverLanguageParser.g:4229:3: (enumLiteral_2= LessThanSign )
                    // InternalSolverLanguageParser.g:4230:4: enumLiteral_2= LessThanSign
                    {
                    enumLiteral_2=(Token)match(input,LessThanSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:4237:3: (enumLiteral_3= LessThanSignEqualsSign )
                    {
                    // InternalSolverLanguageParser.g:4237:3: (enumLiteral_3= LessThanSignEqualsSign )
                    // InternalSolverLanguageParser.g:4238:4: enumLiteral_3= LessThanSignEqualsSign
                    {
                    enumLiteral_3=(Token)match(input,LessThanSignEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESS_EQEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getLESS_EQEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSolverLanguageParser.g:4245:3: (enumLiteral_4= GreaterThanSign )
                    {
                    // InternalSolverLanguageParser.g:4245:3: (enumLiteral_4= GreaterThanSign )
                    // InternalSolverLanguageParser.g:4246:4: enumLiteral_4= GreaterThanSign
                    {
                    enumLiteral_4=(Token)match(input,GreaterThanSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSolverLanguageParser.g:4253:3: (enumLiteral_5= GreaterThanSignEqualsSign )
                    {
                    // InternalSolverLanguageParser.g:4253:3: (enumLiteral_5= GreaterThanSignEqualsSign )
                    // InternalSolverLanguageParser.g:4254:4: enumLiteral_5= GreaterThanSignEqualsSign
                    {
                    enumLiteral_5=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATER_EQEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getGREATER_EQEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSolverLanguageParser.g:4261:3: (enumLiteral_6= In )
                    {
                    // InternalSolverLanguageParser.g:4261:3: (enumLiteral_6= In )
                    // InternalSolverLanguageParser.g:4262:4: enumLiteral_6= In
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
    // InternalSolverLanguageParser.g:4272:1: ruleAdditiveBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) ) ;
    public final Enumerator ruleAdditiveBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4278:2: ( ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) ) )
            // InternalSolverLanguageParser.g:4279:2: ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) )
            {
            // InternalSolverLanguageParser.g:4279:2: ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==PlusSign) ) {
                alt54=1;
            }
            else if ( (LA54_0==HyphenMinus) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalSolverLanguageParser.g:4280:3: (enumLiteral_0= PlusSign )
                    {
                    // InternalSolverLanguageParser.g:4280:3: (enumLiteral_0= PlusSign )
                    // InternalSolverLanguageParser.g:4281:4: enumLiteral_0= PlusSign
                    {
                    enumLiteral_0=(Token)match(input,PlusSign,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveBinaryOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveBinaryOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4288:3: (enumLiteral_1= HyphenMinus )
                    {
                    // InternalSolverLanguageParser.g:4288:3: (enumLiteral_1= HyphenMinus )
                    // InternalSolverLanguageParser.g:4289:4: enumLiteral_1= HyphenMinus
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
    // InternalSolverLanguageParser.g:4299:1: ruleMultiplicativeBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) ) ;
    public final Enumerator ruleMultiplicativeBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4305:2: ( ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) ) )
            // InternalSolverLanguageParser.g:4306:2: ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) )
            {
            // InternalSolverLanguageParser.g:4306:2: ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Asterisk) ) {
                alt55=1;
            }
            else if ( (LA55_0==Solidus) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalSolverLanguageParser.g:4307:3: (enumLiteral_0= Asterisk )
                    {
                    // InternalSolverLanguageParser.g:4307:3: (enumLiteral_0= Asterisk )
                    // InternalSolverLanguageParser.g:4308:4: enumLiteral_0= Asterisk
                    {
                    enumLiteral_0=(Token)match(input,Asterisk,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeBinaryOperatorAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeBinaryOperatorAccess().getMULEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4315:3: (enumLiteral_1= Solidus )
                    {
                    // InternalSolverLanguageParser.g:4315:3: (enumLiteral_1= Solidus )
                    // InternalSolverLanguageParser.g:4316:4: enumLiteral_1= Solidus
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
    // InternalSolverLanguageParser.g:4326:1: ruleExponentialOp returns [Enumerator current=null] : (enumLiteral_0= CircumflexAccent ) ;
    public final Enumerator ruleExponentialOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4332:2: ( (enumLiteral_0= CircumflexAccent ) )
            // InternalSolverLanguageParser.g:4333:2: (enumLiteral_0= CircumflexAccent )
            {
            // InternalSolverLanguageParser.g:4333:2: (enumLiteral_0= CircumflexAccent )
            // InternalSolverLanguageParser.g:4334:3: enumLiteral_0= CircumflexAccent
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
    // InternalSolverLanguageParser.g:4343:1: ruleUnaryOp returns [Enumerator current=null] : ( (enumLiteral_0= ExclamationMark ) | (enumLiteral_1= PlusSign ) | (enumLiteral_2= HyphenMinus ) | (enumLiteral_3= May ) | (enumLiteral_4= Must ) | (enumLiteral_5= Current ) ) ;
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
            // InternalSolverLanguageParser.g:4349:2: ( ( (enumLiteral_0= ExclamationMark ) | (enumLiteral_1= PlusSign ) | (enumLiteral_2= HyphenMinus ) | (enumLiteral_3= May ) | (enumLiteral_4= Must ) | (enumLiteral_5= Current ) ) )
            // InternalSolverLanguageParser.g:4350:2: ( (enumLiteral_0= ExclamationMark ) | (enumLiteral_1= PlusSign ) | (enumLiteral_2= HyphenMinus ) | (enumLiteral_3= May ) | (enumLiteral_4= Must ) | (enumLiteral_5= Current ) )
            {
            // InternalSolverLanguageParser.g:4350:2: ( (enumLiteral_0= ExclamationMark ) | (enumLiteral_1= PlusSign ) | (enumLiteral_2= HyphenMinus ) | (enumLiteral_3= May ) | (enumLiteral_4= Must ) | (enumLiteral_5= Current ) )
            int alt56=6;
            switch ( input.LA(1) ) {
            case ExclamationMark:
                {
                alt56=1;
                }
                break;
            case PlusSign:
                {
                alt56=2;
                }
                break;
            case HyphenMinus:
                {
                alt56=3;
                }
                break;
            case May:
                {
                alt56=4;
                }
                break;
            case Must:
                {
                alt56=5;
                }
                break;
            case Current:
                {
                alt56=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalSolverLanguageParser.g:4351:3: (enumLiteral_0= ExclamationMark )
                    {
                    // InternalSolverLanguageParser.g:4351:3: (enumLiteral_0= ExclamationMark )
                    // InternalSolverLanguageParser.g:4352:4: enumLiteral_0= ExclamationMark
                    {
                    enumLiteral_0=(Token)match(input,ExclamationMark,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOpAccess().getNEGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOpAccess().getNEGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4359:3: (enumLiteral_1= PlusSign )
                    {
                    // InternalSolverLanguageParser.g:4359:3: (enumLiteral_1= PlusSign )
                    // InternalSolverLanguageParser.g:4360:4: enumLiteral_1= PlusSign
                    {
                    enumLiteral_1=(Token)match(input,PlusSign,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOpAccess().getPLUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnaryOpAccess().getPLUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:4367:3: (enumLiteral_2= HyphenMinus )
                    {
                    // InternalSolverLanguageParser.g:4367:3: (enumLiteral_2= HyphenMinus )
                    // InternalSolverLanguageParser.g:4368:4: enumLiteral_2= HyphenMinus
                    {
                    enumLiteral_2=(Token)match(input,HyphenMinus,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOpAccess().getMINUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnaryOpAccess().getMINUSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:4375:3: (enumLiteral_3= May )
                    {
                    // InternalSolverLanguageParser.g:4375:3: (enumLiteral_3= May )
                    // InternalSolverLanguageParser.g:4376:4: enumLiteral_3= May
                    {
                    enumLiteral_3=(Token)match(input,May,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOpAccess().getMAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnaryOpAccess().getMAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSolverLanguageParser.g:4383:3: (enumLiteral_4= Must )
                    {
                    // InternalSolverLanguageParser.g:4383:3: (enumLiteral_4= Must )
                    // InternalSolverLanguageParser.g:4384:4: enumLiteral_4= Must
                    {
                    enumLiteral_4=(Token)match(input,Must,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOpAccess().getMUSTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getUnaryOpAccess().getMUSTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSolverLanguageParser.g:4391:3: (enumLiteral_5= Current )
                    {
                    // InternalSolverLanguageParser.g:4391:3: (enumLiteral_5= Current )
                    // InternalSolverLanguageParser.g:4392:4: enumLiteral_5= Current
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


    // $ANTLR start "ruleQuantifier"
    // InternalSolverLanguageParser.g:4402:1: ruleQuantifier returns [Enumerator current=null] : ( (enumLiteral_0= Exists ) | (enumLiteral_1= Forall ) | (enumLiteral_2= Count ) ) ;
    public final Enumerator ruleQuantifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4408:2: ( ( (enumLiteral_0= Exists ) | (enumLiteral_1= Forall ) | (enumLiteral_2= Count ) ) )
            // InternalSolverLanguageParser.g:4409:2: ( (enumLiteral_0= Exists ) | (enumLiteral_1= Forall ) | (enumLiteral_2= Count ) )
            {
            // InternalSolverLanguageParser.g:4409:2: ( (enumLiteral_0= Exists ) | (enumLiteral_1= Forall ) | (enumLiteral_2= Count ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case Exists:
                {
                alt57=1;
                }
                break;
            case Forall:
                {
                alt57=2;
                }
                break;
            case Count:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalSolverLanguageParser.g:4410:3: (enumLiteral_0= Exists )
                    {
                    // InternalSolverLanguageParser.g:4410:3: (enumLiteral_0= Exists )
                    // InternalSolverLanguageParser.g:4411:4: enumLiteral_0= Exists
                    {
                    enumLiteral_0=(Token)match(input,Exists,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getEXISTSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuantifierAccess().getEXISTSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4418:3: (enumLiteral_1= Forall )
                    {
                    // InternalSolverLanguageParser.g:4418:3: (enumLiteral_1= Forall )
                    // InternalSolverLanguageParser.g:4419:4: enumLiteral_1= Forall
                    {
                    enumLiteral_1=(Token)match(input,Forall,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getFORALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuantifierAccess().getFORALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:4426:3: (enumLiteral_2= Count )
                    {
                    // InternalSolverLanguageParser.g:4426:3: (enumLiteral_2= Count )
                    // InternalSolverLanguageParser.g:4427:4: enumLiteral_2= Count
                    {
                    enumLiteral_2=(Token)match(input,Count,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getCOUNTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getQuantifierAccess().getCOUNTEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "ruleLogicValue"
    // InternalSolverLanguageParser.g:4437:1: ruleLogicValue returns [Enumerator current=null] : ( (enumLiteral_0= True ) | (enumLiteral_1= False ) | (enumLiteral_2= Unknown ) | (enumLiteral_3= Error ) ) ;
    public final Enumerator ruleLogicValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4443:2: ( ( (enumLiteral_0= True ) | (enumLiteral_1= False ) | (enumLiteral_2= Unknown ) | (enumLiteral_3= Error ) ) )
            // InternalSolverLanguageParser.g:4444:2: ( (enumLiteral_0= True ) | (enumLiteral_1= False ) | (enumLiteral_2= Unknown ) | (enumLiteral_3= Error ) )
            {
            // InternalSolverLanguageParser.g:4444:2: ( (enumLiteral_0= True ) | (enumLiteral_1= False ) | (enumLiteral_2= Unknown ) | (enumLiteral_3= Error ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case True:
                {
                alt58=1;
                }
                break;
            case False:
                {
                alt58=2;
                }
                break;
            case Unknown:
                {
                alt58=3;
                }
                break;
            case Error:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalSolverLanguageParser.g:4445:3: (enumLiteral_0= True )
                    {
                    // InternalSolverLanguageParser.g:4445:3: (enumLiteral_0= True )
                    // InternalSolverLanguageParser.g:4446:4: enumLiteral_0= True
                    {
                    enumLiteral_0=(Token)match(input,True,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4453:3: (enumLiteral_1= False )
                    {
                    // InternalSolverLanguageParser.g:4453:3: (enumLiteral_1= False )
                    // InternalSolverLanguageParser.g:4454:4: enumLiteral_1= False
                    {
                    enumLiteral_1=(Token)match(input,False,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:4461:3: (enumLiteral_2= Unknown )
                    {
                    // InternalSolverLanguageParser.g:4461:3: (enumLiteral_2= Unknown )
                    // InternalSolverLanguageParser.g:4462:4: enumLiteral_2= Unknown
                    {
                    enumLiteral_2=(Token)match(input,Unknown,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:4469:3: (enumLiteral_3= Error )
                    {
                    // InternalSolverLanguageParser.g:4469:3: (enumLiteral_3= Error )
                    // InternalSolverLanguageParser.g:4470:4: enumLiteral_3= Error
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
    // InternalSolverLanguageParser.g:4480:1: ruleObjectiveKind returns [Enumerator current=null] : ( (enumLiteral_0= Minimize ) | (enumLiteral_1= Maximize ) ) ;
    public final Enumerator ruleObjectiveKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4486:2: ( ( (enumLiteral_0= Minimize ) | (enumLiteral_1= Maximize ) ) )
            // InternalSolverLanguageParser.g:4487:2: ( (enumLiteral_0= Minimize ) | (enumLiteral_1= Maximize ) )
            {
            // InternalSolverLanguageParser.g:4487:2: ( (enumLiteral_0= Minimize ) | (enumLiteral_1= Maximize ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Minimize) ) {
                alt59=1;
            }
            else if ( (LA59_0==Maximize) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalSolverLanguageParser.g:4488:3: (enumLiteral_0= Minimize )
                    {
                    // InternalSolverLanguageParser.g:4488:3: (enumLiteral_0= Minimize )
                    // InternalSolverLanguageParser.g:4489:4: enumLiteral_0= Minimize
                    {
                    enumLiteral_0=(Token)match(input,Minimize,FOLLOW_2); 

                    				current = grammarAccess.getObjectiveKindAccess().getMINIMIZEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getObjectiveKindAccess().getMINIMIZEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4496:3: (enumLiteral_1= Maximize )
                    {
                    // InternalSolverLanguageParser.g:4496:3: (enumLiteral_1= Maximize )
                    // InternalSolverLanguageParser.g:4497:4: enumLiteral_1= Maximize
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
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA44 dfa44 = new DFA44(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\1\4\1\uffff\2\40\1\4\2\uffff\1\7\3\uffff\1\105\2\uffff\2\54\1\uffff\1\40\1\105\2\54\1\uffff\1\54\1\105\2\uffff\1\54";
    static final String dfa_3s = "\1\106\1\uffff\3\105\2\uffff\1\105\3\uffff\1\105\2\uffff\2\105\1\uffff\2\105\2\74\1\uffff\2\105\2\uffff\1\74";
    static final String dfa_4s = "\1\uffff\1\1\3\uffff\1\2\1\4\1\uffff\1\12\1\13\1\14\1\uffff\1\5\1\3\2\uffff\1\11\4\uffff\1\6\2\uffff\1\7\1\10\1\uffff";
    static final String dfa_5s = "\33\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\10\2\uffff\2\12\1\uffff\1\1\1\6\1\uffff\2\1\1\7\1\1\1\10\2\1\1\4\1\1\1\11\1\uffff\1\1\1\uffff\1\1\1\uffff\3\1\11\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff\1\1\7\uffff\1\1\5\uffff\1\1\1\3\4\uffff\1\2\1\1",
            "",
            "\2\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\13\7\1\1\uffff\2\1\3\uffff\1\14\1\uffff\3\1\1\14",
            "\2\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\uffff\7\1\1\uffff\2\1\3\uffff\1\14\1\uffff\3\1\1\14",
            "\1\5\33\uffff\2\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\15\1\uffff\4\1\1\uffff\6\1\2\uffff\1\1\4\uffff\1\5\3\uffff\1\1\1\5",
            "",
            "",
            "\1\20\70\uffff\1\17\4\uffff\1\16",
            "",
            "",
            "",
            "\1\21",
            "",
            "",
            "\1\25\5\uffff\1\22\15\uffff\1\24\4\uffff\1\23",
            "\1\25\23\uffff\1\24\4\uffff\1\23",
            "",
            "\2\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\1\1\uffff\4\1\1\13\7\1\1\uffff\2\1\3\uffff\1\14\1\uffff\3\1\1\14",
            "\1\26",
            "\1\30\5\uffff\1\27\11\uffff\1\31",
            "\1\30\17\uffff\1\31",
            "",
            "\1\25\5\uffff\1\22\15\uffff\1\24\4\uffff\1\23",
            "\1\32",
            "",
            "",
            "\1\30\5\uffff\1\27\11\uffff\1\31"
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
            return "109:3: (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_MetricDefinition_4= ruleMetricDefinition | this_ExternPredicateDefinition_5= ruleExternPredicateDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ExternAggregatorDefinition_7= ruleExternAggregatorDefinition | this_ExternDatatypeDefinition_8= ruleExternDatatypeDefinition | this_ClassDefinition_9= ruleClassDefinition | this_ScopeDefinition_10= ruleScopeDefinition | this_ObjectiveDefinition_11= ruleObjectiveDefinition )";
        }
    }
    static final String dfa_7s = "\10\uffff";
    static final String dfa_8s = "\1\uffff\2\3\4\uffff\1\3";
    static final String dfa_9s = "\1\16\2\30\2\uffff\1\105\1\uffff\1\30";
    static final String dfa_10s = "\1\106\2\104\2\uffff\1\105\1\uffff\1\104";
    static final String dfa_11s = "\3\uffff\1\1\1\2\1\uffff\1\3\1\uffff";
    static final String dfa_12s = "\10\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\1\4\1\uffff\1\4\1\uffff\1\4\3\3\4\uffff\1\3\1\uffff\1\3\16\uffff\1\3\14\uffff\1\3\5\uffff\1\3\1\2\4\uffff\1\1\1\3",
            "\1\3\1\uffff\1\3\5\uffff\11\3\1\uffff\1\3\1\uffff\6\3\1\5\6\3\1\6\2\3\1\6\2\3\3\uffff\3\3",
            "\1\3\1\uffff\1\3\5\uffff\11\3\1\uffff\1\3\1\uffff\6\3\1\uffff\6\3\1\6\2\3\1\6\2\3\3\uffff\3\3",
            "",
            "",
            "\1\7",
            "",
            "\1\3\1\uffff\1\3\5\uffff\11\3\1\uffff\1\3\1\uffff\6\3\1\5\6\3\1\6\2\3\1\6\2\3\3\uffff\3\3"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2100:2: (this_AtomicExpression_0= ruleAtomicExpression | this_QuantifiedExpression_1= ruleQuantifiedExpression | this_Aggregation_2= ruleAggregation )";
        }
    }
    static final String dfa_14s = "\12\uffff";
    static final String dfa_15s = "\1\uffff\2\10\6\uffff\1\10";
    static final String dfa_16s = "\1\16\2\30\3\uffff\1\105\2\uffff\1\30";
    static final String dfa_17s = "\1\106\2\104\3\uffff\1\105\2\uffff\1\104";
    static final String dfa_18s = "\3\uffff\1\3\1\4\1\5\1\uffff\1\2\1\1\1\uffff";
    static final String dfa_19s = "\12\uffff}>";
    static final String[] dfa_20s = {
            "\1\4\5\uffff\3\4\4\uffff\1\4\1\uffff\1\4\16\uffff\1\5\14\uffff\1\3\5\uffff\1\4\1\2\4\uffff\1\1\1\4",
            "\1\10\1\uffff\1\10\5\uffff\11\10\1\uffff\1\10\1\uffff\1\7\5\10\1\6\6\10\1\uffff\2\10\1\uffff\2\10\3\uffff\2\7\1\10",
            "\1\10\1\uffff\1\10\5\uffff\11\10\1\uffff\1\10\1\uffff\1\7\5\10\1\uffff\6\10\1\uffff\2\10\1\uffff\2\10\3\uffff\2\7\1\10",
            "",
            "",
            "",
            "\1\11",
            "",
            "",
            "\1\10\1\uffff\1\10\5\uffff\11\10\1\uffff\1\10\1\uffff\1\7\5\10\1\6\6\10\1\uffff\2\10\1\uffff\2\10\3\uffff\2\7\1\10"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2415:2: (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) )";
        }
    }
    static final String dfa_21s = "\1\uffff\2\3\3\uffff\1\11\1\uffff\1\3\1\uffff";
    static final String dfa_22s = "\1\13\2\40\2\uffff\1\105\1\13\1\uffff\1\40\1\uffff";
    static final String dfa_23s = "\1\106\2\105\2\uffff\1\105\1\106\1\uffff\1\105\1\uffff";
    static final String dfa_24s = "\3\uffff\1\1\1\2\2\uffff\1\3\1\uffff\1\4";
    static final String[] dfa_25s = {
            "\1\3\2\uffff\2\3\1\uffff\1\3\1\uffff\4\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\13\uffff\2\3\1\uffff\1\4\1\3\1\uffff\1\3\7\uffff\1\3\5\uffff\1\3\1\2\4\uffff\1\1\1\3",
            "\1\3\3\uffff\2\3\1\uffff\2\3\1\uffff\1\3\1\uffff\2\3\1\6\3\3\1\5\1\3\2\uffff\1\3\1\uffff\2\3\1\uffff\2\3\3\uffff\1\7\1\uffff\2\3\1\uffff\1\7",
            "\1\3\3\uffff\2\3\1\uffff\2\3\1\uffff\1\3\1\uffff\2\3\1\6\3\3\1\uffff\1\3\2\uffff\1\3\1\uffff\2\3\1\uffff\2\3\3\uffff\1\7\1\uffff\2\3\1\uffff\1\7",
            "",
            "",
            "\1\10",
            "\1\3\2\uffff\2\3\1\uffff\1\3\1\uffff\4\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\13\uffff\2\3\1\11\1\uffff\1\3\1\11\1\3\7\uffff\1\3\5\uffff\2\3\4\uffff\2\3",
            "",
            "\1\3\3\uffff\2\3\1\uffff\2\3\1\uffff\1\3\1\uffff\2\3\1\6\3\3\1\5\1\3\2\uffff\1\3\1\uffff\2\3\1\uffff\2\3\3\uffff\1\7\1\uffff\2\3\1\uffff\1\7",
            ""
    };
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_14;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_19;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2664:2: (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument )";
        }
    }
    static final String dfa_26s = "\17\uffff";
    static final String dfa_27s = "\12\uffff\2\10\2\uffff\1\10";
    static final String dfa_28s = "\1\27\1\100\3\44\1\100\1\uffff\1\105\2\uffff\3\44\1\105\1\44";
    static final String dfa_29s = "\1\27\1\106\1\47\1\62\1\47\1\105\1\uffff\1\105\2\uffff\2\104\1\62\1\105\1\104";
    static final String dfa_30s = "\6\uffff\1\2\1\uffff\1\3\1\1\5\uffff";
    static final String dfa_31s = "\17\uffff}>";
    static final String[] dfa_32s = {
            "\1\1",
            "\1\4\4\uffff\1\3\1\2",
            "\1\5\2\uffff\1\6",
            "\1\6\1\11\1\uffff\1\10\12\uffff\1\7",
            "\1\6\1\11\1\uffff\1\10",
            "\1\13\4\uffff\1\12",
            "",
            "\1\14",
            "",
            "",
            "\1\6\15\uffff\1\15\21\uffff\1\10",
            "\1\6\37\uffff\1\10",
            "\1\6\1\11\1\uffff\1\10\12\uffff\1\7",
            "\1\16",
            "\1\6\15\uffff\1\15\21\uffff\1\10"
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "3639:2: (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x82029A00EAFFDB32L,0x0000000000000061L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0090000800000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x82029A00EA7AC800L,0x0000000000000061L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000021L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000021L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000021L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0020000200000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x014004B100000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002800000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008400000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x82001000287AC000L,0x0000000000000061L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000021L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0401000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1200000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8202FA00EA7AC800L,0x0000000000000061L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8202DA00EA7AC800L,0x0000000000000061L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1000000000002000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000040L,0x0000000000000021L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000402L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000061L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0004000000000002L});

}