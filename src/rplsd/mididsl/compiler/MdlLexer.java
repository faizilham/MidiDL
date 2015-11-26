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
		PLUS=19, MINUS=20, OCTAVE_SHIFT=21, BASE_NOTE=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
	};
	public static final String[] ruleNames = {
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NUM", "WS", "ID", "PLUS", 
		"MINUS", "OCTAVE_SHIFT", "BASE_NOTE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\6\21Y\n\21\r\21\16\21Z\3\22\6\22^\n\22\r\22\16\22_\3\22"+
		"\3\22\3\23\3\23\6\23f\n\23\r\23\16\23g\3\23\7\23k\n\23\f\23\16\23n\13"+
		"\23\3\24\3\24\3\25\3\25\3\26\6\26u\n\26\r\26\16\26v\3\27\3\27\2\2\30\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6\3\2\62;\5\2\13\13\17\17\"\"\5\2"+
		"C\\aac|\6\2\62;C\\aac|~\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2"+
		"\2\2\r=\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27M\3"+
		"\2\2\2\31O\3\2\2\2\33Q\3\2\2\2\35S\3\2\2\2\37U\3\2\2\2!X\3\2\2\2#]\3\2"+
		"\2\2%c\3\2\2\2\'o\3\2\2\2)q\3\2\2\2+t\3\2\2\2-x\3\2\2\2/\60\7q\2\2\60"+
		"\4\3\2\2\2\61\62\7i\2\2\62\63\7t\2\2\63\64\7q\2\2\64\65\7w\2\2\65\66\7"+
		"r\2\2\66\6\3\2\2\2\678\7r\2\28\b\3\2\2\29:\7\f\2\2:\n\3\2\2\2;<\7v\2\2"+
		"<\f\3\2\2\2=>\7e\2\2>?\7j\2\2?@\7c\2\2@A\7p\2\2AB\7p\2\2BC\7g\2\2CD\7"+
		"n\2\2D\16\3\2\2\2EF\7x\2\2F\20\3\2\2\2GH\7]\2\2H\22\3\2\2\2IJ\7>\2\2J"+
		"\24\3\2\2\2KL\7_\2\2L\26\3\2\2\2MN\7@\2\2N\30\3\2\2\2OP\7(\2\2P\32\3\2"+
		"\2\2QR\7*\2\2R\34\3\2\2\2ST\7+\2\2T\36\3\2\2\2UV\7n\2\2V \3\2\2\2WY\t"+
		"\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\"\3\2\2\2\\^\t\3\2\2]"+
		"\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\b\22\2\2b$\3\2\2"+
		"\2ce\7B\2\2df\t\4\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hl\3\2\2"+
		"\2ik\t\5\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m&\3\2\2\2nl\3\2\2"+
		"\2op\7-\2\2p(\3\2\2\2qr\7/\2\2r*\3\2\2\2su\7)\2\2ts\3\2\2\2uv\3\2\2\2"+
		"vt\3\2\2\2vw\3\2\2\2w,\3\2\2\2xy\4ci\2y.\3\2\2\2\b\2Z_glv\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}