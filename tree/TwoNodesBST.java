Node first, middle, last, prev;
    
    void convertUtil(Node root)
    {
        if( root != null)
        {
            convertUtil(root.left);
            
            if(prev != null && prev.data > root.data)
            {
                if( first == null)
                {
                    first = prev;
                    middle = root;
                }
                else last = root;
            }
            prev = root;
            
            convertUtil(root.right);
        }
    }
   
    //Function to fix a given BST where two nodes are swapped.  
    public Node correctBST(Node root)
    {
        //code here.
        first = middle = last = prev = null;
        
        convertUtil(root);
        
        if(first != null && last != null)
        {
            int temp = first.data;
            first.data = last.data;
            last.data = temp;
        }
        
        else if(first != null && middle != null)
        {
            int temp = first.data;
            first.data = middle.data;
            middle.data = temp;
        }
        return root;
    }
