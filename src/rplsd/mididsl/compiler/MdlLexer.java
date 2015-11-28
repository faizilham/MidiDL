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
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		WS=17, ID=18, COMMENT=19, VAR=20, NUM=21, PLUS=22, MINUS=23, DOT=24, OCTAVE_SHIFT=25, 
		BASE_NOTE=26, STRING=27, UP=28, DOWN=29;
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
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WS", 
		"ID", "COMMENT", "VAR", "NUM", "PLUS", "MINUS", "DOT", "OCTAVE_SHIFT", 
		"BASE_NOTE", "STRING", "UP", "DOWN"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00c9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\22\6\22\u0084\n\22\r\22\16\22\u0085\3\22\3\22\3\23\3\23\6\23\u008c"+
		"\n\23\r\23\16\23\u008d\3\23\7\23\u0091\n\23\f\23\16\23\u0094\13\23\3\24"+
		"\3\24\3\24\3\24\6\24\u009a\n\24\r\24\16\24\u009b\3\24\3\24\3\25\3\25\6"+
		"\25\u00a2\n\25\r\25\16\25\u00a3\3\25\7\25\u00a7\n\25\f\25\16\25\u00aa"+
		"\13\25\3\26\6\26\u00ad\n\26\r\26\16\26\u00ae\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\6\32\u00b8\n\32\r\32\16\32\u00b9\3\33\3\33\3\34\3\34\6\34\u00c0"+
		"\n\34\r\34\16\34\u00c1\3\34\3\34\3\35\3\35\3\36\3\36\2\2\37\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\t\5"+
		"\2\13\13\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\f\f\3\2\62;\4\2citt\5"+
		"\2\f\f\17\17$$\u00d1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2"+
		"\13E\3\2\2\2\rG\3\2\2\2\17P\3\2\2\2\21W\3\2\2\2\23`\3\2\2\2\25b\3\2\2"+
		"\2\27d\3\2\2\2\31f\3\2\2\2\33p\3\2\2\2\35r\3\2\2\2\37t\3\2\2\2!\u0080"+
		"\3\2\2\2#\u0083\3\2\2\2%\u0089\3\2\2\2\'\u0095\3\2\2\2)\u009f\3\2\2\2"+
		"+\u00ac\3\2\2\2-\u00b0\3\2\2\2/\u00b2\3\2\2\2\61\u00b4\3\2\2\2\63\u00b7"+
		"\3\2\2\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00c5\3\2\2\2;\u00c7\3\2\2"+
		"\2=>\7q\2\2>\4\3\2\2\2?@\7r\2\2@\6\3\2\2\2AB\7\f\2\2B\b\3\2\2\2CD\7v\2"+
		"\2D\n\3\2\2\2EF\7x\2\2F\f\3\2\2\2GH\7%\2\2HI\7k\2\2IJ\7p\2\2JK\7e\2\2"+
		"KL\7n\2\2LM\7w\2\2MN\7f\2\2NO\7g\2\2O\16\3\2\2\2PQ\7%\2\2QR\7v\2\2RS\7"+
		"t\2\2ST\7c\2\2TU\7e\2\2UV\7m\2\2V\20\3\2\2\2WX\7%\2\2XY\7u\2\2YZ\7g\2"+
		"\2Z[\7e\2\2[\\\7v\2\2\\]\7k\2\2]^\7q\2\2^_\7p\2\2_\22\3\2\2\2`a\7<\2\2"+
		"a\24\3\2\2\2bc\7]\2\2c\26\3\2\2\2de\7_\2\2e\30\3\2\2\2fg\7%\2\2gh\7e\2"+
		"\2hi\7q\2\2ij\7p\2\2jk\7u\2\2kl\7v\2\2lm\7c\2\2mn\7p\2\2no\7v\2\2o\32"+
		"\3\2\2\2pq\7*\2\2q\34\3\2\2\2rs\7+\2\2s\36\3\2\2\2tu\7%\2\2uv\7r\2\2v"+
		"w\7g\2\2wx\7t\2\2xy\7e\2\2yz\7w\2\2z{\7u\2\2{|\7u\2\2|}\7k\2\2}~\7q\2"+
		"\2~\177\7p\2\2\177 \3\2\2\2\u0080\u0081\7n\2\2\u0081\"\3\2\2\2\u0082\u0084"+
		"\t\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\22\2\2\u0088$\3\2\2\2"+
		"\u0089\u008b\7B\2\2\u008a\u008c\t\3\2\2\u008b\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0092\3\2\2\2\u008f"+
		"\u0091\t\4\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093&\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096"+
		"\7\61\2\2\u0096\u0097\7\61\2\2\u0097\u0099\3\2\2\2\u0098\u009a\n\5\2\2"+
		"\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\24\2\2\u009e(\3\2\2\2\u009f"+
		"\u00a1\7&\2\2\u00a0\u00a2\t\3\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a8\3\2\2\2\u00a5"+
		"\u00a7\t\4\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9*\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad"+
		"\t\6\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af,\3\2\2\2\u00b0\u00b1\7-\2\2\u00b1.\3\2\2\2\u00b2"+
		"\u00b3\7/\2\2\u00b3\60\3\2\2\2\u00b4\u00b5\7\60\2\2\u00b5\62\3\2\2\2\u00b6"+
		"\u00b8\7)\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\t\7\2\2\u00bc\66"+
		"\3\2\2\2\u00bd\u00bf\7$\2\2\u00be\u00c0\n\b\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\7$\2\2\u00c48\3\2\2\2\u00c5\u00c6\7@\2\2\u00c6:\3\2\2"+
		"\2\u00c7\u00c8\7>\2\2\u00c8<\3\2\2\2\f\2\u0085\u008d\u0092\u009b\u00a3"+
		"\u00a8\u00ae\u00b9\u00c1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}