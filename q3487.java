import java.util.Arrays;
import java.util.HashSet;

public class q3487 {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = nums;
        Arrays.sort(arr);
        if(arr[arr.length-1]>0){
            int sum = 0;
        for(int num: nums){
            if(num>0) set.add(num);
        }
        for(int num: set){
            sum +=num;
        }
        return sum;
        }
        else{
            return arr[arr.length-1];
        }
        
    }
}
