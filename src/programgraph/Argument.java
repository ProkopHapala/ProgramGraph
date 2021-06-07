/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programgraph;

public class Argument {
    //enum Access{ IN,OUT,INOUT,REF };
    char     access;  // <IN >OUT *INOUT &REF
    String   name;
    Type     type;
    Variable bind;
    
    Argument(String s,Scope scope){
        access=s.charAt(0);
        String[] toks = s.substring(1).split(":");
        String typeName;
        if(toks.length>1){
            typeName =toks[1];
            name     =toks[0];
        }else{ typeName=toks[0]; }
        type=scope.find_type(typeName);
        //System.out.println( "arg : "+name+" : "+typeName );
        if(type==null){ System.out.println("ERROR: type '"+typeName+"' not found in scope"); }
    }
    
    public String toString(){
        if(name==null){ 
            return ""+access+""+type.name;
        }else{ 
            return ""+access+""+name+":"+type.name;
        }
    }
}
