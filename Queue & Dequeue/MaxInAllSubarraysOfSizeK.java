
void printMax( int arr[], in k)
{
  int n = arr.length;
  
  Deque<Integer> dq = new ArrayDeque<>();
  
  for(int i=0;i<k;i++)
  {
    while( !dq.isEmpty() && arr[i] <= arr[dq.peekLast()] )
      dq.removeLast();
    
    dq.addLast(i);
  }
  for(int i=k; i<n; i++)
  {
    System.out.println(arr[dq.peek()] +" ");
    
    while( !dq.isEmpty() && dq.peek() <= i-k)
      dq.removeLast(i);
    
    while( !dq.isEmpty() && arr[i] <= arr[dq.peekLast()] )
      dq.removeLast(i);
    
    dq.addLast(i);
    
  }
  System.out.println(arr[dq.peek()]);
  
}
