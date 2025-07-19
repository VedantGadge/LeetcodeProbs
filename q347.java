// LeetCode 347: Top K Frequent Elements - HashMap frequency counting with min-heap of size k
// Core Logic: Count frequencies in HashMap, use min-heap to maintain top k frequent elements

import java.util.*;

public class q347 {
    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> table = new HashMap<>();
        for (int num : nums) {
            table.put(num, table.getOrDefault(num, 0) + 1);
        }

        // Min-heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> heap =
            new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
            heap.offer(entry);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ans[i] = heap.poll().getKey();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[] {1,1,1,2,2,2,2,3}, 2)));
    }
}