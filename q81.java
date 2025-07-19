// LeetCode 81: Search in Rotated Sorted Array II - Modified binary search handling duplicates
// Core Logic: Handle duplicates by shrinking bounds when nums[low]==nums[mid]==nums[high], else use standard rotated array logic

public class q81 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1};
        int target = 3;
        int low = 0;
           int high = nums.length-1; 
           boolean ans = false;

           while(low<=high){
            int mid = low + (high-low)/2 ;
            if(nums[mid] == target){ 
                ans = true;
                break;
            }
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
        low++;
        high--;
        continue;
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
