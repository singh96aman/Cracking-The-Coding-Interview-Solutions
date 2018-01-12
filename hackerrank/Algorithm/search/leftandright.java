/*
Watson gives Sherlock an array  of length . Then he asks him to determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero.
Formally, find an , such that, .

Input Format

The first line contains , the number of test cases. For each test case, the first line contains , the number of elements in the array . The second line for each test case contains  space-separated integers, denoting the array .

Constraints






Output Format

For each test case print YES if there exists an element in the array, such that the sum of the elements on its left is equal to the sum of the elements on its right; otherwise print NO.

Sample Input 0

2
3
1 2 3
4
1 2 3 3
Sample Output 0

NO
YES
Explanation 0

For the first test case, no such index exists.
For the second test case, , therefore index  satisfies the given conditions.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] a){
        int rightsum=0;
        for(int i=0; i<a.length; i++)
            rightsum+=a[i];

        int leftsum=0;
        for(int i=0; i<a.length; i++){
            rightsum-=a[i];
            if(rightsum==leftsum)
                return "YES";
            leftsum+=a[i];
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}
