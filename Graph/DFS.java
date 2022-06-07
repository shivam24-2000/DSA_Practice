void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited)
{
  visited[s] = true;
  System.out.print(s);
  
  for( int v : adj.get(s))
  {
    if( visited[v] == false)
      DFS(adj, v, visited);
  }
}

void DFS(ArrayList<ArrayList<Integer>> adj, int v)
{
  boolean[] visited = new boolean[v];
  
  for(int i=0;i<v;i++)
  {
    if( visited[i] == false)
      DFSRec(adj, i, visited);
  }
}
