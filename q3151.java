// LeetCode 3151: Special Array I - Check adjacent elements have different parity (odd/even)
// Core Logic: Verify each adjacent pair has different parity using modulo operations
public class q3151 {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1) return true;
    for(int i = 0;i<nums.length-1;i++){
         if((nums[i]%2==0 && nums[i+1]%2!=1) || (nums[i]%2==1 && nums[i+1]%2!=0)) return false;
    }
    return true;
    }
    public static void main(String[] args) {
        
    }
}
