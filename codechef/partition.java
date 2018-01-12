import java.util.*;
import java.io.*;
class partition{

  static void printSubsets(int arr[], int a, int b, int x)
  {
    System.out.println("First Subset");
    for(int i=0; i<arr.length; i++)
      if(((1<<i)&a)!=0)
        System.out.print(arr[i]+" ");
    System.out.println("\nSecond Subset");
    for(int i=0; i<arr.length; i++)
      if(((1<<i)&b)!=0)
        System.out.print(arr[i]+" ");
    System.out.println();
    /*int n = arr.length;
    int[] ans = new int[n];
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    hm.put(x,2);
    for(int i=0; i<n; i++)
      if(((1<<i)&a)!=0)
        hm.put(arr[i],0);
    for(int i=0; i<n; i++)
      if(((1<<i)&b)!=0)
        hm.put(arr[i],1);
    for(int i=1; i<=(n+1); i++)
      System.out.print(hm.get(i));
    System.out.println();*/
  }

  static void getSubsets(int[] arr, int x, int size){
    int set_size = (int)Math.pow(2,size);
    int[] sum = new int[set_size];
    for(int counter=0; counter<set_size; counter++)
    {
      for(int j=0; j<set_size; j++)
        if((counter & (1<<j))!=0)
          {
            sum[counter]+=arr[j];
          }
    }
    int flag=0;
    for(int i=0; i<set_size; i++)
      for(int j=0; j<set_size; j++)
        if(sum[i]==sum[j] && i!=j && flag==0)
          {
            int count1=0, count2=0;
            for(int k=0; k<size; k++)
              if((1<<k)!=0)
                count1++;
            for(int k=0; k<size; k++)
              if((1<<k)!=0)
                count2++;
            if((count1+count2)==size)
              {printSubsets(arr,i,j,x); flag=1; break;}
          }
    if(flag==0)
      System.out.println("impossible");
    //for(int i=0; i<set_size; i++)
      //System.out.println(sum[i]);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int i=0; i<T; i++)
    {
      int x = sc.nextInt();
      int N = sc.nextInt();
      int[] arr = new int[N-1];
      int index=0;
      for(int j=1; j<=N; j++)
        if(j!=x)
          arr[index++]=j;
      N--;
      getSubsets(arr,x,N);
    }
  }
}
