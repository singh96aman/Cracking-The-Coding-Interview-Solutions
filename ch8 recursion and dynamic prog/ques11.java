import java.util.*;


class ques11{

  int pennies(int n, int sum){
      if(n<1)
        return 0;

      sum+=quarters(n-1,sum);
      sum+=1;
      return sum;
  }

  int nickels(int n, int sum){
      if(n<5)
      {
        System.out.println("No of Pennies "+pennies(n,0));
        return 0;
      }

      sum+=quarters(n-5,sum);
      sum+=1;
      return sum;
  }

  int dimes(int n, int sum){
      if(n<10)
      {
        System.out.println("No of Nickels "+nickels(n,0));
        return 0;
      }

      sum+=quarters(n-10,sum);
      sum+=1;
      return sum;
  }

  int quarters(int n, int sum)
  {
    if(n<25)
    {
      System.out.println("No of Dimes "+dimes(n,0));
      return 0;
    }

    sum+=quarters(n-25,sum);
    sum+=1;
    return sum;
  }

  public static void main(String[] args) {

    ques11 q = new ques11();
    System.out.println("No of Quarters "+q.quarters(59,0));

  }
}
