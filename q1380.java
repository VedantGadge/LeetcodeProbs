import java.util.*;

public class q1380 {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        // Find the number of rows and columns
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        
        // Arrays to store minimum values of each row and maximum values of each column
        int[] min = new int[numRows];
        int[] max = new int[numCols];
        List<Integer> ans = new ArrayList<>();
        
        // Find the minimum in each row
        for (int i = 0; i < numRows; i++) {
            int rowMin = matrix[i][0];
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                }
            }
            min[i] = rowMin;
        }
        
        // Find the maximum in each column
        for (int i = 0; i < numCols; i++) {
            int colMax = matrix[0][i];
            for (int j = 1; j < numRows; j++) {
                if (matrix[j][i] > colMax) {
                    colMax = matrix[j][i];
                }
            }
            max[i] = colMax;
        }
        
        // Find lucky numbers
        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                if (max[i] == min[j]) {
                    ans.add(max[i]);
                    break; // No need to check further rows for this column
                }
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        System.out.println(luckyNumbers(matrix));
    }
}
