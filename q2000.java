// LeetCode 2000: Reverse Prefix of Word - Deque as stack for character reversal until target found
// Core Logic: Build stack until target found, reverse by popping stack, append remaining substring
import java.util.ArrayDeque;
import java.util.Deque;

public class q2000 {
    public String reversePrefix(String word, char ch) {
        Deque<Character> stack = new ArrayDeque<>();
        int idx = -1;
        for (int i = 0; i < word.length(); i++) {
            stack.addLast(word.charAt(i));
            if (word.charAt(i) == ch) {
                idx = i;
                break;
            }
        }
        if (idx == -1) return word; // ch not found

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pollLast());
        }
        sb.append(word.substring(idx + 1));
        return sb.toString();
    }
}
