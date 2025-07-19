// LeetCode 5: Longest Palindromic Substring - Expand around centers approach with all possible centers
// Core Logic: Check palindromes expanding from each character and between characters, track max length with start index

public class q5 {

    static int lengthOfPali(String s,int left , int right){
        while(left>=0 && right<s.length() && s.charAt(right)==s.charAt(left)){
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static String longestPalindrome(String s) {
        if(s == null || s.length()<1) return "";
        int start = 0 , end = 0;
        for(int i = 0;i<s.length();i++){
            int len1 = lengthOfPali(s, i, i); //for odd lengthed string
            int len2 = lengthOfPali(s, i, i+1); //for even lengthed string
            int len = Math.max(len1, len2);
            if(len > end - start){
                start = i - (len - 1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        String s = "ebbabad";
        System.out.println(longestPalindrome(s));
    }
}
