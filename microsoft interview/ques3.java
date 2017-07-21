/*
k largest(or smallest) elements in an array | added Min Heap method
Question: Write an efficient program for printing k largest elements in an array. Elements in array can be in any order.

For example, if given array is [1, 23, 12, 9, 30, 2, 50] and you are asked for the largest 3 elements i.e., k = 3 then your program should print 50, 30 and 23.
*/
import java.util.*;

class ques3
{

  public static void main(String[] args) {

    int[] arr = new int[]{1,23,12,9,30,2,50};
    int maxthele=0, i=0;
    HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
    hm.put(maxthele,arr[i]);
    for(i=1; i<arr.length; i++)
      if(arr[i]>hm.get(maxthele))
      {
        maxthele++;
        hm.put(maxthele,arr[i]);
      }
    System.out.println(hm.get(maxthele-2));
  }
}
