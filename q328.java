
// LeetCode 328: Odd Even Linked List - Separate odd and even nodes using two pointers, then connect
// Core Logic: Track odd/even nodes separately, maintain evenHead to reconnect at end

public class q328 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odd = head , even = head.next , evenHead = head.next;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        
    }
}
