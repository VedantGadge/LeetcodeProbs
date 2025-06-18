public class q25 {
    
    static class ListNode {
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

    static ListNode findKthNode(ListNode temp , int k){
        while(temp != null && k>0){
            k--;
            temp = temp.next;      
        }
        return temp;
    }

    static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    static ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head , prevNode = null , nextNode = null;
        while(temp!=null){
            ListNode kthNode = findKthNode(temp , k-1);
            if(kthNode == null){
                if(prevNode!=null) prevNode.next = temp;
                break;
            }
            nextNode = kthNode.next;
            kthNode.next = null;
            kthNode =  reverseList(temp);
            if(temp == head) head = kthNode;
            else prevNode.next = kthNode;
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
    
    public static void main(String[] args) {
        
    }
}
