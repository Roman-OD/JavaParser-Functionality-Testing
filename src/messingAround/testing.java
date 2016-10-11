package messingAround;

import java.io.FileInputStream;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;



public class testing {

	
	 public static void main(String[] args) throws Exception {
	        // creates an input stream for the file to be parsed
		 	String file = "StockController.java";
	        FileInputStream in = new FileInputStream(file);
	       
	        CompilationUnit cu;
	        try {
	            // parse the file
	            cu = JavaParser.parse(in);
	        } finally {
	            in.close();
	        }

	        // visit and print the methods names
	        
	       
	        
	        System.out.println("Code Testing Toolset\n\n");
	        System.out.println("Part 1: Static Analysis\n\n");
	        System.out.println("Filename: " + file + "\n\n");
	        System.out.println("Methods:\n");
	        new MethodVisitor().visit(cu, null);
	        System.out.println("\n\nGeneralisation and Realisation Test:\n\n");
	        new ClassDiagramVisitor().visit(cu,null);
	    }

	   
	 
	
	    
}
