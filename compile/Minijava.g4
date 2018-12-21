/**
 * Define a grammar called mini_java
 */
grammar Minijava;

prog : MainClass ( ClassDeclaration )* ;

MainClass : 'class' ID 
			'{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')'
			'{' Statement '}' 
			'}';

ClassDeclaration : 'class' ID ( 'extends' ID )? '{' ( VarDeclaration )* ( MethodDeclaration )* '}';

VarDeclaration	:	Type ID ';';

MethodDeclaration : 'public' Type ID '(' ( Type ID ( ',' Type ID )* )? ')' 
					'{' ( VarDeclaration )* ( Statement )* 'return' Expression ';' '}'
					;
		
Type : 		
		'int' '[' ']'
		|	'boolean'
		|	'int'
		|	ID
		;
		
Statement	: 
			'{' ( Statement )* '}'
		|	'if' '(' Expression ')' Statement 'else' Statement
		|	'while' '(' Expression ')' Statement
		|	'System.out.println' '(' Expression ')' ';'
		|	ID '=' Expression ';'
		|	ID '[' Expression ']' '=' Expression ';'
		;
		
Expression	:	
			Expression ( '&&' | '<' | '+' | '-' | '*' ) Expression
		|	Expression '[' Expression ']'
		|	Expression '.' 'length'
		|	Expression '.' ID '(' ( Expression ( ',' Expression )* )? ')'
		|	INT
		|	'true'
		|	'false'
		|	ID
		|	'this'
		|	'new' 'int' '[' Expression ']'
		|	'new' ID '(' ')'
		|	'!' Expression
		|	'(' Expression ')'
		;

ID	:	[a-zA-Z_][a-zA-Z_0-9]*;	// identifier
INT	:	[0-9]+;					// integer
NOTE:   '//' .*? '\n' ->skip ;	//notes
WS  :   [ \t\r\n]+ -> skip ; 	// skip spaces, tabs, newlines
