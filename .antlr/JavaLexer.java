// Generated from Java.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexer extends Lexer {
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
		PLUS=38, MINUS=39, DIV=40, MUL=41, ADD_ASSIGN=42, SUB_ASSIGN=43, MUL_ASSIGN=44, 
		DIV_ASSIGN=45, OPERATORS_ASSIGNMENT=46, COMMENTS_LINE=47, COMMENTS_BLOCK_OPENING=48, 
		COMMENTS_BLOCK_CLOSING=49, Identifier=50, WHITESPACE=51, COMMENT=52, LINE_COMMENT=53;
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
			"EXCLAMATION", "PLUS", "MINUS", "DIV", "MUL", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "OPERATORS_ASSIGNMENT", "COMMENTS_LINE", 
			"COMMENTS_BLOCK_OPENING", "COMMENTS_BLOCK_CLOSING", "Identifier", "JavaLetter", 
			"JavaLetterOrDigit", "WHITESPACE", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'0'", "'null'", null, "'boolean'", "'int'", "'char'", 
			"'while'", "'if'", "'elif'", "'else'", "'return'", "'void'", "'public'", 
			"'protected'", "'private'", "'static'", "'final'", "';'", "','", "'.'", 
			"'{'", "'}'", "'['", "']'", "'('", "')'", "'&&'", "'||'", "'=='", "'!='", 
			"'<'", "'<='", "'>'", "'>='", "'!'", "'+'", "'-'", "'/'", "'*'", "'+='", 
			"'-='", "'*='", "'/='", "'='", "'//'", "'/*'", "'*/'"
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
			"GREATER_EQUAL", "EXCLAMATION", "PLUS", "MINUS", "DIV", "MUL", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "OPERATORS_ASSIGNMENT", "COMMENTS_LINE", 
			"COMMENTS_BLOCK_OPENING", "COMMENTS_BLOCK_CLOSING", "Identifier", "WHITESPACE", 
			"COMMENT", "LINE_COMMENT"
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


	public JavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0167\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2"+
		"\3\2\3\2\5\2}\n\2\5\2\177\n\2\3\3\3\3\5\3\u0083\n\3\3\4\3\4\5\4\u0087"+
		"\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a1\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+"+
		"\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67"+
		"\7\67\u0144\n\67\f\67\16\67\u0147\13\67\38\38\39\39\3:\6:\u014e\n:\r:"+
		"\16:\u014f\3:\3:\3;\3;\7;\u0156\n;\f;\16;\u0159\13;\3;\3;\3;\3;\3<\3<"+
		"\7<\u0161\n<\f<\16<\u0164\13<\3<\3<\3\u0157\2=\3\3\5\2\7\2\t\4\13\2\r"+
		"\2\17\5\21\6\23\7\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21)\22"+
		"+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K#"+
		"M$O%Q&S\'U(W)Y*[+],_-a.c/e\60g\61i\62k\63m\64o\2q\2s\65u\66w\67\3\2\b"+
		"\6\2\f\f\17\17))^^\3\2\63;\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\2\u0169\2\3\3\2\2\2\2\t\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\3~\3\2\2\2\5\u0080\3\2\2\2\7\u0086\3\2\2\2\t\u0088\3\2\2\2"+
		"\13\u008c\3\2\2\2\r\u008e\3\2\2\2\17\u0090\3\2\2\2\21\u0092\3\2\2\2\23"+
		"\u00a0\3\2\2\2\25\u00a2\3\2\2\2\27\u00aa\3\2\2\2\31\u00ae\3\2\2\2\33\u00b3"+
		"\3\2\2\2\35\u00b9\3\2\2\2\37\u00bc\3\2\2\2!\u00c1\3\2\2\2#\u00c6\3\2\2"+
		"\2%\u00cd\3\2\2\2\'\u00d2\3\2\2\2)\u00d9\3\2\2\2+\u00e3\3\2\2\2-\u00eb"+
		"\3\2\2\2/\u00f2\3\2\2\2\61\u00f8\3\2\2\2\63\u00fa\3\2\2\2\65\u00fc\3\2"+
		"\2\2\67\u00fe\3\2\2\29\u0100\3\2\2\2;\u0102\3\2\2\2=\u0104\3\2\2\2?\u0106"+
		"\3\2\2\2A\u0108\3\2\2\2C\u010a\3\2\2\2E\u010d\3\2\2\2G\u0110\3\2\2\2I"+
		"\u0113\3\2\2\2K\u0116\3\2\2\2M\u0118\3\2\2\2O\u011b\3\2\2\2Q\u011d\3\2"+
		"\2\2S\u0120\3\2\2\2U\u0122\3\2\2\2W\u0124\3\2\2\2Y\u0126\3\2\2\2[\u0128"+
		"\3\2\2\2]\u012a\3\2\2\2_\u012d\3\2\2\2a\u0130\3\2\2\2c\u0133\3\2\2\2e"+
		"\u0136\3\2\2\2g\u0138\3\2\2\2i\u013b\3\2\2\2k\u013e\3\2\2\2m\u0141\3\2"+
		"\2\2o\u0148\3\2\2\2q\u014a\3\2\2\2s\u014d\3\2\2\2u\u0153\3\2\2\2w\u015e"+
		"\3\2\2\2y\177\5\17\b\2z|\5\r\7\2{}\5\5\3\2|{\3\2\2\2|}\3\2\2\2}\177\3"+
		"\2\2\2~y\3\2\2\2~z\3\2\2\2\177\4\3\2\2\2\u0080\u0082\5\7\4\2\u0081\u0083"+
		"\5\7\4\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\6\3\2\2\2\u0084"+
		"\u0087\5\17\b\2\u0085\u0087\5\r\7\2\u0086\u0084\3\2\2\2\u0086\u0085\3"+
		"\2\2\2\u0087\b\3\2\2\2\u0088\u0089\7)\2\2\u0089\u008a\5\13\6\2\u008a\u008b"+
		"\7)\2\2\u008b\n\3\2\2\2\u008c\u008d\n\2\2\2\u008d\f\3\2\2\2\u008e\u008f"+
		"\t\3\2\2\u008f\16\3\2\2\2\u0090\u0091\7\62\2\2\u0091\20\3\2\2\2\u0092"+
		"\u0093\7p\2\2\u0093\u0094\7w\2\2\u0094\u0095\7n\2\2\u0095\u0096\7n\2\2"+
		"\u0096\22\3\2\2\2\u0097\u0098\7v\2\2\u0098\u0099\7t\2\2\u0099\u009a\7"+
		"w\2\2\u009a\u00a1\7g\2\2\u009b\u009c\7h\2\2\u009c\u009d\7c\2\2\u009d\u009e"+
		"\7n\2\2\u009e\u009f\7u\2\2\u009f\u00a1\7g\2\2\u00a0\u0097\3\2\2\2\u00a0"+
		"\u009b\3\2\2\2\u00a1\24\3\2\2\2\u00a2\u00a3\7d\2\2\u00a3\u00a4\7q\2\2"+
		"\u00a4\u00a5\7q\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8"+
		"\7c\2\2\u00a8\u00a9\7p\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac"+
		"\7p\2\2\u00ac\u00ad\7v\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7e\2\2\u00af\u00b0"+
		"\7j\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7t\2\2\u00b2\32\3\2\2\2\u00b3\u00b4"+
		"\7y\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7n\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8\34\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7h\2\2\u00bb"+
		"\36\3\2\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7k\2\2\u00bf"+
		"\u00c0\7h\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7n\2\2\u00c3"+
		"\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c5\"\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7t\2\2"+
		"\u00cb\u00cc\7p\2\2\u00cc$\3\2\2\2\u00cd\u00ce\7x\2\2\u00ce\u00cf\7q\2"+
		"\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7f\2\2\u00d1&\3\2\2\2\u00d2\u00d3\7"+
		"r\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7"+
		"\7k\2\2\u00d7\u00d8\7e\2\2\u00d8(\3\2\2\2\u00d9\u00da\7r\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7e\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7f\2\2"+
		"\u00e2*\3\2\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7k\2"+
		"\2\u00e6\u00e7\7x\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea"+
		"\7g\2\2\u00ea,\3\2\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee"+
		"\7c\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7e\2\2\u00f1"+
		".\3\2\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2\2\u00f5"+
		"\u00f6\7c\2\2\u00f6\u00f7\7n\2\2\u00f7\60\3\2\2\2\u00f8\u00f9\7=\2\2\u00f9"+
		"\62\3\2\2\2\u00fa\u00fb\7.\2\2\u00fb\64\3\2\2\2\u00fc\u00fd\7\60\2\2\u00fd"+
		"\66\3\2\2\2\u00fe\u00ff\7}\2\2\u00ff8\3\2\2\2\u0100\u0101\7\177\2\2\u0101"+
		":\3\2\2\2\u0102\u0103\7]\2\2\u0103<\3\2\2\2\u0104\u0105\7_\2\2\u0105>"+
		"\3\2\2\2\u0106\u0107\7*\2\2\u0107@\3\2\2\2\u0108\u0109\7+\2\2\u0109B\3"+
		"\2\2\2\u010a\u010b\7(\2\2\u010b\u010c\7(\2\2\u010cD\3\2\2\2\u010d\u010e"+
		"\7~\2\2\u010e\u010f\7~\2\2\u010fF\3\2\2\2\u0110\u0111\7?\2\2\u0111\u0112"+
		"\7?\2\2\u0112H\3\2\2\2\u0113\u0114\7#\2\2\u0114\u0115\7?\2\2\u0115J\3"+
		"\2\2\2\u0116\u0117\7>\2\2\u0117L\3\2\2\2\u0118\u0119\7>\2\2\u0119\u011a"+
		"\7?\2\2\u011aN\3\2\2\2\u011b\u011c\7@\2\2\u011cP\3\2\2\2\u011d\u011e\7"+
		"@\2\2\u011e\u011f\7?\2\2\u011fR\3\2\2\2\u0120\u0121\7#\2\2\u0121T\3\2"+
		"\2\2\u0122\u0123\7-\2\2\u0123V\3\2\2\2\u0124\u0125\7/\2\2\u0125X\3\2\2"+
		"\2\u0126\u0127\7\61\2\2\u0127Z\3\2\2\2\u0128\u0129\7,\2\2\u0129\\\3\2"+
		"\2\2\u012a\u012b\7-\2\2\u012b\u012c\7?\2\2\u012c^\3\2\2\2\u012d\u012e"+
		"\7/\2\2\u012e\u012f\7?\2\2\u012f`\3\2\2\2\u0130\u0131\7,\2\2\u0131\u0132"+
		"\7?\2\2\u0132b\3\2\2\2\u0133\u0134\7\61\2\2\u0134\u0135\7?\2\2\u0135d"+
		"\3\2\2\2\u0136\u0137\7?\2\2\u0137f\3\2\2\2\u0138\u0139\7\61\2\2\u0139"+
		"\u013a\7\61\2\2\u013ah\3\2\2\2\u013b\u013c\7\61\2\2\u013c\u013d\7,\2\2"+
		"\u013dj\3\2\2\2\u013e\u013f\7,\2\2\u013f\u0140\7\61\2\2\u0140l\3\2\2\2"+
		"\u0141\u0145\5o8\2\u0142\u0144\5q9\2\u0143\u0142\3\2\2\2\u0144\u0147\3"+
		"\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146n\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0148\u0149\t\4\2\2\u0149p\3\2\2\2\u014a\u014b\t\5\2\2\u014b"+
		"r\3\2\2\2\u014c\u014e\t\6\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2"+
		"\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152"+
		"\b:\2\2\u0152t\3\2\2\2\u0153\u0157\5i\65\2\u0154\u0156\13\2\2\2\u0155"+
		"\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0158\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\5k\66\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015d\b;\2\2\u015dv\3\2\2\2\u015e\u0162\5g\64\2\u015f"+
		"\u0161\n\7\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165"+
		"\u0166\b<\2\2\u0166x\3\2\2\2\f\2|~\u0082\u0086\u00a0\u0145\u014f\u0157"+
		"\u0162\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}