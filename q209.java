
public class q209 {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0 ,  length = Integer.MAX_VALUE, currSum = 0;
        for(int right = 0 ; right<nums.length;right++){
            currSum += nums[right];
            while(currSum>=target){
                length = Math.min(length, right-left+1);
                currSum -= nums[left];
                left++;               
            }             
        }
        return length == Integer.MAX_VALUE? 0: length;
    }
}
