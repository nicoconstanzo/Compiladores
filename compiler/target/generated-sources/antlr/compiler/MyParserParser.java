// $ANTLR 3.0.1 /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyParser.g 2012-05-09 15:00:17

    package compiler;
    import compiler.tree.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class MyParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "WHITESPACE", "DIGIT", "INTEGER", "Tokens"
    };
    public static final int INTEGER=6;
    public static final int WHITESPACE=4;
    public static final int DIGIT=5;
    public static final int EOF=-1;
    public static final int Tokens=7;

        public MyParserParser(TokenStream input) {
            super(input);
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyParser.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Node tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start program
    // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyParser.g:14:1: program : ( statement )* EOF ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Node root_0 = null;

        Token EOF2=null;
        statement_return statement1 = null;


        Node EOF2_tree=null;

        try {
            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyParser.g:14:8: ( ( statement )* EOF )
            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyParser.g:14:10: ( statement )* EOF
            {
            root_0 = (Node)adaptor.nil();

            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyParser.g:14:10: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INTEGER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyParser.g:14:10: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program55);
            	    statement1=statement();
            	    _fsp--;

            	    adaptor.addChild(root_0, statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF2=(Token)input.LT(1);
            match(input,EOF,FOLLOW_EOF_in_program58); 
            EOF2_tree = (Node)adaptor.create(EOF2);
            root_0 = (Node)adaptor.becomeRoot(EOF2_tree, root_0);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Node)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end program

    public static class statement_return extends ParserRuleReturnScope {
        Node tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statement
    // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyParser.g:16:1: statement : expression ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Node root_0 = null;

        expression_return expression3 = null;



        try {
            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyParser.g:16:10: ( expression )
            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyParser.g:16:12: expression
            {
            root_0 = (Node)adaptor.nil();

            pushFollow(FOLLOW_expression_in_statement66);
            expression3=expression();
            _fsp--;

            adaptor.addChild(root_0, expression3.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Node)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end statement

    public static class expression_return extends ParserRuleReturnScope {
        Node tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expression
    // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyParser.g:21:1: expression : INTEGER ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Node root_0 = null;

        Token INTEGER4=null;

        Node INTEGER4_tree=null;

        try {
            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyParser.g:21:11: ( INTEGER )
            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyParser.g:21:13: INTEGER
            {
            root_0 = (Node)adaptor.nil();

            INTEGER4=(Token)input.LT(1);
            match(input,INTEGER,FOLLOW_INTEGER_in_expression79); 
            INTEGER4_tree = (Node)adaptor.create(INTEGER4);
            adaptor.addChild(root_0, INTEGER4_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Node)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expression


 

    public static final BitSet FOLLOW_statement_in_program55 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EOF_in_program58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_expression79 = new BitSet(new long[]{0x0000000000000002L});

}