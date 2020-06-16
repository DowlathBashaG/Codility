package io.dowlath.codility.divcount;

/**
 * @Author Dowlath
 * @create 6/16/2020 2:46 PM
 */

/*
      try :   https://tryjshell.org/

      Ceil -> gives round value , for example  7/2 = 3.5

              Math.ceil(7 / (double)2)  => 4. 0

      floor -> cuts the value , example 11/2 => 5.5

              Math.floor(11 / (double)2)  => 5. 0

      A = 6 , B = 11

      [ 6 ,8 ,9 , 10,11 ]  K = 2

      formula :

      start  = A / k

      end    = B / k

      result = end - start + 1


 */
public class CountDiv {
    public static void main(String[] args) {
        // parameters like , start (A) , end (B) , divisible by 2 (k)
        System.out.println(new CountDiv().solution(6,11,2));
    }

    private int solution(int a,int b, int k) {
        double nStart = Math.ceil(a / (double)k );
        double nEnd = Math.floor(b / (double)k );
        return (int) (nEnd-nStart) + 1;
    }
}
