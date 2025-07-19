// LeetCode 150: Evaluate Reverse Polish Notation - Stack with ternary operators for operation handling
// Core Logic: Push numbers, pop two operands for operations, use nested ternary for clean operation logic
import java.util.Stack;

public class q150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int op2 = stack.pop();
                int op1 = stack.pop();
                int ans = token.equals("+") ? op1 + op2
                        : token.equals("-") ? op1 - op2
                        : token.equals("*") ? op1 * op2
                        : op1 / op2;
                stack.push(ans);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
