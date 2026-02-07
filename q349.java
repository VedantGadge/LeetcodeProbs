import java.util.ArrayList;
import java.util.List;

public class q349 {
    public int[] intersection(int[] n1, int[] n2) {
        List<Integer> list = new ArrayList();

        // to remove duplicates
        for (int i = 0; i < n1.length; i++) {
            for (int j = i + 1; j < n1.length; j++) {
                if (n1[i] == n1[j]) {
                    n1[j] = -1;
                }
            }
        }
        for (int i = 0; i < n1.length; i++) {
            if (n1[i] == -1) continue;
            for (int j = 0; j < n2.length; j++) {
                if (n1[i] == n2[j]) {
                    list.add(n1[i]);
                    break;
                }
            }
        }
        int [] ans = new int [list.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
