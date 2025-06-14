public class q8 {
    public static void main(String[] args) {
        String s = " -042";
        int i = 0, n = s.length(), sign = 1;
        long num = 0;

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') i++;

        // Handle sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        // Parse digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            // Clamp to 32-bit signed int range
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
