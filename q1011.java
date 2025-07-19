// LeetCode 1011: Capacity To Ship Packages Within D Days - Binary search on capacity with simulation
// Core Logic: Binary search on capacity range, simulate shipping days for each capacity
public class q1011 {

    static int calcDays(int[] arr, int n) {
        int sum = 0;
        int days = 1;
        for (int i : arr) {
            if (sum + i > n) {
                days++;
                sum = i;
            } else {
                sum += i;
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }
        int answer = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (calcDays(weights, mid) <= days) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }
}
