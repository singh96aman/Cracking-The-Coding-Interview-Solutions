import java.util.*;

class ques5{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String str1 = in.next();
    String str2 = in.next();

    check(str1 , str2);

  }

  static void check(String str1, String str2)
  {
    HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
    for(char a='a'; a<'z'; a++)
      hm.put(a,0);

    for(int i=0; i<str1.length(); i++)
    {
      int val = hm.get(str1.charAt(i))+1;
      hm.remove(str1.charAt(i));
      hm.put(str1.charAt(i),val);
    }

    for(int i=0; i<str2.length(); i++)
    {
      int val = hm.get(str2.charAt(i))-1;
      hm.remove(str2.charAt(i));
      hm.put(str2.charAt(i),val);
    }
    /*for(char a='a'; a<'z'; a++)
    {
      System.out.println(hm.get(a));
    }*/

    int counter=0;
    for(char a='a'; a<'z'; a++)
    {
      //System.out.println(hm.get(a));
      if( hm.get(a)==1)
        counter++;
      if( hm.get(a)==-1)
        counter--;
    }

    if(counter>1 || counter<-1)
      System.out.println("String is not edited once");
    else
      System.out.println("String is edited once");
  }

}
