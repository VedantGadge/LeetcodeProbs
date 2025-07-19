// LeetCode 907: Sum of Subarray Minimums - Stack-based approach to find previous/next smaller elements
// Core Logic: Use stacks to find range where each element is minimum, calculate contribution to total sum

import java.util.ArrayDeque;
import java.util.Deque;

public class q907 {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = 1_000_000_007;
        long res = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] left = new int[n];
        int[] right = new int[n];

        //Finding the previous lesser elements
        for(int i = 0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]) stack.pop();
            left[i] = stack.isEmpty() ? i + 1: i - stack.peek();
            stack.push(i);  
        }

        stack.clear();

         //Finding the next lesser elements
        for(int i = n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]) stack.pop();
            right[i] = stack.isEmpty() ? n - i: stack.peek() - i;
            stack.push(i);  
        }

        for (int i = 0; i < n; i++) {
            res = (res + (long) arr[i] * left[i] * right[i]) % mod;
        }
        return (int) res;
    }
}
