// LeetCode 1662: Check If Two String Arrays are Equivalent - Four-pointer character-by-character comparison
// Core Logic: Use array pointers (i,j) and character pointers (p1,p2) to traverse both arrays simultaneously
public class q1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i = 0, j = 0; // pointers for word1 and word2 arrays
        int p1 = 0, p2 = 0; // pointers for characters in current string

        while (i < word1.length && j < word2.length) {
            char c1 = word1[i].charAt(p1);
            char c2 = word2[j].charAt(p2);
            if (c1 != c2) return false;

            // Move to next character in word1
            p1++;
            if (p1 == word1[i].length()) {
                i++;
                p1 = 0;
            }
            // Move to next character in word2
            p2++;
            if (p2 == word2[j].length()) {
                j++;
                p2 = 0;
            }
        }
        // Both should be at the end
        return i == word1.length && j == word2.length;
    }
}       