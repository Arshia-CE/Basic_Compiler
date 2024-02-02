grammar DualLang;

//parser

prog 
    : statements EOF
    ;

statements
    : statement*
    ;

statement
	: 'device1:' device1Statements*
	| 'device2:' device2Statements*
	;


device1Statements
	: expr
	| interaction1
	;
	
device2Statements
	: expr
	| interaction2
	;	
	
expr options {backtrack=true;}	
	: calculation
	| ifStatement
	| loop
	| printStatement
	| functionDefinition
	| functionCall
	;


availableExpr options {backtrack=true;}	
	: device1Statements*
	| device2Statements*
	;

	
calculation
	: 'calculate' ID '=' (mathExpr | functionCall)';'
	;
	

interaction2	
	: 'receive from device1(' mathExpr ')' ';'	
	;

interaction1
	: 'send to device2(' mathExpr ')' ';'		
	;
	
	
mathExpr options {backtrack=true;}	
	: mathStatement
	| boolStatement	
	;
	
mathStatement options {backtrack=true;}
	: ('(' mathStatement ')' | ID | INT | FLOAT )			
	 (ADD mathStatement | MUL mathStatement | '^' mathStatement | '%' mathStatement)*
	;


boolStatement					
	: (NOT boolStatement | INT | '(' boolStatement ')' | ID) (AND boolStatement | OR boolStatement | CMP boolStatement)*
	;


	
	
ifStatement
	: IF '(' boolStatement')' THEN availableExpr (ELSE availableExpr)? END
	;
	
printStatement
	: 'PRINT' (STRING | mathExpr | functionCall)';'	
	;
	



loop : LOOP loopCondition DO loopBody END;

loopCondition
	: whileCondition
	| forCondition
	; 


whileCondition
	: ('(' whileCondition')' | NOT whileCondition | INT | ID) (CMP whileCondition)* 
	;
	
forCondition
	:  loopInitialization ',' forEndCondition ',' loopUpdate
	;

loopInitialization 
	:(TYPE)? ID '=' INT
	;

forEndCondition 
	: boolStatement 
	;

loopUpdate 
	: ID '++' | ID '--' | mathStatement
	;					

loopBody 							
	: availableExpr 
	| 'BREAK' 
	;





functionDefinition	
	: FUNCTION ID '(' parameterList? ')' 'returns' TYPE '{' availableExpr ('return' mathExpr';')? '}'
	;	
	
parameterList
	: (TYPE ID)(',' TYPE ID)*
	;	

functionCall	
	: ID '(' exprList? ')'
	;

exprList
	: funcExpr (',' funcExpr)*
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
