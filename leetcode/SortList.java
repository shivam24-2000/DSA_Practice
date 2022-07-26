class Solution {
    public ListNode reverse(ListNode head)
    {
        ListNode curr = head, next = null, prev = null;
        
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode sortList(ListNode head) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(ListNode curr = head; curr!=null;curr= curr.next)
        {
            pq.add(curr.val);
        }
        
        ListNode res = new ListNode(1);
        while(!pq.isEmpty())
        {
            res.val = pq.poll();
            res = new ListNode(1, res);
            // res = res.next;
        }
        res = res.next;
        return reverse(res);
        
    }
}