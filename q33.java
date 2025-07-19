// LeetCode 33: Search in Rotated Sorted Array - Modified binary search identifying sorted half
// Core Logic: Compare mid with boundaries to determine which half is sorted, then check if target lies in that sorted half

public class q33 {
    public static void main(String[] args) {
           int[] nums = {4,5,6,7,0,1,2};
           int low = 0;
           int high = nums.length-1; 
           int target = 0;
           int ans = -1;

           while(low<=high){
            int mid = low + (high-low)/2 ;
            if(nums[mid] == target){ 
                ans = mid;
                break;
            }
            if(nums[low]<=nums[mid]){
                if(target<nums[mid] && target>=nums[low]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(target>nums[mid] && target<=nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid-1;
                }
            }           
           }
           System.out.println(ans);
    }
}
