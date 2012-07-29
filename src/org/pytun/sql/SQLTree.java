// $ANTLR 3.4 D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g 2012-07-29 15:44:26

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
    public String getGrammarFileName() { return "D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g"; }


    public static class query_return extends TreeRuleReturnScope {
        public Query n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:18:1: query returns [Query n] : sql_statement SEMI !;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:22:3: ( sql_statement SEMI !)
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:23:3: sql_statement SEMI !
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:26:1: sql_statement returns [Query n] : ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement );
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:30:3: ( select_statement | update_statement | insert_statement | delete_statement | create_statement | drop_statement | alter_statement )
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:31:3: select_statement
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:32:5: update_statement
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:33:5: insert_statement
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:34:5: delete_statement
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:35:5: create_statement
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:36:5: drop_statement
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:37:5: alter_statement
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:40:1: select_statement returns [Query n] : ^( SELECT_STMT e= expression_list tl= table_spec_list (w= where_clause )? ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:44:3: ( ^( SELECT_STMT e= expression_list tl= table_spec_list (w= where_clause )? ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:44:4: ^( SELECT_STMT e= expression_list tl= table_spec_list (w= where_clause )? )
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


            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:44:59: (w= where_clause )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WHERE) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:44:59: w= where_clause
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:53:1: update_statement returns [Query n] : ^( UPDATE_STMT i= identifier al= assignment_list (w= where_clause )? ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:54:3: ( ^( UPDATE_STMT i= identifier al= assignment_list (w= where_clause )? ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:54:5: ^( UPDATE_STMT i= identifier al= assignment_list (w= where_clause )? )
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


            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:54:52: (w= where_clause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WHERE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:54:52: w= where_clause
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:65:1: insert_statement returns [Query n] : ^( INSERT_STMT identifier il= identifier_list vl= expression_list ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:69:3: ( ^( INSERT_STMT identifier il= identifier_list vl= expression_list ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:70:5: ^( INSERT_STMT identifier il= identifier_list vl= expression_list )
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:79:1: delete_statement returns [Query n] : ^( DELETE_STMT identifier ( where_clause )? ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:80:3: ( ^( DELETE_STMT identifier ( where_clause )? ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:81:3: ^( DELETE_STMT identifier ( where_clause )? )
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


            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:81:28: ( where_clause )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==WHERE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:81:28: where_clause
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:84:1: create_statement returns [Query n] : ^( CREATE_STMT name= identifier columns= table_columns_def ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:88:3: ( ^( CREATE_STMT name= identifier columns= table_columns_def ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:89:3: ^( CREATE_STMT name= identifier columns= table_columns_def )
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:97:1: drop_statement returns [Query n] : ^( DROP_STMT identifier ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:101:3: ( ^( DROP_STMT identifier ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:102:5: ^( DROP_STMT identifier )
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:109:1: alter_statement returns [Query n] : ALTER ;
    public final SQLTree.alter_statement_return alter_statement() throws RecognitionException {
        SQLTree.alter_statement_return retval = new SQLTree.alter_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ALTER20=null;

        CommonTree ALTER20_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:110:3: ( ALTER )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:111:3: ALTER
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:114:1: expression_list returns [List<Node> list] : ^( EXPR_LIST ( expr )+ ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:118:3: ( ^( EXPR_LIST ( expr )+ ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:118:5: ^( EXPR_LIST ( expr )+ )
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:118:17: ( expr )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DATE||LA5_0==DIV||LA5_0==IDENTIFIER||(LA5_0 >= MINUS && LA5_0 <= MUL)||(LA5_0 >= PLUS && LA5_0 <= REAL_LIT)||(LA5_0 >= STAR_TERM && LA5_0 <= STRING_LIT)||(LA5_0 >= TIME && LA5_0 <= TIMESTAMP)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:118:18: expr
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:120:1: table_spec_list returns [List<Node> list] : (t= table_spec )+ ;
    public final SQLTree.table_spec_list_return table_spec_list() throws RecognitionException {
        SQLTree.table_spec_list_return retval = new SQLTree.table_spec_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.table_spec_return t =null;




          retval.list = new ArrayList<Node>();

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:124:3: ( (t= table_spec )+ )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:124:5: (t= table_spec )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:124:5: (t= table_spec )+
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
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:124:6: t= table_spec
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:132:1: table_spec returns [Node n] : ( ^(i1= identifier i2= identifier ) |id= identifier );
    public final SQLTree.table_spec_return table_spec() throws RecognitionException {
        SQLTree.table_spec_return retval = new SQLTree.table_spec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.identifier_return i1 =null;

        SQLTree.identifier_return i2 =null;

        SQLTree.identifier_return id =null;



        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:133:3: ( ^(i1= identifier i2= identifier ) |id= identifier )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENTIFIER) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==DOWN) ) {
                    alt7=1;
                }
                else if ( (LA7_1==UP||LA7_1==IDENTIFIER||LA7_1==WHERE) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:133:5: ^(i1= identifier i2= identifier )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_table_spec504);
                    i1=identifier();

                    state._fsp--;

                    root_1 = (CommonTree)adaptor.becomeRoot(i1.getTree(), root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_table_spec508);
                    i2=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, i2.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                          Identifier i = (Identifier)(i1!=null?i1.n:null);
                          String pseudonym = ((Identifier)(i2!=null?i2.n:null)).getName();
                          i.setPseudonym(pseudonym);
                          retval.n = i; 
                        

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:140:5: id= identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_table_spec523);
                    id=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, id.getTree());



                          retval.n = (id!=null?id.n:null);
                        

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
    // $ANTLR end "table_spec"


    public static class identifier_list_return extends TreeRuleReturnScope {
        public List<Node> list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier_list"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:146:1: identifier_list returns [List<Node> list] : (i= identifier )+ ;
    public final SQLTree.identifier_list_return identifier_list() throws RecognitionException {
        SQLTree.identifier_list_return retval = new SQLTree.identifier_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.identifier_return i =null;




          retval.list = new ArrayList();

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:150:3: ( (i= identifier )+ )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:150:4: (i= identifier )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:150:4: (i= identifier )+
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
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:150:5: i= identifier
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_identifier_in_identifier_list555);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:154:1: where_clause returns [Condition n] : ^( WHERE c= condition ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:155:3: ( ^( WHERE c= condition ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:155:7: ^( WHERE c= condition )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WHERE23=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_where_clause580); 
            WHERE23_tree = (CommonTree)adaptor.dupNode(WHERE23);


            root_1 = (CommonTree)adaptor.becomeRoot(WHERE23_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_condition_in_where_clause584);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:157:1: condition returns [Condition n] : ( ^( OR l= condition r= condition ) | ^( AND l= condition r= condition ) |p= predicate );
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:158:3: ( ^( OR l= condition r= condition ) | ^( AND l= condition r= condition ) |p= predicate )
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:158:5: ^( OR l= condition r= condition )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    OR24=(CommonTree)match(input,OR,FOLLOW_OR_in_condition604); 
                    OR24_tree = (CommonTree)adaptor.dupNode(OR24);


                    root_1 = (CommonTree)adaptor.becomeRoot(OR24_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition608);
                    l=condition();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition612);
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:165:5: ^( AND l= condition r= condition )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    AND25=(CommonTree)match(input,AND,FOLLOW_AND_in_condition627); 
                    AND25_tree = (CommonTree)adaptor.dupNode(AND25);


                    root_1 = (CommonTree)adaptor.becomeRoot(AND25_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition631);
                    l=condition();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition635);
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:172:5: p= predicate
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_predicate_in_condition652);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:175:1: predicate returns [Predicate n] : ( ^( EQ l= expr r= expr ) | ^( LT expr expr ) | ^( GT expr expr ) | ^( GE expr expr ) | ^( LE expr expr ) | ^( NE expr expr ) );
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:179:3: ( ^( EQ l= expr r= expr ) | ^( LT expr expr ) | ^( GT expr expr ) | ^( GE expr expr ) | ^( LE expr expr ) | ^( NE expr expr ) )
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:179:5: ^( EQ l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQ26=(CommonTree)match(input,EQ,FOLLOW_EQ_in_predicate676); 
                    EQ26_tree = (CommonTree)adaptor.dupNode(EQ26);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQ26_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate680);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate684);
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:185:5: ^( LT expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LT27=(CommonTree)match(input,LT,FOLLOW_LT_in_predicate699); 
                    LT27_tree = (CommonTree)adaptor.dupNode(LT27);


                    root_1 = (CommonTree)adaptor.becomeRoot(LT27_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate701);
                    expr28=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr28.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate703);
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:191:5: ^( GT expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GT30=(CommonTree)match(input,GT,FOLLOW_GT_in_predicate717); 
                    GT30_tree = (CommonTree)adaptor.dupNode(GT30);


                    root_1 = (CommonTree)adaptor.becomeRoot(GT30_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate719);
                    expr31=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr31.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate721);
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:197:5: ^( GE expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GE33=(CommonTree)match(input,GE,FOLLOW_GE_in_predicate735); 
                    GE33_tree = (CommonTree)adaptor.dupNode(GE33);


                    root_1 = (CommonTree)adaptor.becomeRoot(GE33_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate737);
                    expr34=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr34.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate739);
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:203:5: ^( LE expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LE36=(CommonTree)match(input,LE,FOLLOW_LE_in_predicate753); 
                    LE36_tree = (CommonTree)adaptor.dupNode(LE36);


                    root_1 = (CommonTree)adaptor.becomeRoot(LE36_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate755);
                    expr37=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr37.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate757);
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
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:209:5: ^( NE expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NE39=(CommonTree)match(input,NE,FOLLOW_NE_in_predicate771); 
                    NE39_tree = (CommonTree)adaptor.dupNode(NE39);


                    root_1 = (CommonTree)adaptor.becomeRoot(NE39_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate773);
                    expr40=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr40.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_predicate775);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:219:1: expr returns [Node n] : ( ^( STAR_TERM ( identifier )? ) | ^( PLUS l= expr r= expr ) | ^( MINUS l= expr r= expr ) | ^( MUL l= expr r= expr ) | ^( DIV l= expr r= expr ) | ^( MOD l= expr r= expr ) | term );
    public final SQLTree.expr_return expr() throws RecognitionException {
        SQLTree.expr_return retval = new SQLTree.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STAR_TERM42=null;
        CommonTree PLUS44=null;
        CommonTree MINUS45=null;
        CommonTree MUL46=null;
        CommonTree DIV47=null;
        CommonTree MOD48=null;
        SQLTree.expr_return l =null;

        SQLTree.expr_return r =null;

        SQLTree.identifier_return identifier43 =null;

        SQLTree.term_return term49 =null;


        CommonTree STAR_TERM42_tree=null;
        CommonTree PLUS44_tree=null;
        CommonTree MINUS45_tree=null;
        CommonTree MUL46_tree=null;
        CommonTree DIV47_tree=null;
        CommonTree MOD48_tree=null;


        retval.n = null;
        Node i = null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:224:3: ( ^( STAR_TERM ( identifier )? ) | ^( PLUS l= expr r= expr ) | ^( MINUS l= expr r= expr ) | ^( MUL l= expr r= expr ) | ^( DIV l= expr r= expr ) | ^( MOD l= expr r= expr ) | term )
            int alt12=7;
            switch ( input.LA(1) ) {
            case STAR_TERM:
                {
                alt12=1;
                }
                break;
            case PLUS:
                {
                alt12=2;
                }
                break;
            case MINUS:
                {
                alt12=3;
                }
                break;
            case MUL:
                {
                alt12=4;
                }
                break;
            case DIV:
                {
                alt12=5;
                }
                break;
            case MOD:
                {
                alt12=6;
                }
                break;
            case DATE:
            case IDENTIFIER:
            case REAL_LIT:
            case STRING_LIT:
            case TIME:
            case TIMESTAMP:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:224:5: ^( STAR_TERM ( identifier )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    STAR_TERM42=(CommonTree)match(input,STAR_TERM,FOLLOW_STAR_TERM_in_expr806); 
                    STAR_TERM42_tree = (CommonTree)adaptor.dupNode(STAR_TERM42);


                    root_1 = (CommonTree)adaptor.becomeRoot(STAR_TERM42_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:224:17: ( identifier )?
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==IDENTIFIER) ) {
                            alt11=1;
                        }
                        switch (alt11) {
                            case 1 :
                                // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:224:18: identifier
                                {
                                _last = (CommonTree)input.LT(1);
                                pushFollow(FOLLOW_identifier_in_expr809);
                                identifier43=identifier();

                                state._fsp--;

                                adaptor.addChild(root_1, identifier43.getTree());


                                i = (identifier43!=null?identifier43.n:null);

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                          StarIdentifier si = new StarIdentifier(((CommonTree)retval.start));
                          if (i != null) {
                            si.setTableAlias(((Identifier)i).getName());
                          }
                          retval.n = si;
                        

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:232:5: ^( PLUS l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PLUS44=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expr826); 
                    PLUS44_tree = (CommonTree)adaptor.dupNode(PLUS44);


                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS44_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr830);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr834);
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
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:233:5: ^( MINUS l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MINUS45=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expr844); 
                    MINUS45_tree = (CommonTree)adaptor.dupNode(MINUS45);


                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS45_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr848);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr852);
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
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:234:5: ^( MUL l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MUL46=(CommonTree)match(input,MUL,FOLLOW_MUL_in_expr861); 
                    MUL46_tree = (CommonTree)adaptor.dupNode(MUL46);


                    root_1 = (CommonTree)adaptor.becomeRoot(MUL46_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr865);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr869);
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
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:235:5: ^( DIV l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DIV47=(CommonTree)match(input,DIV,FOLLOW_DIV_in_expr878); 
                    DIV47_tree = (CommonTree)adaptor.dupNode(DIV47);


                    root_1 = (CommonTree)adaptor.becomeRoot(DIV47_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr882);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr886);
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
                case 6 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:236:5: ^( MOD l= expr r= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MOD48=(CommonTree)match(input,MOD,FOLLOW_MOD_in_expr895); 
                    MOD48_tree = (CommonTree)adaptor.dupNode(MOD48);


                    root_1 = (CommonTree)adaptor.becomeRoot(MOD48_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr899);
                    l=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, l.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr903);
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
                case 7 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:237:5: term
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_term_in_expr911);
                    term49=term();

                    state._fsp--;

                    adaptor.addChild(root_0, term49.getTree());


                    retval.n = (Node)(term49!=null?term49.n:null);

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:240:1: term returns [Node n] : (c= column_identifier | value );
    public final SQLTree.term_return term() throws RecognitionException {
        SQLTree.term_return retval = new SQLTree.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.column_identifier_return c =null;

        SQLTree.value_return value50 =null;



        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:241:3: (c= column_identifier | value )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENTIFIER) ) {
                alt13=1;
            }
            else if ( (LA13_0==DATE||LA13_0==REAL_LIT||LA13_0==STRING_LIT||(LA13_0 >= TIME && LA13_0 <= TIMESTAMP)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:241:5: c= column_identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_column_identifier_in_term932);
                    c=column_identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, c.getTree());


                    retval.n = (c!=null?c.n:null);

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:242:5: value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_value_in_term940);
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


    public static class column_identifier_return extends TreeRuleReturnScope {
        public Node n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_identifier"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:245:1: column_identifier returns [Node n] : ( ^(i1= identifier i2= identifier ) |id= identifier );
    public final SQLTree.column_identifier_return column_identifier() throws RecognitionException {
        SQLTree.column_identifier_return retval = new SQLTree.column_identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SQLTree.identifier_return i1 =null;

        SQLTree.identifier_return i2 =null;

        SQLTree.identifier_return id =null;



        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:246:3: ( ^(i1= identifier i2= identifier ) |id= identifier )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IDENTIFIER) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==DOWN) ) {
                    alt14=1;
                }
                else if ( (LA14_1==UP||LA14_1==DATE||LA14_1==DIV||LA14_1==IDENTIFIER||(LA14_1 >= MINUS && LA14_1 <= MUL)||(LA14_1 >= PLUS && LA14_1 <= REAL_LIT)||(LA14_1 >= STAR_TERM && LA14_1 <= STRING_LIT)||(LA14_1 >= TIME && LA14_1 <= TIMESTAMP)) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:246:5: ^(i1= identifier i2= identifier )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_column_identifier962);
                    i1=identifier();

                    state._fsp--;

                    root_1 = (CommonTree)adaptor.becomeRoot(i1.getTree(), root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_column_identifier966);
                    i2=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, i2.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                          Identifier i = (Identifier)(i2!=null?i2.n:null);
                          i.setTableAlias(((Identifier)(i1!=null?i1.n:null)).getName());
                          retval.n = i;
                        

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:252:5: id= identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_column_identifier981);
                    id=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, id.getTree());



                          retval.n = (id!=null?id.n:null);
                        

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
    // $ANTLR end "column_identifier"


    public static class value_return extends TreeRuleReturnScope {
        public Value n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:258:1: value returns [Value n] : ( number_value | string_value | date_value | time_value | timestamp_value );
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:259:3: ( number_value | string_value | date_value | time_value | timestamp_value )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:260:3: number_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_number_value_in_value1006);
                    number_value51=number_value();

                    state._fsp--;

                    adaptor.addChild(root_0, number_value51.getTree());


                    retval.n = (number_value51!=null?number_value51.n:null);

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:261:5: string_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_string_value_in_value1015);
                    string_value52=string_value();

                    state._fsp--;

                    adaptor.addChild(root_0, string_value52.getTree());


                    retval.n = (string_value52!=null?string_value52.n:null);

                    }
                    break;
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:262:5: date_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_date_value_in_value1023);
                    date_value53=date_value();

                    state._fsp--;

                    adaptor.addChild(root_0, date_value53.getTree());


                    retval.n = (date_value53!=null?date_value53.n:null);

                    }
                    break;
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:263:5: time_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_time_value_in_value1031);
                    time_value54=time_value();

                    state._fsp--;

                    adaptor.addChild(root_0, time_value54.getTree());


                    retval.n = (time_value54!=null?time_value54.n:null);

                    }
                    break;
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:264:5: timestamp_value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_timestamp_value_in_value1039);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:268:1: number_value returns [Value n] : REAL_LIT ;
    public final SQLTree.number_value_return number_value() throws RecognitionException {
        SQLTree.number_value_return retval = new SQLTree.number_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REAL_LIT56=null;

        CommonTree REAL_LIT56_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:269:3: ( REAL_LIT )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:270:3: REAL_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            REAL_LIT56=(CommonTree)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_number_value1060); 
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:273:1: string_value returns [Value n] : STRING_LIT ;
    public final SQLTree.string_value_return string_value() throws RecognitionException {
        SQLTree.string_value_return retval = new SQLTree.string_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STRING_LIT57=null;

        CommonTree STRING_LIT57_tree=null;

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:274:3: ( STRING_LIT )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:275:3: STRING_LIT
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            STRING_LIT57=(CommonTree)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_string_value1081); 
            STRING_LIT57_tree = (CommonTree)adaptor.dupNode(STRING_LIT57);


            adaptor.addChild(root_0, STRING_LIT57_tree);



                  StringValue s = new StringValue(((CommonTree)retval.start));
                  s.setValue((STRING_LIT57!=null?STRING_LIT57.getText():null));
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:283:1: date_value returns [Value n] : DATE string_value ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:284:3: ( DATE string_value )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:285:3: DATE string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            DATE58=(CommonTree)match(input,DATE,FOLLOW_DATE_in_date_value1107); 
            DATE58_tree = (CommonTree)adaptor.dupNode(DATE58);


            adaptor.addChild(root_0, DATE58_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_value_in_date_value1109);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:288:1: time_value returns [Value n] : TIME string_value ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:289:3: ( TIME string_value )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:290:3: TIME string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            TIME60=(CommonTree)match(input,TIME,FOLLOW_TIME_in_time_value1130); 
            TIME60_tree = (CommonTree)adaptor.dupNode(TIME60);


            adaptor.addChild(root_0, TIME60_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_value_in_time_value1132);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:293:1: timestamp_value returns [Value n] : TIMESTAMP string_value ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:294:3: ( TIMESTAMP string_value )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:295:3: TIMESTAMP string_value
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            TIMESTAMP62=(CommonTree)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_timestamp_value1153); 
            TIMESTAMP62_tree = (CommonTree)adaptor.dupNode(TIMESTAMP62);


            adaptor.addChild(root_0, TIMESTAMP62_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_value_in_timestamp_value1155);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:298:1: identifier returns [Identifier n] : IDENTIFIER ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:302:3: ( IDENTIFIER )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:302:5: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            IDENTIFIER64=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier1178); 
            IDENTIFIER64_tree = (CommonTree)adaptor.dupNode(IDENTIFIER64);


            adaptor.addChild(root_0, IDENTIFIER64_tree);



            	    retval.n.setName((IDENTIFIER64!=null?IDENTIFIER64.getText():null));
            	  

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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:308:1: assignment_list returns [List<Node> list] : ^( UPDATE_ASSIGNMENTS ( assignment )+ ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:309:3: ( ^( UPDATE_ASSIGNMENTS ( assignment )+ ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:309:4: ^( UPDATE_ASSIGNMENTS ( assignment )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UPDATE_ASSIGNMENTS65=(CommonTree)match(input,UPDATE_ASSIGNMENTS,FOLLOW_UPDATE_ASSIGNMENTS_in_assignment_list1200); 
            UPDATE_ASSIGNMENTS65_tree = (CommonTree)adaptor.dupNode(UPDATE_ASSIGNMENTS65);


            root_1 = (CommonTree)adaptor.becomeRoot(UPDATE_ASSIGNMENTS65_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:309:25: ( assignment )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==EQ) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:309:26: assignment
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_assignment_in_assignment_list1203);
            	    assignment66=assignment();

            	    state._fsp--;

            	    adaptor.addChild(root_1, assignment66.getTree());


            	    retval.list.add((assignment66!=null?assignment66.n:null));

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
    // $ANTLR end "assignment_list"


    public static class assignment_return extends TreeRuleReturnScope {
        public Node n;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:312:1: assignment returns [Node n] : ^( EQ identifier expr ) ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:313:3: ( ^( EQ identifier expr ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:313:5: ^( EQ identifier expr )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQ67=(CommonTree)match(input,EQ,FOLLOW_EQ_in_assignment1225); 
            EQ67_tree = (CommonTree)adaptor.dupNode(EQ67);


            root_1 = (CommonTree)adaptor.becomeRoot(EQ67_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_assignment1227);
            identifier68=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier68.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_assignment1229);
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


    public static class table_columns_def_return extends TreeRuleReturnScope {
        public List<Node> list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_columns_def"
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:316:1: table_columns_def returns [List<Node> list] : ^( COLUMN_DEF_LIST ( table_column_def )+ ) ;
    public final SQLTree.table_columns_def_return table_columns_def() throws RecognitionException {
        SQLTree.table_columns_def_return retval = new SQLTree.table_columns_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLUMN_DEF_LIST70=null;
        SQLTree.table_column_def_return table_column_def71 =null;


        CommonTree COLUMN_DEF_LIST70_tree=null;


          retval.list = new ArrayList<Node>();

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:320:3: ( ^( COLUMN_DEF_LIST ( table_column_def )+ ) )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:321:3: ^( COLUMN_DEF_LIST ( table_column_def )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            COLUMN_DEF_LIST70=(CommonTree)match(input,COLUMN_DEF_LIST,FOLLOW_COLUMN_DEF_LIST_in_table_columns_def1254); 
            COLUMN_DEF_LIST70_tree = (CommonTree)adaptor.dupNode(COLUMN_DEF_LIST70);


            root_1 = (CommonTree)adaptor.becomeRoot(COLUMN_DEF_LIST70_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:321:21: ( table_column_def )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==IDENTIFIER) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:321:22: table_column_def
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_table_column_def_in_table_columns_def1257);
            	    table_column_def71=table_column_def();

            	    state._fsp--;

            	    adaptor.addChild(root_1, table_column_def71.getTree());


            	    retval.list.add((table_column_def71!=null?table_column_def71.n:null));

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:324:1: table_column_def returns [Node n] : i= identifier t= type_specifier ;
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
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:328:3: (i= identifier t= type_specifier )
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:328:5: i= identifier t= type_specifier
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_table_column_def1284);
            i=identifier();

            state._fsp--;

            adaptor.addChild(root_0, i.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_specifier_in_table_column_def1288);
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
    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:336:1: type_specifier returns [DataType d] : ( INT | FLOAT | CHAR LPAREN p= number_value RPAREN | VARCHAR LPAREN p= number_value RPAREN | DATE | TIME | TIMESTAMP );
    public final SQLTree.type_specifier_return type_specifier() throws RecognitionException {
        SQLTree.type_specifier_return retval = new SQLTree.type_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INT72=null;
        CommonTree FLOAT73=null;
        CommonTree CHAR74=null;
        CommonTree LPAREN75=null;
        CommonTree RPAREN76=null;
        CommonTree VARCHAR77=null;
        CommonTree LPAREN78=null;
        CommonTree RPAREN79=null;
        CommonTree DATE80=null;
        CommonTree TIME81=null;
        CommonTree TIMESTAMP82=null;
        SQLTree.number_value_return p =null;


        CommonTree INT72_tree=null;
        CommonTree FLOAT73_tree=null;
        CommonTree CHAR74_tree=null;
        CommonTree LPAREN75_tree=null;
        CommonTree RPAREN76_tree=null;
        CommonTree VARCHAR77_tree=null;
        CommonTree LPAREN78_tree=null;
        CommonTree RPAREN79_tree=null;
        CommonTree DATE80_tree=null;
        CommonTree TIME81_tree=null;
        CommonTree TIMESTAMP82_tree=null;


          retval.d = new DataType(((CommonTree)retval.start));

        try {
            // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:340:3: ( INT | FLOAT | CHAR LPAREN p= number_value RPAREN | VARCHAR LPAREN p= number_value RPAREN | DATE | TIME | TIMESTAMP )
            int alt18=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt18=1;
                }
                break;
            case FLOAT:
                {
                alt18=2;
                }
                break;
            case CHAR:
                {
                alt18=3;
                }
                break;
            case VARCHAR:
                {
                alt18=4;
                }
                break;
            case DATE:
                {
                alt18=5;
                }
                break;
            case TIME:
                {
                alt18=6;
                }
                break;
            case TIMESTAMP:
                {
                alt18=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:340:5: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INT72=(CommonTree)match(input,INT,FOLLOW_INT_in_type_specifier1315); 
                    INT72_tree = (CommonTree)adaptor.dupNode(INT72);


                    adaptor.addChild(root_0, INT72_tree);


                    retval.d.setColumnType(ColumnType.INTEGER);

                    }
                    break;
                case 2 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:341:5: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    FLOAT73=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_type_specifier1323); 
                    FLOAT73_tree = (CommonTree)adaptor.dupNode(FLOAT73);


                    adaptor.addChild(root_0, FLOAT73_tree);


                    retval.d.setColumnType(ColumnType.DOUBLE);

                    }
                    break;
                case 3 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:342:5: CHAR LPAREN p= number_value RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CHAR74=(CommonTree)match(input,CHAR,FOLLOW_CHAR_in_type_specifier1331); 
                    CHAR74_tree = (CommonTree)adaptor.dupNode(CHAR74);


                    adaptor.addChild(root_0, CHAR74_tree);


                    _last = (CommonTree)input.LT(1);
                    LPAREN75=(CommonTree)match(input,LPAREN,FOLLOW_LPAREN_in_type_specifier1333); 
                    LPAREN75_tree = (CommonTree)adaptor.dupNode(LPAREN75);


                    adaptor.addChild(root_0, LPAREN75_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_number_value_in_type_specifier1337);
                    p=number_value();

                    state._fsp--;

                    adaptor.addChild(root_0, p.getTree());


                    _last = (CommonTree)input.LT(1);
                    RPAREN76=(CommonTree)match(input,RPAREN,FOLLOW_RPAREN_in_type_specifier1339); 
                    RPAREN76_tree = (CommonTree)adaptor.dupNode(RPAREN76);


                    adaptor.addChild(root_0, RPAREN76_tree);



                          retval.d.setColumnType(ColumnType.STRING);
                          if (!((p!=null?p.n:null) instanceof IntegerValue)){
                            throw new org.antlr.runtime.RecognitionException();
                          }
                          IntegerValue v = (IntegerValue)(p!=null?p.n:null);
                          retval.d.setPrecision(v.getValue());
                        

                    }
                    break;
                case 4 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:351:5: VARCHAR LPAREN p= number_value RPAREN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    VARCHAR77=(CommonTree)match(input,VARCHAR,FOLLOW_VARCHAR_in_type_specifier1351); 
                    VARCHAR77_tree = (CommonTree)adaptor.dupNode(VARCHAR77);


                    adaptor.addChild(root_0, VARCHAR77_tree);


                    _last = (CommonTree)input.LT(1);
                    LPAREN78=(CommonTree)match(input,LPAREN,FOLLOW_LPAREN_in_type_specifier1353); 
                    LPAREN78_tree = (CommonTree)adaptor.dupNode(LPAREN78);


                    adaptor.addChild(root_0, LPAREN78_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_number_value_in_type_specifier1357);
                    p=number_value();

                    state._fsp--;

                    adaptor.addChild(root_0, p.getTree());


                    _last = (CommonTree)input.LT(1);
                    RPAREN79=(CommonTree)match(input,RPAREN,FOLLOW_RPAREN_in_type_specifier1359); 
                    RPAREN79_tree = (CommonTree)adaptor.dupNode(RPAREN79);


                    adaptor.addChild(root_0, RPAREN79_tree);



                          retval.d.setColumnType(ColumnType.STRING);
                          if (!((p!=null?p.n:null) instanceof IntegerValue)){
                            throw new org.antlr.runtime.RecognitionException();
                          }
                          IntegerValue v = (IntegerValue)(p!=null?p.n:null);
                          retval.d.setPrecision(v.getValue());
                        

                    }
                    break;
                case 5 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:360:5: DATE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    DATE80=(CommonTree)match(input,DATE,FOLLOW_DATE_in_type_specifier1371); 
                    DATE80_tree = (CommonTree)adaptor.dupNode(DATE80);


                    adaptor.addChild(root_0, DATE80_tree);


                    retval.d.setColumnType(ColumnType.DATE);

                    }
                    break;
                case 6 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:362:5: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    TIME81=(CommonTree)match(input,TIME,FOLLOW_TIME_in_type_specifier1383); 
                    TIME81_tree = (CommonTree)adaptor.dupNode(TIME81);


                    adaptor.addChild(root_0, TIME81_tree);


                    retval.d.setColumnType(ColumnType.TIME);

                    }
                    break;
                case 7 :
                    // D:\\workspace\\pytun\\src\\org\\pytun\\sql\\SQLTree.g:364:5: TIMESTAMP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    TIMESTAMP82=(CommonTree)match(input,TIMESTAMP,FOLLOW_TIMESTAMP_in_type_specifier1395); 
                    TIMESTAMP82_tree = (CommonTree)adaptor.dupNode(TIMESTAMP82);


                    adaptor.addChild(root_0, TIMESTAMP82_tree);


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
    public static final BitSet FOLLOW_table_spec_list_in_select_statement216 = new BitSet(new long[]{0x0200000000000008L});
    public static final BitSet FOLLOW_where_clause_in_select_statement222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_STMT_in_update_statement246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_update_statement250 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_assignment_list_in_update_statement254 = new BitSet(new long[]{0x0200000000000008L});
    public static final BitSet FOLLOW_where_clause_in_update_statement258 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_STMT_in_insert_statement291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_insert_statement293 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_identifier_list_in_insert_statement297 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_expression_list_in_insert_statement301 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_STMT_in_delete_statement328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_delete_statement330 = new BitSet(new long[]{0x0200000000000008L});
    public static final BitSet FOLLOW_where_clause_in_delete_statement332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_STMT_in_create_statement358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_create_statement362 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_table_columns_def_in_create_statement366 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DROP_STMT_in_drop_statement398 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_drop_statement400 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALTER_in_alter_statement426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPR_LIST_in_expression_list449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression_list452 = new BitSet(new long[]{0x000CC18E01008808L});
    public static final BitSet FOLLOW_table_spec_in_table_spec_list477 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_identifier_in_table_spec504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_table_spec508 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifier_in_table_spec523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_list555 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_WHERE_in_where_clause580 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_where_clause584 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_condition604 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition608 = new BitSet(new long[]{0x0000005120C40020L});
    public static final BitSet FOLLOW_condition_in_condition612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_condition627 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition631 = new BitSet(new long[]{0x0000005120C40020L});
    public static final BitSet FOLLOW_condition_in_condition635 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_predicate_in_condition652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_predicate676 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate680 = new BitSet(new long[]{0x000CC18E01008800L});
    public static final BitSet FOLLOW_expr_in_predicate684 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_predicate699 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate701 = new BitSet(new long[]{0x000CC18E01008800L});
    public static final BitSet FOLLOW_expr_in_predicate703 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_predicate717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate719 = new BitSet(new long[]{0x000CC18E01008800L});
    public static final BitSet FOLLOW_expr_in_predicate721 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_predicate735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate737 = new BitSet(new long[]{0x000CC18E01008800L});
    public static final BitSet FOLLOW_expr_in_predicate739 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_predicate753 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate755 = new BitSet(new long[]{0x000CC18E01008800L});
    public static final BitSet FOLLOW_expr_in_predicate757 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NE_in_predicate771 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_predicate773 = new BitSet(new long[]{0x000CC18E01008800L});
    public static final BitSet FOLLOW_expr_in_predicate775 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_TERM_in_expr806 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_expr809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr826 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr830 = new BitSet(new long[]{0x000CC18E01008800L});
    public static final BitSet FOLLOW_expr_in_expr834 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr848 = new BitSet(new long[]{0x000CC18E01008800L});
    public static final BitSet FOLLOW_expr_in_expr852 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expr861 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr865 = new BitSet(new long[]{0x000CC18E01008800L});
    public static final BitSet FOLLOW_expr_in_expr869 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr878 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr882 = new BitSet(new long[]{0x000CC18E01008800L});
    public static final BitSet FOLLOW_expr_in_expr886 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr895 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr899 = new BitSet(new long[]{0x000CC18E01008800L});
    public static final BitSet FOLLOW_expr_in_expr903 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_term_in_expr911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_identifier_in_term932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_column_identifier962 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_column_identifier966 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifier_in_column_identifier981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_value_in_value1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_value_in_value1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_value_in_value1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_value_in_value1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestamp_value_in_value1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_number_value1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LIT_in_string_value1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_date_value1107 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_string_value_in_date_value1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_time_value1130 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_string_value_in_time_value1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_timestamp_value1153 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_string_value_in_timestamp_value1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_ASSIGNMENTS_in_assignment_list1200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignment_in_assignment_list1203 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_EQ_in_assignment1225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_assignment1227 = new BitSet(new long[]{0x000CC18E01008800L});
    public static final BitSet FOLLOW_expr_in_assignment1229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_DEF_LIST_in_table_columns_def1254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_column_def_in_table_columns_def1257 = new BitSet(new long[]{0x0000000001000008L});
    public static final BitSet FOLLOW_identifier_in_table_column_def1284 = new BitSet(new long[]{0x010C000008100880L});
    public static final BitSet FOLLOW_type_specifier_in_table_column_def1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_type_specifier1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type_specifier1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_type_specifier1331 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_specifier1333 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_number_value_in_type_specifier1337 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_specifier1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARCHAR_in_type_specifier1351 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_specifier1353 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_number_value_in_type_specifier1357 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_specifier1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_type_specifier1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_type_specifier1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMESTAMP_in_type_specifier1395 = new BitSet(new long[]{0x0000000000000002L});

}