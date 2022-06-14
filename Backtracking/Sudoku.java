static boolean isSafe( int grid[][],int i, int j, int n)
    {
        for(int k=0;k<9;k++)
        {
            if(grid[i][k] == n || grid[k][j]==n) return false;
        }
        
        // int s = (int)Math.sqrt(9);
        int rs = i-i%3;
        int cs = j-j%3;
        
        for(int k=0;k<3;k++)
        {
            for(int M=0;M<3;M++)
            {
                if(grid[k+rs][M+cs] == n) return false;
            }
        }
        return true;
    }
    static boolean SolveSudoku(int board[][])
    {
        // add your code here
        
        int n = 9;
        int row = 0;
        int col = 0;
        boolean isEmpty = true;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (board[i][j] == 0) 
                {
                    row = i;
                    col = j;

                    // We still have some remaining
                    // missing values in Sudoku
                    isEmpty = false;
                    break;
                }
            }
        }

        // No empty space left
        if (isEmpty) 
        {
            return true;
        }

        // Else for each-row backtrack
        for (int num = 1; num <= n; num++) 
        {
            if (isSafe(board, row, col, num)) 
            {
                board[row][col] = num;
                if (SolveSudoku(board)) 
                {
                    // print(board, n);
                    return true;
                }
                else 
                {
                    // replace it
                    board[row][col] = 0;
                }
            }
        }
        return false;
    
    }
