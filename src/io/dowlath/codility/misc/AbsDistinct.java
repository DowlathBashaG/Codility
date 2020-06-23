package io.dowlath.codility.misc;
/**
 * @Author Dowlath
 * @create 6/16/2020 11:43 AM
 */
import java.util.*;

class AbsDistinct {
    public int solution(int[] A) {
        
        // using "Set"
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<A.length; i++){
            // note: using "Math.abs(int)"
            if( set.contains( Math.abs(A[i]) ) == false ){
                set.add( Math.abs(A[i]) );
            }
            else{
                // do nothing (already existed in the set)
            }
        }
        
        return set.size();
     }
}
