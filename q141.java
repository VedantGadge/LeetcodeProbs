// LeetCode 141: Linked List Cycle - Floyd's Cycle Detection (tortoise and hare algorithm)
// Core Logic: Fast pointer moves 2 steps, slow 1 step; if they meet, cycle exists
public class q141 {
     class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
          next = null;
    }
  }

    //Other soln is simply using a HashTable but that takes an extra space of O(n)
  static boolean hasCycle(ListNode head) {
        ListNode slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;

    }

  public static void main(String[] args) {
    
  }
}
