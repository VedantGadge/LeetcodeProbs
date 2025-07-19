// LeetCode 205: Isomorphic Strings - Bidirectional HashMap mapping for character transformation validation
// Core Logic: Use two HashMaps to ensure one-to-one character mapping in both directions
import java.util.Hashtable;

public class q205 {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s, t));
    }

    // Uses hash table , O(n) 
    // public static boolean isIsomorphic(String s, String t) {
    //     if (s.length() != t.length()) return false;
    //     Hashtable<Character, Character> mapST = new Hashtable<>();
    //     Hashtable<Character, Character> mapTS = new Hashtable<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         char c1 = s.charAt(i);
    //         char c2 = t.charAt(i);
    //         if (mapST.containsKey(c1)) {
    //             if (mapST.get(c1) != c2) return false;
    //         } else {
    //             mapST.put(c1, c2);
    //         }
    //         if (mapTS.containsKey(c2)) {
    //             if (mapTS.get(c2) != c1) return false;
    //         } else {
    //             mapTS.put(c2, c1);
    //         }
    //     }
    //     return true;
    // }

    //Array based approach , tracks and checks last seen of the pair
    //also O(n) , but slightly faster than hash table
     public static boolean isIsomorphic(String s, String t){
        int[] ch1 = new int[256];
        int[] ch2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (ch1[s.charAt(i)] != ch2[t.charAt(i)]) {
                return false;
            }
            ch1[s.charAt(i)] = i + 1;
            ch2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
