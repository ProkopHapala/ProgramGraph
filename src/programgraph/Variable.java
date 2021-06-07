
package programgraph;

public class Variable {
    
    enum Lifetime{ PIPE, SCOPE, GLOBAL };

    //int id;     // it would be faster to search by ID rather than by string, but it would complicate things, so keep it simple now
    String name;  
    Type   type;
    
    Variable(String name_, Type type_){name=name_; type=type_; };
    
    @Override
    public String toString(){ return name+":"+type.name; }
}
