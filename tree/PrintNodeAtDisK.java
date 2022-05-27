void printkDist(Node root, int k)
{
  if( root == null) return;
  if( k==0) System.out.println(root.key+" ");
  else
  {
    printKDist(root.left, k-1);
    printKDist(root.right, k-1);
  }
}
