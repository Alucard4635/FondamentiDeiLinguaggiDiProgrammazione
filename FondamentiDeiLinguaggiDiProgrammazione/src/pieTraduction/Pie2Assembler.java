package pieTraduction;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import pieGrammar.PieGrammarBaseListener;
import pieGrammar.PieGrammarParser.*;



public class Pie2Assembler extends PieGrammarBaseListener {
	  private GlobalScope globalScope;
	  private Scope currentScope;
	  private int numberOfErrors;
	  // to store associations between a node of the parse-tree
	  // and its scope
	  private ParseTreeProperty<Scope> scopes;

	  public Pie2Assembler() {
	    super();
	    this.globalScope = new GlobalScope();
	    this.numberOfErrors = 0;
	    this.scopes = new ParseTreeProperty<Scope>();
	  }

	  @Override
	  public void enterProgram(ProgramContext ctx) {
	    this.currentScope = globalScope;
	    scopes.put(ctx, globalScope);
	  }

	  @Override
	  public void enterStructDefinition(StructDefinitionContext ctx) {
	    String structName = ctx.ID().getText();
	    Symbol sym = currentScope.resolve(structName);
	    if (sym != null) // struct and function names cannot overlap
	      reportError(ctx.start, "symbol '" + structName + "' already defined as '" + sym.toString()
	          + "'");
	    else {
	      StructSymbol struct = new StructSymbol(ctx.start, structName, currentScope);
	      currentScope.define(struct);
	      currentScope = struct;
	      scopes.put(ctx, struct);
	    }
	  }

	  @Override
	  public void exitStructDefinition(StructDefinitionContext ctx) {
	    currentScope = currentScope.getEnclosingScope();
	  }

	  @Override
	  public void enterFunctionDefinition(FunctionDefinitionContext ctx) {
	    String functName = ctx.ID().getText();
	    Symbol sym = currentScope.resolve(functName);
	    if (sym != null) // struct and function names cannot overlap
	      reportError(ctx.start, "symbol '" + functName + " already defined as '" + sym.toString());
	    else {
	      FunctionSymbol fun = new FunctionSymbol(ctx.start, functName, currentScope, ctx.block());
	      currentScope.define(fun);
	      currentScope = fun;
	      scopes.put(ctx, fun);
	    }
	  }

	  @Override
	  public void exitFunctionDefinition(FunctionDefinitionContext ctx) {
	    currentScope = currentScope.getEnclosingScope();
	  }

	  @Override
	  public void exitVardef(VardefContext ctx) {
	    String varName = ctx.ID().getText();
	    if (currentScope instanceof FunctionSymbol) {
	      FunctionSymbol fun = (FunctionSymbol) currentScope;
	      if (fun.checkIfDefinedAsFormalParameter(varName))
	        reportError(ctx.start, "duplicate argument '" + varName + "' in function '" + fun.getName()
	            + "' definition");
	      VariableSymbol var = new VariableSymbol(ctx.start, varName, currentScope);
	      currentScope.define(var);
	    }
	    if (currentScope instanceof StructSymbol) {
	      StructSymbol struct = (StructSymbol) currentScope;
	      if (struct.checkIfDefinedAsField(varName))
	        reportError(ctx.start, "duplicate field '" + varName + "' in struct '" + struct.getName()
	            + "' definition");
	      VariableSymbol var = new VariableSymbol(ctx.start, varName, currentScope);
	      currentScope.define(var);
	    }
	  }

	  @Override
	  public void enterStatReturn(StatReturnContext ctx) {
	    // check whether return occurs in function
	    if (!(currentScope instanceof FunctionSymbol))
	      reportError(ctx.start, "'return' outside function");
	  }

	  public ParseTreeProperty<Scope> getScopes() {
	    return scopes;
	  }

	  private void reportError(Token token, String msg) {
	    numberOfErrors++;
	    MessageManager.error(token, msg);
	    throw new SymbolTableBuilderError();
	  }

	  public int getNumberOfErrors() {
	    return numberOfErrors;
	  }
//	@Override
//	public void enterStatNL( StatNLContext ctx) {
//	}
//
//	@Override
//	public void exitStatNL( StatNLContext ctx) {
//	}

	@Override
	public void enterStatAssigment( StatAssigmentContext ctx) {
	}

	@Override
	public void exitStatAssigment( StatAssigmentContext ctx) {
	}

	@Override
	public void enterStatIf( StatIfContext ctx) {
	}

	@Override
	public void exitStatIf( StatIfContext ctx) {
	}

	@Override
	public void enterExprMult( ExprMultContext ctx) {
	}

	@Override
	public void exitExprMult( ExprMultContext ctx) {
	}

	@Override
	public void enterStaWhile( StaWhileContext ctx) {
	}

	@Override
	public void exitStaWhile( StaWhileContext ctx) {
	}

	@Override
	public void enterExprString( ExprStringContext ctx) {
	}

	@Override
	public void exitExprString( ExprStringContext ctx) {
	}

	@Override
	public void enterStatFunctionCall(
			 StatFunctionCallContext ctx) {
	}

	@Override
	public void exitStatFunctionCall(
			 StatFunctionCallContext ctx) {
	}

	@Override
	public void enterExprParens( ExprParensContext ctx) {
	}

	@Override
	public void exitExprParens( ExprParensContext ctx) {
	}

	@Override
	public void enterExprField( ExprFieldContext ctx) {
	}

	@Override
	public void exitExprField( ExprFieldContext ctx) {
	}

	@Override
	public void enterExprInt( ExprIntContext ctx) {
	}

	@Override
	public void exitExprInt( ExprIntContext ctx) {
	}

	@Override
	public void exitProgram( ProgramContext ctx) {
	}

	@Override
	public void enterStatStructDefinition(
			 StatStructDefinitionContext ctx) {
	}

	@Override
	public void exitStatStructDefinition(
			 StatStructDefinitionContext ctx) {
	}

	@Override
	public void enterExprStructCreation(
			 ExprStructCreationContext ctx) {
	}

	@Override
	public void exitExprStructCreation(
			 ExprStructCreationContext ctx) {
	}


	@Override
	public void exitStatReturn( StatReturnContext ctx) {
	}


	@Override
	public void enterExprCondition( ExprConditionContext ctx) {
	}

	@Override
	public void exitExprCondition( ExprConditionContext ctx) {
	}

	@Override
	public void enterExprFunctionCall(
			 ExprFunctionCallContext ctx) {
	}

	@Override
	public void exitExprFunctionCall(
			 ExprFunctionCallContext ctx) {
	}

	@Override
	public void enterField( FieldContext ctx) {
	}

	@Override
	public void exitField( FieldContext ctx) {
	}

	@Override
	public void enterVardef( VardefContext ctx) {
	}


	@Override
	public void enterFunctionCall( FunctionCallContext ctx) {
	}

	@Override
	public void exitFunctionCall( FunctionCallContext ctx) {
	}

	@Override
	public void enterBlock( BlockContext ctx) {
	}

	@Override
	public void exitBlock( BlockContext ctx) {
	}

	@Override
	public void enterStatPrint( StatPrintContext ctx) {
	}

	@Override
	public void exitStatPrint( StatPrintContext ctx) {
	}

	@Override
	public void enterExprAdd( ExprAddContext ctx) {
	}

	@Override
	public void exitExprAdd( ExprAddContext ctx) {
	}

	@Override
	public void enterEveryRule( ParserRuleContext ctx) {
	}

	@Override
	public void exitEveryRule( ParserRuleContext ctx) {
	}

	@Override
	public void visitTerminal( TerminalNode node) {
	}

	@Override
	public void visitErrorNode( ErrorNode node) {
	}
}
