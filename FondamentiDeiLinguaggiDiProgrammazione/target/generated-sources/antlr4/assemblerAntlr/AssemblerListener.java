// Generated from Assembler.g4 by ANTLR 4.4
package assemblerAntlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblerParser}.
 */
public interface AssemblerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#funcionOperation}.
	 * @param ctx the parse tree
	 */
	void enterFuncionOperation(@NotNull AssemblerParser.FuncionOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#funcionOperation}.
	 * @param ctx the parse tree
	 */
	void exitFuncionOperation(@NotNull AssemblerParser.FuncionOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#systemCall}.
	 * @param ctx the parse tree
	 */
	void enterSystemCall(@NotNull AssemblerParser.SystemCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#systemCall}.
	 * @param ctx the parse tree
	 */
	void exitSystemCall(@NotNull AssemblerParser.SystemCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(@NotNull AssemblerParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(@NotNull AssemblerParser.GlobalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#floatBynaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterFloatBynaryOperation(@NotNull AssemblerParser.FloatBynaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#floatBynaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitFloatBynaryOperation(@NotNull AssemblerParser.FloatBynaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull AssemblerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull AssemblerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull AssemblerParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull AssemblerParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(@NotNull AssemblerParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(@NotNull AssemblerParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#integerBynaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterIntegerBynaryOperation(@NotNull AssemblerParser.IntegerBynaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#integerBynaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitIntegerBynaryOperation(@NotNull AssemblerParser.IntegerBynaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#stackBynaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterStackBynaryOperator(@NotNull AssemblerParser.StackBynaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#stackBynaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitStackBynaryOperator(@NotNull AssemblerParser.StackBynaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#stackUnary}.
	 * @param ctx the parse tree
	 */
	void enterStackUnary(@NotNull AssemblerParser.StackUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#stackUnary}.
	 * @param ctx the parse tree
	 */
	void exitStackUnary(@NotNull AssemblerParser.StackUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull AssemblerParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull AssemblerParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#memoryStackOperation}.
	 * @param ctx the parse tree
	 */
	void enterMemoryStackOperation(@NotNull AssemblerParser.MemoryStackOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#memoryStackOperation}.
	 * @param ctx the parse tree
	 */
	void exitMemoryStackOperation(@NotNull AssemblerParser.MemoryStackOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull AssemblerParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull AssemblerParser.FunctionDeclarationContext ctx);
}