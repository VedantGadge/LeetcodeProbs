// LeetCode 69: Sqrt(x) - Binary search with overflow protection using long
// Core Logic: Binary search in range [1, x/2], use long for square calculation to prevent overflow, return floor value

public class q69 {
    public int mySqrt(int x) {
        if (x < 2) return x; // Handle edge cases
        
        int low = 1;
        int high = x / 2; 
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid; // Prevent overflow
            
            if (square == x) return mid;
            else if (square < x) low = mid + 1;
            else high = mid - 1;
        }
        return high; // Return floor of sqrt
    }
}
