public class q74 {

    static boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = matrix.length*matrix[0].length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            int row = mid/matrix[0].length;
            int col = mid%matrix[0].length;
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(nums, target));
    }
}
