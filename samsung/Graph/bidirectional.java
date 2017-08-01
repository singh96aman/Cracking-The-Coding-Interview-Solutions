import java.util.*;
class Graph{
  int V;
  LinkedList<Integer>[] adj;

  Graph(int v){
    this.V = v;
    adj = new LinkedList[v];
    for(int i=0; i<v; i++)
      adj[i] = new LinkedList<Integer>();
  }

  void addEdge(int v, int w){
    adj[v].add(w);
  }

  void bfs(int v){
    LinkedList<Integer> Queue = new LinkedList<Integer>();
    boolean[] visited = new boolean[V];
    Queue.add(v);
    visited[v]=true;
    while(Queue.size()!=0){
      int i = Queue.poll();
      System.out.print(i+" ");
      Iterator<Integer> iterator = adj[i].iterator();
      while(iterator.hasNext()){
        int n = iterator.next();
        while(!visited[n]) {
          Queue.add(n);
          visited[n]=true;
        }
      }
    }
  }

  boolean bidirectionalsearch(int a, int b){
    LinkedList<Integer> Queuea = new LinkedList<Integer>();
    boolean[] visiteda = new boolean[V];
    LinkedList<Integer> Queueb = new LinkedList<Integer>();
    boolean[] visitedb = new boolean[V];
    Queuea.add(a);
    visiteda[b]=true;
    Queueb.add(b);
    visitedb[b]=true;
    while(Queuea.size()!=0 && Queueb.size()!=0){
      int i = Queuea.poll();
      int j = Queueb.poll();
      if(i==j)
        return true;
      Iterator<Integer> iterator1 = adj[i].iterator();
      while(iterator1.hasNext()){
        int n = iterator1.next();
        if(i==n)
          return true;
        while(!visiteda[n]) {
          Queuea.add(n);
          visiteda[n]=true;
        }
      }
      Iterator<Integer> iterator2 = adj[i].iterator();
      while(iterator2.hasNext()){
        int n = iterator2.next();
        while(!visitedb[n]) {
          Queueb.add(n);
          visitedb[n]=true;
        }
      }
    }
    return false;
  }
}

class bidirectional{
  public static void main(String[] args) {
    Graph g = new Graph(6);
    g.addEdge(0,1);
    g.addEdge(0,3);
    g.addEdge(1,4);
    g.addEdge(1,2);
    g.addEdge(2,5);
    g.addEdge(5,0);
    g.bfs(0);
    System.out.println(g.bidirectionalsearch(0,4));
  }
}
