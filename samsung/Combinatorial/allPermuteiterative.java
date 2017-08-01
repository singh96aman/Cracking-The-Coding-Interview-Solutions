import java.util.*;

class allPermuteiterative{

  static int fact(int n){
    return (n==1)?1:n*fact(n-1);
  }

  static void Permutation(String s){
    int n = s.length();
    int fc = fact(n);

    int j=1, m=0;
    for(int perm_c=0; perm_c<fc;){
      String perm = s;
      int k=0;
      while(k!=fc/n){
        while(j!=n-1){
          System.out.println(perm);
          s=swap(perm,j,j+1);
          k++;
          perm_c++;
          j++;
        }
        j=1;
      }
      m++;
      if(m==n)
        break;
      s=swap(perm,0,m);
    }
  }

  static String swap(String perm, int i, int j){
    char[] arr = perm.toCharArray();
    char temp = arr[i];
    arr[i] = arr[i+1];
    arr[i+1] = temp;
    return String.valueOf(arr);
  }

  public static void main(String[] args) {

    String temp = "1234";
    Permutation(temp);

  }
}
