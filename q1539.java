// LeetCode 1539: Kth Missing Positive Number - Binary search with missing count formula
// Core Logic: Missing count = arr[mid] - (1 + mid), binary search to find insertion point
public class q1539 {

    public static void main(String[] args) {
        int[] arr = {2};
        int k = 1;
        int low = 0 , high = arr.length-1;
        while (low<=high) {
            int mid = low + (high - low) / 2;
            //no. of missing integers = arr[mid]-(1+mid)
            if(arr[mid]-(1+mid)<k) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println(low + k);
    }
}
