// recursive method
static int lcs(int x, int y, String s1, String s2)
{
    if( x == 0 || y == 0) return 0;

    if( s1.charAt(x-1) == s2.charAt(y-1)) return 1+ lcs(x-1, y-1, s1, s2);
    else return Math.max(lcs(x, y-1, s1, s2), lcs(x-1, y, s1, s2))
}

// dp method
static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int[][] dp = new int[x+1][y+1];
        
        for(int i=0;i<=x;i++ ) for(int j=0;j<=y;j++) if( i == 0 || j == 0) dp[i][j] = 0;
        for(int i=1; i<=x; i++)
            {
                for(int j=1; j<=y; j++)
                {
                    if(s1.charAt(i-1)==s2.charAt(j-1))
                        dp[i][j] = 1 + dp[i-1][j-1];
                    else
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        return dp[x][y];
        
    }