import java.io.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
	public static void main(String[] args) throws IOException{
		EventQueue.invokeLater(() -> {
    	JFrame frame= new CreateFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });	
  
    }
}

class CreateFrame extends JFrame implements ActionListener{
    
	private Button ybt;
	private JTextField tf1,tf2;
	private JTextPane ta1,ta2;
	
	public CreateFrame(){
		JFrame f = new JFrame();
		f.setTitle("分析器_14300270021_15307130322");
		
		ta1 = new JTextPane();
		ta1.setBounds(20, 0, 600, 30);
		ta1.setBackground(new Color(0,0,0,0));
		ta1.setFont(new Font("幼圆", Font.BOLD, 20));
		ta1.setText("请输入需要分析的文档名字，如：binarysearch(.txt格式)");
		
		tf1 = new JTextField();
	    tf1.setBounds(20, 50, 500, 50);
	    tf1.setFont(new Font("幼圆", Font.BOLD, 20));
	    tf1.addActionListener(this);
	    
	    ta2 = new JTextPane();
		ta2.setBounds(20, 120, 500, 30);
		ta2.setBackground(new Color(0,0,0,0));
		ta2.setFont(new Font("幼圆", Font.BOLD, 20));
		ta2.setText("请输入文档的地址，若是windows系统，请用\\\\分割");
		
	    tf2 = new JTextField();
	    tf2.setBounds(20, 180, 500, 50);
	    tf2.setFont(new Font("幼圆", Font.BOLD, 20));
	    tf2.addActionListener(this);
	    
		ybt=new Button("开始分析");
		ybt.setFont(new Font("幼圆", Font.BOLD, 20));
		ybt.addActionListener(this);
		ybt.setBounds(190, 280, 100, 50);
		
		f.add(ta1);
		f.add(tf1);
		f.add(ta2);
		f.add(tf2);
		f.add(ybt);
        f.setSize(700, 400);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
	}
	
	//if clicked
	public void actionPerformed(ActionEvent event) {
		
		Object source=event.getSource();
		String s1 = tf1.getText();
		String s2 = tf2.getText();

		if(source==ybt) {
			//buttonPanel.setBackground(Color.yellow);
		      try {
		    	  String s3 = "java org.antlr.v4.runtime.misc.TestRig Minijava prog -gui " + s1 +".txt";
				Runtime.getRuntime().exec(s3,null,new File(s2));
				//Runtime.getRuntime().exec("java org.antlr.v4.runtime.misc.TestRig Minijava prog -gui factorial.txt",null,new File("F:\\javaworkspace\\Compiler"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

/*
FileInputStream fis = null;
InputStreamReader isr = null;
BufferedReader br = null; 
try {
	String str = "";
	String str1 = "";
	fis = new FileInputStream("factorial.txt");// FileInputStream
	
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
	
	MinijavaBaseListener minilistener = new MinijavaBaseListener();
	 ParseTreeWalker walker = new ParseTreeWalker();
	 // Walk the tree created during the parse, trigger callbacks
	 walker.walk(minilistener, tree);
	 System.out.println(tree.getChildCount()); // print a \n after translation
	
	
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
*/