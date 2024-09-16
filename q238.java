public class q238 {

    //This runs in time complexity = O(n)
    public static int[] productExceptSelf(int[] nums){
        int[] rightProd = new int[nums.length];
        int[] leftProd = new int[nums.length];
        int[] res = new int[nums.length];

        leftProd[0] = 1;
        rightProd[rightProd.length - 1] = 1;

        for(int i = 1;i<nums.length;i++)
        {
            leftProd[i] = leftProd[i-1] * nums[i-1];
        }

        for(int i = nums.length-2;i>=0;i--)
        {
            rightProd[i] = rightProd[i+1] * nums[i+1];
        }

        for(int i = 0;i<nums.length;i++)
        {
            res[i] = leftProd[i] * rightProd[i];
        }
        return res;
    }



    /* 
    INEFICIENT METHOD CUZ USES NESTED LOOP , SO TIME COMPLEXITY = O(n^2).
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        
        for(int i = 0;i<nums.length;i++){
            int prod = 1;
            for(int j = 0;j<nums.length;j++){
                if(j==i){
                    continue;
                }
                prod*=nums[j];
            }
            res[i] = prod;
        }
        return res;

    }
    */


    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        for(int i =0;i<nums.length;i++){
            System.out.print(productExceptSelf(nums)[i]);
        }
    }
}
