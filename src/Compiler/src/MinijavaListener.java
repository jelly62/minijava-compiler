// Generated from Minijava.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinijavaParser}.
 */
public interface MinijavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull MinijavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull MinijavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull MinijavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull MinijavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MinijavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MinijavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull MinijavaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull MinijavaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull MinijavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull MinijavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull MinijavaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull MinijavaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull MinijavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull MinijavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinijavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull MinijavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinijavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull MinijavaParser.ClassDeclarationContext ctx);
}