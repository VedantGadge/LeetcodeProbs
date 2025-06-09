public class q153 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]<=min) min = nums[mid];

            if(nums[mid] <= nums[high]){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }

        System.out.println(min);
    }
}
