public long minimumNumberOfCoins(int arr[],int n,int value)
    {
        // your code here
        int[] dp = new int[value+1];
        dp[0] = 0;
        for(int i=1;i<=value;i++)
            dp[i] = Integer.MAX_VALUE;
            
        for(int i=1;i<=value;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j] <= i)
                {
                    int sub = dp[i-arr[j]];
                    if( sub != Integer.MAX_VALUE && sub+1<dp[i])
                        dp[i] = sub+1;
                }
            }
        }
        return (dp[value]!=Integer.MAX_VALUE) ? dp[value] : -1;
    }
