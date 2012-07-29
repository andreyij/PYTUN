// $ANTLR 3.4 D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g 2012-07-29 15:44:25

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALTER", "AND", "AS", "CHAR", "COLUMN_DEF_LIST", "CREATE", "CREATE_STMT", "DATE", "DELETE", "DELETE_STMT", "DIGIT", "DIV", "DROP", "DROP_STMT", "EQ", "EXPR_LIST", "FLOAT", "FROM", "GE", "GT", "IDENTIFIER", "INSERT", "INSERT_STMT", "INT", "INTO", "LE", "LETTER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NE", "NEWLINE", "OR", "PLUS", "REAL_LIT", "RPAREN", "SELECT", "SELECT_STMT", "SEMI", "SET", "STAR_TERM", "STRING_LIT", "TABLE", "TABLE_LIST", "TIME", "TIMESTAMP", "UPDATE", "UPDATE_ASSIGNMENTS", "UPDATE_STMT", "VALUES", "VARCHAR", "WHERE", "WHITESPACE", "','", "'.'"
    };

    public static final int EOF=-1;
    public static final int T__59=59;
    public static final int T__60=60;
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
    public static final int STAR_TERM=46;
    public static final int STRING_LIT=47;
    public static final int TABLE=48;
    public static final int TABLE_LIST=49;
    public static final int TIME=50;
    public static final int TIMESTAMP=51;
    public static final int UPDATE=52;
    public static final int UPDATE_ASSIGNMENTS=53;
    public static final int UPDATE_STMT=54;
    public static final int VALUES=55;
    public static final int VARCHAR=56;
    public static final int WHERE=57;
    public static final int WHITESPACE=58;

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:55:1: query : sql_statement SEMI ;
    public final SQLGrammarParser.query_return query() throws RecognitionException {
        SQLGrammarParser.query_return retval = new SQLGrammarParser.query_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SEMI2=null;
        SQLGrammarParser.sql_statement_return sql_statement1 =null;


        CommonTree SEMI2_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:56:3: ( sql_statement SEMI )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:57:3: sql_statement SEMI
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_sql_statement_in_query342);
            sql_statement1=sql_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sql_statement1.getTree());

            SEMI2=(Token)match(input,SEMI,FOLLOW_SEMI_in_query344); if (state.failed) return retval;
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:60:1: sql_statement : ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement );
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:61:3: ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement )
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:62:3: select_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_select_statement_in_sql_statement359);
                    select_statement3=select_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, select_statement3.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:63:5: update_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_update_statement_in_sql_statement365);
                    update_statement4=update_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, update_statement4.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:64:5: insert_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_insert_statement_in_sql_statement371);
                    insert_statement5=insert_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, insert_statement5.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:65:5: delete_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_delete_statement_in_sql_statement377);
                    delete_statement6=delete_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delete_statement6.getTree());

                    }
                    break;
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:66:5: create_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_create_statement_in_sql_statement383);
                    create_statement7=create_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, create_statement7.getTree());

                    }
                    break;
                case 6 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:67:5: drop_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_drop_statement_in_sql_statement389);
                    drop_statement8=drop_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, drop_statement8.getTree());

                    }
                    break;
                case 7 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:68:5: alter_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_alter_statement_in_sql_statement395);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:71:1: select_statement : SELECT expression_list FROM table_spec_list ( where_clause )? -> ^( SELECT_STMT expression_list table_spec_list ( where_clause )? ) ;
    public final SQLGrammarParser.select_statement_return select_statement() throws RecognitionException {
        SQLGrammarParser.select_statement_return retval = new SQLGrammarParser.select_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SELECT10=null;
        Token FROM12=null;
        SQLGrammarParser.expression_list_return expression_list11 =null;

        SQLGrammarParser.table_spec_list_return table_spec_list13 =null;

        SQLGrammarParser.where_clause_return where_clause14 =null;


        CommonTree SELECT10_tree=null;
        CommonTree FROM12_tree=null;
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleSubtreeStream stream_table_spec_list=new RewriteRuleSubtreeStream(adaptor,"rule table_spec_list");
        RewriteRuleSubtreeStream stream_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule expression_list");
        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:72:3: ( SELECT expression_list FROM table_spec_list ( where_clause )? -> ^( SELECT_STMT expression_list table_spec_list ( where_clause )? ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:73:3: SELECT expression_list FROM table_spec_list ( where_clause )?
            {
            SELECT10=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_statement410); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SELECT.add(SELECT10);


            pushFollow(FOLLOW_expression_list_in_select_statement412);
            expression_list11=expression_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression_list.add(expression_list11.getTree());

            FROM12=(Token)match(input,FROM,FOLLOW_FROM_in_select_statement414); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FROM.add(FROM12);


            pushFollow(FOLLOW_table_spec_list_in_select_statement416);
            table_spec_list13=table_spec_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table_spec_list.add(table_spec_list13.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:73:47: ( where_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WHERE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:73:48: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_select_statement419);
                    where_clause14=where_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_where_clause.add(where_clause14.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: expression_list, table_spec_list, where_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 74:5: -> ^( SELECT_STMT expression_list table_spec_list ( where_clause )? )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:75:7: ^( SELECT_STMT expression_list table_spec_list ( where_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SELECT_STMT, "SELECT_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_expression_list.nextTree());

                adaptor.addChild(root_1, stream_table_spec_list.nextTree());

                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:75:53: ( where_clause )?
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:78:1: update_statement : UPDATE identifier SET assignment_list ( where_clause )? -> ^( UPDATE_STMT identifier assignment_list ( where_clause )? ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:79:3: ( UPDATE identifier SET assignment_list ( where_clause )? -> ^( UPDATE_STMT identifier assignment_list ( where_clause )? ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:80:3: UPDATE identifier SET assignment_list ( where_clause )?
            {
            UPDATE15=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_statement459); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE15);


            pushFollow(FOLLOW_identifier_in_update_statement461);
            identifier16=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier16.getTree());

            SET17=(Token)match(input,SET,FOLLOW_SET_in_update_statement463); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(SET17);


            pushFollow(FOLLOW_assignment_list_in_update_statement465);
            assignment_list18=assignment_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment_list.add(assignment_list18.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:80:41: ( where_clause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WHERE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:80:41: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_update_statement467);
                    where_clause19=where_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_where_clause.add(where_clause19.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: where_clause, assignment_list, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 81:5: -> ^( UPDATE_STMT identifier assignment_list ( where_clause )? )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:82:7: ^( UPDATE_STMT identifier assignment_list ( where_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(UPDATE_STMT, "UPDATE_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_assignment_list.nextTree());

                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:82:48: ( where_clause )?
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:85:1: insert_statement : INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN -> ^( INSERT_STMT identifier identifier_list expression_list ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:86:3: ( INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN -> ^( INSERT_STMT identifier identifier_list expression_list ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:87:3: INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN
            {
            INSERT20=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_statement506); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INSERT.add(INSERT20);


            INTO21=(Token)match(input,INTO,FOLLOW_INTO_in_insert_statement508); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTO.add(INTO21);


            pushFollow(FOLLOW_identifier_in_insert_statement510);
            identifier22=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier22.getTree());

            LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_statement512); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN23);


            pushFollow(FOLLOW_identifier_list_in_insert_statement514);
            identifier_list24=identifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier_list.add(identifier_list24.getTree());

            RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_statement516); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN25);


            VALUES26=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_statement518); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VALUES.add(VALUES26);


            LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_statement520); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN27);


            pushFollow(FOLLOW_expression_list_in_insert_statement522);
            expression_list28=expression_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression_list.add(expression_list28.getTree());

            RPAREN29=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_statement524); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN29);


            // AST REWRITE
            // elements: expression_list, identifier_list, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 88:4: -> ^( INSERT_STMT identifier identifier_list expression_list )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:89:5: ^( INSERT_STMT identifier identifier_list expression_list )
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:92:1: delete_statement : DELETE FROM identifier ( where_clause )? -> ^( DELETE_STMT identifier ( where_clause )? ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:93:3: ( DELETE FROM identifier ( where_clause )? -> ^( DELETE_STMT identifier ( where_clause )? ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:94:3: DELETE FROM identifier ( where_clause )?
            {
            DELETE30=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_statement559); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DELETE.add(DELETE30);


            FROM31=(Token)match(input,FROM,FOLLOW_FROM_in_delete_statement561); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FROM.add(FROM31);


            pushFollow(FOLLOW_identifier_in_delete_statement563);
            identifier32=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier32.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:94:26: ( where_clause )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==WHERE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:94:26: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_delete_statement565);
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
            // 95:5: -> ^( DELETE_STMT identifier ( where_clause )? )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:95:8: ^( DELETE_STMT identifier ( where_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DELETE_STMT, "DELETE_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:95:33: ( where_clause )?
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:98:1: create_statement : CREATE TABLE identifier LPAREN table_columns_def RPAREN -> ^( CREATE_STMT identifier table_columns_def ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:99:3: ( CREATE TABLE identifier LPAREN table_columns_def RPAREN -> ^( CREATE_STMT identifier table_columns_def ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:100:3: CREATE TABLE identifier LPAREN table_columns_def RPAREN
            {
            CREATE34=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_statement596); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE34);


            TABLE35=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_statement598); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TABLE.add(TABLE35);


            pushFollow(FOLLOW_identifier_in_create_statement600);
            identifier36=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier36.getTree());

            LPAREN37=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_statement602); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN37);


            pushFollow(FOLLOW_table_columns_def_in_create_statement604);
            table_columns_def38=table_columns_def();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table_columns_def.add(table_columns_def38.getTree());

            RPAREN39=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_statement606); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN39);


            // AST REWRITE
            // elements: table_columns_def, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 101:5: -> ^( CREATE_STMT identifier table_columns_def )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:102:5: ^( CREATE_STMT identifier table_columns_def )
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:105:1: drop_statement : DROP TABLE identifier -> ^( DROP_STMT identifier ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:106:3: ( DROP TABLE identifier -> ^( DROP_STMT identifier ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:107:3: DROP TABLE identifier
            {
            DROP40=(Token)match(input,DROP,FOLLOW_DROP_in_drop_statement639); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DROP.add(DROP40);


            TABLE41=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_statement641); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TABLE.add(TABLE41);


            pushFollow(FOLLOW_identifier_in_drop_statement643);
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
            // 108:5: -> ^( DROP_STMT identifier )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:109:5: ^( DROP_STMT identifier )
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:112:1: alter_statement : ALTER ;
    public final SQLGrammarParser.alter_statement_return alter_statement() throws RecognitionException {
        SQLGrammarParser.alter_statement_return retval = new SQLGrammarParser.alter_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ALTER43=null;

        CommonTree ALTER43_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:113:3: ( ALTER )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:114:3: ALTER
            {
            root_0 = (CommonTree)adaptor.nil();


            ALTER43=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_statement674); if (state.failed) return retval;
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:117:1: table_columns_def : table_column_def ( ',' table_column_def )* -> ^( COLUMN_DEF_LIST ( table_column_def )+ ) ;
    public final SQLGrammarParser.table_columns_def_return table_columns_def() throws RecognitionException {
        SQLGrammarParser.table_columns_def_return retval = new SQLGrammarParser.table_columns_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal45=null;
        SQLGrammarParser.table_column_def_return table_column_def44 =null;

        SQLGrammarParser.table_column_def_return table_column_def46 =null;


        CommonTree char_literal45_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleSubtreeStream stream_table_column_def=new RewriteRuleSubtreeStream(adaptor,"rule table_column_def");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:118:3: ( table_column_def ( ',' table_column_def )* -> ^( COLUMN_DEF_LIST ( table_column_def )+ ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:118:5: table_column_def ( ',' table_column_def )*
            {
            pushFollow(FOLLOW_table_column_def_in_table_columns_def687);
            table_column_def44=table_column_def();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table_column_def.add(table_column_def44.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:118:22: ( ',' table_column_def )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==59) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:118:23: ',' table_column_def
            	    {
            	    char_literal45=(Token)match(input,59,FOLLOW_59_in_table_columns_def690); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_59.add(char_literal45);


            	    pushFollow(FOLLOW_table_column_def_in_table_columns_def692);
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
            // 119:5: -> ^( COLUMN_DEF_LIST ( table_column_def )+ )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:119:8: ^( COLUMN_DEF_LIST ( table_column_def )+ )
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:122:1: table_column_def : identifier type_specifier ;
    public final SQLGrammarParser.table_column_def_return table_column_def() throws RecognitionException {
        SQLGrammarParser.table_column_def_return retval = new SQLGrammarParser.table_column_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SQLGrammarParser.identifier_return identifier47 =null;

        SQLGrammarParser.type_specifier_return type_specifier48 =null;



        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:123:3: ( identifier type_specifier )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:123:5: identifier type_specifier
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_table_column_def721);
            identifier47=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier47.getTree());

            pushFollow(FOLLOW_type_specifier_in_table_column_def723);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:126:1: type_specifier : ( INT | FLOAT | CHAR LPAREN number_value RPAREN | VARCHAR LPAREN number_value RPAREN | DATE | TIME | TIMESTAMP );
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:127:3: ( INT | FLOAT | CHAR LPAREN number_value RPAREN | VARCHAR LPAREN number_value RPAREN | DATE | TIME | TIMESTAMP )
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:127:5: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT49=(Token)match(input,INT,FOLLOW_INT_in_type_specifier736); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT49_tree = 
                    (CommonTree)adaptor.create(INT49)
                    ;
                    adaptor.addChild(root_0, INT49_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:128:5: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FLOAT50=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier742); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT50_tree = 
                    (CommonTree)adaptor.create(FLOAT50)
                    ;
                    adaptor.addChild(root_0, FLOAT50_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:129:5: CHAR LPAREN number_value RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CHAR51=(Token)match(input,CHAR,FOLLOW_CHAR_in_type_specifier748); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR51_tree = 
                    (CommonTree)adaptor.create(CHAR51)
                    ;
                    adaptor.addChild(root_0, CHAR51_tree);
                    }

                    LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_specifier750); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN52_tree = 
                    (CommonTree)adaptor.create(LPAREN52)
                    ;
                    adaptor.addChild(root_0, LPAREN52_tree);
                    }

                    pushFollow(FOLLOW_number_value_in_type_specifier752);
                    number_value53=number_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_value53.getTree());

                    RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_specifier754); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN54_tree = 
                    (CommonTree)adaptor.create(RPAREN54)
                    ;
                    adaptor.addChild(root_0, RPAREN54_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:130:5: VARCHAR LPAREN number_value RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    VARCHAR55=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_type_specifier760); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VARCHAR55_tree = 
                    (CommonTree)adaptor.create(VARCHAR55)
                    ;
                    adaptor.addChild(root_0, VARCHAR55_tree);
                    }

                    LPAREN56=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_specifier762); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN56_tree = 
                    (CommonTree)adaptor.create(LPAREN56)
                    ;
                    adaptor.addChild(root_0, LPAREN56_tree);
                    }

                    pushFollow(FOLLOW_number_value_in_type_specifier764);
                    number_value57=number_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_value57.getTree());

                    RPAREN58=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_specifier766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN58_tree = 
                    (CommonTree)adaptor.create(RPAREN58)
                    ;
                    adaptor.addChild(root_0, RPAREN58_tree);
                    }

                    }
                    break;
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:131:5: DATE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DATE59=(Token)match(input,DATE,FOLLOW_DATE_in_type_specifier772); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATE59_tree = 
                    (CommonTree)adaptor.create(DATE59)
                    ;
                    adaptor.addChild(root_0, DATE59_tree);
                    }

                    }
                    break;
                case 6 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:132:5: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TIME60=(Token)match(input,TIME,FOLLOW_TIME_in_type_specifier778); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME60_tree = 
                    (CommonTree)adaptor.create(TIME60)
                    ;
                    adaptor.addChild(root_0, TIME60_tree);
                    }

                    }
                    break;
                case 7 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:133:5: TIMESTAMP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TIMESTAMP61=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_type_specifier784); if (state.failed) return retval;
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:136:1: expression_list : expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) ;
    public final SQLGrammarParser.expression_list_return expression_list() throws RecognitionException {
        SQLGrammarParser.expression_list_return retval = new SQLGrammarParser.expression_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal63=null;
        SQLGrammarParser.expr_return expr62 =null;

        SQLGrammarParser.expr_return expr64 =null;


        CommonTree char_literal63_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:137:3: ( expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:138:3: expr ( ',' expr )*
            {
            pushFollow(FOLLOW_expr_in_expression_list799);
            expr62=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr62.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:138:8: ( ',' expr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==59) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:138:9: ',' expr
            	    {
            	    char_literal63=(Token)match(input,59,FOLLOW_59_in_expression_list802); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_59.add(char_literal63);


            	    pushFollow(FOLLOW_expr_in_expression_list804);
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
            // 139:5: -> ^( EXPR_LIST ( expr )+ )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:140:7: ^( EXPR_LIST ( expr )+ )
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


    public static class table_spec_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_spec_list"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:143:1: table_spec_list : table_spec ( ',' table_spec )* -> ( table_spec )+ ;
    public final SQLGrammarParser.table_spec_list_return table_spec_list() throws RecognitionException {
        SQLGrammarParser.table_spec_list_return retval = new SQLGrammarParser.table_spec_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal66=null;
        SQLGrammarParser.table_spec_return table_spec65 =null;

        SQLGrammarParser.table_spec_return table_spec67 =null;


        CommonTree char_literal66_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleSubtreeStream stream_table_spec=new RewriteRuleSubtreeStream(adaptor,"rule table_spec");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:144:3: ( table_spec ( ',' table_spec )* -> ( table_spec )+ )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:144:5: table_spec ( ',' table_spec )*
            {
            pushFollow(FOLLOW_table_spec_in_table_spec_list838);
            table_spec65=table_spec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table_spec.add(table_spec65.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:144:16: ( ',' table_spec )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==59) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:144:17: ',' table_spec
            	    {
            	    char_literal66=(Token)match(input,59,FOLLOW_59_in_table_spec_list841); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_59.add(char_literal66);


            	    pushFollow(FOLLOW_table_spec_in_table_spec_list843);
            	    table_spec67=table_spec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_table_spec.add(table_spec67.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // AST REWRITE
            // elements: table_spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 145:5: -> ( table_spec )+
            {
                if ( !(stream_table_spec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_table_spec.hasNext() ) {
                    adaptor.addChild(root_0, stream_table_spec.nextTree());

                }
                stream_table_spec.reset();

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
    // $ANTLR end "table_spec_list"


    public static class table_spec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_spec"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:148:1: table_spec : ( identifier ( AS )? identifier -> ^( identifier identifier ) | identifier );
    public final SQLGrammarParser.table_spec_return table_spec() throws RecognitionException {
        SQLGrammarParser.table_spec_return retval = new SQLGrammarParser.table_spec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AS69=null;
        SQLGrammarParser.identifier_return identifier68 =null;

        SQLGrammarParser.identifier_return identifier70 =null;

        SQLGrammarParser.identifier_return identifier71 =null;


        CommonTree AS69_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:149:3: ( identifier ( AS )? identifier -> ^( identifier identifier ) | identifier )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IDENTIFIER) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==AS||LA10_1==IDENTIFIER) ) {
                    alt10=1;
                }
                else if ( (LA10_1==EOF||LA10_1==SEMI||LA10_1==WHERE||LA10_1==59) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:149:5: identifier ( AS )? identifier
                    {
                    pushFollow(FOLLOW_identifier_in_table_spec867);
                    identifier68=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier68.getTree());

                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:149:16: ( AS )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==AS) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:149:16: AS
                            {
                            AS69=(Token)match(input,AS,FOLLOW_AS_in_table_spec869); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_AS.add(AS69);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_identifier_in_table_spec872);
                    identifier70=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier70.getTree());

                    // AST REWRITE
                    // elements: identifier, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 150:5: -> ^( identifier identifier )
                    {
                        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:150:8: ^( identifier identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_identifier.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:151:5: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_table_spec890);
                    identifier71=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier71.getTree());

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
    // $ANTLR end "table_spec"


    public static class identifier_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier_list"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:154:1: identifier_list : identifier ( ',' ! identifier )* ;
    public final SQLGrammarParser.identifier_list_return identifier_list() throws RecognitionException {
        SQLGrammarParser.identifier_list_return retval = new SQLGrammarParser.identifier_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal73=null;
        SQLGrammarParser.identifier_return identifier72 =null;

        SQLGrammarParser.identifier_return identifier74 =null;


        CommonTree char_literal73_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:155:3: ( identifier ( ',' ! identifier )* )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:156:3: identifier ( ',' ! identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_identifier_list905);
            identifier72=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier72.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:156:14: ( ',' ! identifier )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==59) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:156:15: ',' ! identifier
            	    {
            	    char_literal73=(Token)match(input,59,FOLLOW_59_in_identifier_list908); if (state.failed) return retval;

            	    pushFollow(FOLLOW_identifier_in_identifier_list911);
            	    identifier74=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier74.getTree());

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
    // $ANTLR end "identifier_list"


    public static class where_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "where_clause"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:159:1: where_clause : WHERE disjunction -> ^( WHERE disjunction ) ;
    public final SQLGrammarParser.where_clause_return where_clause() throws RecognitionException {
        SQLGrammarParser.where_clause_return retval = new SQLGrammarParser.where_clause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WHERE75=null;
        SQLGrammarParser.disjunction_return disjunction76 =null;


        CommonTree WHERE75_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_disjunction=new RewriteRuleSubtreeStream(adaptor,"rule disjunction");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:160:3: ( WHERE disjunction -> ^( WHERE disjunction ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:161:3: WHERE disjunction
            {
            WHERE75=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause928); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHERE.add(WHERE75);


            pushFollow(FOLLOW_disjunction_in_where_clause930);
            disjunction76=disjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_disjunction.add(disjunction76.getTree());

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
            // 162:5: -> ^( WHERE disjunction )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:163:7: ^( WHERE disjunction )
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:166:1: disjunction : conjunction ( OR ^ disjunction )* ;
    public final SQLGrammarParser.disjunction_return disjunction() throws RecognitionException {
        SQLGrammarParser.disjunction_return retval = new SQLGrammarParser.disjunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR78=null;
        SQLGrammarParser.conjunction_return conjunction77 =null;

        SQLGrammarParser.disjunction_return disjunction79 =null;


        CommonTree OR78_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:167:3: ( conjunction ( OR ^ disjunction )* )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:168:3: conjunction ( OR ^ disjunction )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conjunction_in_disjunction963);
            conjunction77=conjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction77.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:168:15: ( OR ^ disjunction )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==OR) ) {
                    int LA12_3 = input.LA(2);

                    if ( (synpred22_SQLGrammar()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:168:16: OR ^ disjunction
            	    {
            	    OR78=(Token)match(input,OR,FOLLOW_OR_in_disjunction966); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR78_tree = 
            	    (CommonTree)adaptor.create(OR78)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR78_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_disjunction_in_disjunction969);
            	    disjunction79=disjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, disjunction79.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:171:1: conjunction : predicate ( AND ^ conjunction )* ;
    public final SQLGrammarParser.conjunction_return conjunction() throws RecognitionException {
        SQLGrammarParser.conjunction_return retval = new SQLGrammarParser.conjunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND81=null;
        SQLGrammarParser.predicate_return predicate80 =null;

        SQLGrammarParser.conjunction_return conjunction82 =null;


        CommonTree AND81_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:172:3: ( predicate ( AND ^ conjunction )* )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:173:3: predicate ( AND ^ conjunction )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_predicate_in_conjunction986);
            predicate80=predicate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate80.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:173:13: ( AND ^ conjunction )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==AND) ) {
                    int LA13_4 = input.LA(2);

                    if ( (synpred23_SQLGrammar()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:173:14: AND ^ conjunction
            	    {
            	    AND81=(Token)match(input,AND,FOLLOW_AND_in_conjunction989); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND81_tree = 
            	    (CommonTree)adaptor.create(AND81)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND81_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_conjunction_in_conjunction992);
            	    conjunction82=conjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction82.getTree());

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
    // $ANTLR end "conjunction"


    public static class predicate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicate"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:176:1: predicate : expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr ;
    public final SQLGrammarParser.predicate_return predicate() throws RecognitionException {
        SQLGrammarParser.predicate_return retval = new SQLGrammarParser.predicate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ84=null;
        Token LT85=null;
        Token GT86=null;
        Token GE87=null;
        Token LE88=null;
        Token NE89=null;
        SQLGrammarParser.expr_return expr83 =null;

        SQLGrammarParser.expr_return expr90 =null;


        CommonTree EQ84_tree=null;
        CommonTree LT85_tree=null;
        CommonTree GT86_tree=null;
        CommonTree GE87_tree=null;
        CommonTree LE88_tree=null;
        CommonTree NE89_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:177:3: ( expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:178:3: expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_predicate1009);
            expr83=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr83.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:178:8: ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^)
            int alt14=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt14=1;
                }
                break;
            case LT:
                {
                alt14=2;
                }
                break;
            case GT:
                {
                alt14=3;
                }
                break;
            case GE:
                {
                alt14=4;
                }
                break;
            case LE:
                {
                alt14=5;
                }
                break;
            case NE:
                {
                alt14=6;
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:178:9: EQ ^
                    {
                    EQ84=(Token)match(input,EQ,FOLLOW_EQ_in_predicate1012); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ84_tree = 
                    (CommonTree)adaptor.create(EQ84)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(EQ84_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:178:15: LT ^
                    {
                    LT85=(Token)match(input,LT,FOLLOW_LT_in_predicate1017); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT85_tree = 
                    (CommonTree)adaptor.create(LT85)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(LT85_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:178:21: GT ^
                    {
                    GT86=(Token)match(input,GT,FOLLOW_GT_in_predicate1022); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GT86_tree = 
                    (CommonTree)adaptor.create(GT86)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(GT86_tree, root_0);
                    }

                    }
                    break;
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:178:27: GE ^
                    {
                    GE87=(Token)match(input,GE,FOLLOW_GE_in_predicate1027); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GE87_tree = 
                    (CommonTree)adaptor.create(GE87)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(GE87_tree, root_0);
                    }

                    }
                    break;
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:178:33: LE ^
                    {
                    LE88=(Token)match(input,LE,FOLLOW_LE_in_predicate1032); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LE88_tree = 
                    (CommonTree)adaptor.create(LE88)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(LE88_tree, root_0);
                    }

                    }
                    break;
                case 6 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:178:39: NE ^
                    {
                    NE89=(Token)match(input,NE,FOLLOW_NE_in_predicate1037); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NE89_tree = 
                    (CommonTree)adaptor.create(NE89)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(NE89_tree, root_0);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_predicate1042);
            expr90=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr90.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:181:1: expr : ( ( identifier '.' )? '*' -> ^( STAR_TERM ( identifier )? ) | simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )* );
    public final SQLGrammarParser.expr_return expr() throws RecognitionException {
        SQLGrammarParser.expr_return retval = new SQLGrammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal92=null;
        Token char_literal93=null;
        Token PLUS95=null;
        Token MINUS96=null;
        SQLGrammarParser.identifier_return identifier91 =null;

        SQLGrammarParser.simpleExpression_return simpleExpression94 =null;

        SQLGrammarParser.simpleExpression_return simpleExpression97 =null;


        CommonTree char_literal92_tree=null;
        CommonTree char_literal93_tree=null;
        CommonTree PLUS95_tree=null;
        CommonTree MINUS96_tree=null;
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:182:3: ( ( identifier '.' )? '*' -> ^( STAR_TERM ( identifier )? ) | simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )* )
            int alt18=2;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==60) ) {
                    int LA18_8 = input.LA(3);

                    if ( (synpred30_SQLGrammar()) ) {
                        alt18=1;
                    }
                    else if ( (true) ) {
                        alt18=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 8, input);

                        throw nvae;

                    }
                }
                else if ( (LA18_1==EOF||LA18_1==AND||LA18_1==DIV||LA18_1==EQ||(LA18_1 >= FROM && LA18_1 <= GT)||LA18_1==LE||(LA18_1 >= LT && LA18_1 <= NE)||(LA18_1 >= OR && LA18_1 <= PLUS)||LA18_1==RPAREN||LA18_1==SEMI||LA18_1==WHERE||LA18_1==59) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
                }
                break;
            case MUL:
                {
                alt18=1;
                }
                break;
            case DATE:
            case REAL_LIT:
            case STRING_LIT:
            case TIME:
            case TIMESTAMP:
                {
                alt18=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:182:5: ( identifier '.' )? '*'
                    {
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:182:5: ( identifier '.' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==IDENTIFIER) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:182:6: identifier '.'
                            {
                            pushFollow(FOLLOW_identifier_in_expr1056);
                            identifier91=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier91.getTree());

                            char_literal92=(Token)match(input,60,FOLLOW_60_in_expr1058); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_60.add(char_literal92);


                            }
                            break;

                    }


                    char_literal93=(Token)match(input,MUL,FOLLOW_MUL_in_expr1062); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MUL.add(char_literal93);


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
                    // 183:5: -> ^( STAR_TERM ( identifier )? )
                    {
                        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:183:8: ^( STAR_TERM ( identifier )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(STAR_TERM, "STAR_TERM")
                        , root_1);

                        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:183:20: ( identifier )?
                        if ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:184:5: simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simpleExpression_in_expr1081);
                    simpleExpression94=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression94.getTree());

                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:184:22: ( ( PLUS ^| MINUS ^) simpleExpression )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==MINUS||LA17_0==PLUS) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:184:23: ( PLUS ^| MINUS ^) simpleExpression
                    	    {
                    	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:184:23: ( PLUS ^| MINUS ^)
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0==PLUS) ) {
                    	        alt16=1;
                    	    }
                    	    else if ( (LA16_0==MINUS) ) {
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
                    	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:184:24: PLUS ^
                    	            {
                    	            PLUS95=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr1085); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            PLUS95_tree = 
                    	            (CommonTree)adaptor.create(PLUS95)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS95_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:184:32: MINUS ^
                    	            {
                    	            MINUS96=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr1090); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            MINUS96_tree = 
                    	            (CommonTree)adaptor.create(MINUS96)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS96_tree, root_0);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_simpleExpression_in_expr1094);
                    	    simpleExpression97=simpleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression97.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


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
    // $ANTLR end "expr"


    public static class simpleExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleExpression"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:187:1: simpleExpression : term ( ( MUL ^| DIV ^| MOD ^) term )* ;
    public final SQLGrammarParser.simpleExpression_return simpleExpression() throws RecognitionException {
        SQLGrammarParser.simpleExpression_return retval = new SQLGrammarParser.simpleExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MUL99=null;
        Token DIV100=null;
        Token MOD101=null;
        SQLGrammarParser.term_return term98 =null;

        SQLGrammarParser.term_return term102 =null;


        CommonTree MUL99_tree=null;
        CommonTree DIV100_tree=null;
        CommonTree MOD101_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:188:3: ( term ( ( MUL ^| DIV ^| MOD ^) term )* )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:189:3: term ( ( MUL ^| DIV ^| MOD ^) term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_simpleExpression1111);
            term98=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term98.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:189:8: ( ( MUL ^| DIV ^| MOD ^) term )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==DIV||(LA20_0 >= MOD && LA20_0 <= MUL)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:189:9: ( MUL ^| DIV ^| MOD ^) term
            	    {
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:189:9: ( MUL ^| DIV ^| MOD ^)
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:189:10: MUL ^
            	            {
            	            MUL99=(Token)match(input,MUL,FOLLOW_MUL_in_simpleExpression1115); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MUL99_tree = 
            	            (CommonTree)adaptor.create(MUL99)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MUL99_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:189:17: DIV ^
            	            {
            	            DIV100=(Token)match(input,DIV,FOLLOW_DIV_in_simpleExpression1120); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DIV100_tree = 
            	            (CommonTree)adaptor.create(DIV100)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIV100_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:189:24: MOD ^
            	            {
            	            MOD101=(Token)match(input,MOD,FOLLOW_MOD_in_simpleExpression1125); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MOD101_tree = 
            	            (CommonTree)adaptor.create(MOD101)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MOD101_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_simpleExpression1129);
            	    term102=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term102.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:192:1: term : ( column_identifier | value );
    public final SQLGrammarParser.term_return term() throws RecognitionException {
        SQLGrammarParser.term_return retval = new SQLGrammarParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SQLGrammarParser.column_identifier_return column_identifier103 =null;

        SQLGrammarParser.value_return value104 =null;



        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:193:3: ( column_identifier | value )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==IDENTIFIER) ) {
                alt21=1;
            }
            else if ( (LA21_0==DATE||LA21_0==REAL_LIT||LA21_0==STRING_LIT||(LA21_0 >= TIME && LA21_0 <= TIMESTAMP)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:193:5: column_identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_column_identifier_in_term1144);
                    column_identifier103=column_identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, column_identifier103.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:194:5: value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_value_in_term1150);
                    value104=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value104.getTree());

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


    public static class column_identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_identifier"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:197:1: column_identifier : ( identifier '.' identifier -> ^( identifier identifier ) | identifier );
    public final SQLGrammarParser.column_identifier_return column_identifier() throws RecognitionException {
        SQLGrammarParser.column_identifier_return retval = new SQLGrammarParser.column_identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal106=null;
        SQLGrammarParser.identifier_return identifier105 =null;

        SQLGrammarParser.identifier_return identifier107 =null;

        SQLGrammarParser.identifier_return identifier108 =null;


        CommonTree char_literal106_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:198:3: ( identifier '.' identifier -> ^( identifier identifier ) | identifier )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDENTIFIER) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==60) ) {
                    alt22=1;
                }
                else if ( (LA22_1==EOF||LA22_1==AND||LA22_1==DIV||LA22_1==EQ||(LA22_1 >= FROM && LA22_1 <= GT)||LA22_1==LE||(LA22_1 >= LT && LA22_1 <= NE)||(LA22_1 >= OR && LA22_1 <= PLUS)||LA22_1==RPAREN||LA22_1==SEMI||LA22_1==WHERE||LA22_1==59) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:198:5: identifier '.' identifier
                    {
                    pushFollow(FOLLOW_identifier_in_column_identifier1165);
                    identifier105=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier105.getTree());

                    char_literal106=(Token)match(input,60,FOLLOW_60_in_column_identifier1167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(char_literal106);


                    pushFollow(FOLLOW_identifier_in_column_identifier1169);
                    identifier107=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier107.getTree());

                    // AST REWRITE
                    // elements: identifier, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 199:5: -> ^( identifier identifier )
                    {
                        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:199:8: ^( identifier identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_identifier.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:200:5: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_column_identifier1187);
                    identifier108=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier108.getTree());

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
    // $ANTLR end "column_identifier"


    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:203:1: value : ( number_value | string_value | date_value | time_value | timestamp_value );
    public final SQLGrammarParser.value_return value() throws RecognitionException {
        SQLGrammarParser.value_return retval = new SQLGrammarParser.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SQLGrammarParser.number_value_return number_value109 =null;

        SQLGrammarParser.string_value_return string_value110 =null;

        SQLGrammarParser.date_value_return date_value111 =null;

        SQLGrammarParser.time_value_return time_value112 =null;

        SQLGrammarParser.timestamp_value_return timestamp_value113 =null;



        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:204:3: ( number_value | string_value | date_value | time_value | timestamp_value )
            int alt23=5;
            switch ( input.LA(1) ) {
            case REAL_LIT:
                {
                alt23=1;
                }
                break;
            case STRING_LIT:
                {
                alt23=2;
                }
                break;
            case DATE:
                {
                alt23=3;
                }
                break;
            case TIME:
                {
                alt23=4;
                }
                break;
            case TIMESTAMP:
                {
                alt23=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:205:3: number_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_number_value_in_value1202);
                    number_value109=number_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_value109.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:206:5: string_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_string_value_in_value1208);
                    string_value110=string_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value110.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:207:5: date_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_date_value_in_value1214);
                    date_value111=date_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, date_value111.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:208:5: time_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_time_value_in_value1220);
                    time_value112=time_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, time_value112.getTree());

                    }
                    break;
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:209:5: timestamp_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timestamp_value_in_value1226);
                    timestamp_value113=timestamp_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_value113.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:213:1: number_value : REAL_LIT ;
    public final SQLGrammarParser.number_value_return number_value() throws RecognitionException {
        SQLGrammarParser.number_value_return retval = new SQLGrammarParser.number_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token REAL_LIT114=null;

        CommonTree REAL_LIT114_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:214:3: ( REAL_LIT )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:215:3: REAL_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            REAL_LIT114=(Token)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_number_value1242); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LIT114_tree = 
            (CommonTree)adaptor.create(REAL_LIT114)
            ;
            adaptor.addChild(root_0, REAL_LIT114_tree);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:218:1: string_value : STRING_LIT ;
    public final SQLGrammarParser.string_value_return string_value() throws RecognitionException {
        SQLGrammarParser.string_value_return retval = new SQLGrammarParser.string_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING_LIT115=null;

        CommonTree STRING_LIT115_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:219:3: ( STRING_LIT )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:220:3: STRING_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            STRING_LIT115=(Token)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_string_value1257); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LIT115_tree = 
            (CommonTree)adaptor.create(STRING_LIT115)
            ;
            adaptor.addChild(root_0, STRING_LIT115_tree);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:223:1: date_value : DATE string_value ;
    public final SQLGrammarParser.date_value_return date_value() throws RecognitionException {
        SQLGrammarParser.date_value_return retval = new SQLGrammarParser.date_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DATE116=null;
        SQLGrammarParser.string_value_return string_value117 =null;


        CommonTree DATE116_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:224:3: ( DATE string_value )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:225:3: DATE string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            DATE116=(Token)match(input,DATE,FOLLOW_DATE_in_date_value1272); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATE116_tree = 
            (CommonTree)adaptor.create(DATE116)
            ;
            adaptor.addChild(root_0, DATE116_tree);
            }

            pushFollow(FOLLOW_string_value_in_date_value1274);
            string_value117=string_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value117.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:228:1: time_value : TIME string_value ;
    public final SQLGrammarParser.time_value_return time_value() throws RecognitionException {
        SQLGrammarParser.time_value_return retval = new SQLGrammarParser.time_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TIME118=null;
        SQLGrammarParser.string_value_return string_value119 =null;


        CommonTree TIME118_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:229:3: ( TIME string_value )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:230:3: TIME string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            TIME118=(Token)match(input,TIME,FOLLOW_TIME_in_time_value1289); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIME118_tree = 
            (CommonTree)adaptor.create(TIME118)
            ;
            adaptor.addChild(root_0, TIME118_tree);
            }

            pushFollow(FOLLOW_string_value_in_time_value1291);
            string_value119=string_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value119.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:233:1: timestamp_value : TIMESTAMP string_value ;
    public final SQLGrammarParser.timestamp_value_return timestamp_value() throws RecognitionException {
        SQLGrammarParser.timestamp_value_return retval = new SQLGrammarParser.timestamp_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TIMESTAMP120=null;
        SQLGrammarParser.string_value_return string_value121 =null;


        CommonTree TIMESTAMP120_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:234:3: ( TIMESTAMP string_value )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:235:3: TIMESTAMP string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            TIMESTAMP120=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_timestamp_value1306); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIMESTAMP120_tree = 
            (CommonTree)adaptor.create(TIMESTAMP120)
            ;
            adaptor.addChild(root_0, TIMESTAMP120_tree);
            }

            pushFollow(FOLLOW_string_value_in_timestamp_value1308);
            string_value121=string_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value121.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:238:1: identifier : IDENTIFIER ;
    public final SQLGrammarParser.identifier_return identifier() throws RecognitionException {
        SQLGrammarParser.identifier_return retval = new SQLGrammarParser.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER122=null;

        CommonTree IDENTIFIER122_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:239:3: ( IDENTIFIER )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:240:3: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENTIFIER122=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier1323); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER122_tree = 
            (CommonTree)adaptor.create(IDENTIFIER122)
            ;
            adaptor.addChild(root_0, IDENTIFIER122_tree);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:243:1: assignment_list : assignment ( ',' assignment )* -> ^( UPDATE_ASSIGNMENTS ( assignment )+ ) ;
    public final SQLGrammarParser.assignment_list_return assignment_list() throws RecognitionException {
        SQLGrammarParser.assignment_list_return retval = new SQLGrammarParser.assignment_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal124=null;
        SQLGrammarParser.assignment_return assignment123 =null;

        SQLGrammarParser.assignment_return assignment125 =null;


        CommonTree char_literal124_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:244:3: ( assignment ( ',' assignment )* -> ^( UPDATE_ASSIGNMENTS ( assignment )+ ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:244:5: assignment ( ',' assignment )*
            {
            pushFollow(FOLLOW_assignment_in_assignment_list1336);
            assignment123=assignment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment.add(assignment123.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:244:16: ( ',' assignment )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==59) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:244:17: ',' assignment
            	    {
            	    char_literal124=(Token)match(input,59,FOLLOW_59_in_assignment_list1339); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_59.add(char_literal124);


            	    pushFollow(FOLLOW_assignment_in_assignment_list1341);
            	    assignment125=assignment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_assignment.add(assignment125.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
            // 244:34: -> ^( UPDATE_ASSIGNMENTS ( assignment )+ )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:244:37: ^( UPDATE_ASSIGNMENTS ( assignment )+ )
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:247:1: assignment : identifier EQ expr -> ^( EQ identifier expr ) ;
    public final SQLGrammarParser.assignment_return assignment() throws RecognitionException {
        SQLGrammarParser.assignment_return retval = new SQLGrammarParser.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ127=null;
        SQLGrammarParser.identifier_return identifier126 =null;

        SQLGrammarParser.expr_return expr128 =null;


        CommonTree EQ127_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:248:3: ( identifier EQ expr -> ^( EQ identifier expr ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:248:5: identifier EQ expr
            {
            pushFollow(FOLLOW_identifier_in_assignment1365);
            identifier126=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier126.getTree());

            EQ127=(Token)match(input,EQ,FOLLOW_EQ_in_assignment1367); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ127);


            pushFollow(FOLLOW_expr_in_assignment1369);
            expr128=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr128.getTree());

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
            // 248:24: -> ^( EQ identifier expr )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:248:27: ^( EQ identifier expr )
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

    // $ANTLR start synpred22_SQLGrammar
    public final void synpred22_SQLGrammar_fragment() throws RecognitionException {
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:168:16: ( OR disjunction )
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:168:16: OR disjunction
        {
        match(input,OR,FOLLOW_OR_in_synpred22_SQLGrammar966); if (state.failed) return ;

        pushFollow(FOLLOW_disjunction_in_synpred22_SQLGrammar969);
        disjunction();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_SQLGrammar

    // $ANTLR start synpred23_SQLGrammar
    public final void synpred23_SQLGrammar_fragment() throws RecognitionException {
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:173:14: ( AND conjunction )
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:173:14: AND conjunction
        {
        match(input,AND,FOLLOW_AND_in_synpred23_SQLGrammar989); if (state.failed) return ;

        pushFollow(FOLLOW_conjunction_in_synpred23_SQLGrammar992);
        conjunction();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred23_SQLGrammar

    // $ANTLR start synpred30_SQLGrammar
    public final void synpred30_SQLGrammar_fragment() throws RecognitionException {
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:182:5: ( ( identifier '.' )? '*' )
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:182:5: ( identifier '.' )? '*'
        {
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:182:5: ( identifier '.' )?
        int alt26=2;
        int LA26_0 = input.LA(1);

        if ( (LA26_0==IDENTIFIER) ) {
            alt26=1;
        }
        switch (alt26) {
            case 1 :
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:182:6: identifier '.'
                {
                pushFollow(FOLLOW_identifier_in_synpred30_SQLGrammar1056);
                identifier();

                state._fsp--;
                if (state.failed) return ;

                match(input,60,FOLLOW_60_in_synpred30_SQLGrammar1058); if (state.failed) return ;

                }
                break;

        }


        match(input,MUL,FOLLOW_MUL_in_synpred30_SQLGrammar1062); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred30_SQLGrammar

    // Delegated rules

    public final boolean synpred30_SQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_SQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_SQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_SQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_SQLGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_SQLGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_sql_statement_in_query342 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SEMI_in_query344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_sql_statement359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_sql_statement365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_sql_statement371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_sql_statement377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_statement_in_sql_statement383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_statement_in_sql_statement389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_statement_in_sql_statement395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement410 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_expression_list_in_select_statement412 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FROM_in_select_statement414 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_table_spec_list_in_select_statement416 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_where_clause_in_select_statement419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_statement459 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_identifier_in_update_statement461 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SET_in_update_statement463 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_assignment_list_in_update_statement465 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_where_clause_in_update_statement467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_statement506 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INTO_in_insert_statement508 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_identifier_in_insert_statement510 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_statement512 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_identifier_list_in_insert_statement514 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_statement516 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_statement518 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_statement520 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_expression_list_in_insert_statement522 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_statement524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_statement559 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FROM_in_delete_statement561 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_identifier_in_delete_statement563 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_where_clause_in_delete_statement565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_statement596 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TABLE_in_create_statement598 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_identifier_in_create_statement600 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_statement602 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_table_columns_def_in_create_statement604 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_statement606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_statement639 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_TABLE_in_drop_statement641 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_identifier_in_drop_statement643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_statement674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_column_def_in_table_columns_def687 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_table_columns_def690 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_table_column_def_in_table_columns_def692 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_identifier_in_table_column_def721 = new BitSet(new long[]{0x010C000008100880L});
    public static final BitSet FOLLOW_type_specifier_in_table_column_def723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type_specifier742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier748 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_specifier750 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_number_value_in_type_specifier752 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_specifier754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARCHAR_in_type_specifier760 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_specifier762 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_number_value_in_type_specifier764 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_specifier766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_type_specifier772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_type_specifier778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_type_specifier784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expression_list799 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_expression_list802 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_expr_in_expression_list804 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_table_spec_in_table_spec_list838 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_table_spec_list841 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_table_spec_in_table_spec_list843 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_identifier_in_table_spec867 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_AS_in_table_spec869 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_identifier_in_table_spec872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_table_spec890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list905 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_identifier_list908 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_list911 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clause928 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_disjunction_in_where_clause930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction963 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_OR_in_disjunction966 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_disjunction_in_disjunction969 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_predicate_in_conjunction986 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_conjunction989 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_conjunction_in_conjunction992 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_expr_in_predicate1009 = new BitSet(new long[]{0x0000001120C40000L});
    public static final BitSet FOLLOW_EQ_in_predicate1012 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_LT_in_predicate1017 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_GT_in_predicate1022 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_GE_in_predicate1027 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_LE_in_predicate1032 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_NE_in_predicate1037 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_expr_in_predicate1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_expr1056 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_expr1058 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_MUL_in_expr1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expr1081 = new BitSet(new long[]{0x0000008200000002L});
    public static final BitSet FOLLOW_PLUS_in_expr1085 = new BitSet(new long[]{0x000C810001000800L});
    public static final BitSet FOLLOW_MINUS_in_expr1090 = new BitSet(new long[]{0x000C810001000800L});
    public static final BitSet FOLLOW_simpleExpression_in_expr1094 = new BitSet(new long[]{0x0000008200000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression1111 = new BitSet(new long[]{0x0000000C00008002L});
    public static final BitSet FOLLOW_MUL_in_simpleExpression1115 = new BitSet(new long[]{0x000C810001000800L});
    public static final BitSet FOLLOW_DIV_in_simpleExpression1120 = new BitSet(new long[]{0x000C810001000800L});
    public static final BitSet FOLLOW_MOD_in_simpleExpression1125 = new BitSet(new long[]{0x000C810001000800L});
    public static final BitSet FOLLOW_term_in_simpleExpression1129 = new BitSet(new long[]{0x0000000C00008002L});
    public static final BitSet FOLLOW_column_identifier_in_term1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_column_identifier1165 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_column_identifier1167 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_identifier_in_column_identifier1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_column_identifier1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_value_in_value1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_value_in_value1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_value_in_value1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_value_in_value1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestamp_value_in_value1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_number_value1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LIT_in_string_value1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_date_value1272 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_string_value_in_date_value1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_time_value1289 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_string_value_in_time_value1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_timestamp_value1306 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_string_value_in_timestamp_value1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_assignment_list1336 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_assignment_list1339 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_assignment_in_assignment_list1341 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignment1365 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQ_in_assignment1367 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_expr_in_assignment1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred22_SQLGrammar966 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_disjunction_in_synpred22_SQLGrammar969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred23_SQLGrammar989 = new BitSet(new long[]{0x000C810801000800L});
    public static final BitSet FOLLOW_conjunction_in_synpred23_SQLGrammar992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_synpred30_SQLGrammar1056 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_synpred30_SQLGrammar1058 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_MUL_in_synpred30_SQLGrammar1062 = new BitSet(new long[]{0x0000000000000002L});

}