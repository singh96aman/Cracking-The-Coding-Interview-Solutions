import java.util.*;

class radix{

  int getMax(int arr[]){
    int max=arr[0];
    for(int i=1; i<arr.length-1; i++)
      if(max<arr[0])
        max=arr[0];
    return max;
  }

  void countsort(int arr[], int n, int exp){

    int[] output = new int[n];
    int i;
    int[] count = new int[10];

    for(i=0; i<10; i++)
      count[i]=0;

    for(i=0; i<n; i++)
      count[(arr[i]/exp%10)]++;

    for(i=1; i<n; i++)
      count[i]+=count[i-1];

    for(i=n-1; i>=0; i--){
      output[count[(arr[i]/exp%10)]-1] = arr[i];
      count[(arr[i]/exp%10)]--;
    }

    for(i=0; i<n; i++)
      arr[i] = output[i];
  }

  void radixsort(int[] arr, int n){

    int m = getMax(arr);
    for(int exp=1; m/exp>0; exp*=10)
      countsort(arr,n,exp);
  }
  public static void main(String[] args) {
    radix r = new radix();
    int[] arr = new int[]{1,4,5,0,2,2,5};
    r.radixsort(arr,arr.length);
    for(int i: arr)
      System.out.println(i);
  }
}
