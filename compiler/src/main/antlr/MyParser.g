parser grammar MyParser;

options {
    output = AST;
    tokenVocab = MyLexer;
    ASTLabelType = Node;
}

@header {
    package compiler;
    import compiler.tree.*;
}

program: statement* EOF^;

statement: expression;
	
/* Statements*/

/* Expressions */
expression: INTEGER;

