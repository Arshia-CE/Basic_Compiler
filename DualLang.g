grammar DualLang;
//parser

prog 
    : statements EOF
    ;

statements
    : statement*
    ;

statement
	: 'device1:' device1Statements
	| 'device2:' device2Statements;

device1Statements
	: calculation
	| interaction1
	| ifStatement
	| functionDefinition
	| functionCall
	| printStatement
	| loop
	;
	
device2Statements
	: calculation
	| interaction2
	| ifStatement
	| functionDefinition
	| functionCall
	| printStatement
	| loop
	;	
	
	
calculation
	: 'calculate' ID '=' mathExpr ';'
	;
	

mathExpr	
	: mathStatement
	| boolStatement	
	;
	
mathStatement					//left recursion
	: mathStatement '+' mathStatement
	| mathStatement '-' mathStatement
	| mathStatement '*' mathStatement
	| mathStatement '/' mathStatement
	| mathStatement '^' mathStatement
	| mathStatement '%' mathStatement
	| '(' mathStatement ')'
	| ID
	| INT
	| FLOAT
	;

boolStatement					//left recursion
	: boolStatement AND boolStatement
	| boolStatement OR boolStatement 
	| NOT boolStatement
	| INT 
	| boolStatement CMP boolStatement 
	| '(' boolStatement ')' 
	| ID
	;



	

interaction2	
	: 'receive from device1(' mathExpr ')' ';'	//check this
	;

interaction1
	: 'send to device2(' mathExpr ')' ';'		//check this 
	;
	
	
	
ifStatement
	: IF '(' ifCondition')' THEN statements (ELSE statements)?	////customize if body
	;
	
printStatement
	: 'PRINT' STRING ';'	
	;
	
ifCondition
	: boolStatement CMP boolStatement 	
	;


loop : LOOP loopCondition DO loopBody END;

loopCondition
	: whileCondition
	| forCondition
	; 


whileCondition
	: ('(' whileCondition')' | NOT whileCondition | INT | ID) (AND whileCondition | OR whileCondition)* 
	;
	
forCondition
	:  loopInitialization ',' forEndCondition ',' loopUpdate
	;

loopInitialization 
	:(TYPE)? ID '=' INT
	;

forEndCondition 
	: boolStatement CMP boolStatement 
	;

loopUpdate 
	: ID '++' | ID '--'
	;					//enhance

loopBody 							//customize loop body
	: statements 
	| 'BREAK' 
	;





functionDefinition	
	: FUNCTION ID '(' parameterList? ')' 'returns' TYPE '{' statements '}'
	;	
	
parameterList
	: (TYPE ID)(',' TYPE ID)*
	;	

functionCall	
	: ID '(' exprList? ')' ';'
	;

exprList
	: funcExpr (',' funcExpr)*;	
	;

funcExpr
	: ID
	| STRING
	| functionCall
	| mathExpr	
	;



//lexer 

RECEIVE 
	: 'receive' 
	;


BOOL 	:	'true' | 'false'
	;

AND 	:	'&&'
	;

OR 	:	'||'
	;
	
NOT	:	'!'
	;
	
CMP	: '==' | '!=' |'<'|'>'|'<='|'>='
	; 
	
MUL	: '*' | '/'
	;

ADD	: '-' | '+'
	;



IF 	:	'if'
	;
	
ELSE 	:	'else'
	;
	
THEN 	:	'then'
	;
	
	
	

LOOP 	:	'loop'
	;

END 	:	'end'
  	;

DO	:	'do'
	;
	
WHILE	:	'while'
	;
	
	
FUNCTION :	'func'
	 ;	

TYPE 	: 'int'  |'float'| 'char' | 'string' | 'void'	
	;
	
	
	
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;


INT :	'0'..'9'+
    ;

	
FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;


STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS    : (' ' | '\t' | '\r' | '\n')+ {$channel=HIDDEN;};

ERROR   : . {System.err.println("Lexer error: Unexpected character '" + $text + "'");}
        ;
        
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
