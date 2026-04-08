// Generated from CalcLang.g by ANTLR 4.5
package calclang.parser; import static calclang.AST.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Print=9, 
		Dot=10, Number=11, Identifier=12, Letter=13, LetterOrDigit=14, AT=15, 
		ELLIPSIS=16, WS=17, Comment=18, Line_Comment=19;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_exp = 2, RULE_term = 3, RULE_factor = 4, 
		RULE_base = 5, RULE_number = 6;
	public static final String[] ruleNames = {
		"program", "stmt", "exp", "term", "factor", "base", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':='", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'print'", 
		"'.'", null, null, null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "Print", "Dot", 
		"Number", "Identifier", "Letter", "LetterOrDigit", "AT", "ELLIPSIS", "WS", 
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
	public String getGrammarFileName() { return "CalcLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcLangParser(TokenStream input) {
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
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(24);
			switch (_input.LA(1)) {
			case Print:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(Print);
				setState(18);
				((StmtContext)_localctx).e = exp(0);
				 ((StmtContext)_localctx).ast =  new PrintExp(((StmtContext)_localctx).e.ast); 
				}
				break;
			case T__2:
			case T__6:
			case Number:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
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
		public TerminalNode Identifier() { return getToken(CalcLangParser.Identifier, 0); }
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
			setState(35);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(27);
				((ExpContext)_localctx).i = match(Identifier);
				setState(28);
				match(T__0);
				setState(29);
				((ExpContext)_localctx).r = exp(4);
				 ((ExpContext)_localctx).ast =  new AssignExp((((ExpContext)_localctx).i!=null?((ExpContext)_localctx).i.getText():null), ((ExpContext)_localctx).r.ast); 
				}
				break;
			case 2:
				{
				setState(32);
				((ExpContext)_localctx).t = term(0);
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).t.ast; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(47);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(37);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(38);
						match(T__1);
						setState(39);
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
						setState(42);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(43);
						match(T__2);
						setState(44);
						((ExpContext)_localctx).r3 = term(0);
						 ((ExpContext)_localctx).ast =  new SubExp(((ExpContext)_localctx).l.ast, ((ExpContext)_localctx).r3.ast); 
						}
						break;
					}
					} 
				}
				setState(51);
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
			setState(53);
			((TermContext)_localctx).f = factor();
			 ((TermContext)_localctx).ast =  ((TermContext)_localctx).f.ast; 
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(66);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(56);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(57);
						match(T__3);
						setState(58);
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
						setState(61);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(62);
						match(T__4);
						setState(63);
						((TermContext)_localctx).r = factor();
						 ((TermContext)_localctx).ast =  new DivExp(((TermContext)_localctx).l.ast, ((TermContext)_localctx).r.ast); 
						}
						break;
					}
					} 
				}
				setState(70);
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
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((FactorContext)_localctx).b = base();
				setState(72);
				match(T__5);
				setState(73);
				((FactorContext)_localctx).f = factor();
				 ((FactorContext)_localctx).ast =  new PowExp(((FactorContext)_localctx).b.ast, ((FactorContext)_localctx).f.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
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
		public TerminalNode Identifier() { return getToken(CalcLangParser.Identifier, 0); }
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_base);
		try {
			setState(95);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(T__2);
				setState(82);
				((BaseContext)_localctx).b = base();
				 ((BaseContext)_localctx).ast =  new NegExp(((BaseContext)_localctx).b.ast); 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(T__6);
				setState(86);
				((BaseContext)_localctx).e = exp(0);
				setState(87);
				match(T__7);
				 ((BaseContext)_localctx).ast =  ((BaseContext)_localctx).e.ast; 
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				((BaseContext)_localctx).n = number();
				 ((BaseContext)_localctx).ast =  ((BaseContext)_localctx).n.ast; 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
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
		public TerminalNode Dot() { return getToken(CalcLangParser.Dot, 0); }
		public List<TerminalNode> Number() { return getTokens(CalcLangParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(CalcLangParser.Number, i);
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
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				((NumberContext)_localctx).n0 = match(Number);
				setState(98);
				match(Dot);
				setState(99);
				((NumberContext)_localctx).n1 = match(Number);
				 ((NumberContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumberContext)_localctx).n0!=null?((NumberContext)_localctx).n0.getText():null)+"."+(((NumberContext)_localctx).n1!=null?((NumberContext)_localctx).n1.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25l\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4&\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16\4\65\13\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5E\n\5\f\5\16\5"+
		"H\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7b\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bj\n\b\3\b\2\4\6\b\t\2\4\6\b\n\f\16\2\2o\2\20\3\2\2\2\4\32\3\2\2\2\6"+
		"%\3\2\2\2\b\66\3\2\2\2\nQ\3\2\2\2\fa\3\2\2\2\16i\3\2\2\2\20\21\5\4\3\2"+
		"\21\22\b\2\1\2\22\3\3\2\2\2\23\24\7\13\2\2\24\25\5\6\4\2\25\26\b\3\1\2"+
		"\26\33\3\2\2\2\27\30\5\6\4\2\30\31\b\3\1\2\31\33\3\2\2\2\32\23\3\2\2\2"+
		"\32\27\3\2\2\2\33\5\3\2\2\2\34\35\b\4\1\2\35\36\7\16\2\2\36\37\7\3\2\2"+
		"\37 \5\6\4\6 !\b\4\1\2!&\3\2\2\2\"#\5\b\5\2#$\b\4\1\2$&\3\2\2\2%\34\3"+
		"\2\2\2%\"\3\2\2\2&\63\3\2\2\2\'(\f\5\2\2()\7\4\2\2)*\5\b\5\2*+\b\4\1\2"+
		"+\62\3\2\2\2,-\f\4\2\2-.\7\5\2\2./\5\b\5\2/\60\b\4\1\2\60\62\3\2\2\2\61"+
		"\'\3\2\2\2\61,\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\7"+
		"\3\2\2\2\65\63\3\2\2\2\66\67\b\5\1\2\678\5\n\6\289\b\5\1\29F\3\2\2\2:"+
		";\f\5\2\2;<\7\6\2\2<=\5\n\6\2=>\b\5\1\2>E\3\2\2\2?@\f\4\2\2@A\7\7\2\2"+
		"AB\5\n\6\2BC\b\5\1\2CE\3\2\2\2D:\3\2\2\2D?\3\2\2\2EH\3\2\2\2FD\3\2\2\2"+
		"FG\3\2\2\2G\t\3\2\2\2HF\3\2\2\2IJ\5\f\7\2JK\7\b\2\2KL\5\n\6\2LM\b\6\1"+
		"\2MR\3\2\2\2NO\5\f\7\2OP\b\6\1\2PR\3\2\2\2QI\3\2\2\2QN\3\2\2\2R\13\3\2"+
		"\2\2ST\7\5\2\2TU\5\f\7\2UV\b\7\1\2Vb\3\2\2\2WX\7\t\2\2XY\5\6\4\2YZ\7\n"+
		"\2\2Z[\b\7\1\2[b\3\2\2\2\\]\5\16\b\2]^\b\7\1\2^b\3\2\2\2_`\7\16\2\2`b"+
		"\b\7\1\2aS\3\2\2\2aW\3\2\2\2a\\\3\2\2\2a_\3\2\2\2b\r\3\2\2\2cd\7\r\2\2"+
		"de\7\f\2\2ef\7\r\2\2fj\b\b\1\2gh\7\r\2\2hj\b\b\1\2ic\3\2\2\2ig\3\2\2\2"+
		"j\17\3\2\2\2\13\32%\61\63DFQai";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}