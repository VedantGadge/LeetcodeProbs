public class q944 {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        int count = 0;

        for (int c = 0; c < cols; c++) {
            for (int r = 1; r < rows; r++) {
                if (strs[r - 1].charAt(c) > strs[r].charAt(c)) {
                    count++;
                    break; // no need to check further rows
                }
            }
        }
        return count;
    }
}
