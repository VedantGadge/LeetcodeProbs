// LeetCode 160: Intersection of Two Linked Lists - Two pointers with list switching for equal traversal
// Core Logic: When pointer reaches end, switch to other list; they'll meet at intersection or null
public class q160 {

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

    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode t1 = headA , t2 = headB;
        while(t1 != t2){
            t1 = t1.next;
            t2 = t2.next;

            if(t1 == t2) return t1;
            if(t1 == null) t1 = headB;
            if(t2 == null) t2 = headA;
        }
        return t1;
    }

    public static void main(String[] args) {
        
    }
}
