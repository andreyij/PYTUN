// $ANTLR 3.4 D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g 2012-07-28 14:02:41

package org.pytun.sql;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SQLGrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int ALTER=4;
    public static final int AND=5;
    public static final int AS=6;
    public static final int CHAR=7;
    public static final int COLUMN_DEF_LIST=8;
    public static final int CREATE=9;
    public static final int CREATE_STMT=10;
    public static final int DATE=11;
    public static final int DELETE=12;
    public static final int DELETE_STMT=13;
    public static final int DIGIT=14;
    public static final int DIV=15;
    public static final int DROP=16;
    public static final int DROP_STMT=17;
    public static final int EQ=18;
    public static final int EXPR_LIST=19;
    public static final int FLOAT=20;
    public static final int FROM=21;
    public static final int GE=22;
    public static final int GT=23;
    public static final int IDENTIFIER=24;
    public static final int INSERT=25;
    public static final int INSERT_STMT=26;
    public static final int INT=27;
    public static final int INTO=28;
    public static final int LE=29;
    public static final int LETTER=30;
    public static final int LPAREN=31;
    public static final int LT=32;
    public static final int MINUS=33;
    public static final int MOD=34;
    public static final int MUL=35;
    public static final int NE=36;
    public static final int NEWLINE=37;
    public static final int OR=38;
    public static final int PLUS=39;
    public static final int REAL_LIT=40;
    public static final int RPAREN=41;
    public static final int SELECT=42;
    public static final int SELECT_STMT=43;
    public static final int SEMI=44;
    public static final int SET=45;
    public static final int STRING_LIT=46;
    public static final int TABLE=47;
    public static final int TABLE_LIST=48;
    public static final int TIME=49;
    public static final int TIMESTAMP=50;
    public static final int UPDATE=51;
    public static final int UPDATE_ASSIGNMENTS=52;
    public static final int UPDATE_STMT=53;
    public static final int VALUES=54;
    public static final int VARCHAR=55;
    public static final int WHERE=56;
    public static final int WHITESPACE=57;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SQLGrammarLexer() {} 
    public SQLGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SQLGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g"; }

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:11:5: ( '/' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:11:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:12:4: ( '=' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:12:6: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:13:4: ( '>=' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:13:6: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:14:4: ( '>' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:14:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:15:4: ( '<=' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:15:6: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:16:8: ( '(' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:16:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:17:4: ( '<' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:17:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:18:7: ( '-' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:18:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:19:5: ( '%' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:19:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:20:5: ( '*' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:20:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "NE"
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:21:4: ( '!=' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:21:6: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:22:6: ( '+' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:22:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:23:8: ( ')' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:23:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:24:6: ( ';' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:24:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:25:7: ( ',' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:25:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:26:7: ( '.' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:26:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:250:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:250:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:251:4: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:251:6: ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:254:6: ( ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:254:8: ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATE"

    // $ANTLR start "TIME"
    public final void mTIME() throws RecognitionException {
        try {
            int _type = TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:255:6: ( ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:255:8: ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIME"

    // $ANTLR start "TIMESTAMP"
    public final void mTIMESTAMP() throws RecognitionException {
        try {
            int _type = TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:256:11: ( ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:256:13: ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIMESTAMP"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:257:5: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:257:7: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:258:7: ( ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:258:9: ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "VARCHAR"
    public final void mVARCHAR() throws RecognitionException {
        try {
            int _type = VARCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:259:9: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:259:11: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VARCHAR"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:260:6: ( ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:260:8: ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:263:8: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:263:10: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:264:8: ( ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:264:10: ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:265:8: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:265:10: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:266:8: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:266:10: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:267:8: ( ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:267:9: ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:268:6: ( ( 'D' | 'd' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:268:7: ( 'D' | 'd' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "ALTER"
    public final void mALTER() throws RecognitionException {
        try {
            int _type = ALTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:269:7: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:269:8: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALTER"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:272:6: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:272:8: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:273:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:273:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:274:5: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:274:7: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:275:5: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:275:7: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:276:7: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:276:9: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:277:6: ( ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:277:8: ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:278:3: ( ( 'A' | 'a' ) ( 'S' | 's' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:278:5: ( 'A' | 'a' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:283:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:286:7: ( '0' .. '9' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "STRING_LIT"
    public final void mSTRING_LIT() throws RecognitionException {
        try {
            int _type = STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:287:12: ( '\\'' (~ '\\'' )* '\\'' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:287:14: '\\'' (~ '\\'' )* '\\''
            {
            match('\''); 

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:287:19: (~ '\\'' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '&')||(LA1_0 >= '(' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LIT"

    // $ANTLR start "REAL_LIT"
    public final void mREAL_LIT() throws RecognitionException {
        try {
            int _type = REAL_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:289:10: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:289:12: ( DIGIT )+ ( '.' ( DIGIT )+ )?
            {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:289:12: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:289:21: ( '.' ( DIGIT )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:289:22: '.' ( DIGIT )+
                    {
                    match('.'); 

                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:289:26: ( DIGIT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REAL_LIT"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:291:12: ( ( LETTER ) ( LETTER | DIGIT | '_' )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:291:14: ( LETTER ) ( LETTER | DIGIT | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:291:23: ( LETTER | DIGIT | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:294:3: ( ( '\\r' )? '\\n' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:294:5: ( '\\r' )? '\\n'
            {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:294:5: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:294:5: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:298:3: ( ( ' ' | '\\t' )+ )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:298:5: ( ' ' | '\\t' )+
            {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:298:5: ( ' ' | '\\t' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:8: ( DIV | EQ | GE | GT | LE | LPAREN | LT | MINUS | MOD | MUL | NE | PLUS | RPAREN | SEMI | T__58 | T__59 | AND | OR | DATE | TIME | TIMESTAMP | INT | FLOAT | VARCHAR | CHAR | SELECT | UPDATE | DELETE | INSERT | CREATE | DROP | ALTER | FROM | WHERE | SET | INTO | VALUES | TABLE | AS | STRING_LIT | REAL_LIT | IDENTIFIER | NEWLINE | WHITESPACE )
        int alt8=44;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:10: DIV
                {
                mDIV(); 


                }
                break;
            case 2 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:14: EQ
                {
                mEQ(); 


                }
                break;
            case 3 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:17: GE
                {
                mGE(); 


                }
                break;
            case 4 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:20: GT
                {
                mGT(); 


                }
                break;
            case 5 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:23: LE
                {
                mLE(); 


                }
                break;
            case 6 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:26: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 7 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:33: LT
                {
                mLT(); 


                }
                break;
            case 8 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:36: MINUS
                {
                mMINUS(); 


                }
                break;
            case 9 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:42: MOD
                {
                mMOD(); 


                }
                break;
            case 10 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:46: MUL
                {
                mMUL(); 


                }
                break;
            case 11 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:50: NE
                {
                mNE(); 


                }
                break;
            case 12 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:53: PLUS
                {
                mPLUS(); 


                }
                break;
            case 13 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:58: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 14 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:65: SEMI
                {
                mSEMI(); 


                }
                break;
            case 15 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:70: T__58
                {
                mT__58(); 


                }
                break;
            case 16 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:76: T__59
                {
                mT__59(); 


                }
                break;
            case 17 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:82: AND
                {
                mAND(); 


                }
                break;
            case 18 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:86: OR
                {
                mOR(); 


                }
                break;
            case 19 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:89: DATE
                {
                mDATE(); 


                }
                break;
            case 20 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:94: TIME
                {
                mTIME(); 


                }
                break;
            case 21 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:99: TIMESTAMP
                {
                mTIMESTAMP(); 


                }
                break;
            case 22 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:109: INT
                {
                mINT(); 


                }
                break;
            case 23 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:113: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 24 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:119: VARCHAR
                {
                mVARCHAR(); 


                }
                break;
            case 25 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:127: CHAR
                {
                mCHAR(); 


                }
                break;
            case 26 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:132: SELECT
                {
                mSELECT(); 


                }
                break;
            case 27 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:139: UPDATE
                {
                mUPDATE(); 


                }
                break;
            case 28 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:146: DELETE
                {
                mDELETE(); 


                }
                break;
            case 29 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:153: INSERT
                {
                mINSERT(); 


                }
                break;
            case 30 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:160: CREATE
                {
                mCREATE(); 


                }
                break;
            case 31 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:167: DROP
                {
                mDROP(); 


                }
                break;
            case 32 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:172: ALTER
                {
                mALTER(); 


                }
                break;
            case 33 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:178: FROM
                {
                mFROM(); 


                }
                break;
            case 34 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:183: WHERE
                {
                mWHERE(); 


                }
                break;
            case 35 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:189: SET
                {
                mSET(); 


                }
                break;
            case 36 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:193: INTO
                {
                mINTO(); 


                }
                break;
            case 37 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:198: VALUES
                {
                mVALUES(); 


                }
                break;
            case 38 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:205: TABLE
                {
                mTABLE(); 


                }
                break;
            case 39 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:211: AS
                {
                mAS(); 


                }
                break;
            case 40 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:214: STRING_LIT
                {
                mSTRING_LIT(); 


                }
                break;
            case 41 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:225: REAL_LIT
                {
                mREAL_LIT(); 


                }
                break;
            case 42 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:234: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 43 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:245: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 44 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:253: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\3\uffff\1\40\1\42\12\uffff\13\34\11\uffff\2\34\1\67\1\70\16\34"+
        "\1\112\1\34\2\uffff\5\34\1\122\10\34\1\133\2\34\1\uffff\1\34\1\137"+
        "\1\34\1\141\1\143\1\34\1\145\1\uffff\2\34\1\150\2\34\1\153\2\34"+
        "\1\uffff\2\34\1\160\1\uffff\1\34\1\uffff\1\34\1\uffff\1\163\1\uffff"+
        "\1\34\1\165\1\uffff\2\34\1\uffff\3\34\1\173\1\uffff\1\174\1\34\1"+
        "\uffff\1\176\1\uffff\1\34\1\u0080\1\u0081\1\u0082\1\u0083\2\uffff"+
        "\1\34\1\uffff\1\u0085\4\uffff\1\34\1\uffff\1\u0087\1\uffff";
    static final String DFA8_eofS =
        "\u0088\uffff";
    static final String DFA8_minS =
        "\1\11\2\uffff\2\75\12\uffff\1\114\1\122\2\101\1\116\1\114\1\101"+
        "\1\110\1\105\1\120\1\110\11\uffff\1\104\1\124\2\60\1\124\1\114\1"+
        "\117\1\115\1\102\1\123\2\117\1\114\1\101\1\105\1\114\1\104\1\105"+
        "\1\60\1\105\2\uffff\2\105\1\120\1\105\1\114\1\60\1\105\1\101\1\115"+
        "\1\103\1\125\1\122\1\101\1\105\1\60\1\101\1\122\1\uffff\1\122\1"+
        "\60\1\124\2\60\1\105\1\60\1\uffff\1\122\1\124\1\60\1\110\1\105\1"+
        "\60\1\124\1\103\1\uffff\1\124\1\105\1\60\1\uffff\1\105\1\uffff\1"+
        "\124\1\uffff\1\60\1\uffff\1\124\1\60\1\uffff\1\101\1\123\1\uffff"+
        "\1\105\1\124\1\105\1\60\1\uffff\1\60\1\101\1\uffff\1\60\1\uffff"+
        "\1\122\4\60\2\uffff\1\115\1\uffff\1\60\4\uffff\1\120\1\uffff\1\60"+
        "\1\uffff";
    static final String DFA8_maxS =
        "\1\172\2\uffff\2\75\12\uffff\1\163\2\162\1\151\1\156\1\162\1\141"+
        "\1\162\1\145\1\160\1\150\11\uffff\1\144\1\164\2\172\1\164\1\154"+
        "\1\157\1\155\1\142\1\164\2\157\1\162\1\141\1\145\1\164\1\144\1\145"+
        "\1\172\1\145\2\uffff\2\145\1\160\1\145\1\154\1\172\1\145\1\141\1"+
        "\155\1\143\1\165\1\162\1\141\1\145\1\172\1\141\1\162\1\uffff\1\162"+
        "\1\172\1\164\2\172\1\145\1\172\1\uffff\1\162\1\164\1\172\1\150\1"+
        "\145\1\172\1\164\1\143\1\uffff\1\164\1\145\1\172\1\uffff\1\145\1"+
        "\uffff\1\164\1\uffff\1\172\1\uffff\1\164\1\172\1\uffff\1\141\1\163"+
        "\1\uffff\1\145\1\164\1\145\1\172\1\uffff\1\172\1\141\1\uffff\1\172"+
        "\1\uffff\1\162\4\172\2\uffff\1\155\1\uffff\1\172\4\uffff\1\160\1"+
        "\uffff\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\6\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
        "\1\17\1\20\13\uffff\1\50\1\51\1\52\1\53\1\54\1\3\1\4\1\5\1\7\24"+
        "\uffff\1\47\1\22\21\uffff\1\21\7\uffff\1\26\10\uffff\1\43\3\uffff"+
        "\1\23\1\uffff\1\37\1\uffff\1\24\1\uffff\1\44\2\uffff\1\41\2\uffff"+
        "\1\31\4\uffff\1\40\2\uffff\1\46\1\uffff\1\27\5\uffff\1\42\1\34\1"+
        "\uffff\1\35\1\uffff\1\45\1\36\1\32\1\33\1\uffff\1\30\1\uffff\1\25";
    static final String DFA8_specialS =
        "\u0088\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\36\1\35\2\uffff\1\35\22\uffff\1\36\1\11\3\uffff\1\7\1\uffff"+
            "\1\32\1\5\1\13\1\10\1\12\1\15\1\6\1\16\1\1\12\33\1\uffff\1\14"+
            "\1\4\1\2\1\3\2\uffff\1\17\1\34\1\26\1\21\1\34\1\24\2\34\1\23"+
            "\5\34\1\20\3\34\1\27\1\22\1\30\1\25\1\31\3\34\6\uffff\1\17\1"+
            "\34\1\26\1\21\1\34\1\24\2\34\1\23\5\34\1\20\3\34\1\27\1\22\1"+
            "\30\1\25\1\31\3\34",
            "",
            "",
            "\1\37",
            "\1\41",
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
            "\1\44\1\uffff\1\43\4\uffff\1\45\30\uffff\1\44\1\uffff\1\43"+
            "\4\uffff\1\45",
            "\1\46\37\uffff\1\46",
            "\1\47\3\uffff\1\50\14\uffff\1\51\16\uffff\1\47\3\uffff\1\50"+
            "\14\uffff\1\51",
            "\1\53\7\uffff\1\52\27\uffff\1\53\7\uffff\1\52",
            "\1\54\37\uffff\1\54",
            "\1\55\5\uffff\1\56\31\uffff\1\55\5\uffff\1\56",
            "\1\57\37\uffff\1\57",
            "\1\60\11\uffff\1\61\25\uffff\1\60\11\uffff\1\61",
            "\1\62\37\uffff\1\62",
            "\1\63\37\uffff\1\63",
            "\1\64\37\uffff\1\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65\37\uffff\1\65",
            "\1\66\37\uffff\1\66",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\71\37\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\1\74\37\uffff\1\74",
            "\1\75\37\uffff\1\75",
            "\1\77\1\76\36\uffff\1\77\1\76",
            "\1\100\37\uffff\1\100",
            "\1\101\37\uffff\1\101",
            "\1\103\5\uffff\1\102\31\uffff\1\103\5\uffff\1\102",
            "\1\104\37\uffff\1\104",
            "\1\105\37\uffff\1\105",
            "\1\106\7\uffff\1\107\27\uffff\1\106\7\uffff\1\107",
            "\1\110\37\uffff\1\110",
            "\1\111\37\uffff\1\111",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\113\37\uffff\1\113",
            "",
            "",
            "\1\114\37\uffff\1\114",
            "\1\115\37\uffff\1\115",
            "\1\116\37\uffff\1\116",
            "\1\117\37\uffff\1\117",
            "\1\120\37\uffff\1\120",
            "\12\34\7\uffff\16\34\1\121\13\34\4\uffff\1\34\1\uffff\16\34"+
            "\1\121\13\34",
            "\1\123\37\uffff\1\123",
            "\1\124\37\uffff\1\124",
            "\1\125\37\uffff\1\125",
            "\1\126\37\uffff\1\126",
            "\1\127\37\uffff\1\127",
            "\1\130\37\uffff\1\130",
            "\1\131\37\uffff\1\131",
            "\1\132\37\uffff\1\132",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\134\37\uffff\1\134",
            "\1\135\37\uffff\1\135",
            "",
            "\1\136\37\uffff\1\136",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\140\37\uffff\1\140",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\22\34\1\142\7\34\4\uffff\1\34\1\uffff\22\34"+
            "\1\142\7\34",
            "\1\144\37\uffff\1\144",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\146\37\uffff\1\146",
            "\1\147\37\uffff\1\147",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\151\37\uffff\1\151",
            "\1\152\37\uffff\1\152",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\154\37\uffff\1\154",
            "\1\155\37\uffff\1\155",
            "",
            "\1\156\37\uffff\1\156",
            "\1\157\37\uffff\1\157",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\161\37\uffff\1\161",
            "",
            "\1\162\37\uffff\1\162",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\164\37\uffff\1\164",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\166\37\uffff\1\166",
            "\1\167\37\uffff\1\167",
            "",
            "\1\170\37\uffff\1\170",
            "\1\171\37\uffff\1\171",
            "\1\172\37\uffff\1\172",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\175\37\uffff\1\175",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\177\37\uffff\1\177",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\1\u0084\37\uffff\1\u0084",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "",
            "",
            "\1\u0086\37\uffff\1\u0086",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            ""
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
            return "1:1: Tokens : ( DIV | EQ | GE | GT | LE | LPAREN | LT | MINUS | MOD | MUL | NE | PLUS | RPAREN | SEMI | T__58 | T__59 | AND | OR | DATE | TIME | TIMESTAMP | INT | FLOAT | VARCHAR | CHAR | SELECT | UPDATE | DELETE | INSERT | CREATE | DROP | ALTER | FROM | WHERE | SET | INTO | VALUES | TABLE | AS | STRING_LIT | REAL_LIT | IDENTIFIER | NEWLINE | WHITESPACE );";
        }
    }
 

}