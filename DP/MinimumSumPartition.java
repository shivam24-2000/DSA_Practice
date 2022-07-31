class Solution
{

    public int subSetDiff(int[] arr, int n, int sum, int[][] dp)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if( arr[i-1] > j)
                {
                    dp[i][j] = dp[i-1][j];
                }else
                {
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i-1][j-arr[i-1]]);
                }
            }
        }
        return dp[n][sum];
    }
	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int sum = 0;
	    
	    for(int i=0;i<n;i++) sum+= arr[i];
	    
	    int k = sum/2;
	    
	    int[][] dp = new int[n+1][k+1];
	    
	    for(int i=0;i<=n;i++) for(int j=0;j<=k;j++) dp[i][j] = -1;
	    
	    for(int i=0;i<=k;i++) dp[0][i] = 0;
	   for(int i=0;i<=n;i++) dp[i][0] = 1;
       
	    subSetDiff(arr, n, k,dp);
	    
	    for(int i=k;i>=0;i--)
	    {
	        if( dp[n][i] >=1)
	        {
	            return sum-i-i;
	        }
	    }
	    return 0;
	} 
}