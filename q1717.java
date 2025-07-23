import java.util.ArrayDeque;
import java.util.Deque;

class q1717{
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            // First pass: remove "ab" patterns
            int score1 = removePattern(s, 'a', 'b', x);
            String remaining = getRemainingString(s, 'a', 'b');
            // Second pass: remove "ba" patterns from remaining string
            int score2 = removePattern(remaining, 'b', 'a', y);
            return score1 + score2;
        } else {
            // First pass: remove "ba" patterns
            int score1 = removePattern(s, 'b', 'a', y);
            String remaining = getRemainingString(s, 'b', 'a');
            // Second pass: remove "ab" patterns from remaining string
            int score2 = removePattern(remaining, 'a', 'b', x);
            return score1 + score2;
        }
    }
    
    private int removePattern(String s, char first, char second, int points) {
        Deque<Character> stack = new ArrayDeque<>();
        int score = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == second && !stack.isEmpty() && stack.peekLast() == first) {
                stack.pollLast();
                score += points;
            } else {
                stack.addLast(ch);
            }
        }
        return score;
    }
    
    private String getRemainingString(String s, char first, char second) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == second && !stack.isEmpty() && stack.peekLast() == first) {
                stack.pollLast();
            } else {
                stack.addLast(ch);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        return result.toString();
    }
}