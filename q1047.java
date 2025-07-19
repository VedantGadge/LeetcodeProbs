// LeetCode 1047: Remove All Adjacent Duplicates In String - Deque as stack with peekLast/pollLast
// Core Logic: Use deque as stack, compare with top element, remove if same, add if different
import java.util.ArrayDeque;
import java.util.Deque;

public class q1047 {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder ans = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(!stack.isEmpty() && ch == stack.peekLast()) stack.pollLast();
            else stack.addLast(ch);
        }
        for(char ch: stack){
            ans.append(ch);
        }
        return ans.toString();
    }
}
