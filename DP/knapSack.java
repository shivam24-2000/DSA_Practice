// recursive method
static int knapSack(int W, int wt[], int val[], int n) 
{ 
         // your code here 
         if( n == 0 || W == 0) return 0;
         
         if( wt[n-1] > W) return knapSack(W, wt, val, n-1);
         
         return Math.max(val[n-1] + knapSack(W-wt[n-1], wt, val, n-1), knapSack(W, wt, val, n-1));
} 

// Dp method
static int KnapSackR(int W, int[] wt, int[] val, int n, int[][] dp)
    {
        if( n == 0 || W == 0) return 0;
        
        if( dp[n][W] != -1) return dp[n][W];
        
        if( wt[n-1] > W)
        {
            return dp[n][W] = KnapSackR(W, wt, val, n-1, dp);
        }
        else
        {
            return dp[n][W] = Math.max(val[n-1] + KnapSackR(W- wt[n-1], wt, val, n-1, dp), KnapSackR( W, wt, val, n-1, dp) );
        }
    }
static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int[][] dp = new int[n+1][W+1];
         
         for(int i=0;i<=n;i++)
         {
             for(int j=0;j<=W;j++)
             {
                 dp[i][j] = -1;
             }
         }
         
         return KnapSackR(W, wt, val, n, dp);
    } 