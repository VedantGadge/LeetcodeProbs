public class q1909 {

    public boolean canBeIncreasing(int[] nums) {
        int lcount = 0 , rcount = 0;
        int lastValue = nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]<lastValue) lastValue = nums[i];
            else rcount++;
        }
        lastValue = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>lastValue) lastValue = nums[i];
            else lcount++;
        }
        return Math.min(lcount,rcount) <=1;
    }

    public static void main(String[] args) {
        
    }
}
