public class q61 {
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

    static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode tail = head , temp = head;
        int len = 1;
        while(tail.next!=null){
            len++;
            tail = tail.next;
        }
        if(k % len == 0) return head;
        tail.next = head;
        k = k % len;
        for(int i = 1;i<len-k;i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }

     public static void main(String[] args) {
        // Create the list 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                            new ListNode(2,
                                new ListNode(3,
                                    new ListNode(4,
                                        new ListNode(5)))));

        int k = 2;
        ListNode rotated = rotateRight(head, k);

        // Print the rotated list
        while (rotated != null) {
            System.out.print(rotated.val);
            if (rotated.next != null) System.out.print(" -> ");
            rotated = rotated.next;
        }
        System.out.println();
    }
}
