public class q2210 {
    public static int countHillValley(int[] nums) {
        int HnV = 0; // Variable to track the count of hills and valleys

        for (int i = 1; i < nums.length - 1; i++) {
           if(nums[i]==nums[i-1]) continue;

           int prevE = i-1;
           int nextE = i+1;
           while(prevE>=0 && nums[prevE]==nums[i]) prevE --; //finds the closest unique elemnt on the left
           while(nextE<nums.length && nums[nextE]==nums[i]) nextE ++; //finds the closest unique elemnt on the right
            if(nextE>=nums.length || prevE<0) continue;
           if((nums[i]>nums[prevE] && nums[i]>nums[nextE]) || (nums[i]<nums[prevE] && nums[i]<nums[nextE])) HnV ++;
        }

        return HnV;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 1, 6, 5};
        System.out.println(countHillValley(nums));
    }
}