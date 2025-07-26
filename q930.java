public class q930 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = 0, sum = 0, countZero = 0, l = 0;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            while (l < r && (sum > goal || nums[l] == 0)) {
                if (nums[l] == 0) {
                    countZero++;
                } else {
                    countZero = 0;
                }
                sum -= nums[l++];
            }

            if (sum == goal) {
                ans += 1 + countZero;
            }
        }

        return ans;
    }
}
