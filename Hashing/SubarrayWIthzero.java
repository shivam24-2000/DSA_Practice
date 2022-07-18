int maxLen(int arr[], int n)
{
  Map<Integer, Integer> hm = new HahsMap<>();
  int sum = 0;
  int max  = -1;
  hm.put(0,-1);
  
  for(int i=0;i<n;i++)
  {
    sum += arr[i];
    
    if( !hm.containsKey(sum)) hm.put(sum, i);
    else max = Math.max(max, i - hm.get(sum) ):
  }
  return max;
}
