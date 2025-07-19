// LeetCode 1614: Maximum Nesting Depth of Parentheses - Counter-based tracking of maximum depth
// Core Logic: Increment count for '(', decrement for ')', track maximum count reached
public class q1614 {
    public static void main(String[] args) {
        String s = "((1)+((2))+(((3))))";
        int max = 0;
        int count = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                count++;
                if(count > max) max = count;
            } else if(c == ')') {
                count--;
            }
        }
        System.out.println(max);
    }
}
