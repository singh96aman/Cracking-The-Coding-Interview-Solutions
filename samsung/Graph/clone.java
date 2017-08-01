import java.util.*;
class Graph{
  int V;
  LinkedList<Integer>[] adj;
  Graph(int v){
    V=v;
    adj = new LinkedList[V];
    for(int i=0; i<v; i++)
      adj[i] = new LinkedList<Integer>();
  }
  void addEdge(int v, int w){
    adj[v].add(w);
  }

  void bfs(int v){
    LinkedList<Integer> Queue = new LinkedList<Integer>();
    boolean[] visited = new boolean[V];
    visited[v]=true;
    Queue.add(v);

    while(Queue.size()!=0){
      int i=Queue.poll();
      System.out.print(i+" ");
      Iterator<Integer> iterator = adj[i].listIterator();
      while(iterator.hasNext()){
        int n = iterator.next();
        if(!visited[n]){
          Queue.add(n);
          visited[n]=true;
        }
      }
    }
  }

  Graph clone(int v){
    LinkedList<Integer> Queue = new LinkedList<Integer>();
    boolean[] visited = new boolean[V];
    Graph h = new Graph(V);
    visited[v]=true;
    Queue.add(v);

    while(Queue.size()!=0){
      int i=Queue.poll();
      int firstvertex=i;
      Iterator<Integer> iterator = adj[i].listIterator();
      while(iterator.hasNext()){
        int n = iterator.next();
        if(!visited[n]){
          Queue.add(n);
          visited[n]=true;
          int secondvertex=n;
          h.addEdge(firstvertex,secondvertex);
        }
      }
    }
    return h;
  }
}

class clone{
  public static void main(String[] args) {
    Graph g = new Graph(6);
    g.addEdge(0,1);
    g.addEdge(0,3);
    g.addEdge(1,4);
    g.addEdge(1,2);
    g.addEdge(2,5);
    g.addEdge(5,0);
    g.bfs(0);
    System.out.println();
    Graph h = g.clone(0);
    h.bfs(0);
  }
}
/*
Also, Minimum number of edges between two vertices of a Graph DO BFS !
*/
