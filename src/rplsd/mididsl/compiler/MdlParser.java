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
		PLUS=19, MINUS=20, OCTAVE_SHIFT=21, BASE_NOTE=22, STRING=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'o'", "'p'", "'\n'", "'t'", "'v'", "'['", "'<'", "']'", 
		"'>'", "'#channel'", "'&'", "'('", "')'", "'l'", "'#group'", "NUM", "WS", 
		"ID", "'+'", "'-'", "OCTAVE_SHIFT", "BASE_NOTE", "STRING"
	};
	public static final int
		RULE_midi = 0, RULE_newline = 1, RULE_pitch_shift_sign = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_channel_declaration = 5, RULE_group_declaration = 6, 
		RULE_group = 7, RULE_channels = 8, RULE_channel = 9, RULE_command = 10, 
		RULE_note = 11, RULE_modifiers = 12, RULE_tempo = 13, RULE_length = 14, 
		RULE_octave = 15, RULE_volume = 16, RULE_shift_octave = 17, RULE_octave_up = 18, 
		RULE_octave_down = 19, RULE_pitch_transpose = 20, RULE_playthrough = 21, 
		RULE_tie = 22, RULE_harmony = 23, RULE_loop = 24;
	public static final String[] ruleNames = {
		"midi", "newline", "pitch_shift_sign", "statements", "statement", "channel_declaration", 
		"group_declaration", "group", "channels", "channel", "command", "note", 
		"modifiers", "tempo", "length", "octave", "volume", "shift_octave", "octave_up", 
		"octave_down", "pitch_transpose", "playthrough", "tie", "harmony", "loop"
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
			setState(58);
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
		enterRule(_localctx, 4, RULE_pitch_shift_sign);
		int _la;
		try {
			setState(70);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(60); match(PLUS);
					}
					}
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS );
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(65); match(MINUS);
					}
					}
					setState(68); 
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
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72); newline();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__0) | (1L << ID))) != 0)) {
				{
				{
				setState(78); statement();
				setState(79); newline();
				}
				}
				setState(85);
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
		public Channel_declarationContext channel_declaration() {
			return getRuleContext(Channel_declarationContext.class,0);
		}
		public Group_declarationContext group_declaration() {
			return getRuleContext(Group_declarationContext.class,0);
		}
		public ChannelContext channel() {
			return getRuleContext(ChannelContext.class,0);
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
			setState(89);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); channel_declaration();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); group_declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(88); channel();
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
		enterRule(_localctx, 10, RULE_channel_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(T__5);
			setState(92); ((Channel_declarationContext)_localctx).name = match(ID);
			setState(93); ((Channel_declarationContext)_localctx).instrument = match(NUM);
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

	public static class Group_declarationContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(MdlParser.ID, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public Group_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitGroup_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_declarationContext group_declaration() throws RecognitionException {
		Group_declarationContext _localctx = new Group_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_group_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(T__0);
			setState(96); ((Group_declarationContext)_localctx).name = match(ID);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
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

	public static class GroupContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(MdlParser.ID, 0); }
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); ((GroupContext)_localctx).name = match(ID);
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

	public static class ChannelsContext extends ParserRuleContext {
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public List<ChannelContext> channel() {
			return getRuleContexts(ChannelContext.class);
		}
		public ChannelContext channel(int i) {
			return getRuleContext(ChannelContext.class,i);
		}
		public ChannelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channels; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitChannels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChannelsContext channels() throws RecognitionException {
		ChannelsContext _localctx = new ChannelsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_channels);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104); newline();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(110); channel();
				setState(111); newline();
				}
				}
				setState(117);
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
		enterRule(_localctx, 18, RULE_channel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); ((ChannelContext)_localctx).channel_name = match(ID);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119); command();
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
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
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public PlaythroughContext playthrough() {
			return getRuleContext(PlaythroughContext.class,0);
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
		enterRule(_localctx, 20, RULE_command);
		try {
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); modifiers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126); playthrough();
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
		public TerminalNode BASE_NOTE() { return getToken(MdlParser.BASE_NOTE, 0); }
		public TerminalNode NUM() { return getToken(MdlParser.NUM, 0); }
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
		enterRule(_localctx, 22, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); ((NoteContext)_localctx).base = match(BASE_NOTE);
			setState(131);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(130); ((NoteContext)_localctx).pitch_shift = pitch_shift_sign();
				}
			}

			setState(134);
			_la = _input.LA(1);
			if (_la==OCTAVE_SHIFT) {
				{
				setState(133); ((NoteContext)_localctx).octave_shift = match(OCTAVE_SHIFT);
				}
			}

			setState(137);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(136); ((NoteContext)_localctx).note_length = match(NUM);
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
		public Shift_octaveContext shift_octave() {
			return getRuleContext(Shift_octaveContext.class,0);
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
			setState(145);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); tempo();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); length();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(141); octave();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(142); volume();
				}
				break;
			case T__8:
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(143); shift_octave();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
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
		enterRule(_localctx, 26, RULE_tempo);
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
		enterRule(_localctx, 28, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(T__1);
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

	public static class OctaveContext extends ParserRuleContext {
		public Token value;
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
		enterRule(_localctx, 30, RULE_octave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(T__14);
			setState(154); ((OctaveContext)_localctx).value = match(NUM);
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
		public Token value;
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
		enterRule(_localctx, 32, RULE_volume);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(T__10);
			setState(157); ((VolumeContext)_localctx).value = match(NUM);
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

	public static class Shift_octaveContext extends ParserRuleContext {
		public Octave_downContext octave_down() {
			return getRuleContext(Octave_downContext.class,0);
		}
		public Octave_upContext octave_up() {
			return getRuleContext(Octave_upContext.class,0);
		}
		public Shift_octaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_octave; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitShift_octave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_octaveContext shift_octave() throws RecognitionException {
		Shift_octaveContext _localctx = new Shift_octaveContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_shift_octave);
		try {
			setState(161);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); octave_up();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(160); octave_down();
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

	public static class Octave_upContext extends ParserRuleContext {
		public Octave_upContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octave_up; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitOctave_up(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Octave_upContext octave_up() throws RecognitionException {
		Octave_upContext _localctx = new Octave_upContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_octave_up);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(T__6);
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

	public static class Octave_downContext extends ParserRuleContext {
		public Octave_downContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octave_down; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitOctave_down(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Octave_downContext octave_down() throws RecognitionException {
		Octave_downContext _localctx = new Octave_downContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_octave_down);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(T__8);
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
		public Token negative;
		public Token value;
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
		enterRule(_localctx, 40, RULE_pitch_transpose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(T__13);
			setState(169);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(168); ((Pitch_transposeContext)_localctx).negative = match(MINUS);
				}
			}

			setState(171); ((Pitch_transposeContext)_localctx).value = match(NUM);
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

	public static class PlaythroughContext extends ParserRuleContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public TieContext tie() {
			return getRuleContext(TieContext.class,0);
		}
		public HarmonyContext harmony() {
			return getRuleContext(HarmonyContext.class,0);
		}
		public PlaythroughContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playthrough; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MdlVisitor ) return ((MdlVisitor<? extends T>)visitor).visitPlaythrough(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaythroughContext playthrough() throws RecognitionException {
		PlaythroughContext _localctx = new PlaythroughContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_playthrough);
		try {
			setState(177);
			switch (_input.LA(1)) {
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); tie();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); harmony();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(175); loop();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(176); group();
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
			setState(179); ((TieContext)_localctx).note1 = note();
			setState(180); match(T__4);
			setState(181); ((TieContext)_localctx).note2 = note();
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
			setState(183); match(T__3);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184); note();
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BASE_NOTE );
			setState(189); match(T__2);
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
			setState(191); match(T__9);
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(192); command();
				}
				}
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
			setState(197); match(T__7);
			setState(198); ((LoopContext)_localctx).value = match(NUM);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00cb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\6\38\n\3\r\3\16\39\3\3\5\3=\n\3\3\4\6\4@\n\4\r"+
		"\4\16\4A\3\4\6\4E\n\4\r\4\16\4F\5\4I\n\4\3\5\7\5L\n\5\f\5\16\5O\13\5\3"+
		"\5\3\5\3\5\7\5T\n\5\f\5\16\5W\13\5\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\6\be\n\b\r\b\16\bf\3\t\3\t\3\n\7\nl\n\n\f\n\16\no\13\n"+
		"\3\n\3\n\3\n\7\nt\n\n\f\n\16\nw\13\n\3\13\3\13\6\13{\n\13\r\13\16\13|"+
		"\3\f\3\f\3\f\5\f\u0082\n\f\3\r\3\r\5\r\u0086\n\r\3\r\5\r\u0089\n\r\3\r"+
		"\5\r\u008c\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0094\n\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\5\23\u00a4"+
		"\n\23\3\24\3\24\3\25\3\25\3\26\3\26\5\26\u00ac\n\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\5\27\u00b4\n\27\3\30\3\30\3\30\3\30\3\31\3\31\6\31\u00bc\n"+
		"\31\r\31\16\31\u00bd\3\31\3\31\3\32\3\32\6\32\u00c4\n\32\r\32\16\32\u00c5"+
		"\3\32\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\2\2\u00cf\2\64\3\2\2\2\4<\3\2\2\2\6H\3\2\2\2\bM\3\2\2\2\n"+
		"[\3\2\2\2\f]\3\2\2\2\16a\3\2\2\2\20h\3\2\2\2\22m\3\2\2\2\24x\3\2\2\2\26"+
		"\u0081\3\2\2\2\30\u0083\3\2\2\2\32\u0093\3\2\2\2\34\u0095\3\2\2\2\36\u0098"+
		"\3\2\2\2 \u009b\3\2\2\2\"\u009e\3\2\2\2$\u00a3\3\2\2\2&\u00a5\3\2\2\2"+
		"(\u00a7\3\2\2\2*\u00a9\3\2\2\2,\u00b3\3\2\2\2.\u00b5\3\2\2\2\60\u00b9"+
		"\3\2\2\2\62\u00c1\3\2\2\2\64\65\5\b\5\2\65\3\3\2\2\2\668\7\5\2\2\67\66"+
		"\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;=\7\2\2\3<\67\3\2\2"+
		"\2<;\3\2\2\2=\5\3\2\2\2>@\7\25\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2BI\3\2\2\2CE\7\26\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3"+
		"\2\2\2H?\3\2\2\2HD\3\2\2\2I\7\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2\2\2MK"+
		"\3\2\2\2MN\3\2\2\2NU\3\2\2\2OM\3\2\2\2PQ\5\n\6\2QR\5\4\3\2RT\3\2\2\2S"+
		"P\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\t\3\2\2\2WU\3\2\2\2X\\\5\f\7"+
		"\2Y\\\5\16\b\2Z\\\5\24\13\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\13\3\2\2\2"+
		"]^\7\f\2\2^_\7\24\2\2_`\7\22\2\2`\r\3\2\2\2ab\7\21\2\2bd\7\24\2\2ce\5"+
		"\26\f\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\17\3\2\2\2hi\7\24\2\2"+
		"i\21\3\2\2\2jl\5\4\3\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nu\3\2\2"+
		"\2om\3\2\2\2pq\5\24\13\2qr\5\4\3\2rt\3\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2"+
		"\2\2uv\3\2\2\2v\23\3\2\2\2wu\3\2\2\2xz\7\24\2\2y{\5\26\f\2zy\3\2\2\2{"+
		"|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\25\3\2\2\2~\u0082\5\30\r\2\177\u0082\5"+
		"\32\16\2\u0080\u0082\5,\27\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\27\3\2\2\2\u0083\u0085\7\30\2\2\u0084\u0086\5\6\4\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\7\27"+
		"\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u008c\7\22\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\31\3\2\2"+
		"\2\u008d\u0094\5\34\17\2\u008e\u0094\5\36\20\2\u008f\u0094\5 \21\2\u0090"+
		"\u0094\5\"\22\2\u0091\u0094\5$\23\2\u0092\u0094\5*\26\2\u0093\u008d\3"+
		"\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\33\3\2\2\2\u0095\u0096\7\6\2"+
		"\2\u0096\u0097\7\22\2\2\u0097\35\3\2\2\2\u0098\u0099\7\20\2\2\u0099\u009a"+
		"\7\22\2\2\u009a\37\3\2\2\2\u009b\u009c\7\3\2\2\u009c\u009d\7\22\2\2\u009d"+
		"!\3\2\2\2\u009e\u009f\7\7\2\2\u009f\u00a0\7\22\2\2\u00a0#\3\2\2\2\u00a1"+
		"\u00a4\5&\24\2\u00a2\u00a4\5(\25\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4%\3\2\2\2\u00a5\u00a6\7\13\2\2\u00a6\'\3\2\2\2\u00a7\u00a8\7"+
		"\t\2\2\u00a8)\3\2\2\2\u00a9\u00ab\7\4\2\2\u00aa\u00ac\7\26\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\22\2\2"+
		"\u00ae+\3\2\2\2\u00af\u00b4\5.\30\2\u00b0\u00b4\5\60\31\2\u00b1\u00b4"+
		"\5\62\32\2\u00b2\u00b4\5\20\t\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4-\3\2\2\2\u00b5\u00b6"+
		"\5\30\r\2\u00b6\u00b7\7\r\2\2\u00b7\u00b8\5\30\r\2\u00b8/\3\2\2\2\u00b9"+
		"\u00bb\7\16\2\2\u00ba\u00bc\5\30\r\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3"+
		"\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\7\17\2\2\u00c0\61\3\2\2\2\u00c1\u00c3\7\b\2\2\u00c2\u00c4\5\26"+
		"\f\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\n\2\2\u00c8\u00c9\7\22"+
		"\2\2\u00c9\63\3\2\2\2\309<AFHMU[fmu|\u0081\u0085\u0088\u008b\u0093\u00a3"+
		"\u00ab\u00b3\u00bd\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}