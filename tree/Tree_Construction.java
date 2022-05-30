int preIndex = 0;

Node cTree(int in[], int pre[], int is, int ie)
{
  if( is > ie) return null;
  
  Node root = new Node( pre[preIndex++]);
  
  int index ;
  
  for(int i=is;i<=ie;i++)
  {
    if( in[i] == root.key)
    {
      index = i;
      break;
    }
  }
  root.left = cTree(in, pre, is, index-1);
  root.right = cTree(in, pre, index+1, ie);
  return root;
}
