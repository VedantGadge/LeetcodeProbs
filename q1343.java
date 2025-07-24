public class q1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0, n = 0, currSum = 0;
        long temp = k;
        for(int right = 0;right<arr.length;right++){
            currSum+=arr[right];
            k--;
            if(k<0){
                currSum-=arr[left];
                left++;
                k++;
            }
            if(k==0 && (long)currSum/temp>= (long)threshold) n++;
        }
        return n;
    }
}
