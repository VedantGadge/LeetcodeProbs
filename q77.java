import java.util.ArrayList;
import java.util.List;

public class q77 {

    public void combinations(int start ,int n, int k , List<Integer> curr , List<List<Integer>> res ){
        if(k==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(start>n) return;
        if (n - start + 1 < k) return;

        curr.add(start);
        combinations(start+1, n,k-1, curr, res);
        curr.remove(curr.size()-1);
        combinations(start+1,n, k, curr, res);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        combinations(1 ,n, k , curr , res);
        return res;
    }
}
