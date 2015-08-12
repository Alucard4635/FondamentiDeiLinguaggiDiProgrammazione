package assemblerAntlr;

// Generated from Assembler.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ARITHMETIC=10, COMPARISON=11, INTEGER_UNARY_OPERATION=12, GLOBAL=13, MEMORY_OPERATION=14, 
		CONDITIONAL=15, UNCONDITIONAL=16, CALL=17, RETURN=18, STREAM=19, EXIT=20, 
		REG=21, ID=22, FUNC=23, INT=24, CHAR=25, STRING=26, FLOAT=27, WS=28, NEWLINE=29;
	public static final int
		RULE_program = 0, RULE_globals = 1, RULE_functionDeclaration = 2, RULE_instruction = 3, 
		RULE_stackBynaryOperator = 4, RULE_integerBynaryOperation = 5, RULE_floatBynaryOperation = 6, 
		RULE_stackUnary = 7, RULE_memoryStackOperation = 8, RULE_branch = 9, RULE_funcionOperation = 10, 
		RULE_systemCall = 11, RULE_label = 12;
	public static final String[] ruleNames = {
		"program", "globals", "functionDeclaration", "instruction", "stackBynaryOperator", 
		"integerBynaryOperation", "floatBynaryOperation", "stackUnary", "memoryStackOperation", 
		"branch", "funcionOperation", "systemCall", "label"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.globals'", "'.def'", "':'", "'args'", "'='", "','", "'locals'", 
		"'i'", "'f'", null, null, null, "'g'", null, "'br'", null, null, "'ret'", 
		"'print'", "'halt'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ARITHMETIC", 
		"COMPARISON", "INTEGER_UNARY_OPERATION", "GLOBAL", "MEMORY_OPERATION", 
		"CONDITIONAL", "UNCONDITIONAL", "CALL", "RETURN", "STREAM", "EXIT", "REG", 
		"ID", "FUNC", "INT", "CHAR", "STRING", "FLOAT", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "Assembler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AssemblerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(AssemblerParser.WS, 0); }
		public GlobalsContext globals() {
			return getRuleContext(GlobalsContext.class,0);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AssemblerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssemblerParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_la = _input.LA(1);
			if (_la==T__0 || _la==NEWLINE) {
				{
				setState(26);
				globals();
				}
			}

			setState(29);
			match(WS);
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(34);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(30);
					functionDeclaration();
					}
					break;
				case T__7:
				case T__8:
				case INTEGER_UNARY_OPERATION:
				case GLOBAL:
				case MEMORY_OPERATION:
				case CONDITIONAL:
				case UNCONDITIONAL:
				case CALL:
				case RETURN:
				case STREAM:
				case EXIT:
					{
					setState(31);
					instruction();
					}
					break;
				case ID:
					{
					setState(32);
					label();
					}
					break;
				case NEWLINE:
					{
					setState(33);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__8) | (1L << INTEGER_UNARY_OPERATION) | (1L << GLOBAL) | (1L << MEMORY_OPERATION) | (1L << CONDITIONAL) | (1L << UNCONDITIONAL) | (1L << CALL) | (1L << RETURN) | (1L << STREAM) | (1L << EXIT) | (1L << ID) | (1L << NEWLINE))) != 0) );
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

	public static class GlobalsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AssemblerParser.INT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(AssemblerParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssemblerParser.NEWLINE, i);
		}
		public GlobalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterGlobals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitGlobals(this);
		}
	}

	public final GlobalsContext globals() throws RecognitionException {
		GlobalsContext _localctx = new GlobalsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(38);
				match(NEWLINE);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(T__0);
			setState(45);
			match(INT);
			setState(46);
			match(NEWLINE);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(AssemblerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AssemblerParser.WS, i);
		}
		public TerminalNode ID() { return getToken(AssemblerParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(AssemblerParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AssemblerParser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(AssemblerParser.NEWLINE, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__1);
			setState(49);
			match(WS);
			setState(50);
			match(ID);
			setState(51);
			match(WS);
			setState(52);
			match(T__2);
			setState(53);
			match(WS);
			setState(54);
			match(T__3);
			setState(55);
			match(WS);
			setState(56);
			match(T__4);
			setState(57);
			match(WS);
			setState(58);
			match(INT);
			setState(59);
			match(WS);
			setState(60);
			match(T__5);
			setState(61);
			match(WS);
			setState(62);
			match(T__6);
			setState(63);
			match(WS);
			setState(64);
			match(T__4);
			setState(65);
			match(WS);
			setState(66);
			match(INT);
			setState(67);
			match(WS);
			setState(68);
			match(NEWLINE);
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

	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(AssemblerParser.NEWLINE, 0); }
		public StackBynaryOperatorContext stackBynaryOperator() {
			return getRuleContext(StackBynaryOperatorContext.class,0);
		}
		public StackUnaryContext stackUnary() {
			return getRuleContext(StackUnaryContext.class,0);
		}
		public MemoryStackOperationContext memoryStackOperation() {
			return getRuleContext(MemoryStackOperationContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public FuncionOperationContext funcionOperation() {
			return getRuleContext(FuncionOperationContext.class,0);
		}
		public SystemCallContext systemCall() {
			return getRuleContext(SystemCallContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				{
				setState(70);
				stackBynaryOperator();
				}
				break;
			case INTEGER_UNARY_OPERATION:
				{
				setState(71);
				stackUnary();
				}
				break;
			case GLOBAL:
			case MEMORY_OPERATION:
				{
				setState(72);
				memoryStackOperation();
				}
				break;
			case CONDITIONAL:
			case UNCONDITIONAL:
				{
				setState(73);
				branch();
				}
				break;
			case CALL:
			case RETURN:
				{
				setState(74);
				funcionOperation();
				}
				break;
			case STREAM:
			case EXIT:
				{
				setState(75);
				systemCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(78);
			match(NEWLINE);
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

	public static class StackBynaryOperatorContext extends ParserRuleContext {
		public IntegerBynaryOperationContext integerBynaryOperation() {
			return getRuleContext(IntegerBynaryOperationContext.class,0);
		}
		public FloatBynaryOperationContext floatBynaryOperation() {
			return getRuleContext(FloatBynaryOperationContext.class,0);
		}
		public StackBynaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackBynaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterStackBynaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitStackBynaryOperator(this);
		}
	}

	public final StackBynaryOperatorContext stackBynaryOperator() throws RecognitionException {
		StackBynaryOperatorContext _localctx = new StackBynaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stackBynaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(80);
				integerBynaryOperation();
				}
				break;
			case T__8:
				{
				setState(81);
				floatBynaryOperation();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IntegerBynaryOperationContext extends ParserRuleContext {
		public TerminalNode ARITHMETIC() { return getToken(AssemblerParser.ARITHMETIC, 0); }
		public TerminalNode COMPARISON() { return getToken(AssemblerParser.COMPARISON, 0); }
		public IntegerBynaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerBynaryOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterIntegerBynaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitIntegerBynaryOperation(this);
		}
	}

	public final IntegerBynaryOperationContext integerBynaryOperation() throws RecognitionException {
		IntegerBynaryOperationContext _localctx = new IntegerBynaryOperationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_integerBynaryOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__7);
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==ARITHMETIC || _la==COMPARISON) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class FloatBynaryOperationContext extends ParserRuleContext {
		public TerminalNode ARITHMETIC() { return getToken(AssemblerParser.ARITHMETIC, 0); }
		public TerminalNode COMPARISON() { return getToken(AssemblerParser.COMPARISON, 0); }
		public FloatBynaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatBynaryOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterFloatBynaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitFloatBynaryOperation(this);
		}
	}

	public final FloatBynaryOperationContext floatBynaryOperation() throws RecognitionException {
		FloatBynaryOperationContext _localctx = new FloatBynaryOperationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_floatBynaryOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__8);
			setState(88);
			_la = _input.LA(1);
			if ( !(_la==ARITHMETIC || _la==COMPARISON) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class StackUnaryContext extends ParserRuleContext {
		public TerminalNode INTEGER_UNARY_OPERATION() { return getToken(AssemblerParser.INTEGER_UNARY_OPERATION, 0); }
		public StackUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterStackUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitStackUnary(this);
		}
	}

	public final StackUnaryContext stackUnary() throws RecognitionException {
		StackUnaryContext _localctx = new StackUnaryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stackUnary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(90);
			match(INTEGER_UNARY_OPERATION);
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

	public static class MemoryStackOperationContext extends ParserRuleContext {
		public TerminalNode MEMORY_OPERATION() { return getToken(AssemblerParser.MEMORY_OPERATION, 0); }
		public TerminalNode GLOBAL() { return getToken(AssemblerParser.GLOBAL, 0); }
		public MemoryStackOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryStackOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterMemoryStackOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitMemoryStackOperation(this);
		}
	}

	public final MemoryStackOperationContext memoryStackOperation() throws RecognitionException {
		MemoryStackOperationContext _localctx = new MemoryStackOperationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_memoryStackOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(92);
				match(GLOBAL);
				}
			}

			setState(95);
			match(MEMORY_OPERATION);
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

	public static class BranchContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(AssemblerParser.WS, 0); }
		public TerminalNode ID() { return getToken(AssemblerParser.ID, 0); }
		public TerminalNode UNCONDITIONAL() { return getToken(AssemblerParser.UNCONDITIONAL, 0); }
		public TerminalNode CONDITIONAL() { return getToken(AssemblerParser.CONDITIONAL, 0); }
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitBranch(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==CONDITIONAL || _la==UNCONDITIONAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(98);
			match(WS);
			setState(99);
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

	public static class FuncionOperationContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(AssemblerParser.CALL, 0); }
		public TerminalNode RETURN() { return getToken(AssemblerParser.RETURN, 0); }
		public FuncionOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterFuncionOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitFuncionOperation(this);
		}
	}

	public final FuncionOperationContext funcionOperation() throws RecognitionException {
		FuncionOperationContext _localctx = new FuncionOperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcionOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==CALL || _la==RETURN) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class SystemCallContext extends ParserRuleContext {
		public TerminalNode STREAM() { return getToken(AssemblerParser.STREAM, 0); }
		public TerminalNode EXIT() { return getToken(AssemblerParser.EXIT, 0); }
		public SystemCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterSystemCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitSystemCall(this);
		}
	}

	public final SystemCallContext systemCall() throws RecognitionException {
		SystemCallContext _localctx = new SystemCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_systemCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==STREAM || _la==EXIT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AssemblerParser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ID);
			setState(106);
			match(T__2);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37o\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\5\2\36\n\2\3\2\3\2\3\2\3\2\3\2\6\2%\n\2\r"+
		"\2\16\2&\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\5\3\5\3\6\3\6\5\6U\n\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\5\n`\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2"+
		"\6\3\2\f\r\3\2\21\22\3\2\23\24\3\2\25\26n\2\35\3\2\2\2\4+\3\2\2\2\6\62"+
		"\3\2\2\2\bN\3\2\2\2\nT\3\2\2\2\fV\3\2\2\2\16Y\3\2\2\2\20\\\3\2\2\2\22"+
		"_\3\2\2\2\24c\3\2\2\2\26g\3\2\2\2\30i\3\2\2\2\32k\3\2\2\2\34\36\5\4\3"+
		"\2\35\34\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37$\7\36\2\2 %\5\6\4\2!%"+
		"\5\b\5\2\"%\5\32\16\2#%\7\37\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2"+
		"\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\3\3\2\2\2(*\7\37\2\2)(\3\2\2\2*"+
		"-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\3\2\2/\60\7\32\2"+
		"\2\60\61\7\37\2\2\61\5\3\2\2\2\62\63\7\4\2\2\63\64\7\36\2\2\64\65\7\30"+
		"\2\2\65\66\7\36\2\2\66\67\7\5\2\2\678\7\36\2\289\7\6\2\29:\7\36\2\2:;"+
		"\7\7\2\2;<\7\36\2\2<=\7\32\2\2=>\7\36\2\2>?\7\b\2\2?@\7\36\2\2@A\7\t\2"+
		"\2AB\7\36\2\2BC\7\7\2\2CD\7\36\2\2DE\7\32\2\2EF\7\36\2\2FG\7\37\2\2G\7"+
		"\3\2\2\2HO\5\n\6\2IO\5\20\t\2JO\5\22\n\2KO\5\24\13\2LO\5\26\f\2MO\5\30"+
		"\r\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2OP\3\2"+
		"\2\2PQ\7\37\2\2Q\t\3\2\2\2RU\5\f\7\2SU\5\16\b\2TR\3\2\2\2TS\3\2\2\2U\13"+
		"\3\2\2\2VW\7\n\2\2WX\t\2\2\2X\r\3\2\2\2YZ\7\13\2\2Z[\t\2\2\2[\17\3\2\2"+
		"\2\\]\7\16\2\2]\21\3\2\2\2^`\7\17\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab"+
		"\7\20\2\2b\23\3\2\2\2cd\t\3\2\2de\7\36\2\2ef\7\30\2\2f\25\3\2\2\2gh\t"+
		"\4\2\2h\27\3\2\2\2ij\t\5\2\2j\31\3\2\2\2kl\7\30\2\2lm\7\5\2\2m\33\3\2"+
		"\2\2\t\35$&+NT_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}