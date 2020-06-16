package io.dowlath.codility.euclidean;

/**
 * @Author Dowlath
 * @create 6/16/2020 5:30 PM
 */

/*
      Greatest Common Divisor Algorithm :

            A           B                  R

            39          27         1  ->  12
            27          12         2  ->  3
            12          3          4  ->  0
            3           0

            If B reaches zero (0) , so GCD is 3 for (39,27) set of pair.

*/
public class ChocolatesByNumbers {
    public static void main(String[] args) {
        System.out.println(new ChocolatesByNumbers().solution(10,4));
        System.out.println(new ChocolatesByNumbers().solution(9,6));
        System.out.println(new ChocolatesByNumbers().solution(10,11));
    }

    /*
            N   ->   No. of chocolates

            M   ->   Steps to eat

            LCM  =>  N * M / GCD

                     10 * 4 / 2 = 20

                     N = 10 * 2 = 20
                     M = 4 * 5 = 20  => Least Common Multiple

                     M * x =  LCM
                     M * x =  N * M / GCD
                         x =  N * M / GCD * M
                         x =  N / GCD
                         5 =  10 / 2
              Note :

                       result = N / GCD ( N, M )
                       5 =  10 / 2

     */
    private int solution(int N, int M) {
        return N / findGCD(N,M);
    }

    private int findGCD(int a, int b){
        if( b==0){
            return a;
        }else{
            return findGCD(b,a %b );
        }

    }

}
