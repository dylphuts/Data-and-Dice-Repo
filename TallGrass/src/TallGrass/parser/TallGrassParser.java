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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Print=9, 
		Shout=10, Spot=11, Level=12, Dot=13, Number=14, Identifier=15, Letter=16, 
		LetterOrDigit=17, AT=18, ELLIPSIS=19, WS=20, Comment=21, Line_Comment=22;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_exp = 2, RULE_term = 3, RULE_factor = 4, 
		RULE_base = 5, RULE_number = 6;
	public static final String[] ruleNames = {
		"program", "stmt", "exp", "term", "factor", "base", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':='", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'print'", 
		"'shout'", "'spot'", "'level'", "'.'", null, null, null, null, "'@'", 
		"'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "Print", "Shout", 
		"Spot", "Level", "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", 
		"AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
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
			setState(14);
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
		public ExpContext e;
		public TerminalNode Spot() { return getToken(TallGrassParser.Spot, 0); }
		public TerminalNode Level() { return getToken(TallGrassParser.Level, 0); }
		public TerminalNode Identifier() { return getToken(TallGrassParser.Identifier, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
			setState(34);
			switch (_input.LA(1)) {
			case Spot:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(Spot);
				setState(18);
				((StmtContext)_localctx).i = match(Identifier);
				setState(19);
				match(Level);
				setState(20);
				((StmtContext)_localctx).r = exp(0);
				 ((StmtContext)_localctx).ast =  new SpotStmt((((StmtContext)_localctx).i!=null?((StmtContext)_localctx).i.getText():null), ((StmtContext)_localctx).r.ast); 
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(Print);
				setState(24);
				((StmtContext)_localctx).e = exp(0);
				 ((StmtContext)_localctx).ast =  new PrintExp(((StmtContext)_localctx).e.ast); 
				}
				break;
			case Shout:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				match(Shout);
				setState(28);
				((StmtContext)_localctx).e = exp(0);
				 ((StmtContext)_localctx).ast =  new ShoutExp(((StmtContext)_localctx).e.ast); 
				}
				break;
			case T__2:
			case T__6:
			case Number:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
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
		public TermContext t;
		public TermContext r2;
		public TermContext r3;
		public TerminalNode Identifier() { return getToken(TallGrassParser.Identifier, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
			setState(45);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(37);
				((ExpContext)_localctx).i = match(Identifier);
				setState(38);
				match(T__0);
				setState(39);
				((ExpContext)_localctx).r = exp(4);
				 ((ExpContext)_localctx).ast =  new AssignExp((((ExpContext)_localctx).i!=null?((ExpContext)_localctx).i.getText():null), ((ExpContext)_localctx).r.ast); 
				}
				break;
			case 2:
				{
				setState(42);
				((ExpContext)_localctx).t = term(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).t.ast; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(57);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(47);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(48);
						match(T__1);
						setState(49);
						((ExpContext)_localctx).r2 = term(0);
						 ((ExpContext)_localctx).ast =  new AddExp(((ExpContext)_localctx).l.ast, ((ExpContext)_localctx).r2.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(52);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(53);
						match(T__2);
						setState(54);
						((ExpContext)_localctx).r3 = term(0);
						 ((ExpContext)_localctx).ast =  new SubExp(((ExpContext)_localctx).l.ast, ((ExpContext)_localctx).r3.ast); 
						}
						break;
					}
					} 
				}
				setState(61);
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

	public static class TermContext extends ParserRuleContext {
		public Exp ast;
		public TermContext l;
		public FactorContext f;
		public FactorContext r;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(63);
			((TermContext)_localctx).f = factor();
			 ((TermContext)_localctx).ast =  ((TermContext)_localctx).f.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(66);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(67);
						match(T__3);
						setState(68);
						((TermContext)_localctx).r = factor();
						 ((TermContext)_localctx).ast =  new MulExp(((TermContext)_localctx).l.ast, ((TermContext)_localctx).r.ast); 
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(71);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(72);
						match(T__4);
						setState(73);
						((TermContext)_localctx).r = factor();
						 ((TermContext)_localctx).ast =  new DivExp(((TermContext)_localctx).l.ast, ((TermContext)_localctx).r.ast); 
						}
						break;
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public Exp ast;
		public BaseContext b;
		public FactorContext f;
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_factor);
		try {
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				((FactorContext)_localctx).b = base();
				setState(82);
				match(T__5);
				setState(83);
				((FactorContext)_localctx).f = factor();
				 ((FactorContext)_localctx).ast =  new PowExp(((FactorContext)_localctx).b.ast, ((FactorContext)_localctx).f.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				((FactorContext)_localctx).b = base();
				 ((FactorContext)_localctx).ast =  ((FactorContext)_localctx).b.ast; 
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

	public static class BaseContext extends ParserRuleContext {
		public Exp ast;
		public BaseContext b;
		public ExpContext e;
		public NumberContext n;
		public Token i;
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TallGrassParser.Identifier, 0); }
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_base);
		try {
			setState(105);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(T__2);
				setState(92);
				((BaseContext)_localctx).b = base();
				 ((BaseContext)_localctx).ast =  new NegExp(((BaseContext)_localctx).b.ast); 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__6);
				setState(96);
				((BaseContext)_localctx).e = exp(0);
				setState(97);
				match(T__7);
				 ((BaseContext)_localctx).ast =  ((BaseContext)_localctx).e.ast; 
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				((BaseContext)_localctx).n = number();
				 ((BaseContext)_localctx).ast =  ((BaseContext)_localctx).n.ast; 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				((BaseContext)_localctx).i = match(Identifier);
				 ((BaseContext)_localctx).ast =  new VarExp((((BaseContext)_localctx).i!=null?((BaseContext)_localctx).i.getText():null)); 
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
		enterRule(_localctx, 12, RULE_number);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
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
		case 3:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30v\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5O\n\5\f\5\16\5R\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bt\n\b\3\b\2\4\6\b\t\2\4\6\b\n\f"+
		"\16\2\2{\2\20\3\2\2\2\4$\3\2\2\2\6/\3\2\2\2\b@\3\2\2\2\n[\3\2\2\2\fk\3"+
		"\2\2\2\16s\3\2\2\2\20\21\5\4\3\2\21\22\b\2\1\2\22\3\3\2\2\2\23\24\7\r"+
		"\2\2\24\25\7\21\2\2\25\26\7\16\2\2\26\27\5\6\4\2\27\30\b\3\1\2\30%\3\2"+
		"\2\2\31\32\7\13\2\2\32\33\5\6\4\2\33\34\b\3\1\2\34%\3\2\2\2\35\36\7\f"+
		"\2\2\36\37\5\6\4\2\37 \b\3\1\2 %\3\2\2\2!\"\5\6\4\2\"#\b\3\1\2#%\3\2\2"+
		"\2$\23\3\2\2\2$\31\3\2\2\2$\35\3\2\2\2$!\3\2\2\2%\5\3\2\2\2&\'\b\4\1\2"+
		"\'(\7\21\2\2()\7\3\2\2)*\5\6\4\6*+\b\4\1\2+\60\3\2\2\2,-\5\b\5\2-.\b\4"+
		"\1\2.\60\3\2\2\2/&\3\2\2\2/,\3\2\2\2\60=\3\2\2\2\61\62\f\5\2\2\62\63\7"+
		"\4\2\2\63\64\5\b\5\2\64\65\b\4\1\2\65<\3\2\2\2\66\67\f\4\2\2\678\7\5\2"+
		"\289\5\b\5\29:\b\4\1\2:<\3\2\2\2;\61\3\2\2\2;\66\3\2\2\2<?\3\2\2\2=;\3"+
		"\2\2\2=>\3\2\2\2>\7\3\2\2\2?=\3\2\2\2@A\b\5\1\2AB\5\n\6\2BC\b\5\1\2CP"+
		"\3\2\2\2DE\f\5\2\2EF\7\6\2\2FG\5\n\6\2GH\b\5\1\2HO\3\2\2\2IJ\f\4\2\2J"+
		"K\7\7\2\2KL\5\n\6\2LM\b\5\1\2MO\3\2\2\2ND\3\2\2\2NI\3\2\2\2OR\3\2\2\2"+
		"PN\3\2\2\2PQ\3\2\2\2Q\t\3\2\2\2RP\3\2\2\2ST\5\f\7\2TU\7\b\2\2UV\5\n\6"+
		"\2VW\b\6\1\2W\\\3\2\2\2XY\5\f\7\2YZ\b\6\1\2Z\\\3\2\2\2[S\3\2\2\2[X\3\2"+
		"\2\2\\\13\3\2\2\2]^\7\5\2\2^_\5\f\7\2_`\b\7\1\2`l\3\2\2\2ab\7\t\2\2bc"+
		"\5\6\4\2cd\7\n\2\2de\b\7\1\2el\3\2\2\2fg\5\16\b\2gh\b\7\1\2hl\3\2\2\2"+
		"ij\7\21\2\2jl\b\7\1\2k]\3\2\2\2ka\3\2\2\2kf\3\2\2\2ki\3\2\2\2l\r\3\2\2"+
		"\2mn\7\20\2\2no\7\17\2\2op\7\20\2\2pt\b\b\1\2qr\7\20\2\2rt\b\b\1\2sm\3"+
		"\2\2\2sq\3\2\2\2t\17\3\2\2\2\13$/;=NP[ks";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}