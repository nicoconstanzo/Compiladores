lexer grammar MyLexer;

@header {
    package compiler;
}

/* Whitespaces */
WHITESPACE: (' '|'\t'|'\n'|'\r')+ {skip();} ;

/* Reserved words */

/* Operators */
	
/* Numbers */
INTEGER: DIGIT+;
fragment DIGIT: '0'..'9';


