// Generated from Pie.g4 by ANTLR 4.4
package pieGrammar;
	

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PieParser}.
 */
public interface PieListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code StatNL}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatNL(@NotNull PieParser.StatNLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatNL}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatNL(@NotNull PieParser.StatNLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssigment}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatAssigment(@NotNull PieParser.StatAssigmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssigment}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatAssigment(@NotNull PieParser.StatAssigmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatIf}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatIf(@NotNull PieParser.StatIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatIf}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatIf(@NotNull PieParser.StatIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMult}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMult(@NotNull PieParser.ExprMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMult}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMult(@NotNull PieParser.ExprMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StaWhile}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStaWhile(@NotNull PieParser.StaWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StaWhile}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStaWhile(@NotNull PieParser.StaWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(@NotNull PieParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(@NotNull PieParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull PieParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull PieParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatFunctionCall}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatFunctionCall(@NotNull PieParser.StatFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatFunctionCall}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatFunctionCall(@NotNull PieParser.StatFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParens(@NotNull PieParser.ExprParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParens}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParens(@NotNull PieParser.ExprParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprField}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprField(@NotNull PieParser.ExprFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprField}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprField(@NotNull PieParser.ExprFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInt(@NotNull PieParser.ExprIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInt(@NotNull PieParser.ExprIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull PieParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull PieParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatStructDefinition}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatStructDefinition(@NotNull PieParser.StatStructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatStructDefinition}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatStructDefinition(@NotNull PieParser.StatStructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStructCreation}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStructCreation(@NotNull PieParser.ExprStructCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStructCreation}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStructCreation(@NotNull PieParser.ExprStructCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatReturn}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatReturn(@NotNull PieParser.StatReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatReturn}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatReturn(@NotNull PieParser.StatReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(@NotNull PieParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(@NotNull PieParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCondition}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCondition(@NotNull PieParser.ExprConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCondition}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCondition(@NotNull PieParser.ExprConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFunctionCall}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunctionCall(@NotNull PieParser.ExprFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFunctionCall}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunctionCall(@NotNull PieParser.ExprFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull PieParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull PieParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(@NotNull PieParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(@NotNull PieParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull PieParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull PieParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PieParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PieParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PieParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PieParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatPrint(@NotNull PieParser.StatPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link PieParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatPrint(@NotNull PieParser.StatPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(@NotNull PieParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link PieParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(@NotNull PieParser.ExprAddContext ctx);
}