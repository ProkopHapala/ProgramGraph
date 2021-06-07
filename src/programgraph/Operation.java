
package programgraph;

/*

Operations


< > = ~=    # comparison operators
+ - * /     # arithmetic operators ( ~+ is -, ~* is / )
& | ^ << >> # bitwise logical operators (can be combined with ~ )
%     # continuous range/sequence  ( e.g. 2%6 is 2,3,4,5 )
# ~#  # add/remove item into sequence (.insert, .put, ) 
$ ~$  # define/undefine new variable (used also for constructor/destructor with $@)
@     # pointer
. ~.  # sub-element,  ~. super element in hierarchy
,     # separator of items in unordered set 
;     # separator of items in ordered sequence 
      # ; sparates blocking execution of commans, "," separates paralel operations
! ~!  # transforms set->sequence , to ; and back (also parael/sequential code)
: ~:  # Assignment, unassignment (leaves undefined, NaN)
()    # evaluation bracket
{}    # declaration bracket
[]    # Enum set, tuple - list of finite size of items
      # array access is not by arr[i] but arr.i
?( ?[ # condition ?(bool){} is if(bool){} and ?(int)[] is switch(int)[] 
~     # Inverse operator
\ ~\  # Quote code, Eval=unquote code
` `*  # Comment ` single line  `* multi-line closed by *`
@     # ... Quote
'     # ... single character or numeral (no need of closing)
      # 2of3() is valid name of function ( use '26464 for number literal constant )
"     # ... string (need to be closed) 


*/


import java.util.HashMap;

public class Operation {
    
    static HashMap<String,FunctionFundamental> fundamentals; 
    
    // Binds variables from outer scope to function
    Scope    scope;
    Function function;  // if function ==null it is fundamental operation
    //Variable [] inputs;   
    //Variable [] outputs;
    //Character fun_op;   // fundamental operation
    Variable [] operands;
    
    Operation( String s, Scope scope){
        //Argument [] operands;
        fromString(s, scope);
        
    }
    
    void eval(){
        if(function==null){
        }else{
        }
    }
    
    void fromString(String s, Scope scope){
        String[] tokens = s.split(" ");
        operands = new Variable[tokens.length];
        for(int i=0; i<tokens.length; i++ ){
            String tok = tokens[i];  
            if(i==0){
                FunctionFundamental ff = fundamentals.get( tok );
                if(ff==null){
                    Function f = scope.find_func(tok);
                }
            }else{
                Variable v = scope.find_var(tok);
                operands[i-1] = v;
            }
        }
    }
}
