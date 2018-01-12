import java.util.*;
import java.io.*;

class subset{

  static void printSubsets(int arr[], int a, int b)
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
  }

  static void getSubsets(int[] arr, int size){
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
    for(int i=0; i<set_size; i++)
      for(int j=0; j<set_size; j++)
        if(sum[i]==sum[j] && i!=j)
          {printSubsets(arr,i,j); break;}
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3};
    getSubsets(arr,arr.length);
  }
}
