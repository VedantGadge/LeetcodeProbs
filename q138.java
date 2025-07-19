
// LeetCode 138: Copy List with Random Pointer - Three-pass approach: interweave, set random, separate
// Core Logic: Insert copy nodes between originals, copy random pointers, then extract the copy list

public class q138 {
   
    static class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

    static Node copyRandomList(Node head) {
        Node temp = head;
        
        while(temp!=null){
            Node copyNode = new Node(temp.val);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }

        temp = head;
        while(temp!=null){
            Node copyNode = temp.next;
            if(temp.random!=null) copyNode.random = temp.random.next;
            else copyNode.random = null;
            temp = temp.next.next;
        }

        Node dummyHead = new Node(0);
        Node res = dummyHead;
        temp = head;
        while (temp!=null) {
            res.next = temp.next;
            res = res.next;
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return dummyHead.next;

    }
    
    public static void main(String[] args) {
        
    }
}
