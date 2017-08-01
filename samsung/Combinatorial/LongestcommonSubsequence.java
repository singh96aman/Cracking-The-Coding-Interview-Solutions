import java.util.*;

class LongcommonSubsequence{

  static void longestString(String str1, String str2){
    int[] count1 = new int[26];
    int[] count2 = new int[26];
    int i;

    for(i=0; i<str1.length(); i++)
      count1[str1.charAt(i)-'a']++;
    for(i=0; i<str2.length(); i++)
      count2[str2.charAt(i)-'a']++;

    String result="";
    for(i=0; i<26; i++)
      for(int j=1; j<=Math.min(count1[i],count2[i]); j++)
      {
        char app = (char)('a' +i);
        result+=app;
      }

    System.out.println(result);
  }

  public static void main(String[] args) {
    String str1="gseks", str2="scakes";
    longestString(str1, str2);
  }

}
