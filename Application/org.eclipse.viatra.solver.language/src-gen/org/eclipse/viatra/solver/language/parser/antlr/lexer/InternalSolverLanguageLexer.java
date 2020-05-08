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
    public static final int ADD=33;
    public static final int True=32;
    public static final int GREATER_EQ=4;
    public static final int Count=20;
    public static final int False=23;
    public static final int Must=27;
    public static final int LessThanSign=67;
    public static final int LeftParenthesis=57;
    public static final int Unknown=16;
    public static final int RULE_REFLEXIVE_TRANSITIVE_CLOSURE=80;
    public static final int FullStopFullStop=47;
    public static final int Real=30;
    public static final int Then=31;
    public static final int Extends=15;
    public static final int RightSquareBracket=71;
    public static final int ExclamationMark=56;
    public static final int Opposite=10;
    public static final int SUB=37;
    public static final int GreaterThanSign=69;
    public static final int NOT_EQ=17;
    public static final int RULE_ID=82;
    public static final int MUL=35;
    public static final int IN=53;
    public static final int RULE_QUOTED_ID=77;
    public static final int RightParenthesis=58;
    public static final int Sum=44;
    public static final int EQ=52;
    public static final int GreaterThanSignEqualsSign=51;
    public static final int Functional=5;
    public static final int EqualsSignEqualsSign=50;
    public static final int Avg=38;
    public static final int Min=43;
    public static final int VerticalLine=74;
    public static final int PlusSign=60;
    public static final int RULE_INT=83;
    public static final int Contains=7;
    public static final int RULE_ML_COMMENT=84;
    public static final int POW=36;
    public static final int RULE_TRANSITIVE_CLOSURE=79;
    public static final int Class=19;
    public static final int LESS=25;
    public static final int LeftSquareBracket=70;
    public static final int RULE_FULL_STOP=81;
    public static final int Current=13;
    public static final int If=54;
    public static final int Inf=39;
    public static final int LESS_EQ=12;
    public static final int May=42;
    public static final int Max=41;
    public static final int In=55;
    public static final int RULE_STRING=76;
    public static final int Int=40;
    public static final int Extern=18;
    public static final int RULE_SL_COMMENT=78;
    public static final int Prod=29;
    public static final int Comma=61;
    public static final int EqualsSign=68;
    public static final int Empty=21;
    public static final int HyphenMinus=62;
    public static final int Maximize=8;
    public static final int LessThanSignEqualsSign=49;
    public static final int Solidus=64;
    public static final int Colon=65;
    public static final int RightCurlyBracket=75;
    public static final int EOF=-1;
    public static final int Asterisk=59;
    public static final int FullStop=63;
    public static final int RULE_WS=85;
    public static final int Abstract=6;
    public static final int Minimize=9;
    public static final int GREATER=11;
    public static final int LeftCurlyBracket=73;
    public static final int Error=22;
    public static final int Only=28;
    public static final int RULE_ANY_OTHER=86;
    public static final int Default=14;
    public static final int ColonHyphenMinus=48;
    public static final int CircumflexAccent=72;
    public static final int DIV=34;
    public static final int Semicolon=66;
    public static final int Scope=24;
    public static final int Else=26;
    public static final int ExclamationMarkEqualsSign=45;
    public static final int HyphenMinusGreaterThanSign=46;

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

    // $ANTLR start "GREATER_EQ"
    public final void mGREATER_EQ() throws RecognitionException {
        try {
            int _type = GREATER_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:14:12: ( 'GREATER_EQ' )
            // InternalSolverLanguageLexer.g:14:14: 'GREATER_EQ'
            {
            match("GREATER_EQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_EQ"

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

    // $ANTLR start "Maximize"
    public final void mMaximize() throws RecognitionException {
        try {
            int _type = Maximize;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:22:10: ( 'maximize' )
            // InternalSolverLanguageLexer.g:22:12: 'maximize'
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
            // InternalSolverLanguageLexer.g:24:10: ( 'minimize' )
            // InternalSolverLanguageLexer.g:24:12: 'minimize'
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
            // InternalSolverLanguageLexer.g:26:10: ( 'opposite' )
            // InternalSolverLanguageLexer.g:26:12: 'opposite'
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

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:28:9: ( 'GREATER' )
            // InternalSolverLanguageLexer.g:28:11: 'GREATER'
            {
            match("GREATER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "LESS_EQ"
    public final void mLESS_EQ() throws RecognitionException {
        try {
            int _type = LESS_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:30:9: ( 'LESS_EQ' )
            // InternalSolverLanguageLexer.g:30:11: 'LESS_EQ'
            {
            match("LESS_EQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_EQ"

    // $ANTLR start "Current"
    public final void mCurrent() throws RecognitionException {
        try {
            int _type = Current;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:32:9: ( 'current' )
            // InternalSolverLanguageLexer.g:32:11: 'current'
            {
            match("current"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Current"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:34:9: ( 'default' )
            // InternalSolverLanguageLexer.g:34:11: 'default'
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
            // InternalSolverLanguageLexer.g:36:9: ( 'extends' )
            // InternalSolverLanguageLexer.g:36:11: 'extends'
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

    // $ANTLR start "Unknown"
    public final void mUnknown() throws RecognitionException {
        try {
            int _type = Unknown;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:38:9: ( 'unknown' )
            // InternalSolverLanguageLexer.g:38:11: 'unknown'
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

    // $ANTLR start "NOT_EQ"
    public final void mNOT_EQ() throws RecognitionException {
        try {
            int _type = NOT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:40:8: ( 'NOT_EQ' )
            // InternalSolverLanguageLexer.g:40:10: 'NOT_EQ'
            {
            match("NOT_EQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQ"

    // $ANTLR start "Extern"
    public final void mExtern() throws RecognitionException {
        try {
            int _type = Extern;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:42:8: ( 'extern' )
            // InternalSolverLanguageLexer.g:42:10: 'extern'
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

    // $ANTLR start "Class"
    public final void mClass() throws RecognitionException {
        try {
            int _type = Class;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:44:7: ( 'class' )
            // InternalSolverLanguageLexer.g:44:9: 'class'
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
            // InternalSolverLanguageLexer.g:46:7: ( 'count' )
            // InternalSolverLanguageLexer.g:46:9: 'count'
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
            // InternalSolverLanguageLexer.g:48:7: ( 'empty' )
            // InternalSolverLanguageLexer.g:48:9: 'empty'
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
            // InternalSolverLanguageLexer.g:50:7: ( 'error' )
            // InternalSolverLanguageLexer.g:50:9: 'error'
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
            // InternalSolverLanguageLexer.g:52:7: ( 'false' )
            // InternalSolverLanguageLexer.g:52:9: 'false'
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
            // InternalSolverLanguageLexer.g:54:7: ( 'scope' )
            // InternalSolverLanguageLexer.g:54:9: 'scope'
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

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:56:6: ( 'LESS' )
            // InternalSolverLanguageLexer.g:56:8: 'LESS'
            {
            match("LESS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

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

    // $ANTLR start "Must"
    public final void mMust() throws RecognitionException {
        try {
            int _type = Must;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:60:6: ( 'must' )
            // InternalSolverLanguageLexer.g:60:8: 'must'
            {
            match("must"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Must"

    // $ANTLR start "Only"
    public final void mOnly() throws RecognitionException {
        try {
            int _type = Only;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:62:6: ( 'only' )
            // InternalSolverLanguageLexer.g:62:8: 'only'
            {
            match("only"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Only"

    // $ANTLR start "Prod"
    public final void mProd() throws RecognitionException {
        try {
            int _type = Prod;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:64:6: ( 'prod' )
            // InternalSolverLanguageLexer.g:64:8: 'prod'
            {
            match("prod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Prod"

    // $ANTLR start "Real"
    public final void mReal() throws RecognitionException {
        try {
            int _type = Real;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:66:6: ( 'real' )
            // InternalSolverLanguageLexer.g:66:8: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Real"

    // $ANTLR start "Then"
    public final void mThen() throws RecognitionException {
        try {
            int _type = Then;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:68:6: ( 'then' )
            // InternalSolverLanguageLexer.g:68:8: 'then'
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
            // InternalSolverLanguageLexer.g:70:6: ( 'true' )
            // InternalSolverLanguageLexer.g:70:8: 'true'
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

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:72:5: ( 'ADD' )
            // InternalSolverLanguageLexer.g:72:7: 'ADD'
            {
            match("ADD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:74:5: ( 'DIV' )
            // InternalSolverLanguageLexer.g:74:7: 'DIV'
            {
            match("DIV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:76:5: ( 'MUL' )
            // InternalSolverLanguageLexer.g:76:7: 'MUL'
            {
            match("MUL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "POW"
    public final void mPOW() throws RecognitionException {
        try {
            int _type = POW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:78:5: ( 'POW' )
            // InternalSolverLanguageLexer.g:78:7: 'POW'
            {
            match("POW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POW"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:80:5: ( 'SUB' )
            // InternalSolverLanguageLexer.g:80:7: 'SUB'
            {
            match("SUB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "Avg"
    public final void mAvg() throws RecognitionException {
        try {
            int _type = Avg;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:82:5: ( 'avg' )
            // InternalSolverLanguageLexer.g:82:7: 'avg'
            {
            match("avg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Avg"

    // $ANTLR start "Inf"
    public final void mInf() throws RecognitionException {
        try {
            int _type = Inf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:84:5: ( 'inf' )
            // InternalSolverLanguageLexer.g:84:7: 'inf'
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

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            int _type = Int;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:86:5: ( 'int' )
            // InternalSolverLanguageLexer.g:86:7: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "Max"
    public final void mMax() throws RecognitionException {
        try {
            int _type = Max;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:88:5: ( 'max' )
            // InternalSolverLanguageLexer.g:88:7: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Max"

    // $ANTLR start "May"
    public final void mMay() throws RecognitionException {
        try {
            int _type = May;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:90:5: ( 'may' )
            // InternalSolverLanguageLexer.g:90:7: 'may'
            {
            match("may"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "May"

    // $ANTLR start "Min"
    public final void mMin() throws RecognitionException {
        try {
            int _type = Min;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:92:5: ( 'min' )
            // InternalSolverLanguageLexer.g:92:7: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Min"

    // $ANTLR start "Sum"
    public final void mSum() throws RecognitionException {
        try {
            int _type = Sum;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:94:5: ( 'sum' )
            // InternalSolverLanguageLexer.g:94:7: 'sum'
            {
            match("sum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sum"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:96:27: ( '!=' )
            // InternalSolverLanguageLexer.g:96:29: '!='
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
            // InternalSolverLanguageLexer.g:98:28: ( '->' )
            // InternalSolverLanguageLexer.g:98:30: '->'
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

    // $ANTLR start "FullStopFullStop"
    public final void mFullStopFullStop() throws RecognitionException {
        try {
            int _type = FullStopFullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:100:18: ( '..' )
            // InternalSolverLanguageLexer.g:100:20: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopFullStop"

    // $ANTLR start "ColonHyphenMinus"
    public final void mColonHyphenMinus() throws RecognitionException {
        try {
            int _type = ColonHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:102:18: ( ':-' )
            // InternalSolverLanguageLexer.g:102:20: ':-'
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

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:104:24: ( '<=' )
            // InternalSolverLanguageLexer.g:104:26: '<='
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
            // InternalSolverLanguageLexer.g:106:22: ( '==' )
            // InternalSolverLanguageLexer.g:106:24: '=='
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

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:108:27: ( '>=' )
            // InternalSolverLanguageLexer.g:108:29: '>='
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

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:110:4: ( 'EQ' )
            // InternalSolverLanguageLexer.g:110:6: 'EQ'
            {
            match("EQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:112:4: ( 'IN' )
            // InternalSolverLanguageLexer.g:112:6: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:114:4: ( 'if' )
            // InternalSolverLanguageLexer.g:114:6: 'if'
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
            // InternalSolverLanguageLexer.g:116:4: ( 'in' )
            // InternalSolverLanguageLexer.g:116:6: 'in'
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
            // InternalSolverLanguageLexer.g:118:17: ( '!' )
            // InternalSolverLanguageLexer.g:118:19: '!'
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
            // InternalSolverLanguageLexer.g:120:17: ( '(' )
            // InternalSolverLanguageLexer.g:120:19: '('
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
            // InternalSolverLanguageLexer.g:122:18: ( ')' )
            // InternalSolverLanguageLexer.g:122:20: ')'
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
            // InternalSolverLanguageLexer.g:124:10: ( '*' )
            // InternalSolverLanguageLexer.g:124:12: '*'
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
            // InternalSolverLanguageLexer.g:126:10: ( '+' )
            // InternalSolverLanguageLexer.g:126:12: '+'
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
            // InternalSolverLanguageLexer.g:128:7: ( ',' )
            // InternalSolverLanguageLexer.g:128:9: ','
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
            // InternalSolverLanguageLexer.g:130:13: ( '-' )
            // InternalSolverLanguageLexer.g:130:15: '-'
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
            // InternalSolverLanguageLexer.g:132:10: ( '.' )
            // InternalSolverLanguageLexer.g:132:12: '.'
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
            // InternalSolverLanguageLexer.g:134:9: ( '/' )
            // InternalSolverLanguageLexer.g:134:11: '/'
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
            // InternalSolverLanguageLexer.g:136:7: ( ':' )
            // InternalSolverLanguageLexer.g:136:9: ':'
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
            // InternalSolverLanguageLexer.g:138:11: ( ';' )
            // InternalSolverLanguageLexer.g:138:13: ';'
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
            // InternalSolverLanguageLexer.g:140:14: ( '<' )
            // InternalSolverLanguageLexer.g:140:16: '<'
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
            // InternalSolverLanguageLexer.g:142:12: ( '=' )
            // InternalSolverLanguageLexer.g:142:14: '='
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
            // InternalSolverLanguageLexer.g:144:17: ( '>' )
            // InternalSolverLanguageLexer.g:144:19: '>'
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

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:146:19: ( '[' )
            // InternalSolverLanguageLexer.g:146:21: '['
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
            // InternalSolverLanguageLexer.g:148:20: ( ']' )
            // InternalSolverLanguageLexer.g:148:22: ']'
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
            // InternalSolverLanguageLexer.g:150:18: ( '^' )
            // InternalSolverLanguageLexer.g:150:20: '^'
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
            // InternalSolverLanguageLexer.g:152:18: ( '{' )
            // InternalSolverLanguageLexer.g:152:20: '{'
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
            // InternalSolverLanguageLexer.g:154:14: ( '|' )
            // InternalSolverLanguageLexer.g:154:16: '|'
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
            // InternalSolverLanguageLexer.g:156:19: ( '}' )
            // InternalSolverLanguageLexer.g:156:21: '}'
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSolverLanguageLexer.g:158:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalSolverLanguageLexer.g:158:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalSolverLanguageLexer.g:158:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalSolverLanguageLexer.g:158:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalSolverLanguageLexer.g:158:27: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalSolverLanguageLexer.g:160:16: ( '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalSolverLanguageLexer.g:160:18: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalSolverLanguageLexer.g:160:23: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
            	    // InternalSolverLanguageLexer.g:160:24: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalSolverLanguageLexer.g:160:31: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalSolverLanguageLexer.g:162:17: ( ( '%' | '//' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSolverLanguageLexer.g:162:19: ( '%' | '//' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // InternalSolverLanguageLexer.g:162:19: ( '%' | '//' )
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
                    // InternalSolverLanguageLexer.g:162:20: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 2 :
                    // InternalSolverLanguageLexer.g:162:24: '//'
                    {
                    match("//"); 


                    }
                    break;

            }

            // InternalSolverLanguageLexer.g:162:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSolverLanguageLexer.g:162:30: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalSolverLanguageLexer.g:162:46: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSolverLanguageLexer.g:162:47: ( '\\r' )? '\\n'
                    {
                    // InternalSolverLanguageLexer.g:162:47: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSolverLanguageLexer.g:162:47: '\\r'
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
            // InternalSolverLanguageLexer.g:164:34: ()
            // InternalSolverLanguageLexer.g:164:36: 
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
            // InternalSolverLanguageLexer.g:166:44: ()
            // InternalSolverLanguageLexer.g:166:46: 
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
            // InternalSolverLanguageLexer.g:168:25: ()
            // InternalSolverLanguageLexer.g:168:27: 
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
            // InternalSolverLanguageLexer.g:170:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSolverLanguageLexer.g:170:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSolverLanguageLexer.g:170:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSolverLanguageLexer.g:170:11: '^'
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

            // InternalSolverLanguageLexer.g:170:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalSolverLanguageLexer.g:172:10: ( ( '0' .. '9' )+ )
            // InternalSolverLanguageLexer.g:172:12: ( '0' .. '9' )+
            {
            // InternalSolverLanguageLexer.g:172:12: ( '0' .. '9' )+
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
            	    // InternalSolverLanguageLexer.g:172:13: '0' .. '9'
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
            // InternalSolverLanguageLexer.g:174:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSolverLanguageLexer.g:174:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSolverLanguageLexer.g:174:24: ( options {greedy=false; } : . )*
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
            	    // InternalSolverLanguageLexer.g:174:52: .
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
            // InternalSolverLanguageLexer.g:176:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSolverLanguageLexer.g:176:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSolverLanguageLexer.g:176:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalSolverLanguageLexer.g:178:16: ( . )
            // InternalSolverLanguageLexer.g:178:18: .
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
        // InternalSolverLanguageLexer.g:1:8: ( GREATER_EQ | Functional | Abstract | Contains | Maximize | Minimize | Opposite | GREATER | LESS_EQ | Current | Default | Extends | Unknown | NOT_EQ | Extern | Class | Count | Empty | Error | False | Scope | LESS | Else | Must | Only | Prod | Real | Then | True | ADD | DIV | MUL | POW | SUB | Avg | Inf | Int | Max | May | Min | Sum | ExclamationMarkEqualsSign | HyphenMinusGreaterThanSign | FullStopFullStop | ColonHyphenMinus | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | EQ | IN | If | In | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | LeftSquareBracket | RightSquareBracket | CircumflexAccent | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_STRING | RULE_QUOTED_ID | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=80;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSolverLanguageLexer.g:1:10: GREATER_EQ
                {
                mGREATER_EQ(); 

                }
                break;
            case 2 :
                // InternalSolverLanguageLexer.g:1:21: Functional
                {
                mFunctional(); 

                }
                break;
            case 3 :
                // InternalSolverLanguageLexer.g:1:32: Abstract
                {
                mAbstract(); 

                }
                break;
            case 4 :
                // InternalSolverLanguageLexer.g:1:41: Contains
                {
                mContains(); 

                }
                break;
            case 5 :
                // InternalSolverLanguageLexer.g:1:50: Maximize
                {
                mMaximize(); 

                }
                break;
            case 6 :
                // InternalSolverLanguageLexer.g:1:59: Minimize
                {
                mMinimize(); 

                }
                break;
            case 7 :
                // InternalSolverLanguageLexer.g:1:68: Opposite
                {
                mOpposite(); 

                }
                break;
            case 8 :
                // InternalSolverLanguageLexer.g:1:77: GREATER
                {
                mGREATER(); 

                }
                break;
            case 9 :
                // InternalSolverLanguageLexer.g:1:85: LESS_EQ
                {
                mLESS_EQ(); 

                }
                break;
            case 10 :
                // InternalSolverLanguageLexer.g:1:93: Current
                {
                mCurrent(); 

                }
                break;
            case 11 :
                // InternalSolverLanguageLexer.g:1:101: Default
                {
                mDefault(); 

                }
                break;
            case 12 :
                // InternalSolverLanguageLexer.g:1:109: Extends
                {
                mExtends(); 

                }
                break;
            case 13 :
                // InternalSolverLanguageLexer.g:1:117: Unknown
                {
                mUnknown(); 

                }
                break;
            case 14 :
                // InternalSolverLanguageLexer.g:1:125: NOT_EQ
                {
                mNOT_EQ(); 

                }
                break;
            case 15 :
                // InternalSolverLanguageLexer.g:1:132: Extern
                {
                mExtern(); 

                }
                break;
            case 16 :
                // InternalSolverLanguageLexer.g:1:139: Class
                {
                mClass(); 

                }
                break;
            case 17 :
                // InternalSolverLanguageLexer.g:1:145: Count
                {
                mCount(); 

                }
                break;
            case 18 :
                // InternalSolverLanguageLexer.g:1:151: Empty
                {
                mEmpty(); 

                }
                break;
            case 19 :
                // InternalSolverLanguageLexer.g:1:157: Error
                {
                mError(); 

                }
                break;
            case 20 :
                // InternalSolverLanguageLexer.g:1:163: False
                {
                mFalse(); 

                }
                break;
            case 21 :
                // InternalSolverLanguageLexer.g:1:169: Scope
                {
                mScope(); 

                }
                break;
            case 22 :
                // InternalSolverLanguageLexer.g:1:175: LESS
                {
                mLESS(); 

                }
                break;
            case 23 :
                // InternalSolverLanguageLexer.g:1:180: Else
                {
                mElse(); 

                }
                break;
            case 24 :
                // InternalSolverLanguageLexer.g:1:185: Must
                {
                mMust(); 

                }
                break;
            case 25 :
                // InternalSolverLanguageLexer.g:1:190: Only
                {
                mOnly(); 

                }
                break;
            case 26 :
                // InternalSolverLanguageLexer.g:1:195: Prod
                {
                mProd(); 

                }
                break;
            case 27 :
                // InternalSolverLanguageLexer.g:1:200: Real
                {
                mReal(); 

                }
                break;
            case 28 :
                // InternalSolverLanguageLexer.g:1:205: Then
                {
                mThen(); 

                }
                break;
            case 29 :
                // InternalSolverLanguageLexer.g:1:210: True
                {
                mTrue(); 

                }
                break;
            case 30 :
                // InternalSolverLanguageLexer.g:1:215: ADD
                {
                mADD(); 

                }
                break;
            case 31 :
                // InternalSolverLanguageLexer.g:1:219: DIV
                {
                mDIV(); 

                }
                break;
            case 32 :
                // InternalSolverLanguageLexer.g:1:223: MUL
                {
                mMUL(); 

                }
                break;
            case 33 :
                // InternalSolverLanguageLexer.g:1:227: POW
                {
                mPOW(); 

                }
                break;
            case 34 :
                // InternalSolverLanguageLexer.g:1:231: SUB
                {
                mSUB(); 

                }
                break;
            case 35 :
                // InternalSolverLanguageLexer.g:1:235: Avg
                {
                mAvg(); 

                }
                break;
            case 36 :
                // InternalSolverLanguageLexer.g:1:239: Inf
                {
                mInf(); 

                }
                break;
            case 37 :
                // InternalSolverLanguageLexer.g:1:243: Int
                {
                mInt(); 

                }
                break;
            case 38 :
                // InternalSolverLanguageLexer.g:1:247: Max
                {
                mMax(); 

                }
                break;
            case 39 :
                // InternalSolverLanguageLexer.g:1:251: May
                {
                mMay(); 

                }
                break;
            case 40 :
                // InternalSolverLanguageLexer.g:1:255: Min
                {
                mMin(); 

                }
                break;
            case 41 :
                // InternalSolverLanguageLexer.g:1:259: Sum
                {
                mSum(); 

                }
                break;
            case 42 :
                // InternalSolverLanguageLexer.g:1:263: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 43 :
                // InternalSolverLanguageLexer.g:1:289: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 44 :
                // InternalSolverLanguageLexer.g:1:316: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 45 :
                // InternalSolverLanguageLexer.g:1:333: ColonHyphenMinus
                {
                mColonHyphenMinus(); 

                }
                break;
            case 46 :
                // InternalSolverLanguageLexer.g:1:350: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 47 :
                // InternalSolverLanguageLexer.g:1:373: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 48 :
                // InternalSolverLanguageLexer.g:1:394: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 49 :
                // InternalSolverLanguageLexer.g:1:420: EQ
                {
                mEQ(); 

                }
                break;
            case 50 :
                // InternalSolverLanguageLexer.g:1:423: IN
                {
                mIN(); 

                }
                break;
            case 51 :
                // InternalSolverLanguageLexer.g:1:426: If
                {
                mIf(); 

                }
                break;
            case 52 :
                // InternalSolverLanguageLexer.g:1:429: In
                {
                mIn(); 

                }
                break;
            case 53 :
                // InternalSolverLanguageLexer.g:1:432: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 54 :
                // InternalSolverLanguageLexer.g:1:448: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 55 :
                // InternalSolverLanguageLexer.g:1:464: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 56 :
                // InternalSolverLanguageLexer.g:1:481: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 57 :
                // InternalSolverLanguageLexer.g:1:490: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 58 :
                // InternalSolverLanguageLexer.g:1:499: Comma
                {
                mComma(); 

                }
                break;
            case 59 :
                // InternalSolverLanguageLexer.g:1:505: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 60 :
                // InternalSolverLanguageLexer.g:1:517: FullStop
                {
                mFullStop(); 

                }
                break;
            case 61 :
                // InternalSolverLanguageLexer.g:1:526: Solidus
                {
                mSolidus(); 

                }
                break;
            case 62 :
                // InternalSolverLanguageLexer.g:1:534: Colon
                {
                mColon(); 

                }
                break;
            case 63 :
                // InternalSolverLanguageLexer.g:1:540: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 64 :
                // InternalSolverLanguageLexer.g:1:550: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 65 :
                // InternalSolverLanguageLexer.g:1:563: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 66 :
                // InternalSolverLanguageLexer.g:1:574: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 67 :
                // InternalSolverLanguageLexer.g:1:590: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 68 :
                // InternalSolverLanguageLexer.g:1:608: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 69 :
                // InternalSolverLanguageLexer.g:1:627: CircumflexAccent
                {
                mCircumflexAccent(); 

                }
                break;
            case 70 :
                // InternalSolverLanguageLexer.g:1:644: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 71 :
                // InternalSolverLanguageLexer.g:1:661: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 72 :
                // InternalSolverLanguageLexer.g:1:674: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 73 :
                // InternalSolverLanguageLexer.g:1:692: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 74 :
                // InternalSolverLanguageLexer.g:1:704: RULE_QUOTED_ID
                {
                mRULE_QUOTED_ID(); 

                }
                break;
            case 75 :
                // InternalSolverLanguageLexer.g:1:719: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 76 :
                // InternalSolverLanguageLexer.g:1:735: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 77 :
                // InternalSolverLanguageLexer.g:1:743: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 78 :
                // InternalSolverLanguageLexer.g:1:752: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 79 :
                // InternalSolverLanguageLexer.g:1:768: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 80 :
                // InternalSolverLanguageLexer.g:1:776: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\25\64\1\127\1\131\1\133\1\135\1\137\1\141\1\143\2\64\5\uffff\1\155\3\uffff\1\161\3\uffff\2\62\5\uffff\1\64\1\uffff\37\64\1\u009d\1\u009e\16\uffff\1\u009f\1\u00a0\23\uffff\4\64\1\u00a5\4\64\1\u00ab\1\u00ac\1\u00ae\14\64\1\u00bb\4\64\1\u00c0\1\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5\1\u00c6\4\uffff\4\64\1\uffff\5\64\2\uffff\1\64\1\uffff\1\u00d1\1\64\1\u00d3\1\u00d5\4\64\1\u00db\3\64\1\uffff\1\u00df\1\u00e0\1\u00e1\1\u00e2\7\uffff\2\64\1\u00e5\2\64\1\u00e8\1\64\1\u00ea\2\64\1\uffff\1\64\1\uffff\1\64\1\uffff\3\64\1\u00f2\1\u00f3\1\uffff\2\64\1\u00f6\4\uffff\2\64\1\uffff\2\64\1\uffff\1\64\1\uffff\6\64\1\u0102\2\uffff\1\64\1\u0104\1\uffff\1\u0106\3\64\1\u010a\3\64\1\u010e\1\u010f\1\u0110\1\uffff\1\u0111\1\uffff\1\64\1\uffff\1\64\1\u0114\1\u0115\1\uffff\1\u0116\1\u0117\1\u0118\4\uffff\2\64\5\uffff\1\u011b\1\u011c\2\uffff";
    static final String DFA12_eofS =
        "\u011d\uffff";
    static final String DFA12_minS =
        "\1\0\1\122\1\141\1\142\1\154\1\141\1\156\1\105\1\145\1\154\1\156\1\117\1\143\1\162\1\145\1\150\1\104\1\111\1\125\1\117\1\125\1\146\1\75\1\76\1\56\1\55\3\75\1\121\1\116\5\uffff\1\52\3\uffff\1\101\3\uffff\2\0\5\uffff\1\105\1\uffff\1\156\1\154\1\163\1\147\1\156\1\162\1\141\1\170\1\156\1\163\1\160\1\154\1\123\1\146\1\164\1\160\1\162\1\163\1\153\1\124\1\157\1\155\1\157\1\141\1\145\1\165\1\104\1\126\1\114\1\127\1\102\2\60\16\uffff\2\60\23\uffff\1\101\1\143\1\163\1\164\1\60\1\164\1\156\1\162\1\163\3\60\1\164\1\157\1\171\1\123\1\141\1\145\1\164\1\157\1\145\1\156\1\137\1\160\1\60\1\144\1\154\1\156\1\145\7\60\4\uffff\1\124\1\164\1\145\1\162\1\uffff\1\141\1\164\1\145\1\163\1\155\2\uffff\1\155\1\uffff\1\60\1\163\2\60\1\165\1\156\1\171\1\162\1\60\1\157\1\105\1\145\1\uffff\4\60\7\uffff\1\105\1\151\1\60\1\141\1\151\1\60\1\156\1\60\2\151\1\uffff\1\151\1\uffff\1\105\1\uffff\1\154\1\144\1\156\2\60\1\uffff\1\167\1\121\1\60\4\uffff\1\122\1\157\1\uffff\1\143\1\156\1\uffff\1\164\1\uffff\2\172\1\164\1\121\1\164\1\163\1\60\2\uffff\1\156\1\60\1\uffff\1\60\1\156\1\164\1\163\1\60\3\145\3\60\1\uffff\1\60\1\uffff\1\105\1\uffff\1\141\2\60\1\uffff\3\60\4\uffff\1\121\1\154\5\uffff\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\122\1\165\1\166\2\165\1\160\1\105\1\145\1\170\1\156\1\117\1\165\1\162\1\145\1\162\1\104\1\111\1\125\1\117\1\125\1\156\1\75\1\76\1\56\1\55\3\75\1\121\1\116\5\uffff\1\57\3\uffff\1\172\3\uffff\2\uffff\5\uffff\1\105\1\uffff\1\156\1\154\1\163\1\147\1\165\1\162\1\141\1\171\1\156\1\163\1\160\1\154\1\123\1\146\1\164\1\160\1\162\1\163\1\153\1\124\1\157\1\155\1\157\1\141\1\145\1\165\1\104\1\126\1\114\1\127\1\102\2\172\16\uffff\2\172\23\uffff\1\101\1\143\1\163\1\164\1\172\1\164\1\156\1\162\1\163\3\172\1\164\1\157\1\171\1\123\1\141\1\145\1\164\1\157\1\145\1\156\1\137\1\160\1\172\1\144\1\154\1\156\1\145\7\172\4\uffff\1\124\1\164\1\145\1\162\1\uffff\1\141\1\164\1\145\1\163\1\155\2\uffff\1\155\1\uffff\1\172\1\163\2\172\1\165\1\162\1\171\1\162\1\172\1\157\1\105\1\145\1\uffff\4\172\7\uffff\1\105\1\151\1\172\1\141\1\151\1\172\1\156\1\172\2\151\1\uffff\1\151\1\uffff\1\105\1\uffff\1\154\1\144\1\156\2\172\1\uffff\1\167\1\121\1\172\4\uffff\1\122\1\157\1\uffff\1\143\1\156\1\uffff\1\164\1\uffff\2\172\1\164\1\121\1\164\1\163\1\172\2\uffff\1\156\1\172\1\uffff\1\172\1\156\1\164\1\163\1\172\3\145\3\172\1\uffff\1\172\1\uffff\1\105\1\uffff\1\141\2\172\1\uffff\3\172\4\uffff\1\121\1\154\5\uffff\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\37\uffff\1\66\1\67\1\70\1\71\1\72\1\uffff\1\77\1\103\1\104\1\uffff\1\106\1\107\1\110\2\uffff\1\113\1\114\1\115\1\117\1\120\1\uffff\1\114\41\uffff\1\52\1\65\1\53\1\73\1\54\1\74\1\55\1\76\1\56\1\100\1\57\1\101\1\60\1\102\2\uffff\1\66\1\67\1\70\1\71\1\72\1\113\1\116\1\75\1\77\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\115\1\117\44\uffff\1\64\1\63\1\61\1\62\4\uffff\1\43\5\uffff\1\46\1\47\1\uffff\1\50\14\uffff\1\51\4\uffff\1\36\1\37\1\40\1\41\1\42\1\44\1\45\12\uffff\1\30\1\uffff\1\31\1\uffff\1\26\5\uffff\1\27\3\uffff\1\32\1\33\1\34\1\35\2\uffff\1\24\2\uffff\1\21\1\uffff\1\20\7\uffff\1\22\1\23\2\uffff\1\25\13\uffff\1\17\1\uffff\1\16\1\uffff\1\10\3\uffff\1\12\3\uffff\1\11\1\13\1\14\1\15\2\uffff\1\3\1\4\1\5\1\6\1\7\2\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\1\1\53\uffff\1\0\1\2\u00ef\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\62\2\61\2\62\1\61\22\62\1\61\1\26\1\54\2\62\1\56\1\62\1\55\1\37\1\40\1\41\1\42\1\43\1\27\1\30\1\44\12\60\1\31\1\45\1\32\1\33\1\34\2\62\1\20\2\57\1\21\1\35\1\57\1\1\1\57\1\36\2\57\1\7\1\22\1\13\1\57\1\23\2\57\1\24\7\57\1\46\1\62\1\47\1\50\1\57\1\62\1\3\1\57\1\4\1\10\1\11\1\2\2\57\1\25\3\57\1\5\1\57\1\6\1\15\1\57\1\16\1\14\1\17\1\12\5\57\1\51\1\52\1\53\uff82\62",
            "\1\63",
            "\1\66\23\uffff\1\65",
            "\1\67\23\uffff\1\70",
            "\1\73\2\uffff\1\71\5\uffff\1\72",
            "\1\74\7\uffff\1\75\13\uffff\1\76",
            "\1\100\1\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\106\1\104\4\uffff\1\105\5\uffff\1\103",
            "\1\107",
            "\1\110",
            "\1\111\21\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\115\11\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\125\7\uffff\1\124",
            "\1\126",
            "\1\130",
            "\1\132",
            "\1\134",
            "\1\136",
            "\1\140",
            "\1\142",
            "\1\144",
            "\1\145",
            "",
            "",
            "",
            "",
            "",
            "\1\154\4\uffff\1\153",
            "",
            "",
            "",
            "\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\0\165",
            "\0\166",
            "",
            "",
            "",
            "",
            "",
            "\1\171",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176\6\uffff\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u009b\15\64\1\u009c\6\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
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
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
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
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00aa\21\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00ad\21\64",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "",
            "\1\u00d0",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00d2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\u00d4\1\uffff\32\64",
            "\1\u00d6",
            "\1\u00d7\3\uffff\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00e6",
            "\1\u00e7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00e9",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\u0103",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\u0105\1\uffff\32\64",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0112",
            "",
            "\1\u0113",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\1\u0119",
            "\1\u011a",
            "",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
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
            return "1:1: Tokens : ( GREATER_EQ | Functional | Abstract | Contains | Maximize | Minimize | Opposite | GREATER | LESS_EQ | Current | Default | Extends | Unknown | NOT_EQ | Extern | Class | Count | Empty | Error | False | Scope | LESS | Else | Must | Only | Prod | Real | Then | True | ADD | DIV | MUL | POW | SUB | Avg | Inf | Int | Max | May | Min | Sum | ExclamationMarkEqualsSign | HyphenMinusGreaterThanSign | FullStopFullStop | ColonHyphenMinus | LessThanSignEqualsSign | EqualsSignEqualsSign | GreaterThanSignEqualsSign | EQ | IN | If | In | ExclamationMark | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | LeftSquareBracket | RightSquareBracket | CircumflexAccent | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_STRING | RULE_QUOTED_ID | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_44 = input.LA(1);

                        s = -1;
                        if ( ((LA12_44>='\u0000' && LA12_44<='\uFFFF')) ) {s = 117;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='G') ) {s = 1;}

                        else if ( (LA12_0=='f') ) {s = 2;}

                        else if ( (LA12_0=='a') ) {s = 3;}

                        else if ( (LA12_0=='c') ) {s = 4;}

                        else if ( (LA12_0=='m') ) {s = 5;}

                        else if ( (LA12_0=='o') ) {s = 6;}

                        else if ( (LA12_0=='L') ) {s = 7;}

                        else if ( (LA12_0=='d') ) {s = 8;}

                        else if ( (LA12_0=='e') ) {s = 9;}

                        else if ( (LA12_0=='u') ) {s = 10;}

                        else if ( (LA12_0=='N') ) {s = 11;}

                        else if ( (LA12_0=='s') ) {s = 12;}

                        else if ( (LA12_0=='p') ) {s = 13;}

                        else if ( (LA12_0=='r') ) {s = 14;}

                        else if ( (LA12_0=='t') ) {s = 15;}

                        else if ( (LA12_0=='A') ) {s = 16;}

                        else if ( (LA12_0=='D') ) {s = 17;}

                        else if ( (LA12_0=='M') ) {s = 18;}

                        else if ( (LA12_0=='P') ) {s = 19;}

                        else if ( (LA12_0=='S') ) {s = 20;}

                        else if ( (LA12_0=='i') ) {s = 21;}

                        else if ( (LA12_0=='!') ) {s = 22;}

                        else if ( (LA12_0=='-') ) {s = 23;}

                        else if ( (LA12_0=='.') ) {s = 24;}

                        else if ( (LA12_0==':') ) {s = 25;}

                        else if ( (LA12_0=='<') ) {s = 26;}

                        else if ( (LA12_0=='=') ) {s = 27;}

                        else if ( (LA12_0=='>') ) {s = 28;}

                        else if ( (LA12_0=='E') ) {s = 29;}

                        else if ( (LA12_0=='I') ) {s = 30;}

                        else if ( (LA12_0=='(') ) {s = 31;}

                        else if ( (LA12_0==')') ) {s = 32;}

                        else if ( (LA12_0=='*') ) {s = 33;}

                        else if ( (LA12_0=='+') ) {s = 34;}

                        else if ( (LA12_0==',') ) {s = 35;}

                        else if ( (LA12_0=='/') ) {s = 36;}

                        else if ( (LA12_0==';') ) {s = 37;}

                        else if ( (LA12_0=='[') ) {s = 38;}

                        else if ( (LA12_0==']') ) {s = 39;}

                        else if ( (LA12_0=='^') ) {s = 40;}

                        else if ( (LA12_0=='{') ) {s = 41;}

                        else if ( (LA12_0=='|') ) {s = 42;}

                        else if ( (LA12_0=='}') ) {s = 43;}

                        else if ( (LA12_0=='\"') ) {s = 44;}

                        else if ( (LA12_0=='\'') ) {s = 45;}

                        else if ( (LA12_0=='%') ) {s = 46;}

                        else if ( ((LA12_0>='B' && LA12_0<='C')||LA12_0=='F'||LA12_0=='H'||(LA12_0>='J' && LA12_0<='K')||LA12_0=='O'||(LA12_0>='Q' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||LA12_0=='n'||LA12_0=='q'||(LA12_0>='v' && LA12_0<='z')) ) {s = 47;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 48;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 49;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||LA12_0=='&'||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_45 = input.LA(1);

                        s = -1;
                        if ( ((LA12_45>='\u0000' && LA12_45<='\uFFFF')) ) {s = 118;}

                        else s = 50;

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