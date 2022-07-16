class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> hm = new HashMap<>();
        
        int n = nums.length;
        int[] res  = new int[2];
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(target-nums[i], i);
            }
            else
            {
                res[0] = hm.get(nums[i]);
                res[1] = i;
            }
        }
        return res;
    }
}
