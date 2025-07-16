public class q682 {
    private Node top;
    private Node beloTop;

    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public void push(int value) {
        Node node = new Node(value);
        node.next = top;
        beloTop = top; // update beloTop to previous top
        top = node;
    }

    public int pop() {
        if (top == null) throw new RuntimeException("Stack is empty");
        int value = top.data;
        top = top.next;
        beloTop = (top != null) ? top.next : null;
        return value;
    }

    public int peek() {
        if (top == null) throw new RuntimeException("Stack is empty");
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int calPoints(String[] operations) {
        // Clear stack before use
        top = null;
        beloTop = null;
        for (String op : operations) {
            if (op.equals("+")) {
                if (top != null && beloTop != null) {
                    push(top.data + beloTop.data);
                }
            } else if (op.equals("D")) {
                if (top != null) {
                    push(top.data * 2);
                }
            } else if (op.equals("C")) {
                if (!isEmpty()) {
                    pop();
                }
            } else {
                push(Integer.parseInt(op));
            }
        }
        // Sum all values in the stack
        int sum = 0;
        Node curr = top;
        while (curr != null) {
            sum += curr.data;
            curr = curr.next;
        }
        return sum;
    }

    // Example main for testing
    public static void main(String[] args) {
        q682 stack = new q682();
        String[] ops = {"5", "2", "C", "D", "+"};
        System.out.println(stack.calPoints(ops)); // Output: 30
    }
}
