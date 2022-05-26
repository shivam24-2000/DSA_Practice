 public Queue<Integer> modifyQueue(Queue<Integer> queue, int k) 
 {
   Stack<Integer> st = new Stack<>();
   
   for(int i=0;i<k;i++)
     st.push( q.remove() );
   
   while( !st.isEmpty() )
     queue.add(st.pop());
   
   for(int i=0;i< queue.size() - k; i++)
   {
     queue.add( queue.peek() );
     queue.remove();
   }
   
   return queue;
 }
