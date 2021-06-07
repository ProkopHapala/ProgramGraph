
package programgraph;

public class Globals {
    static Scope fundamentalScope;
    
    static boolean new_funcFundamental( String name, String[] args ){ return fundamentalScope.functions.put (name,new FunctionFundamental(name,args,fundamentalScope))!=null; }
    
    
    static void initFundamentals(){
        fundamentalScope = new Scope();
        Scope sc = fundamentalScope;
        sc.new_type( "Any", (Type)null  );
        sc.new_type( "Number","Any"     );
        sc.new_type( "Integer","Number" );
        sc.new_type( "Real","Number"    );
        sc.new_var ( "x", "Integer"     );
        
        new_funcFundamental( "+",new String[]{"<a:Number","<b:Number",">Number"} );
        new_funcFundamental( "-",new String[]{"<a:Number","<b:Number",">Number"} );
        new_funcFundamental( "*",new String[]{"<a:Number","<b:Number",">Number"} );
        new_funcFundamental( "/",new String[]{"<a:Number","<b:Number",">Number"} );
        
        Globals.new_funcFundamental("+",new String[]{"<a:Number","<b:Number",">Number"});
    }
}
