public class q643 {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        int left = 0;
        int currSum = 0;
        for(int right = 0 ;right<nums.length;right++){
            currSum += nums[right];
            k--;
            while(k<0){
                currSum -= nums[left];
                left++;
            }
            maxAvg = Math.max(currSum/(right-left+1), maxAvg);
        }
        return maxAvg;
    }
}
