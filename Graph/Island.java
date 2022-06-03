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


// if matrix is given
 public void mark_visited(char[][]grid,int r,int c,int x,int y)
   {
       if(x<0 || x>=r || y<0 || y>=c || grid[x][y]!='1')
       return;
       
       grid[x][y]='2';
       
       mark_visited(grid,r,c,x,y-1);
       mark_visited(grid,r,c,x,y+1);
       mark_visited(grid,r,c,x+1,y);
       mark_visited(grid,r,c,x-1,y);
       mark_visited(grid,r,c,x+1,y+1);
        mark_visited(grid,r,c,x+1,y-1);
         mark_visited(grid,r,c,x-1,y+1);
          mark_visited(grid,r,c,x-1,y-1);
       
       
   }
   public int numIslands(char[][] grid) {
       // Code here
       int number=0;
       int rows=grid.length;
       int cols=grid[0].length;
       for(int i=0;i<rows;i++)
       {
           for(int j=0;j<cols;j++)
           {
               if(grid[i][j]=='1')
               {
                   mark_visited(grid,rows,cols,i,j);
                   number+=1;
               }
           }
       }
       return number;
   
   }
