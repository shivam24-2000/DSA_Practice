class Solution {
    public TreeNode BST(int[] nums, int l, int h)
    {
        if( l > h) return null;
        int mid = (l+h)/2;
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = BST(nums, l, mid-1);
        root.right = BST(nums, mid+1, h);
        
        return root;
        
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
        int l = 0, h = nums.length -1;
        
        return BST(nums, l, h);
        
        
    }
}