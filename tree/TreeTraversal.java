// Inorder Traversal
void inOrder(Node root)
{
  while( root != null)
  {
    inOrder(root.left);
    System.out.println(root.data);
    inOrder(root.right);
  }
}

// Preorder Traversal
void preOrder(Node root)
{
   while( root != null)
   {
     System.out.println(root.data);
     preOrder(root.left);
     preOrder(root.right);
   }
}

// Postorder Traversal
void postOrder(Node root)
{
  while( root != null)
   {
     postOrder(root.left);
     postOrder(root.right);
     System.out.println(root.data);
   }
}
