import java.util.HashMap;

public class q395 {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        if(n == 0 || n < k) return 0;
        if( k <= 1) return n;
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0)+1);

        int l = 0;
        while(l < n && map.get(s.charAt(l))>=k) l++;
        if (l == n) return n;
        int l1 = longestSubstring(s.substring(0, l), k);
        while(l < n && map.get(s.charAt(l))<k) l++;
        int l2 = (l<n) ? longestSubstring(s.substring(l), k) : 0;
        return Math.max(l1,l2);
    }
}
