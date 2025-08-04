import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class q1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            map.putIfAbsent(groupSizes[i], new ArrayList<>());
            map.get(groupSizes[i]).add(i);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int size : map.keySet()) {
            List<Integer> people = map.get(size);
            for (int i = 0; i < people.size(); i += size) {
                ans.add(people.subList(i, i + size));
            }
        }
        return ans;
    }
}
