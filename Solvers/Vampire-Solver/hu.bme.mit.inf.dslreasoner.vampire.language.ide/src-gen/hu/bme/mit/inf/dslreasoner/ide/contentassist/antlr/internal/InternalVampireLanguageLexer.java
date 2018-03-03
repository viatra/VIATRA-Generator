package hu.bme.mit.inf.dslreasoner.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVampireLanguageLexer extends Lexer {
    public static final int RULE_UNSIGNED_RAT_ID=20;
    public static final int T__50=50;
    public static final int RULE_SIGN=15;
    public static final int T__59=59;
    public static final int RULE_SIGNED_LITERAL=5;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_DOUBLE_QUOTE=13;
    public static final int T__52=52;
    public static final int RULE_LITERAL=17;
    public static final int T__53=53;
    public static final int RULE_UNSIGNED_REAL_FRAC_ID=18;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=22;
    public static final int RULE_SINGLE_QUOTE=6;
    public static final int RULE_SINGLE_COMMENT=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=16;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=24;
    public static final int RULE_SIGNED_RAT_ID=12;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_LOWER_WORD_ID=4;
    public static final int RULE_STRING=23;
    public static final int RULE_SL_COMMENT=25;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_UNSIGNED_REAL_EXP_ID=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_UPPER_WORD_ID=10;
    public static final int RULE_WS=26;
    public static final int RULE_DOLLAR_ID=7;
    public static final int RULE_ALPHA_NUMERIC=14;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_DOUBLE_DOLLAR_ID=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SIGNED_REAL_ID=11;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalVampireLanguageLexer() {;} 
    public InternalVampireLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalVampireLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalVampireLanguage.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:11:7: ( 'axiom' )
            // InternalVampireLanguage.g:11:9: 'axiom'
            {
            match("axiom"); 


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
            // InternalVampireLanguage.g:12:7: ( 'conjecture' )
            // InternalVampireLanguage.g:12:9: 'conjecture'
            {
            match("conjecture"); 


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
            // InternalVampireLanguage.g:13:7: ( 'hypothesis' )
            // InternalVampireLanguage.g:13:9: 'hypothesis'
            {
            match("hypothesis"); 


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
            // InternalVampireLanguage.g:14:7: ( 'definition' )
            // InternalVampireLanguage.g:14:9: 'definition'
            {
            match("definition"); 


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
            // InternalVampireLanguage.g:15:7: ( 'assumption' )
            // InternalVampireLanguage.g:15:9: 'assumption'
            {
            match("assumption"); 


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
            // InternalVampireLanguage.g:16:7: ( 'lemma' )
            // InternalVampireLanguage.g:16:9: 'lemma'
            {
            match("lemma"); 


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
            // InternalVampireLanguage.g:17:7: ( 'theorem' )
            // InternalVampireLanguage.g:17:9: 'theorem'
            {
            match("theorem"); 


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
            // InternalVampireLanguage.g:18:7: ( 'corollary' )
            // InternalVampireLanguage.g:18:9: 'corollary'
            {
            match("corollary"); 


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
            // InternalVampireLanguage.g:19:7: ( 'negated_conjecture' )
            // InternalVampireLanguage.g:19:9: 'negated_conjecture'
            {
            match("negated_conjecture"); 


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
            // InternalVampireLanguage.g:20:7: ( 'plain' )
            // InternalVampireLanguage.g:20:9: 'plain'
            {
            match("plain"); 


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
            // InternalVampireLanguage.g:21:7: ( 'type' )
            // InternalVampireLanguage.g:21:9: 'type'
            {
            match("type"); 


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
            // InternalVampireLanguage.g:22:7: ( 'fi_domain' )
            // InternalVampireLanguage.g:22:9: 'fi_domain'
            {
            match("fi_domain"); 


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
            // InternalVampireLanguage.g:23:7: ( 'fi_functors' )
            // InternalVampireLanguage.g:23:9: 'fi_functors'
            {
            match("fi_functors"); 


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
            // InternalVampireLanguage.g:24:7: ( 'fi_predicates' )
            // InternalVampireLanguage.g:24:9: 'fi_predicates'
            {
            match("fi_predicates"); 


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
            // InternalVampireLanguage.g:25:7: ( 'unknown' )
            // InternalVampireLanguage.g:25:9: 'unknown'
            {
            match("unknown"); 


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
            // InternalVampireLanguage.g:26:7: ( 'fof' )
            // InternalVampireLanguage.g:26:9: 'fof'
            {
            match("fof"); 


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
            // InternalVampireLanguage.g:27:7: ( '(' )
            // InternalVampireLanguage.g:27:9: '('
            {
            match('('); 

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
            // InternalVampireLanguage.g:28:7: ( ',' )
            // InternalVampireLanguage.g:28:9: ','
            {
            match(','); 

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
            // InternalVampireLanguage.g:29:7: ( ')' )
            // InternalVampireLanguage.g:29:9: ')'
            {
            match(')'); 

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
            // InternalVampireLanguage.g:30:7: ( '.' )
            // InternalVampireLanguage.g:30:9: '.'
            {
            match('.'); 

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
            // InternalVampireLanguage.g:31:7: ( '[' )
            // InternalVampireLanguage.g:31:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:32:7: ( ']' )
            // InternalVampireLanguage.g:32:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:33:7: ( '<=>' )
            // InternalVampireLanguage.g:33:9: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:34:7: ( '=>' )
            // InternalVampireLanguage.g:34:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:35:7: ( '<=' )
            // InternalVampireLanguage.g:35:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:36:7: ( '<~>' )
            // InternalVampireLanguage.g:36:9: '<~>'
            {
            match("<~>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:37:7: ( '~|' )
            // InternalVampireLanguage.g:37:9: '~|'
            {
            match("~|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:38:7: ( '~&' )
            // InternalVampireLanguage.g:38:9: '~&'
            {
            match("~&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:39:7: ( '&' )
            // InternalVampireLanguage.g:39:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:40:7: ( '|' )
            // InternalVampireLanguage.g:40:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:41:7: ( '!' )
            // InternalVampireLanguage.g:41:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:42:7: ( ':' )
            // InternalVampireLanguage.g:42:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:43:7: ( '?' )
            // InternalVampireLanguage.g:43:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:44:7: ( '~' )
            // InternalVampireLanguage.g:44:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:45:7: ( '!=' )
            // InternalVampireLanguage.g:45:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:46:7: ( '=' )
            // InternalVampireLanguage.g:46:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:47:7: ( ':=' )
            // InternalVampireLanguage.g:47:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:48:7: ( '$true' )
            // InternalVampireLanguage.g:48:9: '$true'
            {
            match("$true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:49:7: ( '$false' )
            // InternalVampireLanguage.g:49:9: '$false'
            {
            match("$false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:50:7: ( '$less' )
            // InternalVampireLanguage.g:50:9: '$less'
            {
            match("$less"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "RULE_ALPHA_NUMERIC"
    public final void mRULE_ALPHA_NUMERIC() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:5345:29: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' ) )
            // InternalVampireLanguage.g:5345:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHA_NUMERIC"

    // $ANTLR start "RULE_UPPER_WORD_ID"
    public final void mRULE_UPPER_WORD_ID() throws RecognitionException {
        try {
            int _type = RULE_UPPER_WORD_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5347:20: ( 'A' .. 'Z' ( RULE_ALPHA_NUMERIC )* )
            // InternalVampireLanguage.g:5347:22: 'A' .. 'Z' ( RULE_ALPHA_NUMERIC )*
            {
            matchRange('A','Z'); 
            // InternalVampireLanguage.g:5347:31: ( RULE_ALPHA_NUMERIC )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVampireLanguage.g:5347:31: RULE_ALPHA_NUMERIC
            	    {
            	    mRULE_ALPHA_NUMERIC(); 

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
    // $ANTLR end "RULE_UPPER_WORD_ID"

    // $ANTLR start "RULE_LOWER_WORD_ID"
    public final void mRULE_LOWER_WORD_ID() throws RecognitionException {
        try {
            int _type = RULE_LOWER_WORD_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5349:20: ( 'a' .. 'z' ( RULE_ALPHA_NUMERIC )* )
            // InternalVampireLanguage.g:5349:22: 'a' .. 'z' ( RULE_ALPHA_NUMERIC )*
            {
            matchRange('a','z'); 
            // InternalVampireLanguage.g:5349:31: ( RULE_ALPHA_NUMERIC )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVampireLanguage.g:5349:31: RULE_ALPHA_NUMERIC
            	    {
            	    mRULE_ALPHA_NUMERIC(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOWER_WORD_ID"

    // $ANTLR start "RULE_DOUBLE_QUOTE"
    public final void mRULE_DOUBLE_QUOTE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5351:19: ( '\"' ( '\\\\' ( '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalVampireLanguage.g:5351:21: '\"' ( '\\\\' ( '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalVampireLanguage.g:5351:25: ( '\\\\' ( '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalVampireLanguage.g:5351:26: '\\\\' ( '\"' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\\' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalVampireLanguage.g:5351:42: ~ ( ( '\\\\' | '\"' ) )
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
    // $ANTLR end "RULE_DOUBLE_QUOTE"

    // $ANTLR start "RULE_SINGLE_QUOTE"
    public final void mRULE_SINGLE_QUOTE() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5353:19: ( '\\'' ( '\\\\' ( '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )+ '\\'' )
            // InternalVampireLanguage.g:5353:21: '\\'' ( '\\\\' ( '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )+ '\\''
            {
            match('\''); 
            // InternalVampireLanguage.g:5353:26: ( '\\\\' ( '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )+
            int cnt4=0;
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
            	    // InternalVampireLanguage.g:5353:27: '\\\\' ( '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\''||input.LA(1)=='\\' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalVampireLanguage.g:5353:44: ~ ( ( '\\\\' | '\\'' ) )
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGLE_QUOTE"

    // $ANTLR start "RULE_SIGN"
    public final void mRULE_SIGN() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:5355:20: ( ( '+' | '-' ) )
            // InternalVampireLanguage.g:5355:22: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGN"

    // $ANTLR start "RULE_DOLLAR_ID"
    public final void mRULE_DOLLAR_ID() throws RecognitionException {
        try {
            int _type = RULE_DOLLAR_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5357:16: ( '$' RULE_LOWER_WORD_ID )
            // InternalVampireLanguage.g:5357:18: '$' RULE_LOWER_WORD_ID
            {
            match('$'); 
            mRULE_LOWER_WORD_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOLLAR_ID"

    // $ANTLR start "RULE_DOUBLE_DOLLAR_ID"
    public final void mRULE_DOUBLE_DOLLAR_ID() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_DOLLAR_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5359:23: ( '$$' RULE_LOWER_WORD_ID )
            // InternalVampireLanguage.g:5359:25: '$$' RULE_LOWER_WORD_ID
            {
            match("$$"); 

            mRULE_LOWER_WORD_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_DOLLAR_ID"

    // $ANTLR start "RULE_LITERAL"
    public final void mRULE_LITERAL() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:5361:23: ( ( '0' | '1' .. '9' ( RULE_INT )? ) )
            // InternalVampireLanguage.g:5361:25: ( '0' | '1' .. '9' ( RULE_INT )? )
            {
            // InternalVampireLanguage.g:5361:25: ( '0' | '1' .. '9' ( RULE_INT )? )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='0') ) {
                alt6=1;
            }
            else if ( ((LA6_0>='1' && LA6_0<='9')) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVampireLanguage.g:5361:26: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:5361:30: '1' .. '9' ( RULE_INT )?
                    {
                    matchRange('1','9'); 
                    // InternalVampireLanguage.g:5361:39: ( RULE_INT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalVampireLanguage.g:5361:39: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERAL"

    // $ANTLR start "RULE_SIGNED_LITERAL"
    public final void mRULE_SIGNED_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5363:21: ( ( RULE_SIGN )* RULE_LITERAL )
            // InternalVampireLanguage.g:5363:23: ( RULE_SIGN )* RULE_LITERAL
            {
            // InternalVampireLanguage.g:5363:23: ( RULE_SIGN )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='+'||LA7_0=='-') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVampireLanguage.g:5363:23: RULE_SIGN
            	    {
            	    mRULE_SIGN(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            mRULE_LITERAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_LITERAL"

    // $ANTLR start "RULE_UNSIGNED_REAL_FRAC_ID"
    public final void mRULE_UNSIGNED_REAL_FRAC_ID() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:5365:37: ( RULE_LITERAL '.' RULE_INT )
            // InternalVampireLanguage.g:5365:39: RULE_LITERAL '.' RULE_INT
            {
            mRULE_LITERAL(); 
            match('.'); 
            mRULE_INT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_REAL_FRAC_ID"

    // $ANTLR start "RULE_UNSIGNED_REAL_EXP_ID"
    public final void mRULE_UNSIGNED_REAL_EXP_ID() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:5367:36: ( ( RULE_LITERAL | RULE_UNSIGNED_REAL_FRAC_ID ) 'Ee' ( RULE_SIGN )* RULE_INT )
            // InternalVampireLanguage.g:5367:38: ( RULE_LITERAL | RULE_UNSIGNED_REAL_FRAC_ID ) 'Ee' ( RULE_SIGN )* RULE_INT
            {
            // InternalVampireLanguage.g:5367:38: ( RULE_LITERAL | RULE_UNSIGNED_REAL_FRAC_ID )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalVampireLanguage.g:5367:39: RULE_LITERAL
                    {
                    mRULE_LITERAL(); 

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:5367:52: RULE_UNSIGNED_REAL_FRAC_ID
                    {
                    mRULE_UNSIGNED_REAL_FRAC_ID(); 

                    }
                    break;

            }

            match("Ee"); 

            // InternalVampireLanguage.g:5367:85: ( RULE_SIGN )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='+'||LA9_0=='-') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVampireLanguage.g:5367:85: RULE_SIGN
            	    {
            	    mRULE_SIGN(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            mRULE_INT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_REAL_EXP_ID"

    // $ANTLR start "RULE_SIGNED_REAL_ID"
    public final void mRULE_SIGNED_REAL_ID() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_REAL_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5369:21: ( ( RULE_SIGN )* ( RULE_UNSIGNED_REAL_FRAC_ID | RULE_UNSIGNED_REAL_EXP_ID ) )
            // InternalVampireLanguage.g:5369:23: ( RULE_SIGN )* ( RULE_UNSIGNED_REAL_FRAC_ID | RULE_UNSIGNED_REAL_EXP_ID )
            {
            // InternalVampireLanguage.g:5369:23: ( RULE_SIGN )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='+'||LA10_0=='-') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVampireLanguage.g:5369:23: RULE_SIGN
            	    {
            	    mRULE_SIGN(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalVampireLanguage.g:5369:34: ( RULE_UNSIGNED_REAL_FRAC_ID | RULE_UNSIGNED_REAL_EXP_ID )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalVampireLanguage.g:5369:35: RULE_UNSIGNED_REAL_FRAC_ID
                    {
                    mRULE_UNSIGNED_REAL_FRAC_ID(); 

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:5369:62: RULE_UNSIGNED_REAL_EXP_ID
                    {
                    mRULE_UNSIGNED_REAL_EXP_ID(); 

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
    // $ANTLR end "RULE_SIGNED_REAL_ID"

    // $ANTLR start "RULE_UNSIGNED_RAT_ID"
    public final void mRULE_UNSIGNED_RAT_ID() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:5371:31: ( RULE_LITERAL '/' '1' .. '9' ( RULE_INT )? )
            // InternalVampireLanguage.g:5371:33: RULE_LITERAL '/' '1' .. '9' ( RULE_INT )?
            {
            mRULE_LITERAL(); 
            match('/'); 
            matchRange('1','9'); 
            // InternalVampireLanguage.g:5371:59: ( RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVampireLanguage.g:5371:59: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_RAT_ID"

    // $ANTLR start "RULE_SIGNED_RAT_ID"
    public final void mRULE_SIGNED_RAT_ID() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_RAT_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5373:20: ( ( RULE_SIGN )* RULE_UNSIGNED_RAT_ID )
            // InternalVampireLanguage.g:5373:22: ( RULE_SIGN )* RULE_UNSIGNED_RAT_ID
            {
            // InternalVampireLanguage.g:5373:22: ( RULE_SIGN )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='+'||LA13_0=='-') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalVampireLanguage.g:5373:22: RULE_SIGN
            	    {
            	    mRULE_SIGN(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            mRULE_UNSIGNED_RAT_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_RAT_ID"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:5375:25: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* '\\r' )
            // InternalVampireLanguage.g:5375:27: '%' (~ ( ( '\\n' | '\\r' ) ) )* '\\r'
            {
            match('%'); 
            // InternalVampireLanguage.g:5375:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVampireLanguage.g:5375:31: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            match('\r'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    // $ANTLR start "RULE_SINGLE_COMMENT"
    public final void mRULE_SINGLE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5377:21: ( RULE_ANY_OTHER )
            // InternalVampireLanguage.g:5377:23: RULE_ANY_OTHER
            {
            mRULE_ANY_OTHER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGLE_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5379:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalVampireLanguage.g:5379:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalVampireLanguage.g:5379:11: ( '^' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='^') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVampireLanguage.g:5379:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalVampireLanguage.g:5379:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalVampireLanguage.g:
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
            	    break loop16;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:5381:19: ( ( '0' .. '9' )+ )
            // InternalVampireLanguage.g:5381:21: ( '0' .. '9' )+
            {
            // InternalVampireLanguage.g:5381:21: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalVampireLanguage.g:5381:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5383:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalVampireLanguage.g:5383:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalVampireLanguage.g:5383:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\"') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\'') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalVampireLanguage.g:5383:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalVampireLanguage.g:5383:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='!')||(LA18_0>='#' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:5383:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVampireLanguage.g:5383:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop18;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:5383:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalVampireLanguage.g:5383:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:5383:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVampireLanguage.g:5383:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop19;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5385:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalVampireLanguage.g:5385:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalVampireLanguage.g:5385:24: ( options {greedy=false; } : . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='*') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='/') ) {
                        alt21=2;
                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<=')')||(LA21_0>='+' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalVampireLanguage.g:5385:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop21;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5387:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalVampireLanguage.g:5387:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalVampireLanguage.g:5387:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalVampireLanguage.g:5387:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop22;
                }
            } while (true);

            // InternalVampireLanguage.g:5387:40: ( ( '\\r' )? '\\n' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVampireLanguage.g:5387:41: ( '\\r' )? '\\n'
                    {
                    // InternalVampireLanguage.g:5387:41: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalVampireLanguage.g:5387:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:5389:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalVampireLanguage.g:5389:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalVampireLanguage.g:5389:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalVampireLanguage.g:
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalVampireLanguage.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_UPPER_WORD_ID | RULE_LOWER_WORD_ID | RULE_DOUBLE_QUOTE | RULE_SINGLE_QUOTE | RULE_DOLLAR_ID | RULE_DOUBLE_DOLLAR_ID | RULE_SIGNED_LITERAL | RULE_SIGNED_REAL_ID | RULE_SIGNED_RAT_ID | RULE_SINGLE_COMMENT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt26=55;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // InternalVampireLanguage.g:1:10: T__27
                {
                mT__27(); 

                }
                break;
            case 2 :
                // InternalVampireLanguage.g:1:16: T__28
                {
                mT__28(); 

                }
                break;
            case 3 :
                // InternalVampireLanguage.g:1:22: T__29
                {
                mT__29(); 

                }
                break;
            case 4 :
                // InternalVampireLanguage.g:1:28: T__30
                {
                mT__30(); 

                }
                break;
            case 5 :
                // InternalVampireLanguage.g:1:34: T__31
                {
                mT__31(); 

                }
                break;
            case 6 :
                // InternalVampireLanguage.g:1:40: T__32
                {
                mT__32(); 

                }
                break;
            case 7 :
                // InternalVampireLanguage.g:1:46: T__33
                {
                mT__33(); 

                }
                break;
            case 8 :
                // InternalVampireLanguage.g:1:52: T__34
                {
                mT__34(); 

                }
                break;
            case 9 :
                // InternalVampireLanguage.g:1:58: T__35
                {
                mT__35(); 

                }
                break;
            case 10 :
                // InternalVampireLanguage.g:1:64: T__36
                {
                mT__36(); 

                }
                break;
            case 11 :
                // InternalVampireLanguage.g:1:70: T__37
                {
                mT__37(); 

                }
                break;
            case 12 :
                // InternalVampireLanguage.g:1:76: T__38
                {
                mT__38(); 

                }
                break;
            case 13 :
                // InternalVampireLanguage.g:1:82: T__39
                {
                mT__39(); 

                }
                break;
            case 14 :
                // InternalVampireLanguage.g:1:88: T__40
                {
                mT__40(); 

                }
                break;
            case 15 :
                // InternalVampireLanguage.g:1:94: T__41
                {
                mT__41(); 

                }
                break;
            case 16 :
                // InternalVampireLanguage.g:1:100: T__42
                {
                mT__42(); 

                }
                break;
            case 17 :
                // InternalVampireLanguage.g:1:106: T__43
                {
                mT__43(); 

                }
                break;
            case 18 :
                // InternalVampireLanguage.g:1:112: T__44
                {
                mT__44(); 

                }
                break;
            case 19 :
                // InternalVampireLanguage.g:1:118: T__45
                {
                mT__45(); 

                }
                break;
            case 20 :
                // InternalVampireLanguage.g:1:124: T__46
                {
                mT__46(); 

                }
                break;
            case 21 :
                // InternalVampireLanguage.g:1:130: T__47
                {
                mT__47(); 

                }
                break;
            case 22 :
                // InternalVampireLanguage.g:1:136: T__48
                {
                mT__48(); 

                }
                break;
            case 23 :
                // InternalVampireLanguage.g:1:142: T__49
                {
                mT__49(); 

                }
                break;
            case 24 :
                // InternalVampireLanguage.g:1:148: T__50
                {
                mT__50(); 

                }
                break;
            case 25 :
                // InternalVampireLanguage.g:1:154: T__51
                {
                mT__51(); 

                }
                break;
            case 26 :
                // InternalVampireLanguage.g:1:160: T__52
                {
                mT__52(); 

                }
                break;
            case 27 :
                // InternalVampireLanguage.g:1:166: T__53
                {
                mT__53(); 

                }
                break;
            case 28 :
                // InternalVampireLanguage.g:1:172: T__54
                {
                mT__54(); 

                }
                break;
            case 29 :
                // InternalVampireLanguage.g:1:178: T__55
                {
                mT__55(); 

                }
                break;
            case 30 :
                // InternalVampireLanguage.g:1:184: T__56
                {
                mT__56(); 

                }
                break;
            case 31 :
                // InternalVampireLanguage.g:1:190: T__57
                {
                mT__57(); 

                }
                break;
            case 32 :
                // InternalVampireLanguage.g:1:196: T__58
                {
                mT__58(); 

                }
                break;
            case 33 :
                // InternalVampireLanguage.g:1:202: T__59
                {
                mT__59(); 

                }
                break;
            case 34 :
                // InternalVampireLanguage.g:1:208: T__60
                {
                mT__60(); 

                }
                break;
            case 35 :
                // InternalVampireLanguage.g:1:214: T__61
                {
                mT__61(); 

                }
                break;
            case 36 :
                // InternalVampireLanguage.g:1:220: T__62
                {
                mT__62(); 

                }
                break;
            case 37 :
                // InternalVampireLanguage.g:1:226: T__63
                {
                mT__63(); 

                }
                break;
            case 38 :
                // InternalVampireLanguage.g:1:232: T__64
                {
                mT__64(); 

                }
                break;
            case 39 :
                // InternalVampireLanguage.g:1:238: T__65
                {
                mT__65(); 

                }
                break;
            case 40 :
                // InternalVampireLanguage.g:1:244: T__66
                {
                mT__66(); 

                }
                break;
            case 41 :
                // InternalVampireLanguage.g:1:250: RULE_UPPER_WORD_ID
                {
                mRULE_UPPER_WORD_ID(); 

                }
                break;
            case 42 :
                // InternalVampireLanguage.g:1:269: RULE_LOWER_WORD_ID
                {
                mRULE_LOWER_WORD_ID(); 

                }
                break;
            case 43 :
                // InternalVampireLanguage.g:1:288: RULE_DOUBLE_QUOTE
                {
                mRULE_DOUBLE_QUOTE(); 

                }
                break;
            case 44 :
                // InternalVampireLanguage.g:1:306: RULE_SINGLE_QUOTE
                {
                mRULE_SINGLE_QUOTE(); 

                }
                break;
            case 45 :
                // InternalVampireLanguage.g:1:324: RULE_DOLLAR_ID
                {
                mRULE_DOLLAR_ID(); 

                }
                break;
            case 46 :
                // InternalVampireLanguage.g:1:339: RULE_DOUBLE_DOLLAR_ID
                {
                mRULE_DOUBLE_DOLLAR_ID(); 

                }
                break;
            case 47 :
                // InternalVampireLanguage.g:1:361: RULE_SIGNED_LITERAL
                {
                mRULE_SIGNED_LITERAL(); 

                }
                break;
            case 48 :
                // InternalVampireLanguage.g:1:381: RULE_SIGNED_REAL_ID
                {
                mRULE_SIGNED_REAL_ID(); 

                }
                break;
            case 49 :
                // InternalVampireLanguage.g:1:401: RULE_SIGNED_RAT_ID
                {
                mRULE_SIGNED_RAT_ID(); 

                }
                break;
            case 50 :
                // InternalVampireLanguage.g:1:420: RULE_SINGLE_COMMENT
                {
                mRULE_SINGLE_COMMENT(); 

                }
                break;
            case 51 :
                // InternalVampireLanguage.g:1:440: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 52 :
                // InternalVampireLanguage.g:1:448: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // InternalVampireLanguage.g:1:460: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 54 :
                // InternalVampireLanguage.g:1:476: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 55 :
                // InternalVampireLanguage.g:1:492: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA8_eotS =
        "\6\uffff";
    static final String DFA8_eofS =
        "\6\uffff";
    static final String DFA8_minS =
        "\1\60\2\56\2\uffff\1\56";
    static final String DFA8_maxS =
        "\1\71\2\105\2\uffff\1\105";
    static final String DFA8_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA8_specialS =
        "\6\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\11\2",
            "\1\3\26\uffff\1\4",
            "\1\3\1\uffff\12\5\13\uffff\1\4",
            "",
            "",
            "\1\3\1\uffff\12\5\13\uffff\1\4"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "5367:38: ( RULE_LITERAL | RULE_UNSIGNED_REAL_FRAC_ID )";
        }
    }
    static final String DFA11_eotS =
        "\6\uffff\1\7\1\uffff";
    static final String DFA11_eofS =
        "\10\uffff";
    static final String DFA11_minS =
        "\1\60\2\56\1\uffff\1\60\1\56\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\71\2\105\1\uffff\1\71\2\105\1\uffff";
    static final String DFA11_acceptS =
        "\3\uffff\1\2\3\uffff\1\1";
    static final String DFA11_specialS =
        "\10\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\11\2",
            "\1\4\26\uffff\1\3",
            "\1\4\1\uffff\12\5\13\uffff\1\3",
            "",
            "\12\6",
            "\1\4\1\uffff\12\5\13\uffff\1\3",
            "\12\6\13\uffff\1\3",
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
            return "5369:34: ( RULE_UNSIGNED_REAL_FRAC_ID | RULE_UNSIGNED_REAL_EXP_ID )";
        }
    }
    static final String DFA26_eotS =
        "\1\uffff\12\50\7\uffff\1\67\1\72\2\uffff\1\74\1\76\2\uffff\1\105\1\50\3\uffff\2\114\4\uffff\3\50\1\uffff\13\50\1\141\12\uffff\3\103\2\uffff\1\105\12\uffff\1\114\2\uffff\14\50\1\167\1\50\2\uffff\3\103\4\uffff\10\50\1\u0085\5\50\1\uffff\1\50\3\103\1\uffff\1\u008f\5\50\1\u0095\1\50\1\uffff\1\50\1\u0098\4\50\1\u009d\1\103\1\u009f\1\uffff\5\50\1\uffff\2\50\1\uffff\4\50\1\uffff\1\u00ab\1\uffff\5\50\1\u00b1\4\50\1\u00b6\1\uffff\5\50\1\uffff\4\50\1\uffff\2\50\1\u00c2\3\50\1\u00c6\2\50\1\u00c9\1\u00ca\1\uffff\1\u00cb\1\u00cc\1\50\1\uffff\2\50\4\uffff\1\50\1\u00d1\2\50\1\uffff\2\50\1\u00d6\1\50\1\uffff\3\50\1\u00db\1\uffff";
    static final String DFA26_eofS =
        "\u00dc\uffff";
    static final String DFA26_minS =
        "\1\11\12\60\6\uffff\1\75\1\76\1\46\2\uffff\2\75\1\uffff\1\44\2\60\2\0\1\53\2\56\2\uffff\1\52\1\uffff\3\60\1\uffff\13\60\1\76\12\uffff\1\162\1\141\1\145\2\uffff\1\60\1\uffff\2\0\1\uffff\2\0\4\uffff\1\56\2\uffff\16\60\2\uffff\1\165\1\154\1\163\1\0\1\uffff\1\0\1\uffff\16\60\1\uffff\1\60\1\145\2\163\1\uffff\10\60\1\uffff\7\60\1\145\1\60\1\uffff\5\60\1\uffff\2\60\1\uffff\4\60\1\uffff\1\60\1\uffff\13\60\1\uffff\5\60\1\uffff\4\60\1\uffff\13\60\1\uffff\3\60\1\uffff\2\60\4\uffff\4\60\1\uffff\4\60\1\uffff\4\60\1\uffff";
    static final String DFA26_maxS =
        "\1\176\12\172\6\uffff\1\176\1\76\1\174\2\uffff\2\75\1\uffff\3\172\2\uffff\1\71\2\105\2\uffff\1\57\1\uffff\3\172\1\uffff\13\172\1\76\12\uffff\1\162\1\141\1\145\2\uffff\1\172\1\uffff\2\uffff\1\uffff\2\uffff\4\uffff\1\105\2\uffff\16\172\2\uffff\1\165\1\154\1\163\1\uffff\1\uffff\1\uffff\1\uffff\16\172\1\uffff\1\172\1\145\2\163\1\uffff\10\172\1\uffff\7\172\1\145\1\172\1\uffff\5\172\1\uffff\2\172\1\uffff\4\172\1\uffff\1\172\1\uffff\13\172\1\uffff\5\172\1\uffff\4\172\1\uffff\13\172\1\uffff\3\172\1\uffff\2\172\4\uffff\4\172\1\uffff\4\172\1\uffff\4\172\1\uffff";
    static final String DFA26_acceptS =
        "\13\uffff\1\21\1\22\1\23\1\24\1\25\1\26\3\uffff\1\35\1\36\2\uffff\1\41\10\uffff\1\62\1\63\1\uffff\1\67\3\uffff\1\52\14\uffff\1\32\1\30\1\44\1\33\1\34\1\42\1\43\1\37\1\45\1\40\3\uffff\1\56\1\55\1\uffff\1\51\2\uffff\1\53\2\uffff\1\64\1\57\1\60\1\61\1\uffff\1\65\1\66\16\uffff\1\27\1\31\4\uffff\1\53\1\uffff\1\54\16\uffff\1\20\4\uffff\1\54\10\uffff\1\13\11\uffff\1\1\5\uffff\1\6\2\uffff\1\12\4\uffff\1\46\1\uffff\1\50\13\uffff\1\47\5\uffff\1\7\4\uffff\1\17\13\uffff\1\10\3\uffff\1\14\2\uffff\1\5\1\2\1\3\1\4\4\uffff\1\15\4\uffff\1\16\4\uffff\1\11";
    static final String DFA26_specialS =
        "\34\uffff\1\5\1\1\50\uffff\1\0\1\4\1\uffff\1\2\1\7\32\uffff\1\3\1\uffff\1\6\164\uffff}>";
    static final String[] DFA26_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\26\1\34\1\uffff\1\31\1\41\1\24\1\35\1\13\1\15\1\uffff\1\36\1\14\1\36\1\16\1\43\1\37\11\40\1\27\1\uffff\1\21\1\22\1\uffff\1\30\1\uffff\32\32\1\17\1\uffff\1\20\2\42\1\uffff\1\1\1\33\1\2\1\4\1\33\1\11\1\33\1\3\3\33\1\5\1\33\1\7\1\33\1\10\3\33\1\6\1\12\5\33\1\uffff\1\25\1\uffff\1\23",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\46\4\47\1\45\2\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\51\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\52\1\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\53\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\54\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\55\20\47\1\56\1\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\57\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\60\16\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\61\5\47\1\62\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\63\14\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64\100\uffff\1\65",
            "\1\66",
            "\1\71\125\uffff\1\70",
            "",
            "",
            "\1\73",
            "\1\75",
            "",
            "\1\102\74\uffff\5\103\1\100\5\103\1\101\7\103\1\77\6\103",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\42\107\1\110\71\107\1\106\uffa3\107",
            "\47\112\1\113\64\112\1\111\uffa3\112",
            "\1\36\1\uffff\1\36\2\uffff\1\37\11\40",
            "\1\115\1\116\25\uffff\1\115",
            "\1\115\1\116\12\117\13\uffff\1\115",
            "",
            "",
            "\1\120\4\uffff\1\121",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\122\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\123\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\124\3\47\1\125\10\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\126\12\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\127\24\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\130\15\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\131\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\132\12\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\133\23\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\134\31\47",
            "\12\47\7\uffff\32\47\4\uffff\1\135\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\136\24\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\12\47\1\137\17\47",
            "\1\140",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "",
            "\42\113\1\145\71\113\1\145\uffa3\113",
            "\42\107\1\110\71\107\1\106\uffa3\107",
            "",
            "\47\113\1\147\64\113\1\147\uffa3\113",
            "\47\112\1\150\64\112\1\111\uffa3\112",
            "",
            "",
            "",
            "",
            "\1\115\1\116\12\117\13\uffff\1\115",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\151\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\152\5\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\11\47\1\153\20\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\154\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\155\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\156\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\157\15\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\160\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\161\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\162\31\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\163\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\164\1\47\1\165\11\47\1\166\12\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\170\14\47",
            "",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\42\107\1\110\71\107\1\106\uffa3\107",
            "",
            "\47\112\1\150\64\112\1\111\uffa3\112",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\175\15\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\176\15\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\177\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0080\16\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0081\6\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0082\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0083\31\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0084\10\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0086\6\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0087\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u0088\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u0089\5\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u008a\10\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u008b\13\47",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u0090\12\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u0091\27\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0092\16\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\u0093\22\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0094\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0096\25\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0097\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u0099\15\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u009a\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u009b\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\26\47\1\u009c\3\47",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u009e",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00a0\6\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00a1\6\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00a2\31\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00a3\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00a4\6\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u00a5\15\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u00a6\26\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00a7\31\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00a8\27\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u00a9\26\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00aa\14\47",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00ac\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u00ad\5\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00ae\10\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00af\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00b0\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\u00b2\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00b3\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00b4\6\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00b5\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00b7\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00b8\10\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\u00b9\1\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00ba\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00bb\13\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00bc\27\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00bd\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00be\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00bf\27\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00c0\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00c1\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00c3\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00c4\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00c5\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00c7\10\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00c8\31\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00cd\14\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00ce\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00cf\6\47",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\11\47\1\u00d0\20\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00d2\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00d3\25\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00d4\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00d5\27\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00d7\6\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u00d8\5\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00d9\10\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00da\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_UPPER_WORD_ID | RULE_LOWER_WORD_ID | RULE_DOUBLE_QUOTE | RULE_SINGLE_QUOTE | RULE_DOLLAR_ID | RULE_DOUBLE_DOLLAR_ID | RULE_SIGNED_LITERAL | RULE_SIGNED_REAL_ID | RULE_SIGNED_RAT_ID | RULE_SINGLE_COMMENT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_70 = input.LA(1);

                        s = -1;
                        if ( (LA26_70=='\"'||LA26_70=='\\') ) {s = 101;}

                        else if ( ((LA26_70>='\u0000' && LA26_70<='!')||(LA26_70>='#' && LA26_70<='[')||(LA26_70>=']' && LA26_70<='\uFFFF')) ) {s = 75;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_29 = input.LA(1);

                        s = -1;
                        if ( (LA26_29=='\\') ) {s = 73;}

                        else if ( ((LA26_29>='\u0000' && LA26_29<='&')||(LA26_29>='(' && LA26_29<='[')||(LA26_29>=']' && LA26_29<='\uFFFF')) ) {s = 74;}

                        else if ( (LA26_29=='\'') ) {s = 75;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_73 = input.LA(1);

                        s = -1;
                        if ( (LA26_73=='\''||LA26_73=='\\') ) {s = 103;}

                        else if ( ((LA26_73>='\u0000' && LA26_73<='&')||(LA26_73>='(' && LA26_73<='[')||(LA26_73>=']' && LA26_73<='\uFFFF')) ) {s = 75;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_101 = input.LA(1);

                        s = -1;
                        if ( (LA26_101=='\"') ) {s = 72;}

                        else if ( (LA26_101=='\\') ) {s = 70;}

                        else if ( ((LA26_101>='\u0000' && LA26_101<='!')||(LA26_101>='#' && LA26_101<='[')||(LA26_101>=']' && LA26_101<='\uFFFF')) ) {s = 71;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_71 = input.LA(1);

                        s = -1;
                        if ( (LA26_71=='\"') ) {s = 72;}

                        else if ( (LA26_71=='\\') ) {s = 70;}

                        else if ( ((LA26_71>='\u0000' && LA26_71<='!')||(LA26_71>='#' && LA26_71<='[')||(LA26_71>=']' && LA26_71<='\uFFFF')) ) {s = 71;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_28 = input.LA(1);

                        s = -1;
                        if ( (LA26_28=='\\') ) {s = 70;}

                        else if ( ((LA26_28>='\u0000' && LA26_28<='!')||(LA26_28>='#' && LA26_28<='[')||(LA26_28>=']' && LA26_28<='\uFFFF')) ) {s = 71;}

                        else if ( (LA26_28=='\"') ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_103 = input.LA(1);

                        s = -1;
                        if ( (LA26_103=='\'') ) {s = 104;}

                        else if ( (LA26_103=='\\') ) {s = 73;}

                        else if ( ((LA26_103>='\u0000' && LA26_103<='&')||(LA26_103>='(' && LA26_103<='[')||(LA26_103>=']' && LA26_103<='\uFFFF')) ) {s = 74;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_74 = input.LA(1);

                        s = -1;
                        if ( (LA26_74=='\'') ) {s = 104;}

                        else if ( (LA26_74=='\\') ) {s = 73;}

                        else if ( ((LA26_74>='\u0000' && LA26_74<='&')||(LA26_74>='(' && LA26_74<='[')||(LA26_74>=']' && LA26_74<='\uFFFF')) ) {s = 74;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}