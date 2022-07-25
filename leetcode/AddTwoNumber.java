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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode curr = l1;
        ListNode curr2 = l2;
        
        ListNode res = new ListNode(1);
        
        int c = 0;
        
        while( curr != null || curr2 != null)
        {
            if( curr == null)
            {
                res.val = (curr2.val + c) % 10;
                c = (curr2.val + c)/10;
                res = new ListNode(1, res);
                curr2 = curr2.next;
            }
            
            else if(curr2 == null)
            {
                res.val = (curr.val + c)%10;
                c = (curr.val + c)/10;
                res = new ListNode(1, res);
                curr = curr.next;
            }
            else
            {
                res.val = (curr.val + curr2.val + c)%10;
                c = (curr.val + curr2.val + c)/10;
                res = new ListNode(1, res);
                curr = curr.next;
                curr2 = curr2.next;
                
            }
        }
        if( c == 0)
        {
            res = res.next;
        }
        return reverse(res);
    }
}