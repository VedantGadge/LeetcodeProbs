import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class q18 {
    public static void main(String[] args) {
        int[] arr = {-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
        HashSet<List<Integer>> ans = new HashSet<>();
        int target = -294967296; // <-- set your target here
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int l = arr.length - 1; l > i + 2; l--) {
                if (l < arr.length - 1 && arr[l] == arr[l + 1]) continue;
                int j = i + 1, k = l - 1;
                while (j < k) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum < target) {
                        j++;
                    } else if (sum > target) {
                        k--;
                    } else {
                        ans.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        j++;
                        k--;
                        while (j < k && arr[j] == arr[j - 1]) j++;
                        while (j < k && arr[k] == arr[k + 1]) k--;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}