// LeetCode 560: Subarray Sum Equals K - Prefix sum with HashMap to count target sum occurrences
// Core Logic: Track prefix sums in HashMap, for each prefix sum check if (prefixSum - k) exists

import java.util.HashMap;

public class q560 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        int preSum = 0;
        int count = 0;
        HashMap<Integer, Integer> Hashmap = new HashMap<>();
        Hashmap.put(0, 1);
        for(int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            int remove = preSum - k;
            count += Hashmap.getOrDefault(remove, 0);
            Hashmap.put(preSum, Hashmap.getOrDefault(preSum, 0) + 1);
        }
        System.out.println(count);
    }
}
