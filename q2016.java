public class q2016 {

    public static int maximumDifference(int[] nums) {
       int max = -1;
       for(int i =0;i<nums.length;i++){
        for(int j=i;j<nums.length;j++){
            if(nums[i]<nums[j]){
                if(nums[j]-nums[i]>max) max = nums[j]-nums[i];
            }
        }
       }
       System.gc();
       return max; 
    }
    public static void main(String[] args) {
        int[] nums = {9,4,3,2};
        System.out.println(maximumDifference(nums));
    }
}
