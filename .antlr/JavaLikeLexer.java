// Generated from JavaLike.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLikeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Identifier=1, ANDAND=2, OROR=3, EQUAL=4, NOT_EQUAL=5, LESS=6, LESS_EQUAL=7, 
		GREATER=8, GREATER_EQUAL=9, EXCLAMATION=10, ASSIGN=11, SEMICOLON=12, LEFT_BRACKET=13, 
		RIGHT_BRACKET=14, RIGHT_CURLYBRACKET=15, LEFT_CURLYBRACKET=16, MAIN=17, 
		NULL=18, BOOLEAN=19, INTEGER=20, WHILE_KEYWORD=21, IF_KEYWORD=22, ELSE_KEYWORD=23, 
		ELSIF_KEYWORD=24, INTEGER_KEYWORD=25, RETURN_KEYWORD=26, BOOLEAN_KEYWORD=27, 
		WHITESPACE=28, LINE_COMMENT=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Identifier", "ANDAND", "OROR", "EQUAL", "NOT_EQUAL", "LESS", "LESS_EQUAL", 
			"GREATER", "GREATER_EQUAL", "EXCLAMATION", "ASSIGN", "SEMICOLON", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "RIGHT_CURLYBRACKET", "LEFT_CURLYBRACKET", "MAIN", "NULL", 
			"BOOLEAN", "INTEGER", "NUMBER", "DIGITS", "DIGIT", "NON_ZERO_DIGIT", 
			"WHILE_KEYWORD", "IF_KEYWORD", "ELSE_KEYWORD", "ELSIF_KEYWORD", "INTEGER_KEYWORD", 
			"RETURN_KEYWORD", "BOOLEAN_KEYWORD", "WHITESPACE", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'&&'", "'||'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'!'", "'='", "';'", "'('", "')'", "'}'", "'{'", "'public static void main(String[] argv)'", 
			"'null'", null, null, "'while'", "'if'", "'else'", "'elsif'", "'int'", 
			"'return'", "'boolean'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Identifier", "ANDAND", "OROR", "EQUAL", "NOT_EQUAL", "LESS", "LESS_EQUAL", 
			"GREATER", "GREATER_EQUAL", "EXCLAMATION", "ASSIGN", "SEMICOLON", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "RIGHT_CURLYBRACKET", "LEFT_CURLYBRACKET", "MAIN", "NULL", 
			"BOOLEAN", "INTEGER", "WHILE_KEYWORD", "IF_KEYWORD", "ELSE_KEYWORD", 
			"ELSIF_KEYWORD", "INTEGER_KEYWORD", "RETURN_KEYWORD", "BOOLEAN_KEYWORD", 
			"WHITESPACE", "LINE_COMMENT"
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


	public JavaLikeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaLike.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00f3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00a6\n\24\3\25\3\25"+
		"\3\26\3\26\3\26\5\26\u00ad\n\26\5\26\u00af\n\26\3\27\3\27\5\27\u00b3\n"+
		"\27\3\30\3\30\5\30\u00b7\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3!\6!\u00e3\n!\r!\16!\u00e4\3!\3!\3\"\3\"\3\"\3\"\7\"\u00ed"+
		"\n\"\f\"\16\"\u00f0\13\"\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2"+
		"/\2\61\2\63\27\65\30\67\319\32;\33=\34?\35A\36C\37\3\2\7\6\2&&C\\aac|"+
		"\7\2&&\62;C\\aac|\3\2\63;\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u00f6\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\3E\3\2\2\2\5L\3\2\2\2\7O\3\2\2\2\tR\3\2\2\2\13U\3\2\2\2\rX\3\2\2\2\17"+
		"Z\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2"+
		"\33h\3\2\2\2\35j\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#p\3\2\2\2%\u0097\3\2\2"+
		"\2\'\u00a5\3\2\2\2)\u00a7\3\2\2\2+\u00ae\3\2\2\2-\u00b0\3\2\2\2/\u00b6"+
		"\3\2\2\2\61\u00b8\3\2\2\2\63\u00ba\3\2\2\2\65\u00c0\3\2\2\2\67\u00c3\3"+
		"\2\2\29\u00c8\3\2\2\2;\u00ce\3\2\2\2=\u00d2\3\2\2\2?\u00d9\3\2\2\2A\u00e2"+
		"\3\2\2\2C\u00e8\3\2\2\2EI\t\2\2\2FH\t\3\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2"+
		"\2\2IJ\3\2\2\2J\4\3\2\2\2KI\3\2\2\2LM\7(\2\2MN\7(\2\2N\6\3\2\2\2OP\7~"+
		"\2\2PQ\7~\2\2Q\b\3\2\2\2RS\7?\2\2ST\7?\2\2T\n\3\2\2\2UV\7#\2\2VW\7?\2"+
		"\2W\f\3\2\2\2XY\7>\2\2Y\16\3\2\2\2Z[\7>\2\2[\\\7?\2\2\\\20\3\2\2\2]^\7"+
		"@\2\2^\22\3\2\2\2_`\7@\2\2`a\7?\2\2a\24\3\2\2\2bc\7#\2\2c\26\3\2\2\2d"+
		"e\7?\2\2e\30\3\2\2\2fg\7=\2\2g\32\3\2\2\2hi\7*\2\2i\34\3\2\2\2jk\7+\2"+
		"\2k\36\3\2\2\2lm\7\177\2\2m \3\2\2\2no\7}\2\2o\"\3\2\2\2pq\7r\2\2qr\7"+
		"w\2\2rs\7d\2\2st\7n\2\2tu\7k\2\2uv\7e\2\2vw\7\"\2\2wx\7u\2\2xy\7v\2\2"+
		"yz\7c\2\2z{\7v\2\2{|\7k\2\2|}\7e\2\2}~\7\"\2\2~\177\7x\2\2\177\u0080\7"+
		"q\2\2\u0080\u0081\7k\2\2\u0081\u0082\7f\2\2\u0082\u0083\7\"\2\2\u0083"+
		"\u0084\7o\2\2\u0084\u0085\7c\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2"+
		"\u0087\u0088\7*\2\2\u0088\u0089\7U\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\7t\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e\7i\2\2\u008e"+
		"\u008f\7]\2\2\u008f\u0090\7_\2\2\u0090\u0091\7\"\2\2\u0091\u0092\7c\2"+
		"\2\u0092\u0093\7t\2\2\u0093\u0094\7i\2\2\u0094\u0095\7x\2\2\u0095\u0096"+
		"\7+\2\2\u0096$\3\2\2\2\u0097\u0098\7p\2\2\u0098\u0099\7w\2\2\u0099\u009a"+
		"\7n\2\2\u009a\u009b\7n\2\2\u009b&\3\2\2\2\u009c\u009d\7v\2\2\u009d\u009e"+
		"\7t\2\2\u009e\u009f\7w\2\2\u009f\u00a6\7g\2\2\u00a0\u00a1\7h\2\2\u00a1"+
		"\u00a2\7c\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a6\7g\2\2"+
		"\u00a5\u009c\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a6(\3\2\2\2\u00a7\u00a8\5"+
		"+\26\2\u00a8*\3\2\2\2\u00a9\u00af\7\62\2\2\u00aa\u00ac\5\61\31\2\u00ab"+
		"\u00ad\5-\27\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af,\3\2\2\2\u00b0\u00b2"+
		"\5/\30\2\u00b1\u00b3\5/\30\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		".\3\2\2\2\u00b4\u00b7\7\62\2\2\u00b5\u00b7\5\61\31\2\u00b6\u00b4\3\2\2"+
		"\2\u00b6\u00b5\3\2\2\2\u00b7\60\3\2\2\2\u00b8\u00b9\t\4\2\2\u00b9\62\3"+
		"\2\2\2\u00ba\u00bb\7y\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00be\7n\2\2\u00be\u00bf\7g\2\2\u00bf\64\3\2\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7h\2\2\u00c2\66\3\2\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7n\2\2\u00c5"+
		"\u00c6\7u\2\2\u00c6\u00c7\7g\2\2\u00c78\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7h\2\2"+
		"\u00cd:\3\2\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7v\2"+
		"\2\u00d1<\3\2\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7"+
		"v\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7p\2\2\u00d8>"+
		"\3\2\2\2\u00d9\u00da\7d\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7q\2\2\u00dc"+
		"\u00dd\7n\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7p\2\2"+
		"\u00e0@\3\2\2\2\u00e1\u00e3\t\5\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3"+
		"\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\b!\2\2\u00e7B\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ea\7\61\2\2"+
		"\u00ea\u00ee\3\2\2\2\u00eb\u00ed\n\6\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f2\b\"\2\2\u00f2D\3\2\2\2\13\2I\u00a5\u00ac\u00ae"+
		"\u00b2\u00b6\u00e4\u00ee\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}