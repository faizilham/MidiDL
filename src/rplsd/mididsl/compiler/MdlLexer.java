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
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, NUM=15, WS=16, ID=17, PLUS=18, 
		MINUS=19, DOT=20, OCTAVE_SHIFT=21, BASE_NOTE=22, STRING=23, UP=24, DOWN=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "NUM", "WS", "ID", "PLUS", "MINUS", 
		"DOT", "OCTAVE_SHIFT", "BASE_NOTE", "STRING", "UP", "DOWN"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\6\20h\n\20\r\20\16\20i\3\21\6\21m\n\21\r\21\16\21"+
		"n\3\21\3\21\3\22\3\22\6\22u\n\22\r\22\16\22v\3\22\7\22z\n\22\f\22\16\22"+
		"}\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26\u0086\n\26\r\26\16\26"+
		"\u0087\3\27\3\27\3\30\3\30\6\30\u008e\n\30\r\30\16\30\u008f\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\3\2\b\3\2\62;\5\2\13\13\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\4\2"+
		"citt\5\2\f\f\17\17$$\u009c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67"+
		"\3\2\2\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17H\3\2\2\2\21Q"+
		"\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27^\3\2\2\2\31`\3\2\2\2\33b\3\2\2\2\35"+
		"d\3\2\2\2\37g\3\2\2\2!l\3\2\2\2#r\3\2\2\2%~\3\2\2\2\'\u0080\3\2\2\2)\u0082"+
		"\3\2\2\2+\u0085\3\2\2\2-\u0089\3\2\2\2/\u008b\3\2\2\2\61\u0093\3\2\2\2"+
		"\63\u0095\3\2\2\2\65\66\7q\2\2\66\4\3\2\2\2\678\7r\2\28\6\3\2\2\29:\7"+
		"\f\2\2:\b\3\2\2\2;<\7v\2\2<\n\3\2\2\2=>\7x\2\2>\f\3\2\2\2?@\7%\2\2@A\7"+
		"k\2\2AB\7p\2\2BC\7e\2\2CD\7n\2\2DE\7w\2\2EF\7f\2\2FG\7g\2\2G\16\3\2\2"+
		"\2HI\7%\2\2IJ\7u\2\2JK\7g\2\2KL\7e\2\2LM\7v\2\2MN\7k\2\2NO\7q\2\2OP\7"+
		"p\2\2P\20\3\2\2\2QR\7]\2\2R\22\3\2\2\2ST\7_\2\2T\24\3\2\2\2UV\7%\2\2V"+
		"W\7e\2\2WX\7j\2\2XY\7c\2\2YZ\7p\2\2Z[\7p\2\2[\\\7g\2\2\\]\7n\2\2]\26\3"+
		"\2\2\2^_\7(\2\2_\30\3\2\2\2`a\7*\2\2a\32\3\2\2\2bc\7+\2\2c\34\3\2\2\2"+
		"de\7n\2\2e\36\3\2\2\2fh\t\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2j \3\2\2\2km\t\3\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2"+
		"\2pq\b\21\2\2q\"\3\2\2\2rt\7B\2\2su\t\4\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2"+
		"\2\2vw\3\2\2\2w{\3\2\2\2xz\t\5\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2"+
		"\2\2|$\3\2\2\2}{\3\2\2\2~\177\7-\2\2\177&\3\2\2\2\u0080\u0081\7/\2\2\u0081"+
		"(\3\2\2\2\u0082\u0083\7\60\2\2\u0083*\3\2\2\2\u0084\u0086\7)\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088,\3\2\2\2\u0089\u008a\t\6\2\2\u008a.\3\2\2\2\u008b\u008d\7$"+
		"\2\2\u008c\u008e\n\7\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7$"+
		"\2\2\u0092\60\3\2\2\2\u0093\u0094\7@\2\2\u0094\62\3\2\2\2\u0095\u0096"+
		"\7>\2\2\u0096\64\3\2\2\2\t\2inv{\u0087\u008f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}