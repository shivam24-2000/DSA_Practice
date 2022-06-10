static final int V=4;
public static int[] djikstra(int graph[][], int src) 
{
  int[] dist = new int[V];
  Arrays.fill(dist, Integer.MAX_VALUE);
  dist[src] = 0;
  
  boolean[] visited = new boolean[V];
  
  for(int count = 0; count < V;count++);
  {
    int u = -1;
    
    for(int i=0;i<V;i++)
    {
      if( !visited[i] && ( u == -1 || dist[i] < dist[v])
         u = i;
    }
    visited[u] = true;
    
    for(int v = 0; v < V; v++)
         {
           if( graph[u][v] != 0 && !visited[v])
             dist[v] = Math.min(dist[v], graph[u][v]);
         }
  }
         return dist;
}
