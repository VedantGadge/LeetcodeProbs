import java.util.Arrays;

public class q242 {

    //use array based checking
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        // if (s.length() != t.length())
        //    return false;
        int[] ans = new int[26];
        for(int i=0;i<s.length();i++) ans[s.charAt(i) - 'a']++;
        for(int i=0;i<t.length();i++) ans[s.charAt(i) - 'a']--;
        for(int i=0;i<26;i++) if(ans[i]!=0) System.out.println(false);
        System.out.println(true);
    }



    // sorting and checking
    // static String sortString(String str){
    //     char[] c = str.toCharArray();
    //     Arrays.sort(c);
    //     return new String(c);
    // }

    // public static void main(String[] args) {
    //     String s = "anagram";
    //     String t = "nagaram";
    //      if (s.length() != t.length())
    //   return false;
 
    // s = SortString(s);
    // t = SortString(t);
 
    // // Case 2: check if every character of str1 and str2 matches with each other
    // for (int i = 0; i < s.length(); i++)
    // {
    //   if (s.charAt(i) != t.charAt(i))
    //     return false;
    // }
    // return true;
    // }
}
