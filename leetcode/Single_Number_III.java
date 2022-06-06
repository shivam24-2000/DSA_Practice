class Solution {
    public int[] singleNumber(int[] nums) {
        
        int n = nums.length;
        
        int[] res = new int[2];
        int index=0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put( nums[i], hm.get(nums[i]) +1);
            }
            else
            {
                hm.put(nums[i], 1);
            }
        }
        
        for(Map.Entry<Integer,Integer> itr : hm.entrySet())
        {
            int value = itr.getValue();
            
            if(value == 1 )
                res[index++] = itr.getKey();
        }
        return res;
    }
}
