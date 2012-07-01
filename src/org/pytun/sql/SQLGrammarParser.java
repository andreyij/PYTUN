// $ANTLR 3.4 D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g 2012-07-01 15:35:29

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALTER", "AND", "CHAR", "CREATE", "DATE", "DELETE", "DELETE_STMT", "DIGIT", "DIV", "DROP", "EQ", "EXPR_LIST", "FLOAT", "FROM", "GE", "GT", "IDENTIFIER", "INSERT", "INSERT_STMT", "INT", "INTO", "LE", "LETTER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NE", "NEWLINE", "OR", "PLUS", "PREDICATE_LIST", "REAL_LIT", "RPAREN", "SELECT", "SELECT_STMT", "SEMI", "SET", "STRING_LIT", "TABLE_LIST", "TIME", "TIMESTAMP", "UPDATE", "UPDATE_ASSIGNMENTS", "UPDATE_STMT", "VALUES", "VARCHAR", "WHERE", "WHITESPACE", "','"
    };

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:52:1: query : sql_statement SEMI ;
    public final SQLGrammarParser.query_return query() throws RecognitionException {
        SQLGrammarParser.query_return retval = new SQLGrammarParser.query_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SEMI2=null;
        SQLGrammarParser.sql_statement_return sql_statement1 =null;


        CommonTree SEMI2_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:53:3: ( sql_statement SEMI )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:54:3: sql_statement SEMI
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_sql_statement_in_query327);
            sql_statement1=sql_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sql_statement1.getTree());

            SEMI2=(Token)match(input,SEMI,FOLLOW_SEMI_in_query329); if (state.failed) return retval;
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:57:1: sql_statement : ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement );
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:58:3: ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement )
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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:59:3: select_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_select_statement_in_sql_statement344);
                    select_statement3=select_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, select_statement3.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:60:5: update_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_update_statement_in_sql_statement350);
                    update_statement4=update_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, update_statement4.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:61:5: insert_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_insert_statement_in_sql_statement356);
                    insert_statement5=insert_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, insert_statement5.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:62:5: delete_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_delete_statement_in_sql_statement362);
                    delete_statement6=delete_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delete_statement6.getTree());

                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:63:5: create_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_create_statement_in_sql_statement368);
                    create_statement7=create_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, create_statement7.getTree());

                    }
                    break;
                case 6 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:64:5: drop_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_drop_statement_in_sql_statement374);
                    drop_statement8=drop_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, drop_statement8.getTree());

                    }
                    break;
                case 7 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:65:5: alter_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_alter_statement_in_sql_statement380);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:68:1: select_statement : SELECT expression_list FROM identifier_list ( where_clause )? -> ^( SELECT_STMT expression_list identifier_list ( where_clause )? ) ;
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:69:3: ( SELECT expression_list FROM identifier_list ( where_clause )? -> ^( SELECT_STMT expression_list identifier_list ( where_clause )? ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:70:3: SELECT expression_list FROM identifier_list ( where_clause )?
            {
            SELECT10=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_statement395); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SELECT.add(SELECT10);


            pushFollow(FOLLOW_expression_list_in_select_statement397);
            expression_list11=expression_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression_list.add(expression_list11.getTree());

            FROM12=(Token)match(input,FROM,FOLLOW_FROM_in_select_statement399); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FROM.add(FROM12);


            pushFollow(FOLLOW_identifier_list_in_select_statement401);
            identifier_list13=identifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier_list.add(identifier_list13.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:70:47: ( where_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WHERE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:70:48: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_select_statement404);
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
            // 71:5: -> ^( SELECT_STMT expression_list identifier_list ( where_clause )? )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:72:7: ^( SELECT_STMT expression_list identifier_list ( where_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SELECT_STMT, "SELECT_STMT")
                , root_1);

                adaptor.addChild(root_1, stream_expression_list.nextTree());

                adaptor.addChild(root_1, stream_identifier_list.nextTree());

                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:72:53: ( where_clause )?
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


    public static class expression_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_list"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:75:1: expression_list : expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) ;
    public final SQLGrammarParser.expression_list_return expression_list() throws RecognitionException {
        SQLGrammarParser.expression_list_return retval = new SQLGrammarParser.expression_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal16=null;
        SQLGrammarParser.expr_return expr15 =null;

        SQLGrammarParser.expr_return expr17 =null;


        CommonTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:76:3: ( expr ( ',' expr )* -> ^( EXPR_LIST ( expr )+ ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:77:3: expr ( ',' expr )*
            {
            pushFollow(FOLLOW_expr_in_expression_list444);
            expr15=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr15.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:77:8: ( ',' expr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==54) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:77:9: ',' expr
            	    {
            	    char_literal16=(Token)match(input,54,FOLLOW_54_in_expression_list447); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_54.add(char_literal16);


            	    pushFollow(FOLLOW_expr_in_expression_list449);
            	    expr17=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr17.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
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
            // 78:5: -> ^( EXPR_LIST ( expr )+ )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:79:7: ^( EXPR_LIST ( expr )+ )
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:82:1: identifier_list : identifier ( ',' ! identifier )* ;
    public final SQLGrammarParser.identifier_list_return identifier_list() throws RecognitionException {
        SQLGrammarParser.identifier_list_return retval = new SQLGrammarParser.identifier_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal19=null;
        SQLGrammarParser.identifier_return identifier18 =null;

        SQLGrammarParser.identifier_return identifier20 =null;


        CommonTree char_literal19_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:83:3: ( identifier ( ',' ! identifier )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:84:3: identifier ( ',' ! identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_identifier_list485);
            identifier18=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier18.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:84:14: ( ',' ! identifier )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==54) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:84:15: ',' ! identifier
            	    {
            	    char_literal19=(Token)match(input,54,FOLLOW_54_in_identifier_list488); if (state.failed) return retval;

            	    pushFollow(FOLLOW_identifier_in_identifier_list491);
            	    identifier20=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier20.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:86:1: where_clause : WHERE predicate_list -> ^( PREDICATE_LIST predicate_list ) ;
    public final SQLGrammarParser.where_clause_return where_clause() throws RecognitionException {
        SQLGrammarParser.where_clause_return retval = new SQLGrammarParser.where_clause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WHERE21=null;
        SQLGrammarParser.predicate_list_return predicate_list22 =null;


        CommonTree WHERE21_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_predicate_list=new RewriteRuleSubtreeStream(adaptor,"rule predicate_list");
        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:87:3: ( WHERE predicate_list -> ^( PREDICATE_LIST predicate_list ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:88:3: WHERE predicate_list
            {
            WHERE21=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause505); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHERE.add(WHERE21);


            pushFollow(FOLLOW_predicate_list_in_where_clause507);
            predicate_list22=predicate_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_predicate_list.add(predicate_list22.getTree());

            // AST REWRITE
            // elements: predicate_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 89:5: -> ^( PREDICATE_LIST predicate_list )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:90:7: ^( PREDICATE_LIST predicate_list )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PREDICATE_LIST, "PREDICATE_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_predicate_list.nextTree());

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


    public static class predicate_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicate_list"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:93:1: predicate_list : andExpr ( OR ^ andExpr )* ;
    public final SQLGrammarParser.predicate_list_return predicate_list() throws RecognitionException {
        SQLGrammarParser.predicate_list_return retval = new SQLGrammarParser.predicate_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR24=null;
        SQLGrammarParser.andExpr_return andExpr23 =null;

        SQLGrammarParser.andExpr_return andExpr25 =null;


        CommonTree OR24_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:94:3: ( andExpr ( OR ^ andExpr )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:95:3: andExpr ( OR ^ andExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_andExpr_in_predicate_list540);
            andExpr23=andExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpr23.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:95:11: ( OR ^ andExpr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==OR) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:95:12: OR ^ andExpr
            	    {
            	    OR24=(Token)match(input,OR,FOLLOW_OR_in_predicate_list543); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR24_tree = 
            	    (CommonTree)adaptor.create(OR24)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR24_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_andExpr_in_predicate_list546);
            	    andExpr25=andExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpr25.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "predicate_list"


    public static class andExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andExpr"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:98:1: andExpr : predicate ( AND ^ predicate )* ;
    public final SQLGrammarParser.andExpr_return andExpr() throws RecognitionException {
        SQLGrammarParser.andExpr_return retval = new SQLGrammarParser.andExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND27=null;
        SQLGrammarParser.predicate_return predicate26 =null;

        SQLGrammarParser.predicate_return predicate28 =null;


        CommonTree AND27_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:99:3: ( predicate ( AND ^ predicate )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:100:3: predicate ( AND ^ predicate )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_predicate_in_andExpr563);
            predicate26=predicate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate26.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:100:13: ( AND ^ predicate )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==AND) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:100:14: AND ^ predicate
            	    {
            	    AND27=(Token)match(input,AND,FOLLOW_AND_in_andExpr566); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND27_tree = 
            	    (CommonTree)adaptor.create(AND27)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND27_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_predicate_in_andExpr569);
            	    predicate28=predicate();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate28.getTree());

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
    // $ANTLR end "andExpr"


    public static class predicate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicate"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:103:1: predicate : expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr ;
    public final SQLGrammarParser.predicate_return predicate() throws RecognitionException {
        SQLGrammarParser.predicate_return retval = new SQLGrammarParser.predicate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ30=null;
        Token LT31=null;
        Token GT32=null;
        Token GE33=null;
        Token LE34=null;
        Token NE35=null;
        SQLGrammarParser.expr_return expr29 =null;

        SQLGrammarParser.expr_return expr36 =null;


        CommonTree EQ30_tree=null;
        CommonTree LT31_tree=null;
        CommonTree GT32_tree=null;
        CommonTree GE33_tree=null;
        CommonTree LE34_tree=null;
        CommonTree NE35_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:104:3: ( expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:105:3: expr ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^) expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_predicate586);
            expr29=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr29.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:105:8: ( EQ ^| LT ^| GT ^| GE ^| LE ^| NE ^)
            int alt7=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt7=1;
                }
                break;
            case LT:
                {
                alt7=2;
                }
                break;
            case GT:
                {
                alt7=3;
                }
                break;
            case GE:
                {
                alt7=4;
                }
                break;
            case LE:
                {
                alt7=5;
                }
                break;
            case NE:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:105:9: EQ ^
                    {
                    EQ30=(Token)match(input,EQ,FOLLOW_EQ_in_predicate589); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ30_tree = 
                    (CommonTree)adaptor.create(EQ30)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(EQ30_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:105:15: LT ^
                    {
                    LT31=(Token)match(input,LT,FOLLOW_LT_in_predicate594); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT31_tree = 
                    (CommonTree)adaptor.create(LT31)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(LT31_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:105:21: GT ^
                    {
                    GT32=(Token)match(input,GT,FOLLOW_GT_in_predicate599); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GT32_tree = 
                    (CommonTree)adaptor.create(GT32)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(GT32_tree, root_0);
                    }

                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:105:27: GE ^
                    {
                    GE33=(Token)match(input,GE,FOLLOW_GE_in_predicate604); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GE33_tree = 
                    (CommonTree)adaptor.create(GE33)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(GE33_tree, root_0);
                    }

                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:105:33: LE ^
                    {
                    LE34=(Token)match(input,LE,FOLLOW_LE_in_predicate609); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LE34_tree = 
                    (CommonTree)adaptor.create(LE34)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(LE34_tree, root_0);
                    }

                    }
                    break;
                case 6 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:105:39: NE ^
                    {
                    NE35=(Token)match(input,NE,FOLLOW_NE_in_predicate614); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NE35_tree = 
                    (CommonTree)adaptor.create(NE35)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(NE35_tree, root_0);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_expr_in_predicate619);
            expr36=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr36.getTree());

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:108:1: expr : simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )* ;
    public final SQLGrammarParser.expr_return expr() throws RecognitionException {
        SQLGrammarParser.expr_return retval = new SQLGrammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS38=null;
        Token MINUS39=null;
        SQLGrammarParser.simpleExpression_return simpleExpression37 =null;

        SQLGrammarParser.simpleExpression_return simpleExpression40 =null;


        CommonTree PLUS38_tree=null;
        CommonTree MINUS39_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:109:3: ( simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:110:3: simpleExpression ( ( PLUS ^| MINUS ^) simpleExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_simpleExpression_in_expr634);
            simpleExpression37=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression37.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:110:20: ( ( PLUS ^| MINUS ^) simpleExpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==MINUS||LA9_0==PLUS) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:110:21: ( PLUS ^| MINUS ^) simpleExpression
            	    {
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:110:21: ( PLUS ^| MINUS ^)
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==PLUS) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==MINUS) ) {
            	        alt8=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:110:22: PLUS ^
            	            {
            	            PLUS38=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr638); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS38_tree = 
            	            (CommonTree)adaptor.create(PLUS38)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS38_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:110:30: MINUS ^
            	            {
            	            MINUS39=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr643); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS39_tree = 
            	            (CommonTree)adaptor.create(MINUS39)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS39_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_simpleExpression_in_expr647);
            	    simpleExpression40=simpleExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression40.getTree());

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
    // $ANTLR end "expr"


    public static class simpleExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleExpression"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:113:1: simpleExpression : term ( ( MUL ^| DIV ^| MOD ^) term )* ;
    public final SQLGrammarParser.simpleExpression_return simpleExpression() throws RecognitionException {
        SQLGrammarParser.simpleExpression_return retval = new SQLGrammarParser.simpleExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MUL42=null;
        Token DIV43=null;
        Token MOD44=null;
        SQLGrammarParser.term_return term41 =null;

        SQLGrammarParser.term_return term45 =null;


        CommonTree MUL42_tree=null;
        CommonTree DIV43_tree=null;
        CommonTree MOD44_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:114:3: ( term ( ( MUL ^| DIV ^| MOD ^) term )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:115:3: term ( ( MUL ^| DIV ^| MOD ^) term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_simpleExpression664);
            term41=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term41.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:115:8: ( ( MUL ^| DIV ^| MOD ^) term )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DIV||(LA11_0 >= MOD && LA11_0 <= MUL)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:115:9: ( MUL ^| DIV ^| MOD ^) term
            	    {
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:115:9: ( MUL ^| DIV ^| MOD ^)
            	    int alt10=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:115:10: MUL ^
            	            {
            	            MUL42=(Token)match(input,MUL,FOLLOW_MUL_in_simpleExpression668); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MUL42_tree = 
            	            (CommonTree)adaptor.create(MUL42)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MUL42_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:115:17: DIV ^
            	            {
            	            DIV43=(Token)match(input,DIV,FOLLOW_DIV_in_simpleExpression673); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DIV43_tree = 
            	            (CommonTree)adaptor.create(DIV43)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIV43_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:115:24: MOD ^
            	            {
            	            MOD44=(Token)match(input,MOD,FOLLOW_MOD_in_simpleExpression678); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MOD44_tree = 
            	            (CommonTree)adaptor.create(MOD44)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MOD44_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_simpleExpression682);
            	    term45=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term45.getTree());

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
    // $ANTLR end "simpleExpression"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:118:1: term : ( identifier | value );
    public final SQLGrammarParser.term_return term() throws RecognitionException {
        SQLGrammarParser.term_return retval = new SQLGrammarParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SQLGrammarParser.identifier_return identifier46 =null;

        SQLGrammarParser.value_return value47 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:119:3: ( identifier | value )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENTIFIER) ) {
                alt12=1;
            }
            else if ( (LA12_0==DATE||LA12_0==REAL_LIT||LA12_0==STRING_LIT||(LA12_0 >= TIME && LA12_0 <= TIMESTAMP)) ) {
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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:120:3: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_term699);
                    identifier46=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier46.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:121:5: value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_value_in_term705);
                    value47=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value47.getTree());

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:124:1: value : ( number_value | string_value | date_value | time_value | timestamp_value );
    public final SQLGrammarParser.value_return value() throws RecognitionException {
        SQLGrammarParser.value_return retval = new SQLGrammarParser.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        SQLGrammarParser.number_value_return number_value48 =null;

        SQLGrammarParser.string_value_return string_value49 =null;

        SQLGrammarParser.date_value_return date_value50 =null;

        SQLGrammarParser.time_value_return time_value51 =null;

        SQLGrammarParser.timestamp_value_return timestamp_value52 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:125:3: ( number_value | string_value | date_value | time_value | timestamp_value )
            int alt13=5;
            switch ( input.LA(1) ) {
            case REAL_LIT:
                {
                alt13=1;
                }
                break;
            case STRING_LIT:
                {
                alt13=2;
                }
                break;
            case DATE:
                {
                alt13=3;
                }
                break;
            case TIME:
                {
                alt13=4;
                }
                break;
            case TIMESTAMP:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:126:3: number_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_number_value_in_value720);
                    number_value48=number_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_value48.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:127:5: string_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_string_value_in_value726);
                    string_value49=string_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value49.getTree());

                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:128:5: date_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_date_value_in_value732);
                    date_value50=date_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, date_value50.getTree());

                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:129:5: time_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_time_value_in_value738);
                    time_value51=time_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, time_value51.getTree());

                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:130:5: timestamp_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timestamp_value_in_value744);
                    timestamp_value52=timestamp_value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_value52.getTree());

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:134:1: number_value : REAL_LIT ;
    public final SQLGrammarParser.number_value_return number_value() throws RecognitionException {
        SQLGrammarParser.number_value_return retval = new SQLGrammarParser.number_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token REAL_LIT53=null;

        CommonTree REAL_LIT53_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:135:3: ( REAL_LIT )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:136:3: REAL_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            REAL_LIT53=(Token)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_number_value760); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL_LIT53_tree = 
            (CommonTree)adaptor.create(REAL_LIT53)
            ;
            adaptor.addChild(root_0, REAL_LIT53_tree);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:139:1: string_value : STRING_LIT ;
    public final SQLGrammarParser.string_value_return string_value() throws RecognitionException {
        SQLGrammarParser.string_value_return retval = new SQLGrammarParser.string_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING_LIT54=null;

        CommonTree STRING_LIT54_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:140:3: ( STRING_LIT )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:141:3: STRING_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            STRING_LIT54=(Token)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_string_value775); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING_LIT54_tree = 
            (CommonTree)adaptor.create(STRING_LIT54)
            ;
            adaptor.addChild(root_0, STRING_LIT54_tree);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:144:1: date_value : DATE string_value ;
    public final SQLGrammarParser.date_value_return date_value() throws RecognitionException {
        SQLGrammarParser.date_value_return retval = new SQLGrammarParser.date_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DATE55=null;
        SQLGrammarParser.string_value_return string_value56 =null;


        CommonTree DATE55_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:145:3: ( DATE string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:146:3: DATE string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            DATE55=(Token)match(input,DATE,FOLLOW_DATE_in_date_value790); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATE55_tree = 
            (CommonTree)adaptor.create(DATE55)
            ;
            adaptor.addChild(root_0, DATE55_tree);
            }

            pushFollow(FOLLOW_string_value_in_date_value792);
            string_value56=string_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value56.getTree());

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:149:1: time_value : TIME string_value ;
    public final SQLGrammarParser.time_value_return time_value() throws RecognitionException {
        SQLGrammarParser.time_value_return retval = new SQLGrammarParser.time_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TIME57=null;
        SQLGrammarParser.string_value_return string_value58 =null;


        CommonTree TIME57_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:150:3: ( TIME string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:151:3: TIME string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            TIME57=(Token)match(input,TIME,FOLLOW_TIME_in_time_value807); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIME57_tree = 
            (CommonTree)adaptor.create(TIME57)
            ;
            adaptor.addChild(root_0, TIME57_tree);
            }

            pushFollow(FOLLOW_string_value_in_time_value809);
            string_value58=string_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value58.getTree());

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:154:1: timestamp_value : TIMESTAMP string_value ;
    public final SQLGrammarParser.timestamp_value_return timestamp_value() throws RecognitionException {
        SQLGrammarParser.timestamp_value_return retval = new SQLGrammarParser.timestamp_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TIMESTAMP59=null;
        SQLGrammarParser.string_value_return string_value60 =null;


        CommonTree TIMESTAMP59_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:155:3: ( TIMESTAMP string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:156:3: TIMESTAMP string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            TIMESTAMP59=(Token)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_timestamp_value824); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TIMESTAMP59_tree = 
            (CommonTree)adaptor.create(TIMESTAMP59)
            ;
            adaptor.addChild(root_0, TIMESTAMP59_tree);
            }

            pushFollow(FOLLOW_string_value_in_timestamp_value826);
            string_value60=string_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, string_value60.getTree());

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:159:1: identifier : IDENTIFIER ;
    public final SQLGrammarParser.identifier_return identifier() throws RecognitionException {
        SQLGrammarParser.identifier_return retval = new SQLGrammarParser.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER61=null;

        CommonTree IDENTIFIER61_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:160:3: ( IDENTIFIER )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:161:3: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENTIFIER61=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier841); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER61_tree = 
            (CommonTree)adaptor.create(IDENTIFIER61)
            ;
            adaptor.addChild(root_0, IDENTIFIER61_tree);
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


    public static class update_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:164:1: update_statement : UPDATE identifier SET assignment_list ( where_clause )? -> ^( UPDATE identifier assignment_list ( where_clause )? ) ;
    public final SQLGrammarParser.update_statement_return update_statement() throws RecognitionException {
        SQLGrammarParser.update_statement_return retval = new SQLGrammarParser.update_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token UPDATE62=null;
        Token SET64=null;
        SQLGrammarParser.identifier_return identifier63 =null;

        SQLGrammarParser.assignment_list_return assignment_list65 =null;

        SQLGrammarParser.where_clause_return where_clause66 =null;


        CommonTree UPDATE62_tree=null;
        CommonTree SET64_tree=null;
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");
        RewriteRuleSubtreeStream stream_assignment_list=new RewriteRuleSubtreeStream(adaptor,"rule assignment_list");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:165:3: ( UPDATE identifier SET assignment_list ( where_clause )? -> ^( UPDATE identifier assignment_list ( where_clause )? ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:166:3: UPDATE identifier SET assignment_list ( where_clause )?
            {
            UPDATE62=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_statement856); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPDATE.add(UPDATE62);


            pushFollow(FOLLOW_identifier_in_update_statement858);
            identifier63=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier63.getTree());

            SET64=(Token)match(input,SET,FOLLOW_SET_in_update_statement860); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(SET64);


            pushFollow(FOLLOW_assignment_list_in_update_statement862);
            assignment_list65=assignment_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment_list.add(assignment_list65.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:166:41: ( where_clause )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==WHERE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:166:41: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_update_statement864);
                    where_clause66=where_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_where_clause.add(where_clause66.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier, where_clause, UPDATE, assignment_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 167:5: -> ^( UPDATE identifier assignment_list ( where_clause )? )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:168:7: ^( UPDATE identifier assignment_list ( where_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_UPDATE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_1, stream_assignment_list.nextTree());

                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:168:43: ( where_clause )?
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


    public static class assignment_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_list"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:171:1: assignment_list : assignment ( ',' assignment )* -> ^( UPDATE_ASSIGNMENTS ( assignment )+ ) ;
    public final SQLGrammarParser.assignment_list_return assignment_list() throws RecognitionException {
        SQLGrammarParser.assignment_list_return retval = new SQLGrammarParser.assignment_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal68=null;
        SQLGrammarParser.assignment_return assignment67 =null;

        SQLGrammarParser.assignment_return assignment69 =null;


        CommonTree char_literal68_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:172:3: ( assignment ( ',' assignment )* -> ^( UPDATE_ASSIGNMENTS ( assignment )+ ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:172:5: assignment ( ',' assignment )*
            {
            pushFollow(FOLLOW_assignment_in_assignment_list901);
            assignment67=assignment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment.add(assignment67.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:172:16: ( ',' assignment )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==54) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:172:17: ',' assignment
            	    {
            	    char_literal68=(Token)match(input,54,FOLLOW_54_in_assignment_list904); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_54.add(char_literal68);


            	    pushFollow(FOLLOW_assignment_in_assignment_list906);
            	    assignment69=assignment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_assignment.add(assignment69.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
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
            // 172:34: -> ^( UPDATE_ASSIGNMENTS ( assignment )+ )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:172:37: ^( UPDATE_ASSIGNMENTS ( assignment )+ )
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:175:1: assignment : identifier EQ expr -> ^( EQ identifier expr ) ;
    public final SQLGrammarParser.assignment_return assignment() throws RecognitionException {
        SQLGrammarParser.assignment_return retval = new SQLGrammarParser.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ71=null;
        SQLGrammarParser.identifier_return identifier70 =null;

        SQLGrammarParser.expr_return expr72 =null;


        CommonTree EQ71_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:176:3: ( identifier EQ expr -> ^( EQ identifier expr ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:176:5: identifier EQ expr
            {
            pushFollow(FOLLOW_identifier_in_assignment930);
            identifier70=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier70.getTree());

            EQ71=(Token)match(input,EQ,FOLLOW_EQ_in_assignment932); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ71);


            pushFollow(FOLLOW_expr_in_assignment934);
            expr72=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr72.getTree());

            // AST REWRITE
            // elements: identifier, EQ, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 176:24: -> ^( EQ identifier expr )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:176:27: ^( EQ identifier expr )
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


    public static class insert_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "insert_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:179:1: insert_statement : INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN -> ^( INSERT ^( INTO identifier ) identifier_list expression_list ) ;
    public final SQLGrammarParser.insert_statement_return insert_statement() throws RecognitionException {
        SQLGrammarParser.insert_statement_return retval = new SQLGrammarParser.insert_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INSERT73=null;
        Token INTO74=null;
        Token LPAREN76=null;
        Token RPAREN78=null;
        Token VALUES79=null;
        Token LPAREN80=null;
        Token RPAREN82=null;
        SQLGrammarParser.identifier_return identifier75 =null;

        SQLGrammarParser.identifier_list_return identifier_list77 =null;

        SQLGrammarParser.expression_list_return expression_list81 =null;


        CommonTree INSERT73_tree=null;
        CommonTree INTO74_tree=null;
        CommonTree LPAREN76_tree=null;
        CommonTree RPAREN78_tree=null;
        CommonTree VALUES79_tree=null;
        CommonTree LPAREN80_tree=null;
        CommonTree RPAREN82_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_INSERT=new RewriteRuleTokenStream(adaptor,"token INSERT");
        RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_VALUES=new RewriteRuleTokenStream(adaptor,"token VALUES");
        RewriteRuleSubtreeStream stream_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule expression_list");
        RewriteRuleSubtreeStream stream_identifier_list=new RewriteRuleSubtreeStream(adaptor,"rule identifier_list");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:180:3: ( INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN -> ^( INSERT ^( INTO identifier ) identifier_list expression_list ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:181:3: INSERT INTO identifier LPAREN identifier_list RPAREN VALUES LPAREN expression_list RPAREN
            {
            INSERT73=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_statement959); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INSERT.add(INSERT73);


            INTO74=(Token)match(input,INTO,FOLLOW_INTO_in_insert_statement961); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INTO.add(INTO74);


            pushFollow(FOLLOW_identifier_in_insert_statement963);
            identifier75=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier75.getTree());

            LPAREN76=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_statement965); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN76);


            pushFollow(FOLLOW_identifier_list_in_insert_statement967);
            identifier_list77=identifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier_list.add(identifier_list77.getTree());

            RPAREN78=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_statement969); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN78);


            VALUES79=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_statement971); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VALUES.add(VALUES79);


            LPAREN80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_statement973); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN80);


            pushFollow(FOLLOW_expression_list_in_insert_statement975);
            expression_list81=expression_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression_list.add(expression_list81.getTree());

            RPAREN82=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_statement977); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN82);


            // AST REWRITE
            // elements: expression_list, identifier, INSERT, INTO, identifier_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 182:4: -> ^( INSERT ^( INTO identifier ) identifier_list expression_list )
            {
                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:183:5: ^( INSERT ^( INTO identifier ) identifier_list expression_list )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_INSERT.nextNode()
                , root_1);

                // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:183:14: ^( INTO identifier )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_INTO.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_identifier.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:186:1: delete_statement : DELETE FROM identifier ( where_clause )? ;
    public final SQLGrammarParser.delete_statement_return delete_statement() throws RecognitionException {
        SQLGrammarParser.delete_statement_return retval = new SQLGrammarParser.delete_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DELETE83=null;
        Token FROM84=null;
        SQLGrammarParser.identifier_return identifier85 =null;

        SQLGrammarParser.where_clause_return where_clause86 =null;


        CommonTree DELETE83_tree=null;
        CommonTree FROM84_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:187:3: ( DELETE FROM identifier ( where_clause )? )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:188:3: DELETE FROM identifier ( where_clause )?
            {
            root_0 = (CommonTree)adaptor.nil();


            DELETE83=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_statement1015); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DELETE83_tree = 
            (CommonTree)adaptor.create(DELETE83)
            ;
            adaptor.addChild(root_0, DELETE83_tree);
            }

            FROM84=(Token)match(input,FROM,FOLLOW_FROM_in_delete_statement1017); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FROM84_tree = 
            (CommonTree)adaptor.create(FROM84)
            ;
            adaptor.addChild(root_0, FROM84_tree);
            }

            pushFollow(FOLLOW_identifier_in_delete_statement1019);
            identifier85=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier85.getTree());

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:188:26: ( where_clause )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==WHERE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:188:26: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_delete_statement1021);
                    where_clause86=where_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, where_clause86.getTree());

                    }
                    break;

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:191:1: create_statement : CREATE ;
    public final SQLGrammarParser.create_statement_return create_statement() throws RecognitionException {
        SQLGrammarParser.create_statement_return retval = new SQLGrammarParser.create_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CREATE87=null;

        CommonTree CREATE87_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:192:3: ( CREATE )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:193:3: CREATE
            {
            root_0 = (CommonTree)adaptor.nil();


            CREATE87=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_statement1037); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CREATE87_tree = 
            (CommonTree)adaptor.create(CREATE87)
            ;
            adaptor.addChild(root_0, CREATE87_tree);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:196:1: drop_statement : DROP ;
    public final SQLGrammarParser.drop_statement_return drop_statement() throws RecognitionException {
        SQLGrammarParser.drop_statement_return retval = new SQLGrammarParser.drop_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DROP88=null;

        CommonTree DROP88_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:197:3: ( DROP )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:198:3: DROP
            {
            root_0 = (CommonTree)adaptor.nil();


            DROP88=(Token)match(input,DROP,FOLLOW_DROP_in_drop_statement1052); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DROP88_tree = 
            (CommonTree)adaptor.create(DROP88)
            ;
            adaptor.addChild(root_0, DROP88_tree);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:201:1: alter_statement : ALTER ;
    public final SQLGrammarParser.alter_statement_return alter_statement() throws RecognitionException {
        SQLGrammarParser.alter_statement_return retval = new SQLGrammarParser.alter_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ALTER89=null;

        CommonTree ALTER89_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:202:3: ( ALTER )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLGrammar.g:203:3: ALTER
            {
            root_0 = (CommonTree)adaptor.nil();


            ALTER89=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_statement1067); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ALTER89_tree = 
            (CommonTree)adaptor.create(ALTER89)
            ;
            adaptor.addChild(root_0, ALTER89_tree);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_sql_statement_in_query327 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEMI_in_query329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_sql_statement344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_sql_statement350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_sql_statement356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_sql_statement362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_statement_in_sql_statement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_statement_in_sql_statement374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_statement_in_sql_statement380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement395 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_expression_list_in_select_statement397 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_FROM_in_select_statement399 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_list_in_select_statement401 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_where_clause_in_select_statement404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expression_list444 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_expression_list447 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_expr_in_expression_list449 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list485 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_identifier_list488 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_identifier_list491 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clause505 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_predicate_list_in_where_clause507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_predicate_list540 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_OR_in_predicate_list543 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_andExpr_in_predicate_list546 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_predicate_in_andExpr563 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_andExpr566 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_predicate_in_andExpr569 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_expr_in_predicate586 = new BitSet(new long[]{0x00000001120C4000L});
    public static final BitSet FOLLOW_EQ_in_predicate589 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_LT_in_predicate594 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_GT_in_predicate599 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_GE_in_predicate604 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_LE_in_predicate609 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_NE_in_predicate614 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_expr_in_predicate619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expr634 = new BitSet(new long[]{0x0000000820000002L});
    public static final BitSet FOLLOW_PLUS_in_expr638 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_MINUS_in_expr643 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_simpleExpression_in_expr647 = new BitSet(new long[]{0x0000000820000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression664 = new BitSet(new long[]{0x00000000C0001002L});
    public static final BitSet FOLLOW_MUL_in_simpleExpression668 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_DIV_in_simpleExpression673 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_MOD_in_simpleExpression678 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_term_in_simpleExpression682 = new BitSet(new long[]{0x00000000C0001002L});
    public static final BitSet FOLLOW_identifier_in_term699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_value_in_value720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_value_in_value726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_value_in_value732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_value_in_value738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestamp_value_in_value744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_number_value760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LIT_in_string_value775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_date_value790 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_string_value_in_date_value792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_time_value807 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_string_value_in_time_value809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_timestamp_value824 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_string_value_in_timestamp_value826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_statement856 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_update_statement858 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SET_in_update_statement860 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_assignment_list_in_update_statement862 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_where_clause_in_update_statement864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_assignment_list901 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_assignment_list904 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_assignment_in_assignment_list906 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignment930 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EQ_in_assignment932 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_expr_in_assignment934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_statement959 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INTO_in_insert_statement961 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_insert_statement963 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_statement965 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_list_in_insert_statement967 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_statement969 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_statement971 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_statement973 = new BitSet(new long[]{0x0000682000100100L});
    public static final BitSet FOLLOW_expression_list_in_insert_statement975 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_statement977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_statement1015 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_FROM_in_delete_statement1017 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_in_delete_statement1019 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_where_clause_in_delete_statement1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_statement1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_statement1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_statement1067 = new BitSet(new long[]{0x0000000000000002L});

}