// LeetCode 206: Reverse Linked List - Recursive approach with front pointer manipulation
// Core Logic: Recursively reverse, then adjust front.next = head and head.next = null
public class q206 {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  
  // Recursive approach
  static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

  // Iterartive (non-recursive) approach
//   static ListNode reverseList(ListNode head) {
//         ListNode temp = head , prev = null , front = null;
//         while(temp!=null){
//             front = temp.next;
//             temp.next = prev;
//             prev = temp;
//             temp = front;
//         }
//         return prev;
//     }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);

    // Print the list
    ListNode curr = head;
    while (curr != null) {
        System.out.print(curr.val + " -> ");
        curr = curr.next;
    }
    System.out.println();
    ListNode rev = reverseList(head);
    while (rev != null) {
        System.out.print(rev.val + " -> ");
        rev = rev.next;
    }
    }
}
