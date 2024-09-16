public class q704 {

    public static int search(int[] nums, int target) {

        int s = 0;
        int l = nums.length-1;
        while (s<=l) {
            int mid = s+((l-s)/2);
            if(nums[mid]>target){
                l = mid-1;
            }
            else if(nums[mid]<target){
                s = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(search(nums, 1));
    }
}
