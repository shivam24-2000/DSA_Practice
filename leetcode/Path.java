// recursive
static int numberOfPaths(int m, int n)

    {
        // If either given row number is first or
        // given column number is first
        if (m == 1 || n == 1)
            return 1;
 
        // If diagonal movements are allowed then
        // the last addition is required.
        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
        // + numberOfPaths(m-1, n-1);
    }


class Solution {
    
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        for(int i=0;i<dp[0].length;i++)
        {
            dp[0][i] = 1;
        }
        for(int i=0;i<dp.length;i++) dp[i][0] = 1;
        
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
