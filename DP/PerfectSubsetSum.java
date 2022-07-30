class Solution{
    public int SubSet(int n, int[] arr, int sum, int[][] dp)
    {
        if(dp[n][sum] != -1) return dp[n][sum];
        
        if( sum == 0) return dp[n][sum] = 1;
        
        if( arr[n-1] > sum) return dp[n][sum] = SubSet(n-1, arr, sum, dp);
        else return dp[n][sum] = (SubSet(n-1, arr, sum - arr[n-1], dp) + SubSet(n-1, arr, sum, dp));
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
	    
	    return SubSet(n, arr, sum, dp);
	} 
}