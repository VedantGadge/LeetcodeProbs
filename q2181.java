class q2181 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeNodes(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        ListNode temp = head.next; // Skip the first 0
        int currSum = 0;

        while (temp != null) {
            if (temp.val == 0) {
                // Create a new node with the sum and attach it to the result list
                current.next = new ListNode(currSum);
                current = current.next;
                currSum = 0; 
            } else {
                currSum += temp.val; 
            }
            temp = temp.next; 
        }

        return dummy.next;
    }
}