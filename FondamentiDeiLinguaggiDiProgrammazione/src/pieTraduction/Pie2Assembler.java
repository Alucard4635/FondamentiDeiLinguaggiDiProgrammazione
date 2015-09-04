package pieTraduction;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import pieGrammar.PieGrammarBaseListener;
import pieGrammar.PieGrammarParser;

public class Pie2Assembler extends PieGrammarBaseListener {

	@Override
	public void enterProgram(PieGrammarParser.ProgramContext ctx) {
	}

	@Override
	public void exitProgram(PieGrammarParser.ProgramContext ctx) {
	}

	@Override
	public void enterStructDefinition(
			PieGrammarParser.StructDefinitionContext ctx) {
	}

	@Override
	public void exitStructDefinition(
			PieGrammarParser.StructDefinitionContext ctx) {
	}

	@Override
	public void enterFunctionDefinition(
			PieGrammarParser.FunctionDefinitionContext ctx) {
	}

	@Override
	public void exitFunctionDefinition(
			PieGrammarParser.FunctionDefinitionContext ctx) {
	}

	@Override
	public void enterVardef(PieGrammarParser.VardefContext ctx) {
	}

	@Override
	public void exitVardef(PieGrammarParser.VardefContext ctx) {
	}

	@Override
	public void enterBlock(PieGrammarParser.BlockContext ctx) {
	}

	@Override
	public void exitBlock(PieGrammarParser.BlockContext ctx) {
	}

	@Override
	public void enterStatStructDefinition(
			PieGrammarParser.StatStructDefinitionContext ctx) {
	}

	@Override
	public void exitStatStructDefinition(
			PieGrammarParser.StatStructDefinitionContext ctx) {
	}

	@Override
	public void enterStatAssigment(PieGrammarParser.StatAssigmentContext ctx) {
	}

	@Override
	public void exitStatAssigment(PieGrammarParser.StatAssigmentContext ctx) {
	}

	@Override
	public void enterStatReturn(PieGrammarParser.StatReturnContext ctx) {
	}

	@Override
	public void exitStatReturn(PieGrammarParser.StatReturnContext ctx) {
	}

	@Override
	public void enterStatPrint(PieGrammarParser.StatPrintContext ctx) {
	}

	@Override
	public void exitStatPrint(PieGrammarParser.StatPrintContext ctx) {
	}

	@Override
	public void enterStatIf(PieGrammarParser.StatIfContext ctx) {
	}

	@Override
	public void exitStatIf(PieGrammarParser.StatIfContext ctx) {
	}

	@Override
	public void enterStaWhile(PieGrammarParser.StaWhileContext ctx) {
	}

	@Override
	public void exitStaWhile(PieGrammarParser.StaWhileContext ctx) {
	}

	@Override
	public void enterStatFunctionCall(
			PieGrammarParser.StatFunctionCallContext ctx) {
	}

	@Override
	public void exitStatFunctionCall(
			PieGrammarParser.StatFunctionCallContext ctx) {
	}

	@Override
	public void enterStatNL(PieGrammarParser.StatNLContext ctx) {
	}

	@Override
	public void exitStatNL(PieGrammarParser.StatNLContext ctx) {
	}

	@Override
	public void enterFunctionCall(PieGrammarParser.FunctionCallContext ctx) {
	}

	@Override
	public void exitFunctionCall(PieGrammarParser.FunctionCallContext ctx) {
	}

	@Override
	public void enterExprCondition(PieGrammarParser.ExprConditionContext ctx) {
	}

	@Override
	public void exitExprCondition(PieGrammarParser.ExprConditionContext ctx) {
	}

	@Override
	public void enterExprFunctionCall(
			PieGrammarParser.ExprFunctionCallContext ctx) {
	}

	@Override
	public void exitExprFunctionCall(
			PieGrammarParser.ExprFunctionCallContext ctx) {
	}

	@Override
	public void enterExprMult(PieGrammarParser.ExprMultContext ctx) {
	}

	@Override
	public void exitExprMult(PieGrammarParser.ExprMultContext ctx) {
	}

	@Override
	public void enterExprString(PieGrammarParser.ExprStringContext ctx) {
	}

	@Override
	public void exitExprString(PieGrammarParser.ExprStringContext ctx) {
	}

	@Override
	public void enterExprParens(PieGrammarParser.ExprParensContext ctx) {
	}

	@Override
	public void exitExprParens(PieGrammarParser.ExprParensContext ctx) {
	}

	@Override
	public void enterExprField(PieGrammarParser.ExprFieldContext ctx) {
	}

	@Override
	public void exitExprField(PieGrammarParser.ExprFieldContext ctx) {
	}

	@Override
	public void enterExprInt(PieGrammarParser.ExprIntContext ctx) {
	}

	@Override
	public void exitExprInt(PieGrammarParser.ExprIntContext ctx) {
	}

	@Override
	public void enterExprStructCreation(
			PieGrammarParser.ExprStructCreationContext ctx) {
	}

	@Override
	public void exitExprStructCreation(
			PieGrammarParser.ExprStructCreationContext ctx) {
	}

	@Override
	public void enterExprAdd(PieGrammarParser.ExprAddContext ctx) {
	}

	@Override
	public void exitExprAdd(PieGrammarParser.ExprAddContext ctx) {
	}

	@Override
	public void enterField(PieGrammarParser.FieldContext ctx) {
	}

	@Override
	public void exitField(PieGrammarParser.FieldContext ctx) {
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
	}

	@Override
	public void visitTerminal(TerminalNode node) {
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
	}
}