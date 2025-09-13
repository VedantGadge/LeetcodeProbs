import java.util.ArrayList;
import java.util.List;

public class q498 {
    public static List<Integer> findDiagonalOrder(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        for(int j = 0; j<mat[0].length ;j++){
                if(j%2!=0){
                    int i = 0;
                    while(j>0){
                        list.add(mat[i][j]);
                        i++;
                        j--;
                    } 
                }
                else{
                    int i = j;
                    while(i>0){
                        list.add(mat[i][j]);
                        i--;
                        j++;
                    }
                }
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans = findDiagonalOrder(mat);
        System.out.println(ans.toString());
    }
}
