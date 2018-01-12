import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class climbingleaderboard{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i = 0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i = 0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }

        int[] ranking = new int[n];
        ranking[0]=1;
        int count=1;
        for(int i=1; i<n; i++)
        {
            if(scores[i]!=scores[i-1])
            {
                count++;
                ranking[i]=count;
            }
            else
                ranking[i]=count;

        }
         int j=n-1;
        for(int i=0; i<m; i++)
        {
            while(j>0)
            {
                if(scores[j]>=alice[i])
                    break;
                j--;
            }
            if(scores[j]==alice[i])
                System.out.println(ranking[j]);
            else if (j==0)
                System.out.println("1");
            else
                System.out.println(ranking[j]+1);
        }
        in.close();
    }
}
