// LeetCode 1394: Find Lucky Integer in an Array - HashMap frequency counting with key-value matching
// Core Logic: Use getOrDefault for frequency, iterate entries to find key == value, track maximum
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
