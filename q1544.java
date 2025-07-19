// LeetCode 1544: Make The String Great - Stack with ASCII difference checking for case pairs
// Core Logic: Use stack, ASCII difference of 32 between same letters (upper/lower), pop pairs
import java.util.Stack;

public class q1544 {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char c : stack) {
            ans.append(c);
        }
        return ans.toString();
    }
}
