public class q1752 {

    public static boolean check(int[] nums) {
        if (nums.length == 0) return false;
        
        int count = 0; // To count the number of times the array breaks the non-decreasing order
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
                if (count > 1) {
                    return false; // More than one rotation point found
                }
            }
        }
        
        return count == 0 || count == 1; // The array is either fully sorted or has exactly one rotation point
}
    public static void main(String[] args) {
        int nums[] = {2,1,3,4};
       System.out.println(check(nums));
    }
}

//nums[i] > nums[(i + 1) % nums.length] helps identify where the array's non-decreasing order breaks, 
//which is crucial in determining if the array was originally sorted and then rotated.