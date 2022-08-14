class Solution {
    
    int result;
    
    public int maxPathSum(TreeNode root) {
        
        result=Integer.MIN_VALUE;
        
        helper(root);
        
        return result;

    }
    
    public int helper(TreeNode root) {
        
        if(root==null) return 0;
        
        int left=helper(root.left);
        int right=helper(root.right);
        
        int case1=Math.max(Math.max(left,right)+root.val,root.val);
        
        int case1and2=Math.max(case1, left+right+root.val);
        
        result=Math.max(result,case1and2);
        
        return case1;
        
    }
    
}