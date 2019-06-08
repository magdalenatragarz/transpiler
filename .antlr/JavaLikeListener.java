// Generated from JavaLike.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaLikeParser}.
 */
public interface JavaLikeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(JavaLikeParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(JavaLikeParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#mainBody}.
	 * @param ctx the parse tree
	 */
	void enterMainBody(JavaLikeParser.MainBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#mainBody}.
	 * @param ctx the parse tree
	 */
	void exitMainBody(JavaLikeParser.MainBodyContext ctx);
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
	 * Enter a parse tree produced by {@link JavaLikeParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(JavaLikeParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(JavaLikeParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(JavaLikeParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(JavaLikeParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(JavaLikeParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(JavaLikeParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(JavaLikeParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(JavaLikeParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaLikeParser#type_keyword}.
	 * @param ctx the parse tree
	 */
	void enterType_keyword(JavaLikeParser.Type_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#type_keyword}.
	 * @param ctx the parse tree
	 */
	void exitType_keyword(JavaLikeParser.Type_keywordContext ctx);
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
	 * Enter a parse tree produced by {@link JavaLikeParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(JavaLikeParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaLikeParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(JavaLikeParser.OperatorsContext ctx);
}