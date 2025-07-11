public class q557 {


     public String reverseWords(String s) {
        if (s.length() == 1)
            return s;
        int i = 0;
        char[] str = s.toCharArray();
        while (i < str.length) {
            int j = i;
            while (str[j] != ' ' && j < str.length) j++;
            int left = i, right = j - 1;
            while (left < right) {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
            i = j + 1;
        }
        return str.toString();
    }
}
