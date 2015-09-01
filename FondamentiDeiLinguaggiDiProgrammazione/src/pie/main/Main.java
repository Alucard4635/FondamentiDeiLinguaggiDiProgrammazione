package pie.main;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import pie.intepreter.ExecutionError;
import pie.intepreter.Interpreter;
import pie.parser.PieLexer;
import pie.parser.PieParser;
import pie.symtab.SymbolTableBuilderError;
import pie.symtab.ScopePrinter;
import pie.symtab.Validator;

public class Main {

  CharStream input = null;

  private Main(CharStream input) {
    this.input = input;
  }

  private void start() {
    // parse
    System.out.println("> Parsing...");
    PieLexer lex = new PieLexer(input); // create lexer 
    CommonTokenStream tokens = new CommonTokenStream(lex);
    PieParser parser = new PieParser(tokens); // create parser
    ParseTree parseTree = parser.program();

    if (parser.getNumberOfSyntaxErrors() > 0) {
      System.out.println(parser.getNumberOfSyntaxErrors() + " errors.");
      return;
    }

    // Build symbol table

    System.out.println("> Building symbol table... ");
    Validator symBuilder = new Validator();
    ParseTreeWalker walker = new ParseTreeWalker();
    try {
      walker.walk(symBuilder, parseTree);
    } catch (SymbolTableBuilderError e) {
      System.exit(1);
    }

    // print symbol table
    System.out.println("> Printing scopes...");
    {
      ScopePrinter printer = new ScopePrinter(symBuilder.getScopes());
      walker.walk(printer, parseTree);
    }

    // executon
    System.out.println("> Execution");
    try {
      Interpreter interpreter = new Interpreter(symBuilder.getScopes());
      interpreter.visit(parseTree);
    } catch (ExecutionError e) {
      System.out.println(e.getMessage());
    }

  }

  public static void main(String[] args) throws IOException {
    Main main = null; // read from filename or stdin
    if (args.length > 0)
      main = new Main(new ANTLRFileStream(args[0]));
    else
      main = new Main(new ANTLRInputStream(System.in));
    main.start();

  }
}
