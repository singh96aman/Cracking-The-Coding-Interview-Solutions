import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class diagonal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int[] factorofn = new int[n];
        int index=0, factor=1;
        while(factor<=n)
        {
            if(n%factor==0)
                factorofn[index++]=factor;
            factor++;
        }
        BigInteger sum = new BigInteger("0");
        for(int i=0; i<index; i++)
            for(int j=0; j<index; j++)
            {
                if(factorofn[i]*factorofn[j]==n)
                {
                    int M=0, N=0, l=0;
                    BigInteger temp = new BigInteger("0");
                    while(M<factorofn[i] && N<factorofn[j])
                    {
                       temp=temp.add(BigInteger.valueOf(arr[l]));
                        l+=j+1;
                        M++; N++;
                    }
                    if(sum.compareTo(temp)==-1)
                      sum=temp;
                }
            }
            System.out.println(sum);
    }
}
