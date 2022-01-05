// Generated from C:/Users/User/Desktop/CPSC410/410Project1Group17/src/parser\firstParser.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class firstParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REPEAT_START=1, TIMES=2, LEFT_BRACKET=3, RIGHT_BRACKET=4, WAIT=5, AT=6, 
		PRESS=7, HOLD_START=8, WRITE=9, HOVER=10, NEW=11, SET=12, PRINT=13, OPERATION=14, 
		COMMA=15, WS=16, TEXT=17, STRING=18, NAME=19, CONST=20, EXP_SEP=21, EXP_COMMA=22, 
		SPACE=23, NEWLINE=24;
	public static final int
		RULE_program = 0, RULE_code = 1, RULE_repeat = 2, RULE_hold = 3, RULE_command = 4, 
		RULE_waitFor = 5, RULE_press = 6, RULE_hover = 7, RULE_write = 8, RULE_mouse = 9, 
		RULE_coord = 10, RULE_keys = 11, RULE_var = 12, RULE_declare = 13, RULE_assign = 14, 
		RULE_operation = 15, RULE_print = 16, RULE_exp = 17, RULE_usage = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code", "repeat", "hold", "command", "waitFor", "press", "hover", 
			"write", "mouse", "coord", "keys", "var", "declare", "assign", "operation", 
			"print", "exp", "usage"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'times'", "'{'", "'}'", null, null, null, null, null, null, 
			"'new'", "'set'", "'print'", null, null, null, null, null, null, null, 
			"'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REPEAT_START", "TIMES", "LEFT_BRACKET", "RIGHT_BRACKET", "WAIT", 
			"AT", "PRESS", "HOLD_START", "WRITE", "HOVER", "NEW", "SET", "PRINT", 
			"OPERATION", "COMMA", "WS", "TEXT", "STRING", "NAME", "CONST", "EXP_SEP", 
			"EXP_COMMA", "SPACE", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "firstParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public firstParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				code();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT_START) | (1L << WAIT) | (1L << PRESS) | (1L << HOLD_START) | (1L << WRITE) | (1L << HOVER) | (1L << NEW) | (1L << SET) | (1L << PRINT) | (1L << OPERATION))) != 0) );
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

	public static class CodeContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public HoldContext hold() {
			return getRuleContext(HoldContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WAIT:
			case PRESS:
			case WRITE:
			case HOVER:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				command();
				}
				break;
			case REPEAT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				repeat();
				}
				break;
			case HOLD_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				hold();
				}
				break;
			case NEW:
			case SET:
			case PRINT:
			case OPERATION:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				var();
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

	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT_START() { return getToken(firstParser.REPEAT_START, 0); }
		public TerminalNode TEXT() { return getToken(firstParser.TEXT, 0); }
		public TerminalNode TIMES() { return getToken(firstParser.TIMES, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(firstParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(firstParser.RIGHT_BRACKET, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(REPEAT_START);
			setState(50);
			match(TEXT);
			setState(51);
			match(TIMES);
			setState(52);
			match(LEFT_BRACKET);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				code();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT_START) | (1L << WAIT) | (1L << PRESS) | (1L << HOLD_START) | (1L << WRITE) | (1L << HOVER) | (1L << NEW) | (1L << SET) | (1L << PRINT) | (1L << OPERATION))) != 0) );
			setState(58);
			match(RIGHT_BRACKET);
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

	public static class HoldContext extends ParserRuleContext {
		public TerminalNode HOLD_START() { return getToken(firstParser.HOLD_START, 0); }
		public KeysContext keys() {
			return getRuleContext(KeysContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(firstParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(firstParser.RIGHT_BRACKET, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public HoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterHold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitHold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitHold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoldContext hold() throws RecognitionException {
		HoldContext _localctx = new HoldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(HOLD_START);
			setState(61);
			keys();
			setState(62);
			match(LEFT_BRACKET);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				code();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT_START) | (1L << WAIT) | (1L << PRESS) | (1L << HOLD_START) | (1L << WRITE) | (1L << HOVER) | (1L << NEW) | (1L << SET) | (1L << PRINT) | (1L << OPERATION))) != 0) );
			setState(68);
			match(RIGHT_BRACKET);
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
		public WaitForContext waitFor() {
			return getRuleContext(WaitForContext.class,0);
		}
		public PressContext press() {
			return getRuleContext(PressContext.class,0);
		}
		public HoverContext hover() {
			return getRuleContext(HoverContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WAIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				waitFor();
				}
				break;
			case PRESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				press();
				}
				break;
			case HOVER:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				hover();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				write();
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

	public static class WaitForContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(firstParser.WAIT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(firstParser.NEWLINE, 0); }
		public WaitForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterWaitFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitWaitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitWaitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaitForContext waitFor() throws RecognitionException {
		WaitForContext _localctx = new WaitForContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_waitFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(WAIT);
			setState(77);
			exp();
			setState(78);
			match(NEWLINE);
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

	public static class PressContext extends ParserRuleContext {
		public TerminalNode PRESS() { return getToken(firstParser.PRESS, 0); }
		public KeysContext keys() {
			return getRuleContext(KeysContext.class,0);
		}
		public MouseContext mouse() {
			return getRuleContext(MouseContext.class,0);
		}
		public PressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_press; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterPress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitPress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitPress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PressContext press() throws RecognitionException {
		PressContext _localctx = new PressContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_press);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(PRESS);
			setState(81);
			keys();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(82);
				mouse();
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

	public static class HoverContext extends ParserRuleContext {
		public TerminalNode HOVER() { return getToken(firstParser.HOVER, 0); }
		public MouseContext mouse() {
			return getRuleContext(MouseContext.class,0);
		}
		public HoverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hover; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterHover(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitHover(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitHover(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoverContext hover() throws RecognitionException {
		HoverContext _localctx = new HoverContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_hover);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(HOVER);
			setState(86);
			mouse();
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(firstParser.WRITE, 0); }
		public TerminalNode STRING() { return getToken(firstParser.STRING, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(WRITE);
			setState(89);
			match(STRING);
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

	public static class MouseContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(firstParser.AT, 0); }
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public MouseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mouse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterMouse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitMouse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitMouse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MouseContext mouse() throws RecognitionException {
		MouseContext _localctx = new MouseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mouse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(AT);
			setState(92);
			coord();
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

	public static class CoordContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EXP_COMMA() { return getToken(firstParser.EXP_COMMA, 0); }
		public TerminalNode NEWLINE() { return getToken(firstParser.NEWLINE, 0); }
		public CoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterCoord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitCoord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitCoord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordContext coord() throws RecognitionException {
		CoordContext _localctx = new CoordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_coord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			exp();
			setState(95);
			match(EXP_COMMA);
			setState(96);
			exp();
			setState(97);
			match(NEWLINE);
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

	public static class KeysContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(firstParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(firstParser.TEXT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(firstParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(firstParser.COMMA, i);
		}
		public KeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterKeys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitKeys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitKeys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeysContext keys() throws RecognitionException {
		KeysContext _localctx = new KeysContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_keys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(TEXT);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(100);
				match(COMMA);
				setState(101);
				match(TEXT);
				}
				}
				setState(106);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(firstParser.NEWLINE, 0); }
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				{
				setState(107);
				declare();
				}
				break;
			case SET:
				{
				setState(108);
				assign();
				}
				break;
			case OPERATION:
				{
				setState(109);
				operation();
				}
				break;
			case PRINT:
				{
				setState(110);
				print();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(113);
			match(NEWLINE);
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

	public static class DeclareContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(firstParser.NEW, 0); }
		public TerminalNode NAME() { return getToken(firstParser.NAME, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(NEW);
			setState(116);
			match(NAME);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(firstParser.SET, 0); }
		public TerminalNode NAME() { return getToken(firstParser.NAME, 0); }
		public TerminalNode EXP_SEP() { return getToken(firstParser.EXP_SEP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(SET);
			setState(119);
			match(NAME);
			setState(120);
			match(EXP_SEP);
			setState(121);
			exp();
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode OPERATION() { return getToken(firstParser.OPERATION, 0); }
		public TerminalNode NAME() { return getToken(firstParser.NAME, 0); }
		public TerminalNode EXP_COMMA() { return getToken(firstParser.EXP_COMMA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(OPERATION);
			setState(124);
			match(NAME);
			setState(125);
			match(EXP_COMMA);
			setState(126);
			exp();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(firstParser.PRINT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(PRINT);
			setState(129);
			exp();
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

	public static class ExpContext extends ParserRuleContext {
		public UsageContext usage() {
			return getRuleContext(UsageContext.class,0);
		}
		public TerminalNode CONST() { return getToken(firstParser.CONST, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				usage();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(CONST);
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

	public static class UsageContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(firstParser.NAME, 0); }
		public UsageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterUsage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitUsage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitUsage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsageContext usage() throws RecognitionException {
		UsageContext _localctx = new UsageContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_usage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(NAME);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u008c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\3\3\5\3\62\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\6\49\n\4\r\4\16\4:\3\4\3\4\3\5\3\5\3\5\3\5\6\5C\n"+
		"\5\r\5\16\5D\3\5\3\5\3\6\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\5\bV\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\7\ri\n\r\f\r\16\rl\13\r\3\16\3\16\3\16\3\16\5\16r\n\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\5\23\u0088\n\23\3\24\3\24\3\24\2\2\25\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2\u0087\2)\3\2\2\2\4\61"+
		"\3\2\2\2\6\63\3\2\2\2\b>\3\2\2\2\nL\3\2\2\2\fN\3\2\2\2\16R\3\2\2\2\20"+
		"W\3\2\2\2\22Z\3\2\2\2\24]\3\2\2\2\26`\3\2\2\2\30e\3\2\2\2\32q\3\2\2\2"+
		"\34u\3\2\2\2\36x\3\2\2\2 }\3\2\2\2\"\u0082\3\2\2\2$\u0087\3\2\2\2&\u0089"+
		"\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2"+
		"-\62\5\n\6\2.\62\5\6\4\2/\62\5\b\5\2\60\62\5\32\16\2\61-\3\2\2\2\61.\3"+
		"\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63\64\7\3\2\2\64\65\7\23"+
		"\2\2\65\66\7\4\2\2\668\7\5\2\2\679\5\4\3\28\67\3\2\2\29:\3\2\2\2:8\3\2"+
		"\2\2:;\3\2\2\2;<\3\2\2\2<=\7\6\2\2=\7\3\2\2\2>?\7\n\2\2?@\5\30\r\2@B\7"+
		"\5\2\2AC\5\4\3\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7"+
		"\6\2\2G\t\3\2\2\2HM\5\f\7\2IM\5\16\b\2JM\5\20\t\2KM\5\22\n\2LH\3\2\2\2"+
		"LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\13\3\2\2\2NO\7\7\2\2OP\5$\23\2PQ\7\32"+
		"\2\2Q\r\3\2\2\2RS\7\t\2\2SU\5\30\r\2TV\5\24\13\2UT\3\2\2\2UV\3\2\2\2V"+
		"\17\3\2\2\2WX\7\f\2\2XY\5\24\13\2Y\21\3\2\2\2Z[\7\13\2\2[\\\7\24\2\2\\"+
		"\23\3\2\2\2]^\7\b\2\2^_\5\26\f\2_\25\3\2\2\2`a\5$\23\2ab\7\30\2\2bc\5"+
		"$\23\2cd\7\32\2\2d\27\3\2\2\2ej\7\23\2\2fg\7\21\2\2gi\7\23\2\2hf\3\2\2"+
		"\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\31\3\2\2\2lj\3\2\2\2mr\5\34\17\2nr\5"+
		"\36\20\2or\5 \21\2pr\5\"\22\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2"+
		"rs\3\2\2\2st\7\32\2\2t\33\3\2\2\2uv\7\r\2\2vw\7\25\2\2w\35\3\2\2\2xy\7"+
		"\16\2\2yz\7\25\2\2z{\7\27\2\2{|\5$\23\2|\37\3\2\2\2}~\7\20\2\2~\177\7"+
		"\25\2\2\177\u0080\7\30\2\2\u0080\u0081\5$\23\2\u0081!\3\2\2\2\u0082\u0083"+
		"\7\17\2\2\u0083\u0084\5$\23\2\u0084#\3\2\2\2\u0085\u0088\5&\24\2\u0086"+
		"\u0088\7\26\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088%\3\2\2\2"+
		"\u0089\u008a\7\25\2\2\u008a\'\3\2\2\2\13+\61:DLUjq\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}