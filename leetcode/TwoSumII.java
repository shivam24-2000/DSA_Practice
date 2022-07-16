class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int n = nums.length;
        int low = 0, high= n-1;
        
        while( low < high)
        {
            if(nums[low] + nums[high] == target) 
            {
                res[0] = low+1;
                res[1] = high+1;
            }
            if(nums[low] + nums[high] > target) high--;
            else low++;
        }
        return res;
    }
}
