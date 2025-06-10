public class q162 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) System.out.println(nums[mid]);
            if (nums[mid - 1] < nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}