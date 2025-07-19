import java.util.ArrayDeque;
import java.util.Deque;

public class q3174 {
    public String clearDigits(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder ans = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && (stack.peek()>=97 && stack.peek()<=122) && (ch>=48 && ch<=57)) stack.pollLast();
            else stack.addLast(ch);
        }
        for(char ch: stack){
            ans.append(ch);
        }
        return ans.toString();
    }
}
