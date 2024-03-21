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
	:	NAME	'(' optnames ')' '{' decls exprs '}'
	;

optnames
	:	%empty
	: 	names
	;

names
	:	names ',' NAME {addVar ($NAME);}
	|	NAME {addVar ($NAME)}
	;

expr
	:	op expr %prec UNOP 	{$$ = new Object[]{"CALL",$op,new Object[]{$2}};}
	| 	...
	|	RETURN expr		{$$ = new Object[]{"RETURN",$2};}
	|	...
	;
op
	:	OP1|OP2|OP3|OP4|OP5|OP6|OP7
	;

%%
