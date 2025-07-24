import java.util.Arrays;

public class q2460 {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int write = 0;
        for (int i = 0; i < n; i++) {
            // Apply operation if next is equal
            if (i < n - 1 && nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
            // Move non-zero to front
            if (nums[i] != 0) {
                nums[write++] = nums[i];
            }
        }
        // Fill the rest with zeros
        Arrays.fill(nums, write, n, 0);
        return nums;
    }
}
