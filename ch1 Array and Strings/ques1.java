import java.util.*;
import java.util.Scanner;

class ques1{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    //Ask for input
    String name = sc.next();
    isCharacterUnique(name);
  }

  public static void isCharacterUnique(String name)
  {
    name = name.toLowerCase();
    int[] charMatched = new int[26];
    int counter=0;

    for(int i=0; i<26; i++)
    charMatched[i]=0;

    for(char a='a'; counter<name.length(); a++)
    {
      if(a==name.charAt(counter))
      {
        int matched = a-'a';
        charMatched[matched]=charMatched[matched]+1;
        counter=counter+1;
        a='a';
      }
    }

    int flag=0;

    for(int i=0; i<26; i++)
    {
      if(charMatched[i]>1)
      {
        flag=1;
        break;
      }
    }
    if(flag==0)
      System.out.println("Unique");
    else
      System.out.println("Not Unique");
  }

}
