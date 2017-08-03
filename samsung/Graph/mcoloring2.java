import java.util.*;
class mcoloring2{
  int V;
  mcoloring2(int V){
    this.V=V;
  }

  boolean isSafe(int[][] graph, int v, int c, int[] color){
    for(int i=0; i<V; i++)
      if(graph[v][i]==1 && c==color[i])
        return false;
    return true;
  }

  boolean graphColoring(int[][] graph,int m){
    int[] color=new int[V];
    for(int i=0; i<V; i++)
      color[i]=0;
    if(!graphColoringUtil(graph,m,color,0))
    {
      System.out.println("Doesn't exist!");
      return false;
    }
    for(int i=0; i<V; i++)
      System.out.print(color[i]+" ");
      return true;
  }

  boolean graphColoringUtil(int[][] graph, int m, int[] color, int v){

    if(v==V)
      return true;
    for(int c=1; c<=m; c++){
      if(isSafe(graph,v,c,color))
        { color[v]=c;
          if(graphColoringUtil(graph,m,color,v+1))
            return true;
            color[v]=0;
        }
    }
    return false;
  }
public static void main(String[] args) {
  mcoloring2 Coloring = new mcoloring2(4);
  /* Create following graph and test whether it is
     3 colorable
    (3)---(2)
     |   / |
     |  /  |
     | /   |
    (0)---(1)
  */
  int graph[][] = {{0, 1, 1, 1},
      {1, 0, 1, 0},
      {1, 1, 0, 1},
      {1, 0, 1, 0},
  };
  int m = 3; // Number of colors
  Coloring.graphColoring(graph, m);
}
}
