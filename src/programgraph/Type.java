
package programgraph;

import java.util.ArrayList;

// There is a rule - child cannot overide properties of parrent (it can only add new)

public class Type {
    Type parrent;
   
    String name;
    int memsize; // in bytes
    ArrayList<Type>     interfaces;
    ArrayList<Type>     properties;
    ArrayList<Function> methods;
    
    Type(String name_, Type parrent_){
        name=name_;
        parrent=parrent_;
        interfaces = new ArrayList<Type>();
        properties = new ArrayList<Type>();
        methods    = new ArrayList<Function>();
    }
                
    @Override
    public String toString(){
        String s=name;
        if(parrent!=null)s+="<"+parrent.name; 
        return s;
    }
}
