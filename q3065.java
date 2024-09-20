public class q3065 {
    public int minOperations(int[] nums, int k) {
        int  count = nums.length;
        for(int x : nums){
            if(x>=k) count--;
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
