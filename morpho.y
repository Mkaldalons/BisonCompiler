/*
	Skeleton for NanoMorpho bison input file
	Author: Snorri Agnarsson
*/
%code imports {
	import java.util.*;
}

%language "Java"
%define parse.error verbose
%define api.parser.class {NanoMorphoParser}
%define api.parser.extends {Compiler}

%token WHILE IF ELSE VAR
%token<String> NAME LITERAL OP1 OP2 OP3 OP4 OP5 OP6 OP7

%right RETURN '='
%right OR
%right AND
%right NOT
%left OP1
%right OP2
%left OP3
%left OP4
%left OP5
%left OP6
%left OP7
%right UNOP

%type<Vector<Object[]>> program exprs optargs args
%type<Object[]> function expr ifexpr body
%type<String> op
%type<Integer> varcount

%%

start
	:	program
		{ generateProgram($program); }
	;

program
	:	program function	{ ((Vector<Object[]>)$1).add($function); $$ = $1; }
	|	function			{ $$ = new Vector<Object[]>(); ((Vector<Object[]>)$$).add($function); }
	;
	
varcount
	:	%empty { $$ = varCount; }
	;

function
	:	NAME '('
		{ varTable = new HashMap<String,Integer>();	varCount=0; }
		optnames ')'
		varcount
		'{' decls exprs '}'
		{ $$ = new Object[]{$NAME,$varcount,varCount-$varcount,$exprs}; }	
	;

optnames
	:	names
	|	%empty
	;

names
	:	names ',' NAME { addVar ($NAME); }
	|	NAME { addVar ($NAME); }
	;

expr
    :	RETURN expr				{ $$ = new Object[]{"RETURN", $2}; }
	|	NAME '=' expr			{ $$ = new Object[]{"STORE",findVar($NAME),$3}; }
	|	expr OR expr			{ $$ = new Object[]{"OR",$1,$3}; }
	|	expr AND expr			{ $$ = new Object[]{"AND",$1,$3}; }
	|	NOT expr				{ $$ = new Object[]{"NOT",$2}; }
	|	expr OP1 expr			{ $$ = new Object[]{"CALL",$OP1,new Object[]{$1,$3}}; }
	|	expr OP2 expr			{ $$ = new Object[]{"CALL",$OP2,new Object[]{$1,$3}}; }
	|	expr OP3 expr			{ $$ = new Object[]{"CALL",$OP3,new Object[]{$1,$3}}; }
	|	expr OP4 expr			{ $$ = new Object[]{"CALL",$OP4,new Object[]{$1,$3}}; }
	|	expr OP5 expr			{ $$ = new Object[]{"CALL",$OP5,new Object[]{$1,$3}}; }
	|	expr OP6 expr			{ $$ = new Object[]{"CALL",$OP6,new Object[]{$1,$3}}; }
	|	expr OP7 expr			{ $$ = new Object[]{"CALL",$OP7,new Object[]{$1,$3}}; }
	|	ifexpr					{ $$ = $ifexpr; }
	|	WHILE expr body			{ $$ = new Object[]{"WHILE",$2,$body}; }
	|	op expr %prec UNOP 		{ $$ = new Object[]{"CALL",$op,new Object[]{$2}}; }
	|	NAME					{ $$ = new Object[]{"FETCH",findVar($NAME)}; }
	|	NAME '(' optargs ')'	{ $$ = new Object[]{"CALL",$NAME,$optargs.toArray()}; }
	|	LITERAL					{ $$ = new Object[]{"LITERAL",$LITERAL}; }
	|	'(' expr ')'			{ $$ = $2;}
	;

exprs
	:	exprs expr ';'	{ $$ = $1; ((Vector<Object[]>)$$).add($expr); }
	|	expr ';'	{ $$ = new Vector<Object[]>(); ((Vector<Object[]>)$$).add($expr); }
	;

op
	:	OP1|OP2|OP3|OP4|OP5|OP6|OP7
	;

ifexpr
	:	IF expr body				{ $$ = new Object[]{"IF1",$expr,$body}; }
	|	IF expr body ELSE body		{ $$ = new Object[]{"IF2",$expr,$3,$5}; }
	|	IF expr body ELSE ifexpr	{ $$ = new Object[]{"IF2",$expr,$body,$5}; }
	;

body
	:	'{' exprs '}'	{ $$ = new Object[]{"BODY",$exprs}; }
	;

decls
    :	decls decl ';'
    |	%empty
    ;

decl
	:	VAR names
	;

args
	:	args ',' expr	{ ((Vector<Object[]>)$$).add($expr); }
	|	expr	{ $$ = new Vector<Object[]>(); ((Vector<Object[]>)$$).add($expr); }
	;

optargs
	:	args
	|	%empty { $$ = new Vector<Object[]>(); }
	;

%%
