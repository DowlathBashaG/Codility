package io.dowlath.codility.equilibrium;

/**
 * @Author Dowlath
 * @create 6/14/2020 2:57 AM
 */
public class Equilibrium {
    public static void main(String[] args) {
        int[] a = { 3,1,2,4,3 };
        int result = solution(a);
        System.out.println(result);
    }
    private static int solution(int[] a){
        int leftSum = a[0];
        int rightSum = 0;
        for(int x: a){
            rightSum = rightSum + x;
        }
        rightSum = rightSum - leftSum;
        int diff = Math.abs(leftSum - rightSum);
        for( int i = 1;i<a.length-1;i++){
            leftSum = leftSum + a[i];
            rightSum = rightSum - a[i];
            int currentDiff = Math.abs(leftSum - rightSum);
            if( diff > currentDiff)
                diff = currentDiff;
        }
        return diff;
    }
}
