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

classDeclaration : 	'class' ID ( 'extends' ID )? '{' ( type ID )* ( methodDeclaration )* '}'
					;

//varDeclaration	:	type ID ';'
//					;

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
		
		ParserRuleContext parent = $ctx.getParent();
		if (parent instanceof Class_declContext) {  //是类成员变量
			Class_declContext c =(Class_declContext)(parent);
			Var_declContext var = MinijavaParser.findVar(c,var_name);
			
			if (var != null && var.is_static == $static_flag){
				System.out.println("var " + $ID.text + " is refined " + "at line " 
					+ $ID.line + ":" + $ID.pos
					);
			}
			else {
				System.out.println("add new member var: " + $ctx.name + 
					" in class " + c.name + " successful"
				);
			}
		}
		else if (parent instanceof Para_declContext)
		{ 
			//如果是函数参数定义
			
			//向上定位到函数父节点
			while (!(parent instanceof Method_declContext) ){
				parent = parent.getParent();
			}
						
			Method_declContext c =(Method_declContext)parent;
			
			if (MinijavaParser.isParaExists(c,var_name))
			{
				System.out.println("para " + $ID.text+" in function" + c.name + " is refined " + "at line " 
					+ $ID.line + ":" + $ID.pos
					);
			}
			else {
				System.out.println("add new par: " + $ctx.name +" in function " + c.name + " successful");
			}	
		}
		
		else if (parent instanceof Method_declContext){  
			//如果是函数中的局部变量
			Method_declContext c = (Method_declContext)parent;
			
			if (MinijavaParser.isVarExists(c,var_name))
			{
				System.out.println("var " + $ID.text +" in function" + c.name + " is refined " + "at line " 
					+ $ID.line + ":" + $ID.pos
				);
			}
			else if (MinijavaParser.isParaExists(c,var_name))
			{
				System.out.println("var " + $ID.text +" in function " + c.name 
				 + " has same name with some para " + "at line "+ $ID.line + ":" + $ID.pos);
			}
			else 
			{
				System.out.println("add new var: " + $ctx.name 
					+" in function " + c.name + " successful"
				);
			} 
		}
	}
	;

methodDeclaration :	'public' type ID '(' ( type ID ( ',' type ID )* )? ')' 
					'{' ( type ID )* ( statement )* 'return' expr ';' '}'
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

//lexical issues
ID	:	[a-zA-Z_][a-zA-Z0-9_]*;	  		//identifier
INT	:	[0-9]+;							// integer
OP	:	'&&' | '<' | '+' | '-' | '*' ;	//binary_operator
COMMENT_LINE:   '//' .*? '\n' ->skip ;	//comment_line
COMMENT:   '/*' .*? '*/' ->skip ;		//comment
WS  :   [ \t\r\n]+ -> skip ; 			// skip spaces, tabs, newlines


