# Codility

## Array Cyclic Rotation

Array Rotation ( Cyclic Rotation )                                                                                          :

Formula :   

			(i+k) % size

					i -> Iteration
			 
					k -> No of position
			 
					size -> Array Size.


## Equal Brackets 

Equal Brackets : formula

           push -> leftBrackets , like ( { , [ , (  )
           
           pop  -> rightBrackets , like ( } , ] , ) );
           
           if stack is empty return 1 ( true )
           
           else return 0 ( false )
	   
## Count Div Problem

Note : 

		  try :   https://tryjshell.org/

				  ceil -> gives round value , for example  7/2 = 3.5

						  Math.ceil(7 / (double)2)  => 4. 0

				  floor -> cuts the value , example 11/2 => 5.5

						  Math.floor(11 / (double)2)  => 5. 0

Count Div Problem :

   A = 6 , B = 11
      
      [ 6 ,8 ,9 , 10,11 ]  K = 2
      
      formula : 
      
      start  = A / k 
      
      end    = B / k
      
      result = end - start + 1 
      
## GCD Eculidean

Eculidean :

   Greatest Common Divisor Algorithm :
      
            A           B                  R
            
            39          27         1  ->  12
            27          12         2  ->  3
            12          3          4  ->  0
            3           0 
            
            If B reaches zero (0) , so GCD is 3 for (39,27) set of pair.
			
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
		       
## Kth Largest Element 

Kth Largest Element ... :    int[] nums = {3,2,1,5,6,4};  K = 2;

  Arrays.sort(a);
        return a[a.length-k];
		

Answer :

			5
			
## Leader formula 

Leader formula :

   The given array , which element is more times present ,
   
   [ 3,0,1,1,4,1,1 ] -> 1 is present in more times.
   
   so,     k > length of the array / 2  => it present in k times ,  4 > 7/2 = true .
   
           Leader is 1 .
	   
## Pascal Triangle Generated Formula 

Example 

   [3][2]   =   [2][1] + [2][2]
   
General 

 [i][j] = [i-1][j-1] + [i-1][j]
 
