// This solution is simple and correct, but with low performance (100% correct, 40% performance)

package io.dowlath.codility.misc;
/**
 * @Author Dowlath
 * @create 6/16/2020 11:43 AM
 */

import java.util.*;

class CountDistinctSlices_SimpleLowPerformance {
    public int solution(int M, int[] A) {
       
        // key point: using "set" for "each leftEnd"
        Set<Integer> set = new HashSet<>();
        
        int leftEnd =0;
        int rightEnd =0;      
        int numDistinct =0; 
        
        while(leftEnd < A.length){        
            rightEnd = leftEnd;  // for each time, rightEnd bigins at leftEnd
            while(rightEnd < A.length){
                if( set.contains( A[rightEnd] ) == false){ // distinct cases
                    numDistinct++;
                    
                    if(numDistinct == 1_000_000_000)
                        return 1_000_000_000;
                    
                    set.add(A[rightEnd]);
                }
                else{ // not distinct cases (then, break~!!)
                    break;
                }
                rightEnd++;
            }
        
            set.clear(); // for next leftEnd   
            leftEnd++;
        }
        
        return numDistinct;
    }
}
