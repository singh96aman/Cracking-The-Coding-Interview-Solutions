/*
Staircase
Consider a staircase of size :

   #
  ##
 ###
####
Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .

Input Format

A single integer, , denoting the size of the staircase.

Output Format

Print a staircase of size  using # symbols and spaces.

Note: The last line must have  spaces in it.

Sample Input

6
Sample Output

     #
    ##
   ###
  ####
 #####
######
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int j=n-i-1;
            while(j>0){
                System.out.print(" ");
                j--;
            }
            j=i;
            while(j>=0){
                System.out.print("#");
                j--;
            }
            System.out.println();
        }
    }
}
