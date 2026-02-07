// LeetCode 8: String to Integer (atoi) : State machine approach with overflow handling
// Core Logic: Skip spaces, handle sign, process digits with bounds checking using Integer.MAX_VALUE/MIN_VALUE

public class q8 {
    public static void main(String[] args) {
        String s = " -042";
        int i = 0, n = s.length(), sign = 1;
        long num = 0;

        while (i < n && s.charAt(i) == ' ') i++;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if (sign * num > Integer.MAX_VALUE) {
                num = Integer.MAX_VALUE;
                break;
            }
            if (sign * num < Integer.MIN_VALUE) {
                num = -Integer.MIN_VALUE;
                break;
            }
            i++;
        }

        System.out.println((int)(sign * num));
    }
}
