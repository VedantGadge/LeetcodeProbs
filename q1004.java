public class q1004 {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLen = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right]==0) k--;
                while(k<0){
                    left++;
                    if(nums[left]==0) k++;
                }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
