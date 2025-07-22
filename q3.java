import java.util.HashSet;

public class q3 {
    public int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        if(str.length==1) return 1;
        int n = str.length;
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int currentLen = 0;
        int maxLen = 0;
        
        for (int right = 0; right < n; right++) {
            while (set.contains(str[right])) {
                currentLen --;
                set.remove(str[left]);
                left++;
            }
            currentLen = right - left + 1;
            set.add(str[right]);
            maxLen = Math.max(maxLen,currentLen);
        }
        
        return maxLen;
    }
}
