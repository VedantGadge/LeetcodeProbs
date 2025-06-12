public class q151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String ans="";
        int i = 0;
        while(i<s.length()){
            while (i<s.length() && s.charAt(i) == ' ') {
                i++;
            }
            if (i >= s.length()) break;
            int j = i + 1;
            while(j < s.length() && s.charAt(j) != ' '){
                j++;
            }
            String word = s.substring(i, j);
            if(ans.length() == 0) ans = word;
            else ans = word + " " + ans;
            i = j + 1;
        }
        System.out.println(ans);
    }
}
