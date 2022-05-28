class Solution {
    public int missingNumber(int[] nums) {
        
        Set<Integer> hs = new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
             hs.add(nums[i]);
        }
        
        for(int i=0;i<nums.length+1;i++)
        {
            if(!hs.contains(i)) return i;
        }
       
        return 0;
    }
}
