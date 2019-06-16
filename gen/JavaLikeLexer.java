// Generated from D:/MOJEPRYWATNE/0nauka/semestr6/SOA/LEL/transpiler\JavaLike.g4 by ANTLR 4.7.2
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
		IntegerLiteral=1, CharacterLiteral=2, Zero=3, NullLiteral=4, BooleanLiteral=5, 
		BOOLEAN_KEYWORD=6, INT_KEYWORD=7, CHAR_KEYWORD=8, WHILE_KEYWORD=9, IF_KEYWORD=10, 
		ELIF_KEYWORD=11, ELSE_KEYWORD=12, RETURN_KEYWORD=13, VOID_KEYWORD=14, 
		PUBLIC_KEYWORD=15, PROTECTED_KEYWORD=16, PRIVATE_KEYWORD=17, STATIC_KEYWORD=18, 
		FINAL_KEYWORD=19, SEMICOLON=20, COMMA=21, DOT=22, LEFT_CURLYBRACKET=23, 
		RIGHT_CURLYBRACKET=24, LEFT_SQUAREBRACKET=25, RIGHT_SQUAREBRACKET=26, 
		LEFT_BRACKET=27, RIGHT_BRACKET=28, ANDAND=29, OROR=30, EQUAL=31, NOT_EQUAL=32, 
		LESS=33, LESS_EQUAL=34, GREATER=35, GREATER_EQUAL=36, EXCLAMATION=37, 
		PLUS=38, MINUS=39, DIV=40, MUL=41, OPERATORS_ASSIGNMENT=42, COMMENTS_LINE=43, 
		COMMENTS_BLOCK_OPENING=44, COMMENTS_BLOCK_CLOSING=45, Identifier=46, WHITESPACE=47, 
		COMMENT=48, LINE_COMMENT=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IntegerLiteral", "Digits", "Digit", "CharacterLiteral", "SingleCharacter", 
			"NonZeroDigit", "Zero", "NullLiteral", "BooleanLiteral", "BOOLEAN_KEYWORD", 
			"INT_KEYWORD", "CHAR_KEYWORD", "WHILE_KEYWORD", "IF_KEYWORD", "ELIF_KEYWORD", 
			"ELSE_KEYWORD", "RETURN_KEYWORD", "VOID_KEYWORD", "PUBLIC_KEYWORD", "PROTECTED_KEYWORD", 
			"PRIVATE_KEYWORD", "STATIC_KEYWORD", "FINAL_KEYWORD", "SEMICOLON", "COMMA", 
			"DOT", "LEFT_CURLYBRACKET", "RIGHT_CURLYBRACKET", "LEFT_SQUAREBRACKET", 
			"RIGHT_SQUAREBRACKET", "LEFT_BRACKET", "RIGHT_BRACKET", "ANDAND", "OROR", 
			"EQUAL", "NOT_EQUAL", "LESS", "LESS_EQUAL", "GREATER", "GREATER_EQUAL", 
			"EXCLAMATION", "PLUS", "MINUS", "DIV", "MUL", "OPERATORS_ASSIGNMENT", 
			"COMMENTS_LINE", "COMMENTS_BLOCK_OPENING", "COMMENTS_BLOCK_CLOSING", 
			"Identifier", "JavaLetter", "JavaLetterOrDigit", "WHITESPACE", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'0'", "'null'", null, "'boolean'", "'int'", "'char'", 
			"'while'", "'if'", "'else if'", "'else'", "'return'", "'void'", "'public'", 
			"'protected'", "'private'", "'static'", "'final'", "';'", "','", "'.'", 
			"'{'", "'}'", "'['", "']'", "'('", "')'", "'&&'", "'||'", "'=='", "'!='", 
			"'<'", "'<='", "'>'", "'>='", "'!'", "'+'", "'-'", "'/'", "'*'", "'='", 
			"'//'", "'/*'", "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "CharacterLiteral", "Zero", "NullLiteral", "BooleanLiteral", 
			"BOOLEAN_KEYWORD", "INT_KEYWORD", "CHAR_KEYWORD", "WHILE_KEYWORD", "IF_KEYWORD", 
			"ELIF_KEYWORD", "ELSE_KEYWORD", "RETURN_KEYWORD", "VOID_KEYWORD", "PUBLIC_KEYWORD", 
			"PROTECTED_KEYWORD", "PRIVATE_KEYWORD", "STATIC_KEYWORD", "FINAL_KEYWORD", 
			"SEMICOLON", "COMMA", "DOT", "LEFT_CURLYBRACKET", "RIGHT_CURLYBRACKET", 
			"LEFT_SQUAREBRACKET", "RIGHT_SQUAREBRACKET", "LEFT_BRACKET", "RIGHT_BRACKET", 
			"ANDAND", "OROR", "EQUAL", "NOT_EQUAL", "LESS", "LESS_EQUAL", "GREATER", 
			"GREATER_EQUAL", "EXCLAMATION", "PLUS", "MINUS", "DIV", "MUL", "OPERATORS_ASSIGNMENT", 
			"COMMENTS_LINE", "COMMENTS_BLOCK_OPENING", "COMMENTS_BLOCK_CLOSING", 
			"Identifier", "WHITESPACE", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0156\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\5\2u\n\2\5\2w\n"+
		"\2\3\3\3\3\5\3{\n\3\3\4\3\4\5\4\177\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0099\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3"+
		"%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\7\63\u0133"+
		"\n\63\f\63\16\63\u0136\13\63\3\64\3\64\3\65\3\65\3\66\6\66\u013d\n\66"+
		"\r\66\16\66\u013e\3\66\3\66\3\67\3\67\7\67\u0145\n\67\f\67\16\67\u0148"+
		"\13\67\3\67\3\67\3\67\3\67\38\38\78\u0150\n8\f8\168\u0153\138\38\38\3"+
		"\u0146\29\3\3\5\2\7\2\t\4\13\2\r\2\17\5\21\6\23\7\25\b\27\t\31\n\33\13"+
		"\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32"+
		";\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/e\60g\2i\2k\61m"+
		"\62o\63\3\2\b\6\2\f\f\17\17))^^\3\2\63;\6\2&&C\\aac|\7\2&&\62;C\\aac|"+
		"\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0158\2\3\3\2\2\2\2\t\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3v\3\2\2\2\5x\3"+
		"\2\2\2\7~\3\2\2\2\t\u0080\3\2\2\2\13\u0084\3\2\2\2\r\u0086\3\2\2\2\17"+
		"\u0088\3\2\2\2\21\u008a\3\2\2\2\23\u0098\3\2\2\2\25\u009a\3\2\2\2\27\u00a2"+
		"\3\2\2\2\31\u00a6\3\2\2\2\33\u00ab\3\2\2\2\35\u00b1\3\2\2\2\37\u00b4\3"+
		"\2\2\2!\u00bc\3\2\2\2#\u00c1\3\2\2\2%\u00c8\3\2\2\2\'\u00cd\3\2\2\2)\u00d4"+
		"\3\2\2\2+\u00de\3\2\2\2-\u00e6\3\2\2\2/\u00ed\3\2\2\2\61\u00f3\3\2\2\2"+
		"\63\u00f5\3\2\2\2\65\u00f7\3\2\2\2\67\u00f9\3\2\2\29\u00fb\3\2\2\2;\u00fd"+
		"\3\2\2\2=\u00ff\3\2\2\2?\u0101\3\2\2\2A\u0103\3\2\2\2C\u0105\3\2\2\2E"+
		"\u0108\3\2\2\2G\u010b\3\2\2\2I\u010e\3\2\2\2K\u0111\3\2\2\2M\u0113\3\2"+
		"\2\2O\u0116\3\2\2\2Q\u0118\3\2\2\2S\u011b\3\2\2\2U\u011d\3\2\2\2W\u011f"+
		"\3\2\2\2Y\u0121\3\2\2\2[\u0123\3\2\2\2]\u0125\3\2\2\2_\u0127\3\2\2\2a"+
		"\u012a\3\2\2\2c\u012d\3\2\2\2e\u0130\3\2\2\2g\u0137\3\2\2\2i\u0139\3\2"+
		"\2\2k\u013c\3\2\2\2m\u0142\3\2\2\2o\u014d\3\2\2\2qw\5\17\b\2rt\5\r\7\2"+
		"su\5\5\3\2ts\3\2\2\2tu\3\2\2\2uw\3\2\2\2vq\3\2\2\2vr\3\2\2\2w\4\3\2\2"+
		"\2xz\5\7\4\2y{\5\7\4\2zy\3\2\2\2z{\3\2\2\2{\6\3\2\2\2|\177\5\17\b\2}\177"+
		"\5\r\7\2~|\3\2\2\2~}\3\2\2\2\177\b\3\2\2\2\u0080\u0081\7)\2\2\u0081\u0082"+
		"\5\13\6\2\u0082\u0083\7)\2\2\u0083\n\3\2\2\2\u0084\u0085\n\2\2\2\u0085"+
		"\f\3\2\2\2\u0086\u0087\t\3\2\2\u0087\16\3\2\2\2\u0088\u0089\7\62\2\2\u0089"+
		"\20\3\2\2\2\u008a\u008b\7p\2\2\u008b\u008c\7w\2\2\u008c\u008d\7n\2\2\u008d"+
		"\u008e\7n\2\2\u008e\22\3\2\2\2\u008f\u0090\7v\2\2\u0090\u0091\7t\2\2\u0091"+
		"\u0092\7w\2\2\u0092\u0099\7g\2\2\u0093\u0094\7h\2\2\u0094\u0095\7c\2\2"+
		"\u0095\u0096\7n\2\2\u0096\u0097\7u\2\2\u0097\u0099\7g\2\2\u0098\u008f"+
		"\3\2\2\2\u0098\u0093\3\2\2\2\u0099\24\3\2\2\2\u009a\u009b\7d\2\2\u009b"+
		"\u009c\7q\2\2\u009c\u009d\7q\2\2\u009d\u009e\7n\2\2\u009e\u009f\7g\2\2"+
		"\u009f\u00a0\7c\2\2\u00a0\u00a1\7p\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7"+
		"k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5\30\3\2\2\2\u00a6\u00a7"+
		"\7e\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7t\2\2\u00aa"+
		"\32\3\2\2\2\u00ab\u00ac\7y\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7n\2\2\u00af\u00b0\7g\2\2\u00b0\34\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7h\2\2\u00b3\36\3\2\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7n\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7\"\2\2\u00b9\u00ba\7k\2"+
		"\2\u00ba\u00bb\7h\2\2\u00bb \3\2\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7"+
		"n\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7g\2\2\u00c0\"\3\2\2\2\u00c1\u00c2"+
		"\7t\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7w\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7p\2\2\u00c7$\3\2\2\2\u00c8\u00c9\7x\2\2\u00c9"+
		"\u00ca\7q\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7f\2\2\u00cc&\3\2\2\2\u00cd"+
		"\u00ce\7r\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7d\2\2\u00d0\u00d1\7n\2\2"+
		"\u00d1\u00d2\7k\2\2\u00d2\u00d3\7e\2\2\u00d3(\3\2\2\2\u00d4\u00d5\7r\2"+
		"\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9"+
		"\7g\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"\u00dd\7f\2\2\u00dd*\3\2\2\2\u00de\u00df\7r\2\2\u00df\u00e0\7t\2\2\u00e0"+
		"\u00e1\7k\2\2\u00e1\u00e2\7x\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7v\2\2"+
		"\u00e4\u00e5\7g\2\2\u00e5,\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7v\2"+
		"\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec"+
		"\7e\2\2\u00ec.\3\2\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0"+
		"\7p\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7n\2\2\u00f2\60\3\2\2\2\u00f3\u00f4"+
		"\7=\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7.\2\2\u00f6\64\3\2\2\2\u00f7\u00f8"+
		"\7\60\2\2\u00f8\66\3\2\2\2\u00f9\u00fa\7}\2\2\u00fa8\3\2\2\2\u00fb\u00fc"+
		"\7\177\2\2\u00fc:\3\2\2\2\u00fd\u00fe\7]\2\2\u00fe<\3\2\2\2\u00ff\u0100"+
		"\7_\2\2\u0100>\3\2\2\2\u0101\u0102\7*\2\2\u0102@\3\2\2\2\u0103\u0104\7"+
		"+\2\2\u0104B\3\2\2\2\u0105\u0106\7(\2\2\u0106\u0107\7(\2\2\u0107D\3\2"+
		"\2\2\u0108\u0109\7~\2\2\u0109\u010a\7~\2\2\u010aF\3\2\2\2\u010b\u010c"+
		"\7?\2\2\u010c\u010d\7?\2\2\u010dH\3\2\2\2\u010e\u010f\7#\2\2\u010f\u0110"+
		"\7?\2\2\u0110J\3\2\2\2\u0111\u0112\7>\2\2\u0112L\3\2\2\2\u0113\u0114\7"+
		">\2\2\u0114\u0115\7?\2\2\u0115N\3\2\2\2\u0116\u0117\7@\2\2\u0117P\3\2"+
		"\2\2\u0118\u0119\7@\2\2\u0119\u011a\7?\2\2\u011aR\3\2\2\2\u011b\u011c"+
		"\7#\2\2\u011cT\3\2\2\2\u011d\u011e\7-\2\2\u011eV\3\2\2\2\u011f\u0120\7"+
		"/\2\2\u0120X\3\2\2\2\u0121\u0122\7\61\2\2\u0122Z\3\2\2\2\u0123\u0124\7"+
		",\2\2\u0124\\\3\2\2\2\u0125\u0126\7?\2\2\u0126^\3\2\2\2\u0127\u0128\7"+
		"\61\2\2\u0128\u0129\7\61\2\2\u0129`\3\2\2\2\u012a\u012b\7\61\2\2\u012b"+
		"\u012c\7,\2\2\u012cb\3\2\2\2\u012d\u012e\7,\2\2\u012e\u012f\7\61\2\2\u012f"+
		"d\3\2\2\2\u0130\u0134\5g\64\2\u0131\u0133\5i\65\2\u0132\u0131\3\2\2\2"+
		"\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135f\3"+
		"\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\t\4\2\2\u0138h\3\2\2\2\u0139\u013a"+
		"\t\5\2\2\u013aj\3\2\2\2\u013b\u013d\t\6\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\b\66\2\2\u0141l\3\2\2\2\u0142\u0146\5a\61\2\u0143\u0145"+
		"\13\2\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0147\3\2\2\2"+
		"\u0146\u0144\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a"+
		"\5c\62\2\u014a\u014b\3\2\2\2\u014b\u014c\b\67\2\2\u014cn\3\2\2\2\u014d"+
		"\u0151\5_\60\2\u014e\u0150\n\7\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2"+
		"\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0155\b8\2\2\u0155p\3\2\2\2\f\2tvz~\u0098\u0134\u013e"+
		"\u0146\u0151\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}