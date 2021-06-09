
package programgraph;

/*

 * Functions are overloaded a bit like in Julia
    * There are now "methods" - but maybe will be added late (?)
    * by A.f() We can specify method NameSpace (scope) rather than object instance 
 * Function can be defined both type-bound and type-unbound (accepting "Any" argument type )
    * "Any" type does not have to be specified  
    * for this type unbound function additional type-bound can be set within the function body (not in header)
      * there can be dynamical dispath for type-unbound function within the body
    * by default the type-unbound version of function ("Any") should be probably undefined 


*/

import java.util.ArrayList;

abstract public class Function {
    String name;
    Scope  inScope;
    // ToDo : what about named variables ?
    //ArrayList<Variable> input;
    //ArrayList<Variable> output;
    // once defined number of arguments for function is final (?)
    
    // ToDo : isnt it better to consider operands from which some are input and some are output ???
    //Variable [] input;
    //Variable [] output;
    Argument [] args;

    
    /*
    void argFromString(int i, String s){
        args[i]=Argument
    }
    */
    
    
    Function( String name_ ){ name=name_; }
    Function( String name_, String[] args_, Scope scope ){
        //super(name_);
        inScope = scope;
        name=name_;
        args = new Argument[args_.length];
        for(int i=0; i<args_.length; i++){
            args[i] = new Argument(args_[i],scope);
        }
    }
    
    void eval(){
        // this is for fundamental functions
        //if(body != null){  // composite operation  
        //}else{   // fundamental operation
        //    //fun_op=;
        //}
    }
    
    
    public String toString(){
        String argS="";
        for(int i=0; i<args.length;  i++){ argS +=args[i]+", "; }
        return name+"("+argS+")";
    }
        
    /*
    @Override
    public String toString(){
        String inS="";
        String outS="";
        for(int i=0; i<input.length;  i++){ inS +=input [i]+", "; }
        for(int i=0; i<output.length; i++){ outS+=output[i]+", "; }
        return name+"("+inS+")->("+outS+")";
    }
    */
}
