public class q1221 {
    public int balancedStringSplit(String s) {
        int count = 0;
        int temp = 0;
        for(char ch:s.toCharArray()){
            if(ch=='R') temp++;
            else temp--;
            if(temp==0) count++;
        }
        return count;
    }
}
