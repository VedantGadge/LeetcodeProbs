import java.util.Arrays;

public class q14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        Arrays.sort(strs);
        StringBuilder ans = new StringBuilder();
        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i = 0;i<first.length();i++){
            if(first.charAt(i)!=last.charAt(i)) break;
            ans.append(first.charAt(i));
        }
        System.out.println(ans);
    }
}
