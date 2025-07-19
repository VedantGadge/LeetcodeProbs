// LeetCode 240: Search 2D Matrix II - Start from top-right corner for optimal elimination path
// Core Logic: Compare with top-right, move left if greater, move down if smaller
public class q240 {

    static boolean searchMatrix(int[][] matrix, int target) {
       int row = 0;
       int col = matrix[0].length-1;
       while(row<matrix.length && col>=0){
        int check = matrix[row][col];
        if(check == target) return true;
        else if(check < target) row++;
        else col--;
       }
       return false;
    }

    public static void main(String[] args) {
        int[][] matrix ={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        System.out.println(searchMatrix(matrix, target));
    }
}
