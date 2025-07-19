// LeetCode 287: Find Duplicate Number - Floyd's Cycle Detection treating array as linked list
// Core Logic: Use array values as indices, detect cycle then find cycle start (duplicate number)
public class q287 {
    public int findDuplicate(int[] nums) {
       int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while( slow != fast);

        fast = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;                       
    }
}
