public class q1456 {
    public int maxVowels(String s, int k) {
        int left = 0, right = 0, currVowel = 0, maxVowels = 0;
        for (right = 0; right < s.length(); right++) {
            if (isVowel(s.charAt(right))) currVowel++;
            if (right - left + 1 > k) {
                if (isVowel(s.charAt(left))) currVowel--;
                left++;
            }
            maxVowels = Math.max(maxVowels, currVowel);
        }
        return maxVowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
