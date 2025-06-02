// Next permutation
// LOGIC EXPLAINED BELOW

public class q31 {

    public static int[] reverse(int[] nums,int left, int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {3,2,1};
        int index = -1;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){ 
                index = i;
                break;
            }
        }

        if(index==-1) {
            reverse(nums, 0, nums.length-1);
             for(int num:nums){
            System.out.print(num + " ");
            }
            return;
        };

        for(int i = nums.length-1;i>=0;i--){
            if(nums[i]>nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        
        reverse(nums,index+1,nums.length-1);
        for(int num:nums){
            System.out.print(num + " ");
        }
    }
}

/*
    Next permutation is the next lexicographical permutaion , the next lowest largest number possible by arranging the given digits.

    Algorithm:
    1. Find the largest prefix match => a[i]<a[i+1] => break point
    2. Find >a[i] , but smallest one , swap with a[i]
    3. Reverse elements right of a[i] or the break point to get the smallest of those nos.

    Eg. [2 1 5 4 3 0 0]

    1) Consider break point [2 1 5 4 3 | 0 0 ] => 0 0 cannot be rearranged in any way that it could become larger
    2) Consider break point [2 1 5 4 | 3 0 0 ] => 3 0 0 already largest
    3) Therefore we reach till the break point [2 1 | 5 4 3 0 0] as a[i]<a[i+1].
    4) Iterate from n and swap if element is larger than a[i] , we get the smallest larger no. => [2 3 | 5 4 1 0 0]
    5) Reverse the nos. right of breakpoint to get the smalles of em. => [2 3 0 0 1 4 5] => FINAL ANS.

 */
