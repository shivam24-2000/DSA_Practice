class Solution {
    int pre_index = 0;
    public TreeNode build(int[] preorder, int[] inorder, int is, int ie)
    {
        if( is > ie) return null;
        TreeNode root = new TreeNode(preorder[pre_index++]);
        
        int index = is;
        
        for(int i=is;i<=ie;i++)
        {
            if(inorder[i] == root.val)
            {
                index = i;
                break;
            }
        }
        root.left = build(preorder, inorder, is, index-1);
        root.right = build(preorder, inorder, index+1, ie);
        
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int is = 0;
        int ie = inorder.length-1;
        
        return build(preorder, inorder, is, ie);
        
    }
}