import java.io.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null; 
		try {
			String str = "";
			String str1 = "";
			fis = new FileInputStream("binarysearch.txt");// FileInputStream
			
			isr = new InputStreamReader(fis);// InputStreamReader
			br = new BufferedReader(isr);// 
			while ((str = br.readLine()) != null) {
				str1 += str + "\n";
				
			}
			
			
			//System.out.println(str1);// 
			ANTLRInputStream input = new ANTLRInputStream(str1);
			MinijavaLexer lexer = new MinijavaLexer(input);		
			CommonTokenStream tokens = new CommonTokenStream(lexer);	
			MinijavaParser parse = new MinijavaParser(tokens);
			ParseTree tree = parse.prog();
			System.out.println(tree.toStringTree(parse));
			
			
		} catch (FileNotFoundException e) {
			System.out.println("cannot find the file");
		} catch (IOException e) {
			System.out.println("failed to read the file");
		} finally {
			try {
				br.close();
				isr.close();
				fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
