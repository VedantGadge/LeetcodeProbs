// LeetCode 1768: Merge Strings Alternately - Two-pointer approach with StringBuilder for efficient merging
// Core Logic: Alternate characters while both strings available, append remaining characters from longer string
class q1768{
    static String mergeAlternately(String word1, String word2) {
        int w1 = 0 , w2 = 0;
        StringBuilder merged = new StringBuilder();
        while(w1<word1.length() && w2<word2.length()){
            merged.append(word1.charAt(w1));
            merged.append(word2.charAt(w2));
            w1++;w2++;
        }
        while(w1<word1.length()){
            merged.append(word1.charAt(w1));
            w1++;
        }
        while(w2<word2.length()){
            merged.append(word2.charAt(w2));
            w2++;
        }
        return merged.toString();

    }
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd", "pq"));
    }
}