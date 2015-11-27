// Generated from Mdl.g4 by ANTLR 4.4
package rplsd.mididsl.compiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MdlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, NUM=16, WS=17, ID=18, 
		COMMENT=19, PLUS=20, MINUS=21, DOT=22, OCTAVE_SHIFT=23, BASE_NOTE=24, 
		STRING=25, UP=26, DOWN=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'"
	};
	public static final String[] ruleNames = {
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NUM", "WS", "ID", "COMMENT", 
		"PLUS", "MINUS", "DOT", "OCTAVE_SHIFT", "BASE_NOTE", "STRING", "UP", "DOWN"
	};


	public MdlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mdl.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\6\21v\n\21\r\21\16\21w\3\22\6\22{\n\22\r\22\16\22|\3\22"+
		"\3\22\3\23\3\23\6\23\u0083\n\23\r\23\16\23\u0084\3\23\7\23\u0088\n\23"+
		"\f\23\16\23\u008b\13\23\3\24\3\24\3\24\3\24\6\24\u0091\n\24\r\24\16\24"+
		"\u0092\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\6\30\u009e\n\30\r"+
		"\30\16\30\u009f\3\31\3\31\3\32\3\32\6\32\u00a6\n\32\r\32\16\32\u00a7\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\35\3\2\t\3\2\62;\5\2\13\13\17\17\"\"\5\2C\\"+
		"aac|\6\2\62;C\\aac|\3\2\f\f\4\2citt\5\2\f\f\17\17$$\u00b5\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2"+
		"\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17L\3\2\2\2\21S\3\2\2\2\23\\\3"+
		"\2\2\2\25^\3\2\2\2\27`\3\2\2\2\31b\3\2\2\2\33d\3\2\2\2\35f\3\2\2\2\37"+
		"r\3\2\2\2!u\3\2\2\2#z\3\2\2\2%\u0080\3\2\2\2\'\u008c\3\2\2\2)\u0096\3"+
		"\2\2\2+\u0098\3\2\2\2-\u009a\3\2\2\2/\u009d\3\2\2\2\61\u00a1\3\2\2\2\63"+
		"\u00a3\3\2\2\2\65\u00ab\3\2\2\2\67\u00ad\3\2\2\29:\7q\2\2:\4\3\2\2\2;"+
		"<\7r\2\2<\6\3\2\2\2=>\7\f\2\2>\b\3\2\2\2?@\7v\2\2@\n\3\2\2\2AB\7x\2\2"+
		"B\f\3\2\2\2CD\7%\2\2DE\7k\2\2EF\7p\2\2FG\7e\2\2GH\7n\2\2HI\7w\2\2IJ\7"+
		"f\2\2JK\7g\2\2K\16\3\2\2\2LM\7%\2\2MN\7v\2\2NO\7t\2\2OP\7c\2\2PQ\7e\2"+
		"\2QR\7m\2\2R\20\3\2\2\2ST\7%\2\2TU\7u\2\2UV\7g\2\2VW\7e\2\2WX\7v\2\2X"+
		"Y\7k\2\2YZ\7q\2\2Z[\7p\2\2[\22\3\2\2\2\\]\7]\2\2]\24\3\2\2\2^_\7_\2\2"+
		"_\26\3\2\2\2`a\7(\2\2a\30\3\2\2\2bc\7*\2\2c\32\3\2\2\2de\7+\2\2e\34\3"+
		"\2\2\2fg\7%\2\2gh\7r\2\2hi\7g\2\2ij\7t\2\2jk\7e\2\2kl\7w\2\2lm\7u\2\2"+
		"mn\7u\2\2no\7k\2\2op\7q\2\2pq\7p\2\2q\36\3\2\2\2rs\7n\2\2s \3\2\2\2tv"+
		"\t\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\"\3\2\2\2y{\t\3\2\2"+
		"zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\b\22\2\2\177$"+
		"\3\2\2\2\u0080\u0082\7B\2\2\u0081\u0083\t\4\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0089\3\2"+
		"\2\2\u0086\u0088\t\5\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a&\3\2\2\2\u008b\u0089\3\2\2\2"+
		"\u008c\u008d\7\61\2\2\u008d\u008e\7\61\2\2\u008e\u0090\3\2\2\2\u008f\u0091"+
		"\n\6\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\24\2\2\u0095(\3\2\2\2"+
		"\u0096\u0097\7-\2\2\u0097*\3\2\2\2\u0098\u0099\7/\2\2\u0099,\3\2\2\2\u009a"+
		"\u009b\7\60\2\2\u009b.\3\2\2\2\u009c\u009e\7)\2\2\u009d\u009c\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\60"+
		"\3\2\2\2\u00a1\u00a2\t\7\2\2\u00a2\62\3\2\2\2\u00a3\u00a5\7$\2\2\u00a4"+
		"\u00a6\n\b\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7$\2\2\u00aa"+
		"\64\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae"+
		"8\3\2\2\2\n\2w|\u0084\u0089\u0092\u009f\u00a7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}