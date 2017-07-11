import java.util.*;

class ques3
{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String name = in.nextLine();
      int len = in.nextInt(); // Important
    replace(name,len);
  }
  static void replace(String name, int len)
  {
    int beg=0, end=0, i=0;
    String temp="";
    for(i=0; i<len; i++)9
    {
      if(' '==name.charAt(i))
      {
        end=i;
        temp+=name.substring(beg,end)+"%20";
        //System.out.println(name.substring(beg,end));
        beg=i+1;
      }
    }
    temp+=name.substring(beg,i);
    System.out.println(temp);
  }
}
