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
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, WS=18, ID=19, COMMENT=20, VAR=21, NUM=22, PLUS=23, MINUS=24, 
		DOT=25, OCTAVE_SHIFT=26, BASE_NOTE=27, STRING=28, UP=29, DOWN=30;
	public static final String[] tokenNames = {
		"<INVALID>", "'o'", "'p'", "'\n'", "'t'", "'v'", "'#include'", "'#track'", 
		"'#section'", "':'", "'['", "']'", "'#constant'", "'&'", "'('", "')'", 
		"'#percussion'", "'l'", "WS", "ID", "COMMENT", "VAR", "NUM", "'+'", "'-'", 
		"'.'", "OCTAVE_SHIFT", "BASE_NOTE", "STRING", "'>'", "'<'"
	};
	public static final int
		RULE_midi = 0, RULE_newline = 1, RULE_val = 2, RULE_statements = 3, RULE_statement = 4, 
		RULE_constant_declaration = 5, RULE_track_declaration = 6, RULE_percussion_declaration = 7, 
		RULE_section_declaration = 8, RULE_track = 9, RULE_include = 10, RULE_command = 11, 
		RULE_note = 12, RULE_pitch_shift_sign = 13, RULE_length_shift_sign = 14, 
		RULE_modifiers = 15, RULE_tempo = 16, RULE_length = 17, RULE_shift_sign = 18, 
		RULE_octave = 19, RULE_volume = 20, RULE_pitch_transpose = 21, RULE_playback = 22, 
		RULE_tie = 23, RULE_section = 24, RULE_harmony = 25, RULE_loop = 26;
	public static final String[] ruleNames = {
		"midi", "newline", "val", "statements", "statement", "constant_declaration", 
		"track_declaration", "percussion_declaration", "section_declaration", 
		"track", "include", "command", "note", "pitch_shift_sign", "length_shift_sign", 
		"modifiers", "tempo", "length", "shift_sign", "octave", "volume", "pitch_transpose", 
		"playback", "tie", "section", "harmony", "loop"
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
			setState(54); statements();
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
			setState(63);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(56); match(T__14);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(59); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); match(EOF);
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(62); match(COMMENT);
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
			setState(65);
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
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67); newline();
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__5) | (1L << T__1) | (1L << ID))) != 0)) {
				{
				{
				setState(73); statement();
				}
				}
				setState(78);
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
			setState(85);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(79); constant_declaration();
				}
				break;
			case T__10:
				{
				setState(80); track_declaration();
				}
				break;
			case T__1:
				{
				setState(81); percussion_declaration();
				}
				break;
			case T__11:
				{
				setState(82); include();
				}
				break;
			case T__9:
				{
				setState(83); section_declaration();
				}
				break;
			case ID:
				{
				setState(84); track();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(87); newline();
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
			setState(89); match(T__5);
			setState(90); ((Constant_declarationContext)_localctx).name = match(VAR);
			setState(91); ((Constant_declarationContext)_localctx).value = val();
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
			setState(93); match(T__10);
			setState(94); ((Track_declarationContext)_localctx).name = match(ID);
			setState(95); ((Track_declarationContext)_localctx).instrument = val();
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
			setState(97); match(T__1);
			setState(98); ((Percussion_declarationContext)_localctx).name = match(ID);
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
			setState(100); match(T__9);
			setState(101); ((Section_declarationContext)_localctx).name = match(ID);
			setState(102); match(T__8);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103); command();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__15) | (1L << T__13) | (1L << T__12) | (1L << T__7) | (1L << T__3) | (1L << T__0) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
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
			setState(108); ((TrackContext)_localctx).track_name = match(ID);
			setState(109); match(T__8);
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110); command();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__15) | (1L << T__13) | (1L << T__12) | (1L << T__7) | (1L << T__3) | (1L << T__0) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
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
			setState(115); match(T__11);
			setState(116); ((IncludeContext)_localctx).filename = match(STRING);
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
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); modifiers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120); playback();
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
			setState(123); ((NoteContext)_localctx).base = match(BASE_NOTE);
			setState(125);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(124); ((NoteContext)_localctx).pitch_shift = pitch_shift_sign();
				}
			}

			setState(128);
			_la = _input.LA(1);
			if (_la==OCTAVE_SHIFT) {
				{
				setState(127); ((NoteContext)_localctx).octave_shift = match(OCTAVE_SHIFT);
				}
			}

			setState(131);
			_la = _input.LA(1);
			if (_la==VAR || _la==NUM) {
				{
				setState(130); ((NoteContext)_localctx).note_length = val();
				}
			}

			setState(134);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(133); ((NoteContext)_localctx).length_shift = length_shift_sign();
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
			setState(146);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136); match(PLUS);
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS );
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141); match(MINUS);
					}
					}
					setState(144); 
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
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148); match(DOT);
				}
				}
				setState(151); 
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
			setState(158);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); tempo();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(154); length();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(155); octave();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(156); volume();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(157); pitch_transpose();
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
			setState(160); match(T__13);
			setState(161); ((TempoContext)_localctx).value = val();
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
			setState(163); match(T__0);
			setState(164); ((LengthContext)_localctx).value = val();
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
			setState(166);
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
			setState(168); match(T__16);
			setState(174);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(169); ((OctaveContext)_localctx).shift = shift_sign();
				setState(171);
				_la = _input.LA(1);
				if (_la==VAR || _la==NUM) {
					{
					setState(170); ((OctaveContext)_localctx).value = val();
					}
				}

				}
				break;
			case VAR:
			case NUM:
				{
				setState(173); ((OctaveContext)_localctx).value = val();
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
			setState(176); match(T__12);
			setState(182);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(177); ((VolumeContext)_localctx).shift = shift_sign();
				setState(179);
				_la = _input.LA(1);
				if (_la==VAR || _la==NUM) {
					{
					setState(178); ((VolumeContext)_localctx).value = val();
					}
				}

				}
				break;
			case VAR:
			case NUM:
				{
				setState(181); ((VolumeContext)_localctx).value = val();
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
			setState(184); match(T__15);
			setState(193);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(185); ((Pitch_transposeContext)_localctx).shift = shift_sign();
				setState(187);
				_la = _input.LA(1);
				if (_la==VAR || _la==NUM) {
					{
					setState(186); ((Pitch_transposeContext)_localctx).value = val();
					}
				}

				}
				break;
			case VAR:
			case NUM:
			case MINUS:
				{
				{
				setState(190);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(189); ((Pitch_transposeContext)_localctx).negative = match(MINUS);
					}
				}

				setState(192); ((Pitch_transposeContext)_localctx).value = val();
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
		enterRule(_localctx, 44, RULE_playback);
		try {
			setState(199);
			switch (_input.LA(1)) {
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(195); tie();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(196); harmony();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(197); loop();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(198); section();
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

	public static class TieContext extends ParserRuleContext {
		public NoteContext note;
		public List<NoteContext> notes = new ArrayList<NoteContext>();
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
		enterRule(_localctx, 46, RULE_tie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); ((TieContext)_localctx).note = note();
			((TieContext)_localctx).notes.add(((TieContext)_localctx).note);
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202); match(T__4);
				setState(203); ((TieContext)_localctx).note = note();
				((TieContext)_localctx).notes.add(((TieContext)_localctx).note);
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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
		enterRule(_localctx, 48, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); ((SectionContext)_localctx).name = match(ID);
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
		enterRule(_localctx, 50, RULE_harmony);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(T__3);
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211); note();
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BASE_NOTE );
			setState(216); match(T__2);
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
		enterRule(_localctx, 52, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(T__7);
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219); command();
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__15) | (1L << T__13) | (1L << T__12) | (1L << T__7) | (1L << T__3) | (1L << T__0) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
			setState(224); match(T__6);
			setState(225); ((LoopContext)_localctx).value = val();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\6\3<\n\3\r\3\16\3=\3\3\3\3"+
		"\5\3B\n\3\3\4\3\4\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\7\5M\n\5\f\5\16\5P\13"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6X\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\6\nk\n\n\r\n\16\nl\3\13\3\13\3\13\6"+
		"\13r\n\13\r\13\16\13s\3\f\3\f\3\f\3\r\3\r\3\r\5\r|\n\r\3\16\3\16\5\16"+
		"\u0080\n\16\3\16\5\16\u0083\n\16\3\16\5\16\u0086\n\16\3\16\5\16\u0089"+
		"\n\16\3\17\6\17\u008c\n\17\r\17\16\17\u008d\3\17\6\17\u0091\n\17\r\17"+
		"\16\17\u0092\5\17\u0095\n\17\3\20\6\20\u0098\n\20\r\20\16\20\u0099\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00a1\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\5\25\u00ae\n\25\3\25\5\25\u00b1\n\25\3\26\3\26\3"+
		"\26\5\26\u00b6\n\26\3\26\5\26\u00b9\n\26\3\27\3\27\3\27\5\27\u00be\n\27"+
		"\3\27\5\27\u00c1\n\27\3\27\5\27\u00c4\n\27\3\30\3\30\3\30\3\30\5\30\u00ca"+
		"\n\30\3\31\3\31\3\31\6\31\u00cf\n\31\r\31\16\31\u00d0\3\32\3\32\3\33\3"+
		"\33\6\33\u00d7\n\33\r\33\16\33\u00d8\3\33\3\33\3\34\3\34\6\34\u00df\n"+
		"\34\r\34\16\34\u00e0\3\34\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\4\3\2\27\30\3\2\37 \u00f1\28\3"+
		"\2\2\2\4A\3\2\2\2\6C\3\2\2\2\bH\3\2\2\2\nW\3\2\2\2\f[\3\2\2\2\16_\3\2"+
		"\2\2\20c\3\2\2\2\22f\3\2\2\2\24n\3\2\2\2\26u\3\2\2\2\30{\3\2\2\2\32}\3"+
		"\2\2\2\34\u0094\3\2\2\2\36\u0097\3\2\2\2 \u00a0\3\2\2\2\"\u00a2\3\2\2"+
		"\2$\u00a5\3\2\2\2&\u00a8\3\2\2\2(\u00aa\3\2\2\2*\u00b2\3\2\2\2,\u00ba"+
		"\3\2\2\2.\u00c9\3\2\2\2\60\u00cb\3\2\2\2\62\u00d2\3\2\2\2\64\u00d4\3\2"+
		"\2\2\66\u00dc\3\2\2\289\5\b\5\29\3\3\2\2\2:<\7\5\2\2;:\3\2\2\2<=\3\2\2"+
		"\2=;\3\2\2\2=>\3\2\2\2>B\3\2\2\2?B\7\2\2\3@B\7\26\2\2A;\3\2\2\2A?\3\2"+
		"\2\2A@\3\2\2\2B\5\3\2\2\2CD\t\2\2\2D\7\3\2\2\2EG\5\4\3\2FE\3\2\2\2GJ\3"+
		"\2\2\2HF\3\2\2\2HI\3\2\2\2IN\3\2\2\2JH\3\2\2\2KM\5\n\6\2LK\3\2\2\2MP\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2O\t\3\2\2\2PN\3\2\2\2QX\5\f\7\2RX\5\16\b\2S"+
		"X\5\20\t\2TX\5\26\f\2UX\5\22\n\2VX\5\24\13\2WQ\3\2\2\2WR\3\2\2\2WS\3\2"+
		"\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YZ\5\4\3\2Z\13\3\2\2\2[\\"+
		"\7\16\2\2\\]\7\27\2\2]^\5\6\4\2^\r\3\2\2\2_`\7\t\2\2`a\7\25\2\2ab\5\6"+
		"\4\2b\17\3\2\2\2cd\7\22\2\2de\7\25\2\2e\21\3\2\2\2fg\7\n\2\2gh\7\25\2"+
		"\2hj\7\13\2\2ik\5\30\r\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\23\3"+
		"\2\2\2no\7\25\2\2oq\7\13\2\2pr\5\30\r\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2t\25\3\2\2\2uv\7\b\2\2vw\7\36\2\2w\27\3\2\2\2x|\5\32\16\2y|"+
		"\5 \21\2z|\5.\30\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\31\3\2\2\2}\177\7\35"+
		"\2\2~\u0080\5\34\17\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2"+
		"\2\u0081\u0083\7\34\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0085\3\2\2\2\u0084\u0086\5\6\4\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0089\5\36\20\2\u0088\u0087\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\33\3\2\2\2\u008a\u008c\7\31\2\2\u008b\u008a\3\2\2"+
		"\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0095"+
		"\3\2\2\2\u008f\u0091\7\32\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2"+
		"\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u008b"+
		"\3\2\2\2\u0094\u0090\3\2\2\2\u0095\35\3\2\2\2\u0096\u0098\7\33\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\37\3\2\2\2\u009b\u00a1\5\"\22\2\u009c\u00a1\5$\23\2\u009d\u00a1"+
		"\5(\25\2\u009e\u00a1\5*\26\2\u009f\u00a1\5,\27\2\u00a0\u009b\3\2\2\2\u00a0"+
		"\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2"+
		"\2\2\u00a1!\3\2\2\2\u00a2\u00a3\7\6\2\2\u00a3\u00a4\5\6\4\2\u00a4#\3\2"+
		"\2\2\u00a5\u00a6\7\23\2\2\u00a6\u00a7\5\6\4\2\u00a7%\3\2\2\2\u00a8\u00a9"+
		"\t\3\2\2\u00a9\'\3\2\2\2\u00aa\u00b0\7\3\2\2\u00ab\u00ad\5&\24\2\u00ac"+
		"\u00ae\5\6\4\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00b1\5\6\4\2\u00b0\u00ab\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		")\3\2\2\2\u00b2\u00b8\7\7\2\2\u00b3\u00b5\5&\24\2\u00b4\u00b6\5\6\4\2"+
		"\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b9"+
		"\5\6\4\2\u00b8\u00b3\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9+\3\2\2\2\u00ba"+
		"\u00c3\7\4\2\2\u00bb\u00bd\5&\24\2\u00bc\u00be\5\6\4\2\u00bd\u00bc\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c4\3\2\2\2\u00bf\u00c1\7\32\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\5\6"+
		"\4\2\u00c3\u00bb\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4-\3\2\2\2\u00c5\u00ca"+
		"\5\60\31\2\u00c6\u00ca\5\64\33\2\u00c7\u00ca\5\66\34\2\u00c8\u00ca\5\62"+
		"\32\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca/\3\2\2\2\u00cb\u00ce\5\32\16\2\u00cc\u00cd\7\17\2"+
		"\2\u00cd\u00cf\5\32\16\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\61\3\2\2\2\u00d2\u00d3\7\25\2"+
		"\2\u00d3\63\3\2\2\2\u00d4\u00d6\7\20\2\2\u00d5\u00d7\5\32\16\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\7\21\2\2\u00db\65\3\2\2\2\u00dc\u00de\7\f\2"+
		"\2\u00dd\u00df\5\30\r\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\r"+
		"\2\2\u00e3\u00e4\5\6\4\2\u00e4\67\3\2\2\2\36=AHNWls{\177\u0082\u0085\u0088"+
		"\u008d\u0092\u0094\u0099\u00a0\u00ad\u00b0\u00b5\u00b8\u00bd\u00c0\u00c3"+
		"\u00c9\u00d0\u00d8\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}