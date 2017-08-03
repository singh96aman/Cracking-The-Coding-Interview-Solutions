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

  void dfsiterative(int v){
    boolean[] visited = new boolean[V];
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(v);
    while(!stack.empty()){
      v=stack.peek();
      stack.pop();
      if(!visited[v])
      {
        System.out.print(v+" ");
        visited[v]=true;
      }
      Iterator<Integer> itr = adj[v].iterator();
      while(itr.hasNext()){
        int s = itr.next();
        if(!visited[s])
          stack.push(s);
      }
    }
  }
}

class dfsiterative{
  public static void main(String[] args) {
    Graph g = new Graph(5);

        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);

        g.dfsiterative(0);
  }
}
