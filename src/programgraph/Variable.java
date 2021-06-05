
package programgraph;

public class Variable {
    String name;
    Type   type;
    
    Variable(String name_, Type type_){name=name_; type=type_; };
    
    @Override
    public String toString(){ return name+":"+type.name; }
}
