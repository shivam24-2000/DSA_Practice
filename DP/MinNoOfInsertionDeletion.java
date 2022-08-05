class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    // Your code goes here
	    
	    int[][] dp = new int[str1.length()+1][str2.length()+1];
	    
	    for(int i=0;i<=str1.length();i++)
	    {
	        for(int j=0;j<=str2.length();j++)
	        {
	            if( i == 0 || j ==0) dp[i][j] = 0;
	        }
	    }
	    
	    for(int i=1;i<=str1.length();i++)
	    {
	        for(int j=1; j<=str2.length();j++)
	        {
	            if(str1.charAt(i-1) == str2.charAt(j-1))
	            {
	                dp[i][j] = 1+ dp[i-1][j-1];
	            }
	            else
	            {
	                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
	            }
	        }
	    }
	    return ((str1.length() - dp[str1.length()][str2.length()]) + (str2.length() - dp[str1.length()][str2.length()]) );
	} 
}