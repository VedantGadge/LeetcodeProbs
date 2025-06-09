//this approach is best a it uses O(n^2) time and O(1) space complexity,
//check below for easier but a bit worse soln.

public class q73 {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 1, 1 }, { 1, 0, 1, 1 }, { 1, 1, 0, 1 }, { 1, 0, 0, 1 } };
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // mark the i-th row
                    matrix[i][0] = 0;

                    // mark the j-th column
                    if (j != 0)
                        matrix[0][j] = 0;
                    // if j = 0 , means marking for the row marker column , so it will change the
                    // matrix[0][0] value to 0 , but we have the col0 variable as the marker for the
                    // j = 0 column.s
                    else
                        col0 = 0;
                }
            }
        }

        // now setting the elements to 0 if their row or col marker is marked 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // now setting the elements of the marker columns and rows to 0
        // col marker
        if (matrix[0][0] == 0) {
            for (int j = 1; j < m; j++)
                matrix[0][j] = 0;
        }

        // row marker
        if (col0 == 0) {
            for (int i = 0; i < n; i++)
                matrix[i][0] = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// this uses O(m+n) space complexity 
// creates two extra arrays to keep track of row n col elements
// class q73{
// public static void main(String[] args) {
// int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
// boolean n[] = new boolean[matrix.length];
// boolean m[] = new boolean[matrix[0].length];

// for(int i = 0;i<matrix.length;i++){
// for(int j = 0;j<matrix[0].length;j++){
// if(matrix[i][j]==0){
// n[i] = true;
// m[j] = true;
// }
// }
// }

// for(int i = 0;i<matrix.length;i++){
// for(int j = 0;j<matrix[0].length;j++){
// if(n[i] || m[j]){
// matrix[i][j] = 0;
// }
// }
// }

// for(int i = 0;i<matrix.length;i++){
// for(int j = 0;j<matrix[0].length;j++){
// System.out.print(matrix[i][j] + " ");
// }
// System.out.println();
// }
// }
// }
