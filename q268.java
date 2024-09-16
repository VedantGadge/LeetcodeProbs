public class q268 {
    public static int missingNumber(int[] nums) {
        int k=0;
        for (int i = 0;i<nums.length;i++)
        {
            int smallest = i;
            for (int j = i+1;j<nums.length;j++)
            {
                if(nums[smallest]>nums[j])
                {
                    smallest = j;
                }
            }
            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==i){
                k=nums[i];
                continue;  
            }
            else{
                return i;
            }
        }
        return k+1;
    }


    /*
     Most efficient way
     XOR USED
     public int missingNumber(int[] nums) {
        int x=0;
        for(int i=0;i<=nums.length;i++)
        {
            x^=i;
            if(i<nums.length)
            x^=nums[i];
        }
        return x;
    }
    */
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(missingNumber(nums));
    }
}
