// LeetCode 2487: Remove Nodes From Linked List - Reverse twice approach with monotonic decreasing filtering
// Core Logic: Reverse list, remove nodes smaller than previous (maintain decreasing order), reverse back
// Key insight: After reversing, we can easily remove nodes that have a greater node to their right

public class q2487 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode revList(ListNode head){
    ListNode prev = null;
    ListNode curr = head;
    ListNode nextNode;
    while(curr!=null){
        nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;
    }
    return prev;
  }
  public ListNode removeNodes(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode revHead = revList(head);
        ListNode temp = revHead;
        while(temp != null && temp.next != null){
            if(temp.val > temp.next.val) {
                temp.next = temp.next.next; // Remove smaller node
            } else {
                temp = temp.next; // Move to next node
            }
        }
        return revList(revHead);
    }
}

