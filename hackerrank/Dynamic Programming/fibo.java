import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class fibo {
    public static void main(String args[] ) throws Exception {
      Scanner scn = new Scanner(System.in);
BigInteger t1 = new BigInteger(scn.nextInt()+"");
BigInteger t2 = new BigInteger(scn.nextInt()+"");
int n = scn.nextInt();

BigInteger temp = new BigInteger("0");
for(int i=3;i<=n;i++){
    temp = t2;
    t2 = t2.multiply(t2);
    t2 = t2.add(t1);
    t1 = temp;
    System.out.println(t2);
}
    }
}
