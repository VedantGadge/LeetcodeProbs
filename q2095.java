// LeetCode 2095: Delete Middle Node of Linked List - Floyd's technique with previous pointer tracking
// Core Logic: Use slow/fast pointers, track previous of slow, handle edge cases for small lists
public class q2095 {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
    
    public static void main(String[] args) {
        
    }
}
