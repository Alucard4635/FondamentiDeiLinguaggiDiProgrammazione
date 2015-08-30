/** A generic bytecode assembler whose instructions take 0..3 operands.
 *  Instruction set is dictated externally with a String[].  Implement
 *  specifics by subclassing and defining gen() methods. Comments start
 *  with ';' and all instructions end with '\n'.  Handles both register (rN)
 *  and stack-based assembly instructions.  Labels are "ID:".  "main:" label
 *  is where we start execution.  Use .globals and .def for global data
 *  and function definitions, respectively.
 */
grammar AssemblerGrammar;

@lexer::header {package assemblerGrammar;}
@parser::header{package assemblerGrammar;
	
}
// START: members
@parser::members {
    // Define the functionality required by the parser for code generation
    protected void generateInstruction(Token instrToken){;}
    protected void generateInstruction(Token instrToken, Token operandToken){;}
    protected void checkForUnresolvedReferences(){;}
    protected void defineFunction(Token idToken, int nargs, int nlocals){;}
    protected void setGlobalLength(int n){;}
    protected void defineAddressLabel(Token idToken) {;}
}
// END: members

program
    :   globals?
    ( functionDeclaration |labelAddress| instr  )
   	(NEWLINE+( functionDeclaration |labelAddress| instr))*
   	NEWLINE*
        {checkForUnresolvedReferences();/*System.out.println("end program");*/}
    ;
    
globals : NEWLINE* '.globals' INT NEWLINE {setGlobalLength($INT.int);/*System.out.println("global");*/} ;


//  .def fact: args=1, locals=0
functionDeclaration
    : '.def' name=ID ':' 'args' '=' a=INT ',' 'locals' '=' n=INT 
      {defineFunction($name, $a.int, $n.int); /*System.out.println("function "+$name);*/}
    ;


labelAddress
    :   ID ':' {defineAddressLabel($ID);/*System.out.println("label "+ $ID);*/}
    ;
instr
    :	ID operand              {generateInstruction($ID,$operand.start);/*System.out.println("instruction one op "+$ID);*/}
	|	ID                 {generateInstruction($ID);/*System.out.println("instruction "+$ID);*/}
    ;

operand
    :	FUNC // function label; E.g., "f()"
    |	ID
    |   FLOAT
    |   STRING
    |   INT
    ;


ID  :   LETTER (LETTER | '0'..'9')* ;

FUNC:   ID '()' {;} ;

fragment
LETTER
    :   ('a'..'z' | 'A'..'Z')
    ;
    
INT :   '-'? '0'..'9'+ ;


STRING: '\"' STR_CHARS '\"' {;} ;

fragment STR_CHARS : ~'"'* ;

FLOAT
    :   INT '.' INT*
    |   '.' INT+
    |   INT ',' INT*
    |   ',' INT+
    ;

WS  :   (' '|'\t')+ {skip();} ;

NEWLINE
    :   (';' . )* '\r'? '\n'  // optional comment followed by newline
    ;
