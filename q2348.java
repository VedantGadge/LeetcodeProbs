public class q2348 {

    public long zeroFilledSubarray(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int currCount = 0;

            while (i<nums.length && nums[i] == 0) {
                currCount++;
                i++;
                total+=currCount;
            }
            

        }
        return total;
    }
}
