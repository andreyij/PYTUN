// $ANTLR 3.4 D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g 2012-07-23 18:41:02

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALTER", "AND", "CHAR", "COLUMN_DEF_LIST", "CREATE", "CREATE_STMT", "DATE", "DELETE", "DELETE_STMT", "DIGIT", "DIV", "DROP", "EQ", "EXPR_LIST", "FLOAT", "FROM", "GE", "GT", "IDENTIFIER", "INSERT", "INSERT_STMT", "INT", "INTO", "LE", "LETTER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NE", "NEWLINE", "OR", "PLUS", "REAL_LIT", "RPAREN", "SELECT", "SELECT_STMT", "SEMI", "SET", "STRING_LIT", "TABLE", "TABLE_LIST", "TIME", "TIMESTAMP", "UPDATE", "UPDATE_ASSIGNMENTS", "UPDATE_STMT", "VALUES", "VARCHAR", "WHERE", "WHITESPACE", "','"
    };

    public static final int EOF=-1;
    public static final int T__56=56;
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
    public static final int EQ=16;
    public static final int EXPR_LIST=17;
    public static final int FLOAT=18;
    public static final int FROM=19;
    public static final int GE=20;
    public static final int GT=21;
    public static final int IDENTIFIER=22;
    public static final int INSERT=23;
    public static final int INSERT_STMT=24;
    public static final int INT=25;
    public static final int INTO=26;
    public static final int LE=27;
    public static final int LETTER=28;
    public static final int LPAREN=29;
    public static final int LT=30;
    public static final int MINUS=31;
    public static final int MOD=32;
    public static final int MUL=33;
    public static final int NE=34;
    public static final int NEWLINE=35;
    public static final int OR=36;
    public static final int PLUS=37;
    public static final int REAL_LIT=38;
    public static final int RPAREN=39;
    public static final int SELECT=40;
    public static final int SELECT_STMT=41;
    public static final int SEMI=42;
    public static final int SET=43;
    public static final int STRING_LIT=44;
    public static final int TABLE=45;
    public static final int TABLE_LIST=46;
    public static final int TIME=47;
    public static final int TIMESTAMP=48;
    public static final int UPDATE=49;
    public static final int UPDATE_ASSIGNMENTS=50;
    public static final int UPDATE_STMT=51;
    public static final int VALUES=52;
    public static final int VARCHAR=53;
    public static final int WHERE=54;
    public static final int WHITESPACE=55;

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:53:1: query : sql_statement SEMI ;
    public final SQLGrammarParser.query_return query() throws RecognitionException {
        SQLGrammarParser.query_return retval = new SQLGrammarParser.query_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SEMI2=null;
        SQLGrammarParser.sql_statement_return sql_statement1 =null;


        CommonTree SEMI2_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:54:3: ( sql_statement SEMI )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:55:3: sql_statement SEMI
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_sql_statement_in_query332);
            sql_statement1=sql_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sql_statement1.getTree());

            SEMI2=(Token)match(input,SEMI,FOLLOW_SEMI_in_query334); if (state.failed) return retval;
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:58:1: sql_statement : ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement );
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:59:3: ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement )
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:60:3: select_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_select_statement_in_sql_statement349);
                    select_statement3=select_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, select_statement3.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:61:5: update_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_update_statement_in_sql_statement355);
                    update_statement4=update_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, update_statement4.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:62:5: insert_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_insert_statement_in_sql_statement361);
                    insert_statement5=insert_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, insert_statement5.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:63:5: delete_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_delete_statement_in_sql_statement367);
                    delete_statement6=delete_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delete_statement6.getTree());

                    }
                    break;
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:64:5: create_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_create_statement_in_sql_statement373);
                    create_statement7=create_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, create_statement7.getTree());

                    }
                    break;
                case 6 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:65:5: drop_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_drop_statement_in_sql_statement379);
                    drop_statement8=drop_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, drop_statement8.getTree());

                    }
                    break;
                case 7 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:66:5: alter_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_alter_statement_in_sql_statement385);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:69:1: select_statement : SELECT expression_list FROM identifier_list ( where_clause )? -> ^( SELECT_STMT expression_list identifier_list ( where_clause )? ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:70:3: ( SELECT expression_list FROM identifier_list ( where_clause )? -> ^( SELECT_STMT expression_list identifier_list ( where_clause )? ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:71:3: SELECT expression_list FROM identifier_list ( where_clause )?
            {
            SELECT10=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_statement400); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SELECT.add(SELECT10);


            pushFollow(FOLLOW_expression_list_in_select_statement402);
            expression_list11=expression_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression_list.add(expression_list11.getTree());

            FROM12=(Token)match(input,FROM,FOLLOW_FROM_in_select_statement404); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FROM.add(FROM12);


            pushFollow(FOLLOW_identifier_list_in_select_statement406);
            identifier_list13=identifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier_list.add(identifier_list13.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:71:47: ( where_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WHERE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:71:48: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_select_statement409);
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
            // 72:5: -> ^( SELECT_STMT expression_list identifier_list ( where_clause )? )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:73:7: ^( SELECT_STMT expression_list identifier_list ( where_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SELECT_STMT, "SELECT_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_expression_list.nextTree());

                adaptor.addChild(root_1, stream_identifier_list.nextTree());

                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:73:53: ( where_clause )?
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:76:1: update_statement : UPDATE identifier SET assignment_list ( where_clause )? -> ^( UPDATE_STMT identifier assignment_list ( where_clause )? ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:77:3: ( UPDATE identifier SET assignment_list ( where_clause )? -> ^( UPDATE_STMT identifier assignment_list ( where_clause )? ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:78:3: UPDATE identifier SET assignment_list ( where_clause )?
            {
            UPDATE15=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_statement449); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE15);


            pushFollow(FOLLOW_identifier_in_update_statement451);
            identifier16=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier16.getTree());

            SET17=(Token)match(input,SET,FOLLOW_SET_in_update_statement453); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(SET17);


            pushFollow(FOLLOW_assignment_list_in_update_statement455);
            assignment_list18=assignment_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment_list.add(assignment_list18.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:78:41: ( where_clause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WHERE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:78:41: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_update_statement457);
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
            // 79:5: -> ^( UPDATE_STMT identifier assignment_list ( where_clause )? )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:80:7: ^( UPDATE_STMT identifier assignment_list ( where_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(UPDATE_STMT, "UPDATE_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_assignment_list.nextTree());

                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:80:48: ( where_clause )?
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:83:1: insert_statement : INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN -> ^( INSERT_STMT identifier identifier_list expression_list ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:84:3: ( INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN -> ^( INSERT_STMT identifier identifier_list expression_list ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:85:3: INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN
            {
            INSERT20=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_statement496); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INSERT.add(INSERT20);


            INTO21=(Token)match(input,INTO,FOLLOW_INTO_in_insert_statement498); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTO.add(INTO21);


            pushFollow(FOLLOW_identifier_in_insert_statement500);
            identifier22=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier22.getTree());

            LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_statement502); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN23);


            pushFollow(FOLLOW_identifier_list_in_insert_statement504);
            identifier_list24=identifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier_list.add(identifier_list24.getTree());

            RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_statement506); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN25);


            VALUES26=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_statement508); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VALUES.add(VALUES26);


            LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_statement510); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN27);


            pushFollow(FOLLOW_expression_list_in_insert_statement512);
            expression_list28=expression_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression_list.add(expression_list28.getTree());

            RPAREN29=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_statement514); if (state.failed) return retval; 
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
            // 86:4: -> ^( INSERT_STMT identifier identifier_list expression_list )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:87:5: ^( INSERT_STMT identifier identifier_list expression_list )
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:90:1: delete_statement : DELETE FROM identifier ( where_clause )? -> ^( DELETE_STMT identifier ( where_clause )? ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:91:3: ( DELETE FROM identifier ( where_clause )? -> ^( DELETE_STMT identifier ( where_clause )? ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:92:3: DELETE FROM identifier ( where_clause )?
            {
            DELETE30=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_statement549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DELETE.add(DELETE30);


            FROM31=(Token)match(input,FROM,FOLLOW_FROM_in_delete_statement551); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FROM.add(FROM31);


            pushFollow(FOLLOW_identifier_in_delete_statement553);
            identifier32=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier32.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:92:26: ( where_clause )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==WHERE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:92:26: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_delete_statement555);
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
            // 93:5: -> ^( DELETE_STMT identifier ( where_clause )? )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:93:8: ^( DELETE_STMT identifier ( where_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DELETE_STMT, "DELETE_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:93:33: ( where_clause )?
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:96:1: create_statement : CREATE TABLE identifier LPAREN table_columns_def RPAREN -> ^( CREATE_STMT identifier table_columns_def ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:97:3: ( CREATE TABLE identifier LPAREN table_columns_def RPAREN -> ^( CREATE_STMT identifier table_columns_def ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:98:3: CREATE TABLE identifier LPAREN table_columns_def RPAREN
            {
            CREATE34=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_statement586); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CREATE.add(CREATE34);


            TABLE35=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_statement588); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TABLE.add(TABLE35);


            pushFollow(FOLLOW_identifier_in_create_statement590);
            identifier36=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier36.getTree());

            LPAREN37=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_statement592); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN37);


            pushFollow(FOLLOW_table_columns_def_in_create_statement594);
            table_columns_def38=table_columns_def();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table_columns_def.add(table_columns_def38.getTree());

            RPAREN39=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_statement596); if (state.failed) return retval; 
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
            // 99:5: -> ^( CREATE_STMT identifier table_columns_def )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:100:5: ^( CREATE_STMT identifier table_columns_def )
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


    public static class table_columns_def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_columns_def"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:103:1: table_columns_def : table_column_def ( ',' table_column_def )* -> ^( COLUMN_DEF_LIST ( table_column_def )+ ) ;
    public final SQLGrammarParser.table_columns_def_return table_columns_def() throws RecognitionException {
        SQLGrammarParser.table_columns_def_return retval = new SQLGrammarParser.table_columns_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal41=null;
        SQLGrammarParser.table_column_def_return table_column_def40 =null;

        SQLGrammarParser.table_column_def_return table_column_def42 =null;


        CommonTree char_literal41_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_table_column_def=new RewriteRuleSubtreeStream(adaptor,"rule table_column_def");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:104:3: ( table_column_def ( ',' table_column_def )* -> ^( COLUMN_DEF_LIST ( table_column_def )+ ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:104:5: table_column_def ( ',' table_column_def )*
            {
            pushFollow(FOLLOW_table_column_def_in_table_columns_def627);
            table_column_def40=table_column_def();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table_column_def.add(table_column_def40.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:104:22: ( ',' table_column_def )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==56) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:104:23: ',' table_column_def
            	    {
            	    char_literal41=(Token)match(input,56,FOLLOW_56_in_table_columns_def630); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_56.add(char_literal41);


            	    pushFollow(FOLLOW_table_column_def_in_table_columns_def632);
            	    table_column_def42=table_column_def();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_table_column_def.add(table_column_def42.getTree());

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
            // 105:5: -> ^( COLUMN_DEF_LIST ( table_column_def )+ )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:105:8: ^( COLUMN_DEF_LIST ( table_column_def )+ )
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:108:1: table_column_def : identifier type_specifier ;
    public final SQLGrammarParser.table_column_def_return table_column_def() throws RecognitionException {
        SQLGrammarParser.table_column_def_return retval = new SQLGrammarParser.table_column_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SQLGrammarParser.identifier_return identifier43 =null;

        SQLGrammarParser.type_specifier_return type_specifier44 =null;



        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:109:3: ( identifier type_specifier )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:109:5: identifier type_specifier
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_table_column_def661);
            identifier43=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier43.getTree());

            pushFollow(FOLLOW_type_specifier_in_table_column_def663);
            type_specifier44=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_specifier44.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:112:1: type_specifier : ( INT | FLOAT | CHAR LPAREN number_value RPAREN | VARCHAR LPAREN number_value RPAREN | DATE | TIME | TIMESTAMP );
    public final SQLGrammarParser.type_specifier_return type_specifier() throws RecognitionException {
        SQLGrammarParser.type_specifier_return retval = new SQLGrammarParser.type_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT45=null;
        Token FLOAT46=null;
        Token CHAR47=null;
        Token LPAREN48=null;
        Token RPAREN50=null;
        Token VARCHAR51=null;
        Token LPAREN52=null;
        Token RPAREN54=null;
        Token DATE55=null;
        Token TIME56=null;
        Token TIMESTAMP57=null;
        SQLGrammarParser.number_value_return number_value49 =null;

        SQLGrammarParser.number_value_return number_value53 =null;


        CommonTree INT45_tree=null;
        CommonTree FLOAT46_tree=null;
        CommonTree CHAR47_tree=null;
        CommonTree LPAREN48_tree=null;
        CommonTree RPAREN50_tree=null;
        CommonTree VARCHAR51_tree=null;
        CommonTree LPAREN52_tree=null;
        CommonTree RPAREN54_tree=null;
        CommonTree DATE55_tree=null;
        CommonTree TIME56_tree=null;
        CommonTree TIMESTAMP57_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:113:3: ( INT | FLOAT | CHAR LPAREN number_value RPAREN | VARCHAR LPAREN number_value RPAREN | DATE | TIME | TIMESTAMP )
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:113:5: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT45=(Token)match(input,INT,FOLLOW_INT_in_type_specifier676); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT45_tree = 
                    (CommonTree)adaptor.create(INT45)
                    ;
                    adaptor.addChild(root_0, INT45_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:114:5: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FLOAT46=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier682); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT46_tree = 
                    (CommonTree)adaptor.create(FLOAT46)
                    ;
                    adaptor.addChild(root_0, FLOAT46_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:115:5: CHAR LPAREN number_value RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CHAR47=(Token)match(input,CHAR,FOLLOW_CHAR_in_type_specifier688); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR47_tree = 
                    (CommonTree)adaptor.create(CHAR47)
                    ;
                    adaptor.addChild(root_0, CHAR47_tree);
                    }

                    LPAREN48=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_specifier690); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN48_tree = 
                    (CommonTree)adaptor.create(LPAREN48)
                    ;
                    adaptor.addChild(root_0, LPAREN48_tree);
                    }

                    pushFollow(FOLLOW_number_value_in_type_specifier692);
                    number_value49=number_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_value49.getTree());

                    RPAREN50=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_specifier694); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN50_tree = 
                    (CommonTree)adaptor.create(RPAREN50)
                    ;
                    adaptor.addChild(root_0, RPAREN50_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:116:5: VARCHAR LPAREN number_value RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    VARCHAR51=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_type_specifier700); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VARCHAR51_tree = 
                    (CommonTree)adaptor.create(VARCHAR51)
                    ;
                    adaptor.addChild(root_0, VARCHAR51_tree);
                    }

                    LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_specifier702); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN52_tree = 
                    (CommonTree)adaptor.create(LPAREN52)
                    ;
                    adaptor.addChild(root_0, LPAREN52_tree);
                    }

                    pushFollow(FOLLOW_number_value_in_type_specifier704);
                    number_value53=number_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_value53.getTree());

                    RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_specifier706); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN54_tree = 
                    (CommonTree)adaptor.create(RPAREN54)
                    ;
                    adaptor.addChild(root_0, RPAREN54_tree);
                    }

                    }
                    break;
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:117:5: DATE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DATE55=(Token)match(input,DATE,FOLLOW_DATE_in_type_specifier712); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DATE55_tree = 
                    (CommonTree)adaptor.create(DATE55)
                    ;
                    adaptor.addChild(root_0, DATE55_tree);
                    }

                    }
                    break;
                case 6 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:118:5: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TIME56=(Token)match(input,TIME,FOLLOW_TIME_in_type_specifier718); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME56_tree = 
                    (CommonTree)adaptor.create(TIME56)
                    ;
                    adaptor.addChild(root_0, TIME56_tree);
                    }

                    }
                    break;
                case 7 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:119:5: TIMESTAMP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TIMESTAMP57=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_type_specifier724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIMESTAMP57_tree = 
                    (CommonTree)adaptor.create(TIMESTAMP57)
                    ;
                    adaptor.addChild(root_0, TIMESTAMP57_tree);
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


    public static class drop_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop_statement"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:122:1: drop_statement : DROP ;
    public final SQLGrammarParser.drop_statement_return drop_statement() throws RecognitionException {
        SQLGrammarParser.drop_statement_return retval = new SQLGrammarParser.drop_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DROP58=null;

        CommonTree DROP58_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:123:3: ( DROP )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:124:3: DROP
            {
            root_0 = (CommonTree)adaptor.nil();


            DROP58=(Token)match(input,DROP,FOLLOW_DROP_in_drop_statement739); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DROP58_tree = 
            (CommonTree)adaptor.create(DROP58)
            ;
            adaptor.addChild(root_0, DROP58_tree);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:127:1: alter_statement : ALTER ;
    public final SQLGrammarParser.alter_statement_return alter_statement() throws RecognitionException {
        SQLGrammarParser.alter_statement_return retval = new SQLGrammarParser.alter_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ALTER59=null;

        CommonTree ALTER59_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:128:3: ( ALTER )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:129:3: ALTER
            {
            root_0 = (CommonTree)adaptor.nil();


            ALTER59=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_statement754); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ALTER59_tree = 
            (CommonTree)adaptor.create(ALTER59)
            ;
            adaptor.addChild(root_0, ALTER59_tree);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:132:1: expression_list : expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) ;
    public final SQLGrammarParser.expression_list_return expression_list() throws RecognitionException {
        SQLGrammarParser.expression_list_return retval = new SQLGrammarParser.expression_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal61=null;
        SQLGrammarParser.expr_return expr60 =null;

        SQLGrammarParser.expr_return expr62 =null;


        CommonTree char_literal61_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:133:3: ( expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:134:3: expr ( ',' expr )*
            {
            pushFollow(FOLLOW_expr_in_expression_list769);
            expr60=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr60.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:134:8: ( ',' expr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==56) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:134:9: ',' expr
            	    {
            	    char_literal61=(Token)match(input,56,FOLLOW_56_in_expression_list772); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_56.add(char_literal61);


            	    pushFollow(FOLLOW_expr_in_expression_list774);
            	    expr62=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr62.getTree());

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
            // 135:5: -> ^( EXPR_LIST ( expr )+ )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:136:7: ^( EXPR_LIST ( expr )+ )
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:139:1: identifier_list : identifier ( ',' ! identifier )* ;
    public final SQLGrammarParser.identifier_list_return identifier_list() throws RecognitionException {
        SQLGrammarParser.identifier_list_return retval = new SQLGrammarParser.identifier_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal64=null;
        SQLGrammarParser.identifier_return identifier63 =null;

        SQLGrammarParser.identifier_return identifier65 =null;


        CommonTree char_literal64_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:140:3: ( identifier ( ',' ! identifier )* )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:141:3: identifier ( ',' ! identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_identifier_list810);
            identifier63=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier63.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:141:14: ( ',' ! identifier )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==56) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:141:15: ',' ! identifier
            	    {
            	    char_literal64=(Token)match(input,56,FOLLOW_56_in_identifier_list813); if (state.failed) return retval;

            	    pushFollow(FOLLOW_identifier_in_identifier_list816);
            	    identifier65=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier65.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:143:1: where_clause : WHERE disjunction -> ^( WHERE disjunction ) ;
    public final SQLGrammarParser.where_clause_return where_clause() throws RecognitionException {
        SQLGrammarParser.where_clause_return retval = new SQLGrammarParser.where_clause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WHERE66=null;
        SQLGrammarParser.disjunction_return disjunction67 =null;


        CommonTree WHERE66_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_disjunction=new RewriteRuleSubtreeStream(adaptor,"rule disjunction");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:144:3: ( WHERE disjunction -> ^( WHERE disjunction ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:145:3: WHERE disjunction
            {
            WHERE66=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause830); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHERE.add(WHERE66);


            pushFollow(FOLLOW_disjunction_in_where_clause832);
            disjunction67=disjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_disjunction.add(disjunction67.getTree());

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
            // 146:5: -> ^( WHERE disjunction )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:147:7: ^( WHERE disjunction )
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:150:1: disjunction : conjunction ( OR ^ disjunction )* ;
    public final SQLGrammarParser.disjunction_return disjunction() throws RecognitionException {
        SQLGrammarParser.disjunction_return retval = new SQLGrammarParser.disjunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR69=null;
        SQLGrammarParser.conjunction_return conjunction68 =null;

        SQLGrammarParser.disjunction_return disjunction70 =null;


        CommonTree OR69_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:151:3: ( conjunction ( OR ^ disjunction )* )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:152:3: conjunction ( OR ^ disjunction )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conjunction_in_disjunction865);
            conjunction68=conjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction68.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:152:15: ( OR ^ disjunction )*
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
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:152:16: OR ^ disjunction
            	    {
            	    OR69=(Token)match(input,OR,FOLLOW_OR_in_disjunction868); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR69_tree = 
            	    (CommonTree)adaptor.create(OR69)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR69_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_disjunction_in_disjunction871);
            	    disjunction70=disjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, disjunction70.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:155:1: conjunction : predicate ( AND ^ conjunction )* ;
    public final SQLGrammarParser.conjunction_return conjunction() throws RecognitionException {
        SQLGrammarParser.conjunction_return retval = new SQLGrammarParser.conjunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND72=null;
        SQLGrammarParser.predicate_return predicate71 =null;

        SQLGrammarParser.conjunction_return conjunction73 =null;


        CommonTree AND72_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:156:3: ( predicate ( AND ^ conjunction )* )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:157:3: predicate ( AND ^ conjunction )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_predicate_in_conjunction888);
            predicate71=predicate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate71.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:157:13: ( AND ^ conjunction )*
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
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:157:14: AND ^ conjunction
            	    {
            	    AND72=(Token)match(input,AND,FOLLOW_AND_in_conjunction891); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND72_tree = 
            	    (CommonTree)adaptor.create(AND72)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND72_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_conjunction_in_conjunction894);
            	    conjunction73=conjunction();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conjunction73.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:160:1: predicate : expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr ;
    public final SQLGrammarParser.predicate_return predicate() throws RecognitionException {
        SQLGrammarParser.predicate_return retval = new SQLGrammarParser.predicate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ75=null;
        Token LT76=null;
        Token GT77=null;
        Token GE78=null;
        Token LE79=null;
        Token NE80=null;
        SQLGrammarParser.expr_return expr74 =null;

        SQLGrammarParser.expr_return expr81 =null;


        CommonTree EQ75_tree=null;
        CommonTree LT76_tree=null;
        CommonTree GT77_tree=null;
        CommonTree GE78_tree=null;
        CommonTree LE79_tree=null;
        CommonTree NE80_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:161:3: ( expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:162:3: expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_predicate911);
            expr74=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr74.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:162:8: ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^)
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:162:9: EQ ^
                    {
                    EQ75=(Token)match(input,EQ,FOLLOW_EQ_in_predicate914); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ75_tree = 
                    (CommonTree)adaptor.create(EQ75)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(EQ75_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:162:15: LT ^
                    {
                    LT76=(Token)match(input,LT,FOLLOW_LT_in_predicate919); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT76_tree = 
                    (CommonTree)adaptor.create(LT76)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(LT76_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:162:21: GT ^
                    {
                    GT77=(Token)match(input,GT,FOLLOW_GT_in_predicate924); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GT77_tree = 
                    (CommonTree)adaptor.create(GT77)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(GT77_tree, root_0);
                    }

                    }
                    break;
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:162:27: GE ^
                    {
                    GE78=(Token)match(input,GE,FOLLOW_GE_in_predicate929); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GE78_tree = 
                    (CommonTree)adaptor.create(GE78)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(GE78_tree, root_0);
                    }

                    }
                    break;
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:162:33: LE ^
                    {
                    LE79=(Token)match(input,LE,FOLLOW_LE_in_predicate934); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LE79_tree = 
                    (CommonTree)adaptor.create(LE79)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(LE79_tree, root_0);
                    }

                    }
                    break;
                case 6 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:162:39: NE ^
                    {
                    NE80=(Token)match(input,NE,FOLLOW_NE_in_predicate939); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NE80_tree = 
                    (CommonTree)adaptor.create(NE80)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(NE80_tree, root_0);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_predicate944);
            expr81=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr81.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:165:1: expr : simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )* ;
    public final SQLGrammarParser.expr_return expr() throws RecognitionException {
        SQLGrammarParser.expr_return retval = new SQLGrammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS83=null;
        Token MINUS84=null;
        SQLGrammarParser.simpleExpression_return simpleExpression82 =null;

        SQLGrammarParser.simpleExpression_return simpleExpression85 =null;


        CommonTree PLUS83_tree=null;
        CommonTree MINUS84_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:166:3: ( simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )* )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:167:3: simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_simpleExpression_in_expr959);
            simpleExpression82=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression82.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:167:20: ( ( PLUS ^| MINUS ^) simpleExpression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==MINUS||LA13_0==PLUS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:167:21: ( PLUS ^| MINUS ^) simpleExpression
            	    {
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:167:21: ( PLUS ^| MINUS ^)
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
            	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:167:22: PLUS ^
            	            {
            	            PLUS83=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr963); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS83_tree = 
            	            (CommonTree)adaptor.create(PLUS83)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS83_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:167:30: MINUS ^
            	            {
            	            MINUS84=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr968); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS84_tree = 
            	            (CommonTree)adaptor.create(MINUS84)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS84_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_simpleExpression_in_expr972);
            	    simpleExpression85=simpleExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression85.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:170:1: simpleExpression : term ( ( MUL ^| DIV ^| MOD ^) term )* ;
    public final SQLGrammarParser.simpleExpression_return simpleExpression() throws RecognitionException {
        SQLGrammarParser.simpleExpression_return retval = new SQLGrammarParser.simpleExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MUL87=null;
        Token DIV88=null;
        Token MOD89=null;
        SQLGrammarParser.term_return term86 =null;

        SQLGrammarParser.term_return term90 =null;


        CommonTree MUL87_tree=null;
        CommonTree DIV88_tree=null;
        CommonTree MOD89_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:171:3: ( term ( ( MUL ^| DIV ^| MOD ^) term )* )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:172:3: term ( ( MUL ^| DIV ^| MOD ^) term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_simpleExpression989);
            term86=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term86.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:172:8: ( ( MUL ^| DIV ^| MOD ^) term )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==DIV||(LA15_0 >= MOD && LA15_0 <= MUL)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:172:9: ( MUL ^| DIV ^| MOD ^) term
            	    {
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:172:9: ( MUL ^| DIV ^| MOD ^)
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
            	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:172:10: MUL ^
            	            {
            	            MUL87=(Token)match(input,MUL,FOLLOW_MUL_in_simpleExpression993); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MUL87_tree = 
            	            (CommonTree)adaptor.create(MUL87)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MUL87_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:172:17: DIV ^
            	            {
            	            DIV88=(Token)match(input,DIV,FOLLOW_DIV_in_simpleExpression998); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DIV88_tree = 
            	            (CommonTree)adaptor.create(DIV88)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIV88_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:172:24: MOD ^
            	            {
            	            MOD89=(Token)match(input,MOD,FOLLOW_MOD_in_simpleExpression1003); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MOD89_tree = 
            	            (CommonTree)adaptor.create(MOD89)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MOD89_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_simpleExpression1007);
            	    term90=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term90.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:175:1: term : ( identifier | value );
    public final SQLGrammarParser.term_return term() throws RecognitionException {
        SQLGrammarParser.term_return retval = new SQLGrammarParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SQLGrammarParser.identifier_return identifier91 =null;

        SQLGrammarParser.value_return value92 =null;



        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:176:3: ( identifier | value )
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:177:3: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_term1024);
                    identifier91=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier91.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:178:5: value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_value_in_term1030);
                    value92=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value92.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:181:1: value : ( number_value | string_value | date_value | time_value | timestamp_value );
    public final SQLGrammarParser.value_return value() throws RecognitionException {
        SQLGrammarParser.value_return retval = new SQLGrammarParser.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SQLGrammarParser.number_value_return number_value93 =null;

        SQLGrammarParser.string_value_return string_value94 =null;

        SQLGrammarParser.date_value_return date_value95 =null;

        SQLGrammarParser.time_value_return time_value96 =null;

        SQLGrammarParser.timestamp_value_return timestamp_value97 =null;



        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:182:3: ( number_value | string_value | date_value | time_value | timestamp_value )
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:183:3: number_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_number_value_in_value1045);
                    number_value93=number_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_value93.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:184:5: string_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_string_value_in_value1051);
                    string_value94=string_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value94.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:185:5: date_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_date_value_in_value1057);
                    date_value95=date_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, date_value95.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:186:5: time_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_time_value_in_value1063);
                    time_value96=time_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, time_value96.getTree());

                    }
                    break;
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:187:5: timestamp_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timestamp_value_in_value1069);
                    timestamp_value97=timestamp_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_value97.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:191:1: number_value : REAL_LIT ;
    public final SQLGrammarParser.number_value_return number_value() throws RecognitionException {
        SQLGrammarParser.number_value_return retval = new SQLGrammarParser.number_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token REAL_LIT98=null;

        CommonTree REAL_LIT98_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:192:3: ( REAL_LIT )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:193:3: REAL_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            REAL_LIT98=(Token)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_number_value1085); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LIT98_tree = 
            (CommonTree)adaptor.create(REAL_LIT98)
            ;
            adaptor.addChild(root_0, REAL_LIT98_tree);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:196:1: string_value : STRING_LIT ;
    public final SQLGrammarParser.string_value_return string_value() throws RecognitionException {
        SQLGrammarParser.string_value_return retval = new SQLGrammarParser.string_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING_LIT99=null;

        CommonTree STRING_LIT99_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:197:3: ( STRING_LIT )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:198:3: STRING_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            STRING_LIT99=(Token)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_string_value1100); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LIT99_tree = 
            (CommonTree)adaptor.create(STRING_LIT99)
            ;
            adaptor.addChild(root_0, STRING_LIT99_tree);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:201:1: date_value : DATE string_value ;
    public final SQLGrammarParser.date_value_return date_value() throws RecognitionException {
        SQLGrammarParser.date_value_return retval = new SQLGrammarParser.date_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DATE100=null;
        SQLGrammarParser.string_value_return string_value101 =null;


        CommonTree DATE100_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:202:3: ( DATE string_value )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:203:3: DATE string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            DATE100=(Token)match(input,DATE,FOLLOW_DATE_in_date_value1115); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATE100_tree = 
            (CommonTree)adaptor.create(DATE100)
            ;
            adaptor.addChild(root_0, DATE100_tree);
            }

            pushFollow(FOLLOW_string_value_in_date_value1117);
            string_value101=string_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value101.getTree());

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:206:1: time_value : TIME string_value ;
    public final SQLGrammarParser.time_value_return time_value() throws RecognitionException {
        SQLGrammarParser.time_value_return retval = new SQLGrammarParser.time_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TIME102=null;
        SQLGrammarParser.string_value_return string_value103 =null;


        CommonTree TIME102_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:207:3: ( TIME string_value )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:208:3: TIME string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            TIME102=(Token)match(input,TIME,FOLLOW_TIME_in_time_value1132); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIME102_tree = 
            (CommonTree)adaptor.create(TIME102)
            ;
            adaptor.addChild(root_0, TIME102_tree);
            }

            pushFollow(FOLLOW_string_value_in_time_value1134);
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
    // $ANTLR end "time_value"


    public static class timestamp_value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timestamp_value"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:211:1: timestamp_value : TIMESTAMP string_value ;
    public final SQLGrammarParser.timestamp_value_return timestamp_value() throws RecognitionException {
        SQLGrammarParser.timestamp_value_return retval = new SQLGrammarParser.timestamp_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TIMESTAMP104=null;
        SQLGrammarParser.string_value_return string_value105 =null;


        CommonTree TIMESTAMP104_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:212:3: ( TIMESTAMP string_value )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:213:3: TIMESTAMP string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            TIMESTAMP104=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_timestamp_value1149); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIMESTAMP104_tree = 
            (CommonTree)adaptor.create(TIMESTAMP104)
            ;
            adaptor.addChild(root_0, TIMESTAMP104_tree);
            }

            pushFollow(FOLLOW_string_value_in_timestamp_value1151);
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
    // $ANTLR end "timestamp_value"


    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:216:1: identifier : IDENTIFIER ;
    public final SQLGrammarParser.identifier_return identifier() throws RecognitionException {
        SQLGrammarParser.identifier_return retval = new SQLGrammarParser.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER106=null;

        CommonTree IDENTIFIER106_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:217:3: ( IDENTIFIER )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:218:3: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENTIFIER106=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier1166); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER106_tree = 
            (CommonTree)adaptor.create(IDENTIFIER106)
            ;
            adaptor.addChild(root_0, IDENTIFIER106_tree);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:221:1: assignment_list : assignment ( ',' assignment )* -> ^( UPDATE_ASSIGNMENTS ( assignment )+ ) ;
    public final SQLGrammarParser.assignment_list_return assignment_list() throws RecognitionException {
        SQLGrammarParser.assignment_list_return retval = new SQLGrammarParser.assignment_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal108=null;
        SQLGrammarParser.assignment_return assignment107 =null;

        SQLGrammarParser.assignment_return assignment109 =null;


        CommonTree char_literal108_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:222:3: ( assignment ( ',' assignment )* -> ^( UPDATE_ASSIGNMENTS ( assignment )+ ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:222:5: assignment ( ',' assignment )*
            {
            pushFollow(FOLLOW_assignment_in_assignment_list1179);
            assignment107=assignment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment.add(assignment107.getTree());

            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:222:16: ( ',' assignment )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==56) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:222:17: ',' assignment
            	    {
            	    char_literal108=(Token)match(input,56,FOLLOW_56_in_assignment_list1182); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_56.add(char_literal108);


            	    pushFollow(FOLLOW_assignment_in_assignment_list1184);
            	    assignment109=assignment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_assignment.add(assignment109.getTree());

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
            // 222:34: -> ^( UPDATE_ASSIGNMENTS ( assignment )+ )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:222:37: ^( UPDATE_ASSIGNMENTS ( assignment )+ )
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:225:1: assignment : identifier EQ expr -> ^( EQ identifier expr ) ;
    public final SQLGrammarParser.assignment_return assignment() throws RecognitionException {
        SQLGrammarParser.assignment_return retval = new SQLGrammarParser.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ111=null;
        SQLGrammarParser.identifier_return identifier110 =null;

        SQLGrammarParser.expr_return expr112 =null;


        CommonTree EQ111_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:226:3: ( identifier EQ expr -> ^( EQ identifier expr ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:226:5: identifier EQ expr
            {
            pushFollow(FOLLOW_identifier_in_assignment1208);
            identifier110=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier110.getTree());

            EQ111=(Token)match(input,EQ,FOLLOW_EQ_in_assignment1210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ111);


            pushFollow(FOLLOW_expr_in_assignment1212);
            expr112=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr112.getTree());

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
            // 226:24: -> ^( EQ identifier expr )
            {
                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:226:27: ^( EQ identifier expr )
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
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:152:16: ( OR disjunction )
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:152:16: OR disjunction
        {
        match(input,OR,FOLLOW_OR_in_synpred19_SQLGrammar868); if (state.failed) return ;

        pushFollow(FOLLOW_disjunction_in_synpred19_SQLGrammar871);
        disjunction();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred19_SQLGrammar

    // $ANTLR start synpred20_SQLGrammar
    public final void synpred20_SQLGrammar_fragment() throws RecognitionException {
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:157:14: ( AND conjunction )
        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLGrammar.g:157:14: AND conjunction
        {
        match(input,AND,FOLLOW_AND_in_synpred20_SQLGrammar891); if (state.failed) return ;

        pushFollow(FOLLOW_conjunction_in_synpred20_SQLGrammar894);
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


 

    public static final BitSet FOLLOW_sql_statement_in_query332 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEMI_in_query334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_sql_statement349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_sql_statement355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_sql_statement361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_sql_statement367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_statement_in_sql_statement373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_statement_in_sql_statement379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_statement_in_sql_statement385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement400 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_expression_list_in_select_statement402 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_FROM_in_select_statement404 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_list_in_select_statement406 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_where_clause_in_select_statement409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_statement449 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_update_statement451 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SET_in_update_statement453 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_assignment_list_in_update_statement455 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_where_clause_in_update_statement457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_statement496 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INTO_in_insert_statement498 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_insert_statement500 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_statement502 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_list_in_insert_statement504 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_statement506 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_statement508 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_statement510 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_expression_list_in_insert_statement512 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_statement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_statement549 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_FROM_in_delete_statement551 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_delete_statement553 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_where_clause_in_delete_statement555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_statement586 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_TABLE_in_create_statement588 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_create_statement590 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_statement592 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_table_columns_def_in_create_statement594 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_statement596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_column_def_in_table_columns_def627 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_table_columns_def630 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_table_column_def_in_table_columns_def632 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_identifier_in_table_column_def661 = new BitSet(new long[]{0x0021800002040440L});
    public static final BitSet FOLLOW_type_specifier_in_table_column_def663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type_specifier682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier688 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_specifier690 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_number_value_in_type_specifier692 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_specifier694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARCHAR_in_type_specifier700 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_specifier702 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_number_value_in_type_specifier704 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_specifier706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_type_specifier712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_type_specifier718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_type_specifier724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_statement739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_statement754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expression_list769 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_expression_list772 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_expr_in_expression_list774 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list810 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_identifier_list813 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_identifier_list816 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clause830 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_disjunction_in_where_clause832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_disjunction865 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_OR_in_disjunction868 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_disjunction_in_disjunction871 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_predicate_in_conjunction888 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_conjunction891 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_conjunction_in_conjunction894 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_expr_in_predicate911 = new BitSet(new long[]{0x0000000448310000L});
    public static final BitSet FOLLOW_EQ_in_predicate914 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_LT_in_predicate919 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_GT_in_predicate924 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_GE_in_predicate929 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_LE_in_predicate934 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_NE_in_predicate939 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_expr_in_predicate944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expr959 = new BitSet(new long[]{0x0000002080000002L});
    public static final BitSet FOLLOW_PLUS_in_expr963 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_MINUS_in_expr968 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_simpleExpression_in_expr972 = new BitSet(new long[]{0x0000002080000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression989 = new BitSet(new long[]{0x0000000300004002L});
    public static final BitSet FOLLOW_MUL_in_simpleExpression993 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_DIV_in_simpleExpression998 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_MOD_in_simpleExpression1003 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_term_in_simpleExpression1007 = new BitSet(new long[]{0x0000000300004002L});
    public static final BitSet FOLLOW_identifier_in_term1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_value_in_value1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_value_in_value1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_value_in_value1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_value_in_value1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestamp_value_in_value1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_number_value1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LIT_in_string_value1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_date_value1115 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_string_value_in_date_value1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_time_value1132 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_string_value_in_time_value1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_timestamp_value1149 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_string_value_in_timestamp_value1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_assignment_list1179 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_assignment_list1182 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_assignment_in_assignment_list1184 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignment1208 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EQ_in_assignment1210 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_expr_in_assignment1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_synpred19_SQLGrammar868 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_disjunction_in_synpred19_SQLGrammar871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred20_SQLGrammar891 = new BitSet(new long[]{0x0001904000400400L});
    public static final BitSet FOLLOW_conjunction_in_synpred20_SQLGrammar894 = new BitSet(new long[]{0x0000000000000002L});

}