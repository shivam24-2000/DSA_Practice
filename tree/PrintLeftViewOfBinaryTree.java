class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      
      ArrayList<Integer> res = new ArrayList<>();
      
      if(root == null) return res;
      Queue<Node> q = new LinkedList<>();
      
      q.add(root);
      while( !q.isEmpty() )
      {
          int count = q.size();
          for(int i=0;i<count ;i++)
          {
              Node curr = q.poll();
              if( i==0) res.add(curr.data);
              
              if( curr.left != null) q.add(curr.left);
              if(curr.right != null) q.add(curr.right);
          }
      }
      return res;
    }
}
