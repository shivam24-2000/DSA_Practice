public int maximizeCuts(int l, int p, int q, int r)
    {
       //Your code here
      int[] dp = new int[n+1];
        dp[0] = 0;
       for(int i=1;i<=n;i++)
       {
          dp[i] = -1;
           
           if( i-x >=0) dp[i] = Math.max(dp[i], dp[i-x]);
           if( i-y >=0) dp[i] = Math.max(dp[i], dp[i-y]);
           if( i-z >=0) dp[i] = Math.max(dp[i], dp[i-z]);
           
           if( dp[i]  != -1) dp[i]++;
       }
       if(dp[n] == -1) dp[n] = 0;
       return dp[n];
    }
