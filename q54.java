// LeetCode 54: Spiral Matrix - Layer-by-layer traversal with boundary shrinking
// Core Logic: Four directional passes (right, down, left, up) with boundary updates, handle edge cases for single row/column

import java.util.ArrayList;
import java.util.List;

public class q54 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int left = 0, right = m - 1, top = 0, bottom = n - 1;
        while (top <= bottom && left <= right) {

            // left -> right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // top -> bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // right -> left
            if (top <= bottom) { // checks if there is bottom row to go right to left
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // bottom -> top
            if (left <= right) { // checks if there is a left row to go bottom to top
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        // added if checks only for right -> left and bottom -> top as for earlier two ,
        // the check are performed in their for and top gets ++ and right gets --;
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}