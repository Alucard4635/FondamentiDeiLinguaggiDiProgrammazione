// Generated from PieGrammar.g4 by ANTLR 4.5.1

  package pieGrammar; 

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PieGrammarParser}.
 */
public interface PieGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PieGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PieGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PieGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieGrammarParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(PieGrammarParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieGrammarParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(PieGrammarParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieGrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(PieGrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieGrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(PieGrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieGrammarParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(PieGrammarParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieGrammarParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(PieGrammarParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PieGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PieGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatStructDefinition}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatStructDefinition(PieGrammarParser.StatStructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatStructDefinition}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatStructDefinition(PieGrammarParser.StatStructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssigment}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatAssigment(PieGrammarParser.StatAssigmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssigment}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatAssigment(PieGrammarParser.StatAssigmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatReturn}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatReturn(PieGrammarParser.StatReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatReturn}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatReturn(PieGrammarParser.StatReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatPrint(PieGrammarParser.StatPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatPrint(PieGrammarParser.StatPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatIf}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatIf(PieGrammarParser.StatIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatIf}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatIf(PieGrammarParser.StatIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StaWhile}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStaWhile(PieGrammarParser.StaWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StaWhile}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStaWhile(PieGrammarParser.StaWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatFunctionCall}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatFunctionCall(PieGrammarParser.StatFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatFunctionCall}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatFunctionCall(PieGrammarParser.StatFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatNL}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatNL(PieGrammarParser.StatNLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatNL}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatNL(PieGrammarParser.StatNLContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PieGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PieGrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCondition}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCondition(PieGrammarParser.ExprConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCondition}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCondition(PieGrammarParser.ExprConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFunctionCall}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunctionCall(PieGrammarParser.ExprFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFunctionCall}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunctionCall(PieGrammarParser.ExprFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMult}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMult(PieGrammarParser.ExprMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMult}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMult(PieGrammarParser.ExprMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(PieGrammarParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(PieGrammarParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParens(PieGrammarParser.ExprParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParens(PieGrammarParser.ExprParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprField}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprField(PieGrammarParser.ExprFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprField}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprField(PieGrammarParser.ExprFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInt(PieGrammarParser.ExprIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInt(PieGrammarParser.ExprIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStructCreation}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStructCreation(PieGrammarParser.ExprStructCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStructCreation}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStructCreation(PieGrammarParser.ExprStructCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(PieGrammarParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(PieGrammarParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(PieGrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(PieGrammarParser.FieldContext ctx);
}