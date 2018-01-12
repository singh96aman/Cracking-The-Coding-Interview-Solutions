// Use Adjlist and not AdjMatrix for large graph
import java.io.*;
import java.util.*;

public class journeytomoon {

    static void DFSUtil(int[][] adj, boolean[] visited, int i, int N, int[] arr, int counter)
    {
        visited[i]=true;
        //System.out.println(i);
        arr[i]=counter;
        for(int j=0; j<N; j++)
        {
            if(!visited[j] && adj[i][j]==1)
                DFSUtil(adj,visited,j,N,arr,counter);
        }
    }

    static void DFS(int[][] adj,int N)
    {
        boolean[] visited = new boolean[N];
        int[] arr = new int[N];
        int counter=1;
        for(int i=0; i<N; i++)
        {
            if(!visited[i])
            {
                DFSUtil(adj,visited,i,N,arr,counter);
                counter++;
                //System.out.println();
            }
        }
        long count=0;
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
            {
                if(i!=j && arr[i]!=arr[j])
                    count++;
            }
        System.out.println(count/2);
        //for(int i=0; i<N; i++)
        //System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int P = in.nextInt();
        int[][] adj = new int[N][N];
        for(int i=0; i<N; i++)
            adj[i] = new int[N];
        for(int i=0; i<P; i++)
        {
            int t1 = in.nextInt();
            int t2 = in.nextInt();
            adj[t1][t2] = 1;
            adj[t2][t1] = 1;
        }
        DFS(adj,N);
    }
}
