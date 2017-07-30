import java.util.*;
class maxProductsubArray{

  static int maxProduct(int[] arr){

    int n = arr.length;
    int max_ending_here=1, min_ending_here=1, max_so_far=1, i;

    for(i=0; i<n; i++){
      if(arr[i]>0){
        max_ending_here = max_ending_here*arr[i];
        min_ending_here = Math.min(min_ending_here*arr[i],1);
      }else if(arr[i]==0){
        max_ending_here=1;
        min_ending_here=1;
      }
      else{
        int temp = max_ending_here;
        max_ending_here = Math.max(min_ending_here*arr[i],1);
        min_ending_here = temp*arr[i];
      }


    if(max_so_far < max_ending_here)
      max_so_far = max_ending_here;
    }
      return max_so_far;
}
static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

  public static void main(String[] args) {

    int[] arr = new int[]{-6,0,-1,5,-2};
    System.out.println(maxProduct(arr));
    System.out.println(maxSubArraySum(arr));

  }
}
