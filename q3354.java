public class q3354 {
    public int countValidSelections(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int start = 0; start < n; start++) {
            if (nums[start] != 0) continue;

            // Try both directions: -1 (left), +1 (right)
            for (int dir : new int[]{-1, 1}) {
                int[] arr = nums.clone(); // Make a copy for simulation
                int curr = start;
                int direction = dir;

                while (curr >= 0 && curr < n) {
                    if (arr[curr] == 0) {
                        curr += direction;
                    } else if (arr[curr] > 0) {
                        arr[curr]--;
                        direction = -direction; // Reverse direction
                        curr += direction;
                    }
                }

                // Check if all elements are zero
                boolean complete = true;
                for (int num : arr) {
                    if (num != 0) {
                        complete = false;
                        break;
                    }
                }
                if (complete) count++;
            }
        }
        return count;
    }
}
