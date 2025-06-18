public class q148 {

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

    static ListNode middleOfList(ListNode head) {
        if (head == null || head.next == null) {
        return head;
        }

        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static ListNode mergeTwoSortedList(ListNode left, ListNode right) {

        ListNode newHead = new ListNode(); //acts as a newHead , we return from newHead.next so this anyways gets ignored
        ListNode temp = newHead; 

        while (left != null && right != null) {
            if (left.val >= right.val) {
                temp.next = right;
                right = right.next;
            } else {
                temp.next = left;
                left = left.next;
            }
            temp = temp.next;
        }

        if (left != null) {
            temp.next = left;
        } else {
            temp.next = right;
        }

        return newHead.next;
    }

    static ListNode sortList(ListNode head) {
        // recursively dividing
        if (head == null || head.next == null)
            return head;

        ListNode middle = middleOfList(head);
        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;

        left = sortList(left);
        right = sortList(right);

        return mergeTwoSortedList(left, right);
    }

    public static void main(String[] args) {

    }
}
