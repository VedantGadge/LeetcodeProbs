import java.util.ArrayDeque;
import java.util.Deque;

public class q402 {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peekLast() > digit) {
                stack.pollLast();
                k--;
            }
            stack.addLast(digit);
        }
        // Remove remaining digits from the end if k > 0
        while (k > 0 && !stack.isEmpty()) {
            stack.pollLast();
            k--;
        }
        // Build the result and remove leading zeros
        StringBuilder ans = new StringBuilder();
        boolean leadingZero = true;
        for (char digit : stack) {
            if (leadingZero && digit == '0') continue;
            leadingZero = false;
            ans.append(digit);
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }
}
