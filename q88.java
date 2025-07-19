// LeetCode 88: Merge Sorted Array - Reverse traversal in-place merge to avoid overwriting
// Core Logic: Start from end of both arrays, place larger element at end of nums1, work backwards to avoid conflicts

public class q88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j])
            {
                nums1[k] = nums1[i];
                k--;
                i--;
            }

            else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

        for(int c = 0;c<nums1.length;c++){
            System.out.print(nums1[c]+" ");
        }

    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
