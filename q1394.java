import java.util.HashMap;
import java.util.Map;

public class q1394 {
    static int findLucky(int[] arr) {
        int ans = -1;
        HashMap<Integer,Integer> table = new HashMap<>();
        for(int num: arr){
            table.put(num,table.getOrDefault(num, 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
        Integer key = entry.getKey();
        Integer value = entry.getValue();
        if(key==value && key>ans) ans = key;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(findLucky(new int[] {2,2,2,3,3}));
    }
}
