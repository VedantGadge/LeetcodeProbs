// LeetCode 142: Linked List Cycle II - Floyd's algorithm + reset slow to head for cycle start detection
// Core Logic: After detecting cycle, reset slow to head, move both one step until they meet at cycle start
public class q142 {
     class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
          next = null;
    }
  }

    static ListNode detectCycle(ListNode head) {
        ListNode slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                slow = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

  public static void main(String[] args) {
    
  }
}
