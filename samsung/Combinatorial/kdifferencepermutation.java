/*
The Efficient approach is to observe the pattern at each position of index. For each position of index i, there can only exist two candidate i.e., i + k and i – k. As we need to find lexicographically smallest permutation so we will first look for i – k candidate(if possible) and then for i + k candidate.

 Illustration:
 n = 8, k = 2
 P : 1 2 3 4 5 6 7 8

 For any ith position we will check which candidate
 is possible i.e., i + k or i - k

 1st pos = 1 + 2 = 3 (1 - 2 not possible)
 2nd pos = 2 + 2 = 4 (2 - 2 not possible)
 3rd pos = 3 - 2 = 1 (possible)
 4th pos = 4 - 2 = 2 (possible)
 5th pos = 5 + 2 = 7 (5 - 2 already placed, not possible)
 6th pos = 6 + 2 = 8 (6 - 2 already placed, not possible)
 7th pos = 7 - 2 = 5 (possible)
 8th pos = 8 - 2 = 6 (possible)
Note: If we observe above illustration then we will find that i + k and i – k are alternating after kth consecutive interval. Another observation is that the whole permutation is only when n is even such that n can be divided into two parts where each part must be divisible by k.
*/

import java.util.*;
class kdifferencepermutation{

    static void kthdiff(int n, int k){

      if(k==0)
        for(int i=0; i<n; i++)
          System.out.print((i+1)+" ");

      else if(n%(2*k)!=0)
        System.out.println("Not possible");

      else{
        for(int i=0; i<n; i++){
          if((i/k)%2==0)
            System.out.print((i+k+1)+" ");
          else
            System.out.print((i-k+1)+" ");
        }
      }
      System.out.println();
    }

    public static void main(String[] args) {

      int n = 6 , k = 3;
    kthdiff(n, k);

    n = 6 ; k = 2;
    kthdiff(n, k);

    n = 8 ; k = 2;
    kthdiff(n, k);


    }
}
