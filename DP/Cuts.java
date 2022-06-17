public int maximizeCuts(int l, int p, int q, int r)
    {
       //Your code here
       int dp[] = new int[l + 1];

        // All values with -1
        for (int i = 0; i < l + 1; i++)
            dp[i] = -1;

        // if length of rod is 0
        // then total cuts will
        // be 0 so, initialize
        // the dp[0] with 0
        dp[0] = 0;

        for (int i = 0; i <= l; i++) {

            // if certain length
            // is not possible
            if (dp[i] == -1)
                continue;

            // if a segment of
            // p is possible
            if (i + p <= l)
                dp[i + p] = Math.max(dp[i + p], dp[i] + 1);

            // if a segment of
            // q is possible
            if (i + q <= l)
                dp[i + q] = Math.max(dp[i + q], dp[i] + 1);

            // if a segment of
            // r is possible
            if (i + r <= l)
                dp[i + r] = Math.max(dp[i + r], dp[i] + 1);
        }

        // if no segment can be cut then return 0
        if (dp[l] == -1) {
            dp[l] = 0;
        }
        // return value corresponding
        // to length l
        return dp[l];
    }
