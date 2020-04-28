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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'.'", "'true'", "'false'", "'unknown'", "'error'", "'('", "')'", "':'", "'exists'", "'equals'", "'bool'", "'int'", "'real'", "'string'", "'\\''", "'predicate'", "'|'", "'+'", "'*'", "'default'", "'abstract'", "'class'", "'extends'", "'{'", "'}'", "'enum'", "'containment'", "'relation'", "'..'"
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

                if ( (LA1_0==RULE_ID||LA1_0==16||(LA1_0>=20 && LA1_0<=25)||LA1_0==27||(LA1_0>=31 && LA1_0<=32)||(LA1_0>=37 && LA1_0<=38)) ) {
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
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=20 && LA2_0<=25)||(LA2_0>=31 && LA2_0<=32)||(LA2_0>=37 && LA2_0<=38)) ) {
                alt2=1;
            }
            else if ( (LA2_0==16||LA2_0==27) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
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
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 32:
            case 37:
            case 38:
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
    // InternalSolverLanguage.g:386:1: ruleBasicInterpretation returns [EObject current=null] : ( ( (lv_symbol_0_0= ruleSymbol ) ) otherlv_1= '(' ( (lv_objects_2_0= ruleComplexObject ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_value_5_0= ruleTruthValue ) ) ) ;
    public final EObject ruleBasicInterpretation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_symbol_0_0 = null;

        EObject lv_objects_2_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:392:2: ( ( ( (lv_symbol_0_0= ruleSymbol ) ) otherlv_1= '(' ( (lv_objects_2_0= ruleComplexObject ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_value_5_0= ruleTruthValue ) ) ) )
            // InternalSolverLanguage.g:393:2: ( ( (lv_symbol_0_0= ruleSymbol ) ) otherlv_1= '(' ( (lv_objects_2_0= ruleComplexObject ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_value_5_0= ruleTruthValue ) ) )
            {
            // InternalSolverLanguage.g:393:2: ( ( (lv_symbol_0_0= ruleSymbol ) ) otherlv_1= '(' ( (lv_objects_2_0= ruleComplexObject ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_value_5_0= ruleTruthValue ) ) )
            // InternalSolverLanguage.g:394:3: ( (lv_symbol_0_0= ruleSymbol ) ) otherlv_1= '(' ( (lv_objects_2_0= ruleComplexObject ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_value_5_0= ruleTruthValue ) )
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

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicInterpretationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSolverLanguage.g:417:3: ( (lv_objects_2_0= ruleComplexObject ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_STRING)||LA8_0==11||(LA8_0>=13 && LA8_0<=14)||LA8_0==19||LA8_0==26||LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSolverLanguage.g:418:4: (lv_objects_2_0= ruleComplexObject )
            	    {
            	    // InternalSolverLanguage.g:418:4: (lv_objects_2_0= ruleComplexObject )
            	    // InternalSolverLanguage.g:419:5: lv_objects_2_0= ruleComplexObject
            	    {

            	    					newCompositeNode(grammarAccess.getBasicInterpretationAccess().getObjectsComplexObjectParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getBasicInterpretationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getBasicInterpretationAccess().getColonKeyword_4());
            		
            // InternalSolverLanguage.g:444:3: ( (lv_value_5_0= ruleTruthValue ) )
            // InternalSolverLanguage.g:445:4: (lv_value_5_0= ruleTruthValue )
            {
            // InternalSolverLanguage.g:445:4: (lv_value_5_0= ruleTruthValue )
            // InternalSolverLanguage.g:446:5: lv_value_5_0= ruleTruthValue
            {

            					newCompositeNode(grammarAccess.getBasicInterpretationAccess().getValueTruthValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_5_0=ruleTruthValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasicInterpretationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
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
    // InternalSolverLanguage.g:467:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalSolverLanguage.g:467:47: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalSolverLanguage.g:468:2: iv_ruleSymbol= ruleSymbol EOF
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
    // InternalSolverLanguage.g:474:1: ruleSymbol returns [EObject current=null] : (this_ModelSymbol_0= ruleModelSymbol | this_PartialitySymbol_1= rulePartialitySymbol | this_DataSymbol_2= ruleDataSymbol ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        EObject this_ModelSymbol_0 = null;

        EObject this_PartialitySymbol_1 = null;

        EObject this_DataSymbol_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:480:2: ( (this_ModelSymbol_0= ruleModelSymbol | this_PartialitySymbol_1= rulePartialitySymbol | this_DataSymbol_2= ruleDataSymbol ) )
            // InternalSolverLanguage.g:481:2: (this_ModelSymbol_0= ruleModelSymbol | this_PartialitySymbol_1= rulePartialitySymbol | this_DataSymbol_2= ruleDataSymbol )
            {
            // InternalSolverLanguage.g:481:2: (this_ModelSymbol_0= ruleModelSymbol | this_PartialitySymbol_1= rulePartialitySymbol | this_DataSymbol_2= ruleDataSymbol )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case 20:
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
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
                    // InternalSolverLanguage.g:482:3: this_ModelSymbol_0= ruleModelSymbol
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
                    // InternalSolverLanguage.g:491:3: this_PartialitySymbol_1= rulePartialitySymbol
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
                    // InternalSolverLanguage.g:500:3: this_DataSymbol_2= ruleDataSymbol
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
    // InternalSolverLanguage.g:512:1: entryRuleModelSymbol returns [EObject current=null] : iv_ruleModelSymbol= ruleModelSymbol EOF ;
    public final EObject entryRuleModelSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelSymbol = null;


        try {
            // InternalSolverLanguage.g:512:52: (iv_ruleModelSymbol= ruleModelSymbol EOF )
            // InternalSolverLanguage.g:513:2: iv_ruleModelSymbol= ruleModelSymbol EOF
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
    // InternalSolverLanguage.g:519:1: ruleModelSymbol returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleModelSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:525:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSolverLanguage.g:526:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSolverLanguage.g:526:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSolverLanguage.g:527:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSolverLanguage.g:527:3: (lv_name_0_0= RULE_ID )
            // InternalSolverLanguage.g:528:4: lv_name_0_0= RULE_ID
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
    // InternalSolverLanguage.g:547:1: entryRulePartialitySymbol returns [EObject current=null] : iv_rulePartialitySymbol= rulePartialitySymbol EOF ;
    public final EObject entryRulePartialitySymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartialitySymbol = null;


        try {
            // InternalSolverLanguage.g:547:57: (iv_rulePartialitySymbol= rulePartialitySymbol EOF )
            // InternalSolverLanguage.g:548:2: iv_rulePartialitySymbol= rulePartialitySymbol EOF
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
    // InternalSolverLanguage.g:554:1: rulePartialitySymbol returns [EObject current=null] : (this_ExistSymbol_0= ruleExistSymbol | this_EqualsSymbol_1= ruleEqualsSymbol ) ;
    public final EObject rulePartialitySymbol() throws RecognitionException {
        EObject current = null;

        EObject this_ExistSymbol_0 = null;

        EObject this_EqualsSymbol_1 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:560:2: ( (this_ExistSymbol_0= ruleExistSymbol | this_EqualsSymbol_1= ruleEqualsSymbol ) )
            // InternalSolverLanguage.g:561:2: (this_ExistSymbol_0= ruleExistSymbol | this_EqualsSymbol_1= ruleEqualsSymbol )
            {
            // InternalSolverLanguage.g:561:2: (this_ExistSymbol_0= ruleExistSymbol | this_EqualsSymbol_1= ruleEqualsSymbol )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSolverLanguage.g:562:3: this_ExistSymbol_0= ruleExistSymbol
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
                    // InternalSolverLanguage.g:571:3: this_EqualsSymbol_1= ruleEqualsSymbol
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
    // InternalSolverLanguage.g:583:1: entryRuleExistSymbol returns [EObject current=null] : iv_ruleExistSymbol= ruleExistSymbol EOF ;
    public final EObject entryRuleExistSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistSymbol = null;


        try {
            // InternalSolverLanguage.g:583:52: (iv_ruleExistSymbol= ruleExistSymbol EOF )
            // InternalSolverLanguage.g:584:2: iv_ruleExistSymbol= ruleExistSymbol EOF
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
    // InternalSolverLanguage.g:590:1: ruleExistSymbol returns [EObject current=null] : (otherlv_0= 'exists' () ) ;
    public final EObject ruleExistSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:596:2: ( (otherlv_0= 'exists' () ) )
            // InternalSolverLanguage.g:597:2: (otherlv_0= 'exists' () )
            {
            // InternalSolverLanguage.g:597:2: (otherlv_0= 'exists' () )
            // InternalSolverLanguage.g:598:3: otherlv_0= 'exists' ()
            {
            otherlv_0=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getExistSymbolAccess().getExistsKeyword_0());
            		
            // InternalSolverLanguage.g:602:3: ()
            // InternalSolverLanguage.g:603:4: 
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
    // InternalSolverLanguage.g:613:1: entryRuleEqualsSymbol returns [EObject current=null] : iv_ruleEqualsSymbol= ruleEqualsSymbol EOF ;
    public final EObject entryRuleEqualsSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsSymbol = null;


        try {
            // InternalSolverLanguage.g:613:53: (iv_ruleEqualsSymbol= ruleEqualsSymbol EOF )
            // InternalSolverLanguage.g:614:2: iv_ruleEqualsSymbol= ruleEqualsSymbol EOF
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
    // InternalSolverLanguage.g:620:1: ruleEqualsSymbol returns [EObject current=null] : (otherlv_0= 'equals' () ) ;
    public final EObject ruleEqualsSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:626:2: ( (otherlv_0= 'equals' () ) )
            // InternalSolverLanguage.g:627:2: (otherlv_0= 'equals' () )
            {
            // InternalSolverLanguage.g:627:2: (otherlv_0= 'equals' () )
            // InternalSolverLanguage.g:628:3: otherlv_0= 'equals' ()
            {
            otherlv_0=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualsSymbolAccess().getEqualsKeyword_0());
            		
            // InternalSolverLanguage.g:632:3: ()
            // InternalSolverLanguage.g:633:4: 
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
    // InternalSolverLanguage.g:643:1: entryRuleDataSymbol returns [EObject current=null] : iv_ruleDataSymbol= ruleDataSymbol EOF ;
    public final EObject entryRuleDataSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSymbol = null;


        try {
            // InternalSolverLanguage.g:643:51: (iv_ruleDataSymbol= ruleDataSymbol EOF )
            // InternalSolverLanguage.g:644:2: iv_ruleDataSymbol= ruleDataSymbol EOF
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
    // InternalSolverLanguage.g:650:1: ruleDataSymbol returns [EObject current=null] : (this_BooleanSymbol_0= ruleBooleanSymbol | this_IntegerSymbol_1= ruleIntegerSymbol | this_RealSymbol_2= ruleRealSymbol | this_StringSymbol_3= ruleStringSymbol ) ;
    public final EObject ruleDataSymbol() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanSymbol_0 = null;

        EObject this_IntegerSymbol_1 = null;

        EObject this_RealSymbol_2 = null;

        EObject this_StringSymbol_3 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:656:2: ( (this_BooleanSymbol_0= ruleBooleanSymbol | this_IntegerSymbol_1= ruleIntegerSymbol | this_RealSymbol_2= ruleRealSymbol | this_StringSymbol_3= ruleStringSymbol ) )
            // InternalSolverLanguage.g:657:2: (this_BooleanSymbol_0= ruleBooleanSymbol | this_IntegerSymbol_1= ruleIntegerSymbol | this_RealSymbol_2= ruleRealSymbol | this_StringSymbol_3= ruleStringSymbol )
            {
            // InternalSolverLanguage.g:657:2: (this_BooleanSymbol_0= ruleBooleanSymbol | this_IntegerSymbol_1= ruleIntegerSymbol | this_RealSymbol_2= ruleRealSymbol | this_StringSymbol_3= ruleStringSymbol )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            case 25:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSolverLanguage.g:658:3: this_BooleanSymbol_0= ruleBooleanSymbol
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
                    // InternalSolverLanguage.g:667:3: this_IntegerSymbol_1= ruleIntegerSymbol
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
                    // InternalSolverLanguage.g:676:3: this_RealSymbol_2= ruleRealSymbol
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
                    // InternalSolverLanguage.g:685:3: this_StringSymbol_3= ruleStringSymbol
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
    // InternalSolverLanguage.g:697:1: entryRuleBooleanSymbol returns [EObject current=null] : iv_ruleBooleanSymbol= ruleBooleanSymbol EOF ;
    public final EObject entryRuleBooleanSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanSymbol = null;


        try {
            // InternalSolverLanguage.g:697:54: (iv_ruleBooleanSymbol= ruleBooleanSymbol EOF )
            // InternalSolverLanguage.g:698:2: iv_ruleBooleanSymbol= ruleBooleanSymbol EOF
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
    // InternalSolverLanguage.g:704:1: ruleBooleanSymbol returns [EObject current=null] : (otherlv_0= 'bool' () ) ;
    public final EObject ruleBooleanSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:710:2: ( (otherlv_0= 'bool' () ) )
            // InternalSolverLanguage.g:711:2: (otherlv_0= 'bool' () )
            {
            // InternalSolverLanguage.g:711:2: (otherlv_0= 'bool' () )
            // InternalSolverLanguage.g:712:3: otherlv_0= 'bool' ()
            {
            otherlv_0=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanSymbolAccess().getBoolKeyword_0());
            		
            // InternalSolverLanguage.g:716:3: ()
            // InternalSolverLanguage.g:717:4: 
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
    // InternalSolverLanguage.g:727:1: entryRuleIntegerSymbol returns [EObject current=null] : iv_ruleIntegerSymbol= ruleIntegerSymbol EOF ;
    public final EObject entryRuleIntegerSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerSymbol = null;


        try {
            // InternalSolverLanguage.g:727:54: (iv_ruleIntegerSymbol= ruleIntegerSymbol EOF )
            // InternalSolverLanguage.g:728:2: iv_ruleIntegerSymbol= ruleIntegerSymbol EOF
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
    // InternalSolverLanguage.g:734:1: ruleIntegerSymbol returns [EObject current=null] : (otherlv_0= 'int' () ) ;
    public final EObject ruleIntegerSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:740:2: ( (otherlv_0= 'int' () ) )
            // InternalSolverLanguage.g:741:2: (otherlv_0= 'int' () )
            {
            // InternalSolverLanguage.g:741:2: (otherlv_0= 'int' () )
            // InternalSolverLanguage.g:742:3: otherlv_0= 'int' ()
            {
            otherlv_0=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegerSymbolAccess().getIntKeyword_0());
            		
            // InternalSolverLanguage.g:746:3: ()
            // InternalSolverLanguage.g:747:4: 
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
    // InternalSolverLanguage.g:757:1: entryRuleRealSymbol returns [EObject current=null] : iv_ruleRealSymbol= ruleRealSymbol EOF ;
    public final EObject entryRuleRealSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealSymbol = null;


        try {
            // InternalSolverLanguage.g:757:51: (iv_ruleRealSymbol= ruleRealSymbol EOF )
            // InternalSolverLanguage.g:758:2: iv_ruleRealSymbol= ruleRealSymbol EOF
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
    // InternalSolverLanguage.g:764:1: ruleRealSymbol returns [EObject current=null] : (otherlv_0= 'real' () ) ;
    public final EObject ruleRealSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:770:2: ( (otherlv_0= 'real' () ) )
            // InternalSolverLanguage.g:771:2: (otherlv_0= 'real' () )
            {
            // InternalSolverLanguage.g:771:2: (otherlv_0= 'real' () )
            // InternalSolverLanguage.g:772:3: otherlv_0= 'real' ()
            {
            otherlv_0=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getRealSymbolAccess().getRealKeyword_0());
            		
            // InternalSolverLanguage.g:776:3: ()
            // InternalSolverLanguage.g:777:4: 
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
    // InternalSolverLanguage.g:787:1: entryRuleStringSymbol returns [EObject current=null] : iv_ruleStringSymbol= ruleStringSymbol EOF ;
    public final EObject entryRuleStringSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringSymbol = null;


        try {
            // InternalSolverLanguage.g:787:53: (iv_ruleStringSymbol= ruleStringSymbol EOF )
            // InternalSolverLanguage.g:788:2: iv_ruleStringSymbol= ruleStringSymbol EOF
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
    // InternalSolverLanguage.g:794:1: ruleStringSymbol returns [EObject current=null] : (otherlv_0= 'string' () ) ;
    public final EObject ruleStringSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:800:2: ( (otherlv_0= 'string' () ) )
            // InternalSolverLanguage.g:801:2: (otherlv_0= 'string' () )
            {
            // InternalSolverLanguage.g:801:2: (otherlv_0= 'string' () )
            // InternalSolverLanguage.g:802:3: otherlv_0= 'string' ()
            {
            otherlv_0=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getStringSymbolAccess().getStringKeyword_0());
            		
            // InternalSolverLanguage.g:806:3: ()
            // InternalSolverLanguage.g:807:4: 
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
    // InternalSolverLanguage.g:817:1: entryRuleComplexObject returns [EObject current=null] : iv_ruleComplexObject= ruleComplexObject EOF ;
    public final EObject entryRuleComplexObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexObject = null;


        try {
            // InternalSolverLanguage.g:817:54: (iv_ruleComplexObject= ruleComplexObject EOF )
            // InternalSolverLanguage.g:818:2: iv_ruleComplexObject= ruleComplexObject EOF
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
    // InternalSolverLanguage.g:824:1: ruleComplexObject returns [EObject current=null] : (this_Object_0= ruleObject | this_AllInstances_1= ruleAllInstances | this_AllObjects_2= ruleAllObjects ) ;
    public final EObject ruleComplexObject() throws RecognitionException {
        EObject current = null;

        EObject this_Object_0 = null;

        EObject this_AllInstances_1 = null;

        EObject this_AllObjects_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:830:2: ( (this_Object_0= ruleObject | this_AllInstances_1= ruleAllInstances | this_AllObjects_2= ruleAllObjects ) )
            // InternalSolverLanguage.g:831:2: (this_Object_0= ruleObject | this_AllInstances_1= ruleAllInstances | this_AllObjects_2= ruleAllObjects )
            {
            // InternalSolverLanguage.g:831:2: (this_Object_0= ruleObject | this_AllInstances_1= ruleAllInstances | this_AllObjects_2= ruleAllObjects )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_ID:
            case RULE_STRING:
            case 11:
            case 13:
            case 14:
            case 26:
                {
                alt12=1;
                }
                break;
            case 19:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSolverLanguage.g:832:3: this_Object_0= ruleObject
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
                    // InternalSolverLanguage.g:841:3: this_AllInstances_1= ruleAllInstances
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
                    // InternalSolverLanguage.g:850:3: this_AllObjects_2= ruleAllObjects
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
    // InternalSolverLanguage.g:862:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalSolverLanguage.g:862:47: (iv_ruleObject= ruleObject EOF )
            // InternalSolverLanguage.g:863:2: iv_ruleObject= ruleObject EOF
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
    // InternalSolverLanguage.g:869:1: ruleObject returns [EObject current=null] : (this_NamedObject_0= ruleNamedObject | this_UnnamedObject_1= ruleUnnamedObject | this_DataObject_2= ruleDataObject ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        EObject this_NamedObject_0 = null;

        EObject this_UnnamedObject_1 = null;

        EObject this_DataObject_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:875:2: ( (this_NamedObject_0= ruleNamedObject | this_UnnamedObject_1= ruleUnnamedObject | this_DataObject_2= ruleDataObject ) )
            // InternalSolverLanguage.g:876:2: (this_NamedObject_0= ruleNamedObject | this_UnnamedObject_1= ruleUnnamedObject | this_DataObject_2= ruleDataObject )
            {
            // InternalSolverLanguage.g:876:2: (this_NamedObject_0= ruleNamedObject | this_UnnamedObject_1= ruleUnnamedObject | this_DataObject_2= ruleDataObject )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 11:
            case 13:
            case 14:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSolverLanguage.g:877:3: this_NamedObject_0= ruleNamedObject
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
                    // InternalSolverLanguage.g:886:3: this_UnnamedObject_1= ruleUnnamedObject
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
                    // InternalSolverLanguage.g:895:3: this_DataObject_2= ruleDataObject
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
    // InternalSolverLanguage.g:907:1: entryRuleNamedObject returns [EObject current=null] : iv_ruleNamedObject= ruleNamedObject EOF ;
    public final EObject entryRuleNamedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedObject = null;


        try {
            // InternalSolverLanguage.g:907:52: (iv_ruleNamedObject= ruleNamedObject EOF )
            // InternalSolverLanguage.g:908:2: iv_ruleNamedObject= ruleNamedObject EOF
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
    // InternalSolverLanguage.g:914:1: ruleNamedObject returns [EObject current=null] : (otherlv_0= '\\'' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\'' ) ;
    public final EObject ruleNamedObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:920:2: ( (otherlv_0= '\\'' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\'' ) )
            // InternalSolverLanguage.g:921:2: (otherlv_0= '\\'' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\'' )
            {
            // InternalSolverLanguage.g:921:2: (otherlv_0= '\\'' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\'' )
            // InternalSolverLanguage.g:922:3: otherlv_0= '\\'' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '\\''
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getNamedObjectAccess().getApostropheKeyword_0());
            		
            // InternalSolverLanguage.g:926:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolverLanguage.g:927:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolverLanguage.g:927:4: (lv_name_1_0= RULE_ID )
            // InternalSolverLanguage.g:928:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_2); 

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
    // InternalSolverLanguage.g:952:1: entryRuleUnnamedObject returns [EObject current=null] : iv_ruleUnnamedObject= ruleUnnamedObject EOF ;
    public final EObject entryRuleUnnamedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedObject = null;


        try {
            // InternalSolverLanguage.g:952:54: (iv_ruleUnnamedObject= ruleUnnamedObject EOF )
            // InternalSolverLanguage.g:953:2: iv_ruleUnnamedObject= ruleUnnamedObject EOF
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
    // InternalSolverLanguage.g:959:1: ruleUnnamedObject returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUnnamedObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:965:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSolverLanguage.g:966:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSolverLanguage.g:966:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSolverLanguage.g:967:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSolverLanguage.g:967:3: (lv_name_0_0= RULE_ID )
            // InternalSolverLanguage.g:968:4: lv_name_0_0= RULE_ID
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
    // InternalSolverLanguage.g:987:1: entryRuleDataObject returns [EObject current=null] : iv_ruleDataObject= ruleDataObject EOF ;
    public final EObject entryRuleDataObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataObject = null;


        try {
            // InternalSolverLanguage.g:987:51: (iv_ruleDataObject= ruleDataObject EOF )
            // InternalSolverLanguage.g:988:2: iv_ruleDataObject= ruleDataObject EOF
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
    // InternalSolverLanguage.g:994:1: ruleDataObject returns [EObject current=null] : (this_BooleanObject_0= ruleBooleanObject | this_IntObject_1= ruleIntObject | this_RealObject_2= ruleRealObject | this_StringObject_3= ruleStringObject ) ;
    public final EObject ruleDataObject() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanObject_0 = null;

        EObject this_IntObject_1 = null;

        EObject this_RealObject_2 = null;

        EObject this_StringObject_3 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1000:2: ( (this_BooleanObject_0= ruleBooleanObject | this_IntObject_1= ruleIntObject | this_RealObject_2= ruleRealObject | this_StringObject_3= ruleStringObject ) )
            // InternalSolverLanguage.g:1001:2: (this_BooleanObject_0= ruleBooleanObject | this_IntObject_1= ruleIntObject | this_RealObject_2= ruleRealObject | this_StringObject_3= ruleStringObject )
            {
            // InternalSolverLanguage.g:1001:2: (this_BooleanObject_0= ruleBooleanObject | this_IntObject_1= ruleIntObject | this_RealObject_2= ruleRealObject | this_StringObject_3= ruleStringObject )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
                {
                alt14=1;
                }
                break;
            case 11:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==RULE_INT) ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==12) ) {
                        alt14=3;
                    }
                    else if ( (LA14_3==EOF||(LA14_3>=RULE_INT && LA14_3<=RULE_STRING)||LA14_3==11||(LA14_3>=13 && LA14_3<=14)||(LA14_3>=18 && LA14_3<=19)||LA14_3==26||LA14_3==30) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA14_3 = input.LA(2);

                if ( (LA14_3==12) ) {
                    alt14=3;
                }
                else if ( (LA14_3==EOF||(LA14_3>=RULE_INT && LA14_3<=RULE_STRING)||LA14_3==11||(LA14_3>=13 && LA14_3<=14)||(LA14_3>=18 && LA14_3<=19)||LA14_3==26||LA14_3==30) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSolverLanguage.g:1002:3: this_BooleanObject_0= ruleBooleanObject
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
                    // InternalSolverLanguage.g:1011:3: this_IntObject_1= ruleIntObject
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
                    // InternalSolverLanguage.g:1020:3: this_RealObject_2= ruleRealObject
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
                    // InternalSolverLanguage.g:1029:3: this_StringObject_3= ruleStringObject
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
    // InternalSolverLanguage.g:1041:1: entryRuleBooleanObject returns [EObject current=null] : iv_ruleBooleanObject= ruleBooleanObject EOF ;
    public final EObject entryRuleBooleanObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanObject = null;


        try {
            // InternalSolverLanguage.g:1041:54: (iv_ruleBooleanObject= ruleBooleanObject EOF )
            // InternalSolverLanguage.g:1042:2: iv_ruleBooleanObject= ruleBooleanObject EOF
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
    // InternalSolverLanguage.g:1048:1: ruleBooleanObject returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleBooleanObject() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1054:2: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // InternalSolverLanguage.g:1055:2: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // InternalSolverLanguage.g:1055:2: ( (lv_value_0_0= ruleBooleanValue ) )
            // InternalSolverLanguage.g:1056:3: (lv_value_0_0= ruleBooleanValue )
            {
            // InternalSolverLanguage.g:1056:3: (lv_value_0_0= ruleBooleanValue )
            // InternalSolverLanguage.g:1057:4: lv_value_0_0= ruleBooleanValue
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
    // InternalSolverLanguage.g:1077:1: entryRuleIntObject returns [EObject current=null] : iv_ruleIntObject= ruleIntObject EOF ;
    public final EObject entryRuleIntObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntObject = null;


        try {
            // InternalSolverLanguage.g:1077:50: (iv_ruleIntObject= ruleIntObject EOF )
            // InternalSolverLanguage.g:1078:2: iv_ruleIntObject= ruleIntObject EOF
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
    // InternalSolverLanguage.g:1084:1: ruleIntObject returns [EObject current=null] : ( (lv_value_0_0= ruleINTLiteral ) ) ;
    public final EObject ruleIntObject() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1090:2: ( ( (lv_value_0_0= ruleINTLiteral ) ) )
            // InternalSolverLanguage.g:1091:2: ( (lv_value_0_0= ruleINTLiteral ) )
            {
            // InternalSolverLanguage.g:1091:2: ( (lv_value_0_0= ruleINTLiteral ) )
            // InternalSolverLanguage.g:1092:3: (lv_value_0_0= ruleINTLiteral )
            {
            // InternalSolverLanguage.g:1092:3: (lv_value_0_0= ruleINTLiteral )
            // InternalSolverLanguage.g:1093:4: lv_value_0_0= ruleINTLiteral
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
    // InternalSolverLanguage.g:1113:1: entryRuleRealObject returns [EObject current=null] : iv_ruleRealObject= ruleRealObject EOF ;
    public final EObject entryRuleRealObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealObject = null;


        try {
            // InternalSolverLanguage.g:1113:51: (iv_ruleRealObject= ruleRealObject EOF )
            // InternalSolverLanguage.g:1114:2: iv_ruleRealObject= ruleRealObject EOF
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
    // InternalSolverLanguage.g:1120:1: ruleRealObject returns [EObject current=null] : ( (lv_value_0_0= ruleREALLiteral ) ) ;
    public final EObject ruleRealObject() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1126:2: ( ( (lv_value_0_0= ruleREALLiteral ) ) )
            // InternalSolverLanguage.g:1127:2: ( (lv_value_0_0= ruleREALLiteral ) )
            {
            // InternalSolverLanguage.g:1127:2: ( (lv_value_0_0= ruleREALLiteral ) )
            // InternalSolverLanguage.g:1128:3: (lv_value_0_0= ruleREALLiteral )
            {
            // InternalSolverLanguage.g:1128:3: (lv_value_0_0= ruleREALLiteral )
            // InternalSolverLanguage.g:1129:4: lv_value_0_0= ruleREALLiteral
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
    // InternalSolverLanguage.g:1149:1: entryRuleStringObject returns [EObject current=null] : iv_ruleStringObject= ruleStringObject EOF ;
    public final EObject entryRuleStringObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringObject = null;


        try {
            // InternalSolverLanguage.g:1149:53: (iv_ruleStringObject= ruleStringObject EOF )
            // InternalSolverLanguage.g:1150:2: iv_ruleStringObject= ruleStringObject EOF
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
    // InternalSolverLanguage.g:1156:1: ruleStringObject returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:1162:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalSolverLanguage.g:1163:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalSolverLanguage.g:1163:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalSolverLanguage.g:1164:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalSolverLanguage.g:1164:3: (lv_value_0_0= RULE_STRING )
            // InternalSolverLanguage.g:1165:4: lv_value_0_0= RULE_STRING
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
    // InternalSolverLanguage.g:1184:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalSolverLanguage.g:1184:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalSolverLanguage.g:1185:2: iv_rulePredicate= rulePredicate EOF
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
    // InternalSolverLanguage.g:1191:1: rulePredicate returns [EObject current=null] : (this_PredicateSymbol_0= rulePredicateSymbol | this_ErrorPredicate_1= ruleErrorPredicate ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_PredicateSymbol_0 = null;

        EObject this_ErrorPredicate_1 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1197:2: ( (this_PredicateSymbol_0= rulePredicateSymbol | this_ErrorPredicate_1= ruleErrorPredicate ) )
            // InternalSolverLanguage.g:1198:2: (this_PredicateSymbol_0= rulePredicateSymbol | this_ErrorPredicate_1= ruleErrorPredicate )
            {
            // InternalSolverLanguage.g:1198:2: (this_PredicateSymbol_0= rulePredicateSymbol | this_ErrorPredicate_1= ruleErrorPredicate )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==16) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSolverLanguage.g:1199:3: this_PredicateSymbol_0= rulePredicateSymbol
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getPredicateSymbolParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PredicateSymbol_0=rulePredicateSymbol();

                    state._fsp--;


                    			current = this_PredicateSymbol_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1208:3: this_ErrorPredicate_1= ruleErrorPredicate
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getErrorPredicateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ErrorPredicate_1=ruleErrorPredicate();

                    state._fsp--;


                    			current = this_ErrorPredicate_1;
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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRulePredicateSymbol"
    // InternalSolverLanguage.g:1220:1: entryRulePredicateSymbol returns [EObject current=null] : iv_rulePredicateSymbol= rulePredicateSymbol EOF ;
    public final EObject entryRulePredicateSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateSymbol = null;


        try {
            // InternalSolverLanguage.g:1220:56: (iv_rulePredicateSymbol= rulePredicateSymbol EOF )
            // InternalSolverLanguage.g:1221:2: iv_rulePredicateSymbol= rulePredicateSymbol EOF
            {
             newCompositeNode(grammarAccess.getPredicateSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicateSymbol=rulePredicateSymbol();

            state._fsp--;

             current =iv_rulePredicateSymbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicateSymbol"


    // $ANTLR start "rulePredicateSymbol"
    // InternalSolverLanguage.g:1227:1: rulePredicateSymbol returns [EObject current=null] : (otherlv_0= 'predicate' ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'false' | ( ( (lv_bodies_7_0= rulePatternBody ) ) (otherlv_8= '|' ( (lv_bodies_9_0= rulePatternBody ) ) )* ) ) otherlv_10= '.' ) ;
    public final EObject rulePredicateSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_symbol_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_bodies_7_0 = null;

        EObject lv_bodies_9_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1233:2: ( (otherlv_0= 'predicate' ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'false' | ( ( (lv_bodies_7_0= rulePatternBody ) ) (otherlv_8= '|' ( (lv_bodies_9_0= rulePatternBody ) ) )* ) ) otherlv_10= '.' ) )
            // InternalSolverLanguage.g:1234:2: (otherlv_0= 'predicate' ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'false' | ( ( (lv_bodies_7_0= rulePatternBody ) ) (otherlv_8= '|' ( (lv_bodies_9_0= rulePatternBody ) ) )* ) ) otherlv_10= '.' )
            {
            // InternalSolverLanguage.g:1234:2: (otherlv_0= 'predicate' ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'false' | ( ( (lv_bodies_7_0= rulePatternBody ) ) (otherlv_8= '|' ( (lv_bodies_9_0= rulePatternBody ) ) )* ) ) otherlv_10= '.' )
            // InternalSolverLanguage.g:1235:3: otherlv_0= 'predicate' ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) )* otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'false' | ( ( (lv_bodies_7_0= rulePatternBody ) ) (otherlv_8= '|' ( (lv_bodies_9_0= rulePatternBody ) ) )* ) ) otherlv_10= '.'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPredicateSymbolAccess().getPredicateKeyword_0());
            		
            // InternalSolverLanguage.g:1239:3: ( (lv_symbol_1_0= ruleModelSymbol ) )
            // InternalSolverLanguage.g:1240:4: (lv_symbol_1_0= ruleModelSymbol )
            {
            // InternalSolverLanguage.g:1240:4: (lv_symbol_1_0= ruleModelSymbol )
            // InternalSolverLanguage.g:1241:5: lv_symbol_1_0= ruleModelSymbol
            {

            					newCompositeNode(grammarAccess.getPredicateSymbolAccess().getSymbolModelSymbolParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_symbol_1_0=ruleModelSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateSymbolRule());
            					}
            					set(
            						current,
            						"symbol",
            						lv_symbol_1_0,
            						"org.eclipse.viatra.solver.language.SolverLanguage.ModelSymbol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPredicateSymbolAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSolverLanguage.g:1262:3: ( (lv_parameters_3_0= ruleParameter ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSolverLanguage.g:1263:4: (lv_parameters_3_0= ruleParameter )
            	    {
            	    // InternalSolverLanguage.g:1263:4: (lv_parameters_3_0= ruleParameter )
            	    // InternalSolverLanguage.g:1264:5: lv_parameters_3_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getPredicateSymbolAccess().getParametersParameterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_parameters_3_0=ruleParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPredicateSymbolRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_3_0,
            	    						"org.eclipse.viatra.solver.language.SolverLanguage.Parameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getPredicateSymbolAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getPredicateSymbolAccess().getColonKeyword_5());
            		
            // InternalSolverLanguage.g:1289:3: (otherlv_6= 'false' | ( ( (lv_bodies_7_0= rulePatternBody ) ) (otherlv_8= '|' ( (lv_bodies_9_0= rulePatternBody ) ) )* ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            else if ( (LA18_0==EOF||LA18_0==RULE_ID||(LA18_0>=11 && LA18_0<=13)||(LA18_0>=28 && LA18_0<=29)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSolverLanguage.g:1290:4: otherlv_6= 'false'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getPredicateSymbolAccess().getFalseKeyword_6_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1295:4: ( ( (lv_bodies_7_0= rulePatternBody ) ) (otherlv_8= '|' ( (lv_bodies_9_0= rulePatternBody ) ) )* )
                    {
                    // InternalSolverLanguage.g:1295:4: ( ( (lv_bodies_7_0= rulePatternBody ) ) (otherlv_8= '|' ( (lv_bodies_9_0= rulePatternBody ) ) )* )
                    // InternalSolverLanguage.g:1296:5: ( (lv_bodies_7_0= rulePatternBody ) ) (otherlv_8= '|' ( (lv_bodies_9_0= rulePatternBody ) ) )*
                    {
                    // InternalSolverLanguage.g:1296:5: ( (lv_bodies_7_0= rulePatternBody ) )
                    // InternalSolverLanguage.g:1297:6: (lv_bodies_7_0= rulePatternBody )
                    {
                    // InternalSolverLanguage.g:1297:6: (lv_bodies_7_0= rulePatternBody )
                    // InternalSolverLanguage.g:1298:7: lv_bodies_7_0= rulePatternBody
                    {

                    							newCompositeNode(grammarAccess.getPredicateSymbolAccess().getBodiesPatternBodyParserRuleCall_6_1_0_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_bodies_7_0=rulePatternBody();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPredicateSymbolRule());
                    							}
                    							add(
                    								current,
                    								"bodies",
                    								lv_bodies_7_0,
                    								"org.eclipse.viatra.solver.language.SolverLanguage.PatternBody");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSolverLanguage.g:1315:5: (otherlv_8= '|' ( (lv_bodies_9_0= rulePatternBody ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==28) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:1316:6: otherlv_8= '|' ( (lv_bodies_9_0= rulePatternBody ) )
                    	    {
                    	    otherlv_8=(Token)match(input,28,FOLLOW_15); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getPredicateSymbolAccess().getVerticalLineKeyword_6_1_1_0());
                    	    					
                    	    // InternalSolverLanguage.g:1320:6: ( (lv_bodies_9_0= rulePatternBody ) )
                    	    // InternalSolverLanguage.g:1321:7: (lv_bodies_9_0= rulePatternBody )
                    	    {
                    	    // InternalSolverLanguage.g:1321:7: (lv_bodies_9_0= rulePatternBody )
                    	    // InternalSolverLanguage.g:1322:8: lv_bodies_9_0= rulePatternBody
                    	    {

                    	    								newCompositeNode(grammarAccess.getPredicateSymbolAccess().getBodiesPatternBodyParserRuleCall_6_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_14);
                    	    lv_bodies_9_0=rulePatternBody();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getPredicateSymbolRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"bodies",
                    	    									lv_bodies_9_0,
                    	    									"org.eclipse.viatra.solver.language.SolverLanguage.PatternBody");
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
                    break;

            }

            otherlv_10=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPredicateSymbolAccess().getFullStopKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicateSymbol"


    // $ANTLR start "entryRuleErrorPredicate"
    // InternalSolverLanguage.g:1350:1: entryRuleErrorPredicate returns [EObject current=null] : iv_ruleErrorPredicate= ruleErrorPredicate EOF ;
    public final EObject entryRuleErrorPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorPredicate = null;


        try {
            // InternalSolverLanguage.g:1350:55: (iv_ruleErrorPredicate= ruleErrorPredicate EOF )
            // InternalSolverLanguage.g:1351:2: iv_ruleErrorPredicate= ruleErrorPredicate EOF
            {
             newCompositeNode(grammarAccess.getErrorPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorPredicate=ruleErrorPredicate();

            state._fsp--;

             current =iv_ruleErrorPredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleErrorPredicate"


    // $ANTLR start "ruleErrorPredicate"
    // InternalSolverLanguage.g:1357:1: ruleErrorPredicate returns [EObject current=null] : ( () otherlv_1= 'error' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ')' ) otherlv_6= ':' (otherlv_7= 'false' | ( ( (lv_bodies_8_0= rulePatternBody ) ) (otherlv_9= '|' ( (lv_bodies_10_0= rulePatternBody ) ) )* ) ) otherlv_11= '.' ) ;
    public final EObject ruleErrorPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_bodies_8_0 = null;

        EObject lv_bodies_10_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1363:2: ( ( () otherlv_1= 'error' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ')' ) otherlv_6= ':' (otherlv_7= 'false' | ( ( (lv_bodies_8_0= rulePatternBody ) ) (otherlv_9= '|' ( (lv_bodies_10_0= rulePatternBody ) ) )* ) ) otherlv_11= '.' ) )
            // InternalSolverLanguage.g:1364:2: ( () otherlv_1= 'error' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ')' ) otherlv_6= ':' (otherlv_7= 'false' | ( ( (lv_bodies_8_0= rulePatternBody ) ) (otherlv_9= '|' ( (lv_bodies_10_0= rulePatternBody ) ) )* ) ) otherlv_11= '.' )
            {
            // InternalSolverLanguage.g:1364:2: ( () otherlv_1= 'error' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ')' ) otherlv_6= ':' (otherlv_7= 'false' | ( ( (lv_bodies_8_0= rulePatternBody ) ) (otherlv_9= '|' ( (lv_bodies_10_0= rulePatternBody ) ) )* ) ) otherlv_11= '.' )
            // InternalSolverLanguage.g:1365:3: () otherlv_1= 'error' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ')' ) otherlv_6= ':' (otherlv_7= 'false' | ( ( (lv_bodies_8_0= rulePatternBody ) ) (otherlv_9= '|' ( (lv_bodies_10_0= rulePatternBody ) ) )* ) ) otherlv_11= '.'
            {
            // InternalSolverLanguage.g:1365:3: ()
            // InternalSolverLanguage.g:1366:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getErrorPredicateAccess().getErrorPredicateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorPredicateAccess().getErrorKeyword_1());
            		
            // InternalSolverLanguage.g:1376:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSolverLanguage.g:1377:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalSolverLanguage.g:1377:4: (lv_name_2_0= RULE_ID )
                    // InternalSolverLanguage.g:1378:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getErrorPredicateAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getErrorPredicateRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalSolverLanguage.g:1394:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ')' )
            // InternalSolverLanguage.g:1395:4: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) )* otherlv_5= ')'
            {
            otherlv_3=(Token)match(input,17,FOLLOW_12); 

            				newLeafNode(otherlv_3, grammarAccess.getErrorPredicateAccess().getLeftParenthesisKeyword_3_0());
            			
            // InternalSolverLanguage.g:1399:4: ( (lv_parameters_4_0= ruleParameter ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSolverLanguage.g:1400:5: (lv_parameters_4_0= ruleParameter )
            	    {
            	    // InternalSolverLanguage.g:1400:5: (lv_parameters_4_0= ruleParameter )
            	    // InternalSolverLanguage.g:1401:6: lv_parameters_4_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getErrorPredicateAccess().getParametersParameterParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_parameters_4_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getErrorPredicateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_4_0,
            	    							"org.eclipse.viatra.solver.language.SolverLanguage.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_8); 

            				newLeafNode(otherlv_5, grammarAccess.getErrorPredicateAccess().getRightParenthesisKeyword_3_2());
            			

            }

            otherlv_6=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getErrorPredicateAccess().getColonKeyword_4());
            		
            // InternalSolverLanguage.g:1427:3: (otherlv_7= 'false' | ( ( (lv_bodies_8_0= rulePatternBody ) ) (otherlv_9= '|' ( (lv_bodies_10_0= rulePatternBody ) ) )* ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            else if ( (LA22_0==EOF||LA22_0==RULE_ID||(LA22_0>=11 && LA22_0<=13)||(LA22_0>=28 && LA22_0<=29)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSolverLanguage.g:1428:4: otherlv_7= 'false'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getErrorPredicateAccess().getFalseKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1433:4: ( ( (lv_bodies_8_0= rulePatternBody ) ) (otherlv_9= '|' ( (lv_bodies_10_0= rulePatternBody ) ) )* )
                    {
                    // InternalSolverLanguage.g:1433:4: ( ( (lv_bodies_8_0= rulePatternBody ) ) (otherlv_9= '|' ( (lv_bodies_10_0= rulePatternBody ) ) )* )
                    // InternalSolverLanguage.g:1434:5: ( (lv_bodies_8_0= rulePatternBody ) ) (otherlv_9= '|' ( (lv_bodies_10_0= rulePatternBody ) ) )*
                    {
                    // InternalSolverLanguage.g:1434:5: ( (lv_bodies_8_0= rulePatternBody ) )
                    // InternalSolverLanguage.g:1435:6: (lv_bodies_8_0= rulePatternBody )
                    {
                    // InternalSolverLanguage.g:1435:6: (lv_bodies_8_0= rulePatternBody )
                    // InternalSolverLanguage.g:1436:7: lv_bodies_8_0= rulePatternBody
                    {

                    							newCompositeNode(grammarAccess.getErrorPredicateAccess().getBodiesPatternBodyParserRuleCall_5_1_0_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_bodies_8_0=rulePatternBody();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getErrorPredicateRule());
                    							}
                    							add(
                    								current,
                    								"bodies",
                    								lv_bodies_8_0,
                    								"org.eclipse.viatra.solver.language.SolverLanguage.PatternBody");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSolverLanguage.g:1453:5: (otherlv_9= '|' ( (lv_bodies_10_0= rulePatternBody ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==28) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:1454:6: otherlv_9= '|' ( (lv_bodies_10_0= rulePatternBody ) )
                    	    {
                    	    otherlv_9=(Token)match(input,28,FOLLOW_15); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getErrorPredicateAccess().getVerticalLineKeyword_5_1_1_0());
                    	    					
                    	    // InternalSolverLanguage.g:1458:6: ( (lv_bodies_10_0= rulePatternBody ) )
                    	    // InternalSolverLanguage.g:1459:7: (lv_bodies_10_0= rulePatternBody )
                    	    {
                    	    // InternalSolverLanguage.g:1459:7: (lv_bodies_10_0= rulePatternBody )
                    	    // InternalSolverLanguage.g:1460:8: lv_bodies_10_0= rulePatternBody
                    	    {

                    	    								newCompositeNode(grammarAccess.getErrorPredicateAccess().getBodiesPatternBodyParserRuleCall_5_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_14);
                    	    lv_bodies_10_0=rulePatternBody();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getErrorPredicateRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"bodies",
                    	    									lv_bodies_10_0,
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

            otherlv_11=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getErrorPredicateAccess().getFullStopKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleErrorPredicate"


    // $ANTLR start "entryRuleParameter"
    // InternalSolverLanguage.g:1488:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSolverLanguage.g:1488:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSolverLanguage.g:1489:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalSolverLanguage.g:1495:1: ruleParameter returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleSymbol ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1501:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleSymbol ) ) )? ) )
            // InternalSolverLanguage.g:1502:2: ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleSymbol ) ) )? )
            {
            // InternalSolverLanguage.g:1502:2: ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleSymbol ) ) )? )
            // InternalSolverLanguage.g:1503:3: ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleSymbol ) ) )?
            {
            // InternalSolverLanguage.g:1503:3: ( (lv_variable_0_0= ruleVariable ) )
            // InternalSolverLanguage.g:1504:4: (lv_variable_0_0= ruleVariable )
            {
            // InternalSolverLanguage.g:1504:4: (lv_variable_0_0= ruleVariable )
            // InternalSolverLanguage.g:1505:5: lv_variable_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalSolverLanguage.g:1522:3: (otherlv_1= ':' ( (lv_type_2_0= ruleSymbol ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSolverLanguage.g:1523:4: otherlv_1= ':' ( (lv_type_2_0= ruleSymbol ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1_0());
                    			
                    // InternalSolverLanguage.g:1527:4: ( (lv_type_2_0= ruleSymbol ) )
                    // InternalSolverLanguage.g:1528:5: (lv_type_2_0= ruleSymbol )
                    {
                    // InternalSolverLanguage.g:1528:5: (lv_type_2_0= ruleSymbol )
                    // InternalSolverLanguage.g:1529:6: lv_type_2_0= ruleSymbol
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
    // InternalSolverLanguage.g:1551:1: entryRulePatternBody returns [EObject current=null] : iv_rulePatternBody= rulePatternBody EOF ;
    public final EObject entryRulePatternBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternBody = null;


        try {
            // InternalSolverLanguage.g:1551:52: (iv_rulePatternBody= rulePatternBody EOF )
            // InternalSolverLanguage.g:1552:2: iv_rulePatternBody= rulePatternBody EOF
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
    // InternalSolverLanguage.g:1558:1: rulePatternBody returns [EObject current=null] : ( () (otherlv_1= 'true' | ( (lv_constraints_2_0= ruleConstraint ) )* ) ) ;
    public final EObject rulePatternBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1564:2: ( ( () (otherlv_1= 'true' | ( (lv_constraints_2_0= ruleConstraint ) )* ) ) )
            // InternalSolverLanguage.g:1565:2: ( () (otherlv_1= 'true' | ( (lv_constraints_2_0= ruleConstraint ) )* ) )
            {
            // InternalSolverLanguage.g:1565:2: ( () (otherlv_1= 'true' | ( (lv_constraints_2_0= ruleConstraint ) )* ) )
            // InternalSolverLanguage.g:1566:3: () (otherlv_1= 'true' | ( (lv_constraints_2_0= ruleConstraint ) )* )
            {
            // InternalSolverLanguage.g:1566:3: ()
            // InternalSolverLanguage.g:1567:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternBodyAccess().getPatternBodyAction_0(),
            					current);
            			

            }

            // InternalSolverLanguage.g:1573:3: (otherlv_1= 'true' | ( (lv_constraints_2_0= ruleConstraint ) )* )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            else if ( (LA25_0==EOF||LA25_0==RULE_ID||(LA25_0>=11 && LA25_0<=12)||(LA25_0>=28 && LA25_0<=29)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSolverLanguage.g:1574:4: otherlv_1= 'true'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPatternBodyAccess().getTrueKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1579:4: ( (lv_constraints_2_0= ruleConstraint ) )*
                    {
                    // InternalSolverLanguage.g:1579:4: ( (lv_constraints_2_0= ruleConstraint ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID||LA24_0==11||LA24_0==29) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:1580:5: (lv_constraints_2_0= ruleConstraint )
                    	    {
                    	    // InternalSolverLanguage.g:1580:5: (lv_constraints_2_0= ruleConstraint )
                    	    // InternalSolverLanguage.g:1581:6: lv_constraints_2_0= ruleConstraint
                    	    {

                    	    						newCompositeNode(grammarAccess.getPatternBodyAccess().getConstraintsConstraintParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
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
    // InternalSolverLanguage.g:1603:1: entryRulePolarity returns [EObject current=null] : iv_rulePolarity= rulePolarity EOF ;
    public final EObject entryRulePolarity() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolarity = null;


        try {
            // InternalSolverLanguage.g:1603:49: (iv_rulePolarity= rulePolarity EOF )
            // InternalSolverLanguage.g:1604:2: iv_rulePolarity= rulePolarity EOF
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
    // InternalSolverLanguage.g:1610:1: rulePolarity returns [EObject current=null] : ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) ;
    public final EObject rulePolarity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:1616:2: ( ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) )
            // InternalSolverLanguage.g:1617:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            {
            // InternalSolverLanguage.g:1617:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
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
                    // InternalSolverLanguage.g:1618:3: ( () otherlv_1= '+' )
                    {
                    // InternalSolverLanguage.g:1618:3: ( () otherlv_1= '+' )
                    // InternalSolverLanguage.g:1619:4: () otherlv_1= '+'
                    {
                    // InternalSolverLanguage.g:1619:4: ()
                    // InternalSolverLanguage.g:1620:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPolarityAccess().getPositiveAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPolarityAccess().getPlusSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1632:3: ( () otherlv_3= '-' )
                    {
                    // InternalSolverLanguage.g:1632:3: ( () otherlv_3= '-' )
                    // InternalSolverLanguage.g:1633:4: () otherlv_3= '-'
                    {
                    // InternalSolverLanguage.g:1633:4: ()
                    // InternalSolverLanguage.g:1634:5: 
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
    // InternalSolverLanguage.g:1649:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalSolverLanguage.g:1649:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalSolverLanguage.g:1650:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalSolverLanguage.g:1656:1: ruleConstraint returns [EObject current=null] : ( ( (lv_polarity_0_0= rulePolarity ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) ( (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )* otherlv_4= ')' ) | ( ( (lv_closureType_5_0= ruleClosureType ) ) otherlv_6= '(' ( (lv_params_7_0= ruleLiteral ) ) ( (lv_params_8_0= ruleLiteral ) ) otherlv_9= ')' ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_polarity_0_0 = null;

        EObject lv_symbol_1_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_closureType_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_params_8_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1662:2: ( ( ( (lv_polarity_0_0= rulePolarity ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) ( (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )* otherlv_4= ')' ) | ( ( (lv_closureType_5_0= ruleClosureType ) ) otherlv_6= '(' ( (lv_params_7_0= ruleLiteral ) ) ( (lv_params_8_0= ruleLiteral ) ) otherlv_9= ')' ) ) ) )
            // InternalSolverLanguage.g:1663:2: ( ( (lv_polarity_0_0= rulePolarity ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) ( (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )* otherlv_4= ')' ) | ( ( (lv_closureType_5_0= ruleClosureType ) ) otherlv_6= '(' ( (lv_params_7_0= ruleLiteral ) ) ( (lv_params_8_0= ruleLiteral ) ) otherlv_9= ')' ) ) )
            {
            // InternalSolverLanguage.g:1663:2: ( ( (lv_polarity_0_0= rulePolarity ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) ( (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )* otherlv_4= ')' ) | ( ( (lv_closureType_5_0= ruleClosureType ) ) otherlv_6= '(' ( (lv_params_7_0= ruleLiteral ) ) ( (lv_params_8_0= ruleLiteral ) ) otherlv_9= ')' ) ) )
            // InternalSolverLanguage.g:1664:3: ( (lv_polarity_0_0= rulePolarity ) )? ( (lv_symbol_1_0= ruleModelSymbol ) ) ( (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )* otherlv_4= ')' ) | ( ( (lv_closureType_5_0= ruleClosureType ) ) otherlv_6= '(' ( (lv_params_7_0= ruleLiteral ) ) ( (lv_params_8_0= ruleLiteral ) ) otherlv_9= ')' ) )
            {
            // InternalSolverLanguage.g:1664:3: ( (lv_polarity_0_0= rulePolarity ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==11||LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSolverLanguage.g:1665:4: (lv_polarity_0_0= rulePolarity )
                    {
                    // InternalSolverLanguage.g:1665:4: (lv_polarity_0_0= rulePolarity )
                    // InternalSolverLanguage.g:1666:5: lv_polarity_0_0= rulePolarity
                    {

                    					newCompositeNode(grammarAccess.getConstraintAccess().getPolarityPolarityParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_10);
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

            // InternalSolverLanguage.g:1683:3: ( (lv_symbol_1_0= ruleModelSymbol ) )
            // InternalSolverLanguage.g:1684:4: (lv_symbol_1_0= ruleModelSymbol )
            {
            // InternalSolverLanguage.g:1684:4: (lv_symbol_1_0= ruleModelSymbol )
            // InternalSolverLanguage.g:1685:5: lv_symbol_1_0= ruleModelSymbol
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getSymbolModelSymbolParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalSolverLanguage.g:1702:3: ( (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )* otherlv_4= ')' ) | ( ( (lv_closureType_5_0= ruleClosureType ) ) otherlv_6= '(' ( (lv_params_7_0= ruleLiteral ) ) ( (lv_params_8_0= ruleLiteral ) ) otherlv_9= ')' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=29 && LA29_0<=30)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalSolverLanguage.g:1703:4: (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )* otherlv_4= ')' )
                    {
                    // InternalSolverLanguage.g:1703:4: (otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )* otherlv_4= ')' )
                    // InternalSolverLanguage.g:1704:5: otherlv_2= '(' ( (lv_params_3_0= ruleLiteral ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_21); 

                    					newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_2_0_0());
                    				
                    // InternalSolverLanguage.g:1708:5: ( (lv_params_3_0= ruleLiteral ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>=RULE_INT && LA28_0<=RULE_STRING)||LA28_0==11||(LA28_0>=13 && LA28_0<=14)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:1709:6: (lv_params_3_0= ruleLiteral )
                    	    {
                    	    // InternalSolverLanguage.g:1709:6: (lv_params_3_0= ruleLiteral )
                    	    // InternalSolverLanguage.g:1710:7: lv_params_3_0= ruleLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_2_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getRightParenthesisKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1733:4: ( ( (lv_closureType_5_0= ruleClosureType ) ) otherlv_6= '(' ( (lv_params_7_0= ruleLiteral ) ) ( (lv_params_8_0= ruleLiteral ) ) otherlv_9= ')' )
                    {
                    // InternalSolverLanguage.g:1733:4: ( ( (lv_closureType_5_0= ruleClosureType ) ) otherlv_6= '(' ( (lv_params_7_0= ruleLiteral ) ) ( (lv_params_8_0= ruleLiteral ) ) otherlv_9= ')' )
                    // InternalSolverLanguage.g:1734:5: ( (lv_closureType_5_0= ruleClosureType ) ) otherlv_6= '(' ( (lv_params_7_0= ruleLiteral ) ) ( (lv_params_8_0= ruleLiteral ) ) otherlv_9= ')'
                    {
                    // InternalSolverLanguage.g:1734:5: ( (lv_closureType_5_0= ruleClosureType ) )
                    // InternalSolverLanguage.g:1735:6: (lv_closureType_5_0= ruleClosureType )
                    {
                    // InternalSolverLanguage.g:1735:6: (lv_closureType_5_0= ruleClosureType )
                    // InternalSolverLanguage.g:1736:7: lv_closureType_5_0= ruleClosureType
                    {

                    							newCompositeNode(grammarAccess.getConstraintAccess().getClosureTypeClosureTypeParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_closureType_5_0=ruleClosureType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConstraintRule());
                    							}
                    							set(
                    								current,
                    								"closureType",
                    								lv_closureType_5_0,
                    								"org.eclipse.viatra.solver.language.SolverLanguage.ClosureType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_22); 

                    					newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_2_1_1());
                    				
                    // InternalSolverLanguage.g:1757:5: ( (lv_params_7_0= ruleLiteral ) )
                    // InternalSolverLanguage.g:1758:6: (lv_params_7_0= ruleLiteral )
                    {
                    // InternalSolverLanguage.g:1758:6: (lv_params_7_0= ruleLiteral )
                    // InternalSolverLanguage.g:1759:7: lv_params_7_0= ruleLiteral
                    {

                    							newCompositeNode(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_22);
                    lv_params_7_0=ruleLiteral();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConstraintRule());
                    							}
                    							add(
                    								current,
                    								"params",
                    								lv_params_7_0,
                    								"org.eclipse.viatra.solver.language.SolverLanguage.Literal");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSolverLanguage.g:1776:5: ( (lv_params_8_0= ruleLiteral ) )
                    // InternalSolverLanguage.g:1777:6: (lv_params_8_0= ruleLiteral )
                    {
                    // InternalSolverLanguage.g:1777:6: (lv_params_8_0= ruleLiteral )
                    // InternalSolverLanguage.g:1778:7: lv_params_8_0= ruleLiteral
                    {

                    							newCompositeNode(grammarAccess.getConstraintAccess().getParamsLiteralParserRuleCall_2_1_3_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_params_8_0=ruleLiteral();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConstraintRule());
                    							}
                    							add(
                    								current,
                    								"params",
                    								lv_params_8_0,
                    								"org.eclipse.viatra.solver.language.SolverLanguage.Literal");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getConstraintAccess().getRightParenthesisKeyword_2_1_4());
                    				

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleClosureType"
    // InternalSolverLanguage.g:1805:1: entryRuleClosureType returns [EObject current=null] : iv_ruleClosureType= ruleClosureType EOF ;
    public final EObject entryRuleClosureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosureType = null;


        try {
            // InternalSolverLanguage.g:1805:52: (iv_ruleClosureType= ruleClosureType EOF )
            // InternalSolverLanguage.g:1806:2: iv_ruleClosureType= ruleClosureType EOF
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
    // InternalSolverLanguage.g:1812:1: ruleClosureType returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '+' ) ) ;
    public final EObject ruleClosureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:1818:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '+' ) ) )
            // InternalSolverLanguage.g:1819:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '+' ) )
            {
            // InternalSolverLanguage.g:1819:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '+' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            else if ( (LA30_0==29) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSolverLanguage.g:1820:3: ( () otherlv_1= '*' )
                    {
                    // InternalSolverLanguage.g:1820:3: ( () otherlv_1= '*' )
                    // InternalSolverLanguage.g:1821:4: () otherlv_1= '*'
                    {
                    // InternalSolverLanguage.g:1821:4: ()
                    // InternalSolverLanguage.g:1822:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getClosureTypeAccess().getReflexiveClosureAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getClosureTypeAccess().getAsteriskKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolverLanguage.g:1834:3: ( () otherlv_3= '+' )
                    {
                    // InternalSolverLanguage.g:1834:3: ( () otherlv_3= '+' )
                    // InternalSolverLanguage.g:1835:4: () otherlv_3= '+'
                    {
                    // InternalSolverLanguage.g:1835:4: ()
                    // InternalSolverLanguage.g:1836:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getClosureTypeAccess().getIrreflexiveClosureAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalSolverLanguage.g:1851:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalSolverLanguage.g:1851:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalSolverLanguage.g:1852:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalSolverLanguage.g:1858:1: ruleLiteral returns [EObject current=null] : (this_Variable_0= ruleVariable | this_DataObject_1= ruleDataObject ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_DataObject_1 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1864:2: ( (this_Variable_0= ruleVariable | this_DataObject_1= ruleDataObject ) )
            // InternalSolverLanguage.g:1865:2: (this_Variable_0= ruleVariable | this_DataObject_1= ruleDataObject )
            {
            // InternalSolverLanguage.g:1865:2: (this_Variable_0= ruleVariable | this_DataObject_1= ruleDataObject )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_INT||LA31_0==RULE_STRING||LA31_0==11||(LA31_0>=13 && LA31_0<=14)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalSolverLanguage.g:1866:3: this_Variable_0= ruleVariable
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
                    // InternalSolverLanguage.g:1875:3: this_DataObject_1= ruleDataObject
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getDataObjectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataObject_1=ruleDataObject();

                    state._fsp--;


                    			current = this_DataObject_1;
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
    // InternalSolverLanguage.g:1887:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSolverLanguage.g:1887:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSolverLanguage.g:1888:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalSolverLanguage.g:1894:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:1900:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSolverLanguage.g:1901:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSolverLanguage.g:1901:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSolverLanguage.g:1902:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSolverLanguage.g:1902:3: (lv_name_0_0= RULE_ID )
            // InternalSolverLanguage.g:1903:4: lv_name_0_0= RULE_ID
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
    // InternalSolverLanguage.g:1922:1: entryRuleAllInstances returns [EObject current=null] : iv_ruleAllInstances= ruleAllInstances EOF ;
    public final EObject entryRuleAllInstances() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllInstances = null;


        try {
            // InternalSolverLanguage.g:1922:53: (iv_ruleAllInstances= ruleAllInstances EOF )
            // InternalSolverLanguage.g:1923:2: iv_ruleAllInstances= ruleAllInstances EOF
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
    // InternalSolverLanguage.g:1929:1: ruleAllInstances returns [EObject current=null] : (otherlv_0= ':' ( (lv_symbol_1_0= ruleSymbol ) ) ) ;
    public final EObject ruleAllInstances() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_symbol_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:1935:2: ( (otherlv_0= ':' ( (lv_symbol_1_0= ruleSymbol ) ) ) )
            // InternalSolverLanguage.g:1936:2: (otherlv_0= ':' ( (lv_symbol_1_0= ruleSymbol ) ) )
            {
            // InternalSolverLanguage.g:1936:2: (otherlv_0= ':' ( (lv_symbol_1_0= ruleSymbol ) ) )
            // InternalSolverLanguage.g:1937:3: otherlv_0= ':' ( (lv_symbol_1_0= ruleSymbol ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAllInstancesAccess().getColonKeyword_0());
            		
            // InternalSolverLanguage.g:1941:3: ( (lv_symbol_1_0= ruleSymbol ) )
            // InternalSolverLanguage.g:1942:4: (lv_symbol_1_0= ruleSymbol )
            {
            // InternalSolverLanguage.g:1942:4: (lv_symbol_1_0= ruleSymbol )
            // InternalSolverLanguage.g:1943:5: lv_symbol_1_0= ruleSymbol
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
    // InternalSolverLanguage.g:1964:1: entryRuleAllObjects returns [EObject current=null] : iv_ruleAllObjects= ruleAllObjects EOF ;
    public final EObject entryRuleAllObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllObjects = null;


        try {
            // InternalSolverLanguage.g:1964:51: (iv_ruleAllObjects= ruleAllObjects EOF )
            // InternalSolverLanguage.g:1965:2: iv_ruleAllObjects= ruleAllObjects EOF
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
    // InternalSolverLanguage.g:1971:1: ruleAllObjects returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleAllObjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:1977:2: ( ( () otherlv_1= '*' ) )
            // InternalSolverLanguage.g:1978:2: ( () otherlv_1= '*' )
            {
            // InternalSolverLanguage.g:1978:2: ( () otherlv_1= '*' )
            // InternalSolverLanguage.g:1979:3: () otherlv_1= '*'
            {
            // InternalSolverLanguage.g:1979:3: ()
            // InternalSolverLanguage.g:1980:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAllObjectsAccess().getAllObjectsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

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
    // InternalSolverLanguage.g:1994:1: entryRuleDefaultInterpretation returns [EObject current=null] : iv_ruleDefaultInterpretation= ruleDefaultInterpretation EOF ;
    public final EObject entryRuleDefaultInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultInterpretation = null;


        try {
            // InternalSolverLanguage.g:1994:62: (iv_ruleDefaultInterpretation= ruleDefaultInterpretation EOF )
            // InternalSolverLanguage.g:1995:2: iv_ruleDefaultInterpretation= ruleDefaultInterpretation EOF
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
    // InternalSolverLanguage.g:2001:1: ruleDefaultInterpretation returns [EObject current=null] : (otherlv_0= 'default' ( (lv_interpretation_1_0= ruleBasicInterpretation ) ) ) ;
    public final EObject ruleDefaultInterpretation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_interpretation_1_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2007:2: ( (otherlv_0= 'default' ( (lv_interpretation_1_0= ruleBasicInterpretation ) ) ) )
            // InternalSolverLanguage.g:2008:2: (otherlv_0= 'default' ( (lv_interpretation_1_0= ruleBasicInterpretation ) ) )
            {
            // InternalSolverLanguage.g:2008:2: (otherlv_0= 'default' ( (lv_interpretation_1_0= ruleBasicInterpretation ) ) )
            // InternalSolverLanguage.g:2009:3: otherlv_0= 'default' ( (lv_interpretation_1_0= ruleBasicInterpretation ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultInterpretationAccess().getDefaultKeyword_0());
            		
            // InternalSolverLanguage.g:2013:3: ( (lv_interpretation_1_0= ruleBasicInterpretation ) )
            // InternalSolverLanguage.g:2014:4: (lv_interpretation_1_0= ruleBasicInterpretation )
            {
            // InternalSolverLanguage.g:2014:4: (lv_interpretation_1_0= ruleBasicInterpretation )
            // InternalSolverLanguage.g:2015:5: lv_interpretation_1_0= ruleBasicInterpretation
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
    // InternalSolverLanguage.g:2036:1: entryRuleCDInterpretation returns [EObject current=null] : iv_ruleCDInterpretation= ruleCDInterpretation EOF ;
    public final EObject entryRuleCDInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDInterpretation = null;


        try {
            // InternalSolverLanguage.g:2036:57: (iv_ruleCDInterpretation= ruleCDInterpretation EOF )
            // InternalSolverLanguage.g:2037:2: iv_ruleCDInterpretation= ruleCDInterpretation EOF
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
    // InternalSolverLanguage.g:2043:1: ruleCDInterpretation returns [EObject current=null] : (this_ClassInterpretation_0= ruleClassInterpretation | this_EnumInterpretation_1= ruleEnumInterpretation | this_GlobalRelationInterpretation_2= ruleGlobalRelationInterpretation ) ;
    public final EObject ruleCDInterpretation() throws RecognitionException {
        EObject current = null;

        EObject this_ClassInterpretation_0 = null;

        EObject this_EnumInterpretation_1 = null;

        EObject this_GlobalRelationInterpretation_2 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2049:2: ( (this_ClassInterpretation_0= ruleClassInterpretation | this_EnumInterpretation_1= ruleEnumInterpretation | this_GlobalRelationInterpretation_2= ruleGlobalRelationInterpretation ) )
            // InternalSolverLanguage.g:2050:2: (this_ClassInterpretation_0= ruleClassInterpretation | this_EnumInterpretation_1= ruleEnumInterpretation | this_GlobalRelationInterpretation_2= ruleGlobalRelationInterpretation )
            {
            // InternalSolverLanguage.g:2050:2: (this_ClassInterpretation_0= ruleClassInterpretation | this_EnumInterpretation_1= ruleEnumInterpretation | this_GlobalRelationInterpretation_2= ruleGlobalRelationInterpretation )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt32=1;
                }
                break;
            case 37:
                {
                alt32=2;
                }
                break;
            case 38:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalSolverLanguage.g:2051:3: this_ClassInterpretation_0= ruleClassInterpretation
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
                    // InternalSolverLanguage.g:2060:3: this_EnumInterpretation_1= ruleEnumInterpretation
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
                    // InternalSolverLanguage.g:2069:3: this_GlobalRelationInterpretation_2= ruleGlobalRelationInterpretation
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
    // InternalSolverLanguage.g:2081:1: entryRuleClassInterpretation returns [EObject current=null] : iv_ruleClassInterpretation= ruleClassInterpretation EOF ;
    public final EObject entryRuleClassInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassInterpretation = null;


        try {
            // InternalSolverLanguage.g:2081:60: (iv_ruleClassInterpretation= ruleClassInterpretation EOF )
            // InternalSolverLanguage.g:2082:2: iv_ruleClassInterpretation= ruleClassInterpretation EOF
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
    // InternalSolverLanguage.g:2088:1: ruleClassInterpretation returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) ) otherlv_1= 'class' ( (lv_symbol_2_0= ruleModelSymbol ) ) (otherlv_3= 'extends' ( (lv_supertypes_4_0= ruleModelSymbol ) )+ )? otherlv_5= '{' ( (lv_fielt_6_0= ruleFieldRelationInterpretation ) )* otherlv_7= '}' ) ;
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
            // InternalSolverLanguage.g:2094:2: ( ( ( (lv_abstract_0_0= 'abstract' ) ) otherlv_1= 'class' ( (lv_symbol_2_0= ruleModelSymbol ) ) (otherlv_3= 'extends' ( (lv_supertypes_4_0= ruleModelSymbol ) )+ )? otherlv_5= '{' ( (lv_fielt_6_0= ruleFieldRelationInterpretation ) )* otherlv_7= '}' ) )
            // InternalSolverLanguage.g:2095:2: ( ( (lv_abstract_0_0= 'abstract' ) ) otherlv_1= 'class' ( (lv_symbol_2_0= ruleModelSymbol ) ) (otherlv_3= 'extends' ( (lv_supertypes_4_0= ruleModelSymbol ) )+ )? otherlv_5= '{' ( (lv_fielt_6_0= ruleFieldRelationInterpretation ) )* otherlv_7= '}' )
            {
            // InternalSolverLanguage.g:2095:2: ( ( (lv_abstract_0_0= 'abstract' ) ) otherlv_1= 'class' ( (lv_symbol_2_0= ruleModelSymbol ) ) (otherlv_3= 'extends' ( (lv_supertypes_4_0= ruleModelSymbol ) )+ )? otherlv_5= '{' ( (lv_fielt_6_0= ruleFieldRelationInterpretation ) )* otherlv_7= '}' )
            // InternalSolverLanguage.g:2096:3: ( (lv_abstract_0_0= 'abstract' ) ) otherlv_1= 'class' ( (lv_symbol_2_0= ruleModelSymbol ) ) (otherlv_3= 'extends' ( (lv_supertypes_4_0= ruleModelSymbol ) )+ )? otherlv_5= '{' ( (lv_fielt_6_0= ruleFieldRelationInterpretation ) )* otherlv_7= '}'
            {
            // InternalSolverLanguage.g:2096:3: ( (lv_abstract_0_0= 'abstract' ) )
            // InternalSolverLanguage.g:2097:4: (lv_abstract_0_0= 'abstract' )
            {
            // InternalSolverLanguage.g:2097:4: (lv_abstract_0_0= 'abstract' )
            // InternalSolverLanguage.g:2098:5: lv_abstract_0_0= 'abstract'
            {
            lv_abstract_0_0=(Token)match(input,32,FOLLOW_24); 

            					newLeafNode(lv_abstract_0_0, grammarAccess.getClassInterpretationAccess().getAbstractAbstractKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassInterpretationRule());
            					}
            					setWithLastConsumed(current, "abstract", true, "abstract");
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getClassInterpretationAccess().getClassKeyword_1());
            		
            // InternalSolverLanguage.g:2114:3: ( (lv_symbol_2_0= ruleModelSymbol ) )
            // InternalSolverLanguage.g:2115:4: (lv_symbol_2_0= ruleModelSymbol )
            {
            // InternalSolverLanguage.g:2115:4: (lv_symbol_2_0= ruleModelSymbol )
            // InternalSolverLanguage.g:2116:5: lv_symbol_2_0= ruleModelSymbol
            {

            					newCompositeNode(grammarAccess.getClassInterpretationAccess().getSymbolModelSymbolParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalSolverLanguage.g:2133:3: (otherlv_3= 'extends' ( (lv_supertypes_4_0= ruleModelSymbol ) )+ )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSolverLanguage.g:2134:4: otherlv_3= 'extends' ( (lv_supertypes_4_0= ruleModelSymbol ) )+
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassInterpretationAccess().getExtendsKeyword_3_0());
                    			
                    // InternalSolverLanguage.g:2138:4: ( (lv_supertypes_4_0= ruleModelSymbol ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_ID) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalSolverLanguage.g:2139:5: (lv_supertypes_4_0= ruleModelSymbol )
                    	    {
                    	    // InternalSolverLanguage.g:2139:5: (lv_supertypes_4_0= ruleModelSymbol )
                    	    // InternalSolverLanguage.g:2140:6: lv_supertypes_4_0= ruleModelSymbol
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassInterpretationAccess().getSupertypesModelSymbolParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_26);
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
                    	    if ( cnt33 >= 1 ) break loop33;
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getClassInterpretationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSolverLanguage.g:2162:3: ( (lv_fielt_6_0= ruleFieldRelationInterpretation ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==38) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSolverLanguage.g:2163:4: (lv_fielt_6_0= ruleFieldRelationInterpretation )
            	    {
            	    // InternalSolverLanguage.g:2163:4: (lv_fielt_6_0= ruleFieldRelationInterpretation )
            	    // InternalSolverLanguage.g:2164:5: lv_fielt_6_0= ruleFieldRelationInterpretation
            	    {

            	    					newCompositeNode(grammarAccess.getClassInterpretationAccess().getFieltFieldRelationInterpretationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    break loop35;
                }
            } while (true);

            otherlv_7=(Token)match(input,36,FOLLOW_2); 

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
    // InternalSolverLanguage.g:2189:1: entryRuleEnumInterpretation returns [EObject current=null] : iv_ruleEnumInterpretation= ruleEnumInterpretation EOF ;
    public final EObject entryRuleEnumInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumInterpretation = null;


        try {
            // InternalSolverLanguage.g:2189:59: (iv_ruleEnumInterpretation= ruleEnumInterpretation EOF )
            // InternalSolverLanguage.g:2190:2: iv_ruleEnumInterpretation= ruleEnumInterpretation EOF
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
    // InternalSolverLanguage.g:2196:1: ruleEnumInterpretation returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_Symbol_1_0= ruleModelSymbol ) ) otherlv_2= '{' ( (lv_objects_3_0= ruleNamedObject ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnumInterpretation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_Symbol_1_0 = null;

        EObject lv_objects_3_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2202:2: ( (otherlv_0= 'enum' ( (lv_Symbol_1_0= ruleModelSymbol ) ) otherlv_2= '{' ( (lv_objects_3_0= ruleNamedObject ) )+ otherlv_4= '}' ) )
            // InternalSolverLanguage.g:2203:2: (otherlv_0= 'enum' ( (lv_Symbol_1_0= ruleModelSymbol ) ) otherlv_2= '{' ( (lv_objects_3_0= ruleNamedObject ) )+ otherlv_4= '}' )
            {
            // InternalSolverLanguage.g:2203:2: (otherlv_0= 'enum' ( (lv_Symbol_1_0= ruleModelSymbol ) ) otherlv_2= '{' ( (lv_objects_3_0= ruleNamedObject ) )+ otherlv_4= '}' )
            // InternalSolverLanguage.g:2204:3: otherlv_0= 'enum' ( (lv_Symbol_1_0= ruleModelSymbol ) ) otherlv_2= '{' ( (lv_objects_3_0= ruleNamedObject ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumInterpretationAccess().getEnumKeyword_0());
            		
            // InternalSolverLanguage.g:2208:3: ( (lv_Symbol_1_0= ruleModelSymbol ) )
            // InternalSolverLanguage.g:2209:4: (lv_Symbol_1_0= ruleModelSymbol )
            {
            // InternalSolverLanguage.g:2209:4: (lv_Symbol_1_0= ruleModelSymbol )
            // InternalSolverLanguage.g:2210:5: lv_Symbol_1_0= ruleModelSymbol
            {

            					newCompositeNode(grammarAccess.getEnumInterpretationAccess().getSymbolModelSymbolParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_2=(Token)match(input,35,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumInterpretationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSolverLanguage.g:2231:3: ( (lv_objects_3_0= ruleNamedObject ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==26) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSolverLanguage.g:2232:4: (lv_objects_3_0= ruleNamedObject )
            	    {
            	    // InternalSolverLanguage.g:2232:4: (lv_objects_3_0= ruleNamedObject )
            	    // InternalSolverLanguage.g:2233:5: lv_objects_3_0= ruleNamedObject
            	    {

            	    					newCompositeNode(grammarAccess.getEnumInterpretationAccess().getObjectsNamedObjectParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

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
    // InternalSolverLanguage.g:2258:1: entryRuleFieldRelationInterpretation returns [EObject current=null] : iv_ruleFieldRelationInterpretation= ruleFieldRelationInterpretation EOF ;
    public final EObject entryRuleFieldRelationInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldRelationInterpretation = null;


        try {
            // InternalSolverLanguage.g:2258:68: (iv_ruleFieldRelationInterpretation= ruleFieldRelationInterpretation EOF )
            // InternalSolverLanguage.g:2259:2: iv_ruleFieldRelationInterpretation= ruleFieldRelationInterpretation EOF
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
    // InternalSolverLanguage.g:2265:1: ruleFieldRelationInterpretation returns [EObject current=null] : ( ( (lv_containment_0_0= 'containment' ) ) ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicityDefinition ) )? ( (lv_target_4_0= ruleSymbol ) ) ) ;
    public final EObject ruleFieldRelationInterpretation() throws RecognitionException {
        EObject current = null;

        Token lv_containment_0_0=null;
        Token otherlv_2=null;
        EObject lv_symbol_1_0 = null;

        EObject lv_multiplicity_3_0 = null;

        EObject lv_target_4_0 = null;



        	enterRule();

        try {
            // InternalSolverLanguage.g:2271:2: ( ( ( (lv_containment_0_0= 'containment' ) ) ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicityDefinition ) )? ( (lv_target_4_0= ruleSymbol ) ) ) )
            // InternalSolverLanguage.g:2272:2: ( ( (lv_containment_0_0= 'containment' ) ) ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicityDefinition ) )? ( (lv_target_4_0= ruleSymbol ) ) )
            {
            // InternalSolverLanguage.g:2272:2: ( ( (lv_containment_0_0= 'containment' ) ) ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicityDefinition ) )? ( (lv_target_4_0= ruleSymbol ) ) )
            // InternalSolverLanguage.g:2273:3: ( (lv_containment_0_0= 'containment' ) ) ( (lv_symbol_1_0= ruleModelSymbol ) ) otherlv_2= ':' ( (lv_multiplicity_3_0= ruleMultiplicityDefinition ) )? ( (lv_target_4_0= ruleSymbol ) )
            {
            // InternalSolverLanguage.g:2273:3: ( (lv_containment_0_0= 'containment' ) )
            // InternalSolverLanguage.g:2274:4: (lv_containment_0_0= 'containment' )
            {
            // InternalSolverLanguage.g:2274:4: (lv_containment_0_0= 'containment' )
            // InternalSolverLanguage.g:2275:5: lv_containment_0_0= 'containment'
            {
            lv_containment_0_0=(Token)match(input,38,FOLLOW_10); 

            					newLeafNode(lv_containment_0_0, grammarAccess.getFieldRelationInterpretationAccess().getContainmentContainmentKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRelationInterpretationRule());
            					}
            					setWithLastConsumed(current, "containment", true, "containment");
            				

            }


            }

            // InternalSolverLanguage.g:2287:3: ( (lv_symbol_1_0= ruleModelSymbol ) )
            // InternalSolverLanguage.g:2288:4: (lv_symbol_1_0= ruleModelSymbol )
            {
            // InternalSolverLanguage.g:2288:4: (lv_symbol_1_0= ruleModelSymbol )
            // InternalSolverLanguage.g:2289:5: lv_symbol_1_0= ruleModelSymbol
            {

            					newCompositeNode(grammarAccess.getFieldRelationInterpretationAccess().getSymbolModelSymbolParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_2=(Token)match(input,19,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldRelationInterpretationAccess().getColonKeyword_2());
            		
            // InternalSolverLanguage.g:2310:3: ( (lv_multiplicity_3_0= ruleMultiplicityDefinition ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSolverLanguage.g:2311:4: (lv_multiplicity_3_0= ruleMultiplicityDefinition )
                    {
                    // InternalSolverLanguage.g:2311:4: (lv_multiplicity_3_0= ruleMultiplicityDefinition )
                    // InternalSolverLanguage.g:2312:5: lv_multiplicity_3_0= ruleMultiplicityDefinition
                    {

                    					newCompositeNode(grammarAccess.getFieldRelationInterpretationAccess().getMultiplicityMultiplicityDefinitionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_18);
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

            // InternalSolverLanguage.g:2329:3: ( (lv_target_4_0= ruleSymbol ) )
            // InternalSolverLanguage.g:2330:4: (lv_target_4_0= ruleSymbol )
            {
            // InternalSolverLanguage.g:2330:4: (lv_target_4_0= ruleSymbol )
            // InternalSolverLanguage.g:2331:5: lv_target_4_0= ruleSymbol
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
    // InternalSolverLanguage.g:2352:1: entryRuleGlobalRelationInterpretation returns [EObject current=null] : iv_ruleGlobalRelationInterpretation= ruleGlobalRelationInterpretation EOF ;
    public final EObject entryRuleGlobalRelationInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalRelationInterpretation = null;


        try {
            // InternalSolverLanguage.g:2352:69: (iv_ruleGlobalRelationInterpretation= ruleGlobalRelationInterpretation EOF )
            // InternalSolverLanguage.g:2353:2: iv_ruleGlobalRelationInterpretation= ruleGlobalRelationInterpretation EOF
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
    // InternalSolverLanguage.g:2359:1: ruleGlobalRelationInterpretation returns [EObject current=null] : ( ( (lv_containment_0_0= 'containment' ) ) otherlv_1= 'relation' ( (lv_symbol_2_0= ruleModelSymbol ) ) otherlv_3= ':' ( (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition ) )? ( (lv_source_5_0= ruleSymbol ) ) ( (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition ) )? ( (lv_target_7_0= ruleSymbol ) ) ) ;
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
            // InternalSolverLanguage.g:2365:2: ( ( ( (lv_containment_0_0= 'containment' ) ) otherlv_1= 'relation' ( (lv_symbol_2_0= ruleModelSymbol ) ) otherlv_3= ':' ( (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition ) )? ( (lv_source_5_0= ruleSymbol ) ) ( (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition ) )? ( (lv_target_7_0= ruleSymbol ) ) ) )
            // InternalSolverLanguage.g:2366:2: ( ( (lv_containment_0_0= 'containment' ) ) otherlv_1= 'relation' ( (lv_symbol_2_0= ruleModelSymbol ) ) otherlv_3= ':' ( (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition ) )? ( (lv_source_5_0= ruleSymbol ) ) ( (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition ) )? ( (lv_target_7_0= ruleSymbol ) ) )
            {
            // InternalSolverLanguage.g:2366:2: ( ( (lv_containment_0_0= 'containment' ) ) otherlv_1= 'relation' ( (lv_symbol_2_0= ruleModelSymbol ) ) otherlv_3= ':' ( (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition ) )? ( (lv_source_5_0= ruleSymbol ) ) ( (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition ) )? ( (lv_target_7_0= ruleSymbol ) ) )
            // InternalSolverLanguage.g:2367:3: ( (lv_containment_0_0= 'containment' ) ) otherlv_1= 'relation' ( (lv_symbol_2_0= ruleModelSymbol ) ) otherlv_3= ':' ( (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition ) )? ( (lv_source_5_0= ruleSymbol ) ) ( (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition ) )? ( (lv_target_7_0= ruleSymbol ) )
            {
            // InternalSolverLanguage.g:2367:3: ( (lv_containment_0_0= 'containment' ) )
            // InternalSolverLanguage.g:2368:4: (lv_containment_0_0= 'containment' )
            {
            // InternalSolverLanguage.g:2368:4: (lv_containment_0_0= 'containment' )
            // InternalSolverLanguage.g:2369:5: lv_containment_0_0= 'containment'
            {
            lv_containment_0_0=(Token)match(input,38,FOLLOW_31); 

            					newLeafNode(lv_containment_0_0, grammarAccess.getGlobalRelationInterpretationAccess().getContainmentContainmentKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalRelationInterpretationRule());
            					}
            					setWithLastConsumed(current, "containment", true, "containment");
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalRelationInterpretationAccess().getRelationKeyword_1());
            		
            // InternalSolverLanguage.g:2385:3: ( (lv_symbol_2_0= ruleModelSymbol ) )
            // InternalSolverLanguage.g:2386:4: (lv_symbol_2_0= ruleModelSymbol )
            {
            // InternalSolverLanguage.g:2386:4: (lv_symbol_2_0= ruleModelSymbol )
            // InternalSolverLanguage.g:2387:5: lv_symbol_2_0= ruleModelSymbol
            {

            					newCompositeNode(grammarAccess.getGlobalRelationInterpretationAccess().getSymbolModelSymbolParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_3=(Token)match(input,19,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getGlobalRelationInterpretationAccess().getColonKeyword_3());
            		
            // InternalSolverLanguage.g:2408:3: ( (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSolverLanguage.g:2409:4: (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition )
                    {
                    // InternalSolverLanguage.g:2409:4: (lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition )
                    // InternalSolverLanguage.g:2410:5: lv_sourceMultiplicity_4_0= ruleMultiplicityDefinition
                    {

                    					newCompositeNode(grammarAccess.getGlobalRelationInterpretationAccess().getSourceMultiplicityMultiplicityDefinitionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_18);
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

            // InternalSolverLanguage.g:2427:3: ( (lv_source_5_0= ruleSymbol ) )
            // InternalSolverLanguage.g:2428:4: (lv_source_5_0= ruleSymbol )
            {
            // InternalSolverLanguage.g:2428:4: (lv_source_5_0= ruleSymbol )
            // InternalSolverLanguage.g:2429:5: lv_source_5_0= ruleSymbol
            {

            					newCompositeNode(grammarAccess.getGlobalRelationInterpretationAccess().getSourceSymbolParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalSolverLanguage.g:2446:3: ( (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSolverLanguage.g:2447:4: (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition )
                    {
                    // InternalSolverLanguage.g:2447:4: (lv_targetMultiplicity_6_0= ruleMultiplicityDefinition )
                    // InternalSolverLanguage.g:2448:5: lv_targetMultiplicity_6_0= ruleMultiplicityDefinition
                    {

                    					newCompositeNode(grammarAccess.getGlobalRelationInterpretationAccess().getTargetMultiplicityMultiplicityDefinitionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_18);
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

            // InternalSolverLanguage.g:2465:3: ( (lv_target_7_0= ruleSymbol ) )
            // InternalSolverLanguage.g:2466:4: (lv_target_7_0= ruleSymbol )
            {
            // InternalSolverLanguage.g:2466:4: (lv_target_7_0= ruleSymbol )
            // InternalSolverLanguage.g:2467:5: lv_target_7_0= ruleSymbol
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
    // InternalSolverLanguage.g:2488:1: entryRuleMultiplicityDefinition returns [EObject current=null] : iv_ruleMultiplicityDefinition= ruleMultiplicityDefinition EOF ;
    public final EObject entryRuleMultiplicityDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityDefinition = null;


        try {
            // InternalSolverLanguage.g:2488:63: (iv_ruleMultiplicityDefinition= ruleMultiplicityDefinition EOF )
            // InternalSolverLanguage.g:2489:2: iv_ruleMultiplicityDefinition= ruleMultiplicityDefinition EOF
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
    // InternalSolverLanguage.g:2495:1: ruleMultiplicityDefinition returns [EObject current=null] : ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_upper_2_0= RULE_INT ) ) | ( (lv_unlimitedUpper_3_0= '*' ) ) ) ) ;
    public final EObject ruleMultiplicityDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_lower_0_0=null;
        Token otherlv_1=null;
        Token lv_upper_2_0=null;
        Token lv_unlimitedUpper_3_0=null;


        	enterRule();

        try {
            // InternalSolverLanguage.g:2501:2: ( ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_upper_2_0= RULE_INT ) ) | ( (lv_unlimitedUpper_3_0= '*' ) ) ) ) )
            // InternalSolverLanguage.g:2502:2: ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_upper_2_0= RULE_INT ) ) | ( (lv_unlimitedUpper_3_0= '*' ) ) ) )
            {
            // InternalSolverLanguage.g:2502:2: ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_upper_2_0= RULE_INT ) ) | ( (lv_unlimitedUpper_3_0= '*' ) ) ) )
            // InternalSolverLanguage.g:2503:3: ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( ( (lv_upper_2_0= RULE_INT ) ) | ( (lv_unlimitedUpper_3_0= '*' ) ) )
            {
            // InternalSolverLanguage.g:2503:3: ( (lv_lower_0_0= RULE_INT ) )
            // InternalSolverLanguage.g:2504:4: (lv_lower_0_0= RULE_INT )
            {
            // InternalSolverLanguage.g:2504:4: (lv_lower_0_0= RULE_INT )
            // InternalSolverLanguage.g:2505:5: lv_lower_0_0= RULE_INT
            {
            lv_lower_0_0=(Token)match(input,RULE_INT,FOLLOW_32); 

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

            otherlv_1=(Token)match(input,40,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiplicityDefinitionAccess().getFullStopFullStopKeyword_1());
            		
            // InternalSolverLanguage.g:2525:3: ( ( (lv_upper_2_0= RULE_INT ) ) | ( (lv_unlimitedUpper_3_0= '*' ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT) ) {
                alt40=1;
            }
            else if ( (LA40_0==30) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalSolverLanguage.g:2526:4: ( (lv_upper_2_0= RULE_INT ) )
                    {
                    // InternalSolverLanguage.g:2526:4: ( (lv_upper_2_0= RULE_INT ) )
                    // InternalSolverLanguage.g:2527:5: (lv_upper_2_0= RULE_INT )
                    {
                    // InternalSolverLanguage.g:2527:5: (lv_upper_2_0= RULE_INT )
                    // InternalSolverLanguage.g:2528:6: lv_upper_2_0= RULE_INT
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
                    // InternalSolverLanguage.g:2545:4: ( (lv_unlimitedUpper_3_0= '*' ) )
                    {
                    // InternalSolverLanguage.g:2545:4: ( (lv_unlimitedUpper_3_0= '*' ) )
                    // InternalSolverLanguage.g:2546:5: (lv_unlimitedUpper_3_0= '*' )
                    {
                    // InternalSolverLanguage.g:2546:5: (lv_unlimitedUpper_3_0= '*' )
                    // InternalSolverLanguage.g:2547:6: lv_unlimitedUpper_3_0= '*'
                    {
                    lv_unlimitedUpper_3_0=(Token)match(input,30,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000618BF10022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000440C6870L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000030007820L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000030003820L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003F00020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000822L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004046870L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004006870L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000003F00030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000010L});

}