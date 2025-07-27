public class q1248 {
    public int numberOfSubarrays(int[] nums, int k) {
       int ans = 0, left = 0, oddCount = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 == 1) {
                k--;
                oddCount = 0;
            }
            while (k == 0) {
                if (nums[left] % 2 == 1) {
                    k++;
                }
                oddCount++;
                left++;
            }
            ans += oddCount;
        }
        return ans;
    }
}
