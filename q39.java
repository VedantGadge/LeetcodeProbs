import java.util.ArrayList;
import java.util.List;

class q39 {

    static void combinationsHelper(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (index == arr.length) {
            if (target == 0) ans.add(new ArrayList<>(ds)); 
            return;
        }

        if (arr[index] <= target) {
            ds.add(arr[index]);
            combinationsHelper(index, arr, target - arr[index], ans, ds);
            ds.remove(ds.size() - 1);
        }
        combinationsHelper(index + 1, arr, target, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combinationsHelper(0, candidates, target, ans, new ArrayList<>()); 
        return ans;
    }

    public static void main(String[] args) {
        q39 obj = new q39();
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(obj.combinationSum(candidates, target)); 
    }
}