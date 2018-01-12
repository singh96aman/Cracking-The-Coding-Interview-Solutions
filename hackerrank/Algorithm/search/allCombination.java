/*
import java.util.*;
class allCombination{

  static void combination(int[] arr, int[] result, int n, int i){
    if(n==0)
      printArray(result,i);
    else if(n>0){
      for(int k=0; k<arr.length; k++){
        result[i]=arr[k];
        combination(arr,result,--n,i+1);
      }
    }
  }

  static void printArray(int[] result, int m){
    for(int i=0; i<m; i++)
      System.out.print(result[i]+" ");
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
      arr[i] = sc.nextInt();
    int[] result = new int[n];
    combination(arr,result,arr.length,0);
  }

}
*/
import java.util.*;
class allCombination{

  static void combination(int[] arr){
    for(int i=0; i<arr.length; i++){
      for(int j=i; j<arr.length-i; j++){
        
      }
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
      arr[i] = sc.nextInt();
    combination(arr);
  }

}
