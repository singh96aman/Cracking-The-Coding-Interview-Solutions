import java.util.*;
class mergeSort{
  void mergesort(int[] arr, int low, int high){
    if(low<high){
      int middle = (low+high)/2;
      mergesort(arr,low,middle);
      mergesort(arr,middle+1,high);
      merge(arr,low,middle,high);
    }
  }

  void merge(int[] arr, int l, int m, int h){

    int n1 = m-l+1;
    int n2 = h-m;

    int i,j;
    int[] L = new int[n1];
    int[] R = new int[n2];

    for(i=0; i<n1; i++)
      L[i] = arr[l+i];

    for(j=0; j<n2; j++)
      R[j] = arr[m+1+j];

    //i=0, j=0; // Cant't declare like this
    i=0; j=0;
    int k=l;

    while(i<n1 && j<n2){

      if(L[i]<=R[j]){
        arr[k]=L[i];
        i++;
      }
      else{
        arr[k]=R[j];
        j++;
      }
      k++;
    }

    while(i < n1){
      arr[k] = L[i];
      i++; k++;
    }

    while(j < n2){
      arr[k] = R[j];
      j++; k++;
    }
  }

  public static void main(String[] args) {
      mergeSort m = new mergeSort();
      int[] arr={4,7,1,9,3,2};
      m.mergesort(arr,0,arr.length-1);
      for(int i : arr)
        System.out.println(i);
  }
}
