// Generated from /home/magda/transpil/transpiler/JavaLike.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaLikeParser}.
 */
public interface JavaLikeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaLikeParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaLikeParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaLikeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaLikeParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(JavaLikeParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(JavaLikeParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(JavaLikeParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(JavaLikeParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaLikeParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaLikeParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(JavaLikeParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(JavaLikeParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(JavaLikeParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(JavaLikeParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(JavaLikeParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(JavaLikeParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JavaLikeParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JavaLikeParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(JavaLikeParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(JavaLikeParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void enterParameterName(JavaLikeParser.ParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void exitParameterName(JavaLikeParser.ParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaLikeParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaLikeParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaLikeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaLikeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(JavaLikeParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(JavaLikeParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JavaLikeParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JavaLikeParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JavaLikeParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JavaLikeParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JavaLikeParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JavaLikeParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(JavaLikeParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(JavaLikeParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(JavaLikeParser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(JavaLikeParser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaLikeParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaLikeParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(JavaLikeParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(JavaLikeParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#rightHandSide}.
	 * @param ctx the parse tree
	 */
	void enterRightHandSide(JavaLikeParser.RightHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#rightHandSide}.
	 * @param ctx the parse tree
	 */
	void exitRightHandSide(JavaLikeParser.RightHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void enterVariableAccess(JavaLikeParser.VariableAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void exitVariableAccess(JavaLikeParser.VariableAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(JavaLikeParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(JavaLikeParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaLikeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaLikeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JavaLikeParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JavaLikeParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavaLikeParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavaLikeParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaLikeParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaLikeParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaLikeParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaLikeParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaLikeParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaLikeParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaLikeParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaLikeParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#variableArrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableArrayDeclarator(JavaLikeParser.VariableArrayDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#variableArrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableArrayDeclarator(JavaLikeParser.VariableArrayDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#variableArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableArrayInitializer(JavaLikeParser.VariableArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#variableArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableArrayInitializer(JavaLikeParser.VariableArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#comparsion_operators}.
	 * @param ctx the parse tree
	 */
	void enterComparsion_operators(JavaLikeParser.Comparsion_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#comparsion_operators}.
	 * @param ctx the parse tree
	 */
	void exitComparsion_operators(JavaLikeParser.Comparsion_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#additive_operators}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_operators(JavaLikeParser.Additive_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#additive_operators}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_operators(JavaLikeParser.Additive_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#multiplicative_operators}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_operators(JavaLikeParser.Multiplicative_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#multiplicative_operators}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_operators(JavaLikeParser.Multiplicative_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#assign_operators}.
	 * @param ctx the parse tree
	 */
	void enterAssign_operators(JavaLikeParser.Assign_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#assign_operators}.
	 * @param ctx the parse tree
	 */
	void exitAssign_operators(JavaLikeParser.Assign_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#bool_operators}.
	 * @param ctx the parse tree
	 */
	void enterBool_operators(JavaLikeParser.Bool_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#bool_operators}.
	 * @param ctx the parse tree
	 */
	void exitBool_operators(JavaLikeParser.Bool_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(JavaLikeParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(JavaLikeParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#variableArrayInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableArrayInitializerList(JavaLikeParser.VariableArrayInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#variableArrayInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableArrayInitializerList(JavaLikeParser.VariableArrayInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaLikeParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaLikeParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaLikeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaLikeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(JavaLikeParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(JavaLikeParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JavaLikeParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JavaLikeParser.DimsContext ctx);
}