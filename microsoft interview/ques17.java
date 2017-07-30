/*
Inplace rotate square matrix by 90 degrees | Set 1
Given an square matrix, turn it by 90 degrees in anti-clockwise direction without using any extra space.
*/
import java.util.*;

class ques17{

  static void rotate(int[][] arr){

    // Rotation only possible in square matrix so check for non-square matrix
    int n = arr.length;
    for(int x=0; x<n/2; x++){
      for(int y=x; y<n-x-1; y++){
        int temp = arr[x][y];
        arr[x][y] = arr[y][n-1-x];
        arr[y][n-1-x] = arr[n-1-x][n-1-y];
        arr[n-1-x][n-1-y] = arr[n-1-y][x];
        arr[n-1-y][x] = temp;
      }
    }
  }

  public static void main(String[] args) {

    int[][] arr = new int[][]{
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };

    rotate(arr);

    for(int i=0; i<arr.length; i++)
    {  for(int j=0; j<arr[0].length; j++)
          System.out.print(arr[i][j]+" ");
        System.out.println();
    }
  }
}
