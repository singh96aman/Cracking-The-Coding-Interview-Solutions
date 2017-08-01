import java.util.*;
class countDistinctPermutation{

  static int factorial(int n){
    int fact=1;
    if(n==0)
      return 1;
    for(int i=2; i<=n; i++)
      fact*=i;
    return fact;
  }

  static int countPermutation(String temp){

    int[] freq = new int[26];
    int n = temp.length();

    for(int j=0; j<26; j++)
      freq[j]=0;

    int i;
    for(i=0; i<temp.length(); i++)
      freq[temp.charAt(i)-'a']++;

    int fact=1;
    for(i=0; i<26; i++){
      fact*=factorial(freq[i]);
    }

    return factorial(n)/fact;
  }

  public static void main(String[] args) {
    String temp = "fvvfhvgv";
    System.out.println(countPermutation(temp));
  }

}
