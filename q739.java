// LeetCode 739: Daily Temperatures - Stack-based approach processing temperatures from right to left
// Core Logic: Use stack to store indices, pop smaller temps, store distance to next warmer temperature

import java.util.ArrayDeque;
import java.util.Deque;

public class q739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peekLast()] <= temperatures[i]) {
                stack.pollLast();
            }
            ans[i] = stack.isEmpty() ? 0 : stack.peekLast() - i;
            stack.addLast(i);
        }
        return ans;
    }
}
