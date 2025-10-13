import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q2273 {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>(); 
        for (String w : words) {
            if (ans.isEmpty() || !isAnagram(ans.get(ans.size() - 1), w)) {
                ans.add(w);
            }
        }
        return ans;
    }

    public boolean isAnagram(String s1 , String s2){
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        s1 = new String(a1);
        s2 = new String(a2);
        if(s1.equals(s2)) return true;
        return false;

    }
}
