// LeetCode 1781: Sum of Beauty of All Substrings - Nested loops with frequency array for max-min calculation
// Core Logic: For each starting position, extend substring and track character frequencies for beauty sum
public class q1781 {

    static int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                int max = 0, min = Integer.MAX_VALUE;
                for (int f : freq) {
                    if (f > 0) {
                        max = Math.max(max, f);
                        min = Math.min(min, f);
                    }
                }
                sum += (max - min);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(beautySum("aabcb")); 
    }
}
