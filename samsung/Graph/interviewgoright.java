import java.util.*;
class interviewgoright{
  public static void main(String[] args) {
    int[][] arr = new int[][]{
      {0,0,1,0},
      {0,1,0,0},
      {0,1,1,0},
      {0,0,0,0}
    };
    int i=0, j=0, max=4, found=0;
    while(true){
      for(j=0; j<arr.length; j++)
          if(arr[i][j]==1){
            System.out.println(i+" "+j);
            arr[i][j]=0;
            found=1;
            break;}
            if(found==0)
              j--;
              found=0;
      for(i=0; i<arr.length; i++)
        if(arr[i][j]==1){
          System.out.println(i+" "+j);
          arr[i][j]=0;
          found=1;
        break;}
        if(found==0)
          i--;
          found=0;

        if(i==4 || j==4)
          break;

    }
    System.out.println(i+" "+j);
  }
}
