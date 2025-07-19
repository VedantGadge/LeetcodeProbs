// LeetCode 90: Subsets II - Backtracking with duplicate skipping using sorted array
// Core Logic: Sort array first, skip duplicates at same recursion level using i!=index condition, add subset at each recursive call

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q90 {

    static void subsetHelper(int[] nums , int index , List<List<Integer>> ans , List<Integer> current){
        ans.add(new ArrayList<>(current));
        for(int i = index ; i<nums.length;i++){
            if(i!=index && nums[i] == nums[i-1]) continue;
            current.add(nums[i]);
            subsetHelper(nums, i+1, ans, current);
            current.remove(current.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subsetHelper(nums, 0, ans, new ArrayList<>());
        return ans;
    }
}
