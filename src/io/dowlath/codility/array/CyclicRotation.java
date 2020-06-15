package io.dowlath.codility.array;

import java.util.Arrays;

/**
 * @Author Dowlath
 * @create 6/14/2020 4:53 PM
 */

/*
        Array Rotation ( Cyclic Rotation )                                                                                          :

        Formula :

			(i+k) % size

				->	i -> Iteration

				->	k -> No of position

				->	size -> Array Size.

 */
public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int k =2;
        int[] result = solution(A,k);
        System.out.println(Arrays.toString(result));
    }
    private static int[] solution(int[] A,int k){
        int[] res = new int[A.length];
        for(int i=0;i<A.length;i++){
            res[ (i + k) % A.length ] = A[i];
        }
        return res;
    }
}
