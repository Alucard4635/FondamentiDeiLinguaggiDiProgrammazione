grammar Assembler;

program
    :   globals? WS( functionDeclaration | instruction | label | NEWLINE )+
    ;
   
globals : NEWLINE* '.globals' INT NEWLINE;

functionDeclaration
    : '.def'WS ID WS':'WS 'args' WS'=' WS INT WS',' WS 'locals' WS '=' WS INT WS NEWLINE
    ;

instruction: ( stackBynaryOperator | stackUnary | memoryStackOperation|branch|funcionOperation|systemCall)NEWLINE;

stackBynaryOperator: (integerBynaryOperation| floatBynaryOperation);

integerBynaryOperation: 'i'(ARITHMETIC|COMPARISON);

floatBynaryOperation: 'f'(ARITHMETIC|COMPARISON);

ARITHMETIC : ('add'|'sub'|'mul'|'div');

COMPARISON : ('lt'|'gt'|'eq');

stackUnary: (INTEGER_UNARY_OPERATION);

INTEGER_UNARY_OPERATION: ('itof');

memoryStackOperation: (GLOBAL)?MEMORY_OPERATION;

GLOBAL: 'g';

MEMORY_OPERATION: ('load'|'store');

branch: (UNCONDITIONAL|CONDITIONAL)WS ID;

CONDITIONAL: 'br';
UNCONDITIONAL: 'bt'('t'|'f');

funcionOperation: (CALL|RETURN);

CALL: 'call' WS FUNC;

RETURN: 'ret';

systemCall:(STREAM|EXIT);

STREAM: 'print';
EXIT: 'halt';

label:   ID ':' ;

REG :   'r' INT ;

ID  :   LETTER (LETTER | '0'..'9')* ;

FUNC:   ID '()' ;

fragment
LETTER
    :   ('a'..'z' | 'A'..'Z')
    ;
    
INT :   '-'? '0'..'9'+ ;

CHAR:   '\'' . '\'' ;

STRING: '\"' STR_CHARS '\"' ;

fragment STR_CHARS : ~'"'* ;

FLOAT
    :   INT '.' INT*
    |   '.' INT+
    ;

WS  :   (' '|'\t')+ -> skip ;

NEWLINE
    :   (';' (.)*?)? '\r'? '\n' -> skip // optional comment followed by newline
    ;
