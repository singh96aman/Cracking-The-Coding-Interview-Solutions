// O(n)

import java.util.*;

class ques4
{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    //HashMap<Integer,char> hm = new HashMap<Integer,char>();
    HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
    for (char a='a'; a<'z'; a++)
    {
      hm.put(a,0);
    }
    for(int i=0; i<str.length(); i++)
    {
      int temp = hm.get(str.charAt(i))+1;
      hm.remove(str.charAt(i));
      hm.put(str.charAt(i), temp);
      //System.out.println(hm.get('a'));
    }
    for (char a='a'; a<'z'; a++)
    {
      System.out.println(hm.get(a));
    }
    // Now check for max one odd Character
  }
}

// Alternate aproach. More Complex. O(n! *n)

/*
import java.util.*;

class ques4
{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int n = str.length();
    permute(str, 0, n-1);
  }

  static void permute(String str, int l, int r)
  {
    if(l==r)
      {
        if(checkPalindrome(str))
        {
          System.out.println("It's a permutation of palindrome "+str);
        }
        //System.out.println(str);
      }
    else
    {
      for(int i=l; i<=r; i++)
      {
        str = swap(str, l, i);
        permute(str, l+1, r);
        str = swap(str, l, i);
      }
    }
  }

  static String swap(String str, int l, int r)
  {
      char[] charArray = str.toCharArray();
      char temp = charArray[l];
      charArray[l] = charArray[r];
      charArray[r] = temp;
      return String.valueOf(charArray);
  }

  static boolean checkPalindrome(String str)
  {
    int n= str.length();
    for(int i=0, j=n-1; i<j; i++,j--)
      if(str.charAt(i)!=str.charAt(j))
        return false;

    return true;
  }

}
*/
