package pieTraduction;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import pieGrammar.PieBaseListener;
import pieGrammar.PieParser;

public class Pie2Assembler extends PieBaseListener {
	
//	@Override
//	public void enterStatNL( PieParser.StatNLContext ctx) {
//	}
//
//	@Override
//	public void exitStatNL( PieParser.StatNLContext ctx) {
//	}

	@Override
	public void enterStatAssigment( PieParser.StatAssigmentContext ctx) {
	}

	@Override
	public void exitStatAssigment( PieParser.StatAssigmentContext ctx) {
	}

	@Override
	public void enterStatIf( PieParser.StatIfContext ctx) {
	}

	@Override
	public void exitStatIf( PieParser.StatIfContext ctx) {
	}

	@Override
	public void enterExprMult( PieParser.ExprMultContext ctx) {
	}

	@Override
	public void exitExprMult( PieParser.ExprMultContext ctx) {
	}

	@Override
	public void enterStaWhile( PieParser.StaWhileContext ctx) {
	}

	@Override
	public void exitStaWhile( PieParser.StaWhileContext ctx) {
	}

	@Override
	public void enterExprString( PieParser.ExprStringContext ctx) {
	}

	@Override
	public void exitExprString( PieParser.ExprStringContext ctx) {
	}

	@Override
	public void enterFunctionDefinition(
			 PieParser.FunctionDefinitionContext ctx) {
	}

	@Override
	public void exitFunctionDefinition(
			 PieParser.FunctionDefinitionContext ctx) {
	}

	@Override
	public void enterStatFunctionCall(
			 PieParser.StatFunctionCallContext ctx) {
	}

	@Override
	public void exitStatFunctionCall(
			 PieParser.StatFunctionCallContext ctx) {
	}

	@Override
	public void enterExprParens( PieParser.ExprParensContext ctx) {
	}

	@Override
	public void exitExprParens( PieParser.ExprParensContext ctx) {
	}

	@Override
	public void enterExprField( PieParser.ExprFieldContext ctx) {
	}

	@Override
	public void exitExprField( PieParser.ExprFieldContext ctx) {
	}

	@Override
	public void enterExprInt( PieParser.ExprIntContext ctx) {
	}

	@Override
	public void exitExprInt( PieParser.ExprIntContext ctx) {
	}

	@Override
	public void enterProgram( PieParser.ProgramContext ctx) {
	}

	@Override
	public void exitProgram( PieParser.ProgramContext ctx) {
	}

	@Override
	public void enterStatStructDefinition(
			 PieParser.StatStructDefinitionContext ctx) {
	}

	@Override
	public void exitStatStructDefinition(
			 PieParser.StatStructDefinitionContext ctx) {
	}

	@Override
	public void enterExprStructCreation(
			 PieParser.ExprStructCreationContext ctx) {
	}

	@Override
	public void exitExprStructCreation(
			 PieParser.ExprStructCreationContext ctx) {
	}

	@Override
	public void enterStatReturn( PieParser.StatReturnContext ctx) {
	}

	@Override
	public void exitStatReturn( PieParser.StatReturnContext ctx) {
	}

	@Override
	public void enterStructDefinition(
			 PieParser.StructDefinitionContext ctx) {
	}

	@Override
	public void exitStructDefinition(
			 PieParser.StructDefinitionContext ctx) {
	}

	@Override
	public void enterExprCondition( PieParser.ExprConditionContext ctx) {
	}

	@Override
	public void exitExprCondition( PieParser.ExprConditionContext ctx) {
	}

	@Override
	public void enterExprFunctionCall(
			 PieParser.ExprFunctionCallContext ctx) {
	}

	@Override
	public void exitExprFunctionCall(
			 PieParser.ExprFunctionCallContext ctx) {
	}

	@Override
	public void enterField( PieParser.FieldContext ctx) {
	}

	@Override
	public void exitField( PieParser.FieldContext ctx) {
	}

	@Override
	public void enterVardef( PieParser.VardefContext ctx) {
	}

	@Override
	public void exitVardef( PieParser.VardefContext ctx) {
	}

	@Override
	public void enterFunctionCall( PieParser.FunctionCallContext ctx) {
	}

	@Override
	public void exitFunctionCall( PieParser.FunctionCallContext ctx) {
	}

	@Override
	public void enterBlock( PieParser.BlockContext ctx) {
	}

	@Override
	public void exitBlock( PieParser.BlockContext ctx) {
	}

	@Override
	public void enterStatPrint( PieParser.StatPrintContext ctx) {
	}

	@Override
	public void exitStatPrint( PieParser.StatPrintContext ctx) {
	}

	@Override
	public void enterExprAdd( PieParser.ExprAddContext ctx) {
	}

	@Override
	public void exitExprAdd( PieParser.ExprAddContext ctx) {
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
