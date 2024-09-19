public class q3131 {
    public int addedInteger(int[] nums1, int[] nums2) {

        int count = 0;
        for (int i = 0; i < nums1.length; i++)
            count += nums2[i] - nums1[i];

        return count / nums1.length;
    }

    // This basically first calculates the diff of each element , to get the total of the diffrences
    // then calculates the avg spread , by dividing the sum by nums.length().
    public static void main(String[] args) {

    }
}
