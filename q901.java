// LeetCode 901: Online Stock Span - Monotonic decreasing stack with price-span pairs
// Core Logic: Stack stores [price, span] pairs, pop smaller prices and accumulate their spans

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
