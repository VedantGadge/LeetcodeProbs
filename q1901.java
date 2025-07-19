// LeetCode 1901: Find Peak Element II - Binary search on columns with max element in each column
// Core Logic: Binary search on columns, find max in column, check left/right neighbors for peak
import java.util.Arrays;

public class q1901 {

    static int maxElRow(int[][] mat , int col){
        int max = Integer.MIN_VALUE;
        int row = 0;
        for(int i = 0;i<mat.length;i++){
            if(mat[i][col] >= max){ 
                max = mat[i][col];
                row = i;
        }
    }
        return row;
    }

    static int[] findPeakGrid(int[][] mat) {
        int low = 0 , high = mat[0].length-1;
        while(low<=high){
            int mid = low + (high - low)/2; //mid = col 
            int row = maxElRow(mat, mid);
            // no need to check up and down elm as we alr know its the largest elm in the column
            int left = (mid - 1 >= 0) ? mat[row][mid-1] : -1;
            int right = (mid + 1 < mat[0].length)? mat[row][mid+1] : -1;
            if(mat[row][mid]>left && mat[row][mid]>right) return new int[] {row,mid};
            else if(mat[row][mid]<left) high = mid - 1;
            else low = mid + 1;
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[][] mat = {{4,2,5,1,4,5},{2,9,3,2,3,2},{1,7,6,0,1,3},{3,6,2,3,7,2}};
        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }
}
