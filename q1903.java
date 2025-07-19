// LeetCode 1903: Largest Odd Number in String - Reverse traversal to find last odd digit
// Core Logic: Traverse from right, find first odd digit, return substring from start to that position
public class q1903 {
    public static void main(String[] args) {
        String num = "26548";
        int i = num.length() - 1;
        // - '0' gives the numeric value as it subtracts the ACII value
        while (i >= 0 && (num.charAt(i) - '0') % 2 == 0) {
            i--;
        }
        String result = (i >= 0) ? num.substring(0, i + 1) : "";
        System.out.println(result);
    }
}
