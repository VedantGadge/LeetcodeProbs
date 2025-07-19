// LeetCode 1283: Find Smallest Divisor Given Threshold - Binary search on divisor with ceiling division
// Core Logic: Binary search from 1 to max element, use Math.ceil for division sum calculation
public class q1283 {

    static int calcDivisionSum(int[] arr , int n){
        int sum = 0;
        for(int i:arr){
            sum += (int)Math.ceil((double)i / n);
        }
        return sum;
    }

     static int maxEl(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(max<=i) max = i;
        }
        return max;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        int low = 1 , high = maxEl(nums);
        while(low<=high){
            int mid = low + (high - low)/2;
            if(calcDivisionSum(nums, mid)<=threshold) high = mid - 1;
            else low = mid + 1;
        }
        if(low != -1 && calcDivisionSum(nums, low) <= threshold) {
        System.out.println(low);
    } else {
        System.out.println(-1);
    };
    }
}
