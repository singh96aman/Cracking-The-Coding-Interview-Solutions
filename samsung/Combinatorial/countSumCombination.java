import java.util.*;

class countSumCombination{

  static int countSum(int[] arr, int n){
    int[] count = new int[n+1];
    count[0]=1;
    for(int i=1; i<=n; i++)
      for(int j=0; j<arr.length; j++)
        if(i>=arr[j])
          count[i]+=count[i-arr[j]];
    return count[n];
  }

  public static void main(String[] args) {

    int n=14;
    int[] arr = new int[]{5,6,7,8};
    System.out.println(countSum(arr,n));
  }
}
