import java.util.*;

class Graph{
  int V;
  LinkedList<Integer>[] adj;

  Graph(int v){
      V=v;
      adj = new LinkedList[10];
      for(int i=0; i<v; i++)
        adj[i] = new LinkedList<Integer>();
  }

  void addEdge(int v, int w){
    adj[v].add(w);
  }
}

class simplegraphimplement{
  public static void main(String[] args) {

    Graph g = new Graph(2);
    //g.addEdge(0,2);
    //g.addEdge(1,2);
    //g.addEdge(2,1);

  }
}
