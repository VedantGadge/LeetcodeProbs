// LeetCode 7: Reverse Integer - Mathematical reversal with overflow detection using long
// Core Logic: Extract digits using modulo, build reversed using multiply-add, check 32-bit bounds with long casting

class q7{
    public static void main(String[] args) {
        int x = 1234;
        int rev = 0;
        while(x!=0){
            int digit = x%10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && digit > 7)) //return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && digit < -8)) //return 0;
            rev = rev*10 + digit;
            x /= 10;
        }
        System.out.println(rev);
    }
}