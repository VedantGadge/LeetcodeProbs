public class q371 {
    public static int getSum(int x, int y) {
        
        // Iterate till there is no carry
        while (y != 0) {
            // Calculate carry bits
            int carry = x & y;
            
            // Sum bits of x and y where at least one of the bits is not set
            x = x ^ y;
            
            // Shift carry bits to the left by one position
            y = carry << 1;
        }
        
        return x;
    }
    public static void main(String[] args) {
        System.out.println(getSum(11,3));
        
    }
}
