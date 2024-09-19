public class q3232 {
    public boolean canAliceWin(int[] nums) {
        int sum1 = 0; //to calculate the sum of all single digits
        int sum2 = 0; //to calculate the sum of all double digits
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<10) sum1+=nums[i] ;
            else sum2+=nums[i];
        }
        return sum1!=sum2;
        //Alice wins if the sum1 and sum2 are different
    }

    public static void main(String[] args) {
        
    }
}
