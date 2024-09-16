public class q35 {
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = (r+l)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                l = mid+1;
            }
            else if(nums[mid]>target){
                r = mid-1;
            }
        }
        return l;

    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,10));
    }
}

//The loop continues narrowing down the search space until left surpasses right. At this point, the search space is empty.
//The key insight is that the left pointer now represents the smallest index where the target can be inserted while maintaining the sorted order.
//The algorithm's time complexity is 𝑂(log 𝑛) because it uses binary search, which divides the search space in half with each iteration.
