public class q2375 {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        StringBuilder ans = new StringBuilder();
        int[] stack = new int[n + 1];
        int idx = 0;
        for (int i = 0; i <= n; i++) {
            stack[idx++] = i + 1;
            if (i == n || pattern.charAt(i) == 'I') {
                while (idx > 0) {
                    ans.append(stack[--idx]);
                }
            }
        }
        return ans.toString();
    }
}
