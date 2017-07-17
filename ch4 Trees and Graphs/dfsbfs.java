import java.io.*;
import java.util.*;

class dfsbfs
{
  private int v;
  private LinkedList<Integer> adj[];

  dfsbfs(int v)
  {
    this.v =v;
    adj = new LinkedList[v];
    for(int i=0; i<v; i++)
      adj[i] = new LinkedList();
  }

  void addEdge(int v, int w)
  {
    adj[v].add(w);
  }

  void DFSUtil(int v, boolean[] visited)
  {
    visited[v]=true;
    System.out.print(adj[v]+" ");
    Iterator<Integer> i = adj[v].listIterator();
    while(i.hasNext())
    {
      int n = i.next();
      if(!visited[n])
        DFSUtil(n, visited);
    }
  }

  void DFS(int V)
  {
      boolean visited[] = new boolean[v];
      DFSUtil(V, visited);
  }

  void bfs(int s)
  {
    boolean visited[] = new boolean[v];
    LinkedList<Integer> queue = new LinkedList<Integer>();
    visited[s] = true;
    queue.add(s);

    while(queue.size() !=0){
      s = queue.poll();
      System.out.print(s+" ");
      Iterator<Integer> i = adj[s].listIterator();
      while(i.hasNext())
      {
        int n = i.next();
        if(!visited[n])
        {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }

  public static void main(String[] args) {

    dfsbfs g = new dfsbfs(4);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    g.DFS(2);
    System.out.println();
    g.bfs(2);

  }

}
