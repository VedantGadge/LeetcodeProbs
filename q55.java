class q55{
    public boolean canJump(int[] nums) {
        int reachableIndex = 0;
        for(int i = 0 ;i<nums.length;i++){
            if(i<=reachableIndex){
                reachableIndex = Math.max(reachableIndex, i+nums[i]);
                if(reachableIndex >= nums.length - 1) return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
}

//This solution is greedy because at each step, it always tries to reach as far as possible from the current position.