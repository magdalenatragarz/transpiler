// Generated from Java.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
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
	public static final int
		RULE_compilationUnit = 0, RULE_literal = 1, RULE_function = 2, RULE_methodHeader = 3, 
		RULE_methodBody = 4, RULE_result = 5, RULE_methodDeclarator = 6, RULE_parameterList = 7, 
		RULE_parameter = 8, RULE_modifier = 9, RULE_expression = 10, RULE_body = 11, 
		RULE_lines = 12, RULE_assignment = 13, RULE_leftHandSide = 14, RULE_rightHandSide = 15, 
		RULE_variableAccess = 16, RULE_arrayAccess = 17, RULE_statement = 18, 
		RULE_ifStatement = 19, RULE_whileStatement = 20, RULE_returnStatement = 21, 
		RULE_fieldDeclaration = 22, RULE_variableDeclarator = 23, RULE_variableInitializer = 24, 
		RULE_variableArrayDeclarator = 25, RULE_variableArrayInitializer = 26, 
		RULE_operators = 27, RULE_asgn_operators = 28, RULE_atom = 29, RULE_variableArrayInitializerList = 30, 
		RULE_primitiveType = 31, RULE_type = 32, RULE_arrayType = 33, RULE_dims = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "literal", "function", "methodHeader", "methodBody", 
			"result", "methodDeclarator", "parameterList", "parameter", "modifier", 
			"expression", "body", "lines", "assignment", "leftHandSide", "rightHandSide", 
			"variableAccess", "arrayAccess", "statement", "ifStatement", "whileStatement", 
			"returnStatement", "fieldDeclaration", "variableDeclarator", "variableInitializer", 
			"variableArrayDeclarator", "variableArrayInitializer", "operators", "asgn_operators", 
			"atom", "variableArrayInitializerList", "primitiveType", "type", "arrayType", 
			"dims"
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

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
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
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_KEYWORD) | (1L << INT_KEYWORD) | (1L << CHAR_KEYWORD) | (1L << VOID_KEYWORD) | (1L << PUBLIC_KEYWORD) | (1L << PROTECTED_KEYWORD) | (1L << PRIVATE_KEYWORD) | (1L << STATIC_KEYWORD) | (1L << FINAL_KEYWORD))) != 0)) {
				{
				{
				setState(70);
				function();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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
		public TerminalNode BooleanLiteral() { return getToken(JavaParser.BooleanLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JavaParser.CharacterLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(JavaParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
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
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC_KEYWORD) | (1L << PROTECTED_KEYWORD) | (1L << PRIVATE_KEYWORD) | (1L << STATIC_KEYWORD) | (1L << FINAL_KEYWORD))) != 0)) {
				{
				{
				setState(80);
				modifier();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			methodHeader();
			setState(87);
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
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodHeader(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			result();
			setState(90);
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
		public TerminalNode LEFT_CURLYBRACKET() { return getToken(JavaParser.LEFT_CURLYBRACKET, 0); }
		public TerminalNode RIGHT_CURLYBRACKET() { return getToken(JavaParser.RIGHT_CURLYBRACKET, 0); }
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
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(LEFT_CURLYBRACKET);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_KEYWORD) | (1L << INT_KEYWORD) | (1L << CHAR_KEYWORD) | (1L << WHILE_KEYWORD) | (1L << IF_KEYWORD) | (1L << RETURN_KEYWORD) | (1L << Identifier))) != 0)) {
				{
				{
				setState(93);
				lines();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
		public TerminalNode VOID_KEYWORD() { return getToken(JavaParser.VOID_KEYWORD, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_result);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_KEYWORD:
			case INT_KEYWORD:
			case CHAR_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				type();
				}
				break;
			case VOID_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
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
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(JavaParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(JavaParser.RIGHT_BRACKET, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclarator(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(Identifier);
			setState(106);
			match(LEFT_BRACKET);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_KEYWORD) | (1L << INT_KEYWORD) | (1L << CHAR_KEYWORD))) != 0)) {
				{
				setState(107);
				parameterList();
				}
			}

			setState(110);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			parameter();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(113);
				match(COMMA);
				setState(114);
				parameter();
				}
				}
				setState(119);
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
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			type();
			setState(121);
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
		public TerminalNode PUBLIC_KEYWORD() { return getToken(JavaParser.PUBLIC_KEYWORD, 0); }
		public TerminalNode PROTECTED_KEYWORD() { return getToken(JavaParser.PROTECTED_KEYWORD, 0); }
		public TerminalNode PRIVATE_KEYWORD() { return getToken(JavaParser.PRIVATE_KEYWORD, 0); }
		public TerminalNode STATIC_KEYWORD() { return getToken(JavaParser.STATIC_KEYWORD, 0); }
		public TerminalNode FINAL_KEYWORD() { return getToken(JavaParser.FINAL_KEYWORD, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		public TerminalNode EXCLAMATION() { return getToken(JavaParser.EXCLAMATION, 0); }
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
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpression(this);
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
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				{
				setState(126);
				match(EXCLAMATION);
				setState(127);
				expression(3);
				}
				break;
			case IntegerLiteral:
			case CharacterLiteral:
			case NullLiteral:
			case BooleanLiteral:
			case LEFT_BRACKET:
			case Identifier:
				{
				setState(128);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
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
					setState(131);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(132);
					operators();
					setState(133);
					expression(3);
					}
					} 
				}
				setState(139);
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
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_KEYWORD) | (1L << INT_KEYWORD) | (1L << CHAR_KEYWORD) | (1L << WHILE_KEYWORD) | (1L << IF_KEYWORD) | (1L << RETURN_KEYWORD) | (1L << Identifier))) != 0)) {
				{
				{
				setState(140);
				lines();
				}
				}
				setState(145);
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
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLines(this);
		}
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lines);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE_KEYWORD:
			case IF_KEYWORD:
			case RETURN_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				statement();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				assignment();
				}
				break;
			case BOOLEAN_KEYWORD:
			case INT_KEYWORD:
			case CHAR_KEYWORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
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
		public Asgn_operatorsContext asgn_operators() {
			return getRuleContext(Asgn_operatorsContext.class,0);
		}
		public RightHandSideContext rightHandSide() {
			return getRuleContext(RightHandSideContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			leftHandSide();
			setState(152);
			asgn_operators();
			setState(153);
			rightHandSide();
			setState(154);
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
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLeftHandSide(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_leftHandSide);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				variableAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
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
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterRightHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitRightHandSide(this);
		}
	}

	public final RightHandSideContext rightHandSide() throws RecognitionException {
		RightHandSideContext _localctx = new RightHandSideContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rightHandSide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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

	public static class VariableAccessContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VariableAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableAccess(this);
		}
	}

	public final VariableAccessContext variableAccess() throws RecognitionException {
		VariableAccessContext _localctx = new VariableAccessContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode LEFT_SQUAREBRACKET() { return getToken(JavaParser.LEFT_SQUAREBRACKET, 0); }
		public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
		public TerminalNode RIGHT_SQUAREBRACKET() { return getToken(JavaParser.RIGHT_SQUAREBRACKET, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(Identifier);
			setState(165);
			match(LEFT_SQUAREBRACKET);
			setState(166);
			match(IntegerLiteral);
			setState(167);
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
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				ifStatement();
				}
				break;
			case WHILE_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				whileStatement();
				}
				break;
			case RETURN_KEYWORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
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
		public TerminalNode IF_KEYWORD() { return getToken(JavaParser.IF_KEYWORD, 0); }
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(JavaParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(JavaParser.LEFT_BRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(JavaParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(JavaParser.RIGHT_BRACKET, i);
		}
		public List<TerminalNode> LEFT_CURLYBRACKET() { return getTokens(JavaParser.LEFT_CURLYBRACKET); }
		public TerminalNode LEFT_CURLYBRACKET(int i) {
			return getToken(JavaParser.LEFT_CURLYBRACKET, i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<TerminalNode> RIGHT_CURLYBRACKET() { return getTokens(JavaParser.RIGHT_CURLYBRACKET); }
		public TerminalNode RIGHT_CURLYBRACKET(int i) {
			return getToken(JavaParser.RIGHT_CURLYBRACKET, i);
		}
		public List<TerminalNode> ELIF_KEYWORD() { return getTokens(JavaParser.ELIF_KEYWORD); }
		public TerminalNode ELIF_KEYWORD(int i) {
			return getToken(JavaParser.ELIF_KEYWORD, i);
		}
		public TerminalNode ELSE_KEYWORD() { return getToken(JavaParser.ELSE_KEYWORD, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(IF_KEYWORD);
			setState(175);
			match(LEFT_BRACKET);
			setState(176);
			expression(0);
			setState(177);
			match(RIGHT_BRACKET);
			setState(178);
			match(LEFT_CURLYBRACKET);
			setState(179);
			body();
			setState(180);
			match(RIGHT_CURLYBRACKET);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF_KEYWORD) {
				{
				{
				setState(181);
				match(ELIF_KEYWORD);
				setState(182);
				match(LEFT_BRACKET);
				setState(183);
				expression(0);
				setState(184);
				match(RIGHT_BRACKET);
				setState(185);
				match(LEFT_CURLYBRACKET);
				setState(186);
				body();
				setState(187);
				match(RIGHT_CURLYBRACKET);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KEYWORD) {
				{
				setState(194);
				match(ELSE_KEYWORD);
				setState(195);
				match(LEFT_CURLYBRACKET);
				setState(196);
				body();
				setState(197);
				match(RIGHT_CURLYBRACKET);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE_KEYWORD() { return getToken(JavaParser.WHILE_KEYWORD, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(JavaParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(JavaParser.RIGHT_BRACKET, 0); }
		public TerminalNode LEFT_CURLYBRACKET() { return getToken(JavaParser.LEFT_CURLYBRACKET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RIGHT_CURLYBRACKET() { return getToken(JavaParser.RIGHT_CURLYBRACKET, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(WHILE_KEYWORD);
			setState(202);
			match(LEFT_BRACKET);
			setState(203);
			expression(0);
			setState(204);
			match(RIGHT_BRACKET);
			setState(205);
			match(LEFT_CURLYBRACKET);
			setState(206);
			body();
			setState(207);
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
		public TerminalNode RETURN_KEYWORD() { return getToken(JavaParser.RETURN_KEYWORD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(RETURN_KEYWORD);
			setState(210);
			expression(0);
			setState(211);
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
		public TerminalNode SEMICOLON() { return getToken(JavaParser.SEMICOLON, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			type();
			setState(214);
			variableDeclarator();
			setState(215);
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
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode OPERATORS_ASSIGNMENT() { return getToken(JavaParser.OPERATORS_ASSIGNMENT, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableArrayDeclaratorContext variableArrayDeclarator() {
			return getRuleContext(VariableArrayDeclaratorContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclarator);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(Identifier);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_ASSIGNMENT) {
					{
					setState(218);
					match(OPERATORS_ASSIGNMENT);
					setState(219);
					variableInitializer();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				variableArrayDeclarator();
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
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableInitializer);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
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

	public static class VariableArrayDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode OPERATORS_ASSIGNMENT() { return getToken(JavaParser.OPERATORS_ASSIGNMENT, 0); }
		public VariableArrayInitializerContext variableArrayInitializer() {
			return getRuleContext(VariableArrayInitializerContext.class,0);
		}
		public VariableArrayDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableArrayDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableArrayDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableArrayDeclarator(this);
		}
	}

	public final VariableArrayDeclaratorContext variableArrayDeclarator() throws RecognitionException {
		VariableArrayDeclaratorContext _localctx = new VariableArrayDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableArrayDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(Identifier);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATORS_ASSIGNMENT) {
				{
				setState(230);
				match(OPERATORS_ASSIGNMENT);
				setState(231);
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
		public TerminalNode LEFT_CURLYBRACKET() { return getToken(JavaParser.LEFT_CURLYBRACKET, 0); }
		public TerminalNode RIGHT_CURLYBRACKET() { return getToken(JavaParser.RIGHT_CURLYBRACKET, 0); }
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
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableArrayInitializer(this);
		}
	}

	public final VariableArrayInitializerContext variableArrayInitializer() throws RecognitionException {
		VariableArrayInitializerContext _localctx = new VariableArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variableArrayInitializer);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(LEFT_CURLYBRACKET);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << LEFT_BRACKET) | (1L << EXCLAMATION) | (1L << Identifier))) != 0)) {
					{
					setState(235);
					variableArrayInitializerList();
					}
				}

				setState(238);
				match(RIGHT_CURLYBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
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

	public static class OperatorsContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(JavaParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(JavaParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(JavaParser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(JavaParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(JavaParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(JavaParser.LESS_EQUAL, 0); }
		public TerminalNode ANDAND() { return getToken(JavaParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(JavaParser.OROR, 0); }
		public TerminalNode PLUS() { return getToken(JavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JavaParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(JavaParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitOperators(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANDAND) | (1L << OROR) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER) | (1L << GREATER_EQUAL) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MUL))) != 0)) ) {
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

	public static class Asgn_operatorsContext extends ParserRuleContext {
		public TerminalNode ADD_ASSIGN() { return getToken(JavaParser.ADD_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JavaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JavaParser.DIV_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JavaParser.SUB_ASSIGN, 0); }
		public TerminalNode OPERATORS_ASSIGNMENT() { return getToken(JavaParser.OPERATORS_ASSIGNMENT, 0); }
		public Asgn_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asgn_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAsgn_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAsgn_operators(this);
		}
	}

	public final Asgn_operatorsContext asgn_operators() throws RecognitionException {
		Asgn_operatorsContext _localctx = new Asgn_operatorsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_asgn_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << OPERATORS_ASSIGNMENT))) != 0)) ) {
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
		public TerminalNode LEFT_BRACKET() { return getToken(JavaParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(JavaParser.RIGHT_BRACKET, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atom);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(LEFT_BRACKET);
				setState(248);
				expression(0);
				setState(249);
				match(RIGHT_BRACKET);
				}
				break;
			case IntegerLiteral:
			case CharacterLiteral:
			case NullLiteral:
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
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
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public VariableArrayInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableArrayInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableArrayInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableArrayInitializerList(this);
		}
	}

	public final VariableArrayInitializerListContext variableArrayInitializerList() throws RecognitionException {
		VariableArrayInitializerListContext _localctx = new VariableArrayInitializerListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableArrayInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			variableInitializer();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(256);
				match(COMMA);
				setState(257);
				variableInitializer();
				}
				}
				setState(262);
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
		public TerminalNode INT_KEYWORD() { return getToken(JavaParser.INT_KEYWORD, 0); }
		public TerminalNode BOOLEAN_KEYWORD() { return getToken(JavaParser.BOOLEAN_KEYWORD, 0); }
		public TerminalNode CHAR_KEYWORD() { return getToken(JavaParser.CHAR_KEYWORD, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_type);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
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
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			primitiveType();
			setState(270);
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
		public List<TerminalNode> LEFT_SQUAREBRACKET() { return getTokens(JavaParser.LEFT_SQUAREBRACKET); }
		public TerminalNode LEFT_SQUAREBRACKET(int i) {
			return getToken(JavaParser.LEFT_SQUAREBRACKET, i);
		}
		public List<TerminalNode> RIGHT_SQUAREBRACKET() { return getTokens(JavaParser.RIGHT_SQUAREBRACKET); }
		public TerminalNode RIGHT_SQUAREBRACKET(int i) {
			return getToken(JavaParser.RIGHT_SQUAREBRACKET, i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(LEFT_SQUAREBRACKET);
			setState(273);
			match(RIGHT_SQUAREBRACKET);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_SQUAREBRACKET) {
				{
				{
				setState(274);
				match(LEFT_SQUAREBRACKET);
				setState(275);
				match(RIGHT_SQUAREBRACKET);
				}
				}
				setState(280);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u011c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\3\3\3\3"+
		"\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\7\6a\n\6\f"+
		"\6\16\6d\13\6\3\6\3\6\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\5\bo\n\b\3\b\3\b\3"+
		"\t\3\t\3\t\7\tv\n\t\f\t\16\ty\13\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\5\f\u0084\n\f\3\f\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16\f\u008d\13\f\3\r"+
		"\7\r\u0090\n\r\f\r\16\r\u0093\13\r\3\16\3\16\3\16\5\16\u0098\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u00a1\n\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00af\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00c0\n\25"+
		"\f\25\16\25\u00c3\13\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ca\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\5\31\u00df\n\31\3\31\5\31\u00e2\n\31\3\32\3\32\5"+
		"\32\u00e6\n\32\3\33\3\33\3\33\5\33\u00eb\n\33\3\34\3\34\5\34\u00ef\n\34"+
		"\3\34\3\34\3\34\5\34\u00f4\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0100\n\37\3 \3 \3 \7 \u0105\n \f \16 \u0108\13 \3!\3"+
		"!\3\"\3\"\5\"\u010e\n\"\3#\3#\3#\3$\3$\3$\3$\7$\u0117\n$\f$\16$\u011a"+
		"\13$\3$\2\3\26%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDF\2\7\4\2\3\4\6\7\3\2\21\25\4\2\37&(+\3\2,\60\3\2\b\n\2\u0114"+
		"\2K\3\2\2\2\4P\3\2\2\2\6U\3\2\2\2\b[\3\2\2\2\n^\3\2\2\2\fi\3\2\2\2\16"+
		"k\3\2\2\2\20r\3\2\2\2\22z\3\2\2\2\24}\3\2\2\2\26\u0083\3\2\2\2\30\u0091"+
		"\3\2\2\2\32\u0097\3\2\2\2\34\u0099\3\2\2\2\36\u00a0\3\2\2\2 \u00a2\3\2"+
		"\2\2\"\u00a4\3\2\2\2$\u00a6\3\2\2\2&\u00ae\3\2\2\2(\u00b0\3\2\2\2*\u00cb"+
		"\3\2\2\2,\u00d3\3\2\2\2.\u00d7\3\2\2\2\60\u00e1\3\2\2\2\62\u00e5\3\2\2"+
		"\2\64\u00e7\3\2\2\2\66\u00f3\3\2\2\28\u00f5\3\2\2\2:\u00f7\3\2\2\2<\u00ff"+
		"\3\2\2\2>\u0101\3\2\2\2@\u0109\3\2\2\2B\u010d\3\2\2\2D\u010f\3\2\2\2F"+
		"\u0112\3\2\2\2HJ\5\6\4\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2"+
		"\2\2MK\3\2\2\2NO\7\2\2\3O\3\3\2\2\2PQ\t\2\2\2Q\5\3\2\2\2RT\5\24\13\2S"+
		"R\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\5\b\5\2"+
		"YZ\5\n\6\2Z\7\3\2\2\2[\\\5\f\7\2\\]\5\16\b\2]\t\3\2\2\2^b\7\31\2\2_a\5"+
		"\32\16\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2e"+
		"f\7\32\2\2f\13\3\2\2\2gj\5B\"\2hj\7\20\2\2ig\3\2\2\2ih\3\2\2\2j\r\3\2"+
		"\2\2kl\7\64\2\2ln\7\35\2\2mo\5\20\t\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq"+
		"\7\36\2\2q\17\3\2\2\2rw\5\22\n\2st\7\27\2\2tv\5\22\n\2us\3\2\2\2vy\3\2"+
		"\2\2wu\3\2\2\2wx\3\2\2\2x\21\3\2\2\2yw\3\2\2\2z{\5B\"\2{|\7\64\2\2|\23"+
		"\3\2\2\2}~\t\3\2\2~\25\3\2\2\2\177\u0080\b\f\1\2\u0080\u0081\7\'\2\2\u0081"+
		"\u0084\5\26\f\5\u0082\u0084\5<\37\2\u0083\177\3\2\2\2\u0083\u0082\3\2"+
		"\2\2\u0084\u008b\3\2\2\2\u0085\u0086\f\4\2\2\u0086\u0087\58\35\2\u0087"+
		"\u0088\5\26\f\5\u0088\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u008a\u008d\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\27\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0090\5\32\16\2\u008f\u008e\3\2\2\2\u0090\u0093\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\31\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0098\5&\24\2\u0095\u0098\5\34\17\2\u0096\u0098\5"+
		".\30\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\33\3\2\2\2\u0099\u009a\5\36\20\2\u009a\u009b\5:\36\2\u009b\u009c\5 \21"+
		"\2\u009c\u009d\7\26\2\2\u009d\35\3\2\2\2\u009e\u00a1\5\"\22\2\u009f\u00a1"+
		"\5$\23\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\37\3\2\2\2\u00a2"+
		"\u00a3\5\26\f\2\u00a3!\3\2\2\2\u00a4\u00a5\7\64\2\2\u00a5#\3\2\2\2\u00a6"+
		"\u00a7\7\64\2\2\u00a7\u00a8\7\33\2\2\u00a8\u00a9\7\3\2\2\u00a9\u00aa\7"+
		"\34\2\2\u00aa%\3\2\2\2\u00ab\u00af\5(\25\2\u00ac\u00af\5*\26\2\u00ad\u00af"+
		"\5,\27\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\'\3\2\2\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\7\35\2\2\u00b2\u00b3\5\26\f"+
		"\2\u00b3\u00b4\7\36\2\2\u00b4\u00b5\7\31\2\2\u00b5\u00b6\5\30\r\2\u00b6"+
		"\u00c1\7\32\2\2\u00b7\u00b8\7\r\2\2\u00b8\u00b9\7\35\2\2\u00b9\u00ba\5"+
		"\26\f\2\u00ba\u00bb\7\36\2\2\u00bb\u00bc\7\31\2\2\u00bc\u00bd\5\30\r\2"+
		"\u00bd\u00be\7\32\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b7\3\2\2\2\u00c0\u00c3"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c9\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c5\7\16\2\2\u00c5\u00c6\7\31\2\2\u00c6\u00c7\5"+
		"\30\r\2\u00c7\u00c8\7\32\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca)\3\2\2\2\u00cb\u00cc\7\13\2\2\u00cc\u00cd\7\35\2"+
		"\2\u00cd\u00ce\5\26\f\2\u00ce\u00cf\7\36\2\2\u00cf\u00d0\7\31\2\2\u00d0"+
		"\u00d1\5\30\r\2\u00d1\u00d2\7\32\2\2\u00d2+\3\2\2\2\u00d3\u00d4\7\17\2"+
		"\2\u00d4\u00d5\5\26\f\2\u00d5\u00d6\7\26\2\2\u00d6-\3\2\2\2\u00d7\u00d8"+
		"\5B\"\2\u00d8\u00d9\5\60\31\2\u00d9\u00da\7\26\2\2\u00da/\3\2\2\2\u00db"+
		"\u00de\7\64\2\2\u00dc\u00dd\7\60\2\2\u00dd\u00df\5\62\32\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00e2\5\64\33\2"+
		"\u00e1\u00db\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\61\3\2\2\2\u00e3\u00e6"+
		"\5\26\f\2\u00e4\u00e6\5<\37\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2"+
		"\u00e6\63\3\2\2\2\u00e7\u00ea\7\64\2\2\u00e8\u00e9\7\60\2\2\u00e9\u00eb"+
		"\5\66\34\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\65\3\2\2\2\u00ec"+
		"\u00ee\7\31\2\2\u00ed\u00ef\5> \2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f4\7\32\2\2\u00f1\u00f4\5\26\f\2\u00f2"+
		"\u00f4\5<\37\2\u00f3\u00ec\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2"+
		"\2\2\u00f4\67\3\2\2\2\u00f5\u00f6\t\4\2\2\u00f69\3\2\2\2\u00f7\u00f8\t"+
		"\5\2\2\u00f8;\3\2\2\2\u00f9\u00fa\7\35\2\2\u00fa\u00fb\5\26\f\2\u00fb"+
		"\u00fc\7\36\2\2\u00fc\u0100\3\2\2\2\u00fd\u0100\5\4\3\2\u00fe\u0100\7"+
		"\64\2\2\u00ff\u00f9\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"=\3\2\2\2\u0101\u0106\5\62\32\2\u0102\u0103\7\27\2\2\u0103\u0105\5\62"+
		"\32\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107?\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\t\6\2\2"+
		"\u010aA\3\2\2\2\u010b\u010e\5@!\2\u010c\u010e\5D#\2\u010d\u010b\3\2\2"+
		"\2\u010d\u010c\3\2\2\2\u010eC\3\2\2\2\u010f\u0110\5@!\2\u0110\u0111\5"+
		"F$\2\u0111E\3\2\2\2\u0112\u0113\7\33\2\2\u0113\u0118\7\34\2\2\u0114\u0115"+
		"\7\33\2\2\u0115\u0117\7\34\2\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2"+
		"\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119G\3\2\2\2\u011a\u0118\3"+
		"\2\2\2\32KUbinw\u0083\u008b\u0091\u0097\u00a0\u00ae\u00c1\u00c9\u00de"+
		"\u00e1\u00e5\u00ea\u00ee\u00f3\u00ff\u0106\u010d\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}