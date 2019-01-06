import java.util.Scanner;
 
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		
		ANTLRInputStream input = new ANTLRInputStream(words);
		
		MinijavaLexer lexer = new MinijavaLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		MinijavaParser parse = new MinijavaParser(tokens);
		
		ParseTree tree = parse.prog();
		System.out.println(tree.toStringTree(parse));


	}

}
