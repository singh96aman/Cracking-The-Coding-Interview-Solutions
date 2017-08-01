import java.util.*;

class findSumallPer{

    static int sum=0;

  static void getPermutation(String arr, int l, int r){

    if(l==r)
    { sum+=Integer.parseInt(arr);
      return;}

    for(int i=l; i<=r; i++)
    {
      arr=swap(arr,l,i);
      getPermutation(arr,l+1,r);
      arr=swap(arr,l,i);
    }
  }

  static String swap(String temp, int l, int i){
    char[] arr = temp.toCharArray();
    char t = arr[l];
    arr[l]=arr[i];
    arr[i]=t;
    return String.valueOf(arr);
  }

  public static void main(String[] args) {
    String temp = "123";
    findSumallPer f = new findSumallPer();
    f.getPermutation(temp,0, temp.length()-1);
    System.out.println(f.sum);
  }

}
