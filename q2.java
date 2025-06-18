public class q2 {

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

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1 , t2 = l2;
        int carry = 0;
        ListNode dummyHead = new ListNode();
        ListNode temp = dummyHead;
        while(t1 != null || t2 != null){
            int sum = carry;
            if(t1!=null) sum += t1.val;
            if(t2!=null) sum += t2.val;

            ListNode newNode = new ListNode(sum%10);
            carry = sum / 10;
            temp.next = newNode;
            temp = newNode;

            if(t1!=null) t1 = t1.next;
            if(t2!=null) t2 = t2.next;
        }   
        if(carry!=0){
            temp.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        
    }
}
