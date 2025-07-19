// LeetCode 3304: Find the K-th Character in String Game I - StringBuilder expansion with character increment
// Core Logic: Expand string by appending incremented characters, continue until length >= k
public class q3304 {

    static char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while (sb.length() < k) {
            int size = sb.length();
            for (int i = 0; i < size; i++) {
                sb.append((char) ('a' + ((sb.charAt(i) - 'a') + 1) % 26));
            }
        }
        return sb.charAt(k - 1);
    }

    public static void main(String[] args) {
        System.out.println(kthCharacter(5));
    }
}
