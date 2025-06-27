import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q40 {
    static void combinationsHelper(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds)); 
            return;
        }
        
        for (int i = index; i < arr.length; i++) {
            // Skip duplicates: if current element is same as previous and we haven't used previous
            if (i > index && arr[i] == arr[i-1]) continue;
            
            if (arr[i] > target) break; // Early termination since array is sorted
            
            ds.add(arr[i]);
            combinationsHelper(i + 1, arr, target - arr[i], ans, ds); // i+1 to avoid reusing same element
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // Sort to handle duplicates
        List<List<Integer>> ans = new ArrayList<>();
        combinationsHelper(0, candidates, target, ans, new ArrayList<>()); 
        return ans;
    }

    public static void main(String[] args) {
        q40 obj = new q40();
        int[] candidates = {2,2,3,5,7};
        int target = 7;
        System.out.println(obj.combinationSum2(candidates, target)); 
    }
}
