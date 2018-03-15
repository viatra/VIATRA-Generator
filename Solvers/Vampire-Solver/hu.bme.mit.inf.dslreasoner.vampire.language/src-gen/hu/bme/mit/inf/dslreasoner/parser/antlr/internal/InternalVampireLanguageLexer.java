package hu.bme.mit.inf.dslreasoner.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVampireLanguageLexer extends Lexer {
    public static final int RULE_UNSIGNED_RAT_ID=20;
    public static final int T__50=50;
    public static final int RULE_SIGN=16;
    public static final int T__59=59;
    public static final int RULE_SIGNED_LITERAL=7;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_DOUBLE_QUOTE=14;
    public static final int T__52=52;
    public static final int RULE_LITERAL=6;
    public static final int T__53=53;
    public static final int RULE_UNSIGNED_REAL_FRAC_ID=18;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=22;
    public static final int RULE_SINGLE_QUOTE=4;
    public static final int RULE_SINGLE_COMMENT=8;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=24;
    public static final int T__67=67;
    public static final int RULE_SIGNED_RAT_ID=13;
    public static final int T__68=68;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_LOWER_WORD_ID=5;
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
    public static final int RULE_UPPER_WORD_ID=11;
    public static final int RULE_WS=26;
    public static final int RULE_DOLLAR_ID=9;
    public static final int RULE_ALPHA_NUMERIC=15;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_DOUBLE_DOLLAR_ID=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SIGNED_REAL_ID=12;
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
            // InternalVampireLanguage.g:11:7: ( 'include(' )
            // InternalVampireLanguage.g:11:9: 'include('
            {
            match("include("); 


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
            // InternalVampireLanguage.g:12:7: ( ',[' )
            // InternalVampireLanguage.g:12:9: ',['
            {
            match(",["); 


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
            // InternalVampireLanguage.g:13:7: ( ',' )
            // InternalVampireLanguage.g:13:9: ','
            {
            match(','); 

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
            // InternalVampireLanguage.g:14:7: ( ']' )
            // InternalVampireLanguage.g:14:9: ']'
            {
            match(']'); 

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
            // InternalVampireLanguage.g:15:7: ( 'fof' )
            // InternalVampireLanguage.g:15:9: 'fof'
            {
            match("fof"); 


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
            // InternalVampireLanguage.g:16:7: ( '(' )
            // InternalVampireLanguage.g:16:9: '('
            {
            match('('); 

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
            // InternalVampireLanguage.g:17:7: ( ')' )
            // InternalVampireLanguage.g:17:9: ')'
            {
            match(')'); 

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
            // InternalVampireLanguage.g:18:7: ( '.' )
            // InternalVampireLanguage.g:18:9: '.'
            {
            match('.'); 

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
            // InternalVampireLanguage.g:19:7: ( 'axiom' )
            // InternalVampireLanguage.g:19:9: 'axiom'
            {
            match("axiom"); 


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
            // InternalVampireLanguage.g:20:7: ( 'conjecture' )
            // InternalVampireLanguage.g:20:9: 'conjecture'
            {
            match("conjecture"); 


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
            // InternalVampireLanguage.g:21:7: ( 'hypothesis' )
            // InternalVampireLanguage.g:21:9: 'hypothesis'
            {
            match("hypothesis"); 


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
            // InternalVampireLanguage.g:22:7: ( 'definition' )
            // InternalVampireLanguage.g:22:9: 'definition'
            {
            match("definition"); 


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
            // InternalVampireLanguage.g:23:7: ( 'assumption' )
            // InternalVampireLanguage.g:23:9: 'assumption'
            {
            match("assumption"); 


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
            // InternalVampireLanguage.g:24:7: ( 'lemma' )
            // InternalVampireLanguage.g:24:9: 'lemma'
            {
            match("lemma"); 


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
            // InternalVampireLanguage.g:25:7: ( 'theorem' )
            // InternalVampireLanguage.g:25:9: 'theorem'
            {
            match("theorem"); 


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
            // InternalVampireLanguage.g:26:7: ( 'corollary' )
            // InternalVampireLanguage.g:26:9: 'corollary'
            {
            match("corollary"); 


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
            // InternalVampireLanguage.g:27:7: ( 'negated_conjecture' )
            // InternalVampireLanguage.g:27:9: 'negated_conjecture'
            {
            match("negated_conjecture"); 


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
            // InternalVampireLanguage.g:28:7: ( 'plain' )
            // InternalVampireLanguage.g:28:9: 'plain'
            {
            match("plain"); 


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
            // InternalVampireLanguage.g:29:7: ( 'type' )
            // InternalVampireLanguage.g:29:9: 'type'
            {
            match("type"); 


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
            // InternalVampireLanguage.g:30:7: ( 'fi_domain' )
            // InternalVampireLanguage.g:30:9: 'fi_domain'
            {
            match("fi_domain"); 


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
            // InternalVampireLanguage.g:31:7: ( 'fi_functors' )
            // InternalVampireLanguage.g:31:9: 'fi_functors'
            {
            match("fi_functors"); 


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
            // InternalVampireLanguage.g:32:7: ( 'fi_predicates' )
            // InternalVampireLanguage.g:32:9: 'fi_predicates'
            {
            match("fi_predicates"); 


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
            // InternalVampireLanguage.g:33:7: ( 'unknown' )
            // InternalVampireLanguage.g:33:9: 'unknown'
            {
            match("unknown"); 


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
            // InternalVampireLanguage.g:34:7: ( '[' )
            // InternalVampireLanguage.g:34:9: '['
            {
            match('['); 

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
            // InternalVampireLanguage.g:35:7: ( '<=>' )
            // InternalVampireLanguage.g:35:9: '<=>'
            {
            match("<=>"); 


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
            // InternalVampireLanguage.g:36:7: ( '=>' )
            // InternalVampireLanguage.g:36:9: '=>'
            {
            match("=>"); 


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
            // InternalVampireLanguage.g:37:7: ( '<=' )
            // InternalVampireLanguage.g:37:9: '<='
            {
            match("<="); 


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
            // InternalVampireLanguage.g:38:7: ( '<~>' )
            // InternalVampireLanguage.g:38:9: '<~>'
            {
            match("<~>"); 


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
            // InternalVampireLanguage.g:39:7: ( '~|' )
            // InternalVampireLanguage.g:39:9: '~|'
            {
            match("~|"); 


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
            // InternalVampireLanguage.g:40:7: ( '~&' )
            // InternalVampireLanguage.g:40:9: '~&'
            {
            match("~&"); 


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
            // InternalVampireLanguage.g:41:7: ( '&' )
            // InternalVampireLanguage.g:41:9: '&'
            {
            match('&'); 

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
            // InternalVampireLanguage.g:42:7: ( '|' )
            // InternalVampireLanguage.g:42:9: '|'
            {
            match('|'); 

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
            // InternalVampireLanguage.g:43:7: ( '!' )
            // InternalVampireLanguage.g:43:9: '!'
            {
            match('!'); 

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
            // InternalVampireLanguage.g:44:7: ( ':' )
            // InternalVampireLanguage.g:44:9: ':'
            {
            match(':'); 

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
            // InternalVampireLanguage.g:45:7: ( '?' )
            // InternalVampireLanguage.g:45:9: '?'
            {
            match('?'); 

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
            // InternalVampireLanguage.g:46:7: ( '~' )
            // InternalVampireLanguage.g:46:9: '~'
            {
            match('~'); 

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
            // InternalVampireLanguage.g:47:7: ( '!=' )
            // InternalVampireLanguage.g:47:9: '!='
            {
            match("!="); 


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
            // InternalVampireLanguage.g:48:7: ( '=' )
            // InternalVampireLanguage.g:48:9: '='
            {
            match('='); 

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
            // InternalVampireLanguage.g:49:7: ( ':=' )
            // InternalVampireLanguage.g:49:9: ':='
            {
            match(":="); 


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
            // InternalVampireLanguage.g:50:7: ( '$true' )
            // InternalVampireLanguage.g:50:9: '$true'
            {
            match("$true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:51:7: ( '$false' )
            // InternalVampireLanguage.g:51:9: '$false'
            {
            match("$false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:52:7: ( '$less' )
            // InternalVampireLanguage.g:52:9: '$less'
            {
            match("$less"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "RULE_ALPHA_NUMERIC"
    public final void mRULE_ALPHA_NUMERIC() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:2625:29: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' ) )
            // InternalVampireLanguage.g:2625:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )
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
            // InternalVampireLanguage.g:2627:20: ( 'A' .. 'Z' ( RULE_ALPHA_NUMERIC )* )
            // InternalVampireLanguage.g:2627:22: 'A' .. 'Z' ( RULE_ALPHA_NUMERIC )*
            {
            matchRange('A','Z'); 
            // InternalVampireLanguage.g:2627:31: ( RULE_ALPHA_NUMERIC )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVampireLanguage.g:2627:31: RULE_ALPHA_NUMERIC
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
            // InternalVampireLanguage.g:2629:20: ( 'a' .. 'z' ( RULE_ALPHA_NUMERIC )* )
            // InternalVampireLanguage.g:2629:22: 'a' .. 'z' ( RULE_ALPHA_NUMERIC )*
            {
            matchRange('a','z'); 
            // InternalVampireLanguage.g:2629:31: ( RULE_ALPHA_NUMERIC )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVampireLanguage.g:2629:31: RULE_ALPHA_NUMERIC
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
            // InternalVampireLanguage.g:2631:19: ( '\"' ( '\\\\' ( '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalVampireLanguage.g:2631:21: '\"' ( '\\\\' ( '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalVampireLanguage.g:2631:25: ( '\\\\' ( '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalVampireLanguage.g:2631:26: '\\\\' ( '\"' | '\\\\' )
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
            	    // InternalVampireLanguage.g:2631:42: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalVampireLanguage.g:2633:19: ( '\\'' ( '\\\\' ( '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )+ '\\'' )
            // InternalVampireLanguage.g:2633:21: '\\'' ( '\\\\' ( '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )+ '\\''
            {
            match('\''); 
            // InternalVampireLanguage.g:2633:26: ( '\\\\' ( '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )+
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
            	    // InternalVampireLanguage.g:2633:27: '\\\\' ( '\\'' | '\\\\' )
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
            	    // InternalVampireLanguage.g:2633:44: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalVampireLanguage.g:2635:20: ( ( '+' | '-' ) )
            // InternalVampireLanguage.g:2635:22: ( '+' | '-' )
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
            // InternalVampireLanguage.g:2637:16: ( '$' RULE_LOWER_WORD_ID )
            // InternalVampireLanguage.g:2637:18: '$' RULE_LOWER_WORD_ID
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
            // InternalVampireLanguage.g:2639:23: ( '$$' RULE_LOWER_WORD_ID )
            // InternalVampireLanguage.g:2639:25: '$$' RULE_LOWER_WORD_ID
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
            int _type = RULE_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:2641:14: ( ( '0' | '1' .. '9' ( RULE_INT )? ) )
            // InternalVampireLanguage.g:2641:16: ( '0' | '1' .. '9' ( RULE_INT )? )
            {
            // InternalVampireLanguage.g:2641:16: ( '0' | '1' .. '9' ( RULE_INT )? )
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
                    // InternalVampireLanguage.g:2641:17: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:2641:21: '1' .. '9' ( RULE_INT )?
                    {
                    matchRange('1','9'); 
                    // InternalVampireLanguage.g:2641:30: ( RULE_INT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalVampireLanguage.g:2641:30: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;

                    }


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
    // $ANTLR end "RULE_LITERAL"

    // $ANTLR start "RULE_SIGNED_LITERAL"
    public final void mRULE_SIGNED_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:2643:21: ( ( RULE_SIGN )* RULE_LITERAL )
            // InternalVampireLanguage.g:2643:23: ( RULE_SIGN )* RULE_LITERAL
            {
            // InternalVampireLanguage.g:2643:23: ( RULE_SIGN )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='+'||LA7_0=='-') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVampireLanguage.g:2643:23: RULE_SIGN
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
            // InternalVampireLanguage.g:2645:37: ( RULE_LITERAL '.' RULE_INT )
            // InternalVampireLanguage.g:2645:39: RULE_LITERAL '.' RULE_INT
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
            // InternalVampireLanguage.g:2647:36: ( ( RULE_LITERAL | RULE_UNSIGNED_REAL_FRAC_ID ) 'Ee' ( RULE_SIGN )* RULE_INT )
            // InternalVampireLanguage.g:2647:38: ( RULE_LITERAL | RULE_UNSIGNED_REAL_FRAC_ID ) 'Ee' ( RULE_SIGN )* RULE_INT
            {
            // InternalVampireLanguage.g:2647:38: ( RULE_LITERAL | RULE_UNSIGNED_REAL_FRAC_ID )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalVampireLanguage.g:2647:39: RULE_LITERAL
                    {
                    mRULE_LITERAL(); 

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:2647:52: RULE_UNSIGNED_REAL_FRAC_ID
                    {
                    mRULE_UNSIGNED_REAL_FRAC_ID(); 

                    }
                    break;

            }

            match("Ee"); 

            // InternalVampireLanguage.g:2647:85: ( RULE_SIGN )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='+'||LA9_0=='-') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVampireLanguage.g:2647:85: RULE_SIGN
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
            // InternalVampireLanguage.g:2649:21: ( ( RULE_SIGN )* ( RULE_UNSIGNED_REAL_FRAC_ID | RULE_UNSIGNED_REAL_EXP_ID ) )
            // InternalVampireLanguage.g:2649:23: ( RULE_SIGN )* ( RULE_UNSIGNED_REAL_FRAC_ID | RULE_UNSIGNED_REAL_EXP_ID )
            {
            // InternalVampireLanguage.g:2649:23: ( RULE_SIGN )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='+'||LA10_0=='-') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVampireLanguage.g:2649:23: RULE_SIGN
            	    {
            	    mRULE_SIGN(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalVampireLanguage.g:2649:34: ( RULE_UNSIGNED_REAL_FRAC_ID | RULE_UNSIGNED_REAL_EXP_ID )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalVampireLanguage.g:2649:35: RULE_UNSIGNED_REAL_FRAC_ID
                    {
                    mRULE_UNSIGNED_REAL_FRAC_ID(); 

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:2649:62: RULE_UNSIGNED_REAL_EXP_ID
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
            // InternalVampireLanguage.g:2651:31: ( RULE_LITERAL '/' '1' .. '9' ( RULE_INT )? )
            // InternalVampireLanguage.g:2651:33: RULE_LITERAL '/' '1' .. '9' ( RULE_INT )?
            {
            mRULE_LITERAL(); 
            match('/'); 
            matchRange('1','9'); 
            // InternalVampireLanguage.g:2651:59: ( RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVampireLanguage.g:2651:59: RULE_INT
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
            // InternalVampireLanguage.g:2653:20: ( ( RULE_SIGN )* RULE_UNSIGNED_RAT_ID )
            // InternalVampireLanguage.g:2653:22: ( RULE_SIGN )* RULE_UNSIGNED_RAT_ID
            {
            // InternalVampireLanguage.g:2653:22: ( RULE_SIGN )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='+'||LA13_0=='-') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalVampireLanguage.g:2653:22: RULE_SIGN
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
            // InternalVampireLanguage.g:2655:25: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* '\\r' )
            // InternalVampireLanguage.g:2655:27: '%' (~ ( ( '\\n' | '\\r' ) ) )* '\\r'
            {
            match('%'); 
            // InternalVampireLanguage.g:2655:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVampireLanguage.g:2655:31: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalVampireLanguage.g:2657:21: ( RULE_ANY_OTHER )
            // InternalVampireLanguage.g:2657:23: RULE_ANY_OTHER
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
            // InternalVampireLanguage.g:2659:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalVampireLanguage.g:2659:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalVampireLanguage.g:2659:11: ( '^' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='^') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVampireLanguage.g:2659:11: '^'
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

            // InternalVampireLanguage.g:2659:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalVampireLanguage.g:2661:19: ( ( '0' .. '9' )+ )
            // InternalVampireLanguage.g:2661:21: ( '0' .. '9' )+
            {
            // InternalVampireLanguage.g:2661:21: ( '0' .. '9' )+
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
            	    // InternalVampireLanguage.g:2661:22: '0' .. '9'
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
            // InternalVampireLanguage.g:2663:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalVampireLanguage.g:2663:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalVampireLanguage.g:2663:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalVampireLanguage.g:2663:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalVampireLanguage.g:2663:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalVampireLanguage.g:2663:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVampireLanguage.g:2663:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalVampireLanguage.g:2663:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalVampireLanguage.g:2663:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalVampireLanguage.g:2663:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVampireLanguage.g:2663:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalVampireLanguage.g:2665:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalVampireLanguage.g:2665:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalVampireLanguage.g:2665:24: ( options {greedy=false; } : . )*
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
            	    // InternalVampireLanguage.g:2665:52: .
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
            // InternalVampireLanguage.g:2667:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalVampireLanguage.g:2667:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalVampireLanguage.g:2667:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalVampireLanguage.g:2667:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalVampireLanguage.g:2667:40: ( ( '\\r' )? '\\n' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVampireLanguage.g:2667:41: ( '\\r' )? '\\n'
                    {
                    // InternalVampireLanguage.g:2667:41: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalVampireLanguage.g:2667:41: '\\r'
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
            // InternalVampireLanguage.g:2669:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalVampireLanguage.g:2669:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalVampireLanguage.g:2669:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
        // InternalVampireLanguage.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | RULE_UPPER_WORD_ID | RULE_LOWER_WORD_ID | RULE_DOUBLE_QUOTE | RULE_SINGLE_QUOTE | RULE_DOLLAR_ID | RULE_DOUBLE_DOLLAR_ID | RULE_LITERAL | RULE_SIGNED_LITERAL | RULE_SIGNED_REAL_ID | RULE_SIGNED_RAT_ID | RULE_SINGLE_COMMENT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt26=58;
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
                // InternalVampireLanguage.g:1:250: T__67
                {
                mT__67(); 

                }
                break;
            case 42 :
                // InternalVampireLanguage.g:1:256: T__68
                {
                mT__68(); 

                }
                break;
            case 43 :
                // InternalVampireLanguage.g:1:262: RULE_UPPER_WORD_ID
                {
                mRULE_UPPER_WORD_ID(); 

                }
                break;
            case 44 :
                // InternalVampireLanguage.g:1:281: RULE_LOWER_WORD_ID
                {
                mRULE_LOWER_WORD_ID(); 

                }
                break;
            case 45 :
                // InternalVampireLanguage.g:1:300: RULE_DOUBLE_QUOTE
                {
                mRULE_DOUBLE_QUOTE(); 

                }
                break;
            case 46 :
                // InternalVampireLanguage.g:1:318: RULE_SINGLE_QUOTE
                {
                mRULE_SINGLE_QUOTE(); 

                }
                break;
            case 47 :
                // InternalVampireLanguage.g:1:336: RULE_DOLLAR_ID
                {
                mRULE_DOLLAR_ID(); 

                }
                break;
            case 48 :
                // InternalVampireLanguage.g:1:351: RULE_DOUBLE_DOLLAR_ID
                {
                mRULE_DOUBLE_DOLLAR_ID(); 

                }
                break;
            case 49 :
                // InternalVampireLanguage.g:1:373: RULE_LITERAL
                {
                mRULE_LITERAL(); 

                }
                break;
            case 50 :
                // InternalVampireLanguage.g:1:386: RULE_SIGNED_LITERAL
                {
                mRULE_SIGNED_LITERAL(); 

                }
                break;
            case 51 :
                // InternalVampireLanguage.g:1:406: RULE_SIGNED_REAL_ID
                {
                mRULE_SIGNED_REAL_ID(); 

                }
                break;
            case 52 :
                // InternalVampireLanguage.g:1:426: RULE_SIGNED_RAT_ID
                {
                mRULE_SIGNED_RAT_ID(); 

                }
                break;
            case 53 :
                // InternalVampireLanguage.g:1:445: RULE_SINGLE_COMMENT
                {
                mRULE_SINGLE_COMMENT(); 

                }
                break;
            case 54 :
                // InternalVampireLanguage.g:1:465: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 55 :
                // InternalVampireLanguage.g:1:473: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // InternalVampireLanguage.g:1:485: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 57 :
                // InternalVampireLanguage.g:1:501: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 58 :
                // InternalVampireLanguage.g:1:517: RULE_WS
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
            return "2647:38: ( RULE_LITERAL | RULE_UNSIGNED_REAL_FRAC_ID )";
        }
    }
    static final String DFA11_eotS =
        "\6\uffff\1\7\1\uffff";
    static final String DFA11_eofS =
        "\10\uffff";
    static final String DFA11_minS =
        "\1\60\2\56\1\60\1\uffff\1\56\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\71\2\105\1\71\1\uffff\2\105\1\uffff";
    static final String DFA11_acceptS =
        "\4\uffff\1\2\2\uffff\1\1";
    static final String DFA11_specialS =
        "\10\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\11\2",
            "\1\3\26\uffff\1\4",
            "\1\3\1\uffff\12\5\13\uffff\1\4",
            "\12\6",
            "",
            "\1\3\1\uffff\12\5\13\uffff\1\4",
            "\12\6\13\uffff\1\4",
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
            return "2649:34: ( RULE_UNSIGNED_REAL_FRAC_ID | RULE_UNSIGNED_REAL_EXP_ID )";
        }
    }
    static final String DFA26_eotS =
        "\1\uffff\1\50\1\52\1\uffff\1\50\3\uffff\11\50\2\uffff\1\73\1\76\2\uffff\1\100\1\102\2\uffff\1\111\1\50\2\uffff\2\120\5\uffff\2\50\3\uffff\15\50\1\150\12\uffff\3\107\2\uffff\1\111\12\uffff\1\120\2\160\2\uffff\1\50\1\163\15\50\2\uffff\3\107\5\uffff\1\160\1\50\1\uffff\13\50\1\u0093\3\50\3\107\1\uffff\4\50\1\u009e\5\50\1\u00a4\1\50\1\uffff\1\50\1\u00a7\1\50\1\u00a9\1\107\1\u00ab\4\50\1\uffff\5\50\1\uffff\2\50\1\uffff\1\50\1\uffff\1\u00b8\1\uffff\11\50\1\u00c2\1\50\1\u00c4\2\uffff\10\50\1\uffff\1\50\1\uffff\1\u00ce\4\50\1\u00d3\3\50\1\uffff\2\50\1\u00d9\1\u00da\1\uffff\1\u00db\1\u00dc\1\50\1\u00de\1\50\4\uffff\1\50\1\uffff\2\50\1\u00e3\1\50\1\uffff\4\50\1\u00e9\1\uffff";
    static final String DFA26_eofS =
        "\u00ea\uffff";
    static final String DFA26_minS =
        "\1\11\1\60\1\133\1\uffff\1\60\3\uffff\11\60\1\uffff\1\75\1\76\1\46\2\uffff\2\75\1\uffff\1\44\2\60\2\0\2\56\1\53\2\uffff\1\52\1\uffff\2\60\3\uffff\15\60\1\76\12\uffff\1\162\1\141\1\145\2\uffff\1\60\1\uffff\2\0\1\uffff\2\0\4\uffff\3\56\2\uffff\17\60\2\uffff\1\165\1\154\1\163\1\0\1\uffff\1\0\2\uffff\1\56\1\60\1\uffff\17\60\1\145\2\163\1\uffff\14\60\1\uffff\4\60\1\145\5\60\1\uffff\5\60\1\uffff\2\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\50\13\60\2\uffff\10\60\1\uffff\1\60\1\uffff\11\60\1\uffff\4\60\1\uffff\5\60\4\uffff\1\60\1\uffff\4\60\1\uffff\5\60\1\uffff";
    static final String DFA26_maxS =
        "\1\176\1\172\1\133\1\uffff\1\172\3\uffff\11\172\1\uffff\1\176\1\76\1\174\2\uffff\2\75\1\uffff\3\172\2\uffff\2\105\1\71\2\uffff\1\57\1\uffff\2\172\3\uffff\15\172\1\76\12\uffff\1\162\1\141\1\145\2\uffff\1\172\1\uffff\2\uffff\1\uffff\2\uffff\4\uffff\3\105\2\uffff\17\172\2\uffff\1\165\1\154\1\163\1\uffff\1\uffff\1\uffff\2\uffff\1\105\1\172\1\uffff\17\172\1\145\2\163\1\uffff\14\172\1\uffff\4\172\1\145\5\172\1\uffff\5\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\14\172\2\uffff\10\172\1\uffff\1\172\1\uffff\11\172\1\uffff\4\172\1\uffff\5\172\4\uffff\1\172\1\uffff\4\172\1\uffff\5\172\1\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\1\4\1\uffff\1\6\1\7\1\10\11\uffff\1\30\3\uffff\1\37\1\40\2\uffff\1\43\10\uffff\1\65\1\66\1\uffff\1\72\2\uffff\1\54\1\2\1\3\16\uffff\1\34\1\32\1\46\1\35\1\36\1\44\1\45\1\41\1\47\1\42\3\uffff\1\60\1\57\1\uffff\1\53\2\uffff\1\55\2\uffff\1\67\1\61\1\63\1\64\3\uffff\1\70\1\71\17\uffff\1\31\1\33\4\uffff\1\55\1\uffff\1\56\1\62\2\uffff\1\5\22\uffff\1\56\14\uffff\1\23\12\uffff\1\11\5\uffff\1\16\2\uffff\1\22\1\uffff\1\50\1\uffff\1\52\14\uffff\1\51\1\1\10\uffff\1\17\1\uffff\1\27\11\uffff\1\24\4\uffff\1\20\5\uffff\1\15\1\12\1\13\1\14\1\uffff\1\25\4\uffff\1\26\5\uffff\1\21";
    static final String DFA26_specialS =
        "\35\uffff\1\0\1\5\53\uffff\1\1\1\7\1\uffff\1\2\1\4\35\uffff\1\6\1\uffff\1\3\173\uffff}>";
    static final String[] DFA26_transitionS = {
            "\2\45\2\uffff\1\45\22\uffff\1\45\1\27\1\35\1\uffff\1\32\1\42\1\25\1\36\1\5\1\6\1\uffff\1\41\1\2\1\41\1\7\1\44\1\37\11\40\1\30\1\uffff\1\22\1\23\1\uffff\1\31\1\uffff\32\33\1\21\1\uffff\1\3\2\43\1\uffff\1\10\1\34\1\11\1\13\1\34\1\4\1\34\1\12\1\1\2\34\1\14\1\34\1\16\1\34\1\17\3\34\1\15\1\20\5\34\1\uffff\1\26\1\uffff\1\24",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\46\14\47",
            "\1\51",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\54\5\47\1\53\13\47",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\56\4\47\1\55\2\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\57\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\60\1\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\61\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\62\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\63\20\47\1\64\1\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\65\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\66\16\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\67\14\47",
            "",
            "\1\70\100\uffff\1\71",
            "\1\72",
            "\1\75\125\uffff\1\74",
            "",
            "",
            "\1\77",
            "\1\101",
            "",
            "\1\106\74\uffff\5\107\1\104\5\107\1\105\7\107\1\103\6\107",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\42\113\1\114\71\113\1\112\uffa3\113",
            "\47\116\1\117\64\116\1\115\uffa3\116",
            "\1\121\1\122\25\uffff\1\121",
            "\1\121\1\122\12\123\13\uffff\1\121",
            "\1\41\1\uffff\1\41\2\uffff\1\124\11\125",
            "",
            "",
            "\1\126\4\uffff\1\127",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\130\27\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\131\24\47",
            "\12\47\7\uffff\32\47\4\uffff\1\132\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\133\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\134\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\135\3\47\1\136\10\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\137\12\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\140\24\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\141\15\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\142\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\143\12\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\144\23\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\145\31\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\12\47\1\146\17\47",
            "\1\147",
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
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "\12\110\7\uffff\32\110\4\uffff\1\110\1\uffff\32\110",
            "",
            "\42\117\1\154\71\117\1\154\uffa3\117",
            "\42\113\1\114\71\113\1\112\uffa3\113",
            "",
            "\47\117\1\156\64\117\1\156\uffa3\117",
            "\47\116\1\157\64\116\1\115\uffa3\116",
            "",
            "",
            "",
            "",
            "\1\121\1\122\12\123\13\uffff\1\121",
            "\1\121\1\122\25\uffff\1\121",
            "\1\121\1\122\12\161\13\uffff\1\121",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\162\16\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\164\1\47\1\165\11\47\1\166\12\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\167\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\170\5\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\11\47\1\171\20\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\172\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\173\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\174\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\175\15\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\176\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\177\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0080\31\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0081\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0082\14\47",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\42\113\1\114\71\113\1\112\uffa3\113",
            "",
            "\47\116\1\157\64\116\1\115\uffa3\116",
            "",
            "",
            "\1\121\1\122\12\161\13\uffff\1\121",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u0087\5\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u0088\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u0089\5\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u008a\10\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u008b\15\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u008c\15\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u008d\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u008e\16\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u008f\6\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0090\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0091\31\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0092\10\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0094\6\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0095\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u0096\13\47",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u009a\26\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u009b\15\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u009c\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u009d\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u009f\12\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00a0\27\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00a1\16\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\u00a2\22\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00a3\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00a5\25\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00a6\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\26\47\1\u00a8\3\47",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\1\u00aa",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00ac\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00ad\31\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00ae\27\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u00af\26\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00b0\6\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00b1\6\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00b2\31\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00b3\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00b4\6\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u00b5\15\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u00b6\26\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00b7\14\47",
            "",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "",
            "\1\u00b9\7\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00ba\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00bb\6\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00bc\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00bd\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u00be\5\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00bf\10\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00c0\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00c1\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\u00c3\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00c5\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00c6\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00c7\27\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00c8\13\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00c9\10\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\u00ca\1\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00cb\21\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00cc\13\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00cd\27\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00cf\10\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00d0\31\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00d1\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00d2\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00d4\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00d5\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00d6\13\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00d7\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00d8\6\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00dd\14\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00df\25\47",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\11\47\1\u00e0\20\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00e1\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00e2\25\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00e4\27\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00e5\6\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u00e6\5\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00e7\10\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00e8\25\47",
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
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | RULE_UPPER_WORD_ID | RULE_LOWER_WORD_ID | RULE_DOUBLE_QUOTE | RULE_SINGLE_QUOTE | RULE_DOLLAR_ID | RULE_DOUBLE_DOLLAR_ID | RULE_LITERAL | RULE_SIGNED_LITERAL | RULE_SIGNED_REAL_ID | RULE_SIGNED_RAT_ID | RULE_SINGLE_COMMENT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_29 = input.LA(1);

                        s = -1;
                        if ( (LA26_29=='\\') ) {s = 74;}

                        else if ( ((LA26_29>='\u0000' && LA26_29<='!')||(LA26_29>='#' && LA26_29<='[')||(LA26_29>=']' && LA26_29<='\uFFFF')) ) {s = 75;}

                        else if ( (LA26_29=='\"') ) {s = 76;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_74 = input.LA(1);

                        s = -1;
                        if ( (LA26_74=='\"'||LA26_74=='\\') ) {s = 108;}

                        else if ( ((LA26_74>='\u0000' && LA26_74<='!')||(LA26_74>='#' && LA26_74<='[')||(LA26_74>=']' && LA26_74<='\uFFFF')) ) {s = 79;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_77 = input.LA(1);

                        s = -1;
                        if ( (LA26_77=='\''||LA26_77=='\\') ) {s = 110;}

                        else if ( ((LA26_77>='\u0000' && LA26_77<='&')||(LA26_77>='(' && LA26_77<='[')||(LA26_77>=']' && LA26_77<='\uFFFF')) ) {s = 79;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_110 = input.LA(1);

                        s = -1;
                        if ( (LA26_110=='\'') ) {s = 111;}

                        else if ( (LA26_110=='\\') ) {s = 77;}

                        else if ( ((LA26_110>='\u0000' && LA26_110<='&')||(LA26_110>='(' && LA26_110<='[')||(LA26_110>=']' && LA26_110<='\uFFFF')) ) {s = 78;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_78 = input.LA(1);

                        s = -1;
                        if ( (LA26_78=='\'') ) {s = 111;}

                        else if ( (LA26_78=='\\') ) {s = 77;}

                        else if ( ((LA26_78>='\u0000' && LA26_78<='&')||(LA26_78>='(' && LA26_78<='[')||(LA26_78>=']' && LA26_78<='\uFFFF')) ) {s = 78;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_30 = input.LA(1);

                        s = -1;
                        if ( (LA26_30=='\\') ) {s = 77;}

                        else if ( ((LA26_30>='\u0000' && LA26_30<='&')||(LA26_30>='(' && LA26_30<='[')||(LA26_30>=']' && LA26_30<='\uFFFF')) ) {s = 78;}

                        else if ( (LA26_30=='\'') ) {s = 79;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_108 = input.LA(1);

                        s = -1;
                        if ( (LA26_108=='\"') ) {s = 76;}

                        else if ( (LA26_108=='\\') ) {s = 74;}

                        else if ( ((LA26_108>='\u0000' && LA26_108<='!')||(LA26_108>='#' && LA26_108<='[')||(LA26_108>=']' && LA26_108<='\uFFFF')) ) {s = 75;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_75 = input.LA(1);

                        s = -1;
                        if ( (LA26_75=='\"') ) {s = 76;}

                        else if ( (LA26_75=='\\') ) {s = 74;}

                        else if ( ((LA26_75>='\u0000' && LA26_75<='!')||(LA26_75>='#' && LA26_75<='[')||(LA26_75>=']' && LA26_75<='\uFFFF')) ) {s = 75;}

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