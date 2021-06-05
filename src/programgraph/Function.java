
package programgraph;

import java.util.ArrayList;

public class Function {
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
    CodeBlock body;      // if code block is =0 it is fundamental
    
    /*
    void argFromString(int i, String s){
        args[i]=Argument
    }
    */
    
    Function(String name_){ name=name_; }
    
    Function(String name_, String[] args_, Scope scope ){
        inScope = scope;
        name=name_;
        args = new Argument[args_.length];
        for(int i=0; i<args_.length; i++){
            args[i] = new Argument(args_[i],scope);
        }
    }
        
    /*
    Function(String name_, String[] input_, String[] output_, Scope scope ){
        inScope = scope;
        name=name_;
        input  = new Variable[input_.length];
        output = new Variable[output_.length];
        for(int i=0; i<input_.length; i++){
            Type t = scope.find_type(input_[i]);
            if(t==null){ System.out.println("ERROR: type '"+input_[i]+"' not found in scope"); }
            input[i] = new Variable("in"+i, t  );
        }
        for(int i=0; i<output_.length; i++){
            Type t = scope.find_type(output_[i]);
            if(t==null){ System.out.println("ERROR: type '"+output_[i]+"' not found in scope"); }
            output[i] = new Variable("out"+i, t  );
        }
    }
    */
    
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
