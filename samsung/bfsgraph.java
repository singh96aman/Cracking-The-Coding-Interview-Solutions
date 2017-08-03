import java.util.*;

class Graph{
  int V;
  LinkedList<Integer>[] adj;

  Graph(int V){
    this.V = V;
    adj = new LinkedList[V];
    for(int i=0; i<V; i++)
      adj[i]=new LinkedList<Integer>();
  }

  void addEdge(int v, int w){
    adj[v].add(w);
  }

  void bfs(int s){
    boolean[] visited = new boolean[V];
    LinkedList<Integer> queue = new LinkedList<Integer>();
    visited[s] = true;
    queue.add(s);

    while(queue.size()!=0){
      s=queue.poll();
      System.out.println(s+" ");
      Iterator<Integer> i = adj[s].listIterator();
      while(i.hasNext()){
        int n = i.next();
        if(!visited[n])
        {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }
}

class bfsgraph{
  public static void main(String[] args) {
    Graph g = new Graph(4);
    g.addEdge(0,1);
    g.addEdge(0,2);
    g.addEdge(2,0);
    g.addEdge(2,3);
    //g.addEdge(3,3);
    g.bfs(0);
  }
}
