// $ANTLR 3.4 D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g 2012-07-28 14:02:42

package org.pytun.sql;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import org.pytun.common.ColumnType;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SQLTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALTER", "AND", "AS", "CHAR", "COLUMN_DEF_LIST", "CREATE", "CREATE_STMT", "DATE", "DELETE", "DELETE_STMT", "DIGIT", "DIV", "DROP", "DROP_STMT", "EQ", "EXPR_LIST", "FLOAT", "FROM", "GE", "GT", "IDENTIFIER", "INSERT", "INSERT_STMT", "INT", "INTO", "LE", "LETTER", "LPAREN", "LT", "MINUS", "MOD", "MUL", "NE", "NEWLINE", "OR", "PLUS", "REAL_LIT", "RPAREN", "SELECT", "SELECT_STMT", "SEMI", "SET", "STRING_LIT", "TABLE", "TABLE_LIST", "TIME", "TIMESTAMP", "UPDATE", "UPDATE_ASSIGNMENTS", "UPDATE_STMT", "VALUES", "VARCHAR", "WHERE", "WHITESPACE", "','", "'.'"
    };

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
        public Query n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:18:1: query returns [Query n] : sql_statement SEMI !;
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:22:3: ( sql_statement SEMI !)
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:23:3: sql_statement SEMI !
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_sql_statement_in_query95);
            sql_statement1=sql_statement();

            state._fsp--;

            adaptor.addChild(root_0, sql_statement1.getTree());


            _last = (CommonTree)input.LT(1);
            SEMI2=(CommonTree)match(input,SEMI,FOLLOW_SEMI_in_query97); 

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:26:1: sql_statement returns [Query n] : ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement );
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:30:3: ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement )
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
            case CREATE_STMT:
                {
                alt1=5;
                }
                break;
            case DROP_STMT:
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
                    select_statement3=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement3.getTree());


                    retval.n = (select_statement3!=null?select_statement3.n:null);

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:32:5: update_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_update_statement_in_sql_statement134);
                    update_statement4=update_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, update_statement4.getTree());


                    retval.n = (update_statement4!=null?update_statement4.n:null);

                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:33:5: insert_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_insert_statement_in_sql_statement143);
                    insert_statement5=insert_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_statement5.getTree());


                    retval.n = (insert_statement5!=null?insert_statement5.n:null);

                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:34:5: delete_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_delete_statement_in_sql_statement152);
                    delete_statement6=delete_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_statement6.getTree());


                    retval.n = (delete_statement6!=null?delete_statement6.n:null);

                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:35:5: create_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_create_statement_in_sql_statement161);
                    create_statement7=create_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, create_statement7.getTree());


                    retval.n = (create_statement7!=null?create_statement7.n:null);

                    }
                    break;
                case 6 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:36:5: drop_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_drop_statement_in_sql_statement170);
                    drop_statement8=drop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_statement8.getTree());


                    retval.n = (drop_statement8!=null?drop_statement8.n:null);

                    }
                    break;
                case 7 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:37:5: alter_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_alter_statement_in_sql_statement181);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:40:1: select_statement returns [Query n] : ^( SELECT_STMT e= expression_list tl= table_spec_list (w= where_clause )? ) ;
    public final SQLTree.select_statement_return select_statement() throws RecognitionException {
        SQLTree.select_statement_return retval = new SQLTree.select_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT_STMT10=null;
        SQLTree.expression_list_return e =null;

        SQLTree.table_spec_list_return tl =null;

        SQLTree.where_clause_return w =null;


        CommonTree SELECT_STMT10_tree=null;


          SelectQuery sq = new SelectQuery(((CommonTree)retval.start));

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:44:3: ( ^( SELECT_STMT e= expression_list tl= table_spec_list (w= where_clause )? ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:44:4: ^( SELECT_STMT e= expression_list tl= table_spec_list (w= where_clause )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SELECT_STMT10=(CommonTree)match(input,SELECT_STMT,FOLLOW_SELECT_STMT_in_select_statement206); 
            SELECT_STMT10_tree = (CommonTree)adaptor.dupNode(SELECT_STMT10);


            root_1 = (CommonTree)adaptor.becomeRoot(SELECT_STMT10_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_list_in_select_statement212);
            e=expression_list();

            state._fsp--;

            adaptor.addChild(root_1, e.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_table_spec_list_in_select_statement216);
            tl=table_spec_list();

            state._fsp--;

            adaptor.addChild(root_1, tl.getTree());


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:44:59: (w= where_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WHERE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:44:59: w= where_clause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_where_clause_in_select_statement222);
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
                sq.setFrom((tl!=null?tl.list:null));
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:53:1: update_statement returns [Query n] : ^( UPDATE_STMT i= identifier al= assignment_list (w= where_clause )? ) ;
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
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:54:3: ( ^( UPDATE_STMT i= identifier al= assignment_list (w= where_clause )? ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:54:5: ^( UPDATE_STMT i= identifier al= assignment_list (w= where_clause )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UPDATE_STMT11=(CommonTree)match(input,UPDATE_STMT,FOLLOW_UPDATE_STMT_in_update_statement246); 
            UPDATE_STMT11_tree = (CommonTree)adaptor.dupNode(UPDATE_STMT11);


            root_1 = (CommonTree)adaptor.becomeRoot(UPDATE_STMT11_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_update_statement250);
            i=identifier();

            state._fsp--;

            adaptor.addChild(root_1, i.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_assignment_list_in_update_statement254);
            al=assignment_list();

            state._fsp--;

            adaptor.addChild(root_1, al.getTree());


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:54:52: (w= where_clause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WHERE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:54:52: w= where_clause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_where_clause_in_update_statement258);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:65:1: insert_statement returns [Query n] : ^( INSERT_STMT identifier il= identifier_list vl= expression_list ) ;
    public final SQLTree.insert_statement_return insert_statement() throws RecognitionException {
        SQLTree.insert_statement_return retval = new SQLTree.insert_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT_STMT12=null;
        SQLTree.identifier_list_return il =null;

        SQLTree.expression_list_return vl =null;

        SQLTree.identifier_return identifier13 =null;


        CommonTree INSERT_STMT12_tree=null;


        	InsertQuery i = new InsertQuery(((CommonTree)retval.start));

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:69:3: ( ^( INSERT_STMT identifier il= identifier_list vl= expression_list ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:70:5: ^( INSERT_STMT identifier il= identifier_list vl= expression_list )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INSERT_STMT12=(CommonTree)match(input,INSERT_STMT,FOLLOW_INSERT_STMT_in_insert_statement291); 
            INSERT_STMT12_tree = (CommonTree)adaptor.dupNode(INSERT_STMT12);


            root_1 = (CommonTree)adaptor.becomeRoot(INSERT_STMT12_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_insert_statement293);
            identifier13=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier13.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_list_in_insert_statement297);
            il=identifier_list();

            state._fsp--;

            adaptor.addChild(root_1, il.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_list_in_insert_statement301);
            vl=expression_list();

            state._fsp--;

            adaptor.addChild(root_1, vl.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



                	i.setInto((identifier13!=null?identifier13.n:null));
                	i.setColumns((il!=null?il.list:null));
                	i.setValues((vl!=null?vl.list:null));
                	retval.n = i;
                

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:79:1: delete_statement returns [Query n] : ^( DELETE_STMT identifier ( where_clause )? ) ;
    public final SQLTree.delete_statement_return delete_statement() throws RecognitionException {
        SQLTree.delete_statement_return retval = new SQLTree.delete_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE_STMT14=null;
        SQLTree.identifier_return identifier15 =null;

        SQLTree.where_clause_return where_clause16 =null;


        CommonTree DELETE_STMT14_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:80:3: ( ^( DELETE_STMT identifier ( where_clause )? ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:81:3: ^( DELETE_STMT identifier ( where_clause )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DELETE_STMT14=(CommonTree)match(input,DELETE_STMT,FOLLOW_DELETE_STMT_in_delete_statement328); 
            DELETE_STMT14_tree = (CommonTree)adaptor.dupNode(DELETE_STMT14);


            root_1 = (CommonTree)adaptor.becomeRoot(DELETE_STMT14_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_delete_statement330);
            identifier15=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier15.getTree());


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:81:28: ( where_clause )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==WHERE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:81:28: where_clause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_where_clause_in_delete_statement332);
                    where_clause16=where_clause();

                    state._fsp--;

                    adaptor.addChild(root_1, where_clause16.getTree());


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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:84:1: create_statement returns [Query n] : ^( CREATE_STMT name= identifier columns= table_columns_def ) ;
    public final SQLTree.create_statement_return create_statement() throws RecognitionException {
        SQLTree.create_statement_return retval = new SQLTree.create_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CREATE_STMT17=null;
        SQLTree.identifier_return name =null;

        SQLTree.table_columns_def_return columns =null;


        CommonTree CREATE_STMT17_tree=null;


          CreateQuery q = new CreateQuery(((CommonTree)retval.start));

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:88:3: ( ^( CREATE_STMT name= identifier columns= table_columns_def ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:89:3: ^( CREATE_STMT name= identifier columns= table_columns_def )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CREATE_STMT17=(CommonTree)match(input,CREATE_STMT,FOLLOW_CREATE_STMT_in_create_statement358); 
            CREATE_STMT17_tree = (CommonTree)adaptor.dupNode(CREATE_STMT17);


            root_1 = (CommonTree)adaptor.becomeRoot(CREATE_STMT17_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_create_statement362);
            name=identifier();

            state._fsp--;

            adaptor.addChild(root_1, name.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_table_columns_def_in_create_statement366);
            columns=table_columns_def();

            state._fsp--;

            adaptor.addChild(root_1, columns.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            	    q.setTableName((name!=null?name.n:null));
            	    q.setColumns((columns!=null?columns.list:null));
            	    retval.n =(Query)q;
            	  

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:97:1: drop_statement returns [Query n] : ^( DROP_STMT identifier ) ;
    public final SQLTree.drop_statement_return drop_statement() throws RecognitionException {
        SQLTree.drop_statement_return retval = new SQLTree.drop_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DROP_STMT18=null;
        SQLTree.identifier_return identifier19 =null;


        CommonTree DROP_STMT18_tree=null;


          DropQuery q = new DropQuery(((CommonTree)retval.start));

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:101:3: ( ^( DROP_STMT identifier ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:102:5: ^( DROP_STMT identifier )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DROP_STMT18=(CommonTree)match(input,DROP_STMT,FOLLOW_DROP_STMT_in_drop_statement398); 
            DROP_STMT18_tree = (CommonTree)adaptor.dupNode(DROP_STMT18);


            root_1 = (CommonTree)adaptor.becomeRoot(DROP_STMT18_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_drop_statement400);
            identifier19=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier19.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



                  q.setTable((identifier19!=null?identifier19.n:null));
                  retval.n = q;
                

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:109:1: alter_statement returns [Query n] : ALTER ;
    public final SQLTree.alter_statement_return alter_statement() throws RecognitionException {
        SQLTree.alter_statement_return retval = new SQLTree.alter_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ALTER20=null;

        CommonTree ALTER20_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:110:3: ( ALTER )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:111:3: ALTER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            ALTER20=(CommonTree)match(input,ALTER,FOLLOW_ALTER_in_alter_statement426); 
            ALTER20_tree = (CommonTree)adaptor.dupNode(ALTER20);


            adaptor.addChild(root_0, ALTER20_tree);


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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:114:1: expression_list returns [List<Node> list] : ^( EXPR_LIST ( expr )+ ) ;
    public final SQLTree.expression_list_return expression_list() throws RecognitionException {
        SQLTree.expression_list_return retval = new SQLTree.expression_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXPR_LIST21=null;
        SQLTree.expr_return expr22 =null;


        CommonTree EXPR_LIST21_tree=null;


          retval.list = new ArrayList<Node>();

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:118:3: ( ^( EXPR_LIST ( expr )+ ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:118:5: ^( EXPR_LIST ( expr )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXPR_LIST21=(CommonTree)match(input,EXPR_LIST,FOLLOW_EXPR_LIST_in_expression_list449); 
            EXPR_LIST21_tree = (CommonTree)adaptor.dupNode(EXPR_LIST21);


            root_1 = (CommonTree)adaptor.becomeRoot(EXPR_LIST21_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:118:17: ( expr )+
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
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:118:18: expr
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expr_in_expression_list452);
            	    expr22=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_1, expr22.getTree());


            	    retval.list.add((expr22!=null?expr22.n:null));

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


    public static class table_spec_list_return extends TreeRuleReturnScope {
        public List<Node> list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_spec_list"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:120:1: table_spec_list returns [List<Node> list] : (t= table_spec )+ ;
    public final SQLTree.table_spec_list_return table_spec_list() throws RecognitionException {
        SQLTree.table_spec_list_return retval = new SQLTree.table_spec_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.table_spec_return t =null;




          retval.list = new ArrayList<Node>();

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:124:3: ( (t= table_spec )+ )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:124:5: (t= table_spec )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:124:5: (t= table_spec )+
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
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:124:6: t= table_spec
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_table_spec_in_table_spec_list477);
            	    t=table_spec();

            	    state._fsp--;

            	    adaptor.addChild(root_0, t.getTree());


            	    retval.list.add((t!=null?t.n:null));

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
    // $ANTLR end "table_spec_list"


    public static class table_spec_return extends TreeRuleReturnScope {
        public Node n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_spec"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:127:1: table_spec returns [Node n] : t= identifier (p= identifier )? ;
    public final SQLTree.table_spec_return table_spec() throws RecognitionException {
        SQLTree.table_spec_return retval = new SQLTree.table_spec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.identifier_return t =null;

        SQLTree.identifier_return p =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:128:3: (t= identifier (p= identifier )? )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:128:5: t= identifier (p= identifier )?
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_table_spec500);
            t=identifier();

            state._fsp--;

            adaptor.addChild(root_0, t.getTree());


            retval.n = (t!=null?t.n:null);

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:129:5: (p= identifier )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENTIFIER) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:129:6: p= identifier
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_table_spec510);
                    p=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, p.getTree());


                    ((Identifier)retval.n).setPseudonym(((Identifier)(p!=null?p.n:null)).getName());

                    }
                    break;

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
    // $ANTLR end "table_spec"


    public static class identifier_list_return extends TreeRuleReturnScope {
        public List<Node> list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier_list"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:132:1: identifier_list returns [List<Node> list] : (i= identifier )+ ;
    public final SQLTree.identifier_list_return identifier_list() throws RecognitionException {
        SQLTree.identifier_list_return retval = new SQLTree.identifier_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.identifier_return i =null;




          retval.list = new ArrayList();

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:136:3: ( (i= identifier )+ )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:136:4: (i= identifier )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:136:4: (i= identifier )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==IDENTIFIER) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:136:5: i= identifier
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_identifier_in_identifier_list539);
            	    i=identifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, i.getTree());


            	    retval.list.add((i!=null?i.n:null));

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:140:1: where_clause returns [Condition n] : ^( WHERE c= condition ) ;
    public final SQLTree.where_clause_return where_clause() throws RecognitionException {
        SQLTree.where_clause_return retval = new SQLTree.where_clause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WHERE23=null;
        SQLTree.condition_return c =null;


        CommonTree WHERE23_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:141:3: ( ^( WHERE c= condition ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:141:7: ^( WHERE c= condition )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WHERE23=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_where_clause564); 
            WHERE23_tree = (CommonTree)adaptor.dupNode(WHERE23);


            root_1 = (CommonTree)adaptor.becomeRoot(WHERE23_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_condition_in_where_clause568);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:143:1: condition returns [Condition n] : ( ^( OR l= condition r= condition ) | ^( AND l= condition r= condition ) |p= predicate );
    public final SQLTree.condition_return condition() throws RecognitionException {
        SQLTree.condition_return retval = new SQLTree.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OR24=null;
        CommonTree AND25=null;
        SQLTree.condition_return l =null;

        SQLTree.condition_return r =null;

        SQLTree.predicate_return p =null;


        CommonTree OR24_tree=null;
        CommonTree AND25_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:144:3: ( ^( OR l= condition r= condition ) | ^( AND l= condition r= condition ) |p= predicate )
            int alt9=3;
            switch ( input.LA(1) ) {
            case OR:
                {
                alt9=1;
                }
                break;
            case AND:
                {
                alt9=2;
                }
                break;
            case EQ:
            case GE:
            case GT:
            case LE:
            case LT:
            case NE:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:144:5: ^( OR l= condition r= condition )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    OR24=(CommonTree)match(input,OR,FOLLOW_OR_in_condition588); 
                    OR24_tree = (CommonTree)adaptor.dupNode(OR24);


                    root_1 = (CommonTree)adaptor.becomeRoot(OR24_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition592);
                    l=condition();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition596);
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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:151:5: ^( AND l= condition r= condition )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    AND25=(CommonTree)match(input,AND,FOLLOW_AND_in_condition611); 
                    AND25_tree = (CommonTree)adaptor.dupNode(AND25);


                    root_1 = (CommonTree)adaptor.becomeRoot(AND25_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition615);
                    l=condition();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition619);
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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:158:5: p= predicate
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_predicate_in_condition636);
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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:161:1: predicate returns [Predicate n] : ( ^( EQ l= expr r= expr ) | ^( LT expr expr ) | ^( GT expr expr ) | ^( GE expr expr ) | ^( LE expr expr ) | ^( NE expr expr ) );
    public final SQLTree.predicate_return predicate() throws RecognitionException {
        SQLTree.predicate_return retval = new SQLTree.predicate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ26=null;
        CommonTree LT27=null;
        CommonTree GT30=null;
        CommonTree GE33=null;
        CommonTree LE36=null;
        CommonTree NE39=null;
        SQLTree.expr_return l =null;

        SQLTree.expr_return r =null;

        SQLTree.expr_return expr28 =null;

        SQLTree.expr_return expr29 =null;

        SQLTree.expr_return expr31 =null;

        SQLTree.expr_return expr32 =null;

        SQLTree.expr_return expr34 =null;

        SQLTree.expr_return expr35 =null;

        SQLTree.expr_return expr37 =null;

        SQLTree.expr_return expr38 =null;

        SQLTree.expr_return expr40 =null;

        SQLTree.expr_return expr41 =null;


        CommonTree EQ26_tree=null;
        CommonTree LT27_tree=null;
        CommonTree GT30_tree=null;
        CommonTree GE33_tree=null;
        CommonTree LE36_tree=null;
        CommonTree NE39_tree=null;


          retval.n = new Predicate(((CommonTree)retval.start));

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:165:3: ( ^( EQ l= expr r= expr ) | ^( LT expr expr ) | ^( GT expr expr ) | ^( GE expr expr ) | ^( LE expr expr ) | ^( NE expr expr ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt10=1;
                }
                break;
            case LT:
                {
                alt10=2;
                }
                break;
            case GT:
                {
                alt10=3;
                }
                break;
            case GE:
                {
                alt10=4;
                }
                break;
            case LE:
                {
                alt10=5;
                }
                break;
            case NE:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:165:5: ^( EQ l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQ26=(CommonTree)match(input,EQ,FOLLOW_EQ_in_predicate660); 
                    EQ26_tree = (CommonTree)adaptor.dupNode(EQ26);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQ26_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate664);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate668);
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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:171:5: ^( LT expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LT27=(CommonTree)match(input,LT,FOLLOW_LT_in_predicate683); 
                    LT27_tree = (CommonTree)adaptor.dupNode(LT27);


                    root_1 = (CommonTree)adaptor.becomeRoot(LT27_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate685);
                    expr28=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr28.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate687);
                    expr29=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr29.getTree());


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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:177:5: ^( GT expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GT30=(CommonTree)match(input,GT,FOLLOW_GT_in_predicate701); 
                    GT30_tree = (CommonTree)adaptor.dupNode(GT30);


                    root_1 = (CommonTree)adaptor.becomeRoot(GT30_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate703);
                    expr31=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr31.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate705);
                    expr32=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr32.getTree());


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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:183:5: ^( GE expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GE33=(CommonTree)match(input,GE,FOLLOW_GE_in_predicate719); 
                    GE33_tree = (CommonTree)adaptor.dupNode(GE33);


                    root_1 = (CommonTree)adaptor.becomeRoot(GE33_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate721);
                    expr34=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr34.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate723);
                    expr35=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr35.getTree());


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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:189:5: ^( LE expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LE36=(CommonTree)match(input,LE,FOLLOW_LE_in_predicate737); 
                    LE36_tree = (CommonTree)adaptor.dupNode(LE36);


                    root_1 = (CommonTree)adaptor.becomeRoot(LE36_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate739);
                    expr37=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr37.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate741);
                    expr38=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr38.getTree());


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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:195:5: ^( NE expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NE39=(CommonTree)match(input,NE,FOLLOW_NE_in_predicate755); 
                    NE39_tree = (CommonTree)adaptor.dupNode(NE39);


                    root_1 = (CommonTree)adaptor.becomeRoot(NE39_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate757);
                    expr40=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr40.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate759);
                    expr41=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr41.getTree());


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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:205:1: expr returns [Node n] : ( ^( PLUS l= expr r= expr ) | ^( MINUS l= expr r= expr ) | ^( MUL l= expr r= expr ) | ^( DIV l= expr r= expr ) | ^( MOD l= expr r= expr ) | term );
    public final SQLTree.expr_return expr() throws RecognitionException {
        SQLTree.expr_return retval = new SQLTree.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PLUS42=null;
        CommonTree MINUS43=null;
        CommonTree MUL44=null;
        CommonTree DIV45=null;
        CommonTree MOD46=null;
        SQLTree.expr_return l =null;

        SQLTree.expr_return r =null;

        SQLTree.term_return term47 =null;


        CommonTree PLUS42_tree=null;
        CommonTree MINUS43_tree=null;
        CommonTree MUL44_tree=null;
        CommonTree DIV45_tree=null;
        CommonTree MOD46_tree=null;


        retval.n = null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:209:3: ( ^( PLUS l= expr r= expr ) | ^( MINUS l= expr r= expr ) | ^( MUL l= expr r= expr ) | ^( DIV l= expr r= expr ) | ^( MOD l= expr r= expr ) | term )
            int alt11=6;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt11=1;
                }
                break;
            case MINUS:
                {
                alt11=2;
                }
                break;
            case MUL:
                {
                alt11=3;
                }
                break;
            case DIV:
                {
                alt11=4;
                }
                break;
            case MOD:
                {
                alt11=5;
                }
                break;
            case DATE:
            case IDENTIFIER:
            case REAL_LIT:
            case STRING_LIT:
            case TIME:
            case TIMESTAMP:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:209:5: ^( PLUS l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PLUS42=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expr790); 
                    PLUS42_tree = (CommonTree)adaptor.dupNode(PLUS42);


                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS42_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr794);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr798);
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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:210:5: ^( MINUS l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MINUS43=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expr808); 
                    MINUS43_tree = (CommonTree)adaptor.dupNode(MINUS43);


                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS43_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr812);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr816);
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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:211:5: ^( MUL l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MUL44=(CommonTree)match(input,MUL,FOLLOW_MUL_in_expr825); 
                    MUL44_tree = (CommonTree)adaptor.dupNode(MUL44);


                    root_1 = (CommonTree)adaptor.becomeRoot(MUL44_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr829);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr833);
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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:212:5: ^( DIV l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DIV45=(CommonTree)match(input,DIV,FOLLOW_DIV_in_expr842); 
                    DIV45_tree = (CommonTree)adaptor.dupNode(DIV45);


                    root_1 = (CommonTree)adaptor.becomeRoot(DIV45_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr846);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr850);
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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:213:5: ^( MOD l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MOD46=(CommonTree)match(input,MOD,FOLLOW_MOD_in_expr859); 
                    MOD46_tree = (CommonTree)adaptor.dupNode(MOD46);


                    root_1 = (CommonTree)adaptor.becomeRoot(MOD46_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr863);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr867);
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
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:214:5: term
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term_in_expr875);
                    term47=term();

                    state._fsp--;

                    adaptor.addChild(root_0, term47.getTree());


                    retval.n = (Node)(term47!=null?term47.n:null);

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:217:1: term returns [Node n] : (c= column_identifier | value );
    public final SQLTree.term_return term() throws RecognitionException {
        SQLTree.term_return retval = new SQLTree.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.column_identifier_return c =null;

        SQLTree.value_return value48 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:218:3: (c= column_identifier | value )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENTIFIER) ) {
                alt12=1;
            }
            else if ( (LA12_0==DATE||LA12_0==REAL_LIT||LA12_0==STRING_LIT||(LA12_0 >= TIME && LA12_0 <= TIMESTAMP)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:218:5: c= column_identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_column_identifier_in_term896);
                    c=column_identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, c.getTree());


                    retval.n = (c!=null?c.n:null);

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:219:5: value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_value_in_term904);
                    value48=value();

                    state._fsp--;

                    adaptor.addChild(root_0, value48.getTree());


                    retval.n = (value48!=null?value48.n:null);

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


    public static class column_identifier_return extends TreeRuleReturnScope {
        public Node n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_identifier"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:222:1: column_identifier returns [Node n] : i1= identifier (i2= identifier )? ;
    public final SQLTree.column_identifier_return column_identifier() throws RecognitionException {
        SQLTree.column_identifier_return retval = new SQLTree.column_identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.identifier_return i1 =null;

        SQLTree.identifier_return i2 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:223:3: (i1= identifier (i2= identifier )? )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:223:5: i1= identifier (i2= identifier )?
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_column_identifier925);
            i1=identifier();

            state._fsp--;

            adaptor.addChild(root_0, i1.getTree());


            retval.n = (i1!=null?i1.n:null);

            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:224:5: (i2= identifier )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENTIFIER) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:224:6: i2= identifier
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_column_identifier936);
                    i2=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, i2.getTree());


                    retval.n =(i2!=null?i2.n:null);
                          Identifier i = (Identifier)retval.n;
                          i.setTableAlias(((Identifier)(i1!=null?i1.n:null)).getName());
                          

                    }
                    break;

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
    // $ANTLR end "column_identifier"


    public static class value_return extends TreeRuleReturnScope {
        public Value n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:232:1: value returns [Value n] : ( number_value | string_value | date_value | time_value | timestamp_value );
    public final SQLTree.value_return value() throws RecognitionException {
        SQLTree.value_return retval = new SQLTree.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.number_value_return number_value49 =null;

        SQLTree.string_value_return string_value50 =null;

        SQLTree.date_value_return date_value51 =null;

        SQLTree.time_value_return time_value52 =null;

        SQLTree.timestamp_value_return timestamp_value53 =null;



        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:233:3: ( number_value | string_value | date_value | time_value | timestamp_value )
            int alt14=5;
            switch ( input.LA(1) ) {
            case REAL_LIT:
                {
                alt14=1;
                }
                break;
            case STRING_LIT:
                {
                alt14=2;
                }
                break;
            case DATE:
                {
                alt14=3;
                }
                break;
            case TIME:
                {
                alt14=4;
                }
                break;
            case TIMESTAMP:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:234:3: number_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_number_value_in_value971);
                    number_value49=number_value();

                    state._fsp--;

                    adaptor.addChild(root_0, number_value49.getTree());


                    retval.n = (number_value49!=null?number_value49.n:null);

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:235:5: string_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_string_value_in_value980);
                    string_value50=string_value();

                    state._fsp--;

                    adaptor.addChild(root_0, string_value50.getTree());


                    retval.n = (string_value50!=null?string_value50.n:null);

                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:236:5: date_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_date_value_in_value988);
                    date_value51=date_value();

                    state._fsp--;

                    adaptor.addChild(root_0, date_value51.getTree());


                    retval.n = (date_value51!=null?date_value51.n:null);

                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:237:5: time_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_time_value_in_value996);
                    time_value52=time_value();

                    state._fsp--;

                    adaptor.addChild(root_0, time_value52.getTree());


                    retval.n = (time_value52!=null?time_value52.n:null);

                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:238:5: timestamp_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_timestamp_value_in_value1004);
                    timestamp_value53=timestamp_value();

                    state._fsp--;

                    adaptor.addChild(root_0, timestamp_value53.getTree());


                    retval.n = (timestamp_value53!=null?timestamp_value53.n:null);

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:242:1: number_value returns [Value n] : REAL_LIT ;
    public final SQLTree.number_value_return number_value() throws RecognitionException {
        SQLTree.number_value_return retval = new SQLTree.number_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REAL_LIT54=null;

        CommonTree REAL_LIT54_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:243:3: ( REAL_LIT )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:244:3: REAL_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            REAL_LIT54=(CommonTree)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_number_value1025); 
            REAL_LIT54_tree = (CommonTree)adaptor.dupNode(REAL_LIT54);


            adaptor.addChild(root_0, REAL_LIT54_tree);


            retval.n = NumberFactory.getNumberValue(((CommonTree)retval.start), (REAL_LIT54!=null?REAL_LIT54.getText():null));

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:247:1: string_value returns [Value n] : STRING_LIT ;
    public final SQLTree.string_value_return string_value() throws RecognitionException {
        SQLTree.string_value_return retval = new SQLTree.string_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STRING_LIT55=null;

        CommonTree STRING_LIT55_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:248:3: ( STRING_LIT )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:249:3: STRING_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            STRING_LIT55=(CommonTree)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_string_value1046); 
            STRING_LIT55_tree = (CommonTree)adaptor.dupNode(STRING_LIT55);


            adaptor.addChild(root_0, STRING_LIT55_tree);



                  StringValue s = new StringValue(((CommonTree)retval.start));
                  s.setValue((STRING_LIT55!=null?STRING_LIT55.getText():null));
                  retval.n = (Value)s;
                

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:257:1: date_value returns [Value n] : DATE string_value ;
    public final SQLTree.date_value_return date_value() throws RecognitionException {
        SQLTree.date_value_return retval = new SQLTree.date_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DATE56=null;
        SQLTree.string_value_return string_value57 =null;


        CommonTree DATE56_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:258:3: ( DATE string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:259:3: DATE string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            DATE56=(CommonTree)match(input,DATE,FOLLOW_DATE_in_date_value1072); 
            DATE56_tree = (CommonTree)adaptor.dupNode(DATE56);


            adaptor.addChild(root_0, DATE56_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_value_in_date_value1074);
            string_value57=string_value();

            state._fsp--;

            adaptor.addChild(root_0, string_value57.getTree());


            retval.n = (string_value57!=null?string_value57.n:null);

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:262:1: time_value returns [Value n] : TIME string_value ;
    public final SQLTree.time_value_return time_value() throws RecognitionException {
        SQLTree.time_value_return retval = new SQLTree.time_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TIME58=null;
        SQLTree.string_value_return string_value59 =null;


        CommonTree TIME58_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:263:3: ( TIME string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:264:3: TIME string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            TIME58=(CommonTree)match(input,TIME,FOLLOW_TIME_in_time_value1095); 
            TIME58_tree = (CommonTree)adaptor.dupNode(TIME58);


            adaptor.addChild(root_0, TIME58_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_value_in_time_value1097);
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
    // $ANTLR end "time_value"


    public static class timestamp_value_return extends TreeRuleReturnScope {
        public Value n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timestamp_value"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:267:1: timestamp_value returns [Value n] : TIMESTAMP string_value ;
    public final SQLTree.timestamp_value_return timestamp_value() throws RecognitionException {
        SQLTree.timestamp_value_return retval = new SQLTree.timestamp_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TIMESTAMP60=null;
        SQLTree.string_value_return string_value61 =null;


        CommonTree TIMESTAMP60_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:268:3: ( TIMESTAMP string_value )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:269:3: TIMESTAMP string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            TIMESTAMP60=(CommonTree)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_timestamp_value1118); 
            TIMESTAMP60_tree = (CommonTree)adaptor.dupNode(TIMESTAMP60);


            adaptor.addChild(root_0, TIMESTAMP60_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_value_in_timestamp_value1120);
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
    // $ANTLR end "timestamp_value"


    public static class identifier_return extends TreeRuleReturnScope {
        public Identifier n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:272:1: identifier returns [Identifier n] : IDENTIFIER ;
    public final SQLTree.identifier_return identifier() throws RecognitionException {
        SQLTree.identifier_return retval = new SQLTree.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENTIFIER62=null;

        CommonTree IDENTIFIER62_tree=null;


          retval.n = new Identifier (((CommonTree)retval.start));

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:276:3: ( IDENTIFIER )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:277:3: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER62=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier1145); 
            IDENTIFIER62_tree = (CommonTree)adaptor.dupNode(IDENTIFIER62);


            adaptor.addChild(root_0, IDENTIFIER62_tree);



            	    retval.n.setName((IDENTIFIER62!=null?IDENTIFIER62.getText():null));
            	  

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
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:283:1: assignment_list returns [List<Node> list] : ^( UPDATE_ASSIGNMENTS ( assignment )+ ) ;
    public final SQLTree.assignment_list_return assignment_list() throws RecognitionException {
        SQLTree.assignment_list_return retval = new SQLTree.assignment_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UPDATE_ASSIGNMENTS63=null;
        SQLTree.assignment_return assignment64 =null;


        CommonTree UPDATE_ASSIGNMENTS63_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:284:3: ( ^( UPDATE_ASSIGNMENTS ( assignment )+ ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:284:4: ^( UPDATE_ASSIGNMENTS ( assignment )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UPDATE_ASSIGNMENTS63=(CommonTree)match(input,UPDATE_ASSIGNMENTS,FOLLOW_UPDATE_ASSIGNMENTS_in_assignment_list1167); 
            UPDATE_ASSIGNMENTS63_tree = (CommonTree)adaptor.dupNode(UPDATE_ASSIGNMENTS63);


            root_1 = (CommonTree)adaptor.becomeRoot(UPDATE_ASSIGNMENTS63_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:284:25: ( assignment )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==EQ) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:284:26: assignment
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_assignment_in_assignment_list1170);
            	    assignment64=assignment();

            	    state._fsp--;

            	    adaptor.addChild(root_1, assignment64.getTree());


            	    retval.list.add((assignment64!=null?assignment64.n:null));

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // $ANTLR end "assignment_list"


    public static class assignment_return extends TreeRuleReturnScope {
        public Node n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:287:1: assignment returns [Node n] : ^( EQ identifier expr ) ;
    public final SQLTree.assignment_return assignment() throws RecognitionException {
        SQLTree.assignment_return retval = new SQLTree.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ65=null;
        SQLTree.identifier_return identifier66 =null;

        SQLTree.expr_return expr67 =null;


        CommonTree EQ65_tree=null;

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:288:3: ( ^( EQ identifier expr ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:288:5: ^( EQ identifier expr )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQ65=(CommonTree)match(input,EQ,FOLLOW_EQ_in_assignment1192); 
            EQ65_tree = (CommonTree)adaptor.dupNode(EQ65);


            root_1 = (CommonTree)adaptor.becomeRoot(EQ65_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_assignment1194);
            identifier66=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier66.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_assignment1196);
            expr67=expr();

            state._fsp--;

            adaptor.addChild(root_1, expr67.getTree());


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


    public static class table_columns_def_return extends TreeRuleReturnScope {
        public List<Node> list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_columns_def"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:291:1: table_columns_def returns [List<Node> list] : ^( COLUMN_DEF_LIST ( table_column_def )+ ) ;
    public final SQLTree.table_columns_def_return table_columns_def() throws RecognitionException {
        SQLTree.table_columns_def_return retval = new SQLTree.table_columns_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLUMN_DEF_LIST68=null;
        SQLTree.table_column_def_return table_column_def69 =null;


        CommonTree COLUMN_DEF_LIST68_tree=null;


          retval.list = new ArrayList<Node>();

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:295:3: ( ^( COLUMN_DEF_LIST ( table_column_def )+ ) )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:296:3: ^( COLUMN_DEF_LIST ( table_column_def )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            COLUMN_DEF_LIST68=(CommonTree)match(input,COLUMN_DEF_LIST,FOLLOW_COLUMN_DEF_LIST_in_table_columns_def1221); 
            COLUMN_DEF_LIST68_tree = (CommonTree)adaptor.dupNode(COLUMN_DEF_LIST68);


            root_1 = (CommonTree)adaptor.becomeRoot(COLUMN_DEF_LIST68_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:296:21: ( table_column_def )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==IDENTIFIER) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:296:22: table_column_def
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_table_column_def_in_table_columns_def1224);
            	    table_column_def69=table_column_def();

            	    state._fsp--;

            	    adaptor.addChild(root_1, table_column_def69.getTree());


            	    retval.list.add((table_column_def69!=null?table_column_def69.n:null));

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // $ANTLR end "table_columns_def"


    public static class table_column_def_return extends TreeRuleReturnScope {
        public Node n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_column_def"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:299:1: table_column_def returns [Node n] : i= identifier t= type_specifier ;
    public final SQLTree.table_column_def_return table_column_def() throws RecognitionException {
        SQLTree.table_column_def_return retval = new SQLTree.table_column_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.identifier_return i =null;

        SQLTree.type_specifier_return t =null;




         ColumnSpecification c = new ColumnSpecification(((CommonTree)retval.start));

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:303:3: (i= identifier t= type_specifier )
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:303:5: i= identifier t= type_specifier
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_table_column_def1251);
            i=identifier();

            state._fsp--;

            adaptor.addChild(root_0, i.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_specifier_in_table_column_def1255);
            t=type_specifier();

            state._fsp--;

            adaptor.addChild(root_0, t.getTree());



                  c.setName((i!=null?i.n:null));
                  c.setType((t!=null?t.d:null));
                  retval.n = c;
                

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
    // $ANTLR end "table_column_def"


    public static class type_specifier_return extends TreeRuleReturnScope {
        public DataType d;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_specifier"
    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:311:1: type_specifier returns [DataType d] : ( INT | FLOAT | CHAR LPAREN p= number_value RPAREN | VARCHAR LPAREN p= number_value RPAREN | DATE | TIME | TIMESTAMP );
    public final SQLTree.type_specifier_return type_specifier() throws RecognitionException {
        SQLTree.type_specifier_return retval = new SQLTree.type_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INT70=null;
        CommonTree FLOAT71=null;
        CommonTree CHAR72=null;
        CommonTree LPAREN73=null;
        CommonTree RPAREN74=null;
        CommonTree VARCHAR75=null;
        CommonTree LPAREN76=null;
        CommonTree RPAREN77=null;
        CommonTree DATE78=null;
        CommonTree TIME79=null;
        CommonTree TIMESTAMP80=null;
        SQLTree.number_value_return p =null;


        CommonTree INT70_tree=null;
        CommonTree FLOAT71_tree=null;
        CommonTree CHAR72_tree=null;
        CommonTree LPAREN73_tree=null;
        CommonTree RPAREN74_tree=null;
        CommonTree VARCHAR75_tree=null;
        CommonTree LPAREN76_tree=null;
        CommonTree RPAREN77_tree=null;
        CommonTree DATE78_tree=null;
        CommonTree TIME79_tree=null;
        CommonTree TIMESTAMP80_tree=null;


          retval.d = new DataType(((CommonTree)retval.start));

        try {
            // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:315:3: ( INT | FLOAT | CHAR LPAREN p= number_value RPAREN | VARCHAR LPAREN p= number_value RPAREN | DATE | TIME | TIMESTAMP )
            int alt17=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt17=1;
                }
                break;
            case FLOAT:
                {
                alt17=2;
                }
                break;
            case CHAR:
                {
                alt17=3;
                }
                break;
            case VARCHAR:
                {
                alt17=4;
                }
                break;
            case DATE:
                {
                alt17=5;
                }
                break;
            case TIME:
                {
                alt17=6;
                }
                break;
            case TIMESTAMP:
                {
                alt17=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:315:5: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INT70=(CommonTree)match(input,INT,FOLLOW_INT_in_type_specifier1282); 
                    INT70_tree = (CommonTree)adaptor.dupNode(INT70);


                    adaptor.addChild(root_0, INT70_tree);


                    retval.d.setColumnType(ColumnType.INTEGER);

                    }
                    break;
                case 2 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:316:5: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    FLOAT71=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier1290); 
                    FLOAT71_tree = (CommonTree)adaptor.dupNode(FLOAT71);


                    adaptor.addChild(root_0, FLOAT71_tree);


                    retval.d.setColumnType(ColumnType.DOUBLE);

                    }
                    break;
                case 3 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:317:5: CHAR LPAREN p= number_value RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CHAR72=(CommonTree)match(input,CHAR,FOLLOW_CHAR_in_type_specifier1298); 
                    CHAR72_tree = (CommonTree)adaptor.dupNode(CHAR72);


                    adaptor.addChild(root_0, CHAR72_tree);


                    _last = (CommonTree)input.LT(1);
                    LPAREN73=(CommonTree)match(input,LPAREN,FOLLOW_LPAREN_in_type_specifier1300); 
                    LPAREN73_tree = (CommonTree)adaptor.dupNode(LPAREN73);


                    adaptor.addChild(root_0, LPAREN73_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_number_value_in_type_specifier1304);
                    p=number_value();

                    state._fsp--;

                    adaptor.addChild(root_0, p.getTree());


                    _last = (CommonTree)input.LT(1);
                    RPAREN74=(CommonTree)match(input,RPAREN,FOLLOW_RPAREN_in_type_specifier1306); 
                    RPAREN74_tree = (CommonTree)adaptor.dupNode(RPAREN74);


                    adaptor.addChild(root_0, RPAREN74_tree);



                          retval.d.setColumnType(ColumnType.STRING);
                          if (!((p!=null?p.n:null) instanceof IntegerValue)){
                            throw new org.antlr.runtime.RecognitionException();
                          }
                          IntegerValue v = (IntegerValue)(p!=null?p.n:null);
                          retval.d.setPrecision(v.getValue());
                        

                    }
                    break;
                case 4 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:326:5: VARCHAR LPAREN p= number_value RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    VARCHAR75=(CommonTree)match(input,VARCHAR,FOLLOW_VARCHAR_in_type_specifier1318); 
                    VARCHAR75_tree = (CommonTree)adaptor.dupNode(VARCHAR75);


                    adaptor.addChild(root_0, VARCHAR75_tree);


                    _last = (CommonTree)input.LT(1);
                    LPAREN76=(CommonTree)match(input,LPAREN,FOLLOW_LPAREN_in_type_specifier1320); 
                    LPAREN76_tree = (CommonTree)adaptor.dupNode(LPAREN76);


                    adaptor.addChild(root_0, LPAREN76_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_number_value_in_type_specifier1324);
                    p=number_value();

                    state._fsp--;

                    adaptor.addChild(root_0, p.getTree());


                    _last = (CommonTree)input.LT(1);
                    RPAREN77=(CommonTree)match(input,RPAREN,FOLLOW_RPAREN_in_type_specifier1326); 
                    RPAREN77_tree = (CommonTree)adaptor.dupNode(RPAREN77);


                    adaptor.addChild(root_0, RPAREN77_tree);



                          retval.d.setColumnType(ColumnType.STRING);
                          if (!((p!=null?p.n:null) instanceof IntegerValue)){
                            throw new org.antlr.runtime.RecognitionException();
                          }
                          IntegerValue v = (IntegerValue)(p!=null?p.n:null);
                          retval.d.setPrecision(v.getValue());
                        

                    }
                    break;
                case 5 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:335:5: DATE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    DATE78=(CommonTree)match(input,DATE,FOLLOW_DATE_in_type_specifier1338); 
                    DATE78_tree = (CommonTree)adaptor.dupNode(DATE78);


                    adaptor.addChild(root_0, DATE78_tree);


                    retval.d.setColumnType(ColumnType.DATE);

                    }
                    break;
                case 6 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:337:5: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    TIME79=(CommonTree)match(input,TIME,FOLLOW_TIME_in_type_specifier1350); 
                    TIME79_tree = (CommonTree)adaptor.dupNode(TIME79);


                    adaptor.addChild(root_0, TIME79_tree);


                    retval.d.setColumnType(ColumnType.TIME);

                    }
                    break;
                case 7 :
                    // D:\\workspace\\MiniDB\\src\\org\\pytun\\sql\\SQLTree.g:339:5: TIMESTAMP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    TIMESTAMP80=(CommonTree)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_type_specifier1362); 
                    TIMESTAMP80_tree = (CommonTree)adaptor.dupNode(TIMESTAMP80);


                    adaptor.addChild(root_0, TIMESTAMP80_tree);


                    retval.d.setColumnType(ColumnType.TIMESTAMP);

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
    // $ANTLR end "type_specifier"

    // Delegated rules


 

    public static final BitSet FOLLOW_sql_statement_in_query95 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SEMI_in_query97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_sql_statement123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_statement_in_sql_statement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_statement_in_sql_statement143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_statement_in_sql_statement152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_statement_in_sql_statement161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_statement_in_sql_statement170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_statement_in_sql_statement181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_STMT_in_select_statement206 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_list_in_select_statement212 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_table_spec_list_in_select_statement216 = new BitSet(new long[]{0x0100000000000008L});
    public static final BitSet FOLLOW_where_clause_in_select_statement222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_STMT_in_update_statement246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_update_statement250 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_assignment_list_in_update_statement254 = new BitSet(new long[]{0x0100000000000008L});
    public static final BitSet FOLLOW_where_clause_in_update_statement258 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_STMT_in_insert_statement291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_insert_statement293 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_identifier_list_in_insert_statement297 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_expression_list_in_insert_statement301 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_STMT_in_delete_statement328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_delete_statement330 = new BitSet(new long[]{0x0100000000000008L});
    public static final BitSet FOLLOW_where_clause_in_delete_statement332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_STMT_in_create_statement358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_create_statement362 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_table_columns_def_in_create_statement366 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DROP_STMT_in_drop_statement398 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_drop_statement400 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTER_in_alter_statement426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPR_LIST_in_expression_list449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression_list452 = new BitSet(new long[]{0x0006418E01008808L});
    public static final BitSet FOLLOW_table_spec_in_table_spec_list477 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_identifier_in_table_spec500 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_identifier_in_table_spec510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list539 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clause564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_where_clause568 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_condition588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition592 = new BitSet(new long[]{0x0000005120C40020L});
    public static final BitSet FOLLOW_condition_in_condition596 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_condition611 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition615 = new BitSet(new long[]{0x0000005120C40020L});
    public static final BitSet FOLLOW_condition_in_condition619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_predicate_in_condition636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_predicate660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate664 = new BitSet(new long[]{0x0006418E01008800L});
    public static final BitSet FOLLOW_expr_in_predicate668 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_predicate683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate685 = new BitSet(new long[]{0x0006418E01008800L});
    public static final BitSet FOLLOW_expr_in_predicate687 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_predicate701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate703 = new BitSet(new long[]{0x0006418E01008800L});
    public static final BitSet FOLLOW_expr_in_predicate705 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_predicate719 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate721 = new BitSet(new long[]{0x0006418E01008800L});
    public static final BitSet FOLLOW_expr_in_predicate723 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_predicate737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate739 = new BitSet(new long[]{0x0006418E01008800L});
    public static final BitSet FOLLOW_expr_in_predicate741 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NE_in_predicate755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate757 = new BitSet(new long[]{0x0006418E01008800L});
    public static final BitSet FOLLOW_expr_in_predicate759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr790 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr794 = new BitSet(new long[]{0x0006418E01008800L});
    public static final BitSet FOLLOW_expr_in_expr798 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr808 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr812 = new BitSet(new long[]{0x0006418E01008800L});
    public static final BitSet FOLLOW_expr_in_expr816 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expr825 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr829 = new BitSet(new long[]{0x0006418E01008800L});
    public static final BitSet FOLLOW_expr_in_expr833 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr842 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr846 = new BitSet(new long[]{0x0006418E01008800L});
    public static final BitSet FOLLOW_expr_in_expr850 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr859 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr863 = new BitSet(new long[]{0x0006418E01008800L});
    public static final BitSet FOLLOW_expr_in_expr867 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_term_in_expr875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_identifier_in_term896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_column_identifier925 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_identifier_in_column_identifier936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_value_in_value971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_value_in_value980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_value_in_value988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_value_in_value996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestamp_value_in_value1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_number_value1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LIT_in_string_value1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_date_value1072 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_string_value_in_date_value1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_time_value1095 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_string_value_in_time_value1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_timestamp_value1118 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_string_value_in_timestamp_value1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_ASSIGNMENTS_in_assignment_list1167 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignment_in_assignment_list1170 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_EQ_in_assignment1192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_assignment1194 = new BitSet(new long[]{0x0006418E01008800L});
    public static final BitSet FOLLOW_expr_in_assignment1196 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_DEF_LIST_in_table_columns_def1221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_column_def_in_table_columns_def1224 = new BitSet(new long[]{0x0000000001000008L});
    public static final BitSet FOLLOW_identifier_in_table_column_def1251 = new BitSet(new long[]{0x0086000008100880L});
    public static final BitSet FOLLOW_type_specifier_in_table_column_def1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type_specifier1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier1298 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_specifier1300 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_number_value_in_type_specifier1304 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_specifier1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARCHAR_in_type_specifier1318 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_specifier1320 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_number_value_in_type_specifier1324 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_specifier1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_type_specifier1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_type_specifier1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_type_specifier1362 = new BitSet(new long[]{0x0000000000000002L});

}