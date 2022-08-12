
static ArrayList <Integer> max_of_subarrays(int arr[], int k)
{
  int n = arr.length;
  
   Deque<Integer> dq = new ArrayDeque<Integer>();
  
        for (int i = 0; i < k; ++i) {
            
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.removeLast(); 

            
            dq.addLast(i);
        }

       ArrayList<Integer> list = new ArrayList<>();
        for (int i=k; i < n; ++i) {
            
            list.add(arr[dq.peek()]);

            
            while ((!dq.isEmpty()) && dq.peek() <= i - k)
                dq.removeFirst();

           
            while ((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();

           
            dq.addLast(i);
        }

        
        list.add(arr[dq.peek()]);
        return list;
  
}
