public class q45 {
    public int jump(int[] nums) {
        int r = 0, l = 0;
        int jumps = 0;
        while (r < nums.length - 1) {
            int maxReach = 0;
            for (int i = l; i <= r; i++) {
                maxReach = Math.max(maxReach, i + nums[i]);
            }
            l = r + 1;
            r = maxReach;
            jumps++;
        }
        return jumps;
    }
}
