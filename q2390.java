
// LeetCode 2390: Removing Stars From a String - StringBuilder as stack with deleteCharAt for star removal
// Core Logic: Append characters normally, use deleteCharAt(length-1) when encountering '*'

public class q2390 {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
