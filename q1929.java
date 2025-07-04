public class q1929 {
    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];
        
        System.arraycopy(nums, 0, result, 0, n);
        System.arraycopy(nums, 0, result, n, n);
        
        return result;
    }
    public static void main(String[] args) {
        getConcatenation(new int[] {1});
    }
}
