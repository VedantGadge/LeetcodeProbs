public class q2529 {
    public  static int maximumCount(int[] nums) {
        int lastNegative = lastNegative(nums) +1;
        int firstPositive = nums.length - firstPositive(nums);
        
        return Math.max(lastNegative,firstPositive);
    }

    public static int lastNegative(int[] nums){
        int s = 0;
        int ans = -1;
        int l = nums.length-1;
        while (s<=l) {
            int mid = s+((l-s)/2);
            
            if(nums[mid]<0){
                ans = mid;
                s = mid+1;
            }
            else{
                l = mid-1;
            }
        }
        return ans;
    }

    public  static int firstPositive(int[] nums){
        int s = 0;
        int ans = nums.length;
        int l = nums.length-1;
        while (s<=l) {
            int mid = s+((l-s)/2);
            if(nums[mid]>0){
                ans = mid;
                l = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-5,-4,-3,-2,-1,3,4,5,6};
        System.out.println(maximumCount(nums));
    }
}
