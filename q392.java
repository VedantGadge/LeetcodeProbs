// LeetCode 392: Is Subsequence - Two pointers to match characters in order
// Core Logic: Use two counters, advance both when characters match, advance t pointer when no match

public class q392 {
    public boolean isSubsequence(String s, String t) {
        int c1 = 0 , c2 = 0;
        int k = 0;
        while(c1<s.length()){
            if(s.charAt(c1)==t.charAt(c2)){
                c1++;
                k++;
            }
            else c2++;
        }
        if(k==c1) return true;
        return false;
    }
}
