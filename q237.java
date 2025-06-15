public class q237 {

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    // Deletes the given node (except the tail) from the linked list
    static void deleteNode(ListNode node) {
        node.val = node.next.val;      // Copy value from next node
        // Now the LL is 4 -> 1 -> 1 -> 9
        // Then we skip the original node which we have duplicated
        node.next = node.next.next;    // Skip the next node
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        // Let's delete node with value 5
        deleteNode(head.next);

        // Print list: should be 4 -> 1 -> 9
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}



