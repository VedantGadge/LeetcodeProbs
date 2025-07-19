// LeetCode 2696: Minimum String Length After Removing Substrings - Deque stack for "AB" and "CD" removal
// Core Logic: Use stack, check for "AB" and "CD" patterns, pop when pattern found, push otherwise
import java.util.ArrayDeque;
import java.util.Deque;

class q2696{
    public int minLength(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && stack.peekLast()=='A' && ch=='B') stack.pollLast();
            else if(!stack.isEmpty() && stack.peekLast()=='C' && ch=='D') stack.pollLast();
            else stack.addLast(ch);
        }
        return stack.size();
    }
}