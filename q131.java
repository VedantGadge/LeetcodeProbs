import java.util.ArrayList;
import java.util.List;

public class q131 {

    static boolean isPalindrome(String s , int start , int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        return true;
    }

    // p = processed or checked string which is a palindrome
    static void helper(String s ,int index,List<List<String>> ans , List<String> p) {
        if(index == s.length()){
            ans.add(new ArrayList<>(p));
        }

        for(int i = index ; i <s.length();i++){
            if(isPalindrome(s, index, i)){
                p.add(s.substring(index, i+1));
                helper(s,i+1,ans,p);
                p.remove(p.size()-1);
            }
        }
    }


   static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> p = new ArrayList<>();
        helper(s, 0, ans, p);
        return ans;
    } 

    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }
}
