public class q2057 {

    public static int smallestEqual(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==i%10) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(smallestEqual(nums));
    }
}
