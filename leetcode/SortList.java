class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(ListNode curr = head; curr != null; curr = curr.next)
        {
            list.add(curr.val);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        ListNode res = new ListNode(1);
        
        for(int i=0;i<list.size();i++)
        {
            res.val = list.get(i);
            res = new ListNode(1, res);
        }
        res = res.next;
        
        return res;
        
    }
}