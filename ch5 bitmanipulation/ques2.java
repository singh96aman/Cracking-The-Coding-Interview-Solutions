/*
import java.util.*;
class ques2
{

  void output(long num)
  {
    String temp = "";
    int n = (int) num;
    while(n!=0){
      temp+=n%2;
      n=n/2;
    }
    temp+=".";
    n = (int) num;
    //Double mantissa = new Double(num-n);
    long mantissa = num & 0x000fffffffffffffL;
    //mantissa.setPrecision(4);
    System.out.println(Double.longBitsToDouble(mantissa));

    while(mantisa!=0)
    {
      mantisa=mantisa*2;
      if(mantisa > 1)
      {
        mantisa-=1;
        temp+="1";
      }
      else
        temp+="0";
    }
    System.out.println(temp);

    //System.out.println(Integer.toString(n,2)); // prints 1100100 --binary representation
  }

  public static void main(String[] args) {

    ques2 q = new ques2();
    Scanner in = new Scanner(System.in);
    long num = Double.doubleToLongBits(15.20);
    q.output(num);
  }
}
*/
