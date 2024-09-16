import java.util.*;

public class q228 {
    public static void summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();

        if (nums.length == 0) {
            // Handle the case where the input array is empty
            return;
        }
        int temp = 0; //To track the start of a new string
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=(nums[i]+1)){
                if (temp == i) {
                    ans.add(String.format("%d", nums[temp]));
                } else {
                    ans.add(String.format("%d -> %d", nums[temp], nums[i]));
                }
                temp = i+1;
            }
        }
        if (temp == nums.length - 1) {
            ans.add(String.format("%d", nums[temp]));
        } else {
            ans.add(String.format("%d -> %d", nums[temp], nums[nums.length - 1]));
        }
        
        for(String e: ans){
            System.out.print(e+" ");}
        }
    public static void main(String[] args) {
        int[] nums = {};
        summaryRanges(nums);
    }
}
