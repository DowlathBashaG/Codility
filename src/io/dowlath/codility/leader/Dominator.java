package io.dowlath.codility.leader;

/**
 * @Author Dowlath
 * @create 6/16/2020 2:01 AM
 */

/*
      Leader formula :

                The given array , which element is more times present ,

                [ 3,0,1,1,4,1,1 ] -> 1 is present in more times.

                so, k > length of the array / 2  => it present in k times ,  4 > 7/2 = true .

                Leader is 1 .

                Note :

                In this pgm , printing index value of maximum occurrence.
                [ printing last index value ]
 */
public class Dominator {
    public static void main(String[] args) {

        // 1 is the dominator number in this array
        System.out.println(new Dominator().solution(new int[]{3,0,1,1,4,1,1}));

        // Non of the numbers are dominating in this array, so return -1
        System.out.println(new Dominator().solution(new int[]{1,2,3,4,5,6,7}));
    }

    private int solution(int[] A) {
        int consecutiveSize = 0;
        int candidate = 0;

        // check the matching with next element
        for(int item : A){
            if(consecutiveSize == 0){
                candidate = item;
                consecutiveSize+=1;
            } else if(candidate == item){
                consecutiveSize+=1;
            } else{
                consecutiveSize-=1;
            }
        }

        // Identifying candidate in the array
        int occurrence = 0;
        int index = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] == candidate){
                occurrence+=1;
                index = i;
            }
        }
        // this is for checking leader
        return occurrence > A.length / 2.0 ? index : -1;
    }
}
