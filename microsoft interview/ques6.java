/*
Binary representation of a given number
Write a program to print Binary representation of a given number.
*/
import java.util.*;

class ques6{

  static void bin(int n){
      int i;
      for(i=1<<30; i>0; i=i/2){
        if((n&i)==0)
          System.out.print(0);
        else
          System.out.print(1);
        }
  }

  public static void main(String[] args) {
    bin(7);
  }
}
