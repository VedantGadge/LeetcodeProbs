import java.util.Hashtable;

public class q594 {

    static int findLHS(int[] nums) {
        if(nums.length<=1) return 0;
        int len = 0;
        Hashtable<Integer,Integer> table = new Hashtable<>();
        for(int num:nums){
            table.put(num, table.getOrDefault(num, 0) + 1);
        }
        for (int key : table.keySet()) {
            if (table.containsKey(key + 1)) {
                len = Math.max(len, table.get(key) + table.get(key + 1));
            }
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(findLHS(new int[] {0}));
    }
}
