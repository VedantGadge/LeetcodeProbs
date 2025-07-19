// LeetCode 92: Reverse Linked List II - Reverse sublist between positions with dummy head technique
// Core Logic: Use dummy head, find prev node before start, reverse nodes between left and right, reconnect properly

public class q92 {
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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode preSubListNode = dummy;
        ListNode currNode = head;

        for(int i = 0;i<left-1;i++){
            preSubListNode = preSubListNode.next;
            currNode = currNode.next;     
        }

        ListNode subListHead = currNode;

        ListNode prevNode = null;
        for(int i = 0;i<=right-left+1;i++){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        preSubListNode.next = prevNode;
        subListHead.next = currNode;

        return dummy.next;
        
    }

}
