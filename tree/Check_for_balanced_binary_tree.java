class Tree
{
    int Balanced(Node root)
    {
        if( root == null) return 0;
	    int lh = Balanced(root.left);
	    if(lh == -1) return -1;
	    
	    int rh = Balanced(root.right);
	    if(rh == -1) return -1;
	    
	    if( Math.abs(lh - rh) > 1 ) return -1;
	    else return Math.max(lh, rh) + 1;
    }
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	    int a = Balanced(root);
	    if( a == -1 ) return false;
	    else return true;
	    
    }
}

