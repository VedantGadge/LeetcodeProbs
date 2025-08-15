public class q198 {

    // tabulation(without space optim)
    // public int f(int ind , int[] nums , int[] dp){
    //     if(ind == 0) return nums[ind];
    //     if(ind < 0 ) return 0;
    //     if(dp[ind] != -1) return dp[ind];

    //     int pick = nums[ind] + f(ind -2 , nums,dp);
    //     int notPick = 0 + f(ind-1 , nums , dp);

    //     return dp[ind] = Math.max(pick,notPick);
    // }

    //tabulation with space optim
    public int rob(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;
        for(int i = 1 ; i<n;i++){
            int take = nums[i];
            if(i > 1) take += prev2;

            int notTake = 0 + prev;
            int curi = Math.max(take , notTake);
            prev2 = prev;
            prev = curi;
        }
        return prev;
    }
}
