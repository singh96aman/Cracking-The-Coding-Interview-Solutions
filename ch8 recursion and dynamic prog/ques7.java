import java.util.*;

class ques7{

  String swap(String temp, int i, int j)
  {
    char[] arr = temp.toCharArray();
    char t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
    return String.valueOf(arr);
  }

  void getpermutation(String temp, int l, int r)
  {
    if(l==r)
      System.out.println(temp);
    for(int i=l; i<=r; i++)
    {
      temp = swap(temp,l,i);
      getpermutation(temp,l+1,r);
      temp = swap(temp,l,i);
    }
  }

  public static void main(String[] args) {
    ques7 q = new ques7();
    String temp ="aac";
    q.getpermutation(temp,0,temp.length()-1); // tofind length use .length()
    }
}
