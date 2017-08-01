import java.util.*;

// 1) scan from right to left, find the first element that is less than its previous one.
// 2) scan from right to left, find the first element that is greater than p.
// 3) swap p and q
// 4) reverse elements [p+1, nums.length]

class nextLexicographic{

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

  }
  public static void main(String[] args) {
    int[] arr = new int[]{4,5,6,3,2,1};
    nextLexicographic(arr);
  }
}
