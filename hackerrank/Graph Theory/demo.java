import java.util.*;
import java.io.*;
class Graph{
  int V;
  LinkedList<Integer> adj[];

  Graph(int v){
    V=v;
    adj = new LinkedList[v];
    for(int i=0; i<v; i++)
      adj[i] = new LinkedList<Integer>();
  }

  void DFS(){
    boolean[] visited = new boolean[V];
    for(int i=0; i<V; i++)
      DFSUtil(visited,i);
  }

  void addEdge(int v, int w){
    adj[v].add(w);
  }

  void DFSUtil(boolean[] visited, int i){
    if(!visited[i]){
    visited[i] = true;
    System.out.println(i);
    Iterator<Integer> iterator = adj[i].listIterator();
    while(iterator.hasNext())
    {
          int n = iterator.next();
          if(!visited[n])
            DFSUtil(visited,n);
    }
  }
  }

  void BFS()
  {
    boolean[] visited = new boolean[V];
    for(int i=0; i<V; i++)
      BFSUtil(visited, i);
  }

  void BFSUtil(boolean[] visited, int v){
    if(!visited[v]){
    int[] queue = new int[V];
    int f=-1, r=-1;
    queue[++r] = v;
    while(f!=r)
    {
      int i = queue[++f];
      visited[i] = true;
      System.out.println(i);
      Iterator<Integer> iterator = adj[i].listIterator();
      while(iterator.hasNext())
      {
        int n = iterator.next();
        if(!visited[n])
            queue[++r]=n;
      }
    }
  }
  }

}

class demo{
  public static void main(String[] args) {
    Graph g = new Graph(5);
    g.addEdge(0,1);
    g.addEdge(0,3);
    g.addEdge(2,3);
    //g.DFS();
    g.BFS();
  }
}
