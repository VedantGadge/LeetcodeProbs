import java.util.HashMap;

public class q992 {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private int atMostK(int[] nums, int k) {
        HashMap<Integer, Integer> table = new HashMap<>();
        int left = 0, count = 0;
        for (int right = 0; right < nums.length; right++) {
            table.put(nums[right], table.getOrDefault(nums[right], 0) + 1);
            while (table.size() > k) {
                table.put(nums[left], table.get(nums[left]) - 1);
                if (table.get(nums[left]) == 0) table.remove(nums[left]);
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
