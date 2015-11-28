// Generated from Mdl.g4 by ANTLR 4.4
package rplsd.mididsl.compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MdlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		WS=17, ID=18, COMMENT=19, VAR=20, NUM=21, PLUS=22, MINUS=23, DOT=24, OCTAVE_SHIFT=25, 
		BASE_NOTE=26, STRING=27, UP=28, DOWN=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'o'", "'p'", "'\n'", "'t'", "'v'", "'#include'", "'#track'", 
		"'#section'", "':'", "'['", "']'", "'#constant'", "'('", "')'", "'#percussion'", 
		"'l'", "WS", "ID", "COMMENT", "VAR", "NUM", "'+'", "'-'", "'.'", "OCTAVE_SHIFT", 
		"BASE_NOTE", "STRING", "'>'", "'<'"
	};
	public static final int
		RULE_midi = 0, RULE_newline = 1, RULE_val = 2, RULE_statements = 3, RULE_statement = 4, 
		RULE_constant_declaration = 5, RULE_track_declaration = 6, RULE_percussion_declaration = 7, 
		RULE_section_declaration = 8, RULE_track = 9, RULE_include = 10, RULE_command = 11, 
		RULE_note = 12, RULE_pitch_shift_sign = 13, RULE_length_shift_sign = 14, 
		RULE_modifiers = 15, RULE_tempo = 16, RULE_length = 17, RULE_shift_sign = 18, 
		RULE_octave = 19, RULE_volume = 20, RULE_pitch_transpose = 21, RULE_playback = 22, 
		RULE_section = 23, RULE_harmony = 24, RULE_loop = 25;
	public static final String[] ruleNames = {
		"midi", "newline", "val", "statements", "statement", "constant_declaration", 
		"track_declaration", "percussion_declaration", "section_declaration", 
		"track", "include", "command", "note", "pitch_shift_sign", "length_shift_sign", 
		"modifiers", "tempo", "length", "shift_sign", "octave", "volume", "pitch_transpose", 
		"playback", "section", "harmony", "loop"
	};

	@Override
	public String getGrammarFileName() { return "Mdl.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MdlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MidiContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public MidiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitMidi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MidiContext midi() throws RecognitionException {
		MidiContext _localctx = new MidiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_midi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); statements();
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

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(MdlParser.COMMENT, 0); }
		public TerminalNode EOF() { return getToken(MdlParser.EOF, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_newline);
		try {
			int _alt;
			setState(61);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(54); match(T__13);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(57); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); match(EOF);
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(60); match(COMMENT);
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MdlParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(MdlParser.NUM, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==NUM) ) {
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

	public static class StatementsContext extends ParserRuleContext {
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65); newline();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__4) | (1L << T__1) | (1L << ID))) != 0)) {
				{
				{
				setState(71); statement();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Percussion_declarationContext percussion_declaration() {
			return getRuleContext(Percussion_declarationContext.class,0);
		}
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public TrackContext track() {
			return getRuleContext(TrackContext.class,0);
		}
		public Track_declarationContext track_declaration() {
			return getRuleContext(Track_declarationContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public Section_declarationContext section_declaration() {
			return getRuleContext(Section_declarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(77); constant_declaration();
				}
				break;
			case T__9:
				{
				setState(78); track_declaration();
				}
				break;
			case T__1:
				{
				setState(79); percussion_declaration();
				}
				break;
			case T__10:
				{
				setState(80); include();
				}
				break;
			case T__8:
				{
				setState(81); section_declaration();
				}
				break;
			case ID:
				{
				setState(82); track();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(85); newline();
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

	public static class Constant_declarationContext extends ParserRuleContext {
		public Token name;
		public ValContext value;
		public TerminalNode VAR() { return getToken(MdlParser.VAR, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(T__4);
			setState(88); ((Constant_declarationContext)_localctx).name = match(VAR);
			setState(89); ((Constant_declarationContext)_localctx).value = val();
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

	public static class Track_declarationContext extends ParserRuleContext {
		public Token name;
		public ValContext instrument;
		public TerminalNode ID() { return getToken(MdlParser.ID, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public Track_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_track_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitTrack_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Track_declarationContext track_declaration() throws RecognitionException {
		Track_declarationContext _localctx = new Track_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_track_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(T__9);
			setState(92); ((Track_declarationContext)_localctx).name = match(ID);
			setState(93); ((Track_declarationContext)_localctx).instrument = val();
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

	public static class Percussion_declarationContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(MdlParser.ID, 0); }
		public Percussion_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percussion_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitPercussion_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Percussion_declarationContext percussion_declaration() throws RecognitionException {
		Percussion_declarationContext _localctx = new Percussion_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_percussion_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(T__1);
			setState(96); ((Percussion_declarationContext)_localctx).name = match(ID);
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

	public static class Section_declarationContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(MdlParser.ID, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public Section_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitSection_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Section_declarationContext section_declaration() throws RecognitionException {
		Section_declarationContext _localctx = new Section_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_section_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(T__8);
			setState(99); ((Section_declarationContext)_localctx).name = match(ID);
			setState(100); match(T__7);
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101); command();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << T__11) | (1L << T__6) | (1L << T__3) | (1L << T__0) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
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

	public static class TrackContext extends ParserRuleContext {
		public Token track_name;
		public TerminalNode ID() { return getToken(MdlParser.ID, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TrackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_track; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitTrack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrackContext track() throws RecognitionException {
		TrackContext _localctx = new TrackContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_track);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); ((TrackContext)_localctx).track_name = match(ID);
			setState(107); match(T__7);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108); command();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << T__11) | (1L << T__6) | (1L << T__3) | (1L << T__0) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
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

	public static class IncludeContext extends ParserRuleContext {
		public Token filename;
		public TerminalNode STRING() { return getToken(MdlParser.STRING, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(T__10);
			setState(114); ((IncludeContext)_localctx).filename = match(STRING);
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

	public static class CommandContext extends ParserRuleContext {
		public PlaybackContext playback() {
			return getRuleContext(PlaybackContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_command);
		try {
			setState(119);
			switch (_input.LA(1)) {
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); note();
				}
				break;
			case T__15:
			case T__14:
			case T__12:
			case T__11:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); modifiers();
				}
				break;
			case T__6:
			case T__3:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(118); playback();
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

	public static class NoteContext extends ParserRuleContext {
		public Token base;
		public Pitch_shift_signContext pitch_shift;
		public Token octave_shift;
		public ValContext note_length;
		public Length_shift_signContext length_shift;
		public TerminalNode BASE_NOTE() { return getToken(MdlParser.BASE_NOTE, 0); }
		public Length_shift_signContext length_shift_sign() {
			return getRuleContext(Length_shift_signContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode OCTAVE_SHIFT() { return getToken(MdlParser.OCTAVE_SHIFT, 0); }
		public Pitch_shift_signContext pitch_shift_sign() {
			return getRuleContext(Pitch_shift_signContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); ((NoteContext)_localctx).base = match(BASE_NOTE);
			setState(123);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(122); ((NoteContext)_localctx).pitch_shift = pitch_shift_sign();
				}
			}

			setState(126);
			_la = _input.LA(1);
			if (_la==OCTAVE_SHIFT) {
				{
				setState(125); ((NoteContext)_localctx).octave_shift = match(OCTAVE_SHIFT);
				}
			}

			setState(129);
			_la = _input.LA(1);
			if (_la==VAR || _la==NUM) {
				{
				setState(128); ((NoteContext)_localctx).note_length = val();
				}
			}

			setState(132);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(131); ((NoteContext)_localctx).length_shift = length_shift_sign();
				}
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

	public static class Pitch_shift_signContext extends ParserRuleContext {
		public TerminalNode MINUS(int i) {
			return getToken(MdlParser.MINUS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MdlParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(MdlParser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MdlParser.PLUS, i);
		}
		public Pitch_shift_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch_shift_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitPitch_shift_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pitch_shift_signContext pitch_shift_sign() throws RecognitionException {
		Pitch_shift_signContext _localctx = new Pitch_shift_signContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pitch_shift_sign);
		int _la;
		try {
			setState(144);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134); match(PLUS);
					}
					}
					setState(137); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS );
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(139); match(MINUS);
					}
					}
					setState(142); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS );
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

	public static class Length_shift_signContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(MdlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MdlParser.DOT, i);
		}
		public Length_shift_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length_shift_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitLength_shift_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Length_shift_signContext length_shift_sign() throws RecognitionException {
		Length_shift_signContext _localctx = new Length_shift_signContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_length_shift_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146); match(DOT);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
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

	public static class ModifiersContext extends ParserRuleContext {
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public OctaveContext octave() {
			return getRuleContext(OctaveContext.class,0);
		}
		public VolumeContext volume() {
			return getRuleContext(VolumeContext.class,0);
		}
		public Pitch_transposeContext pitch_transpose() {
			return getRuleContext(Pitch_transposeContext.class,0);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_modifiers);
		try {
			setState(156);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(151); tempo();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(152); length();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(153); octave();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(154); volume();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(155); pitch_transpose();
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

	public static class TempoContext extends ParserRuleContext {
		public ValContext value;
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitTempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(T__12);
			setState(159); ((TempoContext)_localctx).value = val();
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

	public static class LengthContext extends ParserRuleContext {
		public ValContext value;
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(T__0);
			setState(162); ((LengthContext)_localctx).value = val();
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

	public static class Shift_signContext extends ParserRuleContext {
		public TerminalNode UP() { return getToken(MdlParser.UP, 0); }
		public TerminalNode DOWN() { return getToken(MdlParser.DOWN, 0); }
		public Shift_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitShift_sign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_signContext shift_sign() throws RecognitionException {
		Shift_signContext _localctx = new Shift_signContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_shift_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==UP || _la==DOWN) ) {
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

	public static class OctaveContext extends ParserRuleContext {
		public Shift_signContext shift;
		public ValContext value;
		public Shift_signContext shift_sign() {
			return getRuleContext(Shift_signContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public OctaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octave; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitOctave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctaveContext octave() throws RecognitionException {
		OctaveContext _localctx = new OctaveContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_octave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(T__15);
			setState(172);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(167); ((OctaveContext)_localctx).shift = shift_sign();
				setState(169);
				_la = _input.LA(1);
				if (_la==VAR || _la==NUM) {
					{
					setState(168); ((OctaveContext)_localctx).value = val();
					}
				}

				}
				break;
			case VAR:
			case NUM:
				{
				setState(171); ((OctaveContext)_localctx).value = val();
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

	public static class VolumeContext extends ParserRuleContext {
		public Shift_signContext shift;
		public ValContext value;
		public Shift_signContext shift_sign() {
			return getRuleContext(Shift_signContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public VolumeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_volume; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitVolume(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VolumeContext volume() throws RecognitionException {
		VolumeContext _localctx = new VolumeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_volume);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(T__11);
			setState(180);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(175); ((VolumeContext)_localctx).shift = shift_sign();
				setState(177);
				_la = _input.LA(1);
				if (_la==VAR || _la==NUM) {
					{
					setState(176); ((VolumeContext)_localctx).value = val();
					}
				}

				}
				break;
			case VAR:
			case NUM:
				{
				setState(179); ((VolumeContext)_localctx).value = val();
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

	public static class Pitch_transposeContext extends ParserRuleContext {
		public Shift_signContext shift;
		public ValContext value;
		public Token negative;
		public Shift_signContext shift_sign() {
			return getRuleContext(Shift_signContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(MdlParser.MINUS, 0); }
		public Pitch_transposeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch_transpose; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitPitch_transpose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pitch_transposeContext pitch_transpose() throws RecognitionException {
		Pitch_transposeContext _localctx = new Pitch_transposeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pitch_transpose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(T__14);
			setState(191);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(183); ((Pitch_transposeContext)_localctx).shift = shift_sign();
				setState(185);
				_la = _input.LA(1);
				if (_la==VAR || _la==NUM) {
					{
					setState(184); ((Pitch_transposeContext)_localctx).value = val();
					}
				}

				}
				break;
			case VAR:
			case NUM:
			case MINUS:
				{
				{
				setState(188);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(187); ((Pitch_transposeContext)_localctx).negative = match(MINUS);
					}
				}

				setState(190); ((Pitch_transposeContext)_localctx).value = val();
				}
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

	public static class PlaybackContext extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public HarmonyContext harmony() {
			return getRuleContext(HarmonyContext.class,0);
		}
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public PlaybackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playback; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitPlayback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaybackContext playback() throws RecognitionException {
		PlaybackContext _localctx = new PlaybackContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_playback);
		try {
			setState(196);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); harmony();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(194); loop();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(195); section();
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

	public static class SectionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(MdlParser.ID, 0); }
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); ((SectionContext)_localctx).name = match(ID);
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

	public static class HarmonyContext extends ParserRuleContext {
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public HarmonyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_harmony; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitHarmony(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HarmonyContext harmony() throws RecognitionException {
		HarmonyContext _localctx = new HarmonyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_harmony);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(T__3);
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201); note();
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BASE_NOTE );
			setState(206); match(T__2);
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

	public static class LoopContext extends ParserRuleContext {
		public ValContext value;
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(T__6);
			setState(210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209); command();
				}
				}
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << T__11) | (1L << T__6) | (1L << T__3) | (1L << T__0) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
			setState(214); match(T__5);
			setState(215); ((LoopContext)_localctx).value = val();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u00dc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\6\3:\n\3\r\3\16\3;\3\3\3\3\5\3@\n\3\3"+
		"\4\3\4\3\5\7\5E\n\5\f\5\16\5H\13\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6V\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\6\ni\n\n\r\n\16\nj\3\13\3\13\3\13\6\13p\n\13"+
		"\r\13\16\13q\3\f\3\f\3\f\3\r\3\r\3\r\5\rz\n\r\3\16\3\16\5\16~\n\16\3\16"+
		"\5\16\u0081\n\16\3\16\5\16\u0084\n\16\3\16\5\16\u0087\n\16\3\17\6\17\u008a"+
		"\n\17\r\17\16\17\u008b\3\17\6\17\u008f\n\17\r\17\16\17\u0090\5\17\u0093"+
		"\n\17\3\20\6\20\u0096\n\20\r\20\16\20\u0097\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u009f\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\5\25\u00ac\n\25\3\25\5\25\u00af\n\25\3\26\3\26\3\26\5\26\u00b4\n\26\3"+
		"\26\5\26\u00b7\n\26\3\27\3\27\3\27\5\27\u00bc\n\27\3\27\5\27\u00bf\n\27"+
		"\3\27\5\27\u00c2\n\27\3\30\3\30\3\30\5\30\u00c7\n\30\3\31\3\31\3\32\3"+
		"\32\6\32\u00cd\n\32\r\32\16\32\u00ce\3\32\3\32\3\33\3\33\6\33\u00d5\n"+
		"\33\r\33\16\33\u00d6\3\33\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\2\4\3\2\26\27\3\2\36\37\u00e6\2\66\3"+
		"\2\2\2\4?\3\2\2\2\6A\3\2\2\2\bF\3\2\2\2\nU\3\2\2\2\fY\3\2\2\2\16]\3\2"+
		"\2\2\20a\3\2\2\2\22d\3\2\2\2\24l\3\2\2\2\26s\3\2\2\2\30y\3\2\2\2\32{\3"+
		"\2\2\2\34\u0092\3\2\2\2\36\u0095\3\2\2\2 \u009e\3\2\2\2\"\u00a0\3\2\2"+
		"\2$\u00a3\3\2\2\2&\u00a6\3\2\2\2(\u00a8\3\2\2\2*\u00b0\3\2\2\2,\u00b8"+
		"\3\2\2\2.\u00c6\3\2\2\2\60\u00c8\3\2\2\2\62\u00ca\3\2\2\2\64\u00d2\3\2"+
		"\2\2\66\67\5\b\5\2\67\3\3\2\2\28:\7\5\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2"+
		"\2;<\3\2\2\2<@\3\2\2\2=@\7\2\2\3>@\7\25\2\2?9\3\2\2\2?=\3\2\2\2?>\3\2"+
		"\2\2@\5\3\2\2\2AB\t\2\2\2B\7\3\2\2\2CE\5\4\3\2DC\3\2\2\2EH\3\2\2\2FD\3"+
		"\2\2\2FG\3\2\2\2GL\3\2\2\2HF\3\2\2\2IK\5\n\6\2JI\3\2\2\2KN\3\2\2\2LJ\3"+
		"\2\2\2LM\3\2\2\2M\t\3\2\2\2NL\3\2\2\2OV\5\f\7\2PV\5\16\b\2QV\5\20\t\2"+
		"RV\5\26\f\2SV\5\22\n\2TV\5\24\13\2UO\3\2\2\2UP\3\2\2\2UQ\3\2\2\2UR\3\2"+
		"\2\2US\3\2\2\2UT\3\2\2\2VW\3\2\2\2WX\5\4\3\2X\13\3\2\2\2YZ\7\16\2\2Z["+
		"\7\26\2\2[\\\5\6\4\2\\\r\3\2\2\2]^\7\t\2\2^_\7\24\2\2_`\5\6\4\2`\17\3"+
		"\2\2\2ab\7\21\2\2bc\7\24\2\2c\21\3\2\2\2de\7\n\2\2ef\7\24\2\2fh\7\13\2"+
		"\2gi\5\30\r\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\23\3\2\2\2lm\7"+
		"\24\2\2mo\7\13\2\2np\5\30\r\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2"+
		"r\25\3\2\2\2st\7\b\2\2tu\7\35\2\2u\27\3\2\2\2vz\5\32\16\2wz\5 \21\2xz"+
		"\5.\30\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\31\3\2\2\2{}\7\34\2\2|~\5\34\17"+
		"\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081\7\33\2\2\u0080\177\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\5\6\4\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0087\5\36"+
		"\20\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\33\3\2\2\2\u0088\u008a"+
		"\7\30\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u0093\3\2\2\2\u008d\u008f\7\31\2\2\u008e\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u008e\3\2\2\2\u0093\35\3\2\2"+
		"\2\u0094\u0096\7\32\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\37\3\2\2\2\u0099\u009f\5\"\22"+
		"\2\u009a\u009f\5$\23\2\u009b\u009f\5(\25\2\u009c\u009f\5*\26\2\u009d\u009f"+
		"\5,\27\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f!\3\2\2\2\u00a0\u00a1\7\6\2\2"+
		"\u00a1\u00a2\5\6\4\2\u00a2#\3\2\2\2\u00a3\u00a4\7\22\2\2\u00a4\u00a5\5"+
		"\6\4\2\u00a5%\3\2\2\2\u00a6\u00a7\t\3\2\2\u00a7\'\3\2\2\2\u00a8\u00ae"+
		"\7\3\2\2\u00a9\u00ab\5&\24\2\u00aa\u00ac\5\6\4\2\u00ab\u00aa\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00af\5\6\4\2\u00ae\u00a9\3\2"+
		"\2\2\u00ae\u00ad\3\2\2\2\u00af)\3\2\2\2\u00b0\u00b6\7\7\2\2\u00b1\u00b3"+
		"\5&\24\2\u00b2\u00b4\5\6\4\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b7\5\6\4\2\u00b6\u00b1\3\2\2\2\u00b6\u00b5\3\2"+
		"\2\2\u00b7+\3\2\2\2\u00b8\u00c1\7\4\2\2\u00b9\u00bb\5&\24\2\u00ba\u00bc"+
		"\5\6\4\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c2\3\2\2\2\u00bd"+
		"\u00bf\7\31\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\u00c2\5\6\4\2\u00c1\u00b9\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2"+
		"-\3\2\2\2\u00c3\u00c7\5\62\32\2\u00c4\u00c7\5\64\33\2\u00c5\u00c7\5\60"+
		"\31\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"/\3\2\2\2\u00c8\u00c9\7\24\2\2\u00c9\61\3\2\2\2\u00ca\u00cc\7\17\2\2\u00cb"+
		"\u00cd\5\32\16\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\20\2\2\u00d1"+
		"\63\3\2\2\2\u00d2\u00d4\7\f\2\2\u00d3\u00d5\5\30\r\2\u00d4\u00d3\3\2\2"+
		"\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d9\7\r\2\2\u00d9\u00da\5\6\4\2\u00da\65\3\2\2\2\35;"+
		"?FLUjqy}\u0080\u0083\u0086\u008b\u0090\u0092\u0097\u009e\u00ab\u00ae\u00b3"+
		"\u00b6\u00bb\u00be\u00c1\u00c6\u00ce\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}