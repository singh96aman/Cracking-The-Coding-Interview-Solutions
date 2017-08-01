import java.util.*;
class kthsmallestnumber{

  static void permute(String str, int l, int r, int k){
    if(l==r && k==0)
      System.out.println(str);
    else{
      for(int i=l; i<=r; i++){
        str = swap(str,l,i);
        permute(str,l+1,r,k);
        str = swap(str,l,i);
        k--;
      }
    }
  }

  static String swap(String str, int i, int j){
    char temp;
    char[] charArray = str.toCharArray();
    temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return String.valueOf(charArray);
  }

  public static void main(String[] args) {
    String num="3412";
    int k=2;
    char[] arr = num.toCharArray();
    Arrays.sort(arr);
    num=String.valueOf(arr);
    permute(num,0,num.length()-1,k);
  }
}
