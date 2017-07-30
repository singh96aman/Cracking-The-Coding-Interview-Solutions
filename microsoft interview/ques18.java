/*
Merge Sort
*/
import java.util.*;
class ques18{

  static void mergeSort(int[] arr, int low, int high){
    if(low<high){
      int middle = (high+low)/2;
      mergeSort(arr,middle+1,high);
      mergeSort(arr,low,middle);
      Merge(arr,low,middle,high);
    }
  }

  static void Merge(int[] arr,int low, int middle, int high){

    int n1 = middle - low +1;
    int n2 = high - middle;
    int i, j, k;

    int L[] = new int[n1];
    int R[] = new int[n2];

    for(i=0; i<n1; i++)
      L[i] = arr[low+i];
    for(i=0; i<n2; i++)
      R[i] = arr[middle+i+1]; // Important Step

    i=0; j=0; k=low; // Important Step

    while(i<n1 && j<n2){
      if(L[i]<=R[j])
        { arr[k] = L[i]; i++; }
      else
        { arr[k] = R[j]; j++; }
      k++;
    }

    while(i<n1)
    { arr[k] = L[i]; i++; k++; }
    while(j<n2)
    { arr[k] = R[j]; j++; k++; }

  }

  public static void main(String[] args) {

    int[] arr = new int[]{4,2,6,1,3,9,5};
    mergeSort(arr,0,arr.length-1);
    for(int i : arr)
      System.out.print(i+" ");
  }
}
