// LeetCode 3110: Score of a String - Sum absolute differences between consecutive characters
// Core Logic: Iterate adjacent characters, sum Math.abs(char[i] - char[i+1]) for ASCII differences
public class q3110 {
    static int scoreOfString(String s) {
        int sum = 0;
        for(int i = 0;i<s.length()-1;i++){
            sum+= Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(scoreOfString("zaz"));
    }
}
