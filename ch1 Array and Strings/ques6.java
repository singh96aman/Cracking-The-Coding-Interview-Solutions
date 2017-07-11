import java.util.*;
class ques6{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String str = in.next();
    str = compress(str);
    System.out.println(str);
  }

  static String compress(String str)
  {
    int count=1;

    // Use String Builder (Rookie Mistake)

    StringBuilder newstr = new StringBuilder();
    newstr.append(str.charAt(0));
    for(int i=0; i<str.length()-1; i++)
    {
      if(str.charAt(i)!=str.charAt(i+1))
      {
        //System.out.println(str.charAt(i)+" "+str.charAt(i+1));
        //System.out.println(count);
        newstr.append(count);
        newstr.append(str.charAt(i+1));
        count=1;
      }
      else
        count++;
    }
    newstr.append(count);
    if(newstr.length()<str.length())
      return newstr.toString();
    else
    return str;
    /*
    String newstr = "" + str.charAt(0);
    for(int i=0; i<str.length()-1; i++)
    {
      if(str.charAt(i)!=str.charAt(i+1))
      {
        //System.out.println(str.charAt(i)+" "+str.charAt(i+1));
        System.out.println(count);
        newstr += count;
        newstr += str.charAt(i+1);
        count=1;
      }
      else
        count++;
    }
    newstr+=count;
    if(newstr.length()<str.length())
      return newstr;
    else
    return str;
    */
  }

}
