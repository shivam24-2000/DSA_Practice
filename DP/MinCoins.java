class Solution{

	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	    int[][] dp = new int[M+1][V+1];
	    
	    for(int i=0;i<=M;i++)
	    {
	        for(int j=0;j<=V;j++)
	        {
	           // if( i == 0 && j == 0) dp[i][j] = Integer.MAX_VALUE -1;
	            if( i == 0) dp[i][j] = Integer.MAX_VALUE -1;
	            else if( j == 0) dp[i][j] = 0;
	        }
	    }
	    for(int j = 1; j<=V;j++)
	    {
	        if( j % coins[0] == 0) dp[1][j] = j/coins[0];
	        else dp[1][j] = Integer.MAX_VALUE -1;
	    }
	    
	    for(int i=2;i<=M;i++)
	    {
	        for(int j =1;j<=V;j++)
	        {
	            if(coins[i-1] > j)
	            {
	                dp[i][j] = dp[i-1][j];
	            }else
	            {
	                dp[i][j] = Math.min( 1+ dp[i][j-coins[i-1]], dp[i-1][j]);
	            }
	            
	        }
	    }
	    if(dp[M][V]==2147483646){
                           return -1;
                       }
	    return dp[M][V];
	} 
}