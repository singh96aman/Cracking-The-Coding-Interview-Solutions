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
    adj[w].add(v);
  }
  int longestCable(){
    int max_len = Integer.MIN_VAL;
    for(int i=0; i<V; i++){
      boolean[] visited = new boolean[V];
      max_len=DFS(i,0,max_len,visited);
    }
    return max_len;
  }
  int DFS(int src, int prev_len, int max_len, boolean[] visited){
    visited[src]=true;
    int curr_len=0;

  }
}
/*
Input : n = 6
        1 2 3  // Cable length from 1 to 2 (or 2 to 1) is 3
        2 3 4
        2 6 2
        6 4 6
        6 5 5
Output: maximum length of cable = 12
*/
