// LeetCode 216: Combination Sum III - Backtracking with pruning and remaining sum tracking
// Core Logic: Use start pointer to avoid duplicates, track remaining sum (n), backtrack with remove
import java.util.ArrayList;
import java.util.List;

public class q216 {

    static void findCombinations(int start, List<List<Integer>> ans, List<Integer> current, int k, int n) {
        // Base case: if we have k numbers
        if (current.size() == k) {
            if (n == 0) { // n represents remaining sum needed
                ans.add(new ArrayList<>(current));
            }
            return;
        }
        
        // Pruning: if remaining numbers can't form valid combination
        if (current.size() > k || n < 0) return;
        
        // Try numbers from start to 9
        for (int i = start; i <= 9; i++) {
            // Early termination: if current number is greater than remaining sum
            if (i > n) break;
            
            current.add(i);
            findCombinations(i + 1, ans, current, k, n - i);
            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(1, ans, new ArrayList<>(), k, n);
        return ans;
    }

    public static void main(String[] args) {
        q216 obj = new q216();
        System.out.println(obj.combinationSum3(9, 45)); // [[1,2,3,4,5,6,7,8,9]]
        System.out.println(obj.combinationSum3(3, 7));  // [[1,2,4]]
    }
}
