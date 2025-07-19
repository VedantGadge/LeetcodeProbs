// LeetCode 1470: Shuffle the Array - Two-pointer interleaving with separate index tracking
// Core Logic: Use three pointers (i, j, k) to interleave first half with second half elements
public class q1470 {

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = n;
        int k = 0;
        while(j<nums.length){
            ans[k] = nums[i];
            i++; k++;

            ans[k] = nums[j];
            j++; k++;
        }
        System.gc();
        return ans;
    }

    public static void main(String[] args) {

    }
}
