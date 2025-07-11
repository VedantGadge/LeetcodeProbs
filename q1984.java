import java.util.Arrays;

class q1984{

    static int minimumDifference(int[] nums, int k) {
        if(k == 1)
            return 0;
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - k; i++) {
            int diff = nums[i + k - 1] - nums[i];
            if (diff < minDiff) minDiff = diff;
        }
        return minDiff;
    }

    public static void main(String[] args) {
        System.out.println(minimumDifference(new int[]{1,9,8,4}, 2));
    }
}