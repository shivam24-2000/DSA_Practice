void BFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited)
{
  Queue<Integer> q = new LinkedList<>();
  
  visited[s] = true;
  
  q.add(s);
  
  while( !q.isEmpty)
  {
    int u = q.poll();
    System.out.print(u);
    
    for(int  v : adj.get(u) )
    {
      if( visited[v] == false)
      {
        visited[v] = true;
        q.add(v);
      }
    }
  }
}

int BFSDis(ArrayList<ArrayList<Integer>> adj, int v)
{
  int count = 0;
  boolean[] visited = new boolean[v];
  for(int i=0;i<v;i++)
  {
    visited[i] = false;
  }
  for(int i=0;i<v;i++)
  { 
    if(visited[i] == false)
    {
      BFS(adj, i, visited));
      count++;
    }
  }
  return count;
}
