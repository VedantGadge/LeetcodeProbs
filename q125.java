// LeetCode 125: Valid Palindrome - Two pointers with character filtering and case-insensitive comparison
// Core Logic: Skip non-alphanumeric chars with while loops, compare lowercase chars from both ends
public class q125 {

    boolean isPalindrome(String s){
        int left = 0; int right = s.length()-1;

        while(left<right){
            while(!Character.isLetterOrDigit(s.charAt(left))) left++;
            while(!Character.isLetterOrDigit(s.charAt(right))) right--;
            if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))) return false; 
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        

    }
}
