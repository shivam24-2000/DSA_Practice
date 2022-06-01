public class Solution
{
    int prev = Integer.MIN_VALUE;
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        // code here.
        if(root == null ) return true;
        
        if( isBST(root.left) == false ) return false;
        if( root.data <= prev) return false;
        prev = root.data;
        return isBST(root.right);
    }
}
