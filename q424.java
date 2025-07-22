

public class q424 {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLen = 0;
        int[] freq = new int[26]; // Array to store character frequencies
        int maxFreq = 0;
        
        for(int right = 0; right < s.length(); right++){
            // Add current character to frequency array
            char rightChar = s.charAt(right);
            freq[rightChar - 'A']++;
            
            // Update max frequency in current window
            maxFreq = Math.max(maxFreq, freq[rightChar - 'A']);
            
            // If window is invalid (need more than k replacements)
            while((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'A']--;
                left++;
            }
            
            // Update maximum length found
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}
