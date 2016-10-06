package messingAround;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ClassDiagramVisitor extends VoidVisitorAdapter {
	 public void visit(ClassOrInterfaceDeclaration n, Object arg){
		 System.out.println("Class Name: " + n.getName());
		 
		 for (ClassOrInterfaceType coi : n.getImplements()) {
			 	System.out.println("\nClass Implements: ");
			 	System.out.println(coi.getName());
		 }		 
		 
		 for(ClassOrInterfaceType coi : n.getExtends()){
//			 System.out.println("Class does not extend, no generalisation"); 
				 
//			 }
//			 else{
			 System.out.println("\nClass Extends: ");
			 System.out.println(coi.getName());
//			 }
		 }
		 super.visit(n, arg);
	 }
}
