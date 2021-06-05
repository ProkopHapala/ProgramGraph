/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programgraph;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Utils {
    void printStringStep( Set<String> ss ){
        for( String s : ss )
        System.out.println( ss );
    }
    
    static <K,T> void print( HashMap<K,T> hm ){ 
        for( Map.Entry<K,T> pair : hm.entrySet() ){ 
            System.out.println( pair.getKey()+" : "+pair.getValue() );
        }
    }

/*
    void print( HashMap<String,String> hm ){ 
        for( Map.Entry<String,String> pair : hm.entrySet() ){ 
            System.out.println( pair.getKey()+" : "+pair.getValue() );
        }
    }
*/
}
