import java.util.Arrays;

class q1838{
    public static void main(String[] args) {
        int[] nums = {1,4,8,13};
        int k = 5;
        Arrays.sort(nums);
        int left = 0, right = 0, windowSize = 0, currSum = 0;
        for(right = 0;right<nums.length;right++){
             currSum += nums[right];

            // for calculating required operations(right - left + 1) * nums[right] - currSum
             while((right - left + 1) * nums[right] - currSum> k){ //shrink window 
                currSum -= nums[left];
                left++;
             }

             windowSize = Math.max(windowSize, right - left + 1);
        }

    }
}