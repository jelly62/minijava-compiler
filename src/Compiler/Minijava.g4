grammar Minijava;
@header{
	import java.util.*;
}

@parser::members{
	public enum Scope{MEMBER,FUNC};   //������������
	
	//�ж�ĳ��id�Ƿ�͹ؼ����غ���
	public static boolean isKeyWord(String id)
	{
		List<String> keys = new ArrayList<String>();
		keys.add("int");
		keys.add("boolean");
		keys.add("void");
		keys.add("if");
		keys.add("while");
		keys.add("else");
		keys.add("public");
		keys.add("protected");
		keys.add("default");
		keys.add("private");
		keys.add("extends");
		keys.add("class");
		keys.add("return");
		keys.add("true");
		keys.add("false");
		keys.add("this");
		keys.add("super");
		return keys.contains(id);
	}
	
	//����ĳ�������,��������ڵĻ�����NULL
	public static Class_declContext findClass(ProgContext prog, String class_name){
		Class_declContext v =null;
		List<Class_declContext> class_list = prog.class_list;
		for(Class_declContext e:class_list)	{
			if (e.name.equals(class_name)){
				v = e;
				break;				
			}			 
		}
		return v;
	}
	
	public static boolean isClassExists(ProgContext prog, String class_name){
		return findClass(prog, class_name) != null;	
	}
	
	//����ĳ�Ա�б����ҵ�ĳ��������
	public static Var_declContext findVar(Class_declContext classdecl, String var_name){
		Var_declContext v =null;
		List<Var_declContext> var_list = classdecl.var_list;
		for(Var_declContext e:var_list)	{
			if (e.name.equals(var_name)){
				v = e;
				break;				
			}			 
		}
		return v;
	}
	
	public static boolean isVarExists(Class_declContext obj, String class_name){
		return findVar(obj, class_name) != null;	
	}
		
	//�ں����ı����б������ĳ��������
	public static Var_declContext findVar(Method_declContext func, String var_name){
		Var_declContext v =null;
		List<Var_declContext> var_list = func.var_list;
		for(Var_declContext e:var_list)	{
			if (e.name.equals(var_name)){
				v = e;
				break;				
			}			 
		}
		return v;
	}
	
	public static boolean isVarExists(Method_declContext func, String var_name){
		return findVar(func,var_name) != null; 
	}
	
	//�ں����Ĳ����б������ĳ��������
	public static Var_declContext findPara(Method_declContext func, String para_name){
		Var_declContext v =null;
		List<Para_declContext> para_list = func.para_list;
		for(Para_declContext e: para_list) {
				ParaDeclContext t = (ParaDeclContext)e;
				Var_declContext s = t.var;
				if (s.name.equals(para_name)) {
					v = s;
					break;
				}
		}			
		return v;
	}
	
	//�ж�ĳ���������Ƿ��Ѿ�����
	public static boolean isParaExists(Method_declContext func, String para_name){
		return findPara(func,para_name) != null; 
	}
	
	//�ж��������������Ƿ���ȫһ��,Ҳ�������ֺͲ����б���ȫһ��
	public static boolean isEqual(Method_declContext fun1,Method_declContext fun2) 
	{
		boolean flag = (fun1.name.equals(fun2.name) && fun1.para_list.size()==fun2.para_list.size());
		if(flag){
			for(int i=0;i<fun1.para_list.size();++i)
			{
				ParaDeclContext t1 = (ParaDeclContext)(fun1.para_list.get(i));
				ParaDeclContext t2 = (ParaDeclContext)(fun2.para_list.get(i));
				
				String type1 = t1.var.type;
				String type2 = t2.var.type;
				if (!(type1.equals(type2)))
				{
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	
	//�ж������Ƿ��Ѿ�����ͬ����
	public static boolean isFuncExists(Class_declContext obj,Method_declContext fun) 
	{
		boolean flag = false;
		for(Method_declContext e:obj.func_list)
		{
			if (isEqual(e,fun))
			{
				flag =true;
				break;
			}
		}
		return flag;
	}
}

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
	{
		//��������Ѿ�����,�������ʾ
		Class_declContext parent =(Class_declContext) ($ctx.getParent());
		parent.name = $class_name.text;
		
		ProgContext prog =(ProgContext) (parent.getParent());
		
		if (MinijavaParser.isClassExists(prog,parent.name))
			System.out.println("class name: " + parent.name + " is refined " + "at line " 
					+ $class_name.line + ":" + $class_name.pos
				);
		else
			System.out.println("add new class name:" + parent.name + " to class name list");	
	}
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
		
		ParserRuleContext parent = $ctx.getParent();
		if (parent instanceof Class_declContext) {  //�����Ա����
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
			//����Ǻ�����������
			
			//���϶�λ���������ڵ�
			while (!(parent instanceof Method_declContext) ){
				parent = parent.getParent();
			}
						
			Method_declContext c =(Method_declContext)parent;
			
			if (MinijavaParser.isParaExists(c,var_name))
			{
				System.out.println("para " + $ID.text+"in function" + c.name + " is refined " + "at line " 
					+ $ID.line + ":" + $ID.pos
					);
			}
			else {
				System.out.println("add new par: " + $ctx.name +" in function " + c.name + " successful");
			}	
		}
		
		else if (parent instanceof Method_declContext){  
			//����Ǻ����еľֲ�����
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
	
method_decl
locals[
	String name;     //��¼������
	String type;  //��¼����������
	boolean is_static //�Ƿ�Ϊ��̬����
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
	
	{
		$ctx.is_static = ($b.text!=null);
		//��麯���Ƿ��������
		Class_declContext parent =(Class_declContext) ($ctx.getParent());
		if (MinijavaParser.isFuncExists(parent,$ctx))
		{
			System.out.println("overload function:" + $ctx.name + " in class "+ parent.name + "failed"
			+ " at line " + $LEFT_PARA.line + ":" + $LEFT_PARA.pos	
			);
		}
		else {
			System.out.println("add function:" + $ctx.name + " to class " + parent.name + " success");		
		}
	} 
	;
	
func_head_name:
	func_type ID
	{
		//��¼�������ͷ���������
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

class_body_start:LEFT_BRACE
	;
	
class_body_end:RIGHT_BRACE
	;

stat:
	'{' (stat)* '}'
	|'return' (expr)? ';'
	|	'if' '(' expr ')' stat 'else' stat
	|	'while' '(' expr ')' stat
	|	'System.out.println' '(' expr ')' ';'
	|	ID ASSIGN_OP expr ';'
	{
		//�Ը��������м��,��ߵ�ID�������,���Һ��ұߵı��ʽ������һ��
	}
	|	ID '[' expr ']' '=' expr ';'
	{
		
	}
	;		

expr_list:
	expr(',' expr)*
	;

expr returns [String type]:      //type��¼���ʽ��������
	'(' a=expr ')'
	{
		$type = $a.type;
	}
	|	a = expr '[' expr ']'
	{
		int L=$a.type.length();
		$type = $a.type.substring(0,L-2);
	}
	|	a=expr '.' 'length'
	{
		$type = "int";
	}
	|   a=expr.ID '(' (expr_list)? ')'{
		
	}
	|	'new' basic_type  array_decl   //��ά���鶨��
	{
		$type = $basic_type.text+$array_decl.text;
	}  
	|	'new' ID '(' ')'              //����������
	{
		$type = $ID.text;
	}
	|	'!' a=expr
	{
		$type = "boolean";
	}
	| 	a=expr op=MUL_OP  b=expr
	{
		//��������������������Ƿ�Ϊint
		if (!($a.type.equals("int"))){
			System.out.println("type mismatched in arg1 of expression at line" +
				$op.line + $op.pos
			);
		}
		if (!($b.type.equals("int"))){
			System.out.println("type mismatched in arg2 of expression at line" +
				$op + $op.pos
			);
		}
		$type = "int";
	}
	| 	a=expr op=ADD_OP b=expr
	{
		//��������������������Ƿ�Ϊint
		if (!($a.type.equals("int"))){
			System.out.println("type mismatched in arg1 of expression at line" +
				$op.line + $op.pos
			);
		}
		if (!($b.type.equals("int"))){
			System.out.println("type mismatched in arg2 of expression at line" +
				$op + $op.pos
			);
		}
		$type = "int";
	}
	| 	a=expr op=RELATION_OP b=expr
	{
		//��������������������Ƿ�Ϊint
		if (!($a.type.equals("int"))){
			System.out.println("type mismatched in arg1 of expression at line" +
				$op.line + $op.pos
			);
		}
		if (!($b.type.equals("int"))){
			System.out.println("type mismatched in arg2 of expression at line" +
				$op + $op.pos
			);
		}
		$type = "boolean";
	}
	| 	a=expr op=LOGIC_OP b=expr
	{
		
		$type = "boolean";
	}
	|  INT
	{
		$type = "int";
	}
	|  ID
	{
		boolean found = false;
		//���ID�Ƿ����
		ParserRuleContext parent = $ctx.getParent();
		while(!(parent instanceof Method_declContext)){
			parent = parent.getParent();
		}
	}
	|  'true'
	{
		$type = "boolean";
	}
	|  'false'
	{
		$type = "boolean";
	}
	|  'this'
	{
		//this������������������������
		//$type = "boolean";
	}
	;

array_decl:
	('[expr]')+
	;

ASSIGN_OP:
	 '+='|'-='|'*='|'/='
	|'+'|'-'|'*'|'/'
	;
		
SEMICOLON
	: ';'
	;
		
SL_COMMENT
    : '//' .*?  '\n' -> skip  
    ;
    
LEFT_BRACE:'{';    
RIGHT_BRACE:'}';

LEFT_PARA:'(';    
RIGHT_PARA:')';


RELATION_OP:
	'<'|'>'|'<='|'>='|'=='|'!='
	;
	
LOGIC_OP:
	'&&'|'||';

ADD_OP :'+'|'-'
	;

MUL_OP	:'*'|'/'
	;

EXTENDS:
	'extends'
	;
//lexical issues
ID	:	[a-zA-Z_][a-zA-Z0-9_]*;	  		//identifier
INT	:	[0-9]+;							// integer
WS  :   [ \t\r\n]+ -> skip ; 			// skip spaces, tabs, newlines


