package org.eclipse.viatra.solver.language.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'.'", "'true'", "'false'", "'unknown'", "'error'", "'('", "','", "')'", "':'", "'exists'", "'equals'", "'bool'", "'int'", "'real'", "'string'", "'\\''", "':-'", "'|'", "'+'", "'*'", "'default'", "'abstract'", "'class'", "'extends'", "'{'", "'}'", "'enum'", "'containment'", "'relation'", "'..'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalSolverLanguage.g:64:1: entryRuleProblem returns [EObject current=null] : iv_ruleProblem= ruleProblem EOF ;
    public final EObject entryRuleProblem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblem = null;


        try {
            // InternalSolverLanguage.g:64:48: (iv_ruleProblem= ruleProblem EOF )
            // InternalSolverLanguage.g:65:2: iv_ruleProblem= ruleProblem EOF
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
    // InternalSolverLanguage.g:71:1: ruleProblem returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleProblem() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalSolverLanguage.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalSolverLanguage.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==16||(LA1_0>=21 && LA1_0<=26)||(LA1_0>=32 && LA1_0<=34)||(LA1_0>=38 && LA1_0<=40)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSolverLanguage.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalSolverLanguage.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalSolverLanguage.g:80:4: lv_statements_0_0= ruleStatement
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
    // InternalSolverLanguage.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalSolverLanguage.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalSolverLanguage.g:101:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalSolverLanguage.g:107:1: ruleStatement returns [EObject current=null] : (this_Interpretation_0= ruleInterpretation | this_Predicate_1= rulePredicate ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Interpretation_0 = null;

        EObject this_Predicate_1 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:113:2: ( (this_Interpretation_0= ruleInterpretation | this_Predicate_1= rulePredicate ) )
            // InternalSolverLanguage.g:114:2: (this_Interpretation_0= ruleInterpretation | this_Predicate_1= rulePredicate )
            {
            // InternalSolverLanguage.g:114:2: (this_Interpretation_0= ruleInterpretation | this_Predicate_1= rulePredicate )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSolverLanguage.g:115:3: this_Interpretation_0= ruleInterpretation
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getInterpretationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interpretation_0=ruleInterpretation();

                    state._fsp--;


                    			current = this_Interpretation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:124:3: this_Predicate_1= rulePredicate
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPredicateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Predicate_1=rulePredicate();

                    state._fsp--;


                    			current = this_Predicate_1;
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


    // $ANTLR start "entryRuleREALLiteral"
    // InternalSolverLanguage.g:136:1: entryRuleREALLiteral returns [String current=null] : iv_ruleREALLiteral= ruleREALLiteral EOF ;
    public final String entryRuleREALLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREALLiteral = null;


        try {
            // InternalSolverLanguage.g:136:51: (iv_ruleREALLiteral= ruleREALLiteral EOF )
            // InternalSolverLanguage.g:137:2: iv_ruleREALLiteral= ruleREALLiteral EOF
            {
             newCompositeNode(grammarAccess.getREALLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREALLiteral=ruleREALLiteral();

            state._fsp--;

             current =iv_ruleREALLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREALLiteral"


    // $ANTLR start "ruleREALLiteral"
    // InternalSolverLanguage.g:143:1: ruleREALLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREALLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:149:2: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // InternalSolverLanguage.g:150:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // InternalSolverLanguage.g:150:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalSolverLanguage.g:151:3: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // InternalSolverLanguage.g:151:3: (kw= '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSolverLanguage.g:152:4: kw= '-'
                    {
                    kw=(Token)match(input,11,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getREALLiteralAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_5); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getREALLiteralAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,12,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALLiteralAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getREALLiteralAccess().getINTTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleREALLiteral"


    // $ANTLR start "entryRuleINTLiteral"
    // InternalSolverLanguage.g:181:1: entryRuleINTLiteral returns [String current=null] : iv_ruleINTLiteral= ruleINTLiteral EOF ;
    public final String entryRuleINTLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTLiteral = null;


        try {
            // InternalSolverLanguage.g:181:50: (iv_ruleINTLiteral= ruleINTLiteral EOF )
            // InternalSolverLanguage.g:182:2: iv_ruleINTLiteral= ruleINTLiteral EOF
            {
             newCompositeNode(grammarAccess.getINTLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINTLiteral=ruleINTLiteral();

            state._fsp--;

             current =iv_ruleINTLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTLiteral"


    // $ANTLR start "ruleINTLiteral"
    // InternalSolverLanguage.g:188:1: ruleINTLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleINTLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:194:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSolverLanguage.g:195:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSolverLanguage.g:195:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSolverLanguage.g:196:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSolverLanguage.g:196:3: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSolverLanguage.g:197:4: kw= '-'
                    {
                    kw=(Token)match(input,11,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getINTLiteralAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getINTLiteralAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTLiteral"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalSolverLanguage.g:214:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalSolverLanguage.g:214:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalSolverLanguage.g:215:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalSolverLanguage.g:221:1: ruleBooleanValue returns [EObject current=null] : ( ( () otherlv_1= 'true' ) | (otherlv_2= 'false' () ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:227:2: ( ( ( () otherlv_1= 'true' ) | (otherlv_2= 'false' () ) ) )
            // InternalSolverLanguage.g:228:2: ( ( () otherlv_1= 'true' ) | (otherlv_2= 'false' () ) )
            {
            // InternalSolverLanguage.g:228:2: ( ( () otherlv_1= 'true' ) | (otherlv_2= 'false' () ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSolverLanguage.g:229:3: ( () otherlv_1= 'true' )
                    {
                    // InternalSolverLanguage.g:229:3: ( () otherlv_1= 'true' )
                    // InternalSolverLanguage.g:230:4: () otherlv_1= 'true'
                    {
                    // InternalSolverLanguage.g:230:4: ()
                    // InternalSolverLanguage.g:231:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBooleanValueAccess().getBooleanTrueAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getBooleanValueAccess().getTrueKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:243:3: (otherlv_2= 'false' () )
                    {
                    // InternalSolverLanguage.g:243:3: (otherlv_2= 'false' () )
                    // InternalSolverLanguage.g:244:4: otherlv_2= 'false' ()
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBooleanValueAccess().getFalseKeyword_1_0());
                    			
                    // InternalSolverLanguage.g:248:4: ()
                    // InternalSolverLanguage.g:249:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBooleanValueAccess().getBooleanFalseAction_1_1(),
                    						current);
                    				

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleTruthValue"
    // InternalSolverLanguage.g:260:1: entryRuleTruthValue returns [EObject current=null] : iv_ruleTruthValue= ruleTruthValue EOF ;
    public final EObject entryRuleTruthValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTruthValue = null;


        try {
            // InternalSolverLanguage.g:260:51: (iv_ruleTruthValue= ruleTruthValue EOF )
            // InternalSolverLanguage.g:261:2: iv_ruleTruthValue= ruleTruthValue EOF
            {
             newCompositeNode(grammarAccess.getTruthValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTruthValue=ruleTruthValue();

            state._fsp--;

             current =iv_ruleTruthValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTruthValue"


    // $ANTLR start "ruleTruthValue"
    // InternalSolverLanguage.g:267:1: ruleTruthValue returns [EObject current=null] : ( ( () otherlv_1= 'true' ) | ( () otherlv_3= 'false' ) | ( () otherlv_5= 'unknown' ) | ( () otherlv_7= 'error' ) ) ;
    public final EObject ruleTruthValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:273:2: ( ( ( () otherlv_1= 'true' ) | ( () otherlv_3= 'false' ) | ( () otherlv_5= 'unknown' ) | ( () otherlv_7= 'error' ) ) )
            // InternalSolverLanguage.g:274:2: ( ( () otherlv_1= 'true' ) | ( () otherlv_3= 'false' ) | ( () otherlv_5= 'unknown' ) | ( () otherlv_7= 'error' ) )
            {
            // InternalSolverLanguage.g:274:2: ( ( () otherlv_1= 'true' ) | ( () otherlv_3= 'false' ) | ( () otherlv_5= 'unknown' ) | ( () otherlv_7= 'error' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSolverLanguage.g:275:3: ( () otherlv_1= 'true' )
                    {
                    // InternalSolverLanguage.g:275:3: ( () otherlv_1= 'true' )
                    // InternalSolverLanguage.g:276:4: () otherlv_1= 'true'
                    {
                    // InternalSolverLanguage.g:276:4: ()
                    // InternalSolverLanguage.g:277:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTruthValueAccess().getTrueAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTruthValueAccess().getTrueKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:289:3: ( () otherlv_3= 'false' )
                    {
                    // InternalSolverLanguage.g:289:3: ( () otherlv_3= 'false' )
                    // InternalSolverLanguage.g:290:4: () otherlv_3= 'false'
                    {
                    // InternalSolverLanguage.g:290:4: ()
                    // InternalSolverLanguage.g:291:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTruthValueAccess().getFalseAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTruthValueAccess().getFalseKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:303:3: ( () otherlv_5= 'unknown' )
                    {
                    // InternalSolverLanguage.g:303:3: ( () otherlv_5= 'unknown' )
                    // InternalSolverLanguage.g:304:4: () otherlv_5= 'unknown'
                    {
                    // InternalSolverLanguage.g:304:4: ()
                    // InternalSolverLanguage.g:305:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTruthValueAccess().getUnknownAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTruthValueAccess().getUnknownKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSolverLanguage.g:317:3: ( () otherlv_7= 'error' )
                    {
                    // InternalSolverLanguage.g:317:3: ( () otherlv_7= 'error' )
                    // InternalSolverLanguage.g:318:4: () otherlv_7= 'error'
                    {
                    // InternalSolverLanguage.g:318:4: ()
                    // InternalSolverLanguage.g:319:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTruthValueAccess().getErrorAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getTruthValueAccess().getErrorKeyword_3_1());
                    			

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
    // $ANTLR end "ruleTruthValue"


    // $ANTLR start "entryRuleInterpretation"
    // InternalSolverLanguage.g:334:1: entryRuleInterpretation returns [EObject current=null] : iv_ruleInterpretation= ruleInterpretation EOF ;
    public final EObject entryRuleInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterpretation = null;


        try {
            // InternalSolverLanguage.g:334:55: (iv_ruleInterpretation= ruleInterpretation EOF )
            // InternalSolverLanguage.g:335:2: iv_ruleInterpretation= ruleInterpretation EOF
            {
             newCompositeNode(grammarAccess.getInterpretationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterpretation=ruleInterpretation();

            state._fsp--;

             current =iv_ruleInterpretation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterpretation"


    // $ANTLR start "ruleInterpretation"
    // InternalSolverLanguage.g:341:1: ruleInterpretation returns [EObject current=null] : (this_BasicInterpretation_0= ruleBasicInterpretation | this_DefaultInterpretation_1= ruleDefaultInterpretation | this_CDInterpretation_2= ruleCDInterpretation ) ;
    public final EObject ruleInterpretation() throws RecognitionException {
        EObject current = null;

        EObject this_BasicInterpretation_0 = null;

        EObject this_DefaultInterpretation_1 = null;

        EObject this_CDInterpretation_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:347:2: ( (this_BasicInterpretation_0= ruleBasicInterpretation | this_DefaultInterpretation_1= ruleDefaultInterpretation | this_CDInterpretation_2= ruleCDInterpretation ) )
            // InternalSolverLanguage.g:348:2: (this_BasicInterpretation_0= ruleBasicInterpretation | this_DefaultInterpretation_1= ruleDefaultInterpretation | this_CDInterpretation_2= ruleCDInterpretation )
            {
            // InternalSolverLanguage.g:348:2: (this_BasicInterpretation_0= ruleBasicInterpretation | this_DefaultInterpretation_1= ruleDefaultInterpretation | this_CDInterpretation_2= ruleCDInterpretation )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
            case 34:
            case 38:
            case 39:
            case 40:
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
                    // InternalSolverLanguage.g:349:3: this_BasicInterpretation_0= ruleBasicInterpretation
                    {

                    			newCompositeNode(grammarAccess.getInterpretationAccess().getBasicInterpretationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicInterpretation_0=ruleBasicInterpretation();

                    state._fsp--;


                    			current = this_BasicInterpretation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:358:3: this_DefaultInterpretation_1= ruleDefaultInterpretation
                    {

                    			newCompositeNode(grammarAccess.getInterpretationAccess().getDefaultInterpretationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefaultInterpretation_1=ruleDefaultInterpretation();

                    state._fsp--;


                    			current = this_DefaultInterpretation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:367:3: this_CDInterpretation_2= ruleCDInterpretation
                    {

                    			newCompositeNode(grammarAccess.getInterpretationAccess().getCDInterpretationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CDInterpretation_2=ruleCDInterpretation();

                    state._fsp--;


                    			current = this_CDInterpretation_2;
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
    // $ANTLR end "ruleInterpretation"


    // $ANTLR start "entryRuleBasicInterpretation"
    // InternalSolverLanguage.g:379:1: entryRuleBasicInterpretation returns [EObject current=null] : iv_ruleBasicInterpretation= ruleBasicInterpretation EOF ;
    public final EObject entryRuleBasicInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicInterpretation = null;


        try {
            // InternalSolverLanguage.g:379:60: (iv_ruleBasicInterpretation= ruleBasicInterpretation EOF )
            // InternalSolverLanguage.g:380:2: iv_ruleBasicInterpretation= ruleBasicInterpretation EOF
            {
             newCompositeNode(grammarAccess.getBasicInterpretationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicInterpretation=ruleBasicInterpretation();

            state._fsp--;

             current =iv_ruleBasicInterpretation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicInterpretation"


    // $ANTLR start "ruleBasicInterpretation"
    // InternalSolverLanguage.g:386:1: ruleBasicInterpretation returns [EObject current=null] : ( ( (lv_symbol_0_0= ruleSymbol ) ) (otherlv_1= '(' ( ( (lv_objects_2_0= ruleComplexObject ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleComplexObject ) ) )* )? otherlv_5= ')' )? otherlv_6= ':' ( (lv_value_7_0= ruleTruthValue ) ) ) ;
    public final EObject ruleBasicInterpretation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_symbol_0_0 = null;

        EObject lv_objects_2_0 = null;

        EObject lv_objects_4_0 = null;

        EObject lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:392:2: ( ( ( (lv_symbol_0_0= ruleSymbol ) ) (otherlv_1= '(' ( ( (lv_objects_2_0= ruleComplexObject ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleComplexObject ) ) )* )? otherlv_5= ')' )? otherlv_6= ':' ( (lv_value_7_0= ruleTruthValue ) ) ) )
            // InternalSolverLanguage.g:393:2: ( ( (lv_symbol_0_0= ruleSymbol ) ) (otherlv_1= '(' ( ( (lv_objects_2_0= ruleComplexObject ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleComplexObject ) ) )* )? otherlv_5= ')' )? otherlv_6= ':' ( (lv_value_7_0= ruleTruthValue ) ) )
            {
            // InternalSolverLanguage.g:393:2: ( ( (lv_symbol_0_0= ruleSymbol ) ) (otherlv_1= '(' ( ( (lv_objects_2_0= ruleComplexObject ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleComplexObject ) ) )* )? otherlv_5= ')' )? otherlv_6= ':' ( (lv_value_7_0= ruleTruthValue ) ) )
            // InternalSolverLanguage.g:394:3: ( (lv_symbol_0_0= ruleSymbol ) ) (otherlv_1= '(' ( ( (lv_objects_2_0= ruleComplexObject ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleComplexObject ) ) )* )? otherlv_5= ')' )? otherlv_6= ':' ( (lv_value_7_0= ruleTruthValue ) )
            {
            // InternalSolverLanguage.g:394:3: ( (lv_symbol_0_0= ruleSymbol ) )
            // InternalSolverLanguage.g:395:4: (lv_symbol_0_0= ruleSymbol )
            {
            // InternalSolverLanguage.g:395:4: (lv_symbol_0_0= ruleSymbol )
            // InternalSolverLanguage.g:396:5: lv_symbol_0_0= ruleSymbol
            {

            					newCompositeNode(grammarAccess.getBasicInterpretationAccess().getSymbolSymbolParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_symbol_0_0=ruleSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicInterpretationRule());
            					}
            					set(
            						current,
            						"symbol",
            						lv_symbol_0_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Symbol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguage.g:413:3: (otherlv_1= '(' ( ( (lv_objects_2_0= ruleComplexObject ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleComplexObject ) ) )* )? otherlv_5= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSolverLanguage.g:414:4: otherlv_1= '(' ( ( (lv_objects_2_0= ruleComplexObject ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleComplexObject ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getBasicInterpretationAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalSolverLanguage.g:418:4: ( ( (lv_objects_2_0= ruleComplexObject ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleComplexObject ) ) )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_STRING)||LA9_0==11||(LA9_0>=13 && LA9_0<=14)||LA9_0==20||LA9_0==27||LA9_0==31) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSolverLanguage.g:419:5: ( (lv_objects_2_0= ruleComplexObject ) ) (otherlv_3= ',' ( (lv_objects_4_0= ruleComplexObject ) ) )*
                            {
                            // InternalSolverLanguage.g:419:5: ( (lv_objects_2_0= ruleComplexObject ) )
                            // InternalSolverLanguage.g:420:6: (lv_objects_2_0= ruleComplexObject )
                            {
                            // InternalSolverLanguage.g:420:6: (lv_objects_2_0= ruleComplexObject )
                            // InternalSolverLanguage.g:421:7: lv_objects_2_0= ruleComplexObject
                            {

                            							newCompositeNode(grammarAccess.getBasicInterpretationAccess().getObjectsComplexObjectParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_objects_2_0=ruleComplexObject();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBasicInterpretationRule());
                            							}
                            							add(
                            								current,
                            								"objects",
                            								lv_objects_2_0,
                            								"org.eclipse.viatra.solver.language.SolverLanguage.ComplexObject");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalSolverLanguage.g:438:5: (otherlv_3= ',' ( (lv_objects_4_0= ruleComplexObject ) ) )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==18) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalSolverLanguage.g:439:6: otherlv_3= ',' ( (lv_objects_4_0= ruleComplexObject ) )
                            	    {
                            	    otherlv_3=(Token)match(input,18,FOLLOW_9); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getBasicInterpretationAccess().getCommaKeyword_1_1_1_0());
                            	    					
                            	    // InternalSolverLanguage.g:443:6: ( (lv_objects_4_0= ruleComplexObject ) )
                            	    // InternalSolverLanguage.g:444:7: (lv_objects_4_0= ruleComplexObject )
                            	    {
                            	    // InternalSolverLanguage.g:444:7: (lv_objects_4_0= ruleComplexObject )
                            	    // InternalSolverLanguage.g:445:8: lv_objects_4_0= ruleComplexObject
                            	    {

                            	    								newCompositeNode(grammarAccess.getBasicInterpretationAccess().getObjectsComplexObjectParserRuleCall_1_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_objects_4_0=ruleComplexObject();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getBasicInterpretationRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"objects",
                            	    									lv_objects_4_0,
                            	    									"org.eclipse.viatra.solver.language.SolverLanguage.ComplexObject");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getBasicInterpretationAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getBasicInterpretationAccess().getColonKeyword_2());
            		
            // InternalSolverLanguage.g:473:3: ( (lv_value_7_0= ruleTruthValue ) )
            // InternalSolverLanguage.g:474:4: (lv_value_7_0= ruleTruthValue )
            {
            // InternalSolverLanguage.g:474:4: (lv_value_7_0= ruleTruthValue )
            // InternalSolverLanguage.g:475:5: lv_value_7_0= ruleTruthValue
            {

            					newCompositeNode(grammarAccess.getBasicInterpretationAccess().getValueTruthValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_7_0=ruleTruthValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicInterpretationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.TruthValue");
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
    // $ANTLR end "ruleBasicInterpretation"


    // $ANTLR start "entryRuleSymbol"
    // InternalSolverLanguage.g:496:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalSolverLanguage.g:496:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalSolverLanguage.g:497:2: iv_ruleSymbol= ruleSymbol EOF
            {
             newCompositeNode(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSymbol=ruleSymbol();

            state._fsp--;

             current =iv_ruleSymbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalSolverLanguage.g:503:1: ruleSymbol returns [EObject current=null] : (this_ModelSymbol_0= ruleModelSymbol | this_PartialitySymbol_1= rulePartialitySymbol | this_DataSymbol_2= ruleDataSymbol ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        EObject this_ModelSymbol_0 = null;

        EObject this_PartialitySymbol_1 = null;

        EObject this_DataSymbol_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:509:2: ( (this_ModelSymbol_0= ruleModelSymbol | this_PartialitySymbol_1= rulePartialitySymbol | this_DataSymbol_2= ruleDataSymbol ) )
            // InternalSolverLanguage.g:510:2: (this_ModelSymbol_0= ruleModelSymbol | this_PartialitySymbol_1= rulePartialitySymbol | this_DataSymbol_2= ruleDataSymbol )
            {
            // InternalSolverLanguage.g:510:2: (this_ModelSymbol_0= ruleModelSymbol | this_PartialitySymbol_1= rulePartialitySymbol | this_DataSymbol_2= ruleDataSymbol )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case 21:
            case 22:
                {
                alt11=2;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
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
                    // InternalSolverLanguage.g:511:3: this_ModelSymbol_0= ruleModelSymbol
                    {

                    			newCompositeNode(grammarAccess.getSymbolAccess().getModelSymbolParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelSymbol_0=ruleModelSymbol();

                    state._fsp--;


                    			current = this_ModelSymbol_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:520:3: this_PartialitySymbol_1= rulePartialitySymbol
                    {

                    			newCompositeNode(grammarAccess.getSymbolAccess().getPartialitySymbolParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PartialitySymbol_1=rulePartialitySymbol();

                    state._fsp--;


                    			current = this_PartialitySymbol_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:529:3: this_DataSymbol_2= ruleDataSymbol
                    {

                    			newCompositeNode(grammarAccess.getSymbolAccess().getDataSymbolParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataSymbol_2=ruleDataSymbol();

                    state._fsp--;


                    			current = this_DataSymbol_2;
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
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleModelSymbol"
    // InternalSolverLanguage.g:541:1: entryRuleModelSymbol returns [EObject current=null] : iv_ruleModelSymbol= ruleModelSymbol EOF ;
    public final EObject entryRuleModelSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelSymbol = null;


        try {
            // InternalSolverLanguage.g:541:52: (iv_ruleModelSymbol= ruleModelSymbol EOF )
            // InternalSolverLanguage.g:542:2: iv_ruleModelSymbol= ruleModelSymbol EOF
            {
             newCompositeNode(grammarAccess.getModelSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelSymbol=ruleModelSymbol();

            state._fsp--;

             current =iv_ruleModelSymbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelSymbol"


    // $ANTLR start "ruleModelSymbol"
    // InternalSolverLanguage.g:548:1: ruleModelSymbol returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleModelSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:554:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSolverLanguage.g:555:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSolverLanguage.g:555:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSolverLanguage.g:556:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSolverLanguage.g:556:3: (lv_name_0_0= RULE_ID )
            // InternalSolverLanguage.g:557:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getModelSymbolAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getModelSymbolRule());
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
    // $ANTLR end "ruleModelSymbol"


    // $ANTLR start "entryRulePartialitySymbol"
    // InternalSolverLanguage.g:576:1: entryRulePartialitySymbol returns [EObject current=null] : iv_rulePartialitySymbol= rulePartialitySymbol EOF ;
    public final EObject entryRulePartialitySymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialitySymbol = null;


        try {
            // InternalSolverLanguage.g:576:57: (iv_rulePartialitySymbol= rulePartialitySymbol EOF )
            // InternalSolverLanguage.g:577:2: iv_rulePartialitySymbol= rulePartialitySymbol EOF
            {
             newCompositeNode(grammarAccess.getPartialitySymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartialitySymbol=rulePartialitySymbol();

            state._fsp--;

             current =iv_rulePartialitySymbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartialitySymbol"


    // $ANTLR start "rulePartialitySymbol"
    // InternalSolverLanguage.g:583:1: rulePartialitySymbol returns [EObject current=null] : (this_ExistSymbol_0= ruleExistSymbol | this_EqualsSymbol_1= ruleEqualsSymbol ) ;
    public final EObject rulePartialitySymbol() throws RecognitionException {
        EObject current = null;

        EObject this_ExistSymbol_0 = null;

        EObject this_EqualsSymbol_1 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:589:2: ( (this_ExistSymbol_0= ruleExistSymbol | this_EqualsSymbol_1= ruleEqualsSymbol ) )
            // InternalSolverLanguage.g:590:2: (this_ExistSymbol_0= ruleExistSymbol | this_EqualsSymbol_1= ruleEqualsSymbol )
            {
            // InternalSolverLanguage.g:590:2: (this_ExistSymbol_0= ruleExistSymbol | this_EqualsSymbol_1= ruleEqualsSymbol )
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
                    // InternalSolverLanguage.g:591:3: this_ExistSymbol_0= ruleExistSymbol
                    {

                    			newCompositeNode(grammarAccess.getPartialitySymbolAccess().getExistSymbolParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExistSymbol_0=ruleExistSymbol();

                    state._fsp--;


                    			current = this_ExistSymbol_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:600:3: this_EqualsSymbol_1= ruleEqualsSymbol
                    {

                    			newCompositeNode(grammarAccess.getPartialitySymbolAccess().getEqualsSymbolParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EqualsSymbol_1=ruleEqualsSymbol();

                    state._fsp--;


                    			current = this_EqualsSymbol_1;
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
    // $ANTLR end "rulePartialitySymbol"


    // $ANTLR start "entryRuleExistSymbol"
    // InternalSolverLanguage.g:612:1: entryRuleExistSymbol returns [EObject current=null] : iv_ruleExistSymbol= ruleExistSymbol EOF ;
    public final EObject entryRuleExistSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistSymbol = null;


        try {
            // InternalSolverLanguage.g:612:52: (iv_ruleExistSymbol= ruleExistSymbol EOF )
            // InternalSolverLanguage.g:613:2: iv_ruleExistSymbol= ruleExistSymbol EOF
            {
             newCompositeNode(grammarAccess.getExistSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistSymbol=ruleExistSymbol();

            state._fsp--;

             current =iv_ruleExistSymbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistSymbol"


    // $ANTLR start "ruleExistSymbol"
    // InternalSolverLanguage.g:619:1: ruleExistSymbol returns [EObject current=null] : (otherlv_0= 'exists' () ) ;
    public final EObject ruleExistSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:625:2: ( (otherlv_0= 'exists' () ) )
            // InternalSolverLanguage.g:626:2: (otherlv_0= 'exists' () )
            {
            // InternalSolverLanguage.g:626:2: (otherlv_0= 'exists' () )
            // InternalSolverLanguage.g:627:3: otherlv_0= 'exists' ()
            {
            otherlv_0=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getExistSymbolAccess().getExistsKeyword_0());
            		
            // InternalSolverLanguage.g:631:3: ()
            // InternalSolverLanguage.g:632:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExistSymbolAccess().getExistSymbolAction_1(),
            					current);
            			

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
    // $ANTLR end "ruleExistSymbol"


    // $ANTLR start "entryRuleEqualsSymbol"
    // InternalSolverLanguage.g:642:1: entryRuleEqualsSymbol returns [EObject current=null] : iv_ruleEqualsSymbol= ruleEqualsSymbol EOF ;
    public final EObject entryRuleEqualsSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsSymbol = null;


        try {
            // InternalSolverLanguage.g:642:53: (iv_ruleEqualsSymbol= ruleEqualsSymbol EOF )
            // InternalSolverLanguage.g:643:2: iv_ruleEqualsSymbol= ruleEqualsSymbol EOF
            {
             newCompositeNode(grammarAccess.getEqualsSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualsSymbol=ruleEqualsSymbol();

            state._fsp--;

             current =iv_ruleEqualsSymbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualsSymbol"


    // $ANTLR start "ruleEqualsSymbol"
    // InternalSolverLanguage.g:649:1: ruleEqualsSymbol returns [EObject current=null] : (otherlv_0= 'equals' () ) ;
    public final EObject ruleEqualsSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:655:2: ( (otherlv_0= 'equals' () ) )
            // InternalSolverLanguage.g:656:2: (otherlv_0= 'equals' () )
            {
            // InternalSolverLanguage.g:656:2: (otherlv_0= 'equals' () )
            // InternalSolverLanguage.g:657:3: otherlv_0= 'equals' ()
            {
            otherlv_0=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualsSymbolAccess().getEqualsKeyword_0());
            		
            // InternalSolverLanguage.g:661:3: ()
            // InternalSolverLanguage.g:662:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEqualsSymbolAccess().getEqualsSymbolAction_1(),
            					current);
            			

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
    // $ANTLR end "ruleEqualsSymbol"


    // $ANTLR start "entryRuleDataSymbol"
    // InternalSolverLanguage.g:672:1: entryRuleDataSymbol returns [EObject current=null] : iv_ruleDataSymbol= ruleDataSymbol EOF ;
    public final EObject entryRuleDataSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSymbol = null;


        try {
            // InternalSolverLanguage.g:672:51: (iv_ruleDataSymbol= ruleDataSymbol EOF )
            // InternalSolverLanguage.g:673:2: iv_ruleDataSymbol= ruleDataSymbol EOF
            {
             newCompositeNode(grammarAccess.getDataSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataSymbol=ruleDataSymbol();

            state._fsp--;

             current =iv_ruleDataSymbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataSymbol"


    // $ANTLR start "ruleDataSymbol"
    // InternalSolverLanguage.g:679:1: ruleDataSymbol returns [EObject current=null] : (this_BooleanSymbol_0= ruleBooleanSymbol | this_IntegerSymbol_1= ruleIntegerSymbol | this_RealSymbol_2= ruleRealSymbol | this_StringSymbol_3= ruleStringSymbol ) ;
    public final EObject ruleDataSymbol() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanSymbol_0 = null;

        EObject this_IntegerSymbol_1 = null;

        EObject this_RealSymbol_2 = null;

        EObject this_StringSymbol_3 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:685:2: ( (this_BooleanSymbol_0= ruleBooleanSymbol | this_IntegerSymbol_1= ruleIntegerSymbol | this_RealSymbol_2= ruleRealSymbol | this_StringSymbol_3= ruleStringSymbol ) )
            // InternalSolverLanguage.g:686:2: (this_BooleanSymbol_0= ruleBooleanSymbol | this_IntegerSymbol_1= ruleIntegerSymbol | this_RealSymbol_2= ruleRealSymbol | this_StringSymbol_3= ruleStringSymbol )
            {
            // InternalSolverLanguage.g:686:2: (this_BooleanSymbol_0= ruleBooleanSymbol | this_IntegerSymbol_1= ruleIntegerSymbol | this_RealSymbol_2= ruleRealSymbol | this_StringSymbol_3= ruleStringSymbol )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt13=1;
                }
                break;
            case 24:
                {
                alt13=2;
                }
                break;
            case 25:
                {
                alt13=3;
                }
                break;
            case 26:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSolverLanguage.g:687:3: this_BooleanSymbol_0= ruleBooleanSymbol
                    {

                    			newCompositeNode(grammarAccess.getDataSymbolAccess().getBooleanSymbolParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanSymbol_0=ruleBooleanSymbol();

                    state._fsp--;


                    			current = this_BooleanSymbol_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:696:3: this_IntegerSymbol_1= ruleIntegerSymbol
                    {

                    			newCompositeNode(grammarAccess.getDataSymbolAccess().getIntegerSymbolParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerSymbol_1=ruleIntegerSymbol();

                    state._fsp--;


                    			current = this_IntegerSymbol_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:705:3: this_RealSymbol_2= ruleRealSymbol
                    {

                    			newCompositeNode(grammarAccess.getDataSymbolAccess().getRealSymbolParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealSymbol_2=ruleRealSymbol();

                    state._fsp--;


                    			current = this_RealSymbol_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSolverLanguage.g:714:3: this_StringSymbol_3= ruleStringSymbol
                    {

                    			newCompositeNode(grammarAccess.getDataSymbolAccess().getStringSymbolParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringSymbol_3=ruleStringSymbol();

                    state._fsp--;


                    			current = this_StringSymbol_3;
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
    // $ANTLR end "ruleDataSymbol"


    // $ANTLR start "entryRuleBooleanSymbol"
    // InternalSolverLanguage.g:726:1: entryRuleBooleanSymbol returns [EObject current=null] : iv_ruleBooleanSymbol= ruleBooleanSymbol EOF ;
    public final EObject entryRuleBooleanSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanSymbol = null;


        try {
            // InternalSolverLanguage.g:726:54: (iv_ruleBooleanSymbol= ruleBooleanSymbol EOF )
            // InternalSolverLanguage.g:727:2: iv_ruleBooleanSymbol= ruleBooleanSymbol EOF
            {
             newCompositeNode(grammarAccess.getBooleanSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanSymbol=ruleBooleanSymbol();

            state._fsp--;

             current =iv_ruleBooleanSymbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanSymbol"


    // $ANTLR start "ruleBooleanSymbol"
    // InternalSolverLanguage.g:733:1: ruleBooleanSymbol returns [EObject current=null] : (otherlv_0= 'bool' () ) ;
    public final EObject ruleBooleanSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:739:2: ( (otherlv_0= 'bool' () ) )
            // InternalSolverLanguage.g:740:2: (otherlv_0= 'bool' () )
            {
            // InternalSolverLanguage.g:740:2: (otherlv_0= 'bool' () )
            // InternalSolverLanguage.g:741:3: otherlv_0= 'bool' ()
            {
            otherlv_0=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanSymbolAccess().getBoolKeyword_0());
            		
            // InternalSolverLanguage.g:745:3: ()
            // InternalSolverLanguage.g:746:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanSymbolAccess().getBooleanSymbolAction_1(),
            					current);
            			

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
    // $ANTLR end "ruleBooleanSymbol"


    // $ANTLR start "entryRuleIntegerSymbol"
    // InternalSolverLanguage.g:756:1: entryRuleIntegerSymbol returns [EObject current=null] : iv_ruleIntegerSymbol= ruleIntegerSymbol EOF ;
    public final EObject entryRuleIntegerSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerSymbol = null;


        try {
            // InternalSolverLanguage.g:756:54: (iv_ruleIntegerSymbol= ruleIntegerSymbol EOF )
            // InternalSolverLanguage.g:757:2: iv_ruleIntegerSymbol= ruleIntegerSymbol EOF
            {
             newCompositeNode(grammarAccess.getIntegerSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerSymbol=ruleIntegerSymbol();

            state._fsp--;

             current =iv_ruleIntegerSymbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerSymbol"


    // $ANTLR start "ruleIntegerSymbol"
    // InternalSolverLanguage.g:763:1: ruleIntegerSymbol returns [EObject current=null] : (otherlv_0= 'int' () ) ;
    public final EObject ruleIntegerSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:769:2: ( (otherlv_0= 'int' () ) )
            // InternalSolverLanguage.g:770:2: (otherlv_0= 'int' () )
            {
            // InternalSolverLanguage.g:770:2: (otherlv_0= 'int' () )
            // InternalSolverLanguage.g:771:3: otherlv_0= 'int' ()
            {
            otherlv_0=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegerSymbolAccess().getIntKeyword_0());
            		
            // InternalSolverLanguage.g:775:3: ()
            // InternalSolverLanguage.g:776:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerSymbolAccess().getIntegerSymbolAction_1(),
            					current);
            			

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
    // $ANTLR end "ruleIntegerSymbol"


    // $ANTLR start "entryRuleRealSymbol"
    // InternalSolverLanguage.g:786:1: entryRuleRealSymbol returns [EObject current=null] : iv_ruleRealSymbol= ruleRealSymbol EOF ;
    public final EObject entryRuleRealSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealSymbol = null;


        try {
            // InternalSolverLanguage.g:786:51: (iv_ruleRealSymbol= ruleRealSymbol EOF )
            // InternalSolverLanguage.g:787:2: iv_ruleRealSymbol= ruleRealSymbol EOF
            {
             newCompositeNode(grammarAccess.getRealSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealSymbol=ruleRealSymbol();

            state._fsp--;

             current =iv_ruleRealSymbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealSymbol"


    // $ANTLR start "ruleRealSymbol"
    // InternalSolverLanguage.g:793:1: ruleRealSymbol returns [EObject current=null] : (otherlv_0= 'real' () ) ;
    public final EObject ruleRealSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:799:2: ( (otherlv_0= 'real' () ) )
            // InternalSolverLanguage.g:800:2: (otherlv_0= 'real' () )
            {
            // InternalSolverLanguage.g:800:2: (otherlv_0= 'real' () )
            // InternalSolverLanguage.g:801:3: otherlv_0= 'real' ()
            {
            otherlv_0=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getRealSymbolAccess().getRealKeyword_0());
            		
            // InternalSolverLanguage.g:805:3: ()
            // InternalSolverLanguage.g:806:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealSymbolAccess().getRealSymbolAction_1(),
            					current);
            			

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
    // $ANTLR end "ruleRealSymbol"


    // $ANTLR start "entryRuleStringSymbol"
    // InternalSolverLanguage.g:816:1: entryRuleStringSymbol returns [EObject current=null] : iv_ruleStringSymbol= ruleStringSymbol EOF ;
    public final EObject entryRuleStringSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringSymbol = null;


        try {
            // InternalSolverLanguage.g:816:53: (iv_ruleStringSymbol= ruleStringSymbol EOF )
            // InternalSolverLanguage.g:817:2: iv_ruleStringSymbol= ruleStringSymbol EOF
            {
             newCompositeNode(grammarAccess.getStringSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringSymbol=ruleStringSymbol();

            state._fsp--;

             current =iv_ruleStringSymbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringSymbol"


    // $ANTLR start "ruleStringSymbol"
    // InternalSolverLanguage.g:823:1: ruleStringSymbol returns [EObject current=null] : (otherlv_0= 'string' () ) ;
    public final EObject ruleStringSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:829:2: ( (otherlv_0= 'string' () ) )
            // InternalSolverLanguage.g:830:2: (otherlv_0= 'string' () )
            {
            // InternalSolverLanguage.g:830:2: (otherlv_0= 'string' () )
            // InternalSolverLanguage.g:831:3: otherlv_0= 'string' ()
            {
            otherlv_0=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getStringSymbolAccess().getStringKeyword_0());
            		
            // InternalSolverLanguage.g:835:3: ()
            // InternalSolverLanguage.g:836:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringSymbolAccess().getStringSymbolAction_1(),
            					current);
            			

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
    // $ANTLR end "ruleStringSymbol"


    // $ANTLR start "entryRuleComplexObject"
    // InternalSolverLanguage.g:846:1: entryRuleComplexObject returns [EObject current=null] : iv_ruleComplexObject= ruleComplexObject EOF ;
    public final EObject entryRuleComplexObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexObject = null;


        try {
            // InternalSolverLanguage.g:846:54: (iv_ruleComplexObject= ruleComplexObject EOF )
            // InternalSolverLanguage.g:847:2: iv_ruleComplexObject= ruleComplexObject EOF
            {
             newCompositeNode(grammarAccess.getComplexObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexObject=ruleComplexObject();

            state._fsp--;

             current =iv_ruleComplexObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexObject"


    // $ANTLR start "ruleComplexObject"
    // InternalSolverLanguage.g:853:1: ruleComplexObject returns [EObject current=null] : (this_Object_0= ruleObject | this_AllInstances_1= ruleAllInstances | this_AllObjects_2= ruleAllObjects ) ;
    public final EObject ruleComplexObject() throws RecognitionException {
        EObject current = null;

        EObject this_Object_0 = null;

        EObject this_AllInstances_1 = null;

        EObject this_AllObjects_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:859:2: ( (this_Object_0= ruleObject | this_AllInstances_1= ruleAllInstances | this_AllObjects_2= ruleAllObjects ) )
            // InternalSolverLanguage.g:860:2: (this_Object_0= ruleObject | this_AllInstances_1= ruleAllInstances | this_AllObjects_2= ruleAllObjects )
            {
            // InternalSolverLanguage.g:860:2: (this_Object_0= ruleObject | this_AllInstances_1= ruleAllInstances | this_AllObjects_2= ruleAllObjects )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_ID:
            case RULE_STRING:
            case 11:
            case 13:
            case 14:
            case 27:
                {
                alt14=1;
                }
                break;
            case 20:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSolverLanguage.g:861:3: this_Object_0= ruleObject
                    {

                    			newCompositeNode(grammarAccess.getComplexObjectAccess().getObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Object_0=ruleObject();

                    state._fsp--;


                    			current = this_Object_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:870:3: this_AllInstances_1= ruleAllInstances
                    {

                    			newCompositeNode(grammarAccess.getComplexObjectAccess().getAllInstancesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllInstances_1=ruleAllInstances();

                    state._fsp--;


                    			current = this_AllInstances_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:879:3: this_AllObjects_2= ruleAllObjects
                    {

                    			newCompositeNode(grammarAccess.getComplexObjectAccess().getAllObjectsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllObjects_2=ruleAllObjects();

                    state._fsp--;


                    			current = this_AllObjects_2;
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
    // $ANTLR end "ruleComplexObject"


    // $ANTLR start "entryRuleObject"
    // InternalSolverLanguage.g:891:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalSolverLanguage.g:891:47: (iv_ruleObject= ruleObject EOF )
            // InternalSolverLanguage.g:892:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalSolverLanguage.g:898:1: ruleObject returns [EObject current=null] : (this_NamedObject_0= ruleNamedObject | this_UnnamedObject_1= ruleUnnamedObject | this_DataObject_2= ruleDataObject ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        EObject this_NamedObject_0 = null;

        EObject this_UnnamedObject_1 = null;

        EObject this_DataObject_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:904:2: ( (this_NamedObject_0= ruleNamedObject | this_UnnamedObject_1= ruleUnnamedObject | this_DataObject_2= ruleDataObject ) )
            // InternalSolverLanguage.g:905:2: (this_NamedObject_0= ruleNamedObject | this_UnnamedObject_1= ruleUnnamedObject | this_DataObject_2= ruleDataObject )
            {
            // InternalSolverLanguage.g:905:2: (this_NamedObject_0= ruleNamedObject | this_UnnamedObject_1= ruleUnnamedObject | this_DataObject_2= ruleDataObject )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
                {
                alt15=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 11:
            case 13:
            case 14:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSolverLanguage.g:906:3: this_NamedObject_0= ruleNamedObject
                    {

                    			newCompositeNode(grammarAccess.getObjectAccess().getNamedObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedObject_0=ruleNamedObject();

                    state._fsp--;


                    			current = this_NamedObject_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:915:3: this_UnnamedObject_1= ruleUnnamedObject
                    {

                    			newCompositeNode(grammarAccess.getObjectAccess().getUnnamedObjectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnnamedObject_1=ruleUnnamedObject();

                    state._fsp--;


                    			current = this_UnnamedObject_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:924:3: this_DataObject_2= ruleDataObject
                    {

                    			newCompositeNode(grammarAccess.getObjectAccess().getDataObjectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataObject_2=ruleDataObject();

                    state._fsp--;


                    			current = this_DataObject_2;
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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleNamedObject"
    // InternalSolverLanguage.g:936:1: entryRuleNamedObject returns [EObject current=null] : iv_ruleNamedObject= ruleNamedObject EOF ;
    public final EObject entryRuleNamedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedObject = null;


        try {
            // InternalSolverLanguage.g:936:52: (iv_ruleNamedObject= ruleNamedObject EOF )
            // InternalSolverLanguage.g:937:2: iv_ruleNamedObject= ruleNamedObject EOF
            {
             newCompositeNode(grammarAccess.getNamedObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedObject=ruleNamedObject();

            state._fsp--;

             current =iv_ruleNamedObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedObject"


    // $ANTLR start "ruleNamedObject"
    // InternalSolverLanguage.g:943:1: ruleNamedObject returns [EObject current=null] : (otherlv_0= '\\'' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\'' ) ;
    public final EObject ruleNamedObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:949:2: ( (otherlv_0= '\\'' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\'' ) )
            // InternalSolverLanguage.g:950:2: (otherlv_0= '\\'' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\'' )
            {
            // InternalSolverLanguage.g:950:2: (otherlv_0= '\\'' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\'' )
            // InternalSolverLanguage.g:951:3: otherlv_0= '\\'' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\''
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getNamedObjectAccess().getApostropheKeyword_0());
            		
            // InternalSolverLanguage.g:955:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolverLanguage.g:956:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolverLanguage.g:956:4: (lv_name_1_0= RULE_ID )
            // InternalSolverLanguage.g:957:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNamedObjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamedObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedObjectAccess().getApostropheKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedObject"


    // $ANTLR start "entryRuleUnnamedObject"
    // InternalSolverLanguage.g:981:1: entryRuleUnnamedObject returns [EObject current=null] : iv_ruleUnnamedObject= ruleUnnamedObject EOF ;
    public final EObject entryRuleUnnamedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedObject = null;


        try {
            // InternalSolverLanguage.g:981:54: (iv_ruleUnnamedObject= ruleUnnamedObject EOF )
            // InternalSolverLanguage.g:982:2: iv_ruleUnnamedObject= ruleUnnamedObject EOF
            {
             newCompositeNode(grammarAccess.getUnnamedObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnnamedObject=ruleUnnamedObject();

            state._fsp--;

             current =iv_ruleUnnamedObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnnamedObject"


    // $ANTLR start "ruleUnnamedObject"
    // InternalSolverLanguage.g:988:1: ruleUnnamedObject returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUnnamedObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:994:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSolverLanguage.g:995:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSolverLanguage.g:995:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSolverLanguage.g:996:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSolverLanguage.g:996:3: (lv_name_0_0= RULE_ID )
            // InternalSolverLanguage.g:997:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getUnnamedObjectAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUnnamedObjectRule());
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
    // $ANTLR end "ruleUnnamedObject"


    // $ANTLR start "entryRuleDataObject"
    // InternalSolverLanguage.g:1016:1: entryRuleDataObject returns [EObject current=null] : iv_ruleDataObject= ruleDataObject EOF ;
    public final EObject entryRuleDataObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataObject = null;


        try {
            // InternalSolverLanguage.g:1016:51: (iv_ruleDataObject= ruleDataObject EOF )
            // InternalSolverLanguage.g:1017:2: iv_ruleDataObject= ruleDataObject EOF
            {
             newCompositeNode(grammarAccess.getDataObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataObject=ruleDataObject();

            state._fsp--;

             current =iv_ruleDataObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataObject"


    // $ANTLR start "ruleDataObject"
    // InternalSolverLanguage.g:1023:1: ruleDataObject returns [EObject current=null] : (this_BooleanObject_0= ruleBooleanObject | this_IntObject_1= ruleIntObject | this_RealObject_2= ruleRealObject | this_StringObject_3= ruleStringObject ) ;
    public final EObject ruleDataObject() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanObject_0 = null;

        EObject this_IntObject_1 = null;

        EObject this_RealObject_2 = null;

        EObject this_StringObject_3 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1029:2: ( (this_BooleanObject_0= ruleBooleanObject | this_IntObject_1= ruleIntObject | this_RealObject_2= ruleRealObject | this_StringObject_3= ruleStringObject ) )
            // InternalSolverLanguage.g:1030:2: (this_BooleanObject_0= ruleBooleanObject | this_IntObject_1= ruleIntObject | this_RealObject_2= ruleRealObject | this_StringObject_3= ruleStringObject )
            {
            // InternalSolverLanguage.g:1030:2: (this_BooleanObject_0= ruleBooleanObject | this_IntObject_1= ruleIntObject | this_RealObject_2= ruleRealObject | this_StringObject_3= ruleStringObject )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
                {
                alt16=1;
                }
                break;
            case 11:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==RULE_INT) ) {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3==12) ) {
                        alt16=3;
                    }
                    else if ( (LA16_3==EOF||(LA16_3>=18 && LA16_3<=19)) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA16_3 = input.LA(2);

                if ( (LA16_3==12) ) {
                    alt16=3;
                }
                else if ( (LA16_3==EOF||(LA16_3>=18 && LA16_3<=19)) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalSolverLanguage.g:1031:3: this_BooleanObject_0= ruleBooleanObject
                    {

                    			newCompositeNode(grammarAccess.getDataObjectAccess().getBooleanObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanObject_0=ruleBooleanObject();

                    state._fsp--;


                    			current = this_BooleanObject_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1040:3: this_IntObject_1= ruleIntObject
                    {

                    			newCompositeNode(grammarAccess.getDataObjectAccess().getIntObjectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntObject_1=ruleIntObject();

                    state._fsp--;


                    			current = this_IntObject_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:1049:3: this_RealObject_2= ruleRealObject
                    {

                    			newCompositeNode(grammarAccess.getDataObjectAccess().getRealObjectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealObject_2=ruleRealObject();

                    state._fsp--;


                    			current = this_RealObject_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSolverLanguage.g:1058:3: this_StringObject_3= ruleStringObject
                    {

                    			newCompositeNode(grammarAccess.getDataObjectAccess().getStringObjectParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringObject_3=ruleStringObject();

                    state._fsp--;


                    			current = this_StringObject_3;
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
    // $ANTLR end "ruleDataObject"


    // $ANTLR start "entryRuleBooleanObject"
    // InternalSolverLanguage.g:1070:1: entryRuleBooleanObject returns [EObject current=null] : iv_ruleBooleanObject= ruleBooleanObject EOF ;
    public final EObject entryRuleBooleanObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanObject = null;


        try {
            // InternalSolverLanguage.g:1070:54: (iv_ruleBooleanObject= ruleBooleanObject EOF )
            // InternalSolverLanguage.g:1071:2: iv_ruleBooleanObject= ruleBooleanObject EOF
            {
             newCompositeNode(grammarAccess.getBooleanObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanObject=ruleBooleanObject();

            state._fsp--;

             current =iv_ruleBooleanObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanObject"


    // $ANTLR start "ruleBooleanObject"
    // InternalSolverLanguage.g:1077:1: ruleBooleanObject returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleBooleanObject() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1083:2: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // InternalSolverLanguage.g:1084:2: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // InternalSolverLanguage.g:1084:2: ( (lv_value_0_0= ruleBooleanValue ) )
            // InternalSolverLanguage.g:1085:3: (lv_value_0_0= ruleBooleanValue )
            {
            // InternalSolverLanguage.g:1085:3: (lv_value_0_0= ruleBooleanValue )
            // InternalSolverLanguage.g:1086:4: lv_value_0_0= ruleBooleanValue
            {

            				newCompositeNode(grammarAccess.getBooleanObjectAccess().getValueBooleanValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBooleanValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBooleanObjectRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.viatra.solver.language.SolverLanguage.BooleanValue");
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
    // $ANTLR end "ruleBooleanObject"


    // $ANTLR start "entryRuleIntObject"
    // InternalSolverLanguage.g:1106:1: entryRuleIntObject returns [EObject current=null] : iv_ruleIntObject= ruleIntObject EOF ;
    public final EObject entryRuleIntObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntObject = null;


        try {
            // InternalSolverLanguage.g:1106:50: (iv_ruleIntObject= ruleIntObject EOF )
            // InternalSolverLanguage.g:1107:2: iv_ruleIntObject= ruleIntObject EOF
            {
             newCompositeNode(grammarAccess.getIntObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntObject=ruleIntObject();

            state._fsp--;

             current =iv_ruleIntObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntObject"


    // $ANTLR start "ruleIntObject"
    // InternalSolverLanguage.g:1113:1: ruleIntObject returns [EObject current=null] : ( (lv_value_0_0= ruleINTLiteral ) ) ;
    public final EObject ruleIntObject() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1119:2: ( ( (lv_value_0_0= ruleINTLiteral ) ) )
            // InternalSolverLanguage.g:1120:2: ( (lv_value_0_0= ruleINTLiteral ) )
            {
            // InternalSolverLanguage.g:1120:2: ( (lv_value_0_0= ruleINTLiteral ) )
            // InternalSolverLanguage.g:1121:3: (lv_value_0_0= ruleINTLiteral )
            {
            // InternalSolverLanguage.g:1121:3: (lv_value_0_0= ruleINTLiteral )
            // InternalSolverLanguage.g:1122:4: lv_value_0_0= ruleINTLiteral
            {

            				newCompositeNode(grammarAccess.getIntObjectAccess().getValueINTLiteralParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleINTLiteral();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIntObjectRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.viatra.solver.language.SolverLanguage.INTLiteral");
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
    // $ANTLR end "ruleIntObject"


    // $ANTLR start "entryRuleRealObject"
    // InternalSolverLanguage.g:1142:1: entryRuleRealObject returns [EObject current=null] : iv_ruleRealObject= ruleRealObject EOF ;
    public final EObject entryRuleRealObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealObject = null;


        try {
            // InternalSolverLanguage.g:1142:51: (iv_ruleRealObject= ruleRealObject EOF )
            // InternalSolverLanguage.g:1143:2: iv_ruleRealObject= ruleRealObject EOF
            {
             newCompositeNode(grammarAccess.getRealObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealObject=ruleRealObject();

            state._fsp--;

             current =iv_ruleRealObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealObject"


    // $ANTLR start "ruleRealObject"
    // InternalSolverLanguage.g:1149:1: ruleRealObject returns [EObject current=null] : ( (lv_value_0_0= ruleREALLiteral ) ) ;
    public final EObject ruleRealObject() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1155:2: ( ( (lv_value_0_0= ruleREALLiteral ) ) )
            // InternalSolverLanguage.g:1156:2: ( (lv_value_0_0= ruleREALLiteral ) )
            {
            // InternalSolverLanguage.g:1156:2: ( (lv_value_0_0= ruleREALLiteral ) )
            // InternalSolverLanguage.g:1157:3: (lv_value_0_0= ruleREALLiteral )
            {
            // InternalSolverLanguage.g:1157:3: (lv_value_0_0= ruleREALLiteral )
            // InternalSolverLanguage.g:1158:4: lv_value_0_0= ruleREALLiteral
            {

            				newCompositeNode(grammarAccess.getRealObjectAccess().getValueREALLiteralParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleREALLiteral();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealObjectRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.viatra.solver.language.SolverLanguage.REALLiteral");
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
    // $ANTLR end "ruleRealObject"


    // $ANTLR start "entryRuleStringObject"
    // InternalSolverLanguage.g:1178:1: entryRuleStringObject returns [EObject current=null] : iv_ruleStringObject= ruleStringObject EOF ;
    public final EObject entryRuleStringObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringObject = null;


        try {
            // InternalSolverLanguage.g:1178:53: (iv_ruleStringObject= ruleStringObject EOF )
            // InternalSolverLanguage.g:1179:2: iv_ruleStringObject= ruleStringObject EOF
            {
             newCompositeNode(grammarAccess.getStringObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringObject=ruleStringObject();

            state._fsp--;

             current =iv_ruleStringObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringObject"


    // $ANTLR start "ruleStringObject"
    // InternalSolverLanguage.g:1185:1: ruleStringObject returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:1191:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSolverLanguage.g:1192:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSolverLanguage.g:1192:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSolverLanguage.g:1193:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSolverLanguage.g:1193:3: (lv_value_0_0= RULE_STRING )
            // InternalSolverLanguage.g:1194:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringObjectAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringObjectRule());
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
    // $ANTLR end "ruleStringObject"


    // $ANTLR start "entryRulePredicate"
    // InternalSolverLanguage.g:1213:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalSolverLanguage.g:1213:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalSolverLanguage.g:1214:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalSolverLanguage.g:1220:1: rulePredicate returns [EObject current=null] : ( ( (lv_isError_0_0= 'error' ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= ':-' (otherlv_8= 'false' | ( ( (lv_bodies_9_0= rulePatternBody ) ) (otherlv_10= '|' ( (lv_bodies_11_0= rulePatternBody ) ) )* ) ) otherlv_12= '.' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token lv_isError_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_symbol_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_bodies_9_0 = null;

        EObject lv_bodies_11_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1226:2: ( ( ( (lv_isError_0_0= 'error' ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= ':-' (otherlv_8= 'false' | ( ( (lv_bodies_9_0= rulePatternBody ) ) (otherlv_10= '|' ( (lv_bodies_11_0= rulePatternBody ) ) )* ) ) otherlv_12= '.' ) )
            // InternalSolverLanguage.g:1227:2: ( ( (lv_isError_0_0= 'error' ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= ':-' (otherlv_8= 'false' | ( ( (lv_bodies_9_0= rulePatternBody ) ) (otherlv_10= '|' ( (lv_bodies_11_0= rulePatternBody ) ) )* ) ) otherlv_12= '.' )
            {
            // InternalSolverLanguage.g:1227:2: ( ( (lv_isError_0_0= 'error' ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= ':-' (otherlv_8= 'false' | ( ( (lv_bodies_9_0= rulePatternBody ) ) (otherlv_10= '|' ( (lv_bodies_11_0= rulePatternBody ) ) )* ) ) otherlv_12= '.' )
            // InternalSolverLanguage.g:1228:3: ( (lv_isError_0_0= 'error' ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= ':-' (otherlv_8= 'false' | ( ( (lv_bodies_9_0= rulePatternBody ) ) (otherlv_10= '|' ( (lv_bodies_11_0= rulePatternBody ) ) )* ) ) otherlv_12= '.'
            {
            // InternalSolverLanguage.g:1228:3: ( (lv_isError_0_0= 'error' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSolverLanguage.g:1229:4: (lv_isError_0_0= 'error' )
                    {
                    // InternalSolverLanguage.g:1229:4: (lv_isError_0_0= 'error' )
                    // InternalSolverLanguage.g:1230:5: lv_isError_0_0= 'error'
                    {
                    lv_isError_0_0=(Token)match(input,16,FOLLOW_12); 

                    					newLeafNode(lv_isError_0_0, grammarAccess.getPredicateAccess().getIsErrorErrorKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPredicateRule());
                    					}
                    					setWithLastConsumed(current, "isError", true, "error");
                    				

                    }


                    }
                    break;

            }

            // InternalSolverLanguage.g:1242:3: ( (lv_symbol_1_0= ruleModelSymbol ) )
            // InternalSolverLanguage.g:1243:4: (lv_symbol_1_0= ruleModelSymbol )
            {
            // InternalSolverLanguage.g:1243:4: (lv_symbol_1_0= ruleModelSymbol )
            // InternalSolverLanguage.g:1244:5: lv_symbol_1_0= ruleModelSymbol
            {

            					newCompositeNode(grammarAccess.getPredicateAccess().getSymbolModelSymbolParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_symbol_1_0=ruleModelSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateRule());
            					}
            					set(
            						current,
            						"symbol",
            						lv_symbol_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ModelSymbol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguage.g:1261:3: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSolverLanguage.g:1262:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalSolverLanguage.g:1266:4: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalSolverLanguage.g:1267:5: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                            {
                            // InternalSolverLanguage.g:1267:5: ( (lv_parameters_3_0= ruleParameter ) )
                            // InternalSolverLanguage.g:1268:6: (lv_parameters_3_0= ruleParameter )
                            {
                            // InternalSolverLanguage.g:1268:6: (lv_parameters_3_0= ruleParameter )
                            // InternalSolverLanguage.g:1269:7: lv_parameters_3_0= ruleParameter
                            {

                            							newCompositeNode(grammarAccess.getPredicateAccess().getParametersParameterParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_parameters_3_0=ruleParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPredicateRule());
                            							}
                            							add(
                            								current,
                            								"parameters",
                            								lv_parameters_3_0,
                            								"org.eclipse.viatra.solver.language.SolverLanguage.Parameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalSolverLanguage.g:1286:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==18) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // InternalSolverLanguage.g:1287:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getPredicateAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    // InternalSolverLanguage.g:1291:6: ( (lv_parameters_5_0= ruleParameter ) )
                            	    // InternalSolverLanguage.g:1292:7: (lv_parameters_5_0= ruleParameter )
                            	    {
                            	    // InternalSolverLanguage.g:1292:7: (lv_parameters_5_0= ruleParameter )
                            	    // InternalSolverLanguage.g:1293:8: lv_parameters_5_0= ruleParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getPredicateAccess().getParametersParameterParserRuleCall_2_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_parameters_5_0=ruleParameter();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getPredicateRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameters",
                            	    									lv_parameters_5_0,
                            	    									"org.eclipse.viatra.solver.language.SolverLanguage.Parameter");
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
                            break;

                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getPredicateAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getPredicateAccess().getColonHyphenMinusKeyword_3());
            		
            // InternalSolverLanguage.g:1321:3: (otherlv_8= 'false' | ( ( (lv_bodies_9_0= rulePatternBody ) ) (otherlv_10= '|' ( (lv_bodies_11_0= rulePatternBody ) ) )* ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            else if ( (LA22_0==EOF||LA22_0==RULE_ID||(LA22_0>=11 && LA22_0<=13)||(LA22_0>=29 && LA22_0<=31)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSolverLanguage.g:1322:4: otherlv_8= 'false'
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getPredicateAccess().getFalseKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1327:4: ( ( (lv_bodies_9_0= rulePatternBody ) ) (otherlv_10= '|' ( (lv_bodies_11_0= rulePatternBody ) ) )* )
                    {
                    // InternalSolverLanguage.g:1327:4: ( ( (lv_bodies_9_0= rulePatternBody ) ) (otherlv_10= '|' ( (lv_bodies_11_0= rulePatternBody ) ) )* )
                    // InternalSolverLanguage.g:1328:5: ( (lv_bodies_9_0= rulePatternBody ) ) (otherlv_10= '|' ( (lv_bodies_11_0= rulePatternBody ) ) )*
                    {
                    // InternalSolverLanguage.g:1328:5: ( (lv_bodies_9_0= rulePatternBody ) )
                    // InternalSolverLanguage.g:1329:6: (lv_bodies_9_0= rulePatternBody )
                    {
                    // InternalSolverLanguage.g:1329:6: (lv_bodies_9_0= rulePatternBody )
                    // InternalSolverLanguage.g:1330:7: lv_bodies_9_0= rulePatternBody
                    {

                    							newCompositeNode(grammarAccess.getPredicateAccess().getBodiesPatternBodyParserRuleCall_4_1_0_0());
                    						
                    pushFollow(FOLLOW_18);
                    lv_bodies_9_0=rulePatternBody();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPredicateRule());
                    							}
                    							add(
                    								current,
                    								"bodies",
                    								lv_bodies_9_0,
                    								"org.eclipse.viatra.solver.language.SolverLanguage.PatternBody");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSolverLanguage.g:1347:5: (otherlv_10= '|' ( (lv_bodies_11_0= rulePatternBody ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==29) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:1348:6: otherlv_10= '|' ( (lv_bodies_11_0= rulePatternBody ) )
                    	    {
                    	    otherlv_10=(Token)match(input,29,FOLLOW_19); 

                    	    						newLeafNode(otherlv_10, grammarAccess.getPredicateAccess().getVerticalLineKeyword_4_1_1_0());
                    	    					
                    	    // InternalSolverLanguage.g:1352:6: ( (lv_bodies_11_0= rulePatternBody ) )
                    	    // InternalSolverLanguage.g:1353:7: (lv_bodies_11_0= rulePatternBody )
                    	    {
                    	    // InternalSolverLanguage.g:1353:7: (lv_bodies_11_0= rulePatternBody )
                    	    // InternalSolverLanguage.g:1354:8: lv_bodies_11_0= rulePatternBody
                    	    {

                    	    								newCompositeNode(grammarAccess.getPredicateAccess().getBodiesPatternBodyParserRuleCall_4_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_18);
                    	    lv_bodies_11_0=rulePatternBody();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getPredicateRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"bodies",
                    	    									lv_bodies_11_0,
                    	    									"org.eclipse.viatra.solver.language.SolverLanguage.PatternBody");
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


                    }
                    break;

            }

            otherlv_12=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPredicateAccess().getFullStopKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleParameter"
    // InternalSolverLanguage.g:1382:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSolverLanguage.g:1382:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSolverLanguage.g:1383:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalSolverLanguage.g:1389:1: ruleParameter returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleSymbol ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1395:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleSymbol ) ) )? ) )
            // InternalSolverLanguage.g:1396:2: ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleSymbol ) ) )? )
            {
            // InternalSolverLanguage.g:1396:2: ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleSymbol ) ) )? )
            // InternalSolverLanguage.g:1397:3: ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleSymbol ) ) )?
            {
            // InternalSolverLanguage.g:1397:3: ( (lv_variable_0_0= ruleVariable ) )
            // InternalSolverLanguage.g:1398:4: (lv_variable_0_0= ruleVariable )
            {
            // InternalSolverLanguage.g:1398:4: (lv_variable_0_0= ruleVariable )
            // InternalSolverLanguage.g:1399:5: lv_variable_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_variable_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguage.g:1416:3: (otherlv_1= ':' ( (lv_type_2_0= ruleSymbol ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSolverLanguage.g:1417:4: otherlv_1= ':' ( (lv_type_2_0= ruleSymbol ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1_0());
                    			
                    // InternalSolverLanguage.g:1421:4: ( (lv_type_2_0= ruleSymbol ) )
                    // InternalSolverLanguage.g:1422:5: (lv_type_2_0= ruleSymbol )
                    {
                    // InternalSolverLanguage.g:1422:5: (lv_type_2_0= ruleSymbol )
                    // InternalSolverLanguage.g:1423:6: lv_type_2_0= ruleSymbol
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypeSymbolParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleSymbol();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.Symbol");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRulePatternBody"
    // InternalSolverLanguage.g:1445:1: entryRulePatternBody returns [EObject current=null] : iv_rulePatternBody= rulePatternBody EOF ;
    public final EObject entryRulePatternBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternBody = null;


        try {
            // InternalSolverLanguage.g:1445:52: (iv_rulePatternBody= rulePatternBody EOF )
            // InternalSolverLanguage.g:1446:2: iv_rulePatternBody= rulePatternBody EOF
            {
             newCompositeNode(grammarAccess.getPatternBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternBody=rulePatternBody();

            state._fsp--;

             current =iv_rulePatternBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternBody"


    // $ANTLR start "rulePatternBody"
    // InternalSolverLanguage.g:1452:1: rulePatternBody returns [EObject current=null] : ( () (otherlv_1= 'true' | ( (lv_constraints_2_0= ruleConstraint ) )* ) ) ;
    public final EObject rulePatternBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1458:2: ( ( () (otherlv_1= 'true' | ( (lv_constraints_2_0= ruleConstraint ) )* ) ) )
            // InternalSolverLanguage.g:1459:2: ( () (otherlv_1= 'true' | ( (lv_constraints_2_0= ruleConstraint ) )* ) )
            {
            // InternalSolverLanguage.g:1459:2: ( () (otherlv_1= 'true' | ( (lv_constraints_2_0= ruleConstraint ) )* ) )
            // InternalSolverLanguage.g:1460:3: () (otherlv_1= 'true' | ( (lv_constraints_2_0= ruleConstraint ) )* )
            {
            // InternalSolverLanguage.g:1460:3: ()
            // InternalSolverLanguage.g:1461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternBodyAccess().getPatternBodyAction_0(),
            					current);
            			

            }

            // InternalSolverLanguage.g:1467:3: (otherlv_1= 'true' | ( (lv_constraints_2_0= ruleConstraint ) )* )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            else if ( (LA25_0==EOF||LA25_0==RULE_ID||(LA25_0>=11 && LA25_0<=12)||(LA25_0>=29 && LA25_0<=31)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSolverLanguage.g:1468:4: otherlv_1= 'true'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPatternBodyAccess().getTrueKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1473:4: ( (lv_constraints_2_0= ruleConstraint ) )*
                    {
                    // InternalSolverLanguage.g:1473:4: ( (lv_constraints_2_0= ruleConstraint ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID||LA24_0==11||(LA24_0>=30 && LA24_0<=31)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:1474:5: (lv_constraints_2_0= ruleConstraint )
                    	    {
                    	    // InternalSolverLanguage.g:1474:5: (lv_constraints_2_0= ruleConstraint )
                    	    // InternalSolverLanguage.g:1475:6: lv_constraints_2_0= ruleConstraint
                    	    {

                    	    						newCompositeNode(grammarAccess.getPatternBodyAccess().getConstraintsConstraintParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_constraints_2_0=ruleConstraint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPatternBodyRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"constraints",
                    	    							lv_constraints_2_0,
                    	    							"org.eclipse.viatra.solver.language.SolverLanguage.Constraint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternBody"


    // $ANTLR start "entryRulePolarity"
    // InternalSolverLanguage.g:1497:1: entryRulePolarity returns [EObject current=null] : iv_rulePolarity= rulePolarity EOF ;
    public final EObject entryRulePolarity() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolarity = null;


        try {
            // InternalSolverLanguage.g:1497:49: (iv_rulePolarity= rulePolarity EOF )
            // InternalSolverLanguage.g:1498:2: iv_rulePolarity= rulePolarity EOF
            {
             newCompositeNode(grammarAccess.getPolarityRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolarity=rulePolarity();

            state._fsp--;

             current =iv_rulePolarity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolarity"


    // $ANTLR start "rulePolarity"
    // InternalSolverLanguage.g:1504:1: rulePolarity returns [EObject current=null] : ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) ;
    public final EObject rulePolarity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:1510:2: ( ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) )
            // InternalSolverLanguage.g:1511:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            {
            // InternalSolverLanguage.g:1511:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            else if ( (LA26_0==11) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSolverLanguage.g:1512:3: ( () otherlv_1= '+' )
                    {
                    // InternalSolverLanguage.g:1512:3: ( () otherlv_1= '+' )
                    // InternalSolverLanguage.g:1513:4: () otherlv_1= '+'
                    {
                    // InternalSolverLanguage.g:1513:4: ()
                    // InternalSolverLanguage.g:1514:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPolarityAccess().getPositiveAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPolarityAccess().getPlusSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1526:3: ( () otherlv_3= '-' )
                    {
                    // InternalSolverLanguage.g:1526:3: ( () otherlv_3= '-' )
                    // InternalSolverLanguage.g:1527:4: () otherlv_3= '-'
                    {
                    // InternalSolverLanguage.g:1527:4: ()
                    // InternalSolverLanguage.g:1528:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPolarityAccess().getNegativeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,11,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPolarityAccess().getHyphenMinusKeyword_1_1());
                    			

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
    // $ANTLR end "rulePolarity"


    // $ANTLR start "entryRuleConstraint"
    // InternalSolverLanguage.g:1543:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalSolverLanguage.g:1543:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalSolverLanguage.g:1544:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalSolverLanguage.g:1550:1: ruleConstraint returns [EObject current=null] : ( ( ( (lv_polarity_0_0= rulePolarity ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? ) | ( ( (lv_closureType_7_0= ruleClosureType ) ) otherlv_8= '(' ( (lv_params_9_0= ruleLiteral ) )? (otherlv_10= ',' ( (lv_params_11_0= ruleLiteral ) ) )* otherlv_12= ')' ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_polarity_0_0 = null;

        EObject lv_symbol_1_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_closureType_7_0 = null;

        EObject lv_params_9_0 = null;

        EObject lv_params_11_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1556:2: ( ( ( ( (lv_polarity_0_0= rulePolarity ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? ) | ( ( (lv_closureType_7_0= ruleClosureType ) ) otherlv_8= '(' ( (lv_params_9_0= ruleLiteral ) )? (otherlv_10= ',' ( (lv_params_11_0= ruleLiteral ) ) )* otherlv_12= ')' ) ) )
            // InternalSolverLanguage.g:1557:2: ( ( ( (lv_polarity_0_0= rulePolarity ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? ) | ( ( (lv_closureType_7_0= ruleClosureType ) ) otherlv_8= '(' ( (lv_params_9_0= ruleLiteral ) )? (otherlv_10= ',' ( (lv_params_11_0= ruleLiteral ) ) )* otherlv_12= ')' ) )
            {
            // InternalSolverLanguage.g:1557:2: ( ( ( (lv_polarity_0_0= rulePolarity ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? ) | ( ( (lv_closureType_7_0= ruleClosureType ) ) otherlv_8= '(' ( (lv_params_9_0= ruleLiteral ) )? (otherlv_10= ',' ( (lv_params_11_0= ruleLiteral ) ) )* otherlv_12= ')' ) )
            int alt33=2;
            switch ( input.LA(1) ) {
            case 30:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==17) ) {
                    alt33=2;
                }
                else if ( (LA33_1==RULE_ID) ) {
                    alt33=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 11:
                {
                alt33=1;
                }
                break;
            case 31:
                {
                alt33=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalSolverLanguage.g:1558:3: ( ( (lv_polarity_0_0= rulePolarity ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? )
                    {
                    // InternalSolverLanguage.g:1558:3: ( ( (lv_polarity_0_0= rulePolarity ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )? )
                    // InternalSolverLanguage.g:1559:4: ( (lv_polarity_0_0= rulePolarity ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )?
                    {
                    // InternalSolverLanguage.g:1559:4: ( (lv_polarity_0_0= rulePolarity ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==11||LA27_0==30) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalSolverLanguage.g:1560:5: (lv_polarity_0_0= rulePolarity )
                            {
                            // InternalSolverLanguage.g:1560:5: (lv_polarity_0_0= rulePolarity )
                            // InternalSolverLanguage.g:1561:6: lv_polarity_0_0= rulePolarity
                            {

                            						newCompositeNode(grammarAccess.getConstraintAccess().getPolarityPolarityParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_12);
                            lv_polarity_0_0=rulePolarity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getConstraintRule());
                            						}
                            						set(
                            							current,
                            							"polarity",
                            							lv_polarity_0_0,
                            							"org.eclipse.viatra.solver.language.SolverLanguage.Polarity");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSolverLanguage.g:1578:4: ( (lv_symbol_1_0= ruleModelSymbol ) )
                    // InternalSolverLanguage.g:1579:5: (lv_symbol_1_0= ruleModelSymbol )
                    {
                    // InternalSolverLanguage.g:1579:5: (lv_symbol_1_0= ruleModelSymbol )
                    // InternalSolverLanguage.g:1580:6: lv_symbol_1_0= ruleModelSymbol
                    {

                    						newCompositeNode(grammarAccess.getConstraintAccess().getSymbolModelSymbolParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_symbol_1_0=ruleModelSymbol();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintRule());
                    						}
                    						set(
                    							current,
                    							"symbol",
                    							lv_symbol_1_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.ModelSymbol");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSolverLanguage.g:1597:4: (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==17) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalSolverLanguage.g:1598:5: otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )? (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )* otherlv_6= ')'
                            {
                            otherlv_2=(Token)match(input,17,FOLLOW_24); 

                            					newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_0_2_0());
                            				
                            // InternalSolverLanguage.g:1602:5: ( (lv_params_3_0= ruleLiteral ) )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( ((LA28_0>=RULE_INT && LA28_0<=RULE_STRING)||LA28_0==11||(LA28_0>=13 && LA28_0<=14)||LA28_0==27) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // InternalSolverLanguage.g:1603:6: (lv_params_3_0= ruleLiteral )
                                    {
                                    // InternalSolverLanguage.g:1603:6: (lv_params_3_0= ruleLiteral )
                                    // InternalSolverLanguage.g:1604:7: lv_params_3_0= ruleLiteral
                                    {

                                    							newCompositeNode(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_0_2_1_0());
                                    						
                                    pushFollow(FOLLOW_8);
                                    lv_params_3_0=ruleLiteral();

                                    state._fsp--;


                                    							if (current==null) {
                                    								current = createModelElementForParent(grammarAccess.getConstraintRule());
                                    							}
                                    							add(
                                    								current,
                                    								"params",
                                    								lv_params_3_0,
                                    								"org.eclipse.viatra.solver.language.SolverLanguage.Literal");
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }


                                    }
                                    break;

                            }

                            // InternalSolverLanguage.g:1621:5: (otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==18) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalSolverLanguage.g:1622:6: otherlv_4= ',' ( (lv_params_5_0= ruleLiteral ) )
                            	    {
                            	    otherlv_4=(Token)match(input,18,FOLLOW_25); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getCommaKeyword_0_2_2_0());
                            	    					
                            	    // InternalSolverLanguage.g:1626:6: ( (lv_params_5_0= ruleLiteral ) )
                            	    // InternalSolverLanguage.g:1627:7: (lv_params_5_0= ruleLiteral )
                            	    {
                            	    // InternalSolverLanguage.g:1627:7: (lv_params_5_0= ruleLiteral )
                            	    // InternalSolverLanguage.g:1628:8: lv_params_5_0= ruleLiteral
                            	    {

                            	    								newCompositeNode(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_0_2_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_params_5_0=ruleLiteral();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getConstraintRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"params",
                            	    									lv_params_5_0,
                            	    									"org.eclipse.viatra.solver.language.SolverLanguage.Literal");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop29;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,19,FOLLOW_2); 

                            					newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getRightParenthesisKeyword_0_2_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1653:3: ( ( (lv_closureType_7_0= ruleClosureType ) ) otherlv_8= '(' ( (lv_params_9_0= ruleLiteral ) )? (otherlv_10= ',' ( (lv_params_11_0= ruleLiteral ) ) )* otherlv_12= ')' )
                    {
                    // InternalSolverLanguage.g:1653:3: ( ( (lv_closureType_7_0= ruleClosureType ) ) otherlv_8= '(' ( (lv_params_9_0= ruleLiteral ) )? (otherlv_10= ',' ( (lv_params_11_0= ruleLiteral ) ) )* otherlv_12= ')' )
                    // InternalSolverLanguage.g:1654:4: ( (lv_closureType_7_0= ruleClosureType ) ) otherlv_8= '(' ( (lv_params_9_0= ruleLiteral ) )? (otherlv_10= ',' ( (lv_params_11_0= ruleLiteral ) ) )* otherlv_12= ')'
                    {
                    // InternalSolverLanguage.g:1654:4: ( (lv_closureType_7_0= ruleClosureType ) )
                    // InternalSolverLanguage.g:1655:5: (lv_closureType_7_0= ruleClosureType )
                    {
                    // InternalSolverLanguage.g:1655:5: (lv_closureType_7_0= ruleClosureType )
                    // InternalSolverLanguage.g:1656:6: lv_closureType_7_0= ruleClosureType
                    {

                    						newCompositeNode(grammarAccess.getConstraintAccess().getClosureTypeClosureTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_closureType_7_0=ruleClosureType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstraintRule());
                    						}
                    						set(
                    							current,
                    							"closureType",
                    							lv_closureType_7_0,
                    							"org.eclipse.viatra.solver.language.SolverLanguage.ClosureType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_24); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalSolverLanguage.g:1677:4: ( (lv_params_9_0= ruleLiteral ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( ((LA31_0>=RULE_INT && LA31_0<=RULE_STRING)||LA31_0==11||(LA31_0>=13 && LA31_0<=14)||LA31_0==27) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalSolverLanguage.g:1678:5: (lv_params_9_0= ruleLiteral )
                            {
                            // InternalSolverLanguage.g:1678:5: (lv_params_9_0= ruleLiteral )
                            // InternalSolverLanguage.g:1679:6: lv_params_9_0= ruleLiteral
                            {

                            						newCompositeNode(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_1_2_0());
                            					
                            pushFollow(FOLLOW_8);
                            lv_params_9_0=ruleLiteral();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getConstraintRule());
                            						}
                            						add(
                            							current,
                            							"params",
                            							lv_params_9_0,
                            							"org.eclipse.viatra.solver.language.SolverLanguage.Literal");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalSolverLanguage.g:1696:4: (otherlv_10= ',' ( (lv_params_11_0= ruleLiteral ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==18) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:1697:5: otherlv_10= ',' ( (lv_params_11_0= ruleLiteral ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FOLLOW_25); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalSolverLanguage.g:1701:5: ( (lv_params_11_0= ruleLiteral ) )
                    	    // InternalSolverLanguage.g:1702:6: (lv_params_11_0= ruleLiteral )
                    	    {
                    	    // InternalSolverLanguage.g:1702:6: (lv_params_11_0= ruleLiteral )
                    	    // InternalSolverLanguage.g:1703:7: lv_params_11_0= ruleLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_params_11_0=ruleLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConstraintRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_11_0,
                    	    								"org.eclipse.viatra.solver.language.SolverLanguage.Literal");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getConstraintAccess().getRightParenthesisKeyword_1_4());
                    			

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleClosureType"
    // InternalSolverLanguage.g:1730:1: entryRuleClosureType returns [EObject current=null] : iv_ruleClosureType= ruleClosureType EOF ;
    public final EObject entryRuleClosureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosureType = null;


        try {
            // InternalSolverLanguage.g:1730:52: (iv_ruleClosureType= ruleClosureType EOF )
            // InternalSolverLanguage.g:1731:2: iv_ruleClosureType= ruleClosureType EOF
            {
             newCompositeNode(grammarAccess.getClosureTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClosureType=ruleClosureType();

            state._fsp--;

             current =iv_ruleClosureType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClosureType"


    // $ANTLR start "ruleClosureType"
    // InternalSolverLanguage.g:1737:1: ruleClosureType returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '+' ) ) ;
    public final EObject ruleClosureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:1743:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '+' ) ) )
            // InternalSolverLanguage.g:1744:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '+' ) )
            {
            // InternalSolverLanguage.g:1744:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '+' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            else if ( (LA34_0==30) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalSolverLanguage.g:1745:3: ( () otherlv_1= '*' )
                    {
                    // InternalSolverLanguage.g:1745:3: ( () otherlv_1= '*' )
                    // InternalSolverLanguage.g:1746:4: () otherlv_1= '*'
                    {
                    // InternalSolverLanguage.g:1746:4: ()
                    // InternalSolverLanguage.g:1747:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getClosureTypeAccess().getReflexiveClosureAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getClosureTypeAccess().getAsteriskKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1759:3: ( () otherlv_3= '+' )
                    {
                    // InternalSolverLanguage.g:1759:3: ( () otherlv_3= '+' )
                    // InternalSolverLanguage.g:1760:4: () otherlv_3= '+'
                    {
                    // InternalSolverLanguage.g:1760:4: ()
                    // InternalSolverLanguage.g:1761:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getClosureTypeAccess().getIrreflexiveClosureAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getClosureTypeAccess().getPlusSignKeyword_1_1());
                    			

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
    // $ANTLR end "ruleClosureType"


    // $ANTLR start "entryRuleLiteral"
    // InternalSolverLanguage.g:1776:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalSolverLanguage.g:1776:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalSolverLanguage.g:1777:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalSolverLanguage.g:1783:1: ruleLiteral returns [EObject current=null] : (this_Variable_0= ruleVariable | this_DataObject_1= ruleDataObject | this_NamedObject_2= ruleNamedObject ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_DataObject_1 = null;

        EObject this_NamedObject_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1789:2: ( (this_Variable_0= ruleVariable | this_DataObject_1= ruleDataObject | this_NamedObject_2= ruleNamedObject ) )
            // InternalSolverLanguage.g:1790:2: (this_Variable_0= ruleVariable | this_DataObject_1= ruleDataObject | this_NamedObject_2= ruleNamedObject )
            {
            // InternalSolverLanguage.g:1790:2: (this_Variable_0= ruleVariable | this_DataObject_1= ruleDataObject | this_NamedObject_2= ruleNamedObject )
            int alt35=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt35=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 11:
            case 13:
            case 14:
                {
                alt35=2;
                }
                break;
            case 27:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSolverLanguage.g:1791:3: this_Variable_0= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_0=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1800:3: this_DataObject_1= ruleDataObject
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getDataObjectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataObject_1=ruleDataObject();

                    state._fsp--;


                    			current = this_DataObject_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:1809:3: this_NamedObject_2= ruleNamedObject
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getNamedObjectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedObject_2=ruleNamedObject();

                    state._fsp--;


                    			current = this_NamedObject_2;
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


    // $ANTLR start "entryRuleVariable"
    // InternalSolverLanguage.g:1821:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSolverLanguage.g:1821:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSolverLanguage.g:1822:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalSolverLanguage.g:1828:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:1834:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSolverLanguage.g:1835:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSolverLanguage.g:1835:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSolverLanguage.g:1836:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSolverLanguage.g:1836:3: (lv_name_0_0= RULE_ID )
            // InternalSolverLanguage.g:1837:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAllInstances"
    // InternalSolverLanguage.g:1856:1: entryRuleAllInstances returns [EObject current=null] : iv_ruleAllInstances= ruleAllInstances EOF ;
    public final EObject entryRuleAllInstances() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllInstances = null;


        try {
            // InternalSolverLanguage.g:1856:53: (iv_ruleAllInstances= ruleAllInstances EOF )
            // InternalSolverLanguage.g:1857:2: iv_ruleAllInstances= ruleAllInstances EOF
            {
             newCompositeNode(grammarAccess.getAllInstancesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllInstances=ruleAllInstances();

            state._fsp--;

             current =iv_ruleAllInstances; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllInstances"


    // $ANTLR start "ruleAllInstances"
    // InternalSolverLanguage.g:1863:1: ruleAllInstances returns [EObject current=null] : (otherlv_0= ':' ( (lv_symbol_1_0= ruleSymbol ) ) ) ;
    public final EObject ruleAllInstances() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_symbol_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1869:2: ( (otherlv_0= ':' ( (lv_symbol_1_0= ruleSymbol ) ) ) )
            // InternalSolverLanguage.g:1870:2: (otherlv_0= ':' ( (lv_symbol_1_0= ruleSymbol ) ) )
            {
            // InternalSolverLanguage.g:1870:2: (otherlv_0= ':' ( (lv_symbol_1_0= ruleSymbol ) ) )
            // InternalSolverLanguage.g:1871:3: otherlv_0= ':' ( (lv_symbol_1_0= ruleSymbol ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getAllInstancesAccess().getColonKeyword_0());
            		
            // InternalSolverLanguage.g:1875:3: ( (lv_symbol_1_0= ruleSymbol ) )
            // InternalSolverLanguage.g:1876:4: (lv_symbol_1_0= ruleSymbol )
            {
            // InternalSolverLanguage.g:1876:4: (lv_symbol_1_0= ruleSymbol )
            // InternalSolverLanguage.g:1877:5: lv_symbol_1_0= ruleSymbol
            {

            					newCompositeNode(grammarAccess.getAllInstancesAccess().getSymbolSymbolParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_symbol_1_0=ruleSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAllInstancesRule());
            					}
            					set(
            						current,
            						"symbol",
            						lv_symbol_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Symbol");
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
    // $ANTLR end "ruleAllInstances"


    // $ANTLR start "entryRuleAllObjects"
    // InternalSolverLanguage.g:1898:1: entryRuleAllObjects returns [EObject current=null] : iv_ruleAllObjects= ruleAllObjects EOF ;
    public final EObject entryRuleAllObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllObjects = null;


        try {
            // InternalSolverLanguage.g:1898:51: (iv_ruleAllObjects= ruleAllObjects EOF )
            // InternalSolverLanguage.g:1899:2: iv_ruleAllObjects= ruleAllObjects EOF
            {
             newCompositeNode(grammarAccess.getAllObjectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllObjects=ruleAllObjects();

            state._fsp--;

             current =iv_ruleAllObjects; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllObjects"


    // $ANTLR start "ruleAllObjects"
    // InternalSolverLanguage.g:1905:1: ruleAllObjects returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleAllObjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:1911:2: ( ( () otherlv_1= '*' ) )
            // InternalSolverLanguage.g:1912:2: ( () otherlv_1= '*' )
            {
            // InternalSolverLanguage.g:1912:2: ( () otherlv_1= '*' )
            // InternalSolverLanguage.g:1913:3: () otherlv_1= '*'
            {
            // InternalSolverLanguage.g:1913:3: ()
            // InternalSolverLanguage.g:1914:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAllObjectsAccess().getAllObjectsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAllObjectsAccess().getAsteriskKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllObjects"


    // $ANTLR start "entryRuleDefaultInterpretation"
    // InternalSolverLanguage.g:1928:1: entryRuleDefaultInterpretation returns [EObject current=null] : iv_ruleDefaultInterpretation= ruleDefaultInterpretation EOF ;
    public final EObject entryRuleDefaultInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultInterpretation = null;


        try {
            // InternalSolverLanguage.g:1928:62: (iv_ruleDefaultInterpretation= ruleDefaultInterpretation EOF )
            // InternalSolverLanguage.g:1929:2: iv_ruleDefaultInterpretation= ruleDefaultInterpretation EOF
            {
             newCompositeNode(grammarAccess.getDefaultInterpretationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultInterpretation=ruleDefaultInterpretation();

            state._fsp--;

             current =iv_ruleDefaultInterpretation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultInterpretation"


    // $ANTLR start "ruleDefaultInterpretation"
    // InternalSolverLanguage.g:1935:1: ruleDefaultInterpretation returns [EObject current=null] : (otherlv_0= 'default' ( (lv_interpretation_1_0= ruleBasicInterpretation ) ) ) ;
    public final EObject ruleDefaultInterpretation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_interpretation_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1941:2: ( (otherlv_0= 'default' ( (lv_interpretation_1_0= ruleBasicInterpretation ) ) ) )
            // InternalSolverLanguage.g:1942:2: (otherlv_0= 'default' ( (lv_interpretation_1_0= ruleBasicInterpretation ) ) )
            {
            // InternalSolverLanguage.g:1942:2: (otherlv_0= 'default' ( (lv_interpretation_1_0= ruleBasicInterpretation ) ) )
            // InternalSolverLanguage.g:1943:3: otherlv_0= 'default' ( (lv_interpretation_1_0= ruleBasicInterpretation ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultInterpretationAccess().getDefaultKeyword_0());
            		
            // InternalSolverLanguage.g:1947:3: ( (lv_interpretation_1_0= ruleBasicInterpretation ) )
            // InternalSolverLanguage.g:1948:4: (lv_interpretation_1_0= ruleBasicInterpretation )
            {
            // InternalSolverLanguage.g:1948:4: (lv_interpretation_1_0= ruleBasicInterpretation )
            // InternalSolverLanguage.g:1949:5: lv_interpretation_1_0= ruleBasicInterpretation
            {

            					newCompositeNode(grammarAccess.getDefaultInterpretationAccess().getInterpretationBasicInterpretationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_interpretation_1_0=ruleBasicInterpretation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefaultInterpretationRule());
            					}
            					set(
            						current,
            						"interpretation",
            						lv_interpretation_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.BasicInterpretation");
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
    // $ANTLR end "ruleDefaultInterpretation"


    // $ANTLR start "entryRuleCDInterpretation"
    // InternalSolverLanguage.g:1970:1: entryRuleCDInterpretation returns [EObject current=null] : iv_ruleCDInterpretation= ruleCDInterpretation EOF ;
    public final EObject entryRuleCDInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDInterpretation = null;


        try {
            // InternalSolverLanguage.g:1970:57: (iv_ruleCDInterpretation= ruleCDInterpretation EOF )
            // InternalSolverLanguage.g:1971:2: iv_ruleCDInterpretation= ruleCDInterpretation EOF
            {
             newCompositeNode(grammarAccess.getCDInterpretationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCDInterpretation=ruleCDInterpretation();

            state._fsp--;

             current =iv_ruleCDInterpretation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCDInterpretation"


    // $ANTLR start "ruleCDInterpretation"
    // InternalSolverLanguage.g:1977:1: ruleCDInterpretation returns [EObject current=null] : (this_ClassInterpretation_0= ruleClassInterpretation | this_EnumInterpretation_1= ruleEnumInterpretation | this_GlobalRelationInterpretation_2= ruleGlobalRelationInterpretation ) ;
    public final EObject ruleCDInterpretation() throws RecognitionException {
        EObject current = null;

        EObject this_ClassInterpretation_0 = null;

        EObject this_EnumInterpretation_1 = null;

        EObject this_GlobalRelationInterpretation_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1983:2: ( (this_ClassInterpretation_0= ruleClassInterpretation | this_EnumInterpretation_1= ruleEnumInterpretation | this_GlobalRelationInterpretation_2= ruleGlobalRelationInterpretation ) )
            // InternalSolverLanguage.g:1984:2: (this_ClassInterpretation_0= ruleClassInterpretation | this_EnumInterpretation_1= ruleEnumInterpretation | this_GlobalRelationInterpretation_2= ruleGlobalRelationInterpretation )
            {
            // InternalSolverLanguage.g:1984:2: (this_ClassInterpretation_0= ruleClassInterpretation | this_EnumInterpretation_1= ruleEnumInterpretation | this_GlobalRelationInterpretation_2= ruleGlobalRelationInterpretation )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 33:
            case 34:
                {
                alt36=1;
                }
                break;
            case 38:
                {
                alt36=2;
                }
                break;
            case 39:
            case 40:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalSolverLanguage.g:1985:3: this_ClassInterpretation_0= ruleClassInterpretation
                    {

                    			newCompositeNode(grammarAccess.getCDInterpretationAccess().getClassInterpretationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassInterpretation_0=ruleClassInterpretation();

                    state._fsp--;


                    			current = this_ClassInterpretation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1994:3: this_EnumInterpretation_1= ruleEnumInterpretation
                    {

                    			newCompositeNode(grammarAccess.getCDInterpretationAccess().getEnumInterpretationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumInterpretation_1=ruleEnumInterpretation();

                    state._fsp--;


                    			current = this_EnumInterpretation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolverLanguage.g:2003:3: this_GlobalRelationInterpretation_2= ruleGlobalRelationInterpretation
                    {

                    			newCompositeNode(grammarAccess.getCDInterpretationAccess().getGlobalRelationInterpretationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GlobalRelationInterpretation_2=ruleGlobalRelationInterpretation();

                    state._fsp--;


                    			current = this_GlobalRelationInterpretation_2;
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
    // $ANTLR end "ruleCDInterpretation"


    // $ANTLR start "entryRuleClassInterpretation"
    // InternalSolverLanguage.g:2015:1: entryRuleClassInterpretation returns [EObject current=null] : iv_ruleClassInterpretation= ruleClassInterpretation EOF ;
    public final EObject entryRuleClassInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassInterpretation = null;


        try {
            // InternalSolverLanguage.g:2015:60: (iv_ruleClassInterpretation= ruleClassInterpretation EOF )
            // InternalSolverLanguage.g:2016:2: iv_ruleClassInterpretation= ruleClassInterpretation EOF
            {
             newCompositeNode(grammarAccess.getClassInterpretationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassInterpretation=ruleClassInterpretation();

            state._fsp--;

             current =iv_ruleClassInterpretation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassInterpretation"


    // $ANTLR start "ruleClassInterpretation"
    // InternalSolverLanguage.g:2022:1: ruleClassInterpretation returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_symbol_2_0= ruleModelSymbol ) ) (otherlv_3= 'extends' ( (lv_supertypes_4_0= ruleModelSymbol ) )+ )? otherlv_5= '{' ( (lv_fielt_6_0= ruleFieldRelationInterpretation ) )* otherlv_7= '}' ) ;
    public final EObject ruleClassInterpretation() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_symbol_2_0 = null;

        EObject lv_supertypes_4_0 = null;

        EObject lv_fielt_6_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2028:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_symbol_2_0= ruleModelSymbol ) ) (otherlv_3= 'extends' ( (lv_supertypes_4_0= ruleModelSymbol ) )+ )? otherlv_5= '{' ( (lv_fielt_6_0= ruleFieldRelationInterpretation ) )* otherlv_7= '}' ) )
            // InternalSolverLanguage.g:2029:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_symbol_2_0= ruleModelSymbol ) ) (otherlv_3= 'extends' ( (lv_supertypes_4_0= ruleModelSymbol ) )+ )? otherlv_5= '{' ( (lv_fielt_6_0= ruleFieldRelationInterpretation ) )* otherlv_7= '}' )
            {
            // InternalSolverLanguage.g:2029:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_symbol_2_0= ruleModelSymbol ) ) (otherlv_3= 'extends' ( (lv_supertypes_4_0= ruleModelSymbol ) )+ )? otherlv_5= '{' ( (lv_fielt_6_0= ruleFieldRelationInterpretation ) )* otherlv_7= '}' )
            // InternalSolverLanguage.g:2030:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_symbol_2_0= ruleModelSymbol ) ) (otherlv_3= 'extends' ( (lv_supertypes_4_0= ruleModelSymbol ) )+ )? otherlv_5= '{' ( (lv_fielt_6_0= ruleFieldRelationInterpretation ) )* otherlv_7= '}'
            {
            // InternalSolverLanguage.g:2030:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSolverLanguage.g:2031:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalSolverLanguage.g:2031:4: (lv_abstract_0_0= 'abstract' )
                    // InternalSolverLanguage.g:2032:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,33,FOLLOW_27); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getClassInterpretationAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassInterpretationRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getClassInterpretationAccess().getClassKeyword_1());
            		
            // InternalSolverLanguage.g:2048:3: ( (lv_symbol_2_0= ruleModelSymbol ) )
            // InternalSolverLanguage.g:2049:4: (lv_symbol_2_0= ruleModelSymbol )
            {
            // InternalSolverLanguage.g:2049:4: (lv_symbol_2_0= ruleModelSymbol )
            // InternalSolverLanguage.g:2050:5: lv_symbol_2_0= ruleModelSymbol
            {

            					newCompositeNode(grammarAccess.getClassInterpretationAccess().getSymbolModelSymbolParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_symbol_2_0=ruleModelSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassInterpretationRule());
            					}
            					set(
            						current,
            						"symbol",
            						lv_symbol_2_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ModelSymbol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguage.g:2067:3: (otherlv_3= 'extends' ( (lv_supertypes_4_0= ruleModelSymbol ) )+ )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSolverLanguage.g:2068:4: otherlv_3= 'extends' ( (lv_supertypes_4_0= ruleModelSymbol ) )+
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassInterpretationAccess().getExtendsKeyword_3_0());
                    			
                    // InternalSolverLanguage.g:2072:4: ( (lv_supertypes_4_0= ruleModelSymbol ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_ID) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:2073:5: (lv_supertypes_4_0= ruleModelSymbol )
                    	    {
                    	    // InternalSolverLanguage.g:2073:5: (lv_supertypes_4_0= ruleModelSymbol )
                    	    // InternalSolverLanguage.g:2074:6: lv_supertypes_4_0= ruleModelSymbol
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassInterpretationAccess().getSupertypesModelSymbolParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
                    	    lv_supertypes_4_0=ruleModelSymbol();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClassInterpretationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"supertypes",
                    	    							lv_supertypes_4_0,
                    	    							"org.eclipse.viatra.solver.language.SolverLanguage.ModelSymbol");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getClassInterpretationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSolverLanguage.g:2096:3: ( (lv_fielt_6_0= ruleFieldRelationInterpretation ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||LA40_0==39) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSolverLanguage.g:2097:4: (lv_fielt_6_0= ruleFieldRelationInterpretation )
            	    {
            	    // InternalSolverLanguage.g:2097:4: (lv_fielt_6_0= ruleFieldRelationInterpretation )
            	    // InternalSolverLanguage.g:2098:5: lv_fielt_6_0= ruleFieldRelationInterpretation
            	    {

            	    					newCompositeNode(grammarAccess.getClassInterpretationAccess().getFieltFieldRelationInterpretationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_fielt_6_0=ruleFieldRelationInterpretation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassInterpretationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fielt",
            	    						lv_fielt_6_0,
            	    						"org.eclipse.viatra.solver.language.SolverLanguage.FieldRelationInterpretation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_7=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getClassInterpretationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassInterpretation"


    // $ANTLR start "entryRuleEnumInterpretation"
    // InternalSolverLanguage.g:2123:1: entryRuleEnumInterpretation returns [EObject current=null] : iv_ruleEnumInterpretation= ruleEnumInterpretation EOF ;
    public final EObject entryRuleEnumInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumInterpretation = null;


        try {
            // InternalSolverLanguage.g:2123:59: (iv_ruleEnumInterpretation= ruleEnumInterpretation EOF )
            // InternalSolverLanguage.g:2124:2: iv_ruleEnumInterpretation= ruleEnumInterpretation EOF
            {
             newCompositeNode(grammarAccess.getEnumInterpretationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumInterpretation=ruleEnumInterpretation();

            state._fsp--;

             current =iv_ruleEnumInterpretation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumInterpretation"


    // $ANTLR start "ruleEnumInterpretation"
    // InternalSolverLanguage.g:2130:1: ruleEnumInterpretation returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_Symbol_1_0= ruleModelSymbol ) ) otherlv_2= '{' ( (lv_objects_3_0= ruleNamedObject ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnumInterpretation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_Symbol_1_0 = null;

        EObject lv_objects_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2136:2: ( (otherlv_0= 'enum' ( (lv_Symbol_1_0= ruleModelSymbol ) ) otherlv_2= '{' ( (lv_objects_3_0= ruleNamedObject ) )+ otherlv_4= '}' ) )
            // InternalSolverLanguage.g:2137:2: (otherlv_0= 'enum' ( (lv_Symbol_1_0= ruleModelSymbol ) ) otherlv_2= '{' ( (lv_objects_3_0= ruleNamedObject ) )+ otherlv_4= '}' )
            {
            // InternalSolverLanguage.g:2137:2: (otherlv_0= 'enum' ( (lv_Symbol_1_0= ruleModelSymbol ) ) otherlv_2= '{' ( (lv_objects_3_0= ruleNamedObject ) )+ otherlv_4= '}' )
            // InternalSolverLanguage.g:2138:3: otherlv_0= 'enum' ( (lv_Symbol_1_0= ruleModelSymbol ) ) otherlv_2= '{' ( (lv_objects_3_0= ruleNamedObject ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumInterpretationAccess().getEnumKeyword_0());
            		
            // InternalSolverLanguage.g:2142:3: ( (lv_Symbol_1_0= ruleModelSymbol ) )
            // InternalSolverLanguage.g:2143:4: (lv_Symbol_1_0= ruleModelSymbol )
            {
            // InternalSolverLanguage.g:2143:4: (lv_Symbol_1_0= ruleModelSymbol )
            // InternalSolverLanguage.g:2144:5: lv_Symbol_1_0= ruleModelSymbol
            {

            					newCompositeNode(grammarAccess.getEnumInterpretationAccess().getSymbolModelSymbolParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_Symbol_1_0=ruleModelSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumInterpretationRule());
            					}
            					set(
            						current,
            						"Symbol",
            						lv_Symbol_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ModelSymbol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumInterpretationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSolverLanguage.g:2165:3: ( (lv_objects_3_0= ruleNamedObject ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==27) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSolverLanguage.g:2166:4: (lv_objects_3_0= ruleNamedObject )
            	    {
            	    // InternalSolverLanguage.g:2166:4: (lv_objects_3_0= ruleNamedObject )
            	    // InternalSolverLanguage.g:2167:5: lv_objects_3_0= ruleNamedObject
            	    {

            	    					newCompositeNode(grammarAccess.getEnumInterpretationAccess().getObjectsNamedObjectParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_objects_3_0=ruleNamedObject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumInterpretationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objects",
            	    						lv_objects_3_0,
            	    						"org.eclipse.viatra.solver.language.SolverLanguage.NamedObject");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            otherlv_4=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumInterpretationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumInterpretation"


    // $ANTLR start "entryRuleFieldRelationInterpretation"
    // InternalSolverLanguage.g:2192:1: entryRuleFieldRelationInterpretation returns [EObject current=null] : iv_ruleFieldRelationInterpretation= ruleFieldRelationInterpretation EOF ;
    public final EObject entryRuleFieldRelationInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldRelationInterpretation = null;


        try {
            // InternalSolverLanguage.g:2192:68: (iv_ruleFieldRelationInterpretation= ruleFieldRelationInterpretation EOF )
            // InternalSolverLanguage.g:2193:2: iv_ruleFieldRelationInterpretation= ruleFieldRelationInterpretation EOF
            {
             newCompositeNode(grammarAccess.getFieldRelationInterpretationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldRelationInterpretation=ruleFieldRelationInterpretation();

            state._fsp--;

             current =iv_ruleFieldRelationInterpretation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldRelationInterpretation"


    // $ANTLR start "ruleFieldRelationInterpretation"
    // InternalSolverLanguage.g:2199:1: ruleFieldRelationInterpretation returns [EObject current=null] : ( ( (lv_containment_0_0= 'containment' ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicityDefinition ) )? ( (lv_target_4_0= ruleSymbol ) ) ) ;
    public final EObject ruleFieldRelationInterpretation() throws RecognitionException {
        EObject current = null;

        Token lv_containment_0_0=null;
        Token otherlv_2=null;
        EObject lv_symbol_1_0 = null;

        EObject lv_multiplicity_3_0 = null;

        EObject lv_target_4_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2205:2: ( ( ( (lv_containment_0_0= 'containment' ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicityDefinition ) )? ( (lv_target_4_0= ruleSymbol ) ) ) )
            // InternalSolverLanguage.g:2206:2: ( ( (lv_containment_0_0= 'containment' ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicityDefinition ) )? ( (lv_target_4_0= ruleSymbol ) ) )
            {
            // InternalSolverLanguage.g:2206:2: ( ( (lv_containment_0_0= 'containment' ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicityDefinition ) )? ( (lv_target_4_0= ruleSymbol ) ) )
            // InternalSolverLanguage.g:2207:3: ( (lv_containment_0_0= 'containment' ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicityDefinition ) )? ( (lv_target_4_0= ruleSymbol ) )
            {
            // InternalSolverLanguage.g:2207:3: ( (lv_containment_0_0= 'containment' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSolverLanguage.g:2208:4: (lv_containment_0_0= 'containment' )
                    {
                    // InternalSolverLanguage.g:2208:4: (lv_containment_0_0= 'containment' )
                    // InternalSolverLanguage.g:2209:5: lv_containment_0_0= 'containment'
                    {
                    lv_containment_0_0=(Token)match(input,39,FOLLOW_12); 

                    					newLeafNode(lv_containment_0_0, grammarAccess.getFieldRelationInterpretationAccess().getContainmentContainmentKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRelationInterpretationRule());
                    					}
                    					setWithLastConsumed(current, "containment", true, "containment");
                    				

                    }


                    }
                    break;

            }

            // InternalSolverLanguage.g:2221:3: ( (lv_symbol_1_0= ruleModelSymbol ) )
            // InternalSolverLanguage.g:2222:4: (lv_symbol_1_0= ruleModelSymbol )
            {
            // InternalSolverLanguage.g:2222:4: (lv_symbol_1_0= ruleModelSymbol )
            // InternalSolverLanguage.g:2223:5: lv_symbol_1_0= ruleModelSymbol
            {

            					newCompositeNode(grammarAccess.getFieldRelationInterpretationAccess().getSymbolModelSymbolParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_symbol_1_0=ruleModelSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRelationInterpretationRule());
            					}
            					set(
            						current,
            						"symbol",
            						lv_symbol_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ModelSymbol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldRelationInterpretationAccess().getColonKeyword_2());
            		
            // InternalSolverLanguage.g:2244:3: ( (lv_multiplicity_3_0= ruleMultiplicityDefinition ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSolverLanguage.g:2245:4: (lv_multiplicity_3_0= ruleMultiplicityDefinition )
                    {
                    // InternalSolverLanguage.g:2245:4: (lv_multiplicity_3_0= ruleMultiplicityDefinition )
                    // InternalSolverLanguage.g:2246:5: lv_multiplicity_3_0= ruleMultiplicityDefinition
                    {

                    					newCompositeNode(grammarAccess.getFieldRelationInterpretationAccess().getMultiplicityMultiplicityDefinitionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_multiplicity_3_0=ruleMultiplicityDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldRelationInterpretationRule());
                    					}
                    					set(
                    						current,
                    						"multiplicity",
                    						lv_multiplicity_3_0,
                    						"org.eclipse.viatra.solver.language.SolverLanguage.MultiplicityDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSolverLanguage.g:2263:3: ( (lv_target_4_0= ruleSymbol ) )
            // InternalSolverLanguage.g:2264:4: (lv_target_4_0= ruleSymbol )
            {
            // InternalSolverLanguage.g:2264:4: (lv_target_4_0= ruleSymbol )
            // InternalSolverLanguage.g:2265:5: lv_target_4_0= ruleSymbol
            {

            					newCompositeNode(grammarAccess.getFieldRelationInterpretationAccess().getTargetSymbolParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_4_0=ruleSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRelationInterpretationRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_4_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Symbol");
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
    // $ANTLR end "ruleFieldRelationInterpretation"


    // $ANTLR start "entryRuleGlobalRelationInterpretation"
    // InternalSolverLanguage.g:2286:1: entryRuleGlobalRelationInterpretation returns [EObject current=null] : iv_ruleGlobalRelationInterpretation= ruleGlobalRelationInterpretation EOF ;
    public final EObject entryRuleGlobalRelationInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalRelationInterpretation = null;


        try {
            // InternalSolverLanguage.g:2286:69: (iv_ruleGlobalRelationInterpretation= ruleGlobalRelationInterpretation EOF )
            // InternalSolverLanguage.g:2287:2: iv_ruleGlobalRelationInterpretation= ruleGlobalRelationInterpretation EOF
            {
             newCompositeNode(grammarAccess.getGlobalRelationInterpretationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalRelationInterpretation=ruleGlobalRelationInterpretation();

            state._fsp--;

             current =iv_ruleGlobalRelationInterpretation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalRelationInterpretation"


    // $ANTLR start "ruleGlobalRelationInterpretation"
    // InternalSolverLanguage.g:2293:1: ruleGlobalRelationInterpretation returns [EObject current=null] : ( ( (lv_containment_0_0= 'containment' ) )? otherlv_1= 'relation' ( (lv_symbol_2_0= ruleModelSymbol ) ) otherlv_3= ':' ( (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition ) )? ( (lv_source_5_0= ruleSymbol ) ) ( (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition ) )? ( (lv_target_7_0= ruleSymbol ) ) ) ;
    public final EObject ruleGlobalRelationInterpretation() throws RecognitionException {
        EObject current = null;

        Token lv_containment_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_symbol_2_0 = null;

        EObject lv_sourceMultiplicity_4_0 = null;

        EObject lv_source_5_0 = null;

        EObject lv_targetMultiplicity_6_0 = null;

        EObject lv_target_7_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2299:2: ( ( ( (lv_containment_0_0= 'containment' ) )? otherlv_1= 'relation' ( (lv_symbol_2_0= ruleModelSymbol ) ) otherlv_3= ':' ( (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition ) )? ( (lv_source_5_0= ruleSymbol ) ) ( (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition ) )? ( (lv_target_7_0= ruleSymbol ) ) ) )
            // InternalSolverLanguage.g:2300:2: ( ( (lv_containment_0_0= 'containment' ) )? otherlv_1= 'relation' ( (lv_symbol_2_0= ruleModelSymbol ) ) otherlv_3= ':' ( (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition ) )? ( (lv_source_5_0= ruleSymbol ) ) ( (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition ) )? ( (lv_target_7_0= ruleSymbol ) ) )
            {
            // InternalSolverLanguage.g:2300:2: ( ( (lv_containment_0_0= 'containment' ) )? otherlv_1= 'relation' ( (lv_symbol_2_0= ruleModelSymbol ) ) otherlv_3= ':' ( (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition ) )? ( (lv_source_5_0= ruleSymbol ) ) ( (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition ) )? ( (lv_target_7_0= ruleSymbol ) ) )
            // InternalSolverLanguage.g:2301:3: ( (lv_containment_0_0= 'containment' ) )? otherlv_1= 'relation' ( (lv_symbol_2_0= ruleModelSymbol ) ) otherlv_3= ':' ( (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition ) )? ( (lv_source_5_0= ruleSymbol ) ) ( (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition ) )? ( (lv_target_7_0= ruleSymbol ) )
            {
            // InternalSolverLanguage.g:2301:3: ( (lv_containment_0_0= 'containment' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSolverLanguage.g:2302:4: (lv_containment_0_0= 'containment' )
                    {
                    // InternalSolverLanguage.g:2302:4: (lv_containment_0_0= 'containment' )
                    // InternalSolverLanguage.g:2303:5: lv_containment_0_0= 'containment'
                    {
                    lv_containment_0_0=(Token)match(input,39,FOLLOW_34); 

                    					newLeafNode(lv_containment_0_0, grammarAccess.getGlobalRelationInterpretationAccess().getContainmentContainmentKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGlobalRelationInterpretationRule());
                    					}
                    					setWithLastConsumed(current, "containment", true, "containment");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalRelationInterpretationAccess().getRelationKeyword_1());
            		
            // InternalSolverLanguage.g:2319:3: ( (lv_symbol_2_0= ruleModelSymbol ) )
            // InternalSolverLanguage.g:2320:4: (lv_symbol_2_0= ruleModelSymbol )
            {
            // InternalSolverLanguage.g:2320:4: (lv_symbol_2_0= ruleModelSymbol )
            // InternalSolverLanguage.g:2321:5: lv_symbol_2_0= ruleModelSymbol
            {

            					newCompositeNode(grammarAccess.getGlobalRelationInterpretationAccess().getSymbolModelSymbolParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_symbol_2_0=ruleModelSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalRelationInterpretationRule());
            					}
            					set(
            						current,
            						"symbol",
            						lv_symbol_2_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ModelSymbol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getGlobalRelationInterpretationAccess().getColonKeyword_3());
            		
            // InternalSolverLanguage.g:2342:3: ( (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_INT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSolverLanguage.g:2343:4: (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition )
                    {
                    // InternalSolverLanguage.g:2343:4: (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition )
                    // InternalSolverLanguage.g:2344:5: lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition
                    {

                    					newCompositeNode(grammarAccess.getGlobalRelationInterpretationAccess().getSourceMultiplicityMultiplicityDefinitionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_sourceMultiplicity_4_0=ruleMultiplicityDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGlobalRelationInterpretationRule());
                    					}
                    					set(
                    						current,
                    						"sourceMultiplicity",
                    						lv_sourceMultiplicity_4_0,
                    						"org.eclipse.viatra.solver.language.SolverLanguage.MultiplicityDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSolverLanguage.g:2361:3: ( (lv_source_5_0= ruleSymbol ) )
            // InternalSolverLanguage.g:2362:4: (lv_source_5_0= ruleSymbol )
            {
            // InternalSolverLanguage.g:2362:4: (lv_source_5_0= ruleSymbol )
            // InternalSolverLanguage.g:2363:5: lv_source_5_0= ruleSymbol
            {

            					newCompositeNode(grammarAccess.getGlobalRelationInterpretationAccess().getSourceSymbolParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_33);
            lv_source_5_0=ruleSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalRelationInterpretationRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_5_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Symbol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSolverLanguage.g:2380:3: ( (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_INT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSolverLanguage.g:2381:4: (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition )
                    {
                    // InternalSolverLanguage.g:2381:4: (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition )
                    // InternalSolverLanguage.g:2382:5: lv_targetMultiplicity_6_0= ruleMultiplicityDefinition
                    {

                    					newCompositeNode(grammarAccess.getGlobalRelationInterpretationAccess().getTargetMultiplicityMultiplicityDefinitionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_targetMultiplicity_6_0=ruleMultiplicityDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGlobalRelationInterpretationRule());
                    					}
                    					set(
                    						current,
                    						"targetMultiplicity",
                    						lv_targetMultiplicity_6_0,
                    						"org.eclipse.viatra.solver.language.SolverLanguage.MultiplicityDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSolverLanguage.g:2399:3: ( (lv_target_7_0= ruleSymbol ) )
            // InternalSolverLanguage.g:2400:4: (lv_target_7_0= ruleSymbol )
            {
            // InternalSolverLanguage.g:2400:4: (lv_target_7_0= ruleSymbol )
            // InternalSolverLanguage.g:2401:5: lv_target_7_0= ruleSymbol
            {

            					newCompositeNode(grammarAccess.getGlobalRelationInterpretationAccess().getTargetSymbolParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_7_0=ruleSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalRelationInterpretationRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_7_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.Symbol");
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
    // $ANTLR end "ruleGlobalRelationInterpretation"


    // $ANTLR start "entryRuleMultiplicityDefinition"
    // InternalSolverLanguage.g:2422:1: entryRuleMultiplicityDefinition returns [EObject current=null] : iv_ruleMultiplicityDefinition= ruleMultiplicityDefinition EOF ;
    public final EObject entryRuleMultiplicityDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityDefinition = null;


        try {
            // InternalSolverLanguage.g:2422:63: (iv_ruleMultiplicityDefinition= ruleMultiplicityDefinition EOF )
            // InternalSolverLanguage.g:2423:2: iv_ruleMultiplicityDefinition= ruleMultiplicityDefinition EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicityDefinition=ruleMultiplicityDefinition();

            state._fsp--;

             current =iv_ruleMultiplicityDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityDefinition"


    // $ANTLR start "ruleMultiplicityDefinition"
    // InternalSolverLanguage.g:2429:1: ruleMultiplicityDefinition returns [EObject current=null] : ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_upper_2_0= RULE_INT ) ) | ( (lv_unlimitedUpper_3_0= '*' ) ) ) ) ;
    public final EObject ruleMultiplicityDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_lower_0_0=null;
        Token otherlv_1=null;
        Token lv_upper_2_0=null;
        Token lv_unlimitedUpper_3_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:2435:2: ( ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_upper_2_0= RULE_INT ) ) | ( (lv_unlimitedUpper_3_0= '*' ) ) ) ) )
            // InternalSolverLanguage.g:2436:2: ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_upper_2_0= RULE_INT ) ) | ( (lv_unlimitedUpper_3_0= '*' ) ) ) )
            {
            // InternalSolverLanguage.g:2436:2: ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_upper_2_0= RULE_INT ) ) | ( (lv_unlimitedUpper_3_0= '*' ) ) ) )
            // InternalSolverLanguage.g:2437:3: ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_upper_2_0= RULE_INT ) ) | ( (lv_unlimitedUpper_3_0= '*' ) ) )
            {
            // InternalSolverLanguage.g:2437:3: ( (lv_lower_0_0= RULE_INT ) )
            // InternalSolverLanguage.g:2438:4: (lv_lower_0_0= RULE_INT )
            {
            // InternalSolverLanguage.g:2438:4: (lv_lower_0_0= RULE_INT )
            // InternalSolverLanguage.g:2439:5: lv_lower_0_0= RULE_INT
            {
            lv_lower_0_0=(Token)match(input,RULE_INT,FOLLOW_35); 

            					newLeafNode(lv_lower_0_0, grammarAccess.getMultiplicityDefinitionAccess().getLowerINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiplicityDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lower",
            						lv_lower_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiplicityDefinitionAccess().getFullStopFullStopKeyword_1());
            		
            // InternalSolverLanguage.g:2459:3: ( ( (lv_upper_2_0= RULE_INT ) ) | ( (lv_unlimitedUpper_3_0= '*' ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                alt47=1;
            }
            else if ( (LA47_0==31) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalSolverLanguage.g:2460:4: ( (lv_upper_2_0= RULE_INT ) )
                    {
                    // InternalSolverLanguage.g:2460:4: ( (lv_upper_2_0= RULE_INT ) )
                    // InternalSolverLanguage.g:2461:5: (lv_upper_2_0= RULE_INT )
                    {
                    // InternalSolverLanguage.g:2461:5: (lv_upper_2_0= RULE_INT )
                    // InternalSolverLanguage.g:2462:6: lv_upper_2_0= RULE_INT
                    {
                    lv_upper_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_upper_2_0, grammarAccess.getMultiplicityDefinitionAccess().getUpperINTTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultiplicityDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"upper",
                    							lv_upper_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:2479:4: ( (lv_unlimitedUpper_3_0= '*' ) )
                    {
                    // InternalSolverLanguage.g:2479:4: ( (lv_unlimitedUpper_3_0= '*' ) )
                    // InternalSolverLanguage.g:2480:5: (lv_unlimitedUpper_3_0= '*' )
                    {
                    // InternalSolverLanguage.g:2480:5: (lv_unlimitedUpper_3_0= '*' )
                    // InternalSolverLanguage.g:2481:6: lv_unlimitedUpper_3_0= '*'
                    {
                    lv_unlimitedUpper_3_0=(Token)match(input,31,FOLLOW_2); 

                    						newLeafNode(lv_unlimitedUpper_3_0, grammarAccess.getMultiplicityDefinitionAccess().getUnlimitedUpperAsteriskKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultiplicityDefinitionRule());
                    						}
                    						setWithLastConsumed(current, "unlimitedUpper", true, "*");
                    					

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
    // $ANTLR end "ruleMultiplicityDefinition"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\5\1\21\2\uffff\1\4\1\22\1\24\1\4\1\22";
    static final String dfa_3s = "\1\50\1\34\2\uffff\1\37\1\24\1\34\1\37\1\24";
    static final String dfa_4s = "\2\uffff\1\1\1\2\5\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\12\uffff\1\3\4\uffff\6\2\5\uffff\3\2\3\uffff\3\2",
            "\1\4\2\uffff\1\2\7\uffff\1\3",
            "",
            "",
            "\1\2\1\5\1\2\4\uffff\1\2\1\uffff\2\2\4\uffff\1\6\1\2\6\uffff\1\2\3\uffff\1\2",
            "\1\7\1\6\1\3",
            "\1\2\7\uffff\1\3",
            "\1\2\1\10\1\2\4\uffff\1\2\1\uffff\2\2\5\uffff\1\2\6\uffff\1\2\3\uffff\1\2",
            "\1\7\1\6\1\3"
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
            return "114:2: (this_Interpretation_0= ruleInterpretation | this_Predicate_1= rulePredicate )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000001C707E10022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000088186870L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000088106870L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000E0007820L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000E0003820L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000007E00020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000C0000822L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000080C6870L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008006870L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000A000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000007E00030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000010L});

}