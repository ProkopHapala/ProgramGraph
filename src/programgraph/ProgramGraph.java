
package programgraph;



/*

Program Graphg is like 

   *       *  Nodes are operations
    \     /
     \   /    Links are variables with some lifetime
      \ /
       *     Nodes are operations
      / \
     /   \
    /     \
   *       * 

Lifetime of variables can be limited (pipe-varaibles)
 



DOCS:

https://paper.dropbox.com/doc/Language-for-Metaprograming--BMO8eOlCxM7qcTz_bLdEHrSYAg-r8hW4VMMeTELPEV9ltJRn
https://paper.dropbox.com/doc/MetaProgramingLanguage-string-tokens--BMNjge_Lmrzlw8vdtyjUlvUNAg-NV95ATfZdY3abF4cG2k4R
https://paper.dropbox.com/doc/MyLang-WishList--BMPYCs6ETT9ZSDt9RDObTK0xAg-3zz5CWTWgDq8Z9YzUM1a6



*/

import java.util.HashMap;

public class ProgramGraph {
    
    //HashMap<String,Function> functions;
    //HashMap<String,Variable> objects;
    //Scope scope;
    CodeBlock code;
    
    ProgramGraph(){ 
        Globals.initFundamentals();
        code=new CodeBlock(); 
        code.scope.parent = Globals.fundamentalScope;
    }
    
    public static void main(String[] args) {
        ProgramGraph pg = new ProgramGraph();
        
        System.out.println( "======= Fundamental Scope ========" );
        Globals.fundamentalScope.printContent();
        
        System.out.println( "======= Main Scope ========" );
        Scope scope = pg.code.scope;
        
        //scope.new_func( "sqrt",new String[]{"Real"},new String[]{"Real"} );
        scope.new_func( "sqrt",new String[]{"<x:Number",">y:Real"} );
                
        Globals.new_funcFundamental("+",new String[]{"<a:Number","<b:Number",">Number"});
        
        scope.printContent();

    }
    
}
