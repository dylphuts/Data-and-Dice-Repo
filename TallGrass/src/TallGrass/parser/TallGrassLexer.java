// Generated from TallGrass.g by ANTLR 4.5
package TallGrass.parser;

import static TallGrass.AST.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TallGrassLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, Print=12, Shout=13, Spot=14, Level=15, Check=16, Retreat=17, 
		Dot=18, Number=19, String=20, Identifier=21, Letter=22, LetterOrDigit=23, 
		AT=24, ELLIPSIS=25, WS=26, Comment=27, Line_Comment=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "Print", "Shout", "Spot", "Level", "Check", "Retreat", 
		"Dot", "Number", "String", "Identifier", "Letter", "LetterOrDigit", "DIGIT", 
		"AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
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


	public TallGrassLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TallGrass.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 22:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00c9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\6"+
		"\24~\n\24\r\24\16\24\177\3\25\3\25\7\25\u0084\n\25\f\25\16\25\u0087\13"+
		"\25\3\25\3\25\3\26\3\26\7\26\u008d\n\26\f\26\16\26\u0090\13\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u0098\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u00a0\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\6\34\u00ab"+
		"\n\34\r\34\16\34\u00ac\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00b5\n\35\f"+
		"\35\16\35\u00b8\13\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36"+
		"\u00c3\n\36\f\36\16\36\u00c6\13\36\3\36\3\36\3\u00b6\2\37\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\2\63\32\65\33\67\349\35;\36\3\2\n\3\2$$\6"+
		"\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7"+
		"\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u00d1\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7"+
		"A\3\2\2\2\tD\3\2\2\2\13F\3\2\2\2\rH\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23"+
		"O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33[\3\2\2\2\35a\3\2\2\2"+
		"\37f\3\2\2\2!l\3\2\2\2#r\3\2\2\2%z\3\2\2\2\'}\3\2\2\2)\u0081\3\2\2\2+"+
		"\u008a\3\2\2\2-\u0097\3\2\2\2/\u009f\3\2\2\2\61\u00a1\3\2\2\2\63\u00a3"+
		"\3\2\2\2\65\u00a5\3\2\2\2\67\u00aa\3\2\2\29\u00b0\3\2\2\2;\u00be\3\2\2"+
		"\2=>\7*\2\2>\4\3\2\2\2?@\7+\2\2@\6\3\2\2\2AB\7<\2\2BC\7?\2\2C\b\3\2\2"+
		"\2DE\7@\2\2E\n\3\2\2\2FG\7>\2\2G\f\3\2\2\2HI\7?\2\2IJ\7?\2\2J\16\3\2\2"+
		"\2KL\7-\2\2L\20\3\2\2\2MN\7/\2\2N\22\3\2\2\2OP\7,\2\2P\24\3\2\2\2QR\7"+
		"\61\2\2R\26\3\2\2\2ST\7`\2\2T\30\3\2\2\2UV\7r\2\2VW\7t\2\2WX\7k\2\2XY"+
		"\7p\2\2YZ\7v\2\2Z\32\3\2\2\2[\\\7u\2\2\\]\7j\2\2]^\7q\2\2^_\7w\2\2_`\7"+
		"v\2\2`\34\3\2\2\2ab\7u\2\2bc\7r\2\2cd\7q\2\2de\7v\2\2e\36\3\2\2\2fg\7"+
		"n\2\2gh\7g\2\2hi\7x\2\2ij\7g\2\2jk\7n\2\2k \3\2\2\2lm\7e\2\2mn\7j\2\2"+
		"no\7g\2\2op\7e\2\2pq\7m\2\2q\"\3\2\2\2rs\7t\2\2st\7g\2\2tu\7v\2\2uv\7"+
		"t\2\2vw\7g\2\2wx\7c\2\2xy\7v\2\2y$\3\2\2\2z{\7\60\2\2{&\3\2\2\2|~\5\61"+
		"\31\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080(\3\2"+
		"\2\2\u0081\u0085\7$\2\2\u0082\u0084\n\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7$\2\2\u0089*\3\2\2\2\u008a\u008e"+
		"\5-\27\2\u008b\u008d\5/\30\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f,\3\2\2\2\u0090\u008e\3\2\2\2"+
		"\u0091\u0098\t\3\2\2\u0092\u0093\n\4\2\2\u0093\u0098\6\27\2\2\u0094\u0095"+
		"\t\5\2\2\u0095\u0096\t\6\2\2\u0096\u0098\6\27\3\2\u0097\u0091\3\2\2\2"+
		"\u0097\u0092\3\2\2\2\u0097\u0094\3\2\2\2\u0098.\3\2\2\2\u0099\u00a0\t"+
		"\7\2\2\u009a\u009b\n\4\2\2\u009b\u00a0\6\30\4\2\u009c\u009d\t\5\2\2\u009d"+
		"\u009e\t\6\2\2\u009e\u00a0\6\30\5\2\u009f\u0099\3\2\2\2\u009f\u009a\3"+
		"\2\2\2\u009f\u009c\3\2\2\2\u00a0\60\3\2\2\2\u00a1\u00a2\4\62;\2\u00a2"+
		"\62\3\2\2\2\u00a3\u00a4\7B\2\2\u00a4\64\3\2\2\2\u00a5\u00a6\7\60\2\2\u00a6"+
		"\u00a7\7\60\2\2\u00a7\u00a8\7\60\2\2\u00a8\66\3\2\2\2\u00a9\u00ab\t\b"+
		"\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\34\2\2\u00af8\3\2\2\2"+
		"\u00b0\u00b1\7\61\2\2\u00b1\u00b2\7,\2\2\u00b2\u00b6\3\2\2\2\u00b3\u00b5"+
		"\13\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b7\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba"+
		"\7,\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\35\2\2"+
		"\u00bd:\3\2\2\2\u00be\u00bf\7\61\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c4"+
		"\3\2\2\2\u00c1\u00c3\n\t\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00c8\b\36\2\2\u00c8<\3\2\2\2\13\2\177\u0085\u008e\u0097\u009f"+
		"\u00ac\u00b6\u00c4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}