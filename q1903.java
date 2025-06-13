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
