/*
Number of ways to cut a stick of length N into K pieces
Given a stick of size N,
find the number of ways in which it can be cut into K pieces such that
length of every piece is greater than 0.

Solving this question is equivalent to solving the mathematics equation x1 + x2 + ….. + xK = N
We can solve this by using the bars and stars method in Combinatorics,
from which we obtain the fact that the number of positive integral solutions to this equation is
(N – 1)C(K – 1), where NCK is N! / ((N – K) ! * (K!)), where ! stands for factorial.
*/

/*
import java.math.BigInteger;
import java.util.*;

class cutnintok{

  static BigInteger factorial(int N)
    {
        // Initialize result
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }
  public static void main(String[] args) {

    int n=5, k=2;
    BigInteger answer = factorial(n-1);
    answer = answer.divide(factorial(k-1));
    System.out.println(answer);

  }
}
*/
class cutnintok{
    public static int nCr(int n,  int r)
    {
        if (n < r)
            return 0;

        // Reduces to the form n! / n!
        if (r == 0)
            return 1;

        // nCr has been simplified to this form by
        // expanding numerator and denominator to the form
        //       n(n - 1)(n - 2)...(n - r + 1)
        //       -----------------------------
        //                 (r!)
        // in the above equation, (n-r)! is cancelled out
        // in the numerator and denominator

        int numerator = 1;
        for (int i = n ; i > n - r ; i--)
            numerator = (numerator * i);

        int denominator = 1;
        for (int i = 1 ; i < r + 1 ; i++)
            denominator = (denominator * i);

        return (numerator / denominator);
    }

    // Returns number of ways to cut a rod of length
    // N into K peices.
    public static int countWays(int N, int K)
    {
        return nCr(N - 1, K - 1);
    }

    public static void main(String[] args)
    {
        int N = 5;
        int K = 2;
        System.out.println(countWays(N, K));
    }
  }

// Recursion

/*
import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println(ways(15, 5)); // recursion

		// dynamic programming.
	}

	public static int ways(int n, int k) {
        if (k == 0) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        if (k == 2) {
            return n - 1;
        }

        int result = 0;
        for (int i = 1; i < n; i++) {
            result = result + ways(n - i, k - 1);
        }
        return result;
    }
}
*/

// Dynamic programming

/*
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		int n = 15;
		int k = 5;
		int[][] ways = new int[n+1][k+1];
		//we need ways[n][k]
		//if 1 cut to be made on any length >= 1, then one way
		for(int i = 1; i <= n; i++) {
		    ways[i][0] = 0;
		    ways[i][1] = 1;
		}
		ways[0][0] = ways[0][1] = 0;

		//now populate for the smallest upto k cuts
		for(int i = 2; i <= k; i++) {
		    for(int j = 0; j <= n; j++) {
		        if(j < i) {
		            ways[j][i] = 0;
		            continue;
		        }
		        for(int l = 1; l <= j-i+1; l++) {
		            ways[j][i] += ways[j-l][i-1];
		        }
		    }
		}
		System.out.println(ways[n][k]);
	}
}
*/
