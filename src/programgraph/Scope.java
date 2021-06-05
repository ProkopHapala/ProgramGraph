
package programgraph;

import java.util.HashMap;

public class Scope {
    Scope parent;
    HashMap<String,Variable>  variables;
    HashMap<String,Function> functions;
    HashMap<String,Type>        types;
    
    Scope(){
        variables = new HashMap<String,Variable>();
        functions = new HashMap<String,Function>();
        types     = new HashMap<String,Type>();
    }

    boolean new_func( String name, String[] in, String[] out ){ return functions.put   (name,new Function(name,in,out,this))!=null; }
    boolean new_func( String name ){ return functions.put   (name,new Function(name))!=null; }
    boolean del_func( String name ){ return functions.remove(name)!=null; }
    
    boolean new_type( String name ){ return types.put   (name,new Type(name))!=null; }
    boolean del_type( String name ){ return types.remove(name)!=null; }
    
    boolean new_var( String name, String typeName ){ return new_var( name, types.get(typeName)); }
    boolean new_var( String name, Type t ){ return variables.put   (name,new Variable(name,t))!=null; }
    boolean del_var( String name         ){ return variables.remove(name)!=null; }
    
    void printContent(){
        System.out.println("|| types ||");
        Utils.print( types );
        System.out.println("|| variables ||");
        Utils.print( variables );
        System.out.println("|| functions ||");
        Utils.print( functions );
    }
    //void printVars(){ for( Map.Entry<String,Variable> pair ) System.out. ; }
    //void printFunctions(){ "" };
    //void printTypes(){ "" };

    Type find_type(String name) {
        Type t=types.get(name);
        if( (t==null) && (parent!=null) ) t=parent.find_type(name); 
        return t;
    }

}
