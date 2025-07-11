public class q2108 {

    public boolean isPalindrome(String s){
        if(s.length()==1) return true;
        int right = s.length()-1;
        int left = 0; 
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        for(String s: words){
            if(isPalindrome(s)) return s;
        }
        return "";
    }
}
