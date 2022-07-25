class Solution {
    public ListNode reverse(ListNode head)
    {
        ListNode curr = head, next = null, prev = null;
        
        while( curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        
        int n = lists.length;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<n;i++)
        {
            ListNode curr = lists[i];
            
            while(curr != null)
            {
                pq.add(curr.val);
                curr = curr.next;
            }
        }
        
        ListNode res = new ListNode(1);
        
        while( !pq.isEmpty())
        {
            res.val = pq.poll();
            res = new ListNode(1,res);
           
        }
        res = res.next;
        return reverse(res);
        
    }
}