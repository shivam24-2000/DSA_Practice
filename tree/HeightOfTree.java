void height(Node root)
{
  if( root == null) return 0;
  else
    return Math.max( (root.left), (root.right) ) +1;
}
