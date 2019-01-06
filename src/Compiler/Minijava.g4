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
	public enum Scope{MEMBER,FUNC}; 
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
//prog : mainClass  (classDeclaration)* EOF;

//mainClass : 		'class' ID 
//					'{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')'
//					'{' statement '}' 
//					'}'
//					;

//classDeclaration : 	'class' ID ( 'extends' ID )? '{' ( type ID )* ( methodDeclaration )* '}'
//					;

//varDeclaration	:	type ID ';'
//					;
prog
:   (class_list += class_decl)+
;
class_decl
locals[
	String name    
]
/* List of symbols defined within this block */
    : 
    // 'class' class_name = ID ( EXTENDS ID ) ?
    class_head_name 
    '{'
	  ( ('public'|'protected'|'private')? 
	  	('static' var_list  += var_decl[true,MinijavaParser.Scope.MEMBER])
	  	|
	  	(var_list  += var_decl[false,MinijavaParser.Scope.MEMBER])
	  	SEMICOLON
	  )*
	   (func_list += method_decl)*
	'}'
    ;
    
class_head_name:
	'class' class_name = ID ( EXTENDS parent_name = ID ) ?
	;    

var_decl[boolean static_flag,MinijavaParser.Scope var_scope]
locals
[
	String type;
	String name;
	boolean is_static = false; 
	MinijavaParser.Scope scope 
]
	:var_type ID 
	{
		String var_name = $ID.text;
		$ctx.type = $var_type.text;
		$ctx.name = $ID.text;
		$ctx.scope = $var_scope;
		$ctx.is_static = $static_flag;
		
	}
	;
	
method_decl
locals[
	String name;     //记录函数名
	String type;  //记录返回类型名
	boolean is_static //是否为静态方法
]
:
	('public'|'protected'|'private')? (b='static')? 
	func_head_name LEFT_PARA (para_list += para_decl (',' para_list += para_decl)*)? RIGHT_PARA
	'{'
	 (
	 	('static' var_list += var_decl[true,MinijavaParser.Scope.FUNC] SEMICOLON)
	 	|
	 	(var_list += var_decl[false,MinijavaParser.Scope.FUNC] SEMICOLON) 
	 )*
	 (stat_list += stat)*
	'}'
	;
	
func_head_name:
	func_type ID
	{
		//记录函数名和返回类型名
		Method_declContext c =(Method_declContext)($ctx.getParent()); 
		c.name = $ID.text;
		c.type = $func_type.text;
	}
	;	
	
para_decl:
	var=var_decl[false,MinijavaParser.Scope.FUNC]
	#ParaDecl
	;

func_type:
	'void'|var_type
	;
//methodDeclaration :	'public' type ID '(' ( type ID ( ',' type ID )* )? ')' 
//					'{' ( type ID )* ( statement )* 'return' expr ';' '}'
//					;


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
			System.out.println("error: keyword: " +var_name + " is used as an ID "+ " at " +$ID.line + ":"+$ID.pos);
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
		
var_type:
	array_type
	|basic_type
	;

basic_type:
	'int'
	|'boolean'
	|ID
	;
		
array_type:
	basic_type ('['']')+ 
	
	;	
stat:
	'{' (stat)* '}'
	|'return' (expr)? ';'
	|	'if' '(' expr ')' stat 'else' stat
	|	'while' '(' expr ')' stat
	|	'System.out.println' '(' expr ')' ';'
	{
		//对辅助语句进行检查,左边的ID必须存在,并且和右边的表达式类型名一致
	}
	;
EXTENDS:
	'extends'
	;
	
SEMICOLON
	: ';'
	;

LEFT_BRACE:'{';    
RIGHT_BRACE:'}';

LEFT_PARA:'(';    
RIGHT_PARA:')';
		
//lexical issues
ID	:	[a-zA-Z_][a-zA-Z0-9_]*;	  		//identifier
INT	:	[0-9]+;							// integer
OP	:	'&&' | '<' | '+' | '-' | '*' ;	//binary_operator
COMMENT_LINE:   '//' .*? '\n' ->skip ;	//comment_line
COMMENT:   '/*' .*? '*/' ->skip ;		//comment
WS  :   [ \t\r\n]+ -> skip ; 			// skip spaces, tabs, newlines


