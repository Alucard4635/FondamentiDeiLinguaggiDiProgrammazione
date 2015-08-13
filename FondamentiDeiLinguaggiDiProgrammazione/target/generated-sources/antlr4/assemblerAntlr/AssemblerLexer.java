// Generated from Assembler.g4 by ANTLR 4.4
package assemblerAntlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		ARITHMETIC=10, COMPARISON=11, INTEGER_UNARY_OPERATION=12, GLOBAL=13, MEMORY_OPERATION=14, 
		CONDITIONAL=15, UNCONDITIONAL=16, CALL=17, RETURN=18, STREAM=19, EXIT=20, 
		REG=21, ID=22, FUNC=23, INT=24, CHAR=25, STRING=26, FLOAT=27, WS=28, NEWLINE=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"ARITHMETIC", "COMPARISON", "INTEGER_UNARY_OPERATION", "GLOBAL", "MEMORY_OPERATION", 
		"CONDITIONAL", "UNCONDITIONAL", "CALL", "RETURN", "STREAM", "EXIT", "REG", 
		"ID", "FUNC", "LETTER", "INT", "CHAR", "STRING", "STR_CHARS", "FLOAT", 
		"WS", "NEWLINE"
	};


	public AssemblerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Assembler.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00fa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"r\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fz\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008c\n\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u00b3\n\27\f\27\16\27\u00b6\13"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\5\32\u00bf\n\32\3\32\6\32\u00c2"+
		"\n\32\r\32\16\32\u00c3\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\7"+
		"\35\u00cf\n\35\f\35\16\35\u00d2\13\35\3\36\3\36\3\36\7\36\u00d7\n\36\f"+
		"\36\16\36\u00da\13\36\3\36\3\36\6\36\u00de\n\36\r\36\16\36\u00df\5\36"+
		"\u00e2\n\36\3\37\6\37\u00e5\n\37\r\37\16\37\u00e6\3\37\3\37\3 \3 \7 \u00ed"+
		"\n \f \16 \u00f0\13 \5 \u00f2\n \3 \5 \u00f5\n \3 \3 \3 \3 \3\u00ee\2"+
		"!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\32\65\33\67\349\2;\35"+
		"=\36?\37\3\2\6\4\2hhvv\4\2C\\c|\3\2$$\4\2\13\13\"\"\u0109\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2"+
		"\2\5F\3\2\2\2\7O\3\2\2\2\tT\3\2\2\2\13V\3\2\2\2\rX\3\2\2\2\17Z\3\2\2\2"+
		"\21\\\3\2\2\2\23c\3\2\2\2\25q\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33\u0080"+
		"\3\2\2\2\35\u008b\3\2\2\2\37\u008d\3\2\2\2!\u0090\3\2\2\2#\u0095\3\2\2"+
		"\2%\u009d\3\2\2\2\'\u00a1\3\2\2\2)\u00a7\3\2\2\2+\u00ac\3\2\2\2-\u00af"+
		"\3\2\2\2/\u00b7\3\2\2\2\61\u00bb\3\2\2\2\63\u00be\3\2\2\2\65\u00c5\3\2"+
		"\2\2\67\u00c9\3\2\2\29\u00d0\3\2\2\2;\u00e1\3\2\2\2=\u00e4\3\2\2\2?\u00f1"+
		"\3\2\2\2AB\7\60\2\2BC\7f\2\2CD\7g\2\2DE\7h\2\2E\4\3\2\2\2FG\7\60\2\2G"+
		"H\7i\2\2HI\7n\2\2IJ\7q\2\2JK\7d\2\2KL\7c\2\2LM\7n\2\2MN\7u\2\2N\6\3\2"+
		"\2\2OP\7c\2\2PQ\7t\2\2QR\7i\2\2RS\7u\2\2S\b\3\2\2\2TU\7h\2\2U\n\3\2\2"+
		"\2VW\7k\2\2W\f\3\2\2\2XY\7<\2\2Y\16\3\2\2\2Z[\7.\2\2[\20\3\2\2\2\\]\7"+
		"n\2\2]^\7q\2\2^_\7e\2\2_`\7c\2\2`a\7n\2\2ab\7u\2\2b\22\3\2\2\2cd\7?\2"+
		"\2d\24\3\2\2\2ef\7c\2\2fg\7f\2\2gr\7f\2\2hi\7u\2\2ij\7w\2\2jr\7d\2\2k"+
		"l\7o\2\2lm\7w\2\2mr\7n\2\2no\7f\2\2op\7k\2\2pr\7x\2\2qe\3\2\2\2qh\3\2"+
		"\2\2qk\3\2\2\2qn\3\2\2\2r\26\3\2\2\2st\7n\2\2tz\7v\2\2uv\7i\2\2vz\7v\2"+
		"\2wx\7g\2\2xz\7s\2\2ys\3\2\2\2yu\3\2\2\2yw\3\2\2\2z\30\3\2\2\2{|\7k\2"+
		"\2|}\7v\2\2}~\7q\2\2~\177\7h\2\2\177\32\3\2\2\2\u0080\u0081\7i\2\2\u0081"+
		"\34\3\2\2\2\u0082\u0083\7n\2\2\u0083\u0084\7q\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u008c\7f\2\2\u0086\u0087\7u\2\2\u0087\u0088\7v\2\2\u0088\u0089\7q\2\2"+
		"\u0089\u008a\7t\2\2\u008a\u008c\7g\2\2\u008b\u0082\3\2\2\2\u008b\u0086"+
		"\3\2\2\2\u008c\36\3\2\2\2\u008d\u008e\7d\2\2\u008e\u008f\7t\2\2\u008f"+
		" \3\2\2\2\u0090\u0091\7d\2\2\u0091\u0092\7v\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\t\2\2\2\u0094\"\3\2\2\2\u0095\u0096\7e\2\2\u0096\u0097\7c\2\2\u0097"+
		"\u0098\7n\2\2\u0098\u0099\7n\2\2\u0099\u009a\3\2\2\2\u009a\u009b\5=\37"+
		"\2\u009b\u009c\5/\30\2\u009c$\3\2\2\2\u009d\u009e\7t\2\2\u009e\u009f\7"+
		"g\2\2\u009f\u00a0\7v\2\2\u00a0&\3\2\2\2\u00a1\u00a2\7r\2\2\u00a2\u00a3"+
		"\7t\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"(\3\2\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7n\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab*\3\2\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\5\63\32\2"+
		"\u00ae,\3\2\2\2\u00af\u00b4\5\61\31\2\u00b0\u00b3\5\61\31\2\u00b1\u00b3"+
		"\4\62;\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5.\3\2\2\2\u00b6\u00b4\3\2\2\2"+
		"\u00b7\u00b8\5-\27\2\u00b8\u00b9\7*\2\2\u00b9\u00ba\7+\2\2\u00ba\60\3"+
		"\2\2\2\u00bb\u00bc\t\3\2\2\u00bc\62\3\2\2\2\u00bd\u00bf\7/\2\2\u00be\u00bd"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00c2\4\62;\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\64\3\2\2\2\u00c5\u00c6\7)\2\2\u00c6\u00c7\13\2\2\2\u00c7\u00c8"+
		"\7)\2\2\u00c8\66\3\2\2\2\u00c9\u00ca\7$\2\2\u00ca\u00cb\59\35\2\u00cb"+
		"\u00cc\7$\2\2\u00cc8\3\2\2\2\u00cd\u00cf\n\4\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1:\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d3\u00d4\5\63\32\2\u00d4\u00d8\7\60\2\2\u00d5"+
		"\u00d7\5\63\32\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00e2\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dd\7\60\2\2\u00dc\u00de\5\63\32\2\u00dd\u00dc\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00d3\3\2\2\2\u00e1\u00db\3\2\2\2\u00e2<\3\2\2\2\u00e3\u00e5\t\5\2\2"+
		"\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\b\37\2\2\u00e9>\3\2\2\2\u00ea"+
		"\u00ee\7=\2\2\u00eb\u00ed\13\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2"+
		"\2\2\u00f3\u00f5\7\17\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\7\f\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\b "+
		"\2\2\u00f9@\3\2\2\2\22\2qy\u008b\u00b2\u00b4\u00be\u00c3\u00d0\u00d8\u00df"+
		"\u00e1\u00e6\u00ee\u00f1\u00f4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}