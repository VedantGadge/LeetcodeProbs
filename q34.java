// LeetCode 34: Find First and Last Position of Element - Binary search for leftmost and rightmost occurrences
// Core Logic: Two separate binary searches - one biased left (high=mid-1), one biased right (low=mid+1)

public class q34 {

    public static int firstBinsearch(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int first = -1;
        while(low<=high){
            int mid = low + (low+high)/2;
            if (nums[mid] == target){
                first = mid;
                high = mid-1;
            }  
            else if(nums[mid]<target) low = mid+1;
            else high = mid - 1;
        }
        return first;
    }

    public static int lastBinsearch(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int last = -1;
        while(low<=high){
            int mid = low + (low+high)/2;
            if (nums[mid] == target){
                last = mid;
                low = mid+1;
            }  
            else if(nums[mid]<target) low = mid+1;
            else high = mid - 1;
        }
        return last;
    }
    public static void main(String[] args) {
        
    }
}
