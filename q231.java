// LeetCode 231: Power of Two - Bit manipulation with n & (n-1) technique for single bit detection
// Core Logic: Powers of 2 have exactly one bit set; n & (n-1) removes rightmost set bit
public class q231 {

    public boolean isPowerOfTwo(int n) {
        // A power of 2 has exactly one bit set
        // n & (n-1) removes the rightmost set bit
        // If n is power of 2, this should result in 0
        return n > 0 && (n & (n - 1)) == 0;
    }
    
    public static void main(String[] args) {
        
    }
}
