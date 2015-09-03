// Generated from PieGrammar.g4 by ANTLR 4.4
package pieGrammar;

  package pieGrammar; 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PieGrammarParser}.
 */
public interface PieGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code StatNL}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatNL(@NotNull PieGrammarParser.StatNLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatNL}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatNL(@NotNull PieGrammarParser.StatNLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssigment}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatAssigment(@NotNull PieGrammarParser.StatAssigmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssigment}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatAssigment(@NotNull PieGrammarParser.StatAssigmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatIf}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatIf(@NotNull PieGrammarParser.StatIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatIf}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatIf(@NotNull PieGrammarParser.StatIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMult}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMult(@NotNull PieGrammarParser.ExprMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMult}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMult(@NotNull PieGrammarParser.ExprMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StaWhile}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStaWhile(@NotNull PieGrammarParser.StaWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StaWhile}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStaWhile(@NotNull PieGrammarParser.StaWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(@NotNull PieGrammarParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(@NotNull PieGrammarParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieGrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull PieGrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieGrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull PieGrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatFunctionCall}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatFunctionCall(@NotNull PieGrammarParser.StatFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatFunctionCall}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatFunctionCall(@NotNull PieGrammarParser.StatFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParens(@NotNull PieGrammarParser.ExprParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParens(@NotNull PieGrammarParser.ExprParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprField}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprField(@NotNull PieGrammarParser.ExprFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprField}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprField(@NotNull PieGrammarParser.ExprFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInt(@NotNull PieGrammarParser.ExprIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInt(@NotNull PieGrammarParser.ExprIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull PieGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull PieGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatStructDefinition}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatStructDefinition(@NotNull PieGrammarParser.StatStructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatStructDefinition}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatStructDefinition(@NotNull PieGrammarParser.StatStructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStructCreation}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStructCreation(@NotNull PieGrammarParser.ExprStructCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStructCreation}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStructCreation(@NotNull PieGrammarParser.ExprStructCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatReturn}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatReturn(@NotNull PieGrammarParser.StatReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatReturn}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatReturn(@NotNull PieGrammarParser.StatReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieGrammarParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(@NotNull PieGrammarParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieGrammarParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(@NotNull PieGrammarParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCondition}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCondition(@NotNull PieGrammarParser.ExprConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCondition}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCondition(@NotNull PieGrammarParser.ExprConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFunctionCall}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunctionCall(@NotNull PieGrammarParser.ExprFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFunctionCall}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunctionCall(@NotNull PieGrammarParser.ExprFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull PieGrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull PieGrammarParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieGrammarParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(@NotNull PieGrammarParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieGrammarParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(@NotNull PieGrammarParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull PieGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull PieGrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PieGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PieGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatPrint(@NotNull PieGrammarParser.StatPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link PieGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatPrint(@NotNull PieGrammarParser.StatPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(@NotNull PieGrammarParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link PieGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(@NotNull PieGrammarParser.ExprAddContext ctx);
}