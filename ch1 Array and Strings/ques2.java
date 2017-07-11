import java.util.*;

class ques2
{
  public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      String name1 = in.next();
      String name2 = in.next();

      int[] match = new int[26];

      for(int i=0; i<26; i++)
        match[i]=0;

      int counter=0;

      //check if they have the same stirng length

      for (char a='a'; counter<name1.length(); a++)
      {
        if(a==name1.charAt(counter))
        {
          counter++;
          int pos = a-'a';
          match[pos]++;
          a='a';
        }
      }

      //for(int i=0; i<26; i++)
      //  System.out.println(match[i]);

        counter=0;
      for (char a='a'; counter<name2.length(); a++)
      {
        if(a==name2.charAt(counter))
        {
          counter++;
          int pos = a-'a';
          match[pos]--;
          a='a';
        }
      }

      //System.out.println();
      //for(int i=0; i<26; i++)
      //  System.out.println(match[i]);

      for(int i=0; i<26; i++)
      {
        if(match[i]!=0)
        {
          System.out.println("Not permutations");
          return ;
        }
      }
      System.out.println("permutations");
  }
}
