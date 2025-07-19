// LeetCode 49: Group Anagrams - HashMap with sorted string as key for grouping
// Core Logic: Sort each string to create canonical form as HashMap key, group original strings with same sorted key

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class q49 {
    static List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<String,List<String>> table = new Hashtable<>();
        List<List<String>> ans = new ArrayList<>();
        for(String s : strs){
            char[] sortedCharArray = s.toCharArray();
            Arrays.sort(sortedCharArray);
            String key = new String(sortedCharArray);
            if(!table.containsKey(key)) table.put(key,new ArrayList<>());
            table.get(key).add(s); // key will always be present in the table , atleast with a null value , then we add the current s to its respective key
        }
        for(List<String> k : table.values()){
            ans.add(k);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
    }
}
