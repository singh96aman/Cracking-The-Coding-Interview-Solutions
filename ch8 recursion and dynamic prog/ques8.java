import java.util.*;

class ques8{

  String swap(String temp, int i, int j)
  {
    char[] arr = temp.toCharArray();
    char t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
    return String.valueOf(arr);
  }

  boolean check(String temp, ArrayList<String> memo){
    for(int i=0; i<memo.size(); i++)
      if(temp.equals(memo.get(i))) // very important for strings !!!!!!!!!!!!!!!!!
        return false;
    return true;
  }

  void getpermutation(String temp, int l, int r, ArrayList<String> memo)
  {
    if(l==r)
    {
      if(memo.size()==0)
      {
        System.out.println(temp);
        memo.add(temp);
      }
      else{
        if(check(temp, memo))
        {
          System.out.println(temp);
          memo.add(temp);
        }
      }
    }
    for(int i=l; i<=r; i++)
    {
      temp = swap(temp,l,i);
      getpermutation(temp,l+1,r,memo);
      temp = swap(temp,l,i);
    }
  }

  public static void main(String[] args) {
    ques8 q = new ques8();
    String temp ="aac";
    ArrayList<String> memo = new ArrayList<String>();
    q.getpermutation(temp,0,temp.length()-1,memo); // tofind length use .length()
    }
}
