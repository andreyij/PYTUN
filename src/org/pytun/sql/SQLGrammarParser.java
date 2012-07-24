// $ANTLR 3.4 D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g 2012-07-24 14:47:02

package org.pytun.sql;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SQLGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALTER", "AND", "CHAR", "COLUMN_DEF_LIST", "CREATE", "CREATE_STMT", "DATE", "DELETE", "DELETE_STMT", "DIGIT", "DIV", "DROP", "DROP_STMT", "EQ", "EXPR_LIST", "FLOAT", "FROM", "GE", "GT", "IDENTIFIER", "INSERT", "INSERT_STMT", "INT", "INTO", "LE", "LETTER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NE", "NEWLINE", "OR", "PLUS", "REAL_LIT", "RPAREN", "SELECT", "SELECT_STMT", "SEMI", "SET", "STRING_LIT", "TABLE", "TABLE_LIST", "TIME", "TIMESTAMP", "UPDATE", "UPDATE_ASSIGNMENTS", "UPDATE_STMT", "VALUES", "VARCHAR", "WHERE", "WHITESPACE", "','"
    };

    public static final int EOF=-1;
    public static final int T__57=57;
    public static final int ALTER=4;
    public static final int AND=5;
    public static final int CHAR=6;
    public static final int COLUMN_DEF_LIST=7;
    public static final int CREATE=8;
    public static final int CREATE_STMT=9;
    public static final int DATE=10;
    public static final int DELETE=11;
    public static final int DELETE_STMT=12;
    public static final int DIGIT=13;
    public static final int DIV=14;
    public static final int DROP=15;
    public static final int DROP_STMT=16;
    public static final int EQ=17;
    public static final int EXPR_LIST=18;
    public static final int FLOAT=19;
    public static final int FROM=20;
    public static final int GE=21;
    public static final int GT=22;
    public static final int IDENTIFIER=23;
    public static final int INSERT=24;
    public static final int INSERT_STMT=25;
    public static final int INT=26;
    public static final int INTO=27;
    public static final int LE=28;
    public static final int LETTER=29;
    public static final int LPAREN=30;
    public static final int LT=31;
    public static final int MINUS=32;
    public static final int MOD=33;
    public static final int MUL=34;
    public static final int NE=35;
    public static final int NEWLINE=36;
    public static final int OR=37;
    public static final int PLUS=38;
    public static final int REAL_LIT=39;
    public static final int RPAREN=40;
    public static final int SELECT=41;
    public static final int SELECT_STMT=42;
    public static final int SEMI=43;
    public static final int SET=44;
    public static final int STRING_LIT=45;
    public static final int TABLE=46;
    public static final int TABLE_LIST=47;
    public static final int TIME=48;
    public static final int TIMESTAMP=49;
    public static final int UPDATE=50;
    public static final int UPDATE_ASSIGNMENTS=51;
    public static final int UPDATE_STMT=52;
    public static final int VALUES=53;
    public static final int VARCHAR=54;
    public static final int WHERE=55;
    public static final int WHITESPACE=56;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SQLGrammarParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SQLGrammarParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SQLGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g"; }


    public static class query_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:54:1: query : sql_statement SEMI ;
    public final SQLGrammarParser.query_return query() throws RecognitionException {
        SQLGrammarParser.query_return retval = new SQLGrammarParser.query_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SEMI2=null;
        SQLGrammarParser.sql_statement_return sql_statement1 =null;


        CommonTree SEMI2_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:55:3: ( sql_statement SEMI )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:56:3: sql_statement SEMI
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_sql_statement_in_query337);
            sql_statement1=sql_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sql_statement1.getTree());

            SEMI2=(Token)match(input,SEMI,FOLLOW_SEMI_in_query339); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI2_tree = 
            (CommonTree)adaptor.create(SEMI2)
            ;
            adaptor.addChild(root_0, SEMI2_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "query"


    public static class sql_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sql_statement"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:59:1: sql_statement : ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement );
    public final SQLGrammarParser.sql_statement_return sql_statement() throws RecognitionException {
        SQLGrammarParser.sql_statement_return retval = new SQLGrammarParser.sql_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SQLGrammarParser.select_statement_return select_statement3 =null;

        SQLGrammarParser.update_statement_return update_statement4 =null;

        SQLGrammarParser.insert_statement_return insert_statement5 =null;

        SQLGrammarParser.delete_statement_return delete_statement6 =null;

        SQLGrammarParser.create_statement_return create_statement7 =null;

        SQLGrammarParser.drop_statement_return drop_statement8 =null;

        SQLGrammarParser.alter_statement_return alter_statement9 =null;



        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:60:3: ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement )
            int alt1=7;
            switch ( input.LA(1) ) {
            case SELECT:
                {
                alt1=1;
                }
                break;
            case UPDATE:
                {
                alt1=2;
                }
                break;
            case INSERT:
                {
                alt1=3;
                }
                break;
            case DELETE:
                {
                alt1=4;
                }
                break;
            case CREATE:
                {
                alt1=5;
                }
                break;
            case DROP:
                {
                alt1=6;
                }
                break;
            case ALTER:
                {
                alt1=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:61:3: select_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_select_statement_in_sql_statement354);
                    select_statement3=select_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, select_statement3.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:62:5: update_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_update_statement_in_sql_statement360);
                    update_statement4=update_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, update_statement4.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:63:5: insert_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_insert_statement_in_sql_statement366);
                    insert_statement5=insert_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, insert_statement5.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:64:5: delete_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_delete_statement_in_sql_statement372);
                    delete_statement6=delete_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delete_statement6.getTree());

                    }
                    break;
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:65:5: create_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_create_statement_in_sql_statement378);
                    create_statement7=create_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, create_statement7.getTree());

                    }
                    break;
                case 6 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:66:5: drop_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_drop_statement_in_sql_statement384);
                    drop_statement8=drop_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, drop_statement8.getTree());

                    }
                    break;
                case 7 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:67:5: alter_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_alter_statement_in_sql_statement390);
                    alter_statement9=alter_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alter_statement9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sql_statement"


    public static class select_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_statement"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:70:1: select_statement : SELECT expression_list FROM identifier_list ( where_clause )? -> ^( SELECT_STMT expression_list identifier_list ( where_clause )? ) ;
    public final SQLGrammarParser.select_statement_return select_statement() throws RecognitionException {
        SQLGrammarParser.select_statement_return retval = new SQLGrammarParser.select_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SELECT10=null;
        Token FROM12=null;
        SQLGrammarParser.expression_list_return expression_list11 =null;

        SQLGrammarParser.identifier_list_return identifier_list13 =null;

        SQLGrammarParser.where_clause_return where_clause14 =null;


        CommonTree SELECT10_tree=null;
        CommonTree FROM12_tree=null;
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleSubtreeStream stream_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule expression_list");
        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        RewriteRuleSubtreeStream stream_identifier_list=new RewriteRuleSubtreeStream(adaptor,"rule identifier_list");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:71:3: ( SELECT expression_list FROM identifier_list ( where_clause )? -> ^( SELECT_STMT expression_list identifier_list ( where_clause )? ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:72:3: SELECT expression_list FROM identifier_list ( where_clause )?
            {
            SELECT10=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_statement405); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SELECT.add(SELECT10);


            pushFollow(FOLLOW_expression_list_in_select_statement407);
            expression_list11=expression_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression_list.add(expression_list11.getTree());

            FROM12=(Token)match(input,FROM,FOLLOW_FROM_in_select_statement409); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FROM.add(FROM12);


            pushFollow(FOLLOW_identifier_list_in_select_statement411);
            identifier_list13=identifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier_list.add(identifier_list13.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:72:47: ( where_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WHERE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:72:48: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_select_statement414);
                    where_clause14=where_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_where_clause.add(where_clause14.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier_list, expression_list, where_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 73:5: -> ^( SELECT_STMT expression_list identifier_list ( where_clause )? )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:74:7: ^( SELECT_STMT expression_list identifier_list ( where_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SELECT_STMT, "SELECT_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_expression_list.nextTree());

                adaptor.addChild(root_1, stream_identifier_list.nextTree());

                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:74:53: ( where_clause )?
                if ( stream_where_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_where_clause.nextTree());

                }
                stream_where_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_statement"


    public static class update_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update_statement"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:77:1: update_statement : UPDATE identifier SET assignment_list ( where_clause )? -> ^( UPDATE_STMT identifier assignment_list ( where_clause )? ) ;
    public final SQLGrammarParser.update_statement_return update_statement() throws RecognitionException {
        SQLGrammarParser.update_statement_return retval = new SQLGrammarParser.update_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token UPDATE15=null;
        Token SET17=null;
        SQLGrammarParser.identifier_return identifier16 =null;

        SQLGrammarParser.assignment_list_return assignment_list18 =null;

        SQLGrammarParser.where_clause_return where_clause19 =null;


        CommonTree UPDATE15_tree=null;
        CommonTree SET17_tree=null;
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        RewriteRuleSubtreeStream stream_assignment_list=new RewriteRuleSubtreeStream(adaptor,"rule assignment_list");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:78:3: ( UPDATE identifier SET assignment_list ( where_clause )? -> ^( UPDATE_STMT identifier assignment_list ( where_clause )? ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:79:3: UPDATE identifier SET assignment_list ( where_clause )?
            {
            UPDATE15=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_statement454); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE15);


            pushFollow(FOLLOW_identifier_in_update_statement456);
            identifier16=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier16.getTree());

            SET17=(Token)match(input,SET,FOLLOW_SET_in_update_statement458); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(SET17);


            pushFollow(FOLLOW_assignment_list_in_update_statement460);
            assignment_list18=assignment_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment_list.add(assignment_list18.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:79:41: ( where_clause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WHERE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:79:41: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_update_statement462);
                    where_clause19=where_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_where_clause.add(where_clause19.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: assignment_list, identifier, where_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 80:5: -> ^( UPDATE_STMT identifier assignment_list ( where_clause )? )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:81:7: ^( UPDATE_STMT identifier assignment_list ( where_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(UPDATE_STMT, "UPDATE_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_assignment_list.nextTree());

                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:81:48: ( where_clause )?
                if ( stream_where_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_where_clause.nextTree());

                }
                stream_where_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "update_statement"


    public static class insert_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "insert_statement"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:84:1: insert_statement : INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN -> ^( INSERT_STMT identifier identifier_list expression_list ) ;
    public final SQLGrammarParser.insert_statement_return insert_statement() throws RecognitionException {
        SQLGrammarParser.insert_statement_return retval = new SQLGrammarParser.insert_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INSERT20=null;
        Token INTO21=null;
        Token LPAREN23=null;
        Token RPAREN25=null;
        Token VALUES26=null;
        Token LPAREN27=null;
        Token RPAREN29=null;
        SQLGrammarParser.identifier_return identifier22 =null;

        SQLGrammarParser.identifier_list_return identifier_list24 =null;

        SQLGrammarParser.expression_list_return expression_list28 =null;


        CommonTree INSERT20_tree=null;
        CommonTree INTO21_tree=null;
        CommonTree LPAREN23_tree=null;
        CommonTree RPAREN25_tree=null;
        CommonTree VALUES26_tree=null;
        CommonTree LPAREN27_tree=null;
        CommonTree RPAREN29_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_INSERT=new RewriteRuleTokenStream(adaptor,"token INSERT");
        RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_VALUES=new RewriteRuleTokenStream(adaptor,"token VALUES");
        RewriteRuleSubtreeStream stream_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule expression_list");
        RewriteRuleSubtreeStream stream_identifier_list=new RewriteRuleSubtreeStream(adaptor,"rule identifier_list");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:85:3: ( INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN -> ^( INSERT_STMT identifier identifier_list expression_list ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:86:3: INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN
            {
            INSERT20=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_statement501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INSERT.add(INSERT20);


            INTO21=(Token)match(input,INTO,FOLLOW_INTO_in_insert_statement503); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTO.add(INTO21);


            pushFollow(FOLLOW_identifier_in_insert_statement505);
            identifier22=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier22.getTree());

            LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_statement507); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN23);


            pushFollow(FOLLOW_identifier_list_in_insert_statement509);
            identifier_list24=identifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier_list.add(identifier_list24.getTree());

            RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_statement511); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN25);


            VALUES26=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_statement513); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VALUES.add(VALUES26);


            LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_statement515); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN27);


            pushFollow(FOLLOW_expression_list_in_insert_statement517);
            expression_list28=expression_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression_list.add(expression_list28.getTree());

            RPAREN29=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_statement519); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN29);


            // AST REWRITE
            // elements: identifier_list, expression_list, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 87:4: -> ^( INSERT_STMT identifier identifier_list expression_list )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:88:5: ^( INSERT_STMT identifier identifier_list expression_list )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INSERT_STMT, "INSERT_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_identifier_list.nextTree());

                adaptor.addChild(root_1, stream_expression_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "insert_statement"


    public static class delete_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delete_statement"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:91:1: delete_statement : DELETE FROM identifier ( where_clause )? -> ^( DELETE_STMT identifier ( where_clause )? ) ;
    public final SQLGrammarParser.delete_statement_return delete_statement() throws RecognitionException {
        SQLGrammarParser.delete_statement_return retval = new SQLGrammarParser.delete_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DELETE30=null;
        Token FROM31=null;
        SQLGrammarParser.identifier_return identifier32 =null;

        SQLGrammarParser.where_clause_return where_clause33 =null;


        CommonTree DELETE30_tree=null;
        CommonTree FROM31_tree=null;
        RewriteRuleTokenStream stream_DELETE=new RewriteRuleTokenStream(adaptor,"token DELETE");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:92:3: ( DELETE FROM identifier ( where_clause )? -> ^( DELETE_STMT identifier ( where_clause )? ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:93:3: DELETE FROM identifier ( where_clause )?
            {
            DELETE30=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_statement554); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DELETE.add(DELETE30);


            FROM31=(Token)match(input,FROM,FOLLOW_FROM_in_delete_statement556); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FROM.add(FROM31);


            pushFollow(FOLLOW_identifier_in_delete_statement558);
            identifier32=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier32.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:93:26: ( where_clause )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==WHERE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:93:26: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_delete_statement560);
                    where_clause33=where_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_where_clause.add(where_clause33.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: where_clause, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 94:5: -> ^( DELETE_STMT identifier ( where_clause )? )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:94:8: ^( DELETE_STMT identifier ( where_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DELETE_STMT, "DELETE_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:94:33: ( where_clause )?
                if ( stream_where_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_where_clause.nextTree());

                }
                stream_where_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "delete_statement"


    public static class create_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_statement"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:97:1: create_statement : CREATE TABLE identifier LPAREN table_columns_def RPAREN -> ^( CREATE_STMT identifier table_columns_def ) ;
    public final SQLGrammarParser.create_statement_return create_statement() throws RecognitionException {
        SQLGrammarParser.create_statement_return retval = new SQLGrammarParser.create_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CREATE34=null;
        Token TABLE35=null;
        Token LPAREN37=null;
        Token RPAREN39=null;
        SQLGrammarParser.identifier_return identifier36 =null;

        SQLGrammarParser.table_columns_def_return table_columns_def38 =null;


        CommonTree CREATE34_tree=null;
        CommonTree TABLE35_tree=null;
        CommonTree LPAREN37_tree=null;
        CommonTree RPAREN39_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_table_columns_def=new RewriteRuleSubtreeStream(adaptor,"rule table_columns_def");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:98:3: ( CREATE TABLE identifier LPAREN table_columns_def RPAREN -> ^( CREATE_STMT identifier table_columns_def ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:99:3: CREATE TABLE identifier LPAREN table_columns_def RPAREN
            {
            CREATE34=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_statement591); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE34);


            TABLE35=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_statement593); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TABLE.add(TABLE35);


            pushFollow(FOLLOW_identifier_in_create_statement595);
            identifier36=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier36.getTree());

            LPAREN37=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_statement597); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN37);


            pushFollow(FOLLOW_table_columns_def_in_create_statement599);
            table_columns_def38=table_columns_def();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table_columns_def.add(table_columns_def38.getTree());

            RPAREN39=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_statement601); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN39);


            // AST REWRITE
            // elements: identifier, table_columns_def
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 100:5: -> ^( CREATE_STMT identifier table_columns_def )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:101:5: ^( CREATE_STMT identifier table_columns_def )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CREATE_STMT, "CREATE_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_table_columns_def.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_statement"


    public static class drop_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop_statement"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:104:1: drop_statement : DROP TABLE identifier -> ^( DROP_STMT identifier ) ;
    public final SQLGrammarParser.drop_statement_return drop_statement() throws RecognitionException {
        SQLGrammarParser.drop_statement_return retval = new SQLGrammarParser.drop_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DROP40=null;
        Token TABLE41=null;
        SQLGrammarParser.identifier_return identifier42 =null;


        CommonTree DROP40_tree=null;
        CommonTree TABLE41_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:105:3: ( DROP TABLE identifier -> ^( DROP_STMT identifier ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:106:3: DROP TABLE identifier
            {
            DROP40=(Token)match(input,DROP,FOLLOW_DROP_in_drop_statement634); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP40);


            TABLE41=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_statement636); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TABLE.add(TABLE41);


            pushFollow(FOLLOW_identifier_in_drop_statement638);
            identifier42=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier42.getTree());

            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 107:5: -> ^( DROP_STMT identifier )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:108:5: ^( DROP_STMT identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DROP_STMT, "DROP_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drop_statement"


    public static class alter_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alter_statement"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:111:1: alter_statement : ALTER ;
    public final SQLGrammarParser.alter_statement_return alter_statement() throws RecognitionException {
        SQLGrammarParser.alter_statement_return retval = new SQLGrammarParser.alter_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ALTER43=null;

        CommonTree ALTER43_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:112:3: ( ALTER )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:113:3: ALTER
            {
            root_0 = (CommonTree)adaptor.nil();


            ALTER43=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_statement669); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ALTER43_tree = 
            (CommonTree)adaptor.create(ALTER43)
            ;
            adaptor.addChild(root_0, ALTER43_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alter_statement"


    public static class table_columns_def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_columns_def"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:116:1: table_columns_def : table_column_def ( ',' table_column_def )* -> ^( COLUMN_DEF_LIST ( table_column_def )+ ) ;
    public final SQLGrammarParser.table_columns_def_return table_columns_def() throws RecognitionException {
        SQLGrammarParser.table_columns_def_return retval = new SQLGrammarParser.table_columns_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal45=null;
        SQLGrammarParser.table_column_def_return table_column_def44 =null;

        SQLGrammarParser.table_column_def_return table_column_def46 =null;


        CommonTree char_literal45_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_table_column_def=new RewriteRuleSubtreeStream(adaptor,"rule table_column_def");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:117:3: ( table_column_def ( ',' table_column_def )* -> ^( COLUMN_DEF_LIST ( table_column_def )+ ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:117:5: table_column_def ( ',' table_column_def )*
            {
            pushFollow(FOLLOW_table_column_def_in_table_columns_def682);
            table_column_def44=table_column_def();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table_column_def.add(table_column_def44.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:117:22: ( ',' table_column_def )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==57) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:117:23: ',' table_column_def
            	    {
            	    char_literal45=(Token)match(input,57,FOLLOW_57_in_table_columns_def685); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal45);


            	    pushFollow(FOLLOW_table_column_def_in_table_columns_def687);
            	    table_column_def46=table_column_def();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_table_column_def.add(table_column_def46.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: table_column_def
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 118:5: -> ^( COLUMN_DEF_LIST ( table_column_def )+ )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:118:8: ^( COLUMN_DEF_LIST ( table_column_def )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COLUMN_DEF_LIST, "COLUMN_DEF_LIST")
                , root_1);

                if ( !(stream_table_column_def.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_table_column_def.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_column_def.nextTree());

                }
                stream_table_column_def.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_columns_def"


    public static class table_column_def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_column_def"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:121:1: table_column_def : identifier type_specifier ;
    public final SQLGrammarParser.table_column_def_return table_column_def() throws RecognitionException {
        SQLGrammarParser.table_column_def_return retval = new SQLGrammarParser.table_column_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SQLGrammarParser.identifier_return identifier47 =null;

        SQLGrammarParser.type_specifier_return type_specifier48 =null;



        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:122:3: ( identifier type_specifier )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:122:5: identifier type_specifier
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_table_column_def716);
            identifier47=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier47.getTree());

            pushFollow(FOLLOW_type_specifier_in_table_column_def718);
            type_specifier48=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier48.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_column_def"


    public static class type_specifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_specifier"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:125:1: type_specifier : ( INT | FLOAT | CHAR LPAREN number_value RPAREN | VARCHAR LPAREN number_value RPAREN | DATE | TIME | TIMESTAMP );
    public final SQLGrammarParser.type_specifier_return type_specifier() throws RecognitionException {
        SQLGrammarParser.type_specifier_return retval = new SQLGrammarParser.type_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT49=null;
        Token FLOAT50=null;
        Token CHAR51=null;
        Token LPAREN52=null;
        Token RPAREN54=null;
        Token VARCHAR55=null;
        Token LPAREN56=null;
        Token RPAREN58=null;
        Token DATE59=null;
        Token TIME60=null;
        Token TIMESTAMP61=null;
        SQLGrammarParser.number_value_return number_value53 =null;

        SQLGrammarParser.number_value_return number_value57 =null;


        CommonTree INT49_tree=null;
        CommonTree FLOAT50_tree=null;
        CommonTree CHAR51_tree=null;
        CommonTree LPAREN52_tree=null;
        CommonTree RPAREN54_tree=null;
        CommonTree VARCHAR55_tree=null;
        CommonTree LPAREN56_tree=null;
        CommonTree RPAREN58_tree=null;
        CommonTree DATE59_tree=null;
        CommonTree TIME60_tree=null;
        CommonTree TIMESTAMP61_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:126:3: ( INT | FLOAT | CHAR LPAREN number_value RPAREN | VARCHAR LPAREN number_value RPAREN | DATE | TIME | TIMESTAMP )
            int alt6=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt6=1;
                }
                break;
            case FLOAT:
                {
                alt6=2;
                }
                break;
            case CHAR:
                {
                alt6=3;
                }
                break;
            case VARCHAR:
                {
                alt6=4;
                }
                break;
            case DATE:
                {
                alt6=5;
                }
                break;
            case TIME:
                {
                alt6=6;
                }
                break;
            case TIMESTAMP:
                {
                alt6=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:126:5: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT49=(Token)match(input,INT,FOLLOW_INT_in_type_specifier731); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT49_tree = 
                    (CommonTree)adaptor.create(INT49)
                    ;
                    adaptor.addChild(root_0, INT49_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:127:5: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FLOAT50=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier737); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT50_tree = 
                    (CommonTree)adaptor.create(FLOAT50)
                    ;
                    adaptor.addChild(root_0, FLOAT50_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:128:5: CHAR LPAREN number_value RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CHAR51=(Token)match(input,CHAR,FOLLOW_CHAR_in_type_specifier743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR51_tree = 
                    (CommonTree)adaptor.create(CHAR51)
                    ;
                    adaptor.addChild(root_0, CHAR51_tree);
                    }

                    LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_specifier745); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN52_tree = 
                    (CommonTree)adaptor.create(LPAREN52)
                    ;
                    adaptor.addChild(root_0, LPAREN52_tree);
                    }

                    pushFollow(FOLLOW_number_value_in_type_specifier747);
                    number_value53=number_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_value53.getTree());

                    RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_specifier749); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN54_tree = 
                    (CommonTree)adaptor.create(RPAREN54)
                    ;
                    adaptor.addChild(root_0, RPAREN54_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:129:5: VARCHAR LPAREN number_value RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    VARCHAR55=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_type_specifier755); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VARCHAR55_tree = 
                    (CommonTree)adaptor.create(VARCHAR55)
                    ;
                    adaptor.addChild(root_0, VARCHAR55_tree);
                    }

                    LPAREN56=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_specifier757); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN56_tree = 
                    (CommonTree)adaptor.create(LPAREN56)
                    ;
                    adaptor.addChild(root_0, LPAREN56_tree);
                    }

                    pushFollow(FOLLOW_number_value_in_type_specifier759);
                    number_value57=number_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_value57.getTree());

                    RPAREN58=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_specifier761); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN58_tree = 
                    (CommonTree)adaptor.create(RPAREN58)
                    ;
                    adaptor.addChild(root_0, RPAREN58_tree);
                    }

                    }
                    break;
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:130:5: DATE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DATE59=(Token)match(input,DATE,FOLLOW_DATE_in_type_specifier767); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATE59_tree = 
                    (CommonTree)adaptor.create(DATE59)
                    ;
                    adaptor.addChild(root_0, DATE59_tree);
                    }

                    }
                    break;
                case 6 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:131:5: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TIME60=(Token)match(input,TIME,FOLLOW_TIME_in_type_specifier773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME60_tree = 
                    (CommonTree)adaptor.create(TIME60)
                    ;
                    adaptor.addChild(root_0, TIME60_tree);
                    }

                    }
                    break;
                case 7 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:132:5: TIMESTAMP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TIMESTAMP61=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_type_specifier779); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIMESTAMP61_tree = 
                    (CommonTree)adaptor.create(TIMESTAMP61)
                    ;
                    adaptor.addChild(root_0, TIMESTAMP61_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_specifier"


    public static class expression_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_list"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:135:1: expression_list : expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) ;
    public final SQLGrammarParser.expression_list_return expression_list() throws RecognitionException {
        SQLGrammarParser.expression_list_return retval = new SQLGrammarParser.expression_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal63=null;
        SQLGrammarParser.expr_return expr62 =null;

        SQLGrammarParser.expr_return expr64 =null;


        CommonTree char_literal63_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:136:3: ( expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:137:3: expr ( ',' expr )*
            {
            pushFollow(FOLLOW_expr_in_expression_list794);
            expr62=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr62.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:137:8: ( ',' expr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==57) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:137:9: ',' expr
            	    {
            	    char_literal63=(Token)match(input,57,FOLLOW_57_in_expression_list797); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal63);


            	    pushFollow(FOLLOW_expr_in_expression_list799);
            	    expr64=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr64.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 138:5: -> ^( EXPR_LIST ( expr )+ )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:139:7: ^( EXPR_LIST ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXPR_LIST, "EXPR_LIST")
                , root_1);

                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression_list"


    public static class identifier_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier_list"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:142:1: identifier_list : identifier ( ',' ! identifier )* ;
    public final SQLGrammarParser.identifier_list_return identifier_list() throws RecognitionException {
        SQLGrammarParser.identifier_list_return retval = new SQLGrammarParser.identifier_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal66=null;
        SQLGrammarParser.identifier_return identifier65 =null;

        SQLGrammarParser.identifier_return identifier67 =null;


        CommonTree char_literal66_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:143:3: ( identifier ( ',' ! identifier )* )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:144:3: identifier ( ',' ! identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_identifier_list835);
            identifier65=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier65.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:144:14: ( ',' ! identifier )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==57) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:144:15: ',' ! identifier
            	    {
            	    char_literal66=(Token)match(input,57,FOLLOW_57_in_identifier_list838); if (state.failed) return retval;

            	    pushFollow(FOLLOW_identifier_in_identifier_list841);
            	    identifier67=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier67.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier_list"


    public static class where_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "where_clause"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:146:1: where_clause : WHERE disjunction -> ^( WHERE disjunction ) ;
    public final SQLGrammarParser.where_clause_return where_clause() throws RecognitionException {
        SQLGrammarParser.where_clause_return retval = new SQLGrammarParser.where_clause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WHERE68=null;
        SQLGrammarParser.disjunction_return disjunction69 =null;


        CommonTree WHERE68_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_disjunction=new RewriteRuleSubtreeStream(adaptor,"rule disjunction");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:147:3: ( WHERE disjunction -> ^( WHERE disjunction ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:148:3: WHERE disjunction
            {
            WHERE68=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause855); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHERE.add(WHERE68);


            pushFollow(FOLLOW_disjunction_in_where_clause857);
            disjunction69=disjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_disjunction.add(disjunction69.getTree());

            // AST REWRITE
            // elements: disjunction, WHERE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 149:5: -> ^( WHERE disjunction )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:150:7: ^( WHERE disjunction )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_WHERE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_disjunction.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "where_clause"


    public static class disjunction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "disjunction"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:153:1: disjunction : conjunction ( OR ^ disjunction )* ;
    public final SQLGrammarParser.disjunction_return disjunction() throws RecognitionException {
        SQLGrammarParser.disjunction_return retval = new SQLGrammarParser.disjunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR71=null;
        SQLGrammarParser.conjunction_return conjunction70 =null;

        SQLGrammarParser.disjunction_return disjunction72 =null;


        CommonTree OR71_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:154:3: ( conjunction ( OR ^ disjunction )* )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:155:3: conjunction ( OR ^ disjunction )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conjunction_in_disjunction890);
            conjunction70=conjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction70.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:155:15: ( OR ^ disjunction )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==OR) ) {
                    int LA9_3 = input.LA(2);

                    if ( (synpred19_SQLGrammar()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:155:16: OR ^ disjunction
            	    {
            	    OR71=(Token)match(input,OR,FOLLOW_OR_in_disjunction893); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR71_tree = 
            	    (CommonTree)adaptor.create(OR71)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR71_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_disjunction_in_disjunction896);
            	    disjunction72=disjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, disjunction72.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "disjunction"


    public static class conjunction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conjunction"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:158:1: conjunction : predicate ( AND ^ conjunction )* ;
    public final SQLGrammarParser.conjunction_return conjunction() throws RecognitionException {
        SQLGrammarParser.conjunction_return retval = new SQLGrammarParser.conjunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND74=null;
        SQLGrammarParser.predicate_return predicate73 =null;

        SQLGrammarParser.conjunction_return conjunction75 =null;


        CommonTree AND74_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:159:3: ( predicate ( AND ^ conjunction )* )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:160:3: predicate ( AND ^ conjunction )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_predicate_in_conjunction913);
            predicate73=predicate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate73.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:160:13: ( AND ^ conjunction )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==AND) ) {
                    int LA10_4 = input.LA(2);

                    if ( (synpred20_SQLGrammar()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:160:14: AND ^ conjunction
            	    {
            	    AND74=(Token)match(input,AND,FOLLOW_AND_in_conjunction916); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND74_tree = 
            	    (CommonTree)adaptor.create(AND74)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND74_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_conjunction_in_conjunction919);
            	    conjunction75=conjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction75.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conjunction"


    public static class predicate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicate"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:163:1: predicate : expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr ;
    public final SQLGrammarParser.predicate_return predicate() throws RecognitionException {
        SQLGrammarParser.predicate_return retval = new SQLGrammarParser.predicate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ77=null;
        Token LT78=null;
        Token GT79=null;
        Token GE80=null;
        Token LE81=null;
        Token NE82=null;
        SQLGrammarParser.expr_return expr76 =null;

        SQLGrammarParser.expr_return expr83 =null;


        CommonTree EQ77_tree=null;
        CommonTree LT78_tree=null;
        CommonTree GT79_tree=null;
        CommonTree GE80_tree=null;
        CommonTree LE81_tree=null;
        CommonTree NE82_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:164:3: ( expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:165:3: expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_predicate936);
            expr76=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr76.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:165:8: ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^)
            int alt11=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt11=1;
                }
                break;
            case LT:
                {
                alt11=2;
                }
                break;
            case GT:
                {
                alt11=3;
                }
                break;
            case GE:
                {
                alt11=4;
                }
                break;
            case LE:
                {
                alt11=5;
                }
                break;
            case NE:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:165:9: EQ ^
                    {
                    EQ77=(Token)match(input,EQ,FOLLOW_EQ_in_predicate939); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ77_tree = 
                    (CommonTree)adaptor.create(EQ77)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(EQ77_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:165:15: LT ^
                    {
                    LT78=(Token)match(input,LT,FOLLOW_LT_in_predicate944); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT78_tree = 
                    (CommonTree)adaptor.create(LT78)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(LT78_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:165:21: GT ^
                    {
                    GT79=(Token)match(input,GT,FOLLOW_GT_in_predicate949); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GT79_tree = 
                    (CommonTree)adaptor.create(GT79)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(GT79_tree, root_0);
                    }

                    }
                    break;
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:165:27: GE ^
                    {
                    GE80=(Token)match(input,GE,FOLLOW_GE_in_predicate954); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GE80_tree = 
                    (CommonTree)adaptor.create(GE80)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(GE80_tree, root_0);
                    }

                    }
                    break;
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:165:33: LE ^
                    {
                    LE81=(Token)match(input,LE,FOLLOW_LE_in_predicate959); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LE81_tree = 
                    (CommonTree)adaptor.create(LE81)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(LE81_tree, root_0);
                    }

                    }
                    break;
                case 6 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:165:39: NE ^
                    {
                    NE82=(Token)match(input,NE,FOLLOW_NE_in_predicate964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NE82_tree = 
                    (CommonTree)adaptor.create(NE82)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(NE82_tree, root_0);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_predicate969);
            expr83=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr83.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "predicate"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:168:1: expr : simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )* ;
    public final SQLGrammarParser.expr_return expr() throws RecognitionException {
        SQLGrammarParser.expr_return retval = new SQLGrammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS85=null;
        Token MINUS86=null;
        SQLGrammarParser.simpleExpression_return simpleExpression84 =null;

        SQLGrammarParser.simpleExpression_return simpleExpression87 =null;


        CommonTree PLUS85_tree=null;
        CommonTree MINUS86_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:169:3: ( simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )* )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:170:3: simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_simpleExpression_in_expr984);
            simpleExpression84=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression84.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:170:20: ( ( PLUS ^| MINUS ^) simpleExpression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==MINUS||LA13_0==PLUS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:170:21: ( PLUS ^| MINUS ^) simpleExpression
            	    {
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:170:21: ( PLUS ^| MINUS ^)
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==PLUS) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==MINUS) ) {
            	        alt12=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:170:22: PLUS ^
            	            {
            	            PLUS85=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr988); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS85_tree = 
            	            (CommonTree)adaptor.create(PLUS85)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS85_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:170:30: MINUS ^
            	            {
            	            MINUS86=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr993); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS86_tree = 
            	            (CommonTree)adaptor.create(MINUS86)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS86_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_simpleExpression_in_expr997);
            	    simpleExpression87=simpleExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression87.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class simpleExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleExpression"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:173:1: simpleExpression : term ( ( MUL ^| DIV ^| MOD ^) term )* ;
    public final SQLGrammarParser.simpleExpression_return simpleExpression() throws RecognitionException {
        SQLGrammarParser.simpleExpression_return retval = new SQLGrammarParser.simpleExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MUL89=null;
        Token DIV90=null;
        Token MOD91=null;
        SQLGrammarParser.term_return term88 =null;

        SQLGrammarParser.term_return term92 =null;


        CommonTree MUL89_tree=null;
        CommonTree DIV90_tree=null;
        CommonTree MOD91_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:174:3: ( term ( ( MUL ^| DIV ^| MOD ^) term )* )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:175:3: term ( ( MUL ^| DIV ^| MOD ^) term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_simpleExpression1014);
            term88=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term88.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:175:8: ( ( MUL ^| DIV ^| MOD ^) term )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==DIV||(LA15_0 >= MOD && LA15_0 <= MUL)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:175:9: ( MUL ^| DIV ^| MOD ^) term
            	    {
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:175:9: ( MUL ^| DIV ^| MOD ^)
            	    int alt14=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:175:10: MUL ^
            	            {
            	            MUL89=(Token)match(input,MUL,FOLLOW_MUL_in_simpleExpression1018); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MUL89_tree = 
            	            (CommonTree)adaptor.create(MUL89)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MUL89_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:175:17: DIV ^
            	            {
            	            DIV90=(Token)match(input,DIV,FOLLOW_DIV_in_simpleExpression1023); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DIV90_tree = 
            	            (CommonTree)adaptor.create(DIV90)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIV90_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:175:24: MOD ^
            	            {
            	            MOD91=(Token)match(input,MOD,FOLLOW_MOD_in_simpleExpression1028); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MOD91_tree = 
            	            (CommonTree)adaptor.create(MOD91)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MOD91_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_simpleExpression1032);
            	    term92=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term92.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleExpression"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:178:1: term : ( identifier | value );
    public final SQLGrammarParser.term_return term() throws RecognitionException {
        SQLGrammarParser.term_return retval = new SQLGrammarParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SQLGrammarParser.identifier_return identifier93 =null;

        SQLGrammarParser.value_return value94 =null;



        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:179:3: ( identifier | value )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENTIFIER) ) {
                alt16=1;
            }
            else if ( (LA16_0==DATE||LA16_0==REAL_LIT||LA16_0==STRING_LIT||(LA16_0 >= TIME && LA16_0 <= TIMESTAMP)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:180:3: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_term1049);
                    identifier93=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier93.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:181:5: value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_value_in_term1055);
                    value94=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value94.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:184:1: value : ( number_value | string_value | date_value | time_value | timestamp_value );
    public final SQLGrammarParser.value_return value() throws RecognitionException {
        SQLGrammarParser.value_return retval = new SQLGrammarParser.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SQLGrammarParser.number_value_return number_value95 =null;

        SQLGrammarParser.string_value_return string_value96 =null;

        SQLGrammarParser.date_value_return date_value97 =null;

        SQLGrammarParser.time_value_return time_value98 =null;

        SQLGrammarParser.timestamp_value_return timestamp_value99 =null;



        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:185:3: ( number_value | string_value | date_value | time_value | timestamp_value )
            int alt17=5;
            switch ( input.LA(1) ) {
            case REAL_LIT:
                {
                alt17=1;
                }
                break;
            case STRING_LIT:
                {
                alt17=2;
                }
                break;
            case DATE:
                {
                alt17=3;
                }
                break;
            case TIME:
                {
                alt17=4;
                }
                break;
            case TIMESTAMP:
                {
                alt17=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:186:3: number_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_number_value_in_value1070);
                    number_value95=number_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_value95.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:187:5: string_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_string_value_in_value1076);
                    string_value96=string_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value96.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:188:5: date_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_date_value_in_value1082);
                    date_value97=date_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, date_value97.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:189:5: time_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_time_value_in_value1088);
                    time_value98=time_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, time_value98.getTree());

                    }
                    break;
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:190:5: timestamp_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timestamp_value_in_value1094);
                    timestamp_value99=timestamp_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_value99.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value"


    public static class number_value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number_value"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:194:1: number_value : REAL_LIT ;
    public final SQLGrammarParser.number_value_return number_value() throws RecognitionException {
        SQLGrammarParser.number_value_return retval = new SQLGrammarParser.number_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token REAL_LIT100=null;

        CommonTree REAL_LIT100_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:195:3: ( REAL_LIT )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:196:3: REAL_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            REAL_LIT100=(Token)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_number_value1110); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LIT100_tree = 
            (CommonTree)adaptor.create(REAL_LIT100)
            ;
            adaptor.addChild(root_0, REAL_LIT100_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "number_value"


    public static class string_value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string_value"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:199:1: string_value : STRING_LIT ;
    public final SQLGrammarParser.string_value_return string_value() throws RecognitionException {
        SQLGrammarParser.string_value_return retval = new SQLGrammarParser.string_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING_LIT101=null;

        CommonTree STRING_LIT101_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:200:3: ( STRING_LIT )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:201:3: STRING_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            STRING_LIT101=(Token)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_string_value1125); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LIT101_tree = 
            (CommonTree)adaptor.create(STRING_LIT101)
            ;
            adaptor.addChild(root_0, STRING_LIT101_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string_value"


    public static class date_value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "date_value"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:204:1: date_value : DATE string_value ;
    public final SQLGrammarParser.date_value_return date_value() throws RecognitionException {
        SQLGrammarParser.date_value_return retval = new SQLGrammarParser.date_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DATE102=null;
        SQLGrammarParser.string_value_return string_value103 =null;


        CommonTree DATE102_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:205:3: ( DATE string_value )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:206:3: DATE string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            DATE102=(Token)match(input,DATE,FOLLOW_DATE_in_date_value1140); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATE102_tree = 
            (CommonTree)adaptor.create(DATE102)
            ;
            adaptor.addChild(root_0, DATE102_tree);
            }

            pushFollow(FOLLOW_string_value_in_date_value1142);
            string_value103=string_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value103.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "date_value"


    public static class time_value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "time_value"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:209:1: time_value : TIME string_value ;
    public final SQLGrammarParser.time_value_return time_value() throws RecognitionException {
        SQLGrammarParser.time_value_return retval = new SQLGrammarParser.time_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TIME104=null;
        SQLGrammarParser.string_value_return string_value105 =null;


        CommonTree TIME104_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:210:3: ( TIME string_value )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:211:3: TIME string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            TIME104=(Token)match(input,TIME,FOLLOW_TIME_in_time_value1157); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIME104_tree = 
            (CommonTree)adaptor.create(TIME104)
            ;
            adaptor.addChild(root_0, TIME104_tree);
            }

            pushFollow(FOLLOW_string_value_in_time_value1159);
            string_value105=string_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value105.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "time_value"


    public static class timestamp_value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timestamp_value"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:214:1: timestamp_value : TIMESTAMP string_value ;
    public final SQLGrammarParser.timestamp_value_return timestamp_value() throws RecognitionException {
        SQLGrammarParser.timestamp_value_return retval = new SQLGrammarParser.timestamp_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TIMESTAMP106=null;
        SQLGrammarParser.string_value_return string_value107 =null;


        CommonTree TIMESTAMP106_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:215:3: ( TIMESTAMP string_value )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:216:3: TIMESTAMP string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            TIMESTAMP106=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_timestamp_value1174); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIMESTAMP106_tree = 
            (CommonTree)adaptor.create(TIMESTAMP106)
            ;
            adaptor.addChild(root_0, TIMESTAMP106_tree);
            }

            pushFollow(FOLLOW_string_value_in_timestamp_value1176);
            string_value107=string_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value107.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "timestamp_value"


    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:219:1: identifier : IDENTIFIER ;
    public final SQLGrammarParser.identifier_return identifier() throws RecognitionException {
        SQLGrammarParser.identifier_return retval = new SQLGrammarParser.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER108=null;

        CommonTree IDENTIFIER108_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:220:3: ( IDENTIFIER )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:221:3: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENTIFIER108=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier1191); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER108_tree = 
            (CommonTree)adaptor.create(IDENTIFIER108)
            ;
            adaptor.addChild(root_0, IDENTIFIER108_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class assignment_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_list"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:224:1: assignment_list : assignment ( ',' assignment )* -> ^( UPDATE_ASSIGNMENTS ( assignment )+ ) ;
    public final SQLGrammarParser.assignment_list_return assignment_list() throws RecognitionException {
        SQLGrammarParser.assignment_list_return retval = new SQLGrammarParser.assignment_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal110=null;
        SQLGrammarParser.assignment_return assignment109 =null;

        SQLGrammarParser.assignment_return assignment111 =null;


        CommonTree char_literal110_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:225:3: ( assignment ( ',' assignment )* -> ^( UPDATE_ASSIGNMENTS ( assignment )+ ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:225:5: assignment ( ',' assignment )*
            {
            pushFollow(FOLLOW_assignment_in_assignment_list1204);
            assignment109=assignment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment.add(assignment109.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:225:16: ( ',' assignment )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==57) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:225:17: ',' assignment
            	    {
            	    char_literal110=(Token)match(input,57,FOLLOW_57_in_assignment_list1207); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal110);


            	    pushFollow(FOLLOW_assignment_in_assignment_list1209);
            	    assignment111=assignment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_assignment.add(assignment111.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // AST REWRITE
            // elements: assignment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 225:34: -> ^( UPDATE_ASSIGNMENTS ( assignment )+ )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:225:37: ^( UPDATE_ASSIGNMENTS ( assignment )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(UPDATE_ASSIGNMENTS, "UPDATE_ASSIGNMENTS")
                , root_1);

                if ( !(stream_assignment.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_assignment.hasNext() ) {
                    adaptor.addChild(root_1, stream_assignment.nextTree());

                }
                stream_assignment.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment_list"


    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:228:1: assignment : identifier EQ expr -> ^( EQ identifier expr ) ;
    public final SQLGrammarParser.assignment_return assignment() throws RecognitionException {
        SQLGrammarParser.assignment_return retval = new SQLGrammarParser.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ113=null;
        SQLGrammarParser.identifier_return identifier112 =null;

        SQLGrammarParser.expr_return expr114 =null;


        CommonTree EQ113_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:229:3: ( identifier EQ expr -> ^( EQ identifier expr ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:229:5: identifier EQ expr
            {
            pushFollow(FOLLOW_identifier_in_assignment1233);
            identifier112=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier112.getTree());

            EQ113=(Token)match(input,EQ,FOLLOW_EQ_in_assignment1235); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ113);


            pushFollow(FOLLOW_expr_in_assignment1237);
            expr114=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr114.getTree());

            // AST REWRITE
            // elements: expr, EQ, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 229:24: -> ^( EQ identifier expr )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:229:27: ^( EQ identifier expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"

    // $ANTLR start synpred19_SQLGrammar
    public final void synpred19_SQLGrammar_fragment() throws RecognitionException {
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:155:16: ( OR disjunction )
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:155:16: OR disjunction
        {
        match(input,OR,FOLLOW_OR_in_synpred19_SQLGrammar893); if (state.failed) return ;

        pushFollow(FOLLOW_disjunction_in_synpred19_SQLGrammar896);
        disjunction();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred19_SQLGrammar

    // $ANTLR start synpred20_SQLGrammar
    public final void synpred20_SQLGrammar_fragment() throws RecognitionException {
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:160:14: ( AND conjunction )
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:160:14: AND conjunction
        {
        match(input,AND,FOLLOW_AND_in_synpred20_SQLGrammar916); if (state.failed) return ;

        pushFollow(FOLLOW_conjunction_in_synpred20_SQLGrammar919);
        conjunction();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_SQLGrammar

    // Delegated rules

    public final boolean synpred20_SQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_SQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_SQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_SQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_sql_statement_in_query337 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEMI_in_query339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_sql_statement354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_sql_statement360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_sql_statement366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_sql_statement372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_statement_in_sql_statement378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_statement_in_sql_statement384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_statement_in_sql_statement390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement405 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_expression_list_in_select_statement407 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_FROM_in_select_statement409 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_identifier_list_in_select_statement411 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_where_clause_in_select_statement414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_statement454 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_identifier_in_update_statement456 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SET_in_update_statement458 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_assignment_list_in_update_statement460 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_where_clause_in_update_statement462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_statement501 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INTO_in_insert_statement503 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_identifier_in_insert_statement505 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_statement507 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_identifier_list_in_insert_statement509 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_statement511 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_statement513 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_statement515 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_expression_list_in_insert_statement517 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_statement519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_statement554 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_FROM_in_delete_statement556 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_identifier_in_delete_statement558 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_where_clause_in_delete_statement560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_statement591 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_TABLE_in_create_statement593 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_identifier_in_create_statement595 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_statement597 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_table_columns_def_in_create_statement599 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_statement601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_statement634 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_TABLE_in_drop_statement636 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_identifier_in_drop_statement638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_statement669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_column_def_in_table_columns_def682 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_table_columns_def685 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_table_column_def_in_table_columns_def687 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_identifier_in_table_column_def716 = new BitSet(new long[]{0x0043000004080440L});
    public static final BitSet FOLLOW_type_specifier_in_table_column_def718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type_specifier737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier743 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_specifier745 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_number_value_in_type_specifier747 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_specifier749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARCHAR_in_type_specifier755 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_specifier757 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_number_value_in_type_specifier759 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_specifier761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_type_specifier767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_type_specifier773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_type_specifier779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expression_list794 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_expression_list797 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_expr_in_expression_list799 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list835 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_identifier_list838 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_identifier_in_identifier_list841 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clause855 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_disjunction_in_where_clause857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction890 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_OR_in_disjunction893 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_disjunction_in_disjunction896 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_predicate_in_conjunction913 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_conjunction916 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_conjunction_in_conjunction919 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_expr_in_predicate936 = new BitSet(new long[]{0x0000000890620000L});
    public static final BitSet FOLLOW_EQ_in_predicate939 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_LT_in_predicate944 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_GT_in_predicate949 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_GE_in_predicate954 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_LE_in_predicate959 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_NE_in_predicate964 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_expr_in_predicate969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expr984 = new BitSet(new long[]{0x0000004100000002L});
    public static final BitSet FOLLOW_PLUS_in_expr988 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_MINUS_in_expr993 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_simpleExpression_in_expr997 = new BitSet(new long[]{0x0000004100000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression1014 = new BitSet(new long[]{0x0000000600004002L});
    public static final BitSet FOLLOW_MUL_in_simpleExpression1018 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_DIV_in_simpleExpression1023 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_MOD_in_simpleExpression1028 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_term_in_simpleExpression1032 = new BitSet(new long[]{0x0000000600004002L});
    public static final BitSet FOLLOW_identifier_in_term1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_value_in_value1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_value_in_value1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_value_in_value1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_value_in_value1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestamp_value_in_value1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_number_value1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LIT_in_string_value1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_date_value1140 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_string_value_in_date_value1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_time_value1157 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_string_value_in_time_value1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_timestamp_value1174 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_string_value_in_timestamp_value1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_assignment_list1204 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_assignment_list1207 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_assignment_in_assignment_list1209 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignment1233 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQ_in_assignment1235 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_expr_in_assignment1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred19_SQLGrammar893 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_disjunction_in_synpred19_SQLGrammar896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred20_SQLGrammar916 = new BitSet(new long[]{0x0003208000800400L});
    public static final BitSet FOLLOW_conjunction_in_synpred20_SQLGrammar919 = new BitSet(new long[]{0x0000000000000002L});

}