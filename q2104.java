// LeetCode 2104: Sum of Subarray Ranges - Optimized monotonic stack approach with single-pass calculation
// Core Logic: Use monotonic stacks to calculate min/max contributions directly in one pass each
// Range = max - min, so sum of ranges = sum of maximums - sum of minimums

import java.util.Stack;

public class q2104 {
    
    // Optimized approach: Single pass for min and max contributions using monotonic stack
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long result = 0;
        Stack<Integer> stack = new Stack<>();
        
        // First pass: Calculate minimum contributions (subtract from result)
        // Use monotonic increasing stack to find when each element stops being minimum
        for (int i = 0; i <= n; i++) {
            // Use Integer.MIN_VALUE as sentinel to force processing all remaining elements
            int currentVal = (i == n) ? Integer.MIN_VALUE : nums[i];
            
            // Pop elements that are greater than current element
            while (!stack.isEmpty() && nums[stack.peek()] > currentVal) {
                int j = stack.pop();  // Element being processed
                int k = stack.isEmpty() ? -1 : stack.peek();  // Previous smaller element
                
                // Contribution of nums[j] as minimum in subarrays
                // (i - j) = number of elements to right where nums[j] is min
                // (j - k) = number of elements to left where nums[j] is min
                result -= (long) nums[j] * (i - j) * (j - k);
            }
            stack.push(i);
        }
        
        stack.clear();
        
        // Second pass: Calculate maximum contributions (add to result)
        // Use monotonic decreasing stack to find when each element stops being maximum
        for (int i = 0; i <= n; i++) {
            // Use Integer.MAX_VALUE as sentinel to force processing all remaining elements
            int currentVal = (i == n) ? Integer.MAX_VALUE : nums[i];
            
            // Pop elements that are smaller than current element
            while (!stack.isEmpty() && nums[stack.peek()] < currentVal) {
                int j = stack.pop();  // Element being processed
                int k = stack.isEmpty() ? -1 : stack.peek();  // Previous greater element
                
                // Contribution of nums[j] as maximum in subarrays
                // (i - j) = number of elements to right where nums[j] is max
                // (j - k) = number of elements to left where nums[j] is max
                result += (long) nums[j] * (i - j) * (j - k);
            }
            stack.push(i);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        q2104 solution = new q2104();
        
        // Test case 1
        int[] nums1 = {1, 2, 3};
        System.out.println("Array: [1,2,3], Sum of Ranges: " + solution.subArrayRanges(nums1));
        // Expected: 4 (ranges are: [1]=0, [2]=0, [3]=0, [1,2]=1, [2,3]=1, [1,2,3]=2, sum=4)
        
        // Test case 2  
        int[] nums2 = {1, 3, 3};
        System.out.println("Array: [1,3,3], Sum of Ranges: " + solution.subArrayRanges(nums2));
        // Expected: 4
        
        // Test case 3
        int[] nums3 = {4, -2, -3, 4, 1};
        System.out.println("Array: [4,-2,-3,4,1], Sum of Ranges: " + solution.subArrayRanges(nums3));
        // Expected: 59
    }
}
