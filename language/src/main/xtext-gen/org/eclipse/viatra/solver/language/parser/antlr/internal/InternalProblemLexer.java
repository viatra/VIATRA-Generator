package org.eclipse.viatra.solver.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProblemLexer extends Lexer {
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

    public InternalProblemLexer() {;} 
    public InternalProblemLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalProblemLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalProblem.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:11:7: ( 'problem' )
            // InternalProblem.g:11:9: 'problem'
            {
            match("problem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:12:7: ( '.' )
            // InternalProblem.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:13:7: ( 'abstract' )
            // InternalProblem.g:13:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:14:7: ( 'class' )
            // InternalProblem.g:14:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:15:7: ( 'extends' )
            // InternalProblem.g:15:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:16:7: ( ',' )
            // InternalProblem.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:17:7: ( '{' )
            // InternalProblem.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:18:7: ( ';' )
            // InternalProblem.g:18:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:19:7: ( '}' )
            // InternalProblem.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:20:7: ( 'enum' )
            // InternalProblem.g:20:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:21:7: ( 'contains' )
            // InternalProblem.g:21:9: 'contains'
            {
            match("contains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:22:7: ( 'refers' )
            // InternalProblem.g:22:9: 'refers'
            {
            match("refers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:23:7: ( '[' )
            // InternalProblem.g:23:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:24:7: ( ']' )
            // InternalProblem.g:24:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:25:7: ( 'opposite' )
            // InternalProblem.g:25:9: 'opposite'
            {
            match("opposite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:26:7: ( 'error' )
            // InternalProblem.g:26:9: 'error'
            {
            match("error"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:27:7: ( 'pred' )
            // InternalProblem.g:27:9: 'pred'
            {
            match("pred"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:28:7: ( '(' )
            // InternalProblem.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:29:7: ( ')' )
            // InternalProblem.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:30:7: ( ':-' )
            // InternalProblem.g:30:9: ':-'
            {
            match(":-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:31:7: ( '!' )
            // InternalProblem.g:31:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:32:7: ( '+' )
            // InternalProblem.g:32:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:33:7: ( ':' )
            // InternalProblem.g:33:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:34:7: ( 'scope' )
            // InternalProblem.g:34:9: 'scope'
            {
            match("scope"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:35:7: ( '+=' )
            // InternalProblem.g:35:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:36:7: ( '=' )
            // InternalProblem.g:36:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:37:7: ( '..' )
            // InternalProblem.g:37:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:38:7: ( '*' )
            // InternalProblem.g:38:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:39:7: ( '::' )
            // InternalProblem.g:39:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:40:7: ( 'true' )
            // InternalProblem.g:40:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:41:7: ( 'false' )
            // InternalProblem.g:41:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:42:7: ( '-' )
            // InternalProblem.g:42:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:43:7: ( 'unknown' )
            // InternalProblem.g:43:9: 'unknown'
            {
            match("unknown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:44:7: ( '?' )
            // InternalProblem.g:44:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2374:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalProblem.g:2374:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalProblem.g:2374:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProblem.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_EXPONENTIAL"
    public final void mRULE_EXPONENTIAL() throws RecognitionException {
        try {
            int _type = RULE_EXPONENTIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2376:18: ( RULE_INT ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )
            // InternalProblem.g:2376:20: RULE_INT ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
            {
            mRULE_INT(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalProblem.g:2376:39: ( '+' | '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalProblem.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENTIAL"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2378:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalProblem.g:2378:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalProblem.g:2378:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalProblem.g:2378:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalProblem.g:2378:27: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_QUOTED_ID"
    public final void mRULE_QUOTED_ID() throws RecognitionException {
        try {
            int _type = RULE_QUOTED_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2380:16: ( '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalProblem.g:2380:18: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalProblem.g:2380:23: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalProblem.g:2380:24: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalProblem.g:2380:31: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUOTED_ID"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2382:17: ( ( '%' | '//' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalProblem.g:2382:19: ( '%' | '//' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // InternalProblem.g:2382:19: ( '%' | '//' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='%') ) {
                alt5=1;
            }
            else if ( (LA5_0=='/') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalProblem.g:2382:20: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 2 :
                    // InternalProblem.g:2382:24: '//'
                    {
                    match("//"); 


                    }
                    break;

            }

            // InternalProblem.g:2382:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalProblem.g:2382:30: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalProblem.g:2382:46: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProblem.g:2382:47: ( '\\r' )? '\\n'
                    {
                    // InternalProblem.g:2382:47: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalProblem.g:2382:47: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2384:10: ( ( '0' .. '9' )+ )
            // InternalProblem.g:2384:12: ( '0' .. '9' )+
            {
            // InternalProblem.g:2384:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProblem.g:2384:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2386:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalProblem.g:2386:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalProblem.g:2386:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalProblem.g:2386:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2388:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalProblem.g:2388:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalProblem.g:2388:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalProblem.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2390:16: ( . )
            // InternalProblem.g:2390:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalProblem.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_ID | RULE_EXPONENTIAL | RULE_STRING | RULE_QUOTED_ID | RULE_SL_COMMENT | RULE_INT | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=43;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalProblem.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalProblem.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalProblem.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalProblem.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalProblem.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalProblem.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalProblem.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalProblem.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalProblem.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalProblem.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalProblem.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalProblem.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalProblem.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalProblem.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalProblem.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalProblem.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalProblem.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalProblem.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalProblem.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalProblem.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalProblem.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalProblem.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalProblem.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalProblem.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalProblem.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalProblem.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalProblem.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalProblem.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalProblem.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalProblem.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalProblem.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalProblem.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalProblem.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalProblem.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalProblem.g:1:214: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // InternalProblem.g:1:222: RULE_EXPONENTIAL
                {
                mRULE_EXPONENTIAL(); 

                }
                break;
            case 37 :
                // InternalProblem.g:1:239: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // InternalProblem.g:1:251: RULE_QUOTED_ID
                {
                mRULE_QUOTED_ID(); 

                }
                break;
            case 39 :
                // InternalProblem.g:1:266: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // InternalProblem.g:1:282: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 41 :
                // InternalProblem.g:1:291: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // InternalProblem.g:1:307: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // InternalProblem.g:1:315: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\44\1\46\3\44\4\uffff\1\44\2\uffff\1\44\2\uffff\1\71\1\uffff\1\74\1\44\2\uffff\2\44\1\uffff\1\44\2\uffff\1\105\2\42\1\uffff\1\42\2\uffff\1\44\3\uffff\6\44\4\uffff\1\44\2\uffff\1\44\10\uffff\1\44\2\uffff\2\44\1\uffff\1\44\2\uffff\1\105\6\uffff\17\44\1\152\4\44\1\157\4\44\1\164\3\44\1\uffff\1\44\1\171\2\44\1\uffff\1\174\2\44\1\177\1\uffff\1\u0080\3\44\1\uffff\2\44\1\uffff\1\u0086\1\44\2\uffff\1\44\1\u0089\2\44\1\u008c\1\uffff\1\44\1\u008e\1\uffff\1\u008f\1\u0090\1\uffff\1\u0091\4\uffff";
    static final String DFA12_eofS =
        "\u0092\uffff";
    static final String DFA12_minS =
        "\1\0\1\162\1\56\1\142\1\154\1\156\4\uffff\1\145\2\uffff\1\160\2\uffff\1\55\1\uffff\1\75\1\143\2\uffff\1\162\1\141\1\uffff\1\156\2\uffff\1\60\2\0\1\uffff\1\52\2\uffff\1\145\3\uffff\1\163\1\141\1\156\1\164\1\165\1\162\4\uffff\1\146\2\uffff\1\160\10\uffff\1\157\2\uffff\1\165\1\154\1\uffff\1\153\2\uffff\1\60\6\uffff\1\142\1\144\1\164\1\163\1\164\1\145\1\155\1\157\1\145\1\157\1\160\1\145\1\163\1\156\1\154\1\60\1\162\1\163\1\141\1\156\1\60\2\162\1\163\1\145\1\60\1\145\1\157\1\145\1\uffff\1\141\1\60\1\151\1\144\1\uffff\1\60\1\163\1\151\1\60\1\uffff\1\60\1\167\1\155\1\143\1\uffff\1\156\1\163\1\uffff\1\60\1\164\2\uffff\1\156\1\60\1\164\1\163\1\60\1\uffff\1\145\1\60\1\uffff\2\60\1\uffff\1\60\4\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\162\1\56\1\142\1\157\1\170\4\uffff\1\145\2\uffff\1\160\2\uffff\1\72\1\uffff\1\75\1\143\2\uffff\1\162\1\141\1\uffff\1\156\2\uffff\1\145\2\uffff\1\uffff\1\57\2\uffff\1\157\3\uffff\1\163\1\141\1\156\1\164\1\165\1\162\4\uffff\1\146\2\uffff\1\160\10\uffff\1\157\2\uffff\1\165\1\154\1\uffff\1\153\2\uffff\1\145\6\uffff\1\142\1\144\1\164\1\163\1\164\1\145\1\155\1\157\1\145\1\157\1\160\1\145\1\163\1\156\1\154\1\172\1\162\1\163\1\141\1\156\1\172\2\162\1\163\1\145\1\172\1\145\1\157\1\145\1\uffff\1\141\1\172\1\151\1\144\1\uffff\1\172\1\163\1\151\1\172\1\uffff\1\172\1\167\1\155\1\143\1\uffff\1\156\1\163\1\uffff\1\172\1\164\2\uffff\1\156\1\172\1\164\1\163\1\172\1\uffff\1\145\1\172\1\uffff\2\172\1\uffff\1\172\4\uffff";
    static final String DFA12_acceptS =
        "\6\uffff\1\6\1\7\1\10\1\11\1\uffff\1\15\1\16\1\uffff\1\22\1\23\1\uffff\1\25\2\uffff\1\32\1\34\2\uffff\1\40\1\uffff\1\42\1\43\3\uffff\1\47\1\uffff\1\52\1\53\1\uffff\1\43\1\33\1\2\6\uffff\1\6\1\7\1\10\1\11\1\uffff\1\15\1\16\1\uffff\1\22\1\23\1\24\1\35\1\27\1\25\1\31\1\26\1\uffff\1\32\1\34\2\uffff\1\40\1\uffff\1\42\1\50\1\uffff\1\44\1\45\1\46\1\47\1\51\1\52\35\uffff\1\21\4\uffff\1\12\4\uffff\1\36\4\uffff\1\4\2\uffff\1\20\2\uffff\1\30\1\37\5\uffff\1\14\2\uffff\1\1\2\uffff\1\5\1\uffff\1\41\1\3\1\13\1\17";
    static final String DFA12_specialS =
        "\1\2\34\uffff\1\0\1\1\163\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\21\1\35\2\42\1\37\1\42\1\36\1\16\1\17\1\25\1\22\1\6\1\30\1\2\1\40\12\34\1\20\1\10\1\42\1\24\1\42\1\32\1\42\32\33\1\13\1\42\1\14\1\42\1\33\1\42\1\3\1\33\1\4\1\33\1\5\1\27\10\33\1\15\1\1\1\33\1\12\1\23\1\26\1\31\5\33\1\7\1\42\1\11\uff82\42",
            "\1\43",
            "\1\45",
            "\1\47",
            "\1\50\2\uffff\1\51",
            "\1\53\3\uffff\1\54\5\uffff\1\52",
            "",
            "",
            "",
            "",
            "\1\61",
            "",
            "",
            "\1\64",
            "",
            "",
            "\1\67\14\uffff\1\70",
            "",
            "\1\73",
            "\1\75",
            "",
            "",
            "\1\100",
            "\1\101",
            "",
            "\1\103",
            "",
            "",
            "\12\106\13\uffff\1\107\37\uffff\1\107",
            "\0\110",
            "\0\111",
            "",
            "\1\113\4\uffff\1\112",
            "",
            "",
            "\1\116\11\uffff\1\115",
            "",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "",
            "",
            "",
            "\1\125",
            "",
            "",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\127",
            "",
            "",
            "\1\130",
            "\1\131",
            "",
            "\1\132",
            "",
            "",
            "\12\106\13\uffff\1\107\37\uffff\1\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\172",
            "\1\173",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\175",
            "\1\176",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0087",
            "",
            "",
            "\1\u0088",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008a",
            "\1\u008b",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u008d",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_ID | RULE_EXPONENTIAL | RULE_STRING | RULE_QUOTED_ID | RULE_SL_COMMENT | RULE_INT | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_29 = input.LA(1);

                        s = -1;
                        if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFF')) ) {s = 72;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 73;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='p') ) {s = 1;}

                        else if ( (LA12_0=='.') ) {s = 2;}

                        else if ( (LA12_0=='a') ) {s = 3;}

                        else if ( (LA12_0=='c') ) {s = 4;}

                        else if ( (LA12_0=='e') ) {s = 5;}

                        else if ( (LA12_0==',') ) {s = 6;}

                        else if ( (LA12_0=='{') ) {s = 7;}

                        else if ( (LA12_0==';') ) {s = 8;}

                        else if ( (LA12_0=='}') ) {s = 9;}

                        else if ( (LA12_0=='r') ) {s = 10;}

                        else if ( (LA12_0=='[') ) {s = 11;}

                        else if ( (LA12_0==']') ) {s = 12;}

                        else if ( (LA12_0=='o') ) {s = 13;}

                        else if ( (LA12_0=='(') ) {s = 14;}

                        else if ( (LA12_0==')') ) {s = 15;}

                        else if ( (LA12_0==':') ) {s = 16;}

                        else if ( (LA12_0=='!') ) {s = 17;}

                        else if ( (LA12_0=='+') ) {s = 18;}

                        else if ( (LA12_0=='s') ) {s = 19;}

                        else if ( (LA12_0=='=') ) {s = 20;}

                        else if ( (LA12_0=='*') ) {s = 21;}

                        else if ( (LA12_0=='t') ) {s = 22;}

                        else if ( (LA12_0=='f') ) {s = 23;}

                        else if ( (LA12_0=='-') ) {s = 24;}

                        else if ( (LA12_0=='u') ) {s = 25;}

                        else if ( (LA12_0=='?') ) {s = 26;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='d'||(LA12_0>='g' && LA12_0<='n')||LA12_0=='q'||(LA12_0>='v' && LA12_0<='z')) ) {s = 27;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 28;}

                        else if ( (LA12_0=='\"') ) {s = 29;}

                        else if ( (LA12_0=='\'') ) {s = 30;}

                        else if ( (LA12_0=='%') ) {s = 31;}

                        else if ( (LA12_0=='/') ) {s = 32;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 33;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||LA12_0=='&'||LA12_0=='<'||LA12_0=='>'||LA12_0=='@'||LA12_0=='\\'||LA12_0=='^'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}