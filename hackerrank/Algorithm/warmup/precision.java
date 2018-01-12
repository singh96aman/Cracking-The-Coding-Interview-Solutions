/*
Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array.
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeroes in the array compared to its size.
Sample Input

6
-4 3 -9 0 4 1
Sample Output

0.500000
0.333333
0.166667
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n = sc.nextInt();
        int[] arr = new int[n];
        for(i=0; i<n; i++)
            arr[i]=sc.nextInt();
        Double zero=0.0, pos=0.0, neg=0.0;
        for(i=0; i<n; i++)
        {
            if(arr[i]>0)
                pos++;
            else if(arr[i]<0)
                neg++;
            else
                zero++;
        }
        pos/=n;
        neg/=n;
        zero/=n;
        //pos.setPrecision(6);
        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zero);
    }
}
