// LeetCode 1957: Delete Characters to Make Fancy String - Two-pointer approach with count tracking
// Core Logic: Track consecutive character count, skip when count >= 2 to prevent 3+ consecutive chars

class q1957{
    public String makeFancyString(String s) {
        if (s.length() < 3) return s;
        
        StringBuilder result = new StringBuilder();
        int count = 1; // Count of current consecutive character
        result.append(s.charAt(0)); // Always add first character
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++; // Same character, increment count
            } else {
                count = 1; // Different character, reset count
            }
            
            // Only add character if count < 3 (to prevent 3+ consecutive)
            if (count < 3) {
                result.append(s.charAt(i));
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        q1957 solution = new q1957();
        
        // Test cases
        System.out.println(solution.makeFancyString("leeetcode")); // Expected: "leetcode"
        System.out.println(solution.makeFancyString("aaabaaaa"));  // Expected: "aabaa"
        System.out.println(solution.makeFancyString("aab"));       // Expected: "aab"
        System.out.println(solution.makeFancyString("aaa"));       // Expected: "aa"
    }
}