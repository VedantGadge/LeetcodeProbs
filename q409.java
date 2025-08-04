import java.util.HashMap;

class q409 {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int length = 0;
        boolean hasOdd = false;
        for (Integer value : map.values()) {
            if (value % 2 == 0) {
                length += value;
            } else {
                length += value - 1;
                hasOdd = true;
            }
        }
        if (hasOdd)
            length += 1;
        return length;
    }
}