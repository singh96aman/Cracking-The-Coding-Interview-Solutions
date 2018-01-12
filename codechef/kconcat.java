import java.util.*;
import java.io.*;

class kconcat{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int T = sc.nextInt();
    for(int i=0; i<T; i++)
    {
      int N = sc.nextInt();
      int K = sc.nextInt();
      int[] arr = new int[N];
      for(int j=0; j<N; j++)
        arr[j] = sc.nextInt();
      int newsize=N*K;
      int[] newarr = new int[newsize];
      for(int j=0, k=0; j<newsize; j++,k++)
      {
        if(k==N)
          k=0;
        newarr[j]=arr[k];
      }

      int max_so_far=Integer.MIN_VALUE;
      int max_ending_here=0;
      for(int j=0; j<newsize; j++)
      {
        //System.out.println(newarr[j]);
        max_ending_here+=newarr[j];
        if(max_ending_here<0)
          max_ending_here=0;
        if(max_so_far<max_ending_here)
          max_so_far=max_ending_here;
        //System.out.println(max_so_far);
      }
      System.out.println(max_so_far);
    }
  }
}
