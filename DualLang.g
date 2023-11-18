grammar DualLang;

start 
    : statements EOF
    ;

statements
    : statement*
    ;

statement
    :INT;

// LEXER

INT : [0-9]+ ;
BOOL : 'true' | 'false' ;
STRING : '"' .*? '"' ;
ID: [a-zA-Z_][a-zA-Z_0-9]* ;

CMP: '==' | '!=' | '<' | '>' | '<=' | '>=' ; 

AND: '&&' ;
OR: '||' ; 
NOT: '!' ;

IF: 'if' ; 
ELSE: 'else' ;

SEND: 'send' ;
RECEIVE : 'receive' ;

WS : [\t\r\n]+ -> skip;