static int n;

public static printMat(int[][] sol)
{
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      Systen.out.print(sol[i][j]+"");
    }
    System.out.println();
  }
}

public static boolean solveMaze(int maze[][]) 
{
  int[][] sol = new int[n][n];
  
  if(solveRec(maze, 0,0, sol) == false)
    return false;
  else
  {
    printMat(sol);
    return true;
  }
}

public static boolen solveRec(int[][] maze, int i, int j, int[][] sol)
{
  if( i == n-1 && j== n-1)
  {
    sol[i][j] = 1;
    return true;
  }
  
  if( isSafe(i,j, maze))
  {
    sol[i][j] = 1;
    
    if(solveRec(maze, i+1, j, sol) == true) return true;
    else if(solveRec(maze,i,j+1,sol) == true) return true;
    sol[i][j]=0;
  }
  return false;
}

public static boolean isSafe(int i, int j, int[][] maze)
{
  return (i<n && j<n && maze[i][j] ==1);
}
