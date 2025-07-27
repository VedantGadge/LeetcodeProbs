import java.util.ArrayList;
import java.util.List;

public class q1441 {
    public List<String> buildArray(int[] target, int n) {
        int idx = 0;
        List<String> ans = new ArrayList<>();
        for(int i = 1;i<n;i++){
            if(target[idx]==i){
                ans.add("Push");
                idx++;
                if(idx==target.length) break;
            } 
            else {
                ans.add("Push");
                ans.add("Pop");
            };
        }
        return ans;
    }
}
