import java.util.*;
class planepoint{
  static int n=5;
  class Point{
    public int x,y;
  }
    static Point[][] point = new Point[n][n];
  public static void main(String[] args) {
    for(int i=0; i<n; i++)
    {
      point[i] = new Point[n];
      for(int j=0; j<n; j++)
      {
      point[i][j].x=i;
      point[i][j].y=j;
      }
    }
    for(int i=0; i<n; i++)
      for(int j=0; j<n; j++)
        System.out.println(point[i][j].x+" "+point[i][j].y);
  }
}
