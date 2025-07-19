// LeetCode 225: Implement Stack using Queues - Single queue with rotation technique on push
// Core Logic: After adding element, rotate queue (size-1) times to make new element front
import java.util.LinkedList;
import java.util.Queue;
//ImplementSstack using Queue
public class q225 {
    Queue<Integer> stack;
    public q225() {
        stack = new LinkedList<>();
    }
    
    public void push(int x) {
        stack.add(x);
        for(int i = 0;i< stack.size()-1;i++){
            stack.add(stack.remove());
        }

    }
    
    public int pop() {
        return stack.remove();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}
