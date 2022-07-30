class Solution{
    
    static int dp[][];
    Solution()
    {
        dp=new int[101][100001];
        // Arrays.fill(dp,-1);
        
        for(int i=1;i<101;i++) for(int j=1;j<100001;j++) dp[i][j]=-1;
    }
    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        init(N, sum);
        
        boolean ans = (recursion(N,sum,arr)==1)? true:false;
        return ans;
    }
    
    static int recursion(int n, int sum, int arr[])
    {
        if(dp[n][sum]!=-1) return dp[n][sum];
        if(n<=0) return 0;
        if(sum==0) return 1;
    
        if(arr[n-1]>sum) 
            return dp[n][sum] = recursion(n-1,sum,arr);
        else
            return dp[n][sum] = Math.max(recursion(n-1,sum-arr[n-1],arr),recursion(n-1,sum,arr));
    }
    
    static void init(int N, int sum)
    {
        for(int j=0;j<=sum;j++) dp[0][j] = 0;
        for(int i=0;i<=N;i++) dp[i][0] = 1;
    }
}