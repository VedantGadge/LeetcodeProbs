// LeetCode 876: Middle of the Linked List - Floyd's tortoise and hare algorithm
// Core Logic: Slow pointer moves 1 step, fast pointer moves 2 steps; when fast reaches end, slow is at middle

public class q876 {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    static ListNode middleNode(ListNode head) {
        ListNode slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next; 
        }
        return slow;
    }

  public static void main(String[] args) {
    
  }
}
