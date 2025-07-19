// LeetCode 326: Power of Three - Recursive multiplication check with overflow protection
// Core Logic: Recursively multiply by 3 until reaching or exceeding n, check overflow before multiplication

public class q326 {

    static boolean check(int n , int i){
        if(i>n) return false;
        if(i == n) return true;
        if (i > Integer.MAX_VALUE / 3) return false;
        return check(n,i*3);
    }


    static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        return check(n,1);
    }

    public static void main(String[] args) {
        
    }
}
