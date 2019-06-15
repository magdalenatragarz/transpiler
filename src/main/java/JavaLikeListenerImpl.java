import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JavaLikeListenerImpl implements JavaLikeListener {

    @Override
    public void enterCompilationUnit(JavaLikeParser.CompilationUnitContext ctx) {
        String className = ctx.function().toString();
    }

    @Override
    public void exitCompilationUnit(JavaLikeParser.CompilationUnitContext ctx) {

    }

    @Override
    public void enterLiteral(JavaLikeParser.LiteralContext ctx) {

    }

    @Override
    public void exitLiteral(JavaLikeParser.LiteralContext ctx) {

    }

    @Override
    public void enterFunction(JavaLikeParser.FunctionContext ctx) {

    }

    @Override
    public void exitFunction(JavaLikeParser.FunctionContext ctx) {

    }

    @Override
    public void enterMethodHeader(JavaLikeParser.MethodHeaderContext ctx) {

    }

    @Override
    public void exitMethodHeader(JavaLikeParser.MethodHeaderContext ctx) {

    }

    @Override
    public void enterMethodBody(JavaLikeParser.MethodBodyContext ctx) {

    }

    @Override
    public void exitMethodBody(JavaLikeParser.MethodBodyContext ctx) {

    }

    @Override
    public void enterResult(JavaLikeParser.ResultContext ctx) {

    }

    @Override
    public void exitResult(JavaLikeParser.ResultContext ctx) {

    }

    @Override
    public void enterMethodDeclarator(JavaLikeParser.MethodDeclaratorContext ctx) {

    }

    @Override
    public void exitMethodDeclarator(JavaLikeParser.MethodDeclaratorContext ctx) {

    }

    @Override
    public void enterParameterList(JavaLikeParser.ParameterListContext ctx) {

    }

    @Override
    public void exitParameterList(JavaLikeParser.ParameterListContext ctx) {

    }

    @Override
    public void enterParameter(JavaLikeParser.ParameterContext ctx) {

    }

    @Override
    public void exitParameter(JavaLikeParser.ParameterContext ctx) {

    }

    @Override
    public void enterModifier(JavaLikeParser.ModifierContext ctx) {

    }

    @Override
    public void exitModifier(JavaLikeParser.ModifierContext ctx) {

    }

    @Override
    public void enterExpression(JavaLikeParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(JavaLikeParser.ExpressionContext ctx) {

    }

    @Override
    public void enterArithmeticExpression(JavaLikeParser.ArithmeticExpressionContext ctx) {

    }

    @Override
    public void exitArithmeticExpression(JavaLikeParser.ArithmeticExpressionContext ctx) {

    }

    @Override
    public void enterAdditiveExpression(JavaLikeParser.AdditiveExpressionContext ctx) {

    }

    @Override
    public void exitAdditiveExpression(JavaLikeParser.AdditiveExpressionContext ctx) {

    }

    @Override
    public void enterMultiplicativeExpression(JavaLikeParser.MultiplicativeExpressionContext ctx) {

    }

    @Override
    public void exitMultiplicativeExpression(JavaLikeParser.MultiplicativeExpressionContext ctx) {

    }

    @Override
    public void enterRelationalExpression(JavaLikeParser.RelationalExpressionContext ctx) {

    }

    @Override
    public void exitRelationalExpression(JavaLikeParser.RelationalExpressionContext ctx) {

    }

    @Override
    public void enterBody(JavaLikeParser.BodyContext ctx) {

    }

    @Override
    public void exitBody(JavaLikeParser.BodyContext ctx) {

    }

    @Override
    public void enterLines(JavaLikeParser.LinesContext ctx) {

    }

    @Override
    public void exitLines(JavaLikeParser.LinesContext ctx) {

    }

    @Override
    public void enterAssignment(JavaLikeParser.AssignmentContext ctx) {

    }

    @Override
    public void exitAssignment(JavaLikeParser.AssignmentContext ctx) {

    }

    @Override
    public void enterLeftHandSide(JavaLikeParser.LeftHandSideContext ctx) {

    }

    @Override
    public void exitLeftHandSide(JavaLikeParser.LeftHandSideContext ctx) {

    }

    @Override
    public void enterRightHandSide(JavaLikeParser.RightHandSideContext ctx) {

    }

    @Override
    public void exitRightHandSide(JavaLikeParser.RightHandSideContext ctx) {

    }

    @Override
    public void enterVariableAccess(JavaLikeParser.VariableAccessContext ctx) {

    }

    @Override
    public void exitVariableAccess(JavaLikeParser.VariableAccessContext ctx) {

    }

    @Override
    public void enterArrayAccess(JavaLikeParser.ArrayAccessContext ctx) {

    }

    @Override
    public void exitArrayAccess(JavaLikeParser.ArrayAccessContext ctx) {

    }

    @Override
    public void enterStatement(JavaLikeParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(JavaLikeParser.StatementContext ctx) {

    }

    @Override
    public void enterIfStatement(JavaLikeParser.IfStatementContext ctx) {

    }

    @Override
    public void exitIfStatement(JavaLikeParser.IfStatementContext ctx) {

    }

    @Override
    public void enterWhileStatement(JavaLikeParser.WhileStatementContext ctx) {

    }

    @Override
    public void exitWhileStatement(JavaLikeParser.WhileStatementContext ctx) {

    }

    @Override
    public void enterReturnStatement(JavaLikeParser.ReturnStatementContext ctx) {

    }

    @Override
    public void exitReturnStatement(JavaLikeParser.ReturnStatementContext ctx) {

    }

    @Override
    public void enterFieldDeclaration(JavaLikeParser.FieldDeclarationContext ctx) {

    }

    @Override
    public void exitFieldDeclaration(JavaLikeParser.FieldDeclarationContext ctx) {

    }

    @Override
    public void enterVariableDeclarator(JavaLikeParser.VariableDeclaratorContext ctx) {

    }

    @Override
    public void exitVariableDeclarator(JavaLikeParser.VariableDeclaratorContext ctx) {

    }

    @Override
    public void enterVariableInitializer(JavaLikeParser.VariableInitializerContext ctx) {

    }

    @Override
    public void exitVariableInitializer(JavaLikeParser.VariableInitializerContext ctx) {

    }

    @Override
    public void enterVariableArrayDeclarator(JavaLikeParser.VariableArrayDeclaratorContext ctx) {

    }

    @Override
    public void exitVariableArrayDeclarator(JavaLikeParser.VariableArrayDeclaratorContext ctx) {

    }

    @Override
    public void enterVariableArrayInitializer(JavaLikeParser.VariableArrayInitializerContext ctx) {

    }

    @Override
    public void exitVariableArrayInitializer(JavaLikeParser.VariableArrayInitializerContext ctx) {

    }

    @Override
    public void enterComparsion_operators(JavaLikeParser.Comparsion_operatorsContext ctx) {

    }

    @Override
    public void exitComparsion_operators(JavaLikeParser.Comparsion_operatorsContext ctx) {

    }

    @Override
    public void enterAdditive_operators(JavaLikeParser.Additive_operatorsContext ctx) {

    }

    @Override
    public void exitAdditive_operators(JavaLikeParser.Additive_operatorsContext ctx) {

    }

    @Override
    public void enterMultiplicative_operators(JavaLikeParser.Multiplicative_operatorsContext ctx) {

    }

    @Override
    public void exitMultiplicative_operators(JavaLikeParser.Multiplicative_operatorsContext ctx) {

    }

    @Override
    public void enterAssign_operators(JavaLikeParser.Assign_operatorsContext ctx) {

    }

    @Override
    public void exitAssign_operators(JavaLikeParser.Assign_operatorsContext ctx) {

    }

    @Override
    public void enterBool_operators(JavaLikeParser.Bool_operatorsContext ctx) {

    }

    @Override
    public void exitBool_operators(JavaLikeParser.Bool_operatorsContext ctx) {

    }

    @Override
    public void enterAtom(JavaLikeParser.AtomContext ctx) {

    }

    @Override
    public void exitAtom(JavaLikeParser.AtomContext ctx) {

    }

    @Override
    public void enterVariableArrayInitializerList(JavaLikeParser.VariableArrayInitializerListContext ctx) {

    }

    @Override
    public void exitVariableArrayInitializerList(JavaLikeParser.VariableArrayInitializerListContext ctx) {

    }

    @Override
    public void enterPrimitiveType(JavaLikeParser.PrimitiveTypeContext ctx) {

    }

    @Override
    public void exitPrimitiveType(JavaLikeParser.PrimitiveTypeContext ctx) {

    }

    @Override
    public void enterType(JavaLikeParser.TypeContext ctx) {

    }

    @Override
    public void exitType(JavaLikeParser.TypeContext ctx) {

    }

    @Override
    public void enterArrayType(JavaLikeParser.ArrayTypeContext ctx) {

    }

    @Override
    public void exitArrayType(JavaLikeParser.ArrayTypeContext ctx) {

    }

    @Override
    public void enterDims(JavaLikeParser.DimsContext ctx) {

    }

    @Override
    public void exitDims(JavaLikeParser.DimsContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
