import java.util.*;
import java.io.*;

class richierich{

  static int findMax(int a, int b)
  { return a>b ? a: b; }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String S = sc.next();
    char[] arr = S.toCharArray();
    int i=0, j=0, diff=0;
    for(i=0, j=n-1; i<j; i++,j--)
      if(arr[i]!=arr[j])
        diff++;
    for(i=0, j=n-1; i<j; i++,j--)
    {
      if(arr[i]!=arr[j])
        if(diff<2)
          if(k<2)
            if(arr[i]==findMax(arr[i],arr[j]))
              {arr[j]=arr[i]; k--;}
            else
              {arr[i]=arr[j]; k--;}
          else
            {arr[i]=9; arr[j]=9; k-=2;}
        else
          if(k<2)
            if(arr[i]==findMax(arr[i],arr[j]))
              {arr[j]=arr[i]; k--;}
            else
              {arr[i]=arr[j]; k--;}
          else
            {arr[i]=9; arr[j]=9; k-=2;}
      diff--;
    }
    for(i=0; i<n; i++)
      System.out.print(arr[i]);
  }
}
