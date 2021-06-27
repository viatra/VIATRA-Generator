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
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int RULE_QUOTED_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:42:7: ( 'e' )
            // InternalProblem.g:42:9: 'e'
            {
            match('e'); 

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
            // InternalProblem.g:43:7: ( 'E' )
            // InternalProblem.g:43:9: 'E'
            {
            match('E'); 

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
            // InternalProblem.g:44:7: ( '-' )
            // InternalProblem.g:44:9: '-'
            {
            match('-'); 

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
            // InternalProblem.g:45:7: ( 'unknown' )
            // InternalProblem.g:45:9: 'unknown'
            {
            match("unknown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:46:7: ( '?' )
            // InternalProblem.g:46:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2478:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalProblem.g:2478:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalProblem.g:2478:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2480:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalProblem.g:2480:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalProblem.g:2480:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalProblem.g:2480:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalProblem.g:2480:27: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop2;
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
            // InternalProblem.g:2482:16: ( '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalProblem.g:2482:18: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalProblem.g:2482:23: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalProblem.g:2482:24: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalProblem.g:2482:31: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop3;
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
            // InternalProblem.g:2484:17: ( ( '%' | '//' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalProblem.g:2484:19: ( '%' | '//' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // InternalProblem.g:2484:19: ( '%' | '//' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='%') ) {
                alt4=1;
            }
            else if ( (LA4_0=='/') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalProblem.g:2484:20: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 2 :
                    // InternalProblem.g:2484:24: '//'
                    {
                    match("//"); 


                    }
                    break;

            }

            // InternalProblem.g:2484:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalProblem.g:2484:30: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop5;
                }
            } while (true);

            // InternalProblem.g:2484:46: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProblem.g:2484:47: ( '\\r' )? '\\n'
                    {
                    // InternalProblem.g:2484:47: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalProblem.g:2484:47: '\\r'
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
            // InternalProblem.g:2486:10: ( ( '0' .. '9' )+ )
            // InternalProblem.g:2486:12: ( '0' .. '9' )+
            {
            // InternalProblem.g:2486:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProblem.g:2486:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // InternalProblem.g:2488:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalProblem.g:2488:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalProblem.g:2488:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProblem.g:2488:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalProblem.g:2490:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalProblem.g:2490:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalProblem.g:2490:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // InternalProblem.g:2492:16: ( . )
            // InternalProblem.g:2492:18: .
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
        // InternalProblem.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_ID | RULE_STRING | RULE_QUOTED_ID | RULE_SL_COMMENT | RULE_INT | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=44;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalProblem.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalProblem.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalProblem.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalProblem.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalProblem.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalProblem.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalProblem.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalProblem.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalProblem.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalProblem.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalProblem.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalProblem.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalProblem.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalProblem.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalProblem.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalProblem.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalProblem.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalProblem.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalProblem.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalProblem.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalProblem.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalProblem.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalProblem.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalProblem.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalProblem.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalProblem.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalProblem.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalProblem.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalProblem.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalProblem.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalProblem.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalProblem.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalProblem.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalProblem.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalProblem.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalProblem.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalProblem.g:1:226: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // InternalProblem.g:1:234: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // InternalProblem.g:1:246: RULE_QUOTED_ID
                {
                mRULE_QUOTED_ID(); 

                }
                break;
            case 40 :
                // InternalProblem.g:1:261: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // InternalProblem.g:1:277: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 42 :
                // InternalProblem.g:1:286: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 43 :
                // InternalProblem.g:1:302: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // InternalProblem.g:1:310: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\45\1\47\2\45\1\56\4\uffff\1\45\2\uffff\1\45\2\uffff\1\73\1\uffff\1\76\1\45\2\uffff\2\45\1\104\1\uffff\1\45\2\uffff\2\43\1\uffff\1\43\3\uffff\1\45\3\uffff\6\45\5\uffff\1\45\2\uffff\1\45\10\uffff\1\45\2\uffff\2\45\2\uffff\1\45\7\uffff\17\45\1\153\4\45\1\160\4\45\1\165\3\45\1\uffff\1\45\1\172\2\45\1\uffff\1\175\2\45\1\u0080\1\uffff\1\u0081\3\45\1\uffff\2\45\1\uffff\1\u0087\1\45\2\uffff\1\45\1\u008a\2\45\1\u008d\1\uffff\1\45\1\u008f\1\uffff\1\u0090\1\u0091\1\uffff\1\u0092\4\uffff";
    static final String DFA11_eofS =
        "\u0093\uffff";
    static final String DFA11_minS =
        "\1\0\1\162\1\56\1\142\1\154\1\60\4\uffff\1\145\2\uffff\1\160\2\uffff\1\55\1\uffff\1\75\1\143\2\uffff\1\162\1\141\1\60\1\uffff\1\156\2\uffff\2\0\1\uffff\1\52\3\uffff\1\145\3\uffff\1\163\1\141\1\156\1\164\1\165\1\162\5\uffff\1\146\2\uffff\1\160\10\uffff\1\157\2\uffff\1\165\1\154\2\uffff\1\153\7\uffff\1\142\1\144\1\164\1\163\1\164\1\145\1\155\1\157\1\145\1\157\1\160\1\145\1\163\1\156\1\154\1\60\1\162\1\163\1\141\1\156\1\60\2\162\1\163\1\145\1\60\1\145\1\157\1\145\1\uffff\1\141\1\60\1\151\1\144\1\uffff\1\60\1\163\1\151\1\60\1\uffff\1\60\1\167\1\155\1\143\1\uffff\1\156\1\163\1\uffff\1\60\1\164\2\uffff\1\156\1\60\1\164\1\163\1\60\1\uffff\1\145\1\60\1\uffff\2\60\1\uffff\1\60\4\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\162\1\56\1\142\1\157\1\172\4\uffff\1\145\2\uffff\1\160\2\uffff\1\72\1\uffff\1\75\1\143\2\uffff\1\162\1\141\1\172\1\uffff\1\156\2\uffff\2\uffff\1\uffff\1\57\3\uffff\1\157\3\uffff\1\163\1\141\1\156\1\164\1\165\1\162\5\uffff\1\146\2\uffff\1\160\10\uffff\1\157\2\uffff\1\165\1\154\2\uffff\1\153\7\uffff\1\142\1\144\1\164\1\163\1\164\1\145\1\155\1\157\1\145\1\157\1\160\1\145\1\163\1\156\1\154\1\172\1\162\1\163\1\141\1\156\1\172\2\162\1\163\1\145\1\172\1\145\1\157\1\145\1\uffff\1\141\1\172\1\151\1\144\1\uffff\1\172\1\163\1\151\1\172\1\uffff\1\172\1\167\1\155\1\143\1\uffff\1\156\1\163\1\uffff\1\172\1\164\2\uffff\1\156\1\172\1\164\1\163\1\172\1\uffff\1\145\1\172\1\uffff\2\172\1\uffff\1\172\4\uffff";
    static final String DFA11_acceptS =
        "\6\uffff\1\6\1\7\1\10\1\11\1\uffff\1\15\1\16\1\uffff\1\22\1\23\1\uffff\1\25\2\uffff\1\32\1\34\3\uffff\1\42\1\uffff\1\44\1\45\2\uffff\1\50\1\uffff\1\51\1\53\1\54\1\uffff\1\45\1\33\1\2\6\uffff\1\40\1\6\1\7\1\10\1\11\1\uffff\1\15\1\16\1\uffff\1\22\1\23\1\24\1\35\1\27\1\25\1\31\1\26\1\uffff\1\32\1\34\2\uffff\1\41\1\42\1\uffff\1\44\1\46\1\47\1\50\1\52\1\51\1\53\35\uffff\1\21\4\uffff\1\12\4\uffff\1\36\4\uffff\1\4\2\uffff\1\20\2\uffff\1\30\1\37\5\uffff\1\14\2\uffff\1\1\2\uffff\1\5\1\uffff\1\43\1\3\1\13\1\17";
    static final String DFA11_specialS =
        "\1\1\34\uffff\1\2\1\0\164\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\21\1\35\2\43\1\37\1\43\1\36\1\16\1\17\1\25\1\22\1\6\1\31\1\2\1\40\12\41\1\20\1\10\1\43\1\24\1\43\1\33\1\43\4\34\1\30\25\34\1\13\1\43\1\14\1\43\1\34\1\43\1\3\1\34\1\4\1\34\1\5\1\27\10\34\1\15\1\1\1\34\1\12\1\23\1\26\1\32\5\34\1\7\1\43\1\11\uff82\43",
            "\1\44",
            "\1\46",
            "\1\50",
            "\1\51\2\uffff\1\52",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\54\3\45\1\55\5\45\1\53\2\45",
            "",
            "",
            "",
            "",
            "\1\63",
            "",
            "",
            "\1\66",
            "",
            "",
            "\1\71\14\uffff\1\72",
            "",
            "\1\75",
            "\1\77",
            "",
            "",
            "\1\102",
            "\1\103",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\106",
            "",
            "",
            "\0\110",
            "\0\111",
            "",
            "\1\113\4\uffff\1\112",
            "",
            "",
            "",
            "\1\117\11\uffff\1\116",
            "",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "",
            "",
            "\1\127",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\130",
            "",
            "",
            "\1\131",
            "\1\132",
            "",
            "",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\1\152",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\173",
            "\1\174",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\176",
            "\1\177",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0088",
            "",
            "",
            "\1\u0089",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u008b",
            "\1\u008c",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u008e",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_ID | RULE_STRING | RULE_QUOTED_ID | RULE_SL_COMMENT | RULE_INT | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_30 = input.LA(1);

                        s = -1;
                        if ( ((LA11_30>='\u0000' && LA11_30<='\uFFFF')) ) {s = 73;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='p') ) {s = 1;}

                        else if ( (LA11_0=='.') ) {s = 2;}

                        else if ( (LA11_0=='a') ) {s = 3;}

                        else if ( (LA11_0=='c') ) {s = 4;}

                        else if ( (LA11_0=='e') ) {s = 5;}

                        else if ( (LA11_0==',') ) {s = 6;}

                        else if ( (LA11_0=='{') ) {s = 7;}

                        else if ( (LA11_0==';') ) {s = 8;}

                        else if ( (LA11_0=='}') ) {s = 9;}

                        else if ( (LA11_0=='r') ) {s = 10;}

                        else if ( (LA11_0=='[') ) {s = 11;}

                        else if ( (LA11_0==']') ) {s = 12;}

                        else if ( (LA11_0=='o') ) {s = 13;}

                        else if ( (LA11_0=='(') ) {s = 14;}

                        else if ( (LA11_0==')') ) {s = 15;}

                        else if ( (LA11_0==':') ) {s = 16;}

                        else if ( (LA11_0=='!') ) {s = 17;}

                        else if ( (LA11_0=='+') ) {s = 18;}

                        else if ( (LA11_0=='s') ) {s = 19;}

                        else if ( (LA11_0=='=') ) {s = 20;}

                        else if ( (LA11_0=='*') ) {s = 21;}

                        else if ( (LA11_0=='t') ) {s = 22;}

                        else if ( (LA11_0=='f') ) {s = 23;}

                        else if ( (LA11_0=='E') ) {s = 24;}

                        else if ( (LA11_0=='-') ) {s = 25;}

                        else if ( (LA11_0=='u') ) {s = 26;}

                        else if ( (LA11_0=='?') ) {s = 27;}

                        else if ( ((LA11_0>='A' && LA11_0<='D')||(LA11_0>='F' && LA11_0<='Z')||LA11_0=='_'||LA11_0=='b'||LA11_0=='d'||(LA11_0>='g' && LA11_0<='n')||LA11_0=='q'||(LA11_0>='v' && LA11_0<='z')) ) {s = 28;}

                        else if ( (LA11_0=='\"') ) {s = 29;}

                        else if ( (LA11_0=='\'') ) {s = 30;}

                        else if ( (LA11_0=='%') ) {s = 31;}

                        else if ( (LA11_0=='/') ) {s = 32;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 33;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 34;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||(LA11_0>='#' && LA11_0<='$')||LA11_0=='&'||LA11_0=='<'||LA11_0=='>'||LA11_0=='@'||LA11_0=='\\'||LA11_0=='^'||LA11_0=='`'||LA11_0=='|'||(LA11_0>='~' && LA11_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_29 = input.LA(1);

                        s = -1;
                        if ( ((LA11_29>='\u0000' && LA11_29<='\uFFFF')) ) {s = 72;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}