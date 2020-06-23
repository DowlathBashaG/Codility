package io.dowlath.codility.misc;
/**
 * @Author Dowlath
 * @create 6/16/2020 11:43 AM
 */

// much elegant solution
// not using "Math.max( 0, maxEndingHere + A[i])"
// Instead, using "Math.max( A[i], maxEndingPrevious + A[i] )"

class MaxSliceSum {
    public int solution(int[] A) {
        
        // initial setting A[0]
        int maxEndingPrevious = A[0];
        int maxEndingHere = A[0];
        int maxSoFar = A[0];
 
        // note: for i=0, it will return A[0] (also for "one element" cases)  
           
        for(int i = 1; i < A.length; i++){
            maxEndingHere = Math.max(A[i], maxEndingPrevious + A[i]); // <--- key point~!!
            maxEndingPrevious = maxEndingHere;
            maxSoFar = Math.max(maxSoFar, maxEndingHere); // update the max (be careful)
        }
        
        return maxSoFar; // can be used for "all negative" cases 
    }
}
