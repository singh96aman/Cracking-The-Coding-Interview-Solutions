/*
Count number of bits to be flipped to convert A to B
Given two numbers ‘a’ and b’.
Write a program to count number of bits needed to be flipped to convert ‘a’ to ‘b’.
*/

//Important code !

import java.util.*;

class countflipbits{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int c=a^b, count=0;
    while(c!=0)
    {
      if((c&1)==1)
        count++;
      c>>=1;
    }
    System.out.println(count);
  }
}
