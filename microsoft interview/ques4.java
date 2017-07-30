/*
Longest Even Length Substring such that Sum of First and Second Half is same
Given a string ‘str’ of digits, find length of the longest substring of ‘str’,
such that the length of the substring is 2k digits and sum of left k digits is equal to the sum of right k digits.
*/
import java.util.*;

class ques4{

  static void findmax(String str){

    int n = str.length(), max=0, len=0;
    char[] arr = str.toCharArray();
    for(int i=0; i<n; i++){
        int l=i, r =i+1;
        int lsum=0, rsum=0;
        while(l>=0 && r<=n-1){
          lsum+=arr[l]-'0';
          rsum+=arr[r]-'0';
          if(lsum==rsum)
            if(max<r-l+1)
              max=r-l+1;
          l--; r++;
        }
    }
    System.out.println(max);
  }
  public static void main(String[] args) {
    findmax("1538023");
  }
}
