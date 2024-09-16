public class q485 {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int k = 0;

        for(int i = 0;i<nums.length;i++){
            
            if(nums[i]==1){
                k++;
                if(k>max){
                    max = k;
                }
            }
            else{
                k=0;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1,1,1,1,0,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
