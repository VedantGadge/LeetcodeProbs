// LeetCode 56: Merge Intervals - Sort by start time then merge overlapping intervals
// Core Logic: Sort intervals by start time, iterate and merge when current start <= previous end, use ArrayList for result

import java.util.Arrays;
import java.util.ArrayList;

public class q56 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<intervals.length;i++){
            if(ans.isEmpty() || ans.get(ans.size()-1).get(1) < intervals[i][0]){
                ans.add(new ArrayList<>(Arrays.asList(intervals[i][0], intervals[i][1])));
            }
            else{
                ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1), intervals[i][1]));
            }
        }
        System.out.println(ans);
    }
}
