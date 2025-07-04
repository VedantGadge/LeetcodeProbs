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
