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
// created by @ak-grg
class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int res=0;
        for(int i=0;i<nums.size();i++){
            res = res ^ nums[i];
        }
        for(int i=0;i<=nums.size();i++){
            res = res ^ i;
        }
        return res;
    }
};
