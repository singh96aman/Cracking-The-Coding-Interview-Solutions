import java.util.*;
class allPermutation{

  static void permute(String str, int l, int r){
    if(l==r)
      System.out.println(str);
    else{
      for(int i=l; i<=r; i++){
        str = swap(str,l,i);
        permute(str,l+1,r);
        str = swap(str,l,i);
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

    String str;
    Scanner sc = new Scanner(System.in);
    str = sc.nextLine();
    permute(str,0,str.length()-1);

  }
}
