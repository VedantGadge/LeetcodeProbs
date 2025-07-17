import java.util.ArrayDeque;
import java.util.Deque;

public class q901 {
    Deque<int[]> stack = new ArrayDeque<>();

    public q901() {}

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peekLast()[0] <= price) {
            span += stack.pollLast()[1];
        }
        stack.addLast(new int[]{price, span});
        return span;
    }
}
