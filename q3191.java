class q3191{
    public int minOperations(int[] nums) {
        int n = nums.length, count = 0;
        for (int i = 0; i <= n - 3; i++) {
            if (nums[i] == 0) {
                // Flip nums[i], nums[i+1], nums[i+2]
                nums[i] ^= 1;
                nums[i+1] ^= 1;
                nums[i+2] ^= 1;
                count++;
            }
        }
        return (nums[n - 2] == 1 && nums[n - 1] == 1) ? count : -1;
        // This check quickly determines if the array is all 1s at the end, focusing only on the last two elements (since the rest are handled by the loop).
    }
}