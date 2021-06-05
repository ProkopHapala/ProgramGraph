
package programgraph;

import java.util.HashMap;

public class Operation {
    
    static HashMap<String,FundamentalFunction> fundamentals; 
    
    // Binds variables from outer scope to function
    Scope    scope;
    Function function;  // if function ==null it is fundamental operation
    //Variable [] inputs;   
    //Variable [] outputs;
    //Character fun_op;   // fundamental operation
    Argument [] operands;
    
    Operation( String s){
        //Argument [] operands;
        fromString(s);
    }
    
    void eval(){
        if(function==null){
        }else{
        }
    }
    
    void fromString(String s){
        String[] tokens = s.split(" ");
        for(int i=0; i<tokens.length; i++ ){
            String tok = tokens[i];  
            if(i==0){
                FundamentalFunction f = fundamentals.get( tok );
            }else{
                
            }
        }
    }
}
