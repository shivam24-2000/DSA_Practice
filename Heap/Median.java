void printMedian( int arr[])
{
  PriorityQueue<Integer> q = new PriorityQueue<>();
  PriorityQueue<Integer> s = new PriorityQueue<>(Collections.reverseOrder);
  
  s.add(arr[0]);
  System.out.println(arr[0]);
  
  for(int i=1;i<arr.length;i++)
  {
    int x = arr[i];
    
    if( s.size() > q.size() )
    {
      if( s.peek() > x)
      {
        q.add(s.poll());
        s.add(x);
      }
      else
        g.add(x);
      System.out.println((double)( s.peek() + q.peek() ) / 2 ) );
    }
    else
    {
      if( x <= s.peek() )
        s.add(x);
      else
      {
        q.add(x);
        s.push(q.poll()
      }
      System.out.println(s.peek());
        
    }
  }
}
