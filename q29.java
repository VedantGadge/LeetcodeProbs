class q29{
    public int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        
        boolean neg = false;
        if(dividend < 0 || divisor < 0) neg = true;
        if(dividend < 0 && divisor < 0) neg = false;
        
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        long ans = 0;
        
        while(n >= d){
            int count = 0;
            while (n >= (d << (count + 1))) {
                count++;
            }
            ans += 1L << count;
            n -= d << count;
        }
        
        // Handle overflow
        if(ans > Integer.MAX_VALUE) {
            return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        
        return neg ? (int) -ans : (int) ans;
    }
}