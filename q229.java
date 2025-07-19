// LeetCode 229: Majority Element II - Extended Boyer-Moore for two potential majority elements
// Core Logic: Track two candidates with separate counters, handle case where elements differ
import java.util.ArrayList;

public class q229 {
    public static void main(String[] args) {
       ArrayList<Integer> ans = new ArrayList<>();
       int[] nums = {3,3,4,4,2,1,3};
       int count1 = 0 , count2 = 0;
       int el1 = Integer.MIN_VALUE , el2 = Integer.MIN_VALUE;
       for (int i = 0;i<nums.length;i++){
        if(count1 == 0 && nums[i]!=el2){
            count1 = 1;
            el1 = nums[i];
        }
        else if(count2 == 0 && nums[i]!=el1){
            count2 = 1;
            el2 = nums[i];
        }
        else if(el1 == nums[i]) count1++;
        else if(el2 == nums[i]) count2++;
        else{
            count1-- ;
            count2-- ;
        }
       }
       
       //validate
       count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == el1) count1++;
            else if (num == el2) count2++;
        }

       int min = nums.length/3 + 1;
       if(count1>= min) ans.add(el1);
       if(count2>= min) ans.add(el2);
       System.out.println(ans);
    }

}
