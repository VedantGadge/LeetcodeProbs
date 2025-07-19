// LeetCode 1021: Remove Outermost Parentheses - Counter-based tracking to skip outermost pairs
// Core Logic: Use counter, skip characters when counter=0 (outermost), track balance with increment/decrement
public class q1021 {
    public static void main(String[] args) {
        String s = "(()())(())";
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ')') count--;
            if(count!=0) ans.append(s.charAt(i));
            if(s.charAt(i) == '(') count++;
        }
        System.out.println(ans);
    }
}
