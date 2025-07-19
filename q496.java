// LeetCode 496: Next Greater Element I - Stack with HashMap for efficient next greater element mapping
// Core Logic: Process nums2 from right, use stack to find next greater, store in HashMap for O(1) lookup

import java.util.HashMap;
import java.util.Stack;

public class q496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = nums2.length -1 ; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                stack.pop();
            }
            map.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());
            stack.push(nums2[i]);
        }
       for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }

}
