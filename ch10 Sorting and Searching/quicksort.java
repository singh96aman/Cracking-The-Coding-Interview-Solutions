import java.util.*;
class quicksort{

  void quickSort(int[] arr, int left, int right){
    int index = partition(arr,left,right);
    if(left<index-1)
      quickSort(arr,left,index-1); // Sorts left Half
    if(index<right)
      quickSort(arr,index,right); // Sorts right half
  }

  int partition(int[] arr, int left, int right){
    int pivot = arr[(left+right)/2];
    while(left<=right){
        while(arr[left]<pivot) left++;
        while(arr[right]>pivot) right--;

        if(left<=right){
          swap(arr,left,right);
          left++; right--;
        }
    }
    return left;
  }

  void swap(int[] arr, int left, int right){
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
  }

  public static void main(String[] args) {

    quicksort q = new quicksort();
    int arr[]={3,7,1,9,2,0};
    q.quickSort(arr,0,arr.length-1);
    for(int i : arr)
      System.out.println(i);
  }
}
