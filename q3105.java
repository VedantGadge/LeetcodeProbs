public class q3105{

    public static int longestMonotonicSubarray(int[] nums) {
        int maxLength = 1;
        int increaseMax = 1;
        int decreaseMax = 1;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]) increaseMax ++;
            else if(nums[i+1]<nums[i]) decreaseMax++;
            else{
                increaseMax = 1;
                decreaseMax = 1;
            }
            maxLength = Math.max(maxLength, Math.max(increaseMax, decreaseMax));
        }
        
        return maxLength;
    }
    public static void main(String[] args) {
            int[] nums = {1,4,3,2,1};
            System.out.println(longestMonotonicSubarray(nums));
    }
}