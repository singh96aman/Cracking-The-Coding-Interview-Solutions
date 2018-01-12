import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, m , k;
        n = sc.nextLong();
        m = sc.nextLong();
        k = sc.nextLong();
        long i, j;
        boolean[][] flags = new boolean[n][m];
        for(i=0; i<k; i++){
            long r, c1, c2;
            r = sc.nextLong();
            c1 = sc.nextLong();
            c2 = sc.nextLong();
            for(j=c1-1; j<=c2-1; j++){
              flags[r-1][j]=true;
            }
        }
        long val=0;
        for(i=0; i<n; i++)
          for(j=0; j<m; j++)
            if(flags[i][j]==false)
              val++;
        System.out.println(val);
    }
}
