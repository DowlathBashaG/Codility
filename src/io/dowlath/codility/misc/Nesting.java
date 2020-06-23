package io.dowlath.codility.misc;
/**
 * @Author Dowlath
 * @create 6/16/2020 11:43 AM
 */

// you can also use imports, for example:
import java.util.*;

class Nesting {
    public int solution(String S) {

        // special case 1: empty string
        if( S.length() ==0)
            return 1;
        // special case 2: odd length
        else if( S.length() % 2 == 1)
            return 0;

        // main idea: use "stack" to check
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<S.length(); i++){
            
            if( S.charAt(i)=='(' ){
                st.push(')'); // note: push its pair (be careful)
            }
            else if(S.charAt(i)==')'){
                
                // before pop: need to check if stack is empty (important)
                if(st.isEmpty() == true){
                    return 0;
                }
                else{
                    char temp = st.pop();
                    if( temp != ')'){
                        return 0;
                    }   
                }
            }
        }
        
        // be careful: if stack is "not empty" -> return 0
        if( !st.isEmpty() )
            return 0;
        else 
            return 1;   
    }
}
