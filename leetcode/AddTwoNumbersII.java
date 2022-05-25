/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        Stack<Integer> st = new Stack<>();
        
        for(ListNode curr = l1; curr != null; curr = curr.next)
        {
            st.push(curr.val);
        }
        
        Stack<Integer> st1 = new Stack<>();
        
        for(ListNode curr=l2; curr != null; curr = curr.next)
        {
            st1.push(curr.val);
        }
        
        ListNode res = new ListNode(1);
        int c = 0 ;
        
        while(!st.isEmpty() || !st1.isEmpty())
        {
           if( st.isEmpty())
           {
               res.val = (st1.peek() +c)%10;
               c = (st1.peek() + c)/10;
               st1.pop();
               res = new ListNode(1, res);
           }
            
            else if( st1.isEmpty())
            {
               res.val = (st.peek() +c)%10;
               c = (st.peek() + c)/10;
               st.pop();
               res = new ListNode(1, res);
           }else
            {
                res.val=(st.peek()+st1.peek()+c)%10;
                c=(st.peek()+st1.peek()+c)/10;
                st.pop();st1.pop();
                res = new ListNode(1,res);
            }
        
        }
        
        if( c == 0)
        {
            res = res.next;
        }
       
            
        return res;
    }
}
