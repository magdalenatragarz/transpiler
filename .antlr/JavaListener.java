// Generated from Java.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(JavaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(JavaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(JavaParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(JavaParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(JavaParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(JavaParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(JavaParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(JavaParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JavaParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JavaParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(JavaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(JavaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(JavaParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(JavaParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(JavaParser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(JavaParser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(JavaParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(JavaParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#rightHandSide}.
	 * @param ctx the parse tree
	 */
	void enterRightHandSide(JavaParser.RightHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#rightHandSide}.
	 * @param ctx the parse tree
	 */
	void exitRightHandSide(JavaParser.RightHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void enterVariableAccess(JavaParser.VariableAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void exitVariableAccess(JavaParser.VariableAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(JavaParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(JavaParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableArrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableArrayDeclarator(JavaParser.VariableArrayDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableArrayDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableArrayDeclarator(JavaParser.VariableArrayDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableArrayInitializer(JavaParser.VariableArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableArrayInitializer(JavaParser.VariableArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(JavaParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(JavaParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#asgn_operators}.
	 * @param ctx the parse tree
	 */
	void enterAsgn_operators(JavaParser.Asgn_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#asgn_operators}.
	 * @param ctx the parse tree
	 */
	void exitAsgn_operators(JavaParser.Asgn_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(JavaParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(JavaParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableArrayInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableArrayInitializerList(JavaParser.VariableArrayInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableArrayInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableArrayInitializerList(JavaParser.VariableArrayInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(JavaParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(JavaParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JavaParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JavaParser.DimsContext ctx);
}