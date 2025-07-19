// LeetCode 53: Maximum Subarray - Kadane's algorithm with running sum reset
// Core Logic: Track current sum, reset to current element if sum becomes negative, maintain global maximum

public class q53 {
    public static void main(String[] args) {
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];

            if(sum>max){
                max = sum;
            }

            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(max);
    }
}

// Kadane's Algorithm
// Used to find the maximum sum possible of a subarray from the array



//To find the subarray as well

// import java.util.Arrays;
// public class q52 {
//     public static void main(String[] args) {
//         int nums[] = {-2,-3,4,-1,-2,1,5,-3};
//         int max = Integer.MIN_VALUE;
//         int sum = 0;
//         int start = -1, startIndex =-1 , endIndex = -1;
//         for(int i = 0;i<nums.length;i++){
//             if(sum == 0){
//               start = i;
//             }
//             sum += nums[i];

//             if(sum>max){
//                 max = sum;
//                 startIndex = start;
//                 endIndex = i;
//             }

//             if(sum<0){
//                 sum = 0;
//             }
//         }
//         System.out.println(Arrays.toString(Arrays.copyOfRange(nums, startIndex, endIndex + 1)));
//     }
// }

