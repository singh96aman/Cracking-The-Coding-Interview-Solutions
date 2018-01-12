import java.util.*;
import java.io.*;

class Graph{
  int V;
  LinkedList<Integer> adj[];

  Graph(int V){
    this.V=V;
    adj = new LinkedList[V];
    for(int i=0; i<V; i++)
      adj[i] = new LinkedList<Integer>();
  }
  void addEdge(int v, int w){
    adj[v].add(w);
  }
  void printGraph(){
    for(int i=0; i<V; i++)
    {
      System.out.print(i+" is connected to : ");
      Iterator<Integer> iterator = adj[i].listIterator();
      while(iterator.hasNext())
      {
        int n = (Integer)iterator.next();
        System.out.print(n+" ");
      }
      System.out.println();
    }
  }
  void DFS(int S)
  {
    boolean[] visited = new boolean[V];
    DFSUtil(S,visited);
  }
  void DFSUtil(int i, boolean[] visited)
  {
    visited[i] = true;
    System.out.println(i);
    Iterator<Integer> iterator = adj[i].listIterator();
    while(iterator.hasNext())
    {
      int n = iterator.next();
      if(!visited[n])
        DFSUtil(n,visited);
    }
  }
  void BFS(int S)
  {
    int[] queue = new int[50];
    boolean[] visited = new boolean[V];
    int f=-1, r=-1;
    queue[++r]=S;
    while(f!=r)
    {
      int v=queue[++f];
      while(!visited[v])
      {
        System.out.println(v);
        visited[v]=true;
        Iterator<Integer> iterator = adj[v].listIterator();
        while(iterator.hasNext())
        {
          int n = iterator.next();
          queue[++r]=n;
        }
      }
    }
  }
}

class intro{
  public static void main(String[] args) {
    Graph g = new Graph(7);
    g.addEdge(0,1);
    g.addEdge(0,3);
    g.addEdge(1,3);
    g.addEdge(3,2);
    g.addEdge(1,4);
    g.addEdge(0,5);
    g.addEdge(5,6);
    g.addEdge(0,6);
    //g.printGraph();
    //g.DFS(0);
    g.BFS(0);
  }
}
