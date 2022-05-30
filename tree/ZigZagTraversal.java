ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> res = new ArrayList<>(0);
	    //Add your code here.
	    if (root == null) 
            return res; 
        Stack<Node> s1 = new Stack<Node>();  
        Stack<Node> s2 = new Stack<Node>();  
   
        s1.add(root); 
  
        while (!s1.isEmpty() || !s2.isEmpty()) { 
            while (!s1.isEmpty()) { 
                Node temp = s1.peek(); 
                s1.pop(); 
                res.add(temp.data); 
 
                if (temp.left != null) 
                    s2.add(temp.left); 
                if (temp.right != null) 
                    s2.add(temp.right); 
            } 
  
            while (!s2.isEmpty()) { 
                Node temp = s2.peek(); 
                s2.pop(); 
                res.add(temp.data); 
  
                if (temp.right != null) 
                    s1.add(temp.right); 
                if (temp.left != null) 
                    s1.add(temp.left); 
            } 
        }
	    return res;
	}
