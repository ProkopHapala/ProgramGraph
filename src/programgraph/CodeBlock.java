
package programgraph;

import java.util.ArrayList;

public class CodeBlock{
    Scope                scope;
    ArrayList<Operation> operations;
    
    CodeBlock(){
        scope      = new Scope();
        operations = new ArrayList<Operation>();
    }
    
    boolean new_var( String name, Type t ){ return scope.new_var(name,t); }
    boolean del_var( String name         ){ return scope.del_var(name);   }
}
