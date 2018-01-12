import java.util.*;
import java.io.*;

class sherlock{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] arr = s.toCharArray();
    int[] index = new int[26];
    for(int i=0; i<arr.length; i++)
      index[(arr[i]-'a')]++;
    //for(int i=0; i<26; i++)
      //System.out.println(index[i]);
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    int counter=0;
    for(int i=0; i<26; i++)
    {
      if(index[i]!=0 && hm.get(index[i])==null)
        hm.put(index[i],1);
      else if(hm.get(index[i])!=null)
        hm.put(index[i],hm.get(index[i])+1);
      if(hm.get(index[i]-1)!=null || hm.get(index[i]+1)!=null && index[i]!=0 || index[i]==1)
        counter++;
    }
    if(hm.size()==1 || (hm.size()==2 && counter==1))
      System.out.println("YES");
    else
      System.out.println("NO");
      //System.out.println(counter);
  }
}
