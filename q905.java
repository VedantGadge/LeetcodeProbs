// LeetCode 905: Sort Array By Parity - Two pointers with in-place swapping to separate even/odd numbers
// Core Logic: Use pointer j for next even position, swap when even number found, increment j

public class q905 {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1) return nums;

        int j =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
               int temp = nums[j];
               nums[j]=nums[i];
               nums[i]=temp;
               j++;
            }
        }
        return nums; 

        // 2-pointer approach
        // int d1 = 0;
        // int d2 = 1;
        // while(d1 < nums.length && d2<nums.length){
        //     if(nums[d1]%2==1 && nums[d2]%2==1) d2++;
        //     else if(nums[d1]%2==0 && nums[d2]%2==1){
        //         d1++; d2++;
        //     }
        //     else if(nums[d1]%2==1 && nums[d2]%2==0){
        //         int temp = nums[d1];
        //         nums[d1] = nums[d2];
        //         nums[d2] = temp;
        //         d1++;
        //         d2++;
        //     }
        // }
        // return nums;
    }
}
