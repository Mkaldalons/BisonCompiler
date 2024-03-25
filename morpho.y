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
	:	{ varCount=0; varTable=new HashMap<String, Integer>(); }
		NAME '(' optnames varcount ')' '{' decls exprs '}'
		{ $$ = new Object[]{$NAME,$varcount,varCount-$varcount,$exprs}; }
	;

optnames
	:	%empty
	|	names
	;

names
	:	names ',' NAME {addVar ($NAME);}
	|	NAME {addVar ($NAME)}
	;

expr
    : expr OR expr    { $$ = new Object[]{"OR", $1, $3}; }
    | expr AND expr   { $$ = new Object[]{"AND", $1, $3}; }
    | NOT expr        { $$ = new Object[]{"NOT", $2}; }
    | op expr         { $$ = new Object[]{"CALL", $op, new Object[]{$2}}; }
    | RETURN expr     { $$ = new Object[]{"RETURN", $2}; }
	;

exprs
	:	exprs ',' expr { ((Vector<Object[]>)$1).add($expr); $$ = $1; }
	|	expr { $$ = new Vector<Object[]>(); ((Vector<Object[]>)$$).add($expr); }
	;

op
	:	OP1|OP2|OP3|OP4|OP5|OP6|OP7
	;

ifexpr
    :	IF '(' expr ')' body { $$ = new Object[]{"IF", $3, $5}; }
    |	IF '(' expr ')' body ELSE body { $$ = new Object[]{"IFELSE", $3, $5, $7}; }
    ;

body
	:	body '{'  { expr, ';' } '}'
	;

decls
    :	%empty
    |	decls VAR NAME { addVar($NAME); }
    |	decls VAR NAME ',' names
    ;

	;

args
	:	args ',' args

optargs
	:	%empty 
	|	optargs
	;

%%
