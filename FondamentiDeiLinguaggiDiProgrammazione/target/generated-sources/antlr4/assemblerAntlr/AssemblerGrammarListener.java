// Generated from AssemblerGrammar.g4 by ANTLR 4.4
package assemblerAntlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblerGrammarParser}.
 */
public interface AssemblerGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(@NotNull AssemblerGrammarParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(@NotNull AssemblerGrammarParser.GlobalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(@NotNull AssemblerGrammarParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(@NotNull AssemblerGrammarParser.InstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull AssemblerGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull AssemblerGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull AssemblerGrammarParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull AssemblerGrammarParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull AssemblerGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull AssemblerGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(@NotNull AssemblerGrammarParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(@NotNull AssemblerGrammarParser.OperandContext ctx);
}