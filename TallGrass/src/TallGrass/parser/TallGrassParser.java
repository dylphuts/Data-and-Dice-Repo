// Generated from TallGrass.g by ANTLR 4.5
package TallGrass.parser;

import static TallGrass.AST.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TallGrassParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, Print=12, Shout=13, Spot=14, Level=15, Check=16, Retreat=17, 
		Dot=18, Number=19, String=20, Identifier=21, Letter=22, LetterOrDigit=23, 
		AT=24, ELLIPSIS=25, WS=26, Comment=27, Line_Comment=28;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_exp = 2, RULE_number = 3;
	public static final String[] ruleNames = {
		"program", "stmt", "exp", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':='", "'>'", "'<'", "'=='", "'+'", "'-'", "'*'", 
		"'/'", "'^'", "'print'", "'shout'", "'spot'", "'level'", "'check'", "'retreat'", 
		"'.'", null, null, null, null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Print", "Shout", "Spot", "Level", "Check", "Retreat", "Dot", "Number", 
		"String", "Identifier", "Letter", "LetterOrDigit", "AT", "ELLIPSIS", "WS", 
		"Comment", "Line_Comment"
	};
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
	public String getGrammarFileName() { return "TallGrass.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TallGrassParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public StmtContext s;
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			((ProgramContext)_localctx).s = stmt();
			 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).s.ast); 
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

	public static class StmtContext extends ParserRuleContext {
		public Exp ast;
		public Token i;
		public ExpContext r;
		public ExpContext c;
		public StmtContext body;
		public ExpContext e;
		public TerminalNode Spot() { return getToken(TallGrassParser.Spot, 0); }
		public TerminalNode Level() { return getToken(TallGrassParser.Level, 0); }
		public TerminalNode Identifier() { return getToken(TallGrassParser.Identifier, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Check() { return getToken(TallGrassParser.Check, 0); }
		public TerminalNode Retreat() { return getToken(TallGrassParser.Retreat, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode Shout() { return getToken(TallGrassParser.Shout, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(36);
			switch (_input.LA(1)) {
			case Spot:
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(Spot);
				setState(12);
				((StmtContext)_localctx).i = match(Identifier);
				setState(13);
				match(Level);
				setState(14);
				((StmtContext)_localctx).r = exp(0);
				 ((StmtContext)_localctx).ast =  new SpotStmt((((StmtContext)_localctx).i!=null?((StmtContext)_localctx).i.getText():null), ((StmtContext)_localctx).r.ast); 
				}
				break;
			case Check:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				match(Check);
				setState(18);
				match(T__0);
				setState(19);
				((StmtContext)_localctx).c = exp(0);
				setState(20);
				match(T__1);
				setState(21);
				((StmtContext)_localctx).body = stmt();
				setState(22);
				match(Retreat);
				 ((StmtContext)_localctx).ast =  new CheckStmt(((StmtContext)_localctx).c.ast, ((StmtContext)_localctx).body.ast); 
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				match(Print);
				setState(26);
				((StmtContext)_localctx).e = exp(0);
				 ((StmtContext)_localctx).ast =  new PrintExp(((StmtContext)_localctx).e.ast); 
				}
				break;
			case Shout:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				match(Shout);
				setState(30);
				((StmtContext)_localctx).e = exp(0);
				 ((StmtContext)_localctx).ast =  new ShoutExp(((StmtContext)_localctx).e.ast); 
				}
				break;
			case T__0:
			case T__7:
			case Number:
			case String:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				((StmtContext)_localctx).e = exp(0);
				 ((StmtContext)_localctx).ast =  ((StmtContext)_localctx).e.ast; 
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

	public static class ExpContext extends ParserRuleContext {
		public Exp ast;
		public ExpContext l;
		public Token i;
		public ExpContext r;
		public ExpContext e;
		public Token s;
		public NumberContext n;
		public TerminalNode Identifier() { return getToken(TallGrassParser.Identifier, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode String() { return getToken(TallGrassParser.String, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(39);
				((ExpContext)_localctx).i = match(Identifier);
				setState(40);
				match(T__2);
				setState(41);
				((ExpContext)_localctx).r = exp(14);
				 ((ExpContext)_localctx).ast =  new AssignExp((((ExpContext)_localctx).i!=null?((ExpContext)_localctx).i.getText():null), ((ExpContext)_localctx).r.ast); 
				}
				break;
			case 2:
				{
				setState(44);
				match(T__7);
				setState(45);
				((ExpContext)_localctx).e = exp(5);
				 ((ExpContext)_localctx).ast =  new NegExp(((ExpContext)_localctx).e.ast); 
				}
				break;
			case 3:
				{
				setState(48);
				match(T__0);
				setState(49);
				((ExpContext)_localctx).e = exp(0);
				setState(50);
				match(T__1);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).e.ast; 
				}
				break;
			case 4:
				{
				setState(53);
				((ExpContext)_localctx).s = match(String);
				 ((ExpContext)_localctx).ast =  new StringExp((((ExpContext)_localctx).s!=null?((ExpContext)_localctx).s.getText():null).substring(1, (((ExpContext)_localctx).s!=null?((ExpContext)_localctx).s.getText():null).length()-1)); 
				}
				break;
			case 5:
				{
				setState(55);
				((ExpContext)_localctx).n = number();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case 6:
				{
				setState(58);
				((ExpContext)_localctx).i = match(Identifier);
				 ((ExpContext)_localctx).ast =  new VarExp((((ExpContext)_localctx).i!=null?((ExpContext)_localctx).i.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(62);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(63);
						match(T__3);
						setState(64);
						((ExpContext)_localctx).r = exp(14);
						 ((ExpContext)_localctx).ast =  new GreaterExp(((ExpContext)_localctx).l.ast, ((ExpContext)_localctx).r.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(67);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(68);
						match(T__4);
						setState(69);
						((ExpContext)_localctx).r = exp(13);
						 ((ExpContext)_localctx).ast =  new LessExp(((ExpContext)_localctx).l.ast, ((ExpContext)_localctx).r.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(72);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(73);
						match(T__5);
						setState(74);
						((ExpContext)_localctx).r = exp(12);
						 ((ExpContext)_localctx).ast =  new EqualExp(((ExpContext)_localctx).l.ast, ((ExpContext)_localctx).r.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(77);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(78);
						match(T__6);
						setState(79);
						((ExpContext)_localctx).r = exp(11);
						 ((ExpContext)_localctx).ast =  new AddExp(((ExpContext)_localctx).l.ast, ((ExpContext)_localctx).r.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(82);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(83);
						match(T__7);
						setState(84);
						((ExpContext)_localctx).r = exp(10);
						 ((ExpContext)_localctx).ast =  new SubExp(((ExpContext)_localctx).l.ast, ((ExpContext)_localctx).r.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(87);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(88);
						match(T__8);
						setState(89);
						((ExpContext)_localctx).r = exp(9);
						 ((ExpContext)_localctx).ast =  new MulExp(((ExpContext)_localctx).l.ast, ((ExpContext)_localctx).r.ast); 
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(92);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(93);
						match(T__9);
						setState(94);
						((ExpContext)_localctx).r = exp(8);
						 ((ExpContext)_localctx).ast =  new DivExp(((ExpContext)_localctx).l.ast, ((ExpContext)_localctx).r.ast); 
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(97);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(98);
						match(T__10);
						setState(99);
						((ExpContext)_localctx).r = exp(7);
						 ((ExpContext)_localctx).ast =  new PowExp(((ExpContext)_localctx).l.ast, ((ExpContext)_localctx).r.ast); 
						}
						break;
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public Exp ast;
		public Token n0;
		public Token n1;
		public TerminalNode Dot() { return getToken(TallGrassParser.Dot, 0); }
		public List<TerminalNode> Number() { return getTokens(TallGrassParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(TallGrassParser.Number, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_number);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((NumberContext)_localctx).n0 = match(Number);
				setState(108);
				match(Dot);
				setState(109);
				((NumberContext)_localctx).n1 = match(Number);
				 ((NumberContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumberContext)_localctx).n0!=null?((NumberContext)_localctx).n0.getText():null)+"."+(((NumberContext)_localctx).n1!=null?((NumberContext)_localctx).n1.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				((NumberContext)_localctx).n0 = match(Number);
				 ((NumberContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumberContext)_localctx).n0!=null?((NumberContext)_localctx).n0.getText():null))); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36v\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\'\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4i\n\4\f\4\16\4l\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5t\n\5\3\5\2\3\6\6\2\4\6\b\2\2\u0083\2\n"+
		"\3\2\2\2\4&\3\2\2\2\6>\3\2\2\2\bs\3\2\2\2\n\13\5\4\3\2\13\f\b\2\1\2\f"+
		"\3\3\2\2\2\r\16\7\20\2\2\16\17\7\27\2\2\17\20\7\21\2\2\20\21\5\6\4\2\21"+
		"\22\b\3\1\2\22\'\3\2\2\2\23\24\7\22\2\2\24\25\7\3\2\2\25\26\5\6\4\2\26"+
		"\27\7\4\2\2\27\30\5\4\3\2\30\31\7\23\2\2\31\32\b\3\1\2\32\'\3\2\2\2\33"+
		"\34\7\16\2\2\34\35\5\6\4\2\35\36\b\3\1\2\36\'\3\2\2\2\37 \7\17\2\2 !\5"+
		"\6\4\2!\"\b\3\1\2\"\'\3\2\2\2#$\5\6\4\2$%\b\3\1\2%\'\3\2\2\2&\r\3\2\2"+
		"\2&\23\3\2\2\2&\33\3\2\2\2&\37\3\2\2\2&#\3\2\2\2\'\5\3\2\2\2()\b\4\1\2"+
		")*\7\27\2\2*+\7\5\2\2+,\5\6\4\20,-\b\4\1\2-?\3\2\2\2./\7\n\2\2/\60\5\6"+
		"\4\7\60\61\b\4\1\2\61?\3\2\2\2\62\63\7\3\2\2\63\64\5\6\4\2\64\65\7\4\2"+
		"\2\65\66\b\4\1\2\66?\3\2\2\2\678\7\26\2\28?\b\4\1\29:\5\b\5\2:;\b\4\1"+
		"\2;?\3\2\2\2<=\7\27\2\2=?\b\4\1\2>(\3\2\2\2>.\3\2\2\2>\62\3\2\2\2>\67"+
		"\3\2\2\2>9\3\2\2\2><\3\2\2\2?j\3\2\2\2@A\f\17\2\2AB\7\6\2\2BC\5\6\4\20"+
		"CD\b\4\1\2Di\3\2\2\2EF\f\16\2\2FG\7\7\2\2GH\5\6\4\17HI\b\4\1\2Ii\3\2\2"+
		"\2JK\f\r\2\2KL\7\b\2\2LM\5\6\4\16MN\b\4\1\2Ni\3\2\2\2OP\f\f\2\2PQ\7\t"+
		"\2\2QR\5\6\4\rRS\b\4\1\2Si\3\2\2\2TU\f\13\2\2UV\7\n\2\2VW\5\6\4\fWX\b"+
		"\4\1\2Xi\3\2\2\2YZ\f\n\2\2Z[\7\13\2\2[\\\5\6\4\13\\]\b\4\1\2]i\3\2\2\2"+
		"^_\f\t\2\2_`\7\f\2\2`a\5\6\4\nab\b\4\1\2bi\3\2\2\2cd\f\b\2\2de\7\r\2\2"+
		"ef\5\6\4\tfg\b\4\1\2gi\3\2\2\2h@\3\2\2\2hE\3\2\2\2hJ\3\2\2\2hO\3\2\2\2"+
		"hT\3\2\2\2hY\3\2\2\2h^\3\2\2\2hc\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2"+
		"k\7\3\2\2\2lj\3\2\2\2mn\7\25\2\2no\7\24\2\2op\7\25\2\2pt\b\5\1\2qr\7\25"+
		"\2\2rt\b\5\1\2sm\3\2\2\2sq\3\2\2\2t\t\3\2\2\2\7&>hjs";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}