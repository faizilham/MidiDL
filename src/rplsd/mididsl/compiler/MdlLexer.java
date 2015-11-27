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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, NUM=14, WS=15, ID=16, PLUS=17, MINUS=18, 
		DOT=19, OCTAVE_SHIFT=20, BASE_NOTE=21, STRING=22, UP=23, DOWN=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "NUM", "WS", "ID", "PLUS", "MINUS", "DOT", 
		"OCTAVE_SHIFT", "BASE_NOTE", "STRING", "UP", "DOWN"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u008a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17[\n\17\r\17\16\17\\\3\20\6\20`\n"+
		"\20\r\20\16\20a\3\20\3\20\3\21\3\21\6\21h\n\21\r\21\16\21i\3\21\7\21m"+
		"\n\21\f\21\16\21p\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25y\n\25"+
		"\r\25\16\25z\3\26\3\26\3\27\3\27\6\27\u0081\n\27\r\27\16\27\u0082\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\3\2\b\3\2\62;\5\2\13\13\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\4\2"+
		"citt\5\2\f\f\17\17$$\u008f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67"+
		"\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23"+
		"J\3\2\2\2\25L\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33R\3\2\2\2\35Z\3\2\2\2"+
		"\37_\3\2\2\2!e\3\2\2\2#q\3\2\2\2%s\3\2\2\2\'u\3\2\2\2)x\3\2\2\2+|\3\2"+
		"\2\2-~\3\2\2\2/\u0086\3\2\2\2\61\u0088\3\2\2\2\63\64\7q\2\2\64\4\3\2\2"+
		"\2\65\66\7r\2\2\66\6\3\2\2\2\678\7\f\2\28\b\3\2\2\29:\7v\2\2:\n\3\2\2"+
		"\2;<\7x\2\2<\f\3\2\2\2=>\7]\2\2>\16\3\2\2\2?@\7_\2\2@\20\3\2\2\2AB\7%"+
		"\2\2BC\7e\2\2CD\7j\2\2DE\7c\2\2EF\7p\2\2FG\7p\2\2GH\7g\2\2HI\7n\2\2I\22"+
		"\3\2\2\2JK\7(\2\2K\24\3\2\2\2LM\7*\2\2M\26\3\2\2\2NO\7+\2\2O\30\3\2\2"+
		"\2PQ\7n\2\2Q\32\3\2\2\2RS\7%\2\2ST\7i\2\2TU\7t\2\2UV\7q\2\2VW\7w\2\2W"+
		"X\7r\2\2X\34\3\2\2\2Y[\t\2\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2"+
		"\2\2]\36\3\2\2\2^`\t\3\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3"+
		"\2\2\2cd\b\20\2\2d \3\2\2\2eg\7B\2\2fh\t\4\2\2gf\3\2\2\2hi\3\2\2\2ig\3"+
		"\2\2\2ij\3\2\2\2jn\3\2\2\2km\t\5\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3"+
		"\2\2\2o\"\3\2\2\2pn\3\2\2\2qr\7-\2\2r$\3\2\2\2st\7/\2\2t&\3\2\2\2uv\7"+
		"\60\2\2v(\3\2\2\2wy\7)\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{*\3"+
		"\2\2\2|}\t\6\2\2},\3\2\2\2~\u0080\7$\2\2\177\u0081\n\7\2\2\u0080\177\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\7$\2\2\u0085.\3\2\2\2\u0086\u0087\7@\2\2\u0087"+
		"\60\3\2\2\2\u0088\u0089\7>\2\2\u0089\62\3\2\2\2\t\2\\ainz\u0082\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}