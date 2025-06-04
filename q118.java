import java.util.ArrayList;
import java.util.List;

public class q118 {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int numRows = 4;

        for(int row = 1;row<=numRows;row++){
            List<Integer> currentRow = new ArrayList<>();
            int temp = 1;
            currentRow.add(1);
            for(int col = 1;col<row;col++){
                temp*= row-col ;
                temp/= col;
                currentRow.add(temp);
            }
            ans.add(currentRow);
        }
        for (List<Integer> row : ans) {
            System.out.println(row);
        }
    }
}
