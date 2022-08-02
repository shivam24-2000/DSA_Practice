class Solution {
    public long count(int S[], int m, int n) {
        // code here.
        
        long [][] dp = new long[m+1][n+1];
        
        for(int i=0;i<=m;i++) 
        {
            for(int j=0;j<=n;j++)
            {
                dp[i][j] = -1;
            }
        }
        
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if( i == 0 && j == 0) dp[i][j] = 1;
                else if( i == 0) dp[i][j] = 0;
                else if( j == 0) dp[i][j] = 1;
            }
        }
        
        for(int i=1;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(S[i-1] > j)
                {
                    dp[i][j] = dp[i-1][j];
                }
                else
                {
                    dp[i][j] = dp[i-1][j] + dp[i][j-S[i-1]];
                }
            }
        }
        return dp[m][n];
    }
}