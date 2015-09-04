package pieTraduction;

import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import pieGrammar.PieGrammarBaseListener;
import pieGrammar.PieGrammarParser.*;

public class Pie2Assembler extends PieGrammarBaseListener {
	
	private AssemblyGenerator traductor;
	BlockOfCode finalCode=new BlockOfCode();
	ArrayList<BlockOfCode> partialCode=new ArrayList<BlockOfCode>();
	BlockOfCode last;
	

	public Pie2Assembler(AssemblyGenerator trad) {
		traductor=trad;
	}

	@Override
	public void enterProgram(ProgramContext ctx) {
	}

	@Override
	public void exitProgram(ProgramContext ctx) {
	}

	@Override
	public void enterStructDefinition(
			StructDefinitionContext ctx) {
	}

	@Override
	public void exitStructDefinition(
			StructDefinitionContext ctx) {
	}

	@Override
	public void enterFunctionDefinition(
			FunctionDefinitionContext ctx) {
	}

	@Override
	public void exitFunctionDefinition(
			FunctionDefinitionContext ctx) {
	}

	@Override
	public void enterVardef(VardefContext ctx) {
	}

	@Override
	public void exitVardef(VardefContext ctx) {
	}

	@Override
	public void enterBlock(BlockContext ctx) {
	}

	@Override
	public void exitBlock(BlockContext ctx) {
	}

	@Override
	public void enterStatStructDefinition(
			StatStructDefinitionContext ctx) {
	}

	@Override
	public void exitStatStructDefinition(
			StatStructDefinitionContext ctx) {
	}

	@Override
	public void enterStatAssigment(StatAssigmentContext ctx) {
	}

	@Override
	public void exitStatAssigment(StatAssigmentContext ctx) {
	}

	@Override
	public void enterStatReturn(StatReturnContext ctx) {
	}

	@Override
	public void exitStatReturn(StatReturnContext ctx) {
	}

	@Override
	public void enterStatPrint(StatPrintContext ctx) {
	}

	@Override
	public void exitStatPrint(StatPrintContext ctx) {
	}

	@Override
	public void enterStatIf(StatIfContext ctx) {
	}

	@Override
	public void exitStatIf(StatIfContext ctx) {
	}

	@Override
	public void enterStaWhile(StaWhileContext ctx) {
	}

	@Override
	public void exitStaWhile(StaWhileContext ctx) {
	}

	@Override
	public void enterStatFunctionCall(
			StatFunctionCallContext ctx) {
	}

	@Override
	public void exitStatFunctionCall(
			StatFunctionCallContext ctx) {
	}

	@Override
	public void enterStatNL(StatNLContext ctx) {
	}

	@Override
	public void exitStatNL(StatNLContext ctx) {
	}

	@Override
	public void enterFunctionCall(FunctionCallContext ctx) {
	}

	@Override
	public void exitFunctionCall(FunctionCallContext ctx) {
	}

//	@Override
//	public void enterExprCondition(ExprConditionContext ctx) {
//		
//	}

	@Override
	public void exitExprCondition(ExprConditionContext ctx) {
		BlockOfCode last = partialCode.get(partialCode.size()-1);
		if (ctx.op.getText()=="==") {
			last.addCode("ieq");
		}else {
			last.addCode("igt");
		}
	}

	@Override
	public void enterExprFunctionCall(
			ExprFunctionCallContext ctx) {
	}

	@Override
	public void exitExprFunctionCall(
			ExprFunctionCallContext ctx) {
	}

//	@Override
//	public void enterExprMult(ExprMultContext ctx) {
//	}

	@Override
	public void exitExprMult(ExprMultContext ctx) {
		last = partialCode.get(partialCode.size()-1);
		if (ctx.op.getText()=="*") {
			last.addCode("imul");
		}else {
			last.addCode("idiv");
		}
	}

//	@Override
//	public void enterExprString(ExprStringContext ctx) {
//	}

	@Override
	public void exitExprString(ExprStringContext ctx) {
		last = partialCode.get(partialCode.size()-1);
		last.addCode("sconst "+ctx.STRING().getText());
	}

	@Override
	public void enterExprParens(ExprParensContext ctx) {
		partialCode.add(new BlockOfCode());
	}

	@Override
	public void exitExprParens(ExprParensContext ctx) {
		last = partialCode.remove(partialCode.size()-1);
		BlockOfCode toMerge = partialCode.get(partialCode.size()-1);
		toMerge.addFirst(last);
	}

	@Override
	public void enterExprField(ExprFieldContext ctx) {
	}

	@Override
	public void exitExprField(ExprFieldContext ctx) {
	}

//	@Override
//	public void enterExprInt(ExprIntContext ctx) {
//		
//	}

	@Override
	public void exitExprInt(ExprIntContext ctx) {
		BlockOfCode last = partialCode.get(partialCode.size()-1);
		last.addCode("iconst "+ctx.INT().getText());
	}

	@Override
	public void enterExprStructCreation(
			ExprStructCreationContext ctx) {
	}

	@Override
	public void exitExprStructCreation(
			ExprStructCreationContext ctx) {
	}

//	@Override
//	public void enterExprAdd(ExprAddContext ctx) {
//	}

	@Override
	public void exitExprAdd(ExprAddContext ctx) {
		BlockOfCode last = partialCode.get(partialCode.size()-1);
		if (ctx.op.getText()=="+") {
			last.addCode("iadd");
		}else {
			last.addCode("isub");
		}
	}

	@Override
	public void enterField(FieldContext ctx) {
	}

	@Override
	public void exitField(FieldContext ctx) {
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