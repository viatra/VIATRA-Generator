package ca.mcgill.ecse.dslreasoner.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVampireLanguageLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_SIGN=14;
    public static final int T__59=59;
    public static final int RULE_SIGNED_LITERAL=7;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_DOUBLE_QUOTE=12;
    public static final int T__52=52;
    public static final int RULE_LITERAL=5;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=16;
    public static final int RULE_SINGLE_QUOTE=8;
    public static final int RULE_SINGLE_COMMENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=15;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_LOWER_WORD_ID=6;
    public static final int RULE_STRING=17;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_UPPER_WORD_ID=11;
    public static final int RULE_WS=20;
    public static final int RULE_DOLLAR_ID=9;
    public static final int RULE_ALPHA_NUMERIC=13;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_DOUBLE_DOLLAR_ID=10;
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

    public InternalVampireLanguageLexer() {;} 
    public InternalVampireLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalVampireLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalVampireLanguage.g"; }

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:11:7: ( 'Satisfiable!' )
            // InternalVampireLanguage.g:11:9: 'Satisfiable!'
            {
            match("Satisfiable!"); 


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
            // InternalVampireLanguage.g:12:7: ( 'WARNING!' )
            // InternalVampireLanguage.g:12:9: 'WARNING!'
            {
            match("WARNING!"); 


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
            // InternalVampireLanguage.g:13:7: ( 'Could' )
            // InternalVampireLanguage.g:13:9: 'Could'
            {
            match("Could"); 


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
            // InternalVampireLanguage.g:14:7: ( 'not' )
            // InternalVampireLanguage.g:14:9: 'not'
            {
            match("not"); 


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
            // InternalVampireLanguage.g:15:7: ( 'set' )
            // InternalVampireLanguage.g:15:9: 'set'
            {
            match("set"); 


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
            // InternalVampireLanguage.g:16:7: ( 'resource' )
            // InternalVampireLanguage.g:16:9: 'resource'
            {
            match("resource"); 


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
            // InternalVampireLanguage.g:17:7: ( 'limit:' )
            // InternalVampireLanguage.g:17:9: 'limit:'
            {
            match("limit:"); 


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
            // InternalVampireLanguage.g:18:7: ( 'Virtual' )
            // InternalVampireLanguage.g:18:9: 'Virtual'
            {
            match("Virtual"); 


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
            // InternalVampireLanguage.g:19:7: ( 'memory.' )
            // InternalVampireLanguage.g:19:9: 'memory.'
            {
            match("memory."); 


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
            // InternalVampireLanguage.g:20:7: ( 'TRYING' )
            // InternalVampireLanguage.g:20:9: 'TRYING'
            {
            match("TRYING"); 


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
            // InternalVampireLanguage.g:21:7: ( '[' )
            // InternalVampireLanguage.g:21:9: '['
            {
            match('['); 

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
            // InternalVampireLanguage.g:22:7: ( ']' )
            // InternalVampireLanguage.g:22:9: ']'
            {
            match(']'); 

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
            // InternalVampireLanguage.g:23:7: ( 'Finite' )
            // InternalVampireLanguage.g:23:9: 'Finite'
            {
            match("Finite"); 


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
            // InternalVampireLanguage.g:24:7: ( 'Model' )
            // InternalVampireLanguage.g:24:9: 'Model'
            {
            match("Model"); 


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
            // InternalVampireLanguage.g:25:7: ( 'Found!' )
            // InternalVampireLanguage.g:25:9: 'Found!'
            {
            match("Found!"); 


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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
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
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:31:7: ( 'tff' )
            // InternalVampireLanguage.g:31:9: 'tff'
            {
            match("tff"); 


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
            // InternalVampireLanguage.g:32:7: ( 'distinct_domain' )
            // InternalVampireLanguage.g:32:9: 'distinct_domain'
            {
            match("distinct_domain"); 


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
            // InternalVampireLanguage.g:33:7: ( 'finite_domain' )
            // InternalVampireLanguage.g:33:9: 'finite_domain'
            {
            match("finite_domain"); 


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
            // InternalVampireLanguage.g:34:7: ( 'declare_' )
            // InternalVampireLanguage.g:34:9: 'declare_'
            {
            match("declare_"); 


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
            // InternalVampireLanguage.g:35:7: ( 'axiom' )
            // InternalVampireLanguage.g:35:9: 'axiom'
            {
            match("axiom"); 


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
            // InternalVampireLanguage.g:36:7: ( 'conjecture' )
            // InternalVampireLanguage.g:36:9: 'conjecture'
            {
            match("conjecture"); 


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
            // InternalVampireLanguage.g:37:7: ( 'hypothesis' )
            // InternalVampireLanguage.g:37:9: 'hypothesis'
            {
            match("hypothesis"); 


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
            // InternalVampireLanguage.g:38:7: ( 'definition' )
            // InternalVampireLanguage.g:38:9: 'definition'
            {
            match("definition"); 


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
            // InternalVampireLanguage.g:39:7: ( 'assumption' )
            // InternalVampireLanguage.g:39:9: 'assumption'
            {
            match("assumption"); 


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
            // InternalVampireLanguage.g:40:7: ( 'lemma' )
            // InternalVampireLanguage.g:40:9: 'lemma'
            {
            match("lemma"); 


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
            // InternalVampireLanguage.g:41:7: ( 'theorem' )
            // InternalVampireLanguage.g:41:9: 'theorem'
            {
            match("theorem"); 


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
            // InternalVampireLanguage.g:42:7: ( 'corollary' )
            // InternalVampireLanguage.g:42:9: 'corollary'
            {
            match("corollary"); 


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
            // InternalVampireLanguage.g:43:7: ( 'negated_conjecture' )
            // InternalVampireLanguage.g:43:9: 'negated_conjecture'
            {
            match("negated_conjecture"); 


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
            // InternalVampireLanguage.g:44:7: ( 'plain' )
            // InternalVampireLanguage.g:44:9: 'plain'
            {
            match("plain"); 


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
            // InternalVampireLanguage.g:45:7: ( 'type' )
            // InternalVampireLanguage.g:45:9: 'type'
            {
            match("type"); 


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
            // InternalVampireLanguage.g:46:7: ( 'fi_domain' )
            // InternalVampireLanguage.g:46:9: 'fi_domain'
            {
            match("fi_domain"); 


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
            // InternalVampireLanguage.g:47:7: ( 'fi_functors' )
            // InternalVampireLanguage.g:47:9: 'fi_functors'
            {
            match("fi_functors"); 


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
            // InternalVampireLanguage.g:48:7: ( 'fi_predicates' )
            // InternalVampireLanguage.g:48:9: 'fi_predicates'
            {
            match("fi_predicates"); 


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
            // InternalVampireLanguage.g:49:7: ( 'unknown' )
            // InternalVampireLanguage.g:49:9: 'unknown'
            {
            match("unknown"); 


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
            // InternalVampireLanguage.g:50:7: ( ':' )
            // InternalVampireLanguage.g:50:9: ':'
            {
            match(':'); 

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
            // InternalVampireLanguage.g:51:7: ( '>' )
            // InternalVampireLanguage.g:51:9: '>'
            {
            match('>'); 

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
            // InternalVampireLanguage.g:52:7: ( '*' )
            // InternalVampireLanguage.g:52:9: '*'
            {
            match('*'); 

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
            // InternalVampireLanguage.g:53:7: ( '<=>' )
            // InternalVampireLanguage.g:53:9: '<=>'
            {
            match("<=>"); 


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
            // InternalVampireLanguage.g:54:7: ( '=>' )
            // InternalVampireLanguage.g:54:9: '=>'
            {
            match("=>"); 


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
            // InternalVampireLanguage.g:55:7: ( '<=' )
            // InternalVampireLanguage.g:55:9: '<='
            {
            match("<="); 


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
            // InternalVampireLanguage.g:56:7: ( '<~>' )
            // InternalVampireLanguage.g:56:9: '<~>'
            {
            match("<~>"); 


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
            // InternalVampireLanguage.g:57:7: ( '~|' )
            // InternalVampireLanguage.g:57:9: '~|'
            {
            match("~|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:58:7: ( '~&' )
            // InternalVampireLanguage.g:58:9: '~&'
            {
            match("~&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:59:7: ( '&' )
            // InternalVampireLanguage.g:59:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:60:7: ( '|' )
            // InternalVampireLanguage.g:60:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:61:7: ( '!' )
            // InternalVampireLanguage.g:61:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:62:7: ( '?' )
            // InternalVampireLanguage.g:62:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:63:7: ( '~' )
            // InternalVampireLanguage.g:63:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:64:7: ( '!=' )
            // InternalVampireLanguage.g:64:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:65:7: ( '=' )
            // InternalVampireLanguage.g:65:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:66:7: ( ':=' )
            // InternalVampireLanguage.g:66:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:67:7: ( '$true' )
            // InternalVampireLanguage.g:67:9: '$true'
            {
            match("$true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:68:7: ( '$false' )
            // InternalVampireLanguage.g:68:9: '$false'
            {
            match("$false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:69:7: ( '$less' )
            // InternalVampireLanguage.g:69:9: '$less'
            {
            match("$less"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "RULE_ALPHA_NUMERIC"
    public final void mRULE_ALPHA_NUMERIC() throws RecognitionException {
        try {
            // InternalVampireLanguage.g:2774:29: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' ) )
            // InternalVampireLanguage.g:2774:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )
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
            // InternalVampireLanguage.g:2776:20: ( 'A' .. 'Z' ( RULE_ALPHA_NUMERIC )* )
            // InternalVampireLanguage.g:2776:22: 'A' .. 'Z' ( RULE_ALPHA_NUMERIC )*
            {
            matchRange('A','Z'); 
            // InternalVampireLanguage.g:2776:31: ( RULE_ALPHA_NUMERIC )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVampireLanguage.g:2776:31: RULE_ALPHA_NUMERIC
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
            // InternalVampireLanguage.g:2778:20: ( 'a' .. 'z' ( RULE_ALPHA_NUMERIC )* )
            // InternalVampireLanguage.g:2778:22: 'a' .. 'z' ( RULE_ALPHA_NUMERIC )*
            {
            matchRange('a','z'); 
            // InternalVampireLanguage.g:2778:31: ( RULE_ALPHA_NUMERIC )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVampireLanguage.g:2778:31: RULE_ALPHA_NUMERIC
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
            // InternalVampireLanguage.g:2780:19: ( '\"' ( '\\\\' ( '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalVampireLanguage.g:2780:21: '\"' ( '\\\\' ( '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalVampireLanguage.g:2780:25: ( '\\\\' ( '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalVampireLanguage.g:2780:26: '\\\\' ( '\"' | '\\\\' )
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
            	    // InternalVampireLanguage.g:2780:42: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalVampireLanguage.g:2782:19: ( '\\'' ( '\\\\' ( '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )+ '\\'' )
            // InternalVampireLanguage.g:2782:21: '\\'' ( '\\\\' ( '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )+ '\\''
            {
            match('\''); 
            // InternalVampireLanguage.g:2782:26: ( '\\\\' ( '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )+
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
            	    // InternalVampireLanguage.g:2782:27: '\\\\' ( '\\'' | '\\\\' )
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
            	    // InternalVampireLanguage.g:2782:44: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalVampireLanguage.g:2784:20: ( ( '+' | '-' ) )
            // InternalVampireLanguage.g:2784:22: ( '+' | '-' )
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
            // InternalVampireLanguage.g:2786:16: ( '$' RULE_LOWER_WORD_ID )
            // InternalVampireLanguage.g:2786:18: '$' RULE_LOWER_WORD_ID
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
            // InternalVampireLanguage.g:2788:23: ( '$$' RULE_LOWER_WORD_ID )
            // InternalVampireLanguage.g:2788:25: '$$' RULE_LOWER_WORD_ID
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
            // InternalVampireLanguage.g:2790:14: ( ( '0' | '1' .. '9' ( RULE_INT )? ) )
            // InternalVampireLanguage.g:2790:16: ( '0' | '1' .. '9' ( RULE_INT )? )
            {
            // InternalVampireLanguage.g:2790:16: ( '0' | '1' .. '9' ( RULE_INT )? )
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
                    // InternalVampireLanguage.g:2790:17: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:2790:21: '1' .. '9' ( RULE_INT )?
                    {
                    matchRange('1','9'); 
                    // InternalVampireLanguage.g:2790:30: ( RULE_INT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalVampireLanguage.g:2790:30: RULE_INT
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
            // InternalVampireLanguage.g:2792:21: ( ( RULE_SIGN )* RULE_LITERAL )
            // InternalVampireLanguage.g:2792:23: ( RULE_SIGN )* RULE_LITERAL
            {
            // InternalVampireLanguage.g:2792:23: ( RULE_SIGN )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='+'||LA7_0=='-') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVampireLanguage.g:2792:23: RULE_SIGN
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

    // $ANTLR start "RULE_SINGLE_COMMENT"
    public final void mRULE_SINGLE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:2794:21: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalVampireLanguage.g:2794:23: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // InternalVampireLanguage.g:2794:27: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVampireLanguage.g:2794:27: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalVampireLanguage.g:2794:43: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVampireLanguage.g:2794:44: ( '\\r' )? '\\n'
                    {
                    // InternalVampireLanguage.g:2794:44: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalVampireLanguage.g:2794:44: '\\r'
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
    // $ANTLR end "RULE_SINGLE_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVampireLanguage.g:2796:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalVampireLanguage.g:2796:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalVampireLanguage.g:2796:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVampireLanguage.g:2796:11: '^'
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

            // InternalVampireLanguage.g:2796:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    break loop12;
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
            // InternalVampireLanguage.g:2798:19: ( ( '0' .. '9' )+ )
            // InternalVampireLanguage.g:2798:21: ( '0' .. '9' )+
            {
            // InternalVampireLanguage.g:2798:21: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalVampireLanguage.g:2798:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalVampireLanguage.g:2800:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalVampireLanguage.g:2800:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalVampireLanguage.g:2800:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalVampireLanguage.g:2800:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalVampireLanguage.g:2800:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:2800:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVampireLanguage.g:2800:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalVampireLanguage.g:2800:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalVampireLanguage.g:2800:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalVampireLanguage.g:2800:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVampireLanguage.g:2800:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop15;
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
            // InternalVampireLanguage.g:2802:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalVampireLanguage.g:2802:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalVampireLanguage.g:2802:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalVampireLanguage.g:2802:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // InternalVampireLanguage.g:2804:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalVampireLanguage.g:2804:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalVampireLanguage.g:2804:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalVampireLanguage.g:2804:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop18;
                }
            } while (true);

            // InternalVampireLanguage.g:2804:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVampireLanguage.g:2804:41: ( '\\r' )? '\\n'
                    {
                    // InternalVampireLanguage.g:2804:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalVampireLanguage.g:2804:41: '\\r'
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
            // InternalVampireLanguage.g:2806:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalVampireLanguage.g:2806:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalVampireLanguage.g:2806:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
            // InternalVampireLanguage.g:2808:16: ( . )
            // InternalVampireLanguage.g:2808:18: .
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
        // InternalVampireLanguage.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_UPPER_WORD_ID | RULE_LOWER_WORD_ID | RULE_DOUBLE_QUOTE | RULE_SINGLE_QUOTE | RULE_DOLLAR_ID | RULE_DOUBLE_DOLLAR_ID | RULE_LITERAL | RULE_SIGNED_LITERAL | RULE_SINGLE_COMMENT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=74;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalVampireLanguage.g:1:10: T__22
                {
                mT__22(); 

                }
                break;
            case 2 :
                // InternalVampireLanguage.g:1:16: T__23
                {
                mT__23(); 

                }
                break;
            case 3 :
                // InternalVampireLanguage.g:1:22: T__24
                {
                mT__24(); 

                }
                break;
            case 4 :
                // InternalVampireLanguage.g:1:28: T__25
                {
                mT__25(); 

                }
                break;
            case 5 :
                // InternalVampireLanguage.g:1:34: T__26
                {
                mT__26(); 

                }
                break;
            case 6 :
                // InternalVampireLanguage.g:1:40: T__27
                {
                mT__27(); 

                }
                break;
            case 7 :
                // InternalVampireLanguage.g:1:46: T__28
                {
                mT__28(); 

                }
                break;
            case 8 :
                // InternalVampireLanguage.g:1:52: T__29
                {
                mT__29(); 

                }
                break;
            case 9 :
                // InternalVampireLanguage.g:1:58: T__30
                {
                mT__30(); 

                }
                break;
            case 10 :
                // InternalVampireLanguage.g:1:64: T__31
                {
                mT__31(); 

                }
                break;
            case 11 :
                // InternalVampireLanguage.g:1:70: T__32
                {
                mT__32(); 

                }
                break;
            case 12 :
                // InternalVampireLanguage.g:1:76: T__33
                {
                mT__33(); 

                }
                break;
            case 13 :
                // InternalVampireLanguage.g:1:82: T__34
                {
                mT__34(); 

                }
                break;
            case 14 :
                // InternalVampireLanguage.g:1:88: T__35
                {
                mT__35(); 

                }
                break;
            case 15 :
                // InternalVampireLanguage.g:1:94: T__36
                {
                mT__36(); 

                }
                break;
            case 16 :
                // InternalVampireLanguage.g:1:100: T__37
                {
                mT__37(); 

                }
                break;
            case 17 :
                // InternalVampireLanguage.g:1:106: T__38
                {
                mT__38(); 

                }
                break;
            case 18 :
                // InternalVampireLanguage.g:1:112: T__39
                {
                mT__39(); 

                }
                break;
            case 19 :
                // InternalVampireLanguage.g:1:118: T__40
                {
                mT__40(); 

                }
                break;
            case 20 :
                // InternalVampireLanguage.g:1:124: T__41
                {
                mT__41(); 

                }
                break;
            case 21 :
                // InternalVampireLanguage.g:1:130: T__42
                {
                mT__42(); 

                }
                break;
            case 22 :
                // InternalVampireLanguage.g:1:136: T__43
                {
                mT__43(); 

                }
                break;
            case 23 :
                // InternalVampireLanguage.g:1:142: T__44
                {
                mT__44(); 

                }
                break;
            case 24 :
                // InternalVampireLanguage.g:1:148: T__45
                {
                mT__45(); 

                }
                break;
            case 25 :
                // InternalVampireLanguage.g:1:154: T__46
                {
                mT__46(); 

                }
                break;
            case 26 :
                // InternalVampireLanguage.g:1:160: T__47
                {
                mT__47(); 

                }
                break;
            case 27 :
                // InternalVampireLanguage.g:1:166: T__48
                {
                mT__48(); 

                }
                break;
            case 28 :
                // InternalVampireLanguage.g:1:172: T__49
                {
                mT__49(); 

                }
                break;
            case 29 :
                // InternalVampireLanguage.g:1:178: T__50
                {
                mT__50(); 

                }
                break;
            case 30 :
                // InternalVampireLanguage.g:1:184: T__51
                {
                mT__51(); 

                }
                break;
            case 31 :
                // InternalVampireLanguage.g:1:190: T__52
                {
                mT__52(); 

                }
                break;
            case 32 :
                // InternalVampireLanguage.g:1:196: T__53
                {
                mT__53(); 

                }
                break;
            case 33 :
                // InternalVampireLanguage.g:1:202: T__54
                {
                mT__54(); 

                }
                break;
            case 34 :
                // InternalVampireLanguage.g:1:208: T__55
                {
                mT__55(); 

                }
                break;
            case 35 :
                // InternalVampireLanguage.g:1:214: T__56
                {
                mT__56(); 

                }
                break;
            case 36 :
                // InternalVampireLanguage.g:1:220: T__57
                {
                mT__57(); 

                }
                break;
            case 37 :
                // InternalVampireLanguage.g:1:226: T__58
                {
                mT__58(); 

                }
                break;
            case 38 :
                // InternalVampireLanguage.g:1:232: T__59
                {
                mT__59(); 

                }
                break;
            case 39 :
                // InternalVampireLanguage.g:1:238: T__60
                {
                mT__60(); 

                }
                break;
            case 40 :
                // InternalVampireLanguage.g:1:244: T__61
                {
                mT__61(); 

                }
                break;
            case 41 :
                // InternalVampireLanguage.g:1:250: T__62
                {
                mT__62(); 

                }
                break;
            case 42 :
                // InternalVampireLanguage.g:1:256: T__63
                {
                mT__63(); 

                }
                break;
            case 43 :
                // InternalVampireLanguage.g:1:262: T__64
                {
                mT__64(); 

                }
                break;
            case 44 :
                // InternalVampireLanguage.g:1:268: T__65
                {
                mT__65(); 

                }
                break;
            case 45 :
                // InternalVampireLanguage.g:1:274: T__66
                {
                mT__66(); 

                }
                break;
            case 46 :
                // InternalVampireLanguage.g:1:280: T__67
                {
                mT__67(); 

                }
                break;
            case 47 :
                // InternalVampireLanguage.g:1:286: T__68
                {
                mT__68(); 

                }
                break;
            case 48 :
                // InternalVampireLanguage.g:1:292: T__69
                {
                mT__69(); 

                }
                break;
            case 49 :
                // InternalVampireLanguage.g:1:298: T__70
                {
                mT__70(); 

                }
                break;
            case 50 :
                // InternalVampireLanguage.g:1:304: T__71
                {
                mT__71(); 

                }
                break;
            case 51 :
                // InternalVampireLanguage.g:1:310: T__72
                {
                mT__72(); 

                }
                break;
            case 52 :
                // InternalVampireLanguage.g:1:316: T__73
                {
                mT__73(); 

                }
                break;
            case 53 :
                // InternalVampireLanguage.g:1:322: T__74
                {
                mT__74(); 

                }
                break;
            case 54 :
                // InternalVampireLanguage.g:1:328: T__75
                {
                mT__75(); 

                }
                break;
            case 55 :
                // InternalVampireLanguage.g:1:334: T__76
                {
                mT__76(); 

                }
                break;
            case 56 :
                // InternalVampireLanguage.g:1:340: T__77
                {
                mT__77(); 

                }
                break;
            case 57 :
                // InternalVampireLanguage.g:1:346: T__78
                {
                mT__78(); 

                }
                break;
            case 58 :
                // InternalVampireLanguage.g:1:352: T__79
                {
                mT__79(); 

                }
                break;
            case 59 :
                // InternalVampireLanguage.g:1:358: T__80
                {
                mT__80(); 

                }
                break;
            case 60 :
                // InternalVampireLanguage.g:1:364: RULE_UPPER_WORD_ID
                {
                mRULE_UPPER_WORD_ID(); 

                }
                break;
            case 61 :
                // InternalVampireLanguage.g:1:383: RULE_LOWER_WORD_ID
                {
                mRULE_LOWER_WORD_ID(); 

                }
                break;
            case 62 :
                // InternalVampireLanguage.g:1:402: RULE_DOUBLE_QUOTE
                {
                mRULE_DOUBLE_QUOTE(); 

                }
                break;
            case 63 :
                // InternalVampireLanguage.g:1:420: RULE_SINGLE_QUOTE
                {
                mRULE_SINGLE_QUOTE(); 

                }
                break;
            case 64 :
                // InternalVampireLanguage.g:1:438: RULE_DOLLAR_ID
                {
                mRULE_DOLLAR_ID(); 

                }
                break;
            case 65 :
                // InternalVampireLanguage.g:1:453: RULE_DOUBLE_DOLLAR_ID
                {
                mRULE_DOUBLE_DOLLAR_ID(); 

                }
                break;
            case 66 :
                // InternalVampireLanguage.g:1:475: RULE_LITERAL
                {
                mRULE_LITERAL(); 

                }
                break;
            case 67 :
                // InternalVampireLanguage.g:1:488: RULE_SIGNED_LITERAL
                {
                mRULE_SIGNED_LITERAL(); 

                }
                break;
            case 68 :
                // InternalVampireLanguage.g:1:508: RULE_SINGLE_COMMENT
                {
                mRULE_SINGLE_COMMENT(); 

                }
                break;
            case 69 :
                // InternalVampireLanguage.g:1:528: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 70 :
                // InternalVampireLanguage.g:1:536: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 71 :
                // InternalVampireLanguage.g:1:548: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 72 :
                // InternalVampireLanguage.g:1:564: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 73 :
                // InternalVampireLanguage.g:1:580: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 74 :
                // InternalVampireLanguage.g:1:588: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\3\64\4\72\1\64\1\72\1\64\2\uffff\2\64\1\72\4\uffff\7\72\1\132\2\uffff\1\62\1\140\1\143\2\uffff\1\147\1\uffff\1\62\1\64\1\72\2\62\1\uffff\1\164\1\62\1\uffff\1\62\1\uffff\1\62\2\uffff\1\64\1\uffff\3\64\2\72\1\uffff\5\72\1\64\1\72\1\64\2\uffff\3\64\2\72\4\uffff\13\72\4\uffff\1\u009c\13\uffff\3\155\11\uffff\1\164\6\uffff\3\64\1\u00a7\1\72\1\u00a9\3\72\1\64\1\72\4\64\1\u00b3\2\72\1\u00b8\14\72\2\uffff\3\155\4\uffff\3\64\1\uffff\1\72\1\uffff\3\72\1\64\1\72\4\64\1\uffff\4\72\1\uffff\1\72\1\u00db\12\72\3\155\1\uffff\2\64\1\u00eb\3\72\1\u00ef\1\64\1\72\3\64\1\u00f5\5\72\1\uffff\3\72\1\u00fe\4\72\1\u0103\1\72\1\u0105\1\155\1\u0107\2\64\1\uffff\2\72\2\uffff\1\64\1\72\1\u010e\1\u010f\2\uffff\10\72\1\uffff\4\72\1\uffff\1\72\1\uffff\1\u011d\1\uffff\2\64\2\72\1\u0122\3\uffff\4\72\1\u0127\7\72\1\u012f\1\uffff\1\64\1\uffff\1\72\1\u0132\1\uffff\4\72\1\uffff\1\72\1\u0138\5\72\1\uffff\1\64\1\72\1\uffff\1\72\1\u0141\3\72\1\uffff\3\72\1\u0148\1\72\1\64\2\72\1\uffff\3\72\1\u0150\1\u0151\1\u0152\1\uffff\1\u0153\1\64\2\72\1\u0157\2\72\5\uffff\2\72\1\uffff\3\72\1\u015f\1\u0160\2\72\2\uffff\2\72\1\u0165\1\72\1\uffff\1\72\1\u0168\1\uffff";
    static final String DFA22_eofS =
        "\u0169\uffff";
    static final String DFA22_minS =
        "\1\0\12\60\2\uffff\3\60\4\uffff\7\60\1\75\2\uffff\1\75\1\76\1\46\2\uffff\1\75\1\uffff\1\44\2\60\2\0\1\uffff\1\60\1\53\1\uffff\1\101\1\uffff\1\52\2\uffff\1\60\1\uffff\5\60\1\uffff\10\60\2\uffff\5\60\4\uffff\13\60\4\uffff\1\76\13\uffff\1\162\1\141\1\145\2\uffff\2\0\1\uffff\2\0\2\uffff\1\60\6\uffff\37\60\2\uffff\1\165\1\154\1\163\1\0\1\uffff\1\0\1\uffff\3\60\1\uffff\1\60\1\uffff\11\60\1\uffff\4\60\1\uffff\14\60\1\145\2\163\1\uffff\13\60\1\41\6\60\1\uffff\13\60\1\145\3\60\1\uffff\2\60\2\uffff\1\60\1\56\2\60\2\uffff\10\60\1\uffff\4\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\41\3\60\3\uffff\15\60\1\uffff\1\60\1\uffff\2\60\1\uffff\4\60\1\uffff\7\60\1\uffff\2\60\1\uffff\5\60\1\uffff\10\60\1\uffff\6\60\1\uffff\1\60\1\41\5\60\5\uffff\2\60\1\uffff\7\60\2\uffff\4\60\1\uffff\2\60\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\12\172\2\uffff\3\172\4\uffff\7\172\1\75\2\uffff\1\176\1\76\1\174\2\uffff\1\75\1\uffff\3\172\2\uffff\1\uffff\2\71\1\uffff\1\172\1\uffff\1\57\2\uffff\1\172\1\uffff\5\172\1\uffff\10\172\2\uffff\5\172\4\uffff\13\172\4\uffff\1\76\13\uffff\1\162\1\141\1\145\2\uffff\2\uffff\1\uffff\2\uffff\2\uffff\1\71\6\uffff\37\172\2\uffff\1\165\1\154\1\163\1\uffff\1\uffff\1\uffff\1\uffff\3\172\1\uffff\1\172\1\uffff\11\172\1\uffff\4\172\1\uffff\14\172\1\145\2\163\1\uffff\22\172\1\uffff\13\172\1\145\3\172\1\uffff\2\172\2\uffff\4\172\2\uffff\10\172\1\uffff\4\172\1\uffff\1\172\1\uffff\1\172\1\uffff\5\172\3\uffff\15\172\1\uffff\1\172\1\uffff\2\172\1\uffff\4\172\1\uffff\7\172\1\uffff\2\172\1\uffff\5\172\1\uffff\10\172\1\uffff\6\172\1\uffff\7\172\5\uffff\2\172\1\uffff\7\172\2\uffff\4\172\1\uffff\2\172\1\uffff";
    static final String DFA22_acceptS =
        "\13\uffff\1\13\1\14\3\uffff\1\21\1\22\1\23\1\24\10\uffff\1\51\1\52\3\uffff\1\61\1\62\1\uffff\1\64\5\uffff\1\102\2\uffff\1\104\1\uffff\1\105\1\uffff\1\111\1\112\1\uffff\1\74\5\uffff\1\75\10\uffff\1\13\1\14\5\uffff\1\21\1\22\1\23\1\24\13\uffff\1\70\1\50\1\51\1\52\1\uffff\1\56\1\54\1\67\1\57\1\60\1\65\1\61\1\62\1\66\1\63\1\64\3\uffff\1\101\1\100\2\uffff\1\76\2\uffff\1\106\1\102\1\uffff\1\103\1\104\1\105\1\107\1\110\1\111\37\uffff\1\53\1\55\4\uffff\1\76\1\uffff\1\77\3\uffff\1\4\1\uffff\1\5\11\uffff\1\20\4\uffff\1\25\17\uffff\1\77\22\uffff\1\43\17\uffff\1\3\2\uffff\1\7\1\36\4\uffff\1\17\1\16\10\uffff\1\31\4\uffff\1\42\1\uffff\1\71\1\uffff\1\73\5\uffff\1\11\1\12\1\15\15\uffff\1\72\1\uffff\1\2\2\uffff\1\10\4\uffff\1\37\7\uffff\1\47\2\uffff\1\6\5\uffff\1\30\10\uffff\1\44\6\uffff\1\40\7\uffff\1\34\1\35\1\32\1\33\1\1\2\uffff\1\45\7\uffff\1\27\1\46\4\uffff\1\26\2\uffff\1\41";
    static final String DFA22_specialS =
        "\1\0\47\uffff\1\4\1\3\104\uffff\1\7\1\2\1\uffff\1\10\1\6\55\uffff\1\1\1\uffff\1\5\u00c6\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\62\2\61\2\62\1\61\22\62\1\61\1\43\1\50\1\62\1\45\1\55\1\41\1\51\1\20\1\22\1\35\1\54\1\21\1\54\1\23\1\60\1\52\11\53\1\33\1\62\1\36\1\37\1\34\1\44\1\62\2\46\1\3\2\46\1\15\6\46\1\16\5\46\1\1\1\12\1\46\1\10\1\2\3\46\1\13\1\62\1\14\1\56\1\57\1\62\1\26\1\47\1\27\1\25\1\47\1\17\1\47\1\30\3\47\1\7\1\11\1\4\1\47\1\31\1\47\1\6\1\5\1\24\1\32\5\47\1\62\1\42\1\62\1\40\uff81\62",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\63\31\65",
            "\12\65\7\uffff\1\66\31\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\67\13\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\71\11\73\1\70\13\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\74\25\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\75\25\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\77\3\73\1\76\21\73",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\100\21\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\101\25\73",
            "\12\65\7\uffff\21\65\1\102\10\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\105\5\65\1\106\13\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\107\13\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\111\5\73\1\110\13\73",
            "",
            "",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\5\73\1\116\1\73\1\117\20\73\1\120\1\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\122\3\73\1\121\21\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\22\73\1\124\4\73\1\123\2\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\125\13\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\30\73\1\126\1\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\13\73\1\127\16\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\130\14\73",
            "\1\131",
            "",
            "",
            "\1\135\100\uffff\1\136",
            "\1\137",
            "\1\142\125\uffff\1\141",
            "",
            "",
            "\1\146",
            "",
            "\1\154\74\uffff\5\155\1\152\5\155\1\153\7\155\1\151\6\155",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\42\157\1\160\71\157\1\156\uffa3\157",
            "\47\162\1\163\64\162\1\161\uffa3\162",
            "",
            "\12\165",
            "\1\166\1\uffff\1\166\2\uffff\12\166",
            "",
            "\32\170\4\uffff\1\170\1\uffff\32\170",
            "",
            "\1\171\4\uffff\1\172",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\174\6\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\21\65\1\175\10\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\176\5\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\177\6\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\6\73\1\u0080\23\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\u0081\6\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\22\73\1\u0082\7\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\14\73\1\u0083\15\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\14\73\1\u0084\15\73",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u0085\10\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\14\73\1\u0086\15\73",
            "\12\65\7\uffff\30\65\1\u0087\1\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u0088\14\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u0089\5\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u008a\26\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\5\73\1\u008b\24\73",
            "\12\73\7\uffff\32\73\4\uffff\1\u008d\1\uffff\15\73\1\u008c\14\73",
            "",
            "",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\5\73\1\u008e\24\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u008f\25\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\17\73\1\u0090\12\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\22\73\1\u0091\7\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\2\73\1\u0092\2\73\1\u0093\24\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u0094\21\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\22\73\1\u0095\7\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\u0096\3\73\1\u0097\10\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\17\73\1\u0098\12\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\u0099\31\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\12\73\1\u009a\17\73",
            "",
            "",
            "",
            "",
            "\1\u009b",
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
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "",
            "\42\163\1\u00a0\71\163\1\u00a0\uffa3\163",
            "\42\157\1\160\71\157\1\156\uffa3\157",
            "",
            "\47\163\1\u00a2\64\163\1\u00a2\uffa3\163",
            "\47\162\1\u00a3\64\162\1\161\uffa3\162",
            "",
            "",
            "\12\165",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00a4\21\65",
            "\12\65\7\uffff\15\65\1\u00a5\14\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00a6\16\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\u00a8\31\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\u00aa\13\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u00ab\21\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\14\73\1\u00ac\15\73",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00ad\6\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\u00ae\13\73",
            "\12\65\7\uffff\10\65\1\u00af\21\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00b0\21\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u00b1\14\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00b2\25\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u00b4\21\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\3\73\1\u00b5\1\73\1\u00b6\11\73\1\u00b7\12\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\u00b9\13\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u00ba\25\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\u00bb\6\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\13\73\1\u00bc\16\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u00bd\21\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\u00be\13\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\24\73\1\u00bf\5\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\11\73\1\u00c0\20\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\u00c1\13\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\u00c2\13\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u00c3\21\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\u00c4\14\73",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\42\157\1\160\71\157\1\156\uffa3\157",
            "",
            "\47\162\1\u00a3\64\162\1\161\uffa3\162",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u00c9\7\65",
            "\12\65\7\uffff\10\65\1\u00ca\21\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u00cb\26\65",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\u00cc\6\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\24\73\1\u00cd\5\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\u00ce\6\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\u00cf\31\73",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00d0\5\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\21\73\1\u00d1\10\73",
            "\12\65\7\uffff\15\65\1\u00d2\14\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00d3\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u00d4\26\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00d5\16\65",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\u00d6\6\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\u00d7\13\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\24\73\1\u00d8\5\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\21\73\1\u00d9\10\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\21\73\1\u00da\10\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u00dc\21\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\u00dd\31\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\u00de\14\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\14\73\1\u00df\15\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\14\73\1\u00e0\15\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u00e1\25\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\13\73\1\u00e2\16\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\u00e3\6\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\u00e4\14\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\u00e5\13\73",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\u00e9\24\65",
            "\12\65\7\uffff\15\65\1\u00ea\14\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u00ec\25\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\21\73\1\u00ed\10\73",
            "\12\73\1\u00ee\6\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u00f0\31\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\30\73\1\u00f1\1\73",
            "\12\65\7\uffff\6\65\1\u00f2\23\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00f3\25\65",
            "\1\u00f4\16\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u00f6\25\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\14\73\1\u00f7\15\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\u00f8\14\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u00f9\25\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u00fa\25\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\u00fb\14\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\21\73\1\u00fc\10\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u00fd\21\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\17\73\1\u00ff\12\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\2\73\1\u0100\27\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\13\73\1\u0101\16\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\7\73\1\u0102\22\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\26\73\1\u0104\3\73",
            "\12\155\7\uffff\32\155\4\uffff\1\155\1\uffff\32\155",
            "\1\u0106",
            "\12\155\7\uffff\32\155\4\uffff\1\155\1\uffff\32\155",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u0108\21\65",
            "\12\65\7\uffff\6\65\1\u0109\23\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\3\73\1\u010a\26\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\2\73\1\u010b\27\73",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u010c\16\65",
            "\1\u010d\1\uffff\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\u0110\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\u0111\31\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\2\73\1\u0112\27\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\3\73\1\u0113\26\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\14\73\1\u0114\15\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\2\73\1\u0115\27\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u0116\25\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\u0117\6\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\u0118\6\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\u0119\6\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\u011a\31\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u011b\25\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\u011c\14\73",
            "",
            "\12\155\7\uffff\32\155\4\uffff\1\155\1\uffff\32\155",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u011e\31\65",
            "\1\u011f\16\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\73\7\uffff\32\73\4\uffff\1\u0120\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u0121\25\73",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\3\73\1\u0123\26\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u0124\21\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\u0125\6\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u0126\21\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\u0128\6\73",
            "\12\73\7\uffff\32\73\4\uffff\1\u0129\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u012a\21\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u012b\21\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\24\73\1\u012c\5\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\21\73\1\u012d\10\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\22\73\1\u012e\7\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\65\1\u0130\30\65",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\2\73\1\u0131\27\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\u0133\13\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\u0134\14\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\u0135\13\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\2\73\1\u0136\27\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\u0137\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\u0139\13\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\u013a\13\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\21\73\1\u013b\10\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\30\73\1\u013c\1\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u013d\21\73",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u013e\16\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\u013f\13\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\14\73\1\u0140\15\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\21\73\1\u0142\10\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\u0143\31\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\3\73\1\u0144\26\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\u0145\14\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\u0146\14\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u0147\25\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\22\73\1\u0149\7\73",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u014a\25\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\u014b\14\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\u014c\31\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\22\73\1\u014d\7\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\u014e\6\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\16\73\1\u014f\13\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0154\16\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\11\73\1\u0155\20\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u0156\21\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u0158\25\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\14\73\1\u0159\15\73",
            "",
            "",
            "",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u015a\25\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\u015b\14\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\22\73\1\u015c\7\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\1\u015d\31\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\2\73\1\u015e\27\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\10\73\1\u0161\21\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\23\73\1\u0162\6\73",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\15\73\1\u0163\14\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\24\73\1\u0164\5\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\21\73\1\u0166\10\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\4\73\1\u0167\25\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_UPPER_WORD_ID | RULE_LOWER_WORD_ID | RULE_DOUBLE_QUOTE | RULE_SINGLE_QUOTE | RULE_DOLLAR_ID | RULE_DOUBLE_DOLLAR_ID | RULE_LITERAL | RULE_SIGNED_LITERAL | RULE_SINGLE_COMMENT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='S') ) {s = 1;}

                        else if ( (LA22_0=='W') ) {s = 2;}

                        else if ( (LA22_0=='C') ) {s = 3;}

                        else if ( (LA22_0=='n') ) {s = 4;}

                        else if ( (LA22_0=='s') ) {s = 5;}

                        else if ( (LA22_0=='r') ) {s = 6;}

                        else if ( (LA22_0=='l') ) {s = 7;}

                        else if ( (LA22_0=='V') ) {s = 8;}

                        else if ( (LA22_0=='m') ) {s = 9;}

                        else if ( (LA22_0=='T') ) {s = 10;}

                        else if ( (LA22_0=='[') ) {s = 11;}

                        else if ( (LA22_0==']') ) {s = 12;}

                        else if ( (LA22_0=='F') ) {s = 13;}

                        else if ( (LA22_0=='M') ) {s = 14;}

                        else if ( (LA22_0=='f') ) {s = 15;}

                        else if ( (LA22_0=='(') ) {s = 16;}

                        else if ( (LA22_0==',') ) {s = 17;}

                        else if ( (LA22_0==')') ) {s = 18;}

                        else if ( (LA22_0=='.') ) {s = 19;}

                        else if ( (LA22_0=='t') ) {s = 20;}

                        else if ( (LA22_0=='d') ) {s = 21;}

                        else if ( (LA22_0=='a') ) {s = 22;}

                        else if ( (LA22_0=='c') ) {s = 23;}

                        else if ( (LA22_0=='h') ) {s = 24;}

                        else if ( (LA22_0=='p') ) {s = 25;}

                        else if ( (LA22_0=='u') ) {s = 26;}

                        else if ( (LA22_0==':') ) {s = 27;}

                        else if ( (LA22_0=='>') ) {s = 28;}

                        else if ( (LA22_0=='*') ) {s = 29;}

                        else if ( (LA22_0=='<') ) {s = 30;}

                        else if ( (LA22_0=='=') ) {s = 31;}

                        else if ( (LA22_0=='~') ) {s = 32;}

                        else if ( (LA22_0=='&') ) {s = 33;}

                        else if ( (LA22_0=='|') ) {s = 34;}

                        else if ( (LA22_0=='!') ) {s = 35;}

                        else if ( (LA22_0=='?') ) {s = 36;}

                        else if ( (LA22_0=='$') ) {s = 37;}

                        else if ( ((LA22_0>='A' && LA22_0<='B')||(LA22_0>='D' && LA22_0<='E')||(LA22_0>='G' && LA22_0<='L')||(LA22_0>='N' && LA22_0<='R')||LA22_0=='U'||(LA22_0>='X' && LA22_0<='Z')) ) {s = 38;}

                        else if ( (LA22_0=='b'||LA22_0=='e'||LA22_0=='g'||(LA22_0>='i' && LA22_0<='k')||LA22_0=='o'||LA22_0=='q'||(LA22_0>='v' && LA22_0<='z')) ) {s = 39;}

                        else if ( (LA22_0=='\"') ) {s = 40;}

                        else if ( (LA22_0=='\'') ) {s = 41;}

                        else if ( (LA22_0=='0') ) {s = 42;}

                        else if ( ((LA22_0>='1' && LA22_0<='9')) ) {s = 43;}

                        else if ( (LA22_0=='+'||LA22_0=='-') ) {s = 44;}

                        else if ( (LA22_0=='%') ) {s = 45;}

                        else if ( (LA22_0=='^') ) {s = 46;}

                        else if ( (LA22_0=='_') ) {s = 47;}

                        else if ( (LA22_0=='/') ) {s = 48;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 49;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='#'||LA22_0==';'||LA22_0=='@'||LA22_0=='\\'||LA22_0=='`'||LA22_0=='{'||LA22_0=='}'||(LA22_0>='\u007F' && LA22_0<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_160 = input.LA(1);

                        s = -1;
                        if ( (LA22_160=='\"') ) {s = 112;}

                        else if ( (LA22_160=='\\') ) {s = 110;}

                        else if ( ((LA22_160>='\u0000' && LA22_160<='!')||(LA22_160>='#' && LA22_160<='[')||(LA22_160>=']' && LA22_160<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_111 = input.LA(1);

                        s = -1;
                        if ( (LA22_111=='\"') ) {s = 112;}

                        else if ( (LA22_111=='\\') ) {s = 110;}

                        else if ( ((LA22_111>='\u0000' && LA22_111<='!')||(LA22_111>='#' && LA22_111<='[')||(LA22_111>=']' && LA22_111<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_41 = input.LA(1);

                        s = -1;
                        if ( (LA22_41=='\\') ) {s = 113;}

                        else if ( ((LA22_41>='\u0000' && LA22_41<='&')||(LA22_41>='(' && LA22_41<='[')||(LA22_41>=']' && LA22_41<='\uFFFF')) ) {s = 114;}

                        else if ( (LA22_41=='\'') ) {s = 115;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_40 = input.LA(1);

                        s = -1;
                        if ( (LA22_40=='\\') ) {s = 110;}

                        else if ( ((LA22_40>='\u0000' && LA22_40<='!')||(LA22_40>='#' && LA22_40<='[')||(LA22_40>=']' && LA22_40<='\uFFFF')) ) {s = 111;}

                        else if ( (LA22_40=='\"') ) {s = 112;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_162 = input.LA(1);

                        s = -1;
                        if ( (LA22_162=='\'') ) {s = 163;}

                        else if ( (LA22_162=='\\') ) {s = 113;}

                        else if ( ((LA22_162>='\u0000' && LA22_162<='&')||(LA22_162>='(' && LA22_162<='[')||(LA22_162>=']' && LA22_162<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_114 = input.LA(1);

                        s = -1;
                        if ( (LA22_114=='\'') ) {s = 163;}

                        else if ( (LA22_114=='\\') ) {s = 113;}

                        else if ( ((LA22_114>='\u0000' && LA22_114<='&')||(LA22_114>='(' && LA22_114<='[')||(LA22_114>=']' && LA22_114<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_110 = input.LA(1);

                        s = -1;
                        if ( (LA22_110=='\"'||LA22_110=='\\') ) {s = 160;}

                        else if ( ((LA22_110>='\u0000' && LA22_110<='!')||(LA22_110>='#' && LA22_110<='[')||(LA22_110>=']' && LA22_110<='\uFFFF')) ) {s = 115;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA22_113 = input.LA(1);

                        s = -1;
                        if ( (LA22_113=='\''||LA22_113=='\\') ) {s = 162;}

                        else if ( ((LA22_113>='\u0000' && LA22_113<='&')||(LA22_113>='(' && LA22_113<='[')||(LA22_113>=']' && LA22_113<='\uFFFF')) ) {s = 115;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}