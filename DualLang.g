grammar DualLang;
//parser

prog 
    : statements EOF
    ;

statements
    : statement*
    ;

statement:SEND | RECEIVE | BOOL | AND | OR | NOT |CMP | MUL | ADD |IF | ELSE | THEN | LOOP | END | DO | WHILE |FUNCTION
	| ID |TYPE | INT | FLOAT  | STRING | COMMENT | ERROR | WS ;


	
//lexer 

SEND
	: 'send' 
	;
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
