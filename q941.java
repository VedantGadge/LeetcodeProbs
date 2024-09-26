public class q941 {
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        // Check if the peak is at the beginning or the end
        if (maxIndex == 0 || maxIndex == arr.length - 1) return false;

        // Check for strictly increasing sequence before the peak
        for (int i = 0; i < maxIndex; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false; // Must be strictly increasing
            }
        }

        // Check for strictly decreasing sequence after the peak
        for (int i = maxIndex; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false; // Must be strictly decreasing
            }
        }

        return true; // If both conditions are satisfied, it's a valid mountain array
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2};
        System.out.println(validMountainArray(arr));
    }
}

