class Solution {
    static int canReach(int[] A, int N) {
        // code here
        int reach = 0;
        
        for(int i=0;i<N;i++)
        {
            if( reach < i) return 0;
            
            else
            {
                reach = Math.max(reach, i + A[i]);
               
                
            }
        }
        return 1;
    }
};