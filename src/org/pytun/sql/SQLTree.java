// $ANTLR 3.4 D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g 2012-07-01 15:34:46

package org.pytun.sql;
import java.util.List;
import java.util.LinkedList;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SQLTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALTER", "AND", "CHAR", "CREATE", "DATE", "DELETE", "DELETE_STMT", "DIGIT", "DIV", "DROP", "EQ", "EXPR_LIST", "FLOAT", "FROM", "GE", "GT", "IDENTIFIER", "INSERT", "INSERT_STMT", "INT", "INTO", "LE", "LETTER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NE", "NEWLINE", "OR", "PLUS", "PREDICATE_LIST", "REAL_LIT", "RPAREN", "SELECT", "SELECT_STMT", "SEMI", "SET", "STRING_LIT", "TABLE_LIST", "TIME", "TIMESTAMP", "UPDATE", "UPDATE_ASSIGNMENTS", "UPDATE_STMT", "VALUES", "VARCHAR", "WHERE", "WHITESPACE", "','", "INTEGER_LIT"
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
    public static final int INTEGER_LIT=55;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SQLTree(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SQLTree(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SQLTree.tokenNames; }
    public String getGrammarFileName() { return "D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g"; }


    public static class query_return extends TreeRuleReturnScope {
        public Query q;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:16:1: query returns [Query q] : statement SEMI ;
    public final SQLTree.query_return query() throws RecognitionException {
        SQLTree.query_return retval = new SQLTree.query_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SEMI2=null;
        SQLTree.statement_return statement1 =null;


        CommonTree SEMI2_tree=null;


        retval.q = new Query(((CommonTree)retval.start));

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:20:3: ( statement SEMI )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:21:3: statement SEMI
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_statement_in_query91);
            statement1=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement1.getTree());


            _last = (CommonTree)input.LT(1);
            SEMI2=(CommonTree)match(input,SEMI,FOLLOW_SEMI_in_query93); 
            SEMI2_tree = (CommonTree)adaptor.dupNode(SEMI2);


            adaptor.addChild(root_0, SEMI2_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "query"


    public static class statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:24:1: statement : sql_statement ;
    public final SQLTree.statement_return statement() throws RecognitionException {
        SQLTree.statement_return retval = new SQLTree.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.sql_statement_return sql_statement3 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:25:3: ( sql_statement )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:26:3: sql_statement
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_sql_statement_in_statement108);
            sql_statement3=sql_statement();

            state._fsp--;

            adaptor.addChild(root_0, sql_statement3.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class sql_statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sql_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:29:1: sql_statement : ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement );
    public final SQLTree.sql_statement_return sql_statement() throws RecognitionException {
        SQLTree.sql_statement_return retval = new SQLTree.sql_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.select_statement_return select_statement4 =null;

        SQLTree.update_statement_return update_statement5 =null;

        SQLTree.insert_statement_return insert_statement6 =null;

        SQLTree.delete_statement_return delete_statement7 =null;

        SQLTree.create_statement_return create_statement8 =null;

        SQLTree.drop_statement_return drop_statement9 =null;

        SQLTree.alter_statement_return alter_statement10 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:30:3: ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement )
            int alt1=7;
            switch ( input.LA(1) ) {
            case SELECT_STMT:
                {
                alt1=1;
                }
                break;
            case UPDATE:
                {
                alt1=2;
                }
                break;
            case DELETE:
                {
                alt1=3;
                }
                break;
            case INSERT:
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
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:31:3: select_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_select_statement_in_sql_statement123);
                    select_statement4=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement4.getTree());


                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:32:5: update_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_update_statement_in_sql_statement129);
                    update_statement5=update_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, update_statement5.getTree());


                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:33:5: insert_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_insert_statement_in_sql_statement135);
                    insert_statement6=insert_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_statement6.getTree());


                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:34:5: delete_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_delete_statement_in_sql_statement141);
                    delete_statement7=delete_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_statement7.getTree());


                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:35:5: create_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_create_statement_in_sql_statement147);
                    create_statement8=create_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, create_statement8.getTree());


                    }
                    break;
                case 6 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:36:5: drop_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_drop_statement_in_sql_statement153);
                    drop_statement9=drop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_statement9.getTree());


                    }
                    break;
                case 7 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:37:5: alter_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_alter_statement_in_sql_statement159);
                    alter_statement10=alter_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_statement10.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sql_statement"


    public static class select_statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:40:1: select_statement : ^( SELECT_STMT select_list table_list optional_clause ) ;
    public final SQLTree.select_statement_return select_statement() throws RecognitionException {
        SQLTree.select_statement_return retval = new SQLTree.select_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT_STMT11=null;
        SQLTree.select_list_return select_list12 =null;

        SQLTree.table_list_return table_list13 =null;

        SQLTree.optional_clause_return optional_clause14 =null;


        CommonTree SELECT_STMT11_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:41:3: ( ^( SELECT_STMT select_list table_list optional_clause ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:42:3: ^( SELECT_STMT select_list table_list optional_clause )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SELECT_STMT11=(CommonTree)match(input,SELECT_STMT,FOLLOW_SELECT_STMT_in_select_statement175); 
            SELECT_STMT11_tree = (CommonTree)adaptor.dupNode(SELECT_STMT11);


            root_1 = (CommonTree)adaptor.becomeRoot(SELECT_STMT11_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_select_list_in_select_statement177);
            select_list12=select_list();

            state._fsp--;

            adaptor.addChild(root_1, select_list12.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_table_list_in_select_statement179);
            table_list13=table_list();

            state._fsp--;

            adaptor.addChild(root_1, table_list13.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_optional_clause_in_select_statement181);
            optional_clause14=optional_clause();

            state._fsp--;

            adaptor.addChild(root_1, optional_clause14.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_statement"


    public static class select_list_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_list"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:45:1: select_list : ^( EXPR_LIST ( expr )+ ) ;
    public final SQLTree.select_list_return select_list() throws RecognitionException {
        SQLTree.select_list_return retval = new SQLTree.select_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXPR_LIST15=null;
        SQLTree.expr_return expr16 =null;


        CommonTree EXPR_LIST15_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:46:3: ( ^( EXPR_LIST ( expr )+ ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:47:3: ^( EXPR_LIST ( expr )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXPR_LIST15=(CommonTree)match(input,EXPR_LIST,FOLLOW_EXPR_LIST_in_select_list198); 
            EXPR_LIST15_tree = (CommonTree)adaptor.dupNode(EXPR_LIST15);


            root_1 = (CommonTree)adaptor.becomeRoot(EXPR_LIST15_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:47:15: ( expr )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DATE||LA2_0==IDENTIFIER||LA2_0==REAL_LIT||LA2_0==STRING_LIT||(LA2_0 >= TIME && LA2_0 <= TIMESTAMP)||LA2_0==INTEGER_LIT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:47:15: expr
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expr_in_select_list200);
            	    expr16=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_1, expr16.getTree());


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


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_list"


    public static class table_list_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_list"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:50:1: table_list : ^( TABLE_LIST ( identifier )+ ) ;
    public final SQLTree.table_list_return table_list() throws RecognitionException {
        SQLTree.table_list_return retval = new SQLTree.table_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLE_LIST17=null;
        SQLTree.identifier_return identifier18 =null;


        CommonTree TABLE_LIST17_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:51:3: ( ^( TABLE_LIST ( identifier )+ ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:52:3: ^( TABLE_LIST ( identifier )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TABLE_LIST17=(CommonTree)match(input,TABLE_LIST,FOLLOW_TABLE_LIST_in_table_list218); 
            TABLE_LIST17_tree = (CommonTree)adaptor.dupNode(TABLE_LIST17);


            root_1 = (CommonTree)adaptor.becomeRoot(TABLE_LIST17_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:52:16: ( identifier )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDENTIFIER) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:52:16: identifier
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_identifier_in_table_list220);
            	    identifier18=identifier();

            	    state._fsp--;

            	    adaptor.addChild(root_1, identifier18.getTree());


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


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_list"


    public static class optional_clause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optional_clause"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:55:1: optional_clause : ^( PREDICATE_LIST condition_list ) ;
    public final SQLTree.optional_clause_return optional_clause() throws RecognitionException {
        SQLTree.optional_clause_return retval = new SQLTree.optional_clause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PREDICATE_LIST19=null;
        SQLTree.condition_list_return condition_list20 =null;


        CommonTree PREDICATE_LIST19_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:56:3: ( ^( PREDICATE_LIST condition_list ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:57:3: ^( PREDICATE_LIST condition_list )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PREDICATE_LIST19=(CommonTree)match(input,PREDICATE_LIST,FOLLOW_PREDICATE_LIST_in_optional_clause238); 
            PREDICATE_LIST19_tree = (CommonTree)adaptor.dupNode(PREDICATE_LIST19);


            root_1 = (CommonTree)adaptor.becomeRoot(PREDICATE_LIST19_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_condition_list_in_optional_clause240);
            condition_list20=condition_list();

            state._fsp--;

            adaptor.addChild(root_1, condition_list20.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "optional_clause"


    public static class condition_list_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_list"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:60:1: condition_list : orExpr ;
    public final SQLTree.condition_list_return condition_list() throws RecognitionException {
        SQLTree.condition_list_return retval = new SQLTree.condition_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.orExpr_return orExpr21 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:61:3: ( orExpr )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:63:3: orExpr
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_orExpr_in_condition_list259);
            orExpr21=orExpr();

            state._fsp--;

            adaptor.addChild(root_0, orExpr21.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition_list"


    public static class condition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:66:1: condition : ^( relational_operator expr expr ) ;
    public final SQLTree.condition_return condition() throws RecognitionException {
        SQLTree.condition_return retval = new SQLTree.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.relational_operator_return relational_operator22 =null;

        SQLTree.expr_return expr23 =null;

        SQLTree.expr_return expr24 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:67:3: ( ^( relational_operator expr expr ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:68:3: ^( relational_operator expr expr )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_relational_operator_in_condition275);
            relational_operator22=relational_operator();

            state._fsp--;

            root_1 = (CommonTree)adaptor.becomeRoot(relational_operator22.getTree(), root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_condition277);
            expr23=expr();

            state._fsp--;

            adaptor.addChild(root_1, expr23.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_condition279);
            expr24=expr();

            state._fsp--;

            adaptor.addChild(root_1, expr24.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class orExpr_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orExpr"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:71:1: orExpr : andExpr ( OR ^ andExpr )* ;
    public final SQLTree.orExpr_return orExpr() throws RecognitionException {
        SQLTree.orExpr_return retval = new SQLTree.orExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OR26=null;
        SQLTree.andExpr_return andExpr25 =null;

        SQLTree.andExpr_return andExpr27 =null;


        CommonTree OR26_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:72:3: ( andExpr ( OR ^ andExpr )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:73:3: andExpr ( OR ^ andExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_andExpr_in_orExpr295);
            andExpr25=andExpr();

            state._fsp--;

            adaptor.addChild(root_0, andExpr25.getTree());


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:74:3: ( OR ^ andExpr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==OR) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:75:5: OR ^ andExpr
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    OR26=(CommonTree)match(input,OR,FOLLOW_OR_in_orExpr305); 
            	    OR26_tree = (CommonTree)adaptor.dupNode(OR26);


            	    root_0 = (CommonTree)adaptor.becomeRoot(OR26_tree, root_0);


            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_andExpr_in_orExpr308);
            	    andExpr27=andExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, andExpr27.getTree());


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orExpr"


    public static class andExpr_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andExpr"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:79:1: andExpr : condition ( AND ^ condition )* ;
    public final SQLTree.andExpr_return andExpr() throws RecognitionException {
        SQLTree.andExpr_return retval = new SQLTree.andExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AND29=null;
        SQLTree.condition_return condition28 =null;

        SQLTree.condition_return condition30 =null;


        CommonTree AND29_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:80:3: ( condition ( AND ^ condition )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:81:3: condition ( AND ^ condition )*
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_condition_in_andExpr328);
            condition28=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition28.getTree());


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:82:3: ( AND ^ condition )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==AND) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:83:5: AND ^ condition
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    AND29=(CommonTree)match(input,AND,FOLLOW_AND_in_andExpr338); 
            	    AND29_tree = (CommonTree)adaptor.dupNode(AND29);


            	    root_0 = (CommonTree)adaptor.becomeRoot(AND29_tree, root_0);


            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_condition_in_andExpr341);
            	    condition30=condition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, condition30.getTree());


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "andExpr"


    public static class expr_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:87:1: expr : term ( arithmetic_operator term )* ;
    public final SQLTree.expr_return expr() throws RecognitionException {
        SQLTree.expr_return retval = new SQLTree.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.term_return term31 =null;

        SQLTree.arithmetic_operator_return arithmetic_operator32 =null;

        SQLTree.term_return term33 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:88:3: ( term ( arithmetic_operator term )* )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:89:3: term ( arithmetic_operator term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_term_in_expr361);
            term31=term();

            state._fsp--;

            adaptor.addChild(root_0, term31.getTree());


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:90:3: ( arithmetic_operator term )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DIV||(LA6_0 >= MINUS && LA6_0 <= MUL)||LA6_0==PLUS) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:91:5: arithmetic_operator term
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_arithmetic_operator_in_expr371);
            	    arithmetic_operator32=arithmetic_operator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arithmetic_operator32.getTree());


            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_term_in_expr373);
            	    term33=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term33.getTree());


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class term_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:95:1: term : ( identifier | value );
    public final SQLTree.term_return term() throws RecognitionException {
        SQLTree.term_return retval = new SQLTree.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.identifier_return identifier34 =null;

        SQLTree.value_return value35 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:96:3: ( identifier | value )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENTIFIER) ) {
                alt7=1;
            }
            else if ( (LA7_0==DATE||LA7_0==REAL_LIT||LA7_0==STRING_LIT||(LA7_0 >= TIME && LA7_0 <= TIMESTAMP)||LA7_0==INTEGER_LIT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:97:3: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_term393);
                    identifier34=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier34.getTree());


                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:98:5: value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_value_in_term399);
                    value35=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value35.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class value_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:101:1: value : ( int_value | float_value | string_value | date_value | time_value | timestamp_value );
    public final SQLTree.value_return value() throws RecognitionException {
        SQLTree.value_return retval = new SQLTree.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.int_value_return int_value36 =null;

        SQLTree.float_value_return float_value37 =null;

        SQLTree.string_value_return string_value38 =null;

        SQLTree.date_value_return date_value39 =null;

        SQLTree.time_value_return time_value40 =null;

        SQLTree.timestamp_value_return timestamp_value41 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:102:3: ( int_value | float_value | string_value | date_value | time_value | timestamp_value )
            int alt8=6;
            switch ( input.LA(1) ) {
            case INTEGER_LIT:
                {
                alt8=1;
                }
                break;
            case REAL_LIT:
                {
                alt8=2;
                }
                break;
            case STRING_LIT:
                {
                alt8=3;
                }
                break;
            case DATE:
                {
                alt8=4;
                }
                break;
            case TIME:
                {
                alt8=5;
                }
                break;
            case TIMESTAMP:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:103:3: int_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_int_value_in_value414);
                    int_value36=int_value();

                    state._fsp--;

                    adaptor.addChild(root_0, int_value36.getTree());


                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:104:5: float_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_float_value_in_value420);
                    float_value37=float_value();

                    state._fsp--;

                    adaptor.addChild(root_0, float_value37.getTree());


                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:105:5: string_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_string_value_in_value426);
                    string_value38=string_value();

                    state._fsp--;

                    adaptor.addChild(root_0, string_value38.getTree());


                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:106:5: date_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_date_value_in_value432);
                    date_value39=date_value();

                    state._fsp--;

                    adaptor.addChild(root_0, date_value39.getTree());


                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:107:5: time_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_time_value_in_value438);
                    time_value40=time_value();

                    state._fsp--;

                    adaptor.addChild(root_0, time_value40.getTree());


                    }
                    break;
                case 6 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:108:5: timestamp_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_timestamp_value_in_value444);
                    timestamp_value41=timestamp_value();

                    state._fsp--;

                    adaptor.addChild(root_0, timestamp_value41.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value"


    public static class int_value_return extends TreeRuleReturnScope {
        public int value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "int_value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:111:1: int_value returns [int value] : INTEGER_LIT ;
    public final SQLTree.int_value_return int_value() throws RecognitionException {
        SQLTree.int_value_return retval = new SQLTree.int_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTEGER_LIT42=null;

        CommonTree INTEGER_LIT42_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:112:3: ( INTEGER_LIT )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:113:3: INTEGER_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INTEGER_LIT42=(CommonTree)match(input,INTEGER_LIT,FOLLOW_INTEGER_LIT_in_int_value463); 
            INTEGER_LIT42_tree = (CommonTree)adaptor.dupNode(INTEGER_LIT42);


            adaptor.addChild(root_0, INTEGER_LIT42_tree);



                           retval.value = Integer.parseInt((INTEGER_LIT42!=null?INTEGER_LIT42.getText():null));
                          

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "int_value"


    public static class float_value_return extends TreeRuleReturnScope {
        public double value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "float_value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:119:1: float_value returns [double value] : REAL_LIT ;
    public final SQLTree.float_value_return float_value() throws RecognitionException {
        SQLTree.float_value_return retval = new SQLTree.float_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REAL_LIT43=null;

        CommonTree REAL_LIT43_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:120:3: ( REAL_LIT )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:121:3: REAL_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            REAL_LIT43=(CommonTree)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_float_value499); 
            REAL_LIT43_tree = (CommonTree)adaptor.dupNode(REAL_LIT43);


            adaptor.addChild(root_0, REAL_LIT43_tree);



                        retval.value = Double.parseDouble((REAL_LIT43!=null?REAL_LIT43.getText():null));
                       

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "float_value"


    public static class string_value_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string_value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:127:1: string_value returns [String value] : STRING_LIT ;
    public final SQLTree.string_value_return string_value() throws RecognitionException {
        SQLTree.string_value_return retval = new SQLTree.string_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STRING_LIT44=null;

        CommonTree STRING_LIT44_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:128:3: ( STRING_LIT )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:129:3: STRING_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            STRING_LIT44=(CommonTree)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_string_value532); 
            STRING_LIT44_tree = (CommonTree)adaptor.dupNode(STRING_LIT44);


            adaptor.addChild(root_0, STRING_LIT44_tree);



                              retval.value = (STRING_LIT44!=null?STRING_LIT44.getText():null);
                             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string_value"


    public static class date_value_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "date_value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:135:1: date_value : DATE string_value ;
    public final SQLTree.date_value_return date_value() throws RecognitionException {
        SQLTree.date_value_return retval = new SQLTree.date_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DATE45=null;
        SQLTree.string_value_return string_value46 =null;


        CommonTree DATE45_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:136:3: ( DATE string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:137:3: DATE string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            DATE45=(CommonTree)match(input,DATE,FOLLOW_DATE_in_date_value566); 
            DATE45_tree = (CommonTree)adaptor.dupNode(DATE45);


            adaptor.addChild(root_0, DATE45_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_value_in_date_value568);
            string_value46=string_value();

            state._fsp--;

            adaptor.addChild(root_0, string_value46.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "date_value"


    public static class time_value_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "time_value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:140:1: time_value : TIME string_value ;
    public final SQLTree.time_value_return time_value() throws RecognitionException {
        SQLTree.time_value_return retval = new SQLTree.time_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TIME47=null;
        SQLTree.string_value_return string_value48 =null;


        CommonTree TIME47_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:141:3: ( TIME string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:142:3: TIME string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            TIME47=(CommonTree)match(input,TIME,FOLLOW_TIME_in_time_value583); 
            TIME47_tree = (CommonTree)adaptor.dupNode(TIME47);


            adaptor.addChild(root_0, TIME47_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_value_in_time_value585);
            string_value48=string_value();

            state._fsp--;

            adaptor.addChild(root_0, string_value48.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "time_value"


    public static class timestamp_value_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timestamp_value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:145:1: timestamp_value : TIMESTAMP string_value ;
    public final SQLTree.timestamp_value_return timestamp_value() throws RecognitionException {
        SQLTree.timestamp_value_return retval = new SQLTree.timestamp_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TIMESTAMP49=null;
        SQLTree.string_value_return string_value50 =null;


        CommonTree TIMESTAMP49_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:146:3: ( TIMESTAMP string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:147:3: TIMESTAMP string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            TIMESTAMP49=(CommonTree)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_timestamp_value600); 
            TIMESTAMP49_tree = (CommonTree)adaptor.dupNode(TIMESTAMP49);


            adaptor.addChild(root_0, TIMESTAMP49_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_value_in_timestamp_value602);
            string_value50=string_value();

            state._fsp--;

            adaptor.addChild(root_0, string_value50.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "timestamp_value"


    public static class identifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:150:1: identifier : IDENTIFIER ;
    public final SQLTree.identifier_return identifier() throws RecognitionException {
        SQLTree.identifier_return retval = new SQLTree.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER51=null;

        CommonTree IDENTIFIER51_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:151:3: ( IDENTIFIER )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:152:3: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER51=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier617); 
            IDENTIFIER51_tree = (CommonTree)adaptor.dupNode(IDENTIFIER51);


            adaptor.addChild(root_0, IDENTIFIER51_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class update_statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:155:1: update_statement : UPDATE ;
    public final SQLTree.update_statement_return update_statement() throws RecognitionException {
        SQLTree.update_statement_return retval = new SQLTree.update_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UPDATE52=null;

        CommonTree UPDATE52_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:156:3: ( UPDATE )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:157:3: UPDATE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            UPDATE52=(CommonTree)match(input,UPDATE,FOLLOW_UPDATE_in_update_statement632); 
            UPDATE52_tree = (CommonTree)adaptor.dupNode(UPDATE52);


            adaptor.addChild(root_0, UPDATE52_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "update_statement"


    public static class insert_statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "insert_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:160:1: insert_statement : DELETE ;
    public final SQLTree.insert_statement_return insert_statement() throws RecognitionException {
        SQLTree.insert_statement_return retval = new SQLTree.insert_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE53=null;

        CommonTree DELETE53_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:161:3: ( DELETE )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:162:3: DELETE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            DELETE53=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_insert_statement647); 
            DELETE53_tree = (CommonTree)adaptor.dupNode(DELETE53);


            adaptor.addChild(root_0, DELETE53_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "insert_statement"


    public static class delete_statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delete_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:165:1: delete_statement : INSERT ;
    public final SQLTree.delete_statement_return delete_statement() throws RecognitionException {
        SQLTree.delete_statement_return retval = new SQLTree.delete_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT54=null;

        CommonTree INSERT54_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:166:3: ( INSERT )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:167:3: INSERT
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INSERT54=(CommonTree)match(input,INSERT,FOLLOW_INSERT_in_delete_statement662); 
            INSERT54_tree = (CommonTree)adaptor.dupNode(INSERT54);


            adaptor.addChild(root_0, INSERT54_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "delete_statement"


    public static class create_statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:170:1: create_statement : CREATE ;
    public final SQLTree.create_statement_return create_statement() throws RecognitionException {
        SQLTree.create_statement_return retval = new SQLTree.create_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CREATE55=null;

        CommonTree CREATE55_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:171:3: ( CREATE )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:172:3: CREATE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            CREATE55=(CommonTree)match(input,CREATE,FOLLOW_CREATE_in_create_statement677); 
            CREATE55_tree = (CommonTree)adaptor.dupNode(CREATE55);


            adaptor.addChild(root_0, CREATE55_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_statement"


    public static class drop_statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:175:1: drop_statement : DROP ;
    public final SQLTree.drop_statement_return drop_statement() throws RecognitionException {
        SQLTree.drop_statement_return retval = new SQLTree.drop_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DROP56=null;

        CommonTree DROP56_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:176:3: ( DROP )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:177:3: DROP
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            DROP56=(CommonTree)match(input,DROP,FOLLOW_DROP_in_drop_statement692); 
            DROP56_tree = (CommonTree)adaptor.dupNode(DROP56);


            adaptor.addChild(root_0, DROP56_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drop_statement"


    public static class alter_statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alter_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:180:1: alter_statement : ALTER ;
    public final SQLTree.alter_statement_return alter_statement() throws RecognitionException {
        SQLTree.alter_statement_return retval = new SQLTree.alter_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ALTER57=null;

        CommonTree ALTER57_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:181:3: ( ALTER )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:182:3: ALTER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            ALTER57=(CommonTree)match(input,ALTER,FOLLOW_ALTER_in_alter_statement707); 
            ALTER57_tree = (CommonTree)adaptor.dupNode(ALTER57);


            adaptor.addChild(root_0, ALTER57_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alter_statement"


    public static class arithmetic_operator_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arithmetic_operator"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:185:1: arithmetic_operator : ( PLUS | MINUS | MUL | DIV | MOD );
    public final SQLTree.arithmetic_operator_return arithmetic_operator() throws RecognitionException {
        SQLTree.arithmetic_operator_return retval = new SQLTree.arithmetic_operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set58=null;

        CommonTree set58_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:186:3: ( PLUS | MINUS | MUL | DIV | MOD )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set58=(CommonTree)input.LT(1);

            if ( input.LA(1)==DIV||(input.LA(1) >= MINUS && input.LA(1) <= MUL)||input.LA(1)==PLUS ) {
                input.consume();
                set58_tree = (CommonTree)adaptor.dupNode(set58);


                adaptor.addChild(root_0, set58_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arithmetic_operator"


    public static class relational_operator_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_operator"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:194:1: relational_operator : ( EQ | LT | GT | GE | LE | NE );
    public final SQLTree.relational_operator_return relational_operator() throws RecognitionException {
        SQLTree.relational_operator_return retval = new SQLTree.relational_operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set59=null;

        CommonTree set59_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:195:3: ( EQ | LT | GT | GE | LE | NE )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set59=(CommonTree)input.LT(1);

            if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
                input.consume();
                set59_tree = (CommonTree)adaptor.dupNode(set59);


                adaptor.addChild(root_0, set59_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relational_operator"


    public static class boolean_operator_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_operator"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:204:1: boolean_operator : ( AND ^| OR ^);
    public final SQLTree.boolean_operator_return boolean_operator() throws RecognitionException {
        SQLTree.boolean_operator_return retval = new SQLTree.boolean_operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AND60=null;
        CommonTree OR61=null;

        CommonTree AND60_tree=null;
        CommonTree OR61_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:205:3: ( AND ^| OR ^)
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==AND) ) {
                alt9=1;
            }
            else if ( (LA9_0==OR) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:206:3: AND ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    AND60=(CommonTree)match(input,AND,FOLLOW_AND_in_boolean_operator806); 
                    AND60_tree = (CommonTree)adaptor.dupNode(AND60);


                    root_0 = (CommonTree)adaptor.becomeRoot(AND60_tree, root_0);


                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:207:5: OR ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    OR61=(CommonTree)match(input,OR,FOLLOW_OR_in_boolean_operator813); 
                    OR61_tree = (CommonTree)adaptor.dupNode(OR61);


                    root_0 = (CommonTree)adaptor.becomeRoot(OR61_tree, root_0);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_operator"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_query91 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEMI_in_query93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_statement_in_statement108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_sql_statement123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_sql_statement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_sql_statement135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_sql_statement141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_statement_in_sql_statement147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_statement_in_sql_statement153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_statement_in_sql_statement159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_STMT_in_select_statement175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_select_list_in_select_statement177 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_table_list_in_select_statement179 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_optional_clause_in_select_statement181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPR_LIST_in_select_list198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_select_list200 = new BitSet(new long[]{0x0080682000100108L});
    public static final BitSet FOLLOW_TABLE_LIST_in_table_list218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_table_list220 = new BitSet(new long[]{0x0000000000100008L});
    public static final BitSet FOLLOW_PREDICATE_LIST_in_optional_clause238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_list_in_optional_clause240 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_orExpr_in_condition_list259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relational_operator_in_condition275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_condition277 = new BitSet(new long[]{0x0080682000100100L});
    public static final BitSet FOLLOW_expr_in_condition279 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_andExpr_in_orExpr295 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_OR_in_orExpr305 = new BitSet(new long[]{0x00000001120C4000L});
    public static final BitSet FOLLOW_andExpr_in_orExpr308 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_condition_in_andExpr328 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_andExpr338 = new BitSet(new long[]{0x00000001120C4000L});
    public static final BitSet FOLLOW_condition_in_andExpr341 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_term_in_expr361 = new BitSet(new long[]{0x00000008E0001002L});
    public static final BitSet FOLLOW_arithmetic_operator_in_expr371 = new BitSet(new long[]{0x0080682000100100L});
    public static final BitSet FOLLOW_term_in_expr373 = new BitSet(new long[]{0x00000008E0001002L});
    public static final BitSet FOLLOW_identifier_in_term393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_value_in_value414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_value_in_value420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_value_in_value426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_value_in_value432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_value_in_value438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestamp_value_in_value444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LIT_in_int_value463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_float_value499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LIT_in_string_value532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_date_value566 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_string_value_in_date_value568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_time_value583 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_string_value_in_time_value585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_timestamp_value600 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_string_value_in_timestamp_value602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_statement632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_insert_statement647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_delete_statement662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_statement677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_statement692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_statement707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_boolean_operator806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_boolean_operator813 = new BitSet(new long[]{0x0000000000000002L});

}