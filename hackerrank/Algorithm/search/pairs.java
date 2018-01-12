/*
Given  integers, count the number of pairs of integers whose difference is .

Input Format

The first line contains  and .
The second line contains  numbers of the set. All the  numbers are unique.

Constraints



Each integer will be greater than  and at least  smaller than .
Output Format

An integer that tells the number of pairs of integers whose difference is .

Sample Input

5 2
1 5 3 4 2
Sample Output

3
Explanation

There are 3 pairs of integers in the set with a difference of 2.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();

        Arrays.sort(arr);

        int[] countdiff = new int[n-1];
        for(int i=0; i<n-1; i++)
            countdiff[i] = Math.abs(arr[i]-arr[i+1]);
        int counter=0;
        for(int i=0; i<n-1; i++){
            int j=i, temp=0;
            while(temp<k && j<n-1){
               temp+=countdiff[j];
                j++;
            }
            if(temp==k){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
