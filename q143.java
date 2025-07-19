// LeetCode 143: Reorder List - Find middle, reverse second half, merge alternately
// Core Logic: Use slow/fast pointers to find middle, reverse second part, then interweave nodes

public class q143 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        //Finding the middle node
        ListNode slow = head , fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reversing the second half
        ListNode prev = null , curr = slow.next;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        slow.next = null; // splitting the list by setting the end node of first half to null

        //Merging the two lists alternativly a node from each list
        ListNode first = head , second = prev;
        while(second!=null){
            ListNode temp1 = first.next , temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}
