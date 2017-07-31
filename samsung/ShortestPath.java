/*import java.util.*;

class ShortestPath{

  int V;

    ShortestPath(int V){
      this.V=V;
    }

//Create a set sptSet (shortest path tree set) that keeps track of vertices included in shortest path tree,
//i.e., whose minimum distance from source is calculated and finalized. Initially, this set is empty.

  int min_Distance(int[] dist, boolean[] sptSet){
    int min = Integer.MAX_VALUE, min_index=1;
    for(int v=0; v<V; v++)
      if(sptSet[v]==false && dist[v]<=min){
        min = dist[v];
        min_index = v;
      }
    return min_index;
  }

  void printSolution(int[] dist){
    System.out.println("Vertex Distance from Source");
    for(int i=0; i<V; i++)
      System.out.println(i+" tt "+dist[i]);
  }

  void dijkstra(int[][] graph, int src){
    int[] dist = new int[V];
    boolean[] sptSet = new boolean[V];
    for(int i=0; i<V; i++){
      dist[i] = Integer.MAX_VALUE;
      sptSet[i] = false;
    }
    dist[src]=0;
    for(int count=0; count<V-1; count++){

      int u = min_Distance(dist,sptSet); // vertex visited
      //System.out.println(u);
      sptSet[u] = true;
      for(int v=0; v<V; v++)
        if(!sptSet[v] && graph[u][v]!=0 && dist[u]!=Integer.MAX_VALUE
          && dist[u]+graph[u][v]<dist[v])
            dist[v] = dist[u] + graph[u][v];

    }
   printSolution(dist);
  }

  public static void main(String[] args) {
    int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                                  {4, 0, 8, 0, 0, 0, 0, 11, 0},
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2},
                                  {0, 0, 7, 0, 9, 14, 0, 0, 0},
                                  {0, 0, 0, 9, 0, 10, 0, 0, 0},
                                  {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                  {0, 0, 0, 0, 0, 2, 0, 1, 6},
                                  {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                  {0, 0, 2, 0, 0, 0, 6, 7, 0}
                                 };
        ShortestPath t = new ShortestPath(9);
        t.dijkstra(graph, 0);
  }

}
*/
import java.util.*;
class ShortestPath{
  int V;
  ShortestPath(int V){
    this.V=V;
  }
  int min_Distance(int[] dist, boolean[] sptSet){
    int min_index=1, min=Integer.MAX_VALUE;
    for(int i=0; i<V; i++)
      if(dist[i]<=min && !sptSet[i])
        {
          min = dist[i];
          min_index = i;
        }
    return min_index;
  }

  void printSolution(int[] dist){
    for(int i=0; i<V; i++)
      System.out.println(i+" tt "+ dist[i]);
  }

  void dijkstra(int[][] graph, int src){
    int[] dist = new int[V];
    int i;
    boolean[] sptSet = new boolean[V];
    for(i=0; i<V; i++)
    {  sptSet[i]=false;
        dist[i]=Integer.MAX_VALUE;
    }
    dist[src]=0;
    for(int count=0; count<V-1; count++){
      int u = min_Distance(dist,sptSet);
      sptSet[u] = true;
      for(int v=0; v<V; v++)
        if(!sptSet[v] && dist[u]!=Integer.MAX_VALUE && graph[u][v]!=0 &&
            dist[u] + graph[u][v]<dist[v])
            dist[v] = dist[u] + graph[u][v];
      }
      printSolution(dist);
    }

  public static void main(String[] args) {
    int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                                  {4, 0, 8, 0, 0, 0, 0, 11, 0},
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2},
                                  {0, 0, 7, 0, 9, 14, 0, 0, 0},
                                  {0, 0, 0, 9, 0, 10, 0, 0, 0},
                                  {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                  {0, 0, 0, 0, 0, 2, 0, 1, 6},
                                  {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                  {0, 0, 2, 0, 0, 0, 6, 7, 0}
                                 };
        ShortestPath t = new ShortestPath(9);
        t.dijkstra(graph, 0);
  }
}
