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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, NUM=14, WS=15, ID=16, PLUS=17, MINUS=18, 
		DOT=19, OCTAVE_SHIFT=20, BASE_NOTE=21, STRING=22, UP=23, DOWN=24;
	public static final String[] tokenNames = {
		"<INVALID>", "'o'", "'p'", "'\n'", "'t'", "'v'", "'['", "']'", "'#channel'", 
		"'&'", "'('", "')'", "'l'", "'#group'", "NUM", "WS", "ID", "'+'", "'-'", 
		"'.'", "OCTAVE_SHIFT", "BASE_NOTE", "STRING", "'>'", "'<'"
	};
	public static final int
		RULE_midi = 0, RULE_newline = 1, RULE_pitch_shift_sign = 2, RULE_length_shift_sign = 3, 
		RULE_statements = 4, RULE_statement = 5, RULE_channel_declaration = 6, 
		RULE_group_declaration = 7, RULE_channel = 8, RULE_command = 9, RULE_note = 10, 
		RULE_modifiers = 11, RULE_tempo = 12, RULE_length = 13, RULE_shift_sign = 14, 
		RULE_octave = 15, RULE_volume = 16, RULE_pitch_transpose = 17, RULE_playthrough = 18, 
		RULE_group = 19, RULE_tie = 20, RULE_harmony = 21, RULE_loop = 22;
	public static final String[] ruleNames = {
		"midi", "newline", "pitch_shift_sign", "length_shift_sign", "statements", 
		"statement", "channel_declaration", "group_declaration", "channel", "command", 
		"note", "modifiers", "tempo", "length", "shift_sign", "octave", "volume", 
		"pitch_transpose", "playthrough", "group", "tie", "harmony", "loop"
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
			setState(46); statements();
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
			setState(54);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(48); match(T__10);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(51); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(53); match(EOF);
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
			setState(66);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56); match(PLUS);
					}
					}
					setState(59); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS );
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61); match(MINUS);
					}
					}
					setState(64); 
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
		enterRule(_localctx, 6, RULE_length_shift_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68); match(DOT);
				}
				}
				setState(71); 
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
		enterRule(_localctx, 8, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(73); newline();
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__0) | (1L << ID))) != 0)) {
				{
				{
				setState(79); statement();
				setState(80); newline();
				}
				}
				setState(86);
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
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(90);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(87); channel_declaration();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(88); group_declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(89); channel();
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
		enterRule(_localctx, 12, RULE_channel_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(T__5);
			setState(93); ((Channel_declarationContext)_localctx).name = match(ID);
			setState(94); ((Channel_declarationContext)_localctx).instrument = match(NUM);
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
		enterRule(_localctx, 14, RULE_group_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(T__0);
			setState(97); ((Group_declarationContext)_localctx).name = match(ID);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98); command();
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__11) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__3) | (1L << T__1) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
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
		enterRule(_localctx, 16, RULE_channel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); ((ChannelContext)_localctx).channel_name = match(ID);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104); command();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__11) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__3) | (1L << T__1) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
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
		enterRule(_localctx, 18, RULE_command);
		try {
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); modifiers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111); playthrough();
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
			setState(114); ((NoteContext)_localctx).base = match(BASE_NOTE);
			setState(116);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(115); ((NoteContext)_localctx).pitch_shift = pitch_shift_sign();
				}
			}

			setState(119);
			_la = _input.LA(1);
			if (_la==OCTAVE_SHIFT) {
				{
				setState(118); ((NoteContext)_localctx).octave_shift = match(OCTAVE_SHIFT);
				}
			}

			setState(122);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(121); ((NoteContext)_localctx).note_length = match(NUM);
				}
			}

			setState(125);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(124); ((NoteContext)_localctx).length_shift = length_shift_sign();
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
		enterRule(_localctx, 22, RULE_modifiers);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(127); tempo();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); length();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(129); octave();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(130); volume();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(131); pitch_transpose();
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
		enterRule(_localctx, 24, RULE_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(T__9);
			setState(135); ((TempoContext)_localctx).value = match(NUM);
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
		enterRule(_localctx, 26, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(T__1);
			setState(138); ((LengthContext)_localctx).value = match(NUM);
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
		enterRule(_localctx, 28, RULE_shift_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		enterRule(_localctx, 30, RULE_octave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(T__12);
			setState(148);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(143); ((OctaveContext)_localctx).shift = shift_sign();
				setState(145);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(144); ((OctaveContext)_localctx).value = match(NUM);
					}
				}

				}
				break;
			case NUM:
				{
				setState(147); ((OctaveContext)_localctx).value = match(NUM);
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
		enterRule(_localctx, 32, RULE_volume);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(T__8);
			setState(156);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(151); ((VolumeContext)_localctx).shift = shift_sign();
				setState(153);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(152); ((VolumeContext)_localctx).value = match(NUM);
					}
				}

				}
				break;
			case NUM:
				{
				setState(155); ((VolumeContext)_localctx).value = match(NUM);
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
		enterRule(_localctx, 34, RULE_pitch_transpose);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(T__11);
			setState(167);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
				{
				setState(159); ((Pitch_transposeContext)_localctx).shift = shift_sign();
				setState(161);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(160); ((Pitch_transposeContext)_localctx).value = match(NUM);
					}
				}

				}
				break;
			case NUM:
			case MINUS:
				{
				{
				setState(164);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(163); ((Pitch_transposeContext)_localctx).negative = match(MINUS);
					}
				}

				setState(166); ((Pitch_transposeContext)_localctx).value = match(NUM);
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
		enterRule(_localctx, 36, RULE_playthrough);
		try {
			setState(173);
			switch (_input.LA(1)) {
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(169); tie();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(170); harmony();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(171); loop();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(172); group();
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
		enterRule(_localctx, 38, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); ((GroupContext)_localctx).name = match(ID);
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
		enterRule(_localctx, 40, RULE_tie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); ((TieContext)_localctx).note1 = note();
			setState(178); match(T__4);
			setState(179); ((TieContext)_localctx).note2 = note();
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
		enterRule(_localctx, 42, RULE_harmony);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(T__3);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182); note();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BASE_NOTE );
			setState(187); match(T__2);
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
		enterRule(_localctx, 44, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(T__7);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190); command();
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__11) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__3) | (1L << T__1) | (1L << ID) | (1L << BASE_NOTE))) != 0) );
			setState(195); match(T__6);
			setState(196); ((LoopContext)_localctx).value = match(NUM);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u00c9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\6\3\64\n\3\r\3\16\3\65\3\3\5\39\n\3\3\4\6\4<\n\4\r\4\16\4=\3\4\6\4"+
		"A\n\4\r\4\16\4B\5\4E\n\4\3\5\6\5H\n\5\r\5\16\5I\3\6\7\6M\n\6\f\6\16\6"+
		"P\13\6\3\6\3\6\3\6\7\6U\n\6\f\6\16\6X\13\6\3\7\3\7\3\7\5\7]\n\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\6\tf\n\t\r\t\16\tg\3\n\3\n\6\nl\n\n\r\n\16\nm\3"+
		"\13\3\13\3\13\5\13s\n\13\3\f\3\f\5\fw\n\f\3\f\5\fz\n\f\3\f\5\f}\n\f\3"+
		"\f\5\f\u0080\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u0087\n\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\5\21\u0094\n\21\3\21\5\21\u0097\n"+
		"\21\3\22\3\22\3\22\5\22\u009c\n\22\3\22\5\22\u009f\n\22\3\23\3\23\3\23"+
		"\5\23\u00a4\n\23\3\23\5\23\u00a7\n\23\3\23\5\23\u00aa\n\23\3\24\3\24\3"+
		"\24\3\24\5\24\u00b0\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\6\27"+
		"\u00ba\n\27\r\27\16\27\u00bb\3\27\3\27\3\30\3\30\6\30\u00c2\n\30\r\30"+
		"\16\30\u00c3\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\2\3\3\2\31\32\u00d3\2\60\3\2\2\2\48\3\2\2\2\6D\3\2"+
		"\2\2\bG\3\2\2\2\nN\3\2\2\2\f\\\3\2\2\2\16^\3\2\2\2\20b\3\2\2\2\22i\3\2"+
		"\2\2\24r\3\2\2\2\26t\3\2\2\2\30\u0086\3\2\2\2\32\u0088\3\2\2\2\34\u008b"+
		"\3\2\2\2\36\u008e\3\2\2\2 \u0090\3\2\2\2\"\u0098\3\2\2\2$\u00a0\3\2\2"+
		"\2&\u00af\3\2\2\2(\u00b1\3\2\2\2*\u00b3\3\2\2\2,\u00b7\3\2\2\2.\u00bf"+
		"\3\2\2\2\60\61\5\n\6\2\61\3\3\2\2\2\62\64\7\5\2\2\63\62\3\2\2\2\64\65"+
		"\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\669\3\2\2\2\679\7\2\2\38\63\3\2\2"+
		"\28\67\3\2\2\29\5\3\2\2\2:<\7\23\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3"+
		"\2\2\2>E\3\2\2\2?A\7\24\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE"+
		"\3\2\2\2D;\3\2\2\2D@\3\2\2\2E\7\3\2\2\2FH\7\25\2\2GF\3\2\2\2HI\3\2\2\2"+
		"IG\3\2\2\2IJ\3\2\2\2J\t\3\2\2\2KM\5\4\3\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2"+
		"\2NO\3\2\2\2OV\3\2\2\2PN\3\2\2\2QR\5\f\7\2RS\5\4\3\2SU\3\2\2\2TQ\3\2\2"+
		"\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\13\3\2\2\2XV\3\2\2\2Y]\5\16\b\2Z]\5"+
		"\20\t\2[]\5\22\n\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\r\3\2\2\2^_\7\n\2"+
		"\2_`\7\22\2\2`a\7\20\2\2a\17\3\2\2\2bc\7\17\2\2ce\7\22\2\2df\5\24\13\2"+
		"ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\21\3\2\2\2ik\7\22\2\2jl\5\24"+
		"\13\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\23\3\2\2\2os\5\26\f\2p"+
		"s\5\30\r\2qs\5&\24\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\25\3\2\2\2tv\7\27"+
		"\2\2uw\5\6\4\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xz\7\26\2\2yx\3\2\2\2yz\3"+
		"\2\2\2z|\3\2\2\2{}\7\20\2\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080\5"+
		"\b\5\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\27\3\2\2\2\u0081\u0087\5\32"+
		"\16\2\u0082\u0087\5\34\17\2\u0083\u0087\5 \21\2\u0084\u0087\5\"\22\2\u0085"+
		"\u0087\5$\23\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\31\3\2\2\2\u0088\u0089"+
		"\7\6\2\2\u0089\u008a\7\20\2\2\u008a\33\3\2\2\2\u008b\u008c\7\16\2\2\u008c"+
		"\u008d\7\20\2\2\u008d\35\3\2\2\2\u008e\u008f\t\2\2\2\u008f\37\3\2\2\2"+
		"\u0090\u0096\7\3\2\2\u0091\u0093\5\36\20\2\u0092\u0094\7\20\2\2\u0093"+
		"\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0097\7\20"+
		"\2\2\u0096\u0091\3\2\2\2\u0096\u0095\3\2\2\2\u0097!\3\2\2\2\u0098\u009e"+
		"\7\7\2\2\u0099\u009b\5\36\20\2\u009a\u009c\7\20\2\2\u009b\u009a\3\2\2"+
		"\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009f\7\20\2\2\u009e"+
		"\u0099\3\2\2\2\u009e\u009d\3\2\2\2\u009f#\3\2\2\2\u00a0\u00a9\7\4\2\2"+
		"\u00a1\u00a3\5\36\20\2\u00a2\u00a4\7\20\2\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00aa\3\2\2\2\u00a5\u00a7\7\24\2\2\u00a6\u00a5\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\7\20\2\2\u00a9"+
		"\u00a1\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa%\3\2\2\2\u00ab\u00b0\5*\26\2"+
		"\u00ac\u00b0\5,\27\2\u00ad\u00b0\5.\30\2\u00ae\u00b0\5(\25\2\u00af\u00ab"+
		"\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\'\3\2\2\2\u00b1\u00b2\7\22\2\2\u00b2)\3\2\2\2\u00b3\u00b4\5\26\f\2\u00b4"+
		"\u00b5\7\13\2\2\u00b5\u00b6\5\26\f\2\u00b6+\3\2\2\2\u00b7\u00b9\7\f\2"+
		"\2\u00b8\u00ba\5\26\f\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\r"+
		"\2\2\u00be-\3\2\2\2\u00bf\u00c1\7\b\2\2\u00c0\u00c2\5\24\13\2\u00c1\u00c0"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\7\t\2\2\u00c6\u00c7\7\20\2\2\u00c7/\3\2\2\2"+
		"\35\658=BDINV\\gmrvy|\177\u0086\u0093\u0096\u009b\u009e\u00a3\u00a6\u00a9"+
		"\u00af\u00bb\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}