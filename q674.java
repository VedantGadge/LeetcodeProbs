// LeetCode 674: Longest Continuous Increasing Subsequence - Single pass with counter reset on decrease
// Core Logic: Track current length, increment on increase, reset to 1 on decrease, maintain maximum length

public class q674 {
    public static int  findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 1;
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                k++;
                
            }
            else{
                max = Math.max(max, k);
                k=1;
            }
        }
        max = Math.max(max, k);
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2147483648,0,0,2};
        System.out.println(findLengthOfLCIS(nums));
    }
}
