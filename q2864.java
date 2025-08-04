public class q2864 {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0 , zeros = 0;
        StringBuilder ans = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch=='0') zeros++;
            else ones++;
        }
        ans.append("1".repeat(ones - 1));
        ans.append("0".repeat(zeros));
        ans.append('1');
        return ans.toString();
    }
}
