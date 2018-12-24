// Generated from Minijava.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MinijavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MinijavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MinijavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull MinijavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinijavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(@NotNull MinijavaParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinijavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull MinijavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinijavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull MinijavaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinijavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull MinijavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinijavaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull MinijavaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinijavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(@NotNull MinijavaParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinijavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull MinijavaParser.ClassDeclarationContext ctx);
}