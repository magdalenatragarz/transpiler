import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import instructions.*;

public class JavaLikeListenerImpl implements JavaLikeListener {

    public MatlabCodeBuilder builder;
    private List<MatlabFunctionBuilder> functionBuilders;

    public JavaLikeListenerImpl() {
        this.builder = new MatlabCodeBuilder();
        this.functionBuilders = new ArrayList<>();
    }

    @Override
    public void exitCompilationUnit(JavaLikeParser.CompilationUnitContext ctx) {
        builder.setFunctions(functionBuilders);
    }

    @Override
    public void enterFunction(JavaLikeParser.FunctionContext ctx) {
        functionBuilders.add(new MatlabFunctionBuilder());
    }

    @Override
    public void exitFunction(JavaLikeParser.FunctionContext ctx) {
        functionBuilders.get(functionBuilders.size()-1).addClosing();
    }

    @Override
    public void enterMethodDeclarator(JavaLikeParser.MethodDeclaratorContext ctx) {
        functionBuilders.get(functionBuilders.size()-1).setFunctionName(ctx.methodName().getText());
    }

    @Override
    public void enterParameter(JavaLikeParser.ParameterContext ctx) {
        functionBuilders.get(functionBuilders.size()-1).addParameter(ctx.parameterName().getText());
    }


    @Override
    public void exitIfStatement(JavaLikeParser.IfStatementContext ctx) {
        functionBuilders.get(functionBuilders.size()-1).addClosing();
    }

    @Override
    public void enterBasicIfStatement(JavaLikeParser.BasicIfStatementContext ctx) {
        IfInstruction ifInstruction = new IfInstruction();
        ifInstruction.setKey("if");
        ifInstruction.setRelationalExpression(ctx.relationalExpression().getText());
        functionBuilders.get(functionBuilders.size()-1).addInstruction(ifInstruction);
    }

    @Override
    public void enterElsefifStatement(JavaLikeParser.ElsefifStatementContext ctx) {
        IfInstruction ifInstruction = new IfInstruction();
        ifInstruction.setKey("elif");
        ifInstruction.setRelationalExpression(ctx.relationalExpression().getText());
        functionBuilders.get(functionBuilders.size()-1).addInstruction(ifInstruction);
    }

    @Override
    public void enterElseStatement(JavaLikeParser.ElseStatementContext ctx) {
        IfInstruction ifInstruction = new IfInstruction();
        ifInstruction.setKey("else");
        functionBuilders.get(functionBuilders.size()-1).addInstruction(ifInstruction);
    }


    @Override
    public void enterVariableArrayDeclarationInitialization(JavaLikeParser.VariableArrayDeclarationInitializationContext ctx) {
        ArrayDeclarationInstruction arrayDeclarationInstruction = new ArrayDeclarationInstruction();
        arrayDeclarationInstruction.setName(ctx.variableName().getText());
        arrayDeclarationInstruction.setInitializationList(ctx.variableArrayInitializer().getText());
        functionBuilders.get(functionBuilders.size()-1).addInstruction(arrayDeclarationInstruction);
    }

    @Override
    public void enterBasicVariableDeclarationInitialization(JavaLikeParser.BasicVariableDeclarationInitializationContext ctx) {
        FieldDeclarationInstruction fieldDeclarationInstruction = new FieldDeclarationInstruction();
        fieldDeclarationInstruction.setName(ctx.variableName().getText());
        fieldDeclarationInstruction.setDeclarator(ctx.variableInitializer().getText());
        functionBuilders.get(functionBuilders.size()-1).addInstruction(fieldDeclarationInstruction);

    }

    @Override
    public void enterCompilationUnit(JavaLikeParser.CompilationUnitContext ctx) {

    }

    @Override
    public void enterBasicDeclarator(JavaLikeParser.BasicDeclaratorContext ctx) {

    }

    @Override
    public void enterVariableDeclarator(JavaLikeParser.VariableDeclaratorContext ctx) {

    }

    @Override
    public void enterFieldDeclaration(JavaLikeParser.FieldDeclarationContext ctx) {

    }

    @Override
    public void enterRelationalExpression(JavaLikeParser.RelationalExpressionContext ctx) {

    }

    @Override
    public void enterIfStatement(JavaLikeParser.IfStatementContext ctx) {

    }

    @Override
    public void enterLiteral(JavaLikeParser.LiteralContext ctx) {

    }

    @Override
    public void exitLiteral(JavaLikeParser.LiteralContext ctx) {

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
    public void exitMethodDeclarator(JavaLikeParser.MethodDeclaratorContext ctx) {

    }

    @Override
    public void enterMethodName(JavaLikeParser.MethodNameContext ctx) {

    }

    @Override
    public void exitMethodName(JavaLikeParser.MethodNameContext ctx) {

    }

    @Override
    public void enterParameterList(JavaLikeParser.ParameterListContext ctx) {

    }

    @Override
    public void exitParameterList(JavaLikeParser.ParameterListContext ctx) {

    }



    @Override
    public void exitParameter(JavaLikeParser.ParameterContext ctx) {

    }

    @Override
    public void enterParameterName(JavaLikeParser.ParameterNameContext ctx) {

    }

    @Override
    public void exitParameterName(JavaLikeParser.ParameterNameContext ctx) {

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
        AssignmentInstruction assignmentInstruction = new AssignmentInstruction();
        assignmentInstruction.setName(ctx.leftHandSide().getText());
        assignmentInstruction.setDeclarator(ctx.rightHandSide().getText());
        functionBuilders.get(functionBuilders.size()-1).addInstruction(assignmentInstruction);

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
    public void exitBasicIfStatement(JavaLikeParser.BasicIfStatementContext ctx) {

    }

    @Override
    public void exitElsefifStatement(JavaLikeParser.ElsefifStatementContext ctx) {

    }

    @Override
    public void exitElseStatement(JavaLikeParser.ElseStatementContext ctx) {

    }

    @Override
    public void enterWhileStatement(JavaLikeParser.WhileStatementContext ctx) {
        WhileInstruction whileInstruction = new WhileInstruction();
        whileInstruction.setKey("while");
        whileInstruction.setRelationalExpression(ctx.relationalExpression().getText());
        functionBuilders.get(functionBuilders.size()-1).addInstruction(whileInstruction);

    }

    @Override
    public void exitWhileStatement(JavaLikeParser.WhileStatementContext ctx) {
        functionBuilders.get(functionBuilders.size()-1).addClosing();

    }

    @Override
    public void enterReturnStatement(JavaLikeParser.ReturnStatementContext ctx) {
        ReturnInstruction returnInstruction = new ReturnInstruction();
        returnInstruction.setDeclarator(ctx.expression().getText());
        functionBuilders.get(functionBuilders.size()-1).addInstruction(returnInstruction);
    }

    @Override
    public void exitReturnStatement(JavaLikeParser.ReturnStatementContext ctx) {

    }


    @Override
    public void exitFieldDeclaration(JavaLikeParser.FieldDeclarationContext ctx) {

    }


    @Override
    public void exitVariableDeclarator(JavaLikeParser.VariableDeclaratorContext ctx) {

    }

    @Override
    public void enterVariableName(JavaLikeParser.VariableNameContext ctx) {

    }

    @Override
    public void exitVariableName(JavaLikeParser.VariableNameContext ctx) {

    }

    @Override
    public void enterVariableInitializer(JavaLikeParser.VariableInitializerContext ctx) {

    }

    @Override
    public void exitVariableInitializer(JavaLikeParser.VariableInitializerContext ctx) {

    }


    @Override
    public void exitBasicDeclarator(JavaLikeParser.BasicDeclaratorContext ctx) {

    }


    @Override
    public void exitBasicVariableDeclarationInitialization(JavaLikeParser.BasicVariableDeclarationInitializationContext ctx) {

    }

    @Override
    public void exitVariableArrayDeclarationInitialization(JavaLikeParser.VariableArrayDeclarationInitializationContext ctx) {

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
