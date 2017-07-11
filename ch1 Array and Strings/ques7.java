import java.util.*;
class ques7
{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] arr = new int[n][n];

    for(int i=0; i<n; i++)
      for(int j=0; j<n; j++)
        arr[i][j] = in.nextInt();

        for(int i=0; i<n; i++)
        {
          for(int j=0; j<n; j++)
            System.out.print(arr[i][j]+" ");
          System.out.println();
        }

    rotate(arr,n);
  }

  static void rotate(int[][] arr, int n)
  {
    int offset=0;
    // Assuming n is even for square
    while(offset<n/2)
    {

      // Something is wrong !

      for(int i=0; i<n-1; i++)
      {
        int temp = arr[offset][i]; //top
        arr[offset][i]=arr[n-1-offset-i][offset]; //left->top
        arr[n-1-offset-i][offset]=arr[n-1-offset][n-1-offset-i];
        arr[n-1-offset][n-1-offset-i]=arr[n-1-offset][i];
        arr[i][n-1-offset]=temp;
      }
      offset++;
    }

    System.out.println();

    for(int i=0; i<n; i++)
    {
      for(int j=0; j<n; j++)
        System.out.print(arr[i][j]+" ");
      System.out.println();
    }
  }
}
