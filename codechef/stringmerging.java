import java.util.*;
import java.io.*;

class stringmerging{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int k=0; k<T; k++)
    {
      int N = sc.nextInt();
      int M = sc.nextInt();
      String A = sc.next();
      String B = sc.next();
      char[] a = A.toCharArray();
      char[] b = B.toCharArray();
      Arrays.sort(a);
      Arrays.sort(b);
      String C = "";
      int i=0, j=0;
      while(i<N && j<M)
      {
        if(a[i]!=b[j])
        { C+=a[i]; i++;}
        else
        { C+=a[i]; C+=b[j]; i++; j++;}
      }
      while(i<N)
      { C+=a[i]; i++;}
      while(j<M)
      { C+=b[j]; j++;}
      int counter=0;
      for(i=0; i<(N+M-1); i++)
        if(C.charAt(i)!=C.charAt(i+1))
          counter++;
      counter++;
      System.out.println(counter);
    }
  }
}
