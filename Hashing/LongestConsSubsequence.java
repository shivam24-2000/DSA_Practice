
static int findLongestConseqSubseq(int arr[], int n)
{
  Set<Integer> hs = new HashSet<>();
  
  for(int i=0;i<n;i++)
  {
    hs.add(arr[i]);
  }
  int res = 0;
  
  for(int i=0;i<n;i++)
  {
    if( !hs.contains(arr[i] -1)
       {
         int curr = 1;
         while( hs.contains( arr[i] + curr)
               curr++;
         res = Math.max(res, curr);
       }
    
  }
  return res;
}
