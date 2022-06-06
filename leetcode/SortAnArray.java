class Solution {
    public int[] sortArray(int[] nums) {
        
        int[] res = new int[nums.length];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            res[i] = pq.poll();
        }
        return res;
    }
}
