import java.util.List;
import java.util.ArrayList;

public class q22 {
    
    static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(res, sb, 0, 0, n);
        return res;
    }

    private static void backtrack(List<String> res, StringBuilder curr, int open, int close, int max) {
        if (curr.length() == max * 2) {
            res.add(curr.toString());
            return;
        }
        
        if (open < max) {
            curr.append('(');
            backtrack(res, curr, open + 1, close, max);
            curr.deleteCharAt(curr.length() - 1); // backtrack
        }
        
        if (close < open) {
            curr.append(')');
            backtrack(res, curr, open, close + 1, max);
            curr.deleteCharAt(curr.length() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
