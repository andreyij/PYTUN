// $ANTLR 3.4 D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g 2012-07-01 22:58:00

package org.pytun.sql;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SQLTree extends TreeParser {
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


      // Define table scopes. The goal here is create a context in which we can perform
      // name resolving. Since we eventually want to support subqueries, we're creating a 
      // scope stack
      //
       ScopeStack stack = new ScopeStack();


    public static class query_return extends TreeRuleReturnScope {
        public Query n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:25:1: query returns [Query n] : sql_statement SEMI !;
    public final SQLTree.query_return query() throws RecognitionException {
        SQLTree.query_return retval = new SQLTree.query_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SEMI2=null;
        SQLTree.sql_statement_return sql_statement1 =null;


        CommonTree SEMI2_tree=null;

         
            retval.n = null; 
          
        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:29:3: ( sql_statement SEMI !)
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:30:3: sql_statement SEMI !
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_sql_statement_in_query100);
            sql_statement1=sql_statement();

            state._fsp--;

            adaptor.addChild(root_0, sql_statement1.getTree());


            _last = (CommonTree)input.LT(1);
            SEMI2=(CommonTree)match(input,SEMI,FOLLOW_SEMI_in_query102); 

            retval.n = (sql_statement1!=null?sql_statement1.n:null);

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


    public static class sql_statement_return extends TreeRuleReturnScope {
        public Query n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sql_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:33:1: sql_statement returns [Query n] : ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement );
    public final SQLTree.sql_statement_return sql_statement() throws RecognitionException {
        SQLTree.sql_statement_return retval = new SQLTree.sql_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.select_statement_return select_statement3 =null;

        SQLTree.update_statement_return update_statement4 =null;

        SQLTree.insert_statement_return insert_statement5 =null;

        SQLTree.delete_statement_return delete_statement6 =null;

        SQLTree.create_statement_return create_statement7 =null;

        SQLTree.drop_statement_return drop_statement8 =null;

        SQLTree.alter_statement_return alter_statement9 =null;




          retval.n = null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:37:3: ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement )
            int alt1=7;
            switch ( input.LA(1) ) {
            case SELECT_STMT:
                {
                alt1=1;
                }
                break;
            case UPDATE_STMT:
                {
                alt1=2;
                }
                break;
            case INSERT_STMT:
                {
                alt1=3;
                }
                break;
            case DELETE_STMT:
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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:38:3: select_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_select_statement_in_sql_statement128);
                    select_statement3=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement3.getTree());


                    retval.n = (select_statement3!=null?select_statement3.n:null);

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:39:5: update_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_update_statement_in_sql_statement139);
                    update_statement4=update_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, update_statement4.getTree());


                    retval.n = (update_statement4!=null?update_statement4.n:null);

                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:40:5: insert_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_insert_statement_in_sql_statement148);
                    insert_statement5=insert_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_statement5.getTree());


                    retval.n = (insert_statement5!=null?insert_statement5.n:null);

                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:41:5: delete_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_delete_statement_in_sql_statement157);
                    delete_statement6=delete_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_statement6.getTree());


                    retval.n = (delete_statement6!=null?delete_statement6.n:null);

                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:42:5: create_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_create_statement_in_sql_statement166);
                    create_statement7=create_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, create_statement7.getTree());


                    retval.n = (create_statement7!=null?create_statement7.n:null);

                    }
                    break;
                case 6 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:43:5: drop_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_drop_statement_in_sql_statement175);
                    drop_statement8=drop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_statement8.getTree());


                    retval.n = (drop_statement8!=null?drop_statement8.n:null);

                    }
                    break;
                case 7 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:44:5: alter_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_alter_statement_in_sql_statement186);
                    alter_statement9=alter_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_statement9.getTree());


                    retval.n = (alter_statement9!=null?alter_statement9.n:null);

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
        public Query n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:47:1: select_statement returns [Query n] : ^( SELECT_STMT e= expression_list il= identifier_list (w= where_clause )? ) ;
    public final SQLTree.select_statement_return select_statement() throws RecognitionException {
        SQLTree.select_statement_return retval = new SQLTree.select_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT_STMT10=null;
        SQLTree.expression_list_return e =null;

        SQLTree.identifier_list_return il =null;

        SQLTree.where_clause_return w =null;


        CommonTree SELECT_STMT10_tree=null;


          SelectQuery sq = new SelectQuery(((CommonTree)retval.start));

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:51:3: ( ^( SELECT_STMT e= expression_list il= identifier_list (w= where_clause )? ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:51:4: ^( SELECT_STMT e= expression_list il= identifier_list (w= where_clause )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SELECT_STMT10=(CommonTree)match(input,SELECT_STMT,FOLLOW_SELECT_STMT_in_select_statement211); 
            SELECT_STMT10_tree = (CommonTree)adaptor.dupNode(SELECT_STMT10);


            root_1 = (CommonTree)adaptor.becomeRoot(SELECT_STMT10_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_list_in_select_statement217);
            e=expression_list();

            state._fsp--;

            adaptor.addChild(root_1, e.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_list_in_select_statement221);
            il=identifier_list();

            state._fsp--;

            adaptor.addChild(root_1, il.getTree());


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:51:59: (w= where_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WHERE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:51:59: w= where_clause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_where_clause_in_select_statement227);
                    w=where_clause();

                    state._fsp--;

                    adaptor.addChild(root_1, w.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



                sq.setSelectList((e!=null?e.list:null));
                /* create a new scope from the "FROM" clause of the select query */
                Scope s = new Scope((il!=null?il.list:null));
                stack.push(s);
                sq.setFrom((il!=null?il.list:null));
                sq.setWhere((w!=null?w.n:null));
                retval.n = (Query)sq;
              

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


    public static class update_statement_return extends TreeRuleReturnScope {
        public Query n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:63:1: update_statement returns [Query n] : ^( UPDATE_STMT i= identifier al= assignment_list (w= where_clause )? ) ;
    public final SQLTree.update_statement_return update_statement() throws RecognitionException {
        SQLTree.update_statement_return retval = new SQLTree.update_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UPDATE_STMT11=null;
        SQLTree.identifier_return i =null;

        SQLTree.assignment_list_return al =null;

        SQLTree.where_clause_return w =null;


        CommonTree UPDATE_STMT11_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:64:3: ( ^( UPDATE_STMT i= identifier al= assignment_list (w= where_clause )? ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:64:5: ^( UPDATE_STMT i= identifier al= assignment_list (w= where_clause )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UPDATE_STMT11=(CommonTree)match(input,UPDATE_STMT,FOLLOW_UPDATE_STMT_in_update_statement251); 
            UPDATE_STMT11_tree = (CommonTree)adaptor.dupNode(UPDATE_STMT11);


            root_1 = (CommonTree)adaptor.becomeRoot(UPDATE_STMT11_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_update_statement255);
            i=identifier();

            state._fsp--;

            adaptor.addChild(root_1, i.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_assignment_list_in_update_statement259);
            al=assignment_list();

            state._fsp--;

            adaptor.addChild(root_1, al.getTree());


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:64:52: (w= where_clause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WHERE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:64:52: w= where_clause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_where_clause_in_update_statement263);
                    w=where_clause();

                    state._fsp--;

                    adaptor.addChild(root_1, w.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



                UpdateQuery uq = new UpdateQuery(((CommonTree)retval.start));
                uq.setUpdateList((al!=null?al.list:null));
                uq.setTable((i!=null?i.n:null));
                uq.setWhere((w!=null?w.n:null));
                retval.n = (Query)uq;
              

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
        public Query n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "insert_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:75:1: insert_statement returns [Query n] : ^( INSERT_STMT identifier identifier_list expression_list ) ;
    public final SQLTree.insert_statement_return insert_statement() throws RecognitionException {
        SQLTree.insert_statement_return retval = new SQLTree.insert_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT_STMT12=null;
        SQLTree.identifier_return identifier13 =null;

        SQLTree.identifier_list_return identifier_list14 =null;

        SQLTree.expression_list_return expression_list15 =null;


        CommonTree INSERT_STMT12_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:76:3: ( ^( INSERT_STMT identifier identifier_list expression_list ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:77:5: ^( INSERT_STMT identifier identifier_list expression_list )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INSERT_STMT12=(CommonTree)match(input,INSERT_STMT,FOLLOW_INSERT_STMT_in_insert_statement292); 
            INSERT_STMT12_tree = (CommonTree)adaptor.dupNode(INSERT_STMT12);


            root_1 = (CommonTree)adaptor.becomeRoot(INSERT_STMT12_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_insert_statement294);
            identifier13=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier13.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_list_in_insert_statement296);
            identifier_list14=identifier_list();

            state._fsp--;

            adaptor.addChild(root_1, identifier_list14.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_list_in_insert_statement298);
            expression_list15=expression_list();

            state._fsp--;

            adaptor.addChild(root_1, expression_list15.getTree());


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
    // $ANTLR end "insert_statement"


    public static class delete_statement_return extends TreeRuleReturnScope {
        public Query n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delete_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:80:1: delete_statement returns [Query n] : ^( DELETE_STMT identifier ( where_clause )? ) ;
    public final SQLTree.delete_statement_return delete_statement() throws RecognitionException {
        SQLTree.delete_statement_return retval = new SQLTree.delete_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE_STMT16=null;
        SQLTree.identifier_return identifier17 =null;

        SQLTree.where_clause_return where_clause18 =null;


        CommonTree DELETE_STMT16_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:81:3: ( ^( DELETE_STMT identifier ( where_clause )? ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:82:3: ^( DELETE_STMT identifier ( where_clause )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DELETE_STMT16=(CommonTree)match(input,DELETE_STMT,FOLLOW_DELETE_STMT_in_delete_statement319); 
            DELETE_STMT16_tree = (CommonTree)adaptor.dupNode(DELETE_STMT16);


            root_1 = (CommonTree)adaptor.becomeRoot(DELETE_STMT16_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_delete_statement321);
            identifier17=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier17.getTree());


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:82:28: ( where_clause )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==WHERE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:82:28: where_clause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_where_clause_in_delete_statement323);
                    where_clause18=where_clause();

                    state._fsp--;

                    adaptor.addChild(root_1, where_clause18.getTree());


                    }
                    break;

            }


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
    // $ANTLR end "delete_statement"


    public static class create_statement_return extends TreeRuleReturnScope {
        public Query n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:85:1: create_statement returns [Query n] : CREATE ;
    public final SQLTree.create_statement_return create_statement() throws RecognitionException {
        SQLTree.create_statement_return retval = new SQLTree.create_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CREATE19=null;

        CommonTree CREATE19_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:86:3: ( CREATE )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:87:3: CREATE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            CREATE19=(CommonTree)match(input,CREATE,FOLLOW_CREATE_in_create_statement344); 
            CREATE19_tree = (CommonTree)adaptor.dupNode(CREATE19);


            adaptor.addChild(root_0, CREATE19_tree);


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
        public Query n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:90:1: drop_statement returns [Query n] : DROP ;
    public final SQLTree.drop_statement_return drop_statement() throws RecognitionException {
        SQLTree.drop_statement_return retval = new SQLTree.drop_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DROP20=null;

        CommonTree DROP20_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:91:3: ( DROP )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:92:3: DROP
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            DROP20=(CommonTree)match(input,DROP,FOLLOW_DROP_in_drop_statement363); 
            DROP20_tree = (CommonTree)adaptor.dupNode(DROP20);


            adaptor.addChild(root_0, DROP20_tree);


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
        public Query n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alter_statement"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:95:1: alter_statement returns [Query n] : ALTER ;
    public final SQLTree.alter_statement_return alter_statement() throws RecognitionException {
        SQLTree.alter_statement_return retval = new SQLTree.alter_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ALTER21=null;

        CommonTree ALTER21_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:96:3: ( ALTER )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:97:3: ALTER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            ALTER21=(CommonTree)match(input,ALTER,FOLLOW_ALTER_in_alter_statement382); 
            ALTER21_tree = (CommonTree)adaptor.dupNode(ALTER21);


            adaptor.addChild(root_0, ALTER21_tree);


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


    public static class expression_list_return extends TreeRuleReturnScope {
        public List<Node> list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_list"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:100:1: expression_list returns [List<Node> list] : ^( EXPR_LIST ( expr )+ ) ;
    public final SQLTree.expression_list_return expression_list() throws RecognitionException {
        SQLTree.expression_list_return retval = new SQLTree.expression_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXPR_LIST22=null;
        SQLTree.expr_return expr23 =null;


        CommonTree EXPR_LIST22_tree=null;


          retval.list = new ArrayList<Node>();

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:104:3: ( ^( EXPR_LIST ( expr )+ ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:104:5: ^( EXPR_LIST ( expr )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXPR_LIST22=(CommonTree)match(input,EXPR_LIST,FOLLOW_EXPR_LIST_in_expression_list405); 
            EXPR_LIST22_tree = (CommonTree)adaptor.dupNode(EXPR_LIST22);


            root_1 = (CommonTree)adaptor.becomeRoot(EXPR_LIST22_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:104:17: ( expr )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DATE||LA5_0==DIV||LA5_0==IDENTIFIER||(LA5_0 >= MINUS && LA5_0 <= MUL)||(LA5_0 >= PLUS && LA5_0 <= REAL_LIT)||LA5_0==STRING_LIT||(LA5_0 >= TIME && LA5_0 <= TIMESTAMP)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:104:17: expr
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expr_in_expression_list407);
            	    expr23=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_1, expr23.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            retval.list.add((expr23!=null?expr23.n:null));

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
    // $ANTLR end "expression_list"


    public static class identifier_list_return extends TreeRuleReturnScope {
        public List<Node> list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier_list"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:107:1: identifier_list returns [List<Node> list] : (i= identifier )+ ;
    public final SQLTree.identifier_list_return identifier_list() throws RecognitionException {
        SQLTree.identifier_list_return retval = new SQLTree.identifier_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.identifier_return i =null;




          retval.list = new ArrayList();

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:111:3: ( (i= identifier )+ )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:111:4: (i= identifier )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:111:4: (i= identifier )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENTIFIER) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:111:5: i= identifier
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_identifier_in_identifier_list434);
            	    i=identifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, i.getTree());


            	    retval.list.add((i!=null?i.n:null));

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "identifier_list"


    public static class where_clause_return extends TreeRuleReturnScope {
        public Condition n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "where_clause"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:115:1: where_clause returns [Condition n] : ^( WHERE c= condition ) ;
    public final SQLTree.where_clause_return where_clause() throws RecognitionException {
        SQLTree.where_clause_return retval = new SQLTree.where_clause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WHERE24=null;
        SQLTree.condition_return c =null;


        CommonTree WHERE24_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:116:3: ( ^( WHERE c= condition ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:116:7: ^( WHERE c= condition )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WHERE24=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_where_clause459); 
            WHERE24_tree = (CommonTree)adaptor.dupNode(WHERE24);


            root_1 = (CommonTree)adaptor.becomeRoot(WHERE24_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_condition_in_where_clause463);
            c=condition();

            state._fsp--;

            adaptor.addChild(root_1, c.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            retval.n = (c!=null?c.n:null);

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
    // $ANTLR end "where_clause"


    public static class condition_return extends TreeRuleReturnScope {
        public Condition n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:118:1: condition returns [Condition n] : ( ^( OR l= condition r= condition ) | ^( AND l= condition r= condition ) |p= predicate );
    public final SQLTree.condition_return condition() throws RecognitionException {
        SQLTree.condition_return retval = new SQLTree.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OR25=null;
        CommonTree AND26=null;
        SQLTree.condition_return l =null;

        SQLTree.condition_return r =null;

        SQLTree.predicate_return p =null;


        CommonTree OR25_tree=null;
        CommonTree AND26_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:119:3: ( ^( OR l= condition r= condition ) | ^( AND l= condition r= condition ) |p= predicate )
            int alt7=3;
            switch ( input.LA(1) ) {
            case OR:
                {
                alt7=1;
                }
                break;
            case AND:
                {
                alt7=2;
                }
                break;
            case EQ:
            case GE:
            case GT:
            case LE:
            case LT:
            case NE:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:119:5: ^( OR l= condition r= condition )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    OR25=(CommonTree)match(input,OR,FOLLOW_OR_in_condition483); 
                    OR25_tree = (CommonTree)adaptor.dupNode(OR25);


                    root_1 = (CommonTree)adaptor.becomeRoot(OR25_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition487);
                    l=condition();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition491);
                    r=condition();

                    state._fsp--;

                    adaptor.addChild(root_1, r.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                          OrCondition obj = new OrCondition(((CommonTree)retval.start));
                          obj.setLeft((l!=null?l.n:null));
                          obj.setRight((r!=null?r.n:null));
                          retval.n = (Condition)obj;
                        

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:126:5: ^( AND l= condition r= condition )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    AND26=(CommonTree)match(input,AND,FOLLOW_AND_in_condition506); 
                    AND26_tree = (CommonTree)adaptor.dupNode(AND26);


                    root_1 = (CommonTree)adaptor.becomeRoot(AND26_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition510);
                    l=condition();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition514);
                    r=condition();

                    state._fsp--;

                    adaptor.addChild(root_1, r.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                          AndCondition obj = new AndCondition(((CommonTree)retval.start));
                          obj.setLeft((l!=null?l.n:null));
                          obj.setRight((r!=null?r.n:null));
                          retval.n = (Condition)obj;
                        

                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:133:5: p= predicate
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_predicate_in_condition531);
                    p=predicate();

                    state._fsp--;

                    adaptor.addChild(root_0, p.getTree());


                    retval.n = (Condition)(p!=null?p.n:null); 

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
    // $ANTLR end "condition"


    public static class predicate_return extends TreeRuleReturnScope {
        public Predicate n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicate"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:136:1: predicate returns [Predicate n] : ( ^( EQ l= expr r= expr ) | ^( LT expr expr ) | ^( GT expr expr ) | ^( GE expr expr ) | ^( LE expr expr ) | ^( NE expr expr ) );
    public final SQLTree.predicate_return predicate() throws RecognitionException {
        SQLTree.predicate_return retval = new SQLTree.predicate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ27=null;
        CommonTree LT28=null;
        CommonTree GT31=null;
        CommonTree GE34=null;
        CommonTree LE37=null;
        CommonTree NE40=null;
        SQLTree.expr_return l =null;

        SQLTree.expr_return r =null;

        SQLTree.expr_return expr29 =null;

        SQLTree.expr_return expr30 =null;

        SQLTree.expr_return expr32 =null;

        SQLTree.expr_return expr33 =null;

        SQLTree.expr_return expr35 =null;

        SQLTree.expr_return expr36 =null;

        SQLTree.expr_return expr38 =null;

        SQLTree.expr_return expr39 =null;

        SQLTree.expr_return expr41 =null;

        SQLTree.expr_return expr42 =null;


        CommonTree EQ27_tree=null;
        CommonTree LT28_tree=null;
        CommonTree GT31_tree=null;
        CommonTree GE34_tree=null;
        CommonTree LE37_tree=null;
        CommonTree NE40_tree=null;


          retval.n = new Predicate(((CommonTree)retval.start));

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:140:3: ( ^( EQ l= expr r= expr ) | ^( LT expr expr ) | ^( GT expr expr ) | ^( GE expr expr ) | ^( LE expr expr ) | ^( NE expr expr ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt8=1;
                }
                break;
            case LT:
                {
                alt8=2;
                }
                break;
            case GT:
                {
                alt8=3;
                }
                break;
            case GE:
                {
                alt8=4;
                }
                break;
            case LE:
                {
                alt8=5;
                }
                break;
            case NE:
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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:140:5: ^( EQ l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQ27=(CommonTree)match(input,EQ,FOLLOW_EQ_in_predicate555); 
                    EQ27_tree = (CommonTree)adaptor.dupNode(EQ27);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQ27_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate559);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate563);
                    r=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, r.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                          retval.n.setOperator(BooleanOperator.Equals); 
                          retval.n.setLeft((l!=null?l.n:null));
                          retval.n.setRight((r!=null?r.n:null));
                        

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:146:5: ^( LT expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LT28=(CommonTree)match(input,LT,FOLLOW_LT_in_predicate578); 
                    LT28_tree = (CommonTree)adaptor.dupNode(LT28);


                    root_1 = (CommonTree)adaptor.becomeRoot(LT28_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate580);
                    expr29=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr29.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate582);
                    expr30=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr30.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                          retval.n.setOperator(BooleanOperator.LessThan); 
                          retval.n.setLeft((l!=null?l.n:null));
                          retval.n.setRight((r!=null?r.n:null));
                        

                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:152:5: ^( GT expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GT31=(CommonTree)match(input,GT,FOLLOW_GT_in_predicate596); 
                    GT31_tree = (CommonTree)adaptor.dupNode(GT31);


                    root_1 = (CommonTree)adaptor.becomeRoot(GT31_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate598);
                    expr32=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr32.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate600);
                    expr33=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr33.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                          retval.n.setOperator(BooleanOperator.GreaterThan); 
                          retval.n.setLeft((l!=null?l.n:null));
                          retval.n.setRight((r!=null?r.n:null));
                        

                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:158:5: ^( GE expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GE34=(CommonTree)match(input,GE,FOLLOW_GE_in_predicate614); 
                    GE34_tree = (CommonTree)adaptor.dupNode(GE34);


                    root_1 = (CommonTree)adaptor.becomeRoot(GE34_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate616);
                    expr35=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr35.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate618);
                    expr36=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr36.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                          retval.n.setOperator(BooleanOperator.GreaterThanEquals); 
                          retval.n.setLeft((l!=null?l.n:null));
                          retval.n.setRight((r!=null?r.n:null));
                        

                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:164:5: ^( LE expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LE37=(CommonTree)match(input,LE,FOLLOW_LE_in_predicate632); 
                    LE37_tree = (CommonTree)adaptor.dupNode(LE37);


                    root_1 = (CommonTree)adaptor.becomeRoot(LE37_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate634);
                    expr38=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr38.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate636);
                    expr39=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr39.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                          retval.n.setOperator(BooleanOperator.LessThanEquals); 
                          retval.n.setLeft((l!=null?l.n:null));
                          retval.n.setRight((r!=null?r.n:null));
                        

                    }
                    break;
                case 6 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:170:5: ^( NE expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NE40=(CommonTree)match(input,NE,FOLLOW_NE_in_predicate650); 
                    NE40_tree = (CommonTree)adaptor.dupNode(NE40);


                    root_1 = (CommonTree)adaptor.becomeRoot(NE40_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate652);
                    expr41=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr41.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate654);
                    expr42=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr42.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                          retval.n.setOperator(BooleanOperator.NotEquals); 
                          retval.n.setLeft((l!=null?l.n:null));
                          retval.n.setRight((r!=null?r.n:null));
                        

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
    // $ANTLR end "predicate"


    public static class expr_return extends TreeRuleReturnScope {
        public Node n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:180:1: expr returns [Node n] : ( ^( PLUS l= expr r= expr ) | ^( MINUS l= expr r= expr ) | ^( MUL l= expr r= expr ) | ^( DIV l= expr r= expr ) | ^( MOD l= expr r= expr ) | term );
    public final SQLTree.expr_return expr() throws RecognitionException {
        SQLTree.expr_return retval = new SQLTree.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PLUS43=null;
        CommonTree MINUS44=null;
        CommonTree MUL45=null;
        CommonTree DIV46=null;
        CommonTree MOD47=null;
        SQLTree.expr_return l =null;

        SQLTree.expr_return r =null;

        SQLTree.term_return term48 =null;


        CommonTree PLUS43_tree=null;
        CommonTree MINUS44_tree=null;
        CommonTree MUL45_tree=null;
        CommonTree DIV46_tree=null;
        CommonTree MOD47_tree=null;


        retval.n = null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:184:3: ( ^( PLUS l= expr r= expr ) | ^( MINUS l= expr r= expr ) | ^( MUL l= expr r= expr ) | ^( DIV l= expr r= expr ) | ^( MOD l= expr r= expr ) | term )
            int alt9=6;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt9=1;
                }
                break;
            case MINUS:
                {
                alt9=2;
                }
                break;
            case MUL:
                {
                alt9=3;
                }
                break;
            case DIV:
                {
                alt9=4;
                }
                break;
            case MOD:
                {
                alt9=5;
                }
                break;
            case DATE:
            case IDENTIFIER:
            case REAL_LIT:
            case STRING_LIT:
            case TIME:
            case TIMESTAMP:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:184:5: ^( PLUS l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PLUS43=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expr685); 
                    PLUS43_tree = (CommonTree)adaptor.dupNode(PLUS43);


                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS43_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr689);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr693);
                    r=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, r.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    Plus obj = new Plus(((CommonTree)retval.start), (l!=null?l.n:null), (r!=null?r.n:null)); retval.n = (Node) obj;

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:185:5: ^( MINUS l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MINUS44=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expr703); 
                    MINUS44_tree = (CommonTree)adaptor.dupNode(MINUS44);


                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS44_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr707);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr711);
                    r=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, r.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    Minus obj = new Minus(((CommonTree)retval.start), (l!=null?l.n:null), (r!=null?r.n:null)); retval.n = (Node) obj;

                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:186:5: ^( MUL l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MUL45=(CommonTree)match(input,MUL,FOLLOW_MUL_in_expr720); 
                    MUL45_tree = (CommonTree)adaptor.dupNode(MUL45);


                    root_1 = (CommonTree)adaptor.becomeRoot(MUL45_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr724);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr728);
                    r=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, r.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    Multiply obj = new Multiply(((CommonTree)retval.start), (l!=null?l.n:null), (r!=null?r.n:null)); retval.n = (Node) obj;

                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:187:5: ^( DIV l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DIV46=(CommonTree)match(input,DIV,FOLLOW_DIV_in_expr737); 
                    DIV46_tree = (CommonTree)adaptor.dupNode(DIV46);


                    root_1 = (CommonTree)adaptor.becomeRoot(DIV46_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr741);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr745);
                    r=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, r.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    Divide obj = new Divide(((CommonTree)retval.start), (l!=null?l.n:null), (r!=null?r.n:null)); retval.n = (Node) obj;

                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:188:5: ^( MOD l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MOD47=(CommonTree)match(input,MOD,FOLLOW_MOD_in_expr754); 
                    MOD47_tree = (CommonTree)adaptor.dupNode(MOD47);


                    root_1 = (CommonTree)adaptor.becomeRoot(MOD47_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr758);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr762);
                    r=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, r.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    Modulo obj = new Modulo(((CommonTree)retval.start), (l!=null?l.n:null), (r!=null?r.n:null)); retval.n = (Node) obj;

                    }
                    break;
                case 6 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:189:5: term
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term_in_expr770);
                    term48=term();

                    state._fsp--;

                    adaptor.addChild(root_0, term48.getTree());


                    retval.n = (Node)(term48!=null?term48.n:null);

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
    // $ANTLR end "expr"


    public static class term_return extends TreeRuleReturnScope {
        public Node n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:192:1: term returns [Node n] : ( identifier | value );
    public final SQLTree.term_return term() throws RecognitionException {
        SQLTree.term_return retval = new SQLTree.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.identifier_return identifier49 =null;

        SQLTree.value_return value50 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:193:3: ( identifier | value )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IDENTIFIER) ) {
                alt10=1;
            }
            else if ( (LA10_0==DATE||LA10_0==REAL_LIT||LA10_0==STRING_LIT||(LA10_0 >= TIME && LA10_0 <= TIMESTAMP)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:193:5: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_term789);
                    identifier49=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier49.getTree());


                    retval.n = (identifier49!=null?identifier49.n:null);

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:194:5: value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_value_in_term797);
                    value50=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value50.getTree());


                    retval.n = (value50!=null?value50.n:null);

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
        public Value n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:197:1: value returns [Value n] : ( number_value | string_value | date_value | time_value | timestamp_value );
    public final SQLTree.value_return value() throws RecognitionException {
        SQLTree.value_return retval = new SQLTree.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.number_value_return number_value51 =null;

        SQLTree.string_value_return string_value52 =null;

        SQLTree.date_value_return date_value53 =null;

        SQLTree.time_value_return time_value54 =null;

        SQLTree.timestamp_value_return timestamp_value55 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:198:3: ( number_value | string_value | date_value | time_value | timestamp_value )
            int alt11=5;
            switch ( input.LA(1) ) {
            case REAL_LIT:
                {
                alt11=1;
                }
                break;
            case STRING_LIT:
                {
                alt11=2;
                }
                break;
            case DATE:
                {
                alt11=3;
                }
                break;
            case TIME:
                {
                alt11=4;
                }
                break;
            case TIMESTAMP:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:199:3: number_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_number_value_in_value818);
                    number_value51=number_value();

                    state._fsp--;

                    adaptor.addChild(root_0, number_value51.getTree());


                    retval.n = (number_value51!=null?number_value51.n:null);

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:200:5: string_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_string_value_in_value827);
                    string_value52=string_value();

                    state._fsp--;

                    adaptor.addChild(root_0, string_value52.getTree());


                    retval.n = (string_value52!=null?string_value52.n:null);

                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:201:5: date_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_date_value_in_value835);
                    date_value53=date_value();

                    state._fsp--;

                    adaptor.addChild(root_0, date_value53.getTree());


                    retval.n = (date_value53!=null?date_value53.n:null);

                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:202:5: time_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_time_value_in_value843);
                    time_value54=time_value();

                    state._fsp--;

                    adaptor.addChild(root_0, time_value54.getTree());


                    retval.n = (time_value54!=null?time_value54.n:null);

                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:203:5: timestamp_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_timestamp_value_in_value851);
                    timestamp_value55=timestamp_value();

                    state._fsp--;

                    adaptor.addChild(root_0, timestamp_value55.getTree());


                    retval.n = (timestamp_value55!=null?timestamp_value55.n:null);

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


    public static class number_value_return extends TreeRuleReturnScope {
        public Value n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number_value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:207:1: number_value returns [Value n] : REAL_LIT ;
    public final SQLTree.number_value_return number_value() throws RecognitionException {
        SQLTree.number_value_return retval = new SQLTree.number_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REAL_LIT56=null;

        CommonTree REAL_LIT56_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:208:3: ( REAL_LIT )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:209:3: REAL_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            REAL_LIT56=(CommonTree)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_number_value872); 
            REAL_LIT56_tree = (CommonTree)adaptor.dupNode(REAL_LIT56);


            adaptor.addChild(root_0, REAL_LIT56_tree);


            retval.n = NumberFactory.getNumberValue(((CommonTree)retval.start), (REAL_LIT56!=null?REAL_LIT56.getText():null));

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
    // $ANTLR end "number_value"


    public static class string_value_return extends TreeRuleReturnScope {
        public Value n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string_value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:212:1: string_value returns [Value n] : STRING_LIT ;
    public final SQLTree.string_value_return string_value() throws RecognitionException {
        SQLTree.string_value_return retval = new SQLTree.string_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STRING_LIT57=null;

        CommonTree STRING_LIT57_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:213:3: ( STRING_LIT )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:214:3: STRING_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            STRING_LIT57=(CommonTree)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_string_value893); 
            STRING_LIT57_tree = (CommonTree)adaptor.dupNode(STRING_LIT57);


            adaptor.addChild(root_0, STRING_LIT57_tree);



                  StringValue s = new StringValue(((CommonTree)retval.start));
                  s.setValue((STRING_LIT57!=null?STRING_LIT57.getText():null));
                

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
        public Value n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "date_value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:221:1: date_value returns [Value n] : DATE string_value ;
    public final SQLTree.date_value_return date_value() throws RecognitionException {
        SQLTree.date_value_return retval = new SQLTree.date_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DATE58=null;
        SQLTree.string_value_return string_value59 =null;


        CommonTree DATE58_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:222:3: ( DATE string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:223:3: DATE string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            DATE58=(CommonTree)match(input,DATE,FOLLOW_DATE_in_date_value919); 
            DATE58_tree = (CommonTree)adaptor.dupNode(DATE58);


            adaptor.addChild(root_0, DATE58_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_value_in_date_value921);
            string_value59=string_value();

            state._fsp--;

            adaptor.addChild(root_0, string_value59.getTree());


            retval.n = (string_value59!=null?string_value59.n:null);

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
        public Value n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "time_value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:226:1: time_value returns [Value n] : TIME string_value ;
    public final SQLTree.time_value_return time_value() throws RecognitionException {
        SQLTree.time_value_return retval = new SQLTree.time_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TIME60=null;
        SQLTree.string_value_return string_value61 =null;


        CommonTree TIME60_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:227:3: ( TIME string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:228:3: TIME string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            TIME60=(CommonTree)match(input,TIME,FOLLOW_TIME_in_time_value942); 
            TIME60_tree = (CommonTree)adaptor.dupNode(TIME60);


            adaptor.addChild(root_0, TIME60_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_value_in_time_value944);
            string_value61=string_value();

            state._fsp--;

            adaptor.addChild(root_0, string_value61.getTree());


            retval.n = (string_value61!=null?string_value61.n:null);

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
        public Value n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timestamp_value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:231:1: timestamp_value returns [Value n] : TIMESTAMP string_value ;
    public final SQLTree.timestamp_value_return timestamp_value() throws RecognitionException {
        SQLTree.timestamp_value_return retval = new SQLTree.timestamp_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TIMESTAMP62=null;
        SQLTree.string_value_return string_value63 =null;


        CommonTree TIMESTAMP62_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:232:3: ( TIMESTAMP string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:233:3: TIMESTAMP string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            TIMESTAMP62=(CommonTree)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_timestamp_value965); 
            TIMESTAMP62_tree = (CommonTree)adaptor.dupNode(TIMESTAMP62);


            adaptor.addChild(root_0, TIMESTAMP62_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_value_in_timestamp_value967);
            string_value63=string_value();

            state._fsp--;

            adaptor.addChild(root_0, string_value63.getTree());


            retval.n = (string_value63!=null?string_value63.n:null);

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
        public Identifier n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:236:1: identifier returns [Identifier n] : IDENTIFIER ;
    public final SQLTree.identifier_return identifier() throws RecognitionException {
        SQLTree.identifier_return retval = new SQLTree.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER64=null;

        CommonTree IDENTIFIER64_tree=null;


          retval.n = new Identifier (((CommonTree)retval.start));

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:240:3: ( IDENTIFIER )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:241:3: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER64=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier992); 
            IDENTIFIER64_tree = (CommonTree)adaptor.dupNode(IDENTIFIER64);


            adaptor.addChild(root_0, IDENTIFIER64_tree);


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


    public static class assignment_list_return extends TreeRuleReturnScope {
        public List<Node> list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_list"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:244:1: assignment_list returns [List<Node> list] : ^( UPDATE_ASSIGNMENTS ( assignment )+ ) ;
    public final SQLTree.assignment_list_return assignment_list() throws RecognitionException {
        SQLTree.assignment_list_return retval = new SQLTree.assignment_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UPDATE_ASSIGNMENTS65=null;
        SQLTree.assignment_return assignment66 =null;


        CommonTree UPDATE_ASSIGNMENTS65_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:245:3: ( ^( UPDATE_ASSIGNMENTS ( assignment )+ ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:245:4: ^( UPDATE_ASSIGNMENTS ( assignment )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UPDATE_ASSIGNMENTS65=(CommonTree)match(input,UPDATE_ASSIGNMENTS,FOLLOW_UPDATE_ASSIGNMENTS_in_assignment_list1009); 
            UPDATE_ASSIGNMENTS65_tree = (CommonTree)adaptor.dupNode(UPDATE_ASSIGNMENTS65);


            root_1 = (CommonTree)adaptor.becomeRoot(UPDATE_ASSIGNMENTS65_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:245:25: ( assignment )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==EQ) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:245:25: assignment
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_assignment_in_assignment_list1011);
            	    assignment66=assignment();

            	    state._fsp--;

            	    adaptor.addChild(root_1, assignment66.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            retval.list.add((assignment66!=null?assignment66.n:null));

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
    // $ANTLR end "assignment_list"


    public static class assignment_return extends TreeRuleReturnScope {
        public Node n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:248:1: assignment returns [Node n] : ^( EQ identifier expr ) ;
    public final SQLTree.assignment_return assignment() throws RecognitionException {
        SQLTree.assignment_return retval = new SQLTree.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ67=null;
        SQLTree.identifier_return identifier68 =null;

        SQLTree.expr_return expr69 =null;


        CommonTree EQ67_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:249:3: ( ^( EQ identifier expr ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:249:5: ^( EQ identifier expr )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQ67=(CommonTree)match(input,EQ,FOLLOW_EQ_in_assignment1032); 
            EQ67_tree = (CommonTree)adaptor.dupNode(EQ67);


            root_1 = (CommonTree)adaptor.becomeRoot(EQ67_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_assignment1034);
            identifier68=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier68.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_assignment1036);
            expr69=expr();

            state._fsp--;

            adaptor.addChild(root_1, expr69.getTree());


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
    // $ANTLR end "assignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_sql_statement_in_query100 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEMI_in_query102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_sql_statement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_sql_statement139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_sql_statement148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_sql_statement157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_statement_in_sql_statement166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_statement_in_sql_statement175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_statement_in_sql_statement186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_STMT_in_select_statement211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_list_in_select_statement217 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_list_in_select_statement221 = new BitSet(new long[]{0x0008000000000008L});
    public static final BitSet FOLLOW_where_clause_in_select_statement227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_STMT_in_update_statement251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_update_statement255 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_assignment_list_in_update_statement259 = new BitSet(new long[]{0x0008000000000008L});
    public static final BitSet FOLLOW_where_clause_in_update_statement263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_STMT_in_insert_statement292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_insert_statement294 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_identifier_list_in_insert_statement296 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_expression_list_in_insert_statement298 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_STMT_in_delete_statement319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_delete_statement321 = new BitSet(new long[]{0x0008000000000008L});
    public static final BitSet FOLLOW_where_clause_in_delete_statement323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_in_create_statement344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_statement363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_statement382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPR_LIST_in_expression_list405 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression_list407 = new BitSet(new long[]{0x00003418E0101108L});
    public static final BitSet FOLLOW_identifier_in_identifier_list434 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_WHERE_in_where_clause459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_where_clause463 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_condition483 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition487 = new BitSet(new long[]{0x00000005120C4020L});
    public static final BitSet FOLLOW_condition_in_condition491 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_condition506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition510 = new BitSet(new long[]{0x00000005120C4020L});
    public static final BitSet FOLLOW_condition_in_condition514 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_predicate_in_condition531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_predicate555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate559 = new BitSet(new long[]{0x00003418E0101100L});
    public static final BitSet FOLLOW_expr_in_predicate563 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_predicate578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate580 = new BitSet(new long[]{0x00003418E0101100L});
    public static final BitSet FOLLOW_expr_in_predicate582 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_predicate596 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate598 = new BitSet(new long[]{0x00003418E0101100L});
    public static final BitSet FOLLOW_expr_in_predicate600 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_predicate614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate616 = new BitSet(new long[]{0x00003418E0101100L});
    public static final BitSet FOLLOW_expr_in_predicate618 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_predicate632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate634 = new BitSet(new long[]{0x00003418E0101100L});
    public static final BitSet FOLLOW_expr_in_predicate636 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NE_in_predicate650 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate652 = new BitSet(new long[]{0x00003418E0101100L});
    public static final BitSet FOLLOW_expr_in_predicate654 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr689 = new BitSet(new long[]{0x00003418E0101100L});
    public static final BitSet FOLLOW_expr_in_expr693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr703 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr707 = new BitSet(new long[]{0x00003418E0101100L});
    public static final BitSet FOLLOW_expr_in_expr711 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expr720 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr724 = new BitSet(new long[]{0x00003418E0101100L});
    public static final BitSet FOLLOW_expr_in_expr728 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr741 = new BitSet(new long[]{0x00003418E0101100L});
    public static final BitSet FOLLOW_expr_in_expr745 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr758 = new BitSet(new long[]{0x00003418E0101100L});
    public static final BitSet FOLLOW_expr_in_expr762 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_term_in_expr770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_term789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_value_in_value818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_value_in_value827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_value_in_value835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_value_in_value843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestamp_value_in_value851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_number_value872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LIT_in_string_value893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_date_value919 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_string_value_in_date_value921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_time_value942 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_string_value_in_time_value944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_timestamp_value965 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_string_value_in_timestamp_value967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_ASSIGNMENTS_in_assignment_list1009 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignment_in_assignment_list1011 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_EQ_in_assignment1032 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_assignment1034 = new BitSet(new long[]{0x00003418E0101100L});
    public static final BitSet FOLLOW_expr_in_assignment1036 = new BitSet(new long[]{0x0000000000000008L});

}