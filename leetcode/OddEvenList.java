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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode res = new ListNode(1);
        
        int i = 1;
        for(ListNode curr=head; curr!=null;curr = curr.next,i++)
        {
            if( i%2 != 0)
            {
                res.val = curr.val;
                res = new ListNode(1, res);
            }
        }
        
        int j = 1;
        for(ListNode curr=head; curr!=null;curr = curr.next, j++)
        {
            if( j%2 == 0)
            {
                res.val = curr.val;
                res = new ListNode(1, res);
            }
        }
        res = res.next;
        
        return reverse(res);
        
    }
}