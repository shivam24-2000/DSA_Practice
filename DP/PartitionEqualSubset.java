class Solution{
    static int subSetRec(int n, int[] arr, int sum, int[][] dp)
    {
        if(dp[n][sum] != -1) return dp[n][sum];
        
        if( sum == 0) return 1;
        
        if( arr[n-1] > sum) return dp[n][sum] = subSetRec(n-1, arr, sum, dp);
        else return dp[n][sum] = Math.max(subSetRec(n-1, arr, sum - arr[n-1], dp), subSetRec(n-1, arr, sum, dp));
    }
    static int subSet(int N, int[] arr, int sum)
    {
        int[][] dp = new int[N+1][sum+1];
        
        for(int i=0;i<=N;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                dp[i][j] = -1;
            }
        }
        for(int i=0;i<=N;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if( i == 0) dp[i][j] = 0;
                if( j == 0) dp[i][j] = 1;
            }
        }
        return subSetRec(N, arr, sum, dp);
    }
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum =0;
        
        for(int i=0;i<N;i++) sum += arr[i];
        
        if( sum %2 != 0) return 0;
        else return subSet(N, arr, sum/2);
    }
}