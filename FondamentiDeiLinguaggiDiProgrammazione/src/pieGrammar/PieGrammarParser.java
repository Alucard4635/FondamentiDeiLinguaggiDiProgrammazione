// Generated from PieGrammar.g4 by ANTLR 4.5.1

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
public class PieGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, NL=23, ID=24, CHAR=25, 
		STRING=26, INT=27, FLOAT=28, WS=29, SL_COMMENT=30;
	public static final int
		RULE_program = 0, RULE_structDefinition = 1, RULE_functionDefinition = 2, 
		RULE_vardef = 3, RULE_block = 4, RULE_statement = 5, RULE_functionCall = 6, 
		RULE_expr = 7, RULE_field = 8;
	public static final String[] ruleNames = {
		"program", "structDefinition", "functionDefinition", "vardef", "block", 
		"statement", "functionCall", "expr", "field"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'struct'", "'{'", "','", "'}'", "'def'", "'('", "')'", "':'", "'.'", 
		"'='", "'return'", "'print'", "'if'", "'else'", "'while'", "'new'", "'*'", 
		"'/'", "'+'", "'-'", "'=='", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "NL", 
		"ID", "CHAR", "STRING", "INT", "FLOAT", "WS", "SL_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PieGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PieGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PieGrammarParser.EOF, 0); }
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitProgram(this);
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
				case T__4:
					{
					setState(18);
					functionDefinition();
					}
					break;
				case T__0:
				case T__10:
				case T__11:
				case T__12:
				case T__14:
				case NL:
				case ID:
					{
					setState(19);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << NL) | (1L << ID))) != 0) );
			setState(24);
			match(EOF);
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
		public TerminalNode ID() { return getToken(PieGrammarParser.ID, 0); }
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public TerminalNode NL() { return getToken(PieGrammarParser.NL, 0); }
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitStructDefinition(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			match(ID);
			setState(28);
			match(T__1);
			setState(29);
			vardef();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(30);
				match(T__2);
				setState(31);
				vardef();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(T__3);
			setState(38);
			match(NL);
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
		public TerminalNode ID() { return getToken(PieGrammarParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
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
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__4);
			setState(41);
			match(ID);
			setState(42);
			match(T__5);
			setState(51);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(43);
				vardef();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(44);
					match(T__2);
					setState(45);
					vardef();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(53);
			match(T__6);
			setState(54);
			block();
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
		public TerminalNode ID() { return getToken(PieGrammarParser.ID, 0); }
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitVardef(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ID);
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
		public List<TerminalNode> NL() { return getTokens(PieGrammarParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PieGrammarParser.NL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			setState(69);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(T__7);
				setState(59);
				match(NL);
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(60);
					statement();
					}
					}
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << NL) | (1L << ID))) != 0) );
				setState(65);
				match(T__8);
				setState(66);
				match(NL);
				}
				break;
			case T__0:
			case T__10:
			case T__11:
			case T__12:
			case T__14:
			case NL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				statement();
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
		public TerminalNode NL() { return getToken(PieGrammarParser.NL, 0); }
		public StatNLContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterStatNL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitStatNL(this);
		}
	}
	public static class StatAssigmentContext extends StatementContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(PieGrammarParser.NL, 0); }
		public StatAssigmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterStatAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitStatAssigment(this);
		}
	}
	public static class StatIfContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StatIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterStatIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitStatIf(this);
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
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterStaWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitStaWhile(this);
		}
	}
	public static class StatFunctionCallContext extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode NL() { return getToken(PieGrammarParser.NL, 0); }
		public StatFunctionCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterStatFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitStatFunctionCall(this);
		}
	}
	public static class StatPrintContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(PieGrammarParser.NL, 0); }
		public StatPrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterStatPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitStatPrint(this);
		}
	}
	public static class StatStructDefinitionContext extends StatementContext {
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public StatStructDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterStatStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitStatStructDefinition(this);
		}
	}
	public static class StatReturnContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(PieGrammarParser.NL, 0); }
		public StatReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterStatReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitStatReturn(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new StatStructDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				structDefinition();
				}
				break;
			case 2:
				_localctx = new StatAssigmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				field();
				setState(73);
				match(T__9);
				setState(74);
				expr(0);
				setState(75);
				match(NL);
				}
				break;
			case 3:
				_localctx = new StatReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(T__10);
				setState(78);
				expr(0);
				setState(79);
				match(NL);
				}
				break;
			case 4:
				_localctx = new StatPrintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				match(T__11);
				setState(82);
				expr(0);
				setState(83);
				match(NL);
				}
				break;
			case 5:
				_localctx = new StatIfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(T__12);
				setState(86);
				expr(0);
				setState(87);
				block();
				setState(90);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(88);
					match(T__13);
					setState(89);
					block();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new StaWhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				match(T__14);
				setState(93);
				expr(0);
				setState(94);
				block();
				}
				break;
			case 7:
				_localctx = new StatFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				functionCall();
				setState(97);
				match(NL);
				}
				break;
			case 8:
				_localctx = new StatNLContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
				match(NL);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PieGrammarParser.ID, 0); }
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
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			setState(103);
			match(T__5);
			setState(112);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__15) | (1L << ID) | (1L << STRING) | (1L << INT))) != 0)) {
				{
				setState(104);
				expr(0);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(105);
					match(T__2);
					setState(106);
					expr(0);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(114);
			match(T__6);
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
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterExprCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitExprCondition(this);
		}
	}
	public static class ExprFunctionCallContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprFunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterExprFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitExprFunctionCall(this);
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
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterExprMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitExprMult(this);
		}
	}
	public static class ExprStringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(PieGrammarParser.STRING, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitExprString(this);
		}
	}
	public static class ExprParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterExprParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitExprParens(this);
		}
	}
	public static class ExprFieldContext extends ExprContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ExprFieldContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterExprField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitExprField(this);
		}
	}
	public static class ExprIntContext extends ExprContext {
		public Token INT;
		public TerminalNode INT() { return getToken(PieGrammarParser.INT, 0); }
		public ExprIntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterExprInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitExprInt(this);
		}
	}
	public static class ExprStructCreationContext extends ExprContext {
		public TerminalNode ID() { return getToken(PieGrammarParser.ID, 0); }
		public ExprStructCreationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterExprStructCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitExprStructCreation(this);
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
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterExprAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitExprAdd(this);
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
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(117);
				functionCall();
				}
				break;
			case 2:
				{
				_localctx = new ExprStructCreationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(T__15);
				setState(119);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ExprFieldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				field();
				}
				break;
			case 4:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				((ExprIntContext)_localctx).INT = match(INT);
				System.out.println("iconst " +((ExprIntContext)_localctx).INT.getText());
				}
				break;
			case 5:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new ExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(T__5);
				setState(125);
				expr(0);
				setState(126);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(131);
						((ExprMultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
							((ExprMultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(132);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(134);
						((ExprAddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((ExprAddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(135);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprConditionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(137);
						((ExprConditionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
							((ExprConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(138);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(143);
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
		public List<TerminalNode> ID() { return getTokens(PieGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PieGrammarParser.ID, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PieGrammarListener ) ((PieGrammarListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(ID);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					match(T__8);
					setState(146);
					match(ID);
					}
					} 
				}
				setState(151);
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u009b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\6\2\27\n\2\r\2\16\2\30\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64\13"+
		"\4\5\4\66\n\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\6\6@\n\6\r\6\16\6A\3\6\3"+
		"\6\3\6\3\6\5\6H\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7g\n\7\3\b\3\b\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\5\bs\n\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0083\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008e\n\t\f\t\16\t\u0091\13\t\3\n\3\n\3"+
		"\n\7\n\u0096\n\n\f\n\16\n\u0099\13\n\3\n\2\3\20\13\2\4\6\b\n\f\16\20\22"+
		"\2\5\3\2\23\24\3\2\25\26\3\2\27\30\u00ab\2\26\3\2\2\2\4\34\3\2\2\2\6*"+
		"\3\2\2\2\b:\3\2\2\2\nG\3\2\2\2\ff\3\2\2\2\16h\3\2\2\2\20\u0082\3\2\2\2"+
		"\22\u0092\3\2\2\2\24\27\5\6\4\2\25\27\5\f\7\2\26\24\3\2\2\2\26\25\3\2"+
		"\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\33\7\2"+
		"\2\3\33\3\3\2\2\2\34\35\7\3\2\2\35\36\7\32\2\2\36\37\7\4\2\2\37$\5\b\5"+
		"\2 !\7\5\2\2!#\5\b\5\2\" \3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3"+
		"\2\2\2&$\3\2\2\2\'(\7\6\2\2()\7\31\2\2)\5\3\2\2\2*+\7\7\2\2+,\7\32\2\2"+
		",\65\7\b\2\2-\62\5\b\5\2./\7\5\2\2/\61\5\b\5\2\60.\3\2\2\2\61\64\3\2\2"+
		"\2\62\60\3\2\2\2\62\63\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\65-\3\2\2\2"+
		"\65\66\3\2\2\2\66\67\3\2\2\2\678\7\t\2\289\5\n\6\29\7\3\2\2\2:;\7\32\2"+
		"\2;\t\3\2\2\2<=\7\n\2\2=?\7\31\2\2>@\5\f\7\2?>\3\2\2\2@A\3\2\2\2A?\3\2"+
		"\2\2AB\3\2\2\2BC\3\2\2\2CD\7\13\2\2DE\7\31\2\2EH\3\2\2\2FH\5\f\7\2G<\3"+
		"\2\2\2GF\3\2\2\2H\13\3\2\2\2Ig\5\4\3\2JK\5\22\n\2KL\7\f\2\2LM\5\20\t\2"+
		"MN\7\31\2\2Ng\3\2\2\2OP\7\r\2\2PQ\5\20\t\2QR\7\31\2\2Rg\3\2\2\2ST\7\16"+
		"\2\2TU\5\20\t\2UV\7\31\2\2Vg\3\2\2\2WX\7\17\2\2XY\5\20\t\2Y\\\5\n\6\2"+
		"Z[\7\20\2\2[]\5\n\6\2\\Z\3\2\2\2\\]\3\2\2\2]g\3\2\2\2^_\7\21\2\2_`\5\20"+
		"\t\2`a\5\n\6\2ag\3\2\2\2bc\5\16\b\2cd\7\31\2\2dg\3\2\2\2eg\7\31\2\2fI"+
		"\3\2\2\2fJ\3\2\2\2fO\3\2\2\2fS\3\2\2\2fW\3\2\2\2f^\3\2\2\2fb\3\2\2\2f"+
		"e\3\2\2\2g\r\3\2\2\2hi\7\32\2\2ir\7\b\2\2jo\5\20\t\2kl\7\5\2\2ln\5\20"+
		"\t\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2rj\3\2"+
		"\2\2rs\3\2\2\2st\3\2\2\2tu\7\t\2\2u\17\3\2\2\2vw\b\t\1\2w\u0083\5\16\b"+
		"\2xy\7\22\2\2y\u0083\7\32\2\2z\u0083\5\22\n\2{|\7\35\2\2|\u0083\b\t\1"+
		"\2}\u0083\7\34\2\2~\177\7\b\2\2\177\u0080\5\20\t\2\u0080\u0081\7\t\2\2"+
		"\u0081\u0083\3\2\2\2\u0082v\3\2\2\2\u0082x\3\2\2\2\u0082z\3\2\2\2\u0082"+
		"{\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0083\u008f\3\2\2\2\u0084\u0085"+
		"\f\b\2\2\u0085\u0086\t\2\2\2\u0086\u008e\5\20\t\t\u0087\u0088\f\7\2\2"+
		"\u0088\u0089\t\3\2\2\u0089\u008e\5\20\t\b\u008a\u008b\f\3\2\2\u008b\u008c"+
		"\t\4\2\2\u008c\u008e\5\20\t\4\u008d\u0084\3\2\2\2\u008d\u0087\3\2\2\2"+
		"\u008d\u008a\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\21\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0097\7\32\2\2\u0093"+
		"\u0094\7\13\2\2\u0094\u0096\7\32\2\2\u0095\u0093\3\2\2\2\u0096\u0099\3"+
		"\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\23\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\21\26\30$\62\65AG\\for\u0082\u008d\u008f\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}