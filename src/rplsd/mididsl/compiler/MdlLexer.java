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
		PLUS=19, MINUS=20, OCTAVE_SHIFT=21, BASE_NOTE=22, STRING=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NUM", "WS", "ID", "PLUS", 
		"MINUS", "OCTAVE_SHIFT", "BASE_NOTE", "STRING"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\6\21]\n\21\r\21\16"+
		"\21^\3\22\6\22b\n\22\r\22\16\22c\3\22\3\22\3\23\3\23\6\23j\n\23\r\23\16"+
		"\23k\3\23\7\23o\n\23\f\23\16\23r\13\23\3\24\3\24\3\25\3\25\3\26\6\26y"+
		"\n\26\r\26\16\26z\3\27\3\27\3\30\3\30\6\30\u0081\n\30\r\30\16\30\u0082"+
		"\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\7\3\2\62;\5"+
		"\2\13\13\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17$$\u008b\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3"+
		"\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2"+
		"\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27L\3\2\2\2\31N\3"+
		"\2\2\2\33P\3\2\2\2\35R\3\2\2\2\37T\3\2\2\2!\\\3\2\2\2#a\3\2\2\2%g\3\2"+
		"\2\2\'s\3\2\2\2)u\3\2\2\2+x\3\2\2\2-|\3\2\2\2/~\3\2\2\2\61\62\7q\2\2\62"+
		"\4\3\2\2\2\63\64\7r\2\2\64\6\3\2\2\2\65\66\7\f\2\2\66\b\3\2\2\2\678\7"+
		"v\2\28\n\3\2\2\29:\7x\2\2:\f\3\2\2\2;<\7]\2\2<\16\3\2\2\2=>\7>\2\2>\20"+
		"\3\2\2\2?@\7_\2\2@\22\3\2\2\2AB\7@\2\2B\24\3\2\2\2CD\7%\2\2DE\7e\2\2E"+
		"F\7j\2\2FG\7c\2\2GH\7p\2\2HI\7p\2\2IJ\7g\2\2JK\7n\2\2K\26\3\2\2\2LM\7"+
		"(\2\2M\30\3\2\2\2NO\7*\2\2O\32\3\2\2\2PQ\7+\2\2Q\34\3\2\2\2RS\7n\2\2S"+
		"\36\3\2\2\2TU\7%\2\2UV\7i\2\2VW\7t\2\2WX\7q\2\2XY\7w\2\2YZ\7r\2\2Z \3"+
		"\2\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\"\3\2\2\2"+
		"`b\t\3\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\b\22\2"+
		"\2f$\3\2\2\2gi\7B\2\2hj\t\4\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2"+
		"\2lp\3\2\2\2mo\t\5\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q&\3\2\2"+
		"\2rp\3\2\2\2st\7-\2\2t(\3\2\2\2uv\7/\2\2v*\3\2\2\2wy\7)\2\2xw\3\2\2\2"+
		"yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{,\3\2\2\2|}\4ci\2}.\3\2\2\2~\u0080\7$\2"+
		"\2\177\u0081\n\6\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7$\2\2\u0085"+
		"\60\3\2\2\2\t\2^ckpz\u0082\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}