class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
      
      int n = nums.length;
      
      permute(nums, 0, n-1, ans);
      return ans;
    }
  
  public void permute(int[] nums, int l, int r, List<List<Integer>> ans )
  {
    if( l==r)
    {
      add(nums,ans);
      return;
    }
    
    for(int i=l;i<=r;i++)
    {
    
        swap(nums,i,l);
        permute(nums,l+1,r,ans);
        swap(nums,i,l);
     
    }
  }
  
  public void swap(int[] nums, int i,int l)
  {
    int temp = nums[i];
    nums[i] = nums[l];
    nums[l] = temp;
  }
  public void add(int[] nums, List<List<Integer>> ans)
  {
    List<Integer> res = new ArrayList<>();
    for(int i=0;i<nums.length;i++)
      res.add(nums[i]);
    ans.add(res);
  }
}