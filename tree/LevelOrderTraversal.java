// level Order Traversal

static ArrayList <Integer> levelOrder(Node root) 
{
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        
        if( root == null) return res;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while( !q.isEmpty() )
        {
            root = q.peek();
            res.add(root.data);
            q.poll();
            
            if( root.left != null )
            {
                q.add(root.left);
            }
            if( root.right != null )
            {
                q.add(root.right);
            }
            
        }
        return res;
       
}

// level Order Traversal line by line
public static void printLevel(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            Node curr=q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
}   
