public class q977 {
    static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] ans = new int[nums.length];
        int i = ans.length-1;
        while(left<=right){
            if(Math.pow(nums[left],2)>Math.pow(nums[right],2)){
                ans[i] = (int)Math.pow(nums[left],2);
                left++;
                i--;
            }
            else{
                ans[i] = (int)Math.pow(nums[right],2);
                right--;
                i--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] ans = sortedSquares(new int[]{-4,-1,0,3,10});
        System.out.println(ans.toString());
    }
}
