// LeetCode 3190: Find Minimum Operations to Make All Elements Divisible by Three - Count non-divisible elements
// Core Logic: Count elements where x % 3 != 0, each requires one operation to become divisible by 3
public class q3190 {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int x:nums){
            if(x%3!=0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        
    }
}
