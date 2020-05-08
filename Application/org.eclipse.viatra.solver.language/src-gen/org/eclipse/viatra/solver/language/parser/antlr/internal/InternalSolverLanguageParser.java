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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSolverLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOT", "RULE_STAR", "RULE_PLUS", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_QUOTED_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "':-'", "'='", "'functional'", "'error'", "'default'", "'extern'", "'.'", "'if'", "'then'", "'else'", "';'", "'->'", "','", "'count'", "'{'", "'}'", "'|'", "'('", "')'", "'*'", "'['", "'..'", "']'", "'inf'", "'empty'", "'abstract'", "'class'", "'extends'", "'contains'", "'opposite'", "'scope'", "'=='", "'<='", "'>='", "'int'", "'real'", "'!='", "'<'", "'>'", "'in'", "'+'", "'-'", "'/'", "'^'", "'!'", "'may'", "'must'", "'current'", "'only'", "'sum'", "'prod'", "'avg'", "'min'", "'max'", "'true'", "'false'", "'unknown'", "'minimize'", "'maximize'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_STAR=5;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=8;
    public static final int RULE_QUOTED_ID=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_PLUS=6;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int RULE_DOT=4;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSolverLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSolverLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSolverLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSolverLanguage.g"; }



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
    // InternalSolverLanguage.g:65:1: entryRuleProblem returns [EObject current=null] : iv_ruleProblem= ruleProblem EOF ;
    public final EObject entryRuleProblem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblem = null;


        try {
            // InternalSolverLanguage.g:65:48: (iv_ruleProblem= ruleProblem EOF )
            // InternalSolverLanguage.g:66:2: iv_ruleProblem= ruleProblem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProblemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProblem=ruleProblem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProblem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:72:1: ruleProblem returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleProblem() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalSolverLanguage.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalSolverLanguage.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_QUOTED_ID)||(LA1_0>=18 && LA1_0<=21)||LA1_0==23||LA1_0==29||LA1_0==33||LA1_0==36||(LA1_0>=39 && LA1_0<=42)||LA1_0==46||(LA1_0>=50 && LA1_0<=51)||(LA1_0>=56 && LA1_0<=57)||(LA1_0>=60 && LA1_0<=74)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSolverLanguage.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalSolverLanguage.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalSolverLanguage.g:81:4: lv_statements_0_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getProblemAccess().getStatementsStatementParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalSolverLanguage.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalSolverLanguage.g:102:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:108:1: ruleStatement returns [EObject current=null] : ( (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_ExternPredicateDefinition_4= ruleExternPredicateDefinition | this_MetricDefinition_5= ruleMetricDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ClassDefinition_7= ruleClassDefinition | this_ScopeDefinition_8= ruleScopeDefinition | this_ObjectiveDefinition_9= ruleObjectiveDefinition ) this_DOT_10= RULE_DOT ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token this_DOT_10=null;
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
            // InternalSolverLanguage.g:114:2: ( ( (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_ExternPredicateDefinition_4= ruleExternPredicateDefinition | this_MetricDefinition_5= ruleMetricDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ClassDefinition_7= ruleClassDefinition | this_ScopeDefinition_8= ruleScopeDefinition | this_ObjectiveDefinition_9= ruleObjectiveDefinition ) this_DOT_10= RULE_DOT ) )
            // InternalSolverLanguage.g:115:2: ( (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_ExternPredicateDefinition_4= ruleExternPredicateDefinition | this_MetricDefinition_5= ruleMetricDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ClassDefinition_7= ruleClassDefinition | this_ScopeDefinition_8= ruleScopeDefinition | this_ObjectiveDefinition_9= ruleObjectiveDefinition ) this_DOT_10= RULE_DOT )
            {
            // InternalSolverLanguage.g:115:2: ( (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_ExternPredicateDefinition_4= ruleExternPredicateDefinition | this_MetricDefinition_5= ruleMetricDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ClassDefinition_7= ruleClassDefinition | this_ScopeDefinition_8= ruleScopeDefinition | this_ObjectiveDefinition_9= ruleObjectiveDefinition ) this_DOT_10= RULE_DOT )
            // InternalSolverLanguage.g:116:3: (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_ExternPredicateDefinition_4= ruleExternPredicateDefinition | this_MetricDefinition_5= ruleMetricDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ClassDefinition_7= ruleClassDefinition | this_ScopeDefinition_8= ruleScopeDefinition | this_ObjectiveDefinition_9= ruleObjectiveDefinition ) this_DOT_10= RULE_DOT
            {
            // InternalSolverLanguage.g:116:3: (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_ExternPredicateDefinition_4= ruleExternPredicateDefinition | this_MetricDefinition_5= ruleMetricDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ClassDefinition_7= ruleClassDefinition | this_ScopeDefinition_8= ruleScopeDefinition | this_ObjectiveDefinition_9= ruleObjectiveDefinition )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSolverLanguage.g:117:4: this_AssertionOrDefinition_0= ruleAssertionOrDefinition
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getAssertionOrDefinitionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_AssertionOrDefinition_0=ruleAssertionOrDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_AssertionOrDefinition_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:126:4: this_PredicateDefinition_1= rulePredicateDefinition
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getPredicateDefinitionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_PredicateDefinition_1=rulePredicateDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PredicateDefinition_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:135:4: this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getUnnamedErrorPrediateDefinitionParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_UnnamedErrorPrediateDefinition_2=ruleUnnamedErrorPrediateDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_UnnamedErrorPrediateDefinition_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalSolverLanguage.g:144:4: this_DefaultDefinition_3= ruleDefaultDefinition
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getDefaultDefinitionParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_DefaultDefinition_3=ruleDefaultDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_DefaultDefinition_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalSolverLanguage.g:153:4: this_ExternPredicateDefinition_4= ruleExternPredicateDefinition
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getExternPredicateDefinitionParserRuleCall_0_4());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_ExternPredicateDefinition_4=ruleExternPredicateDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ExternPredicateDefinition_4;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalSolverLanguage.g:162:4: this_MetricDefinition_5= ruleMetricDefinition
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getMetricDefinitionParserRuleCall_0_5());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_MetricDefinition_5=ruleMetricDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MetricDefinition_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 7 :
                    // InternalSolverLanguage.g:171:4: this_ExternMetricDefinition_6= ruleExternMetricDefinition
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getExternMetricDefinitionParserRuleCall_0_6());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_ExternMetricDefinition_6=ruleExternMetricDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ExternMetricDefinition_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 8 :
                    // InternalSolverLanguage.g:180:4: this_ClassDefinition_7= ruleClassDefinition
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getClassDefinitionParserRuleCall_0_7());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_ClassDefinition_7=ruleClassDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ClassDefinition_7;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 9 :
                    // InternalSolverLanguage.g:189:4: this_ScopeDefinition_8= ruleScopeDefinition
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getScopeDefinitionParserRuleCall_0_8());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_ScopeDefinition_8=ruleScopeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ScopeDefinition_8;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 10 :
                    // InternalSolverLanguage.g:198:4: this_ObjectiveDefinition_9= ruleObjectiveDefinition
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getObjectiveDefinitionParserRuleCall_0_9());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_ObjectiveDefinition_9=ruleObjectiveDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ObjectiveDefinition_9;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            this_DOT_10=(Token)match(input,RULE_DOT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOT_10, grammarAccess.getStatementAccess().getDOTTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:215:1: entryRuleAssertionOrDefinition returns [EObject current=null] : iv_ruleAssertionOrDefinition= ruleAssertionOrDefinition EOF ;
    public final EObject entryRuleAssertionOrDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionOrDefinition = null;


        try {
            // InternalSolverLanguage.g:215:62: (iv_ruleAssertionOrDefinition= ruleAssertionOrDefinition EOF )
            // InternalSolverLanguage.g:216:2: iv_ruleAssertionOrDefinition= ruleAssertionOrDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionOrDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssertionOrDefinition=ruleAssertionOrDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionOrDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:222:1: ruleAssertionOrDefinition returns [EObject current=null] : (this_Expression_0= ruleExpression ( ( () (otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ':-' ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= '=' ( (lv_body_9_0= ruleExpression ) ) ) ) ) ;
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
            // InternalSolverLanguage.g:228:2: ( (this_Expression_0= ruleExpression ( ( () (otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ':-' ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= '=' ( (lv_body_9_0= ruleExpression ) ) ) ) ) )
            // InternalSolverLanguage.g:229:2: (this_Expression_0= ruleExpression ( ( () (otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ':-' ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= '=' ( (lv_body_9_0= ruleExpression ) ) ) ) )
            {
            // InternalSolverLanguage.g:229:2: (this_Expression_0= ruleExpression ( ( () (otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ':-' ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= '=' ( (lv_body_9_0= ruleExpression ) ) ) ) )
            // InternalSolverLanguage.g:230:3: this_Expression_0= ruleExpression ( ( () (otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ':-' ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= '=' ( (lv_body_9_0= ruleExpression ) ) ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssertionOrDefinitionAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_5);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSolverLanguage.g:238:3: ( ( () (otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ':-' ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= '=' ( (lv_body_9_0= ruleExpression ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_DOT:
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSolverLanguage.g:239:4: ( () (otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) ) )? )
                    {
                    // InternalSolverLanguage.g:239:4: ( () (otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) ) )? )
                    // InternalSolverLanguage.g:240:5: () (otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) ) )?
                    {
                    // InternalSolverLanguage.g:240:5: ()
                    // InternalSolverLanguage.g:241:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssertionOrDefinitionAccess().getAssertionBodyAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalSolverLanguage.g:247:5: (otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==15) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalSolverLanguage.g:248:6: otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) )
                            {
                            otherlv_2=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getAssertionOrDefinitionAccess().getColonKeyword_1_0_1_0());
                              					
                            }
                            // InternalSolverLanguage.g:252:6: ( (lv_range_3_0= ruleExpression ) )
                            // InternalSolverLanguage.g:253:7: (lv_range_3_0= ruleExpression )
                            {
                            // InternalSolverLanguage.g:253:7: (lv_range_3_0= ruleExpression )
                            // InternalSolverLanguage.g:254:8: lv_range_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getAssertionOrDefinitionAccess().getRangeExpressionParserRuleCall_1_0_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_range_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:274:4: ( () otherlv_5= ':-' ( (lv_body_6_0= ruleExpression ) ) )
                    {
                    // InternalSolverLanguage.g:274:4: ( () otherlv_5= ':-' ( (lv_body_6_0= ruleExpression ) ) )
                    // InternalSolverLanguage.g:275:5: () otherlv_5= ':-' ( (lv_body_6_0= ruleExpression ) )
                    {
                    // InternalSolverLanguage.g:275:5: ()
                    // InternalSolverLanguage.g:276:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssertionOrDefinitionAccess().getPredicateDefinitionHeadAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getAssertionOrDefinitionAccess().getColonHyphenMinusKeyword_1_1_1());
                      				
                    }
                    // InternalSolverLanguage.g:286:5: ( (lv_body_6_0= ruleExpression ) )
                    // InternalSolverLanguage.g:287:6: (lv_body_6_0= ruleExpression )
                    {
                    // InternalSolverLanguage.g:287:6: (lv_body_6_0= ruleExpression )
                    // InternalSolverLanguage.g:288:7: lv_body_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssertionOrDefinitionAccess().getBodyExpressionParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_body_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:307:4: ( () otherlv_8= '=' ( (lv_body_9_0= ruleExpression ) ) )
                    {
                    // InternalSolverLanguage.g:307:4: ( () otherlv_8= '=' ( (lv_body_9_0= ruleExpression ) ) )
                    // InternalSolverLanguage.g:308:5: () otherlv_8= '=' ( (lv_body_9_0= ruleExpression ) )
                    {
                    // InternalSolverLanguage.g:308:5: ()
                    // InternalSolverLanguage.g:309:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssertionOrDefinitionAccess().getMetricDefinitionHeadAction_1_2_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getAssertionOrDefinitionAccess().getEqualsSignKeyword_1_2_1());
                      				
                    }
                    // InternalSolverLanguage.g:319:5: ( (lv_body_9_0= ruleExpression ) )
                    // InternalSolverLanguage.g:320:6: (lv_body_9_0= ruleExpression )
                    {
                    // InternalSolverLanguage.g:320:6: (lv_body_9_0= ruleExpression )
                    // InternalSolverLanguage.g:321:7: lv_body_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssertionOrDefinitionAccess().getBodyExpressionParserRuleCall_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_body_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:344:1: entryRulePredicateDefinition returns [EObject current=null] : iv_rulePredicateDefinition= rulePredicateDefinition EOF ;
    public final EObject entryRulePredicateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateDefinition = null;


        try {
            // InternalSolverLanguage.g:344:60: (iv_rulePredicateDefinition= rulePredicateDefinition EOF )
            // InternalSolverLanguage.g:345:2: iv_rulePredicateDefinition= rulePredicateDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePredicateDefinition=rulePredicateDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicateDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:351:1: rulePredicateDefinition returns [EObject current=null] : ( ( ( ( (lv_functional_0_0= 'functional' ) ) ( (lv_error_1_0= 'error' ) )? ) | ( ( (lv_error_2_0= 'error' ) ) ( (lv_functional_3_0= 'functional' ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ':-' ( (lv_body_6_0= ruleExpression ) ) ) ;
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
            // InternalSolverLanguage.g:357:2: ( ( ( ( ( (lv_functional_0_0= 'functional' ) ) ( (lv_error_1_0= 'error' ) )? ) | ( ( (lv_error_2_0= 'error' ) ) ( (lv_functional_3_0= 'functional' ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ':-' ( (lv_body_6_0= ruleExpression ) ) ) )
            // InternalSolverLanguage.g:358:2: ( ( ( ( (lv_functional_0_0= 'functional' ) ) ( (lv_error_1_0= 'error' ) )? ) | ( ( (lv_error_2_0= 'error' ) ) ( (lv_functional_3_0= 'functional' ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ':-' ( (lv_body_6_0= ruleExpression ) ) )
            {
            // InternalSolverLanguage.g:358:2: ( ( ( ( (lv_functional_0_0= 'functional' ) ) ( (lv_error_1_0= 'error' ) )? ) | ( ( (lv_error_2_0= 'error' ) ) ( (lv_functional_3_0= 'functional' ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ':-' ( (lv_body_6_0= ruleExpression ) ) )
            // InternalSolverLanguage.g:359:3: ( ( ( (lv_functional_0_0= 'functional' ) ) ( (lv_error_1_0= 'error' ) )? ) | ( ( (lv_error_2_0= 'error' ) ) ( (lv_functional_3_0= 'functional' ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ':-' ( (lv_body_6_0= ruleExpression ) )
            {
            // InternalSolverLanguage.g:359:3: ( ( ( (lv_functional_0_0= 'functional' ) ) ( (lv_error_1_0= 'error' ) )? ) | ( ( (lv_error_2_0= 'error' ) ) ( (lv_functional_3_0= 'functional' ) )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSolverLanguage.g:360:4: ( ( (lv_functional_0_0= 'functional' ) ) ( (lv_error_1_0= 'error' ) )? )
                    {
                    // InternalSolverLanguage.g:360:4: ( ( (lv_functional_0_0= 'functional' ) ) ( (lv_error_1_0= 'error' ) )? )
                    // InternalSolverLanguage.g:361:5: ( (lv_functional_0_0= 'functional' ) ) ( (lv_error_1_0= 'error' ) )?
                    {
                    // InternalSolverLanguage.g:361:5: ( (lv_functional_0_0= 'functional' ) )
                    // InternalSolverLanguage.g:362:6: (lv_functional_0_0= 'functional' )
                    {
                    // InternalSolverLanguage.g:362:6: (lv_functional_0_0= 'functional' )
                    // InternalSolverLanguage.g:363:7: lv_functional_0_0= 'functional'
                    {
                    lv_functional_0_0=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_functional_0_0, grammarAccess.getPredicateDefinitionAccess().getFunctionalFunctionalKeyword_0_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                      							}
                      							setWithLastConsumed(current, "functional", true, "functional");
                      						
                    }

                    }


                    }

                    // InternalSolverLanguage.g:375:5: ( (lv_error_1_0= 'error' ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==19) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSolverLanguage.g:376:6: (lv_error_1_0= 'error' )
                            {
                            // InternalSolverLanguage.g:376:6: (lv_error_1_0= 'error' )
                            // InternalSolverLanguage.g:377:7: lv_error_1_0= 'error'
                            {
                            lv_error_1_0=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_error_1_0, grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                              							}
                              							setWithLastConsumed(current, "error", true, "error");
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:391:4: ( ( (lv_error_2_0= 'error' ) ) ( (lv_functional_3_0= 'functional' ) )? )
                    {
                    // InternalSolverLanguage.g:391:4: ( ( (lv_error_2_0= 'error' ) ) ( (lv_functional_3_0= 'functional' ) )? )
                    // InternalSolverLanguage.g:392:5: ( (lv_error_2_0= 'error' ) ) ( (lv_functional_3_0= 'functional' ) )?
                    {
                    // InternalSolverLanguage.g:392:5: ( (lv_error_2_0= 'error' ) )
                    // InternalSolverLanguage.g:393:6: (lv_error_2_0= 'error' )
                    {
                    // InternalSolverLanguage.g:393:6: (lv_error_2_0= 'error' )
                    // InternalSolverLanguage.g:394:7: lv_error_2_0= 'error'
                    {
                    lv_error_2_0=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_error_2_0, grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                      							}
                      							setWithLastConsumed(current, "error", true, "error");
                      						
                    }

                    }


                    }

                    // InternalSolverLanguage.g:406:5: ( (lv_functional_3_0= 'functional' ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==18) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalSolverLanguage.g:407:6: (lv_functional_3_0= 'functional' )
                            {
                            // InternalSolverLanguage.g:407:6: (lv_functional_3_0= 'functional' )
                            // InternalSolverLanguage.g:408:7: lv_functional_3_0= 'functional'
                            {
                            lv_functional_3_0=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_functional_3_0, grammarAccess.getPredicateDefinitionAccess().getFunctionalFunctionalKeyword_0_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                              							}
                              							setWithLastConsumed(current, "functional", true, "functional");
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalSolverLanguage.g:422:3: ( (lv_head_4_0= ruleCall ) )
            // InternalSolverLanguage.g:423:4: (lv_head_4_0= ruleCall )
            {
            // InternalSolverLanguage.g:423:4: (lv_head_4_0= ruleCall )
            // InternalSolverLanguage.g:424:5: lv_head_4_0= ruleCall
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getHeadCallParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_head_4_0=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_5=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPredicateDefinitionAccess().getColonHyphenMinusKeyword_2());
              		
            }
            // InternalSolverLanguage.g:445:3: ( (lv_body_6_0= ruleExpression ) )
            // InternalSolverLanguage.g:446:4: (lv_body_6_0= ruleExpression )
            {
            // InternalSolverLanguage.g:446:4: (lv_body_6_0= ruleExpression )
            // InternalSolverLanguage.g:447:5: lv_body_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getBodyExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:468:1: entryRuleUnnamedErrorPrediateDefinition returns [EObject current=null] : iv_ruleUnnamedErrorPrediateDefinition= ruleUnnamedErrorPrediateDefinition EOF ;
    public final EObject entryRuleUnnamedErrorPrediateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedErrorPrediateDefinition = null;


        try {
            // InternalSolverLanguage.g:468:71: (iv_ruleUnnamedErrorPrediateDefinition= ruleUnnamedErrorPrediateDefinition EOF )
            // InternalSolverLanguage.g:469:2: iv_ruleUnnamedErrorPrediateDefinition= ruleUnnamedErrorPrediateDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnnamedErrorPrediateDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnnamedErrorPrediateDefinition=ruleUnnamedErrorPrediateDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnnamedErrorPrediateDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:475:1: ruleUnnamedErrorPrediateDefinition returns [EObject current=null] : (otherlv_0= 'error' ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ':-' ( (lv_body_3_0= ruleExpression ) ) ) ;
    public final EObject ruleUnnamedErrorPrediateDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_argumentList_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:481:2: ( (otherlv_0= 'error' ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ':-' ( (lv_body_3_0= ruleExpression ) ) ) )
            // InternalSolverLanguage.g:482:2: (otherlv_0= 'error' ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ':-' ( (lv_body_3_0= ruleExpression ) ) )
            {
            // InternalSolverLanguage.g:482:2: (otherlv_0= 'error' ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ':-' ( (lv_body_3_0= ruleExpression ) ) )
            // InternalSolverLanguage.g:483:3: otherlv_0= 'error' ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ':-' ( (lv_body_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUnnamedErrorPrediateDefinitionAccess().getErrorKeyword_0());
              		
            }
            // InternalSolverLanguage.g:487:3: ( (lv_argumentList_1_0= ruleArgumentList ) )
            // InternalSolverLanguage.g:488:4: (lv_argumentList_1_0= ruleArgumentList )
            {
            // InternalSolverLanguage.g:488:4: (lv_argumentList_1_0= ruleArgumentList )
            // InternalSolverLanguage.g:489:5: lv_argumentList_1_0= ruleArgumentList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnnamedErrorPrediateDefinitionAccess().getArgumentListArgumentListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_argumentList_1_0=ruleArgumentList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getUnnamedErrorPrediateDefinitionAccess().getColonHyphenMinusKeyword_2());
              		
            }
            // InternalSolverLanguage.g:510:3: ( (lv_body_3_0= ruleExpression ) )
            // InternalSolverLanguage.g:511:4: (lv_body_3_0= ruleExpression )
            {
            // InternalSolverLanguage.g:511:4: (lv_body_3_0= ruleExpression )
            // InternalSolverLanguage.g:512:5: lv_body_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getUnnamedErrorPrediateDefinitionAccess().getBodyExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:533:1: entryRuleDefaultDefinition returns [EObject current=null] : iv_ruleDefaultDefinition= ruleDefaultDefinition EOF ;
    public final EObject entryRuleDefaultDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultDefinition = null;


        try {
            // InternalSolverLanguage.g:533:58: (iv_ruleDefaultDefinition= ruleDefaultDefinition EOF )
            // InternalSolverLanguage.g:534:2: iv_ruleDefaultDefinition= ruleDefaultDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultDefinition=ruleDefaultDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:540:1: ruleDefaultDefinition returns [EObject current=null] : (otherlv_0= 'default' ( (lv_head_1_0= ruleCall ) ) otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) ) ) ;
    public final EObject ruleDefaultDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_head_1_0 = null;

        EObject lv_range_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:546:2: ( (otherlv_0= 'default' ( (lv_head_1_0= ruleCall ) ) otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) ) ) )
            // InternalSolverLanguage.g:547:2: (otherlv_0= 'default' ( (lv_head_1_0= ruleCall ) ) otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) ) )
            {
            // InternalSolverLanguage.g:547:2: (otherlv_0= 'default' ( (lv_head_1_0= ruleCall ) ) otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) ) )
            // InternalSolverLanguage.g:548:3: otherlv_0= 'default' ( (lv_head_1_0= ruleCall ) ) otherlv_2= ':' ( (lv_range_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefaultDefinitionAccess().getDefaultKeyword_0());
              		
            }
            // InternalSolverLanguage.g:552:3: ( (lv_head_1_0= ruleCall ) )
            // InternalSolverLanguage.g:553:4: (lv_head_1_0= ruleCall )
            {
            // InternalSolverLanguage.g:553:4: (lv_head_1_0= ruleCall )
            // InternalSolverLanguage.g:554:5: lv_head_1_0= ruleCall
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefaultDefinitionAccess().getHeadCallParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_head_1_0=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDefaultDefinitionAccess().getColonKeyword_2());
              		
            }
            // InternalSolverLanguage.g:575:3: ( (lv_range_3_0= ruleExpression ) )
            // InternalSolverLanguage.g:576:4: (lv_range_3_0= ruleExpression )
            {
            // InternalSolverLanguage.g:576:4: (lv_range_3_0= ruleExpression )
            // InternalSolverLanguage.g:577:5: lv_range_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefaultDefinitionAccess().getRangeExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_range_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:598:1: entryRuleExternPredicateDefinition returns [EObject current=null] : iv_ruleExternPredicateDefinition= ruleExternPredicateDefinition EOF ;
    public final EObject entryRuleExternPredicateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternPredicateDefinition = null;


        try {
            // InternalSolverLanguage.g:598:66: (iv_ruleExternPredicateDefinition= ruleExternPredicateDefinition EOF )
            // InternalSolverLanguage.g:599:2: iv_ruleExternPredicateDefinition= ruleExternPredicateDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternPredicateDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExternPredicateDefinition=ruleExternPredicateDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternPredicateDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:605:1: ruleExternPredicateDefinition returns [EObject current=null] : (otherlv_0= 'extern' ( (lv_head_1_0= ruleCall ) ) otherlv_2= '.' ) ;
    public final EObject ruleExternPredicateDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_head_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:611:2: ( (otherlv_0= 'extern' ( (lv_head_1_0= ruleCall ) ) otherlv_2= '.' ) )
            // InternalSolverLanguage.g:612:2: (otherlv_0= 'extern' ( (lv_head_1_0= ruleCall ) ) otherlv_2= '.' )
            {
            // InternalSolverLanguage.g:612:2: (otherlv_0= 'extern' ( (lv_head_1_0= ruleCall ) ) otherlv_2= '.' )
            // InternalSolverLanguage.g:613:3: otherlv_0= 'extern' ( (lv_head_1_0= ruleCall ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExternPredicateDefinitionAccess().getExternKeyword_0());
              		
            }
            // InternalSolverLanguage.g:617:3: ( (lv_head_1_0= ruleCall ) )
            // InternalSolverLanguage.g:618:4: (lv_head_1_0= ruleCall )
            {
            // InternalSolverLanguage.g:618:4: (lv_head_1_0= ruleCall )
            // InternalSolverLanguage.g:619:5: lv_head_1_0= ruleCall
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExternPredicateDefinitionAccess().getHeadCallParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_head_1_0=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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

            otherlv_2=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExternPredicateDefinitionAccess().getFullStopKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:644:1: entryRuleMetricDefinition returns [EObject current=null] : iv_ruleMetricDefinition= ruleMetricDefinition EOF ;
    public final EObject entryRuleMetricDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricDefinition = null;


        try {
            // InternalSolverLanguage.g:644:57: (iv_ruleMetricDefinition= ruleMetricDefinition EOF )
            // InternalSolverLanguage.g:645:2: iv_ruleMetricDefinition= ruleMetricDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetricDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetricDefinition=ruleMetricDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetricDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:651:1: ruleMetricDefinition returns [EObject current=null] : ( ( (lv_type_0_0= ruleMetricType ) ) ( (lv_head_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_body_3_0= ruleExpression ) ) ) ;
    public final EObject ruleMetricDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_head_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:657:2: ( ( ( (lv_type_0_0= ruleMetricType ) ) ( (lv_head_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_body_3_0= ruleExpression ) ) ) )
            // InternalSolverLanguage.g:658:2: ( ( (lv_type_0_0= ruleMetricType ) ) ( (lv_head_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_body_3_0= ruleExpression ) ) )
            {
            // InternalSolverLanguage.g:658:2: ( ( (lv_type_0_0= ruleMetricType ) ) ( (lv_head_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_body_3_0= ruleExpression ) ) )
            // InternalSolverLanguage.g:659:3: ( (lv_type_0_0= ruleMetricType ) ) ( (lv_head_1_0= ruleExpression ) ) otherlv_2= '=' ( (lv_body_3_0= ruleExpression ) )
            {
            // InternalSolverLanguage.g:659:3: ( (lv_type_0_0= ruleMetricType ) )
            // InternalSolverLanguage.g:660:4: (lv_type_0_0= ruleMetricType )
            {
            // InternalSolverLanguage.g:660:4: (lv_type_0_0= ruleMetricType )
            // InternalSolverLanguage.g:661:5: lv_type_0_0= ruleMetricType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetricDefinitionAccess().getTypeMetricTypeEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_type_0_0=ruleMetricType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalSolverLanguage.g:678:3: ( (lv_head_1_0= ruleExpression ) )
            // InternalSolverLanguage.g:679:4: (lv_head_1_0= ruleExpression )
            {
            // InternalSolverLanguage.g:679:4: (lv_head_1_0= ruleExpression )
            // InternalSolverLanguage.g:680:5: lv_head_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetricDefinitionAccess().getHeadExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_head_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMetricDefinitionAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalSolverLanguage.g:701:3: ( (lv_body_3_0= ruleExpression ) )
            // InternalSolverLanguage.g:702:4: (lv_body_3_0= ruleExpression )
            {
            // InternalSolverLanguage.g:702:4: (lv_body_3_0= ruleExpression )
            // InternalSolverLanguage.g:703:5: lv_body_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetricDefinitionAccess().getBodyExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:724:1: entryRuleExternMetricDefinition returns [EObject current=null] : iv_ruleExternMetricDefinition= ruleExternMetricDefinition EOF ;
    public final EObject entryRuleExternMetricDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternMetricDefinition = null;


        try {
            // InternalSolverLanguage.g:724:63: (iv_ruleExternMetricDefinition= ruleExternMetricDefinition EOF )
            // InternalSolverLanguage.g:725:2: iv_ruleExternMetricDefinition= ruleExternMetricDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternMetricDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExternMetricDefinition=ruleExternMetricDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternMetricDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:731:1: ruleExternMetricDefinition returns [EObject current=null] : (otherlv_0= 'extern' ( (lv_type_1_0= ruleMetricType ) ) ( (lv_head_2_0= ruleCall ) ) ) ;
    public final EObject ruleExternMetricDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_head_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:737:2: ( (otherlv_0= 'extern' ( (lv_type_1_0= ruleMetricType ) ) ( (lv_head_2_0= ruleCall ) ) ) )
            // InternalSolverLanguage.g:738:2: (otherlv_0= 'extern' ( (lv_type_1_0= ruleMetricType ) ) ( (lv_head_2_0= ruleCall ) ) )
            {
            // InternalSolverLanguage.g:738:2: (otherlv_0= 'extern' ( (lv_type_1_0= ruleMetricType ) ) ( (lv_head_2_0= ruleCall ) ) )
            // InternalSolverLanguage.g:739:3: otherlv_0= 'extern' ( (lv_type_1_0= ruleMetricType ) ) ( (lv_head_2_0= ruleCall ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExternMetricDefinitionAccess().getExternKeyword_0());
              		
            }
            // InternalSolverLanguage.g:743:3: ( (lv_type_1_0= ruleMetricType ) )
            // InternalSolverLanguage.g:744:4: (lv_type_1_0= ruleMetricType )
            {
            // InternalSolverLanguage.g:744:4: (lv_type_1_0= ruleMetricType )
            // InternalSolverLanguage.g:745:5: lv_type_1_0= ruleMetricType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExternMetricDefinitionAccess().getTypeMetricTypeEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_type_1_0=ruleMetricType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalSolverLanguage.g:762:3: ( (lv_head_2_0= ruleCall ) )
            // InternalSolverLanguage.g:763:4: (lv_head_2_0= ruleCall )
            {
            // InternalSolverLanguage.g:763:4: (lv_head_2_0= ruleCall )
            // InternalSolverLanguage.g:764:5: lv_head_2_0= ruleCall
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExternMetricDefinitionAccess().getHeadCallParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_head_2_0=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:785:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSolverLanguage.g:785:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSolverLanguage.g:786:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:792:1: ruleExpression returns [EObject current=null] : (this_IfElse_0= ruleIfElse | this_DisjunctiveExpression_1= ruleDisjunctiveExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfElse_0 = null;

        EObject this_DisjunctiveExpression_1 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:798:2: ( (this_IfElse_0= ruleIfElse | this_DisjunctiveExpression_1= ruleDisjunctiveExpression ) )
            // InternalSolverLanguage.g:799:2: (this_IfElse_0= ruleIfElse | this_DisjunctiveExpression_1= ruleDisjunctiveExpression )
            {
            // InternalSolverLanguage.g:799:2: (this_IfElse_0= ruleIfElse | this_DisjunctiveExpression_1= ruleDisjunctiveExpression )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_QUOTED_ID)||LA8_0==19||LA8_0==29||LA8_0==33||LA8_0==36||(LA8_0>=39 && LA8_0<=40)||(LA8_0>=56 && LA8_0<=57)||(LA8_0>=60 && LA8_0<=72)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSolverLanguage.g:800:3: this_IfElse_0= ruleIfElse
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getIfElseParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfElse_0=ruleIfElse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfElse_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:809:3: this_DisjunctiveExpression_1= ruleDisjunctiveExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getDisjunctiveExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DisjunctiveExpression_1=ruleDisjunctiveExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DisjunctiveExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:821:1: entryRuleIfElse returns [EObject current=null] : iv_ruleIfElse= ruleIfElse EOF ;
    public final EObject entryRuleIfElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfElse = null;


        try {
            // InternalSolverLanguage.g:821:47: (iv_ruleIfElse= ruleIfElse EOF )
            // InternalSolverLanguage.g:822:2: iv_ruleIfElse= ruleIfElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfElseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfElse=ruleIfElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfElse; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:828:1: ruleIfElse returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleExpression ) ) ) ;
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
            // InternalSolverLanguage.g:834:2: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleExpression ) ) ) )
            // InternalSolverLanguage.g:835:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleExpression ) ) )
            {
            // InternalSolverLanguage.g:835:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleExpression ) ) )
            // InternalSolverLanguage.g:836:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_else_5_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfElseAccess().getIfKeyword_0());
              		
            }
            // InternalSolverLanguage.g:840:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalSolverLanguage.g:841:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalSolverLanguage.g:841:4: (lv_condition_1_0= ruleExpression )
            // InternalSolverLanguage.g:842:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfElseAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfElseAccess().getThenKeyword_2());
              		
            }
            // InternalSolverLanguage.g:863:3: ( (lv_then_3_0= ruleExpression ) )
            // InternalSolverLanguage.g:864:4: (lv_then_3_0= ruleExpression )
            {
            // InternalSolverLanguage.g:864:4: (lv_then_3_0= ruleExpression )
            // InternalSolverLanguage.g:865:5: lv_then_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfElseAccess().getThenExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_then_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfElseAccess().getElseKeyword_4());
              		
            }
            // InternalSolverLanguage.g:886:3: ( (lv_else_5_0= ruleExpression ) )
            // InternalSolverLanguage.g:887:4: (lv_else_5_0= ruleExpression )
            {
            // InternalSolverLanguage.g:887:4: (lv_else_5_0= ruleExpression )
            // InternalSolverLanguage.g:888:5: lv_else_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfElseAccess().getElseExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_else_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:909:1: entryRuleDisjunctiveExpression returns [EObject current=null] : iv_ruleDisjunctiveExpression= ruleDisjunctiveExpression EOF ;
    public final EObject entryRuleDisjunctiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctiveExpression = null;


        try {
            // InternalSolverLanguage.g:909:62: (iv_ruleDisjunctiveExpression= ruleDisjunctiveExpression EOF )
            // InternalSolverLanguage.g:910:2: iv_ruleDisjunctiveExpression= ruleDisjunctiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDisjunctiveExpression=ruleDisjunctiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunctiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:916:1: ruleDisjunctiveExpression returns [EObject current=null] : (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= ';' ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= '->' ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= ';' ( (lv_cases_9_0= ruleCase ) ) )* ) )? ) ;
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
            // InternalSolverLanguage.g:922:2: ( (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= ';' ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= '->' ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= ';' ( (lv_cases_9_0= ruleCase ) ) )* ) )? ) )
            // InternalSolverLanguage.g:923:2: (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= ';' ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= '->' ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= ';' ( (lv_cases_9_0= ruleCase ) ) )* ) )? )
            {
            // InternalSolverLanguage.g:923:2: (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= ';' ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= '->' ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= ';' ( (lv_cases_9_0= ruleCase ) ) )* ) )? )
            // InternalSolverLanguage.g:924:3: this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= ';' ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= '->' ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= ';' ( (lv_cases_9_0= ruleCase ) ) )* ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getConjunctiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_ConjunctiveExpression_0=ruleConjunctiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConjunctiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSolverLanguage.g:932:3: ( ( () (otherlv_2= ';' ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= '->' ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= ';' ( (lv_cases_9_0= ruleCase ) ) )* ) )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // InternalSolverLanguage.g:933:4: ( () (otherlv_2= ';' ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ )
                    {
                    // InternalSolverLanguage.g:933:4: ( () (otherlv_2= ';' ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ )
                    // InternalSolverLanguage.g:934:5: () (otherlv_2= ';' ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+
                    {
                    // InternalSolverLanguage.g:934:5: ()
                    // InternalSolverLanguage.g:935:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getDisjunctiveExpressionAccess().getDisjunctionChildrenAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalSolverLanguage.g:941:5: (otherlv_2= ';' ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==26) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:942:6: otherlv_2= ';' ( (lv_children_3_0= ruleConjunctiveExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_2, grammarAccess.getDisjunctiveExpressionAccess().getSemicolonKeyword_1_0_1_0());
                    	      					
                    	    }
                    	    // InternalSolverLanguage.g:946:6: ( (lv_children_3_0= ruleConjunctiveExpression ) )
                    	    // InternalSolverLanguage.g:947:7: (lv_children_3_0= ruleConjunctiveExpression )
                    	    {
                    	    // InternalSolverLanguage.g:947:7: (lv_children_3_0= ruleConjunctiveExpression )
                    	    // InternalSolverLanguage.g:948:8: lv_children_3_0= ruleConjunctiveExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getChildrenConjunctiveExpressionParserRuleCall_1_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_children_3_0=ruleConjunctiveExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
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
                    // InternalSolverLanguage.g:968:4: ( () otherlv_5= '->' ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= ';' ( (lv_cases_9_0= ruleCase ) ) )* )
                    {
                    // InternalSolverLanguage.g:968:4: ( () otherlv_5= '->' ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= ';' ( (lv_cases_9_0= ruleCase ) ) )* )
                    // InternalSolverLanguage.g:969:5: () otherlv_5= '->' ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= ';' ( (lv_cases_9_0= ruleCase ) ) )*
                    {
                    // InternalSolverLanguage.g:969:5: ()
                    // InternalSolverLanguage.g:970:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getDisjunctiveExpressionAccess().getCaseConditionAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_5=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDisjunctiveExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_1_1());
                      				
                    }
                    // InternalSolverLanguage.g:980:5: ( (lv_body_6_0= ruleConjunctiveExpression ) )
                    // InternalSolverLanguage.g:981:6: (lv_body_6_0= ruleConjunctiveExpression )
                    {
                    // InternalSolverLanguage.g:981:6: (lv_body_6_0= ruleConjunctiveExpression )
                    // InternalSolverLanguage.g:982:7: lv_body_6_0= ruleConjunctiveExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getBodyConjunctiveExpressionParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_18);
                    lv_body_6_0=ruleConjunctiveExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalSolverLanguage.g:999:5: ()
                    // InternalSolverLanguage.g:1000:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getDisjunctiveExpressionAccess().getSwitchCasesAction_1_1_3(),
                      							current);
                      					
                    }

                    }

                    // InternalSolverLanguage.g:1006:5: (otherlv_8= ';' ( (lv_cases_9_0= ruleCase ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==26) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:1007:6: otherlv_8= ';' ( (lv_cases_9_0= ruleCase ) )
                    	    {
                    	    otherlv_8=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_8, grammarAccess.getDisjunctiveExpressionAccess().getSemicolonKeyword_1_1_4_0());
                    	      					
                    	    }
                    	    // InternalSolverLanguage.g:1011:6: ( (lv_cases_9_0= ruleCase ) )
                    	    // InternalSolverLanguage.g:1012:7: (lv_cases_9_0= ruleCase )
                    	    {
                    	    // InternalSolverLanguage.g:1012:7: (lv_cases_9_0= ruleCase )
                    	    // InternalSolverLanguage.g:1013:8: lv_cases_9_0= ruleCase
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getCasesCaseParserRuleCall_1_1_4_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_cases_9_0=ruleCase();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:1037:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalSolverLanguage.g:1037:45: (iv_ruleCase= ruleCase EOF )
            // InternalSolverLanguage.g:1038:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:1044:1: ruleCase returns [EObject current=null] : ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= '->' ( (lv_body_2_0= ruleConjunctiveExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_0_0 = null;

        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1050:2: ( ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= '->' ( (lv_body_2_0= ruleConjunctiveExpression ) ) ) )
            // InternalSolverLanguage.g:1051:2: ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= '->' ( (lv_body_2_0= ruleConjunctiveExpression ) ) )
            {
            // InternalSolverLanguage.g:1051:2: ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= '->' ( (lv_body_2_0= ruleConjunctiveExpression ) ) )
            // InternalSolverLanguage.g:1052:3: ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= '->' ( (lv_body_2_0= ruleConjunctiveExpression ) )
            {
            // InternalSolverLanguage.g:1052:3: ( (lv_condition_0_0= ruleConjunctiveExpression ) )
            // InternalSolverLanguage.g:1053:4: (lv_condition_0_0= ruleConjunctiveExpression )
            {
            // InternalSolverLanguage.g:1053:4: (lv_condition_0_0= ruleConjunctiveExpression )
            // InternalSolverLanguage.g:1054:5: lv_condition_0_0= ruleConjunctiveExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseAccess().getConditionConjunctiveExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_condition_0_0=ruleConjunctiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalSolverLanguage.g:1075:3: ( (lv_body_2_0= ruleConjunctiveExpression ) )
            // InternalSolverLanguage.g:1076:4: (lv_body_2_0= ruleConjunctiveExpression )
            {
            // InternalSolverLanguage.g:1076:4: (lv_body_2_0= ruleConjunctiveExpression )
            // InternalSolverLanguage.g:1077:5: lv_body_2_0= ruleConjunctiveExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseAccess().getBodyConjunctiveExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_2_0=ruleConjunctiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:1098:1: entryRuleConjunctiveExpression returns [EObject current=null] : iv_ruleConjunctiveExpression= ruleConjunctiveExpression EOF ;
    public final EObject entryRuleConjunctiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctiveExpression = null;


        try {
            // InternalSolverLanguage.g:1098:62: (iv_ruleConjunctiveExpression= ruleConjunctiveExpression EOF )
            // InternalSolverLanguage.g:1099:2: iv_ruleConjunctiveExpression= ruleConjunctiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConjunctiveExpression=ruleConjunctiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunctiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:1105:1: ruleConjunctiveExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= ',' ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? ) ;
    public final EObject ruleConjunctiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_children_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1111:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= ',' ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? ) )
            // InternalSolverLanguage.g:1112:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= ',' ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? )
            {
            // InternalSolverLanguage.g:1112:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= ',' ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? )
            // InternalSolverLanguage.g:1113:3: this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= ',' ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConjunctiveExpressionAccess().getComparisonExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSolverLanguage.g:1121:3: ( () (otherlv_2= ',' ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSolverLanguage.g:1122:4: () (otherlv_2= ',' ( (lv_children_3_0= ruleComparisonExpression ) ) )+
                    {
                    // InternalSolverLanguage.g:1122:4: ()
                    // InternalSolverLanguage.g:1123:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getConjunctiveExpressionAccess().getConjunctionChildrenAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSolverLanguage.g:1129:4: (otherlv_2= ',' ( (lv_children_3_0= ruleComparisonExpression ) ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==28) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:1130:5: otherlv_2= ',' ( (lv_children_3_0= ruleComparisonExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,28,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getConjunctiveExpressionAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalSolverLanguage.g:1134:5: ( (lv_children_3_0= ruleComparisonExpression ) )
                    	    // InternalSolverLanguage.g:1135:6: (lv_children_3_0= ruleComparisonExpression )
                    	    {
                    	    // InternalSolverLanguage.g:1135:6: (lv_children_3_0= ruleComparisonExpression )
                    	    // InternalSolverLanguage.g:1136:7: lv_children_3_0= ruleComparisonExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConjunctiveExpressionAccess().getChildrenComparisonExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
                    	    lv_children_3_0=ruleComparisonExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:1159:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalSolverLanguage.g:1159:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalSolverLanguage.g:1160:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:1166:1: ruleComparisonExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1172:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) )
            // InternalSolverLanguage.g:1173:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            {
            // InternalSolverLanguage.g:1173:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            // InternalSolverLanguage.g:1174:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSolverLanguage.g:1182:3: ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=47 && LA14_0<=49)||(LA14_0>=52 && LA14_0<=55)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSolverLanguage.g:1183:4: () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
                    {
                    // InternalSolverLanguage.g:1183:4: ()
                    // InternalSolverLanguage.g:1184:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getComparisonExpressionAccess().getComparisonLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSolverLanguage.g:1190:4: ( (lv_op_2_0= ruleComparisonOperator ) )
                    // InternalSolverLanguage.g:1191:5: (lv_op_2_0= ruleComparisonOperator )
                    {
                    // InternalSolverLanguage.g:1191:5: (lv_op_2_0= ruleComparisonOperator )
                    // InternalSolverLanguage.g:1192:6: lv_op_2_0= ruleComparisonOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOpComparisonOperatorEnumRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_op_2_0=ruleComparisonOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalSolverLanguage.g:1209:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
                    // InternalSolverLanguage.g:1210:5: (lv_right_3_0= ruleAdditiveExpression )
                    {
                    // InternalSolverLanguage.g:1210:5: (lv_right_3_0= ruleAdditiveExpression )
                    // InternalSolverLanguage.g:1211:6: lv_right_3_0= ruleAdditiveExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleAdditiveExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:1233:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalSolverLanguage.g:1233:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalSolverLanguage.g:1234:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:1240:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1246:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalSolverLanguage.g:1247:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalSolverLanguage.g:1247:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalSolverLanguage.g:1248:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSolverLanguage.g:1256:3: ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=56 && LA15_0<=57)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSolverLanguage.g:1257:4: () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalSolverLanguage.g:1257:4: ()
            	    // InternalSolverLanguage.g:1258:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAdditiveExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSolverLanguage.g:1264:4: ( (lv_op_2_0= ruleAdditiveBinaryOperator ) )
            	    // InternalSolverLanguage.g:1265:5: (lv_op_2_0= ruleAdditiveBinaryOperator )
            	    {
            	    // InternalSolverLanguage.g:1265:5: (lv_op_2_0= ruleAdditiveBinaryOperator )
            	    // InternalSolverLanguage.g:1266:6: lv_op_2_0= ruleAdditiveBinaryOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpAdditiveBinaryOperatorEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_op_2_0=ruleAdditiveBinaryOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalSolverLanguage.g:1283:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalSolverLanguage.g:1284:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalSolverLanguage.g:1284:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalSolverLanguage.g:1285:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:1307:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalSolverLanguage.g:1307:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalSolverLanguage.g:1308:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:1314:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentialExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1320:2: ( (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* ) )
            // InternalSolverLanguage.g:1321:2: (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* )
            {
            // InternalSolverLanguage.g:1321:2: (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* )
            // InternalSolverLanguage.g:1322:3: this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExponentialExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_ExponentialExpression_0=ruleExponentialExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExponentialExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSolverLanguage.g:1330:3: ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35||LA16_0==58) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSolverLanguage.g:1331:4: () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) )
            	    {
            	    // InternalSolverLanguage.g:1331:4: ()
            	    // InternalSolverLanguage.g:1332:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMultiplicativeExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalSolverLanguage.g:1338:4: ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) )
            	    // InternalSolverLanguage.g:1339:5: (lv_op_2_0= ruleMultiplicativeBinaryOperator )
            	    {
            	    // InternalSolverLanguage.g:1339:5: (lv_op_2_0= ruleMultiplicativeBinaryOperator )
            	    // InternalSolverLanguage.g:1340:6: lv_op_2_0= ruleMultiplicativeBinaryOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpMultiplicativeBinaryOperatorEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_op_2_0=ruleMultiplicativeBinaryOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalSolverLanguage.g:1357:4: ( (lv_right_3_0= ruleExponentialExpression ) )
            	    // InternalSolverLanguage.g:1358:5: (lv_right_3_0= ruleExponentialExpression )
            	    {
            	    // InternalSolverLanguage.g:1358:5: (lv_right_3_0= ruleExponentialExpression )
            	    // InternalSolverLanguage.g:1359:6: lv_right_3_0= ruleExponentialExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightExponentialExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleExponentialExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:1381:1: entryRuleExponentialExpression returns [EObject current=null] : iv_ruleExponentialExpression= ruleExponentialExpression EOF ;
    public final EObject entryRuleExponentialExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialExpression = null;


        try {
            // InternalSolverLanguage.g:1381:62: (iv_ruleExponentialExpression= ruleExponentialExpression EOF )
            // InternalSolverLanguage.g:1382:2: iv_ruleExponentialExpression= ruleExponentialExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExponentialExpression=ruleExponentialExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:1388:1: ruleExponentialExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )? ) ;
    public final EObject ruleExponentialExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1394:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )? ) )
            // InternalSolverLanguage.g:1395:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )? )
            {
            // InternalSolverLanguage.g:1395:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )? )
            // InternalSolverLanguage.g:1396:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExponentialExpressionAccess().getUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSolverLanguage.g:1404:3: ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==59) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSolverLanguage.g:1405:4: () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleExponentialExpression ) )
                    {
                    // InternalSolverLanguage.g:1405:4: ()
                    // InternalSolverLanguage.g:1406:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExponentialExpressionAccess().getBinaryExpressionLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSolverLanguage.g:1412:4: ( (lv_op_2_0= ruleExponentialOp ) )
                    // InternalSolverLanguage.g:1413:5: (lv_op_2_0= ruleExponentialOp )
                    {
                    // InternalSolverLanguage.g:1413:5: (lv_op_2_0= ruleExponentialOp )
                    // InternalSolverLanguage.g:1414:6: lv_op_2_0= ruleExponentialOp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExponentialExpressionAccess().getOpExponentialOpEnumRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_op_2_0=ruleExponentialOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalSolverLanguage.g:1431:4: ( (lv_right_3_0= ruleExponentialExpression ) )
                    // InternalSolverLanguage.g:1432:5: (lv_right_3_0= ruleExponentialExpression )
                    {
                    // InternalSolverLanguage.g:1432:5: (lv_right_3_0= ruleExponentialExpression )
                    // InternalSolverLanguage.g:1433:6: lv_right_3_0= ruleExponentialExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExponentialExpressionAccess().getRightExponentialExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExponentialExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:1455:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalSolverLanguage.g:1455:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalSolverLanguage.g:1456:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:1462:1: ruleUnaryExpression returns [EObject current=null] : (this_AggregationExpression_0= ruleAggregationExpression | ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AggregationExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1468:2: ( (this_AggregationExpression_0= ruleAggregationExpression | ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) ) ) )
            // InternalSolverLanguage.g:1469:2: (this_AggregationExpression_0= ruleAggregationExpression | ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) ) )
            {
            // InternalSolverLanguage.g:1469:2: (this_AggregationExpression_0= ruleAggregationExpression | ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_QUOTED_ID)||LA18_0==19||LA18_0==29||LA18_0==33||LA18_0==36||(LA18_0>=39 && LA18_0<=40)||(LA18_0>=64 && LA18_0<=72)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=56 && LA18_0<=57)||(LA18_0>=60 && LA18_0<=63)) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSolverLanguage.g:1470:3: this_AggregationExpression_0= ruleAggregationExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getAggregationExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AggregationExpression_0=ruleAggregationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AggregationExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1479:3: ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) )
                    {
                    // InternalSolverLanguage.g:1479:3: ( () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) ) )
                    // InternalSolverLanguage.g:1480:4: () ( (lv_op_2_0= ruleUnaryOp ) ) ( (lv_body_3_0= ruleAggregationExpression ) )
                    {
                    // InternalSolverLanguage.g:1480:4: ()
                    // InternalSolverLanguage.g:1481:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSolverLanguage.g:1487:4: ( (lv_op_2_0= ruleUnaryOp ) )
                    // InternalSolverLanguage.g:1488:5: (lv_op_2_0= ruleUnaryOp )
                    {
                    // InternalSolverLanguage.g:1488:5: (lv_op_2_0= ruleUnaryOp )
                    // InternalSolverLanguage.g:1489:6: lv_op_2_0= ruleUnaryOp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOpEnumRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_op_2_0=ruleUnaryOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalSolverLanguage.g:1506:4: ( (lv_body_3_0= ruleAggregationExpression ) )
                    // InternalSolverLanguage.g:1507:5: (lv_body_3_0= ruleAggregationExpression )
                    {
                    // InternalSolverLanguage.g:1507:5: (lv_body_3_0= ruleAggregationExpression )
                    // InternalSolverLanguage.g:1508:6: lv_body_3_0= ruleAggregationExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getBodyAggregationExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_body_3_0=ruleAggregationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:1530:1: entryRuleAggregationExpression returns [EObject current=null] : iv_ruleAggregationExpression= ruleAggregationExpression EOF ;
    public final EObject entryRuleAggregationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregationExpression = null;


        try {
            // InternalSolverLanguage.g:1530:62: (iv_ruleAggregationExpression= ruleAggregationExpression EOF )
            // InternalSolverLanguage.g:1531:2: iv_ruleAggregationExpression= ruleAggregationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAggregationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAggregationExpression=ruleAggregationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAggregationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:1537:1: ruleAggregationExpression returns [EObject current=null] : (this_AtomicExpression_0= ruleAtomicExpression | this_Count_1= ruleCount | this_Aggregation_2= ruleAggregation ) ;
    public final EObject ruleAggregationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExpression_0 = null;

        EObject this_Count_1 = null;

        EObject this_Aggregation_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1543:2: ( (this_AtomicExpression_0= ruleAtomicExpression | this_Count_1= ruleCount | this_Aggregation_2= ruleAggregation ) )
            // InternalSolverLanguage.g:1544:2: (this_AtomicExpression_0= ruleAtomicExpression | this_Count_1= ruleCount | this_Aggregation_2= ruleAggregation )
            {
            // InternalSolverLanguage.g:1544:2: (this_AtomicExpression_0= ruleAtomicExpression | this_Count_1= ruleCount | this_Aggregation_2= ruleAggregation )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_QUOTED_ID:
            case 19:
            case 33:
            case 36:
            case 39:
            case 40:
            case 70:
            case 71:
            case 72:
                {
                alt19=1;
                }
                break;
            case 29:
                {
                alt19=2;
                }
                break;
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalSolverLanguage.g:1545:3: this_AtomicExpression_0= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAggregationExpressionAccess().getAtomicExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AtomicExpression_0=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AtomicExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1554:3: this_Count_1= ruleCount
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAggregationExpressionAccess().getCountParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Count_1=ruleCount();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Count_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:1563:3: this_Aggregation_2= ruleAggregation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAggregationExpressionAccess().getAggregationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Aggregation_2=ruleAggregation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Aggregation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:1575:1: entryRuleCount returns [EObject current=null] : iv_ruleCount= ruleCount EOF ;
    public final EObject entryRuleCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCount = null;


        try {
            // InternalSolverLanguage.g:1575:46: (iv_ruleCount= ruleCount EOF )
            // InternalSolverLanguage.g:1576:2: iv_ruleCount= ruleCount EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCountRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCount=ruleCount();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCount; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:1582:1: ruleCount returns [EObject current=null] : (otherlv_0= 'count' otherlv_1= '{' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= '}' ) ;
    public final EObject ruleCount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1588:2: ( (otherlv_0= 'count' otherlv_1= '{' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= '}' ) )
            // InternalSolverLanguage.g:1589:2: (otherlv_0= 'count' otherlv_1= '{' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= '}' )
            {
            // InternalSolverLanguage.g:1589:2: (otherlv_0= 'count' otherlv_1= '{' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= '}' )
            // InternalSolverLanguage.g:1590:3: otherlv_0= 'count' otherlv_1= '{' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCountAccess().getCountKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCountAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalSolverLanguage.g:1598:3: ( (lv_body_2_0= ruleExpression ) )
            // InternalSolverLanguage.g:1599:4: (lv_body_2_0= ruleExpression )
            {
            // InternalSolverLanguage.g:1599:4: (lv_body_2_0= ruleExpression )
            // InternalSolverLanguage.g:1600:5: lv_body_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCountAccess().getBodyExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_body_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCountAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:1625:1: entryRuleAggregation returns [EObject current=null] : iv_ruleAggregation= ruleAggregation EOF ;
    public final EObject entryRuleAggregation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregation = null;


        try {
            // InternalSolverLanguage.g:1625:52: (iv_ruleAggregation= ruleAggregation EOF )
            // InternalSolverLanguage.g:1626:2: iv_ruleAggregation= ruleAggregation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAggregationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAggregation=ruleAggregation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAggregation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:1632:1: ruleAggregation returns [EObject current=null] : ( ( (lv_op_0_0= ruleAggregationOp ) ) otherlv_1= '{' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= '|' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= '}' ) ;
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
            // InternalSolverLanguage.g:1638:2: ( ( ( (lv_op_0_0= ruleAggregationOp ) ) otherlv_1= '{' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= '|' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= '}' ) )
            // InternalSolverLanguage.g:1639:2: ( ( (lv_op_0_0= ruleAggregationOp ) ) otherlv_1= '{' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= '|' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= '}' )
            {
            // InternalSolverLanguage.g:1639:2: ( ( (lv_op_0_0= ruleAggregationOp ) ) otherlv_1= '{' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= '|' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= '}' )
            // InternalSolverLanguage.g:1640:3: ( (lv_op_0_0= ruleAggregationOp ) ) otherlv_1= '{' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= '|' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= '}'
            {
            // InternalSolverLanguage.g:1640:3: ( (lv_op_0_0= ruleAggregationOp ) )
            // InternalSolverLanguage.g:1641:4: (lv_op_0_0= ruleAggregationOp )
            {
            // InternalSolverLanguage.g:1641:4: (lv_op_0_0= ruleAggregationOp )
            // InternalSolverLanguage.g:1642:5: lv_op_0_0= ruleAggregationOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAggregationAccess().getOpAggregationOpEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_op_0_0=ruleAggregationOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAggregationAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalSolverLanguage.g:1663:3: ( (lv_body_2_0= ruleExpression ) )
            // InternalSolverLanguage.g:1664:4: (lv_body_2_0= ruleExpression )
            {
            // InternalSolverLanguage.g:1664:4: (lv_body_2_0= ruleExpression )
            // InternalSolverLanguage.g:1665:5: lv_body_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAggregationAccess().getBodyExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_body_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,32,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAggregationAccess().getVerticalLineKeyword_3());
              		
            }
            // InternalSolverLanguage.g:1686:3: ( (lv_condition_4_0= ruleExpression ) )
            // InternalSolverLanguage.g:1687:4: (lv_condition_4_0= ruleExpression )
            {
            // InternalSolverLanguage.g:1687:4: (lv_condition_4_0= ruleExpression )
            // InternalSolverLanguage.g:1688:5: lv_condition_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAggregationAccess().getConditionExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_condition_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_5=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAggregationAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:1713:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalSolverLanguage.g:1713:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalSolverLanguage.g:1714:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:1720:1: ruleAtomicExpression returns [EObject current=null] : ( (this_Reference_0= ruleReference ( () ( ( '(' )=> (lv_argumentList_2_0= ruleArgumentList ) ) )? ) | this_Interval_3= ruleInterval | this_Literal_4= ruleLiteral | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_Reference_0 = null;

        EObject lv_argumentList_2_0 = null;

        EObject this_Interval_3 = null;

        EObject this_Literal_4 = null;

        EObject this_Expression_6 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1726:2: ( ( (this_Reference_0= ruleReference ( () ( ( '(' )=> (lv_argumentList_2_0= ruleArgumentList ) ) )? ) | this_Interval_3= ruleInterval | this_Literal_4= ruleLiteral | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) ) )
            // InternalSolverLanguage.g:1727:2: ( (this_Reference_0= ruleReference ( () ( ( '(' )=> (lv_argumentList_2_0= ruleArgumentList ) ) )? ) | this_Interval_3= ruleInterval | this_Literal_4= ruleLiteral | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) )
            {
            // InternalSolverLanguage.g:1727:2: ( (this_Reference_0= ruleReference ( () ( ( '(' )=> (lv_argumentList_2_0= ruleArgumentList ) ) )? ) | this_Interval_3= ruleInterval | this_Literal_4= ruleLiteral | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_QUOTED_ID:
                {
                alt21=1;
                }
                break;
            case 36:
                {
                alt21=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 19:
            case 39:
            case 40:
            case 70:
            case 71:
            case 72:
                {
                alt21=3;
                }
                break;
            case 33:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalSolverLanguage.g:1728:3: (this_Reference_0= ruleReference ( () ( ( '(' )=> (lv_argumentList_2_0= ruleArgumentList ) ) )? )
                    {
                    // InternalSolverLanguage.g:1728:3: (this_Reference_0= ruleReference ( () ( ( '(' )=> (lv_argumentList_2_0= ruleArgumentList ) ) )? )
                    // InternalSolverLanguage.g:1729:4: this_Reference_0= ruleReference ( () ( ( '(' )=> (lv_argumentList_2_0= ruleArgumentList ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicExpressionAccess().getReferenceParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_29);
                    this_Reference_0=ruleReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Reference_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalSolverLanguage.g:1737:4: ( () ( ( '(' )=> (lv_argumentList_2_0= ruleArgumentList ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==33) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalSolverLanguage.g:1738:5: () ( ( '(' )=> (lv_argumentList_2_0= ruleArgumentList ) )
                            {
                            // InternalSolverLanguage.g:1738:5: ()
                            // InternalSolverLanguage.g:1739:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndSet(
                              							grammarAccess.getAtomicExpressionAccess().getCallFunctorAction_0_1_0(),
                              							current);
                              					
                            }

                            }

                            // InternalSolverLanguage.g:1745:5: ( ( '(' )=> (lv_argumentList_2_0= ruleArgumentList ) )
                            // InternalSolverLanguage.g:1746:6: ( '(' )=> (lv_argumentList_2_0= ruleArgumentList )
                            {
                            // InternalSolverLanguage.g:1747:6: (lv_argumentList_2_0= ruleArgumentList )
                            // InternalSolverLanguage.g:1748:7: lv_argumentList_2_0= ruleArgumentList
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAtomicExpressionAccess().getArgumentListArgumentListParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_argumentList_2_0=ruleArgumentList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAtomicExpressionRule());
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
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1768:3: this_Interval_3= ruleInterval
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getIntervalParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Interval_3=ruleInterval();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Interval_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:1777:3: this_Literal_4= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_4=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Literal_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSolverLanguage.g:1786:3: (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' )
                    {
                    // InternalSolverLanguage.g:1786:3: (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' )
                    // InternalSolverLanguage.g:1787:4: otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicExpressionAccess().getExpressionParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_Expression_6=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_6;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_7=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:1808:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalSolverLanguage.g:1808:45: (iv_ruleCall= ruleCall EOF )
            // InternalSolverLanguage.g:1809:2: iv_ruleCall= ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCall=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:1815:1: ruleCall returns [EObject current=null] : ( ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_STAR ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_PLUS ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) ) ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token lv_transitiveClosure_1_0=null;
        Token lv_reflexiveTransitiveClosure_2_0=null;
        EObject lv_functor_0_0 = null;

        EObject lv_argumentList_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1821:2: ( ( ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_STAR ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_PLUS ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) ) ) )
            // InternalSolverLanguage.g:1822:2: ( ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_STAR ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_PLUS ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) ) )
            {
            // InternalSolverLanguage.g:1822:2: ( ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_STAR ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_PLUS ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) ) )
            // InternalSolverLanguage.g:1823:3: ( (lv_functor_0_0= ruleReference ) ) ( ( (lv_transitiveClosure_1_0= RULE_STAR ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_PLUS ) ) )? ( (lv_argumentList_3_0= ruleArgumentList ) )
            {
            // InternalSolverLanguage.g:1823:3: ( (lv_functor_0_0= ruleReference ) )
            // InternalSolverLanguage.g:1824:4: (lv_functor_0_0= ruleReference )
            {
            // InternalSolverLanguage.g:1824:4: (lv_functor_0_0= ruleReference )
            // InternalSolverLanguage.g:1825:5: lv_functor_0_0= ruleReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCallAccess().getFunctorReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_functor_0_0=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalSolverLanguage.g:1842:3: ( ( (lv_transitiveClosure_1_0= RULE_STAR ) ) | ( (lv_reflexiveTransitiveClosure_2_0= RULE_PLUS ) ) )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STAR) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_PLUS) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // InternalSolverLanguage.g:1843:4: ( (lv_transitiveClosure_1_0= RULE_STAR ) )
                    {
                    // InternalSolverLanguage.g:1843:4: ( (lv_transitiveClosure_1_0= RULE_STAR ) )
                    // InternalSolverLanguage.g:1844:5: (lv_transitiveClosure_1_0= RULE_STAR )
                    {
                    // InternalSolverLanguage.g:1844:5: (lv_transitiveClosure_1_0= RULE_STAR )
                    // InternalSolverLanguage.g:1845:6: lv_transitiveClosure_1_0= RULE_STAR
                    {
                    lv_transitiveClosure_1_0=(Token)match(input,RULE_STAR,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_transitiveClosure_1_0, grammarAccess.getCallAccess().getTransitiveClosureSTARTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCallRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"transitiveClosure",
                      							true,
                      							"org.eclipse.viatra.solver.language.SolverLanguage.STAR");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1862:4: ( (lv_reflexiveTransitiveClosure_2_0= RULE_PLUS ) )
                    {
                    // InternalSolverLanguage.g:1862:4: ( (lv_reflexiveTransitiveClosure_2_0= RULE_PLUS ) )
                    // InternalSolverLanguage.g:1863:5: (lv_reflexiveTransitiveClosure_2_0= RULE_PLUS )
                    {
                    // InternalSolverLanguage.g:1863:5: (lv_reflexiveTransitiveClosure_2_0= RULE_PLUS )
                    // InternalSolverLanguage.g:1864:6: lv_reflexiveTransitiveClosure_2_0= RULE_PLUS
                    {
                    lv_reflexiveTransitiveClosure_2_0=(Token)match(input,RULE_PLUS,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_reflexiveTransitiveClosure_2_0, grammarAccess.getCallAccess().getReflexiveTransitiveClosurePLUSTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCallRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"reflexiveTransitiveClosure",
                      							true,
                      							"org.eclipse.viatra.solver.language.SolverLanguage.PLUS");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSolverLanguage.g:1881:3: ( (lv_argumentList_3_0= ruleArgumentList ) )
            // InternalSolverLanguage.g:1882:4: (lv_argumentList_3_0= ruleArgumentList )
            {
            // InternalSolverLanguage.g:1882:4: (lv_argumentList_3_0= ruleArgumentList )
            // InternalSolverLanguage.g:1883:5: lv_argumentList_3_0= ruleArgumentList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCallAccess().getArgumentListArgumentListParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_argumentList_3_0=ruleArgumentList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:1904:1: entryRuleArgumentList returns [EObject current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final EObject entryRuleArgumentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentList = null;


        try {
            // InternalSolverLanguage.g:1904:53: (iv_ruleArgumentList= ruleArgumentList EOF )
            // InternalSolverLanguage.g:1905:2: iv_ruleArgumentList= ruleArgumentList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArgumentList=ruleArgumentList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:1911:1: ruleArgumentList returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleArgumentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1917:2: ( ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= ')' ) )
            // InternalSolverLanguage.g:1918:2: ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= ')' )
            {
            // InternalSolverLanguage.g:1918:2: ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= ')' )
            // InternalSolverLanguage.g:1919:3: () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= ')'
            {
            // InternalSolverLanguage.g:1919:3: ()
            // InternalSolverLanguage.g:1920:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArgumentListAccess().getArgumentListAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArgumentListAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSolverLanguage.g:1930:3: ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_QUOTED_ID)||LA24_0==19||LA24_0==29||LA24_0==33||(LA24_0>=35 && LA24_0<=36)||(LA24_0>=39 && LA24_0<=40)||(LA24_0>=56 && LA24_0<=57)||(LA24_0>=60 && LA24_0<=72)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSolverLanguage.g:1931:4: ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )*
                    {
                    // InternalSolverLanguage.g:1931:4: ( (lv_arguments_2_0= ruleArgument ) )
                    // InternalSolverLanguage.g:1932:5: (lv_arguments_2_0= ruleArgument )
                    {
                    // InternalSolverLanguage.g:1932:5: (lv_arguments_2_0= ruleArgument )
                    // InternalSolverLanguage.g:1933:6: lv_arguments_2_0= ruleArgument
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_arguments_2_0=ruleArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalSolverLanguage.g:1950:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==28) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:1951:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArgumentListAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalSolverLanguage.g:1955:5: ( (lv_arguments_4_0= ruleArgument ) )
                    	    // InternalSolverLanguage.g:1956:6: (lv_arguments_4_0= ruleArgument )
                    	    {
                    	    // InternalSolverLanguage.g:1956:6: (lv_arguments_4_0= ruleArgument )
                    	    // InternalSolverLanguage.g:1957:7: lv_arguments_4_0= ruleArgument
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_33);
                    	    lv_arguments_4_0=ruleArgument();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getArgumentListAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:1984:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalSolverLanguage.g:1984:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalSolverLanguage.g:1985:2: iv_ruleArgument= ruleArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgument; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:1991:1: ruleArgument returns [EObject current=null] : (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionArgument_0 = null;

        EObject this_StarArgument_1 = null;

        EObject this_TypedArgument_2 = null;

        EObject this_TypedStarArgument_3 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1997:2: ( (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument ) )
            // InternalSolverLanguage.g:1998:2: (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument )
            {
            // InternalSolverLanguage.g:1998:2: (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument )
            int alt25=4;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalSolverLanguage.g:1999:3: this_ExpressionArgument_0= ruleExpressionArgument
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArgumentAccess().getExpressionArgumentParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionArgument_0=ruleExpressionArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionArgument_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:2008:3: this_StarArgument_1= ruleStarArgument
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArgumentAccess().getStarArgumentParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StarArgument_1=ruleStarArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StarArgument_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:2017:3: this_TypedArgument_2= ruleTypedArgument
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArgumentAccess().getTypedArgumentParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypedArgument_2=ruleTypedArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypedArgument_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSolverLanguage.g:2026:3: this_TypedStarArgument_3= ruleTypedStarArgument
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArgumentAccess().getTypedStarArgumentParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypedStarArgument_3=ruleTypedStarArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypedStarArgument_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2038:1: entryRuleExpressionArgument returns [EObject current=null] : iv_ruleExpressionArgument= ruleExpressionArgument EOF ;
    public final EObject entryRuleExpressionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionArgument = null;


        try {
            // InternalSolverLanguage.g:2038:59: (iv_ruleExpressionArgument= ruleExpressionArgument EOF )
            // InternalSolverLanguage.g:2039:2: iv_ruleExpressionArgument= ruleExpressionArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionArgument=ruleExpressionArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionArgument; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2045:1: ruleExpressionArgument returns [EObject current=null] : ( (lv_body_0_0= ruleComparisonExpression ) ) ;
    public final EObject ruleExpressionArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_body_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2051:2: ( ( (lv_body_0_0= ruleComparisonExpression ) ) )
            // InternalSolverLanguage.g:2052:2: ( (lv_body_0_0= ruleComparisonExpression ) )
            {
            // InternalSolverLanguage.g:2052:2: ( (lv_body_0_0= ruleComparisonExpression ) )
            // InternalSolverLanguage.g:2053:3: (lv_body_0_0= ruleComparisonExpression )
            {
            // InternalSolverLanguage.g:2053:3: (lv_body_0_0= ruleComparisonExpression )
            // InternalSolverLanguage.g:2054:4: lv_body_0_0= ruleComparisonExpression
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getExpressionArgumentAccess().getBodyComparisonExpressionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_body_0_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2074:1: entryRuleStarArgument returns [EObject current=null] : iv_ruleStarArgument= ruleStarArgument EOF ;
    public final EObject entryRuleStarArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStarArgument = null;


        try {
            // InternalSolverLanguage.g:2074:53: (iv_ruleStarArgument= ruleStarArgument EOF )
            // InternalSolverLanguage.g:2075:2: iv_ruleStarArgument= ruleStarArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStarArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStarArgument=ruleStarArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStarArgument; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2081:1: ruleStarArgument returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleStarArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:2087:2: ( ( () otherlv_1= '*' ) )
            // InternalSolverLanguage.g:2088:2: ( () otherlv_1= '*' )
            {
            // InternalSolverLanguage.g:2088:2: ( () otherlv_1= '*' )
            // InternalSolverLanguage.g:2089:3: () otherlv_1= '*'
            {
            // InternalSolverLanguage.g:2089:3: ()
            // InternalSolverLanguage.g:2090:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStarArgumentAccess().getStarArgumentAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStarArgumentAccess().getAsteriskKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2104:1: entryRuleTypedArgument returns [EObject current=null] : iv_ruleTypedArgument= ruleTypedArgument EOF ;
    public final EObject entryRuleTypedArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedArgument = null;


        try {
            // InternalSolverLanguage.g:2104:54: (iv_ruleTypedArgument= ruleTypedArgument EOF )
            // InternalSolverLanguage.g:2105:2: iv_ruleTypedArgument= ruleTypedArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypedArgument=ruleTypedArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedArgument; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2111:1: ruleTypedArgument returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTypedArgument() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:2117:2: ( ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ) )
            // InternalSolverLanguage.g:2118:2: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) )
            {
            // InternalSolverLanguage.g:2118:2: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) )
            // InternalSolverLanguage.g:2119:3: ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) )
            {
            // InternalSolverLanguage.g:2119:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguage.g:2120:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguage.g:2120:4: ( ruleQualifiedName )
            // InternalSolverLanguage.g:2121:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypedArgumentRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedArgumentAccess().getTypeNamedElementCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_35);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSolverLanguage.g:2135:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguage.g:2136:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguage.g:2136:4: ( ruleQualifiedName )
            // InternalSolverLanguage.g:2137:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypedArgumentRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedArgumentAccess().getVariableNamedElementCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2155:1: entryRuleTypedStarArgument returns [EObject current=null] : iv_ruleTypedStarArgument= ruleTypedStarArgument EOF ;
    public final EObject entryRuleTypedStarArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedStarArgument = null;


        try {
            // InternalSolverLanguage.g:2155:58: (iv_ruleTypedStarArgument= ruleTypedStarArgument EOF )
            // InternalSolverLanguage.g:2156:2: iv_ruleTypedStarArgument= ruleTypedStarArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedStarArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypedStarArgument=ruleTypedStarArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedStarArgument; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2162:1: ruleTypedStarArgument returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '*' ) ;
    public final EObject ruleTypedStarArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:2168:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '*' ) )
            // InternalSolverLanguage.g:2169:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '*' )
            {
            // InternalSolverLanguage.g:2169:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '*' )
            // InternalSolverLanguage.g:2170:3: ( ( ruleQualifiedName ) ) otherlv_1= '*'
            {
            // InternalSolverLanguage.g:2170:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguage.g:2171:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguage.g:2171:4: ( ruleQualifiedName )
            // InternalSolverLanguage.g:2172:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypedStarArgumentRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedStarArgumentAccess().getTypeNamedElementCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_36);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTypedStarArgumentAccess().getAsteriskKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2194:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalSolverLanguage.g:2194:50: (iv_ruleReference= ruleReference EOF )
            // InternalSolverLanguage.g:2195:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2201:1: ruleReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:2207:2: ( ( ( ruleQualifiedName ) ) )
            // InternalSolverLanguage.g:2208:2: ( ( ruleQualifiedName ) )
            {
            // InternalSolverLanguage.g:2208:2: ( ( ruleQualifiedName ) )
            // InternalSolverLanguage.g:2209:3: ( ruleQualifiedName )
            {
            // InternalSolverLanguage.g:2209:3: ( ruleQualifiedName )
            // InternalSolverLanguage.g:2210:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getReferenceRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReferenceAccess().getReferredNamedElementCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2227:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalSolverLanguage.g:2227:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalSolverLanguage.g:2228:2: iv_ruleInterval= ruleInterval EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntervalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterval=ruleInterval();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterval; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2234:1: ruleInterval returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lowerBound_1_0 = null;

        EObject lv_upperBound_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2240:2: ( (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= ']' ) )
            // InternalSolverLanguage.g:2241:2: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= ']' )
            {
            // InternalSolverLanguage.g:2241:2: (otherlv_0= '[' ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= ']' )
            // InternalSolverLanguage.g:2242:3: otherlv_0= '[' ( (lv_lowerBound_1_0= ruleExpression ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleExpression ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalSolverLanguage.g:2246:3: ( (lv_lowerBound_1_0= ruleExpression ) )
            // InternalSolverLanguage.g:2247:4: (lv_lowerBound_1_0= ruleExpression )
            {
            // InternalSolverLanguage.g:2247:4: (lv_lowerBound_1_0= ruleExpression )
            // InternalSolverLanguage.g:2248:5: lv_lowerBound_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntervalAccess().getLowerBoundExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_lowerBound_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,37,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_2());
              		
            }
            // InternalSolverLanguage.g:2269:3: ( (lv_upperBound_3_0= ruleExpression ) )
            // InternalSolverLanguage.g:2270:4: (lv_upperBound_3_0= ruleExpression )
            {
            // InternalSolverLanguage.g:2270:4: (lv_upperBound_3_0= ruleExpression )
            // InternalSolverLanguage.g:2271:5: lv_upperBound_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntervalAccess().getUpperBoundExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_upperBound_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIntervalAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2296:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalSolverLanguage.g:2296:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalSolverLanguage.g:2297:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2303:1: ruleLiteral returns [EObject current=null] : (this_LogicLiteral_0= ruleLogicLiteral | this_NumericLiteral_1= ruleNumericLiteral | this_InfinityLiteral_2= ruleInfinityLiteral | this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_LogicLiteral_0 = null;

        EObject this_NumericLiteral_1 = null;

        EObject this_InfinityLiteral_2 = null;

        EObject this_EmptyIntervalLiteral_3 = null;

        EObject this_StringLiteral_4 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2309:2: ( (this_LogicLiteral_0= ruleLogicLiteral | this_NumericLiteral_1= ruleNumericLiteral | this_InfinityLiteral_2= ruleInfinityLiteral | this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // InternalSolverLanguage.g:2310:2: (this_LogicLiteral_0= ruleLogicLiteral | this_NumericLiteral_1= ruleNumericLiteral | this_InfinityLiteral_2= ruleInfinityLiteral | this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // InternalSolverLanguage.g:2310:2: (this_LogicLiteral_0= ruleLogicLiteral | this_NumericLiteral_1= ruleNumericLiteral | this_InfinityLiteral_2= ruleInfinityLiteral | this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 19:
            case 70:
            case 71:
            case 72:
                {
                alt26=1;
                }
                break;
            case RULE_INT:
                {
                alt26=2;
                }
                break;
            case 39:
                {
                alt26=3;
                }
                break;
            case 40:
                {
                alt26=4;
                }
                break;
            case RULE_STRING:
                {
                alt26=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalSolverLanguage.g:2311:3: this_LogicLiteral_0= ruleLogicLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getLogicLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LogicLiteral_0=ruleLogicLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LogicLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:2320:3: this_NumericLiteral_1= ruleNumericLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getNumericLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumericLiteral_1=ruleNumericLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumericLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:2329:3: this_InfinityLiteral_2= ruleInfinityLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getInfinityLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InfinityLiteral_2=ruleInfinityLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InfinityLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalSolverLanguage.g:2338:3: this_EmptyIntervalLiteral_3= ruleEmptyIntervalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getEmptyIntervalLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EmptyIntervalLiteral_3=ruleEmptyIntervalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EmptyIntervalLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalSolverLanguage.g:2347:3: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_4=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteral_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2359:1: entryRuleLogicLiteral returns [EObject current=null] : iv_ruleLogicLiteral= ruleLogicLiteral EOF ;
    public final EObject entryRuleLogicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicLiteral = null;


        try {
            // InternalSolverLanguage.g:2359:53: (iv_ruleLogicLiteral= ruleLogicLiteral EOF )
            // InternalSolverLanguage.g:2360:2: iv_ruleLogicLiteral= ruleLogicLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicLiteral=ruleLogicLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2366:1: ruleLogicLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleLogicValue ) ) ;
    public final EObject ruleLogicLiteral() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2372:2: ( ( (lv_value_0_0= ruleLogicValue ) ) )
            // InternalSolverLanguage.g:2373:2: ( (lv_value_0_0= ruleLogicValue ) )
            {
            // InternalSolverLanguage.g:2373:2: ( (lv_value_0_0= ruleLogicValue ) )
            // InternalSolverLanguage.g:2374:3: (lv_value_0_0= ruleLogicValue )
            {
            // InternalSolverLanguage.g:2374:3: (lv_value_0_0= ruleLogicValue )
            // InternalSolverLanguage.g:2375:4: lv_value_0_0= ruleLogicValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getLogicLiteralAccess().getValueLogicValueEnumRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleLogicValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2395:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalSolverLanguage.g:2395:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalSolverLanguage.g:2396:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumericLiteral=ruleNumericLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2402:1: ruleNumericLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleReal ) ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2408:2: ( ( (lv_value_0_0= ruleReal ) ) )
            // InternalSolverLanguage.g:2409:2: ( (lv_value_0_0= ruleReal ) )
            {
            // InternalSolverLanguage.g:2409:2: ( (lv_value_0_0= ruleReal ) )
            // InternalSolverLanguage.g:2410:3: (lv_value_0_0= ruleReal )
            {
            // InternalSolverLanguage.g:2410:3: (lv_value_0_0= ruleReal )
            // InternalSolverLanguage.g:2411:4: lv_value_0_0= ruleReal
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNumericLiteralAccess().getValueRealParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2431:1: entryRuleInfinityLiteral returns [EObject current=null] : iv_ruleInfinityLiteral= ruleInfinityLiteral EOF ;
    public final EObject entryRuleInfinityLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfinityLiteral = null;


        try {
            // InternalSolverLanguage.g:2431:56: (iv_ruleInfinityLiteral= ruleInfinityLiteral EOF )
            // InternalSolverLanguage.g:2432:2: iv_ruleInfinityLiteral= ruleInfinityLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfinityLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInfinityLiteral=ruleInfinityLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfinityLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2438:1: ruleInfinityLiteral returns [EObject current=null] : ( () otherlv_1= 'inf' ) ;
    public final EObject ruleInfinityLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:2444:2: ( ( () otherlv_1= 'inf' ) )
            // InternalSolverLanguage.g:2445:2: ( () otherlv_1= 'inf' )
            {
            // InternalSolverLanguage.g:2445:2: ( () otherlv_1= 'inf' )
            // InternalSolverLanguage.g:2446:3: () otherlv_1= 'inf'
            {
            // InternalSolverLanguage.g:2446:3: ()
            // InternalSolverLanguage.g:2447:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInfinityLiteralAccess().getInfinityLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInfinityLiteralAccess().getInfKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2461:1: entryRuleEmptyIntervalLiteral returns [EObject current=null] : iv_ruleEmptyIntervalLiteral= ruleEmptyIntervalLiteral EOF ;
    public final EObject entryRuleEmptyIntervalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyIntervalLiteral = null;


        try {
            // InternalSolverLanguage.g:2461:61: (iv_ruleEmptyIntervalLiteral= ruleEmptyIntervalLiteral EOF )
            // InternalSolverLanguage.g:2462:2: iv_ruleEmptyIntervalLiteral= ruleEmptyIntervalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyIntervalLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmptyIntervalLiteral=ruleEmptyIntervalLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyIntervalLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2468:1: ruleEmptyIntervalLiteral returns [EObject current=null] : ( () otherlv_1= 'empty' ) ;
    public final EObject ruleEmptyIntervalLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:2474:2: ( ( () otherlv_1= 'empty' ) )
            // InternalSolverLanguage.g:2475:2: ( () otherlv_1= 'empty' )
            {
            // InternalSolverLanguage.g:2475:2: ( () otherlv_1= 'empty' )
            // InternalSolverLanguage.g:2476:3: () otherlv_1= 'empty'
            {
            // InternalSolverLanguage.g:2476:3: ()
            // InternalSolverLanguage.g:2477:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEmptyIntervalLiteralAccess().getEmptyIntervalLiteralAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEmptyIntervalLiteralAccess().getEmptyKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2491:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalSolverLanguage.g:2491:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalSolverLanguage.g:2492:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2498:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:2504:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSolverLanguage.g:2505:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSolverLanguage.g:2505:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSolverLanguage.g:2506:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSolverLanguage.g:2506:3: (lv_value_0_0= RULE_STRING )
            // InternalSolverLanguage.g:2507:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2526:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalSolverLanguage.g:2526:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalSolverLanguage.g:2527:2: iv_ruleClassDefinition= ruleClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassDefinition=ruleClassDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2533:1: ruleClassDefinition returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= '}' ) ;
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
            // InternalSolverLanguage.g:2539:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= '}' ) )
            // InternalSolverLanguage.g:2540:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= '}' )
            {
            // InternalSolverLanguage.g:2540:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= '}' )
            // InternalSolverLanguage.g:2541:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_members_8_0= ruleMemberDefinition ) )* otherlv_9= '}'
            {
            // InternalSolverLanguage.g:2541:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSolverLanguage.g:2542:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalSolverLanguage.g:2542:4: (lv_abstract_0_0= 'abstract' )
                    // InternalSolverLanguage.g:2543:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,41,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_abstract_0_0, grammarAccess.getClassDefinitionAccess().getAbstractAbstractKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getClassDefinitionRule());
                      					}
                      					setWithLastConsumed(current, "abstract", true, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,42,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getClassKeyword_1());
              		
            }
            // InternalSolverLanguage.g:2559:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSolverLanguage.g:2560:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSolverLanguage.g:2560:4: (lv_name_2_0= RULE_ID )
            // InternalSolverLanguage.g:2561:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getClassDefinitionAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalSolverLanguage.g:2577:3: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSolverLanguage.g:2578:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getClassDefinitionAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalSolverLanguage.g:2582:4: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguage.g:2583:5: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguage.g:2583:5: ( ruleQualifiedName )
                    // InternalSolverLanguage.g:2584:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getClassDefinitionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getClassDefinitionAccess().getSuperclassesNamedElementCrossReference_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSolverLanguage.g:2598:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==28) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:2599:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,28,FOLLOW_35); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getClassDefinitionAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalSolverLanguage.g:2603:5: ( ( ruleQualifiedName ) )
                    	    // InternalSolverLanguage.g:2604:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalSolverLanguage.g:2604:6: ( ruleQualifiedName )
                    	    // InternalSolverLanguage.g:2605:7: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getClassDefinitionRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getClassDefinitionAccess().getSuperclassesNamedElementCrossReference_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_42);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,30,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalSolverLanguage.g:2625:3: ( (lv_members_8_0= ruleMemberDefinition ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==RULE_QUOTED_ID||LA30_0==44) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSolverLanguage.g:2626:4: (lv_members_8_0= ruleMemberDefinition )
            	    {
            	    // InternalSolverLanguage.g:2626:4: (lv_members_8_0= ruleMemberDefinition )
            	    // InternalSolverLanguage.g:2627:5: lv_members_8_0= ruleMemberDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getClassDefinitionAccess().getMembersMemberDefinitionParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_43);
            	    lv_members_8_0=ruleMemberDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_9=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2652:1: entryRuleMemberDefinition returns [EObject current=null] : iv_ruleMemberDefinition= ruleMemberDefinition EOF ;
    public final EObject entryRuleMemberDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDefinition = null;


        try {
            // InternalSolverLanguage.g:2652:57: (iv_ruleMemberDefinition= ruleMemberDefinition EOF )
            // InternalSolverLanguage.g:2653:2: iv_ruleMemberDefinition= ruleMemberDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMemberDefinition=ruleMemberDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2659:1: ruleMemberDefinition returns [EObject current=null] : ( ( (lv_containment_0_0= 'contains' ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'opposite' ( ( ruleQualifiedName ) ) )? (otherlv_6= ';' )? ) ;
    public final EObject ruleMemberDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_containment_0_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_multiplicity_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2665:2: ( ( ( (lv_containment_0_0= 'contains' ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'opposite' ( ( ruleQualifiedName ) ) )? (otherlv_6= ';' )? ) )
            // InternalSolverLanguage.g:2666:2: ( ( (lv_containment_0_0= 'contains' ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'opposite' ( ( ruleQualifiedName ) ) )? (otherlv_6= ';' )? )
            {
            // InternalSolverLanguage.g:2666:2: ( ( (lv_containment_0_0= 'contains' ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'opposite' ( ( ruleQualifiedName ) ) )? (otherlv_6= ';' )? )
            // InternalSolverLanguage.g:2667:3: ( (lv_containment_0_0= 'contains' ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'opposite' ( ( ruleQualifiedName ) ) )? (otherlv_6= ';' )?
            {
            // InternalSolverLanguage.g:2667:3: ( (lv_containment_0_0= 'contains' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSolverLanguage.g:2668:4: (lv_containment_0_0= 'contains' )
                    {
                    // InternalSolverLanguage.g:2668:4: (lv_containment_0_0= 'contains' )
                    // InternalSolverLanguage.g:2669:5: lv_containment_0_0= 'contains'
                    {
                    lv_containment_0_0=(Token)match(input,44,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_containment_0_0, grammarAccess.getMemberDefinitionAccess().getContainmentContainsKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMemberDefinitionRule());
                      					}
                      					setWithLastConsumed(current, "containment", true, "contains");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalSolverLanguage.g:2681:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguage.g:2682:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguage.g:2682:4: ( ruleQualifiedName )
            // InternalSolverLanguage.g:2683:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMemberDefinitionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMemberDefinitionAccess().getTypeNamedElementCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSolverLanguage.g:2697:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSolverLanguage.g:2698:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    {
                    // InternalSolverLanguage.g:2698:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    // InternalSolverLanguage.g:2699:5: lv_multiplicity_2_0= ruleMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMemberDefinitionAccess().getMultiplicityMultiplicityParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_40);
                    lv_multiplicity_2_0=ruleMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            // InternalSolverLanguage.g:2716:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSolverLanguage.g:2717:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSolverLanguage.g:2717:4: (lv_name_3_0= RULE_ID )
            // InternalSolverLanguage.g:2718:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getMemberDefinitionAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalSolverLanguage.g:2734:3: (otherlv_4= 'opposite' ( ( ruleQualifiedName ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSolverLanguage.g:2735:4: otherlv_4= 'opposite' ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMemberDefinitionAccess().getOppositeKeyword_4_0());
                      			
                    }
                    // InternalSolverLanguage.g:2739:4: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguage.g:2740:5: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguage.g:2740:5: ( ruleQualifiedName )
                    // InternalSolverLanguage.g:2741:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMemberDefinitionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberDefinitionAccess().getOppositeNamedElementCrossReference_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalSolverLanguage.g:2756:3: (otherlv_6= ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSolverLanguage.g:2757:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMemberDefinitionAccess().getSemicolonKeyword_5());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2766:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalSolverLanguage.g:2766:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalSolverLanguage.g:2767:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2773:1: ruleMultiplicity returns [EObject current=null] : (this_ManyMultiplicity_0= ruleManyMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject this_ManyMultiplicity_0 = null;

        EObject this_ExactMultiplicity_1 = null;

        EObject this_BoundedMultiplicity_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2779:2: ( (this_ManyMultiplicity_0= ruleManyMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity ) )
            // InternalSolverLanguage.g:2780:2: (this_ManyMultiplicity_0= ruleManyMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity )
            {
            // InternalSolverLanguage.g:2780:2: (this_ManyMultiplicity_0= ruleManyMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity )
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                switch ( input.LA(2) ) {
                case RULE_INT:
                    {
                    int LA35_2 = input.LA(3);

                    if ( (LA35_2==38) ) {
                        alt35=2;
                    }
                    else if ( (LA35_2==37) ) {
                        alt35=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 35:
                    {
                    alt35=2;
                    }
                    break;
                case 38:
                    {
                    alt35=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalSolverLanguage.g:2781:3: this_ManyMultiplicity_0= ruleManyMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMultiplicityAccess().getManyMultiplicityParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ManyMultiplicity_0=ruleManyMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ManyMultiplicity_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:2790:3: this_ExactMultiplicity_1= ruleExactMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMultiplicityAccess().getExactMultiplicityParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExactMultiplicity_1=ruleExactMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExactMultiplicity_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:2799:3: this_BoundedMultiplicity_2= ruleBoundedMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMultiplicityAccess().getBoundedMultiplicityParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BoundedMultiplicity_2=ruleBoundedMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoundedMultiplicity_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2811:1: entryRuleManyMultiplicity returns [EObject current=null] : iv_ruleManyMultiplicity= ruleManyMultiplicity EOF ;
    public final EObject entryRuleManyMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyMultiplicity = null;


        try {
            // InternalSolverLanguage.g:2811:57: (iv_ruleManyMultiplicity= ruleManyMultiplicity EOF )
            // InternalSolverLanguage.g:2812:2: iv_ruleManyMultiplicity= ruleManyMultiplicity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getManyMultiplicityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleManyMultiplicity=ruleManyMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleManyMultiplicity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2818:1: ruleManyMultiplicity returns [EObject current=null] : ( () otherlv_1= '[' otherlv_2= ']' ) ;
    public final EObject ruleManyMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:2824:2: ( ( () otherlv_1= '[' otherlv_2= ']' ) )
            // InternalSolverLanguage.g:2825:2: ( () otherlv_1= '[' otherlv_2= ']' )
            {
            // InternalSolverLanguage.g:2825:2: ( () otherlv_1= '[' otherlv_2= ']' )
            // InternalSolverLanguage.g:2826:3: () otherlv_1= '[' otherlv_2= ']'
            {
            // InternalSolverLanguage.g:2826:3: ()
            // InternalSolverLanguage.g:2827:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getManyMultiplicityAccess().getManyMultiplicityAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getManyMultiplicityAccess().getLeftSquareBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getManyMultiplicityAccess().getRightSquareBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2845:1: entryRuleExactMultiplicity returns [EObject current=null] : iv_ruleExactMultiplicity= ruleExactMultiplicity EOF ;
    public final EObject entryRuleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactMultiplicity = null;


        try {
            // InternalSolverLanguage.g:2845:58: (iv_ruleExactMultiplicity= ruleExactMultiplicity EOF )
            // InternalSolverLanguage.g:2846:2: iv_ruleExactMultiplicity= ruleExactMultiplicity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExactMultiplicityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExactMultiplicity=ruleExactMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExactMultiplicity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2852:1: ruleExactMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= ']' ) ;
    public final EObject ruleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_multiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2858:2: ( (otherlv_0= '[' ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= ']' ) )
            // InternalSolverLanguage.g:2859:2: (otherlv_0= '[' ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= ']' )
            {
            // InternalSolverLanguage.g:2859:2: (otherlv_0= '[' ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= ']' )
            // InternalSolverLanguage.g:2860:3: otherlv_0= '[' ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExactMultiplicityAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalSolverLanguage.g:2864:3: ( (lv_multiplicity_1_0= ruleUpperMultiplicty ) )
            // InternalSolverLanguage.g:2865:4: (lv_multiplicity_1_0= ruleUpperMultiplicty )
            {
            // InternalSolverLanguage.g:2865:4: (lv_multiplicity_1_0= ruleUpperMultiplicty )
            // InternalSolverLanguage.g:2866:5: lv_multiplicity_1_0= ruleUpperMultiplicty
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExactMultiplicityAccess().getMultiplicityUpperMultiplictyParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_multiplicity_1_0=ruleUpperMultiplicty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExactMultiplicityAccess().getRightSquareBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2891:1: entryRuleBoundedMultiplicity returns [EObject current=null] : iv_ruleBoundedMultiplicity= ruleBoundedMultiplicity EOF ;
    public final EObject entryRuleBoundedMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundedMultiplicity = null;


        try {
            // InternalSolverLanguage.g:2891:60: (iv_ruleBoundedMultiplicity= ruleBoundedMultiplicity EOF )
            // InternalSolverLanguage.g:2892:2: iv_ruleBoundedMultiplicity= ruleBoundedMultiplicity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoundedMultiplicityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoundedMultiplicity=ruleBoundedMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoundedMultiplicity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2898:1: ruleBoundedMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= ']' ) ;
    public final EObject ruleBoundedMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerBound_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2904:2: ( (otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= ']' ) )
            // InternalSolverLanguage.g:2905:2: (otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= ']' )
            {
            // InternalSolverLanguage.g:2905:2: (otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= ']' )
            // InternalSolverLanguage.g:2906:3: otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBoundedMultiplicityAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalSolverLanguage.g:2910:3: ( (lv_lowerBound_1_0= RULE_INT ) )
            // InternalSolverLanguage.g:2911:4: (lv_lowerBound_1_0= RULE_INT )
            {
            // InternalSolverLanguage.g:2911:4: (lv_lowerBound_1_0= RULE_INT )
            // InternalSolverLanguage.g:2912:5: lv_lowerBound_1_0= RULE_INT
            {
            lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_lowerBound_1_0, grammarAccess.getBoundedMultiplicityAccess().getLowerBoundINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,37,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBoundedMultiplicityAccess().getFullStopFullStopKeyword_2());
              		
            }
            // InternalSolverLanguage.g:2932:3: ( (lv_upperBound_3_0= ruleUpperMultiplicty ) )
            // InternalSolverLanguage.g:2933:4: (lv_upperBound_3_0= ruleUpperMultiplicty )
            {
            // InternalSolverLanguage.g:2933:4: (lv_upperBound_3_0= ruleUpperMultiplicty )
            // InternalSolverLanguage.g:2934:5: lv_upperBound_3_0= ruleUpperMultiplicty
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBoundedMultiplicityAccess().getUpperBoundUpperMultiplictyParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_upperBound_3_0=ruleUpperMultiplicty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBoundedMultiplicityAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:2959:1: entryRuleScopeDefinition returns [EObject current=null] : iv_ruleScopeDefinition= ruleScopeDefinition EOF ;
    public final EObject entryRuleScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDefinition = null;


        try {
            // InternalSolverLanguage.g:2959:56: (iv_ruleScopeDefinition= ruleScopeDefinition EOF )
            // InternalSolverLanguage.g:2960:2: iv_ruleScopeDefinition= ruleScopeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScopeDefinition=ruleScopeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScopeDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:2966:1: ruleScopeDefinition returns [EObject current=null] : (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition ) ;
    public final EObject ruleScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ExactScopeDefinition_0 = null;

        EObject this_BoundedScopeDefinition_1 = null;

        EObject this_LowerBoundedScopeDefinition_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2972:2: ( (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition ) )
            // InternalSolverLanguage.g:2973:2: (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition )
            {
            // InternalSolverLanguage.g:2973:2: (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition )
            int alt36=3;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalSolverLanguage.g:2974:3: this_ExactScopeDefinition_0= ruleExactScopeDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getScopeDefinitionAccess().getExactScopeDefinitionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExactScopeDefinition_0=ruleExactScopeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExactScopeDefinition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:2983:3: this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getScopeDefinitionAccess().getBoundedScopeDefinitionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BoundedScopeDefinition_1=ruleBoundedScopeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoundedScopeDefinition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:2992:3: this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getScopeDefinitionAccess().getLowerBoundedScopeDefinitionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LowerBoundedScopeDefinition_2=ruleLowerBoundedScopeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LowerBoundedScopeDefinition_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:3004:1: entryRuleExactScopeDefinition returns [EObject current=null] : iv_ruleExactScopeDefinition= ruleExactScopeDefinition EOF ;
    public final EObject entryRuleExactScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactScopeDefinition = null;


        try {
            // InternalSolverLanguage.g:3004:61: (iv_ruleExactScopeDefinition= ruleExactScopeDefinition EOF )
            // InternalSolverLanguage.g:3005:2: iv_ruleExactScopeDefinition= ruleExactScopeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExactScopeDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExactScopeDefinition=ruleExactScopeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExactScopeDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:3011:1: ruleExactScopeDefinition returns [EObject current=null] : (otherlv_0= 'scope' ( ( ruleQualifiedName ) ) otherlv_2= '==' ( (lv_exactScope_3_0= RULE_INT ) ) ) ;
    public final EObject ruleExactScopeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_exactScope_3_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:3017:2: ( (otherlv_0= 'scope' ( ( ruleQualifiedName ) ) otherlv_2= '==' ( (lv_exactScope_3_0= RULE_INT ) ) ) )
            // InternalSolverLanguage.g:3018:2: (otherlv_0= 'scope' ( ( ruleQualifiedName ) ) otherlv_2= '==' ( (lv_exactScope_3_0= RULE_INT ) ) )
            {
            // InternalSolverLanguage.g:3018:2: (otherlv_0= 'scope' ( ( ruleQualifiedName ) ) otherlv_2= '==' ( (lv_exactScope_3_0= RULE_INT ) ) )
            // InternalSolverLanguage.g:3019:3: otherlv_0= 'scope' ( ( ruleQualifiedName ) ) otherlv_2= '==' ( (lv_exactScope_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExactScopeDefinitionAccess().getScopeKeyword_0());
              		
            }
            // InternalSolverLanguage.g:3023:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguage.g:3024:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguage.g:3024:4: ( ruleQualifiedName )
            // InternalSolverLanguage.g:3025:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getExactScopeDefinitionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExactScopeDefinitionAccess().getTypeNamedElementCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_48);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExactScopeDefinitionAccess().getEqualsSignEqualsSignKeyword_2());
              		
            }
            // InternalSolverLanguage.g:3043:3: ( (lv_exactScope_3_0= RULE_INT ) )
            // InternalSolverLanguage.g:3044:4: (lv_exactScope_3_0= RULE_INT )
            {
            // InternalSolverLanguage.g:3044:4: (lv_exactScope_3_0= RULE_INT )
            // InternalSolverLanguage.g:3045:5: lv_exactScope_3_0= RULE_INT
            {
            lv_exactScope_3_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_exactScope_3_0, grammarAccess.getExactScopeDefinitionAccess().getExactScopeINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:3065:1: entryRuleBoundedScopeDefinition returns [EObject current=null] : iv_ruleBoundedScopeDefinition= ruleBoundedScopeDefinition EOF ;
    public final EObject entryRuleBoundedScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundedScopeDefinition = null;


        try {
            // InternalSolverLanguage.g:3065:63: (iv_ruleBoundedScopeDefinition= ruleBoundedScopeDefinition EOF )
            // InternalSolverLanguage.g:3066:2: iv_ruleBoundedScopeDefinition= ruleBoundedScopeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoundedScopeDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoundedScopeDefinition=ruleBoundedScopeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoundedScopeDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:3072:1: ruleBoundedScopeDefinition returns [EObject current=null] : (otherlv_0= 'scope' ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' )? ( ( ruleQualifiedName ) ) otherlv_4= '<=' ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= '>=' ( ( ruleQualifiedName ) ) (otherlv_9= '>=' ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) otherlv_11= '.' ) ;
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
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:3078:2: ( (otherlv_0= 'scope' ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' )? ( ( ruleQualifiedName ) ) otherlv_4= '<=' ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= '>=' ( ( ruleQualifiedName ) ) (otherlv_9= '>=' ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) otherlv_11= '.' ) )
            // InternalSolverLanguage.g:3079:2: (otherlv_0= 'scope' ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' )? ( ( ruleQualifiedName ) ) otherlv_4= '<=' ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= '>=' ( ( ruleQualifiedName ) ) (otherlv_9= '>=' ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) otherlv_11= '.' )
            {
            // InternalSolverLanguage.g:3079:2: (otherlv_0= 'scope' ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' )? ( ( ruleQualifiedName ) ) otherlv_4= '<=' ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= '>=' ( ( ruleQualifiedName ) ) (otherlv_9= '>=' ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) otherlv_11= '.' )
            // InternalSolverLanguage.g:3080:3: otherlv_0= 'scope' ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' )? ( ( ruleQualifiedName ) ) otherlv_4= '<=' ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= '>=' ( ( ruleQualifiedName ) ) (otherlv_9= '>=' ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) otherlv_11= '.'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBoundedScopeDefinitionAccess().getScopeKeyword_0());
              		
            }
            // InternalSolverLanguage.g:3084:3: ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' )? ( ( ruleQualifiedName ) ) otherlv_4= '<=' ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= '>=' ( ( ruleQualifiedName ) ) (otherlv_9= '>=' ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==49) ) {
                    alt39=2;
                }
                else if ( (LA39_1==48) ) {
                    alt39=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA39_0==RULE_ID||LA39_0==RULE_QUOTED_ID) ) {
                alt39=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalSolverLanguage.g:3085:4: ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' )? ( ( ruleQualifiedName ) ) otherlv_4= '<=' ( (lv_upperBound_5_0= RULE_INT ) ) )
                    {
                    // InternalSolverLanguage.g:3085:4: ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' )? ( ( ruleQualifiedName ) ) otherlv_4= '<=' ( (lv_upperBound_5_0= RULE_INT ) ) )
                    // InternalSolverLanguage.g:3086:5: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' )? ( ( ruleQualifiedName ) ) otherlv_4= '<=' ( (lv_upperBound_5_0= RULE_INT ) )
                    {
                    // InternalSolverLanguage.g:3086:5: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_INT) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalSolverLanguage.g:3087:6: ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<='
                            {
                            // InternalSolverLanguage.g:3087:6: ( (lv_lowerBound_1_0= RULE_INT ) )
                            // InternalSolverLanguage.g:3088:7: (lv_lowerBound_1_0= RULE_INT )
                            {
                            // InternalSolverLanguage.g:3088:7: (lv_lowerBound_1_0= RULE_INT )
                            // InternalSolverLanguage.g:3089:8: lv_lowerBound_1_0= RULE_INT
                            {
                            lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_50); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_lowerBound_1_0, grammarAccess.getBoundedScopeDefinitionAccess().getLowerBoundINTTerminalRuleCall_1_0_0_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

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


                            }

                            otherlv_2=(Token)match(input,48,FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getBoundedScopeDefinitionAccess().getLessThanSignEqualsSignKeyword_1_0_0_1());
                              					
                            }

                            }
                            break;

                    }

                    // InternalSolverLanguage.g:3110:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguage.g:3111:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguage.g:3111:6: ( ruleQualifiedName )
                    // InternalSolverLanguage.g:3112:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getBoundedScopeDefinitionRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBoundedScopeDefinitionAccess().getTypeNamedElementCrossReference_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_50);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,48,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getBoundedScopeDefinitionAccess().getLessThanSignEqualsSignKeyword_1_0_2());
                      				
                    }
                    // InternalSolverLanguage.g:3130:5: ( (lv_upperBound_5_0= RULE_INT ) )
                    // InternalSolverLanguage.g:3131:6: (lv_upperBound_5_0= RULE_INT )
                    {
                    // InternalSolverLanguage.g:3131:6: (lv_upperBound_5_0= RULE_INT )
                    // InternalSolverLanguage.g:3132:7: lv_upperBound_5_0= RULE_INT
                    {
                    lv_upperBound_5_0=(Token)match(input,RULE_INT,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_upperBound_5_0, grammarAccess.getBoundedScopeDefinitionAccess().getUpperBoundINTTerminalRuleCall_1_0_3_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:3150:4: ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= '>=' ( ( ruleQualifiedName ) ) (otherlv_9= '>=' ( (lv_lowerBound_10_0= RULE_INT ) ) )? )
                    {
                    // InternalSolverLanguage.g:3150:4: ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= '>=' ( ( ruleQualifiedName ) ) (otherlv_9= '>=' ( (lv_lowerBound_10_0= RULE_INT ) ) )? )
                    // InternalSolverLanguage.g:3151:5: ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= '>=' ( ( ruleQualifiedName ) ) (otherlv_9= '>=' ( (lv_lowerBound_10_0= RULE_INT ) ) )?
                    {
                    // InternalSolverLanguage.g:3151:5: ( (lv_upperBound_6_0= RULE_INT ) )
                    // InternalSolverLanguage.g:3152:6: (lv_upperBound_6_0= RULE_INT )
                    {
                    // InternalSolverLanguage.g:3152:6: (lv_upperBound_6_0= RULE_INT )
                    // InternalSolverLanguage.g:3153:7: lv_upperBound_6_0= RULE_INT
                    {
                    lv_upperBound_6_0=(Token)match(input,RULE_INT,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_upperBound_6_0, grammarAccess.getBoundedScopeDefinitionAccess().getUpperBoundINTTerminalRuleCall_1_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_7=(Token)match(input,49,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getBoundedScopeDefinitionAccess().getGreaterThanSignEqualsSignKeyword_1_1_1());
                      				
                    }
                    // InternalSolverLanguage.g:3173:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguage.g:3174:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguage.g:3174:6: ( ruleQualifiedName )
                    // InternalSolverLanguage.g:3175:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getBoundedScopeDefinitionRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBoundedScopeDefinitionAccess().getTypeNamedElementCrossReference_1_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_52);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalSolverLanguage.g:3189:5: (otherlv_9= '>=' ( (lv_lowerBound_10_0= RULE_INT ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==49) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalSolverLanguage.g:3190:6: otherlv_9= '>=' ( (lv_lowerBound_10_0= RULE_INT ) )
                            {
                            otherlv_9=(Token)match(input,49,FOLLOW_47); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_9, grammarAccess.getBoundedScopeDefinitionAccess().getGreaterThanSignEqualsSignKeyword_1_1_3_0());
                              					
                            }
                            // InternalSolverLanguage.g:3194:6: ( (lv_lowerBound_10_0= RULE_INT ) )
                            // InternalSolverLanguage.g:3195:7: (lv_lowerBound_10_0= RULE_INT )
                            {
                            // InternalSolverLanguage.g:3195:7: (lv_lowerBound_10_0= RULE_INT )
                            // InternalSolverLanguage.g:3196:8: lv_lowerBound_10_0= RULE_INT
                            {
                            lv_lowerBound_10_0=(Token)match(input,RULE_INT,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_lowerBound_10_0, grammarAccess.getBoundedScopeDefinitionAccess().getLowerBoundINTTerminalRuleCall_1_1_3_1_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

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


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getBoundedScopeDefinitionAccess().getFullStopKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:3223:1: entryRuleLowerBoundedScopeDefinition returns [EObject current=null] : iv_ruleLowerBoundedScopeDefinition= ruleLowerBoundedScopeDefinition EOF ;
    public final EObject entryRuleLowerBoundedScopeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerBoundedScopeDefinition = null;


        try {
            // InternalSolverLanguage.g:3223:68: (iv_ruleLowerBoundedScopeDefinition= ruleLowerBoundedScopeDefinition EOF )
            // InternalSolverLanguage.g:3224:2: iv_ruleLowerBoundedScopeDefinition= ruleLowerBoundedScopeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLowerBoundedScopeDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLowerBoundedScopeDefinition=ruleLowerBoundedScopeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLowerBoundedScopeDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:3230:1: ruleLowerBoundedScopeDefinition returns [EObject current=null] : (otherlv_0= 'scope' ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= '>=' ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) otherlv_7= '.' ) ;
    public final EObject ruleLowerBoundedScopeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerBound_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_lowerBound_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:3236:2: ( (otherlv_0= 'scope' ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= '>=' ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) otherlv_7= '.' ) )
            // InternalSolverLanguage.g:3237:2: (otherlv_0= 'scope' ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= '>=' ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) otherlv_7= '.' )
            {
            // InternalSolverLanguage.g:3237:2: (otherlv_0= 'scope' ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= '>=' ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) otherlv_7= '.' )
            // InternalSolverLanguage.g:3238:3: otherlv_0= 'scope' ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= '>=' ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) otherlv_7= '.'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLowerBoundedScopeDefinitionAccess().getScopeKeyword_0());
              		
            }
            // InternalSolverLanguage.g:3242:3: ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= '>=' ( (lv_lowerBound_6_0= RULE_INT ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID||LA40_0==RULE_QUOTED_ID) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalSolverLanguage.g:3243:4: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalSolverLanguage.g:3243:4: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' ( ( ruleQualifiedName ) ) )
                    // InternalSolverLanguage.g:3244:5: ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '<=' ( ( ruleQualifiedName ) )
                    {
                    // InternalSolverLanguage.g:3244:5: ( (lv_lowerBound_1_0= RULE_INT ) )
                    // InternalSolverLanguage.g:3245:6: (lv_lowerBound_1_0= RULE_INT )
                    {
                    // InternalSolverLanguage.g:3245:6: (lv_lowerBound_1_0= RULE_INT )
                    // InternalSolverLanguage.g:3246:7: lv_lowerBound_1_0= RULE_INT
                    {
                    lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_lowerBound_1_0, grammarAccess.getLowerBoundedScopeDefinitionAccess().getLowerBoundINTTerminalRuleCall_1_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_2=(Token)match(input,48,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getLowerBoundedScopeDefinitionAccess().getLessThanSignEqualsSignKeyword_1_0_1());
                      				
                    }
                    // InternalSolverLanguage.g:3266:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguage.g:3267:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguage.g:3267:6: ( ruleQualifiedName )
                    // InternalSolverLanguage.g:3268:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getLowerBoundedScopeDefinitionRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLowerBoundedScopeDefinitionAccess().getTypeNamedElementCrossReference_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_12);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:3284:4: ( ( ( ruleQualifiedName ) ) otherlv_5= '>=' ( (lv_lowerBound_6_0= RULE_INT ) ) )
                    {
                    // InternalSolverLanguage.g:3284:4: ( ( ( ruleQualifiedName ) ) otherlv_5= '>=' ( (lv_lowerBound_6_0= RULE_INT ) ) )
                    // InternalSolverLanguage.g:3285:5: ( ( ruleQualifiedName ) ) otherlv_5= '>=' ( (lv_lowerBound_6_0= RULE_INT ) )
                    {
                    // InternalSolverLanguage.g:3285:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguage.g:3286:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguage.g:3286:6: ( ruleQualifiedName )
                    // InternalSolverLanguage.g:3287:7: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getLowerBoundedScopeDefinitionRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLowerBoundedScopeDefinitionAccess().getTypeNamedElementCrossReference_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_51);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,49,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getLowerBoundedScopeDefinitionAccess().getGreaterThanSignEqualsSignKeyword_1_1_1());
                      				
                    }
                    // InternalSolverLanguage.g:3305:5: ( (lv_lowerBound_6_0= RULE_INT ) )
                    // InternalSolverLanguage.g:3306:6: (lv_lowerBound_6_0= RULE_INT )
                    {
                    // InternalSolverLanguage.g:3306:6: (lv_lowerBound_6_0= RULE_INT )
                    // InternalSolverLanguage.g:3307:7: lv_lowerBound_6_0= RULE_INT
                    {
                    lv_lowerBound_6_0=(Token)match(input,RULE_INT,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_lowerBound_6_0, grammarAccess.getLowerBoundedScopeDefinitionAccess().getLowerBoundINTTerminalRuleCall_1_1_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getLowerBoundedScopeDefinitionAccess().getFullStopKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:3333:1: entryRuleObjectiveDefinition returns [EObject current=null] : iv_ruleObjectiveDefinition= ruleObjectiveDefinition EOF ;
    public final EObject entryRuleObjectiveDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectiveDefinition = null;


        try {
            // InternalSolverLanguage.g:3333:60: (iv_ruleObjectiveDefinition= ruleObjectiveDefinition EOF )
            // InternalSolverLanguage.g:3334:2: iv_ruleObjectiveDefinition= ruleObjectiveDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectiveDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObjectiveDefinition=ruleObjectiveDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectiveDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:3340:1: ruleObjectiveDefinition returns [EObject current=null] : ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) ) ;
    public final EObject ruleObjectiveDefinition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        EObject lv_objective_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:3346:2: ( ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) ) )
            // InternalSolverLanguage.g:3347:2: ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) )
            {
            // InternalSolverLanguage.g:3347:2: ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) )
            // InternalSolverLanguage.g:3348:3: ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) )
            {
            // InternalSolverLanguage.g:3348:3: ( (lv_kind_0_0= ruleObjectiveKind ) )
            // InternalSolverLanguage.g:3349:4: (lv_kind_0_0= ruleObjectiveKind )
            {
            // InternalSolverLanguage.g:3349:4: (lv_kind_0_0= ruleObjectiveKind )
            // InternalSolverLanguage.g:3350:5: lv_kind_0_0= ruleObjectiveKind
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectiveDefinitionAccess().getKindObjectiveKindEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_kind_0_0=ruleObjectiveKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalSolverLanguage.g:3367:3: ( (lv_objective_1_0= ruleExpression ) )
            // InternalSolverLanguage.g:3368:4: (lv_objective_1_0= ruleExpression )
            {
            // InternalSolverLanguage.g:3368:4: (lv_objective_1_0= ruleExpression )
            // InternalSolverLanguage.g:3369:5: lv_objective_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getObjectiveDefinitionAccess().getObjectiveExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_objective_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:3390:1: entryRuleUpperMultiplicty returns [String current=null] : iv_ruleUpperMultiplicty= ruleUpperMultiplicty EOF ;
    public final String entryRuleUpperMultiplicty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUpperMultiplicty = null;


        try {
            // InternalSolverLanguage.g:3390:56: (iv_ruleUpperMultiplicty= ruleUpperMultiplicty EOF )
            // InternalSolverLanguage.g:3391:2: iv_ruleUpperMultiplicty= ruleUpperMultiplicty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpperMultiplictyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUpperMultiplicty=ruleUpperMultiplicty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpperMultiplicty.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalSolverLanguage.g:3397:1: ruleUpperMultiplicty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUpperMultiplicty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:3403:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalSolverLanguage.g:3404:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalSolverLanguage.g:3404:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            else if ( (LA41_0==35) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalSolverLanguage.g:3405:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getUpperMultiplictyAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:3413:3: kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUpperMultiplictyAccess().getAsteriskKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:3422:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguage.g:3424:2: (iv_ruleReal= ruleReal EOF )
            // InternalSolverLanguage.g:3425:2: iv_ruleReal= ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReal=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReal.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalSolverLanguage.g:3434:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguage.g:3441:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalSolverLanguage.g:3442:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalSolverLanguage.g:3442:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalSolverLanguage.g:3443:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getRealAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalSolverLanguage.g:3450:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==22) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSolverLanguage.g:3451:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,22,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_1_0());
                      			
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_2, grammarAccess.getRealAccess().getINTTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSolverLanguage.g:3471:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguage.g:3473:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSolverLanguage.g:3474:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalSolverLanguage.g:3483:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | this_QUOTED_ID_3= RULE_QUOTED_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_QUOTED_ID_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguage.g:3490:2: ( ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | this_QUOTED_ID_3= RULE_QUOTED_ID ) )
            // InternalSolverLanguage.g:3491:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | this_QUOTED_ID_3= RULE_QUOTED_ID )
            {
            // InternalSolverLanguage.g:3491:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) | this_QUOTED_ID_3= RULE_QUOTED_ID )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_QUOTED_ID) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalSolverLanguage.g:3492:3: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
                    {
                    // InternalSolverLanguage.g:3492:3: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
                    // InternalSolverLanguage.g:3493:4: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0());
                      			
                    }
                    // InternalSolverLanguage.g:3500:4: (kw= '.' this_ID_2= RULE_ID )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==22) ) {
                            int LA43_2 = input.LA(2);

                            if ( (LA43_2==RULE_ID) ) {
                                alt43=1;
                            }


                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:3501:5: kw= '.' this_ID_2= RULE_ID
                    	    {
                    	    kw=(Token)match(input,22,FOLLOW_40); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1_0());
                    	      				
                    	    }
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_ID_2);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_1_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:3516:3: this_QUOTED_ID_3= RULE_QUOTED_ID
                    {
                    this_QUOTED_ID_3=(Token)match(input,RULE_QUOTED_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_QUOTED_ID_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_QUOTED_ID_3, grammarAccess.getQualifiedNameAccess().getQUOTED_IDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleMetricType"
    // InternalSolverLanguage.g:3530:1: ruleMetricType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'real' ) ) ;
    public final Enumerator ruleMetricType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:3536:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'real' ) ) )
            // InternalSolverLanguage.g:3537:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'real' ) )
            {
            // InternalSolverLanguage.g:3537:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'real' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==50) ) {
                alt45=1;
            }
            else if ( (LA45_0==51) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalSolverLanguage.g:3538:3: (enumLiteral_0= 'int' )
                    {
                    // InternalSolverLanguage.g:3538:3: (enumLiteral_0= 'int' )
                    // InternalSolverLanguage.g:3539:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMetricTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMetricTypeAccess().getINTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:3546:3: (enumLiteral_1= 'real' )
                    {
                    // InternalSolverLanguage.g:3546:3: (enumLiteral_1= 'real' )
                    // InternalSolverLanguage.g:3547:4: enumLiteral_1= 'real'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMetricTypeAccess().getREALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMetricTypeAccess().getREALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:3557:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= 'in' ) ) ;
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
            // InternalSolverLanguage.g:3563:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= 'in' ) ) )
            // InternalSolverLanguage.g:3564:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= 'in' ) )
            {
            // InternalSolverLanguage.g:3564:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= 'in' ) )
            int alt46=7;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt46=1;
                }
                break;
            case 52:
                {
                alt46=2;
                }
                break;
            case 53:
                {
                alt46=3;
                }
                break;
            case 48:
                {
                alt46=4;
                }
                break;
            case 54:
                {
                alt46=5;
                }
                break;
            case 49:
                {
                alt46=6;
                }
                break;
            case 55:
                {
                alt46=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalSolverLanguage.g:3565:3: (enumLiteral_0= '==' )
                    {
                    // InternalSolverLanguage.g:3565:3: (enumLiteral_0= '==' )
                    // InternalSolverLanguage.g:3566:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:3573:3: (enumLiteral_1= '!=' )
                    {
                    // InternalSolverLanguage.g:3573:3: (enumLiteral_1= '!=' )
                    // InternalSolverLanguage.g:3574:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getNOT_EQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getNOT_EQEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:3581:3: (enumLiteral_2= '<' )
                    {
                    // InternalSolverLanguage.g:3581:3: (enumLiteral_2= '<' )
                    // InternalSolverLanguage.g:3582:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguage.g:3589:3: (enumLiteral_3= '<=' )
                    {
                    // InternalSolverLanguage.g:3589:3: (enumLiteral_3= '<=' )
                    // InternalSolverLanguage.g:3590:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getLESS_EQEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getLESS_EQEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSolverLanguage.g:3597:3: (enumLiteral_4= '>' )
                    {
                    // InternalSolverLanguage.g:3597:3: (enumLiteral_4= '>' )
                    // InternalSolverLanguage.g:3598:4: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSolverLanguage.g:3605:3: (enumLiteral_5= '>=' )
                    {
                    // InternalSolverLanguage.g:3605:3: (enumLiteral_5= '>=' )
                    // InternalSolverLanguage.g:3606:4: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getGREATER_EQEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getGREATER_EQEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalSolverLanguage.g:3613:3: (enumLiteral_6= 'in' )
                    {
                    // InternalSolverLanguage.g:3613:3: (enumLiteral_6= 'in' )
                    // InternalSolverLanguage.g:3614:4: enumLiteral_6= 'in'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparisonOperatorAccess().getINEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getComparisonOperatorAccess().getINEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:3624:1: ruleAdditiveBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:3630:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalSolverLanguage.g:3631:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalSolverLanguage.g:3631:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==56) ) {
                alt47=1;
            }
            else if ( (LA47_0==57) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalSolverLanguage.g:3632:3: (enumLiteral_0= '+' )
                    {
                    // InternalSolverLanguage.g:3632:3: (enumLiteral_0= '+' )
                    // InternalSolverLanguage.g:3633:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditiveBinaryOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveBinaryOperatorAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:3640:3: (enumLiteral_1= '-' )
                    {
                    // InternalSolverLanguage.g:3640:3: (enumLiteral_1= '-' )
                    // InternalSolverLanguage.g:3641:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAdditiveBinaryOperatorAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAdditiveBinaryOperatorAccess().getSUBEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:3651:1: ruleMultiplicativeBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMultiplicativeBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:3657:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalSolverLanguage.g:3658:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalSolverLanguage.g:3658:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==35) ) {
                alt48=1;
            }
            else if ( (LA48_0==58) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalSolverLanguage.g:3659:3: (enumLiteral_0= '*' )
                    {
                    // InternalSolverLanguage.g:3659:3: (enumLiteral_0= '*' )
                    // InternalSolverLanguage.g:3660:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicativeBinaryOperatorAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeBinaryOperatorAccess().getMULEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:3667:3: (enumLiteral_1= '/' )
                    {
                    // InternalSolverLanguage.g:3667:3: (enumLiteral_1= '/' )
                    // InternalSolverLanguage.g:3668:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMultiplicativeBinaryOperatorAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeBinaryOperatorAccess().getDIVEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:3678:1: ruleExponentialOp returns [Enumerator current=null] : (enumLiteral_0= '^' ) ;
    public final Enumerator ruleExponentialOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:3684:2: ( (enumLiteral_0= '^' ) )
            // InternalSolverLanguage.g:3685:2: (enumLiteral_0= '^' )
            {
            // InternalSolverLanguage.g:3685:2: (enumLiteral_0= '^' )
            // InternalSolverLanguage.g:3686:3: enumLiteral_0= '^'
            {
            enumLiteral_0=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getExponentialOpAccess().getPOWEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getExponentialOpAccess().getPOWEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:3695:1: ruleUnaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '!' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'may' ) | (enumLiteral_4= 'must' ) | (enumLiteral_5= 'current' ) ) ;
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
            // InternalSolverLanguage.g:3701:2: ( ( (enumLiteral_0= '!' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'may' ) | (enumLiteral_4= 'must' ) | (enumLiteral_5= 'current' ) ) )
            // InternalSolverLanguage.g:3702:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'may' ) | (enumLiteral_4= 'must' ) | (enumLiteral_5= 'current' ) )
            {
            // InternalSolverLanguage.g:3702:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'may' ) | (enumLiteral_4= 'must' ) | (enumLiteral_5= 'current' ) )
            int alt49=6;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt49=1;
                }
                break;
            case 56:
                {
                alt49=2;
                }
                break;
            case 57:
                {
                alt49=3;
                }
                break;
            case 61:
                {
                alt49=4;
                }
                break;
            case 62:
                {
                alt49=5;
                }
                break;
            case 63:
                {
                alt49=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalSolverLanguage.g:3703:3: (enumLiteral_0= '!' )
                    {
                    // InternalSolverLanguage.g:3703:3: (enumLiteral_0= '!' )
                    // InternalSolverLanguage.g:3704:4: enumLiteral_0= '!'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOpAccess().getNEGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOpAccess().getNEGEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:3711:3: (enumLiteral_1= '+' )
                    {
                    // InternalSolverLanguage.g:3711:3: (enumLiteral_1= '+' )
                    // InternalSolverLanguage.g:3712:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOpAccess().getPLUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getUnaryOpAccess().getPLUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:3719:3: (enumLiteral_2= '-' )
                    {
                    // InternalSolverLanguage.g:3719:3: (enumLiteral_2= '-' )
                    // InternalSolverLanguage.g:3720:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOpAccess().getMINUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getUnaryOpAccess().getMINUSEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguage.g:3727:3: (enumLiteral_3= 'may' )
                    {
                    // InternalSolverLanguage.g:3727:3: (enumLiteral_3= 'may' )
                    // InternalSolverLanguage.g:3728:4: enumLiteral_3= 'may'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOpAccess().getMAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getUnaryOpAccess().getMAYEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSolverLanguage.g:3735:3: (enumLiteral_4= 'must' )
                    {
                    // InternalSolverLanguage.g:3735:3: (enumLiteral_4= 'must' )
                    // InternalSolverLanguage.g:3736:4: enumLiteral_4= 'must'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOpAccess().getMUSTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getUnaryOpAccess().getMUSTEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSolverLanguage.g:3743:3: (enumLiteral_5= 'current' )
                    {
                    // InternalSolverLanguage.g:3743:3: (enumLiteral_5= 'current' )
                    // InternalSolverLanguage.g:3744:4: enumLiteral_5= 'current'
                    {
                    enumLiteral_5=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getUnaryOpAccess().getCURRENTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getUnaryOpAccess().getCURRENTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:3754:1: ruleAggregationOp returns [Enumerator current=null] : ( (enumLiteral_0= 'only' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'prod' ) | (enumLiteral_3= 'avg' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= 'max' ) ) ;
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
            // InternalSolverLanguage.g:3760:2: ( ( (enumLiteral_0= 'only' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'prod' ) | (enumLiteral_3= 'avg' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= 'max' ) ) )
            // InternalSolverLanguage.g:3761:2: ( (enumLiteral_0= 'only' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'prod' ) | (enumLiteral_3= 'avg' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= 'max' ) )
            {
            // InternalSolverLanguage.g:3761:2: ( (enumLiteral_0= 'only' ) | (enumLiteral_1= 'sum' ) | (enumLiteral_2= 'prod' ) | (enumLiteral_3= 'avg' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= 'max' ) )
            int alt50=6;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt50=1;
                }
                break;
            case 65:
                {
                alt50=2;
                }
                break;
            case 66:
                {
                alt50=3;
                }
                break;
            case 67:
                {
                alt50=4;
                }
                break;
            case 68:
                {
                alt50=5;
                }
                break;
            case 69:
                {
                alt50=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalSolverLanguage.g:3762:3: (enumLiteral_0= 'only' )
                    {
                    // InternalSolverLanguage.g:3762:3: (enumLiteral_0= 'only' )
                    // InternalSolverLanguage.g:3763:4: enumLiteral_0= 'only'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAggregationOpAccess().getONLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAggregationOpAccess().getONLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:3770:3: (enumLiteral_1= 'sum' )
                    {
                    // InternalSolverLanguage.g:3770:3: (enumLiteral_1= 'sum' )
                    // InternalSolverLanguage.g:3771:4: enumLiteral_1= 'sum'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAggregationOpAccess().getSUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAggregationOpAccess().getSUMEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:3778:3: (enumLiteral_2= 'prod' )
                    {
                    // InternalSolverLanguage.g:3778:3: (enumLiteral_2= 'prod' )
                    // InternalSolverLanguage.g:3779:4: enumLiteral_2= 'prod'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAggregationOpAccess().getPRODEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAggregationOpAccess().getPRODEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguage.g:3786:3: (enumLiteral_3= 'avg' )
                    {
                    // InternalSolverLanguage.g:3786:3: (enumLiteral_3= 'avg' )
                    // InternalSolverLanguage.g:3787:4: enumLiteral_3= 'avg'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAggregationOpAccess().getAVGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getAggregationOpAccess().getAVGEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSolverLanguage.g:3794:3: (enumLiteral_4= 'min' )
                    {
                    // InternalSolverLanguage.g:3794:3: (enumLiteral_4= 'min' )
                    // InternalSolverLanguage.g:3795:4: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAggregationOpAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getAggregationOpAccess().getMINEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSolverLanguage.g:3802:3: (enumLiteral_5= 'max' )
                    {
                    // InternalSolverLanguage.g:3802:3: (enumLiteral_5= 'max' )
                    // InternalSolverLanguage.g:3803:4: enumLiteral_5= 'max'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAggregationOpAccess().getMAXEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getAggregationOpAccess().getMAXEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:3813:1: ruleLogicValue returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) | (enumLiteral_3= 'error' ) ) ;
    public final Enumerator ruleLogicValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:3819:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) | (enumLiteral_3= 'error' ) ) )
            // InternalSolverLanguage.g:3820:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) | (enumLiteral_3= 'error' ) )
            {
            // InternalSolverLanguage.g:3820:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) | (enumLiteral_2= 'unknown' ) | (enumLiteral_3= 'error' ) )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt51=1;
                }
                break;
            case 71:
                {
                alt51=2;
                }
                break;
            case 72:
                {
                alt51=3;
                }
                break;
            case 19:
                {
                alt51=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalSolverLanguage.g:3821:3: (enumLiteral_0= 'true' )
                    {
                    // InternalSolverLanguage.g:3821:3: (enumLiteral_0= 'true' )
                    // InternalSolverLanguage.g:3822:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:3829:3: (enumLiteral_1= 'false' )
                    {
                    // InternalSolverLanguage.g:3829:3: (enumLiteral_1= 'false' )
                    // InternalSolverLanguage.g:3830:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:3837:3: (enumLiteral_2= 'unknown' )
                    {
                    // InternalSolverLanguage.g:3837:3: (enumLiteral_2= 'unknown' )
                    // InternalSolverLanguage.g:3838:4: enumLiteral_2= 'unknown'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguage.g:3845:3: (enumLiteral_3= 'error' )
                    {
                    // InternalSolverLanguage.g:3845:3: (enumLiteral_3= 'error' )
                    // InternalSolverLanguage.g:3846:4: enumLiteral_3= 'error'
                    {
                    enumLiteral_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicValueAccess().getERROREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getLogicValueAccess().getERROREnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalSolverLanguage.g:3856:1: ruleObjectiveKind returns [Enumerator current=null] : ( (enumLiteral_0= 'minimize' ) | (enumLiteral_1= 'maximize' ) ) ;
    public final Enumerator ruleObjectiveKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:3862:2: ( ( (enumLiteral_0= 'minimize' ) | (enumLiteral_1= 'maximize' ) ) )
            // InternalSolverLanguage.g:3863:2: ( (enumLiteral_0= 'minimize' ) | (enumLiteral_1= 'maximize' ) )
            {
            // InternalSolverLanguage.g:3863:2: ( (enumLiteral_0= 'minimize' ) | (enumLiteral_1= 'maximize' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==73) ) {
                alt52=1;
            }
            else if ( (LA52_0==74) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalSolverLanguage.g:3864:3: (enumLiteral_0= 'minimize' )
                    {
                    // InternalSolverLanguage.g:3864:3: (enumLiteral_0= 'minimize' )
                    // InternalSolverLanguage.g:3865:4: enumLiteral_0= 'minimize'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getObjectiveKindAccess().getMINIMIZEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getObjectiveKindAccess().getMINIMIZEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:3872:3: (enumLiteral_1= 'maximize' )
                    {
                    // InternalSolverLanguage.g:3872:3: (enumLiteral_1= 'maximize' )
                    // InternalSolverLanguage.g:3873:4: enumLiteral_1= 'maximize'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getObjectiveKindAccess().getMAXIMIZEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getObjectiveKindAccess().getMAXIMIZEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\7\1\uffff\1\4\2\uffff\1\10\7\uffff";
    static final String dfa_3s = "\1\112\1\uffff\1\73\2\uffff\1\63\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\4\1\uffff\1\6\1\10\1\11\1\12\1\3\1\7\1\5";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\4\1\7\uffff\1\3\1\2\1\4\1\5\1\uffff\1\1\5\uffff\1\1\3\uffff\1\1\2\uffff\1\1\2\uffff\2\1\2\7\3\uffff\1\10\3\uffff\2\6\4\uffff\2\1\2\uffff\15\1\2\11",
            "",
            "\1\1\3\uffff\1\3\1\uffff\1\3\4\uffff\3\1\1\3\7\uffff\3\1\4\uffff\1\12\1\uffff\1\1\13\uffff\3\1\2\uffff\10\1",
            "",
            "",
            "\1\14\1\uffff\1\14\47\uffff\2\13",
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
            return "116:3: (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPrediateDefinition_2= ruleUnnamedErrorPrediateDefinition | this_DefaultDefinition_3= ruleDefaultDefinition | this_ExternPredicateDefinition_4= ruleExternPredicateDefinition | this_MetricDefinition_5= ruleMetricDefinition | this_ExternMetricDefinition_6= ruleExternMetricDefinition | this_ClassDefinition_7= ruleClassDefinition | this_ScopeDefinition_8= ruleScopeDefinition | this_ObjectiveDefinition_9= ruleObjectiveDefinition )";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\uffff\2\3\4\uffff\1\11\1\3\1\uffff";
    static final String dfa_9s = "\1\7\2\10\2\uffff\1\10\1\uffff\1\7\1\10\1\uffff";
    static final String dfa_10s = "\1\110\2\73\2\uffff\1\10\1\uffff\1\110\1\73\1\uffff";
    static final String dfa_11s = "\3\uffff\1\1\1\2\1\uffff\1\3\2\uffff\1\4";
    static final String dfa_12s = "\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\1\1\1\3\1\2\10\uffff\1\3\11\uffff\1\3\3\uffff\1\3\1\uffff\1\4\1\3\2\uffff\2\3\17\uffff\2\3\2\uffff\15\3",
            "\1\6\1\uffff\1\6\13\uffff\1\5\5\uffff\1\3\4\uffff\2\3\1\7\13\uffff\3\3\2\uffff\10\3",
            "\1\6\1\uffff\1\6\21\uffff\1\3\4\uffff\2\3\1\7\13\uffff\3\3\2\uffff\10\3",
            "",
            "",
            "\1\10",
            "",
            "\4\3\10\uffff\1\3\10\uffff\1\11\1\3\3\uffff\1\3\1\11\1\uffff\1\3\2\uffff\2\3\17\uffff\2\3\2\uffff\15\3",
            "\1\6\1\uffff\1\6\13\uffff\1\5\5\uffff\1\3\4\uffff\2\3\1\7\13\uffff\3\3\2\uffff\10\3",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1998:2: (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedArgument_2= ruleTypedArgument | this_TypedStarArgument_3= ruleTypedStarArgument )";
        }
    }
    static final String dfa_14s = "\17\uffff";
    static final String dfa_15s = "\15\uffff\1\11\1\uffff";
    static final String dfa_16s = "\1\56\1\10\1\60\1\26\1\57\1\10\1\uffff\1\10\2\uffff\3\26\1\4\1\26";
    static final String dfa_17s = "\1\56\1\12\3\61\1\12\1\uffff\1\10\2\uffff\2\60\1\61\1\10\1\60";
    static final String dfa_18s = "\6\uffff\1\2\1\uffff\1\1\1\3\5\uffff";
    static final String dfa_19s = "\17\uffff}>";
    static final String[] dfa_20s = {
            "\1\1",
            "\1\3\1\2\1\4",
            "\1\5\1\6",
            "\1\7\30\uffff\1\10\1\6\1\11",
            "\1\10\1\6\1\11",
            "\1\12\1\uffff\1\13",
            "",
            "\1\14",
            "",
            "",
            "\1\15\31\uffff\1\6",
            "\1\11\31\uffff\1\6",
            "\1\7\30\uffff\1\10\1\6\1\11",
            "\1\11\3\uffff\1\16",
            "\1\15\31\uffff\1\6"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2973:2: (this_ExactScopeDefinition_0= ruleExactScopeDefinition | this_BoundedScopeDefinition_1= ruleBoundedScopeDefinition | this_LowerBoundedScopeDefinition_2= ruleLowerBoundedScopeDefinition )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xF30C479220BC0782L,0x00000000000007FFL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xF300019220880780L,0x00000000000001FFL});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080500L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0500L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00F3800000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0400000800000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000019220080780L,0x00000000000001FFL});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000060L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xF300019E20880780L,0x00000000000001FFL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xF300019A20880780L,0x00000000000001FFL});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080040000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100080000500L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000001000000100L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200004000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000800000200L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000400000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000400002L});

}