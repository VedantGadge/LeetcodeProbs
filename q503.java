// LeetCode 503: Next Greater Element II - Circular array handling with double traversal and stack
// Core Logic: Iterate twice through array using modulo, stack maintains decreasing elements for next greater lookup

import java.util.ArrayDeque;
import java.util.Deque;

public class q503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] nge = new int[nums.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 2*nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i%nums.length]){
                stack.pop();
            }
            if(i<nums.length){
                nge[i] = stack.isEmpty()? -1 : stack.peek();
            }
            stack.push(nums[i%nums.length]);
        }
        return nge;
    }
}
