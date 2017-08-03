import java.util.*;
class Graph{
  int V;
  LinkedList<Integer>[] adj;

  Graph(int v){
    V=v;
    adj = new LinkedList[v];
    for(int i=0; i<v; i++)
      adj[i] = new LinkedList<Integer>();
  }

  void addEdge(int v, int w){
    adj[v].add(w);
  }

  void printAll(int src, int dest){
    boolean[] visited = new boolean[V];
    ArrayList<Integer> path = new ArrayList<Integer>();
    printAllUtil(src,dest,visited,path);
  }

  void printAllUtil(int src, int dest, boolean[] visited, ArrayList<Integer> path){

    visited[src]=true;
    path.add(src);

    if(src==dest)
      System.out.println(path);

    Iterator<Integer> iterator = adj[src].iterator();
    while(iterator.hasNext()){
      int n = iterator.next();
      if(!visited[n])
        printAllUtil(n,dest,visited,path);
    }
    visited[src]=false;
  }
}

class printAllPaths{
  public static void main(String[] args) {
    Graph g = new Graph(6);
    g.addEdge(0,1);
    g.addEdge(0,3);
    g.addEdge(1,4);
    g.addEdge(1,2);
    g.addEdge(2,5);
    g.addEdge(5,0);
    g.printAll(0,5);
  }
}
