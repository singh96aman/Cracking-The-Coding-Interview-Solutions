import java.util.*;
class largeFactorial{

  static int multiply(int n, int[] arr, int res_size){
    int carry=0, i;
    for(i=0; i<res_size; i++){
      int prod = arr[i]*n + carry;
      arr[i] = prod%10;
      carry = prod/10;
    }
    while(carry!=0)
    {
      arr[i]=carry%10;
      carry/=10;
      res_size++;
    }
    return res_size;
  }

  static int[] largeFactorial(int n){
    int[] arr = new int[500];
    arr[0]=1;
    int res_size=1;
    for(int i=2; i<=n; i++)
      res_size=multiply(i,arr,res_size);
    for(int i=res_size-1; i>=0; i--)
      System.out.print(arr[i]);
    return arr;
  }
  public static void main(String[] args) {
    int[] arr = largeFactorial(100);
  }
}
