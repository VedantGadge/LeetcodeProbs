public class q1922 {

    static final int MOD = 1000000007;

    // Recursive modular exponentiation
    static long power(long base, long exp) {
        if (exp == 0) return 1;
        long half = power(base, exp / 2) % MOD;
        long result = (half * half) % MOD;
        if (exp % 2 == 1) result = (result * (base % MOD)) % MOD;
        return result;
    }

    static int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        long res = (power(5, even) * power(4, odd)) % MOD;
        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(50));
    }
}
