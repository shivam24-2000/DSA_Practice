public TreeNode sortedListToBST(ListNode head) {
        ListNode slow = head, fast = head, start = head, mid= head;
      if(head == null) return null;
      
      if(head.next == null) return new TreeNode(head.val);
      
      while( fast != null && fast.next != null)
      {
        mid = slow;
        slow = slow.next;
        fast = fast.next.next;
      }
      mid.next = null;
      TreeNode root = new TreeNode(slow.val);
      root.left = sortedListToBST(start);
      root.right = sortedListToBST(slow.next);
      
      return root;
    }
