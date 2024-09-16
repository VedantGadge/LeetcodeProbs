public class q1800 {
    public static int maxAscendingSum(int[] nums) {
        if (nums.length == 1) return nums[0]; // Edge case: single element
        
        int max = 0;
        int temp = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                temp += nums[i];
            } else {
                if (temp > max) max = temp;
                temp = nums[i];
            }
        }
        
        // Final check for the last ascending subarray
        if (temp > max) max = temp;
        
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {6};
        System.out.println(maxAscendingSum(nums)); // Output should be 7
    }
}
