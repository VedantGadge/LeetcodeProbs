import java.util.Arrays;

public class q1968 {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int idx = 0;
        while (left <= right && idx<nums.length) {
            ans[idx++] = nums[left++];
            if(idx<nums.length) ans[idx++] = nums[right--];
        }
        return ans;
    }
}
