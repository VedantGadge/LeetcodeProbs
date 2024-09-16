class q1848{
    public static int getMinDistance(int[] nums, int target, int start) {
        if(nums.length==0){
            return 0;
        }
        
        int min = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target){
                int temp = Math.abs(i - start);
                if(temp<min){
                    min = temp;
                }
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[] nums = {1,4,3,5,7,2,5,6};
        System.out.println(getMinDistance(nums,5,4));
    }
}