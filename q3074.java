import java.util.Arrays;

public class q3074 {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = 0 , totalCap = 0 , boxes = 0;
        for(int i:apple){
            total+= i;
        }
        Arrays.sort(capacity);
        for(int i = capacity.length-1;i>=0;i--){
            totalCap+= capacity[i];
            boxes++;
            if(totalCap>=total){
                break;
            }
        }
        return boxes;
    }
}
