// LeetCode 3285: Find Indices of Stable Mountains - Check previous mountain height against threshold
// Core Logic: Iterate from index 1, add index i when height[i-1] > threshold (previous mountain is stable)

import java.util.ArrayList;
import java.util.List;

public class q3285 {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 1;i<height.length;i++){
            if(height[i-1]>threshold) ans.add(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
