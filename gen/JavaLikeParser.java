// Generated from D:/MOJEPRYWATNE/0nauka/semestr6/SOA/LEL/transpiler\JavaLike.g4 by ANTLR 4.7.2
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
	public static final int
		RULE_compilationUnit = 0, RULE_literal = 1, RULE_function = 2, RULE_methodHeader = 3, 
		RULE_methodBody = 4, RULE_result = 5, RULE_methodDeclarator = 6, RULE_methodName = 7, 
		RULE_parameterList = 8, RULE_parameter = 9, RULE_parameterName = 10, RULE_modifier = 11, 
		RULE_expression = 12, RULE_arithmeticExpression = 13, RULE_additiveExpression = 14, 
		RULE_multiplicativeExpression = 15, RULE_relationalExpression = 16, RULE_body = 17, 
		RULE_lines = 18, RULE_assignment = 19, RULE_leftHandSide = 20, RULE_rightHandSide = 21, 
		RULE_variableAccess = 22, RULE_arrayAccess = 23, RULE_statement = 24, 
		RULE_ifStatement = 25, RULE_basicIfStatement = 26, RULE_elsefifStatement = 27, 
		RULE_elseStatement = 28, RULE_whileStatement = 29, RULE_returnStatement = 30, 
		RULE_fieldDeclaration = 31, RULE_variableDeclarator = 32, RULE_variableName = 33, 
		RULE_variableInitializer = 34, RULE_basicDeclarator = 35, RULE_basicVariableDeclarationInitialization = 36, 
		RULE_variableArrayDeclarationInitialization = 37, RULE_variableArrayInitializer = 38, 
		RULE_comparsion_operators = 39, RULE_additive_operators = 40, RULE_multiplicative_operators = 41, 
		RULE_assign_operators = 42, RULE_bool_operators = 43, RULE_atom = 44, 
		RULE_variableArrayInitializerList = 45, RULE_primitiveType = 46, RULE_type = 47, 
		RULE_arrayType = 48, RULE_dims = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "literal", "function", "methodHeader", "methodBody", 
			"result", "methodDeclarator", "methodName", "parameterList", "parameter", 
			"parameterName", "modifier", "expression", "arithmeticExpression", "additiveExpression", 
			"multiplicativeExpression", "relationalExpression", "body", "lines", 
			"assignment", "leftHandSide", "rightHandSide", "variableAccess", "arrayAccess", 
			"statement", "ifStatement", "basicIfStatement", "elsefifStatement", "elseStatement", 
			"whileStatement", "returnStatement", "fieldDeclaration", "variableDeclarator", 
			"variableName", "variableInitializer", "basicDeclarator", "basicVariableDeclarationInitialization", 
			"variableArrayDeclarationInitialization", "variableArrayInitializer", 
			"comparsion_operators", "additive_operators", "multiplicative_operators", 
			"assign_operators", "bool_operators", "atom", "variableArrayInitializerList", 
			"primitiveType", "type", "arrayType", "dims"
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaLikeParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_KEYWORD) | (1L << INT_KEYWORD) | (1L << CHAR_KEYWORD) | (1L << VOID_KEYWORD) | (1L << PUBLIC_KEYWORD) | (1L << PROTECTED_KEYWORD) | (1L << PRIVATE_KEYWORD) | (1L << STATIC_KEYWORD) | (1L << FINAL_KEYWORD))) != 0)) {
				{
				{
				setState(100);
				function();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(EOF);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(JavaLikeParser.BooleanLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(JavaLikeParser.IntegerLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JavaLikeParser.CharacterLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(JavaLikeParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0)) ) {
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

	public static class FunctionContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC_KEYWORD) | (1L << PROTECTED_KEYWORD) | (1L << PRIVATE_KEYWORD) | (1L << STATIC_KEYWORD) | (1L << FINAL_KEYWORD))) != 0)) {
				{
				{
				setState(110);
				modifier();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			methodHeader();
			setState(117);
			methodBody();
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

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitMethodHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			result();
			setState(120);
			methodDeclarator();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLYBRACKET() { return getToken(JavaLikeParser.LEFT_CURLYBRACKET, 0); }
		public TerminalNode RIGHT_CURLYBRACKET() { return getToken(JavaLikeParser.RIGHT_CURLYBRACKET, 0); }
		public List<LinesContext> lines() {
			return getRuleContexts(LinesContext.class);
		}
		public LinesContext lines(int i) {
			return getRuleContext(LinesContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(LEFT_CURLYBRACKET);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_KEYWORD) | (1L << INT_KEYWORD) | (1L << CHAR_KEYWORD) | (1L << WHILE_KEYWORD) | (1L << IF_KEYWORD) | (1L << RETURN_KEYWORD) | (1L << Identifier))) != 0)) {
				{
				{
				setState(123);
				lines();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
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

	public static class ResultContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID_KEYWORD() { return getToken(JavaLikeParser.VOID_KEYWORD, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_result);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_KEYWORD:
			case INT_KEYWORD:
			case CHAR_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				type();
				}
				break;
			case VOID_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(VOID_KEYWORD);
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

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(JavaLikeParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(JavaLikeParser.RIGHT_BRACKET, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitMethodDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			methodName();
			setState(136);
			match(LEFT_BRACKET);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_KEYWORD) | (1L << INT_KEYWORD) | (1L << CHAR_KEYWORD))) != 0)) {
				{
				setState(137);
				parameterList();
				}
			}

			setState(140);
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaLikeParser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(Identifier);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLikeParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			parameter();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(145);
				match(COMMA);
				setState(146);
				parameter();
				}
				}
				setState(151);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterNameContext parameterName() {
			return getRuleContext(ParameterNameContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			type();
			setState(153);
			parameterName();
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

	public static class ParameterNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaLikeParser.Identifier, 0); }
		public ParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitParameterName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitParameterName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterNameContext parameterName() throws RecognitionException {
		ParameterNameContext _localctx = new ParameterNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(Identifier);
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC_KEYWORD() { return getToken(JavaLikeParser.PUBLIC_KEYWORD, 0); }
		public TerminalNode PROTECTED_KEYWORD() { return getToken(JavaLikeParser.PROTECTED_KEYWORD, 0); }
		public TerminalNode PRIVATE_KEYWORD() { return getToken(JavaLikeParser.PRIVATE_KEYWORD, 0); }
		public TerminalNode STATIC_KEYWORD() { return getToken(JavaLikeParser.STATIC_KEYWORD, 0); }
		public TerminalNode FINAL_KEYWORD() { return getToken(JavaLikeParser.FINAL_KEYWORD, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC_KEYWORD) | (1L << PROTECTED_KEYWORD) | (1L << PRIVATE_KEYWORD) | (1L << STATIC_KEYWORD) | (1L << FINAL_KEYWORD))) != 0)) ) {
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(JavaLikeParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(JavaLikeParser.RIGHT_BRACKET, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(EXCLAMATION);
				setState(160);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(LEFT_BRACKET);
				setState(162);
				expression();
				setState(163);
				match(RIGHT_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				arithmeticExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				atom();
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(JavaLikeParser.LEFT_BRACKET, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(JavaLikeParser.RIGHT_BRACKET, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arithmeticExpression);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(LEFT_BRACKET);
				setState(171);
				arithmeticExpression();
				setState(172);
				match(RIGHT_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				additiveExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				multiplicativeExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				atom();
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public Additive_operatorsContext additive_operators() {
			return getRuleContext(Additive_operatorsContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(182);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(183);
					additive_operators();
					setState(184);
					multiplicativeExpression(0);
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public Multiplicative_operatorsContext multiplicative_operators() {
			return getRuleContext(Multiplicative_operatorsContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(192);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
					setState(194);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(195);
					multiplicative_operators();
					setState(196);
					additiveExpression(0);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(JavaLikeParser.LEFT_BRACKET, 0); }
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(JavaLikeParser.RIGHT_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comparsion_operatorsContext comparsion_operators() {
			return getRuleContext(Comparsion_operatorsContext.class,0);
		}
		public Bool_operatorsContext bool_operators() {
			return getRuleContext(Bool_operatorsContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(204);
				atom();
				}
				break;
			case 2:
				{
				setState(205);
				match(LEFT_BRACKET);
				setState(206);
				relationalExpression(0);
				setState(207);
				match(RIGHT_BRACKET);
				}
				break;
			case 3:
				{
				setState(209);
				expression();
				setState(210);
				comparsion_operators();
				setState(211);
				expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
					setState(215);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(216);
					bool_operators();
					setState(217);
					relationalExpression(2);
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class BodyContext extends ParserRuleContext {
		public List<LinesContext> lines() {
			return getRuleContexts(LinesContext.class);
		}
		public LinesContext lines(int i) {
			return getRuleContext(LinesContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_KEYWORD) | (1L << INT_KEYWORD) | (1L << CHAR_KEYWORD) | (1L << WHILE_KEYWORD) | (1L << IF_KEYWORD) | (1L << RETURN_KEYWORD) | (1L << Identifier))) != 0)) {
				{
				{
				setState(224);
				lines();
				}
				}
				setState(229);
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

	public static class LinesContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lines);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE_KEYWORD:
			case IF_KEYWORD:
			case RETURN_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				statement();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				assignment();
				}
				break;
			case BOOLEAN_KEYWORD:
			case INT_KEYWORD:
			case CHAR_KEYWORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				fieldDeclaration();
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

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public Assign_operatorsContext assign_operators() {
			return getRuleContext(Assign_operatorsContext.class,0);
		}
		public RightHandSideContext rightHandSide() {
			return getRuleContext(RightHandSideContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaLikeParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			leftHandSide();
			setState(236);
			assign_operators();
			setState(237);
			rightHandSide();
			setState(238);
			match(SEMICOLON);
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

	public static class LeftHandSideContext extends ParserRuleContext {
		public VariableAccessContext variableAccess() {
			return getRuleContext(VariableAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitLeftHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_leftHandSide);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				variableAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				arrayAccess();
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

	public static class RightHandSideContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RightHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterRightHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitRightHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitRightHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightHandSideContext rightHandSide() throws RecognitionException {
		RightHandSideContext _localctx = new RightHandSideContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rightHandSide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			expression();
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

	public static class VariableAccessContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaLikeParser.Identifier, 0); }
		public VariableAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterVariableAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitVariableAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitVariableAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAccessContext variableAccess() throws RecognitionException {
		VariableAccessContext _localctx = new VariableAccessContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variableAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(Identifier);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaLikeParser.Identifier, 0); }
		public TerminalNode LEFT_SQUAREBRACKET() { return getToken(JavaLikeParser.LEFT_SQUAREBRACKET, 0); }
		public TerminalNode IntegerLiteral() { return getToken(JavaLikeParser.IntegerLiteral, 0); }
		public TerminalNode RIGHT_SQUAREBRACKET() { return getToken(JavaLikeParser.RIGHT_SQUAREBRACKET, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(Identifier);
			setState(249);
			match(LEFT_SQUAREBRACKET);
			setState(250);
			match(IntegerLiteral);
			setState(251);
			match(RIGHT_SQUAREBRACKET);
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				ifStatement();
				}
				break;
			case WHILE_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				whileStatement();
				}
				break;
			case RETURN_KEYWORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				returnStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public BasicIfStatementContext basicIfStatement() {
			return getRuleContext(BasicIfStatementContext.class,0);
		}
		public List<ElsefifStatementContext> elsefifStatement() {
			return getRuleContexts(ElsefifStatementContext.class);
		}
		public ElsefifStatementContext elsefifStatement(int i) {
			return getRuleContext(ElsefifStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			basicIfStatement();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF_KEYWORD) {
				{
				{
				setState(259);
				elsefifStatement();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KEYWORD) {
				{
				setState(265);
				elseStatement();
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

	public static class BasicIfStatementContext extends ParserRuleContext {
		public TerminalNode IF_KEYWORD() { return getToken(JavaLikeParser.IF_KEYWORD, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(JavaLikeParser.LEFT_BRACKET, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(JavaLikeParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_CURLYBRACKET() { return getToken(JavaLikeParser.LEFT_CURLYBRACKET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RIGHT_CURLYBRACKET() { return getToken(JavaLikeParser.RIGHT_CURLYBRACKET, 0); }
		public BasicIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterBasicIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitBasicIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitBasicIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicIfStatementContext basicIfStatement() throws RecognitionException {
		BasicIfStatementContext _localctx = new BasicIfStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_basicIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IF_KEYWORD);
			setState(269);
			match(LEFT_BRACKET);
			setState(270);
			relationalExpression(0);
			setState(271);
			match(RIGHT_BRACKET);
			setState(272);
			match(LEFT_CURLYBRACKET);
			setState(273);
			body();
			setState(274);
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

	public static class ElsefifStatementContext extends ParserRuleContext {
		public TerminalNode ELIF_KEYWORD() { return getToken(JavaLikeParser.ELIF_KEYWORD, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(JavaLikeParser.LEFT_BRACKET, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(JavaLikeParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_CURLYBRACKET() { return getToken(JavaLikeParser.LEFT_CURLYBRACKET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RIGHT_CURLYBRACKET() { return getToken(JavaLikeParser.RIGHT_CURLYBRACKET, 0); }
		public ElsefifStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsefifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterElsefifStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitElsefifStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitElsefifStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsefifStatementContext elsefifStatement() throws RecognitionException {
		ElsefifStatementContext _localctx = new ElsefifStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elsefifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ELIF_KEYWORD);
			setState(277);
			match(LEFT_BRACKET);
			setState(278);
			relationalExpression(0);
			setState(279);
			match(RIGHT_BRACKET);
			setState(280);
			match(LEFT_CURLYBRACKET);
			setState(281);
			body();
			setState(282);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE_KEYWORD() { return getToken(JavaLikeParser.ELSE_KEYWORD, 0); }
		public TerminalNode LEFT_CURLYBRACKET() { return getToken(JavaLikeParser.LEFT_CURLYBRACKET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RIGHT_CURLYBRACKET() { return getToken(JavaLikeParser.RIGHT_CURLYBRACKET, 0); }
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(ELSE_KEYWORD);
			setState(285);
			match(LEFT_CURLYBRACKET);
			setState(286);
			body();
			setState(287);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE_KEYWORD() { return getToken(JavaLikeParser.WHILE_KEYWORD, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(JavaLikeParser.LEFT_BRACKET, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(JavaLikeParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_CURLYBRACKET() { return getToken(JavaLikeParser.LEFT_CURLYBRACKET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RIGHT_CURLYBRACKET() { return getToken(JavaLikeParser.RIGHT_CURLYBRACKET, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(WHILE_KEYWORD);
			setState(290);
			match(LEFT_BRACKET);
			setState(291);
			relationalExpression(0);
			setState(292);
			match(RIGHT_BRACKET);
			setState(293);
			match(LEFT_CURLYBRACKET);
			setState(294);
			body();
			setState(295);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN_KEYWORD() { return getToken(JavaLikeParser.RETURN_KEYWORD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaLikeParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(RETURN_KEYWORD);
			setState(298);
			expression();
			setState(299);
			match(SEMICOLON);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaLikeParser.SEMICOLON, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			type();
			setState(302);
			variableDeclarator();
			setState(303);
			match(SEMICOLON);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public BasicDeclaratorContext basicDeclarator() {
			return getRuleContext(BasicDeclaratorContext.class,0);
		}
		public BasicVariableDeclarationInitializationContext basicVariableDeclarationInitialization() {
			return getRuleContext(BasicVariableDeclarationInitializationContext.class,0);
		}
		public VariableArrayDeclarationInitializationContext variableArrayDeclarationInitialization() {
			return getRuleContext(VariableArrayDeclarationInitializationContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclarator);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				basicDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				basicVariableDeclarationInitialization();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				variableArrayDeclarationInitialization();
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaLikeParser.Identifier, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(Identifier);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableInitializer);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				atom();
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

	public static class BasicDeclaratorContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public BasicDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterBasicDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitBasicDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitBasicDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicDeclaratorContext basicDeclarator() throws RecognitionException {
		BasicDeclaratorContext _localctx = new BasicDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_basicDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			variableName();
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

	public static class BasicVariableDeclarationInitializationContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode OPERATORS_ASSIGNMENT() { return getToken(JavaLikeParser.OPERATORS_ASSIGNMENT, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public BasicVariableDeclarationInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicVariableDeclarationInitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterBasicVariableDeclarationInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitBasicVariableDeclarationInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitBasicVariableDeclarationInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicVariableDeclarationInitializationContext basicVariableDeclarationInitialization() throws RecognitionException {
		BasicVariableDeclarationInitializationContext _localctx = new BasicVariableDeclarationInitializationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_basicVariableDeclarationInitialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			variableName();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATORS_ASSIGNMENT) {
				{
				setState(319);
				match(OPERATORS_ASSIGNMENT);
				setState(320);
				variableInitializer();
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

	public static class VariableArrayDeclarationInitializationContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode OPERATORS_ASSIGNMENT() { return getToken(JavaLikeParser.OPERATORS_ASSIGNMENT, 0); }
		public VariableArrayInitializerContext variableArrayInitializer() {
			return getRuleContext(VariableArrayInitializerContext.class,0);
		}
		public VariableArrayDeclarationInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableArrayDeclarationInitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterVariableArrayDeclarationInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitVariableArrayDeclarationInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitVariableArrayDeclarationInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableArrayDeclarationInitializationContext variableArrayDeclarationInitialization() throws RecognitionException {
		VariableArrayDeclarationInitializationContext _localctx = new VariableArrayDeclarationInitializationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableArrayDeclarationInitialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			variableName();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATORS_ASSIGNMENT) {
				{
				setState(324);
				match(OPERATORS_ASSIGNMENT);
				setState(325);
				variableArrayInitializer();
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

	public static class VariableArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLYBRACKET() { return getToken(JavaLikeParser.LEFT_CURLYBRACKET, 0); }
		public TerminalNode RIGHT_CURLYBRACKET() { return getToken(JavaLikeParser.RIGHT_CURLYBRACKET, 0); }
		public VariableArrayInitializerListContext variableArrayInitializerList() {
			return getRuleContext(VariableArrayInitializerListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public VariableArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterVariableArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitVariableArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitVariableArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableArrayInitializerContext variableArrayInitializer() throws RecognitionException {
		VariableArrayInitializerContext _localctx = new VariableArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableArrayInitializer);
		int _la;
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(LEFT_CURLYBRACKET);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << LEFT_BRACKET) | (1L << EXCLAMATION) | (1L << Identifier))) != 0)) {
					{
					setState(329);
					variableArrayInitializerList();
					}
				}

				setState(332);
				match(RIGHT_CURLYBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				atom();
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

	public static class Comparsion_operatorsContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(JavaLikeParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(JavaLikeParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(JavaLikeParser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(JavaLikeParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(JavaLikeParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(JavaLikeParser.LESS_EQUAL, 0); }
		public Comparsion_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparsion_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterComparsion_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitComparsion_operators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitComparsion_operators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparsion_operatorsContext comparsion_operators() throws RecognitionException {
		Comparsion_operatorsContext _localctx = new Comparsion_operatorsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_comparsion_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER) | (1L << GREATER_EQUAL))) != 0)) ) {
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

	public static class Additive_operatorsContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(JavaLikeParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JavaLikeParser.MINUS, 0); }
		public Additive_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterAdditive_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitAdditive_operators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitAdditive_operators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_operatorsContext additive_operators() throws RecognitionException {
		Additive_operatorsContext _localctx = new Additive_operatorsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_additive_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class Multiplicative_operatorsContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(JavaLikeParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(JavaLikeParser.MUL, 0); }
		public Multiplicative_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterMultiplicative_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitMultiplicative_operators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitMultiplicative_operators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_operatorsContext multiplicative_operators() throws RecognitionException {
		Multiplicative_operatorsContext _localctx = new Multiplicative_operatorsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_multiplicative_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !(_la==DIV || _la==MUL) ) {
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

	public static class Assign_operatorsContext extends ParserRuleContext {
		public TerminalNode OPERATORS_ASSIGNMENT() { return getToken(JavaLikeParser.OPERATORS_ASSIGNMENT, 0); }
		public Assign_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterAssign_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitAssign_operators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitAssign_operators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_operatorsContext assign_operators() throws RecognitionException {
		Assign_operatorsContext _localctx = new Assign_operatorsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assign_operators);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(OPERATORS_ASSIGNMENT);
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

	public static class Bool_operatorsContext extends ParserRuleContext {
		public TerminalNode ANDAND() { return getToken(JavaLikeParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(JavaLikeParser.OROR, 0); }
		public Bool_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterBool_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitBool_operators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitBool_operators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_operatorsContext bool_operators() throws RecognitionException {
		Bool_operatorsContext _localctx = new Bool_operatorsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_bool_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !(_la==ANDAND || _la==OROR) ) {
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(JavaLikeParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(JavaLikeParser.RIGHT_BRACKET, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaLikeParser.Identifier, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_atom);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(LEFT_BRACKET);
				setState(348);
				expression();
				setState(349);
				match(RIGHT_BRACKET);
				}
				break;
			case IntegerLiteral:
			case CharacterLiteral:
			case NullLiteral:
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				match(Identifier);
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

	public static class VariableArrayInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLikeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLikeParser.COMMA, i);
		}
		public VariableArrayInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableArrayInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterVariableArrayInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitVariableArrayInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitVariableArrayInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableArrayInitializerListContext variableArrayInitializerList() throws RecognitionException {
		VariableArrayInitializerListContext _localctx = new VariableArrayInitializerListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableArrayInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			variableInitializer();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(356);
				match(COMMA);
				setState(357);
				variableInitializer();
				}
				}
				setState(362);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode INT_KEYWORD() { return getToken(JavaLikeParser.INT_KEYWORD, 0); }
		public TerminalNode BOOLEAN_KEYWORD() { return getToken(JavaLikeParser.BOOLEAN_KEYWORD, 0); }
		public TerminalNode CHAR_KEYWORD() { return getToken(JavaLikeParser.CHAR_KEYWORD, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_KEYWORD) | (1L << INT_KEYWORD) | (1L << CHAR_KEYWORD))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_type);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				arrayType();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			primitiveType();
			setState(370);
			dims();
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

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LEFT_SQUAREBRACKET() { return getTokens(JavaLikeParser.LEFT_SQUAREBRACKET); }
		public TerminalNode LEFT_SQUAREBRACKET(int i) {
			return getToken(JavaLikeParser.LEFT_SQUAREBRACKET, i);
		}
		public List<TerminalNode> RIGHT_SQUAREBRACKET() { return getTokens(JavaLikeParser.RIGHT_SQUAREBRACKET); }
		public TerminalNode RIGHT_SQUAREBRACKET(int i) {
			return getToken(JavaLikeParser.RIGHT_SQUAREBRACKET, i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLikeListener ) ((JavaLikeListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLikeVisitor ) return ((JavaLikeVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(LEFT_SQUAREBRACKET);
			setState(373);
			match(RIGHT_SQUAREBRACKET);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_SQUAREBRACKET) {
				{
				{
				setState(374);
				match(LEFT_SQUAREBRACKET);
				setState(375);
				match(RIGHT_SQUAREBRACKET);
				}
				}
				setState(380);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 15:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 16:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0180\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\7\2"+
		"h\n\2\f\2\16\2k\13\2\3\2\3\2\3\3\3\3\3\4\7\4r\n\4\f\4\16\4u\13\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\7\6\177\n\6\f\6\16\6\u0082\13\6\3\6\3\6\3\7"+
		"\3\7\5\7\u0088\n\7\3\b\3\b\3\b\5\b\u008d\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\7\n\u0096\n\n\f\n\16\n\u0099\13\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ab\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00b4\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00bd\n\20\f\20\16\20\u00c0\13\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00c9\n\21\f\21\16\21\u00cc\13\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d8\n\22\3\22\3\22\3\22\3\22\7\22"+
		"\u00de\n\22\f\22\16\22\u00e1\13\22\3\23\7\23\u00e4\n\23\f\23\16\23\u00e7"+
		"\13\23\3\24\3\24\3\24\5\24\u00ec\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\5\26\u00f5\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\5\32\u0103\n\32\3\33\3\33\7\33\u0107\n\33\f\33\16\33\u010a"+
		"\13\33\3\33\5\33\u010d\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\""+
		"\5\"\u0137\n\"\3#\3#\3$\3$\5$\u013d\n$\3%\3%\3&\3&\3&\5&\u0144\n&\3\'"+
		"\3\'\3\'\5\'\u0149\n\'\3(\3(\5(\u014d\n(\3(\3(\3(\5(\u0152\n(\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\5.\u0164\n.\3/\3/\3/\7/\u0169"+
		"\n/\f/\16/\u016c\13/\3\60\3\60\3\61\3\61\5\61\u0172\n\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\7\63\u017b\n\63\f\63\16\63\u017e\13\63\3\63\2\5\36"+
		" \"\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bd\2\t\4\2\3\4\6\7\3\2\21\25\3\2!&\3\2()\3\2*+\3\2"+
		"\37 \3\2\b\n\2\u0174\2i\3\2\2\2\4n\3\2\2\2\6s\3\2\2\2\by\3\2\2\2\n|\3"+
		"\2\2\2\f\u0087\3\2\2\2\16\u0089\3\2\2\2\20\u0090\3\2\2\2\22\u0092\3\2"+
		"\2\2\24\u009a\3\2\2\2\26\u009d\3\2\2\2\30\u009f\3\2\2\2\32\u00aa\3\2\2"+
		"\2\34\u00b3\3\2\2\2\36\u00b5\3\2\2\2 \u00c1\3\2\2\2\"\u00d7\3\2\2\2$\u00e5"+
		"\3\2\2\2&\u00eb\3\2\2\2(\u00ed\3\2\2\2*\u00f4\3\2\2\2,\u00f6\3\2\2\2."+
		"\u00f8\3\2\2\2\60\u00fa\3\2\2\2\62\u0102\3\2\2\2\64\u0104\3\2\2\2\66\u010e"+
		"\3\2\2\28\u0116\3\2\2\2:\u011e\3\2\2\2<\u0123\3\2\2\2>\u012b\3\2\2\2@"+
		"\u012f\3\2\2\2B\u0136\3\2\2\2D\u0138\3\2\2\2F\u013c\3\2\2\2H\u013e\3\2"+
		"\2\2J\u0140\3\2\2\2L\u0145\3\2\2\2N\u0151\3\2\2\2P\u0153\3\2\2\2R\u0155"+
		"\3\2\2\2T\u0157\3\2\2\2V\u0159\3\2\2\2X\u015b\3\2\2\2Z\u0163\3\2\2\2\\"+
		"\u0165\3\2\2\2^\u016d\3\2\2\2`\u0171\3\2\2\2b\u0173\3\2\2\2d\u0176\3\2"+
		"\2\2fh\5\6\4\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2"+
		"\2\2lm\7\2\2\3m\3\3\2\2\2no\t\2\2\2o\5\3\2\2\2pr\5\30\r\2qp\3\2\2\2ru"+
		"\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\5\b\5\2wx\5\n\6\2x"+
		"\7\3\2\2\2yz\5\f\7\2z{\5\16\b\2{\t\3\2\2\2|\u0080\7\31\2\2}\177\5&\24"+
		"\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\32\2\2\u0084\13\3\2\2"+
		"\2\u0085\u0088\5`\61\2\u0086\u0088\7\20\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\r\3\2\2\2\u0089\u008a\5\20\t\2\u008a\u008c\7\35\2"+
		"\2\u008b\u008d\5\22\n\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\7\36\2\2\u008f\17\3\2\2\2\u0090\u0091\7\60"+
		"\2\2\u0091\21\3\2\2\2\u0092\u0097\5\24\13\2\u0093\u0094\7\27\2\2\u0094"+
		"\u0096\5\24\13\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\23\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\5`\61\2\u009b\u009c\5\26\f\2\u009c\25\3\2\2\2\u009d\u009e\7\60"+
		"\2\2\u009e\27\3\2\2\2\u009f\u00a0\t\3\2\2\u00a0\31\3\2\2\2\u00a1\u00a2"+
		"\7\'\2\2\u00a2\u00ab\5\32\16\2\u00a3\u00a4\7\35\2\2\u00a4\u00a5\5\32\16"+
		"\2\u00a5\u00a6\7\36\2\2\u00a6\u00ab\3\2\2\2\u00a7\u00ab\5\34\17\2\u00a8"+
		"\u00ab\5(\25\2\u00a9\u00ab\5Z.\2\u00aa\u00a1\3\2\2\2\u00aa\u00a3\3\2\2"+
		"\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\33"+
		"\3\2\2\2\u00ac\u00ad\7\35\2\2\u00ad\u00ae\5\34\17\2\u00ae\u00af\7\36\2"+
		"\2\u00af\u00b4\3\2\2\2\u00b0\u00b4\5\36\20\2\u00b1\u00b4\5 \21\2\u00b2"+
		"\u00b4\5Z.\2\u00b3\u00ac\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2"+
		"\2\u00b3\u00b2\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\b\20\1\2\u00b6\u00b7"+
		"\5 \21\2\u00b7\u00be\3\2\2\2\u00b8\u00b9\f\3\2\2\u00b9\u00ba\5R*\2\u00ba"+
		"\u00bb\5 \21\2\u00bb\u00bd\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\37\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c2\b\21\1\2\u00c2\u00c3\5Z.\2\u00c3\u00ca\3\2\2\2\u00c4"+
		"\u00c5\f\3\2\2\u00c5\u00c6\5T+\2\u00c6\u00c7\5\36\20\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb!\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\b\22\1\2"+
		"\u00ce\u00d8\5Z.\2\u00cf\u00d0\7\35\2\2\u00d0\u00d1\5\"\22\2\u00d1\u00d2"+
		"\7\36\2\2\u00d2\u00d8\3\2\2\2\u00d3\u00d4\5\32\16\2\u00d4\u00d5\5P)\2"+
		"\u00d5\u00d6\5\32\16\2\u00d6\u00d8\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00cf"+
		"\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\u00df\3\2\2\2\u00d9\u00da\f\3\2\2\u00da"+
		"\u00db\5X-\2\u00db\u00dc\5\"\22\4\u00dc\u00de\3\2\2\2\u00dd\u00d9\3\2"+
		"\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"#\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\5&\24\2\u00e3\u00e2\3\2\2\2"+
		"\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6%\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ec\5\62\32\2\u00e9\u00ec\5(\25\2\u00ea"+
		"\u00ec\5@!\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2"+
		"\2\u00ec\'\3\2\2\2\u00ed\u00ee\5*\26\2\u00ee\u00ef\5V,\2\u00ef\u00f0\5"+
		",\27\2\u00f0\u00f1\7\26\2\2\u00f1)\3\2\2\2\u00f2\u00f5\5.\30\2\u00f3\u00f5"+
		"\5\60\31\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5+\3\2\2\2\u00f6"+
		"\u00f7\5\32\16\2\u00f7-\3\2\2\2\u00f8\u00f9\7\60\2\2\u00f9/\3\2\2\2\u00fa"+
		"\u00fb\7\60\2\2\u00fb\u00fc\7\33\2\2\u00fc\u00fd\7\3\2\2\u00fd\u00fe\7"+
		"\34\2\2\u00fe\61\3\2\2\2\u00ff\u0103\5\64\33\2\u0100\u0103\5<\37\2\u0101"+
		"\u0103\5> \2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2"+
		"\2\u0103\63\3\2\2\2\u0104\u0108\5\66\34\2\u0105\u0107\58\35\2\u0106\u0105"+
		"\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010d\5:\36\2\u010c\u010b\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\65\3\2\2\2\u010e\u010f\7\f\2\2\u010f\u0110"+
		"\7\35\2\2\u0110\u0111\5\"\22\2\u0111\u0112\7\36\2\2\u0112\u0113\7\31\2"+
		"\2\u0113\u0114\5$\23\2\u0114\u0115\7\32\2\2\u0115\67\3\2\2\2\u0116\u0117"+
		"\7\r\2\2\u0117\u0118\7\35\2\2\u0118\u0119\5\"\22\2\u0119\u011a\7\36\2"+
		"\2\u011a\u011b\7\31\2\2\u011b\u011c\5$\23\2\u011c\u011d\7\32\2\2\u011d"+
		"9\3\2\2\2\u011e\u011f\7\16\2\2\u011f\u0120\7\31\2\2\u0120\u0121\5$\23"+
		"\2\u0121\u0122\7\32\2\2\u0122;\3\2\2\2\u0123\u0124\7\13\2\2\u0124\u0125"+
		"\7\35\2\2\u0125\u0126\5\"\22\2\u0126\u0127\7\36\2\2\u0127\u0128\7\31\2"+
		"\2\u0128\u0129\5$\23\2\u0129\u012a\7\32\2\2\u012a=\3\2\2\2\u012b\u012c"+
		"\7\17\2\2\u012c\u012d\5\32\16\2\u012d\u012e\7\26\2\2\u012e?\3\2\2\2\u012f"+
		"\u0130\5`\61\2\u0130\u0131\5B\"\2\u0131\u0132\7\26\2\2\u0132A\3\2\2\2"+
		"\u0133\u0137\5H%\2\u0134\u0137\5J&\2\u0135\u0137\5L\'\2\u0136\u0133\3"+
		"\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137C\3\2\2\2\u0138\u0139"+
		"\7\60\2\2\u0139E\3\2\2\2\u013a\u013d\5\32\16\2\u013b\u013d\5Z.\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013dG\3\2\2\2\u013e\u013f\5D#\2\u013f"+
		"I\3\2\2\2\u0140\u0143\5D#\2\u0141\u0142\7,\2\2\u0142\u0144\5F$\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144K\3\2\2\2\u0145\u0148\5D#\2\u0146"+
		"\u0147\7,\2\2\u0147\u0149\5N(\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2"+
		"\2\u0149M\3\2\2\2\u014a\u014c\7\31\2\2\u014b\u014d\5\\/\2\u014c\u014b"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0152\7\32\2\2"+
		"\u014f\u0152\5\32\16\2\u0150\u0152\5Z.\2\u0151\u014a\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0150\3\2\2\2\u0152O\3\2\2\2\u0153\u0154\t\4\2\2\u0154"+
		"Q\3\2\2\2\u0155\u0156\t\5\2\2\u0156S\3\2\2\2\u0157\u0158\t\6\2\2\u0158"+
		"U\3\2\2\2\u0159\u015a\7,\2\2\u015aW\3\2\2\2\u015b\u015c\t\7\2\2\u015c"+
		"Y\3\2\2\2\u015d\u015e\7\35\2\2\u015e\u015f\5\32\16\2\u015f\u0160\7\36"+
		"\2\2\u0160\u0164\3\2\2\2\u0161\u0164\5\4\3\2\u0162\u0164\7\60\2\2\u0163"+
		"\u015d\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164[\3\2\2\2"+
		"\u0165\u016a\5F$\2\u0166\u0167\7\27\2\2\u0167\u0169\5F$\2\u0168\u0166"+
		"\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"]\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\t\b\2\2\u016e_\3\2\2\2\u016f"+
		"\u0172\5^\60\2\u0170\u0172\5b\62\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2"+
		"\2\2\u0172a\3\2\2\2\u0173\u0174\5^\60\2\u0174\u0175\5d\63\2\u0175c\3\2"+
		"\2\2\u0176\u0177\7\33\2\2\u0177\u017c\7\34\2\2\u0178\u0179\7\33\2\2\u0179"+
		"\u017b\7\34\2\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3"+
		"\2\2\2\u017c\u017d\3\2\2\2\u017de\3\2\2\2\u017e\u017c\3\2\2\2\36is\u0080"+
		"\u0087\u008c\u0097\u00aa\u00b3\u00be\u00ca\u00d7\u00df\u00e5\u00eb\u00f4"+
		"\u0102\u0108\u010c\u0136\u013c\u0143\u0148\u014c\u0151\u0163\u016a\u0171"+
		"\u017c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}