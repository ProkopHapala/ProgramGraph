
package programgraph;

import java.util.HashMap;

public class ProgramGraph {
    
    //HashMap<String,Function> functions;
    //HashMap<String,Variable> objects;
    //Scope scope;
    CodeBlock code;
    
    ProgramGraph(){ code=new CodeBlock(); }
    
    public static void main(String[] args) {
        ProgramGraph pg = new ProgramGraph();
        Scope scope = pg.code.scope;
        scope.new_type( "Integer" );
        scope.new_type( "Real" );
        scope.new_var ( "x", "Integer" );
        //scope.new_func( "dot" );
        
        scope.new_func( "sqrt",new String[]{"Real"},new String[]{"Real"} );
        
        scope.printContent();
        
        /*
        System.out.println(":: types ::");
        Utils.print( scope.variables );
        System.out.println(":: variables ::");
        Utils.print( scope.variables );
        System.out.println(":: functions ::");
        Utils.print( scope.functions );
        */
    }
    
}
