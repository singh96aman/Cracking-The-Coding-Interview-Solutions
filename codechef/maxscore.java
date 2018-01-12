import java.util.*;
import java.io.*;
class maxscore{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    for(int k=0; k<m; k++)
    {
    int n = sc.nextInt();
    long[][] arr = new long[n][n];
    for(int i=0; i<n; i++)
    {
      arr[i] = new long[n];
      for(int j=0; j<n; j++)
      {
        arr[i][j] = sc.nextLong();
      }
      //Arrays.sort(arr[i]);
    }

    int flag=0;
    long sum=0, last=Integer.MAX_VALUE;
    for(int i=n-1; i>=0; i--)
    {
      long max=0;
      for(int j=0; j<n; j++)
        if(max<arr[i][j] && arr[i][j]<last)
          max=arr[i][j];
      if(max==0)
      {flag=1; break;}
      sum+=max;
      last=max;
    }
    if(flag==1)
      System.out.println("-1");
    else
      System.out.println(sum);
  }
}
}
