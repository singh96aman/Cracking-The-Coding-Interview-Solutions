import java.util.*;
class ques5{

  int SparseSearch(String[] arr, int first, int last, String str){

    if(first>last) return -1;
    int mid = (last+first) /2;

    if(arr[mid].equals("")){

      int left = mid-1;
      int right = mid+1;

      // Great Code !!!! :)

      while(true){
        if(left<first && right>last)
          return -1;
        else if(right<=last && !arr[right].equals("")){
          mid = right;
          break;
        }
        else if(left>=first && !arr[left].equals("")){
          mid = left;
          break;
        }
        right++;
        left--;
      }
    }

    if(str.equals(arr[mid]))
      return mid;
    else if(arr[mid].compareTo(str)<0) // Important function string.compareTo
      return SparseSearch(arr,mid+1,last,str);

      return SparseSearch(arr,first,mid-1,str);
  }

  public static void main(String[] args) {

    ques5 q = new ques5();
    String[] arr = new String[]{"","","aman","","singh","","","","","","thakur","","","ab"};
    int i=q.SparseSearch(arr,0,arr.length-1,"aman");
    if(i==-1)
      System.out.println("Not found");
    else
      System.out.println("Found at + "+i);

  }
}
