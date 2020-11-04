package org.eclipse.viatra.solver.language.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSolverLanguageLexer extends Lexer {
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

    public InternalSolverLanguageLexer() {;} 
    public InternalSolverLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSolverLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSolverLanguageLexer.g"; }

    // $ANTLR start "Containment"
    public final void mContainment() throws RecognitionException {
        try {
            int _type = Containment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:14:13: ( 'containment' )
            // InternalSolverLanguageLexer.g:14:15: 'containment'
            {
            match("containment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Containment"

    // $ANTLR start "Functional"
    public final void mFunctional() throws RecognitionException {
        try {
            int _type = Functional;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:16:12: ( 'functional' )
            // InternalSolverLanguageLexer.g:16:14: 'functional'
            {
            match("functional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Functional"

    // $ANTLR start "Abstract"
    public final void mAbstract() throws RecognitionException {
        try {
            int _type = Abstract;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:18:10: ( 'abstract' )
            // InternalSolverLanguageLexer.g:18:12: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Abstract"

    // $ANTLR start "Contains"
    public final void mContains() throws RecognitionException {
        try {
            int _type = Contains;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:20:10: ( 'contains' )
            // InternalSolverLanguageLexer.g:20:12: 'contains'
            {
            match("contains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Contains"

    // $ANTLR start "Datatype"
    public final void mDatatype() throws RecognitionException {
        try {
            int _type = Datatype;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:22:10: ( 'datatype' )
            // InternalSolverLanguageLexer.g:22:12: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Datatype"

    // $ANTLR start "Maximize"
    public final void mMaximize() throws RecognitionException {
        try {
            int _type = Maximize;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:24:10: ( 'maximize' )
            // InternalSolverLanguageLexer.g:24:12: 'maximize'
            {
            match("maximize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Maximize"

    // $ANTLR start "Minimize"
    public final void mMinimize() throws RecognitionException {
        try {
            int _type = Minimize;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:26:10: ( 'minimize' )
            // InternalSolverLanguageLexer.g:26:12: 'minimize'
            {
            match("minimize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Minimize"

    // $ANTLR start "Opposite"
    public final void mOpposite() throws RecognitionException {
        try {
            int _type = Opposite;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:28:10: ( 'opposite' )
            // InternalSolverLanguageLexer.g:28:12: 'opposite'
            {
            match("opposite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Opposite"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:30:9: ( 'default' )
            // InternalSolverLanguageLexer.g:30:11: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Extends"
    public final void mExtends() throws RecognitionException {
        try {
            int _type = Extends;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:32:9: ( 'extends' )
            // InternalSolverLanguageLexer.g:32:11: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Extends"

    // $ANTLR start "Problem"
    public final void mProblem() throws RecognitionException {
        try {
            int _type = Problem;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:34:9: ( 'problem' )
            // InternalSolverLanguageLexer.g:34:11: 'problem'
            {
            match("problem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Problem"

    // $ANTLR start "Unknown"
    public final void mUnknown() throws RecognitionException {
        try {
            int _type = Unknown;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:36:9: ( 'unknown' )
            // InternalSolverLanguageLexer.g:36:11: 'unknown'
            {
            match("unknown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Unknown"

    // $ANTLR start "Extern"
    public final void mExtern() throws RecognitionException {
        try {
            int _type = Extern;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:38:8: ( 'extern' )
            // InternalSolverLanguageLexer.g:38:10: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Extern"

    // $ANTLR start "Import"
    public final void mImport() throws RecognitionException {
        try {
            int _type = Import;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:40:8: ( 'import' )
            // InternalSolverLanguageLexer.g:40:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Import"

    // $ANTLR start "Object"
    public final void mObject() throws RecognitionException {
        try {
            int _type = Object;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:42:8: ( 'object' )
            // InternalSolverLanguageLexer.g:42:10: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Object"

    // $ANTLR start "Refers"
    public final void mRefers() throws RecognitionException {
        try {
            int _type = Refers;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:44:8: ( 'refers' )
            // InternalSolverLanguageLexer.g:44:10: 'refers'
            {
            match("refers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Refers"

    // $ANTLR start "Class"
    public final void mClass() throws RecognitionException {
        try {
            int _type = Class;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:46:7: ( 'class' )
            // InternalSolverLanguageLexer.g:46:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Class"

    // $ANTLR start "Count"
    public final void mCount() throws RecognitionException {
        try {
            int _type = Count;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:48:7: ( 'count' )
            // InternalSolverLanguageLexer.g:48:9: 'count'
            {
            match("count"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Count"

    // $ANTLR start "Empty"
    public final void mEmpty() throws RecognitionException {
        try {
            int _type = Empty;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:50:7: ( 'empty' )
            // InternalSolverLanguageLexer.g:50:9: 'empty'
            {
            match("empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Empty"

    // $ANTLR start "Error"
    public final void mError() throws RecognitionException {
        try {
            int _type = Error;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:52:7: ( 'error' )
            // InternalSolverLanguageLexer.g:52:9: 'error'
            {
            match("error"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Error"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:54:7: ( 'false' )
            // InternalSolverLanguageLexer.g:54:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Scope"
    public final void mScope() throws RecognitionException {
        try {
            int _type = Scope;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:56:7: ( 'scope' )
            // InternalSolverLanguageLexer.g:56:9: 'scope'
            {
            match("scope"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Scope"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:58:6: ( 'else' )
            // InternalSolverLanguageLexer.g:58:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Enum"
    public final void mEnum() throws RecognitionException {
        try {
            int _type = Enum;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:60:6: ( 'enum' )
            // InternalSolverLanguageLexer.g:60:8: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Enum"

    // $ANTLR start "Root"
    public final void mRoot() throws RecognitionException {
        try {
            int _type = Root;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:62:6: ( 'root' )
            // InternalSolverLanguageLexer.g:62:8: 'root'
            {
            match("root"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Root"

    // $ANTLR start "Then"
    public final void mThen() throws RecognitionException {
        try {
            int _type = Then;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:64:6: ( 'then' )
            // InternalSolverLanguageLexer.g:64:8: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Then"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:66:6: ( 'true' )
            // InternalSolverLanguageLexer.g:66:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "FullStopFullStopFullStop"
    public final void mFullStopFullStopFullStop() throws RecognitionException {
        try {
            int _type = FullStopFullStopFullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:68:26: ( '...' )
            // InternalSolverLanguageLexer.g:68:28: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopFullStopFullStop"

    // $ANTLR start "Inf"
    public final void mInf() throws RecognitionException {
        try {
            int _type = Inf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:70:5: ( 'inf' )
            // InternalSolverLanguageLexer.g:70:7: 'inf'
            {
            match("inf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Inf"

    // $ANTLR start "Let"
    public final void mLet() throws RecognitionException {
        try {
            int _type = Let;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:72:5: ( 'let' )
            // InternalSolverLanguageLexer.g:72:7: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Let"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:74:27: ( '!=' )
            // InternalSolverLanguageLexer.g:74:29: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "HyphenMinusGreaterThanSign"
    public final void mHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:76:28: ( '->' )
            // InternalSolverLanguageLexer.g:76:30: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusGreaterThanSign"

    // $ANTLR start "ColonHyphenMinus"
    public final void mColonHyphenMinus() throws RecognitionException {
        try {
            int _type = ColonHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:78:18: ( ':-' )
            // InternalSolverLanguageLexer.g:78:20: ':-'
            {
            match(":-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonHyphenMinus"

    // $ANTLR start "ColonColon"
    public final void mColonColon() throws RecognitionException {
        try {
            int _type = ColonColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:80:12: ( '::' )
            // InternalSolverLanguageLexer.g:80:14: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonColon"

    // $ANTLR start "ColonEqualsSign"
    public final void mColonEqualsSign() throws RecognitionException {
        try {
            int _type = ColonEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:82:17: ( ':=' )
            // InternalSolverLanguageLexer.g:82:19: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonEqualsSign"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:84:24: ( '<=' )
            // InternalSolverLanguageLexer.g:84:26: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:86:22: ( '==' )
            // InternalSolverLanguageLexer.g:86:24: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "EqualsSignGreaterThanSign"
    public final void mEqualsSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = EqualsSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:88:27: ( '=>' )
            // InternalSolverLanguageLexer.g:88:29: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignGreaterThanSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:90:27: ( '>=' )
            // InternalSolverLanguageLexer.g:90:29: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "As"
    public final void mAs() throws RecognitionException {
        try {
            int _type = As;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:92:4: ( 'as' )
            // InternalSolverLanguageLexer.g:92:6: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "As"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:94:4: ( 'if' )
            // InternalSolverLanguageLexer.g:94:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:96:4: ( 'in' )
            // InternalSolverLanguageLexer.g:96:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:98:17: ( '!' )
            // InternalSolverLanguageLexer.g:98:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:100:17: ( '(' )
            // InternalSolverLanguageLexer.g:100:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:102:18: ( ')' )
            // InternalSolverLanguageLexer.g:102:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:104:10: ( '*' )
            // InternalSolverLanguageLexer.g:104:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:106:10: ( '+' )
            // InternalSolverLanguageLexer.g:106:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:108:7: ( ',' )
            // InternalSolverLanguageLexer.g:108:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:110:13: ( '-' )
            // InternalSolverLanguageLexer.g:110:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:112:10: ( '.' )
            // InternalSolverLanguageLexer.g:112:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:114:9: ( '/' )
            // InternalSolverLanguageLexer.g:114:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:116:7: ( ':' )
            // InternalSolverLanguageLexer.g:116:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:118:11: ( ';' )
            // InternalSolverLanguageLexer.g:118:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:120:14: ( '<' )
            // InternalSolverLanguageLexer.g:120:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:122:12: ( '=' )
            // InternalSolverLanguageLexer.g:122:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:124:17: ( '>' )
            // InternalSolverLanguageLexer.g:124:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "QuestionMark"
    public final void mQuestionMark() throws RecognitionException {
        try {
            int _type = QuestionMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:126:14: ( '?' )
            // InternalSolverLanguageLexer.g:126:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMark"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:128:19: ( '[' )
            // InternalSolverLanguageLexer.g:128:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:130:20: ( ']' )
            // InternalSolverLanguageLexer.g:130:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "CircumflexAccent"
    public final void mCircumflexAccent() throws RecognitionException {
        try {
            int _type = CircumflexAccent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:132:18: ( '^' )
            // InternalSolverLanguageLexer.g:132:20: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CircumflexAccent"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:134:18: ( '{' )
            // InternalSolverLanguageLexer.g:134:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "VerticalLine"
    public final void mVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:136:14: ( '|' )
            // InternalSolverLanguageLexer.g:136:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLine"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:138:19: ( '}' )
            // InternalSolverLanguageLexer.g:138:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "Tilde"
    public final void mTilde() throws RecognitionException {
        try {
            int _type = Tilde;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:140:7: ( '~' )
            // InternalSolverLanguageLexer.g:140:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tilde"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:142:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalSolverLanguageLexer.g:142:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalSolverLanguageLexer.g:142:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSolverLanguageLexer.g:142:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalSolverLanguageLexer.g:142:27: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop1;
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
            // InternalSolverLanguageLexer.g:144:16: ( '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalSolverLanguageLexer.g:144:18: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalSolverLanguageLexer.g:144:23: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSolverLanguageLexer.g:144:24: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalSolverLanguageLexer.g:144:31: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop2;
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
            // InternalSolverLanguageLexer.g:146:17: ( ( '%' | '//' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSolverLanguageLexer.g:146:19: ( '%' | '//' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // InternalSolverLanguageLexer.g:146:19: ( '%' | '//' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='%') ) {
                alt3=1;
            }
            else if ( (LA3_0=='/') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSolverLanguageLexer.g:146:20: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageLexer.g:146:24: '//'
                    {
                    match("//"); 


                    }
                    break;

            }

            // InternalSolverLanguageLexer.g:146:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSolverLanguageLexer.g:146:30: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop4;
                }
            } while (true);

            // InternalSolverLanguageLexer.g:146:46: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSolverLanguageLexer.g:146:47: ( '\\r' )? '\\n'
                    {
                    // InternalSolverLanguageLexer.g:146:47: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSolverLanguageLexer.g:146:47: '\\r'
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

    // $ANTLR start "RULE_TRANSITIVE_CLOSURE"
    public final void mRULE_TRANSITIVE_CLOSURE() throws RecognitionException {
        try {
            // InternalSolverLanguageLexer.g:148:34: ()
            // InternalSolverLanguageLexer.g:148:36: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRANSITIVE_CLOSURE"

    // $ANTLR start "RULE_REFLEXIVE_TRANSITIVE_CLOSURE"
    public final void mRULE_REFLEXIVE_TRANSITIVE_CLOSURE() throws RecognitionException {
        try {
            // InternalSolverLanguageLexer.g:150:44: ()
            // InternalSolverLanguageLexer.g:150:46: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_REFLEXIVE_TRANSITIVE_CLOSURE"

    // $ANTLR start "RULE_FULL_STOP"
    public final void mRULE_FULL_STOP() throws RecognitionException {
        try {
            // InternalSolverLanguageLexer.g:152:25: ()
            // InternalSolverLanguageLexer.g:152:27: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FULL_STOP"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:154:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSolverLanguageLexer.g:154:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSolverLanguageLexer.g:154:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSolverLanguageLexer.g:154:11: '^'
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

            // InternalSolverLanguageLexer.g:154:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSolverLanguageLexer.g:
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
            	    break loop8;
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
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:156:10: ( ( '0' .. '9' )+ )
            // InternalSolverLanguageLexer.g:156:12: ( '0' .. '9' )+
            {
            // InternalSolverLanguageLexer.g:156:12: ( '0' .. '9' )+
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
            	    // InternalSolverLanguageLexer.g:156:13: '0' .. '9'
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
            // InternalSolverLanguageLexer.g:158:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSolverLanguageLexer.g:158:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSolverLanguageLexer.g:158:24: ( options {greedy=false; } : . )*
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
            	    // InternalSolverLanguageLexer.g:158:52: .
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
            // InternalSolverLanguageLexer.g:160:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSolverLanguageLexer.g:160:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSolverLanguageLexer.g:160:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalSolverLanguageLexer.g:
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
            // InternalSolverLanguageLexer.g:162:16: ( . )
            // InternalSolverLanguageLexer.g:162:18: .
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
        // InternalSolverLanguageLexer.g:1:8: ( Containment | Functional | Abstract | Contains | Datatype | Maximize | Minimize | Opposite | Default | Extends | Problem | Unknown | Extern | Import | Object | Refers | Class | Count | Empty | Error | False | Scope | Else | Enum | Root | Then | True | FullStopFullStopFullStop | Inf | Let | ExclamationMarkEqualsSign | HyphenMinusGreaterThanSign | ColonHyphenMinus | ColonColon | ColonEqualsSign | LessThanSignEqualsSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | As | If | In | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | CircumflexAccent | LeftCurlyBracket | VerticalLine | RightCurlyBracket | Tilde | RULE_STRING | RULE_QUOTED_ID | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=72;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSolverLanguageLexer.g:1:10: Containment
                {
                mContainment(); 

                }
                break;
            case 2 :
                // InternalSolverLanguageLexer.g:1:22: Functional
                {
                mFunctional(); 

                }
                break;
            case 3 :
                // InternalSolverLanguageLexer.g:1:33: Abstract
                {
                mAbstract(); 

                }
                break;
            case 4 :
                // InternalSolverLanguageLexer.g:1:42: Contains
                {
                mContains(); 

                }
                break;
            case 5 :
                // InternalSolverLanguageLexer.g:1:51: Datatype
                {
                mDatatype(); 

                }
                break;
            case 6 :
                // InternalSolverLanguageLexer.g:1:60: Maximize
                {
                mMaximize(); 

                }
                break;
            case 7 :
                // InternalSolverLanguageLexer.g:1:69: Minimize
                {
                mMinimize(); 

                }
                break;
            case 8 :
                // InternalSolverLanguageLexer.g:1:78: Opposite
                {
                mOpposite(); 

                }
                break;
            case 9 :
                // InternalSolverLanguageLexer.g:1:87: Default
                {
                mDefault(); 

                }
                break;
            case 10 :
                // InternalSolverLanguageLexer.g:1:95: Extends
                {
                mExtends(); 

                }
                break;
            case 11 :
                // InternalSolverLanguageLexer.g:1:103: Problem
                {
                mProblem(); 

                }
                break;
            case 12 :
                // InternalSolverLanguageLexer.g:1:111: Unknown
                {
                mUnknown(); 

                }
                break;
            case 13 :
                // InternalSolverLanguageLexer.g:1:119: Extern
                {
                mExtern(); 

                }
                break;
            case 14 :
                // InternalSolverLanguageLexer.g:1:126: Import
                {
                mImport(); 

                }
                break;
            case 15 :
                // InternalSolverLanguageLexer.g:1:133: Object
                {
                mObject(); 

                }
                break;
            case 16 :
                // InternalSolverLanguageLexer.g:1:140: Refers
                {
                mRefers(); 

                }
                break;
            case 17 :
                // InternalSolverLanguageLexer.g:1:147: Class
                {
                mClass(); 

                }
                break;
            case 18 :
                // InternalSolverLanguageLexer.g:1:153: Count
                {
                mCount(); 

                }
                break;
            case 19 :
                // InternalSolverLanguageLexer.g:1:159: Empty
                {
                mEmpty(); 

                }
                break;
            case 20 :
                // InternalSolverLanguageLexer.g:1:165: Error
                {
                mError(); 

                }
                break;
            case 21 :
                // InternalSolverLanguageLexer.g:1:171: False
                {
                mFalse(); 

                }
                break;
            case 22 :
                // InternalSolverLanguageLexer.g:1:177: Scope
                {
                mScope(); 

                }
                break;
            case 23 :
                // InternalSolverLanguageLexer.g:1:183: Else
                {
                mElse(); 

                }
                break;
            case 24 :
                // InternalSolverLanguageLexer.g:1:188: Enum
                {
                mEnum(); 

                }
                break;
            case 25 :
                // InternalSolverLanguageLexer.g:1:193: Root
                {
                mRoot(); 

                }
                break;
            case 26 :
                // InternalSolverLanguageLexer.g:1:198: Then
                {
                mThen(); 

                }
                break;
            case 27 :
                // InternalSolverLanguageLexer.g:1:203: True
                {
                mTrue(); 

                }
                break;
            case 28 :
                // InternalSolverLanguageLexer.g:1:208: FullStopFullStopFullStop
                {
                mFullStopFullStopFullStop(); 

                }
                break;
            case 29 :
                // InternalSolverLanguageLexer.g:1:233: Inf
                {
                mInf(); 

                }
                break;
            case 30 :
                // InternalSolverLanguageLexer.g:1:237: Let
                {
                mLet(); 

                }
                break;
            case 31 :
                // InternalSolverLanguageLexer.g:1:241: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 32 :
                // InternalSolverLanguageLexer.g:1:267: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 33 :
                // InternalSolverLanguageLexer.g:1:294: ColonHyphenMinus
                {
                mColonHyphenMinus(); 

                }
                break;
            case 34 :
                // InternalSolverLanguageLexer.g:1:311: ColonColon
                {
                mColonColon(); 

                }
                break;
            case 35 :
                // InternalSolverLanguageLexer.g:1:322: ColonEqualsSign
                {
                mColonEqualsSign(); 

                }
                break;
            case 36 :
                // InternalSolverLanguageLexer.g:1:338: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 37 :
                // InternalSolverLanguageLexer.g:1:361: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 38 :
                // InternalSolverLanguageLexer.g:1:382: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 39 :
                // InternalSolverLanguageLexer.g:1:408: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 40 :
                // InternalSolverLanguageLexer.g:1:434: As
                {
                mAs(); 

                }
                break;
            case 41 :
                // InternalSolverLanguageLexer.g:1:437: If
                {
                mIf(); 

                }
                break;
            case 42 :
                // InternalSolverLanguageLexer.g:1:440: In
                {
                mIn(); 

                }
                break;
            case 43 :
                // InternalSolverLanguageLexer.g:1:443: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 44 :
                // InternalSolverLanguageLexer.g:1:459: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 45 :
                // InternalSolverLanguageLexer.g:1:475: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 46 :
                // InternalSolverLanguageLexer.g:1:492: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 47 :
                // InternalSolverLanguageLexer.g:1:501: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 48 :
                // InternalSolverLanguageLexer.g:1:510: Comma
                {
                mComma(); 

                }
                break;
            case 49 :
                // InternalSolverLanguageLexer.g:1:516: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 50 :
                // InternalSolverLanguageLexer.g:1:528: FullStop
                {
                mFullStop(); 

                }
                break;
            case 51 :
                // InternalSolverLanguageLexer.g:1:537: Solidus
                {
                mSolidus(); 

                }
                break;
            case 52 :
                // InternalSolverLanguageLexer.g:1:545: Colon
                {
                mColon(); 

                }
                break;
            case 53 :
                // InternalSolverLanguageLexer.g:1:551: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 54 :
                // InternalSolverLanguageLexer.g:1:561: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 55 :
                // InternalSolverLanguageLexer.g:1:574: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 56 :
                // InternalSolverLanguageLexer.g:1:585: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 57 :
                // InternalSolverLanguageLexer.g:1:601: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 58 :
                // InternalSolverLanguageLexer.g:1:614: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 59 :
                // InternalSolverLanguageLexer.g:1:632: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 60 :
                // InternalSolverLanguageLexer.g:1:651: CircumflexAccent
                {
                mCircumflexAccent(); 

                }
                break;
            case 61 :
                // InternalSolverLanguageLexer.g:1:668: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 62 :
                // InternalSolverLanguageLexer.g:1:685: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 63 :
                // InternalSolverLanguageLexer.g:1:698: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 64 :
                // InternalSolverLanguageLexer.g:1:716: Tilde
                {
                mTilde(); 

                }
                break;
            case 65 :
                // InternalSolverLanguageLexer.g:1:722: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 66 :
                // InternalSolverLanguageLexer.g:1:734: RULE_QUOTED_ID
                {
                mRULE_QUOTED_ID(); 

                }
                break;
            case 67 :
                // InternalSolverLanguageLexer.g:1:749: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 68 :
                // InternalSolverLanguageLexer.g:1:765: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 69 :
                // InternalSolverLanguageLexer.g:1:773: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 70 :
                // InternalSolverLanguageLexer.g:1:782: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 71 :
                // InternalSolverLanguageLexer.g:1:798: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 72 :
                // InternalSolverLanguageLexer.g:1:806: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\15\56\1\111\1\56\1\114\1\116\1\122\1\124\1\127\1\131\5\uffff\1\141\4\uffff\1\146\4\uffff\2\53\5\uffff\2\56\1\uffff\3\56\1\165\16\56\1\u0085\1\u0086\5\56\2\uffff\1\56\44\uffff\6\56\1\uffff\16\56\1\u00a1\2\uffff\5\56\1\u00a7\17\56\1\u00b8\1\u00b9\3\56\1\uffff\1\56\1\u00be\1\56\1\u00c0\1\u00c1\1\uffff\1\56\1\u00c3\1\u00c4\1\56\1\u00c6\11\56\1\u00d0\1\u00d1\2\uffff\4\56\1\uffff\1\u00d6\2\uffff\1\56\2\uffff\1\56\1\uffff\6\56\1\u00df\1\56\1\u00e1\2\uffff\2\56\1\u00e4\1\u00e5\1\uffff\4\56\1\u00eb\3\56\1\uffff\1\u00ef\1\uffff\1\u00f0\1\u00f1\2\uffff\1\56\1\u00f3\1\56\1\u00f5\1\u00f6\1\uffff\1\u00f7\1\u00f8\1\u00f9\3\uffff\1\56\1\uffff\1\56\5\uffff\1\56\1\u00fd\1\u00fe\2\uffff";
    static final String DFA12_eofS =
        "\u00ff\uffff";
    static final String DFA12_minS =
        "\1\0\1\154\1\141\1\142\2\141\1\142\1\154\1\162\1\156\1\146\1\145\1\143\1\150\1\56\1\145\1\75\1\76\1\55\3\75\5\uffff\1\52\4\uffff\1\101\4\uffff\2\0\5\uffff\1\156\1\141\1\uffff\1\156\1\154\1\163\1\60\1\164\1\146\1\170\1\156\1\160\1\152\1\164\1\160\1\162\1\163\1\165\1\157\1\153\1\160\2\60\1\146\2\157\1\145\1\165\2\uffff\1\164\44\uffff\1\164\1\156\1\163\1\143\1\163\1\164\1\uffff\2\141\2\151\1\157\2\145\1\164\1\157\1\145\1\155\1\142\1\156\1\157\1\60\2\uffff\1\145\1\164\1\160\1\156\1\145\1\60\1\141\1\164\1\163\1\164\1\145\1\162\1\164\1\165\2\155\1\163\1\143\1\156\1\171\1\162\2\60\1\154\1\157\1\162\1\uffff\1\162\1\60\1\145\2\60\1\uffff\1\151\2\60\1\151\1\60\1\141\1\171\1\154\3\151\1\164\1\144\1\156\2\60\2\uffff\1\145\1\167\1\164\1\163\1\uffff\1\60\2\uffff\1\156\2\uffff\1\157\1\uffff\1\143\1\160\1\164\2\172\1\164\1\60\1\163\1\60\2\uffff\1\155\1\156\2\60\1\uffff\1\155\1\156\1\164\1\145\1\60\3\145\1\uffff\1\60\1\uffff\2\60\2\uffff\1\145\1\60\1\141\2\60\1\uffff\3\60\3\uffff\1\156\1\uffff\1\154\5\uffff\1\164\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\1\165\1\163\1\145\1\151\1\160\1\170\1\162\2\156\1\157\1\143\1\162\1\56\1\145\1\75\1\76\2\75\1\76\1\75\5\uffff\1\57\4\uffff\1\172\4\uffff\2\uffff\5\uffff\1\165\1\141\1\uffff\1\156\1\154\1\163\1\172\1\164\1\146\1\170\1\156\1\160\1\152\1\164\1\160\1\162\1\163\1\165\1\157\1\153\1\160\2\172\1\146\2\157\1\145\1\165\2\uffff\1\164\44\uffff\1\164\1\156\1\163\1\143\1\163\1\164\1\uffff\2\141\2\151\1\157\2\145\1\164\1\157\1\145\1\155\1\142\1\156\1\157\1\172\2\uffff\1\145\1\164\1\160\1\156\1\145\1\172\1\141\1\164\1\163\1\164\1\145\1\162\1\164\1\165\2\155\1\163\1\143\1\162\1\171\1\162\2\172\1\154\1\157\1\162\1\uffff\1\162\1\172\1\145\2\172\1\uffff\1\151\2\172\1\151\1\172\1\141\1\171\1\154\3\151\1\164\1\144\1\156\2\172\2\uffff\1\145\1\167\1\164\1\163\1\uffff\1\172\2\uffff\1\156\2\uffff\1\157\1\uffff\1\143\1\160\1\164\2\172\1\164\1\172\1\163\1\172\2\uffff\1\155\1\156\2\172\1\uffff\1\163\1\156\1\164\1\145\1\172\3\145\1\uffff\1\172\1\uffff\2\172\2\uffff\1\145\1\172\1\141\2\172\1\uffff\3\172\3\uffff\1\156\1\uffff\1\154\5\uffff\1\164\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\26\uffff\1\54\1\55\1\56\1\57\1\60\1\uffff\1\65\1\71\1\72\1\73\1\uffff\1\75\1\76\1\77\1\100\2\uffff\1\103\1\104\1\105\1\107\1\110\2\uffff\1\104\31\uffff\1\34\1\62\1\uffff\1\37\1\53\1\40\1\61\1\41\1\42\1\43\1\64\1\44\1\66\1\45\1\46\1\67\1\47\1\70\1\54\1\55\1\56\1\57\1\60\1\103\1\106\1\63\1\65\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\105\1\107\6\uffff\1\50\17\uffff\1\52\1\51\32\uffff\1\35\5\uffff\1\36\20\uffff\1\27\1\30\4\uffff\1\31\1\uffff\1\32\1\33\1\uffff\1\22\1\21\1\uffff\1\25\11\uffff\1\23\1\24\4\uffff\1\26\10\uffff\1\17\1\uffff\1\15\2\uffff\1\16\1\20\5\uffff\1\11\3\uffff\1\12\1\13\1\14\1\uffff\1\4\1\uffff\1\3\1\5\1\6\1\7\1\10\3\uffff\1\2\1\1";
    static final String DFA12_specialS =
        "\1\1\44\uffff\1\0\1\2\u00d8\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\20\1\45\2\53\1\47\1\53\1\46\1\26\1\27\1\30\1\31\1\32\1\21\1\16\1\33\12\51\1\22\1\34\1\23\1\24\1\25\1\35\1\53\32\50\1\36\1\53\1\37\1\40\1\50\1\53\1\3\1\50\1\1\1\4\1\7\1\2\2\50\1\12\2\50\1\17\1\5\1\50\1\6\1\10\1\50\1\13\1\14\1\15\1\11\5\50\1\41\1\42\1\43\1\44\uff81\53",
            "\1\55\2\uffff\1\54",
            "\1\60\23\uffff\1\57",
            "\1\61\20\uffff\1\62",
            "\1\63\3\uffff\1\64",
            "\1\65\7\uffff\1\66",
            "\1\70\15\uffff\1\67",
            "\1\74\1\72\1\75\3\uffff\1\73\5\uffff\1\71",
            "\1\76",
            "\1\77",
            "\1\102\6\uffff\1\100\1\101",
            "\1\103\11\uffff\1\104",
            "\1\105",
            "\1\106\11\uffff\1\107",
            "\1\110",
            "\1\112",
            "\1\113",
            "\1\115",
            "\1\117\14\uffff\1\120\2\uffff\1\121",
            "\1\123",
            "\1\125\1\126",
            "\1\130",
            "",
            "",
            "",
            "",
            "",
            "\1\140\4\uffff\1\137",
            "",
            "",
            "",
            "",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\0\153",
            "\0\154",
            "",
            "",
            "",
            "",
            "",
            "\1\157\6\uffff\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\u0084\24\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "\1\u008c",
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
            "",
            "",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4\3\uffff\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00bf",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00c2",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00c5",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u00d7",
            "",
            "",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00e0",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00e6\5\uffff\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u00f2",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00f4",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "",
            "",
            "",
            "",
            "",
            "\1\u00fc",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            return "1:1: Tokens : ( Containment | Functional | Abstract | Contains | Datatype | Maximize | Minimize | Opposite | Default | Extends | Problem | Unknown | Extern | Import | Object | Refers | Class | Count | Empty | Error | False | Scope | Else | Enum | Root | Then | True | FullStopFullStopFullStop | Inf | Let | ExclamationMarkEqualsSign | HyphenMinusGreaterThanSign | ColonHyphenMinus | ColonColon | ColonEqualsSign | LessThanSignEqualsSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | As | If | In | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | CircumflexAccent | LeftCurlyBracket | VerticalLine | RightCurlyBracket | Tilde | RULE_STRING | RULE_QUOTED_ID | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_37 = input.LA(1);

                        s = -1;
                        if ( ((LA12_37>='\u0000' && LA12_37<='\uFFFF')) ) {s = 107;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='c') ) {s = 1;}

                        else if ( (LA12_0=='f') ) {s = 2;}

                        else if ( (LA12_0=='a') ) {s = 3;}

                        else if ( (LA12_0=='d') ) {s = 4;}

                        else if ( (LA12_0=='m') ) {s = 5;}

                        else if ( (LA12_0=='o') ) {s = 6;}

                        else if ( (LA12_0=='e') ) {s = 7;}

                        else if ( (LA12_0=='p') ) {s = 8;}

                        else if ( (LA12_0=='u') ) {s = 9;}

                        else if ( (LA12_0=='i') ) {s = 10;}

                        else if ( (LA12_0=='r') ) {s = 11;}

                        else if ( (LA12_0=='s') ) {s = 12;}

                        else if ( (LA12_0=='t') ) {s = 13;}

                        else if ( (LA12_0=='.') ) {s = 14;}

                        else if ( (LA12_0=='l') ) {s = 15;}

                        else if ( (LA12_0=='!') ) {s = 16;}

                        else if ( (LA12_0=='-') ) {s = 17;}

                        else if ( (LA12_0==':') ) {s = 18;}

                        else if ( (LA12_0=='<') ) {s = 19;}

                        else if ( (LA12_0=='=') ) {s = 20;}

                        else if ( (LA12_0=='>') ) {s = 21;}

                        else if ( (LA12_0=='(') ) {s = 22;}

                        else if ( (LA12_0==')') ) {s = 23;}

                        else if ( (LA12_0=='*') ) {s = 24;}

                        else if ( (LA12_0=='+') ) {s = 25;}

                        else if ( (LA12_0==',') ) {s = 26;}

                        else if ( (LA12_0=='/') ) {s = 27;}

                        else if ( (LA12_0==';') ) {s = 28;}

                        else if ( (LA12_0=='?') ) {s = 29;}

                        else if ( (LA12_0=='[') ) {s = 30;}

                        else if ( (LA12_0==']') ) {s = 31;}

                        else if ( (LA12_0=='^') ) {s = 32;}

                        else if ( (LA12_0=='{') ) {s = 33;}

                        else if ( (LA12_0=='|') ) {s = 34;}

                        else if ( (LA12_0=='}') ) {s = 35;}

                        else if ( (LA12_0=='~') ) {s = 36;}

                        else if ( (LA12_0=='\"') ) {s = 37;}

                        else if ( (LA12_0=='\'') ) {s = 38;}

                        else if ( (LA12_0=='%') ) {s = 39;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='n'||LA12_0=='q'||(LA12_0>='v' && LA12_0<='z')) ) {s = 40;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 41;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 42;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||LA12_0=='&'||LA12_0=='@'||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='\u007F' && LA12_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_38 = input.LA(1);

                        s = -1;
                        if ( ((LA12_38>='\u0000' && LA12_38<='\uFFFF')) ) {s = 108;}

                        else s = 43;

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