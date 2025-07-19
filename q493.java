// LeetCode 493: Reverse Pairs - Modified merge sort with counting pairs before merging
// Core Logic: During merge sort, count reverse pairs where arr[i] > 2*arr[j] before standard merging

class q493 {
    public static void merge(int[] arr, int low, int mid, int high) {
        int[] merged = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int x = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                merged[x] = arr[left];
                x++;
                left++;
            } else {
                merged[x] = arr[right];
                x++;
                right++;
            }
        }

        while(left<=mid){
            merged[x] = arr[left];
            x++;left++;
        }
        while(right<=high){
            merged[x] = arr[right];
            x++;right++;
        }

        for(int i = 0,j=low;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }

    }

    public static int countPairs(int[] arr , int low , int mid , int high){
        int right = mid + 1;
        int count = 0;
        for(int i = low; i <= mid; i++){
            while(right <= high && (long)arr[i] > 2L * (long)arr[right]) right++;
            count += (right - (mid + 1));
        }
        return count;
    }

    public static int divide(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high)
            return count;
        int mid = low + (high - low) / 2;
        count += divide(arr, low, mid);
        count += divide(arr, mid + 1, high);
        count += countPairs(arr,low,mid,high);
        merge(arr, low, mid, high);
        return count;
    }
    public int reversePairs(int[] nums) {
        return divide(nums , 0 , nums.length-1);
    }
}