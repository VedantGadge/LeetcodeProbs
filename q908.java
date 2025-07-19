// LeetCode 908: Smallest Range I - Calculate range after optimal k adjustments to min/max
// Core Logic: Find min/max, calculate range after adding k to min and subtracting k from max

class q908 {
    public static int smallestRangeI(int[] nums, int k) {
        int range = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i:nums){
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        range = (max-k)-(min+k);
        return range<=0? 0 : range;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 10 };
        System.out.println(smallestRangeI(nums, 2));
    }
}
