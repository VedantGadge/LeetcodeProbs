public class q1750 {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left < right && s.charAt(left) == s.charAt(right)){
           char currChar = s.charAt(left);
                while(left<right && s.charAt(left+1)==currChar){
                    left ++;
                }
                while(left<right && s.charAt(right-1)==currChar){
                    right --;
                }
                left++;
                right--;
        }
        return Math.max(0, right - left + 1) ;
    }
}
