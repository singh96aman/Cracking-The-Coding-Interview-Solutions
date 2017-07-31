import java.util.*;

class Graph{
  int V;
  LinkedList<Integer>[] adj;

  Graph(int V){
    this.V = V;
    adj = new LinkedList[V];
    for(int i=0; i<V; i++)
      adj[i] = new LinkedList<Integer>();
  }

  void addEdge(int v, int w){
    adj[v].add(w);
  }

  void dfs(int v){
    boolean[] visited = new boolean[V];
    for(int i=0; i<v; i++)
      visited[i]=false;

    dfsUtil(v,visited);
  }

  void dfsUtil(int v, boolean[] visited){
    visited[v] = true;
    System.out.print(v+" ");
    Iterator<Integer> iterator = adj[v].iterator();
    while(iterator.hasNext()){
      int i = iterator.next();
      if(!visited[i])
        dfsUtil(i,visited);
    }
  }
}

class graphdfs{
  public static void main(String[] args) {
    Graph g = new Graph(4);

    g.addEdge(0,2);
    g.addEdge(1,2);
    g.addEdge(2,3);

    g.dfs(0);
  }
}
