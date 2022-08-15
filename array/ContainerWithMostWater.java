class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int max = Integer.MIN_VALUE;
        
        int l=0, h = n-1;
        
        while( l < h)
        {
            int water = (h-l)*Math.min(height[l], height[h]);
            max = Math.max(max, water);
            
            if(height[h] > height[l]) l++;
            else h--;
        }
        return max;
        
    }
}