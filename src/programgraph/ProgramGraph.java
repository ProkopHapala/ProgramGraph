
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
        scope.new_type( "Any", (Type)null );
        scope.new_type( "Number","Any" );
        scope.new_type( "Integer","Number" );
        scope.new_type( "Real","Number" );
        scope.new_var ( "x", "Integer" );
        //scope.new_func( "dot" );
        
        //scope.new_func( "sqrt",new String[]{"Real"},new String[]{"Real"} );
        scope.new_func( "sqrt",new String[]{"<x:Number",">y:Real"} );
        
        scope.new_func( "+",new String[]{"<a:Number","<b:Number",">Number"} );
        scope.new_func( "-",new String[]{"<a:Number","<b:Number",">Number"} );
        scope.new_func( "*",new String[]{"<a:Number","<b:Number",">Number"} );
        scope.new_func( "/",new String[]{"<a:Number","<b:Number",">Number"} );
        
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
