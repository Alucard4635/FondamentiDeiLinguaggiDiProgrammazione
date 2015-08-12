package assemblerAntlr;

// Generated from Assembler.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblerParser}.
 */
public interface AssemblerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AssemblerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AssemblerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(AssemblerParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(AssemblerParser.GlobalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AssemblerParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AssemblerParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(AssemblerParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(AssemblerParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#stackBynaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterStackBynaryOperator(AssemblerParser.StackBynaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#stackBynaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitStackBynaryOperator(AssemblerParser.StackBynaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#integerBynaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterIntegerBynaryOperation(AssemblerParser.IntegerBynaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#integerBynaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitIntegerBynaryOperation(AssemblerParser.IntegerBynaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#floatBynaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterFloatBynaryOperation(AssemblerParser.FloatBynaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#floatBynaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitFloatBynaryOperation(AssemblerParser.FloatBynaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#stackUnary}.
	 * @param ctx the parse tree
	 */
	void enterStackUnary(AssemblerParser.StackUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#stackUnary}.
	 * @param ctx the parse tree
	 */
	void exitStackUnary(AssemblerParser.StackUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#memoryStackOperation}.
	 * @param ctx the parse tree
	 */
	void enterMemoryStackOperation(AssemblerParser.MemoryStackOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#memoryStackOperation}.
	 * @param ctx the parse tree
	 */
	void exitMemoryStackOperation(AssemblerParser.MemoryStackOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(AssemblerParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(AssemblerParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#funcionOperation}.
	 * @param ctx the parse tree
	 */
	void enterFuncionOperation(AssemblerParser.FuncionOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#funcionOperation}.
	 * @param ctx the parse tree
	 */
	void exitFuncionOperation(AssemblerParser.FuncionOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#systemCall}.
	 * @param ctx the parse tree
	 */
	void enterSystemCall(AssemblerParser.SystemCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#systemCall}.
	 * @param ctx the parse tree
	 */
	void exitSystemCall(AssemblerParser.SystemCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(AssemblerParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(AssemblerParser.LabelContext ctx);
}