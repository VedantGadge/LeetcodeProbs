public class q410 {

    static int countPartitions(int[] nums, int maxSum){
        int n = nums.length;
        int partitions = 1;
        int subarraySum = 0;
        for(int i = 0;i<n;i++){
            if(subarraySum + nums[i] <= maxSum){
                subarraySum += nums[i];
            }else{
                partitions++;
                subarraySum = nums[i];
            }
        }
        return partitions;
    }

    static int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = 0;

        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        while(low<=high){
            int mid = low + (high - low)/2;
            int partitions = countPartitions(nums, mid);
            if(partitions > k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }
}
