import java.util.*;

class eggDrop{

  static void findOptimalSolution(int n, int k){

    int[][] eggfloors = new int[n+1][k+1]; // holds min no of trials

    int res=0, i, j, x;

    for(i=1; i<=n; i++){
      eggfloors[i][1] = 1;
      eggfloors[i][0] = 0;
    }

    for(j=1; j<=k; j++)
      eggfloors[1][j] = j;

    for(i=2; i<=n; i++)
    {
      for(j=2; j<=k; j++)
      {
        eggfloors[i][j] = Integer.MAX_VALUE;
        for(x=1; x<=j; x++){
          res = 1 + Math.max(eggfloors[i-1][x-1],eggfloors[i][j-x]);
          if(res < eggfloors[i][j])
            eggfloors[i][j]=res;
        }
      }
    }
    System.out.println(eggfloors[n][k]);
  }


  public static void main(String[] args) {

    int n =2, k=100;
    findOptimalSolution(n,k);

  }
}
