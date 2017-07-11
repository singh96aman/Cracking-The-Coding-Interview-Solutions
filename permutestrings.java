import java.util.*;

class permutestrings
{

  static void permutation(String str)
  {
    permutation(str,"");
  }

  static void permutation(String str, String prefix)
  {
    if(str.length()==0)
      System.out.println(prefix);
    else{
      for(int i=0; i<str.length(); i++){
        String rem=str.substring(0,i)+str.substring(i+1);
          System.out.println("rem="+rem);
        permutation(rem,prefix+str.charAt(i));
      }
    }
  }

  public static void main(String[] args) {

    String leh = "aman";
    permutation(leh);

  }
}
