
package programgraph;

public class FunctionUsr extends Function {
    
    CodeBlock   body;      // if code block is =0 it is fundamental

    public FunctionUsr(String name_) { super(name_); }
    public FunctionUsr( String name_, String[] args_, Scope scope ){ super( name_, args_, scope ); };
}
