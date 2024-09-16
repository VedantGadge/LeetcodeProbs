public class q896 {
    public static boolean isMonotonic(int[] nums) {
       boolean monot = true;
       for(int i =1;i<nums.length;i++){
        if(nums[i]<nums[i-1]){
            monot = false;
        break;
        }
       }
       if(monot==true){
        return monot;
       }
       else{
        monot = true;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                monot = false;
            break;
            }
        }
       }
       System.gc();
       return monot;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2};
        System.out.println(isMonotonic(nums));
    }
}
