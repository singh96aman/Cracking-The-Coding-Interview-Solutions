import java.util.*;
import java.io.*;

class rect{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    for(int i=0; i<n; i++)
    {
      int a = sc.nextInt();
      int b =sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      if((Math.pow(a,2)+Math.pow(b,2))==(Math.pow(c,2)+Math.pow(d,2)))
        System.out.println("YES");
      else if((Math.pow(a,2)+Math.pow(c,2))==(Math.pow(b,2)+Math.pow(d,2)))
        System.out.println("YES");
      else if((Math.pow(a,2)+Math.pow(d,2))==(Math.pow(c,2)+Math.pow(b,2)))
        System.out.println("YES");
      else
        System.out.println("NO");
    }
  }
}
