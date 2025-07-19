// LeetCode 48: Rotate Image - In-place rotation using transpose then reverse each row
// Core Logic: First transpose matrix (swap[i][j] with [j][i]), then reverse each row for 90-degree clockwise rotation

public class q48 {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};

        // Transpose
        for(int i = 0;i<3;i++){
            for(int j = i+1;j<3;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;
            }
        }

        // Reverse row
        for(int i = 0;i<3;i++){
            int left = 0, right = 2;
            while(left<right){
                 int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

         for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }
    }
}
