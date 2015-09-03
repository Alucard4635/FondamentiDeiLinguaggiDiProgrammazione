package pieTraduction;

import org.antlr.v4.runtime.tree.ParseTree;

import pieGrammar.PieGrammarParser.ExprContext;

public interface PieTraductor {

	void generateAssemblyProgram();

	void addAssigment(ParseTree child, ExprContext expr);

	void createAStruct(String text);

}
