// Generated from Pie.g4 by ANTLR 4.4
package pieGrammar;
	

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PieParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__21=1, T__20=2, T__19=3, T__18=4, T__17=5, T__16=6, T__15=7, T__14=8, 
		T__13=9, T__12=10, T__11=11, T__10=12, T__9=13, T__8=14, T__7=15, T__6=16, 
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, NL=23, ID=24, CHAR=25, 
		STRING=26, INT=27, FLOAT=28, WS=29, SL_COMMENT=30;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'def'", "'new'", "'return'", "':'", "'{'", "'while'", 
		"'<'", "'=='", "'}'", "'='", "'if'", "'else'", "'print'", "'('", "')'", 
		"'*'", "'+'", "'struct'", "','", "'-'", "'.'", "NL", "ID", "CHAR", "STRING", 
		"INT", "FLOAT", "WS", "SL_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_functionDefinition = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_structDefinition = 4, RULE_vardef = 5, RULE_functionCall = 6, RULE_expr = 7, 
		RULE_field = 8;
	public static final String[] ruleNames = {
		"program", "functionDefinition", "block", "statement", "structDefinition", 
		"vardef", "functionCall", "expr", "field"
	};

	@Override
	public String getGrammarFileName() { return "Pie.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	//	private PieTranslator translator;
	//	public PieParser(TokenStream input, PieTranslator translator){
	//		super(input);
	//		this.translator=translator;
	//	}


	public PieParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PieParser.EOF, 0); }
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(20);
				switch (_input.LA(1)) {
				case T__20:
					{
					setState(18); functionDefinition();
					}
					break;
				case T__18:
				case T__15:
				case T__10:
				case T__8:
				case T__3:
				case NL:
				case ID:
					{
					setState(19); statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__18) | (1L << T__15) | (1L << T__10) | (1L << T__8) | (1L << T__3) | (1L << NL) | (1L << ID))) != 0) );
			setState(24); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PieParser.ID, 0); }
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(T__20);
			setState(27); match(ID);
			setState(28); match(T__7);
			setState(37);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(29); vardef();
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(30); match(T__2);
					setState(31); vardef();
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(39); match(T__6);
			setState(40); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(PieParser.NL); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode NL(int i) {
			return getToken(PieParser.NL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			setState(53);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); match(T__17);
				setState(43); match(NL);
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(44); statement();
					}
					}
					setState(47); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__15) | (1L << T__10) | (1L << T__8) | (1L << T__3) | (1L << NL) | (1L << ID))) != 0) );
				setState(49); match(T__0);
				setState(50); match(NL);
				}
				break;
			case T__18:
			case T__15:
			case T__10:
			case T__8:
			case T__3:
			case NL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatNLContext extends StatementContext {
		public TerminalNode NL() { return getToken(PieParser.NL, 0); }
		public StatNLContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterStatNL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitStatNL(this);
		}
	}
	public static class StatAssigmentContext extends StatementContext {
		public TerminalNode NL() { return getToken(PieParser.NL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public StatAssigmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterStatAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitStatAssigment(this);
		}
	}
	public static class StatIfContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public StatIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterStatIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitStatIf(this);
		}
	}
	public static class StaWhileContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterStaWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitStaWhile(this);
		}
	}
	public static class StatFunctionCallContext extends StatementContext {
		public TerminalNode NL() { return getToken(PieParser.NL, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatFunctionCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterStatFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitStatFunctionCall(this);
		}
	}
	public static class StatPrintContext extends StatementContext {
		public TerminalNode NL() { return getToken(PieParser.NL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatPrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterStatPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitStatPrint(this);
		}
	}
	public static class StatStructDefinitionContext extends StatementContext {
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public StatStructDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterStatStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitStatStructDefinition(this);
		}
	}
	public static class StatReturnContext extends StatementContext {
		public TerminalNode NL() { return getToken(PieParser.NL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterStatReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitStatReturn(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new StatStructDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55); structDefinition();
				}
				break;
			case 2:
				_localctx = new StatAssigmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56); field();
				setState(57); match(T__11);
				setState(58); expr(0);
				setState(59); match(NL);
				}
				break;
			case 3:
				_localctx = new StatReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61); match(T__18);
				setState(62); expr(0);
				setState(63); match(NL);
				}
				break;
			case 4:
				_localctx = new StatPrintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(65); match(T__8);
				setState(66); expr(0);
				setState(67); match(NL);
				}
				break;
			case 5:
				_localctx = new StatIfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(69); match(T__10);
				setState(70); expr(0);
				setState(71); block();
				setState(74);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(72); match(T__9);
					setState(73); block();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new StaWhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(76); match(T__15);
				setState(77); expr(0);
				setState(78); block();
				}
				break;
			case 7:
				_localctx = new StatFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(80); functionCall();
				setState(81); match(NL);
				}
				break;
			case 8:
				_localctx = new StatNLContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(83); match(NL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDefinitionContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(PieParser.NL, 0); }
		public TerminalNode ID() { return getToken(PieParser.ID, 0); }
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitStructDefinition(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(T__3);
			setState(87); match(ID);
			setState(88); match(T__16);
			setState(89); vardef();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(90); match(T__2);
				setState(91); vardef();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97); match(T__12);
			setState(98); match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PieParser.ID, 0); }
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitVardef(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PieParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(ID);
			setState(103); match(T__7);
			setState(112);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__7) | (1L << ID) | (1L << STRING) | (1L << INT))) != 0)) {
				{
				setState(104); expr(0);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(105); match(T__2);
					setState(106); expr(0);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(114); match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprConditionContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprConditionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterExprCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitExprCondition(this);
		}
	}
	public static class ExprFunctionCallContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprFunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterExprFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitExprFunctionCall(this);
		}
	}
	public static class ExprMultContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterExprMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitExprMult(this);
		}
	}
	public static class ExprStringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(PieParser.STRING, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitExprString(this);
		}
	}
	public static class ExprParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterExprParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitExprParens(this);
		}
	}
	public static class ExprFieldContext extends ExprContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ExprFieldContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterExprField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitExprField(this);
		}
	}
	public static class ExprIntContext extends ExprContext {
		public TerminalNode INT() { return getToken(PieParser.INT, 0); }
		public ExprIntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterExprInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitExprInt(this);
		}
	}
	public static class ExprStructCreationContext extends ExprContext {
		public TerminalNode ID() { return getToken(PieParser.ID, 0); }
		public ExprStructCreationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterExprStructCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitExprStructCreation(this);
		}
	}
	public static class ExprAddContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterExprAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitExprAdd(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(117); functionCall();
				}
				break;
			case 2:
				{
				_localctx = new ExprStructCreationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118); match(T__19);
				setState(119); match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ExprFieldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120); field();
				}
				break;
			case 4:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121); match(INT);
				}
				break;
			case 5:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122); match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new ExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123); match(T__7);
				setState(124); expr(0);
				setState(125); match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(130);
						((ExprMultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__5) ) {
							((ExprMultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(131); expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						((ExprAddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__1) ) {
							((ExprAddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(134); expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprConditionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(136);
						((ExprConditionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__13) ) {
							((ExprConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(137); expr(2);
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PieParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PieParser.ID, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieListener ) ((PieListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(ID);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144); match(T__0);
					setState(145); match(ID);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		case 1: return precpred(_ctx, 5);
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u009a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\6\2\27\n\2\r\2\16\2\30\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\5\3(\n\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4\60\n\4\r\4\16\4\61\3\4\3"+
		"\4\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5W\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6_\n\6\f\6\16\6b\13\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\5\bs\n\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u008d\n\t\f\t\16\t\u0090\13\t\3\n\3\n\3\n\7"+
		"\n\u0095\n\n\f\n\16\n\u0098\13\n\3\n\2\3\20\13\2\4\6\b\n\f\16\20\22\2"+
		"\5\4\2\3\3\23\23\4\2\24\24\27\27\3\2\n\13\u00aa\2\26\3\2\2\2\4\34\3\2"+
		"\2\2\6\67\3\2\2\2\bV\3\2\2\2\nX\3\2\2\2\ff\3\2\2\2\16h\3\2\2\2\20\u0081"+
		"\3\2\2\2\22\u0091\3\2\2\2\24\27\5\4\3\2\25\27\5\b\5\2\26\24\3\2\2\2\26"+
		"\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32"+
		"\33\7\2\2\3\33\3\3\2\2\2\34\35\7\4\2\2\35\36\7\32\2\2\36\'\7\21\2\2\37"+
		"$\5\f\7\2 !\7\26\2\2!#\5\f\7\2\" \3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2"+
		"\2%(\3\2\2\2&$\3\2\2\2\'\37\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\7\22\2\2*+"+
		"\5\6\4\2+\5\3\2\2\2,-\7\7\2\2-/\7\31\2\2.\60\5\b\5\2/.\3\2\2\2\60\61\3"+
		"\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\30\2\2\64\65\7"+
		"\31\2\2\658\3\2\2\2\668\5\b\5\2\67,\3\2\2\2\67\66\3\2\2\28\7\3\2\2\29"+
		"W\5\n\6\2:;\5\22\n\2;<\7\r\2\2<=\5\20\t\2=>\7\31\2\2>W\3\2\2\2?@\7\6\2"+
		"\2@A\5\20\t\2AB\7\31\2\2BW\3\2\2\2CD\7\20\2\2DE\5\20\t\2EF\7\31\2\2FW"+
		"\3\2\2\2GH\7\16\2\2HI\5\20\t\2IL\5\6\4\2JK\7\17\2\2KM\5\6\4\2LJ\3\2\2"+
		"\2LM\3\2\2\2MW\3\2\2\2NO\7\t\2\2OP\5\20\t\2PQ\5\6\4\2QW\3\2\2\2RS\5\16"+
		"\b\2ST\7\31\2\2TW\3\2\2\2UW\7\31\2\2V9\3\2\2\2V:\3\2\2\2V?\3\2\2\2VC\3"+
		"\2\2\2VG\3\2\2\2VN\3\2\2\2VR\3\2\2\2VU\3\2\2\2W\t\3\2\2\2XY\7\25\2\2Y"+
		"Z\7\32\2\2Z[\7\b\2\2[`\5\f\7\2\\]\7\26\2\2]_\5\f\7\2^\\\3\2\2\2_b\3\2"+
		"\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\f\2\2de\7\31\2\2e\13"+
		"\3\2\2\2fg\7\32\2\2g\r\3\2\2\2hi\7\32\2\2ir\7\21\2\2jo\5\20\t\2kl\7\26"+
		"\2\2ln\5\20\t\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3"+
		"\2\2\2rj\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\22\2\2u\17\3\2\2\2vw\b\t\1\2"+
		"w\u0082\5\16\b\2xy\7\5\2\2y\u0082\7\32\2\2z\u0082\5\22\n\2{\u0082\7\35"+
		"\2\2|\u0082\7\34\2\2}~\7\21\2\2~\177\5\20\t\2\177\u0080\7\22\2\2\u0080"+
		"\u0082\3\2\2\2\u0081v\3\2\2\2\u0081x\3\2\2\2\u0081z\3\2\2\2\u0081{\3\2"+
		"\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0082\u008e\3\2\2\2\u0083\u0084\f\b"+
		"\2\2\u0084\u0085\t\2\2\2\u0085\u008d\5\20\t\t\u0086\u0087\f\7\2\2\u0087"+
		"\u0088\t\3\2\2\u0088\u008d\5\20\t\b\u0089\u008a\f\3\2\2\u008a\u008b\t"+
		"\4\2\2\u008b\u008d\5\20\t\4\u008c\u0083\3\2\2\2\u008c\u0086\3\2\2\2\u008c"+
		"\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\21\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0096\7\32\2\2\u0092\u0093"+
		"\7\30\2\2\u0093\u0095\7\32\2\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2"+
		"\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\23\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\21\26\30$\'\61\67LV`or\u0081\u008c\u008e\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}