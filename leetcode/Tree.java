class Solution {
  public boolean check(TreeNode p, TreeNode q)
  {
    if( p == null || q == null) return p==q;
    return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
  }
    public boolean isSymmetric(TreeNode root) {
      if(root == null) return true;
      return check(root.left, root.right);
        
    }
}
