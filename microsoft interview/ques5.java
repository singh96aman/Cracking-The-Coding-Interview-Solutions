/*
Sort all even numbers in ascending order and then sort all odd numbers in descending order
Given an array of integers (both odd and even), sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.
*/
import java.util.*;
class ques5{

  static void Sort(int[] arr){
    for(int i=0; i<arr.length; i++)
      if(arr[i]%2!=0)
        arr[i]*=-1;

    Arrays.sort(arr);
    for(int i=0; i<arr.length; i++)
      if(arr[i]<0)
        arr[i]*=-1;

    for(int i : arr)
      System.out.println(i);
  }

  public static void main(String[] args) {

    int[] arr = new int[]{1,2,3,7,4,5,10};
    Sort(arr);

  }
}
