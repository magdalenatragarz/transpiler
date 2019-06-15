// Generated from /home/magda/transpil/transpiler/JavaLike.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaLikeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaLikeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JavaLikeParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaLikeParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(JavaLikeParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(JavaLikeParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaLikeParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(JavaLikeParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(JavaLikeParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(JavaLikeParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(JavaLikeParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(JavaLikeParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#parameterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterName(JavaLikeParser.ParameterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(JavaLikeParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaLikeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(JavaLikeParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(JavaLikeParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(JavaLikeParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(JavaLikeParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(JavaLikeParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLines(JavaLikeParser.LinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JavaLikeParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(JavaLikeParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#rightHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightHandSide(JavaLikeParser.RightHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#variableAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAccess(JavaLikeParser.VariableAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(JavaLikeParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaLikeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JavaLikeParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#basicIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicIfStatement(JavaLikeParser.BasicIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#elsefifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsefifStatement(JavaLikeParser.ElsefifStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(JavaLikeParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JavaLikeParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaLikeParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaLikeParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaLikeParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(JavaLikeParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JavaLikeParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#basicDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicDeclarator(JavaLikeParser.BasicDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#basicVariableDeclarationInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicVariableDeclarationInitialization(JavaLikeParser.BasicVariableDeclarationInitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#variableArrayDeclarationInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableArrayDeclarationInitialization(JavaLikeParser.VariableArrayDeclarationInitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#variableArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableArrayInitializer(JavaLikeParser.VariableArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#comparsion_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparsion_operators(JavaLikeParser.Comparsion_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#additive_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_operators(JavaLikeParser.Additive_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#multiplicative_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_operators(JavaLikeParser.Multiplicative_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#assign_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_operators(JavaLikeParser.Assign_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#bool_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_operators(JavaLikeParser.Bool_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(JavaLikeParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#variableArrayInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableArrayInitializerList(JavaLikeParser.VariableArrayInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaLikeParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaLikeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(JavaLikeParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaLikeParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(JavaLikeParser.DimsContext ctx);
}