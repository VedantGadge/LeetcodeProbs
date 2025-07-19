// LeetCode 946: Validate Stack Sequences - Simulate push/pop operations using stack
// Core Logic: Push elements while matching popped sequence, check if stack is empty at end

import java.util.Stack;

public class q946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j= 0;
        for(int x: pushed){
            stack.push(x);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
