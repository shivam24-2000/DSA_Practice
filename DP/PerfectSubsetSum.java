class Solution{
    public int SubSetC(int[] arr, int n, int sum, int[][] dp)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j = 0;j<=sum;j++)
            {
                if( arr[i-1] > j)
                {
                    dp[i][j] = dp[i-1][j]%1000000007;
                }
                else
                {
                    dp[i][j] = dp[i-1][j]%1000000007 + dp[i-1][j- arr[i-1]]%1000000007;
                }
            }
        }
        return (dp[n][sum]%1000000007);
    }

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	    int[][] dp = new int[n+1][sum+1];
	    
	    for(int i=0;i<=n;i++)
	    {
	        for(int j=0;j<=sum;j++)
	        {
	            dp[i][j] = -1;
	        }
	    }
	    
	    for(int i=0;i<=n;i++)
	    {
	        for(int j=0;j<=sum;j++)
	        {
	            if( i == 0) dp[i][j] = 0;
	            if( j == 0) dp[i][j] = 1;
	        }
	        
	    }
	    
	    return SubSetC(arr, n, sum, dp);
	} 
}