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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Print=9, 
		Shout=10, Spot=11, Level=12, Dot=13, Number=14, Identifier=15, Letter=16, 
		LetterOrDigit=17, AT=18, ELLIPSIS=19, WS=20, Comment=21, Line_Comment=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Print", 
		"Shout", "Spot", "Level", "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", 
		"DIGIT", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
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
		case 15:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 16:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\6\17]\n\17\r\17\16\17^\3\20\3\20"+
		"\7\20c\n\20\f\20\16\20f\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21n\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22v\n\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\6\26\u0081\n\26\r\26\16\26\u0082\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\7\27\u008b\n\27\f\27\16\27\u008e\13\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\7\30\u0099\n\30\f\30\16\30\u009c\13\30\3\30\3"+
		"\30\3\u008c\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\2\'\24)\25+\26-\27/\30\3\2\t\6\2&&C\\a"+
		"ac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;"+
		"C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u00a6\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\64\3\2\2\2\7\66\3"+
		"\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21@\3\2\2\2\23B\3"+
		"\2\2\2\25H\3\2\2\2\27N\3\2\2\2\31S\3\2\2\2\33Y\3\2\2\2\35\\\3\2\2\2\37"+
		"`\3\2\2\2!m\3\2\2\2#u\3\2\2\2%w\3\2\2\2\'y\3\2\2\2){\3\2\2\2+\u0080\3"+
		"\2\2\2-\u0086\3\2\2\2/\u0094\3\2\2\2\61\62\7<\2\2\62\63\7?\2\2\63\4\3"+
		"\2\2\2\64\65\7-\2\2\65\6\3\2\2\2\66\67\7/\2\2\67\b\3\2\2\289\7,\2\29\n"+
		"\3\2\2\2:;\7\61\2\2;\f\3\2\2\2<=\7`\2\2=\16\3\2\2\2>?\7*\2\2?\20\3\2\2"+
		"\2@A\7+\2\2A\22\3\2\2\2BC\7r\2\2CD\7t\2\2DE\7k\2\2EF\7p\2\2FG\7v\2\2G"+
		"\24\3\2\2\2HI\7u\2\2IJ\7j\2\2JK\7q\2\2KL\7w\2\2LM\7v\2\2M\26\3\2\2\2N"+
		"O\7u\2\2OP\7r\2\2PQ\7q\2\2QR\7v\2\2R\30\3\2\2\2ST\7n\2\2TU\7g\2\2UV\7"+
		"x\2\2VW\7g\2\2WX\7n\2\2X\32\3\2\2\2YZ\7\60\2\2Z\34\3\2\2\2[]\5%\23\2\\"+
		"[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\36\3\2\2\2`d\5!\21\2ac\5#\22"+
		"\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e \3\2\2\2fd\3\2\2\2gn\t\2\2"+
		"\2hi\n\3\2\2in\6\21\2\2jk\t\4\2\2kl\t\5\2\2ln\6\21\3\2mg\3\2\2\2mh\3\2"+
		"\2\2mj\3\2\2\2n\"\3\2\2\2ov\t\6\2\2pq\n\3\2\2qv\6\22\4\2rs\t\4\2\2st\t"+
		"\5\2\2tv\6\22\5\2uo\3\2\2\2up\3\2\2\2ur\3\2\2\2v$\3\2\2\2wx\4\62;\2x&"+
		"\3\2\2\2yz\7B\2\2z(\3\2\2\2{|\7\60\2\2|}\7\60\2\2}~\7\60\2\2~*\3\2\2\2"+
		"\177\u0081\t\7\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\26\2\2\u0085"+
		",\3\2\2\2\u0086\u0087\7\61\2\2\u0087\u0088\7,\2\2\u0088\u008c\3\2\2\2"+
		"\u0089\u008b\13\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0090\7,\2\2\u0090\u0091\7\61\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\27"+
		"\2\2\u0093.\3\2\2\2\u0094\u0095\7\61\2\2\u0095\u0096\7\61\2\2\u0096\u009a"+
		"\3\2\2\2\u0097\u0099\n\b\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009e\b\30\2\2\u009e\60\3\2\2\2\n\2^dmu\u0082\u008c\u009a\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}