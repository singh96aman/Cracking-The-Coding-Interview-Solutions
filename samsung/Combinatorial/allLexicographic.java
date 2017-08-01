import java.util.*;

class allLexicographic{
  static void nextLexicographic(int[] arr){

    int n = arr.length, i, j;
    for(i=n-1; i>=1; i--)
      if(arr[i-1]<arr[i])
        { i--;
          break; }

    for(j=i; j<n-1; j++)
      if(arr[j]>arr[j+1])
      { break;}

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    for(int l=j, k=n-1; l<k; l++,k--)
    {
      temp = arr[l];
      arr[l] = arr[k];
      arr[k] = temp;
    }

    for(int h : arr)
      System.out.print(h);
    System.out.println();
  }
  public static void main(String[] args) {
    int[] arr = new int[]{4,5,6,3,2,1};
    Arrays.sort(arr);
  }
}
