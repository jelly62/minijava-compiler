/**
 * Define a grammar called mini_java
 */
grammar Minijava;
@header{
	import java.util.*;
}
@parser::members{
	//error detections
	//
	public static boolean isKeyWord(String id)
	{
		List<String> keys = new ArrayList<String>();
		keys.add("int");
		keys.add("void");
		keys.add("if");
		keys.add("while");
		keys.add("else");
		keys.add("default");
		keys.add("private");
		keys.add("extends");
		keys.add("class");
		keys.add("return");
		keys.add("true");
		keys.add("false");
		return keys.contains(id);
		
	}
}
prog : mainClass  (classDeclaration)* EOF;

mainClass : 		'class' ID 
					'{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')'
					'{' statement '}' 
					'}'
					;

classDeclaration : 	'class' ID ( 'extends' ID )? '{' ( varDeclaration )* ( methodDeclaration )* '}'
					;

varDeclaration	:	type ID ';'
					;

methodDeclaration :	'public' type ID '(' ( type ID ( ',' type ID )* )? ')' 
					'{' ( varDeclaration )* ( statement )* 'return' expr ';' '}'
					;


type : 		
		   'int' '[' ']'
		|	'boolean'
		|	'int'
		|	ID
		;
		
statement	: 
			'{' ( statement )* '}'
		|	'if' '(' expr ')' statement 'else' statement
		|	'while' '(' expr ')' statement
		|	'System.out.println' '(' expr ')' ';'
		|	ID '=' expr ';'
		|	ID '[' expr ']' '=' expr ';'
		;


expr	:	
			expr OP expr
		|	expr '[' expr ']'
		|	expr '.length'
		|	expr '.' ID '(' ( expr ( ',' expr )* )? ')'
		|	INT
		|	'true'
		|	'false'
		|  ID
		{
		String var_name = $ID.text;
		if(MinijavaParser.isKeyWord(var_name)) 
		{
			System.out.println("error: keword: " +var_name + " is used as an ID "+ " at " +$ID.line + ":"+$ID.pos);
		}		
		}
		|	'this'
		|	'new' 'int' '[' expr ']'
		|	'new' ID '(' ')'
		|	'!' expr
		|	'(' expr ')'
		|	expr '<' expr
		|	expr '>' expr
		|	expr '<=' expr
		|	expr '>=' expr
		;


//lexical issues
ID	:	[a-zA-Z_][a-zA-Z0-9_]*;	  		//identifier
INT	:	[0-9]+;							// integer
OP	:	'&&' | '<' | '+' | '-' | '*' ;	//binary_operator
COMMENT_LINE:   '//' .*? '\n' ->skip ;	//comment_line
COMMENT:   '/*' .*? '*/' ->skip ;		//comment
WS  :   [ \t\r\n]+ -> skip ; 			// skip spaces, tabs, newlines