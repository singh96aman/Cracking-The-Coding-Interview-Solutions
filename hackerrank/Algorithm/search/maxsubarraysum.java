/*
We define the following:

A subarray of an -element array, , is a contiguous subset of 's elements in the inclusive range from some index  to some index  where .
The sum of an array is the sum of its elements.
Given an -element array of integers, , and an integer, , determine the maximum value of the sum of any of its subarrays modulo . This means that you must find the sum of each subarray modulo , then print the maximum result of this modulo operation for any of the  possible subarrays.

Input Format

The first line contains an integer, , denoting the number of queries to perform. Each query is described over two lines:

The first line contains two space-separated integers describing the respective  (the array length) and  (the right operand for the modulo operations) values for the query.
The second line contains  space-separated integers describing the respective elements of array  for that query.
Constraints




 the sum of  over all test cases
Output Format

For each query, print the maximum value of  on a new line.

Sample Input

1
5 7
3 3 9 9 5
Sample Output

6
Explanation

The subarrays of array  and their respective sums modulo  are ranked in order of length and sum in the following list:

 and


As you can see, the maximum value for  for any subarray is , so we print on a new line.
*/

// O(n^2)
/*
import java.util.*;
class maxsubarraysum{

  static void printArray(long[] arr){
    System.out.println();
    System.out.println();
    for(int i=0; i<arr.length; i++)
      System.out.print(arr[i]+" ");
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    for(int a0 = 0; a0 < q; a0++){
        int n = in.nextInt();
        long m = in.nextLong();
        long[] a = new long[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextLong();
        }
    long curr=0;
    long[] prefix = new long[a.length];
    for(int i=0; i<a.length; i++){
      curr = (a[i]%m+curr)%m;
      prefix[i]=curr;
    }
    printArray(prefix);
    long ret=0;
    Arrays.sort(prefix)
    for(int i=0; i<a.length; i++){
      for(int j=i-1; j>=0; j--){
        if(prefix[j]>prefix[i]){
          break;}
          else{
        ret = Math.max(ret,(prefix[i]-prefix[j]+m)%m);
        System.out.print(ret+" ");
      }
      }
      ret = Math.max(ret,prefix[i]);
      System.out.println(ret);
    }
    System.out.println(ret);
    }
  }
}
*/
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class maxsubarraysum{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		long[] res = new long[q];
		for(int i=0;i<q;i++){
			int n = sc.nextInt();
			long m = sc.nextLong();
			long[] arr = new long[n];
			for(int j=0;j<n;j++){
				arr[j]=sc.nextLong();
			}
			res[i]= getMaxSum(n,m,arr);

		}
		for(int i=0;i<q;i++){
			System.out.println(res[i]);
		}
	}

	private static long getMaxSum(int n, long m, long[] arr) {
		long maxSum=0;

		TreeSet<Long> prefix = new TreeSet<Long>();
		long currentSum=0;
		for(int i=0;i<n;i++){
			currentSum=(currentSum+arr[i]%m)%m;
			SortedSet<Long> set = prefix.tailSet(currentSum+1);
			Iterator<Long> itr = set.iterator();
			if(itr.hasNext()){
				maxSum= Math.max(maxSum, (currentSum-itr.next()+m)%m);
			}

			maxSum=Math.max(maxSum, currentSum);
			prefix.add(currentSum);
		}
		return maxSum;
	}
}
