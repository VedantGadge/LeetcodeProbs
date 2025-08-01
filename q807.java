public class q807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
    int[] maxr = new int[n];
    int[] maxc = new int[n];
    int sum = 0;

    // Find max in each row and column
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            maxr[i] = Math.max(maxr[i], grid[i][j]);
            maxc[j] = Math.max(maxc[j], grid[i][j]);
        }
    }

    // Calculate the total increase
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            sum += Math.min(maxr[i], maxc[j]) - grid[i][j];
        }
    }
    return sum;
    }
}
