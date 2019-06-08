// Generated from JavaLike.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLikeParser extends Parser {
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
	public static final int
		RULE_main = 0, RULE_mainBody = 1, RULE_body = 2, RULE_if_statement = 3, 
		RULE_variable_declaration = 4, RULE_while_statement = 5, RULE_return_statement = 6, 
		RULE_type_keyword = 7, RULE_lines = 8, RULE_type = 9, RULE_expression = 10, 
		RULE_atom = 11, RULE_operators = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "mainBody", "body", "if_statement", "variable_declaration", "while_statement", 
			"return_statement", "type_keyword", "lines", "type", "expression", "atom", 
			"operators"
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

	@Override
	public String getGrammarFileName() { return "JavaLike.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaLikeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public MainBodyContext mainBody() {
			return getRuleContext(MainBodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaLikeParser.EOF, 0); }
		public TerminalNode WHITESPACE() { return getToken(JavaLikeParser.WHITESPACE, 0); }
		public TerminalNode LINE_COMMENT() { return getToken(JavaLikeParser.LINE_COMMENT, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				mainBody();
				setState(27);
				match(EOF);
				}
				break;
			case WHITESPACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(WHITESPACE);
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(LINE_COMMENT);
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

	public static class MainBodyContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(JavaLikeParser.MAIN, 0); }
		public TerminalNode LEFT_CURLYBRACKET() { return getToken(JavaLikeParser.LEFT_CURLYBRACKET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RIGHT_CURLYBRACKET() { return getToken(JavaLikeParser.RIGHT_CURLYBRACKET, 0); }
		public MainBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterMainBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitMainBody(this);
		}
	}

	public final MainBodyContext mainBody() throws RecognitionException {
		MainBodyContext _localctx = new MainBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(MAIN);
			setState(34);
			match(LEFT_CURLYBRACKET);
			setState(35);
			body();
			setState(36);
			match(RIGHT_CURLYBRACKET);
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

	public static class BodyContext extends ParserRuleContext {
		public List<LinesContext> lines() {
			return getRuleContexts(LinesContext.class);
		}
		public LinesContext lines(int i) {
			return getRuleContext(LinesContext.class,i);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE_KEYWORD) | (1L << IF_KEYWORD) | (1L << INTEGER_KEYWORD) | (1L << RETURN_KEYWORD) | (1L << BOOLEAN_KEYWORD))) != 0)) {
					{
					{
					setState(38);
					lines();
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				variable_declaration();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF_KEYWORD() { return getToken(JavaLikeParser.IF_KEYWORD, 0); }
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(JavaLikeParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(JavaLikeParser.LEFT_BRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(JavaLikeParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(JavaLikeParser.RIGHT_BRACKET, i);
		}
		public List<TerminalNode> LEFT_CURLYBRACKET() { return getTokens(JavaLikeParser.LEFT_CURLYBRACKET); }
		public TerminalNode LEFT_CURLYBRACKET(int i) {
			return getToken(JavaLikeParser.LEFT_CURLYBRACKET, i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<TerminalNode> RIGHT_CURLYBRACKET() { return getTokens(JavaLikeParser.RIGHT_CURLYBRACKET); }
		public TerminalNode RIGHT_CURLYBRACKET(int i) {
			return getToken(JavaLikeParser.RIGHT_CURLYBRACKET, i);
		}
		public List<TerminalNode> ELSIF_KEYWORD() { return getTokens(JavaLikeParser.ELSIF_KEYWORD); }
		public TerminalNode ELSIF_KEYWORD(int i) {
			return getToken(JavaLikeParser.ELSIF_KEYWORD, i);
		}
		public TerminalNode ELSE_KEYWORD() { return getToken(JavaLikeParser.ELSE_KEYWORD, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(IF_KEYWORD);
			setState(48);
			match(LEFT_BRACKET);
			setState(49);
			expression(0);
			setState(50);
			match(RIGHT_BRACKET);
			setState(51);
			match(LEFT_CURLYBRACKET);
			setState(52);
			body();
			setState(53);
			match(RIGHT_CURLYBRACKET);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF_KEYWORD) {
				{
				{
				setState(54);
				match(ELSIF_KEYWORD);
				setState(55);
				match(LEFT_BRACKET);
				setState(56);
				expression(0);
				setState(57);
				match(RIGHT_BRACKET);
				setState(58);
				match(LEFT_CURLYBRACKET);
				setState(59);
				body();
				setState(60);
				match(RIGHT_CURLYBRACKET);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KEYWORD) {
				{
				setState(67);
				match(ELSE_KEYWORD);
				setState(68);
				match(RIGHT_CURLYBRACKET);
				setState(69);
				body();
				setState(70);
				match(LEFT_CURLYBRACKET);
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Type_keywordContext type_keyword() {
			return getRuleContext(Type_keywordContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaLikeParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaLikeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			type_keyword();
			setState(75);
			match(Identifier);
			setState(76);
			match(ASSIGN);
			setState(77);
			expression(0);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE_KEYWORD() { return getToken(JavaLikeParser.WHILE_KEYWORD, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(JavaLikeParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(JavaLikeParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_CURLYBRACKET() { return getToken(JavaLikeParser.LEFT_CURLYBRACKET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RIGHT_CURLYBRACKET() { return getToken(JavaLikeParser.RIGHT_CURLYBRACKET, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(WHILE_KEYWORD);
			setState(80);
			match(LEFT_BRACKET);
			setState(81);
			expression(0);
			setState(82);
			match(RIGHT_BRACKET);
			setState(83);
			match(LEFT_CURLYBRACKET);
			setState(84);
			body();
			setState(85);
			match(RIGHT_CURLYBRACKET);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN_KEYWORD() { return getToken(JavaLikeParser.RETURN_KEYWORD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(RETURN_KEYWORD);
			setState(88);
			expression(0);
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

	public static class Type_keywordContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_KEYWORD() { return getToken(JavaLikeParser.BOOLEAN_KEYWORD, 0); }
		public TerminalNode INTEGER_KEYWORD() { return getToken(JavaLikeParser.INTEGER_KEYWORD, 0); }
		public Type_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterType_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitType_keyword(this);
		}
	}

	public final Type_keywordContext type_keyword() throws RecognitionException {
		Type_keywordContext _localctx = new Type_keywordContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_KEYWORD || _la==BOOLEAN_KEYWORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LinesContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaLikeParser.SEMICOLON, 0); }
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitLines(this);
		}
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lines);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_KEYWORD:
			case BOOLEAN_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				variable_declaration();
				setState(93);
				match(SEMICOLON);
				}
				break;
			case WHILE_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				while_statement();
				}
				break;
			case IF_KEYWORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				if_statement();
				}
				break;
			case RETURN_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				return_statement();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(JavaLikeParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(JavaLikeParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(JavaLikeParser.NULL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << BOOLEAN) | (1L << INTEGER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(JavaLikeParser.EXCLAMATION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				{
				setState(103);
				match(EXCLAMATION);
				setState(104);
				expression(3);
				}
				break;
			case LEFT_BRACKET:
			case BOOLEAN:
			case INTEGER:
				{
				setState(105);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(108);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(109);
					operators();
					setState(110);
					expression(3);
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(JavaLikeParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(JavaLikeParser.BOOLEAN, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(JavaLikeParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(JavaLikeParser.RIGHT_BRACKET, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atom);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(BOOLEAN);
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(LEFT_BRACKET);
				setState(120);
				expression(0);
				setState(121);
				match(RIGHT_BRACKET);
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

	public static class OperatorsContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(JavaLikeParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(JavaLikeParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(JavaLikeParser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(JavaLikeParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(JavaLikeParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(JavaLikeParser.LESS_EQUAL, 0); }
		public TerminalNode ANDAND() { return getToken(JavaLikeParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(JavaLikeParser.OROR, 0); }
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitOperators(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANDAND) | (1L << OROR) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER) | (1L << GREATER_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\5\2\"\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5A\n\5\f\5\16\5D\13\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\ne\n\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\5\fm\n\f\3\f\3\f\3\f\3\f\7\fs\n\f\f\f\16\fv\13\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r~\n\r\3\16\3\16\3\16\2\3\26\17\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\2\5\4\2\33\33\35\35\3\2\24\26\3\2\4\13\2\u0081\2"+
		"!\3\2\2\2\4#\3\2\2\2\6/\3\2\2\2\b\61\3\2\2\2\nL\3\2\2\2\fQ\3\2\2\2\16"+
		"Y\3\2\2\2\20\\\3\2\2\2\22d\3\2\2\2\24f\3\2\2\2\26l\3\2\2\2\30}\3\2\2\2"+
		"\32\177\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\"\3\2\2\2\37\"\7\36\2\2"+
		" \"\7\37\2\2!\34\3\2\2\2!\37\3\2\2\2! \3\2\2\2\"\3\3\2\2\2#$\7\23\2\2"+
		"$%\7\22\2\2%&\5\6\4\2&\'\7\21\2\2\'\5\3\2\2\2(*\5\22\n\2)(\3\2\2\2*-\3"+
		"\2\2\2+)\3\2\2\2+,\3\2\2\2,\60\3\2\2\2-+\3\2\2\2.\60\5\n\6\2/+\3\2\2\2"+
		"/.\3\2\2\2\60\7\3\2\2\2\61\62\7\30\2\2\62\63\7\17\2\2\63\64\5\26\f\2\64"+
		"\65\7\20\2\2\65\66\7\22\2\2\66\67\5\6\4\2\67B\7\21\2\289\7\32\2\29:\7"+
		"\17\2\2:;\5\26\f\2;<\7\20\2\2<=\7\22\2\2=>\5\6\4\2>?\7\21\2\2?A\3\2\2"+
		"\2@8\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CJ\3\2\2\2DB\3\2\2\2EF\7\31"+
		"\2\2FG\7\21\2\2GH\5\6\4\2HI\7\22\2\2IK\3\2\2\2JE\3\2\2\2JK\3\2\2\2K\t"+
		"\3\2\2\2LM\5\20\t\2MN\7\3\2\2NO\7\r\2\2OP\5\26\f\2P\13\3\2\2\2QR\7\27"+
		"\2\2RS\7\17\2\2ST\5\26\f\2TU\7\20\2\2UV\7\22\2\2VW\5\6\4\2WX\7\21\2\2"+
		"X\r\3\2\2\2YZ\7\34\2\2Z[\5\26\f\2[\17\3\2\2\2\\]\t\2\2\2]\21\3\2\2\2^"+
		"_\5\n\6\2_`\7\16\2\2`e\3\2\2\2ae\5\f\7\2be\5\b\5\2ce\5\16\b\2d^\3\2\2"+
		"\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2e\23\3\2\2\2fg\t\3\2\2g\25\3\2\2\2hi\b"+
		"\f\1\2ij\7\f\2\2jm\5\26\f\5km\5\30\r\2lh\3\2\2\2lk\3\2\2\2mt\3\2\2\2n"+
		"o\f\4\2\2op\5\32\16\2pq\5\26\f\5qs\3\2\2\2rn\3\2\2\2sv\3\2\2\2tr\3\2\2"+
		"\2tu\3\2\2\2u\27\3\2\2\2vt\3\2\2\2w~\7\26\2\2x~\7\25\2\2yz\7\17\2\2z{"+
		"\5\26\f\2{|\7\20\2\2|~\3\2\2\2}w\3\2\2\2}x\3\2\2\2}y\3\2\2\2~\31\3\2\2"+
		"\2\177\u0080\t\4\2\2\u0080\33\3\2\2\2\13!+/BJdlt}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}