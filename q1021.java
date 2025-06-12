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
