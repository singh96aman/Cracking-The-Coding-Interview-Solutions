import java.util.*; 
class dfsmatrix{

  int V;

  dfsmatrix(int V){
    V=this.V;
  }


  void dfs(int[][] edges, int v, boolean[] visited){
    System.out.print(v+" ");
    visited[v]=true;
    for(int i=0; i<edges.length; i++){
      if(edges[v][i]==1 && !visited[i]){
        visited[i]=true;
        dfs(edges,i,visited);
      }
    }
  }

  void dfsUtil(int[][] edges, int src, int v){
    boolean[] visited = new boolean[v];
    dfs(edges,src,visited);
  }

public static void main(String[] args) {

  int v;
  int[][] edges = new int[][]{
    {0,1,0,1,0,1},
    {1,0,1,0,1,0},
    {0,1,0,0,0,1},
    {1,0,0,0,0,0},
    {0,0,0,0,0,0},
    {1,1,1,0,0,0}};

  dfsmatrix d = new dfsmatrix(6);
  d.dfsUtil(edges,0,6);
}
}
