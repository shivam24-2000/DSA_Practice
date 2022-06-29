int board[N][N];

boolean solve()
{
  if(solveRec(0) == false)
    return false;
  else
    printBoard(board); return true;
}

boolean solveRec(int col)
{
  if( col == N) return true;
  
  for(int i=0;i<N;i++)
  {
    if(isSafe(i, col)
       {
         board[i][col] = 1;
         solveRec(col+1);
         board[i][col] = 0;
       }
  }
       return false;
}

boolean isSafe(int row, int col)
       {
         int i,j;
         
         for(i=0;i<col;i++)
           if( board[row][i] == 1) return false;
         
         for(i=row,j=col; i>=0 && j>=0; i--;j--)
           if(board[i][j] == 1) return false;
         
         for(i=row,j=col;i<N&& j>=0;i++,j--)
           if(board[i][j] == 1) return false;
         
         return true;
       }
void printBoard(int[][] board)
       {
         for(int i=0;i<board.length;i++)
         {
           for(int j=0;j<board[0].length;j++)
             System.out.print(board[i][j]);
         }
         System.out.println();
       }
