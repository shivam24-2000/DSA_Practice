class Solution {
    public void moveZeroes(int[] nums) {
       Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 0) st.add(nums[i]);
            else q.add(nums[i]);
        }
        int index=0;
        while(!q.isEmpty ())
        {
            nums[index++] = q.poll();
        }
      while(!st.isEmpty())
      {
        nums[index++] = st.pop();
      }


    }
}
