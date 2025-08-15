import java.util.ArrayList;
import java.util.List;

public class q213 {
    
    public int maximumNonAdjacentSum(List<Integer> nums){
        int n = nums.size();
        int prev = nums.get(0);
        int prev2 = 0;
        for(int i = 1 ; i<n;i++){
            int take = nums.get(i);
            if(i > 1) take += prev2;

            int notTake = 0 + prev;
            int curi = Math.max(take , notTake);
            prev2 = prev;
            prev = curi;
        }
        return prev;
    }
    
    public int rob(int[] nums) {
        List<Integer> temp1 = new ArrayList<>(), temp2 = new ArrayList<>();
        if (nums.length < 2) {
            return nums[0];
        }
        if (nums.length < 3) {
            return Math.max(nums[0], nums[1]);
        }
        for(int i = 0;i<nums.length;i++){
            if(i!=0) temp1.add(nums[i]);
            if(i!=nums.length-1) temp2.add(nums[i]);
        }
        return Math.max(maximumNonAdjacentSum(temp2), maximumNonAdjacentSum(temp1));
    }
}
