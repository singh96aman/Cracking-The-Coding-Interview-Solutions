/*
Square root of an integer
Given an integer x, find square root of it. If x is not a perfect square, then return floor(√x).
*/
import java.util.*;
class ques11{

  static int findsqareroot(int n){

    int start = 1, end = n/2, ans = 0;
    while(start<=end){
      int mid = (start+end)/2;
      if(mid*mid==n)
        return mid;
      if(mid*mid<n){
        start = mid + 1;
        ans=mid;
      }
      else
        end=mid-1;
    }
    return ans;
  }
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(findsqareroot(n));
  }
}
