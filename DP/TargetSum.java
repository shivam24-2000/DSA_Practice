class Solution {
    static  int SubSetRec(int[] nums, int n, int sum, int[][] dp)
    {
       for(int i=1;i<=n;i++)
       {
           for(int j=0;j<=sum;j++)
           {
               if( nums[i-1] > j)
               {
                   dp[i][j] = dp[i-1][j];
               }
               else
               {
                   dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
               }
           }
       }
       return dp[n][sum];
    }
    static int SubSetC(int[] nums, int n, int sum )
    {
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
                if( j == 0) dp[i][j]  = 1;
            }
        }
        return SubSetRec(nums, n, sum ,dp);
    }
    static int findTargetSumWays(int[] nums , int N, int target) {
        // code here
        int sum = 0;
        
        int n = nums.length;
        
        for(int i=0;i<n;i++)
        {
            sum += nums[i];
        }
        if(sum-target < 0 || (sum-target)%2==1 ) return 0;
        int diff = (sum + target)/2;
        return SubSetC(nums, n, diff);
    }
};