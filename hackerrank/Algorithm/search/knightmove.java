/*
Explaination KnightL problem
boolean isprocessed that is used to check whether the dequed block
is processed or not.

intialize a count and isprocessed as 0, 0, false

make a queue and add all pairs of indexes. isprocessed[n-1][n-1]=true

get a min count variable

while queue.size()!=0
assign 1 to a[x][y] which indicates that it's removeped outside the queue
assign _count to count[x][y]
queue.remove()

Check for all 8 possibilities
assign p and q with new values from x and y
if(a[p][q]!=0) i.e it's added to the queue already
count[p][q]=min(count[p][q],_count+1)
else
count[p][q]=_count_+1
if(p==0 and q==0)
a[0][0]=1 break
if(isprocessed[p][q]==false)
queue.add(p,q)
isprocessed[p][q]=true

same for rest of 7 cases

assign ans=-1
check if a[0][0]==1
ans=count[x][y]+1
op[k-1][l-1]=ans
op[l-1][k-1]=ans

print op

*/
import java.util.*;
class Coordinate{
  int x;
  int y;
  Coordinate(int a, int b){
    x=a; y=b;
  }
}

class knightmove{
  static void findPath(int n){
    int[][] op = new int[n-1][n-1];
    boolean[][] isProcessed = new boolean[n][n];
    for(int k=1; k<n; k++)
      for(int l=k; l<n; l++)
      {
        int[][] a = new int[n][n];
        int[][] count = new int[n][n];
        Queue<Coordinate> queue = new LinkedList();
        Coordinate coordinate = new Coordinate(n-1, n-1);
        queue.add(coordinate);
        isProcessed[n-1][n-1]=true;
        int x, y, _count;
        while(queue.size()!=0){
          x = queue.peek().x;
          y = queue.peek().y;
          //System.out.println(x+" "+y);
          a[x][y]=1;
          _count = count[x][y];
          //System.out.println(_count);
          queue.remove();
          int p, q;

          p = x+k;
          q = y+l;
          if(p>=0 && q>=0 && p<n && q<n)
          {
              if(a[p][q]!=0)
                count[p][q] = _count+1;
              else
              {
              count[p][q]=_count+1;
              if(p==0 && q==0)
              {a[0][0]=1;break;}
              if(isProcessed[p][q]==false)
              {
                Coordinate temp = new Coordinate(p,q);
                queue.add(temp);
                isProcessed[p][q]=true;
              }
            }
          }

          p = x+k;
          q = y-l;
          if(p>=0 && q>=0 && p<n && q<n)
          {
              if(a[p][q]!=0)
                count[p][q] = _count+1;
              else
              {
              count[p][q]=_count+1;
              if(p==0 && q==0)
              {a[0][0]=1;break;}
              if(isProcessed[p][q]==false)
              {
                Coordinate temp = new Coordinate(p,q);
                queue.add(temp);
                isProcessed[p][q]=true;
              }
            }
          }

          p = x-k;
          q = y+l;
          if(p>=0 && q>=0 && p<n && q<n)
          {
              if(a[p][q]!=0)
                count[p][q] = _count+1;
              else
              {
              count[p][q]=_count+1;
              if(p==0 && q==0)
              {a[0][0]=1;break;}
              if(isProcessed[p][q]==false)
              {
                Coordinate temp = new Coordinate(p,q);
                queue.add(temp);
                isProcessed[p][q]=true;
              }
            }
          }

          p = x-k;
          q = y-l;
          if(p>=0 && q>=0 && p<n && q<n)
          {
              if(a[p][q]!=0)
                count[p][q] = _count+1;
              else
              {
              count[p][q]=_count+1;
              if(p==0 && q==0)
              {a[0][0]=1;break;}
              if(isProcessed[p][q]==false)
              {
                Coordinate temp = new Coordinate(p,q);
                queue.add(temp);
                isProcessed[p][q]=true;
              }
            }
          }

          p = x+l;
          q = y+k;
          if(p>=0 && q>=0 && p<n && q<n)
          {
              if(a[p][q]!=0)
                count[p][q] = _count+1;
              else
              {
              count[p][q]=_count+1;
              if(p==0 && q==0)
              {a[0][0]=1;break;}
              if(isProcessed[p][q]==false)
              {
                Coordinate temp = new Coordinate(p,q);
                queue.add(temp);
                isProcessed[p][q]=true;
              }
            }
          }

          p = x+l;
          q = y-k;
          if(p>=0 && q>=0 && p<n && q<n)
          {
              if(a[p][q]!=0)
                count[p][q] = _count+1;
              else
              {
              count[p][q]=_count+1;
              if(p==0 && q==0)
              {a[0][0]=1;break;}
              if(isProcessed[p][q]==false)
              {
                Coordinate temp = new Coordinate(p,q);
                queue.add(temp);
                isProcessed[p][q]=true;
              }
            }
          }

          p = x-l;
          q = y+k;
          if(p>=0 && q>=0 && p<n && q<n)
          {
              if(a[p][q]!=0)
                count[p][q] = _count+1;
              else
              {
              count[p][q]=_count+1;
              if(p==0 && q==0)
              {a[0][0]=1;break;}
              if(isProcessed[p][q]==false)
              {
                Coordinate temp = new Coordinate(p,q);
                queue.add(temp);
                isProcessed[p][q]=true;
              }
            }
          }

          p = x-l;
          q = y-k;
          if(p>=0 && q>=0 && p<n && q<n)
          {
              if(a[p][q]!=0)
                count[p][q] = _count+1;
              else
              {
              count[p][q]=_count+1;
              if(p==0 && q==0)
              {a[0][0]=1;break;}
              if(isProcessed[p][q]==false)
              {
                Coordinate temp = new Coordinate(p,q);
                queue.add(temp);
                isProcessed[p][q]=true;
              }
            }
          }

          int ans=-1;
          if(a[0][0]==1)
            ans=count[x][y]+1;
          op[k-1][l-1]=ans;
          op[l-1][k-1]=ans;
        }
      }

      for(int i=0; i<n-1; i++)
      {
        for(int j=0; j<n-1; j++)
            System.out.print(op[i][j]+" ");
        System.out.println();
      }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    findPath(n);
  }
}

// My initial solution

/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class knightmove{

    static void findPath(int count, int i, int j, int a, int b, int n)
    {
        if(i<0 || j<0 || i>n || j>n)
        {
            count=-1;
            return;
        }
        if(count==-1)
            return;
        if(i==0 && j==0){
            System.out.println(count);
            return;
          }
        findPath(count+1,i-a,j-b,a,b,n);
        findPath(count+1,i+a,j-b,a,b,n);
        findPath(count+1,i-a,j+b,a,b,n);
        findPath(count+1,i+a,j+b,a,b,n);
        findPath(count+1,i-b,j-a,a,b,n);
        findPath(count+1,i+b,j-a,a,b,n);
        findPath(count+1,i-b,j+a,a,b,n);
        findPath(count+1,i+b,j+a,a,b,n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        findPath(0,n-1,n-1,1,1,n);
    }
}
*/
