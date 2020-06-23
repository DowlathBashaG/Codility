package io.dowlath.codility.misc;
/**
 * @Author Dowlath
 * @create 6/16/2020 11:43 AM
 */

class ChocolatesByNumbers {
    public int solution(int N, int M) {

        // main idea: 
        // using "gcd(M, N)"
        // the number of eaten chocolates = N / gcd(M,N)
        return N/(gcd(N,M));
    }

    // using "Euclidean Algorithm" (important)
    public static int gcd(int a,int b){
        if(a % b == 0)
            return b;            // case 1
        else
            return gcd(b,a % b); // case 2 (key point)
    }

}
