public class q912 {
    public void merge(int[] arr, int low, int mid, int high) {
        int[] merged = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int x = 0;
        int i , j;
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
        while (left <= mid) {
            merged[x] = arr[left];
            x++;
            left++;
        }
        while (right <= high) {
            merged[x] = arr[right];
            x++;
            right++;
        }
        for (i = 0, j = low; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public void divide(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public int[] sortArray(int[] nums) {
        divide(nums , 0 , nums.length-1);
        return nums;
    }
}
