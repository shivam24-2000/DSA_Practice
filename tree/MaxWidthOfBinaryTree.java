class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        
        int res = 0;
        
        while( !q.isEmpty() )
        {
            int count = q.size();
            res = Math.max(res, count);
            
            for(int i=0;i<count;i++)
            {
                Node curr = q.poll();
                
                if( curr.left != null) q.add(curr.left);
                if( curr.right != null) q.add(curr.right);
            }
        }
        return res;
    }
}
