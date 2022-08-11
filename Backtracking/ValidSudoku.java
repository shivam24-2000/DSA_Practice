class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> hs = new HashSet<>();
        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j] != '.')
                {
                    if( hs.contains(board[i][j] + "present in" + i +"row") || hs.contains(board[i][j] + "present in" + j + "col") || hs.contains(board[i][j] + "present in" + ((i/3)*3 + (j/3)) + "box")) return false;
                    else 
                    {
                        hs.add(board[i][j]+ "present in" + i + "row");
                        hs.add(board[i][j]+ "present in" + j + "col");
                        hs.add(board[i][j]+ "present in" + ((i/3)*3 + (j/3)) + "box");
                        
                    }
                }
            }
        }
        return true;
    }
}