// Generated from AssemblerGrammar.g4 by ANTLR 4.4
package assemblerGrammar;
package assemblerGrammar;
	

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, ID=8, FUNC=9, 
		INT=10, STRING=11, FLOAT=12, WS=13, NEWLINE=14;
	public static final String[] tokenNames = {
		"<INVALID>", "'.def'", "'.globals'", "'args'", "':'", "','", "'locals'", 
		"'='", "ID", "FUNC", "INT", "STRING", "FLOAT", "WS", "NEWLINE"
	};
	public static final int
		RULE_program = 0, RULE_globals = 1, RULE_functionDeclaration = 2, RULE_instr = 3, 
		RULE_operand = 4, RULE_labelAddress = 5;
	public static final String[] ruleNames = {
		"program", "globals", "functionDeclaration", "instr", "operand", "labelAddress"
	};

	@Override
	public String getGrammarFileName() { return "AssemblerGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    // Define the functionality required by the parser for code generation
	    protected void generateInstruction(Token instrToken){;}
	    protected void generateInstruction(Token instrToken, Token operandToken){;}
	    protected void defineFunction(Token idToken, int nargs, int nlocals){;}
	    protected void setGlobalLength(int n){;}
	    protected void defineAddressLabel(Token idToken) {;}

	public AssemblerGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AssemblerGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssemblerGrammarParser.NEWLINE, i);
		}
		public List<LabelAddressContext> labelAddress() {
			return getRuleContexts(LabelAddressContext.class);
		}
		public GlobalsContext globals() {
			return getRuleContext(GlobalsContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public LabelAddressContext labelAddress(int i) {
			return getRuleContext(LabelAddressContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_la = _input.LA(1);
			if (_la==T__5 || _la==NEWLINE) {
				{
				setState(12); globals();
				}
			}

			setState(18);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(15); functionDeclaration();
				}
				break;
			case 2:
				{
				setState(16); instr();
				}
				break;
			case 3:
				{
				setState(17); labelAddress();
				}
				break;
			}
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(20); match(NEWLINE);
					}
					}
					setState(23); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(28);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(25); functionDeclaration();
					}
					break;
				case 2:
					{
					setState(26); instr();
					}
					break;
				case 3:
					{
					setState(27); labelAddress();
					}
					break;
				}
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkForUnresolvedReferences();
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
		public Token INT;
		public List<TerminalNode> NEWLINE() { return getTokens(AssemblerGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssemblerGrammarParser.NEWLINE, i);
		}
		public TerminalNode INT() { return getToken(AssemblerGrammarParser.INT, 0); }
		public GlobalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterGlobals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitGlobals(this);
		}
	}

	public final GlobalsContext globals() throws RecognitionException {
		GlobalsContext _localctx = new GlobalsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(37); match(NEWLINE);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43); match(T__5);
			setState(44); ((GlobalsContext)_localctx).INT = match(INT);
			setState(45); match(NEWLINE);
			setGlobalLength((((GlobalsContext)_localctx).INT!=null?Integer.valueOf(((GlobalsContext)_localctx).INT.getText()):0));
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
		public Token name;
		public Token a;
		public Token n;
		public TerminalNode INT(int i) {
			return getToken(AssemblerGrammarParser.INT, i);
		}
		public TerminalNode ID() { return getToken(AssemblerGrammarParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(AssemblerGrammarParser.INT); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(T__6);
			setState(49); ((FunctionDeclarationContext)_localctx).name = match(ID);
			setState(50); match(T__3);
			setState(51); match(T__4);
			setState(52); match(T__0);
			setState(53); ((FunctionDeclarationContext)_localctx).a = match(INT);
			setState(54); match(T__2);
			setState(55); match(T__1);
			setState(56); match(T__0);
			setState(57); ((FunctionDeclarationContext)_localctx).n = match(INT);
			defineFunction(((FunctionDeclarationContext)_localctx).name, (((FunctionDeclarationContext)_localctx).a!=null?Integer.valueOf(((FunctionDeclarationContext)_localctx).a.getText()):0), (((FunctionDeclarationContext)_localctx).n!=null?Integer.valueOf(((FunctionDeclarationContext)_localctx).n.getText()):0));
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

	public static class InstrContext extends ParserRuleContext {
		public Token ID;
		public OperandContext operand;
		public TerminalNode ID() { return getToken(AssemblerGrammarParser.ID, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitInstr(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instr);
		try {
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); ((InstrContext)_localctx).ID = match(ID);
				generateInstruction(((InstrContext)_localctx).ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); ((InstrContext)_localctx).ID = match(ID);
				setState(63); ((InstrContext)_localctx).operand = operand();
				generateInstruction(((InstrContext)_localctx).ID,(((InstrContext)_localctx).operand!=null?(((InstrContext)_localctx).operand.start):null));
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

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AssemblerGrammarParser.ID, 0); }
		public TerminalNode STRING() { return getToken(AssemblerGrammarParser.STRING, 0); }
		public TerminalNode FUNC() { return getToken(AssemblerGrammarParser.FUNC, 0); }
		public TerminalNode INT() { return getToken(AssemblerGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(AssemblerGrammarParser.FLOAT, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FUNC) | (1L << INT) | (1L << STRING) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class LabelAddressContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(AssemblerGrammarParser.ID, 0); }
		public LabelAddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelAddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).enterLabelAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerGrammarListener ) ((AssemblerGrammarListener)listener).exitLabelAddress(this);
		}
	}

	public final LabelAddressContext labelAddress() throws RecognitionException {
		LabelAddressContext _localctx = new LabelAddressContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_labelAddress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); ((LabelAddressContext)_localctx).ID = match(ID);
			setState(71); match(T__3);
			defineAddressLabel(((LabelAddressContext)_localctx).ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20M\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\5\2\20\n\2\3\2\3\2\3\2\5\2\25\n"+
		"\2\3\2\6\2\30\n\2\r\2\16\2\31\3\2\3\2\3\2\5\2\37\n\2\7\2!\n\2\f\2\16\2"+
		"$\13\2\3\2\3\2\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5E"+
		"\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\n\16O\2\17"+
		"\3\2\2\2\4*\3\2\2\2\6\62\3\2\2\2\bD\3\2\2\2\nF\3\2\2\2\fH\3\2\2\2\16\20"+
		"\5\4\3\2\17\16\3\2\2\2\17\20\3\2\2\2\20\24\3\2\2\2\21\25\5\6\4\2\22\25"+
		"\5\b\5\2\23\25\5\f\7\2\24\21\3\2\2\2\24\22\3\2\2\2\24\23\3\2\2\2\25\""+
		"\3\2\2\2\26\30\7\20\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32"+
		"\3\2\2\2\32\36\3\2\2\2\33\37\5\6\4\2\34\37\5\b\5\2\35\37\5\f\7\2\36\33"+
		"\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37!\3\2\2\2 \27\3\2\2\2!$\3\2\2\2"+
		"\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\b\2\1\2&\3\3\2\2\2\')\7"+
		"\20\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-"+
		".\7\4\2\2./\7\f\2\2/\60\7\20\2\2\60\61\b\3\1\2\61\5\3\2\2\2\62\63\7\3"+
		"\2\2\63\64\7\n\2\2\64\65\7\6\2\2\65\66\7\5\2\2\66\67\7\t\2\2\678\7\f\2"+
		"\289\7\7\2\29:\7\b\2\2:;\7\t\2\2;<\7\f\2\2<=\b\4\1\2=\7\3\2\2\2>?\7\n"+
		"\2\2?E\b\5\1\2@A\7\n\2\2AB\5\n\6\2BC\b\5\1\2CE\3\2\2\2D>\3\2\2\2D@\3\2"+
		"\2\2E\t\3\2\2\2FG\t\2\2\2G\13\3\2\2\2HI\7\n\2\2IJ\7\6\2\2JK\b\7\1\2K\r"+
		"\3\2\2\2\t\17\24\31\36\"*D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}