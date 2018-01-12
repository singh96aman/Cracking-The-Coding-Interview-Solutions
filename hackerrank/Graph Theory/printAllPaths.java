import java.util.*;
import java.io.*;

class Graph{
  int V;
  LinkedList<Integer> adj[];
  static int count=0;

  Graph(int V){
    this.V=V;
    adj = new LinkedList[V];
    for(int i=0; i<V; i++)
      adj[i] = new LinkedList<Integer>();
  }

  void addEdge(int v, int w){
    adj[v].add(w);
  }

  void DFS(int i){
    boolean[] visited = new boolean[V];
    int[] print = new int[V];
    int index=0;
    DFSUtil(i,visited,print,index);
  }

  void DFSUtil(int i, boolean[] visited, int[] print, int index){
      visited[i]=true;
      print[index++]=i;
      Iterator<Integer> iterator = adj[i].listIterator();
      if(i==V-1)
      {
        for(int j=0; j<index; j++)
        {
          count++;
          System.out.print(print[j]+" ");
        }
        System.out.println();
      }
      else
      {
        while(iterator.hasNext())
        {
          int n = iterator.next();
          DFSUtil(n,visited,print,index);
        }
      }
  }
}

class printAllPaths{
  public static void main(String[] args) {
    Graph g = new Graph(5);
    g.addEdge(0,1);
    g.addEdge(0,2);
    g.addEdge(1,3);
    g.addEdge(2,4);
    g.addEdge(3,4);
    g.DFS(0);
  }
}
/*
import java.util.*;
import java.io.*;

class Graph{
  int V;
  LinkedList<Integer> adj[];
  static int count=0;

  Graph(int V){
    this.V=V;
    adj = new LinkedList[V];
    for(int i=0; i<V; i++)
      adj[i] = new LinkedList<Integer>();
  }

  void addEdge(int v, int w){
    adj[v].add(w);
  }

  void DFS(int i){
    boolean[] visited = new boolean[V];
    int[] print = new int[V];
    int index=0;
    DFSUtil(i,visited,print,index);
  }

  void DFSUtil(int i, boolean[] visited, int[] print, int index){
      visited[i]=true;
      print[index++]=i;
      Iterator<Integer> iterator = adj[i].listIterator();
      if(i==V-1)
      {
        if(index>count)
          count=index;
        //System.out.println(index);
      }
      else
      {
        while(iterator.hasNext())
        {
          int n = iterator.next();
          DFSUtil(n,visited,print,index);
        }
      }
  }
}

class printAllPaths{
  public static void main(String[] args) {
    Graph g = new Graph(5);
    g.addEdge(0,1);
    g.addEdge(0,2);
    g.addEdge(1,3);
    g.addEdge(2,4);
    g.addEdge(3,4);
    g.DFS(0);
    System.out.println((g.count-1)*10);
  }
}
*/
