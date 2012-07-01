// $ANTLR 3.4 D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g 2012-07-01 15:35:30

package org.pytun.sql;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SQLGrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__54=54;
    public static final int ALTER=4;
    public static final int AND=5;
    public static final int CHAR=6;
    public static final int CREATE=7;
    public static final int DATE=8;
    public static final int DELETE=9;
    public static final int DELETE_STMT=10;
    public static final int DIGIT=11;
    public static final int DIV=12;
    public static final int DROP=13;
    public static final int EQ=14;
    public static final int EXPR_LIST=15;
    public static final int FLOAT=16;
    public static final int FROM=17;
    public static final int GE=18;
    public static final int GT=19;
    public static final int IDENTIFIER=20;
    public static final int INSERT=21;
    public static final int INSERT_STMT=22;
    public static final int INT=23;
    public static final int INTO=24;
    public static final int LE=25;
    public static final int LETTER=26;
    public static final int LPAREN=27;
    public static final int LT=28;
    public static final int MINUS=29;
    public static final int MOD=30;
    public static final int MUL=31;
    public static final int NE=32;
    public static final int NEWLINE=33;
    public static final int OR=34;
    public static final int PLUS=35;
    public static final int PREDICATE_LIST=36;
    public static final int REAL_LIT=37;
    public static final int RPAREN=38;
    public static final int SELECT=39;
    public static final int SELECT_STMT=40;
    public static final int SEMI=41;
    public static final int SET=42;
    public static final int STRING_LIT=43;
    public static final int TABLE_LIST=44;
    public static final int TIME=45;
    public static final int TIMESTAMP=46;
    public static final int UPDATE=47;
    public static final int UPDATE_ASSIGNMENTS=48;
    public static final int UPDATE_STMT=49;
    public static final int VALUES=50;
    public static final int VARCHAR=51;
    public static final int WHERE=52;
    public static final int WHITESPACE=53;

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

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:208:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:208:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:209:4: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:209:6: ( 'O' | 'o' ) ( 'R' | 'r' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:212:6: ( ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:212:8: ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:213:6: ( ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:213:8: ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:214:11: ( ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:214:13: ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:215:5: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:215:7: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:216:7: ( ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:216:9: ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'T' | 't' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:217:9: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:217:11: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:218:6: ( ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:218:8: ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:221:8: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:221:10: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:222:8: ( ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:222:10: ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:223:8: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:223:10: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:224:8: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:224:10: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:225:8: ( ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:225:9: ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:226:6: ( ( 'D' | 'd' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:226:7: ( 'D' | 'd' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:227:7: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:227:8: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:230:6: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:230:8: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:231:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:231:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:232:5: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:232:7: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:233:5: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:233:7: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:234:7: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:234:9: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'S' | 's' )
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

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:238:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:241:7: ( '0' .. '9' )
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:242:12: ( '\\'' (~ '\\'' )* '\\'' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:242:14: '\\'' (~ '\\'' )* '\\''
            {
            match('\''); 

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:242:19: (~ '\\'' )*
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:244:10: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:244:12: ( DIGIT )+ ( '.' ( DIGIT )+ )?
            {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:244:12: ( DIGIT )+
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


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:244:21: ( '.' ( DIGIT )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:244:22: '.' ( DIGIT )+
                    {
                    match('.'); 

                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:244:26: ( DIGIT )+
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:246:12: ( ( LETTER ) ( LETTER | DIGIT | '_' )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:246:14: ( LETTER ) ( LETTER | DIGIT | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:246:23: ( LETTER | DIGIT | '_' )*
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:249:3: ( ( '\\r' )? '\\n' )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:249:5: ( '\\r' )? '\\n'
            {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:249:5: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:249:5: '\\r'
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:253:3: ( ( ' ' | '\\t' )+ )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:253:5: ( ' ' | '\\t' )+
            {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:253:5: ( ' ' | '\\t' )+
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
        // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:8: ( DIV | EQ | GE | GT | LE | LPAREN | LT | MINUS | MOD | MUL | NE | PLUS | RPAREN | SEMI | T__54 | AND | OR | DATE | TIME | TIMESTAMP | INT | FLOAT | VARCHAR | CHAR | SELECT | UPDATE | DELETE | INSERT | CREATE | DROP | ALTER | FROM | WHERE | SET | INTO | VALUES | STRING_LIT | REAL_LIT | IDENTIFIER | NEWLINE | WHITESPACE )
        int alt8=41;
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
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:70: T__54
                {
                mT__54(); 


                }
                break;
            case 16 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:76: AND
                {
                mAND(); 


                }
                break;
            case 17 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:80: OR
                {
                mOR(); 


                }
                break;
            case 18 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:83: DATE
                {
                mDATE(); 


                }
                break;
            case 19 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:88: TIME
                {
                mTIME(); 


                }
                break;
            case 20 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:93: TIMESTAMP
                {
                mTIMESTAMP(); 


                }
                break;
            case 21 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:103: INT
                {
                mINT(); 


                }
                break;
            case 22 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:107: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 23 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:113: VARCHAR
                {
                mVARCHAR(); 


                }
                break;
            case 24 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:121: CHAR
                {
                mCHAR(); 


                }
                break;
            case 25 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:126: SELECT
                {
                mSELECT(); 


                }
                break;
            case 26 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:133: UPDATE
                {
                mUPDATE(); 


                }
                break;
            case 27 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:140: DELETE
                {
                mDELETE(); 


                }
                break;
            case 28 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:147: INSERT
                {
                mINSERT(); 


                }
                break;
            case 29 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:154: CREATE
                {
                mCREATE(); 


                }
                break;
            case 30 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:161: DROP
                {
                mDROP(); 


                }
                break;
            case 31 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:166: ALTER
                {
                mALTER(); 


                }
                break;
            case 32 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:172: FROM
                {
                mFROM(); 


                }
                break;
            case 33 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:177: WHERE
                {
                mWHERE(); 


                }
                break;
            case 34 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:183: SET
                {
                mSET(); 


                }
                break;
            case 35 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:187: INTO
                {
                mINTO(); 


                }
                break;
            case 36 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:192: VALUES
                {
                mVALUES(); 


                }
                break;
            case 37 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:199: STRING_LIT
                {
                mSTRING_LIT(); 


                }
                break;
            case 38 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:210: REAL_LIT
                {
                mREAL_LIT(); 


                }
                break;
            case 39 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:219: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 40 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:230: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 41 :
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:1:238: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\3\uffff\1\37\1\41\11\uffff\13\33\11\uffff\2\33\1\64\15\33\1\105"+
        "\1\33\1\uffff\4\33\1\114\10\33\1\125\2\33\1\uffff\1\33\1\131\1\33"+
        "\1\133\1\135\1\136\1\uffff\2\33\1\141\2\33\1\144\2\33\1\uffff\2"+
        "\33\1\151\1\uffff\1\33\1\uffff\1\33\2\uffff\1\33\1\155\1\uffff\2"+
        "\33\1\uffff\3\33\1\163\1\uffff\1\164\1\33\1\166\1\uffff\1\33\1\170"+
        "\1\171\1\172\1\173\2\uffff\1\33\1\uffff\1\175\4\uffff\1\33\1\uffff"+
        "\1\177\1\uffff";
    static final String DFA8_eofS =
        "\u0080\uffff";
    static final String DFA8_minS =
        "\1\11\2\uffff\2\75\11\uffff\1\114\1\122\1\101\1\111\1\116\1\114"+
        "\1\101\1\110\1\105\1\120\1\110\11\uffff\1\104\1\124\1\60\1\124\1"+
        "\114\1\117\1\115\1\123\2\117\1\114\1\101\1\105\1\114\1\104\1\105"+
        "\1\60\1\105\1\uffff\2\105\1\120\1\105\1\60\1\105\1\101\1\115\1\103"+
        "\1\125\1\122\1\101\1\105\1\60\1\101\1\122\1\uffff\1\122\1\60\1\124"+
        "\3\60\1\uffff\1\122\1\124\1\60\1\110\1\105\1\60\1\124\1\103\1\uffff"+
        "\1\124\1\105\1\60\1\uffff\1\105\1\uffff\1\124\2\uffff\1\124\1\60"+
        "\1\uffff\1\101\1\123\1\uffff\1\105\1\124\1\105\1\60\1\uffff\1\60"+
        "\1\101\1\60\1\uffff\1\122\4\60\2\uffff\1\115\1\uffff\1\60\4\uffff"+
        "\1\120\1\uffff\1\60\1\uffff";
    static final String DFA8_maxS =
        "\1\172\2\uffff\2\75\11\uffff\1\156\2\162\1\151\1\156\1\162\1\141"+
        "\1\162\1\145\1\160\1\150\11\uffff\1\144\1\164\1\172\1\164\1\154"+
        "\1\157\1\155\1\164\2\157\1\162\1\141\1\145\1\164\1\144\1\145\1\172"+
        "\1\145\1\uffff\2\145\1\160\1\145\1\172\1\145\1\141\1\155\1\143\1"+
        "\165\1\162\1\141\1\145\1\172\1\141\1\162\1\uffff\1\162\1\172\1\164"+
        "\3\172\1\uffff\1\162\1\164\1\172\1\150\1\145\1\172\1\164\1\143\1"+
        "\uffff\1\164\1\145\1\172\1\uffff\1\145\1\uffff\1\164\2\uffff\1\164"+
        "\1\172\1\uffff\1\141\1\163\1\uffff\1\145\1\164\1\145\1\172\1\uffff"+
        "\1\172\1\141\1\172\1\uffff\1\162\4\172\2\uffff\1\155\1\uffff\1\172"+
        "\4\uffff\1\160\1\uffff\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\6\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
        "\1\17\13\uffff\1\45\1\46\1\47\1\50\1\51\1\3\1\4\1\5\1\7\22\uffff"+
        "\1\21\20\uffff\1\20\6\uffff\1\25\10\uffff\1\42\3\uffff\1\22\1\uffff"+
        "\1\36\1\uffff\1\23\1\43\2\uffff\1\40\2\uffff\1\30\4\uffff\1\37\3"+
        "\uffff\1\26\5\uffff\1\41\1\33\1\uffff\1\34\1\uffff\1\44\1\35\1\31"+
        "\1\32\1\uffff\1\27\1\uffff\1\24";
    static final String DFA8_specialS =
        "\u0080\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\35\1\34\2\uffff\1\34\22\uffff\1\35\1\11\3\uffff\1\7\1\uffff"+
            "\1\31\1\5\1\13\1\10\1\12\1\15\1\6\1\uffff\1\1\12\32\1\uffff"+
            "\1\14\1\4\1\2\1\3\2\uffff\1\16\1\33\1\25\1\20\1\33\1\23\2\33"+
            "\1\22\5\33\1\17\3\33\1\26\1\21\1\27\1\24\1\30\3\33\6\uffff\1"+
            "\16\1\33\1\25\1\20\1\33\1\23\2\33\1\22\5\33\1\17\3\33\1\26\1"+
            "\21\1\27\1\24\1\30\3\33",
            "",
            "",
            "\1\36",
            "\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\1\uffff\1\42\35\uffff\1\43\1\uffff\1\42",
            "\1\44\37\uffff\1\44",
            "\1\45\3\uffff\1\46\14\uffff\1\47\16\uffff\1\45\3\uffff\1\46"+
            "\14\uffff\1\47",
            "\1\50\37\uffff\1\50",
            "\1\51\37\uffff\1\51",
            "\1\52\5\uffff\1\53\31\uffff\1\52\5\uffff\1\53",
            "\1\54\37\uffff\1\54",
            "\1\55\11\uffff\1\56\25\uffff\1\55\11\uffff\1\56",
            "\1\57\37\uffff\1\57",
            "\1\60\37\uffff\1\60",
            "\1\61\37\uffff\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62\37\uffff\1\62",
            "\1\63\37\uffff\1\63",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\65\37\uffff\1\65",
            "\1\66\37\uffff\1\66",
            "\1\67\37\uffff\1\67",
            "\1\70\37\uffff\1\70",
            "\1\72\1\71\36\uffff\1\72\1\71",
            "\1\73\37\uffff\1\73",
            "\1\74\37\uffff\1\74",
            "\1\76\5\uffff\1\75\31\uffff\1\76\5\uffff\1\75",
            "\1\77\37\uffff\1\77",
            "\1\100\37\uffff\1\100",
            "\1\101\7\uffff\1\102\27\uffff\1\101\7\uffff\1\102",
            "\1\103\37\uffff\1\103",
            "\1\104\37\uffff\1\104",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\106\37\uffff\1\106",
            "",
            "\1\107\37\uffff\1\107",
            "\1\110\37\uffff\1\110",
            "\1\111\37\uffff\1\111",
            "\1\112\37\uffff\1\112",
            "\12\33\7\uffff\16\33\1\113\13\33\4\uffff\1\33\1\uffff\16\33"+
            "\1\113\13\33",
            "\1\115\37\uffff\1\115",
            "\1\116\37\uffff\1\116",
            "\1\117\37\uffff\1\117",
            "\1\120\37\uffff\1\120",
            "\1\121\37\uffff\1\121",
            "\1\122\37\uffff\1\122",
            "\1\123\37\uffff\1\123",
            "\1\124\37\uffff\1\124",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\126\37\uffff\1\126",
            "\1\127\37\uffff\1\127",
            "",
            "\1\130\37\uffff\1\130",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\132\37\uffff\1\132",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\22\33\1\134\7\33\4\uffff\1\33\1\uffff\22\33"+
            "\1\134\7\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\137\37\uffff\1\137",
            "\1\140\37\uffff\1\140",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\142\37\uffff\1\142",
            "\1\143\37\uffff\1\143",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\145\37\uffff\1\145",
            "\1\146\37\uffff\1\146",
            "",
            "\1\147\37\uffff\1\147",
            "\1\150\37\uffff\1\150",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\152\37\uffff\1\152",
            "",
            "\1\153\37\uffff\1\153",
            "",
            "",
            "\1\154\37\uffff\1\154",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\156\37\uffff\1\156",
            "\1\157\37\uffff\1\157",
            "",
            "\1\160\37\uffff\1\160",
            "\1\161\37\uffff\1\161",
            "\1\162\37\uffff\1\162",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\165\37\uffff\1\165",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\167\37\uffff\1\167",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\174\37\uffff\1\174",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "",
            "\1\176\37\uffff\1\176",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
            return "1:1: Tokens : ( DIV | EQ | GE | GT | LE | LPAREN | LT | MINUS | MOD | MUL | NE | PLUS | RPAREN | SEMI | T__54 | AND | OR | DATE | TIME | TIMESTAMP | INT | FLOAT | VARCHAR | CHAR | SELECT | UPDATE | DELETE | INSERT | CREATE | DROP | ALTER | FROM | WHERE | SET | INTO | VALUES | STRING_LIT | REAL_LIT | IDENTIFIER | NEWLINE | WHITESPACE );";
        }
    }
 

}