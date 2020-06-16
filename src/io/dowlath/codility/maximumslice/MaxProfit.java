package io.dowlath.codility.maximumslice;

/**
 * @Author Dowlath
 * @create 6/16/2020 11:43 AM
 */
/*
      using local and global max sum identify the global max value.
 */
public class MaxProfit {

    public static void main(String[] args) {
        //                                                            -2160 , 112 , 243 , -353, 354
        System.out.println(new MaxProfit().solution(new int[]{23171 , 21011 , 21123 , 21366 , 21013 , 21367}));
        //                                                                   Best max profit is 356

    }

    private int solution(int[] A) {
        int globalMaxSum = 0;
        int localMaxSum = 0;
        for(int i=1;i<A.length;i++){
            int d = A[i] - A[i-1];
            localMaxSum = Math.max(d,localMaxSum+d);
            globalMaxSum = Math.max(localMaxSum,globalMaxSum);
        }
        return globalMaxSum;
    }

}
