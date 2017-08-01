import java.util.*;

class Graph{
  int V;
  LinkedList<Integer>[] adj;

  Graph(int V){
    this.V=V;
    adj = new LinkedList[V];
    for(int i=0; i<V; i++)
      adj[i] = new LinkedList<Integer>(); }

  void addEdge(int v, int w){
    adj[v].add(w);
  }

  void Dfs(int src){
    boolean[] visited = new boolean[V];
    for(int i=0; i<V; i++)
      visited[i]=false;
    DfsUtil(visited,src);
  }

  void DfsUtil(boolean[] visited, int i){
    visited[i]=true;
    System.out.print(i+" ");
    Iterator<Integer> iterator = adj[i].iterator();
    while(iterator.hasNext()){
      int v = iterator.next();
      if(!visited[v])
        DfsUtil(visited,v);
    }
  }
}

class dfs{
  public static void main(String[] args) {
    Graph g = new Graph(6);
    g.addEdge(0,1);
    g.addEdge(0,3);
    g.addEdge(1,4);
    g.addEdge(1,2);
    g.addEdge(2,5);
    g.addEdge(5,0);
    g.Dfs(0);
  }
}
