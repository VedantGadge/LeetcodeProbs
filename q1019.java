import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class q1019 {

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

    public ListNode revList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public int[] nextLargerNodes(ListNode head) {
        if(head.next == null) return new int[] {0};
        ListNode revHead = revList(head);
        ListNode temp = revHead;
        int n = 0;
        while (temp!=null){
            n++;
            temp = temp.next;
        }
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        ListNode curr = revHead;
        for(int i = n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peekLast()<=curr.val){
                stack.pollLast();
            }
            if(stack.isEmpty()) ans[i] = 0;
            else ans[i] = stack.peekLast();
            stack.addLast(curr.val);
            curr = curr.next;
        }
        return ans;
    }
}
