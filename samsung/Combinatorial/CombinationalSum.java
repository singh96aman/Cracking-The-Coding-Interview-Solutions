import java.util.*;
class CombinationalSum{
      // that sum up to n.
      // i is used in recursion keep track of index in arr[] where next
      // element is to be added. Initital value of i must be passed as 0
      static void printCompositions(int arr[], int[] result, int n, int i)
      {
          if (n == 0)
          {
              printArray(result, i);
          }
          else if(n > 0)
          {
              for (int k = 0; k <arr.length; k++)
              {
                  result[i]= arr[k];
                  printCompositions(arr, result, n-arr[k], i+1);
              }
          }
      }

      // Utility function to print array arr[]
      static void printArray(int arr[], int m)
      {
          for (int i = 0; i < m; i++)
              System.out.print(arr[i] + " ");
          System.out.println();
      }



  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int sum = sc.nextInt();
    String[] individual = input.split(" ");
    int[] arr = new int[individual.length];
    for(int i=0; i<individual.length; i++)
      arr[i] = Integer.parseInt(individual[i]);

    int size = 100;
    int[] result = new int[size];
    printCompositions(arr,result,sum, 0);

    }
}
