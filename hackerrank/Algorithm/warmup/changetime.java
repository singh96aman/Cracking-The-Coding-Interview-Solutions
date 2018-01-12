/*
Given a time in -hour AM/PM format, convert it to military (-hour) time.

Note: Midnight is  on a -hour clock, and  on a -hour clock. Noon is  on a -hour clock, and  on a -hour clock.

Input Format

A single string containing a time in -hour clock format (i.e.:  or ), where  and .

Output Format

Convert and print the given time in -hour format, where .

Sample Input

07:05:45PM
Sample Output

19:05:45
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        char[] arr = s.toCharArray();
            if(s.substring(8).equals("PM")){
                if(arr[0]!='1' || arr[1]!='2'){
                arr[0]+=1;
                arr[1]+=2;
                    //System.out.println("sdf");
                }
                //System.out.println(arr[0]+" "+arr[1]);
            if(arr[0]>='2' && arr[1]>='4'){
                arr[0]-=2;
                arr[1]-=4;
            }
            }
            else{
                if(arr[0]=='1' && arr[1]=='2')
                {
                    arr[0]='0';
                    arr[1]='0';
                }
            }
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<8; i++)
            temp.append(arr[i]);
        return temp.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
