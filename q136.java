// LeetCode 136: Single Number - XOR all elements to find the unique number (XOR cancellation property)
// Core Logic: XOR all nums; duplicates cancel out (a^a=0), leaving only the single occurrence number
public class q136 {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i =0;i<nums.length;i++){
            ans = ans^nums[i]; //XOR operator
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}

/* 
 If an element appears an even number of times in the array, the elements will cancel out (because a ^ a = 0). 
 The final value of ans will be the XOR of the elements that appear an odd number of times. 
 If there's exactly one element that appears an odd number of times, ans will be that element.

 XORing with 0 leaves the other number unchanged.
*/
