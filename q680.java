public class q680 {

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        if(s.length()<=2) return true;
        char[] string = s.toCharArray();
        int left = 0;
        int right = string.length-1;
        while(left<=right){
            if(string[left]!=string[right]){
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++; right--;
        }
        return true;
    }
}
