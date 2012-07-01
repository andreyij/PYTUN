// $ANTLR 3.4 D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g 2012-07-01 22:57:58

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALTER", "AND", "CHAR", "CREATE", "DATE", "DELETE", "DELETE_STMT", "DIGIT", "DIV", "DROP", "EQ", "EXPR_LIST", "FLOAT", "FROM", "GE", "GT", "IDENTIFIER", "INSERT", "INSERT_STMT", "INT", "INTO", "LE", "LETTER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NE", "NEWLINE", "OR", "PLUS", "REAL_LIT", "RPAREN", "SELECT", "SELECT_STMT", "SEMI", "SET", "STRING_LIT", "TABLE_LIST", "TIME", "TIMESTAMP", "UPDATE", "UPDATE_ASSIGNMENTS", "UPDATE_STMT", "VALUES", "VARCHAR", "WHERE", "WHITESPACE", "','"
    };

    public static final int EOF=-1;
    public static final int T__53=53;
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
    public static final int REAL_LIT=36;
    public static final int RPAREN=37;
    public static final int SELECT=38;
    public static final int SELECT_STMT=39;
    public static final int SEMI=40;
    public static final int SET=41;
    public static final int STRING_LIT=42;
    public static final int TABLE_LIST=43;
    public static final int TIME=44;
    public static final int TIMESTAMP=45;
    public static final int UPDATE=46;
    public static final int UPDATE_ASSIGNMENTS=47;
    public static final int UPDATE_STMT=48;
    public static final int VALUES=49;
    public static final int VARCHAR=50;
    public static final int WHERE=51;
    public static final int WHITESPACE=52;

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
    public String getGrammarFileName() { return "D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g"; }


    public static class query_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:51:1: query : sql_statement SEMI ;
    public final SQLGrammarParser.query_return query() throws RecognitionException {
        SQLGrammarParser.query_return retval = new SQLGrammarParser.query_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SEMI2=null;
        SQLGrammarParser.sql_statement_return sql_statement1 =null;


        CommonTree SEMI2_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:52:3: ( sql_statement SEMI )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:53:3: sql_statement SEMI
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_sql_statement_in_query322);
            sql_statement1=sql_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sql_statement1.getTree());

            SEMI2=(Token)match(input,SEMI,FOLLOW_SEMI_in_query324); if (state.failed) return retval;
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:56:1: sql_statement : ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement );
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:57:3: ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement )
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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:58:3: select_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_select_statement_in_sql_statement339);
                    select_statement3=select_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, select_statement3.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:59:5: update_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_update_statement_in_sql_statement345);
                    update_statement4=update_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, update_statement4.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:60:5: insert_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_insert_statement_in_sql_statement351);
                    insert_statement5=insert_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, insert_statement5.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:61:5: delete_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_delete_statement_in_sql_statement357);
                    delete_statement6=delete_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delete_statement6.getTree());

                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:62:5: create_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_create_statement_in_sql_statement363);
                    create_statement7=create_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, create_statement7.getTree());

                    }
                    break;
                case 6 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:63:5: drop_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_drop_statement_in_sql_statement369);
                    drop_statement8=drop_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, drop_statement8.getTree());

                    }
                    break;
                case 7 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:64:5: alter_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_alter_statement_in_sql_statement375);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:67:1: select_statement : SELECT expression_list FROM identifier_list ( where_clause )? -> ^( SELECT_STMT expression_list identifier_list ( where_clause )? ) ;
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:68:3: ( SELECT expression_list FROM identifier_list ( where_clause )? -> ^( SELECT_STMT expression_list identifier_list ( where_clause )? ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:69:3: SELECT expression_list FROM identifier_list ( where_clause )?
            {
            SELECT10=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_statement390); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SELECT.add(SELECT10);


            pushFollow(FOLLOW_expression_list_in_select_statement392);
            expression_list11=expression_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression_list.add(expression_list11.getTree());

            FROM12=(Token)match(input,FROM,FOLLOW_FROM_in_select_statement394); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FROM.add(FROM12);


            pushFollow(FOLLOW_identifier_list_in_select_statement396);
            identifier_list13=identifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier_list.add(identifier_list13.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:69:47: ( where_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WHERE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:69:48: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_select_statement399);
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
            // 70:5: -> ^( SELECT_STMT expression_list identifier_list ( where_clause )? )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:71:7: ^( SELECT_STMT expression_list identifier_list ( where_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SELECT_STMT, "SELECT_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_expression_list.nextTree());

                adaptor.addChild(root_1, stream_identifier_list.nextTree());

                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:71:53: ( where_clause )?
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:74:1: update_statement : UPDATE identifier SET assignment_list ( where_clause )? -> ^( UPDATE_STMT identifier assignment_list ( where_clause )? ) ;
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:75:3: ( UPDATE identifier SET assignment_list ( where_clause )? -> ^( UPDATE_STMT identifier assignment_list ( where_clause )? ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:76:3: UPDATE identifier SET assignment_list ( where_clause )?
            {
            UPDATE15=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_statement439); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE15);


            pushFollow(FOLLOW_identifier_in_update_statement441);
            identifier16=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier16.getTree());

            SET17=(Token)match(input,SET,FOLLOW_SET_in_update_statement443); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(SET17);


            pushFollow(FOLLOW_assignment_list_in_update_statement445);
            assignment_list18=assignment_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment_list.add(assignment_list18.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:76:41: ( where_clause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WHERE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:76:41: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_update_statement447);
                    where_clause19=where_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_where_clause.add(where_clause19.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: assignment_list, where_clause, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 77:5: -> ^( UPDATE_STMT identifier assignment_list ( where_clause )? )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:78:7: ^( UPDATE_STMT identifier assignment_list ( where_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(UPDATE_STMT, "UPDATE_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_assignment_list.nextTree());

                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:78:48: ( where_clause )?
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:81:1: insert_statement : INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN -> ^( INSERT_STMT identifier identifier_list expression_list ) ;
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:82:3: ( INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN -> ^( INSERT_STMT identifier identifier_list expression_list ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:83:3: INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN
            {
            INSERT20=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_statement486); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INSERT.add(INSERT20);


            INTO21=(Token)match(input,INTO,FOLLOW_INTO_in_insert_statement488); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTO.add(INTO21);


            pushFollow(FOLLOW_identifier_in_insert_statement490);
            identifier22=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier22.getTree());

            LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_statement492); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN23);


            pushFollow(FOLLOW_identifier_list_in_insert_statement494);
            identifier_list24=identifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier_list.add(identifier_list24.getTree());

            RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_statement496); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN25);


            VALUES26=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_statement498); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VALUES.add(VALUES26);


            LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_statement500); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN27);


            pushFollow(FOLLOW_expression_list_in_insert_statement502);
            expression_list28=expression_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression_list.add(expression_list28.getTree());

            RPAREN29=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_statement504); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN29);


            // AST REWRITE
            // elements: identifier, identifier_list, expression_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 84:4: -> ^( INSERT_STMT identifier identifier_list expression_list )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:85:5: ^( INSERT_STMT identifier identifier_list expression_list )
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:88:1: delete_statement : DELETE FROM identifier ( where_clause )? -> ^( DELETE_STMT identifier ( where_clause )? ) ;
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:89:3: ( DELETE FROM identifier ( where_clause )? -> ^( DELETE_STMT identifier ( where_clause )? ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:90:3: DELETE FROM identifier ( where_clause )?
            {
            DELETE30=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_statement539); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DELETE.add(DELETE30);


            FROM31=(Token)match(input,FROM,FOLLOW_FROM_in_delete_statement541); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FROM.add(FROM31);


            pushFollow(FOLLOW_identifier_in_delete_statement543);
            identifier32=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier32.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:90:26: ( where_clause )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==WHERE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:90:26: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_delete_statement545);
                    where_clause33=where_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_where_clause.add(where_clause33.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier, where_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 91:5: -> ^( DELETE_STMT identifier ( where_clause )? )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:91:8: ^( DELETE_STMT identifier ( where_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DELETE_STMT, "DELETE_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:91:33: ( where_clause )?
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:94:1: create_statement : CREATE ;
    public final SQLGrammarParser.create_statement_return create_statement() throws RecognitionException {
        SQLGrammarParser.create_statement_return retval = new SQLGrammarParser.create_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CREATE34=null;

        CommonTree CREATE34_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:95:3: ( CREATE )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:96:3: CREATE
            {
            root_0 = (CommonTree)adaptor.nil();


            CREATE34=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_statement576); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CREATE34_tree = 
            (CommonTree)adaptor.create(CREATE34)
            ;
            adaptor.addChild(root_0, CREATE34_tree);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:99:1: drop_statement : DROP ;
    public final SQLGrammarParser.drop_statement_return drop_statement() throws RecognitionException {
        SQLGrammarParser.drop_statement_return retval = new SQLGrammarParser.drop_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DROP35=null;

        CommonTree DROP35_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:100:3: ( DROP )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:101:3: DROP
            {
            root_0 = (CommonTree)adaptor.nil();


            DROP35=(Token)match(input,DROP,FOLLOW_DROP_in_drop_statement591); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DROP35_tree = 
            (CommonTree)adaptor.create(DROP35)
            ;
            adaptor.addChild(root_0, DROP35_tree);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:104:1: alter_statement : ALTER ;
    public final SQLGrammarParser.alter_statement_return alter_statement() throws RecognitionException {
        SQLGrammarParser.alter_statement_return retval = new SQLGrammarParser.alter_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ALTER36=null;

        CommonTree ALTER36_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:105:3: ( ALTER )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:106:3: ALTER
            {
            root_0 = (CommonTree)adaptor.nil();


            ALTER36=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_statement606); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ALTER36_tree = 
            (CommonTree)adaptor.create(ALTER36)
            ;
            adaptor.addChild(root_0, ALTER36_tree);
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


    public static class expression_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_list"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:109:1: expression_list : expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) ;
    public final SQLGrammarParser.expression_list_return expression_list() throws RecognitionException {
        SQLGrammarParser.expression_list_return retval = new SQLGrammarParser.expression_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal38=null;
        SQLGrammarParser.expr_return expr37 =null;

        SQLGrammarParser.expr_return expr39 =null;


        CommonTree char_literal38_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:110:3: ( expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:111:3: expr ( ',' expr )*
            {
            pushFollow(FOLLOW_expr_in_expression_list621);
            expr37=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr37.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:111:8: ( ',' expr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==53) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:111:9: ',' expr
            	    {
            	    char_literal38=(Token)match(input,53,FOLLOW_53_in_expression_list624); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_53.add(char_literal38);


            	    pushFollow(FOLLOW_expr_in_expression_list626);
            	    expr39=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr39.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // 112:5: -> ^( EXPR_LIST ( expr )+ )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:113:7: ^( EXPR_LIST ( expr )+ )
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:116:1: identifier_list : identifier ( ',' ! identifier )* ;
    public final SQLGrammarParser.identifier_list_return identifier_list() throws RecognitionException {
        SQLGrammarParser.identifier_list_return retval = new SQLGrammarParser.identifier_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal41=null;
        SQLGrammarParser.identifier_return identifier40 =null;

        SQLGrammarParser.identifier_return identifier42 =null;


        CommonTree char_literal41_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:117:3: ( identifier ( ',' ! identifier )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:118:3: identifier ( ',' ! identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_identifier_list662);
            identifier40=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier40.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:118:14: ( ',' ! identifier )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==53) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:118:15: ',' ! identifier
            	    {
            	    char_literal41=(Token)match(input,53,FOLLOW_53_in_identifier_list665); if (state.failed) return retval;

            	    pushFollow(FOLLOW_identifier_in_identifier_list668);
            	    identifier42=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier42.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:120:1: where_clause : WHERE disjunction -> ^( WHERE disjunction ) ;
    public final SQLGrammarParser.where_clause_return where_clause() throws RecognitionException {
        SQLGrammarParser.where_clause_return retval = new SQLGrammarParser.where_clause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WHERE43=null;
        SQLGrammarParser.disjunction_return disjunction44 =null;


        CommonTree WHERE43_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_disjunction=new RewriteRuleSubtreeStream(adaptor,"rule disjunction");
        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:121:3: ( WHERE disjunction -> ^( WHERE disjunction ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:122:3: WHERE disjunction
            {
            WHERE43=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause682); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHERE.add(WHERE43);


            pushFollow(FOLLOW_disjunction_in_where_clause684);
            disjunction44=disjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_disjunction.add(disjunction44.getTree());

            // AST REWRITE
            // elements: WHERE, disjunction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 123:5: -> ^( WHERE disjunction )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:124:7: ^( WHERE disjunction )
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:127:1: disjunction : conjunction ( OR ^ disjunction )* ;
    public final SQLGrammarParser.disjunction_return disjunction() throws RecognitionException {
        SQLGrammarParser.disjunction_return retval = new SQLGrammarParser.disjunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR46=null;
        SQLGrammarParser.conjunction_return conjunction45 =null;

        SQLGrammarParser.disjunction_return disjunction47 =null;


        CommonTree OR46_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:128:3: ( conjunction ( OR ^ disjunction )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:129:3: conjunction ( OR ^ disjunction )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conjunction_in_disjunction717);
            conjunction45=conjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction45.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:129:15: ( OR ^ disjunction )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==OR) ) {
                    int LA7_3 = input.LA(2);

                    if ( (synpred12_SQLGrammar()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:129:16: OR ^ disjunction
            	    {
            	    OR46=(Token)match(input,OR,FOLLOW_OR_in_disjunction720); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR46_tree = 
            	    (CommonTree)adaptor.create(OR46)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR46_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_disjunction_in_disjunction723);
            	    disjunction47=disjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, disjunction47.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:132:1: conjunction : predicate ( AND ^ conjunction )* ;
    public final SQLGrammarParser.conjunction_return conjunction() throws RecognitionException {
        SQLGrammarParser.conjunction_return retval = new SQLGrammarParser.conjunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND49=null;
        SQLGrammarParser.predicate_return predicate48 =null;

        SQLGrammarParser.conjunction_return conjunction50 =null;


        CommonTree AND49_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:133:3: ( predicate ( AND ^ conjunction )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:134:3: predicate ( AND ^ conjunction )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_predicate_in_conjunction740);
            predicate48=predicate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate48.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:134:13: ( AND ^ conjunction )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AND) ) {
                    int LA8_4 = input.LA(2);

                    if ( (synpred13_SQLGrammar()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:134:14: AND ^ conjunction
            	    {
            	    AND49=(Token)match(input,AND,FOLLOW_AND_in_conjunction743); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND49_tree = 
            	    (CommonTree)adaptor.create(AND49)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND49_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_conjunction_in_conjunction746);
            	    conjunction50=conjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction50.getTree());

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
    // $ANTLR end "conjunction"


    public static class predicate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicate"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:137:1: predicate : expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr ;
    public final SQLGrammarParser.predicate_return predicate() throws RecognitionException {
        SQLGrammarParser.predicate_return retval = new SQLGrammarParser.predicate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ52=null;
        Token LT53=null;
        Token GT54=null;
        Token GE55=null;
        Token LE56=null;
        Token NE57=null;
        SQLGrammarParser.expr_return expr51 =null;

        SQLGrammarParser.expr_return expr58 =null;


        CommonTree EQ52_tree=null;
        CommonTree LT53_tree=null;
        CommonTree GT54_tree=null;
        CommonTree GE55_tree=null;
        CommonTree LE56_tree=null;
        CommonTree NE57_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:138:3: ( expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:139:3: expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_predicate763);
            expr51=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr51.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:139:8: ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^)
            int alt9=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt9=1;
                }
                break;
            case LT:
                {
                alt9=2;
                }
                break;
            case GT:
                {
                alt9=3;
                }
                break;
            case GE:
                {
                alt9=4;
                }
                break;
            case LE:
                {
                alt9=5;
                }
                break;
            case NE:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:139:9: EQ ^
                    {
                    EQ52=(Token)match(input,EQ,FOLLOW_EQ_in_predicate766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ52_tree = 
                    (CommonTree)adaptor.create(EQ52)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(EQ52_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:139:15: LT ^
                    {
                    LT53=(Token)match(input,LT,FOLLOW_LT_in_predicate771); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT53_tree = 
                    (CommonTree)adaptor.create(LT53)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(LT53_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:139:21: GT ^
                    {
                    GT54=(Token)match(input,GT,FOLLOW_GT_in_predicate776); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GT54_tree = 
                    (CommonTree)adaptor.create(GT54)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(GT54_tree, root_0);
                    }

                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:139:27: GE ^
                    {
                    GE55=(Token)match(input,GE,FOLLOW_GE_in_predicate781); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GE55_tree = 
                    (CommonTree)adaptor.create(GE55)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(GE55_tree, root_0);
                    }

                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:139:33: LE ^
                    {
                    LE56=(Token)match(input,LE,FOLLOW_LE_in_predicate786); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LE56_tree = 
                    (CommonTree)adaptor.create(LE56)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(LE56_tree, root_0);
                    }

                    }
                    break;
                case 6 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:139:39: NE ^
                    {
                    NE57=(Token)match(input,NE,FOLLOW_NE_in_predicate791); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NE57_tree = 
                    (CommonTree)adaptor.create(NE57)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(NE57_tree, root_0);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_predicate796);
            expr58=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr58.getTree());

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:142:1: expr : simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )* ;
    public final SQLGrammarParser.expr_return expr() throws RecognitionException {
        SQLGrammarParser.expr_return retval = new SQLGrammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS60=null;
        Token MINUS61=null;
        SQLGrammarParser.simpleExpression_return simpleExpression59 =null;

        SQLGrammarParser.simpleExpression_return simpleExpression62 =null;


        CommonTree PLUS60_tree=null;
        CommonTree MINUS61_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:143:3: ( simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:144:3: simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_simpleExpression_in_expr811);
            simpleExpression59=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression59.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:144:20: ( ( PLUS ^| MINUS ^) simpleExpression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==MINUS||LA11_0==PLUS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:144:21: ( PLUS ^| MINUS ^) simpleExpression
            	    {
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:144:21: ( PLUS ^| MINUS ^)
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==PLUS) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==MINUS) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:144:22: PLUS ^
            	            {
            	            PLUS60=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr815); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS60_tree = 
            	            (CommonTree)adaptor.create(PLUS60)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS60_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:144:30: MINUS ^
            	            {
            	            MINUS61=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr820); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS61_tree = 
            	            (CommonTree)adaptor.create(MINUS61)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS61_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_simpleExpression_in_expr824);
            	    simpleExpression62=simpleExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression62.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:147:1: simpleExpression : term ( ( MUL ^| DIV ^| MOD ^) term )* ;
    public final SQLGrammarParser.simpleExpression_return simpleExpression() throws RecognitionException {
        SQLGrammarParser.simpleExpression_return retval = new SQLGrammarParser.simpleExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MUL64=null;
        Token DIV65=null;
        Token MOD66=null;
        SQLGrammarParser.term_return term63 =null;

        SQLGrammarParser.term_return term67 =null;


        CommonTree MUL64_tree=null;
        CommonTree DIV65_tree=null;
        CommonTree MOD66_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:148:3: ( term ( ( MUL ^| DIV ^| MOD ^) term )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:149:3: term ( ( MUL ^| DIV ^| MOD ^) term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_simpleExpression841);
            term63=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term63.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:149:8: ( ( MUL ^| DIV ^| MOD ^) term )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==DIV||(LA13_0 >= MOD && LA13_0 <= MUL)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:149:9: ( MUL ^| DIV ^| MOD ^) term
            	    {
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:149:9: ( MUL ^| DIV ^| MOD ^)
            	    int alt12=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:149:10: MUL ^
            	            {
            	            MUL64=(Token)match(input,MUL,FOLLOW_MUL_in_simpleExpression845); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MUL64_tree = 
            	            (CommonTree)adaptor.create(MUL64)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MUL64_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:149:17: DIV ^
            	            {
            	            DIV65=(Token)match(input,DIV,FOLLOW_DIV_in_simpleExpression850); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DIV65_tree = 
            	            (CommonTree)adaptor.create(DIV65)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIV65_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:149:24: MOD ^
            	            {
            	            MOD66=(Token)match(input,MOD,FOLLOW_MOD_in_simpleExpression855); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MOD66_tree = 
            	            (CommonTree)adaptor.create(MOD66)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MOD66_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_simpleExpression859);
            	    term67=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term67.getTree());

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
    // $ANTLR end "simpleExpression"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:152:1: term : ( identifier | value );
    public final SQLGrammarParser.term_return term() throws RecognitionException {
        SQLGrammarParser.term_return retval = new SQLGrammarParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SQLGrammarParser.identifier_return identifier68 =null;

        SQLGrammarParser.value_return value69 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:153:3: ( identifier | value )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IDENTIFIER) ) {
                alt14=1;
            }
            else if ( (LA14_0==DATE||LA14_0==REAL_LIT||LA14_0==STRING_LIT||(LA14_0 >= TIME && LA14_0 <= TIMESTAMP)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:154:3: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_term876);
                    identifier68=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier68.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:155:5: value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_value_in_term882);
                    value69=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value69.getTree());

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:158:1: value : ( number_value | string_value | date_value | time_value | timestamp_value );
    public final SQLGrammarParser.value_return value() throws RecognitionException {
        SQLGrammarParser.value_return retval = new SQLGrammarParser.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SQLGrammarParser.number_value_return number_value70 =null;

        SQLGrammarParser.string_value_return string_value71 =null;

        SQLGrammarParser.date_value_return date_value72 =null;

        SQLGrammarParser.time_value_return time_value73 =null;

        SQLGrammarParser.timestamp_value_return timestamp_value74 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:159:3: ( number_value | string_value | date_value | time_value | timestamp_value )
            int alt15=5;
            switch ( input.LA(1) ) {
            case REAL_LIT:
                {
                alt15=1;
                }
                break;
            case STRING_LIT:
                {
                alt15=2;
                }
                break;
            case DATE:
                {
                alt15=3;
                }
                break;
            case TIME:
                {
                alt15=4;
                }
                break;
            case TIMESTAMP:
                {
                alt15=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:160:3: number_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_number_value_in_value897);
                    number_value70=number_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_value70.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:161:5: string_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_string_value_in_value903);
                    string_value71=string_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value71.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:162:5: date_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_date_value_in_value909);
                    date_value72=date_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, date_value72.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:163:5: time_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_time_value_in_value915);
                    time_value73=time_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, time_value73.getTree());

                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:164:5: timestamp_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timestamp_value_in_value921);
                    timestamp_value74=timestamp_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_value74.getTree());

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:168:1: number_value : REAL_LIT ;
    public final SQLGrammarParser.number_value_return number_value() throws RecognitionException {
        SQLGrammarParser.number_value_return retval = new SQLGrammarParser.number_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token REAL_LIT75=null;

        CommonTree REAL_LIT75_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:169:3: ( REAL_LIT )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:170:3: REAL_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            REAL_LIT75=(Token)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_number_value937); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LIT75_tree = 
            (CommonTree)adaptor.create(REAL_LIT75)
            ;
            adaptor.addChild(root_0, REAL_LIT75_tree);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:173:1: string_value : STRING_LIT ;
    public final SQLGrammarParser.string_value_return string_value() throws RecognitionException {
        SQLGrammarParser.string_value_return retval = new SQLGrammarParser.string_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING_LIT76=null;

        CommonTree STRING_LIT76_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:174:3: ( STRING_LIT )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:175:3: STRING_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            STRING_LIT76=(Token)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_string_value952); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LIT76_tree = 
            (CommonTree)adaptor.create(STRING_LIT76)
            ;
            adaptor.addChild(root_0, STRING_LIT76_tree);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:178:1: date_value : DATE string_value ;
    public final SQLGrammarParser.date_value_return date_value() throws RecognitionException {
        SQLGrammarParser.date_value_return retval = new SQLGrammarParser.date_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DATE77=null;
        SQLGrammarParser.string_value_return string_value78 =null;


        CommonTree DATE77_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:179:3: ( DATE string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:180:3: DATE string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            DATE77=(Token)match(input,DATE,FOLLOW_DATE_in_date_value967); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATE77_tree = 
            (CommonTree)adaptor.create(DATE77)
            ;
            adaptor.addChild(root_0, DATE77_tree);
            }

            pushFollow(FOLLOW_string_value_in_date_value969);
            string_value78=string_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value78.getTree());

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:183:1: time_value : TIME string_value ;
    public final SQLGrammarParser.time_value_return time_value() throws RecognitionException {
        SQLGrammarParser.time_value_return retval = new SQLGrammarParser.time_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TIME79=null;
        SQLGrammarParser.string_value_return string_value80 =null;


        CommonTree TIME79_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:184:3: ( TIME string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:185:3: TIME string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            TIME79=(Token)match(input,TIME,FOLLOW_TIME_in_time_value984); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIME79_tree = 
            (CommonTree)adaptor.create(TIME79)
            ;
            adaptor.addChild(root_0, TIME79_tree);
            }

            pushFollow(FOLLOW_string_value_in_time_value986);
            string_value80=string_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value80.getTree());

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:188:1: timestamp_value : TIMESTAMP string_value ;
    public final SQLGrammarParser.timestamp_value_return timestamp_value() throws RecognitionException {
        SQLGrammarParser.timestamp_value_return retval = new SQLGrammarParser.timestamp_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TIMESTAMP81=null;
        SQLGrammarParser.string_value_return string_value82 =null;


        CommonTree TIMESTAMP81_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:189:3: ( TIMESTAMP string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:190:3: TIMESTAMP string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            TIMESTAMP81=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_timestamp_value1001); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIMESTAMP81_tree = 
            (CommonTree)adaptor.create(TIMESTAMP81)
            ;
            adaptor.addChild(root_0, TIMESTAMP81_tree);
            }

            pushFollow(FOLLOW_string_value_in_timestamp_value1003);
            string_value82=string_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value82.getTree());

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:193:1: identifier : IDENTIFIER ;
    public final SQLGrammarParser.identifier_return identifier() throws RecognitionException {
        SQLGrammarParser.identifier_return retval = new SQLGrammarParser.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER83=null;

        CommonTree IDENTIFIER83_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:194:3: ( IDENTIFIER )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:195:3: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENTIFIER83=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier1018); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER83_tree = 
            (CommonTree)adaptor.create(IDENTIFIER83)
            ;
            adaptor.addChild(root_0, IDENTIFIER83_tree);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:198:1: assignment_list : assignment ( ',' assignment )* -> ^( UPDATE_ASSIGNMENTS ( assignment )+ ) ;
    public final SQLGrammarParser.assignment_list_return assignment_list() throws RecognitionException {
        SQLGrammarParser.assignment_list_return retval = new SQLGrammarParser.assignment_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal85=null;
        SQLGrammarParser.assignment_return assignment84 =null;

        SQLGrammarParser.assignment_return assignment86 =null;


        CommonTree char_literal85_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:199:3: ( assignment ( ',' assignment )* -> ^( UPDATE_ASSIGNMENTS ( assignment )+ ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:199:5: assignment ( ',' assignment )*
            {
            pushFollow(FOLLOW_assignment_in_assignment_list1031);
            assignment84=assignment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment.add(assignment84.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:199:16: ( ',' assignment )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==53) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:199:17: ',' assignment
            	    {
            	    char_literal85=(Token)match(input,53,FOLLOW_53_in_assignment_list1034); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_53.add(char_literal85);


            	    pushFollow(FOLLOW_assignment_in_assignment_list1036);
            	    assignment86=assignment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_assignment.add(assignment86.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // 199:34: -> ^( UPDATE_ASSIGNMENTS ( assignment )+ )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:199:37: ^( UPDATE_ASSIGNMENTS ( assignment )+ )
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:202:1: assignment : identifier EQ expr -> ^( EQ identifier expr ) ;
    public final SQLGrammarParser.assignment_return assignment() throws RecognitionException {
        SQLGrammarParser.assignment_return retval = new SQLGrammarParser.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ88=null;
        SQLGrammarParser.identifier_return identifier87 =null;

        SQLGrammarParser.expr_return expr89 =null;


        CommonTree EQ88_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:203:3: ( identifier EQ expr -> ^( EQ identifier expr ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:203:5: identifier EQ expr
            {
            pushFollow(FOLLOW_identifier_in_assignment1060);
            identifier87=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier87.getTree());

            EQ88=(Token)match(input,EQ,FOLLOW_EQ_in_assignment1062); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ88);


            pushFollow(FOLLOW_expr_in_assignment1064);
            expr89=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr89.getTree());

            // AST REWRITE
            // elements: identifier, expr, EQ
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 203:24: -> ^( EQ identifier expr )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:203:27: ^( EQ identifier expr )
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

    // $ANTLR start synpred12_SQLGrammar
    public final void synpred12_SQLGrammar_fragment() throws RecognitionException {
        // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:129:16: ( OR disjunction )
        // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:129:16: OR disjunction
        {
        match(input,OR,FOLLOW_OR_in_synpred12_SQLGrammar720); if (state.failed) return ;

        pushFollow(FOLLOW_disjunction_in_synpred12_SQLGrammar723);
        disjunction();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_SQLGrammar

    // $ANTLR start synpred13_SQLGrammar
    public final void synpred13_SQLGrammar_fragment() throws RecognitionException {
        // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:134:14: ( AND conjunction )
        // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:134:14: AND conjunction
        {
        match(input,AND,FOLLOW_AND_in_synpred13_SQLGrammar743); if (state.failed) return ;

        pushFollow(FOLLOW_conjunction_in_synpred13_SQLGrammar746);
        conjunction();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_SQLGrammar

    // Delegated rules

    public final boolean synpred13_SQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_SQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_SQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_SQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_sql_statement_in_query322 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEMI_in_query324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_sql_statement339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_sql_statement345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_sql_statement351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_sql_statement357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_statement_in_sql_statement363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_statement_in_sql_statement369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_statement_in_sql_statement375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement390 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_expression_list_in_select_statement392 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_FROM_in_select_statement394 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_list_in_select_statement396 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_where_clause_in_select_statement399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_statement439 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_update_statement441 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SET_in_update_statement443 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_assignment_list_in_update_statement445 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_where_clause_in_update_statement447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_statement486 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INTO_in_insert_statement488 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_insert_statement490 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_statement492 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_list_in_insert_statement494 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_statement496 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_statement498 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_statement500 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_expression_list_in_insert_statement502 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_statement504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_statement539 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_FROM_in_delete_statement541 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_delete_statement543 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_where_clause_in_delete_statement545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_statement576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_statement591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_statement606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expression_list621 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_expression_list624 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_expr_in_expression_list626 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list662 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_identifier_list665 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_identifier_list668 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clause682 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_disjunction_in_where_clause684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction717 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_OR_in_disjunction720 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_disjunction_in_disjunction723 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_predicate_in_conjunction740 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_conjunction743 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_conjunction_in_conjunction746 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_expr_in_predicate763 = new BitSet(new long[]{0x00000001120C4000L});
    public static final BitSet FOLLOW_EQ_in_predicate766 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_LT_in_predicate771 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_GT_in_predicate776 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_GE_in_predicate781 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_LE_in_predicate786 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_NE_in_predicate791 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_expr_in_predicate796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expr811 = new BitSet(new long[]{0x0000000820000002L});
    public static final BitSet FOLLOW_PLUS_in_expr815 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_MINUS_in_expr820 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_simpleExpression_in_expr824 = new BitSet(new long[]{0x0000000820000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression841 = new BitSet(new long[]{0x00000000C0001002L});
    public static final BitSet FOLLOW_MUL_in_simpleExpression845 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_DIV_in_simpleExpression850 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_MOD_in_simpleExpression855 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_term_in_simpleExpression859 = new BitSet(new long[]{0x00000000C0001002L});
    public static final BitSet FOLLOW_identifier_in_term876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_value_in_value897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_value_in_value903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_value_in_value909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_value_in_value915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestamp_value_in_value921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_number_value937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LIT_in_string_value952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_date_value967 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_string_value_in_date_value969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_time_value984 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_string_value_in_time_value986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_timestamp_value1001 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_string_value_in_timestamp_value1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_assignment_list1031 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_assignment_list1034 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_assignment_in_assignment_list1036 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignment1060 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EQ_in_assignment1062 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_expr_in_assignment1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred12_SQLGrammar720 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_disjunction_in_synpred12_SQLGrammar723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred13_SQLGrammar743 = new BitSet(new long[]{0x0000341000100100L});
    public static final BitSet FOLLOW_conjunction_in_synpred13_SQLGrammar746 = new BitSet(new long[]{0x0000000000000002L});

}