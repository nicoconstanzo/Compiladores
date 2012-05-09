// $ANTLR 3.0.1 /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g 2012-05-09 15:00:16

    package compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MyLexerLexer extends Lexer {
    public static final int INTEGER=6;
    public static final int WHITESPACE=4;
    public static final int DIGIT=5;
    public static final int EOF=-1;
    public static final int Tokens=7;
    public MyLexerLexer() {;} 
    public MyLexerLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g"; }

    // $ANTLR start WHITESPACE
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g:8:11: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g:8:13: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g:8:13: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            skip();

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHITESPACE

    // $ANTLR start INTEGER
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g:15:8: ( ( DIGIT )+ )
            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g:15:10: ( DIGIT )+
            {
            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g:15:10: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g:15:10: DIGIT
            	    {
            	    mDIGIT(); 

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


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INTEGER

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g:16:15: ( '0' .. '9' )
            // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g:16:17: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    public void mTokens() throws RecognitionException {
        // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g:1:8: ( WHITESPACE | INTEGER )
        int alt3=2;
        int LA3_0 = input.LA(1);

        if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
            alt3=1;
        }
        else if ( ((LA3_0>='0' && LA3_0<='9')) ) {
            alt3=2;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( WHITESPACE | INTEGER );", 3, 0, input);

            throw nvae;
        }
        switch (alt3) {
            case 1 :
                // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g:1:10: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 2 :
                // /Users/Nico/Documents/Compiladores/compilador/compiler/src/main/antlr/MyLexer.g:1:21: INTEGER
                {
                mINTEGER(); 

                }
                break;

        }

    }


 

}