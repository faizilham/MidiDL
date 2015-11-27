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
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, NUM=16, WS=17, ID=18, 
		COMMENT=19, PLUS=20, MINUS=21, DOT=22, OCTAVE_SHIFT=23, BASE_NOTE=24, 
		STRING=25, UP=26, DOWN=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'o'", "'p'", "'\n'", "'t'", "'v'", "'#include'", "'#track'", 
		"'#section'", "'['", "']'", "'&'", "'('", "')'", "'#percussion'", "'l'", 
		"NUM", "WS", "ID", "COMMENT", "'+'", "'-'", "'.'", "OCTAVE_SHIFT", "BASE_NOTE", 
		"STRING", "'>'", "'<'"
	};
	public static final int
		RULE_midi = 0, RULE_newline = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_track_declaration = 4, RULE_percussion_declaration = 5, RULE_section_declaration = 6, 
		RULE_track = 7, RULE_include = 8, RULE_command = 9, RULE_note = 10, RULE_pitch_shift_sign = 11, 
		RULE_length_shift_sign = 12, RULE_modifiers = 13, RULE_tempo = 14, RULE_length = 15, 
		RULE_shift_sign = 16, RULE_octave = 17, RULE_volume = 18, RULE_pitch_transpose = 19, 
		RULE_playback = 20, RULE_section = 21, RULE_tie = 22, RULE_harmony = 23, 
		RULE_loop = 24;
	public static final String[] ruleNames = {
		"midi", "newline", "statements", "statement", "track_declaration", "percussion_declaration", 
		"section_declaration", "track", "include", "command", "note", "pitch_shift_sign", 
		"length_shift_sign", "modifiers", "tempo", "length", "shift_sign", "octave", 
		"volume", "pitch_transpose", "playback", "section", "tie", "harmony", 
		"loop"
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
			setState(50); statements();
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
			setState(59);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(52); match(T__12);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(55); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); match(EOF);
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(58); match(COMMENT);
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
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61); newline();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__1) | (1L << ID))) != 0)) {
				{
				{
				setState(67); statement();
				}
				}
				setState(72);
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
		enterRule(_localctx, 6, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(73); track_declaration();
				}
				break;
			case T__1:
				{
				setState(74); percussion_declaration();
				}
				break;
			case T__9:
				{
				setState(75); include();
				}
				break;
			case T__7:
				{
				setState(76); section_declaration();
				}
				break;
			case ID:
				{
				setState(77); track();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(80); newline();
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
		public Token instrument;
		public TerminalNode ID() { return getToken(MdlParser.ID, 0); }
		public TerminalNode NUM() { return getToken(MdlParser.NUM, 0); }
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
		enterRule(_localctx, 8, RULE_track_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(T__8);
			setState(83); ((Track_declarationContext)_localctx).name = match(ID);
			setState(84); ((Track_declarationContext)_localctx).instrument = match(NUM);
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
		enterRule(_localctx, 10, RULE_percussion_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(T__1);
			setState(87); ((Percussion_declarationContext)_localctx).name = match(ID);
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
		enterRule(_localctx, 12, RULE_section_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(T__7);
			setState(90); ((Section_declarationContext)_localctx).name = match(ID);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91); command();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__10) | (1L << T__6) | (1L << T__3) | (1L << T__0) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
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
		enterRule(_localctx, 14, RULE_track);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); ((TrackContext)_localctx).track_name = match(ID);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97); command();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__10) | (1L << T__6) | (1L << T__3) | (1L << T__0) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
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
		enterRule(_localctx, 16, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(T__9);
			setState(103); ((IncludeContext)_localctx).filename = match(STRING);
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
		enterRule(_localctx, 18, RULE_command);
		try {
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); modifiers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); playback();
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

	public static class NoteContext extends ParserRuleContext {
		public Token base;
		public Pitch_shift_signContext pitch_shift;
		public Token octave_shift;
		public Token note_length;
		public Length_shift_signContext length_shift;
		public TerminalNode BASE_NOTE() { return getToken(MdlParser.BASE_NOTE, 0); }
		public TerminalNode NUM() { return getToken(MdlParser.NUM, 0); }
		public Length_shift_signContext length_shift_sign() {
			return getRuleContext(Length_shift_signContext.class,0);
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
		enterRule(_localctx, 20, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); ((NoteContext)_localctx).base = match(BASE_NOTE);
			setState(112);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(111); ((NoteContext)_localctx).pitch_shift = pitch_shift_sign();
				}
			}

			setState(115);
			_la = _input.LA(1);
			if (_la==OCTAVE_SHIFT) {
				{
				setState(114); ((NoteContext)_localctx).octave_shift = match(OCTAVE_SHIFT);
				}
			}

			setState(118);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(117); ((NoteContext)_localctx).note_length = match(NUM);
				}
			}

			setState(121);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(120); ((NoteContext)_localctx).length_shift = length_shift_sign();
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
		enterRule(_localctx, 22, RULE_pitch_shift_sign);
		int _la;
		try {
			setState(133);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(123); match(PLUS);
					}
					}
					setState(126); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS );
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(128); match(MINUS);
					}
					}
					setState(131); 
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
		enterRule(_localctx, 24, RULE_length_shift_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135); match(DOT);
				}
				}
				setState(138); 
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
		enterRule(_localctx, 26, RULE_modifiers);
		try {
			setState(145);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); tempo();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); length();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(142); octave();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(143); volume();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(144); pitch_transpose();
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
		public Token value;
		public TerminalNode NUM() { return getToken(MdlParser.NUM, 0); }
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
		enterRule(_localctx, 28, RULE_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(T__11);
			setState(148); ((TempoContext)_localctx).value = match(NUM);
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
		public Token value;
		public TerminalNode NUM() { return getToken(MdlParser.NUM, 0); }
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
		enterRule(_localctx, 30, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(T__0);
			setState(151); ((LengthContext)_localctx).value = match(NUM);
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
		enterRule(_localctx, 32, RULE_shift_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		public Token value;
		public Shift_signContext shift_sign() {
			return getRuleContext(Shift_signContext.class,0);
		}
		public TerminalNode NUM() { return getToken(MdlParser.NUM, 0); }
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
		enterRule(_localctx, 34, RULE_octave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(T__14);
			setState(161);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(156); ((OctaveContext)_localctx).shift = shift_sign();
				setState(158);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(157); ((OctaveContext)_localctx).value = match(NUM);
					}
				}

				}
				break;
			case NUM:
				{
				setState(160); ((OctaveContext)_localctx).value = match(NUM);
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
		public Token value;
		public Shift_signContext shift_sign() {
			return getRuleContext(Shift_signContext.class,0);
		}
		public TerminalNode NUM() { return getToken(MdlParser.NUM, 0); }
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
		enterRule(_localctx, 36, RULE_volume);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(T__10);
			setState(169);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(164); ((VolumeContext)_localctx).shift = shift_sign();
				setState(166);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(165); ((VolumeContext)_localctx).value = match(NUM);
					}
				}

				}
				break;
			case NUM:
				{
				setState(168); ((VolumeContext)_localctx).value = match(NUM);
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
		public Token value;
		public Token negative;
		public Shift_signContext shift_sign() {
			return getRuleContext(Shift_signContext.class,0);
		}
		public TerminalNode NUM() { return getToken(MdlParser.NUM, 0); }
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
		enterRule(_localctx, 38, RULE_pitch_transpose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(T__13);
			setState(180);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(172); ((Pitch_transposeContext)_localctx).shift = shift_sign();
				setState(174);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(173); ((Pitch_transposeContext)_localctx).value = match(NUM);
					}
				}

				}
				break;
			case NUM:
			case MINUS:
				{
				{
				setState(177);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(176); ((Pitch_transposeContext)_localctx).negative = match(MINUS);
					}
				}

				setState(179); ((Pitch_transposeContext)_localctx).value = match(NUM);
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
		public TieContext tie() {
			return getRuleContext(TieContext.class,0);
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
		enterRule(_localctx, 40, RULE_playback);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); tie();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); harmony();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(184); loop();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(185); section();
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
		enterRule(_localctx, 42, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); ((SectionContext)_localctx).name = match(ID);
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

	public static class TieContext extends ParserRuleContext {
		public NoteContext note1;
		public NoteContext note2;
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public TieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tie; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitTie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TieContext tie() throws RecognitionException {
		TieContext _localctx = new TieContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); ((TieContext)_localctx).note1 = note();
			setState(191); match(T__4);
			setState(192); ((TieContext)_localctx).note2 = note();
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
		enterRule(_localctx, 46, RULE_harmony);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(T__3);
			setState(196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195); note();
				}
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BASE_NOTE );
			setState(200); match(T__2);
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
		public Token value;
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public TerminalNode NUM() { return getToken(MdlParser.NUM, 0); }
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
		enterRule(_localctx, 48, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(T__6);
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(203); command();
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__10) | (1L << T__6) | (1L << T__3) | (1L << T__0) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
			setState(208); match(T__5);
			setState(209); ((LoopContext)_localctx).value = match(NUM);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u00d6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\6\38\n\3\r\3\16\39\3\3\3\3\5\3>\n\3\3\4\7\4A\n"+
		"\4\f\4\16\4D\13\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\5\3\5\3\5\3\5\3\5\5\5"+
		"Q\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\6\b_\n\b\r\b\16"+
		"\b`\3\t\3\t\6\te\n\t\r\t\16\tf\3\n\3\n\3\n\3\13\3\13\3\13\5\13o\n\13\3"+
		"\f\3\f\5\fs\n\f\3\f\5\fv\n\f\3\f\5\fy\n\f\3\f\5\f|\n\f\3\r\6\r\177\n\r"+
		"\r\r\16\r\u0080\3\r\6\r\u0084\n\r\r\r\16\r\u0085\5\r\u0088\n\r\3\16\6"+
		"\16\u008b\n\16\r\16\16\16\u008c\3\17\3\17\3\17\3\17\3\17\5\17\u0094\n"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\5\23\u00a1"+
		"\n\23\3\23\5\23\u00a4\n\23\3\24\3\24\3\24\5\24\u00a9\n\24\3\24\5\24\u00ac"+
		"\n\24\3\25\3\25\3\25\5\25\u00b1\n\25\3\25\5\25\u00b4\n\25\3\25\5\25\u00b7"+
		"\n\25\3\26\3\26\3\26\3\26\5\26\u00bd\n\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\6\31\u00c7\n\31\r\31\16\31\u00c8\3\31\3\31\3\32\3\32\6\32\u00cf"+
		"\n\32\r\32\16\32\u00d0\3\32\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\2\3\3\2\34\35\u00e1\2\64\3\2\2\2\4="+
		"\3\2\2\2\6B\3\2\2\2\bP\3\2\2\2\nT\3\2\2\2\fX\3\2\2\2\16[\3\2\2\2\20b\3"+
		"\2\2\2\22h\3\2\2\2\24n\3\2\2\2\26p\3\2\2\2\30\u0087\3\2\2\2\32\u008a\3"+
		"\2\2\2\34\u0093\3\2\2\2\36\u0095\3\2\2\2 \u0098\3\2\2\2\"\u009b\3\2\2"+
		"\2$\u009d\3\2\2\2&\u00a5\3\2\2\2(\u00ad\3\2\2\2*\u00bc\3\2\2\2,\u00be"+
		"\3\2\2\2.\u00c0\3\2\2\2\60\u00c4\3\2\2\2\62\u00cc\3\2\2\2\64\65\5\6\4"+
		"\2\65\3\3\2\2\2\668\7\5\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2"+
		"\2\2:>\3\2\2\2;>\7\2\2\3<>\7\25\2\2=\67\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\5"+
		"\3\2\2\2?A\5\4\3\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2D"+
		"B\3\2\2\2EG\5\b\5\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\7\3\2\2\2"+
		"JH\3\2\2\2KQ\5\n\6\2LQ\5\f\7\2MQ\5\22\n\2NQ\5\16\b\2OQ\5\20\t\2PK\3\2"+
		"\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2QR\3\2\2\2RS\5\4\3\2S\t\3"+
		"\2\2\2TU\7\t\2\2UV\7\24\2\2VW\7\22\2\2W\13\3\2\2\2XY\7\20\2\2YZ\7\24\2"+
		"\2Z\r\3\2\2\2[\\\7\n\2\2\\^\7\24\2\2]_\5\24\13\2^]\3\2\2\2_`\3\2\2\2`"+
		"^\3\2\2\2`a\3\2\2\2a\17\3\2\2\2bd\7\24\2\2ce\5\24\13\2dc\3\2\2\2ef\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2g\21\3\2\2\2hi\7\b\2\2ij\7\33\2\2j\23\3\2\2\2"+
		"ko\5\26\f\2lo\5\34\17\2mo\5*\26\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\25\3"+
		"\2\2\2pr\7\32\2\2qs\5\30\r\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tv\7\31\2\2"+
		"ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wy\7\22\2\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2"+
		"\2z|\5\32\16\2{z\3\2\2\2{|\3\2\2\2|\27\3\2\2\2}\177\7\26\2\2~}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0088\3\2"+
		"\2\2\u0082\u0084\7\27\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087~\3\2\2\2"+
		"\u0087\u0083\3\2\2\2\u0088\31\3\2\2\2\u0089\u008b\7\30\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\33\3\2\2\2\u008e\u0094\5\36\20\2\u008f\u0094\5 \21\2\u0090\u0094\5$\23"+
		"\2\u0091\u0094\5&\24\2\u0092\u0094\5(\25\2\u0093\u008e\3\2\2\2\u0093\u008f"+
		"\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\35\3\2\2\2\u0095\u0096\7\6\2\2\u0096\u0097\7\22\2\2\u0097\37\3\2\2\2"+
		"\u0098\u0099\7\21\2\2\u0099\u009a\7\22\2\2\u009a!\3\2\2\2\u009b\u009c"+
		"\t\2\2\2\u009c#\3\2\2\2\u009d\u00a3\7\3\2\2\u009e\u00a0\5\"\22\2\u009f"+
		"\u00a1\7\22\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\3"+
		"\2\2\2\u00a2\u00a4\7\22\2\2\u00a3\u009e\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"%\3\2\2\2\u00a5\u00ab\7\7\2\2\u00a6\u00a8\5\"\22\2\u00a7\u00a9\7\22\2"+
		"\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ac"+
		"\7\22\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\'\3\2\2\2\u00ad"+
		"\u00b6\7\4\2\2\u00ae\u00b0\5\"\22\2\u00af\u00b1\7\22\2\2\u00b0\u00af\3"+
		"\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b7\3\2\2\2\u00b2\u00b4\7\27\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\7\22"+
		"\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7)\3\2\2\2\u00b8\u00bd"+
		"\5.\30\2\u00b9\u00bd\5\60\31\2\u00ba\u00bd\5\62\32\2\u00bb\u00bd\5,\27"+
		"\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd+\3\2\2\2\u00be\u00bf\7\24\2\2\u00bf-\3\2\2\2\u00c0\u00c1"+
		"\5\26\f\2\u00c1\u00c2\7\r\2\2\u00c2\u00c3\5\26\f\2\u00c3/\3\2\2\2\u00c4"+
		"\u00c6\7\16\2\2\u00c5\u00c7\5\26\f\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3"+
		"\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\7\17\2\2\u00cb\61\3\2\2\2\u00cc\u00ce\7\13\2\2\u00cd\u00cf\5\24"+
		"\13\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\f\2\2\u00d3\u00d4\7\22"+
		"\2\2\u00d4\63\3\2\2\2\359=BHP`fnrux{\u0080\u0085\u0087\u008c\u0093\u00a0"+
		"\u00a3\u00a8\u00ab\u00b0\u00b3\u00b6\u00bc\u00c8\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}