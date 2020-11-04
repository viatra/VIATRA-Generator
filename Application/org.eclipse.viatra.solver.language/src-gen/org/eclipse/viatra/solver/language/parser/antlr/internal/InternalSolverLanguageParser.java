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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Containment", "Functional", "Abstract", "Contains", "Datatype", "Maximize", "Minimize", "Opposite", "Default", "Extends", "Problem", "Unknown", "Extern", "Import", "Object", "Refers", "Class", "Count", "Empty", "Error", "False", "Scope", "Else", "Enum", "Root", "Then", "True", "FullStopFullStopFullStop", "Inf", "Let", "ExclamationMarkEqualsSign", "HyphenMinusGreaterThanSign", "ColonHyphenMinus", "ColonColon", "ColonEqualsSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "EqualsSignGreaterThanSign", "GreaterThanSignEqualsSign", "As", "If", "In", "ExclamationMark", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "QuestionMark", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "LeftCurlyBracket", "VerticalLine", "RightCurlyBracket", "Tilde", "RULE_STRING", "RULE_QUOTED_ID", "RULE_SL_COMMENT", "RULE_TRANSITIVE_CLOSURE", "RULE_REFLEXIVE_TRANSITIVE_CLOSURE", "RULE_FULL_STOP", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Enum=27;
    public static final int Import=17;
    public static final int EqualsSignGreaterThanSign=41;
    public static final int True=30;
    public static final int Count=21;
    public static final int False=24;
    public static final int FullStopFullStopFullStop=31;
    public static final int LessThanSign=57;
    public static final int Datatype=8;
    public static final int LeftParenthesis=47;
    public static final int Unknown=15;
    public static final int RULE_REFLEXIVE_TRANSITIVE_CLOSURE=72;
    public static final int Then=29;
    public static final int Extends=13;
    public static final int RightSquareBracket=62;
    public static final int ExclamationMark=46;
    public static final int Opposite=11;
    public static final int GreaterThanSign=59;
    public static final int Root=28;
    public static final int RULE_ID=74;
    public static final int RULE_QUOTED_ID=69;
    public static final int RightParenthesis=48;
    public static final int ColonEqualsSign=38;
    public static final int GreaterThanSignEqualsSign=42;
    public static final int Functional=5;
    public static final int ColonColon=37;
    public static final int EqualsSignEqualsSign=40;
    public static final int VerticalLine=65;
    public static final int PlusSign=50;
    public static final int RULE_INT=75;
    public static final int Contains=7;
    public static final int RULE_ML_COMMENT=76;
    public static final int RULE_TRANSITIVE_CLOSURE=71;
    public static final int Problem=14;
    public static final int Object=18;
    public static final int Class=20;
    public static final int LeftSquareBracket=61;
    public static final int RULE_FULL_STOP=73;
    public static final int If=44;
    public static final int Refers=19;
    public static final int Inf=32;
    public static final int In=45;
    public static final int RULE_STRING=68;
    public static final int Extern=16;
    public static final int RULE_SL_COMMENT=70;
    public static final int Comma=51;
    public static final int EqualsSign=58;
    public static final int Empty=22;
    public static final int As=43;
    public static final int HyphenMinus=52;
    public static final int Maximize=9;
    public static final int LessThanSignEqualsSign=39;
    public static final int Solidus=54;
    public static final int Colon=55;
    public static final int RightCurlyBracket=66;
    public static final int EOF=-1;
    public static final int Asterisk=49;
    public static final int Containment=4;
    public static final int FullStop=53;
    public static final int RULE_WS=77;
    public static final int Abstract=6;
    public static final int Minimize=10;
    public static final int LeftCurlyBracket=64;
    public static final int Error=23;
    public static final int Tilde=67;
    public static final int RULE_ANY_OTHER=78;
    public static final int Default=12;
    public static final int ColonHyphenMinus=36;
    public static final int CircumflexAccent=63;
    public static final int Semicolon=56;
    public static final int Scope=25;
    public static final int QuestionMark=60;
    public static final int Else=26;
    public static final int Let=33;
    public static final int ExclamationMarkEqualsSign=34;
    public static final int HyphenMinusGreaterThanSign=35;

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
    // InternalSolverLanguageParser.g:65:1: ruleProblem returns [EObject current=null] : ( (otherlv_0= Problem ( (lv_name_1_0= ruleQualifiedName ) ) this_FULL_STOP_2= RULE_FULL_STOP )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_statements_4_0= ruleStatement ) )* ) ;
    public final EObject ruleProblem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_FULL_STOP_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:71:2: ( ( (otherlv_0= Problem ( (lv_name_1_0= ruleQualifiedName ) ) this_FULL_STOP_2= RULE_FULL_STOP )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_statements_4_0= ruleStatement ) )* ) )
            // InternalSolverLanguageParser.g:72:2: ( (otherlv_0= Problem ( (lv_name_1_0= ruleQualifiedName ) ) this_FULL_STOP_2= RULE_FULL_STOP )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_statements_4_0= ruleStatement ) )* )
            {
            // InternalSolverLanguageParser.g:72:2: ( (otherlv_0= Problem ( (lv_name_1_0= ruleQualifiedName ) ) this_FULL_STOP_2= RULE_FULL_STOP )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_statements_4_0= ruleStatement ) )* )
            // InternalSolverLanguageParser.g:73:3: (otherlv_0= Problem ( (lv_name_1_0= ruleQualifiedName ) ) this_FULL_STOP_2= RULE_FULL_STOP )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_statements_4_0= ruleStatement ) )*
            {
            // InternalSolverLanguageParser.g:73:3: (otherlv_0= Problem ( (lv_name_1_0= ruleQualifiedName ) ) this_FULL_STOP_2= RULE_FULL_STOP )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Problem) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSolverLanguageParser.g:74:4: otherlv_0= Problem ( (lv_name_1_0= ruleQualifiedName ) ) this_FULL_STOP_2= RULE_FULL_STOP
                    {
                    otherlv_0=(Token)match(input,Problem,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getProblemAccess().getProblemKeyword_0_0());
                    			
                    // InternalSolverLanguageParser.g:78:4: ( (lv_name_1_0= ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:79:5: (lv_name_1_0= ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:79:5: (lv_name_1_0= ruleQualifiedName )
                    // InternalSolverLanguageParser.g:80:6: lv_name_1_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getProblemAccess().getNameQualifiedNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProblemRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_FULL_STOP_2=(Token)match(input,RULE_FULL_STOP,FOLLOW_5); 

                    				newLeafNode(this_FULL_STOP_2, grammarAccess.getProblemAccess().getFULL_STOPTerminalRuleCall_0_2());
                    			

                    }
                    break;

            }

            // InternalSolverLanguageParser.g:102:3: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Import) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:103:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalSolverLanguageParser.g:103:4: (lv_imports_3_0= ruleImport )
            	    // InternalSolverLanguageParser.g:104:5: lv_imports_3_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getProblemAccess().getImportsImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProblemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_3_0,
            	    						"org.eclipse.viatra.solver.language.SolverLanguage.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSolverLanguageParser.g:121:3: ( (lv_statements_4_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=Containment && LA3_0<=Abstract)||(LA3_0>=Maximize && LA3_0<=Minimize)||LA3_0==Default||(LA3_0>=Unknown && LA3_0<=Extern)||LA3_0==Object||(LA3_0>=Class && LA3_0<=Scope)||(LA3_0>=Enum && LA3_0<=Root)||LA3_0==True||(LA3_0>=Inf && LA3_0<=Let)||LA3_0==If||(LA3_0>=ExclamationMark && LA3_0<=LeftParenthesis)||LA3_0==PlusSign||LA3_0==HyphenMinus||(LA3_0>=QuestionMark && LA3_0<=LeftSquareBracket)||(LA3_0>=Tilde && LA3_0<=RULE_QUOTED_ID)||(LA3_0>=RULE_ID && LA3_0<=RULE_INT)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:122:4: (lv_statements_4_0= ruleStatement )
            	    {
            	    // InternalSolverLanguageParser.g:122:4: (lv_statements_4_0= ruleStatement )
            	    // InternalSolverLanguageParser.g:123:5: lv_statements_4_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getProblemAccess().getStatementsStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_statements_4_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProblemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_4_0,
            	    						"org.eclipse.viatra.solver.language.SolverLanguage.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalSolverLanguageParser.g:144:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalSolverLanguageParser.g:144:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalSolverLanguageParser.g:145:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalSolverLanguageParser.g:151:1: ruleStatement returns [EObject current=null] : (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPredicateDefintion_2= ruleUnnamedErrorPredicateDefintion | this_DefaultAssertion_3= ruleDefaultAssertion | this_FunctionDefinition_4= ruleFunctionDefinition | this_Attribute_5= ruleAttribute | this_ExternDeclaration_6= ruleExternDeclaration | this_ScopeDeclaration_7= ruleScopeDeclaration | this_ObjectiveDeclaration_8= ruleObjectiveDeclaration | this_ClassDeclaration_9= ruleClassDeclaration | this_EnumDeclaration_10= ruleEnumDeclaration ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AssertionOrDefinition_0 = null;

        EObject this_PredicateDefinition_1 = null;

        EObject this_UnnamedErrorPredicateDefintion_2 = null;

        EObject this_DefaultAssertion_3 = null;

        EObject this_FunctionDefinition_4 = null;

        EObject this_Attribute_5 = null;

        EObject this_ExternDeclaration_6 = null;

        EObject this_ScopeDeclaration_7 = null;

        EObject this_ObjectiveDeclaration_8 = null;

        EObject this_ClassDeclaration_9 = null;

        EObject this_EnumDeclaration_10 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:157:2: ( (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPredicateDefintion_2= ruleUnnamedErrorPredicateDefintion | this_DefaultAssertion_3= ruleDefaultAssertion | this_FunctionDefinition_4= ruleFunctionDefinition | this_Attribute_5= ruleAttribute | this_ExternDeclaration_6= ruleExternDeclaration | this_ScopeDeclaration_7= ruleScopeDeclaration | this_ObjectiveDeclaration_8= ruleObjectiveDeclaration | this_ClassDeclaration_9= ruleClassDeclaration | this_EnumDeclaration_10= ruleEnumDeclaration ) )
            // InternalSolverLanguageParser.g:158:2: (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPredicateDefintion_2= ruleUnnamedErrorPredicateDefintion | this_DefaultAssertion_3= ruleDefaultAssertion | this_FunctionDefinition_4= ruleFunctionDefinition | this_Attribute_5= ruleAttribute | this_ExternDeclaration_6= ruleExternDeclaration | this_ScopeDeclaration_7= ruleScopeDeclaration | this_ObjectiveDeclaration_8= ruleObjectiveDeclaration | this_ClassDeclaration_9= ruleClassDeclaration | this_EnumDeclaration_10= ruleEnumDeclaration )
            {
            // InternalSolverLanguageParser.g:158:2: (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPredicateDefintion_2= ruleUnnamedErrorPredicateDefintion | this_DefaultAssertion_3= ruleDefaultAssertion | this_FunctionDefinition_4= ruleFunctionDefinition | this_Attribute_5= ruleAttribute | this_ExternDeclaration_6= ruleExternDeclaration | this_ScopeDeclaration_7= ruleScopeDeclaration | this_ObjectiveDeclaration_8= ruleObjectiveDeclaration | this_ClassDeclaration_9= ruleClassDeclaration | this_EnumDeclaration_10= ruleEnumDeclaration )
            int alt4=11;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSolverLanguageParser.g:159:3: this_AssertionOrDefinition_0= ruleAssertionOrDefinition
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssertionOrDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssertionOrDefinition_0=ruleAssertionOrDefinition();

                    state._fsp--;


                    			current = this_AssertionOrDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:168:3: this_PredicateDefinition_1= rulePredicateDefinition
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
                    // InternalSolverLanguageParser.g:177:3: this_UnnamedErrorPredicateDefintion_2= ruleUnnamedErrorPredicateDefintion
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getUnnamedErrorPredicateDefintionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnnamedErrorPredicateDefintion_2=ruleUnnamedErrorPredicateDefintion();

                    state._fsp--;


                    			current = this_UnnamedErrorPredicateDefintion_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:186:3: this_DefaultAssertion_3= ruleDefaultAssertion
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDefaultAssertionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefaultAssertion_3=ruleDefaultAssertion();

                    state._fsp--;


                    			current = this_DefaultAssertion_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSolverLanguageParser.g:195:3: this_FunctionDefinition_4= ruleFunctionDefinition
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFunctionDefinitionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionDefinition_4=ruleFunctionDefinition();

                    state._fsp--;


                    			current = this_FunctionDefinition_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSolverLanguageParser.g:204:3: this_Attribute_5= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAttributeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_5=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSolverLanguageParser.g:213:3: this_ExternDeclaration_6= ruleExternDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getExternDeclarationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternDeclaration_6=ruleExternDeclaration();

                    state._fsp--;


                    			current = this_ExternDeclaration_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSolverLanguageParser.g:222:3: this_ScopeDeclaration_7= ruleScopeDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getScopeDeclarationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScopeDeclaration_7=ruleScopeDeclaration();

                    state._fsp--;


                    			current = this_ScopeDeclaration_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSolverLanguageParser.g:231:3: this_ObjectiveDeclaration_8= ruleObjectiveDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getObjectiveDeclarationParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectiveDeclaration_8=ruleObjectiveDeclaration();

                    state._fsp--;


                    			current = this_ObjectiveDeclaration_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSolverLanguageParser.g:240:3: this_ClassDeclaration_9= ruleClassDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getClassDeclarationParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDeclaration_9=ruleClassDeclaration();

                    state._fsp--;


                    			current = this_ClassDeclaration_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalSolverLanguageParser.g:249:3: this_EnumDeclaration_10= ruleEnumDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getEnumDeclarationParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumDeclaration_10=ruleEnumDeclaration();

                    state._fsp--;


                    			current = this_EnumDeclaration_10;
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


    // $ANTLR start "entryRuleImport"
    // InternalSolverLanguageParser.g:261:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSolverLanguageParser.g:261:47: (iv_ruleImport= ruleImport EOF )
            // InternalSolverLanguageParser.g:262:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSolverLanguageParser.g:268:1: ruleImport returns [EObject current=null] : (this_UriImport_0= ruleUriImport | this_NamespaceImport_1= ruleNamespaceImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_UriImport_0 = null;

        EObject this_NamespaceImport_1 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:274:2: ( (this_UriImport_0= ruleUriImport | this_NamespaceImport_1= ruleNamespaceImport ) )
            // InternalSolverLanguageParser.g:275:2: (this_UriImport_0= ruleUriImport | this_NamespaceImport_1= ruleNamespaceImport )
            {
            // InternalSolverLanguageParser.g:275:2: (this_UriImport_0= ruleUriImport | this_NamespaceImport_1= ruleNamespaceImport )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Import) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_STRING) ) {
                    alt5=1;
                }
                else if ( (LA5_1==Object||LA5_1==RULE_QUOTED_ID||LA5_1==RULE_ID) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSolverLanguageParser.g:276:3: this_UriImport_0= ruleUriImport
                    {

                    			newCompositeNode(grammarAccess.getImportAccess().getUriImportParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UriImport_0=ruleUriImport();

                    state._fsp--;


                    			current = this_UriImport_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:285:3: this_NamespaceImport_1= ruleNamespaceImport
                    {

                    			newCompositeNode(grammarAccess.getImportAccess().getNamespaceImportParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamespaceImport_1=ruleNamespaceImport();

                    state._fsp--;


                    			current = this_NamespaceImport_1;
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleUriImport"
    // InternalSolverLanguageParser.g:297:1: entryRuleUriImport returns [EObject current=null] : iv_ruleUriImport= ruleUriImport EOF ;
    public final EObject entryRuleUriImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUriImport = null;


        try {
            // InternalSolverLanguageParser.g:297:50: (iv_ruleUriImport= ruleUriImport EOF )
            // InternalSolverLanguageParser.g:298:2: iv_ruleUriImport= ruleUriImport EOF
            {
             newCompositeNode(grammarAccess.getUriImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUriImport=ruleUriImport();

            state._fsp--;

             current =iv_ruleUriImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUriImport"


    // $ANTLR start "ruleUriImport"
    // InternalSolverLanguageParser.g:304:1: ruleUriImport returns [EObject current=null] : (otherlv_0= Import ( (lv_uri_1_0= RULE_STRING ) ) (otherlv_2= As ( (lv_alias_3_0= ruleQualifiedName ) ) ) this_FULL_STOP_4= RULE_FULL_STOP ) ;
    public final EObject ruleUriImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_uri_1_0=null;
        Token otherlv_2=null;
        Token this_FULL_STOP_4=null;
        AntlrDatatypeRuleToken lv_alias_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:310:2: ( (otherlv_0= Import ( (lv_uri_1_0= RULE_STRING ) ) (otherlv_2= As ( (lv_alias_3_0= ruleQualifiedName ) ) ) this_FULL_STOP_4= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:311:2: (otherlv_0= Import ( (lv_uri_1_0= RULE_STRING ) ) (otherlv_2= As ( (lv_alias_3_0= ruleQualifiedName ) ) ) this_FULL_STOP_4= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:311:2: (otherlv_0= Import ( (lv_uri_1_0= RULE_STRING ) ) (otherlv_2= As ( (lv_alias_3_0= ruleQualifiedName ) ) ) this_FULL_STOP_4= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:312:3: otherlv_0= Import ( (lv_uri_1_0= RULE_STRING ) ) (otherlv_2= As ( (lv_alias_3_0= ruleQualifiedName ) ) ) this_FULL_STOP_4= RULE_FULL_STOP
            {
            otherlv_0=(Token)match(input,Import,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getUriImportAccess().getImportKeyword_0());
            		
            // InternalSolverLanguageParser.g:316:3: ( (lv_uri_1_0= RULE_STRING ) )
            // InternalSolverLanguageParser.g:317:4: (lv_uri_1_0= RULE_STRING )
            {
            // InternalSolverLanguageParser.g:317:4: (lv_uri_1_0= RULE_STRING )
            // InternalSolverLanguageParser.g:318:5: lv_uri_1_0= RULE_STRING
            {
            lv_uri_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_uri_1_0, grammarAccess.getUriImportAccess().getUriSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUriImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uri",
            						lv_uri_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.STRING");
            				

            }


            }

            // InternalSolverLanguageParser.g:334:3: (otherlv_2= As ( (lv_alias_3_0= ruleQualifiedName ) ) )
            // InternalSolverLanguageParser.g:335:4: otherlv_2= As ( (lv_alias_3_0= ruleQualifiedName ) )
            {
            otherlv_2=(Token)match(input,As,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getUriImportAccess().getAsKeyword_2_0());
            			
            // InternalSolverLanguageParser.g:339:4: ( (lv_alias_3_0= ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:340:5: (lv_alias_3_0= ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:340:5: (lv_alias_3_0= ruleQualifiedName )
            // InternalSolverLanguageParser.g:341:6: lv_alias_3_0= ruleQualifiedName
            {

            						newCompositeNode(grammarAccess.getUriImportAccess().getAliasQualifiedNameParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_4);
            lv_alias_3_0=ruleQualifiedName();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getUriImportRule());
            						}
            						set(
            							current,
            							"alias",
            							lv_alias_3_0,
            							"org.eclipse.viatra.solver.language.SolverLanguage.QualifiedName");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_FULL_STOP_4=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_4, grammarAccess.getUriImportAccess().getFULL_STOPTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUriImport"


    // $ANTLR start "entryRuleNamespaceImport"
    // InternalSolverLanguageParser.g:367:1: entryRuleNamespaceImport returns [EObject current=null] : iv_ruleNamespaceImport= ruleNamespaceImport EOF ;
    public final EObject entryRuleNamespaceImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceImport = null;


        try {
            // InternalSolverLanguageParser.g:367:56: (iv_ruleNamespaceImport= ruleNamespaceImport EOF )
            // InternalSolverLanguageParser.g:368:2: iv_ruleNamespaceImport= ruleNamespaceImport EOF
            {
             newCompositeNode(grammarAccess.getNamespaceImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespaceImport=ruleNamespaceImport();

            state._fsp--;

             current =iv_ruleNamespaceImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespaceImport"


    // $ANTLR start "ruleNamespaceImport"
    // InternalSolverLanguageParser.g:374:1: ruleNamespaceImport returns [EObject current=null] : (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) (otherlv_2= As ( (lv_alias_3_0= ruleQualifiedName ) ) ) this_FULL_STOP_4= RULE_FULL_STOP ) ;
    public final EObject ruleNamespaceImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_FULL_STOP_4=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_alias_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:380:2: ( (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) (otherlv_2= As ( (lv_alias_3_0= ruleQualifiedName ) ) ) this_FULL_STOP_4= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:381:2: (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) (otherlv_2= As ( (lv_alias_3_0= ruleQualifiedName ) ) ) this_FULL_STOP_4= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:381:2: (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) (otherlv_2= As ( (lv_alias_3_0= ruleQualifiedName ) ) ) this_FULL_STOP_4= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:382:3: otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedName ) ) (otherlv_2= As ( (lv_alias_3_0= ruleQualifiedName ) ) ) this_FULL_STOP_4= RULE_FULL_STOP
            {
            otherlv_0=(Token)match(input,Import,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNamespaceImportAccess().getImportKeyword_0());
            		
            // InternalSolverLanguageParser.g:386:3: ( (lv_importedNamespace_1_0= ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:387:4: (lv_importedNamespace_1_0= ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:387:4: (lv_importedNamespace_1_0= ruleQualifiedName )
            // InternalSolverLanguageParser.g:388:5: lv_importedNamespace_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getNamespaceImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_importedNamespace_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamespaceImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:405:3: (otherlv_2= As ( (lv_alias_3_0= ruleQualifiedName ) ) )
            // InternalSolverLanguageParser.g:406:4: otherlv_2= As ( (lv_alias_3_0= ruleQualifiedName ) )
            {
            otherlv_2=(Token)match(input,As,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getNamespaceImportAccess().getAsKeyword_2_0());
            			
            // InternalSolverLanguageParser.g:410:4: ( (lv_alias_3_0= ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:411:5: (lv_alias_3_0= ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:411:5: (lv_alias_3_0= ruleQualifiedName )
            // InternalSolverLanguageParser.g:412:6: lv_alias_3_0= ruleQualifiedName
            {

            						newCompositeNode(grammarAccess.getNamespaceImportAccess().getAliasQualifiedNameParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_4);
            lv_alias_3_0=ruleQualifiedName();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getNamespaceImportRule());
            						}
            						set(
            							current,
            							"alias",
            							lv_alias_3_0,
            							"org.eclipse.viatra.solver.language.SolverLanguage.QualifiedName");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_FULL_STOP_4=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_4, grammarAccess.getNamespaceImportAccess().getFULL_STOPTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespaceImport"


    // $ANTLR start "entryRuleAssertionOrDefinition"
    // InternalSolverLanguageParser.g:438:1: entryRuleAssertionOrDefinition returns [EObject current=null] : iv_ruleAssertionOrDefinition= ruleAssertionOrDefinition EOF ;
    public final EObject entryRuleAssertionOrDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionOrDefinition = null;


        try {
            // InternalSolverLanguageParser.g:438:62: (iv_ruleAssertionOrDefinition= ruleAssertionOrDefinition EOF )
            // InternalSolverLanguageParser.g:439:2: iv_ruleAssertionOrDefinition= ruleAssertionOrDefinition EOF
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
    // InternalSolverLanguageParser.g:445:1: ruleAssertionOrDefinition returns [EObject current=null] : (this_Expression_0= ruleExpression ( ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= ColonEqualsSign ( (lv_body_9_0= ruleExpression ) ) ) ) this_FULL_STOP_10= RULE_FULL_STOP ) ;
    public final EObject ruleAssertionOrDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token this_FULL_STOP_10=null;
        EObject this_Expression_0 = null;

        EObject lv_range_3_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:451:2: ( (this_Expression_0= ruleExpression ( ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= ColonEqualsSign ( (lv_body_9_0= ruleExpression ) ) ) ) this_FULL_STOP_10= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:452:2: (this_Expression_0= ruleExpression ( ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= ColonEqualsSign ( (lv_body_9_0= ruleExpression ) ) ) ) this_FULL_STOP_10= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:452:2: (this_Expression_0= ruleExpression ( ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= ColonEqualsSign ( (lv_body_9_0= ruleExpression ) ) ) ) this_FULL_STOP_10= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:453:3: this_Expression_0= ruleExpression ( ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= ColonEqualsSign ( (lv_body_9_0= ruleExpression ) ) ) ) this_FULL_STOP_10= RULE_FULL_STOP
            {

            			newCompositeNode(grammarAccess.getAssertionOrDefinitionAccess().getExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Expression_0=ruleExpression();

            state._fsp--;


            			current = this_Expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:461:3: ( ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? ) | ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) ) | ( () otherlv_8= ColonEqualsSign ( (lv_body_9_0= ruleExpression ) ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case Colon:
            case RULE_FULL_STOP:
                {
                alt7=1;
                }
                break;
            case ColonHyphenMinus:
                {
                alt7=2;
                }
                break;
            case ColonEqualsSign:
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
                    // InternalSolverLanguageParser.g:462:4: ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? )
                    {
                    // InternalSolverLanguageParser.g:462:4: ( () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? )
                    // InternalSolverLanguageParser.g:463:5: () (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )?
                    {
                    // InternalSolverLanguageParser.g:463:5: ()
                    // InternalSolverLanguageParser.g:464:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getAssertionOrDefinitionAccess().getAssertionExpressionAction_1_0_0(),
                    							current);
                    					

                    }

                    // InternalSolverLanguageParser.g:470:5: (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==Colon) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalSolverLanguageParser.g:471:6: otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) )
                            {
                            otherlv_2=(Token)match(input,Colon,FOLLOW_10); 

                            						newLeafNode(otherlv_2, grammarAccess.getAssertionOrDefinitionAccess().getColonKeyword_1_0_1_0());
                            					
                            // InternalSolverLanguageParser.g:475:6: ( (lv_range_3_0= ruleExpression ) )
                            // InternalSolverLanguageParser.g:476:7: (lv_range_3_0= ruleExpression )
                            {
                            // InternalSolverLanguageParser.g:476:7: (lv_range_3_0= ruleExpression )
                            // InternalSolverLanguageParser.g:477:8: lv_range_3_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getAssertionOrDefinitionAccess().getRangeExpressionParserRuleCall_1_0_1_1_0());
                            							
                            pushFollow(FOLLOW_4);
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
                    // InternalSolverLanguageParser.g:497:4: ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) )
                    {
                    // InternalSolverLanguageParser.g:497:4: ( () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) )
                    // InternalSolverLanguageParser.g:498:5: () otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) )
                    {
                    // InternalSolverLanguageParser.g:498:5: ()
                    // InternalSolverLanguageParser.g:499:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getAssertionOrDefinitionAccess().getPredicateDefinitionHeadAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_5=(Token)match(input,ColonHyphenMinus,FOLLOW_10); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssertionOrDefinitionAccess().getColonHyphenMinusKeyword_1_1_1());
                    				
                    // InternalSolverLanguageParser.g:509:5: ( (lv_body_6_0= ruleExpression ) )
                    // InternalSolverLanguageParser.g:510:6: (lv_body_6_0= ruleExpression )
                    {
                    // InternalSolverLanguageParser.g:510:6: (lv_body_6_0= ruleExpression )
                    // InternalSolverLanguageParser.g:511:7: lv_body_6_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getAssertionOrDefinitionAccess().getBodyExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_4);
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
                    // InternalSolverLanguageParser.g:530:4: ( () otherlv_8= ColonEqualsSign ( (lv_body_9_0= ruleExpression ) ) )
                    {
                    // InternalSolverLanguageParser.g:530:4: ( () otherlv_8= ColonEqualsSign ( (lv_body_9_0= ruleExpression ) ) )
                    // InternalSolverLanguageParser.g:531:5: () otherlv_8= ColonEqualsSign ( (lv_body_9_0= ruleExpression ) )
                    {
                    // InternalSolverLanguageParser.g:531:5: ()
                    // InternalSolverLanguageParser.g:532:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getAssertionOrDefinitionAccess().getFunctionDefinitionHeadAction_1_2_0(),
                    							current);
                    					

                    }

                    otherlv_8=(Token)match(input,ColonEqualsSign,FOLLOW_10); 

                    					newLeafNode(otherlv_8, grammarAccess.getAssertionOrDefinitionAccess().getColonEqualsSignKeyword_1_2_1());
                    				
                    // InternalSolverLanguageParser.g:542:5: ( (lv_body_9_0= ruleExpression ) )
                    // InternalSolverLanguageParser.g:543:6: (lv_body_9_0= ruleExpression )
                    {
                    // InternalSolverLanguageParser.g:543:6: (lv_body_9_0= ruleExpression )
                    // InternalSolverLanguageParser.g:544:7: lv_body_9_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getAssertionOrDefinitionAccess().getBodyExpressionParserRuleCall_1_2_2_0());
                    						
                    pushFollow(FOLLOW_4);
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

            this_FULL_STOP_10=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_10, grammarAccess.getAssertionOrDefinitionAccess().getFULL_STOPTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

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
    // InternalSolverLanguageParser.g:571:1: entryRulePredicateDefinition returns [EObject current=null] : iv_rulePredicateDefinition= rulePredicateDefinition EOF ;
    public final EObject entryRulePredicateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateDefinition = null;


        try {
            // InternalSolverLanguageParser.g:571:60: (iv_rulePredicateDefinition= rulePredicateDefinition EOF )
            // InternalSolverLanguageParser.g:572:2: iv_rulePredicateDefinition= rulePredicateDefinition EOF
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
    // InternalSolverLanguageParser.g:578:1: rulePredicateDefinition returns [EObject current=null] : ( ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) this_FULL_STOP_7= RULE_FULL_STOP ) ;
    public final EObject rulePredicateDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_functional_0_0=null;
        Token lv_error_1_0=null;
        Token lv_error_2_0=null;
        Token lv_functional_3_0=null;
        Token otherlv_5=null;
        Token this_FULL_STOP_7=null;
        EObject lv_head_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:584:2: ( ( ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) this_FULL_STOP_7= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:585:2: ( ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) this_FULL_STOP_7= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:585:2: ( ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) this_FULL_STOP_7= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:586:3: ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) ) ( (lv_head_4_0= ruleCall ) ) otherlv_5= ColonHyphenMinus ( (lv_body_6_0= ruleExpression ) ) this_FULL_STOP_7= RULE_FULL_STOP
            {
            // InternalSolverLanguageParser.g:586:3: ( ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? ) | ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Functional) ) {
                alt10=1;
            }
            else if ( (LA10_0==Error) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSolverLanguageParser.g:587:4: ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? )
                    {
                    // InternalSolverLanguageParser.g:587:4: ( ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )? )
                    // InternalSolverLanguageParser.g:588:5: ( (lv_functional_0_0= Functional ) ) ( (lv_error_1_0= Error ) )?
                    {
                    // InternalSolverLanguageParser.g:588:5: ( (lv_functional_0_0= Functional ) )
                    // InternalSolverLanguageParser.g:589:6: (lv_functional_0_0= Functional )
                    {
                    // InternalSolverLanguageParser.g:589:6: (lv_functional_0_0= Functional )
                    // InternalSolverLanguageParser.g:590:7: lv_functional_0_0= Functional
                    {
                    lv_functional_0_0=(Token)match(input,Functional,FOLLOW_11); 

                    							newLeafNode(lv_functional_0_0, grammarAccess.getPredicateDefinitionAccess().getFunctionalFunctionalKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                    							}
                    							setWithLastConsumed(current, "functional", true, "functional");
                    						

                    }


                    }

                    // InternalSolverLanguageParser.g:602:5: ( (lv_error_1_0= Error ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==Error) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSolverLanguageParser.g:603:6: (lv_error_1_0= Error )
                            {
                            // InternalSolverLanguageParser.g:603:6: (lv_error_1_0= Error )
                            // InternalSolverLanguageParser.g:604:7: lv_error_1_0= Error
                            {
                            lv_error_1_0=(Token)match(input,Error,FOLLOW_12); 

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
                    // InternalSolverLanguageParser.g:618:4: ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? )
                    {
                    // InternalSolverLanguageParser.g:618:4: ( ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )? )
                    // InternalSolverLanguageParser.g:619:5: ( (lv_error_2_0= Error ) ) ( (lv_functional_3_0= Functional ) )?
                    {
                    // InternalSolverLanguageParser.g:619:5: ( (lv_error_2_0= Error ) )
                    // InternalSolverLanguageParser.g:620:6: (lv_error_2_0= Error )
                    {
                    // InternalSolverLanguageParser.g:620:6: (lv_error_2_0= Error )
                    // InternalSolverLanguageParser.g:621:7: lv_error_2_0= Error
                    {
                    lv_error_2_0=(Token)match(input,Error,FOLLOW_13); 

                    							newLeafNode(lv_error_2_0, grammarAccess.getPredicateDefinitionAccess().getErrorErrorKeyword_0_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPredicateDefinitionRule());
                    							}
                    							setWithLastConsumed(current, "error", true, "error");
                    						

                    }


                    }

                    // InternalSolverLanguageParser.g:633:5: ( (lv_functional_3_0= Functional ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==Functional) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSolverLanguageParser.g:634:6: (lv_functional_3_0= Functional )
                            {
                            // InternalSolverLanguageParser.g:634:6: (lv_functional_3_0= Functional )
                            // InternalSolverLanguageParser.g:635:7: lv_functional_3_0= Functional
                            {
                            lv_functional_3_0=(Token)match(input,Functional,FOLLOW_12); 

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

            // InternalSolverLanguageParser.g:649:3: ( (lv_head_4_0= ruleCall ) )
            // InternalSolverLanguageParser.g:650:4: (lv_head_4_0= ruleCall )
            {
            // InternalSolverLanguageParser.g:650:4: (lv_head_4_0= ruleCall )
            // InternalSolverLanguageParser.g:651:5: lv_head_4_0= ruleCall
            {

            					newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getHeadCallParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_5=(Token)match(input,ColonHyphenMinus,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getPredicateDefinitionAccess().getColonHyphenMinusKeyword_2());
            		
            // InternalSolverLanguageParser.g:672:3: ( (lv_body_6_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:673:4: (lv_body_6_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:673:4: (lv_body_6_0= ruleExpression )
            // InternalSolverLanguageParser.g:674:5: lv_body_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPredicateDefinitionAccess().getBodyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
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

            this_FULL_STOP_7=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_7, grammarAccess.getPredicateDefinitionAccess().getFULL_STOPTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleUnnamedErrorPredicateDefintion"
    // InternalSolverLanguageParser.g:699:1: entryRuleUnnamedErrorPredicateDefintion returns [EObject current=null] : iv_ruleUnnamedErrorPredicateDefintion= ruleUnnamedErrorPredicateDefintion EOF ;
    public final EObject entryRuleUnnamedErrorPredicateDefintion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedErrorPredicateDefintion = null;


        try {
            // InternalSolverLanguageParser.g:699:71: (iv_ruleUnnamedErrorPredicateDefintion= ruleUnnamedErrorPredicateDefintion EOF )
            // InternalSolverLanguageParser.g:700:2: iv_ruleUnnamedErrorPredicateDefintion= ruleUnnamedErrorPredicateDefintion EOF
            {
             newCompositeNode(grammarAccess.getUnnamedErrorPredicateDefintionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnnamedErrorPredicateDefintion=ruleUnnamedErrorPredicateDefintion();

            state._fsp--;

             current =iv_ruleUnnamedErrorPredicateDefintion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnnamedErrorPredicateDefintion"


    // $ANTLR start "ruleUnnamedErrorPredicateDefintion"
    // InternalSolverLanguageParser.g:706:1: ruleUnnamedErrorPredicateDefintion returns [EObject current=null] : (otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) ) this_FULL_STOP_4= RULE_FULL_STOP ) ;
    public final EObject ruleUnnamedErrorPredicateDefintion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_FULL_STOP_4=null;
        EObject lv_argumentList_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:712:2: ( (otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) ) this_FULL_STOP_4= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:713:2: (otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) ) this_FULL_STOP_4= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:713:2: (otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) ) this_FULL_STOP_4= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:714:3: otherlv_0= Error ( (lv_argumentList_1_0= ruleArgumentList ) ) otherlv_2= ColonHyphenMinus ( (lv_body_3_0= ruleExpression ) ) this_FULL_STOP_4= RULE_FULL_STOP
            {
            otherlv_0=(Token)match(input,Error,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getUnnamedErrorPredicateDefintionAccess().getErrorKeyword_0());
            		
            // InternalSolverLanguageParser.g:718:3: ( (lv_argumentList_1_0= ruleArgumentList ) )
            // InternalSolverLanguageParser.g:719:4: (lv_argumentList_1_0= ruleArgumentList )
            {
            // InternalSolverLanguageParser.g:719:4: (lv_argumentList_1_0= ruleArgumentList )
            // InternalSolverLanguageParser.g:720:5: lv_argumentList_1_0= ruleArgumentList
            {

            					newCompositeNode(grammarAccess.getUnnamedErrorPredicateDefintionAccess().getArgumentListArgumentListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_argumentList_1_0=ruleArgumentList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnnamedErrorPredicateDefintionRule());
            					}
            					set(
            						current,
            						"argumentList",
            						lv_argumentList_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ArgumentList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,ColonHyphenMinus,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getUnnamedErrorPredicateDefintionAccess().getColonHyphenMinusKeyword_2());
            		
            // InternalSolverLanguageParser.g:741:3: ( (lv_body_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:742:4: (lv_body_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:742:4: (lv_body_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:743:5: lv_body_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getUnnamedErrorPredicateDefintionAccess().getBodyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_body_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnnamedErrorPredicateDefintionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_FULL_STOP_4=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_4, grammarAccess.getUnnamedErrorPredicateDefintionAccess().getFULL_STOPTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnnamedErrorPredicateDefintion"


    // $ANTLR start "entryRuleDefaultAssertion"
    // InternalSolverLanguageParser.g:768:1: entryRuleDefaultAssertion returns [EObject current=null] : iv_ruleDefaultAssertion= ruleDefaultAssertion EOF ;
    public final EObject entryRuleDefaultAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultAssertion = null;


        try {
            // InternalSolverLanguageParser.g:768:57: (iv_ruleDefaultAssertion= ruleDefaultAssertion EOF )
            // InternalSolverLanguageParser.g:769:2: iv_ruleDefaultAssertion= ruleDefaultAssertion EOF
            {
             newCompositeNode(grammarAccess.getDefaultAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultAssertion=ruleDefaultAssertion();

            state._fsp--;

             current =iv_ruleDefaultAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultAssertion"


    // $ANTLR start "ruleDefaultAssertion"
    // InternalSolverLanguageParser.g:775:1: ruleDefaultAssertion returns [EObject current=null] : (otherlv_0= Default ( (lv_expression_1_0= ruleCall ) ) (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? this_FULL_STOP_4= RULE_FULL_STOP ) ;
    public final EObject ruleDefaultAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_FULL_STOP_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_range_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:781:2: ( (otherlv_0= Default ( (lv_expression_1_0= ruleCall ) ) (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? this_FULL_STOP_4= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:782:2: (otherlv_0= Default ( (lv_expression_1_0= ruleCall ) ) (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? this_FULL_STOP_4= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:782:2: (otherlv_0= Default ( (lv_expression_1_0= ruleCall ) ) (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? this_FULL_STOP_4= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:783:3: otherlv_0= Default ( (lv_expression_1_0= ruleCall ) ) (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )? this_FULL_STOP_4= RULE_FULL_STOP
            {
            otherlv_0=(Token)match(input,Default,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultAssertionAccess().getDefaultKeyword_0());
            		
            // InternalSolverLanguageParser.g:787:3: ( (lv_expression_1_0= ruleCall ) )
            // InternalSolverLanguageParser.g:788:4: (lv_expression_1_0= ruleCall )
            {
            // InternalSolverLanguageParser.g:788:4: (lv_expression_1_0= ruleCall )
            // InternalSolverLanguageParser.g:789:5: lv_expression_1_0= ruleCall
            {

            					newCompositeNode(grammarAccess.getDefaultAssertionAccess().getExpressionCallParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_expression_1_0=ruleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefaultAssertionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Call");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:806:3: (otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Colon) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSolverLanguageParser.g:807:4: otherlv_2= Colon ( (lv_range_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,Colon,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefaultAssertionAccess().getColonKeyword_2_0());
                    			
                    // InternalSolverLanguageParser.g:811:4: ( (lv_range_3_0= ruleExpression ) )
                    // InternalSolverLanguageParser.g:812:5: (lv_range_3_0= ruleExpression )
                    {
                    // InternalSolverLanguageParser.g:812:5: (lv_range_3_0= ruleExpression )
                    // InternalSolverLanguageParser.g:813:6: lv_range_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getDefaultAssertionAccess().getRangeExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_range_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefaultAssertionRule());
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

            this_FULL_STOP_4=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_4, grammarAccess.getDefaultAssertionAccess().getFULL_STOPTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultAssertion"


    // $ANTLR start "entryRuleFunctionDefinition"
    // InternalSolverLanguageParser.g:839:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // InternalSolverLanguageParser.g:839:59: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // InternalSolverLanguageParser.g:840:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDefinition=ruleFunctionDefinition();

            state._fsp--;

             current =iv_ruleFunctionDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDefinition"


    // $ANTLR start "ruleFunctionDefinition"
    // InternalSolverLanguageParser.g:846:1: ruleFunctionDefinition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_head_1_0= ruleCall ) ) otherlv_2= ColonEqualsSign ( (lv_body_3_0= ruleExpression ) ) this_FULL_STOP_4= RULE_FULL_STOP ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_FULL_STOP_4=null;
        EObject lv_head_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:852:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_head_1_0= ruleCall ) ) otherlv_2= ColonEqualsSign ( (lv_body_3_0= ruleExpression ) ) this_FULL_STOP_4= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:853:2: ( ( ( ruleQualifiedName ) ) ( (lv_head_1_0= ruleCall ) ) otherlv_2= ColonEqualsSign ( (lv_body_3_0= ruleExpression ) ) this_FULL_STOP_4= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:853:2: ( ( ( ruleQualifiedName ) ) ( (lv_head_1_0= ruleCall ) ) otherlv_2= ColonEqualsSign ( (lv_body_3_0= ruleExpression ) ) this_FULL_STOP_4= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:854:3: ( ( ruleQualifiedName ) ) ( (lv_head_1_0= ruleCall ) ) otherlv_2= ColonEqualsSign ( (lv_body_3_0= ruleExpression ) ) this_FULL_STOP_4= RULE_FULL_STOP
            {
            // InternalSolverLanguageParser.g:854:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:855:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:855:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:856:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getResultTypeSymbolCrossReference_0_0());
            				
            pushFollow(FOLLOW_12);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:870:3: ( (lv_head_1_0= ruleCall ) )
            // InternalSolverLanguageParser.g:871:4: (lv_head_1_0= ruleCall )
            {
            // InternalSolverLanguageParser.g:871:4: (lv_head_1_0= ruleCall )
            // InternalSolverLanguageParser.g:872:5: lv_head_1_0= ruleCall
            {

            					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getHeadCallParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_head_1_0=ruleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Call");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,ColonEqualsSign,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionDefinitionAccess().getColonEqualsSignKeyword_2());
            		
            // InternalSolverLanguageParser.g:893:3: ( (lv_body_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:894:4: (lv_body_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:894:4: (lv_body_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:895:5: lv_body_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getBodyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_body_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_FULL_STOP_4=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_4, grammarAccess.getFunctionDefinitionAccess().getFULL_STOPTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "entryRuleTypeReference"
    // InternalSolverLanguageParser.g:920:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalSolverLanguageParser.g:920:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalSolverLanguageParser.g:921:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
             newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;

             current =iv_ruleTypeReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalSolverLanguageParser.g:927:1: ruleTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_forceObjectType_1_0= Object ) )? ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token lv_forceObjectType_1_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:933:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_forceObjectType_1_0= Object ) )? ) )
            // InternalSolverLanguageParser.g:934:2: ( ( ( ruleQualifiedName ) ) ( (lv_forceObjectType_1_0= Object ) )? )
            {
            // InternalSolverLanguageParser.g:934:2: ( ( ( ruleQualifiedName ) ) ( (lv_forceObjectType_1_0= Object ) )? )
            // InternalSolverLanguageParser.g:935:3: ( ( ruleQualifiedName ) ) ( (lv_forceObjectType_1_0= Object ) )?
            {
            // InternalSolverLanguageParser.g:935:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:936:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:936:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:937:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTypeReferenceAccess().getTypeSymbolCrossReference_0_0());
            				
            pushFollow(FOLLOW_18);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:951:3: ( (lv_forceObjectType_1_0= Object ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Object) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSolverLanguageParser.g:952:4: (lv_forceObjectType_1_0= Object )
                    {
                    // InternalSolverLanguageParser.g:952:4: (lv_forceObjectType_1_0= Object )
                    // InternalSolverLanguageParser.g:953:5: lv_forceObjectType_1_0= Object
                    {
                    lv_forceObjectType_1_0=(Token)match(input,Object,FOLLOW_2); 

                    					newLeafNode(lv_forceObjectType_1_0, grammarAccess.getTypeReferenceAccess().getForceObjectTypeObjectKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeReferenceRule());
                    					}
                    					setWithLastConsumed(current, "forceObjectType", true, "object");
                    				

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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleAttribute"
    // InternalSolverLanguageParser.g:969:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSolverLanguageParser.g:969:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSolverLanguageParser.g:970:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSolverLanguageParser.g:976:1: ruleAttribute returns [EObject current=null] : ( ( (lv_kind_0_0= ruleAttributeKind ) ) ( ( ruleQualifiedName ) ) this_FULL_STOP_2= RULE_FULL_STOP ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token this_FULL_STOP_2=null;
        Enumerator lv_kind_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:982:2: ( ( ( (lv_kind_0_0= ruleAttributeKind ) ) ( ( ruleQualifiedName ) ) this_FULL_STOP_2= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:983:2: ( ( (lv_kind_0_0= ruleAttributeKind ) ) ( ( ruleQualifiedName ) ) this_FULL_STOP_2= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:983:2: ( ( (lv_kind_0_0= ruleAttributeKind ) ) ( ( ruleQualifiedName ) ) this_FULL_STOP_2= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:984:3: ( (lv_kind_0_0= ruleAttributeKind ) ) ( ( ruleQualifiedName ) ) this_FULL_STOP_2= RULE_FULL_STOP
            {
            // InternalSolverLanguageParser.g:984:3: ( (lv_kind_0_0= ruleAttributeKind ) )
            // InternalSolverLanguageParser.g:985:4: (lv_kind_0_0= ruleAttributeKind )
            {
            // InternalSolverLanguageParser.g:985:4: (lv_kind_0_0= ruleAttributeKind )
            // InternalSolverLanguageParser.g:986:5: lv_kind_0_0= ruleAttributeKind
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getKindAttributeKindEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_kind_0_0=ruleAttributeKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_0_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.AttributeKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:1003:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:1004:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:1004:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:1005:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTargetSymbolCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_FULL_STOP_2=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_2, grammarAccess.getAttributeAccess().getFULL_STOPTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleExternDeclaration"
    // InternalSolverLanguageParser.g:1027:1: entryRuleExternDeclaration returns [EObject current=null] : iv_ruleExternDeclaration= ruleExternDeclaration EOF ;
    public final EObject entryRuleExternDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternDeclaration = null;


        try {
            // InternalSolverLanguageParser.g:1027:58: (iv_ruleExternDeclaration= ruleExternDeclaration EOF )
            // InternalSolverLanguageParser.g:1028:2: iv_ruleExternDeclaration= ruleExternDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExternDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternDeclaration=ruleExternDeclaration();

            state._fsp--;

             current =iv_ruleExternDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternDeclaration"


    // $ANTLR start "ruleExternDeclaration"
    // InternalSolverLanguageParser.g:1034:1: ruleExternDeclaration returns [EObject current=null] : (this_ExternPredicateDeclaration_0= ruleExternPredicateDeclaration | this_ExternFunctionDeclaration_1= ruleExternFunctionDeclaration | this_ExternAggregationOperatorDeclaration_2= ruleExternAggregationOperatorDeclaration | this_ExternDatatypeDeclaration_3= ruleExternDatatypeDeclaration ) ;
    public final EObject ruleExternDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ExternPredicateDeclaration_0 = null;

        EObject this_ExternFunctionDeclaration_1 = null;

        EObject this_ExternAggregationOperatorDeclaration_2 = null;

        EObject this_ExternDatatypeDeclaration_3 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1040:2: ( (this_ExternPredicateDeclaration_0= ruleExternPredicateDeclaration | this_ExternFunctionDeclaration_1= ruleExternFunctionDeclaration | this_ExternAggregationOperatorDeclaration_2= ruleExternAggregationOperatorDeclaration | this_ExternDatatypeDeclaration_3= ruleExternDatatypeDeclaration ) )
            // InternalSolverLanguageParser.g:1041:2: (this_ExternPredicateDeclaration_0= ruleExternPredicateDeclaration | this_ExternFunctionDeclaration_1= ruleExternFunctionDeclaration | this_ExternAggregationOperatorDeclaration_2= ruleExternAggregationOperatorDeclaration | this_ExternDatatypeDeclaration_3= ruleExternDatatypeDeclaration )
            {
            // InternalSolverLanguageParser.g:1041:2: (this_ExternPredicateDeclaration_0= ruleExternPredicateDeclaration | this_ExternFunctionDeclaration_1= ruleExternFunctionDeclaration | this_ExternAggregationOperatorDeclaration_2= ruleExternAggregationOperatorDeclaration | this_ExternDatatypeDeclaration_3= ruleExternDatatypeDeclaration )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalSolverLanguageParser.g:1042:3: this_ExternPredicateDeclaration_0= ruleExternPredicateDeclaration
                    {

                    			newCompositeNode(grammarAccess.getExternDeclarationAccess().getExternPredicateDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternPredicateDeclaration_0=ruleExternPredicateDeclaration();

                    state._fsp--;


                    			current = this_ExternPredicateDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:1051:3: this_ExternFunctionDeclaration_1= ruleExternFunctionDeclaration
                    {

                    			newCompositeNode(grammarAccess.getExternDeclarationAccess().getExternFunctionDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternFunctionDeclaration_1=ruleExternFunctionDeclaration();

                    state._fsp--;


                    			current = this_ExternFunctionDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:1060:3: this_ExternAggregationOperatorDeclaration_2= ruleExternAggregationOperatorDeclaration
                    {

                    			newCompositeNode(grammarAccess.getExternDeclarationAccess().getExternAggregationOperatorDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternAggregationOperatorDeclaration_2=ruleExternAggregationOperatorDeclaration();

                    state._fsp--;


                    			current = this_ExternAggregationOperatorDeclaration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:1069:3: this_ExternDatatypeDeclaration_3= ruleExternDatatypeDeclaration
                    {

                    			newCompositeNode(grammarAccess.getExternDeclarationAccess().getExternDatatypeDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternDatatypeDeclaration_3=ruleExternDatatypeDeclaration();

                    state._fsp--;


                    			current = this_ExternDatatypeDeclaration_3;
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
    // $ANTLR end "ruleExternDeclaration"


    // $ANTLR start "entryRuleExternPredicateDeclaration"
    // InternalSolverLanguageParser.g:1081:1: entryRuleExternPredicateDeclaration returns [EObject current=null] : iv_ruleExternPredicateDeclaration= ruleExternPredicateDeclaration EOF ;
    public final EObject entryRuleExternPredicateDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternPredicateDeclaration = null;


        try {
            // InternalSolverLanguageParser.g:1081:67: (iv_ruleExternPredicateDeclaration= ruleExternPredicateDeclaration EOF )
            // InternalSolverLanguageParser.g:1082:2: iv_ruleExternPredicateDeclaration= ruleExternPredicateDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExternPredicateDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternPredicateDeclaration=ruleExternPredicateDeclaration();

            state._fsp--;

             current =iv_ruleExternPredicateDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternPredicateDeclaration"


    // $ANTLR start "ruleExternPredicateDeclaration"
    // InternalSolverLanguageParser.g:1088:1: ruleExternPredicateDeclaration returns [EObject current=null] : (otherlv_0= Extern ( ( ( ( ({...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleQualifiedName ) ) ( (lv_argumentList_5_0= ruleArgumentList ) ) this_FULL_STOP_6= RULE_FULL_STOP ) ;
    public final EObject ruleExternPredicateDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_functional_2_0=null;
        Token lv_error_3_0=null;
        Token this_FULL_STOP_6=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_argumentList_5_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1094:2: ( (otherlv_0= Extern ( ( ( ( ({...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleQualifiedName ) ) ( (lv_argumentList_5_0= ruleArgumentList ) ) this_FULL_STOP_6= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:1095:2: (otherlv_0= Extern ( ( ( ( ({...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleQualifiedName ) ) ( (lv_argumentList_5_0= ruleArgumentList ) ) this_FULL_STOP_6= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:1095:2: (otherlv_0= Extern ( ( ( ( ({...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleQualifiedName ) ) ( (lv_argumentList_5_0= ruleArgumentList ) ) this_FULL_STOP_6= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:1096:3: otherlv_0= Extern ( ( ( ( ({...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleQualifiedName ) ) ( (lv_argumentList_5_0= ruleArgumentList ) ) this_FULL_STOP_6= RULE_FULL_STOP
            {
            otherlv_0=(Token)match(input,Extern,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getExternPredicateDeclarationAccess().getExternKeyword_0());
            		
            // InternalSolverLanguageParser.g:1100:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) ) ) )* ) ) )
            // InternalSolverLanguageParser.g:1101:4: ( ( ( ({...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) ) ) )* ) )
            {
            // InternalSolverLanguageParser.g:1101:4: ( ( ( ({...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) ) ) )* ) )
            // InternalSolverLanguageParser.g:1102:5: ( ( ({...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getExternPredicateDeclarationAccess().getUnorderedGroup_1());
            				
            // InternalSolverLanguageParser.g:1105:5: ( ( ({...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) ) ) )* )
            // InternalSolverLanguageParser.g:1106:6: ( ({...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) ) ) )*
            {
            // InternalSolverLanguageParser.g:1106:6: ( ({...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) ) ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( LA14_0 == Functional && getUnorderedGroupHelper().canSelect(grammarAccess.getExternPredicateDeclarationAccess().getUnorderedGroup_1(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 == Error && getUnorderedGroupHelper().canSelect(grammarAccess.getExternPredicateDeclarationAccess().getUnorderedGroup_1(), 1) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:1107:4: ({...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) ) )
            	    {
            	    // InternalSolverLanguageParser.g:1107:4: ({...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) ) )
            	    // InternalSolverLanguageParser.g:1108:5: {...}? => ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternPredicateDeclarationAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleExternPredicateDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternPredicateDeclarationAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalSolverLanguageParser.g:1108:123: ( ({...}? => ( (lv_functional_2_0= Functional ) ) ) )
            	    // InternalSolverLanguageParser.g:1109:6: ({...}? => ( (lv_functional_2_0= Functional ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getExternPredicateDeclarationAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalSolverLanguageParser.g:1112:9: ({...}? => ( (lv_functional_2_0= Functional ) ) )
            	    // InternalSolverLanguageParser.g:1112:10: {...}? => ( (lv_functional_2_0= Functional ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleExternPredicateDeclaration", "true");
            	    }
            	    // InternalSolverLanguageParser.g:1112:19: ( (lv_functional_2_0= Functional ) )
            	    // InternalSolverLanguageParser.g:1112:20: (lv_functional_2_0= Functional )
            	    {
            	    // InternalSolverLanguageParser.g:1112:20: (lv_functional_2_0= Functional )
            	    // InternalSolverLanguageParser.g:1113:10: lv_functional_2_0= Functional
            	    {
            	    lv_functional_2_0=(Token)match(input,Functional,FOLLOW_19); 

            	    										newLeafNode(lv_functional_2_0, grammarAccess.getExternPredicateDeclarationAccess().getFunctionalFunctionalKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getExternPredicateDeclarationRule());
            	    										}
            	    										setWithLastConsumed(current, "functional", true, "functional");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternPredicateDeclarationAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSolverLanguageParser.g:1130:4: ({...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) ) )
            	    {
            	    // InternalSolverLanguageParser.g:1130:4: ({...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) ) )
            	    // InternalSolverLanguageParser.g:1131:5: {...}? => ( ({...}? => ( (lv_error_3_0= Error ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExternPredicateDeclarationAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleExternPredicateDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getExternPredicateDeclarationAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalSolverLanguageParser.g:1131:123: ( ({...}? => ( (lv_error_3_0= Error ) ) ) )
            	    // InternalSolverLanguageParser.g:1132:6: ({...}? => ( (lv_error_3_0= Error ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getExternPredicateDeclarationAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalSolverLanguageParser.g:1135:9: ({...}? => ( (lv_error_3_0= Error ) ) )
            	    // InternalSolverLanguageParser.g:1135:10: {...}? => ( (lv_error_3_0= Error ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleExternPredicateDeclaration", "true");
            	    }
            	    // InternalSolverLanguageParser.g:1135:19: ( (lv_error_3_0= Error ) )
            	    // InternalSolverLanguageParser.g:1135:20: (lv_error_3_0= Error )
            	    {
            	    // InternalSolverLanguageParser.g:1135:20: (lv_error_3_0= Error )
            	    // InternalSolverLanguageParser.g:1136:10: lv_error_3_0= Error
            	    {
            	    lv_error_3_0=(Token)match(input,Error,FOLLOW_19); 

            	    										newLeafNode(lv_error_3_0, grammarAccess.getExternPredicateDeclarationAccess().getErrorErrorKeyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getExternPredicateDeclarationRule());
            	    										}
            	    										setWithLastConsumed(current, "error", true, "error");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExternPredicateDeclarationAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getExternPredicateDeclarationAccess().getUnorderedGroup_1());
            				

            }

            // InternalSolverLanguageParser.g:1160:3: ( (lv_name_4_0= ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:1161:4: (lv_name_4_0= ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:1161:4: (lv_name_4_0= ruleQualifiedName )
            // InternalSolverLanguageParser.g:1162:5: lv_name_4_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getExternPredicateDeclarationAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_4_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternPredicateDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:1179:3: ( (lv_argumentList_5_0= ruleArgumentList ) )
            // InternalSolverLanguageParser.g:1180:4: (lv_argumentList_5_0= ruleArgumentList )
            {
            // InternalSolverLanguageParser.g:1180:4: (lv_argumentList_5_0= ruleArgumentList )
            // InternalSolverLanguageParser.g:1181:5: lv_argumentList_5_0= ruleArgumentList
            {

            					newCompositeNode(grammarAccess.getExternPredicateDeclarationAccess().getArgumentListArgumentListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_argumentList_5_0=ruleArgumentList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternPredicateDeclarationRule());
            					}
            					set(
            						current,
            						"argumentList",
            						lv_argumentList_5_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ArgumentList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_FULL_STOP_6=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_6, grammarAccess.getExternPredicateDeclarationAccess().getFULL_STOPTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternPredicateDeclaration"


    // $ANTLR start "entryRuleExternFunctionDeclaration"
    // InternalSolverLanguageParser.g:1206:1: entryRuleExternFunctionDeclaration returns [EObject current=null] : iv_ruleExternFunctionDeclaration= ruleExternFunctionDeclaration EOF ;
    public final EObject entryRuleExternFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternFunctionDeclaration = null;


        try {
            // InternalSolverLanguageParser.g:1206:66: (iv_ruleExternFunctionDeclaration= ruleExternFunctionDeclaration EOF )
            // InternalSolverLanguageParser.g:1207:2: iv_ruleExternFunctionDeclaration= ruleExternFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExternFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternFunctionDeclaration=ruleExternFunctionDeclaration();

            state._fsp--;

             current =iv_ruleExternFunctionDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternFunctionDeclaration"


    // $ANTLR start "ruleExternFunctionDeclaration"
    // InternalSolverLanguageParser.g:1213:1: ruleExternFunctionDeclaration returns [EObject current=null] : (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_argumentList_3_0= ruleArgumentList ) ) this_FULL_STOP_4= RULE_FULL_STOP ) ;
    public final EObject ruleExternFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_FULL_STOP_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_argumentList_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1219:2: ( (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_argumentList_3_0= ruleArgumentList ) ) this_FULL_STOP_4= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:1220:2: (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_argumentList_3_0= ruleArgumentList ) ) this_FULL_STOP_4= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:1220:2: (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_argumentList_3_0= ruleArgumentList ) ) this_FULL_STOP_4= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:1221:3: otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_argumentList_3_0= ruleArgumentList ) ) this_FULL_STOP_4= RULE_FULL_STOP
            {
            otherlv_0=(Token)match(input,Extern,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternFunctionDeclarationAccess().getExternKeyword_0());
            		
            // InternalSolverLanguageParser.g:1225:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:1226:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:1226:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:1227:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternFunctionDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternFunctionDeclarationAccess().getResultTypeSymbolCrossReference_1_0());
            				
            pushFollow(FOLLOW_3);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:1241:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:1242:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:1242:4: (lv_name_2_0= ruleQualifiedName )
            // InternalSolverLanguageParser.g:1243:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getExternFunctionDeclarationAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:1260:3: ( (lv_argumentList_3_0= ruleArgumentList ) )
            // InternalSolverLanguageParser.g:1261:4: (lv_argumentList_3_0= ruleArgumentList )
            {
            // InternalSolverLanguageParser.g:1261:4: (lv_argumentList_3_0= ruleArgumentList )
            // InternalSolverLanguageParser.g:1262:5: lv_argumentList_3_0= ruleArgumentList
            {

            					newCompositeNode(grammarAccess.getExternFunctionDeclarationAccess().getArgumentListArgumentListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_argumentList_3_0=ruleArgumentList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"argumentList",
            						lv_argumentList_3_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ArgumentList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_FULL_STOP_4=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_4, grammarAccess.getExternFunctionDeclarationAccess().getFULL_STOPTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternFunctionDeclaration"


    // $ANTLR start "entryRuleExternAggregationOperatorDeclaration"
    // InternalSolverLanguageParser.g:1287:1: entryRuleExternAggregationOperatorDeclaration returns [EObject current=null] : iv_ruleExternAggregationOperatorDeclaration= ruleExternAggregationOperatorDeclaration EOF ;
    public final EObject entryRuleExternAggregationOperatorDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternAggregationOperatorDeclaration = null;


        try {
            // InternalSolverLanguageParser.g:1287:77: (iv_ruleExternAggregationOperatorDeclaration= ruleExternAggregationOperatorDeclaration EOF )
            // InternalSolverLanguageParser.g:1288:2: iv_ruleExternAggregationOperatorDeclaration= ruleExternAggregationOperatorDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExternAggregationOperatorDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternAggregationOperatorDeclaration=ruleExternAggregationOperatorDeclaration();

            state._fsp--;

             current =iv_ruleExternAggregationOperatorDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternAggregationOperatorDeclaration"


    // $ANTLR start "ruleExternAggregationOperatorDeclaration"
    // InternalSolverLanguageParser.g:1294:1: ruleExternAggregationOperatorDeclaration returns [EObject current=null] : (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= LeftCurlyBracket ( ( ruleQualifiedName ) ) otherlv_5= FullStopFullStopFullStop otherlv_6= RightCurlyBracket this_FULL_STOP_7= RULE_FULL_STOP ) ;
    public final EObject ruleExternAggregationOperatorDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_FULL_STOP_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1300:2: ( (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= LeftCurlyBracket ( ( ruleQualifiedName ) ) otherlv_5= FullStopFullStopFullStop otherlv_6= RightCurlyBracket this_FULL_STOP_7= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:1301:2: (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= LeftCurlyBracket ( ( ruleQualifiedName ) ) otherlv_5= FullStopFullStopFullStop otherlv_6= RightCurlyBracket this_FULL_STOP_7= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:1301:2: (otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= LeftCurlyBracket ( ( ruleQualifiedName ) ) otherlv_5= FullStopFullStopFullStop otherlv_6= RightCurlyBracket this_FULL_STOP_7= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:1302:3: otherlv_0= Extern ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= LeftCurlyBracket ( ( ruleQualifiedName ) ) otherlv_5= FullStopFullStopFullStop otherlv_6= RightCurlyBracket this_FULL_STOP_7= RULE_FULL_STOP
            {
            otherlv_0=(Token)match(input,Extern,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternAggregationOperatorDeclarationAccess().getExternKeyword_0());
            		
            // InternalSolverLanguageParser.g:1306:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:1307:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:1307:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:1308:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternAggregationOperatorDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternAggregationOperatorDeclarationAccess().getResultTypeSymbolCrossReference_1_0());
            				
            pushFollow(FOLLOW_3);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:1322:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:1323:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:1323:4: (lv_name_2_0= ruleQualifiedName )
            // InternalSolverLanguageParser.g:1324:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getExternAggregationOperatorDeclarationAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternAggregationOperatorDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getExternAggregationOperatorDeclarationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSolverLanguageParser.g:1345:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:1346:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:1346:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:1347:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternAggregationOperatorDeclarationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExternAggregationOperatorDeclarationAccess().getArgumentTypeSymbolCrossReference_4_0());
            				
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,FullStopFullStopFullStop,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getExternAggregationOperatorDeclarationAccess().getFullStopFullStopFullStopKeyword_5());
            		
            otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getExternAggregationOperatorDeclarationAccess().getRightCurlyBracketKeyword_6());
            		
            this_FULL_STOP_7=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_7, grammarAccess.getExternAggregationOperatorDeclarationAccess().getFULL_STOPTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternAggregationOperatorDeclaration"


    // $ANTLR start "entryRuleExternDatatypeDeclaration"
    // InternalSolverLanguageParser.g:1377:1: entryRuleExternDatatypeDeclaration returns [EObject current=null] : iv_ruleExternDatatypeDeclaration= ruleExternDatatypeDeclaration EOF ;
    public final EObject entryRuleExternDatatypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternDatatypeDeclaration = null;


        try {
            // InternalSolverLanguageParser.g:1377:66: (iv_ruleExternDatatypeDeclaration= ruleExternDatatypeDeclaration EOF )
            // InternalSolverLanguageParser.g:1378:2: iv_ruleExternDatatypeDeclaration= ruleExternDatatypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExternDatatypeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternDatatypeDeclaration=ruleExternDatatypeDeclaration();

            state._fsp--;

             current =iv_ruleExternDatatypeDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternDatatypeDeclaration"


    // $ANTLR start "ruleExternDatatypeDeclaration"
    // InternalSolverLanguageParser.g:1384:1: ruleExternDatatypeDeclaration returns [EObject current=null] : (otherlv_0= Extern otherlv_1= Datatype ( (lv_name_2_0= ruleQualifiedName ) ) this_FULL_STOP_3= RULE_FULL_STOP ) ;
    public final EObject ruleExternDatatypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_FULL_STOP_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1390:2: ( (otherlv_0= Extern otherlv_1= Datatype ( (lv_name_2_0= ruleQualifiedName ) ) this_FULL_STOP_3= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:1391:2: (otherlv_0= Extern otherlv_1= Datatype ( (lv_name_2_0= ruleQualifiedName ) ) this_FULL_STOP_3= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:1391:2: (otherlv_0= Extern otherlv_1= Datatype ( (lv_name_2_0= ruleQualifiedName ) ) this_FULL_STOP_3= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:1392:3: otherlv_0= Extern otherlv_1= Datatype ( (lv_name_2_0= ruleQualifiedName ) ) this_FULL_STOP_3= RULE_FULL_STOP
            {
            otherlv_0=(Token)match(input,Extern,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getExternDatatypeDeclarationAccess().getExternKeyword_0());
            		
            otherlv_1=(Token)match(input,Datatype,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExternDatatypeDeclarationAccess().getDatatypeKeyword_1());
            		
            // InternalSolverLanguageParser.g:1400:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:1401:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:1401:4: (lv_name_2_0= ruleQualifiedName )
            // InternalSolverLanguageParser.g:1402:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getExternDatatypeDeclarationAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternDatatypeDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_FULL_STOP_3=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_3, grammarAccess.getExternDatatypeDeclarationAccess().getFULL_STOPTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternDatatypeDeclaration"


    // $ANTLR start "entryRuleExpression"
    // InternalSolverLanguageParser.g:1427:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSolverLanguageParser.g:1427:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSolverLanguageParser.g:1428:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSolverLanguageParser.g:1434:1: ruleExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression | this_LetExpression_1= ruleLetExpression | (this_DisjunctiveExpression_2= ruleDisjunctiveExpression ( () otherlv_4= EqualsSignGreaterThanSign ( (lv_body_5_0= ruleDisjunctiveExpression ) ) )? ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ConditionalExpression_0 = null;

        EObject this_LetExpression_1 = null;

        EObject this_DisjunctiveExpression_2 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1440:2: ( (this_ConditionalExpression_0= ruleConditionalExpression | this_LetExpression_1= ruleLetExpression | (this_DisjunctiveExpression_2= ruleDisjunctiveExpression ( () otherlv_4= EqualsSignGreaterThanSign ( (lv_body_5_0= ruleDisjunctiveExpression ) ) )? ) ) )
            // InternalSolverLanguageParser.g:1441:2: (this_ConditionalExpression_0= ruleConditionalExpression | this_LetExpression_1= ruleLetExpression | (this_DisjunctiveExpression_2= ruleDisjunctiveExpression ( () otherlv_4= EqualsSignGreaterThanSign ( (lv_body_5_0= ruleDisjunctiveExpression ) ) )? ) )
            {
            // InternalSolverLanguageParser.g:1441:2: (this_ConditionalExpression_0= ruleConditionalExpression | this_LetExpression_1= ruleLetExpression | (this_DisjunctiveExpression_2= ruleDisjunctiveExpression ( () otherlv_4= EqualsSignGreaterThanSign ( (lv_body_5_0= ruleDisjunctiveExpression ) ) )? ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case If:
                {
                alt16=1;
                }
                break;
            case Let:
                {
                alt16=2;
                }
                break;
            case Unknown:
            case Object:
            case Count:
            case Empty:
            case Error:
            case False:
            case True:
            case Inf:
            case ExclamationMark:
            case LeftParenthesis:
            case PlusSign:
            case HyphenMinus:
            case QuestionMark:
            case LeftSquareBracket:
            case Tilde:
            case RULE_STRING:
            case RULE_QUOTED_ID:
            case RULE_ID:
            case RULE_INT:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalSolverLanguageParser.g:1442:3: this_ConditionalExpression_0= ruleConditionalExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getConditionalExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalExpression_0=ruleConditionalExpression();

                    state._fsp--;


                    			current = this_ConditionalExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:1451:3: this_LetExpression_1= ruleLetExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLetExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetExpression_1=ruleLetExpression();

                    state._fsp--;


                    			current = this_LetExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:1460:3: (this_DisjunctiveExpression_2= ruleDisjunctiveExpression ( () otherlv_4= EqualsSignGreaterThanSign ( (lv_body_5_0= ruleDisjunctiveExpression ) ) )? )
                    {
                    // InternalSolverLanguageParser.g:1460:3: (this_DisjunctiveExpression_2= ruleDisjunctiveExpression ( () otherlv_4= EqualsSignGreaterThanSign ( (lv_body_5_0= ruleDisjunctiveExpression ) ) )? )
                    // InternalSolverLanguageParser.g:1461:4: this_DisjunctiveExpression_2= ruleDisjunctiveExpression ( () otherlv_4= EqualsSignGreaterThanSign ( (lv_body_5_0= ruleDisjunctiveExpression ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getExpressionAccess().getDisjunctiveExpressionParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_24);
                    this_DisjunctiveExpression_2=ruleDisjunctiveExpression();

                    state._fsp--;


                    				current = this_DisjunctiveExpression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalSolverLanguageParser.g:1469:4: ( () otherlv_4= EqualsSignGreaterThanSign ( (lv_body_5_0= ruleDisjunctiveExpression ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==EqualsSignGreaterThanSign) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSolverLanguageParser.g:1470:5: () otherlv_4= EqualsSignGreaterThanSign ( (lv_body_5_0= ruleDisjunctiveExpression ) )
                            {
                            // InternalSolverLanguageParser.g:1470:5: ()
                            // InternalSolverLanguageParser.g:1471:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getExpressionAccess().getForallConditionAction_2_1_0(),
                            							current);
                            					

                            }

                            otherlv_4=(Token)match(input,EqualsSignGreaterThanSign,FOLLOW_10); 

                            					newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_2_1_1());
                            				
                            // InternalSolverLanguageParser.g:1481:5: ( (lv_body_5_0= ruleDisjunctiveExpression ) )
                            // InternalSolverLanguageParser.g:1482:6: (lv_body_5_0= ruleDisjunctiveExpression )
                            {
                            // InternalSolverLanguageParser.g:1482:6: (lv_body_5_0= ruleDisjunctiveExpression )
                            // InternalSolverLanguageParser.g:1483:7: lv_body_5_0= ruleDisjunctiveExpression
                            {

                            							newCompositeNode(grammarAccess.getExpressionAccess().getBodyDisjunctiveExpressionParserRuleCall_2_1_2_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_body_5_0=ruleDisjunctiveExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getExpressionRule());
                            							}
                            							set(
                            								current,
                            								"body",
                            								lv_body_5_0,
                            								"org.eclipse.viatra.solver.language.SolverLanguage.DisjunctiveExpression");
                            							afterParserOrEnumRuleCall();
                            						

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


            	leaveRule();

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


    // $ANTLR start "entryRuleConditionalExpression"
    // InternalSolverLanguageParser.g:1506:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // InternalSolverLanguageParser.g:1506:62: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalSolverLanguageParser.g:1507:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;

             current =iv_ruleConditionalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // InternalSolverLanguageParser.g:1513:1: ruleConditionalExpression returns [EObject current=null] : (otherlv_0= If ( (lv_condition_1_0= ruleDisjunctiveExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) ) ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_5_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1519:2: ( (otherlv_0= If ( (lv_condition_1_0= ruleDisjunctiveExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:1520:2: (otherlv_0= If ( (lv_condition_1_0= ruleDisjunctiveExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:1520:2: (otherlv_0= If ( (lv_condition_1_0= ruleDisjunctiveExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:1521:3: otherlv_0= If ( (lv_condition_1_0= ruleDisjunctiveExpression ) ) otherlv_2= Then ( (lv_then_3_0= ruleExpression ) ) otherlv_4= Else ( (lv_else_5_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,If,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalExpressionAccess().getIfKeyword_0());
            		
            // InternalSolverLanguageParser.g:1525:3: ( (lv_condition_1_0= ruleDisjunctiveExpression ) )
            // InternalSolverLanguageParser.g:1526:4: (lv_condition_1_0= ruleDisjunctiveExpression )
            {
            // InternalSolverLanguageParser.g:1526:4: (lv_condition_1_0= ruleDisjunctiveExpression )
            // InternalSolverLanguageParser.g:1527:5: lv_condition_1_0= ruleDisjunctiveExpression
            {

            					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getConditionDisjunctiveExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_condition_1_0=ruleDisjunctiveExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.DisjunctiveExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Then,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getThenKeyword_2());
            		
            // InternalSolverLanguageParser.g:1548:3: ( (lv_then_3_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:1549:4: (lv_then_3_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:1549:4: (lv_then_3_0= ruleExpression )
            // InternalSolverLanguageParser.g:1550:5: lv_then_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getThenExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_then_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
            					}
            					set(
            						current,
            						"then",
            						lv_then_3_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,Else,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getElseKeyword_4());
            		
            // InternalSolverLanguageParser.g:1571:3: ( (lv_else_5_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:1572:4: (lv_else_5_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:1572:4: (lv_else_5_0= ruleExpression )
            // InternalSolverLanguageParser.g:1573:5: lv_else_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getElseExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_else_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
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
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleLetExpression"
    // InternalSolverLanguageParser.g:1594:1: entryRuleLetExpression returns [EObject current=null] : iv_ruleLetExpression= ruleLetExpression EOF ;
    public final EObject entryRuleLetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpression = null;


        try {
            // InternalSolverLanguageParser.g:1594:54: (iv_ruleLetExpression= ruleLetExpression EOF )
            // InternalSolverLanguageParser.g:1595:2: iv_ruleLetExpression= ruleLetExpression EOF
            {
             newCompositeNode(grammarAccess.getLetExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetExpression=ruleLetExpression();

            state._fsp--;

             current =iv_ruleLetExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetExpression"


    // $ANTLR start "ruleLetExpression"
    // InternalSolverLanguageParser.g:1601:1: ruleLetExpression returns [EObject current=null] : (otherlv_0= Let ( (lv_bindings_1_0= ruleLetBinding ) ) (otherlv_2= Comma ( (lv_bindings_3_0= ruleLetBinding ) ) )* otherlv_4= In ( (lv_body_5_0= ruleExpression ) ) ) ;
    public final EObject ruleLetExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_bindings_1_0 = null;

        EObject lv_bindings_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1607:2: ( (otherlv_0= Let ( (lv_bindings_1_0= ruleLetBinding ) ) (otherlv_2= Comma ( (lv_bindings_3_0= ruleLetBinding ) ) )* otherlv_4= In ( (lv_body_5_0= ruleExpression ) ) ) )
            // InternalSolverLanguageParser.g:1608:2: (otherlv_0= Let ( (lv_bindings_1_0= ruleLetBinding ) ) (otherlv_2= Comma ( (lv_bindings_3_0= ruleLetBinding ) ) )* otherlv_4= In ( (lv_body_5_0= ruleExpression ) ) )
            {
            // InternalSolverLanguageParser.g:1608:2: (otherlv_0= Let ( (lv_bindings_1_0= ruleLetBinding ) ) (otherlv_2= Comma ( (lv_bindings_3_0= ruleLetBinding ) ) )* otherlv_4= In ( (lv_body_5_0= ruleExpression ) ) )
            // InternalSolverLanguageParser.g:1609:3: otherlv_0= Let ( (lv_bindings_1_0= ruleLetBinding ) ) (otherlv_2= Comma ( (lv_bindings_3_0= ruleLetBinding ) ) )* otherlv_4= In ( (lv_body_5_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,Let,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetExpressionAccess().getLetKeyword_0());
            		
            // InternalSolverLanguageParser.g:1613:3: ( (lv_bindings_1_0= ruleLetBinding ) )
            // InternalSolverLanguageParser.g:1614:4: (lv_bindings_1_0= ruleLetBinding )
            {
            // InternalSolverLanguageParser.g:1614:4: (lv_bindings_1_0= ruleLetBinding )
            // InternalSolverLanguageParser.g:1615:5: lv_bindings_1_0= ruleLetBinding
            {

            					newCompositeNode(grammarAccess.getLetExpressionAccess().getBindingsLetBindingParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_bindings_1_0=ruleLetBinding();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetExpressionRule());
            					}
            					add(
            						current,
            						"bindings",
            						lv_bindings_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.LetBinding");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:1632:3: (otherlv_2= Comma ( (lv_bindings_3_0= ruleLetBinding ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:1633:4: otherlv_2= Comma ( (lv_bindings_3_0= ruleLetBinding ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLetExpressionAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSolverLanguageParser.g:1637:4: ( (lv_bindings_3_0= ruleLetBinding ) )
            	    // InternalSolverLanguageParser.g:1638:5: (lv_bindings_3_0= ruleLetBinding )
            	    {
            	    // InternalSolverLanguageParser.g:1638:5: (lv_bindings_3_0= ruleLetBinding )
            	    // InternalSolverLanguageParser.g:1639:6: lv_bindings_3_0= ruleLetBinding
            	    {

            	    						newCompositeNode(grammarAccess.getLetExpressionAccess().getBindingsLetBindingParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_bindings_3_0=ruleLetBinding();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLetExpressionRule());
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
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,In,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getLetExpressionAccess().getInKeyword_3());
            		
            // InternalSolverLanguageParser.g:1661:3: ( (lv_body_5_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:1662:4: (lv_body_5_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:1662:4: (lv_body_5_0= ruleExpression )
            // InternalSolverLanguageParser.g:1663:5: lv_body_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLetExpressionAccess().getBodyExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetExpressionRule());
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
    // $ANTLR end "ruleLetExpression"


    // $ANTLR start "entryRuleLetBinding"
    // InternalSolverLanguageParser.g:1684:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalSolverLanguageParser.g:1684:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalSolverLanguageParser.g:1685:2: iv_ruleLetBinding= ruleLetBinding EOF
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
    // InternalSolverLanguageParser.g:1691:1: ruleLetBinding returns [EObject current=null] : ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_value_3_0= ruleAdditiveExpression ) ) ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1697:2: ( ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_value_3_0= ruleAdditiveExpression ) ) ) )
            // InternalSolverLanguageParser.g:1698:2: ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_value_3_0= ruleAdditiveExpression ) ) )
            {
            // InternalSolverLanguageParser.g:1698:2: ( ( ( ruleQualifiedName ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_value_3_0= ruleAdditiveExpression ) ) )
            // InternalSolverLanguageParser.g:1699:3: ( ( ruleQualifiedName ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= EqualsSign ( (lv_value_3_0= ruleAdditiveExpression ) )
            {
            // InternalSolverLanguageParser.g:1699:3: ( ( ruleQualifiedName ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==ColonColon||LA18_1==RULE_ID) ) {
                    alt18=1;
                }
            }
            else if ( (LA18_0==Object||LA18_0==RULE_QUOTED_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSolverLanguageParser.g:1700:4: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:1700:4: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:1701:5: ruleQualifiedName
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLetBindingRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getLetBindingAccess().getTypeSymbolCrossReference_0_0());
                    				
                    pushFollow(FOLLOW_28);
                    ruleQualifiedName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSolverLanguageParser.g:1715:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolverLanguageParser.g:1716:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolverLanguageParser.g:1716:4: (lv_name_1_0= RULE_ID )
            // InternalSolverLanguageParser.g:1717:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSign,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalSolverLanguageParser.g:1737:3: ( (lv_value_3_0= ruleAdditiveExpression ) )
            // InternalSolverLanguageParser.g:1738:4: (lv_value_3_0= ruleAdditiveExpression )
            {
            // InternalSolverLanguageParser.g:1738:4: (lv_value_3_0= ruleAdditiveExpression )
            // InternalSolverLanguageParser.g:1739:5: lv_value_3_0= ruleAdditiveExpression
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getValueAdditiveExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleAdditiveExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
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


    // $ANTLR start "entryRuleDisjunctiveExpression"
    // InternalSolverLanguageParser.g:1760:1: entryRuleDisjunctiveExpression returns [EObject current=null] : iv_ruleDisjunctiveExpression= ruleDisjunctiveExpression EOF ;
    public final EObject entryRuleDisjunctiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctiveExpression = null;


        try {
            // InternalSolverLanguageParser.g:1760:62: (iv_ruleDisjunctiveExpression= ruleDisjunctiveExpression EOF )
            // InternalSolverLanguageParser.g:1761:2: iv_ruleDisjunctiveExpression= ruleDisjunctiveExpression EOF
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
    // InternalSolverLanguageParser.g:1767:1: ruleDisjunctiveExpression returns [EObject current=null] : (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )? ) ;
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
            // InternalSolverLanguageParser.g:1773:2: ( (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )? ) )
            // InternalSolverLanguageParser.g:1774:2: (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )? )
            {
            // InternalSolverLanguageParser.g:1774:2: (this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )? )
            // InternalSolverLanguageParser.g:1775:3: this_ConjunctiveExpression_0= ruleConjunctiveExpression ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )?
            {

            			newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getConjunctiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_ConjunctiveExpression_0=ruleConjunctiveExpression();

            state._fsp--;


            			current = this_ConjunctiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1783:3: ( ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ ) | ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Semicolon) ) {
                alt21=1;
            }
            else if ( (LA21_0==HyphenMinusGreaterThanSign) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalSolverLanguageParser.g:1784:4: ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ )
                    {
                    // InternalSolverLanguageParser.g:1784:4: ( () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+ )
                    // InternalSolverLanguageParser.g:1785:5: () (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+
                    {
                    // InternalSolverLanguageParser.g:1785:5: ()
                    // InternalSolverLanguageParser.g:1786:6: 
                    {

                    						current = forceCreateModelElementAndAdd(
                    							grammarAccess.getDisjunctiveExpressionAccess().getDisjunctionChildrenAction_1_0_0(),
                    							current);
                    					

                    }

                    // InternalSolverLanguageParser.g:1792:5: (otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==Semicolon) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:1793:6: otherlv_2= Semicolon ( (lv_children_3_0= ruleConjunctiveExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_10); 

                    	    						newLeafNode(otherlv_2, grammarAccess.getDisjunctiveExpressionAccess().getSemicolonKeyword_1_0_1_0());
                    	    					
                    	    // InternalSolverLanguageParser.g:1797:6: ( (lv_children_3_0= ruleConjunctiveExpression ) )
                    	    // InternalSolverLanguageParser.g:1798:7: (lv_children_3_0= ruleConjunctiveExpression )
                    	    {
                    	    // InternalSolverLanguageParser.g:1798:7: (lv_children_3_0= ruleConjunctiveExpression )
                    	    // InternalSolverLanguageParser.g:1799:8: lv_children_3_0= ruleConjunctiveExpression
                    	    {

                    	    								newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getChildrenConjunctiveExpressionParserRuleCall_1_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_31);
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
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:1819:4: ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* )
                    {
                    // InternalSolverLanguageParser.g:1819:4: ( () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )* )
                    // InternalSolverLanguageParser.g:1820:5: () otherlv_5= HyphenMinusGreaterThanSign ( (lv_body_6_0= ruleConjunctiveExpression ) ) () (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )*
                    {
                    // InternalSolverLanguageParser.g:1820:5: ()
                    // InternalSolverLanguageParser.g:1821:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getDisjunctiveExpressionAccess().getCaseConditionAction_1_1_0(),
                    							current);
                    					

                    }

                    otherlv_5=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_10); 

                    					newLeafNode(otherlv_5, grammarAccess.getDisjunctiveExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_1_1());
                    				
                    // InternalSolverLanguageParser.g:1831:5: ( (lv_body_6_0= ruleConjunctiveExpression ) )
                    // InternalSolverLanguageParser.g:1832:6: (lv_body_6_0= ruleConjunctiveExpression )
                    {
                    // InternalSolverLanguageParser.g:1832:6: (lv_body_6_0= ruleConjunctiveExpression )
                    // InternalSolverLanguageParser.g:1833:7: lv_body_6_0= ruleConjunctiveExpression
                    {

                    							newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getBodyConjunctiveExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_31);
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

                    // InternalSolverLanguageParser.g:1850:5: ()
                    // InternalSolverLanguageParser.g:1851:6: 
                    {

                    						current = forceCreateModelElementAndAdd(
                    							grammarAccess.getDisjunctiveExpressionAccess().getSwitchCasesAction_1_1_3(),
                    							current);
                    					

                    }

                    // InternalSolverLanguageParser.g:1857:5: (otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Semicolon) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:1858:6: otherlv_8= Semicolon ( (lv_cases_9_0= ruleCase ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Semicolon,FOLLOW_10); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getDisjunctiveExpressionAccess().getSemicolonKeyword_1_1_4_0());
                    	    					
                    	    // InternalSolverLanguageParser.g:1862:6: ( (lv_cases_9_0= ruleCase ) )
                    	    // InternalSolverLanguageParser.g:1863:7: (lv_cases_9_0= ruleCase )
                    	    {
                    	    // InternalSolverLanguageParser.g:1863:7: (lv_cases_9_0= ruleCase )
                    	    // InternalSolverLanguageParser.g:1864:8: lv_cases_9_0= ruleCase
                    	    {

                    	    								newCompositeNode(grammarAccess.getDisjunctiveExpressionAccess().getCasesCaseParserRuleCall_1_1_4_1_0());
                    	    							
                    	    pushFollow(FOLLOW_31);
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
                    	    break loop20;
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
    // InternalSolverLanguageParser.g:1888:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalSolverLanguageParser.g:1888:45: (iv_ruleCase= ruleCase EOF )
            // InternalSolverLanguageParser.g:1889:2: iv_ruleCase= ruleCase EOF
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
    // InternalSolverLanguageParser.g:1895:1: ruleCase returns [EObject current=null] : ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_0_0 = null;

        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1901:2: ( ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) ) ) )
            // InternalSolverLanguageParser.g:1902:2: ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) ) )
            {
            // InternalSolverLanguageParser.g:1902:2: ( ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) ) )
            // InternalSolverLanguageParser.g:1903:3: ( (lv_condition_0_0= ruleConjunctiveExpression ) ) otherlv_1= HyphenMinusGreaterThanSign ( (lv_body_2_0= ruleConjunctiveExpression ) )
            {
            // InternalSolverLanguageParser.g:1903:3: ( (lv_condition_0_0= ruleConjunctiveExpression ) )
            // InternalSolverLanguageParser.g:1904:4: (lv_condition_0_0= ruleConjunctiveExpression )
            {
            // InternalSolverLanguageParser.g:1904:4: (lv_condition_0_0= ruleConjunctiveExpression )
            // InternalSolverLanguageParser.g:1905:5: lv_condition_0_0= ruleConjunctiveExpression
            {

            					newCompositeNode(grammarAccess.getCaseAccess().getConditionConjunctiveExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_1=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalSolverLanguageParser.g:1926:3: ( (lv_body_2_0= ruleConjunctiveExpression ) )
            // InternalSolverLanguageParser.g:1927:4: (lv_body_2_0= ruleConjunctiveExpression )
            {
            // InternalSolverLanguageParser.g:1927:4: (lv_body_2_0= ruleConjunctiveExpression )
            // InternalSolverLanguageParser.g:1928:5: lv_body_2_0= ruleConjunctiveExpression
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
    // InternalSolverLanguageParser.g:1949:1: entryRuleConjunctiveExpression returns [EObject current=null] : iv_ruleConjunctiveExpression= ruleConjunctiveExpression EOF ;
    public final EObject entryRuleConjunctiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctiveExpression = null;


        try {
            // InternalSolverLanguageParser.g:1949:62: (iv_ruleConjunctiveExpression= ruleConjunctiveExpression EOF )
            // InternalSolverLanguageParser.g:1950:2: iv_ruleConjunctiveExpression= ruleConjunctiveExpression EOF
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
    // InternalSolverLanguageParser.g:1956:1: ruleConjunctiveExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? ) ;
    public final EObject ruleConjunctiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_children_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:1962:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? ) )
            // InternalSolverLanguageParser.g:1963:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? )
            {
            // InternalSolverLanguageParser.g:1963:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )? )
            // InternalSolverLanguageParser.g:1964:3: this_ComparisonExpression_0= ruleComparisonExpression ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getConjunctiveExpressionAccess().getComparisonExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;


            			current = this_ComparisonExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:1972:3: ( () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+ )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Comma) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSolverLanguageParser.g:1973:4: () (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+
                    {
                    // InternalSolverLanguageParser.g:1973:4: ()
                    // InternalSolverLanguageParser.g:1974:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getConjunctiveExpressionAccess().getConjunctionChildrenAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSolverLanguageParser.g:1980:4: (otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Comma) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:1981:5: otherlv_2= Comma ( (lv_children_3_0= ruleComparisonExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getConjunctiveExpressionAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalSolverLanguageParser.g:1985:5: ( (lv_children_3_0= ruleComparisonExpression ) )
                    	    // InternalSolverLanguageParser.g:1986:6: (lv_children_3_0= ruleComparisonExpression )
                    	    {
                    	    // InternalSolverLanguageParser.g:1986:6: (lv_children_3_0= ruleComparisonExpression )
                    	    // InternalSolverLanguageParser.g:1987:7: lv_children_3_0= ruleComparisonExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getConjunctiveExpressionAccess().getChildrenComparisonExpressionParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
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
    // InternalSolverLanguageParser.g:2010:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalSolverLanguageParser.g:2010:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalSolverLanguageParser.g:2011:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
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
    // InternalSolverLanguageParser.g:2017:1: ruleComparisonExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2023:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? ) )
            // InternalSolverLanguageParser.g:2024:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            {
            // InternalSolverLanguageParser.g:2024:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )? )
            // InternalSolverLanguageParser.g:2025:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:2033:3: ( () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ExclamationMarkEqualsSign||(LA24_0>=LessThanSignEqualsSign && LA24_0<=EqualsSignEqualsSign)||LA24_0==GreaterThanSignEqualsSign||LA24_0==In||LA24_0==LessThanSign||LA24_0==GreaterThanSign) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSolverLanguageParser.g:2034:4: () ( (lv_op_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
                    {
                    // InternalSolverLanguageParser.g:2034:4: ()
                    // InternalSolverLanguageParser.g:2035:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getComparisonExpressionAccess().getBinaryExpressionLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSolverLanguageParser.g:2041:4: ( (lv_op_2_0= ruleComparisonOperator ) )
                    // InternalSolverLanguageParser.g:2042:5: (lv_op_2_0= ruleComparisonOperator )
                    {
                    // InternalSolverLanguageParser.g:2042:5: (lv_op_2_0= ruleComparisonOperator )
                    // InternalSolverLanguageParser.g:2043:6: lv_op_2_0= ruleComparisonOperator
                    {

                    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOpComparisonOperatorEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalSolverLanguageParser.g:2060:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
                    // InternalSolverLanguageParser.g:2061:5: (lv_right_3_0= ruleAdditiveExpression )
                    {
                    // InternalSolverLanguageParser.g:2061:5: (lv_right_3_0= ruleAdditiveExpression )
                    // InternalSolverLanguageParser.g:2062:6: lv_right_3_0= ruleAdditiveExpression
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
    // InternalSolverLanguageParser.g:2084:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalSolverLanguageParser.g:2084:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalSolverLanguageParser.g:2085:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalSolverLanguageParser.g:2091:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2097:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalSolverLanguageParser.g:2098:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalSolverLanguageParser.g:2098:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalSolverLanguageParser.g:2099:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:2107:3: ( () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==PlusSign||LA25_0==HyphenMinus) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:2108:4: () ( (lv_op_2_0= ruleAdditiveBinaryOperator ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalSolverLanguageParser.g:2108:4: ()
            	    // InternalSolverLanguageParser.g:2109:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSolverLanguageParser.g:2115:4: ( (lv_op_2_0= ruleAdditiveBinaryOperator ) )
            	    // InternalSolverLanguageParser.g:2116:5: (lv_op_2_0= ruleAdditiveBinaryOperator )
            	    {
            	    // InternalSolverLanguageParser.g:2116:5: (lv_op_2_0= ruleAdditiveBinaryOperator )
            	    // InternalSolverLanguageParser.g:2117:6: lv_op_2_0= ruleAdditiveBinaryOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpAdditiveBinaryOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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

            	    // InternalSolverLanguageParser.g:2134:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalSolverLanguageParser.g:2135:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalSolverLanguageParser.g:2135:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalSolverLanguageParser.g:2136:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    break loop25;
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
    // InternalSolverLanguageParser.g:2158:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalSolverLanguageParser.g:2158:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalSolverLanguageParser.g:2159:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalSolverLanguageParser.g:2165:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentialExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2171:2: ( (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* ) )
            // InternalSolverLanguageParser.g:2172:2: (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* )
            {
            // InternalSolverLanguageParser.g:2172:2: (this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )* )
            // InternalSolverLanguageParser.g:2173:3: this_ExponentialExpression_0= ruleExponentialExpression ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getExponentialExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_ExponentialExpression_0=ruleExponentialExpression();

            state._fsp--;


            			current = this_ExponentialExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:2181:3: ( () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Asterisk||LA26_0==Solidus) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:2182:4: () ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) ) ( (lv_right_3_0= ruleExponentialExpression ) )
            	    {
            	    // InternalSolverLanguageParser.g:2182:4: ()
            	    // InternalSolverLanguageParser.g:2183:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getBinaryExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSolverLanguageParser.g:2189:4: ( (lv_op_2_0= ruleMultiplicativeBinaryOperator ) )
            	    // InternalSolverLanguageParser.g:2190:5: (lv_op_2_0= ruleMultiplicativeBinaryOperator )
            	    {
            	    // InternalSolverLanguageParser.g:2190:5: (lv_op_2_0= ruleMultiplicativeBinaryOperator )
            	    // InternalSolverLanguageParser.g:2191:6: lv_op_2_0= ruleMultiplicativeBinaryOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpMultiplicativeBinaryOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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

            	    // InternalSolverLanguageParser.g:2208:4: ( (lv_right_3_0= ruleExponentialExpression ) )
            	    // InternalSolverLanguageParser.g:2209:5: (lv_right_3_0= ruleExponentialExpression )
            	    {
            	    // InternalSolverLanguageParser.g:2209:5: (lv_right_3_0= ruleExponentialExpression )
            	    // InternalSolverLanguageParser.g:2210:6: lv_right_3_0= ruleExponentialExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightExponentialExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
            	    break loop26;
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
    // InternalSolverLanguageParser.g:2232:1: entryRuleExponentialExpression returns [EObject current=null] : iv_ruleExponentialExpression= ruleExponentialExpression EOF ;
    public final EObject entryRuleExponentialExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialExpression = null;


        try {
            // InternalSolverLanguageParser.g:2232:62: (iv_ruleExponentialExpression= ruleExponentialExpression EOF )
            // InternalSolverLanguageParser.g:2233:2: iv_ruleExponentialExpression= ruleExponentialExpression EOF
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
    // InternalSolverLanguageParser.g:2239:1: ruleExponentialExpression returns [EObject current=null] : (this_CastExpression_0= ruleCastExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )? ) ;
    public final EObject ruleExponentialExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CastExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2245:2: ( (this_CastExpression_0= ruleCastExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )? ) )
            // InternalSolverLanguageParser.g:2246:2: (this_CastExpression_0= ruleCastExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )? )
            {
            // InternalSolverLanguageParser.g:2246:2: (this_CastExpression_0= ruleCastExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )? )
            // InternalSolverLanguageParser.g:2247:3: this_CastExpression_0= ruleCastExpression ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getExponentialExpressionAccess().getCastExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_CastExpression_0=ruleCastExpression();

            state._fsp--;


            			current = this_CastExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:2255:3: ( () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleCastExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==CircumflexAccent) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSolverLanguageParser.g:2256:4: () ( (lv_op_2_0= ruleExponentialOp ) ) ( (lv_right_3_0= ruleCastExpression ) )
                    {
                    // InternalSolverLanguageParser.g:2256:4: ()
                    // InternalSolverLanguageParser.g:2257:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExponentialExpressionAccess().getBinaryExpressionLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSolverLanguageParser.g:2263:4: ( (lv_op_2_0= ruleExponentialOp ) )
                    // InternalSolverLanguageParser.g:2264:5: (lv_op_2_0= ruleExponentialOp )
                    {
                    // InternalSolverLanguageParser.g:2264:5: (lv_op_2_0= ruleExponentialOp )
                    // InternalSolverLanguageParser.g:2265:6: lv_op_2_0= ruleExponentialOp
                    {

                    						newCompositeNode(grammarAccess.getExponentialExpressionAccess().getOpExponentialOpEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalSolverLanguageParser.g:2282:4: ( (lv_right_3_0= ruleCastExpression ) )
                    // InternalSolverLanguageParser.g:2283:5: (lv_right_3_0= ruleCastExpression )
                    {
                    // InternalSolverLanguageParser.g:2283:5: (lv_right_3_0= ruleCastExpression )
                    // InternalSolverLanguageParser.g:2284:6: lv_right_3_0= ruleCastExpression
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
    // InternalSolverLanguageParser.g:2306:1: entryRuleCastExpression returns [EObject current=null] : iv_ruleCastExpression= ruleCastExpression EOF ;
    public final EObject entryRuleCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpression = null;


        try {
            // InternalSolverLanguageParser.g:2306:55: (iv_ruleCastExpression= ruleCastExpression EOF )
            // InternalSolverLanguageParser.g:2307:2: iv_ruleCastExpression= ruleCastExpression EOF
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
    // InternalSolverLanguageParser.g:2313:1: ruleCastExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= As ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryExpression_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2319:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= As ( ( ruleQualifiedName ) ) )? ) )
            // InternalSolverLanguageParser.g:2320:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= As ( ( ruleQualifiedName ) ) )? )
            {
            // InternalSolverLanguageParser.g:2320:2: (this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= As ( ( ruleQualifiedName ) ) )? )
            // InternalSolverLanguageParser.g:2321:3: this_UnaryExpression_0= ruleUnaryExpression ( () otherlv_2= As ( ( ruleQualifiedName ) ) )?
            {

            			newCompositeNode(grammarAccess.getCastExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:2329:3: ( () otherlv_2= As ( ( ruleQualifiedName ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==As) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSolverLanguageParser.g:2330:4: () otherlv_2= As ( ( ruleQualifiedName ) )
                    {
                    // InternalSolverLanguageParser.g:2330:4: ()
                    // InternalSolverLanguageParser.g:2331:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getCastExpressionAccess().getCastExpressionBodyAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,As,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getCastExpressionAccess().getAsKeyword_1_1());
                    			
                    // InternalSolverLanguageParser.g:2341:4: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:2342:5: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:2342:5: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:2343:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCastExpressionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCastExpressionAccess().getTargetTypeSymbolCrossReference_1_2_0());
                    					
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
    // InternalSolverLanguageParser.g:2362:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalSolverLanguageParser.g:2362:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalSolverLanguageParser.g:2363:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalSolverLanguageParser.g:2369:1: ruleUnaryExpression returns [EObject current=null] : (this_BracedAggregateExpression_0= ruleBracedAggregateExpression | ( () ( (lv_op_2_0= ruleUnaryOperator ) ) ( (lv_body_3_0= ruleBracedAggregateExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BracedAggregateExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2375:2: ( (this_BracedAggregateExpression_0= ruleBracedAggregateExpression | ( () ( (lv_op_2_0= ruleUnaryOperator ) ) ( (lv_body_3_0= ruleBracedAggregateExpression ) ) ) ) )
            // InternalSolverLanguageParser.g:2376:2: (this_BracedAggregateExpression_0= ruleBracedAggregateExpression | ( () ( (lv_op_2_0= ruleUnaryOperator ) ) ( (lv_body_3_0= ruleBracedAggregateExpression ) ) ) )
            {
            // InternalSolverLanguageParser.g:2376:2: (this_BracedAggregateExpression_0= ruleBracedAggregateExpression | ( () ( (lv_op_2_0= ruleUnaryOperator ) ) ( (lv_body_3_0= ruleBracedAggregateExpression ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Unknown||LA29_0==Object||(LA29_0>=Count && LA29_0<=False)||LA29_0==True||LA29_0==Inf||LA29_0==LeftParenthesis||LA29_0==LeftSquareBracket||(LA29_0>=Tilde && LA29_0<=RULE_QUOTED_ID)||(LA29_0>=RULE_ID && LA29_0<=RULE_INT)) ) {
                alt29=1;
            }
            else if ( (LA29_0==ExclamationMark||LA29_0==PlusSign||LA29_0==HyphenMinus||LA29_0==QuestionMark) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalSolverLanguageParser.g:2377:3: this_BracedAggregateExpression_0= ruleBracedAggregateExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getBracedAggregateExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BracedAggregateExpression_0=ruleBracedAggregateExpression();

                    state._fsp--;


                    			current = this_BracedAggregateExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:2386:3: ( () ( (lv_op_2_0= ruleUnaryOperator ) ) ( (lv_body_3_0= ruleBracedAggregateExpression ) ) )
                    {
                    // InternalSolverLanguageParser.g:2386:3: ( () ( (lv_op_2_0= ruleUnaryOperator ) ) ( (lv_body_3_0= ruleBracedAggregateExpression ) ) )
                    // InternalSolverLanguageParser.g:2387:4: () ( (lv_op_2_0= ruleUnaryOperator ) ) ( (lv_body_3_0= ruleBracedAggregateExpression ) )
                    {
                    // InternalSolverLanguageParser.g:2387:4: ()
                    // InternalSolverLanguageParser.g:2388:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSolverLanguageParser.g:2394:4: ( (lv_op_2_0= ruleUnaryOperator ) )
                    // InternalSolverLanguageParser.g:2395:5: (lv_op_2_0= ruleUnaryOperator )
                    {
                    // InternalSolverLanguageParser.g:2395:5: (lv_op_2_0= ruleUnaryOperator )
                    // InternalSolverLanguageParser.g:2396:6: lv_op_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_op_2_0=ruleUnaryOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.UnaryOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSolverLanguageParser.g:2413:4: ( (lv_body_3_0= ruleBracedAggregateExpression ) )
                    // InternalSolverLanguageParser.g:2414:5: (lv_body_3_0= ruleBracedAggregateExpression )
                    {
                    // InternalSolverLanguageParser.g:2414:5: (lv_body_3_0= ruleBracedAggregateExpression )
                    // InternalSolverLanguageParser.g:2415:6: lv_body_3_0= ruleBracedAggregateExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getBodyBracedAggregateExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_3_0=ruleBracedAggregateExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_3_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.BracedAggregateExpression");
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


    // $ANTLR start "entryRuleBracedAggregateExpression"
    // InternalSolverLanguageParser.g:2437:1: entryRuleBracedAggregateExpression returns [EObject current=null] : iv_ruleBracedAggregateExpression= ruleBracedAggregateExpression EOF ;
    public final EObject entryRuleBracedAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracedAggregateExpression = null;


        try {
            // InternalSolverLanguageParser.g:2437:66: (iv_ruleBracedAggregateExpression= ruleBracedAggregateExpression EOF )
            // InternalSolverLanguageParser.g:2438:2: iv_ruleBracedAggregateExpression= ruleBracedAggregateExpression EOF
            {
             newCompositeNode(grammarAccess.getBracedAggregateExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBracedAggregateExpression=ruleBracedAggregateExpression();

            state._fsp--;

             current =iv_ruleBracedAggregateExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBracedAggregateExpression"


    // $ANTLR start "ruleBracedAggregateExpression"
    // InternalSolverLanguageParser.g:2444:1: ruleBracedAggregateExpression returns [EObject current=null] : (this_AtomicExpression_0= ruleAtomicExpression | this_Aggregation_1= ruleAggregation | this_Count_2= ruleCount ) ;
    public final EObject ruleBracedAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExpression_0 = null;

        EObject this_Aggregation_1 = null;

        EObject this_Count_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2450:2: ( (this_AtomicExpression_0= ruleAtomicExpression | this_Aggregation_1= ruleAggregation | this_Count_2= ruleCount ) )
            // InternalSolverLanguageParser.g:2451:2: (this_AtomicExpression_0= ruleAtomicExpression | this_Aggregation_1= ruleAggregation | this_Count_2= ruleCount )
            {
            // InternalSolverLanguageParser.g:2451:2: (this_AtomicExpression_0= ruleAtomicExpression | this_Aggregation_1= ruleAggregation | this_Count_2= ruleCount )
            int alt30=3;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalSolverLanguageParser.g:2452:3: this_AtomicExpression_0= ruleAtomicExpression
                    {

                    			newCompositeNode(grammarAccess.getBracedAggregateExpressionAccess().getAtomicExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicExpression_0=ruleAtomicExpression();

                    state._fsp--;


                    			current = this_AtomicExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:2461:3: this_Aggregation_1= ruleAggregation
                    {

                    			newCompositeNode(grammarAccess.getBracedAggregateExpressionAccess().getAggregationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Aggregation_1=ruleAggregation();

                    state._fsp--;


                    			current = this_Aggregation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:2470:3: this_Count_2= ruleCount
                    {

                    			newCompositeNode(grammarAccess.getBracedAggregateExpressionAccess().getCountParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Count_2=ruleCount();

                    state._fsp--;


                    			current = this_Count_2;
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
    // $ANTLR end "ruleBracedAggregateExpression"


    // $ANTLR start "entryRuleAggregation"
    // InternalSolverLanguageParser.g:2482:1: entryRuleAggregation returns [EObject current=null] : iv_ruleAggregation= ruleAggregation EOF ;
    public final EObject entryRuleAggregation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregation = null;


        try {
            // InternalSolverLanguageParser.g:2482:52: (iv_ruleAggregation= ruleAggregation EOF )
            // InternalSolverLanguageParser.g:2483:2: iv_ruleAggregation= ruleAggregation EOF
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
    // InternalSolverLanguageParser.g:2489:1: ruleAggregation returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= LeftCurlyBracket ( (lv_value_2_0= ruleExpression ) ) otherlv_3= VerticalLine ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleAggregation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_condition_4_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2495:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= LeftCurlyBracket ( (lv_value_2_0= ruleExpression ) ) otherlv_3= VerticalLine ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= RightCurlyBracket ) )
            // InternalSolverLanguageParser.g:2496:2: ( ( ( ruleQualifiedName ) ) otherlv_1= LeftCurlyBracket ( (lv_value_2_0= ruleExpression ) ) otherlv_3= VerticalLine ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= RightCurlyBracket )
            {
            // InternalSolverLanguageParser.g:2496:2: ( ( ( ruleQualifiedName ) ) otherlv_1= LeftCurlyBracket ( (lv_value_2_0= ruleExpression ) ) otherlv_3= VerticalLine ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= RightCurlyBracket )
            // InternalSolverLanguageParser.g:2497:3: ( ( ruleQualifiedName ) ) otherlv_1= LeftCurlyBracket ( (lv_value_2_0= ruleExpression ) ) otherlv_3= VerticalLine ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= RightCurlyBracket
            {
            // InternalSolverLanguageParser.g:2497:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:2498:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:2498:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:2499:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAggregationAccess().getOpSymbolCrossReference_0_0());
            				
            pushFollow(FOLLOW_20);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAggregationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSolverLanguageParser.g:2517:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:2518:4: (lv_value_2_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:2518:4: (lv_value_2_0= ruleExpression )
            // InternalSolverLanguageParser.g:2519:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAggregationAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,VerticalLine,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getAggregationAccess().getVerticalLineKeyword_3());
            		
            // InternalSolverLanguageParser.g:2540:3: ( (lv_condition_4_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:2541:4: (lv_condition_4_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:2541:4: (lv_condition_4_0= ruleExpression )
            // InternalSolverLanguageParser.g:2542:5: lv_condition_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAggregationAccess().getConditionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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


    // $ANTLR start "entryRuleCount"
    // InternalSolverLanguageParser.g:2567:1: entryRuleCount returns [EObject current=null] : iv_ruleCount= ruleCount EOF ;
    public final EObject entryRuleCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCount = null;


        try {
            // InternalSolverLanguageParser.g:2567:46: (iv_ruleCount= ruleCount EOF )
            // InternalSolverLanguageParser.g:2568:2: iv_ruleCount= ruleCount EOF
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
    // InternalSolverLanguageParser.g:2574:1: ruleCount returns [EObject current=null] : (otherlv_0= Count otherlv_1= LeftCurlyBracket ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= RightCurlyBracket ) ;
    public final EObject ruleCount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2580:2: ( (otherlv_0= Count otherlv_1= LeftCurlyBracket ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= RightCurlyBracket ) )
            // InternalSolverLanguageParser.g:2581:2: (otherlv_0= Count otherlv_1= LeftCurlyBracket ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= RightCurlyBracket )
            {
            // InternalSolverLanguageParser.g:2581:2: (otherlv_0= Count otherlv_1= LeftCurlyBracket ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= RightCurlyBracket )
            // InternalSolverLanguageParser.g:2582:3: otherlv_0= Count otherlv_1= LeftCurlyBracket ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Count,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getCountAccess().getCountKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCountAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSolverLanguageParser.g:2590:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:2591:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:2591:4: (lv_condition_2_0= ruleExpression )
            // InternalSolverLanguageParser.g:2592:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCountAccess().getConditionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
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


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalSolverLanguageParser.g:2617:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalSolverLanguageParser.g:2617:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalSolverLanguageParser.g:2618:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalSolverLanguageParser.g:2624:1: ruleAtomicExpression returns [EObject current=null] : (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) ) ;
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
            // InternalSolverLanguageParser.g:2630:2: ( (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) ) )
            // InternalSolverLanguageParser.g:2631:2: (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) )
            {
            // InternalSolverLanguageParser.g:2631:2: (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) )
            int alt31=5;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalSolverLanguageParser.g:2632:3: this_Reference_0= ruleReference
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
                    // InternalSolverLanguageParser.g:2641:3: this_Call_1= ruleCall
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
                    // InternalSolverLanguageParser.g:2650:3: this_Interval_2= ruleInterval
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
                    // InternalSolverLanguageParser.g:2659:3: this_Literal_3= ruleLiteral
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
                    // InternalSolverLanguageParser.g:2668:3: (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis )
                    {
                    // InternalSolverLanguageParser.g:2668:3: (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis )
                    // InternalSolverLanguageParser.g:2669:4: otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis
                    {
                    otherlv_4=(Token)match(input,LeftParenthesis,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomicExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_41);
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
    // InternalSolverLanguageParser.g:2690:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalSolverLanguageParser.g:2690:45: (iv_ruleCall= ruleCall EOF )
            // InternalSolverLanguageParser.g:2691:2: iv_ruleCall= ruleCall EOF
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
    // InternalSolverLanguageParser.g:2697:1: ruleCall returns [EObject current=null] : ( ( (lv_functor_0_0= ruleReference ) ) ( (lv_argumentList_1_0= ruleArgumentList ) ) ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        EObject lv_functor_0_0 = null;

        EObject lv_argumentList_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2703:2: ( ( ( (lv_functor_0_0= ruleReference ) ) ( (lv_argumentList_1_0= ruleArgumentList ) ) ) )
            // InternalSolverLanguageParser.g:2704:2: ( ( (lv_functor_0_0= ruleReference ) ) ( (lv_argumentList_1_0= ruleArgumentList ) ) )
            {
            // InternalSolverLanguageParser.g:2704:2: ( ( (lv_functor_0_0= ruleReference ) ) ( (lv_argumentList_1_0= ruleArgumentList ) ) )
            // InternalSolverLanguageParser.g:2705:3: ( (lv_functor_0_0= ruleReference ) ) ( (lv_argumentList_1_0= ruleArgumentList ) )
            {
            // InternalSolverLanguageParser.g:2705:3: ( (lv_functor_0_0= ruleReference ) )
            // InternalSolverLanguageParser.g:2706:4: (lv_functor_0_0= ruleReference )
            {
            // InternalSolverLanguageParser.g:2706:4: (lv_functor_0_0= ruleReference )
            // InternalSolverLanguageParser.g:2707:5: lv_functor_0_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getCallAccess().getFunctorReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalSolverLanguageParser.g:2724:3: ( (lv_argumentList_1_0= ruleArgumentList ) )
            // InternalSolverLanguageParser.g:2725:4: (lv_argumentList_1_0= ruleArgumentList )
            {
            // InternalSolverLanguageParser.g:2725:4: (lv_argumentList_1_0= ruleArgumentList )
            // InternalSolverLanguageParser.g:2726:5: lv_argumentList_1_0= ruleArgumentList
            {

            					newCompositeNode(grammarAccess.getCallAccess().getArgumentListArgumentListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_argumentList_1_0=ruleArgumentList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCallRule());
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


            }


            	leaveRule();

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
    // InternalSolverLanguageParser.g:2747:1: entryRuleArgumentList returns [EObject current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final EObject entryRuleArgumentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentList = null;


        try {
            // InternalSolverLanguageParser.g:2747:53: (iv_ruleArgumentList= ruleArgumentList EOF )
            // InternalSolverLanguageParser.g:2748:2: iv_ruleArgumentList= ruleArgumentList EOF
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
    // InternalSolverLanguageParser.g:2754:1: ruleArgumentList returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleArgumentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2760:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalSolverLanguageParser.g:2761:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalSolverLanguageParser.g:2761:2: ( () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis )
            // InternalSolverLanguageParser.g:2762:3: () otherlv_1= LeftParenthesis ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalSolverLanguageParser.g:2762:3: ()
            // InternalSolverLanguageParser.g:2763:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArgumentListAccess().getArgumentListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getArgumentListAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSolverLanguageParser.g:2773:3: ( ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Unknown||LA33_0==Object||(LA33_0>=Count && LA33_0<=False)||LA33_0==True||LA33_0==Inf||(LA33_0>=ExclamationMark && LA33_0<=LeftParenthesis)||(LA33_0>=Asterisk && LA33_0<=PlusSign)||LA33_0==HyphenMinus||(LA33_0>=QuestionMark && LA33_0<=LeftSquareBracket)||(LA33_0>=Tilde && LA33_0<=RULE_QUOTED_ID)||(LA33_0>=RULE_ID && LA33_0<=RULE_INT)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSolverLanguageParser.g:2774:4: ( (lv_arguments_2_0= ruleArgument ) ) (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )*
                    {
                    // InternalSolverLanguageParser.g:2774:4: ( (lv_arguments_2_0= ruleArgument ) )
                    // InternalSolverLanguageParser.g:2775:5: (lv_arguments_2_0= ruleArgument )
                    {
                    // InternalSolverLanguageParser.g:2775:5: (lv_arguments_2_0= ruleArgument )
                    // InternalSolverLanguageParser.g:2776:6: lv_arguments_2_0= ruleArgument
                    {

                    						newCompositeNode(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_43);
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

                    // InternalSolverLanguageParser.g:2793:4: (otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==Comma) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:2794:5: otherlv_3= Comma ( (lv_arguments_4_0= ruleArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_44); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArgumentListAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSolverLanguageParser.g:2798:5: ( (lv_arguments_4_0= ruleArgument ) )
                    	    // InternalSolverLanguageParser.g:2799:6: (lv_arguments_4_0= ruleArgument )
                    	    {
                    	    // InternalSolverLanguageParser.g:2799:6: (lv_arguments_4_0= ruleArgument )
                    	    // InternalSolverLanguageParser.g:2800:7: lv_arguments_4_0= ruleArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getArgumentListAccess().getArgumentsArgumentParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
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
                    	    break loop32;
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
    // InternalSolverLanguageParser.g:2827:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalSolverLanguageParser.g:2827:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalSolverLanguageParser.g:2828:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalSolverLanguageParser.g:2834:1: ruleArgument returns [EObject current=null] : (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedVariableArgument_2= ruleTypedVariableArgument | this_TypedStarArgument_3= ruleTypedStarArgument ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionArgument_0 = null;

        EObject this_StarArgument_1 = null;

        EObject this_TypedVariableArgument_2 = null;

        EObject this_TypedStarArgument_3 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2840:2: ( (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedVariableArgument_2= ruleTypedVariableArgument | this_TypedStarArgument_3= ruleTypedStarArgument ) )
            // InternalSolverLanguageParser.g:2841:2: (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedVariableArgument_2= ruleTypedVariableArgument | this_TypedStarArgument_3= ruleTypedStarArgument )
            {
            // InternalSolverLanguageParser.g:2841:2: (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedVariableArgument_2= ruleTypedVariableArgument | this_TypedStarArgument_3= ruleTypedStarArgument )
            int alt34=4;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalSolverLanguageParser.g:2842:3: this_ExpressionArgument_0= ruleExpressionArgument
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
                    // InternalSolverLanguageParser.g:2851:3: this_StarArgument_1= ruleStarArgument
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
                    // InternalSolverLanguageParser.g:2860:3: this_TypedVariableArgument_2= ruleTypedVariableArgument
                    {

                    			newCompositeNode(grammarAccess.getArgumentAccess().getTypedVariableArgumentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypedVariableArgument_2=ruleTypedVariableArgument();

                    state._fsp--;


                    			current = this_TypedVariableArgument_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:2869:3: this_TypedStarArgument_3= ruleTypedStarArgument
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
    // InternalSolverLanguageParser.g:2881:1: entryRuleExpressionArgument returns [EObject current=null] : iv_ruleExpressionArgument= ruleExpressionArgument EOF ;
    public final EObject entryRuleExpressionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionArgument = null;


        try {
            // InternalSolverLanguageParser.g:2881:59: (iv_ruleExpressionArgument= ruleExpressionArgument EOF )
            // InternalSolverLanguageParser.g:2882:2: iv_ruleExpressionArgument= ruleExpressionArgument EOF
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
    // InternalSolverLanguageParser.g:2888:1: ruleExpressionArgument returns [EObject current=null] : ( (lv_expression_0_0= ruleComparisonExpression ) ) ;
    public final EObject ruleExpressionArgument() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2894:2: ( ( (lv_expression_0_0= ruleComparisonExpression ) ) )
            // InternalSolverLanguageParser.g:2895:2: ( (lv_expression_0_0= ruleComparisonExpression ) )
            {
            // InternalSolverLanguageParser.g:2895:2: ( (lv_expression_0_0= ruleComparisonExpression ) )
            // InternalSolverLanguageParser.g:2896:3: (lv_expression_0_0= ruleComparisonExpression )
            {
            // InternalSolverLanguageParser.g:2896:3: (lv_expression_0_0= ruleComparisonExpression )
            // InternalSolverLanguageParser.g:2897:4: lv_expression_0_0= ruleComparisonExpression
            {

            				newCompositeNode(grammarAccess.getExpressionArgumentAccess().getExpressionComparisonExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleComparisonExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExpressionArgumentRule());
            				}
            				set(
            					current,
            					"expression",
            					lv_expression_0_0,
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
    // InternalSolverLanguageParser.g:2917:1: entryRuleStarArgument returns [EObject current=null] : iv_ruleStarArgument= ruleStarArgument EOF ;
    public final EObject entryRuleStarArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStarArgument = null;


        try {
            // InternalSolverLanguageParser.g:2917:53: (iv_ruleStarArgument= ruleStarArgument EOF )
            // InternalSolverLanguageParser.g:2918:2: iv_ruleStarArgument= ruleStarArgument EOF
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
    // InternalSolverLanguageParser.g:2924:1: ruleStarArgument returns [EObject current=null] : ( () otherlv_1= Asterisk ) ;
    public final EObject ruleStarArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2930:2: ( ( () otherlv_1= Asterisk ) )
            // InternalSolverLanguageParser.g:2931:2: ( () otherlv_1= Asterisk )
            {
            // InternalSolverLanguageParser.g:2931:2: ( () otherlv_1= Asterisk )
            // InternalSolverLanguageParser.g:2932:3: () otherlv_1= Asterisk
            {
            // InternalSolverLanguageParser.g:2932:3: ()
            // InternalSolverLanguageParser.g:2933:4: 
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


    // $ANTLR start "entryRuleTypedVariableArgument"
    // InternalSolverLanguageParser.g:2947:1: entryRuleTypedVariableArgument returns [EObject current=null] : iv_ruleTypedVariableArgument= ruleTypedVariableArgument EOF ;
    public final EObject entryRuleTypedVariableArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedVariableArgument = null;


        try {
            // InternalSolverLanguageParser.g:2947:62: (iv_ruleTypedVariableArgument= ruleTypedVariableArgument EOF )
            // InternalSolverLanguageParser.g:2948:2: iv_ruleTypedVariableArgument= ruleTypedVariableArgument EOF
            {
             newCompositeNode(grammarAccess.getTypedVariableArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedVariableArgument=ruleTypedVariableArgument();

            state._fsp--;

             current =iv_ruleTypedVariableArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedVariableArgument"


    // $ANTLR start "ruleTypedVariableArgument"
    // InternalSolverLanguageParser.g:2954:1: ruleTypedVariableArgument returns [EObject current=null] : ( ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypedVariableArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_typeReference_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:2960:2: ( ( ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSolverLanguageParser.g:2961:2: ( ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSolverLanguageParser.g:2961:2: ( ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSolverLanguageParser.g:2962:3: ( (lv_typeReference_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalSolverLanguageParser.g:2962:3: ( (lv_typeReference_0_0= ruleTypeReference ) )
            // InternalSolverLanguageParser.g:2963:4: (lv_typeReference_0_0= ruleTypeReference )
            {
            // InternalSolverLanguageParser.g:2963:4: (lv_typeReference_0_0= ruleTypeReference )
            // InternalSolverLanguageParser.g:2964:5: lv_typeReference_0_0= ruleTypeReference
            {

            					newCompositeNode(grammarAccess.getTypedVariableArgumentAccess().getTypeReferenceTypeReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_typeReference_0_0=ruleTypeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedVariableArgumentRule());
            					}
            					set(
            						current,
            						"typeReference",
            						lv_typeReference_0_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.TypeReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:2981:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolverLanguageParser.g:2982:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolverLanguageParser.g:2982:4: (lv_name_1_0= RULE_ID )
            // InternalSolverLanguageParser.g:2983:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypedVariableArgumentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedVariableArgumentRule());
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
    // $ANTLR end "ruleTypedVariableArgument"


    // $ANTLR start "entryRuleTypedStarArgument"
    // InternalSolverLanguageParser.g:3003:1: entryRuleTypedStarArgument returns [EObject current=null] : iv_ruleTypedStarArgument= ruleTypedStarArgument EOF ;
    public final EObject entryRuleTypedStarArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedStarArgument = null;


        try {
            // InternalSolverLanguageParser.g:3003:58: (iv_ruleTypedStarArgument= ruleTypedStarArgument EOF )
            // InternalSolverLanguageParser.g:3004:2: iv_ruleTypedStarArgument= ruleTypedStarArgument EOF
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
    // InternalSolverLanguageParser.g:3010:1: ruleTypedStarArgument returns [EObject current=null] : ( ( (lv_typeReference_0_0= ruleTypeReference ) ) otherlv_1= Asterisk ) ;
    public final EObject ruleTypedStarArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_typeReference_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3016:2: ( ( ( (lv_typeReference_0_0= ruleTypeReference ) ) otherlv_1= Asterisk ) )
            // InternalSolverLanguageParser.g:3017:2: ( ( (lv_typeReference_0_0= ruleTypeReference ) ) otherlv_1= Asterisk )
            {
            // InternalSolverLanguageParser.g:3017:2: ( ( (lv_typeReference_0_0= ruleTypeReference ) ) otherlv_1= Asterisk )
            // InternalSolverLanguageParser.g:3018:3: ( (lv_typeReference_0_0= ruleTypeReference ) ) otherlv_1= Asterisk
            {
            // InternalSolverLanguageParser.g:3018:3: ( (lv_typeReference_0_0= ruleTypeReference ) )
            // InternalSolverLanguageParser.g:3019:4: (lv_typeReference_0_0= ruleTypeReference )
            {
            // InternalSolverLanguageParser.g:3019:4: (lv_typeReference_0_0= ruleTypeReference )
            // InternalSolverLanguageParser.g:3020:5: lv_typeReference_0_0= ruleTypeReference
            {

            					newCompositeNode(grammarAccess.getTypedStarArgumentAccess().getTypeReferenceTypeReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_45);
            lv_typeReference_0_0=ruleTypeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedStarArgumentRule());
            					}
            					set(
            						current,
            						"typeReference",
            						lv_typeReference_0_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.TypeReference");
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
    // InternalSolverLanguageParser.g:3045:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalSolverLanguageParser.g:3045:50: (iv_ruleReference= ruleReference EOF )
            // InternalSolverLanguageParser.g:3046:2: iv_ruleReference= ruleReference EOF
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
    // InternalSolverLanguageParser.g:3052:1: ruleReference returns [EObject current=null] : ( ( (lv_components_0_0= rulePathComponent ) ) (otherlv_1= FullStop ( (lv_components_2_0= rulePathComponent ) ) )* ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_components_0_0 = null;

        EObject lv_components_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3058:2: ( ( ( (lv_components_0_0= rulePathComponent ) ) (otherlv_1= FullStop ( (lv_components_2_0= rulePathComponent ) ) )* ) )
            // InternalSolverLanguageParser.g:3059:2: ( ( (lv_components_0_0= rulePathComponent ) ) (otherlv_1= FullStop ( (lv_components_2_0= rulePathComponent ) ) )* )
            {
            // InternalSolverLanguageParser.g:3059:2: ( ( (lv_components_0_0= rulePathComponent ) ) (otherlv_1= FullStop ( (lv_components_2_0= rulePathComponent ) ) )* )
            // InternalSolverLanguageParser.g:3060:3: ( (lv_components_0_0= rulePathComponent ) ) (otherlv_1= FullStop ( (lv_components_2_0= rulePathComponent ) ) )*
            {
            // InternalSolverLanguageParser.g:3060:3: ( (lv_components_0_0= rulePathComponent ) )
            // InternalSolverLanguageParser.g:3061:4: (lv_components_0_0= rulePathComponent )
            {
            // InternalSolverLanguageParser.g:3061:4: (lv_components_0_0= rulePathComponent )
            // InternalSolverLanguageParser.g:3062:5: lv_components_0_0= rulePathComponent
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getComponentsPathComponentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_46);
            lv_components_0_0=rulePathComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					add(
            						current,
            						"components",
            						lv_components_0_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.PathComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:3079:3: (otherlv_1= FullStop ( (lv_components_2_0= rulePathComponent ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==FullStop) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:3080:4: otherlv_1= FullStop ( (lv_components_2_0= rulePathComponent ) )
            	    {
            	    otherlv_1=(Token)match(input,FullStop,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalSolverLanguageParser.g:3084:4: ( (lv_components_2_0= rulePathComponent ) )
            	    // InternalSolverLanguageParser.g:3085:5: (lv_components_2_0= rulePathComponent )
            	    {
            	    // InternalSolverLanguageParser.g:3085:5: (lv_components_2_0= rulePathComponent )
            	    // InternalSolverLanguageParser.g:3086:6: lv_components_2_0= rulePathComponent
            	    {

            	    						newCompositeNode(grammarAccess.getReferenceAccess().getComponentsPathComponentParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_components_2_0=rulePathComponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getReferenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_2_0,
            	    							"org.eclipse.viatra.solver.language.SolverLanguage.PathComponent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRulePathComponent"
    // InternalSolverLanguageParser.g:3108:1: entryRulePathComponent returns [EObject current=null] : iv_rulePathComponent= rulePathComponent EOF ;
    public final EObject entryRulePathComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathComponent = null;


        try {
            // InternalSolverLanguageParser.g:3108:54: (iv_rulePathComponent= rulePathComponent EOF )
            // InternalSolverLanguageParser.g:3109:2: iv_rulePathComponent= rulePathComponent EOF
            {
             newCompositeNode(grammarAccess.getPathComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathComponent=rulePathComponent();

            state._fsp--;

             current =iv_rulePathComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathComponent"


    // $ANTLR start "rulePathComponent"
    // InternalSolverLanguageParser.g:3115:1: rulePathComponent returns [EObject current=null] : ( ( (lv_inverse_0_0= Tilde ) )? ( ( ruleQualifiedName ) ) ( ( (lv_transitiveClosure_2_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_3_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )? ) ;
    public final EObject rulePathComponent() throws RecognitionException {
        EObject current = null;

        Token lv_inverse_0_0=null;
        Token lv_transitiveClosure_2_0=null;
        Token lv_reflexiveTransitiveClosure_3_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3121:2: ( ( ( (lv_inverse_0_0= Tilde ) )? ( ( ruleQualifiedName ) ) ( ( (lv_transitiveClosure_2_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_3_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )? ) )
            // InternalSolverLanguageParser.g:3122:2: ( ( (lv_inverse_0_0= Tilde ) )? ( ( ruleQualifiedName ) ) ( ( (lv_transitiveClosure_2_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_3_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )? )
            {
            // InternalSolverLanguageParser.g:3122:2: ( ( (lv_inverse_0_0= Tilde ) )? ( ( ruleQualifiedName ) ) ( ( (lv_transitiveClosure_2_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_3_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )? )
            // InternalSolverLanguageParser.g:3123:3: ( (lv_inverse_0_0= Tilde ) )? ( ( ruleQualifiedName ) ) ( ( (lv_transitiveClosure_2_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_3_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )?
            {
            // InternalSolverLanguageParser.g:3123:3: ( (lv_inverse_0_0= Tilde ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Tilde) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSolverLanguageParser.g:3124:4: (lv_inverse_0_0= Tilde )
                    {
                    // InternalSolverLanguageParser.g:3124:4: (lv_inverse_0_0= Tilde )
                    // InternalSolverLanguageParser.g:3125:5: lv_inverse_0_0= Tilde
                    {
                    lv_inverse_0_0=(Token)match(input,Tilde,FOLLOW_3); 

                    					newLeafNode(lv_inverse_0_0, grammarAccess.getPathComponentAccess().getInverseTildeKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPathComponentRule());
                    					}
                    					setWithLastConsumed(current, "inverse", true, "~");
                    				

                    }


                    }
                    break;

            }

            // InternalSolverLanguageParser.g:3137:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:3138:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:3138:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:3139:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPathComponentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPathComponentAccess().getSymbolSymbolCrossReference_1_0());
            				
            pushFollow(FOLLOW_47);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:3153:3: ( ( (lv_transitiveClosure_2_0= RULE_TRANSITIVE_CLOSURE ) ) | ( (lv_reflexiveTransitiveClosure_3_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) ) )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_TRANSITIVE_CLOSURE) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_REFLEXIVE_TRANSITIVE_CLOSURE) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // InternalSolverLanguageParser.g:3154:4: ( (lv_transitiveClosure_2_0= RULE_TRANSITIVE_CLOSURE ) )
                    {
                    // InternalSolverLanguageParser.g:3154:4: ( (lv_transitiveClosure_2_0= RULE_TRANSITIVE_CLOSURE ) )
                    // InternalSolverLanguageParser.g:3155:5: (lv_transitiveClosure_2_0= RULE_TRANSITIVE_CLOSURE )
                    {
                    // InternalSolverLanguageParser.g:3155:5: (lv_transitiveClosure_2_0= RULE_TRANSITIVE_CLOSURE )
                    // InternalSolverLanguageParser.g:3156:6: lv_transitiveClosure_2_0= RULE_TRANSITIVE_CLOSURE
                    {
                    lv_transitiveClosure_2_0=(Token)match(input,RULE_TRANSITIVE_CLOSURE,FOLLOW_2); 

                    						newLeafNode(lv_transitiveClosure_2_0, grammarAccess.getPathComponentAccess().getTransitiveClosureTRANSITIVE_CLOSURETerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPathComponentRule());
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
                    // InternalSolverLanguageParser.g:3173:4: ( (lv_reflexiveTransitiveClosure_3_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) )
                    {
                    // InternalSolverLanguageParser.g:3173:4: ( (lv_reflexiveTransitiveClosure_3_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE ) )
                    // InternalSolverLanguageParser.g:3174:5: (lv_reflexiveTransitiveClosure_3_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE )
                    {
                    // InternalSolverLanguageParser.g:3174:5: (lv_reflexiveTransitiveClosure_3_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE )
                    // InternalSolverLanguageParser.g:3175:6: lv_reflexiveTransitiveClosure_3_0= RULE_REFLEXIVE_TRANSITIVE_CLOSURE
                    {
                    lv_reflexiveTransitiveClosure_3_0=(Token)match(input,RULE_REFLEXIVE_TRANSITIVE_CLOSURE,FOLLOW_2); 

                    						newLeafNode(lv_reflexiveTransitiveClosure_3_0, grammarAccess.getPathComponentAccess().getReflexiveTransitiveClosureREFLEXIVE_TRANSITIVE_CLOSURETerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPathComponentRule());
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


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathComponent"


    // $ANTLR start "entryRuleInterval"
    // InternalSolverLanguageParser.g:3196:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalSolverLanguageParser.g:3196:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalSolverLanguageParser.g:3197:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalSolverLanguageParser.g:3203:1: ruleInterval returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleAdditiveExpression ) ) otherlv_2= Comma ( (lv_upperBound_3_0= ruleAdditiveExpression ) ) otherlv_4= RightSquareBracket ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lowerBound_1_0 = null;

        EObject lv_upperBound_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3209:2: ( (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleAdditiveExpression ) ) otherlv_2= Comma ( (lv_upperBound_3_0= ruleAdditiveExpression ) ) otherlv_4= RightSquareBracket ) )
            // InternalSolverLanguageParser.g:3210:2: (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleAdditiveExpression ) ) otherlv_2= Comma ( (lv_upperBound_3_0= ruleAdditiveExpression ) ) otherlv_4= RightSquareBracket )
            {
            // InternalSolverLanguageParser.g:3210:2: (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleAdditiveExpression ) ) otherlv_2= Comma ( (lv_upperBound_3_0= ruleAdditiveExpression ) ) otherlv_4= RightSquareBracket )
            // InternalSolverLanguageParser.g:3211:3: otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= ruleAdditiveExpression ) ) otherlv_2= Comma ( (lv_upperBound_3_0= ruleAdditiveExpression ) ) otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSolverLanguageParser.g:3215:3: ( (lv_lowerBound_1_0= ruleAdditiveExpression ) )
            // InternalSolverLanguageParser.g:3216:4: (lv_lowerBound_1_0= ruleAdditiveExpression )
            {
            // InternalSolverLanguageParser.g:3216:4: (lv_lowerBound_1_0= ruleAdditiveExpression )
            // InternalSolverLanguageParser.g:3217:5: lv_lowerBound_1_0= ruleAdditiveExpression
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getLowerBoundAdditiveExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_lowerBound_1_0=ruleAdditiveExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervalRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.AdditiveExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Comma,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getCommaKeyword_2());
            		
            // InternalSolverLanguageParser.g:3238:3: ( (lv_upperBound_3_0= ruleAdditiveExpression ) )
            // InternalSolverLanguageParser.g:3239:4: (lv_upperBound_3_0= ruleAdditiveExpression )
            {
            // InternalSolverLanguageParser.g:3239:4: (lv_upperBound_3_0= ruleAdditiveExpression )
            // InternalSolverLanguageParser.g:3240:5: lv_upperBound_3_0= ruleAdditiveExpression
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getUpperBoundAdditiveExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_49);
            lv_upperBound_3_0=ruleAdditiveExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervalRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_3_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.AdditiveExpression");
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
    // InternalSolverLanguageParser.g:3265:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalSolverLanguageParser.g:3265:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalSolverLanguageParser.g:3266:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalSolverLanguageParser.g:3272:1: ruleLiteral returns [EObject current=null] : (this_LogicLiteral_0= ruleLogicLiteral | this_IntLiteral_1= ruleIntLiteral | this_RealLiteral_2= ruleRealLiteral | this_InfinityLiteral_3= ruleInfinityLiteral | this_EmptyLiteral_4= ruleEmptyLiteral | this_StringLiteral_5= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_LogicLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_RealLiteral_2 = null;

        EObject this_InfinityLiteral_3 = null;

        EObject this_EmptyLiteral_4 = null;

        EObject this_StringLiteral_5 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3278:2: ( (this_LogicLiteral_0= ruleLogicLiteral | this_IntLiteral_1= ruleIntLiteral | this_RealLiteral_2= ruleRealLiteral | this_InfinityLiteral_3= ruleInfinityLiteral | this_EmptyLiteral_4= ruleEmptyLiteral | this_StringLiteral_5= ruleStringLiteral ) )
            // InternalSolverLanguageParser.g:3279:2: (this_LogicLiteral_0= ruleLogicLiteral | this_IntLiteral_1= ruleIntLiteral | this_RealLiteral_2= ruleRealLiteral | this_InfinityLiteral_3= ruleInfinityLiteral | this_EmptyLiteral_4= ruleEmptyLiteral | this_StringLiteral_5= ruleStringLiteral )
            {
            // InternalSolverLanguageParser.g:3279:2: (this_LogicLiteral_0= ruleLogicLiteral | this_IntLiteral_1= ruleIntLiteral | this_RealLiteral_2= ruleRealLiteral | this_InfinityLiteral_3= ruleInfinityLiteral | this_EmptyLiteral_4= ruleEmptyLiteral | this_StringLiteral_5= ruleStringLiteral )
            int alt38=6;
            switch ( input.LA(1) ) {
            case Unknown:
            case Error:
            case False:
            case True:
                {
                alt38=1;
                }
                break;
            case RULE_INT:
                {
                int LA38_2 = input.LA(2);

                if ( (LA38_2==EOF||LA38_2==Else||LA38_2==Then||(LA38_2>=ExclamationMarkEqualsSign && LA38_2<=ColonHyphenMinus)||(LA38_2>=ColonEqualsSign && LA38_2<=As)||LA38_2==In||(LA38_2>=RightParenthesis && LA38_2<=HyphenMinus)||(LA38_2>=Solidus && LA38_2<=LessThanSign)||LA38_2==GreaterThanSign||(LA38_2>=RightSquareBracket && LA38_2<=CircumflexAccent)||(LA38_2>=VerticalLine && LA38_2<=RightCurlyBracket)||LA38_2==RULE_FULL_STOP) ) {
                    alt38=2;
                }
                else if ( (LA38_2==FullStop) ) {
                    alt38=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }
                }
                break;
            case Inf:
                {
                alt38=4;
                }
                break;
            case Empty:
                {
                alt38=5;
                }
                break;
            case RULE_STRING:
                {
                alt38=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalSolverLanguageParser.g:3280:3: this_LogicLiteral_0= ruleLogicLiteral
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
                    // InternalSolverLanguageParser.g:3289:3: this_IntLiteral_1= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:3298:3: this_RealLiteral_2= ruleRealLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_2=ruleRealLiteral();

                    state._fsp--;


                    			current = this_RealLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:3307:3: this_InfinityLiteral_3= ruleInfinityLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getInfinityLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_InfinityLiteral_3=ruleInfinityLiteral();

                    state._fsp--;


                    			current = this_InfinityLiteral_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSolverLanguageParser.g:3316:3: this_EmptyLiteral_4= ruleEmptyLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getEmptyLiteralParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EmptyLiteral_4=ruleEmptyLiteral();

                    state._fsp--;


                    			current = this_EmptyLiteral_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSolverLanguageParser.g:3325:3: this_StringLiteral_5= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_5=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_5;
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
    // InternalSolverLanguageParser.g:3337:1: entryRuleLogicLiteral returns [EObject current=null] : iv_ruleLogicLiteral= ruleLogicLiteral EOF ;
    public final EObject entryRuleLogicLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicLiteral = null;


        try {
            // InternalSolverLanguageParser.g:3337:53: (iv_ruleLogicLiteral= ruleLogicLiteral EOF )
            // InternalSolverLanguageParser.g:3338:2: iv_ruleLogicLiteral= ruleLogicLiteral EOF
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
    // InternalSolverLanguageParser.g:3344:1: ruleLogicLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleLogicValue ) ) ;
    public final EObject ruleLogicLiteral() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3350:2: ( ( (lv_value_0_0= ruleLogicValue ) ) )
            // InternalSolverLanguageParser.g:3351:2: ( (lv_value_0_0= ruleLogicValue ) )
            {
            // InternalSolverLanguageParser.g:3351:2: ( (lv_value_0_0= ruleLogicValue ) )
            // InternalSolverLanguageParser.g:3352:3: (lv_value_0_0= ruleLogicValue )
            {
            // InternalSolverLanguageParser.g:3352:3: (lv_value_0_0= ruleLogicValue )
            // InternalSolverLanguageParser.g:3353:4: lv_value_0_0= ruleLogicValue
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


    // $ANTLR start "entryRuleIntLiteral"
    // InternalSolverLanguageParser.g:3373:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalSolverLanguageParser.g:3373:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalSolverLanguageParser.g:3374:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalSolverLanguageParser.g:3380:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3386:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalSolverLanguageParser.g:3387:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalSolverLanguageParser.g:3387:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalSolverLanguageParser.g:3388:3: (lv_value_0_0= RULE_INT )
            {
            // InternalSolverLanguageParser.g:3388:3: (lv_value_0_0= RULE_INT )
            // InternalSolverLanguageParser.g:3389:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalSolverLanguageParser.g:3408:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalSolverLanguageParser.g:3408:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalSolverLanguageParser.g:3409:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;

             current =iv_ruleRealLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalSolverLanguageParser.g:3415:1: ruleRealLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleReal ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3421:2: ( ( (lv_value_0_0= ruleReal ) ) )
            // InternalSolverLanguageParser.g:3422:2: ( (lv_value_0_0= ruleReal ) )
            {
            // InternalSolverLanguageParser.g:3422:2: ( (lv_value_0_0= ruleReal ) )
            // InternalSolverLanguageParser.g:3423:3: (lv_value_0_0= ruleReal )
            {
            // InternalSolverLanguageParser.g:3423:3: (lv_value_0_0= ruleReal )
            // InternalSolverLanguageParser.g:3424:4: lv_value_0_0= ruleReal
            {

            				newCompositeNode(grammarAccess.getRealLiteralAccess().getValueRealParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleReal();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealLiteralRule());
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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleInfinityLiteral"
    // InternalSolverLanguageParser.g:3444:1: entryRuleInfinityLiteral returns [EObject current=null] : iv_ruleInfinityLiteral= ruleInfinityLiteral EOF ;
    public final EObject entryRuleInfinityLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfinityLiteral = null;


        try {
            // InternalSolverLanguageParser.g:3444:56: (iv_ruleInfinityLiteral= ruleInfinityLiteral EOF )
            // InternalSolverLanguageParser.g:3445:2: iv_ruleInfinityLiteral= ruleInfinityLiteral EOF
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
    // InternalSolverLanguageParser.g:3451:1: ruleInfinityLiteral returns [EObject current=null] : ( () otherlv_1= Inf ) ;
    public final EObject ruleInfinityLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3457:2: ( ( () otherlv_1= Inf ) )
            // InternalSolverLanguageParser.g:3458:2: ( () otherlv_1= Inf )
            {
            // InternalSolverLanguageParser.g:3458:2: ( () otherlv_1= Inf )
            // InternalSolverLanguageParser.g:3459:3: () otherlv_1= Inf
            {
            // InternalSolverLanguageParser.g:3459:3: ()
            // InternalSolverLanguageParser.g:3460:4: 
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


    // $ANTLR start "entryRuleEmptyLiteral"
    // InternalSolverLanguageParser.g:3474:1: entryRuleEmptyLiteral returns [EObject current=null] : iv_ruleEmptyLiteral= ruleEmptyLiteral EOF ;
    public final EObject entryRuleEmptyLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyLiteral = null;


        try {
            // InternalSolverLanguageParser.g:3474:53: (iv_ruleEmptyLiteral= ruleEmptyLiteral EOF )
            // InternalSolverLanguageParser.g:3475:2: iv_ruleEmptyLiteral= ruleEmptyLiteral EOF
            {
             newCompositeNode(grammarAccess.getEmptyLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmptyLiteral=ruleEmptyLiteral();

            state._fsp--;

             current =iv_ruleEmptyLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyLiteral"


    // $ANTLR start "ruleEmptyLiteral"
    // InternalSolverLanguageParser.g:3481:1: ruleEmptyLiteral returns [EObject current=null] : ( () otherlv_1= Empty ) ;
    public final EObject ruleEmptyLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3487:2: ( ( () otherlv_1= Empty ) )
            // InternalSolverLanguageParser.g:3488:2: ( () otherlv_1= Empty )
            {
            // InternalSolverLanguageParser.g:3488:2: ( () otherlv_1= Empty )
            // InternalSolverLanguageParser.g:3489:3: () otherlv_1= Empty
            {
            // InternalSolverLanguageParser.g:3489:3: ()
            // InternalSolverLanguageParser.g:3490:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyLiteralAccess().getEmptyLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Empty,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEmptyLiteralAccess().getEmptyKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmptyLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalSolverLanguageParser.g:3504:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalSolverLanguageParser.g:3504:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalSolverLanguageParser.g:3505:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalSolverLanguageParser.g:3511:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3517:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSolverLanguageParser.g:3518:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSolverLanguageParser.g:3518:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSolverLanguageParser.g:3519:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSolverLanguageParser.g:3519:3: (lv_value_0_0= RULE_STRING )
            // InternalSolverLanguageParser.g:3520:4: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalSolverLanguageParser.g:3539:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalSolverLanguageParser.g:3539:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalSolverLanguageParser.g:3540:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
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
    // InternalSolverLanguageParser.g:3546:1: ruleClassDeclaration returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) ) ) )* ) ) ) otherlv_3= Class ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Extends ( ( ruleQualifiedName ) ) (otherlv_7= Comma ( ( ruleQualifiedName ) ) )* )? ( (otherlv_9= LeftCurlyBracket ( (lv_fields_10_0= ruleField ) )* otherlv_11= RightCurlyBracket ) | this_FULL_STOP_12= RULE_FULL_STOP ) ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token lv_root_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_FULL_STOP_12=null;
        EObject lv_fields_10_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3552:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) ) ) )* ) ) ) otherlv_3= Class ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Extends ( ( ruleQualifiedName ) ) (otherlv_7= Comma ( ( ruleQualifiedName ) ) )* )? ( (otherlv_9= LeftCurlyBracket ( (lv_fields_10_0= ruleField ) )* otherlv_11= RightCurlyBracket ) | this_FULL_STOP_12= RULE_FULL_STOP ) ) )
            // InternalSolverLanguageParser.g:3553:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) ) ) )* ) ) ) otherlv_3= Class ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Extends ( ( ruleQualifiedName ) ) (otherlv_7= Comma ( ( ruleQualifiedName ) ) )* )? ( (otherlv_9= LeftCurlyBracket ( (lv_fields_10_0= ruleField ) )* otherlv_11= RightCurlyBracket ) | this_FULL_STOP_12= RULE_FULL_STOP ) )
            {
            // InternalSolverLanguageParser.g:3553:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) ) ) )* ) ) ) otherlv_3= Class ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Extends ( ( ruleQualifiedName ) ) (otherlv_7= Comma ( ( ruleQualifiedName ) ) )* )? ( (otherlv_9= LeftCurlyBracket ( (lv_fields_10_0= ruleField ) )* otherlv_11= RightCurlyBracket ) | this_FULL_STOP_12= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:3554:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) ) ) )* ) ) ) otherlv_3= Class ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Extends ( ( ruleQualifiedName ) ) (otherlv_7= Comma ( ( ruleQualifiedName ) ) )* )? ( (otherlv_9= LeftCurlyBracket ( (lv_fields_10_0= ruleField ) )* otherlv_11= RightCurlyBracket ) | this_FULL_STOP_12= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:3554:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) ) ) )* ) ) )
            // InternalSolverLanguageParser.g:3555:4: ( ( ( ({...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) ) ) )* ) )
            {
            // InternalSolverLanguageParser.g:3555:4: ( ( ( ({...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) ) ) )* ) )
            // InternalSolverLanguageParser.g:3556:5: ( ( ({...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getClassDeclarationAccess().getUnorderedGroup_0());
            				
            // InternalSolverLanguageParser.g:3559:5: ( ( ({...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) ) ) )* )
            // InternalSolverLanguageParser.g:3560:6: ( ({...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) ) ) )*
            {
            // InternalSolverLanguageParser.g:3560:6: ( ({...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) ) ) )*
            loop39:
            do {
                int alt39=3;
                int LA39_0 = input.LA(1);

                if ( LA39_0 == Abstract && getUnorderedGroupHelper().canSelect(grammarAccess.getClassDeclarationAccess().getUnorderedGroup_0(), 0) ) {
                    alt39=1;
                }
                else if ( LA39_0 == Root && getUnorderedGroupHelper().canSelect(grammarAccess.getClassDeclarationAccess().getUnorderedGroup_0(), 1) ) {
                    alt39=2;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:3561:4: ({...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) ) )
            	    {
            	    // InternalSolverLanguageParser.g:3561:4: ({...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) ) )
            	    // InternalSolverLanguageParser.g:3562:5: {...}? => ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClassDeclarationAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleClassDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getClassDeclarationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalSolverLanguageParser.g:3562:113: ( ({...}? => ( (lv_abstract_1_0= Abstract ) ) ) )
            	    // InternalSolverLanguageParser.g:3563:6: ({...}? => ( (lv_abstract_1_0= Abstract ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getClassDeclarationAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalSolverLanguageParser.g:3566:9: ({...}? => ( (lv_abstract_1_0= Abstract ) ) )
            	    // InternalSolverLanguageParser.g:3566:10: {...}? => ( (lv_abstract_1_0= Abstract ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleClassDeclaration", "true");
            	    }
            	    // InternalSolverLanguageParser.g:3566:19: ( (lv_abstract_1_0= Abstract ) )
            	    // InternalSolverLanguageParser.g:3566:20: (lv_abstract_1_0= Abstract )
            	    {
            	    // InternalSolverLanguageParser.g:3566:20: (lv_abstract_1_0= Abstract )
            	    // InternalSolverLanguageParser.g:3567:10: lv_abstract_1_0= Abstract
            	    {
            	    lv_abstract_1_0=(Token)match(input,Abstract,FOLLOW_50); 

            	    										newLeafNode(lv_abstract_1_0, grammarAccess.getClassDeclarationAccess().getAbstractAbstractKeyword_0_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getClassDeclarationRule());
            	    										}
            	    										setWithLastConsumed(current, "abstract", true, "abstract");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getClassDeclarationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSolverLanguageParser.g:3584:4: ({...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) ) )
            	    {
            	    // InternalSolverLanguageParser.g:3584:4: ({...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) ) )
            	    // InternalSolverLanguageParser.g:3585:5: {...}? => ( ({...}? => ( (lv_root_2_0= Root ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getClassDeclarationAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleClassDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getClassDeclarationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalSolverLanguageParser.g:3585:113: ( ({...}? => ( (lv_root_2_0= Root ) ) ) )
            	    // InternalSolverLanguageParser.g:3586:6: ({...}? => ( (lv_root_2_0= Root ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getClassDeclarationAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalSolverLanguageParser.g:3589:9: ({...}? => ( (lv_root_2_0= Root ) ) )
            	    // InternalSolverLanguageParser.g:3589:10: {...}? => ( (lv_root_2_0= Root ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleClassDeclaration", "true");
            	    }
            	    // InternalSolverLanguageParser.g:3589:19: ( (lv_root_2_0= Root ) )
            	    // InternalSolverLanguageParser.g:3589:20: (lv_root_2_0= Root )
            	    {
            	    // InternalSolverLanguageParser.g:3589:20: (lv_root_2_0= Root )
            	    // InternalSolverLanguageParser.g:3590:10: lv_root_2_0= Root
            	    {
            	    lv_root_2_0=(Token)match(input,Root,FOLLOW_50); 

            	    										newLeafNode(lv_root_2_0, grammarAccess.getClassDeclarationAccess().getRootRootKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getClassDeclarationRule());
            	    										}
            	    										setWithLastConsumed(current, "root", true, "root");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getClassDeclarationAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getClassDeclarationAccess().getUnorderedGroup_0());
            				

            }

            otherlv_3=(Token)match(input,Class,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
            		
            // InternalSolverLanguageParser.g:3618:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSolverLanguageParser.g:3619:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSolverLanguageParser.g:3619:4: (lv_name_4_0= RULE_ID )
            // InternalSolverLanguageParser.g:3620:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            					newLeafNode(lv_name_4_0, grammarAccess.getClassDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSolverLanguageParser.g:3636:3: (otherlv_5= Extends ( ( ruleQualifiedName ) ) (otherlv_7= Comma ( ( ruleQualifiedName ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Extends) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSolverLanguageParser.g:3637:4: otherlv_5= Extends ( ( ruleQualifiedName ) ) (otherlv_7= Comma ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_5=(Token)match(input,Extends,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassDeclarationAccess().getExtendsKeyword_3_0());
                    			
                    // InternalSolverLanguageParser.g:3641:4: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:3642:5: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:3642:5: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:3643:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassDeclarationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getSupertypesSymbolCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSolverLanguageParser.g:3657:4: (otherlv_7= Comma ( ( ruleQualifiedName ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==Comma) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:3658:5: otherlv_7= Comma ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_7=(Token)match(input,Comma,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalSolverLanguageParser.g:3662:5: ( ( ruleQualifiedName ) )
                    	    // InternalSolverLanguageParser.g:3663:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalSolverLanguageParser.g:3663:6: ( ruleQualifiedName )
                    	    // InternalSolverLanguageParser.g:3664:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClassDeclarationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getSupertypesSymbolCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_52);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSolverLanguageParser.g:3680:3: ( (otherlv_9= LeftCurlyBracket ( (lv_fields_10_0= ruleField ) )* otherlv_11= RightCurlyBracket ) | this_FULL_STOP_12= RULE_FULL_STOP )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==LeftCurlyBracket) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_FULL_STOP) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalSolverLanguageParser.g:3681:4: (otherlv_9= LeftCurlyBracket ( (lv_fields_10_0= ruleField ) )* otherlv_11= RightCurlyBracket )
                    {
                    // InternalSolverLanguageParser.g:3681:4: (otherlv_9= LeftCurlyBracket ( (lv_fields_10_0= ruleField ) )* otherlv_11= RightCurlyBracket )
                    // InternalSolverLanguageParser.g:3682:5: otherlv_9= LeftCurlyBracket ( (lv_fields_10_0= ruleField ) )* otherlv_11= RightCurlyBracket
                    {
                    otherlv_9=(Token)match(input,LeftCurlyBracket,FOLLOW_53); 

                    					newLeafNode(otherlv_9, grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_4_0_0());
                    				
                    // InternalSolverLanguageParser.g:3686:5: ( (lv_fields_10_0= ruleField ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==Contains||(LA42_0>=Object && LA42_0<=Refers)||LA42_0==RULE_QUOTED_ID||LA42_0==RULE_ID) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalSolverLanguageParser.g:3687:6: (lv_fields_10_0= ruleField )
                    	    {
                    	    // InternalSolverLanguageParser.g:3687:6: (lv_fields_10_0= ruleField )
                    	    // InternalSolverLanguageParser.g:3688:7: lv_fields_10_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getFieldsFieldParserRuleCall_4_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_53);
                    	    lv_fields_10_0=ruleField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_10_0,
                    	    								"org.eclipse.viatra.solver.language.SolverLanguage.Field");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_4_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:3711:4: this_FULL_STOP_12= RULE_FULL_STOP
                    {
                    this_FULL_STOP_12=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

                    				newLeafNode(this_FULL_STOP_12, grammarAccess.getClassDeclarationAccess().getFULL_STOPTerminalRuleCall_4_1());
                    			

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


    // $ANTLR start "entryRuleField"
    // InternalSolverLanguageParser.g:3720:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalSolverLanguageParser.g:3720:46: (iv_ruleField= ruleField EOF )
            // InternalSolverLanguageParser.g:3721:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalSolverLanguageParser.g:3727:1: ruleField returns [EObject current=null] : ( ( ( (lv_containment_0_0= Contains ) ) | ( (lv_crossReference_1_0= Refers ) ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_7= Semicolon )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_containment_0_0=null;
        Token lv_crossReference_1_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_multiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3733:2: ( ( ( ( (lv_containment_0_0= Contains ) ) | ( (lv_crossReference_1_0= Refers ) ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_7= Semicolon )? ) )
            // InternalSolverLanguageParser.g:3734:2: ( ( ( (lv_containment_0_0= Contains ) ) | ( (lv_crossReference_1_0= Refers ) ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_7= Semicolon )? )
            {
            // InternalSolverLanguageParser.g:3734:2: ( ( ( (lv_containment_0_0= Contains ) ) | ( (lv_crossReference_1_0= Refers ) ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_7= Semicolon )? )
            // InternalSolverLanguageParser.g:3735:3: ( ( (lv_containment_0_0= Contains ) ) | ( (lv_crossReference_1_0= Refers ) ) )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= Opposite ( ( ruleQualifiedName ) ) )? (otherlv_7= Semicolon )?
            {
            // InternalSolverLanguageParser.g:3735:3: ( ( (lv_containment_0_0= Contains ) ) | ( (lv_crossReference_1_0= Refers ) ) )?
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Contains) ) {
                alt44=1;
            }
            else if ( (LA44_0==Refers) ) {
                alt44=2;
            }
            switch (alt44) {
                case 1 :
                    // InternalSolverLanguageParser.g:3736:4: ( (lv_containment_0_0= Contains ) )
                    {
                    // InternalSolverLanguageParser.g:3736:4: ( (lv_containment_0_0= Contains ) )
                    // InternalSolverLanguageParser.g:3737:5: (lv_containment_0_0= Contains )
                    {
                    // InternalSolverLanguageParser.g:3737:5: (lv_containment_0_0= Contains )
                    // InternalSolverLanguageParser.g:3738:6: lv_containment_0_0= Contains
                    {
                    lv_containment_0_0=(Token)match(input,Contains,FOLLOW_3); 

                    						newLeafNode(lv_containment_0_0, grammarAccess.getFieldAccess().getContainmentContainsKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    						setWithLastConsumed(current, "containment", true, "contains");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:3751:4: ( (lv_crossReference_1_0= Refers ) )
                    {
                    // InternalSolverLanguageParser.g:3751:4: ( (lv_crossReference_1_0= Refers ) )
                    // InternalSolverLanguageParser.g:3752:5: (lv_crossReference_1_0= Refers )
                    {
                    // InternalSolverLanguageParser.g:3752:5: (lv_crossReference_1_0= Refers )
                    // InternalSolverLanguageParser.g:3753:6: lv_crossReference_1_0= Refers
                    {
                    lv_crossReference_1_0=(Token)match(input,Refers,FOLLOW_3); 

                    						newLeafNode(lv_crossReference_1_0, grammarAccess.getFieldAccess().getCrossReferenceRefersKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    						setWithLastConsumed(current, "crossReference", true, "refers");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSolverLanguageParser.g:3766:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:3767:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:3767:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:3768:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeSymbolCrossReference_1_0());
            				
            pushFollow(FOLLOW_54);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:3782:3: ( (lv_multiplicity_3_0= ruleMultiplicity ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==LeftSquareBracket) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSolverLanguageParser.g:3783:4: (lv_multiplicity_3_0= ruleMultiplicity )
                    {
                    // InternalSolverLanguageParser.g:3783:4: (lv_multiplicity_3_0= ruleMultiplicity )
                    // InternalSolverLanguageParser.g:3784:5: lv_multiplicity_3_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getFieldAccess().getMultiplicityMultiplicityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_multiplicity_3_0=ruleMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldRule());
                    					}
                    					set(
                    						current,
                    						"multiplicity",
                    						lv_multiplicity_3_0,
                    						"org.eclipse.viatra.solver.language.SolverLanguage.Multiplicity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSolverLanguageParser.g:3801:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalSolverLanguageParser.g:3802:4: (lv_name_4_0= RULE_ID )
            {
            // InternalSolverLanguageParser.g:3802:4: (lv_name_4_0= RULE_ID )
            // InternalSolverLanguageParser.g:3803:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(lv_name_4_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSolverLanguageParser.g:3819:3: (otherlv_5= Opposite ( ( ruleQualifiedName ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Opposite) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSolverLanguageParser.g:3820:4: otherlv_5= Opposite ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,Opposite,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getOppositeKeyword_4_0());
                    			
                    // InternalSolverLanguageParser.g:3824:4: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:3825:5: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:3825:5: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:3826:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFieldAccess().getOppositeSymbolCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSolverLanguageParser.g:3841:3: (otherlv_7= Semicolon )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Semicolon) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSolverLanguageParser.g:3842:4: otherlv_7= Semicolon
                    {
                    otherlv_7=(Token)match(input,Semicolon,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getFieldAccess().getSemicolonKeyword_5());
                    			

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalSolverLanguageParser.g:3851:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalSolverLanguageParser.g:3851:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalSolverLanguageParser.g:3852:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalSolverLanguageParser.g:3858:1: ruleMultiplicity returns [EObject current=null] : (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject this_UnboundedMultiplicity_0 = null;

        EObject this_ExactMultiplicity_1 = null;

        EObject this_BoundedMultiplicity_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3864:2: ( (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity ) )
            // InternalSolverLanguageParser.g:3865:2: (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity )
            {
            // InternalSolverLanguageParser.g:3865:2: (this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity | this_ExactMultiplicity_1= ruleExactMultiplicity | this_BoundedMultiplicity_2= ruleBoundedMultiplicity )
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==LeftSquareBracket) ) {
                switch ( input.LA(2) ) {
                case RULE_INT:
                    {
                    int LA48_2 = input.LA(3);

                    if ( (LA48_2==RightSquareBracket) ) {
                        alt48=2;
                    }
                    else if ( (LA48_2==Comma) ) {
                        alt48=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RightSquareBracket:
                    {
                    alt48=1;
                    }
                    break;
                case Asterisk:
                    {
                    alt48=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalSolverLanguageParser.g:3866:3: this_UnboundedMultiplicity_0= ruleUnboundedMultiplicity
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
                    // InternalSolverLanguageParser.g:3875:3: this_ExactMultiplicity_1= ruleExactMultiplicity
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
                    // InternalSolverLanguageParser.g:3884:3: this_BoundedMultiplicity_2= ruleBoundedMultiplicity
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


    // $ANTLR start "entryRuleUnboundedMultiplicity"
    // InternalSolverLanguageParser.g:3896:1: entryRuleUnboundedMultiplicity returns [EObject current=null] : iv_ruleUnboundedMultiplicity= ruleUnboundedMultiplicity EOF ;
    public final EObject entryRuleUnboundedMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnboundedMultiplicity = null;


        try {
            // InternalSolverLanguageParser.g:3896:62: (iv_ruleUnboundedMultiplicity= ruleUnboundedMultiplicity EOF )
            // InternalSolverLanguageParser.g:3897:2: iv_ruleUnboundedMultiplicity= ruleUnboundedMultiplicity EOF
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
    // InternalSolverLanguageParser.g:3903:1: ruleUnboundedMultiplicity returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket ) ;
    public final EObject ruleUnboundedMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3909:2: ( ( () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket ) )
            // InternalSolverLanguageParser.g:3910:2: ( () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket )
            {
            // InternalSolverLanguageParser.g:3910:2: ( () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket )
            // InternalSolverLanguageParser.g:3911:3: () otherlv_1= LeftSquareBracket otherlv_2= RightSquareBracket
            {
            // InternalSolverLanguageParser.g:3911:3: ()
            // InternalSolverLanguageParser.g:3912:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnboundedMultiplicityAccess().getUnboundedMultiplicityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getUnboundedMultiplicityAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getUnboundedMultiplicityAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnboundedMultiplicity"


    // $ANTLR start "entryRuleExactMultiplicity"
    // InternalSolverLanguageParser.g:3930:1: entryRuleExactMultiplicity returns [EObject current=null] : iv_ruleExactMultiplicity= ruleExactMultiplicity EOF ;
    public final EObject entryRuleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactMultiplicity = null;


        try {
            // InternalSolverLanguageParser.g:3930:58: (iv_ruleExactMultiplicity= ruleExactMultiplicity EOF )
            // InternalSolverLanguageParser.g:3931:2: iv_ruleExactMultiplicity= ruleExactMultiplicity EOF
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
    // InternalSolverLanguageParser.g:3937:1: ruleExactMultiplicity returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_value_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket ) ;
    public final EObject ruleExactMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3943:2: ( (otherlv_0= LeftSquareBracket ( (lv_value_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket ) )
            // InternalSolverLanguageParser.g:3944:2: (otherlv_0= LeftSquareBracket ( (lv_value_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket )
            {
            // InternalSolverLanguageParser.g:3944:2: (otherlv_0= LeftSquareBracket ( (lv_value_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket )
            // InternalSolverLanguageParser.g:3945:3: otherlv_0= LeftSquareBracket ( (lv_value_1_0= ruleUpperMultiplicty ) ) otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getExactMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSolverLanguageParser.g:3949:3: ( (lv_value_1_0= ruleUpperMultiplicty ) )
            // InternalSolverLanguageParser.g:3950:4: (lv_value_1_0= ruleUpperMultiplicty )
            {
            // InternalSolverLanguageParser.g:3950:4: (lv_value_1_0= ruleUpperMultiplicty )
            // InternalSolverLanguageParser.g:3951:5: lv_value_1_0= ruleUpperMultiplicty
            {

            					newCompositeNode(grammarAccess.getExactMultiplicityAccess().getValueUpperMultiplictyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_49);
            lv_value_1_0=ruleUpperMultiplicty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExactMultiplicityRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
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
    // InternalSolverLanguageParser.g:3976:1: entryRuleBoundedMultiplicity returns [EObject current=null] : iv_ruleBoundedMultiplicity= ruleBoundedMultiplicity EOF ;
    public final EObject entryRuleBoundedMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundedMultiplicity = null;


        try {
            // InternalSolverLanguageParser.g:3976:60: (iv_ruleBoundedMultiplicity= ruleBoundedMultiplicity EOF )
            // InternalSolverLanguageParser.g:3977:2: iv_ruleBoundedMultiplicity= ruleBoundedMultiplicity EOF
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
    // InternalSolverLanguageParser.g:3983:1: ruleBoundedMultiplicity returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket ) ;
    public final EObject ruleBoundedMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerBound_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:3989:2: ( (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket ) )
            // InternalSolverLanguageParser.g:3990:2: (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket )
            {
            // InternalSolverLanguageParser.g:3990:2: (otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket )
            // InternalSolverLanguageParser.g:3991:3: otherlv_0= LeftSquareBracket ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= Comma ( (lv_upperBound_3_0= ruleUpperMultiplicty ) ) otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getBoundedMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSolverLanguageParser.g:3995:3: ( (lv_lowerBound_1_0= RULE_INT ) )
            // InternalSolverLanguageParser.g:3996:4: (lv_lowerBound_1_0= RULE_INT )
            {
            // InternalSolverLanguageParser.g:3996:4: (lv_lowerBound_1_0= RULE_INT )
            // InternalSolverLanguageParser.g:3997:5: lv_lowerBound_1_0= RULE_INT
            {
            lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_48); 

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

            otherlv_2=(Token)match(input,Comma,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getBoundedMultiplicityAccess().getCommaKeyword_2());
            		
            // InternalSolverLanguageParser.g:4017:3: ( (lv_upperBound_3_0= ruleUpperMultiplicty ) )
            // InternalSolverLanguageParser.g:4018:4: (lv_upperBound_3_0= ruleUpperMultiplicty )
            {
            // InternalSolverLanguageParser.g:4018:4: (lv_upperBound_3_0= ruleUpperMultiplicty )
            // InternalSolverLanguageParser.g:4019:5: lv_upperBound_3_0= ruleUpperMultiplicty
            {

            					newCompositeNode(grammarAccess.getBoundedMultiplicityAccess().getUpperBoundUpperMultiplictyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_49);
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


    // $ANTLR start "entryRuleEnumDeclaration"
    // InternalSolverLanguageParser.g:4044:1: entryRuleEnumDeclaration returns [EObject current=null] : iv_ruleEnumDeclaration= ruleEnumDeclaration EOF ;
    public final EObject entryRuleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDeclaration = null;


        try {
            // InternalSolverLanguageParser.g:4044:56: (iv_ruleEnumDeclaration= ruleEnumDeclaration EOF )
            // InternalSolverLanguageParser.g:4045:2: iv_ruleEnumDeclaration= ruleEnumDeclaration EOF
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
    // InternalSolverLanguageParser.g:4051:1: ruleEnumDeclaration returns [EObject current=null] : (otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= LeftCurlyBracket ( ( (lv_literals_3_0= ruleEnumLiteral ) ) ( (otherlv_4= Comma )? ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )? otherlv_6= RightCurlyBracket ) | this_FULL_STOP_7= RULE_FULL_STOP ) ) ;
    public final EObject ruleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_FULL_STOP_7=null;
        EObject lv_literals_3_0 = null;

        EObject lv_literals_5_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4057:2: ( (otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= LeftCurlyBracket ( ( (lv_literals_3_0= ruleEnumLiteral ) ) ( (otherlv_4= Comma )? ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )? otherlv_6= RightCurlyBracket ) | this_FULL_STOP_7= RULE_FULL_STOP ) ) )
            // InternalSolverLanguageParser.g:4058:2: (otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= LeftCurlyBracket ( ( (lv_literals_3_0= ruleEnumLiteral ) ) ( (otherlv_4= Comma )? ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )? otherlv_6= RightCurlyBracket ) | this_FULL_STOP_7= RULE_FULL_STOP ) )
            {
            // InternalSolverLanguageParser.g:4058:2: (otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= LeftCurlyBracket ( ( (lv_literals_3_0= ruleEnumLiteral ) ) ( (otherlv_4= Comma )? ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )? otherlv_6= RightCurlyBracket ) | this_FULL_STOP_7= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:4059:3: otherlv_0= Enum ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= LeftCurlyBracket ( ( (lv_literals_3_0= ruleEnumLiteral ) ) ( (otherlv_4= Comma )? ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )? otherlv_6= RightCurlyBracket ) | this_FULL_STOP_7= RULE_FULL_STOP )
            {
            otherlv_0=(Token)match(input,Enum,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumDeclarationAccess().getEnumKeyword_0());
            		
            // InternalSolverLanguageParser.g:4063:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolverLanguageParser.g:4064:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolverLanguageParser.g:4064:4: (lv_name_1_0= RULE_ID )
            // InternalSolverLanguageParser.g:4065:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_58); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSolverLanguageParser.g:4081:3: ( (otherlv_2= LeftCurlyBracket ( ( (lv_literals_3_0= ruleEnumLiteral ) ) ( (otherlv_4= Comma )? ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )? otherlv_6= RightCurlyBracket ) | this_FULL_STOP_7= RULE_FULL_STOP )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==LeftCurlyBracket) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_FULL_STOP) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalSolverLanguageParser.g:4082:4: (otherlv_2= LeftCurlyBracket ( ( (lv_literals_3_0= ruleEnumLiteral ) ) ( (otherlv_4= Comma )? ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )? otherlv_6= RightCurlyBracket )
                    {
                    // InternalSolverLanguageParser.g:4082:4: (otherlv_2= LeftCurlyBracket ( ( (lv_literals_3_0= ruleEnumLiteral ) ) ( (otherlv_4= Comma )? ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )? otherlv_6= RightCurlyBracket )
                    // InternalSolverLanguageParser.g:4083:5: otherlv_2= LeftCurlyBracket ( ( (lv_literals_3_0= ruleEnumLiteral ) ) ( (otherlv_4= Comma )? ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )? otherlv_6= RightCurlyBracket
                    {
                    otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_59); 

                    					newLeafNode(otherlv_2, grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2_0_0());
                    				
                    // InternalSolverLanguageParser.g:4087:5: ( ( (lv_literals_3_0= ruleEnumLiteral ) ) ( (otherlv_4= Comma )? ( (lv_literals_5_0= ruleEnumLiteral ) ) )* )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_ID) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalSolverLanguageParser.g:4088:6: ( (lv_literals_3_0= ruleEnumLiteral ) ) ( (otherlv_4= Comma )? ( (lv_literals_5_0= ruleEnumLiteral ) ) )*
                            {
                            // InternalSolverLanguageParser.g:4088:6: ( (lv_literals_3_0= ruleEnumLiteral ) )
                            // InternalSolverLanguageParser.g:4089:7: (lv_literals_3_0= ruleEnumLiteral )
                            {
                            // InternalSolverLanguageParser.g:4089:7: (lv_literals_3_0= ruleEnumLiteral )
                            // InternalSolverLanguageParser.g:4090:8: lv_literals_3_0= ruleEnumLiteral
                            {

                            								newCompositeNode(grammarAccess.getEnumDeclarationAccess().getLiteralsEnumLiteralParserRuleCall_2_0_1_0_0());
                            							
                            pushFollow(FOLLOW_60);
                            lv_literals_3_0=ruleEnumLiteral();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getEnumDeclarationRule());
                            								}
                            								add(
                            									current,
                            									"literals",
                            									lv_literals_3_0,
                            									"org.eclipse.viatra.solver.language.SolverLanguage.EnumLiteral");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalSolverLanguageParser.g:4107:6: ( (otherlv_4= Comma )? ( (lv_literals_5_0= ruleEnumLiteral ) ) )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==Comma||LA50_0==RULE_ID) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // InternalSolverLanguageParser.g:4108:7: (otherlv_4= Comma )? ( (lv_literals_5_0= ruleEnumLiteral ) )
                            	    {
                            	    // InternalSolverLanguageParser.g:4108:7: (otherlv_4= Comma )?
                            	    int alt49=2;
                            	    int LA49_0 = input.LA(1);

                            	    if ( (LA49_0==Comma) ) {
                            	        alt49=1;
                            	    }
                            	    switch (alt49) {
                            	        case 1 :
                            	            // InternalSolverLanguageParser.g:4109:8: otherlv_4= Comma
                            	            {
                            	            otherlv_4=(Token)match(input,Comma,FOLLOW_28); 

                            	            								newLeafNode(otherlv_4, grammarAccess.getEnumDeclarationAccess().getCommaKeyword_2_0_1_1_0());
                            	            							

                            	            }
                            	            break;

                            	    }

                            	    // InternalSolverLanguageParser.g:4114:7: ( (lv_literals_5_0= ruleEnumLiteral ) )
                            	    // InternalSolverLanguageParser.g:4115:8: (lv_literals_5_0= ruleEnumLiteral )
                            	    {
                            	    // InternalSolverLanguageParser.g:4115:8: (lv_literals_5_0= ruleEnumLiteral )
                            	    // InternalSolverLanguageParser.g:4116:9: lv_literals_5_0= ruleEnumLiteral
                            	    {

                            	    									newCompositeNode(grammarAccess.getEnumDeclarationAccess().getLiteralsEnumLiteralParserRuleCall_2_0_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_60);
                            	    lv_literals_5_0=ruleEnumLiteral();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getEnumDeclarationRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"literals",
                            	    										lv_literals_5_0,
                            	    										"org.eclipse.viatra.solver.language.SolverLanguage.EnumLiteral");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop50;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4141:4: this_FULL_STOP_7= RULE_FULL_STOP
                    {
                    this_FULL_STOP_7=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

                    				newLeafNode(this_FULL_STOP_7, grammarAccess.getEnumDeclarationAccess().getFULL_STOPTerminalRuleCall_2_1());
                    			

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
    // InternalSolverLanguageParser.g:4150:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // InternalSolverLanguageParser.g:4150:52: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // InternalSolverLanguageParser.g:4151:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
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
    // InternalSolverLanguageParser.g:4157:1: ruleEnumLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4163:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSolverLanguageParser.g:4164:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSolverLanguageParser.g:4164:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSolverLanguageParser.g:4165:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSolverLanguageParser.g:4165:3: (lv_name_0_0= RULE_ID )
            // InternalSolverLanguageParser.g:4166:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEnumLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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


    // $ANTLR start "entryRuleScopeDeclaration"
    // InternalSolverLanguageParser.g:4185:1: entryRuleScopeDeclaration returns [EObject current=null] : iv_ruleScopeDeclaration= ruleScopeDeclaration EOF ;
    public final EObject entryRuleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopeDeclaration = null;


        try {
            // InternalSolverLanguageParser.g:4185:57: (iv_ruleScopeDeclaration= ruleScopeDeclaration EOF )
            // InternalSolverLanguageParser.g:4186:2: iv_ruleScopeDeclaration= ruleScopeDeclaration EOF
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
    // InternalSolverLanguageParser.g:4192:1: ruleScopeDeclaration returns [EObject current=null] : (this_ExactScope_0= ruleExactScope | this_BoundedScope_1= ruleBoundedScope | this_LowerBoundedScope_2= ruleLowerBoundedScope ) ;
    public final EObject ruleScopeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ExactScope_0 = null;

        EObject this_BoundedScope_1 = null;

        EObject this_LowerBoundedScope_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4198:2: ( (this_ExactScope_0= ruleExactScope | this_BoundedScope_1= ruleBoundedScope | this_LowerBoundedScope_2= ruleLowerBoundedScope ) )
            // InternalSolverLanguageParser.g:4199:2: (this_ExactScope_0= ruleExactScope | this_BoundedScope_1= ruleBoundedScope | this_LowerBoundedScope_2= ruleLowerBoundedScope )
            {
            // InternalSolverLanguageParser.g:4199:2: (this_ExactScope_0= ruleExactScope | this_BoundedScope_1= ruleBoundedScope | this_LowerBoundedScope_2= ruleLowerBoundedScope )
            int alt53=3;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // InternalSolverLanguageParser.g:4200:3: this_ExactScope_0= ruleExactScope
                    {

                    			newCompositeNode(grammarAccess.getScopeDeclarationAccess().getExactScopeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExactScope_0=ruleExactScope();

                    state._fsp--;


                    			current = this_ExactScope_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4209:3: this_BoundedScope_1= ruleBoundedScope
                    {

                    			newCompositeNode(grammarAccess.getScopeDeclarationAccess().getBoundedScopeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoundedScope_1=ruleBoundedScope();

                    state._fsp--;


                    			current = this_BoundedScope_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:4218:3: this_LowerBoundedScope_2= ruleLowerBoundedScope
                    {

                    			newCompositeNode(grammarAccess.getScopeDeclarationAccess().getLowerBoundedScopeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LowerBoundedScope_2=ruleLowerBoundedScope();

                    state._fsp--;


                    			current = this_LowerBoundedScope_2;
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
    // $ANTLR end "ruleScopeDeclaration"


    // $ANTLR start "entryRuleExactScope"
    // InternalSolverLanguageParser.g:4230:1: entryRuleExactScope returns [EObject current=null] : iv_ruleExactScope= ruleExactScope EOF ;
    public final EObject entryRuleExactScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactScope = null;


        try {
            // InternalSolverLanguageParser.g:4230:51: (iv_ruleExactScope= ruleExactScope EOF )
            // InternalSolverLanguageParser.g:4231:2: iv_ruleExactScope= ruleExactScope EOF
            {
             newCompositeNode(grammarAccess.getExactScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExactScope=ruleExactScope();

            state._fsp--;

             current =iv_ruleExactScope; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExactScope"


    // $ANTLR start "ruleExactScope"
    // InternalSolverLanguageParser.g:4237:1: ruleExactScope returns [EObject current=null] : (otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_size_3_0= RULE_INT ) ) this_FULL_STOP_4= RULE_FULL_STOP ) ;
    public final EObject ruleExactScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token this_FULL_STOP_4=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4243:2: ( (otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_size_3_0= RULE_INT ) ) this_FULL_STOP_4= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:4244:2: (otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_size_3_0= RULE_INT ) ) this_FULL_STOP_4= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:4244:2: (otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_size_3_0= RULE_INT ) ) this_FULL_STOP_4= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:4245:3: otherlv_0= Scope ( ( ruleQualifiedName ) ) otherlv_2= EqualsSignEqualsSign ( (lv_size_3_0= RULE_INT ) ) this_FULL_STOP_4= RULE_FULL_STOP
            {
            otherlv_0=(Token)match(input,Scope,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExactScopeAccess().getScopeKeyword_0());
            		
            // InternalSolverLanguageParser.g:4249:3: ( ( ruleQualifiedName ) )
            // InternalSolverLanguageParser.g:4250:4: ( ruleQualifiedName )
            {
            // InternalSolverLanguageParser.g:4250:4: ( ruleQualifiedName )
            // InternalSolverLanguageParser.g:4251:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExactScopeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExactScopeAccess().getTypeSymbolCrossReference_1_0());
            				
            pushFollow(FOLLOW_61);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,EqualsSignEqualsSign,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getExactScopeAccess().getEqualsSignEqualsSignKeyword_2());
            		
            // InternalSolverLanguageParser.g:4269:3: ( (lv_size_3_0= RULE_INT ) )
            // InternalSolverLanguageParser.g:4270:4: (lv_size_3_0= RULE_INT )
            {
            // InternalSolverLanguageParser.g:4270:4: (lv_size_3_0= RULE_INT )
            // InternalSolverLanguageParser.g:4271:5: lv_size_3_0= RULE_INT
            {
            lv_size_3_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_size_3_0, grammarAccess.getExactScopeAccess().getSizeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExactScopeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_FULL_STOP_4=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_4, grammarAccess.getExactScopeAccess().getFULL_STOPTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExactScope"


    // $ANTLR start "entryRuleBoundedScope"
    // InternalSolverLanguageParser.g:4295:1: entryRuleBoundedScope returns [EObject current=null] : iv_ruleBoundedScope= ruleBoundedScope EOF ;
    public final EObject entryRuleBoundedScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundedScope = null;


        try {
            // InternalSolverLanguageParser.g:4295:53: (iv_ruleBoundedScope= ruleBoundedScope EOF )
            // InternalSolverLanguageParser.g:4296:2: iv_ruleBoundedScope= ruleBoundedScope EOF
            {
             newCompositeNode(grammarAccess.getBoundedScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundedScope=ruleBoundedScope();

            state._fsp--;

             current =iv_ruleBoundedScope; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoundedScope"


    // $ANTLR start "ruleBoundedScope"
    // InternalSolverLanguageParser.g:4302:1: ruleBoundedScope returns [EObject current=null] : (otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) this_FULL_STOP_11= RULE_FULL_STOP ) ;
    public final EObject ruleBoundedScope() throws RecognitionException {
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
        Token this_FULL_STOP_11=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4308:2: ( (otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) this_FULL_STOP_11= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:4309:2: (otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) this_FULL_STOP_11= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:4309:2: (otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) this_FULL_STOP_11= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:4310:3: otherlv_0= Scope ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) ) this_FULL_STOP_11= RULE_FULL_STOP
            {
            otherlv_0=(Token)match(input,Scope,FOLLOW_62); 

            			newLeafNode(otherlv_0, grammarAccess.getBoundedScopeAccess().getScopeKeyword_0());
            		
            // InternalSolverLanguageParser.g:4314:3: ( ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) ) | ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_INT) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==LessThanSignEqualsSign) ) {
                    alt56=1;
                }
                else if ( (LA56_1==GreaterThanSignEqualsSign) ) {
                    alt56=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA56_0==Object||LA56_0==RULE_QUOTED_ID||LA56_0==RULE_ID) ) {
                alt56=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalSolverLanguageParser.g:4315:4: ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) )
                    {
                    // InternalSolverLanguageParser.g:4315:4: ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) ) )
                    // InternalSolverLanguageParser.g:4316:5: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )? ( ( ruleQualifiedName ) ) otherlv_4= LessThanSignEqualsSign ( (lv_upperBound_5_0= RULE_INT ) )
                    {
                    // InternalSolverLanguageParser.g:4316:5: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_INT) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalSolverLanguageParser.g:4317:6: ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign
                            {
                            // InternalSolverLanguageParser.g:4317:6: ( (lv_lowerBound_1_0= RULE_INT ) )
                            // InternalSolverLanguageParser.g:4318:7: (lv_lowerBound_1_0= RULE_INT )
                            {
                            // InternalSolverLanguageParser.g:4318:7: (lv_lowerBound_1_0= RULE_INT )
                            // InternalSolverLanguageParser.g:4319:8: lv_lowerBound_1_0= RULE_INT
                            {
                            lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_63); 

                            								newLeafNode(lv_lowerBound_1_0, grammarAccess.getBoundedScopeAccess().getLowerBoundINTTerminalRuleCall_1_0_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBoundedScopeRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"lowerBound",
                            									lv_lowerBound_1_0,
                            									"org.eclipse.xtext.common.Terminals.INT");
                            							

                            }


                            }

                            otherlv_2=(Token)match(input,LessThanSignEqualsSign,FOLLOW_3); 

                            						newLeafNode(otherlv_2, grammarAccess.getBoundedScopeAccess().getLessThanSignEqualsSignKeyword_1_0_0_1());
                            					

                            }
                            break;

                    }

                    // InternalSolverLanguageParser.g:4340:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:4341:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:4341:6: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:4342:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBoundedScopeRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getBoundedScopeAccess().getTypeSymbolCrossReference_1_0_1_0());
                    						
                    pushFollow(FOLLOW_63);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,LessThanSignEqualsSign,FOLLOW_57); 

                    					newLeafNode(otherlv_4, grammarAccess.getBoundedScopeAccess().getLessThanSignEqualsSignKeyword_1_0_2());
                    				
                    // InternalSolverLanguageParser.g:4360:5: ( (lv_upperBound_5_0= RULE_INT ) )
                    // InternalSolverLanguageParser.g:4361:6: (lv_upperBound_5_0= RULE_INT )
                    {
                    // InternalSolverLanguageParser.g:4361:6: (lv_upperBound_5_0= RULE_INT )
                    // InternalSolverLanguageParser.g:4362:7: lv_upperBound_5_0= RULE_INT
                    {
                    lv_upperBound_5_0=(Token)match(input,RULE_INT,FOLLOW_4); 

                    							newLeafNode(lv_upperBound_5_0, grammarAccess.getBoundedScopeAccess().getUpperBoundINTTerminalRuleCall_1_0_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBoundedScopeRule());
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
                    // InternalSolverLanguageParser.g:4380:4: ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? )
                    {
                    // InternalSolverLanguageParser.g:4380:4: ( ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )? )
                    // InternalSolverLanguageParser.g:4381:5: ( (lv_upperBound_6_0= RULE_INT ) ) otherlv_7= GreaterThanSignEqualsSign ( ( ruleQualifiedName ) ) (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )?
                    {
                    // InternalSolverLanguageParser.g:4381:5: ( (lv_upperBound_6_0= RULE_INT ) )
                    // InternalSolverLanguageParser.g:4382:6: (lv_upperBound_6_0= RULE_INT )
                    {
                    // InternalSolverLanguageParser.g:4382:6: (lv_upperBound_6_0= RULE_INT )
                    // InternalSolverLanguageParser.g:4383:7: lv_upperBound_6_0= RULE_INT
                    {
                    lv_upperBound_6_0=(Token)match(input,RULE_INT,FOLLOW_64); 

                    							newLeafNode(lv_upperBound_6_0, grammarAccess.getBoundedScopeAccess().getUpperBoundINTTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBoundedScopeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"upperBound",
                    								lv_upperBound_6_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_3); 

                    					newLeafNode(otherlv_7, grammarAccess.getBoundedScopeAccess().getGreaterThanSignEqualsSignKeyword_1_1_1());
                    				
                    // InternalSolverLanguageParser.g:4403:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:4404:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:4404:6: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:4405:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBoundedScopeRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getBoundedScopeAccess().getTypeSymbolCrossReference_1_1_2_0());
                    						
                    pushFollow(FOLLOW_65);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSolverLanguageParser.g:4419:5: (otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==GreaterThanSignEqualsSign) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalSolverLanguageParser.g:4420:6: otherlv_9= GreaterThanSignEqualsSign ( (lv_lowerBound_10_0= RULE_INT ) )
                            {
                            otherlv_9=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_57); 

                            						newLeafNode(otherlv_9, grammarAccess.getBoundedScopeAccess().getGreaterThanSignEqualsSignKeyword_1_1_3_0());
                            					
                            // InternalSolverLanguageParser.g:4424:6: ( (lv_lowerBound_10_0= RULE_INT ) )
                            // InternalSolverLanguageParser.g:4425:7: (lv_lowerBound_10_0= RULE_INT )
                            {
                            // InternalSolverLanguageParser.g:4425:7: (lv_lowerBound_10_0= RULE_INT )
                            // InternalSolverLanguageParser.g:4426:8: lv_lowerBound_10_0= RULE_INT
                            {
                            lv_lowerBound_10_0=(Token)match(input,RULE_INT,FOLLOW_4); 

                            								newLeafNode(lv_lowerBound_10_0, grammarAccess.getBoundedScopeAccess().getLowerBoundINTTerminalRuleCall_1_1_3_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBoundedScopeRule());
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

            this_FULL_STOP_11=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_11, grammarAccess.getBoundedScopeAccess().getFULL_STOPTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoundedScope"


    // $ANTLR start "entryRuleLowerBoundedScope"
    // InternalSolverLanguageParser.g:4453:1: entryRuleLowerBoundedScope returns [EObject current=null] : iv_ruleLowerBoundedScope= ruleLowerBoundedScope EOF ;
    public final EObject entryRuleLowerBoundedScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerBoundedScope = null;


        try {
            // InternalSolverLanguageParser.g:4453:58: (iv_ruleLowerBoundedScope= ruleLowerBoundedScope EOF )
            // InternalSolverLanguageParser.g:4454:2: iv_ruleLowerBoundedScope= ruleLowerBoundedScope EOF
            {
             newCompositeNode(grammarAccess.getLowerBoundedScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLowerBoundedScope=ruleLowerBoundedScope();

            state._fsp--;

             current =iv_ruleLowerBoundedScope; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLowerBoundedScope"


    // $ANTLR start "ruleLowerBoundedScope"
    // InternalSolverLanguageParser.g:4460:1: ruleLowerBoundedScope returns [EObject current=null] : (otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) this_FULL_STOP_7= RULE_FULL_STOP ) ;
    public final EObject ruleLowerBoundedScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerBound_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_lowerBound_6_0=null;
        Token this_FULL_STOP_7=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4466:2: ( (otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) this_FULL_STOP_7= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:4467:2: (otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) this_FULL_STOP_7= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:4467:2: (otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) this_FULL_STOP_7= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:4468:3: otherlv_0= Scope ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) ) this_FULL_STOP_7= RULE_FULL_STOP
            {
            otherlv_0=(Token)match(input,Scope,FOLLOW_62); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerBoundedScopeAccess().getScopeKeyword_0());
            		
            // InternalSolverLanguageParser.g:4472:3: ( ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) ) | ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_INT) ) {
                alt57=1;
            }
            else if ( (LA57_0==Object||LA57_0==RULE_QUOTED_ID||LA57_0==RULE_ID) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalSolverLanguageParser.g:4473:4: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) )
                    {
                    // InternalSolverLanguageParser.g:4473:4: ( ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) ) )
                    // InternalSolverLanguageParser.g:4474:5: ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= LessThanSignEqualsSign ( ( ruleQualifiedName ) )
                    {
                    // InternalSolverLanguageParser.g:4474:5: ( (lv_lowerBound_1_0= RULE_INT ) )
                    // InternalSolverLanguageParser.g:4475:6: (lv_lowerBound_1_0= RULE_INT )
                    {
                    // InternalSolverLanguageParser.g:4475:6: (lv_lowerBound_1_0= RULE_INT )
                    // InternalSolverLanguageParser.g:4476:7: lv_lowerBound_1_0= RULE_INT
                    {
                    lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_63); 

                    							newLeafNode(lv_lowerBound_1_0, grammarAccess.getLowerBoundedScopeAccess().getLowerBoundINTTerminalRuleCall_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLowerBoundedScopeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"lowerBound",
                    								lv_lowerBound_1_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,LessThanSignEqualsSign,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getLowerBoundedScopeAccess().getLessThanSignEqualsSignKeyword_1_0_1());
                    				
                    // InternalSolverLanguageParser.g:4496:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:4497:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:4497:6: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:4498:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLowerBoundedScopeRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLowerBoundedScopeAccess().getTypeSymbolCrossReference_1_0_2_0());
                    						
                    pushFollow(FOLLOW_4);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4514:4: ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) )
                    {
                    // InternalSolverLanguageParser.g:4514:4: ( ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) ) )
                    // InternalSolverLanguageParser.g:4515:5: ( ( ruleQualifiedName ) ) otherlv_5= GreaterThanSignEqualsSign ( (lv_lowerBound_6_0= RULE_INT ) )
                    {
                    // InternalSolverLanguageParser.g:4515:5: ( ( ruleQualifiedName ) )
                    // InternalSolverLanguageParser.g:4516:6: ( ruleQualifiedName )
                    {
                    // InternalSolverLanguageParser.g:4516:6: ( ruleQualifiedName )
                    // InternalSolverLanguageParser.g:4517:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLowerBoundedScopeRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getLowerBoundedScopeAccess().getTypeSymbolCrossReference_1_1_0_0());
                    						
                    pushFollow(FOLLOW_64);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_57); 

                    					newLeafNode(otherlv_5, grammarAccess.getLowerBoundedScopeAccess().getGreaterThanSignEqualsSignKeyword_1_1_1());
                    				
                    // InternalSolverLanguageParser.g:4535:5: ( (lv_lowerBound_6_0= RULE_INT ) )
                    // InternalSolverLanguageParser.g:4536:6: (lv_lowerBound_6_0= RULE_INT )
                    {
                    // InternalSolverLanguageParser.g:4536:6: (lv_lowerBound_6_0= RULE_INT )
                    // InternalSolverLanguageParser.g:4537:7: lv_lowerBound_6_0= RULE_INT
                    {
                    lv_lowerBound_6_0=(Token)match(input,RULE_INT,FOLLOW_4); 

                    							newLeafNode(lv_lowerBound_6_0, grammarAccess.getLowerBoundedScopeAccess().getLowerBoundINTTerminalRuleCall_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLowerBoundedScopeRule());
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

            this_FULL_STOP_7=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_7, grammarAccess.getLowerBoundedScopeAccess().getFULL_STOPTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLowerBoundedScope"


    // $ANTLR start "entryRuleObjectiveDeclaration"
    // InternalSolverLanguageParser.g:4563:1: entryRuleObjectiveDeclaration returns [EObject current=null] : iv_ruleObjectiveDeclaration= ruleObjectiveDeclaration EOF ;
    public final EObject entryRuleObjectiveDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectiveDeclaration = null;


        try {
            // InternalSolverLanguageParser.g:4563:61: (iv_ruleObjectiveDeclaration= ruleObjectiveDeclaration EOF )
            // InternalSolverLanguageParser.g:4564:2: iv_ruleObjectiveDeclaration= ruleObjectiveDeclaration EOF
            {
             newCompositeNode(grammarAccess.getObjectiveDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectiveDeclaration=ruleObjectiveDeclaration();

            state._fsp--;

             current =iv_ruleObjectiveDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectiveDeclaration"


    // $ANTLR start "ruleObjectiveDeclaration"
    // InternalSolverLanguageParser.g:4570:1: ruleObjectiveDeclaration returns [EObject current=null] : ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) this_FULL_STOP_2= RULE_FULL_STOP ) ;
    public final EObject ruleObjectiveDeclaration() throws RecognitionException {
        EObject current = null;

        Token this_FULL_STOP_2=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_objective_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4576:2: ( ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) this_FULL_STOP_2= RULE_FULL_STOP ) )
            // InternalSolverLanguageParser.g:4577:2: ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) this_FULL_STOP_2= RULE_FULL_STOP )
            {
            // InternalSolverLanguageParser.g:4577:2: ( ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) this_FULL_STOP_2= RULE_FULL_STOP )
            // InternalSolverLanguageParser.g:4578:3: ( (lv_kind_0_0= ruleObjectiveKind ) ) ( (lv_objective_1_0= ruleExpression ) ) this_FULL_STOP_2= RULE_FULL_STOP
            {
            // InternalSolverLanguageParser.g:4578:3: ( (lv_kind_0_0= ruleObjectiveKind ) )
            // InternalSolverLanguageParser.g:4579:4: (lv_kind_0_0= ruleObjectiveKind )
            {
            // InternalSolverLanguageParser.g:4579:4: (lv_kind_0_0= ruleObjectiveKind )
            // InternalSolverLanguageParser.g:4580:5: lv_kind_0_0= ruleObjectiveKind
            {

            					newCompositeNode(grammarAccess.getObjectiveDeclarationAccess().getKindObjectiveKindEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_kind_0_0=ruleObjectiveKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectiveDeclarationRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_0_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ObjectiveKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguageParser.g:4597:3: ( (lv_objective_1_0= ruleExpression ) )
            // InternalSolverLanguageParser.g:4598:4: (lv_objective_1_0= ruleExpression )
            {
            // InternalSolverLanguageParser.g:4598:4: (lv_objective_1_0= ruleExpression )
            // InternalSolverLanguageParser.g:4599:5: lv_objective_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getObjectiveDeclarationAccess().getObjectiveExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_objective_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectiveDeclarationRule());
            					}
            					set(
            						current,
            						"objective",
            						lv_objective_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_FULL_STOP_2=(Token)match(input,RULE_FULL_STOP,FOLLOW_2); 

            			newLeafNode(this_FULL_STOP_2, grammarAccess.getObjectiveDeclarationAccess().getFULL_STOPTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectiveDeclaration"


    // $ANTLR start "entryRuleUpperMultiplicty"
    // InternalSolverLanguageParser.g:4624:1: entryRuleUpperMultiplicty returns [String current=null] : iv_ruleUpperMultiplicty= ruleUpperMultiplicty EOF ;
    public final String entryRuleUpperMultiplicty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUpperMultiplicty = null;


        try {
            // InternalSolverLanguageParser.g:4624:56: (iv_ruleUpperMultiplicty= ruleUpperMultiplicty EOF )
            // InternalSolverLanguageParser.g:4625:2: iv_ruleUpperMultiplicty= ruleUpperMultiplicty EOF
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
    // InternalSolverLanguageParser.g:4631:1: ruleUpperMultiplicty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= Asterisk ) ;
    public final AntlrDatatypeRuleToken ruleUpperMultiplicty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4637:2: ( (this_INT_0= RULE_INT | kw= Asterisk ) )
            // InternalSolverLanguageParser.g:4638:2: (this_INT_0= RULE_INT | kw= Asterisk )
            {
            // InternalSolverLanguageParser.g:4638:2: (this_INT_0= RULE_INT | kw= Asterisk )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_INT) ) {
                alt58=1;
            }
            else if ( (LA58_0==Asterisk) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalSolverLanguageParser.g:4639:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getUpperMultiplictyAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4647:3: kw= Asterisk
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
    // InternalSolverLanguageParser.g:4656:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguageParser.g:4658:2: (iv_ruleReal= ruleReal EOF )
            // InternalSolverLanguageParser.g:4659:2: iv_ruleReal= ruleReal EOF
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
    // InternalSolverLanguageParser.g:4668:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguageParser.g:4675:2: ( (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT ) )
            // InternalSolverLanguageParser.g:4676:2: (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT )
            {
            // InternalSolverLanguageParser.g:4676:2: (this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT )
            // InternalSolverLanguageParser.g:4677:3: this_INT_0= RULE_INT kw= FullStop this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_66); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getRealAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,FullStop,FOLLOW_57); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getRealAccess().getINTTerminalRuleCall_2());
            		

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


    // $ANTLR start "entryRuleQualifiedNameSegment"
    // InternalSolverLanguageParser.g:4703:1: entryRuleQualifiedNameSegment returns [String current=null] : iv_ruleQualifiedNameSegment= ruleQualifiedNameSegment EOF ;
    public final String entryRuleQualifiedNameSegment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameSegment = null;


        try {
            // InternalSolverLanguageParser.g:4703:60: (iv_ruleQualifiedNameSegment= ruleQualifiedNameSegment EOF )
            // InternalSolverLanguageParser.g:4704:2: iv_ruleQualifiedNameSegment= ruleQualifiedNameSegment EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameSegmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameSegment=ruleQualifiedNameSegment();

            state._fsp--;

             current =iv_ruleQualifiedNameSegment.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameSegment"


    // $ANTLR start "ruleQualifiedNameSegment"
    // InternalSolverLanguageParser.g:4710:1: ruleQualifiedNameSegment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_QUOTED_ID_1= RULE_QUOTED_ID | kw= Object ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameSegment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_QUOTED_ID_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4716:2: ( (this_ID_0= RULE_ID | this_QUOTED_ID_1= RULE_QUOTED_ID | kw= Object ) )
            // InternalSolverLanguageParser.g:4717:2: (this_ID_0= RULE_ID | this_QUOTED_ID_1= RULE_QUOTED_ID | kw= Object )
            {
            // InternalSolverLanguageParser.g:4717:2: (this_ID_0= RULE_ID | this_QUOTED_ID_1= RULE_QUOTED_ID | kw= Object )
            int alt59=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt59=1;
                }
                break;
            case RULE_QUOTED_ID:
                {
                alt59=2;
                }
                break;
            case Object:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalSolverLanguageParser.g:4718:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameSegmentAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4726:3: this_QUOTED_ID_1= RULE_QUOTED_ID
                    {
                    this_QUOTED_ID_1=(Token)match(input,RULE_QUOTED_ID,FOLLOW_2); 

                    			current.merge(this_QUOTED_ID_1);
                    		

                    			newLeafNode(this_QUOTED_ID_1, grammarAccess.getQualifiedNameSegmentAccess().getQUOTED_IDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:4734:3: kw= Object
                    {
                    kw=(Token)match(input,Object,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getQualifiedNameSegmentAccess().getObjectKeyword_2());
                    		

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
    // $ANTLR end "ruleQualifiedNameSegment"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSolverLanguageParser.g:4743:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguageParser.g:4745:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSolverLanguageParser.g:4746:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSolverLanguageParser.g:4755:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedNameSegment_0= ruleQualifiedNameSegment (kw= ColonColon this_QualifiedNameSegment_2= ruleQualifiedNameSegment )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedNameSegment_0 = null;

        AntlrDatatypeRuleToken this_QualifiedNameSegment_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSolverLanguageParser.g:4762:2: ( (this_QualifiedNameSegment_0= ruleQualifiedNameSegment (kw= ColonColon this_QualifiedNameSegment_2= ruleQualifiedNameSegment )* ) )
            // InternalSolverLanguageParser.g:4763:2: (this_QualifiedNameSegment_0= ruleQualifiedNameSegment (kw= ColonColon this_QualifiedNameSegment_2= ruleQualifiedNameSegment )* )
            {
            // InternalSolverLanguageParser.g:4763:2: (this_QualifiedNameSegment_0= ruleQualifiedNameSegment (kw= ColonColon this_QualifiedNameSegment_2= ruleQualifiedNameSegment )* )
            // InternalSolverLanguageParser.g:4764:3: this_QualifiedNameSegment_0= ruleQualifiedNameSegment (kw= ColonColon this_QualifiedNameSegment_2= ruleQualifiedNameSegment )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getQualifiedNameSegmentParserRuleCall_0());
            		
            pushFollow(FOLLOW_67);
            this_QualifiedNameSegment_0=ruleQualifiedNameSegment();

            state._fsp--;


            			current.merge(this_QualifiedNameSegment_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalSolverLanguageParser.g:4774:3: (kw= ColonColon this_QualifiedNameSegment_2= ruleQualifiedNameSegment )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==ColonColon) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalSolverLanguageParser.g:4775:4: kw= ColonColon this_QualifiedNameSegment_2= ruleQualifiedNameSegment
            	    {
            	    kw=(Token)match(input,ColonColon,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getQualifiedNameSegmentParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_67);
            	    this_QualifiedNameSegment_2=ruleQualifiedNameSegment();

            	    state._fsp--;


            	    				current.merge(this_QualifiedNameSegment_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop60;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleAttributeKind"
    // InternalSolverLanguageParser.g:4798:1: ruleAttributeKind returns [Enumerator current=null] : ( (enumLiteral_0= Functional ) | (enumLiteral_1= Error ) | (enumLiteral_2= Root ) | (enumLiteral_3= Containment ) ) ;
    public final Enumerator ruleAttributeKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4804:2: ( ( (enumLiteral_0= Functional ) | (enumLiteral_1= Error ) | (enumLiteral_2= Root ) | (enumLiteral_3= Containment ) ) )
            // InternalSolverLanguageParser.g:4805:2: ( (enumLiteral_0= Functional ) | (enumLiteral_1= Error ) | (enumLiteral_2= Root ) | (enumLiteral_3= Containment ) )
            {
            // InternalSolverLanguageParser.g:4805:2: ( (enumLiteral_0= Functional ) | (enumLiteral_1= Error ) | (enumLiteral_2= Root ) | (enumLiteral_3= Containment ) )
            int alt61=4;
            switch ( input.LA(1) ) {
            case Functional:
                {
                alt61=1;
                }
                break;
            case Error:
                {
                alt61=2;
                }
                break;
            case Root:
                {
                alt61=3;
                }
                break;
            case Containment:
                {
                alt61=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalSolverLanguageParser.g:4806:3: (enumLiteral_0= Functional )
                    {
                    // InternalSolverLanguageParser.g:4806:3: (enumLiteral_0= Functional )
                    // InternalSolverLanguageParser.g:4807:4: enumLiteral_0= Functional
                    {
                    enumLiteral_0=(Token)match(input,Functional,FOLLOW_2); 

                    				current = grammarAccess.getAttributeKindAccess().getFUNCTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttributeKindAccess().getFUNCTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4814:3: (enumLiteral_1= Error )
                    {
                    // InternalSolverLanguageParser.g:4814:3: (enumLiteral_1= Error )
                    // InternalSolverLanguageParser.g:4815:4: enumLiteral_1= Error
                    {
                    enumLiteral_1=(Token)match(input,Error,FOLLOW_2); 

                    				current = grammarAccess.getAttributeKindAccess().getERROREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAttributeKindAccess().getERROREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:4822:3: (enumLiteral_2= Root )
                    {
                    // InternalSolverLanguageParser.g:4822:3: (enumLiteral_2= Root )
                    // InternalSolverLanguageParser.g:4823:4: enumLiteral_2= Root
                    {
                    enumLiteral_2=(Token)match(input,Root,FOLLOW_2); 

                    				current = grammarAccess.getAttributeKindAccess().getROOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAttributeKindAccess().getROOTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:4830:3: (enumLiteral_3= Containment )
                    {
                    // InternalSolverLanguageParser.g:4830:3: (enumLiteral_3= Containment )
                    // InternalSolverLanguageParser.g:4831:4: enumLiteral_3= Containment
                    {
                    enumLiteral_3=(Token)match(input,Containment,FOLLOW_2); 

                    				current = grammarAccess.getAttributeKindAccess().getCONTAINMENTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAttributeKindAccess().getCONTAINMENTEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleAttributeKind"


    // $ANTLR start "ruleComparisonOperator"
    // InternalSolverLanguageParser.g:4841:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) | (enumLiteral_6= In ) ) ;
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
            // InternalSolverLanguageParser.g:4847:2: ( ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) | (enumLiteral_6= In ) ) )
            // InternalSolverLanguageParser.g:4848:2: ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) | (enumLiteral_6= In ) )
            {
            // InternalSolverLanguageParser.g:4848:2: ( (enumLiteral_0= EqualsSignEqualsSign ) | (enumLiteral_1= ExclamationMarkEqualsSign ) | (enumLiteral_2= LessThanSign ) | (enumLiteral_3= LessThanSignEqualsSign ) | (enumLiteral_4= GreaterThanSign ) | (enumLiteral_5= GreaterThanSignEqualsSign ) | (enumLiteral_6= In ) )
            int alt62=7;
            switch ( input.LA(1) ) {
            case EqualsSignEqualsSign:
                {
                alt62=1;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt62=2;
                }
                break;
            case LessThanSign:
                {
                alt62=3;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt62=4;
                }
                break;
            case GreaterThanSign:
                {
                alt62=5;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt62=6;
                }
                break;
            case In:
                {
                alt62=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalSolverLanguageParser.g:4849:3: (enumLiteral_0= EqualsSignEqualsSign )
                    {
                    // InternalSolverLanguageParser.g:4849:3: (enumLiteral_0= EqualsSignEqualsSign )
                    // InternalSolverLanguageParser.g:4850:4: enumLiteral_0= EqualsSignEqualsSign
                    {
                    enumLiteral_0=(Token)match(input,EqualsSignEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4857:3: (enumLiteral_1= ExclamationMarkEqualsSign )
                    {
                    // InternalSolverLanguageParser.g:4857:3: (enumLiteral_1= ExclamationMarkEqualsSign )
                    // InternalSolverLanguageParser.g:4858:4: enumLiteral_1= ExclamationMarkEqualsSign
                    {
                    enumLiteral_1=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getNOT_EQUALSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:4865:3: (enumLiteral_2= LessThanSign )
                    {
                    // InternalSolverLanguageParser.g:4865:3: (enumLiteral_2= LessThanSign )
                    // InternalSolverLanguageParser.g:4866:4: enumLiteral_2= LessThanSign
                    {
                    enumLiteral_2=(Token)match(input,LessThanSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:4873:3: (enumLiteral_3= LessThanSignEqualsSign )
                    {
                    // InternalSolverLanguageParser.g:4873:3: (enumLiteral_3= LessThanSignEqualsSign )
                    // InternalSolverLanguageParser.g:4874:4: enumLiteral_3= LessThanSignEqualsSign
                    {
                    enumLiteral_3=(Token)match(input,LessThanSignEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getLESS_EQUALSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getLESS_EQUALSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSolverLanguageParser.g:4881:3: (enumLiteral_4= GreaterThanSign )
                    {
                    // InternalSolverLanguageParser.g:4881:3: (enumLiteral_4= GreaterThanSign )
                    // InternalSolverLanguageParser.g:4882:4: enumLiteral_4= GreaterThanSign
                    {
                    enumLiteral_4=(Token)match(input,GreaterThanSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSolverLanguageParser.g:4889:3: (enumLiteral_5= GreaterThanSignEqualsSign )
                    {
                    // InternalSolverLanguageParser.g:4889:3: (enumLiteral_5= GreaterThanSignEqualsSign )
                    // InternalSolverLanguageParser.g:4890:4: enumLiteral_5= GreaterThanSignEqualsSign
                    {
                    enumLiteral_5=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_2); 

                    				current = grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getGREATER_EQUALSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSolverLanguageParser.g:4897:3: (enumLiteral_6= In )
                    {
                    // InternalSolverLanguageParser.g:4897:3: (enumLiteral_6= In )
                    // InternalSolverLanguageParser.g:4898:4: enumLiteral_6= In
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
    // InternalSolverLanguageParser.g:4908:1: ruleAdditiveBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) ) ;
    public final Enumerator ruleAdditiveBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4914:2: ( ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) ) )
            // InternalSolverLanguageParser.g:4915:2: ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) )
            {
            // InternalSolverLanguageParser.g:4915:2: ( (enumLiteral_0= PlusSign ) | (enumLiteral_1= HyphenMinus ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==PlusSign) ) {
                alt63=1;
            }
            else if ( (LA63_0==HyphenMinus) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalSolverLanguageParser.g:4916:3: (enumLiteral_0= PlusSign )
                    {
                    // InternalSolverLanguageParser.g:4916:3: (enumLiteral_0= PlusSign )
                    // InternalSolverLanguageParser.g:4917:4: enumLiteral_0= PlusSign
                    {
                    enumLiteral_0=(Token)match(input,PlusSign,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveBinaryOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAdditiveBinaryOperatorAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4924:3: (enumLiteral_1= HyphenMinus )
                    {
                    // InternalSolverLanguageParser.g:4924:3: (enumLiteral_1= HyphenMinus )
                    // InternalSolverLanguageParser.g:4925:4: enumLiteral_1= HyphenMinus
                    {
                    enumLiteral_1=(Token)match(input,HyphenMinus,FOLLOW_2); 

                    				current = grammarAccess.getAdditiveBinaryOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAdditiveBinaryOperatorAccess().getMINUSEnumLiteralDeclaration_1());
                    			

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
    // InternalSolverLanguageParser.g:4935:1: ruleMultiplicativeBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) ) ;
    public final Enumerator ruleMultiplicativeBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4941:2: ( ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) ) )
            // InternalSolverLanguageParser.g:4942:2: ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) )
            {
            // InternalSolverLanguageParser.g:4942:2: ( (enumLiteral_0= Asterisk ) | (enumLiteral_1= Solidus ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==Asterisk) ) {
                alt64=1;
            }
            else if ( (LA64_0==Solidus) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalSolverLanguageParser.g:4943:3: (enumLiteral_0= Asterisk )
                    {
                    // InternalSolverLanguageParser.g:4943:3: (enumLiteral_0= Asterisk )
                    // InternalSolverLanguageParser.g:4944:4: enumLiteral_0= Asterisk
                    {
                    enumLiteral_0=(Token)match(input,Asterisk,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeBinaryOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeBinaryOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4951:3: (enumLiteral_1= Solidus )
                    {
                    // InternalSolverLanguageParser.g:4951:3: (enumLiteral_1= Solidus )
                    // InternalSolverLanguageParser.g:4952:4: enumLiteral_1= Solidus
                    {
                    enumLiteral_1=(Token)match(input,Solidus,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicativeBinaryOperatorAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeBinaryOperatorAccess().getDIVIDEEnumLiteralDeclaration_1());
                    			

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
    // InternalSolverLanguageParser.g:4962:1: ruleExponentialOp returns [Enumerator current=null] : (enumLiteral_0= CircumflexAccent ) ;
    public final Enumerator ruleExponentialOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4968:2: ( (enumLiteral_0= CircumflexAccent ) )
            // InternalSolverLanguageParser.g:4969:2: (enumLiteral_0= CircumflexAccent )
            {
            // InternalSolverLanguageParser.g:4969:2: (enumLiteral_0= CircumflexAccent )
            // InternalSolverLanguageParser.g:4970:3: enumLiteral_0= CircumflexAccent
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


    // $ANTLR start "ruleUnaryOperator"
    // InternalSolverLanguageParser.g:4979:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= ExclamationMark ) | (enumLiteral_1= PlusSign ) | (enumLiteral_2= HyphenMinus ) | (enumLiteral_3= QuestionMark ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:4985:2: ( ( (enumLiteral_0= ExclamationMark ) | (enumLiteral_1= PlusSign ) | (enumLiteral_2= HyphenMinus ) | (enumLiteral_3= QuestionMark ) ) )
            // InternalSolverLanguageParser.g:4986:2: ( (enumLiteral_0= ExclamationMark ) | (enumLiteral_1= PlusSign ) | (enumLiteral_2= HyphenMinus ) | (enumLiteral_3= QuestionMark ) )
            {
            // InternalSolverLanguageParser.g:4986:2: ( (enumLiteral_0= ExclamationMark ) | (enumLiteral_1= PlusSign ) | (enumLiteral_2= HyphenMinus ) | (enumLiteral_3= QuestionMark ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case ExclamationMark:
                {
                alt65=1;
                }
                break;
            case PlusSign:
                {
                alt65=2;
                }
                break;
            case HyphenMinus:
                {
                alt65=3;
                }
                break;
            case QuestionMark:
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalSolverLanguageParser.g:4987:3: (enumLiteral_0= ExclamationMark )
                    {
                    // InternalSolverLanguageParser.g:4987:3: (enumLiteral_0= ExclamationMark )
                    // InternalSolverLanguageParser.g:4988:4: enumLiteral_0= ExclamationMark
                    {
                    enumLiteral_0=(Token)match(input,ExclamationMark,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:4995:3: (enumLiteral_1= PlusSign )
                    {
                    // InternalSolverLanguageParser.g:4995:3: (enumLiteral_1= PlusSign )
                    // InternalSolverLanguageParser.g:4996:4: enumLiteral_1= PlusSign
                    {
                    enumLiteral_1=(Token)match(input,PlusSign,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorAccess().getPLUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getPLUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:5003:3: (enumLiteral_2= HyphenMinus )
                    {
                    // InternalSolverLanguageParser.g:5003:3: (enumLiteral_2= HyphenMinus )
                    // InternalSolverLanguageParser.g:5004:4: enumLiteral_2= HyphenMinus
                    {
                    enumLiteral_2=(Token)match(input,HyphenMinus,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorAccess().getMINUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getMINUSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:5011:3: (enumLiteral_3= QuestionMark )
                    {
                    // InternalSolverLanguageParser.g:5011:3: (enumLiteral_3= QuestionMark )
                    // InternalSolverLanguageParser.g:5012:4: enumLiteral_3= QuestionMark
                    {
                    enumLiteral_3=(Token)match(input,QuestionMark,FOLLOW_2); 

                    				current = grammarAccess.getUnaryOperatorAccess().getMAYBEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnaryOperatorAccess().getMAYBEEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "ruleLogicValue"
    // InternalSolverLanguageParser.g:5022:1: ruleLogicValue returns [Enumerator current=null] : ( (enumLiteral_0= True ) | (enumLiteral_1= False ) | (enumLiteral_2= Unknown ) | (enumLiteral_3= Error ) ) ;
    public final Enumerator ruleLogicValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:5028:2: ( ( (enumLiteral_0= True ) | (enumLiteral_1= False ) | (enumLiteral_2= Unknown ) | (enumLiteral_3= Error ) ) )
            // InternalSolverLanguageParser.g:5029:2: ( (enumLiteral_0= True ) | (enumLiteral_1= False ) | (enumLiteral_2= Unknown ) | (enumLiteral_3= Error ) )
            {
            // InternalSolverLanguageParser.g:5029:2: ( (enumLiteral_0= True ) | (enumLiteral_1= False ) | (enumLiteral_2= Unknown ) | (enumLiteral_3= Error ) )
            int alt66=4;
            switch ( input.LA(1) ) {
            case True:
                {
                alt66=1;
                }
                break;
            case False:
                {
                alt66=2;
                }
                break;
            case Unknown:
                {
                alt66=3;
                }
                break;
            case Error:
                {
                alt66=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalSolverLanguageParser.g:5030:3: (enumLiteral_0= True )
                    {
                    // InternalSolverLanguageParser.g:5030:3: (enumLiteral_0= True )
                    // InternalSolverLanguageParser.g:5031:4: enumLiteral_0= True
                    {
                    enumLiteral_0=(Token)match(input,True,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicValueAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:5038:3: (enumLiteral_1= False )
                    {
                    // InternalSolverLanguageParser.g:5038:3: (enumLiteral_1= False )
                    // InternalSolverLanguageParser.g:5039:4: enumLiteral_1= False
                    {
                    enumLiteral_1=(Token)match(input,False,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicValueAccess().getFALSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguageParser.g:5046:3: (enumLiteral_2= Unknown )
                    {
                    // InternalSolverLanguageParser.g:5046:3: (enumLiteral_2= Unknown )
                    // InternalSolverLanguageParser.g:5047:4: enumLiteral_2= Unknown
                    {
                    enumLiteral_2=(Token)match(input,Unknown,FOLLOW_2); 

                    				current = grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogicValueAccess().getUNKNOWNEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguageParser.g:5054:3: (enumLiteral_3= Error )
                    {
                    // InternalSolverLanguageParser.g:5054:3: (enumLiteral_3= Error )
                    // InternalSolverLanguageParser.g:5055:4: enumLiteral_3= Error
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
    // InternalSolverLanguageParser.g:5065:1: ruleObjectiveKind returns [Enumerator current=null] : ( (enumLiteral_0= Minimize ) | (enumLiteral_1= Maximize ) ) ;
    public final Enumerator ruleObjectiveKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSolverLanguageParser.g:5071:2: ( ( (enumLiteral_0= Minimize ) | (enumLiteral_1= Maximize ) ) )
            // InternalSolverLanguageParser.g:5072:2: ( (enumLiteral_0= Minimize ) | (enumLiteral_1= Maximize ) )
            {
            // InternalSolverLanguageParser.g:5072:2: ( (enumLiteral_0= Minimize ) | (enumLiteral_1= Maximize ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Minimize) ) {
                alt67=1;
            }
            else if ( (LA67_0==Maximize) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalSolverLanguageParser.g:5073:3: (enumLiteral_0= Minimize )
                    {
                    // InternalSolverLanguageParser.g:5073:3: (enumLiteral_0= Minimize )
                    // InternalSolverLanguageParser.g:5074:4: enumLiteral_0= Minimize
                    {
                    enumLiteral_0=(Token)match(input,Minimize,FOLLOW_2); 

                    				current = grammarAccess.getObjectiveKindAccess().getMINIMIZATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getObjectiveKindAccess().getMINIMIZATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguageParser.g:5081:3: (enumLiteral_1= Maximize )
                    {
                    // InternalSolverLanguageParser.g:5081:3: (enumLiteral_1= Maximize )
                    // InternalSolverLanguageParser.g:5082:4: enumLiteral_1= Maximize
                    {
                    enumLiteral_1=(Token)match(input,Maximize,FOLLOW_2); 

                    				current = grammarAccess.getObjectiveKindAccess().getMAXIMIZATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getObjectiveKindAccess().getMAXIMIZATIONEnumLiteralDeclaration_1());
                    			

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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA53 dfa53 = new DFA53(this);
    static final String dfa_1s = "\35\uffff";
    static final String dfa_2s = "\1\4\1\uffff\3\22\1\5\1\22\1\uffff\1\6\6\uffff\1\22\2\uffff\3\45\1\uffff\4\22\3\45";
    static final String dfa_3s = "\1\113\1\uffff\5\112\1\uffff\1\112\6\uffff\1\112\2\uffff\3\111\1\uffff\4\112\3\111";
    static final String dfa_4s = "\1\uffff\1\1\5\uffff\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff\1\5\1\2\3\uffff\1\3\7\uffff";
    static final String dfa_5s = "\35\uffff}>";
    static final String[] dfa_6s = {
            "\1\11\1\6\1\15\2\uffff\2\14\1\uffff\1\7\2\uffff\1\1\1\12\1\uffff\1\4\1\uffff\1\15\2\1\1\5\1\1\1\13\1\uffff\1\16\1\10\1\uffff\1\1\1\uffff\2\1\12\uffff\1\1\1\uffff\2\1\2\uffff\1\1\1\uffff\1\1\7\uffff\2\1\5\uffff\2\1\1\3\4\uffff\1\2\1\1",
            "",
            "\1\20\17\uffff\3\1\1\17\6\1\1\uffff\1\1\1\uffff\1\1\1\uffff\11\1\1\uffff\1\1\3\uffff\2\1\2\uffff\1\20\1\uffff\1\20\1\uffff\3\1\1\20",
            "\1\20\17\uffff\3\1\1\17\6\1\1\uffff\1\1\1\uffff\1\1\1\uffff\11\1\1\uffff\1\1\3\uffff\2\1\2\uffff\1\20\1\uffff\1\20\1\uffff\3\1\1\20",
            "\1\20\17\uffff\3\1\1\17\6\1\1\uffff\1\1\1\uffff\1\1\1\uffff\11\1\1\uffff\1\1\3\uffff\2\1\2\uffff\1\20\1\uffff\1\20\1\uffff\3\1\1\20",
            "\1\21\14\uffff\1\24\17\uffff\3\1\1\uffff\6\1\1\uffff\1\1\1\uffff\1\25\1\uffff\4\1\1\uffff\4\1\1\uffff\1\1\3\uffff\1\1\3\uffff\1\21\1\uffff\1\23\3\uffff\1\1\1\22",
            "\1\24\4\uffff\1\21\53\uffff\1\21\1\uffff\1\23\4\uffff\1\22",
            "",
            "\1\15\13\uffff\1\11\1\uffff\1\15\7\uffff\1\15\50\uffff\1\11\4\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30\62\uffff\1\27\4\uffff\1\26",
            "",
            "",
            "\1\31\11\uffff\1\21\5\uffff\1\21\21\uffff\2\21\1\11",
            "\1\31\11\uffff\1\21\5\uffff\1\21\21\uffff\2\21\1\11",
            "\1\31\11\uffff\1\21\5\uffff\1\21\21\uffff\2\21\1\11",
            "",
            "\1\20\17\uffff\3\1\1\17\6\1\1\uffff\1\1\1\uffff\1\1\1\uffff\11\1\1\uffff\1\1\3\uffff\2\1\2\uffff\1\20\1\uffff\1\20\1\uffff\3\1\1\20",
            "\1\20\17\uffff\3\1\1\17\6\1\1\uffff\1\1\1\uffff\1\1\1\uffff\11\1\1\uffff\1\1\3\uffff\2\1\2\uffff\1\20\1\uffff\1\20\1\uffff\3\1\1\20",
            "\1\20\17\uffff\3\1\1\17\6\1\1\uffff\1\1\1\uffff\1\1\1\uffff\11\1\1\uffff\1\1\3\uffff\2\1\2\uffff\1\20\1\uffff\1\20\1\uffff\3\1\1\20",
            "\1\34\62\uffff\1\33\4\uffff\1\32",
            "\1\31\11\uffff\1\21\5\uffff\1\21\21\uffff\2\21\1\11",
            "\1\31\11\uffff\1\21\5\uffff\1\21\21\uffff\2\21\1\11",
            "\1\31\11\uffff\1\21\5\uffff\1\21\21\uffff\2\21\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "158:2: (this_AssertionOrDefinition_0= ruleAssertionOrDefinition | this_PredicateDefinition_1= rulePredicateDefinition | this_UnnamedErrorPredicateDefintion_2= ruleUnnamedErrorPredicateDefintion | this_DefaultAssertion_3= ruleDefaultAssertion | this_FunctionDefinition_4= ruleFunctionDefinition | this_Attribute_5= ruleAttribute | this_ExternDeclaration_6= ruleExternDeclaration | this_ScopeDeclaration_7= ruleScopeDeclaration | this_ObjectiveDeclaration_8= ruleObjectiveDeclaration | this_ClassDeclaration_9= ruleClassDeclaration | this_EnumDeclaration_10= ruleEnumDeclaration )";
        }
    }
    static final String dfa_7s = "\24\uffff";
    static final String dfa_8s = "\1\20\1\5\2\uffff\4\22\3\45\4\22\2\uffff\3\45";
    static final String dfa_9s = "\1\20\1\112\2\uffff\4\112\3\100\4\112\2\uffff\3\100";
    static final String dfa_10s = "\2\uffff\1\4\1\1\13\uffff\1\3\1\2\3\uffff";
    static final String dfa_11s = "\24\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\3\2\uffff\1\2\11\uffff\1\6\4\uffff\1\3\55\uffff\1\5\4\uffff\1\4",
            "",
            "",
            "\1\12\22\uffff\1\7\11\uffff\1\3\25\uffff\1\11\4\uffff\1\10",
            "\1\12\22\uffff\1\7\11\uffff\1\3\25\uffff\1\11\4\uffff\1\10",
            "\1\12\22\uffff\1\7\11\uffff\1\3\25\uffff\1\11\4\uffff\1\10",
            "\1\15\62\uffff\1\14\4\uffff\1\13",
            "\1\16\11\uffff\1\20\20\uffff\1\17",
            "\1\16\11\uffff\1\20\20\uffff\1\17",
            "\1\16\11\uffff\1\20\20\uffff\1\17",
            "\1\12\22\uffff\1\7\11\uffff\1\3\25\uffff\1\11\4\uffff\1\10",
            "\1\12\22\uffff\1\7\11\uffff\1\3\25\uffff\1\11\4\uffff\1\10",
            "\1\12\22\uffff\1\7\11\uffff\1\3\25\uffff\1\11\4\uffff\1\10",
            "\1\23\62\uffff\1\22\4\uffff\1\21",
            "",
            "",
            "\1\16\11\uffff\1\20\20\uffff\1\17",
            "\1\16\11\uffff\1\20\20\uffff\1\17",
            "\1\16\11\uffff\1\20\20\uffff\1\17"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1041:2: (this_ExternPredicateDeclaration_0= ruleExternPredicateDeclaration | this_ExternFunctionDeclaration_1= ruleExternFunctionDeclaration | this_ExternAggregationOperatorDeclaration_2= ruleExternAggregationOperatorDeclaration | this_ExternDatatypeDeclaration_3= ruleExternDatatypeDeclaration )";
        }
    }
    static final String dfa_13s = "\13\uffff";
    static final String dfa_14s = "\2\uffff\3\1\3\uffff\3\1";
    static final String dfa_15s = "\1\17\1\uffff\3\32\1\uffff\1\22\1\uffff\3\32";
    static final String dfa_16s = "\1\113\1\uffff\3\111\1\uffff\1\112\1\uffff\3\111";
    static final String dfa_17s = "\1\uffff\1\1\3\uffff\1\3\1\uffff\1\2\3\uffff";
    static final String dfa_18s = "\13\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\2\uffff\1\4\2\uffff\1\5\3\1\5\uffff\1\1\1\uffff\1\1\16\uffff\1\1\15\uffff\1\1\5\uffff\2\1\1\3\4\uffff\1\2\1\1",
            "",
            "\1\1\2\uffff\1\1\4\uffff\3\1\1\6\6\1\1\uffff\1\1\1\uffff\13\1\1\uffff\1\1\2\uffff\2\1\1\7\2\1\4\uffff\3\1",
            "\1\1\2\uffff\1\1\4\uffff\3\1\1\6\6\1\1\uffff\1\1\1\uffff\13\1\1\uffff\1\1\2\uffff\2\1\1\7\2\1\4\uffff\3\1",
            "\1\1\2\uffff\1\1\4\uffff\3\1\1\6\6\1\1\uffff\1\1\1\uffff\13\1\1\uffff\1\1\2\uffff\2\1\1\7\2\1\4\uffff\3\1",
            "",
            "\1\12\62\uffff\1\11\4\uffff\1\10",
            "",
            "\1\1\2\uffff\1\1\4\uffff\3\1\1\6\6\1\1\uffff\1\1\1\uffff\13\1\1\uffff\1\1\2\uffff\2\1\1\7\2\1\4\uffff\3\1",
            "\1\1\2\uffff\1\1\4\uffff\3\1\1\6\6\1\1\uffff\1\1\1\uffff\13\1\1\uffff\1\1\2\uffff\2\1\1\7\2\1\4\uffff\3\1",
            "\1\1\2\uffff\1\1\4\uffff\3\1\1\6\6\1\1\uffff\1\1\1\uffff\13\1\1\uffff\1\1\2\uffff\2\1\1\7\2\1\4\uffff\3\1"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2451:2: (this_AtomicExpression_0= ruleAtomicExpression | this_Aggregation_1= ruleAggregation | this_Count_2= ruleCount )";
        }
    }
    static final String dfa_20s = "\33\uffff";
    static final String dfa_21s = "\2\uffff\3\14\4\uffff\2\14\3\uffff\3\14\1\uffff\3\14\1\uffff\5\14";
    static final String dfa_22s = "\1\17\1\22\3\32\3\uffff\1\22\2\32\1\22\2\uffff\3\32\1\22\3\32\1\22\5\32";
    static final String dfa_23s = "\1\113\1\112\3\111\3\uffff\1\112\2\111\1\112\2\uffff\3\111\1\112\3\111\1\112\5\111";
    static final String dfa_24s = "\5\uffff\1\3\1\4\1\5\4\uffff\1\1\1\2\15\uffff";
    static final String dfa_25s = "\33\uffff}>";
    static final String[] dfa_26s = {
            "\1\6\2\uffff\1\4\3\uffff\3\6\5\uffff\1\6\1\uffff\1\6\16\uffff\1\7\15\uffff\1\5\5\uffff\1\1\1\6\1\3\4\uffff\1\2\1\6",
            "\1\4\62\uffff\1\3\4\uffff\1\2",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\10\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\4\uffff\1\11\1\12\1\14",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\10\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\4\uffff\1\11\1\12\1\14",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\10\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\4\uffff\1\11\1\12\1\14",
            "",
            "",
            "",
            "\1\20\62\uffff\1\17\4\uffff\1\16",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\uffff\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\6\uffff\1\14",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\uffff\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\6\uffff\1\14",
            "\1\24\60\uffff\1\21\1\uffff\1\23\4\uffff\1\22",
            "",
            "",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\10\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\4\uffff\1\11\1\12\1\14",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\10\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\4\uffff\1\11\1\12\1\14",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\10\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\4\uffff\1\11\1\12\1\14",
            "\1\24\62\uffff\1\23\4\uffff\1\22",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\25\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\4\uffff\1\26\1\27\1\14",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\25\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\4\uffff\1\26\1\27\1\14",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\25\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\4\uffff\1\26\1\27\1\14",
            "\1\32\62\uffff\1\31\4\uffff\1\30",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\uffff\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\6\uffff\1\14",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\uffff\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\6\uffff\1\14",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\25\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\4\uffff\1\26\1\27\1\14",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\25\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\4\uffff\1\26\1\27\1\14",
            "\1\14\2\uffff\1\14\4\uffff\3\14\1\25\6\14\1\uffff\1\14\1\uffff\1\15\5\14\1\13\4\14\1\uffff\1\14\2\uffff\2\14\1\uffff\2\14\4\uffff\1\26\1\27\1\14"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2631:2: (this_Reference_0= ruleReference | this_Call_1= ruleCall | this_Interval_2= ruleInterval | this_Literal_3= ruleLiteral | (otherlv_4= LeftParenthesis this_Expression_5= ruleExpression otherlv_6= RightParenthesis ) )";
        }
    }
    static final String dfa_27s = "\16\uffff";
    static final String dfa_28s = "\2\uffff\3\1\2\uffff\1\15\2\uffff\3\1\1\uffff";
    static final String dfa_29s = "\1\17\1\uffff\3\22\1\uffff\1\22\1\17\1\61\1\uffff\3\22\1\uffff";
    static final String dfa_30s = "\1\113\1\uffff\3\112\1\uffff\1\112\1\113\1\112\1\uffff\3\112\1\uffff";
    static final String dfa_31s = "\1\uffff\1\1\3\uffff\1\2\3\uffff\1\3\3\uffff\1\4";
    static final String dfa_32s = "\16\uffff}>";
    static final String[] dfa_33s = {
            "\1\1\2\uffff\1\4\2\uffff\4\1\5\uffff\1\1\1\uffff\1\1\15\uffff\2\1\1\uffff\1\5\1\1\1\uffff\1\1\7\uffff\2\1\5\uffff\2\1\1\3\4\uffff\1\2\1\1",
            "",
            "\1\10\17\uffff\1\1\2\uffff\1\6\1\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\7\5\1\2\uffff\1\1\1\uffff\1\1\3\uffff\2\1\6\uffff\2\1\1\uffff\1\11",
            "\1\10\17\uffff\1\1\2\uffff\1\6\1\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\7\5\1\2\uffff\1\1\1\uffff\1\1\3\uffff\2\1\6\uffff\2\1\1\uffff\1\11",
            "\1\10\17\uffff\1\1\2\uffff\1\6\1\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\7\5\1\2\uffff\1\1\1\uffff\1\1\3\uffff\2\1\6\uffff\2\1\1\uffff\1\11",
            "",
            "\1\14\62\uffff\1\13\4\uffff\1\12",
            "\1\1\2\uffff\1\1\2\uffff\4\1\5\uffff\1\1\1\uffff\1\1\15\uffff\2\1\1\15\1\uffff\1\1\1\15\1\1\7\uffff\2\1\5\uffff\3\1\4\uffff\2\1",
            "\1\15\30\uffff\1\11",
            "",
            "\1\10\17\uffff\1\1\2\uffff\1\6\1\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\7\5\1\2\uffff\1\1\1\uffff\1\1\3\uffff\2\1\6\uffff\2\1\1\uffff\1\11",
            "\1\10\17\uffff\1\1\2\uffff\1\6\1\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\7\5\1\2\uffff\1\1\1\uffff\1\1\3\uffff\2\1\6\uffff\2\1\1\uffff\1\11",
            "\1\10\17\uffff\1\1\2\uffff\1\6\1\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\7\5\1\2\uffff\1\1\1\uffff\1\1\3\uffff\2\1\6\uffff\2\1\1\uffff\1\11",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "2841:2: (this_ExpressionArgument_0= ruleExpressionArgument | this_StarArgument_1= ruleStarArgument | this_TypedVariableArgument_2= ruleTypedVariableArgument | this_TypedStarArgument_3= ruleTypedStarArgument )";
        }
    }
    static final String dfa_34s = "\25\uffff";
    static final String dfa_35s = "\1\31\1\22\1\47\3\45\1\22\1\uffff\1\22\2\uffff\6\45\1\22\3\45";
    static final String dfa_36s = "\1\31\1\113\4\52\1\112\1\uffff\1\112\2\uffff\3\111\3\52\1\112\3\111";
    static final String dfa_37s = "\7\uffff\1\2\1\uffff\1\1\1\3\12\uffff";
    static final String dfa_38s = "\25\uffff}>";
    static final String[] dfa_39s = {
            "\1\1",
            "\1\5\62\uffff\1\4\4\uffff\1\3\1\2",
            "\1\6\2\uffff\1\7",
            "\1\10\1\uffff\1\7\1\11\1\uffff\1\12",
            "\1\10\1\uffff\1\7\1\11\1\uffff\1\12",
            "\1\10\1\uffff\1\7\1\11\1\uffff\1\12",
            "\1\15\62\uffff\1\14\4\uffff\1\13",
            "",
            "\1\20\62\uffff\1\17\4\uffff\1\16",
            "",
            "",
            "\1\21\1\uffff\1\7\41\uffff\1\12",
            "\1\21\1\uffff\1\7\41\uffff\1\12",
            "\1\21\1\uffff\1\7\41\uffff\1\12",
            "\1\10\1\uffff\1\7\1\11\1\uffff\1\12",
            "\1\10\1\uffff\1\7\1\11\1\uffff\1\12",
            "\1\10\1\uffff\1\7\1\11\1\uffff\1\12",
            "\1\24\62\uffff\1\23\4\uffff\1\22",
            "\1\21\1\uffff\1\7\41\uffff\1\12",
            "\1\21\1\uffff\1\7\41\uffff\1\12",
            "\1\21\1\uffff\1\7\41\uffff\1\12"
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_34;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "4199:2: (this_ExactScope_0= ruleExactScope | this_BoundedScope_1= ruleBoundedScope | this_LowerBoundedScope_2= ruleLowerBoundedScope )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000420L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x3014D0035BF79672L,0x0000000000000C38L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x3014D0035BF59672L,0x0000000000000C38L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0080005000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x3014D00341E48000L,0x0000000000000C38L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000840000L,0x0000000000000428L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000428L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040020L,0x0000000000000428L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000840020L,0x0000000000000420L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008200000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0100000800000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0A00258400000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0014000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0042000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x2000800141E48000L,0x0000000000000C38L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x3017D00341E48000L,0x0000000000000C38L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x3016D00341E48000L,0x0000000000000C38L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000010100040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000201L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000201L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00000000000C0080L,0x0000000000000424L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0100000000000802L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000201L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000404L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000404L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000C20L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000002000000002L});

}
