// LeetCode 1295: Find Numbers with Even Number of Digits - Digit counting with modulo operation
// Core Logic: Count digits by repeatedly dividing by 10, check if count is even
public class q1295 {

    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int x:nums){
            int count = 0;
            while(x!=0){
                count++;
                x = x%10;
            }
            if(count%2==0) ans++;
        }
        return ans;
    }
}