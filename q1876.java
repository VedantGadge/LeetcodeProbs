import java.util.HashSet;

class q1876{
    public int countGoodSubstrings(String s) {
        int left = 0;
        int k = 3;
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right = 0 ;right <s.length();right++){
            set.add(s.charAt(right));
            k--;
            while(k<0){
                set.remove(s.charAt(left));
                left++;
            }
            if(k==0) count++;
        }
    }
}