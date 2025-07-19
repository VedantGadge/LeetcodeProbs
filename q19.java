// LeetCode 19: Remove Nth Node From End - Two pointers with n-step gap for one-pass solution
// Core Logic: Fast pointer moves n steps ahead, then both move until fast reaches end
public class q19 {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head , fast = head;
        for(int i = 0; i<n;i++) fast = fast.next;
        if (fast == null) return head.next;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        
    }
}
