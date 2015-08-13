// Generated from AssemblerGrammar.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblerGrammarParser}.
 */
public interface AssemblerGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AssemblerGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AssemblerGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(AssemblerGrammarParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(AssemblerGrammarParser.GlobalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AssemblerGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AssemblerGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(AssemblerGrammarParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(AssemblerGrammarParser.InstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(AssemblerGrammarParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(AssemblerGrammarParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerGrammarParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(AssemblerGrammarParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerGrammarParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(AssemblerGrammarParser.LabelContext ctx);
}