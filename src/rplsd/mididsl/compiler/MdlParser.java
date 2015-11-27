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
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, NUM=15, WS=16, ID=17, PLUS=18, 
		MINUS=19, DOT=20, OCTAVE_SHIFT=21, BASE_NOTE=22, STRING=23, UP=24, DOWN=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'o'", "'p'", "'\n'", "'t'", "'v'", "'#include'", "'#section'", 
		"'['", "']'", "'#channel'", "'&'", "'('", "')'", "'l'", "NUM", "WS", "ID", 
		"'+'", "'-'", "'.'", "OCTAVE_SHIFT", "BASE_NOTE", "STRING", "'>'", "'<'"
	};
	public static final int
		RULE_midi = 0, RULE_newline = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_channel_declaration = 4, RULE_section_declaration = 5, RULE_channel = 6, 
		RULE_include = 7, RULE_command = 8, RULE_note = 9, RULE_pitch_shift_sign = 10, 
		RULE_length_shift_sign = 11, RULE_modifiers = 12, RULE_tempo = 13, RULE_length = 14, 
		RULE_shift_sign = 15, RULE_octave = 16, RULE_volume = 17, RULE_pitch_transpose = 18, 
		RULE_playback = 19, RULE_section = 20, RULE_tie = 21, RULE_harmony = 22, 
		RULE_loop = 23;
	public static final String[] ruleNames = {
		"midi", "newline", "statements", "statement", "channel_declaration", "section_declaration", 
		"channel", "include", "command", "note", "pitch_shift_sign", "length_shift_sign", 
		"modifiers", "tempo", "length", "shift_sign", "octave", "volume", "pitch_transpose", 
		"playback", "section", "tie", "harmony", "loop"
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
			setState(48); statements();
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
			setState(56);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(51); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(50); match(T__11);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(53); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(55); match(EOF);
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
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58); newline();
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__7) | (1L << T__4) | (1L << ID))) != 0)) {
				{
				{
				setState(64); statement();
				}
				}
				setState(69);
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
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public Channel_declarationContext channel_declaration() {
			return getRuleContext(Channel_declarationContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public ChannelContext channel() {
			return getRuleContext(ChannelContext.class,0);
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
			setState(74);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(70); channel_declaration();
				}
				break;
			case T__8:
				{
				setState(71); include();
				}
				break;
			case T__7:
				{
				setState(72); section_declaration();
				}
				break;
			case ID:
				{
				setState(73); channel();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(76); newline();
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

	public static class Channel_declarationContext extends ParserRuleContext {
		public Token name;
		public Token instrument;
		public TerminalNode ID() { return getToken(MdlParser.ID, 0); }
		public TerminalNode NUM() { return getToken(MdlParser.NUM, 0); }
		public Channel_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channel_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitChannel_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Channel_declarationContext channel_declaration() throws RecognitionException {
		Channel_declarationContext _localctx = new Channel_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_channel_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(T__4);
			setState(79); ((Channel_declarationContext)_localctx).name = match(ID);
			setState(80); ((Channel_declarationContext)_localctx).instrument = match(NUM);
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
		enterRule(_localctx, 10, RULE_section_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(T__7);
			setState(83); ((Section_declarationContext)_localctx).name = match(ID);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84); command();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__12) | (1L << T__10) | (1L << T__9) | (1L << T__6) | (1L << T__2) | (1L << T__0) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
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

	public static class ChannelContext extends ParserRuleContext {
		public Token channel_name;
		public TerminalNode ID() { return getToken(MdlParser.ID, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ChannelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitChannel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChannelContext channel() throws RecognitionException {
		ChannelContext _localctx = new ChannelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_channel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); ((ChannelContext)_localctx).channel_name = match(ID);
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90); command();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__12) | (1L << T__10) | (1L << T__9) | (1L << T__6) | (1L << T__2) | (1L << T__0) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
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
		enterRule(_localctx, 14, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(T__8);
			setState(96); ((IncludeContext)_localctx).filename = match(STRING);
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
		enterRule(_localctx, 16, RULE_command);
		try {
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); modifiers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100); playback();
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
		enterRule(_localctx, 18, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); ((NoteContext)_localctx).base = match(BASE_NOTE);
			setState(105);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(104); ((NoteContext)_localctx).pitch_shift = pitch_shift_sign();
				}
			}

			setState(108);
			_la = _input.LA(1);
			if (_la==OCTAVE_SHIFT) {
				{
				setState(107); ((NoteContext)_localctx).octave_shift = match(OCTAVE_SHIFT);
				}
			}

			setState(111);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(110); ((NoteContext)_localctx).note_length = match(NUM);
				}
			}

			setState(114);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(113); ((NoteContext)_localctx).length_shift = length_shift_sign();
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
		enterRule(_localctx, 20, RULE_pitch_shift_sign);
		int _la;
		try {
			setState(126);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(116); match(PLUS);
					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS );
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(121); match(MINUS);
					}
					}
					setState(124); 
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
		enterRule(_localctx, 22, RULE_length_shift_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128); match(DOT);
				}
				}
				setState(131); 
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
		enterRule(_localctx, 24, RULE_modifiers);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); tempo();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(134); length();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(135); octave();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(136); volume();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(137); pitch_transpose();
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
		enterRule(_localctx, 26, RULE_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(T__10);
			setState(141); ((TempoContext)_localctx).value = match(NUM);
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
		enterRule(_localctx, 28, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(T__0);
			setState(144); ((LengthContext)_localctx).value = match(NUM);
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
		enterRule(_localctx, 30, RULE_shift_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
		enterRule(_localctx, 32, RULE_octave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(T__13);
			setState(154);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(149); ((OctaveContext)_localctx).shift = shift_sign();
				setState(151);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(150); ((OctaveContext)_localctx).value = match(NUM);
					}
				}

				}
				break;
			case NUM:
				{
				setState(153); ((OctaveContext)_localctx).value = match(NUM);
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
		enterRule(_localctx, 34, RULE_volume);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(T__9);
			setState(162);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(157); ((VolumeContext)_localctx).shift = shift_sign();
				setState(159);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(158); ((VolumeContext)_localctx).value = match(NUM);
					}
				}

				}
				break;
			case NUM:
				{
				setState(161); ((VolumeContext)_localctx).value = match(NUM);
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
		enterRule(_localctx, 36, RULE_pitch_transpose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(T__12);
			setState(173);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(165); ((Pitch_transposeContext)_localctx).shift = shift_sign();
				setState(167);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(166); ((Pitch_transposeContext)_localctx).value = match(NUM);
					}
				}

				}
				break;
			case NUM:
			case MINUS:
				{
				{
				setState(170);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(169); ((Pitch_transposeContext)_localctx).negative = match(MINUS);
					}
				}

				setState(172); ((Pitch_transposeContext)_localctx).value = match(NUM);
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
		enterRule(_localctx, 38, RULE_playback);
		try {
			setState(179);
			switch (_input.LA(1)) {
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(175); tie();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176); harmony();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(177); loop();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(178); section();
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
		enterRule(_localctx, 40, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); ((SectionContext)_localctx).name = match(ID);
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
		enterRule(_localctx, 42, RULE_tie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); ((TieContext)_localctx).note1 = note();
			setState(184); match(T__3);
			setState(185); ((TieContext)_localctx).note2 = note();
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
		enterRule(_localctx, 44, RULE_harmony);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(T__2);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188); note();
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BASE_NOTE );
			setState(193); match(T__1);
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
		enterRule(_localctx, 46, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(T__6);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196); command();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__12) | (1L << T__10) | (1L << T__9) | (1L << T__6) | (1L << T__2) | (1L << T__0) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
			setState(201); match(T__5);
			setState(202); ((LoopContext)_localctx).value = match(NUM);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u00cf\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\6\3\66\n\3\r\3\16\3\67\3\3\5\3;\n\3\3\4\7\4>\n\4\f\4\16\4"+
		"A\13\4\3\4\7\4D\n\4\f\4\16\4G\13\4\3\5\3\5\3\5\3\5\5\5M\n\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\6\7X\n\7\r\7\16\7Y\3\b\3\b\6\b^\n\b\r\b\16"+
		"\b_\3\t\3\t\3\t\3\n\3\n\3\n\5\nh\n\n\3\13\3\13\5\13l\n\13\3\13\5\13o\n"+
		"\13\3\13\5\13r\n\13\3\13\5\13u\n\13\3\f\6\fx\n\f\r\f\16\fy\3\f\6\f}\n"+
		"\f\r\f\16\f~\5\f\u0081\n\f\3\r\6\r\u0084\n\r\r\r\16\r\u0085\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u008d\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\5\22\u009a\n\22\3\22\5\22\u009d\n\22\3\23\3\23\3\23\5"+
		"\23\u00a2\n\23\3\23\5\23\u00a5\n\23\3\24\3\24\3\24\5\24\u00aa\n\24\3\24"+
		"\5\24\u00ad\n\24\3\24\5\24\u00b0\n\24\3\25\3\25\3\25\3\25\5\25\u00b6\n"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\6\30\u00c0\n\30\r\30\16\30"+
		"\u00c1\3\30\3\30\3\31\3\31\6\31\u00c8\n\31\r\31\16\31\u00c9\3\31\3\31"+
		"\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2"+
		"\3\3\2\32\33\u00d9\2\62\3\2\2\2\4:\3\2\2\2\6?\3\2\2\2\bL\3\2\2\2\nP\3"+
		"\2\2\2\fT\3\2\2\2\16[\3\2\2\2\20a\3\2\2\2\22g\3\2\2\2\24i\3\2\2\2\26\u0080"+
		"\3\2\2\2\30\u0083\3\2\2\2\32\u008c\3\2\2\2\34\u008e\3\2\2\2\36\u0091\3"+
		"\2\2\2 \u0094\3\2\2\2\"\u0096\3\2\2\2$\u009e\3\2\2\2&\u00a6\3\2\2\2(\u00b5"+
		"\3\2\2\2*\u00b7\3\2\2\2,\u00b9\3\2\2\2.\u00bd\3\2\2\2\60\u00c5\3\2\2\2"+
		"\62\63\5\6\4\2\63\3\3\2\2\2\64\66\7\5\2\2\65\64\3\2\2\2\66\67\3\2\2\2"+
		"\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\29;\7\2\2\3:\65\3\2\2\2:9\3\2\2\2;"+
		"\5\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2"+
		"A?\3\2\2\2BD\5\b\5\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\7\3\2\2"+
		"\2GE\3\2\2\2HM\5\n\6\2IM\5\20\t\2JM\5\f\7\2KM\5\16\b\2LH\3\2\2\2LI\3\2"+
		"\2\2LJ\3\2\2\2LK\3\2\2\2MN\3\2\2\2NO\5\4\3\2O\t\3\2\2\2PQ\7\f\2\2QR\7"+
		"\23\2\2RS\7\21\2\2S\13\3\2\2\2TU\7\t\2\2UW\7\23\2\2VX\5\22\n\2WV\3\2\2"+
		"\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\r\3\2\2\2[]\7\23\2\2\\^\5\22\n\2]\\"+
		"\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\17\3\2\2\2ab\7\b\2\2bc\7\31\2"+
		"\2c\21\3\2\2\2dh\5\24\13\2eh\5\32\16\2fh\5(\25\2gd\3\2\2\2ge\3\2\2\2g"+
		"f\3\2\2\2h\23\3\2\2\2ik\7\30\2\2jl\5\26\f\2kj\3\2\2\2kl\3\2\2\2ln\3\2"+
		"\2\2mo\7\27\2\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\7\21\2\2qp\3\2\2\2qr\3"+
		"\2\2\2rt\3\2\2\2su\5\30\r\2ts\3\2\2\2tu\3\2\2\2u\25\3\2\2\2vx\7\24\2\2"+
		"wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\u0081\3\2\2\2{}\7\25\2\2|{\3"+
		"\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080w\3\2\2"+
		"\2\u0080|\3\2\2\2\u0081\27\3\2\2\2\u0082\u0084\7\26\2\2\u0083\u0082\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\31\3\2\2\2\u0087\u008d\5\34\17\2\u0088\u008d\5\36\20\2\u0089\u008d\5"+
		"\"\22\2\u008a\u008d\5$\23\2\u008b\u008d\5&\24\2\u008c\u0087\3\2\2\2\u008c"+
		"\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\33\3\2\2\2\u008e\u008f\7\6\2\2\u008f\u0090\7\21\2\2\u0090\35"+
		"\3\2\2\2\u0091\u0092\7\20\2\2\u0092\u0093\7\21\2\2\u0093\37\3\2\2\2\u0094"+
		"\u0095\t\2\2\2\u0095!\3\2\2\2\u0096\u009c\7\3\2\2\u0097\u0099\5 \21\2"+
		"\u0098\u009a\7\21\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d"+
		"\3\2\2\2\u009b\u009d\7\21\2\2\u009c\u0097\3\2\2\2\u009c\u009b\3\2\2\2"+
		"\u009d#\3\2\2\2\u009e\u00a4\7\7\2\2\u009f\u00a1\5 \21\2\u00a0\u00a2\7"+
		"\21\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a5\7\21\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5%\3\2\2\2"+
		"\u00a6\u00af\7\4\2\2\u00a7\u00a9\5 \21\2\u00a8\u00aa\7\21\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b0\3\2\2\2\u00ab\u00ad\7\25\2\2"+
		"\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0"+
		"\7\21\2\2\u00af\u00a7\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0\'\3\2\2\2\u00b1"+
		"\u00b6\5,\27\2\u00b2\u00b6\5.\30\2\u00b3\u00b6\5\60\31\2\u00b4\u00b6\5"+
		"*\26\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6)\3\2\2\2\u00b7\u00b8\7\23\2\2\u00b8+\3\2\2\2\u00b9"+
		"\u00ba\5\24\13\2\u00ba\u00bb\7\r\2\2\u00bb\u00bc\5\24\13\2\u00bc-\3\2"+
		"\2\2\u00bd\u00bf\7\16\2\2\u00be\u00c0\5\24\13\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\7\17\2\2\u00c4/\3\2\2\2\u00c5\u00c7\7\n\2\2\u00c6\u00c8"+
		"\5\22\n\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\13\2\2\u00cc\u00cd"+
		"\7\21\2\2\u00cd\61\3\2\2\2\35\67:?ELY_gknqty~\u0080\u0085\u008c\u0099"+
		"\u009c\u00a1\u00a4\u00a9\u00ac\u00af\u00b5\u00c1\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}