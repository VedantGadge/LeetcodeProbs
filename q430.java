public class q430 {
    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };

    static Node flattenDFS(Node node) {
        Node curr = node;
        Node last = node;
        while (curr != null) {
            Node next = curr.next;
            if (curr.child != null) {
                Node childTail = flattenDFS(curr.child);

                // Connect curr and child
                curr.next = curr.child;
                curr.child.prev = curr;

                // Connect childTail and next
                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                curr.child = null;
                last = childTail;
            } else {
                last = curr;
            }
            curr = next;
        }
        return last;
    }

    static Node flatten(Node head) {
        flattenDFS(head);
        return head;
    }
    
    public static void main(String[] args) {
        
    }
}
