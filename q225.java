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
