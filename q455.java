// LeetCode 455: Assign Cookies - Greedy approach with sorted arrays and two pointers
// Core Logic: Sort both arrays, assign smallest cookie that satisfies current child, move both pointers on success

import java.util.Arrays;

class q455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int cookie = 0;
        while(child < g.length && cookie < s.length){
            if(s[cookie]>=g[child]){
                child++;
            }
            cookie++;
        }
        return child;
    }
}