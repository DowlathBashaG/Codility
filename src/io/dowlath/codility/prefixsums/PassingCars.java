package io.dowlath.codility.prefixsums;

/**
 * @Author Dowlath
 * @create 6/16/2020 1:56 PM
 */
public class PassingCars {
    public static void main(String[] args) {
        System.out.println(new PassingCars().solution(new int[]{0,1,0,1,1}));
    }

    private int solution(int[] A) {

        int[] suffixSum = new int[A.length+1];
        for(int i=A.length-1;i>=0;i--){
            suffixSum[i] = A[i] + suffixSum[i+1];
        }

        int count = 0;
        for(int i =0;i<A.length;i++){
            /*
                    3cars            2cars
                [   0     ,   1   ,    0    ,    1    ,    1   ]       => input
                [   3     ,   3   ,    2    ,    2    ,    1  ,  0 ]   => suffix

                So, here we are comparing A[i] is equal to zero (0) , then get the cars

                Total cars meet in opposite direction 5

             */
            if(A[i] == 0)
                count+=suffixSum[i];
            if(count > 1000000000) return -1;
        }

        return count;
    }

}
