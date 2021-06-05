
package programgraph;

import java.util.ArrayList;

public class Type {
    String name;
    int memsize; // in bytes
    ArrayList<Type>     properties;
    ArrayList<Function> methods;
    
    Type(String name_){
        name=name_;
        properties = new ArrayList<Type>();
        methods    = new ArrayList<Function>();
    }
    
    //@Override
    //public String toString(){ type.name; }
}
