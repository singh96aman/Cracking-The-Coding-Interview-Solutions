/*
Total number of possible Binary Search Trees with n keys
Total number of possible Binary Search Trees with n different keys = Catalan number Cn = (2n)!/(n+1)!*n!

For n = 0, 1, 2, 3, … values of Catalan numbers are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, ….
So are numbers of Binary Search Trees.
*/

import java.util.*;
class catalan{

  static long findBinCoeff(long n, long k){

    long res=1;

    if(k>n-k)
      k=n-k;

    for(int i=0; i<k; i++){
      res*=(n-i);
      res/=(i+1);
    }
    return res;
  }

  static long findBST(long n){
    long c = findBinCoeff(2*n,n);
    return c/(n+1);
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    System.out.println(findBST(n));
  }
}
