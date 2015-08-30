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
    protected void defineFunction(Token idToken, int nargs, int nlocals){;}
    protected void setGlobalLength(int n){;}
    protected void defineAddressLabel(Token idToken) {;}
}
// END: members

program
    :   globals?
    ( functionDeclaration | instr | labelAddress )
   	(NEWLINE+( functionDeclaration | instr | labelAddress ))*
        {checkForUnresolvedReferences();}
    ;
/////////////////////////////////FIXME i try with NEWLINE first
// how much data space
// START: data
globals : NEWLINE* '.globals' INT NEWLINE {setGlobalLength($INT.int);} ;
// END: data

//  .def fact: args=1, locals=0
// START: func
functionDeclaration
    : '.def' name=ID ':' 'args' '=' a=INT ',' 'locals' '=' n=INT 
      {defineFunction($name, $a.int, $n.int);}
    ;
// END: func

// START: instr
instr
    :   ID                          {generateInstruction($ID);}
    |   ID operand                  {generateInstruction($ID,$operand.start);}
    ;
// END: instr

// START: operand
operand
    :   ID   // basic code label; E.g., "loop"
    |   FUNC // function label; E.g., "f()"
    |   INT
    |   STRING
    |   FLOAT
    ;

labelAddress
    :   ID ':' {defineAddressLabel($ID);}
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
