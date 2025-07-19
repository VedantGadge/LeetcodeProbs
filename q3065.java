// LeetCode 3065: Minimum Operations to Exceed Threshold Value I - Count elements below threshold
// Core Logic: Count total elements, subtract those >= k to get minimum operations needed
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
