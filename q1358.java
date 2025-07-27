public class q1358 {
    public int numberOfSubstrings(String s) {
        int countA = 0, countB = 0, countC = 0;
        int left = 0;
        int count = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == 'a')
                countA++;
            else if (s.charAt(right) == 'b')
                countB++;
            else
                countC++;
            while (countA > 0 && countB > 0 && countC > 0) {
                count += s.length() - right;
                if (s.charAt(left) == 'a')
                    countA--;
                else if (s.charAt(left) == 'b')
                    countB--;
                else
                    countC--;
                left++;
            }
        }
        return count;
    }
}
