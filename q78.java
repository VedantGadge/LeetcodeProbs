// LeetCode 78: Subsets - Backtracking to generate all possible subsets
// Core Logic: At each element choose to include or exclude, backtrack with current subset, add copy to result at base case

import java.util.ArrayList;
import java.util.List;

public class q78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums,0, new ArrayList<>(),result);
        return result;
    }

    void generateSubsets(int[] nums , int index , List<Integer> current , List<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        generateSubsets(nums, index+1, current, result);

        current.add(nums[index]);
        generateSubsets(nums, index+1, current, result);
        current.remove(current.size()-1);
    }
}
