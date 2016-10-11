package messingAround;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

/**
 * Simple visitor implementation for visiting MethodDeclaration nodes. 
 */

public class MethodVisitor extends VoidVisitorAdapter {

    @Override
    public void visit(MethodDeclaration n, Object arg) {
        // here you can access the attributes of the method.
        // this method will be called for all methods in this 
        // CompilationUnit, including inner class methods
    	
    	
        System.out.println("Name: " + n.getName());
        System.out.println("Declaration: " + n.getDeclarationAsString());
        System.out.println("Parameters: " + n.getParameters());
//        System.out.println("Body: " + n.getBody() + "\n");
        System.out.println();
        
        super.visit(n, arg);
    }
}