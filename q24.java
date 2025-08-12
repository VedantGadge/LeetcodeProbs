public class q24 {

     public class ListNode {
      int val;
    ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0); // Dummy node to simplify head swapping
        dummy.next = head;
        ListNode prev = dummy;
         while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;       // First node of the pair
            ListNode second = prev.next.next; // Second node of the pair

            // Swap the pair
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move to the next pair
            prev = first;
        }

        return dummy.next;
    }
}
