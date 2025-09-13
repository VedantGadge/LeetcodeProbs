public class q3000 {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiag = Double.NEGATIVE_INFINITY;
        int maxArea = 0;
        for (int i = 0; i < dimensions.length; i++) {
            double currDiag = Math.sqrt(dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1]);
            int area = dimensions[i][0] * dimensions[i][1];
            if (currDiag > maxDiag) {
                maxDiag = currDiag;
                maxArea = area;
            } else if (currDiag == maxDiag) {
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
