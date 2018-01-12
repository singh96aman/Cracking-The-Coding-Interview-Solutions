import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Graph{
    int V;
    LinkedList<Integer> adj[];
    Graph(int V){
        this.V=V;
        adj = new LinkedList[V];
        for(int i=0; i<V; i++)
           adj[i] = new LinkedList<Integer>();
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void BFS(int v)
    {
        boolean[] visited = new boolean[V];
        int[] cost = new int[V];
        BFSUtil(visited,v,cost);
        for(int i=0; i<V; i++)
        {
          if(!visited[i] && v!=i)
            cost[i]=-1;
        }
        for(int i=0; i<V; i++)
            if(i!=v)
                System.out.print(cost[i]+" ");
    }

  void BFSUtil(boolean[] visited, int v, int[] cost){
    if(!visited[v]){
        int[] queue = new int[V];
        int f=-1, r=-1;
        queue[++r] = v;
        while(f!=r)
        {
            int i = queue[++f];
            visited[i] = true;
            //System.out.println(i+1);
            Iterator<Integer> iterator = adj[i].listIterator();
            if(iterator.hasNext())
            {
              while(iterator.hasNext())
              {
                  int n = iterator.next();
                  if(!visited[n])
                  {
                      cost[n]+=cost[i]+6;
                      queue[++r]=n;
                  }
              }
            }
        }
    }
  }

}

public class BFSshortest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            Graph g = new Graph(n);
            for(int a1 = 0; a1 < m; a1++){
                int u = in.nextInt()-1;
                int v = in.nextInt()-1;
                g.addEdge(u,v);
            }
            int s = in.nextInt()-1;
            g.BFS(s);
            System.out.println();
        }
        in.close();
    }
}
