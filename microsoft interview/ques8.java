/*
Find the row with maximum number of 1s
Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.
*/
import java.util.*;

class ques8{

  static int find(int[] arr, int low,int high){
    if(high >= low){
      int mid = low + (high-low)/2;

      if((mid==0 || arr[mid-1]==0) && arr[mid]==1)
        return mid;
      else if(arr[mid]==0)
        return find(arr,(mid+1),high);
      else
        return find(arr,low,(mid-1));
    }
    return -1;
  }

  static void maxones(int arr[][]){

    int max_row_index=0, max=-1;
    int i, index;
    int r = arr.length, c = arr[0].length;
    for(i=0; i<r; i++)
    {
      index = find(arr[i],0,c-1);
      if(index!=-1 && c-index > max){
        max = c - index;
        max_row_index = i;
      }
    }
    System.out.println(max_row_index);
  }

  public static void main(String[] args) {

    int[][] arr = new int[][]{
      {0,0,0,1},
      {0,0,1,1},
      {1,1,1,1},
      {0,0,0,0}
    };

    maxones(arr);

  }
}
