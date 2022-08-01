class Solution{
    
    public int cutRod(int price[], int N) {
        //code here
        int[][] dp = new int[N+1][N+1];
        
        for(int i=0;i<=N;i++)
        {
            for(int j=0;j<=N;j++)
            {
                dp[i][j] = -1;
            }
        }
        
        for(int i=0;i<=N;i++)
        {
            for(int j=0;j<=N;j++)
            {
                if(i == 0) dp[i][j] = 0;
                if(j == 0) dp[i][j] = 0;
            }
        }
        
        for(int i=1;i<=N;i++)
        {
            for(int j=0;j<=N;j++)
            {
                if( i > j)
                {
                    dp[i][j] = dp[i-1][j];
                }
                else
                {
                    dp[i][j] = Math.max(price[i-1] + dp[i][j-i], dp[i-1][j]);
                }
            }
        }
        return dp[N][N];
    }
}