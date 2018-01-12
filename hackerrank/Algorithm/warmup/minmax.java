/*
Mini-Max Sum

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format

A single line of five space-separated integers.

Constraints

Each integer is in the inclusive range .
Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

Our initial numbers are , , , , and . We can calculate the following sums using four of the five integers:

If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
If we sum everything except , our sum is .
As you can see, the minimal sum is  and the maximal sum is . Thus, we print these minimal and maximal sums as two space-separated integers on a new line.

Hints: Beware of integer overflow! Use 64-bit Integer.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger[] arr = new BigInteger[5];
        BigInteger sum = BigInteger.valueOf(0);
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextBigInteger();
            sum = sum.add(arr[arr_i]);
        }
        BigInteger min = BigInteger.valueOf(Integer.MIN_VALUE);
        BigInteger max = BigInteger.valueOf(Integer.MAX_VALUE);
        for(int i=0; i<5; i++){
            if( (min.compareTo(arr[i])) == -1 )
                min = arr[i];
            if( (max.compareTo(arr[i])) == 1 )
                max = arr[i];
        }
        min = sum.subtract(min);
        max = sum.subtract(max);
        System.out.print(min+" "+max);
    }
}
