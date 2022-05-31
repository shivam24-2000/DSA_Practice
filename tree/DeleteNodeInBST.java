class Tree {
    public static Node getSucc(Node root)
    {
        Node curr = root.right;
        
        while(curr != null && curr.left != null)
        {
            curr = curr.left;
        }
        return curr;
    }
    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int X) {
        // code here.
        
        if(root == null) return null;
        
        if( root.data < X) root.right = deleteNode(root.right, X);
        else if ( root.data > X) root.left = deleteNode(root.left, X);
        else
        {
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else
            {
                Node suc = getSucc(root);
                root.data = suc.data;
                root.right = deleteNode(root.right, suc.data);
            }
        }
        return root;
    }
}
