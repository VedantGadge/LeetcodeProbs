// LeetCode 155: Min Stack - Custom stack node with min value tracking at each level
// Core Logic: Each stack node stores current min, enabling O(1) getMin() operation
public class q155 {
    int min = Integer.MAX_VALUE;
    stackNode top = null;
    public class stackNode {
        int val;
        int min;
        stackNode next;

        stackNode(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    public void push(int val) {
        min = Math.min(min, val);
        stackNode newNode = new stackNode(val,min);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (top == null) return;
        top = top.next;
        if (top == null) {
            min = Integer.MAX_VALUE;
        } else {
            min = top.min;
        }
    }

    public int top() {
        if (top == null) return -1;
        return top.val;
    }

    public int getMin() {
        if (top == null) return -1;
        return top.min;
    }

}
