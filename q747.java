public class q747 {

    public static int dominantIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int maxIndex = -1;
   
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max; // Update second max
                max = nums[i];
                maxIndex = i; // Update index of max
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        if (max >= 2 * secondMax) {
            return maxIndex;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(dominantIndex(nums));
    }
}
